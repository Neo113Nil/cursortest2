package org.betup.ui.dialogs;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Locale;
import javax.inject.Inject;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.utils.FormatHelper;

/* loaded from: classes2.dex */
public class WelcomeDialog extends BaseBlurredDialog {

    @BindView(R.id.betcoins)
    TextView betcoins;

    @Inject
    FirebaseRemoteConfig firebaseRemoteConfig;

    @BindView(R.id.welcome_text)
    TextView welcomeText;

    @Override // org.betup.ui.dialogs.BaseBlurredDialog
    protected int getLayoutId() {
        return R.layout.welcome_screen_dialog;
    }

    public WelcomeDialog(Context context) {
        super(context);
    }

    @OnClick({R.id.ok})
    public void onOkClick() {
        dismiss();
    }

    @Override // org.betup.ui.dialogs.BaseBlurredDialog, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((BetUpApp) getOwnerActivity().getApplicationContext()).getComponent().inject(this);
        this.betcoins.setText(FormatHelper.getDialogBetcoinsFormated(this.firebaseRemoteConfig.getLong("welcomeBonus")));
        this.welcomeText.setText(String.format(Locale.getDefault(), "%s %s", getContext().getString(R.string.welcome_to), "BETUP"));
    }

    public static WelcomeDialog showDialog(Context context, DialogInterface.OnDismissListener onDismissListener) {
        WelcomeDialog welcomeDialog = new WelcomeDialog(context);
        welcomeDialog.setOnDismissListener(onDismissListener);
        welcomeDialog.show();
        return welcomeDialog;
    }
}
