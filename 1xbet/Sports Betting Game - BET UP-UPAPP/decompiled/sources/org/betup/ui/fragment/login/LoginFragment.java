package org.betup.ui.fragment.login;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.transition.TransitionManager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.common.net.HttpHeaders;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FacebookAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.GoogleAuthProvider;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.vk.sdk.VKAccessToken;
import com.vk.sdk.VKCallback;
import com.vk.sdk.VKSdk;
import com.vk.sdk.VKServiceActivity;
import com.vk.sdk.api.VKError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
import javax.inject.Inject;
import okhttp3.ResponseBody;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.model.local.entity.FullUserProfileModel;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.config.ApiConfigResolver;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.user.NewLoginInteractor;
import org.betup.model.remote.api.rest.user.V7GetCustomTokenInteractor;
import org.betup.model.remote.entity.analytics.TrackEventType;
import org.betup.model.remote.entity.login.CustomTokenResponseModel;
import org.betup.model.remote.entity.login.LoginResponseModel;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.analytics.FirebaseAnalyticsHelper;
import org.betup.services.user.UserService;
import org.betup.ui.BackPressedController;
import org.betup.ui.ConfirmEmailActivity;
import org.betup.ui.dialogs.InputDialog;
import org.betup.ui.dialogs.ProgressDialog;
import org.betup.ui.fragment.home.dialog.SignInDialog;
import org.betup.ui.fragment.home.dialog.SignUpDialog;
import org.betup.ui.fragment.login.LoginFragment;
import org.betup.utils.ExternalBrowserOpener;
import org.betup.utils.FacebookSdkHelper;
import org.betup.utils.FirebaseErrorHandler;
import org.betup.utils.SharedPrefs;
import org.betup.utils.VksdkHelper;

/* loaded from: classes4.dex */
public class LoginFragment extends Fragment implements View.OnClickListener, SignInDialog.OnCredentialsEnteredListener, SignUpDialog.OnRegDataEnteredListener, BaseCachedSharedInteractor.OnFetchedListener<ResponseBody, Void>, UserService.UserInfoListener, BackPressedController.BackPressedListener {
    private static final int RC_SIGN_IN = 884;
    private Action action;

    @Inject
    AnalyticsService analyticsService;

    @BindView(R.id.back)
    View back;
    private BackPressedController backPressedController;
    private CallbackManager callbackManager;

    @BindView(R.id.container)
    ConstraintLayout constraintLayout;
    private Dialog credentialsDialog;

    @BindView(R.id.fbButton)
    Button enterByFB;

    @BindView(R.id.forgot_password)
    TextView forgotPassword;

    @BindView(R.id.googlePlusButton)
    Button googleSignInButton;
    private LoginHandler loginHandler;

    @BindView(R.id.loginRegOption)
    TextView loginRegOption;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private GoogleApiClient mGoogleApiClient;

    @Inject
    NewLoginInteractor newLoginInteractor;

    @BindView(R.id.play_as_guest)
    TextView playAsGuest;

    @BindView(R.id.privacyButton)
    TextView privacyButton;
    private Dialog progressDialog;

    @BindView(R.id.signInButton)
    Button signInButton;

    @BindView(R.id.loginTitle)
    TextView title;
    private Unbinder unbinder;

    @Inject
    UserService userService;

    @Inject
    V7GetCustomTokenInteractor v7GetCustomTokenInteractor;

    @BindView(R.id.vkButton)
    Button vkButton;
    private String TAG = "LOGINTEST";
    private Display display = Display.MENU;
    private boolean isInProgress = false;
    private final BaseCachedSharedInteractor.OnFetchedListener<LoginResponseModel, Void> newLoginListener = new BaseCachedSharedInteractor.OnFetchedListener<LoginResponseModel, Void>() { // from class: org.betup.ui.fragment.login.LoginFragment.3
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public void onFetched(FetchedResponseMessage<LoginResponseModel, Void> responseMessage) {
            LoginFragment.this.onNewLoginFetched(responseMessage);
        }
    };
    private final FacebookCallback<LoginResult> fbCallback = new FacebookCallback<LoginResult>() { // from class: org.betup.ui.fragment.login.LoginFragment.5
        @Override // com.facebook.FacebookCallback
        public void onSuccess(LoginResult loginResult) {
            Log.d("LOGIN", "SUCCESS!");
            LoginFragment.this.firebaseAuthWithFacebook(loginResult.getAccessToken());
        }

        @Override // com.facebook.FacebookCallback
        public void onCancel() {
            LoginFragment.this.hideProgress();
            Log.d("LOGIN", "CANCEL!");
        }

        @Override // com.facebook.FacebookCallback
        public void onError(FacebookException exception) {
            LoginFragment.this.hideProgress();
            Log.d("LOGIN", "FB ERROR " + exception.toString());
        }
    };
    private final BaseCachedSharedInteractor.OnFetchedListener<CustomTokenResponseModel, String> firebaseTokenGotListener = new AnonymousClass8();

    public enum Action {
        LOGIN,
        UPGRADE
    }

    private enum Display {
        MENU,
        LOGIN,
        REGISTER
    }

    public interface LoginHandler {
        void loginCompleted();
    }

    public static LoginFragment newInstance(Action action) {
        LoginFragment loginFragment = new LoginFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("action", action);
        loginFragment.setArguments(bundle);
        return loginFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.loginHandler = (LoginHandler) context;
        } catch (ClassCastException unused) {
            throw new ClassCastException(context + " should implement LoginHandler");
        }
    }

    @Override // org.betup.ui.BackPressedController.BackPressedListener
    public boolean onBackPressed() {
        if (this.display == Display.MENU) {
            return true;
        }
        switchToConcreteScreen(Display.MENU);
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setResult(0);
        this.action = (Action) (getArguments().getSerializable("action") != null ? getArguments().getSerializable("action") : Action.LOGIN);
        ((BetUpApp) getActivity().getApplicationContext()).getComponent().inject(this);
        registerFacebookCallbacks();
        this.mAuth = FirebaseAuth.getInstance();
        this.mAuthListener = new FirebaseAuth.AuthStateListener() { // from class: org.betup.ui.fragment.login.LoginFragment$$ExternalSyntheticLambda0
            @Override // com.google.firebase.auth.FirebaseAuth.AuthStateListener
            public final void onAuthStateChanged(FirebaseAuth firebaseAuth) {
                LoginFragment.this.m13868lambda$onCreate$0$orgbetupuifragmentloginLoginFragment(firebaseAuth);
            }
        };
        GoogleSignInOptions build = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestIdToken(getString(R.string.default_web_client_id)).requestEmail().build();
        if (this.mGoogleApiClient == null) {
            this.mGoogleApiClient = new GoogleApiClient.Builder(getContext().getApplicationContext()).addApi(Auth.GOOGLE_SIGN_IN_API, build).build();
        }
    }

    /* renamed from: lambda$onCreate$0$org-betup-ui-fragment-login-LoginFragment, reason: not valid java name */
    /* synthetic */ void m13868lambda$onCreate$0$orgbetupuifragmentloginLoginFragment(FirebaseAuth firebaseAuth) {
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();
        if (currentUser != null) {
            currentUser.getIdToken(false).addOnCompleteListener(getActivity(), new OnCompleteListener<GetTokenResult>() { // from class: org.betup.ui.fragment.login.LoginFragment.1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public void onComplete(Task<GetTokenResult> task) {
                    if (task.isSuccessful()) {
                        Log.d(LoginFragment.this.TAG, "FIREBASE TOKEN LOGIN = " + task.getResult().getToken());
                    }
                }
            });
        }
    }

    public boolean isActive() {
        return isAdded() && this.unbinder != null;
    }

    public void displayProgress() {
        if (isActive()) {
            Dialog dialog = this.progressDialog;
            if (dialog != null) {
                dialog.dismiss();
            }
            this.progressDialog = ProgressDialog.showDialog(getActivity());
        }
    }

    public void hideProgress() {
        if (isActive()) {
            Dialog dialog = this.progressDialog;
            if (dialog != null) {
                dialog.dismiss();
            }
            this.progressDialog = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.enterByFB.setOnClickListener(this);
        this.googleSignInButton.setOnClickListener(this);
        this.signInButton.setOnClickListener(this);
        if (this.action == Action.UPGRADE) {
            this.playAsGuest.setVisibility(8);
            this.back.setVisibility(0);
        } else {
            this.back.setVisibility(8);
        }
        initPrivacyButton();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_login, container, false);
        this.unbinder = ButterKnife.bind(this, inflate);
        TextView textView = this.forgotPassword;
        textView.setPaintFlags(textView.getPaintFlags() | 8);
        this.playAsGuest.setPaintFlags(this.forgotPassword.getPaintFlags() | 8);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        try {
            BackPressedController backPressedController = (BackPressedController) getActivity();
            this.backPressedController = backPressedController;
            backPressedController.setOnBackPressedListener(this);
        } catch (ClassCastException unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Unbinder unbinder = this.unbinder;
        if (unbinder != null) {
            unbinder.unbind();
        }
        this.unbinder = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.mAuth.addAuthStateListener(this.mAuthListener);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        FirebaseAuth.AuthStateListener authStateListener = this.mAuthListener;
        if (authStateListener != null) {
            this.mAuth.removeAuthStateListener(authStateListener);
        }
        BackPressedController backPressedController = this.backPressedController;
        if (backPressedController != null) {
            backPressedController.removeListener();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (!FacebookSdk.isInitialized() || this.callbackManager == null) {
            return;
        }
        try {
            LoginManager.getInstance().unregisterCallback(this.callbackManager);
        } catch (Throwable unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(final int requestCode, int resultCode, Intent data) {
        Log.d(this.TAG, "RESULT = " + resultCode + "");
        if (requestCode == VksdkHelper.getAuthorizationRequestCode()) {
            VksdkHelper.ensureInitialized(requireContext());
            if (VKSdk.onActivityResult(requestCode, resultCode, data, new VKCallback<VKAccessToken>() { // from class: org.betup.ui.fragment.login.LoginFragment.2
                @Override // com.vk.sdk.VKCallback
                public void onResult(VKAccessToken res) {
                    LoginFragment.this.firebaseAuthWithVk(res);
                }

                @Override // com.vk.sdk.VKCallback
                public void onError(VKError error) {
                    Log.d("LOGINTEST", "VK ERROR");
                }
            })) {
                return;
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1) {
            Log.d(this.TAG, "CODE = " + requestCode + "");
            if (requestCode == RC_SIGN_IN) {
                firebaseAuthWithGoogle(Auth.GoogleSignInApi.getSignInResultFromIntent(data).getSignInAccount());
                return;
            }
            CallbackManager callbackManager = this.callbackManager;
            if (callbackManager != null) {
                callbackManager.onActivityResult(requestCode, resultCode, data);
                return;
            }
            return;
        }
        hideProgress();
        if (requestCode == 831) {
            if (resultCode == -236) {
                startActivityForResult(new Intent(getActivity(), (Class<?>) ConfirmEmailActivity.class), ConfirmEmailActivity.REQUEST_CONFIRMATION);
            } else if (resultCode == -237) {
                Log.d(this.TAG, "MAKING LOGIN AFTER EMAIL CONFIRMED!");
                makeLogin(this.mAuth, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void makeLogin(FirebaseAuth mAuth, final boolean isNewUser) {
        if (mAuth.getCurrentUser() != null) {
            mAuth.getCurrentUser().getIdToken(false).addOnCompleteListener(getActivity(), new OnCompleteListener() { // from class: org.betup.ui.fragment.login.LoginFragment$$ExternalSyntheticLambda4
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    LoginFragment.this.m13866lambda$makeLogin$1$orgbetupuifragmentloginLoginFragment(isNewUser, task);
                }
            });
        } else {
            Toast.makeText(getActivity(), R.string.auth_failed, 0).show();
        }
    }

    /* renamed from: lambda$makeLogin$1$org-betup-ui-fragment-login-LoginFragment, reason: not valid java name */
    /* synthetic */ void m13866lambda$makeLogin$1$orgbetupuifragmentloginLoginFragment(boolean z, Task task) {
        if (task.isSuccessful()) {
            Log.d(this.TAG, "MAKING LOGIN TOKEN GOT = " + ((GetTokenResult) task.getResult()).getToken());
            this.isInProgress = true;
            Bundle bundle = new Bundle();
            bundle.putBoolean("isNewUser", z);
            this.newLoginInteractor.load(this.newLoginListener, null, bundle);
            return;
        }
        hideProgress();
        Toast.makeText(getActivity(), FirebaseErrorHandler.getMessageForError(getActivity(), task), 0).show();
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
    public void onFetched(FetchedResponseMessage<ResponseBody, Void> responseMessage) {
        handleLoginResponse(responseMessage.getStat() == FetchStat.SUCCESS);
    }

    public void onNewLoginFetched(FetchedResponseMessage<LoginResponseModel, Void> responseMessage) {
        handleLoginResponse(responseMessage.getStat() == FetchStat.SUCCESS);
    }

    private void handleLoginResponse(boolean success) {
        this.isInProgress = false;
        Dialog dialog = this.credentialsDialog;
        if (dialog != null) {
            dialog.dismiss();
            this.credentialsDialog = null;
        }
        if (isActive()) {
            if (!success) {
                hideProgress();
                Toast.makeText(getActivity(), R.string.auth_failed, 0).show();
                return;
            }
            Log.d("LOGINTEST", "ON FETCHED...");
            if (SharedPrefs.getFavoriteSports(getActivity()) != null) {
                SharedPrefs.saveFavoriteSports(getActivity(), null);
            } else {
                loadMyInfo();
            }
        }
    }

    private void loadMyInfo() {
        this.userService.getProfile(this, UserService.InfoKind.GENERAL, UserService.InfoKind.PROGRESS);
    }

    @Override // org.betup.services.user.UserService.UserInfoListener
    public void onProfileFetched(FullUserProfileModel fullUserProfileModel, Set<UserService.InfoKind> updated, FetchStat stat) {
        this.isInProgress = false;
        if (isActive()) {
            if (stat != FetchStat.SUCCESS) {
                hideProgress();
                Toast.makeText(getActivity(), R.string.auth_failed, 0).show();
            } else {
                hideProgress();
                this.loginHandler.loginCompleted();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle savedState) {
        super.onSaveInstanceState(savedState);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        if (this.isInProgress) {
            return;
        }
        int id = v.getId();
        if (id == R.id.fbButton) {
            facebookClick();
            return;
        }
        if (id == R.id.googlePlusButton) {
            if (this.display != Display.MENU) {
                if (this.mGoogleApiClient == null || getContext() == null) {
                    return;
                }
                GoogleSignIn.getClient(getContext().getApplicationContext(), new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestIdToken(getString(R.string.default_web_client_id)).requestEmail().build()).signOut().addOnCompleteListener(new OnCompleteListener() { // from class: org.betup.ui.fragment.login.LoginFragment$$ExternalSyntheticLambda3
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        LoginFragment.this.m13867lambda$onClick$2$orgbetupuifragmentloginLoginFragment(task);
                    }
                });
                return;
            }
            switchToConcreteScreen(Display.REGISTER);
            return;
        }
        if (id != R.id.signInButton) {
            return;
        }
        if (this.display == Display.LOGIN || this.display == Display.REGISTER) {
            if (this.display != Display.REGISTER) {
                SignInDialog signInDialog = new SignInDialog(getActivity(), this, this.action == Action.LOGIN);
                this.credentialsDialog = signInDialog;
                signInDialog.show();
                return;
            } else {
                SignUpDialog signUpDialog = new SignUpDialog(getActivity(), this);
                this.credentialsDialog = signUpDialog;
                signUpDialog.show();
                return;
            }
        }
        switchToConcreteScreen(Display.LOGIN);
    }

    /* renamed from: lambda$onClick$2$org-betup-ui-fragment-login-LoginFragment, reason: not valid java name */
    /* synthetic */ void m13867lambda$onClick$2$orgbetupuifragmentloginLoginFragment(Task task) {
        if (!isAdded() || this.mGoogleApiClient == null) {
            return;
        }
        startActivityForResult(Auth.GoogleSignInApi.getSignInIntent(this.mGoogleApiClient), RC_SIGN_IN);
    }

    private void initPrivacyButton() {
        SpannableString spannableString = new SpannableString(getString(R.string.terms_privacy_policy));
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        this.privacyButton.setText(spannableString);
    }

    private void switchToConcreteScreen(Display display) {
        if (this.display == Display.MENU) {
            TransitionManager.beginDelayedTransition(this.constraintLayout);
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(getActivity(), R.layout.fragment_login_second);
            constraintSet.applyTo(this.constraintLayout);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this.loginRegOption, "textColor", ContextCompat.getColor(getActivity(), R.color.login_screen_text_color), ContextCompat.getColor(getActivity(), R.color.colorAccent));
            ofInt.setDuration(150L);
            ofInt.setEvaluator(new ArgbEvaluator());
            ofInt.start();
            applyDisplayParams(display);
        } else if (display == Display.MENU) {
            TransitionManager.beginDelayedTransition(this.constraintLayout);
            ConstraintSet constraintSet2 = new ConstraintSet();
            constraintSet2.clone(getActivity(), R.layout.fragment_login);
            constraintSet2.applyTo(this.constraintLayout);
            ObjectAnimator ofInt2 = ObjectAnimator.ofInt(this.loginRegOption, "textColor", ContextCompat.getColor(getActivity(), R.color.colorAccent), ContextCompat.getColor(getActivity(), R.color.login_screen_text_color));
            ofInt2.setDuration(150L);
            ofInt2.setEvaluator(new ArgbEvaluator());
            ofInt2.start();
            applyDisplayParams(display);
        } else {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: org.betup.ui.fragment.login.LoginFragment.4
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    super.onAnimationEnd(animation);
                    if (LoginFragment.this.isActive()) {
                        LoginFragment loginFragment = LoginFragment.this;
                        loginFragment.applyDisplayParams(loginFragment.display);
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animation.setDuration(250L);
                        LoginFragment.this.applyAllButtonsAlphaAnimation(animatorSet2, 0.0f, 1.0f);
                        animatorSet2.start();
                    }
                }
            });
            applyAllButtonsAlphaAnimation(animatorSet, 1.0f, 0.0f);
            animatorSet.start();
        }
        this.display = display;
        this.back.setVisibility(this.action == Action.UPGRADE ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyAllButtonsAlphaAnimation(AnimatorSet animatorSet, float from, float to) {
        Log.d("LOGINTEST", "ANIMATING FROM " + from + " TO " + to);
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.googleSignInButton, "alpha", from, to), ObjectAnimator.ofFloat(this.vkButton, "alpha", from, to), ObjectAnimator.ofFloat(this.enterByFB, "alpha", from, to), ObjectAnimator.ofFloat(this.signInButton, "alpha", from, to), ObjectAnimator.ofFloat(this.title, "alpha", from, to), ObjectAnimator.ofFloat(this.loginRegOption, "alpha", from, to), ObjectAnimator.ofFloat(this.forgotPassword, "alpha", from, to));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyDisplayParams(Display display) {
        if (display != Display.MENU) {
            this.loginRegOption.setPaintFlags(this.forgotPassword.getPaintFlags() | 8);
            this.googleSignInButton.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(getActivity(), R.mipmap.google), (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            this.loginRegOption.setPaintFlags(this.forgotPassword.getPaintFlags() ^ 8);
            this.googleSignInButton.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        int i = AnonymousClass10.$SwitchMap$org$betup$ui$fragment$login$LoginFragment$Display[display.ordinal()];
        if (i == 1) {
            this.title.setText(getString(R.string.sign_in));
            this.googleSignInButton.setText(getString(R.string.login_sign_in_g_plus_button));
            this.signInButton.setText(getString(R.string.login_sign_in_button));
            this.enterByFB.setText(getString(R.string.login_sign_in_facebook_button));
            this.vkButton.setText(getString(R.string.login_sign_in_vk));
            this.loginRegOption.setText(getString(R.string.register_new_account));
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            this.signInButton.setText(getString(R.string.sign_in));
            this.loginRegOption.setText(getString(R.string.new_here));
            this.googleSignInButton.setText(getString(R.string.register_new_account));
            return;
        }
        this.title.setText(getString(R.string.register_new_account));
        this.googleSignInButton.setText(getString(R.string.login_register_g_plus));
        this.signInButton.setText(getString(R.string.login_register_email));
        this.enterByFB.setText(getString(R.string.login_register_facebook));
        this.vkButton.setText(getString(R.string.login_register_vk));
        this.loginRegOption.setText(getString(R.string.already_have_account));
    }

    /* renamed from: org.betup.ui.fragment.login.LoginFragment$10, reason: invalid class name */
    static /* synthetic */ class AnonymousClass10 {
        static final /* synthetic */ int[] $SwitchMap$org$betup$ui$fragment$login$LoginFragment$Display;

        static {
            int[] iArr = new int[Display.values().length];
            $SwitchMap$org$betup$ui$fragment$login$LoginFragment$Display = iArr;
            try {
                iArr[Display.LOGIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$betup$ui$fragment$login$LoginFragment$Display[Display.REGISTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$betup$ui$fragment$login$LoginFragment$Display[Display.MENU.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @OnClick({R.id.privacyButton})
    public void onPrivacyButtonClick() {
        ExternalBrowserOpener.open(requireContext(), ApiConfigResolver.getApiConfig().getPrivacyPolicyUrl());
    }

    @OnClick({R.id.back})
    public void onBackClick() {
        getActivity().finish();
    }

    @OnClick({R.id.play_as_guest})
    public void onPlayAsGuestClick() {
        displayProgress();
        this.mAuth.signInAnonymously().addOnCompleteListener(getActivity(), new OnCompleteListener() { // from class: org.betup.ui.fragment.login.LoginFragment$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                LoginFragment.this.m13869x980f2cc4(task);
            }
        });
    }

    /* renamed from: lambda$onPlayAsGuestClick$3$org-betup-ui-fragment-login-LoginFragment, reason: not valid java name */
    /* synthetic */ void m13869x980f2cc4(Task task) {
        if (isActive()) {
            hideProgress();
        }
        this.analyticsService.sendTrackEvent(TrackEventType.ANONYMOUS_LOGIN);
        FirebaseAnalyticsHelper.trackAnonymousLogin(getActivity());
        Log.d(this.TAG, "signInWithEmail:onComplete:" + task.isSuccessful());
        if (!task.isSuccessful()) {
            hideProgress();
            Log.w(this.TAG, "signInWithEmail:failed", task.getException());
            Toast.makeText(getActivity(), FirebaseErrorHandler.getMessageForError(getActivity(), task), 0).show();
            return;
        }
        makeLogin(this.mAuth, ((AuthResult) task.getResult()).getAdditionalUserInfo().isNewUser());
    }

    @OnClick({R.id.loginRegOption})
    public void onLogRegClick() {
        Log.d("LOGINTEST", "DISPLAY NOW IS = " + this.display);
        if (this.display == Display.LOGIN) {
            switchToConcreteScreen(Display.REGISTER);
        } else if (this.display == Display.REGISTER) {
            switchToConcreteScreen(Display.LOGIN);
        }
    }

    @OnClick({R.id.vkButton})
    public void vkClick() {
        if (this.isInProgress) {
            return;
        }
        VksdkHelper.ensureInitialized(requireContext());
        Intent intent = new Intent(getActivity(), (Class<?>) VKServiceActivity.class);
        intent.putExtra("arg1", HttpHeaders.AUTHORIZATION);
        intent.putStringArrayListExtra("arg2", new ArrayList<>(Arrays.asList("offline", "wall", "photos", "email")));
        intent.putExtra("arg4", VKSdk.isCustomInitialize());
        startActivityForResult(intent, VKServiceActivity.VKServiceType.Authorization.getOuterCode());
    }

    private void registerFacebookCallbacks() {
        if (!FacebookSdkHelper.ensureInitialized(getContext())) {
            Log.e(this.TAG, "Facebook SDK unavailable; Facebook login disabled");
            return;
        }
        LoginManager.getInstance().logOut();
        this.callbackManager = CallbackManager.Factory.create();
        LoginManager.getInstance().registerCallback(this.callbackManager, this.fbCallback);
    }

    private void facebookClick() {
        if (!FacebookSdkHelper.ensureInitialized(getContext())) {
            Toast.makeText(getActivity(), R.string.auth_failed, 0).show();
            return;
        }
        LoginManager.getInstance().logOut();
        ArrayList arrayList = new ArrayList();
        arrayList.add("email");
        arrayList.add("public_profile");
        LoginManager.getInstance().logInWithReadPermissions(this, arrayList);
    }

    @Override // org.betup.ui.fragment.home.dialog.SignInDialog.OnCredentialsEnteredListener
    public void onNewAccountClicked() {
        SignUpDialog signUpDialog = new SignUpDialog(getActivity(), this);
        this.credentialsDialog = signUpDialog;
        signUpDialog.show();
    }

    private boolean validateCredentials(String email, String password) {
        if (password == null || password.length() < 3) {
            hideProgress();
            Toast.makeText(getActivity(), R.string.password_cannot_be_empty, 0).show();
            return false;
        }
        if (email != null && email.length() >= 3) {
            return true;
        }
        hideProgress();
        Toast.makeText(getActivity(), R.string.email_cannot_be_empty, 0).show();
        return false;
    }

    @Override // org.betup.ui.fragment.home.dialog.SignInDialog.OnCredentialsEnteredListener
    public void onCredentialsEntered(String email, String password) {
        displayProgress();
        if (validateCredentials(email, password)) {
            this.mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(getActivity(), new OnCompleteListener<AuthResult>() { // from class: org.betup.ui.fragment.login.LoginFragment.6
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public void onComplete(Task<AuthResult> task) {
                    Log.d(LoginFragment.this.TAG, "signInWithEmail:onComplete:" + task.isSuccessful());
                    if (!task.isSuccessful()) {
                        LoginFragment.this.hideProgress();
                        Log.w(LoginFragment.this.TAG, "signInWithEmail:failed", task.getException());
                        Toast.makeText(LoginFragment.this.getActivity(), FirebaseErrorHandler.getMessageForError(LoginFragment.this.getActivity(), task), 0).show();
                    } else {
                        LoginFragment loginFragment = LoginFragment.this;
                        loginFragment.makeLogin(loginFragment.mAuth, false);
                    }
                }
            });
        }
    }

    @Override // org.betup.ui.fragment.home.dialog.SignUpDialog.OnRegDataEnteredListener
    public void onRegDataEntered(final String nickname, String email, String password, String passwordConfirm) {
        if (isActive()) {
            displayProgress();
            if (validateCredentials(email, password)) {
                if (!password.equals(passwordConfirm)) {
                    hideProgress();
                    Toast.makeText(getActivity(), R.string.password_do_not_match, 0).show();
                } else {
                    this.mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(getActivity(), new OnCompleteListener() { // from class: org.betup.ui.fragment.login.LoginFragment$$ExternalSyntheticLambda6
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public final void onComplete(Task task) {
                            LoginFragment.this.m13871xaaf52c49(nickname, task);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: lambda$onRegDataEntered$5$org-betup-ui-fragment-login-LoginFragment, reason: not valid java name */
    /* synthetic */ void m13871xaaf52c49(String str, final Task task) {
        Log.d(this.TAG, "createUserWithEmail:onComplete:" + task.isSuccessful());
        if (!task.isSuccessful()) {
            hideProgress();
            Toast.makeText(getActivity(), FirebaseErrorHandler.getMessageForError(getActivity(), task), 0).show();
            return;
        }
        UserProfileChangeRequest build = new UserProfileChangeRequest.Builder().setDisplayName(str).build();
        if (this.mAuth.getCurrentUser() != null) {
            this.mAuth.getCurrentUser().updateProfile(build).addOnCompleteListener(new OnCompleteListener() { // from class: org.betup.ui.fragment.login.LoginFragment$$ExternalSyntheticLambda7
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    LoginFragment.this.m13870xc5b3bd88(task, task2);
                }
            });
        } else {
            hideProgress();
            Toast.makeText(getActivity(), FirebaseErrorHandler.getMessageForError(getActivity(), task), 0).show();
        }
    }

    /* renamed from: lambda$onRegDataEntered$4$org-betup-ui-fragment-login-LoginFragment, reason: not valid java name */
    /* synthetic */ void m13870xc5b3bd88(Task task, Task task2) {
        if (task2.isSuccessful()) {
            proceedAfterSocialLogin((AuthResult) task.getResult());
        } else {
            hideProgress();
        }
    }

    @OnClick({R.id.forgot_password})
    public void forgotPasswordClick() {
        new InputDialog.Builder(getActivity()).setInputListener(new InputDialog.InputListener() { // from class: org.betup.ui.fragment.login.LoginFragment.7
            @Override // org.betup.ui.dialogs.InputDialog.InputListener
            public void canceled() {
            }

            @Override // org.betup.ui.dialogs.InputDialog.InputListener
            public void textEntered(InputDialog dialog, String str) {
                if (LoginFragment.this.isActive() && LoginFragment.this.resetPassClick(str)) {
                    dialog.dismiss();
                }
            }
        }).setTitle(getString(R.string.reset_password)).setDesc(getString(R.string.enter_your_email)).build().show();
    }

    @Override // org.betup.ui.fragment.home.dialog.SignInDialog.OnCredentialsEnteredListener
    public boolean resetPassClick(final String email) {
        Log.d("PROVIDERTEST", "RESETTING PASS WITH " + email);
        if (email == null || !email.contains("@")) {
            Toast.makeText(getActivity(), R.string.invalid_email, 0).show();
            return false;
        }
        displayProgress();
        this.mAuth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener() { // from class: org.betup.ui.fragment.login.LoginFragment$$ExternalSyntheticLambda5
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                LoginFragment.this.m13872xabe8d8ba(email, task);
            }
        });
        return true;
    }

    /* renamed from: lambda$resetPassClick$6$org-betup-ui-fragment-login-LoginFragment, reason: not valid java name */
    /* synthetic */ void m13872xabe8d8ba(String str, Task task) {
        hideProgress();
        if (task.isSuccessful()) {
            Toast.makeText(getActivity(), Html.fromHtml(String.format(Locale.getDefault(), getString(R.string.email_sent), str)), 0).show();
        } else {
            Log.d("PROVIDERTEST", "ERROR " + task.getException().getMessage());
            Toast.makeText(getActivity(), R.string.invalid_email, 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void firebaseAuthWithVk(final VKAccessToken res) {
        displayProgress();
        Log.d(this.TAG, "VK TOKEN = " + res.accessToken + "  EXP = " + res.expiresIn + " ID = " + res.userId + " " + res.secret);
        Bundle bundle = new Bundle();
        bundle.putString("email", res.email);
        bundle.putString("type", "vk");
        this.v7GetCustomTokenInteractor.load(this.firebaseTokenGotListener, res.accessToken, bundle);
        Log.d("LOGINTEST", "VK SENT");
    }

    /* renamed from: org.betup.ui.fragment.login.LoginFragment$8, reason: invalid class name */
    class AnonymousClass8 implements BaseCachedSharedInteractor.OnFetchedListener<CustomTokenResponseModel, String> {
        AnonymousClass8() {
        }

        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public void onFetched(FetchedResponseMessage<CustomTokenResponseModel, String> responseMessage) {
            if (responseMessage.getStat() == FetchStat.SUCCESS) {
                Log.d(LoginFragment.this.TAG, "FIREBASE VK LISTENER");
                String uid = responseMessage.getModel().getUid();
                Log.d(LoginFragment.this.TAG, "UID GOT = " + uid);
                Log.d(LoginFragment.this.TAG, "ACTIVITY IS " + LoginFragment.this.getActivity());
                LoginFragment.this.mAuth.signInWithCustomToken(uid).addOnCompleteListener(LoginFragment.this.getActivity(), new OnCompleteListener() { // from class: org.betup.ui.fragment.login.LoginFragment$8$$ExternalSyntheticLambda0
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        LoginFragment.AnonymousClass8.this.m13873lambda$onFetched$0$orgbetupuifragmentloginLoginFragment$8(task);
                    }
                });
                return;
            }
            LoginFragment.this.hideProgress();
            Toast.makeText(LoginFragment.this.getActivity(), R.string.auth_failed, 0).show();
        }

        /* renamed from: lambda$onFetched$0$org-betup-ui-fragment-login-LoginFragment$8, reason: not valid java name */
        /* synthetic */ void m13873lambda$onFetched$0$orgbetupuifragmentloginLoginFragment$8(Task task) {
            if (!task.isSuccessful()) {
                LoginFragment.this.hideProgress();
                Log.w(LoginFragment.this.TAG, "signInWithVK:failed", task.getException());
                Toast.makeText(LoginFragment.this.getActivity(), FirebaseErrorHandler.getMessageForError(LoginFragment.this.getActivity(), task), 0).show();
            } else {
                Log.d(LoginFragment.this.TAG, "MAKING LOGIN...");
                LoginFragment.this.proceedAfterSocialLogin((AuthResult) task.getResult());
            }
        }
    }

    private void firebaseAuthWithGoogle(GoogleSignInAccount acct) {
        displayProgress();
        Log.d(this.TAG, "firebaseAuthWithGoogle:" + acct.getId());
        this.mAuth.signInWithCredential(GoogleAuthProvider.getCredential(acct.getIdToken(), null)).addOnCompleteListener(getActivity(), new OnCompleteListener<AuthResult>() { // from class: org.betup.ui.fragment.login.LoginFragment.9
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(Task<AuthResult> task) {
                if (task.isSuccessful() && LoginFragment.this.mAuth.getCurrentUser() != null) {
                    LoginFragment.this.proceedAfterSocialLogin(task.getResult());
                    Log.d(LoginFragment.this.TAG, "signInWithCredential:success");
                } else {
                    LoginFragment.this.hideProgress();
                    Log.w(LoginFragment.this.TAG, "signInWithCredential:failure", task.getException());
                    Toast.makeText(LoginFragment.this.getActivity(), FirebaseErrorHandler.getMessageForError(LoginFragment.this.getActivity(), task), 0).show();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void firebaseAuthWithFacebook(AccessToken token) {
        displayProgress();
        Log.d(this.TAG, "handleFacebookAccessToken:" + token);
        this.mAuth.signInWithCredential(FacebookAuthProvider.getCredential(token.getToken())).addOnCompleteListener(getActivity(), new OnCompleteListener() { // from class: org.betup.ui.fragment.login.LoginFragment$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                LoginFragment.this.m13865xc82716ee(task);
            }
        });
    }

    /* renamed from: lambda$firebaseAuthWithFacebook$7$org-betup-ui-fragment-login-LoginFragment, reason: not valid java name */
    /* synthetic */ void m13865xc82716ee(Task task) {
        if (task.isSuccessful()) {
            proceedAfterSocialLogin((AuthResult) task.getResult());
            Log.d(this.TAG, "signInWithCredential:success");
        } else {
            hideProgress();
            Log.w(this.TAG, "signInWithCredential:failure", task.getException());
            Toast.makeText(getActivity(), FirebaseErrorHandler.getMessageForError(getActivity(), task), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void proceedAfterSocialLogin(AuthResult result) {
        if (result.getAdditionalUserInfo().isNewUser()) {
            FirebaseAnalyticsHelper.trackSignup(getActivity());
            makeLogin(this.mAuth, true);
        } else {
            makeLogin(this.mAuth, false);
        }
    }
}
