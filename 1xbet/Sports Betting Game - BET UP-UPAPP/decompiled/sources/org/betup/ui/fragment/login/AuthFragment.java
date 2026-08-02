package org.betup.ui.fragment.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import com.facebook.CallbackManager;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.common.net.HttpHeaders;
import com.google.firebase.auth.AdditionalUserInfo;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GetTokenResult;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vk.sdk.VKAccessToken;
import com.vk.sdk.VKCallback;
import com.vk.sdk.VKSdk;
import com.vk.sdk.VKServiceActivity;
import com.vk.sdk.api.VKError;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.bidmachine.media3.extractor.text.ttml.TtmlNode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.model.local.entity.FullUserProfileModel;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.config.ApiConfigResolver;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.user.NewLoginInteractor;
import org.betup.model.remote.api.rest.user.UpgradeLoginInteractor;
import org.betup.model.remote.api.rest.user.V7GetCustomTokenInteractor;
import org.betup.model.remote.entity.analytics.TrackEventType;
import org.betup.model.remote.entity.login.LoginResponseModel;
import org.betup.model.remote.entity.login.UserUpgradeResultModel;
import org.betup.services.analytics.AnalyticsHelper;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.analytics.FirebaseAnalyticsHelper;
import org.betup.services.user.UserService;
import org.betup.ui.BackPressedController;
import org.betup.ui.fragment.BaseFragment;
import org.betup.ui.fragment.login.compose.AuthScreen;
import org.betup.ui.fragment.login.controller.AuthController;
import org.betup.utils.ExternalBrowserOpener;
import org.betup.utils.FirebaseErrorHandler;
import org.betup.utils.GoogleSignInDeviceHelper;
import org.betup.utils.SnackbarHelper;
import org.betup.utils.VksdkHelper;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: AuthFragment.kt */
@Metadata(d1 = {"\u0000Ï\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r*\u0003IT`\b\u0007\u0018\u0000 u2\u00020\u00012\u00020\u0002:\u0003uvwB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u0010\u00105\u001a\u0002022\u0006\u00106\u001a\u000207H\u0016J\b\u00108\u001a\u000202H\u0016J\b\u00109\u001a\u000202H\u0016J\b\u0010:\u001a\u000202H\u0016J$\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u0010A\u001a\u000202H\u0002J\b\u0010B\u001a\u000202H\u0002J\b\u0010C\u001a\u000202H\u0002J\b\u0010D\u001a\u000202H\u0002J\u0012\u0010E\u001a\u0002022\b\b\u0002\u0010F\u001a\u00020.H\u0002J\b\u0010G\u001a\u000202H\u0002J&\u0010K\u001a\u0002022\u0006\u0010L\u001a\u00020M2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020P0O2\u0006\u0010Q\u001a\u00020RH\u0016J\"\u0010V\u001a\u0002022\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020X2\b\u0010Z\u001a\u0004\u0018\u00010[H\u0016J\u0010\u0010\\\u001a\u0002022\u0006\u0010]\u001a\u00020^H\u0002J\u0010\u0010b\u001a\u0002022\u0006\u0010c\u001a\u00020dH\u0002J\u000e\u0010e\u001a\u0002022\u0006\u0010f\u001a\u00020*J\b\u0010g\u001a\u000202H\u0002J\b\u0010h\u001a\u00020.H\u0002J3\u0010i\u001a\u0002022\u0006\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020k2\b\u0010m\u001a\u0004\u0018\u00010k2\n\b\u0002\u0010n\u001a\u0004\u0018\u00010XH\u0002¢\u0006\u0002\u0010oJ,\u0010p\u001a\u0002022\u0006\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020k2\u0006\u0010q\u001a\u00020k2\n\b\u0002\u0010r\u001a\u0004\u0018\u00010kH\u0002J\u001a\u0010s\u001a\u0002022\b\u0010Q\u001a\u0004\u0018\u00010R2\u0006\u0010t\u001a\u00020XH\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010H\u001a\u00020IX\u0082\u0004¢\u0006\u0004\n\u0002\u0010JR\u0010\u0010S\u001a\u00020TX\u0082\u0004¢\u0006\u0004\n\u0002\u0010UR\u0010\u0010_\u001a\u00020`X\u0082\u0004¢\u0006\u0004\n\u0002\u0010a¨\u0006x"}, d2 = {"Lorg/betup/ui/fragment/login/AuthFragment;", "Lorg/betup/ui/fragment/BaseFragment;", "Lorg/betup/services/user/UserService$UserInfoListener;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "authController", "Lorg/betup/ui/fragment/login/controller/AuthController;", "getAuthController", "()Lorg/betup/ui/fragment/login/controller/AuthController;", "setAuthController", "(Lorg/betup/ui/fragment/login/controller/AuthController;)V", "newLoginInteractor", "Lorg/betup/model/remote/api/rest/user/NewLoginInteractor;", "getNewLoginInteractor", "()Lorg/betup/model/remote/api/rest/user/NewLoginInteractor;", "setNewLoginInteractor", "(Lorg/betup/model/remote/api/rest/user/NewLoginInteractor;)V", "upgradeLoginInteractor", "Lorg/betup/model/remote/api/rest/user/UpgradeLoginInteractor;", "getUpgradeLoginInteractor", "()Lorg/betup/model/remote/api/rest/user/UpgradeLoginInteractor;", "setUpgradeLoginInteractor", "(Lorg/betup/model/remote/api/rest/user/UpgradeLoginInteractor;)V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "v7GetCustomTokenInteractor", "Lorg/betup/model/remote/api/rest/user/V7GetCustomTokenInteractor;", "getV7GetCustomTokenInteractor", "()Lorg/betup/model/remote/api/rest/user/V7GetCustomTokenInteractor;", "setV7GetCustomTokenInteractor", "(Lorg/betup/model/remote/api/rest/user/V7GetCustomTokenInteractor;)V", "analyticsService", "Lorg/betup/services/analytics/AnalyticsService;", "getAnalyticsService", "()Lorg/betup/services/analytics/AnalyticsService;", "setAnalyticsService", "(Lorg/betup/services/analytics/AnalyticsService;)V", "loginHandler", "Lorg/betup/ui/fragment/login/AuthFragment$LoginHandler;", "backPressedController", "Lorg/betup/ui/BackPressedController;", "isInProgress", "", "action", "Lorg/betup/ui/fragment/login/AuthFragment$Action;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", X3.i.u0, X3.i.t0, "onDestroyView", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "startGoogleSignInWithCredentialManagerFirst", "startGoogleSignIn", "startVKSignIn", "signInAnonymously", "makeLogin", "isNewUser", "makeLoginUpgrade", "upgradeLoginListener", "org/betup/ui/fragment/login/AuthFragment$upgradeLoginListener$1", "Lorg/betup/ui/fragment/login/AuthFragment$upgradeLoginListener$1;", "onProfileFetched", "fullUserProfileModel", "Lorg/betup/model/local/entity/FullUserProfileModel;", "updated", "", "Lorg/betup/services/user/UserService$InfoKind;", "stat", "Lorg/betup/model/remote/api/FetchStat;", "newLoginListener", "org/betup/ui/fragment/login/AuthFragment$newLoginListener$1", "Lorg/betup/ui/fragment/login/AuthFragment$newLoginListener$1;", "onActivityResult", "requestCode", "", X3.f.f, "data", "Landroid/content/Intent;", "firebaseAuthWithVk", "token", "Lcom/vk/sdk/VKAccessToken;", "firebaseTokenGotListener", "org/betup/ui/fragment/login/AuthFragment$firebaseTokenGotListener$1", "Lorg/betup/ui/fragment/login/AuthFragment$firebaseTokenGotListener$1;", "proceedAfterSocialLogin", "result", "Lcom/google/firebase/auth/AuthResult;", "setLoginHandler", "handler", "openPrivacyPolicy", "isGooglePlayServicesAvailable", "reportAuthFailure", IronSourceConstants.EVENTS_PROVIDER, "", X3.i.q, "reason", "statusCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "reportAuthStage", "outcome", "detail", "showFetchError", "fallbackMessageRes", VastTagName.COMPANION, "Action", "LoginHandler", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AuthFragment extends BaseFragment implements UserService.UserInfoListener {
    public static final String ARG_OPEN_TO_SIGN_UP = "open_to_sign_up";
    private static final int RC_SIGN_IN = 884;
    private static final String TAG = "AuthFragment";

    @Inject
    public AnalyticsService analyticsService;

    @Inject
    public AuthController authController;
    private BackPressedController backPressedController;
    private boolean isInProgress;
    private LoginHandler loginHandler;

    @Inject
    public NewLoginInteractor newLoginInteractor;

    @Inject
    public UpgradeLoginInteractor upgradeLoginInteractor;

    @Inject
    public UserService userService;

    @Inject
    public V7GetCustomTokenInteractor v7GetCustomTokenInteractor;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private Action action = Action.LOGIN;
    private final AuthFragment$upgradeLoginListener$1 upgradeLoginListener = new BaseCachedSharedInteractor.OnFetchedListener<UserUpgradeResultModel, Void>() { // from class: org.betup.ui.fragment.login.AuthFragment$upgradeLoginListener$1
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public void onFetched(FetchedResponseMessage<UserUpgradeResultModel, Void> responseMessage) {
            FetchStat stat;
            if (!AuthFragment.this.isAdded()) {
                AuthFragment.this.isInProgress = false;
                AuthFragment.this.getAuthController().endBackendAuth();
                return;
            }
            if ((responseMessage != null ? responseMessage.getStat() : null) != FetchStat.SUCCESS) {
                AuthFragment.this.isInProgress = false;
                AuthFragment.this.getAuthController().endBackendAuth();
                Log.e("AuthFragment", "Upgrade failed: " + (responseMessage != null ? responseMessage.getStat() : null));
                AuthFragment.reportAuthFailure$default(AuthFragment.this, "backend", "login_upgrade", (responseMessage == null || (stat = responseMessage.getStat()) == null) ? null : stat.name(), null, 8, null);
                AuthFragment.this.showFetchError(responseMessage != null ? responseMessage.getStat() : null, R.string.auth_failed);
                return;
            }
            AuthFragment.this.getUserService().getProfile(AuthFragment.this, UserService.InfoKind.GENERAL, UserService.InfoKind.PROGRESS, UserService.InfoKind.RANKS, UserService.InfoKind.STATS, UserService.InfoKind.FAVOURITES);
        }
    };
    private final AuthFragment$newLoginListener$1 newLoginListener = new BaseCachedSharedInteractor.OnFetchedListener<LoginResponseModel, Void>() { // from class: org.betup.ui.fragment.login.AuthFragment$newLoginListener$1
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public void onFetched(FetchedResponseMessage<LoginResponseModel, Void> responseMessage) {
            FetchStat stat;
            if (!AuthFragment.this.isAdded()) {
                AuthFragment.this.isInProgress = false;
                AuthFragment.this.getAuthController().endBackendAuth();
                return;
            }
            if ((responseMessage != null ? responseMessage.getStat() : null) != FetchStat.SUCCESS) {
                AuthFragment.this.isInProgress = false;
                AuthFragment.this.getAuthController().endBackendAuth();
                Log.e("AuthFragment", "Login failed: " + (responseMessage != null ? responseMessage.getStat() : null));
                AuthFragment.reportAuthFailure$default(AuthFragment.this, "backend", "login", (responseMessage == null || (stat = responseMessage.getStat()) == null) ? null : stat.name(), null, 8, null);
                AuthFragment.this.showFetchError(responseMessage != null ? responseMessage.getStat() : null, R.string.auth_failed);
                return;
            }
            AuthFragment.this.getUserService().getProfile(AuthFragment.this, UserService.InfoKind.GENERAL, UserService.InfoKind.PROGRESS, UserService.InfoKind.RANKS, UserService.InfoKind.STATS, UserService.InfoKind.FAVOURITES);
        }
    };
    private final AuthFragment$firebaseTokenGotListener$1 firebaseTokenGotListener = new AuthFragment$firebaseTokenGotListener$1(this);

    /* compiled from: AuthFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lorg/betup/ui/fragment/login/AuthFragment$LoginHandler;", "", "loginCompleted", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface LoginHandler {
        void loginCompleted();
    }

    /* compiled from: AuthFragment.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FetchStat.values().length];
            try {
                iArr[FetchStat.NO_CONNECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FetchStat.SERVER_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FetchStat.FAIL_AFTER_RETRIALS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FetchStat.INVALID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FetchStat.NO_AUTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FetchStat.NOT_ALLOWED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final AuthController getAuthController() {
        AuthController authController = this.authController;
        if (authController != null) {
            return authController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("authController");
        return null;
    }

    public final void setAuthController(AuthController authController) {
        Intrinsics.checkNotNullParameter(authController, "<set-?>");
        this.authController = authController;
    }

    public final NewLoginInteractor getNewLoginInteractor() {
        NewLoginInteractor newLoginInteractor = this.newLoginInteractor;
        if (newLoginInteractor != null) {
            return newLoginInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("newLoginInteractor");
        return null;
    }

    public final void setNewLoginInteractor(NewLoginInteractor newLoginInteractor) {
        Intrinsics.checkNotNullParameter(newLoginInteractor, "<set-?>");
        this.newLoginInteractor = newLoginInteractor;
    }

    public final UpgradeLoginInteractor getUpgradeLoginInteractor() {
        UpgradeLoginInteractor upgradeLoginInteractor = this.upgradeLoginInteractor;
        if (upgradeLoginInteractor != null) {
            return upgradeLoginInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("upgradeLoginInteractor");
        return null;
    }

    public final void setUpgradeLoginInteractor(UpgradeLoginInteractor upgradeLoginInteractor) {
        Intrinsics.checkNotNullParameter(upgradeLoginInteractor, "<set-?>");
        this.upgradeLoginInteractor = upgradeLoginInteractor;
    }

    public final UserService getUserService() {
        UserService userService = this.userService;
        if (userService != null) {
            return userService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userService");
        return null;
    }

    public final void setUserService(UserService userService) {
        Intrinsics.checkNotNullParameter(userService, "<set-?>");
        this.userService = userService;
    }

    public final V7GetCustomTokenInteractor getV7GetCustomTokenInteractor() {
        V7GetCustomTokenInteractor v7GetCustomTokenInteractor = this.v7GetCustomTokenInteractor;
        if (v7GetCustomTokenInteractor != null) {
            return v7GetCustomTokenInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("v7GetCustomTokenInteractor");
        return null;
    }

    public final void setV7GetCustomTokenInteractor(V7GetCustomTokenInteractor v7GetCustomTokenInteractor) {
        Intrinsics.checkNotNullParameter(v7GetCustomTokenInteractor, "<set-?>");
        this.v7GetCustomTokenInteractor = v7GetCustomTokenInteractor;
    }

    public final AnalyticsService getAnalyticsService() {
        AnalyticsService analyticsService = this.analyticsService;
        if (analyticsService != null) {
            return analyticsService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticsService");
        return null;
    }

    public final void setAnalyticsService(AnalyticsService analyticsService) {
        Intrinsics.checkNotNullParameter(analyticsService, "<set-?>");
        this.analyticsService = analyticsService;
    }

    /* compiled from: AuthFragment.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lorg/betup/ui/fragment/login/AuthFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "RC_SIGN_IN", "", "ARG_OPEN_TO_SIGN_UP", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/fragment/login/AuthFragment;", "action", "Lorg/betup/ui/fragment/login/AuthFragment$Action;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AuthFragment newInstance(Action action) {
            Intrinsics.checkNotNullParameter(action, "action");
            AuthFragment authFragment = new AuthFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("action", action);
            authFragment.setArguments(bundle);
            return authFragment;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AuthFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lorg/betup/ui/fragment/login/AuthFragment$Action;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "LOGIN", "UPGRADE", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action LOGIN = new Action("LOGIN", 0);
        public static final Action UPGRADE = new Action("UPGRADE", 1);

        private static final /* synthetic */ Action[] $values() {
            return new Action[]{LOGIN, UPGRADE};
        }

        public static EnumEntries<Action> getEntries() {
            return $ENTRIES;
        }

        private Action(String str, int i) {
        }

        static {
            Action[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requireActivity().setResult(0);
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("action") : null;
        Action action = serializable instanceof Action ? (Action) serializable : null;
        if (action == null) {
            action = Action.LOGIN;
        }
        this.action = action;
        Context applicationContext = requireActivity().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        getAuthController().initialize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        try {
            this.loginHandler = context instanceof LoginHandler ? (LoginHandler) context : null;
            this.backPressedController = context instanceof BackPressedController ? (BackPressedController) context : null;
        } catch (ClassCastException unused) {
            throw new ClassCastException(context + " must implement LoginHandler");
        }
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        BackPressedController backPressedController = this.backPressedController;
        if (backPressedController != null) {
            backPressedController.setOnBackPressedListener(new BackPressedController.BackPressedListener() { // from class: org.betup.ui.fragment.login.AuthFragment$onResume$1
                @Override // org.betup.ui.BackPressedController.BackPressedListener
                public boolean onBackPressed() {
                    AuthScreen value = AuthFragment.this.getAuthController().getCurrentScreen().getValue();
                    if (Intrinsics.areEqual(value, AuthScreen.GuestEntry.INSTANCE)) {
                        AuthFragment.this.requireActivity().finish();
                        return true;
                    }
                    if (Intrinsics.areEqual(value, AuthScreen.SignInOptions.INSTANCE)) {
                        AuthFragment.this.getAuthController().clearErrors();
                        AuthFragment.this.getAuthController().navigateTo(AuthScreen.GuestEntry.INSTANCE);
                        return true;
                    }
                    if (Intrinsics.areEqual(value, AuthScreen.Login.INSTANCE)) {
                        AuthFragment.this.getAuthController().clearErrors();
                        AuthFragment.this.getAuthController().navigateTo(AuthScreen.SignInOptions.INSTANCE);
                        return true;
                    }
                    if (Intrinsics.areEqual(value, AuthScreen.SignUpOptions.INSTANCE)) {
                        AuthFragment.this.getAuthController().clearErrors();
                        AuthFragment.this.getAuthController().navigateTo(AuthScreen.Login.INSTANCE);
                        return true;
                    }
                    if (!Intrinsics.areEqual(value, AuthScreen.Registration.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AuthFragment.this.getAuthController().clearErrors();
                    AuthFragment.this.getAuthController().navigateTo(AuthScreen.SignUpOptions.INSTANCE);
                    return true;
                }
            });
        }
        getAuthController().setActivityForSocialLogin(requireActivity());
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        getAuthController().setActivityForSocialLogin(null);
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        BackPressedController backPressedController = this.backPressedController;
        if (backPressedController != null) {
            backPressedController.removeListener();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1881028299, true, new AuthFragment$onCreateView$1$1(this)));
        return composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startGoogleSignInWithCredentialManagerFirst() {
        if (!isGooglePlayServicesAvailable()) {
            reportAuthStage$default(this, "google", "availability_check", "play_services_missing", null, 8, null);
            AuthController authController = getAuthController();
            String string = requireContext().getString(R.string.update_play_services);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            authController.setGoogleSignInError(string);
            return;
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        if (GoogleSignInDeviceHelper.shouldUseLegacyGoogleSignIn(requireContext)) {
            Log.d(TAG, "Device in legacy list - using Legacy Google Sign-In first");
            reportAuthStage$default(this, "google", "path_selection", "legacy_first", null, 8, null);
            startGoogleSignIn();
        } else {
            reportAuthStage$default(this, "google", "path_selection", "credential_manager_first", null, 8, null);
            AuthController authController2 = getAuthController();
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            authController2.signInWithGoogleWithCredentialManager(requireActivity, new Function2() { // from class: org.betup.ui.fragment.login.AuthFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit startGoogleSignInWithCredentialManagerFirst$lambda$1;
                    startGoogleSignInWithCredentialManagerFirst$lambda$1 = AuthFragment.startGoogleSignInWithCredentialManagerFirst$lambda$1(AuthFragment.this, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
                    return startGoogleSignInWithCredentialManagerFirst$lambda$1;
                }
            }, new Function0() { // from class: org.betup.ui.fragment.login.AuthFragment$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit startGoogleSignInWithCredentialManagerFirst$lambda$2;
                    startGoogleSignInWithCredentialManagerFirst$lambda$2 = AuthFragment.startGoogleSignInWithCredentialManagerFirst$lambda$2(AuthFragment.this);
                    return startGoogleSignInWithCredentialManagerFirst$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startGoogleSignInWithCredentialManagerFirst$lambda$1(AuthFragment authFragment, boolean z, boolean z2) {
        if (!authFragment.isAdded()) {
            return Unit.INSTANCE;
        }
        if (z) {
            authFragment.makeLoginUpgrade();
        } else {
            authFragment.makeLogin(z2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startGoogleSignInWithCredentialManagerFirst$lambda$2(AuthFragment authFragment) {
        authFragment.startGoogleSignIn();
        return Unit.INSTANCE;
    }

    private final void startGoogleSignIn() {
        getAuthController().setGoogleLoading(true);
        Log.d(TAG, "=== startGoogleSignIn() called (legacy) ===");
        reportAuthStage$default(this, "google", "legacy_launch", TtmlNode.START, null, 8, null);
        getAuthController().runAfterClearingGoogleAccountForSignIn(new Function0() { // from class: org.betup.ui.fragment.login.AuthFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit startGoogleSignIn$lambda$3;
                startGoogleSignIn$lambda$3 = AuthFragment.startGoogleSignIn$lambda$3(AuthFragment.this);
                return startGoogleSignIn$lambda$3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startGoogleSignIn$lambda$3(AuthFragment authFragment) {
        if (!authFragment.isAdded()) {
            authFragment.getAuthController().setGoogleLoading(false);
            return Unit.INSTANCE;
        }
        GoogleApiClient mGoogleApiClient = authFragment.getAuthController().getMGoogleApiClient();
        Log.d(TAG, "GoogleApiClient: ".concat(mGoogleApiClient != null ? "exists" : AbstractJsonLexerKt.NULL));
        if (mGoogleApiClient != null) {
            Log.d(TAG, "GoogleApiClient.isConnected: " + mGoogleApiClient.isConnected());
            if (!mGoogleApiClient.isConnected()) {
                Log.d(TAG, "GoogleApiClient not connected, connecting...");
                mGoogleApiClient.connect();
            }
            try {
                Log.d(TAG, "Getting sign in intent from GoogleSignInApi...");
                Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(mGoogleApiClient);
                Intrinsics.checkNotNullExpressionValue(signInIntent, "getSignInIntent(...)");
                Log.d(TAG, "Sign in intent obtained, starting activity for result with RC_SIGN_IN=884");
                authFragment.startActivityForResult(signInIntent, RC_SIGN_IN);
            } catch (Exception e) {
                Log.e(TAG, "Error getting sign in intent", e);
                reportAuthFailure$default(authFragment, "google", "legacy_launch", e.getMessage(), null, 8, null);
                authFragment.getAuthController().setGoogleLoading(false);
            }
        } else {
            Log.e(TAG, "GoogleApiClient is null, cannot start Google sign in");
            reportAuthFailure$default(authFragment, "google", "legacy_launch", "google_api_client_null", null, 8, null);
            authFragment.getAuthController().setGoogleLoading(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startVKSignIn() {
        VksdkHelper.ensureInitialized(requireContext());
        getAuthController().signInWithVK(new Function0() { // from class: org.betup.ui.fragment.login.AuthFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit startVKSignIn$lambda$4;
                startVKSignIn$lambda$4 = AuthFragment.startVKSignIn$lambda$4(AuthFragment.this);
                return startVKSignIn$lambda$4;
            }
        });
        Intent intent = new Intent(requireActivity(), (Class<?>) VKServiceActivity.class);
        intent.putExtra("arg1", HttpHeaders.AUTHORIZATION);
        intent.putStringArrayListExtra("arg2", new ArrayList<>(Arrays.asList("offline", "wall", "photos", "email")));
        intent.putExtra("arg4", VKSdk.isCustomInitialize());
        startActivityForResult(intent, VKServiceActivity.VKServiceType.Authorization.getOuterCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startVKSignIn$lambda$4(AuthFragment authFragment) {
        makeLogin$default(authFragment, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void signInAnonymously() {
        if (getAuthController().isLoadingGuest().getValue().booleanValue() || this.isInProgress) {
            return;
        }
        getAuthController().setGuestLoading(true);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseAuth, "getInstance(...)");
        firebaseAuth.signInAnonymously().addOnCompleteListener(requireActivity(), new OnCompleteListener() { // from class: org.betup.ui.fragment.login.AuthFragment$$ExternalSyntheticLambda6
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                AuthFragment.signInAnonymously$lambda$5(AuthFragment.this, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void signInAnonymously$lambda$5(AuthFragment authFragment, Task task) {
        AdditionalUserInfo additionalUserInfo;
        Intrinsics.checkNotNullParameter(task, "task");
        if (!authFragment.isAdded()) {
            authFragment.getAuthController().endBackendAuth();
            return;
        }
        if (task.isSuccessful()) {
            Log.d(TAG, "Anonymous sign in successful");
            authFragment.getAnalyticsService().sendTrackEvent(TrackEventType.ANONYMOUS_LOGIN);
            FirebaseAnalyticsHelper.trackAnonymousLogin(authFragment.requireActivity());
            AuthResult authResult = (AuthResult) task.getResult();
            authFragment.makeLogin((authResult == null || (additionalUserInfo = authResult.getAdditionalUserInfo()) == null) ? false : additionalUserInfo.isNewUser());
            return;
        }
        authFragment.getAuthController().endBackendAuth();
        Log.e(TAG, "Anonymous sign in failed", task.getException());
        reportAuthFailure$default(authFragment, "anonymous", "firebase_sign_in", FirebaseErrorHandler.getMessageForError(authFragment.requireContext(), task), null, 8, null);
        SnackbarHelper.showShort(authFragment.requireContext(), FirebaseErrorHandler.getMessageForError(authFragment.requireContext(), task));
    }

    static /* synthetic */ void makeLogin$default(AuthFragment authFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        authFragment.makeLogin(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void makeLogin(final boolean isNewUser) {
        Task<GetTokenResult> idToken;
        if (this.isInProgress) {
            return;
        }
        this.isInProgress = true;
        getAuthController().beginBackendAuth();
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseAuth, "getInstance(...)");
        if (firebaseAuth.getCurrentUser() != null) {
            FirebaseUser currentUser = firebaseAuth.getCurrentUser();
            if (currentUser == null || (idToken = currentUser.getIdToken(true)) == null) {
                return;
            }
            idToken.addOnCompleteListener(new OnCompleteListener() { // from class: org.betup.ui.fragment.login.AuthFragment$$ExternalSyntheticLambda2
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    AuthFragment.makeLogin$lambda$7(AuthFragment.this, isNewUser, task);
                }
            });
            return;
        }
        this.isInProgress = false;
        getAuthController().endBackendAuth();
        LoginHandler loginHandler = this.loginHandler;
        if (loginHandler != null) {
            loginHandler.loginCompleted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void makeLogin$lambda$7(AuthFragment authFragment, boolean z, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("isNewUser", z);
            authFragment.getNewLoginInteractor().load(authFragment.newLoginListener, null, bundle);
        } else {
            authFragment.isInProgress = false;
            authFragment.getAuthController().endBackendAuth();
            Log.e(TAG, "Failed to get Firebase token", task.getException());
            Exception exception = task.getException();
            reportAuthFailure$default(authFragment, "backend", "token_refresh_login", exception != null ? exception.getMessage() : null, null, 8, null);
            authFragment.showFetchError(FetchStat.NO_AUTH, R.string.auth_failed);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void makeLoginUpgrade() {
        Task<GetTokenResult> idToken;
        if (this.isInProgress) {
            return;
        }
        this.isInProgress = true;
        getAuthController().beginBackendAuth();
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseAuth, "getInstance(...)");
        if (firebaseAuth.getCurrentUser() != null) {
            FirebaseUser currentUser = firebaseAuth.getCurrentUser();
            if (currentUser == null || (idToken = currentUser.getIdToken(true)) == null) {
                return;
            }
            idToken.addOnCompleteListener(new OnCompleteListener() { // from class: org.betup.ui.fragment.login.AuthFragment$$ExternalSyntheticLambda3
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    AuthFragment.makeLoginUpgrade$lambda$8(AuthFragment.this, task);
                }
            });
            return;
        }
        this.isInProgress = false;
        getAuthController().endBackendAuth();
        LoginHandler loginHandler = this.loginHandler;
        if (loginHandler != null) {
            loginHandler.loginCompleted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void makeLoginUpgrade$lambda$8(AuthFragment authFragment, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            authFragment.getUpgradeLoginInteractor().load(authFragment.upgradeLoginListener, null, new Bundle());
            return;
        }
        authFragment.isInProgress = false;
        authFragment.getAuthController().endBackendAuth();
        Log.e(TAG, "Failed to get Firebase token for upgrade", task.getException());
        Exception exception = task.getException();
        reportAuthFailure$default(authFragment, "backend", "token_refresh_upgrade", exception != null ? exception.getMessage() : null, null, 8, null);
        authFragment.showFetchError(FetchStat.NO_AUTH, R.string.auth_failed);
    }

    @Override // org.betup.services.user.UserService.UserInfoListener
    public void onProfileFetched(FullUserProfileModel fullUserProfileModel, Set<UserService.InfoKind> updated, FetchStat stat) {
        Intrinsics.checkNotNullParameter(fullUserProfileModel, "fullUserProfileModel");
        Intrinsics.checkNotNullParameter(updated, "updated");
        Intrinsics.checkNotNullParameter(stat, "stat");
        if (!isAdded()) {
            this.isInProgress = false;
            getAuthController().endBackendAuth();
            Log.d(TAG, "Fragment not added, skipping login completion");
            return;
        }
        if (stat != FetchStat.SUCCESS) {
            this.isInProgress = false;
            getAuthController().endBackendAuth();
            Log.e(TAG, "Profile fetch failed: " + stat);
            reportAuthFailure$default(this, "backend", "profile_fetch", stat.name(), null, 8, null);
            showFetchError(stat, R.string.error_loading_user_profile);
            return;
        }
        LoginHandler loginHandler = null;
        AnalyticsHelper.logSignIn$default(AnalyticsHelper.INSTANCE, null, 1, null);
        Log.d(TAG, "Profile fetched successfully, calling loginCompleted");
        this.isInProgress = false;
        LoginHandler loginHandler2 = this.loginHandler;
        if (loginHandler2 == null) {
            KeyEventDispatcher.Component activity = getActivity();
            if (activity instanceof LoginHandler) {
                loginHandler = (LoginHandler) activity;
            }
        } else {
            loginHandler = loginHandler2;
        }
        if (loginHandler != null) {
            loginHandler.loginCompleted();
            return;
        }
        Log.e(TAG, "LoginHandler missing, cannot navigate to home");
        getAuthController().endBackendAuth();
        showFetchError(FetchStat.INVALID, R.string.auth_failed);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0287, code lost:
    
        if (r1 == null) goto L54;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        Log.d(TAG, "=== onActivityResult called ===");
        Log.d(TAG, "requestCode: " + requestCode + " (RC_SIGN_IN=884)");
        Log.d(TAG, "resultCode: " + resultCode + " (RESULT_OK=-1, RESULT_CANCELED=0)");
        Log.d(TAG, "data: ".concat(data == null ? AbstractJsonLexerKt.NULL : "not null"));
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == VksdkHelper.getAuthorizationRequestCode()) {
            VksdkHelper.ensureInitialized(requireContext());
            if (VKSdk.onActivityResult(requestCode, resultCode, data, new VKCallback<VKAccessToken>() { // from class: org.betup.ui.fragment.login.AuthFragment$onActivityResult$1
                @Override // com.vk.sdk.VKCallback
                public void onResult(VKAccessToken res) {
                    Intrinsics.checkNotNullParameter(res, "res");
                    Log.d("AuthFragment", "VK login success");
                    AuthFragment.this.firebaseAuthWithVk(res);
                }

                @Override // com.vk.sdk.VKCallback
                public void onError(VKError error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    Log.e("AuthFragment", "VK login error: " + error.errorMessage);
                    AuthFragment.reportAuthFailure$default(AuthFragment.this, "vk", "sdk_callback", error.errorMessage, null, 8, null);
                    AuthFragment.this.getAuthController().setVKLoading(false);
                    AuthFragment.this.getAuthController().clearErrors();
                }
            })) {
                Log.d(TAG, "VK SDK handled the result, returning");
                return;
            }
        }
        if (requestCode == RC_SIGN_IN) {
            Log.d(TAG, "=== Handling Google Sign In result ===");
            Log.d(TAG, "resultCode == RESULT_OK: " + (resultCode == -1));
            Log.d(TAG, "resultCode value: " + resultCode + " (RESULT_OK=-1, RESULT_CANCELED=0)");
            Log.d(TAG, "data != null: " + (data != null));
            if (data != null) {
                Log.d(TAG, "Getting GoogleSignInResult from intent...");
                try {
                    GoogleSignInResult signInResultFromIntent = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
                    Log.d(TAG, "GoogleSignInResult: ".concat(signInResultFromIntent != null ? "not null" : AbstractJsonLexerKt.NULL));
                    if (signInResultFromIntent != null) {
                        Log.d(TAG, "GoogleSignInResult.isSuccess: " + signInResultFromIntent.isSuccess());
                        Log.d(TAG, "GoogleSignInResult.status: " + signInResultFromIntent.getStatus());
                        if (signInResultFromIntent.isSuccess()) {
                            Log.d(TAG, "GoogleSignInResult is successful, processing...");
                            AuthController authController = getAuthController();
                            FragmentActivity requireActivity = requireActivity();
                            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                            authController.handleGoogleSignInResult(requireActivity, signInResultFromIntent, new Function2() { // from class: org.betup.ui.fragment.login.AuthFragment$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit onActivityResult$lambda$11;
                                    onActivityResult$lambda$11 = AuthFragment.onActivityResult$lambda$11(AuthFragment.this, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
                                    return onActivityResult$lambda$11;
                                }
                            });
                        } else {
                            Status status = signInResultFromIntent.getStatus();
                            Intrinsics.checkNotNullExpressionValue(status, "getStatus(...)");
                            Log.e(TAG, "GoogleSignInResult error: " + status.getStatusMessage());
                            Log.e(TAG, "GoogleSignInResult status code: " + Integer.valueOf(status.getStatusCode()));
                            reportAuthFailure("google", "legacy_result", status.getStatusMessage(), Integer.valueOf(status.getStatusCode()));
                            if (status.getStatusCode() == 10) {
                                Log.e(TAG, "=== DEVELOPER_ERROR detected (Status Code: 10) ===");
                                Log.e(TAG, "This usually means configuration issue:");
                                Log.e(TAG, "1. SHA-1 fingerprint not configured in Firebase Console");
                                Log.e(TAG, "   For DEBUG builds, you need to add your debug keystore SHA-1");
                                Log.e(TAG, "   Get it with: keytool -list -v -keystore ~/.android/debug.keystore -alias androiddebugkey -storepass android -keypass android");
                                Log.e(TAG, "2. Package name mismatch between app and Firebase project");
                                Log.e(TAG, "3. Web client ID incorrect in strings.xml (default_web_client_id)");
                                Log.e(TAG, "4. OAuth 2.0 client ID not properly configured in Google Cloud Console");
                                Log.e(TAG, "");
                                Log.e(TAG, "SOLUTION: Add your debug SHA-1 fingerprint to Firebase Console:");
                                Log.e(TAG, "1. Go to Firebase Console > Project Settings > Your Android App");
                                Log.e(TAG, "2. Click 'Add fingerprint'");
                                Log.e(TAG, "3. Add your debug keystore SHA-1 (check logcat for exact value)");
                                Log.e(TAG, "4. Download the new google-services.json file and replace the current one");
                                Log.e(TAG, "");
                                try {
                                    String string = requireContext().getString(R.string.default_web_client_id);
                                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                    Log.e(TAG, "Current web client ID length: " + string.length());
                                    Log.e(TAG, "Web client ID starts with: " + StringsKt.take(string, 20) + "...");
                                } catch (Exception e) {
                                    Log.e(TAG, "Error getting web client ID: " + e.getMessage());
                                }
                            }
                            if (status.getStatusCode() == 10) {
                                Context requireContext = requireContext();
                                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                                if (GoogleSignInDeviceHelper.shouldUseLegacyGoogleSignIn(requireContext)) {
                                    FirebaseAuth.getInstance().signOut();
                                    AuthController authController2 = getAuthController();
                                    String string2 = requireContext().getString(R.string.google_sign_in_config_error);
                                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                    authController2.setGoogleSignInError(string2);
                                } else {
                                    AuthController authController3 = getAuthController();
                                    FragmentActivity requireActivity2 = requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                                    authController3.tryCredentialManagerAsFallback(requireActivity2, new Function2() { // from class: org.betup.ui.fragment.login.AuthFragment$$ExternalSyntheticLambda7
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit onActivityResult$lambda$9;
                                            onActivityResult$lambda$9 = AuthFragment.onActivityResult$lambda$9(AuthFragment.this, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
                                            return onActivityResult$lambda$9;
                                        }
                                    });
                                }
                            } else {
                                FirebaseAuth.getInstance().signOut();
                                getAuthController().setGoogleLoading(false);
                                AuthController authController4 = getAuthController();
                                String statusMessage = status.getStatusMessage();
                                if (statusMessage != null) {
                                    if (StringsKt.isBlank(statusMessage)) {
                                        statusMessage = null;
                                    }
                                }
                                statusMessage = requireContext().getString(R.string.auth_failed);
                                Intrinsics.checkNotNullExpressionValue(statusMessage, "getString(...)");
                                authController4.setGoogleSignInError(statusMessage);
                            }
                        }
                    } else {
                        Log.e(TAG, "GoogleSignInResult is null - sign-in cancelled or failed");
                        reportAuthFailure$default(this, "google", "legacy_result", "null_google_sign_in_result", null, 8, null);
                        getAuthController().setGoogleLoading(false);
                        AuthController authController5 = getAuthController();
                        String string3 = requireContext().getString(R.string.auth_failed);
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        authController5.setGoogleSignInError(string3);
                    }
                } catch (Exception e2) {
                    Log.e(TAG, "Error getting GoogleSignInResult from intent", e2);
                    reportAuthFailure$default(this, "google", "legacy_result_parse", e2.getMessage(), null, 8, null);
                    getAuthController().setGoogleLoading(false);
                    AuthController authController6 = getAuthController();
                    String message = e2.getMessage();
                    if (message == null) {
                        message = requireContext().getString(R.string.unknown_error);
                        Intrinsics.checkNotNullExpressionValue(message, "getString(...)");
                    }
                    authController6.setGoogleSignInError(message);
                }
            } else {
                Log.e(TAG, "Data is null - Google sign-in cancelled or failed");
                Log.e(TAG, "resultCode: " + resultCode);
                reportAuthFailure("google", "legacy_result_data", "missing_intent_data", Integer.valueOf(resultCode));
                getAuthController().setGoogleLoading(false);
                AuthController authController7 = getAuthController();
                String string4 = requireContext().getString(R.string.auth_failed);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                authController7.setGoogleSignInError(string4);
            }
        } else {
            Log.d(TAG, "Handling other request code: " + requestCode);
            getAuthController().setActivityForSocialLogin(requireActivity());
            if (data != null) {
                Log.d(TAG, "Forwarding to Facebook callback manager");
                CallbackManager callbackManager = getAuthController().getCallbackManager();
                if (callbackManager != null) {
                    callbackManager.onActivityResult(requestCode, resultCode, data);
                }
            } else if (resultCode != -1) {
                Log.e(TAG, "Facebook login cancelled - resultCode: " + resultCode);
                getAuthController().setFacebookLoading(false);
            }
        }
        Log.d(TAG, "=== onActivityResult finished ===");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onActivityResult$lambda$9(AuthFragment authFragment, boolean z, boolean z2) {
        if (!authFragment.isAdded()) {
            return Unit.INSTANCE;
        }
        if (z) {
            authFragment.makeLoginUpgrade();
        } else {
            authFragment.makeLogin(z2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onActivityResult$lambda$11(AuthFragment authFragment, boolean z, boolean z2) {
        if (!authFragment.isAdded()) {
            return Unit.INSTANCE;
        }
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseAuth, "getInstance(...)");
        if (firebaseAuth.getCurrentUser() == null) {
            Log.e(TAG, "Firebase currentUser is null after Google sign in success!");
        } else if (z) {
            authFragment.makeLoginUpgrade();
        } else {
            authFragment.makeLogin(z2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void firebaseAuthWithVk(VKAccessToken token) {
        Log.d(TAG, "VK TOKEN = " + token.accessToken + "  EXP = " + token.expiresIn + " ID = " + token.userId + " " + token.secret);
        Bundle bundle = new Bundle();
        bundle.putString("email", token.email);
        bundle.putString("type", "vk");
        getV7GetCustomTokenInteractor().load(this.firebaseTokenGotListener, token.accessToken, bundle);
        Log.d(TAG, "VK SENT");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void proceedAfterSocialLogin(AuthResult result) {
        AdditionalUserInfo additionalUserInfo = result.getAdditionalUserInfo();
        boolean isNewUser = additionalUserInfo != null ? additionalUserInfo.isNewUser() : false;
        if (isNewUser) {
            FirebaseAnalyticsHelper.trackSignup(requireActivity());
        }
        makeLogin(isNewUser);
    }

    public final void setLoginHandler(LoginHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.loginHandler = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openPrivacyPolicy() {
        String privacyPolicyUrl = ApiConfigResolver.getApiConfig().getPrivacyPolicyUrl();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Intrinsics.checkNotNull(privacyPolicyUrl);
        ExternalBrowserOpener.open(requireContext, privacyPolicyUrl);
    }

    private final boolean isGooglePlayServicesAvailable() {
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(requireContext()) == 0;
    }

    static /* synthetic */ void reportAuthFailure$default(AuthFragment authFragment, String str, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 8) != 0) {
            num = null;
        }
        authFragment.reportAuthFailure(str, str2, str3, num);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        if (r5 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void reportAuthFailure(String provider, String stage, String reason, Integer statusCode) {
        if (reason != null) {
            if (StringsKt.isBlank(reason)) {
                reason = null;
            }
        }
        reason = getString(R.string.unknown_error);
        Intrinsics.checkNotNullExpressionValue(reason, "getString(...)");
        Log.e(TAG, "Auth failure provider=" + provider + " stage=" + stage + " statusCode=" + statusCode + " reason=" + reason);
        if (getContext() != null) {
            FirebaseAnalyticsHelper.logAuthFailure(requireContext(), provider, stage, reason, statusCode);
        }
    }

    static /* synthetic */ void reportAuthStage$default(AuthFragment authFragment, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 8) != 0) {
            str4 = null;
        }
        authFragment.reportAuthStage(str, str2, str3, str4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        if (r6 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void reportAuthStage(String provider, String stage, String outcome, String detail) {
        if (detail != null) {
            if (StringsKt.isBlank(detail)) {
                detail = null;
            }
        }
        detail = "n/a";
        Log.d(TAG, "Auth stage provider=" + provider + " stage=" + stage + " outcome=" + outcome + " detail=" + detail);
        if (getContext() != null) {
            FirebaseAnalyticsHelper.logAuthStage(requireContext(), provider, stage, outcome, detail);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFetchError(FetchStat stat, int fallbackMessageRes) {
        if (isAdded()) {
            getAuthController().endBackendAuth();
            switch (stat == null ? -1 : WhenMappings.$EnumSwitchMapping$0[stat.ordinal()]) {
                case 1:
                    fallbackMessageRes = R.string.conection_internet_failed;
                    break;
                case 2:
                case 3:
                case 4:
                    fallbackMessageRes = R.string.invalid_server_response;
                    break;
                case 5:
                case 6:
                    fallbackMessageRes = R.string.auth_failed;
                    break;
            }
            SnackbarHelper.showShort(requireContext(), fallbackMessageRes);
        }
    }
}
