package org.betup.ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import io.bidmachine.media3.extractor.text.ttml.TtmlNode;
import javax.inject.Inject;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.bus.ServerDownMessage;
import org.betup.services.down.ServerErrorsProcessor;
import org.betup.services.menu.BottomMenuProvider;
import org.betup.services.menu.StubBarsController;
import org.betup.services.user.SocialConnectionService;
import org.betup.ui.BackPressedController;
import org.betup.ui.dialogs.InfoDialog;
import org.betup.ui.dialogs.OnDialogButtonClickListener;
import org.betup.ui.fragment.login.AuthFragment;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class LoginActivity extends AppCompatActivity implements AuthFragment.LoginHandler, BackPressedController, MenuBarsController {
    public static final String EXTRA_OPEN_TO_SIGN_UP = "open_to_sign_up";
    public static final int RESULT_EXIT = 2;
    private AuthFragment.Action action;
    private BackPressedController.BackPressedListener backPressedListener;
    private boolean initStart;
    private MenuBarsController menuBarsController = new StubBarsController();

    @Inject
    ServerErrorsProcessor serverErrorsProcessor;

    @Inject
    SocialConnectionService socialConnectionService;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ((BetUpApp) getApplicationContext()).getComponent().inject(this);
        this.action = AuthFragment.Action.LOGIN;
        if (getIntent().getExtras() != null) {
            if (getIntent().getExtras().getSerializable("action") != null) {
                this.action = (AuthFragment.Action) getIntent().getExtras().getSerializable("action");
            }
            this.initStart = getIntent().getExtras().getBoolean(TtmlNode.START, false);
        }
        if (savedInstanceState == null) {
            AuthFragment newInstance = AuthFragment.INSTANCE.newInstance(this.action);
            if (getIntent().getBooleanExtra("open_to_sign_up", false)) {
                if (newInstance.getArguments() == null) {
                    newInstance.setArguments(new Bundle());
                }
                newInstance.getArguments().putBoolean("open_to_sign_up", true);
            }
            newInstance.setLoginHandler(this);
            getSupportFragmentManager().beginTransaction().replace(R.id.container, newInstance).commit();
            return;
        }
        AuthFragment authFragment = (AuthFragment) getSupportFragmentManager().findFragmentById(R.id.container);
        if (authFragment != null) {
            authFragment.setLoginHandler(this);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.container);
        if (findFragmentById == null || !(findFragmentById instanceof AuthFragment)) {
            return;
        }
        ((AuthFragment) findFragmentById).onActivityResult(requestCode, resultCode, data);
    }

    @Override // org.betup.ui.fragment.login.AuthFragment.LoginHandler
    public void loginCompleted() {
        Log.d("LOGINTEST", " HANDLING LOGIN COMPLETED START = " + this.initStart);
        if (isFinishing() || isDestroyed()) {
            Log.d("LOGINTEST", "Activity already finishing/destroyed, skipping");
            return;
        }
        setResult(-1);
        this.socialConnectionService.releaseUserCache();
        if (this.initStart) {
            Log.d("LOGINTEST", "Starting MainActivity and finishing LoginActivity");
            Intent intent = new Intent(this, (Class<?>) MainActivity.class);
            intent.addFlags(335544320);
            intent.putExtra(MainActivity.EXTRA_JUST_LOGGED_IN, true);
            startActivity(intent);
            finish();
            return;
        }
        if (isTaskRoot()) {
            Log.d("LOGINTEST", "LoginActivity is task root, starting MainActivity");
            Intent intent2 = new Intent(this, (Class<?>) MainActivity.class);
            intent2.addFlags(335544320);
            intent2.putExtra(MainActivity.EXTRA_JUST_LOGGED_IN, true);
            startActivity(intent2);
        }
        Log.d("LOGINTEST", "Finishing LoginActivity, result already set");
        finish();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void processServerDownMessage(ServerDownMessage serverDownMessage) {
        this.serverErrorsProcessor.processMessage(this, serverDownMessage);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (EventBus.getDefault().isRegistered(this)) {
            return;
        }
        EventBus.getDefault().register(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        BackPressedController.BackPressedListener backPressedListener = this.backPressedListener;
        if (backPressedListener == null || !backPressedListener.onBackPressed()) {
            if (this.action == AuthFragment.Action.UPGRADE) {
                super.onBackPressed();
            } else {
                new InfoDialog.Builder(this).firstButtonTitle(getString(R.string.yes)).secondButtonTitle(getString(R.string.cancel)).subtitle(getString(R.string.sure_exit)).title(getString(R.string.exit_title)).dismissOnSecondButtonClick(true).allowDismiss(true).onFirstButtonClick(new OnDialogButtonClickListener() { // from class: org.betup.ui.LoginActivity.1
                    @Override // org.betup.ui.dialogs.OnDialogButtonClickListener
                    public void onClick(Dialog dialog) {
                        LoginActivity.this.setResult(2);
                        LoginActivity.this.finish();
                    }
                }).build().show();
            }
        }
    }

    @Override // org.betup.ui.BackPressedController
    public void setOnBackPressedListener(BackPressedController.BackPressedListener listener) {
        this.backPressedListener = listener;
    }

    @Override // org.betup.ui.BackPressedController
    public void removeListener() {
        this.backPressedListener = null;
    }

    @Override // org.betup.ui.BackPressedController
    public void pressBack() {
        super.onBackPressed();
    }

    @Override // org.betup.ui.MenuBarsController
    public boolean isReady() {
        return this.menuBarsController.isReady();
    }

    @Override // org.betup.ui.MenuBarsController
    public void updateTitle(String title) {
        this.menuBarsController.updateTitle(title);
    }

    @Override // org.betup.ui.MenuBarsController
    public void updateTabMenu(TabMenuItem tabMenuItem) {
        this.menuBarsController.updateTabMenu(tabMenuItem);
    }

    @Override // org.betup.ui.MenuBarsController
    public TabMenuItem getCurrent() {
        return this.menuBarsController.getCurrent();
    }

    @Override // org.betup.ui.MenuBarsController
    public void restorePrevious() {
        this.menuBarsController.restorePrevious();
    }

    @Override // org.betup.ui.MenuBarsController
    public void setBottomMenu(Object sender, BottomMenuProvider bottomMenuProvider) {
        this.menuBarsController.setBottomMenu(sender, bottomMenuProvider);
    }
}
