package org.betup.ui.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.BetUpApp;
import org.betup.model.remote.api.rest.user.UnlockOneClickBetInteractor;
import org.betup.model.remote.api.rest.user.V7OneClickBetSettingsInteractor;
import org.betup.services.storage.LocalPreferencesService;
import org.betup.services.user.UserService;
import org.betup.ui.base.SnackbarDialogFragment;
import org.betup.ui.fragment.bets.BetsController;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: OneClickBetSettingsDialogFragment.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\b\u0007\u0018\u0000 52\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J$\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u00104\u001a\u00020*H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0016\u0010(\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066²\u0006\f\u00107\u001a\u0004\u0018\u000108X\u008a\u008e\u0002²\u0006\n\u00109\u001a\u00020:X\u008a\u008e\u0002²\u0006\n\u0010;\u001a\u00020:X\u008a\u008e\u0002²\u0006\n\u0010<\u001a\u00020:X\u008a\u008e\u0002²\u0006\n\u0010=\u001a\u00020:X\u008a\u008e\u0002²\u0006\n\u0010>\u001a\u00020?X\u008a\u008e\u0002"}, d2 = {"Lorg/betup/ui/dialogs/OneClickBetSettingsDialogFragment;", "Lorg/betup/ui/base/SnackbarDialogFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "localPreferencesService", "Lorg/betup/services/storage/LocalPreferencesService;", "getLocalPreferencesService", "()Lorg/betup/services/storage/LocalPreferencesService;", "setLocalPreferencesService", "(Lorg/betup/services/storage/LocalPreferencesService;)V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "firebaseRemoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "getFirebaseRemoteConfig", "()Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "setFirebaseRemoteConfig", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;)V", "unlockOneClickBetInteractor", "Lorg/betup/model/remote/api/rest/user/UnlockOneClickBetInteractor;", "getUnlockOneClickBetInteractor", "()Lorg/betup/model/remote/api/rest/user/UnlockOneClickBetInteractor;", "setUnlockOneClickBetInteractor", "(Lorg/betup/model/remote/api/rest/user/UnlockOneClickBetInteractor;)V", "v7OneClickBetSettingsInteractor", "Lorg/betup/model/remote/api/rest/user/V7OneClickBetSettingsInteractor;", "getV7OneClickBetSettingsInteractor", "()Lorg/betup/model/remote/api/rest/user/V7OneClickBetSettingsInteractor;", "setV7OneClickBetSettingsInteractor", "(Lorg/betup/model/remote/api/rest/user/V7OneClickBetSettingsInteractor;)V", "betsController", "Lorg/betup/ui/fragment/bets/BetsController;", "getBetsController", "()Lorg/betup/ui/fragment/bets/BetsController;", "setBetsController", "(Lorg/betup/ui/fragment/bets/BetsController;)V", "onSavedListener", "Lkotlin/Function0;", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", VastTagName.COMPANION, "app_release", "serverSettings", "Lorg/betup/model/remote/entity/user/OneClickBetSettingsModel;", "settingsLoaded", "", "unlocked", "unlocking", "enabled", "amount", ""}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OneClickBetSettingsDialogFragment extends SnackbarDialogFragment {

    @Inject
    public BetsController betsController;

    @Inject
    public FirebaseRemoteConfig firebaseRemoteConfig;

    @Inject
    public LocalPreferencesService localPreferencesService;
    private Function0<Unit> onSavedListener;

    @Inject
    public UnlockOneClickBetInteractor unlockOneClickBetInteractor;

    @Inject
    public UserService userService;

    @Inject
    public V7OneClickBetSettingsInteractor v7OneClickBetSettingsInteractor;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final LocalPreferencesService getLocalPreferencesService() {
        LocalPreferencesService localPreferencesService = this.localPreferencesService;
        if (localPreferencesService != null) {
            return localPreferencesService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("localPreferencesService");
        return null;
    }

    public final void setLocalPreferencesService(LocalPreferencesService localPreferencesService) {
        Intrinsics.checkNotNullParameter(localPreferencesService, "<set-?>");
        this.localPreferencesService = localPreferencesService;
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

    public final FirebaseRemoteConfig getFirebaseRemoteConfig() {
        FirebaseRemoteConfig firebaseRemoteConfig = this.firebaseRemoteConfig;
        if (firebaseRemoteConfig != null) {
            return firebaseRemoteConfig;
        }
        Intrinsics.throwUninitializedPropertyAccessException("firebaseRemoteConfig");
        return null;
    }

    public final void setFirebaseRemoteConfig(FirebaseRemoteConfig firebaseRemoteConfig) {
        Intrinsics.checkNotNullParameter(firebaseRemoteConfig, "<set-?>");
        this.firebaseRemoteConfig = firebaseRemoteConfig;
    }

    public final UnlockOneClickBetInteractor getUnlockOneClickBetInteractor() {
        UnlockOneClickBetInteractor unlockOneClickBetInteractor = this.unlockOneClickBetInteractor;
        if (unlockOneClickBetInteractor != null) {
            return unlockOneClickBetInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("unlockOneClickBetInteractor");
        return null;
    }

    public final void setUnlockOneClickBetInteractor(UnlockOneClickBetInteractor unlockOneClickBetInteractor) {
        Intrinsics.checkNotNullParameter(unlockOneClickBetInteractor, "<set-?>");
        this.unlockOneClickBetInteractor = unlockOneClickBetInteractor;
    }

    public final V7OneClickBetSettingsInteractor getV7OneClickBetSettingsInteractor() {
        V7OneClickBetSettingsInteractor v7OneClickBetSettingsInteractor = this.v7OneClickBetSettingsInteractor;
        if (v7OneClickBetSettingsInteractor != null) {
            return v7OneClickBetSettingsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("v7OneClickBetSettingsInteractor");
        return null;
    }

    public final void setV7OneClickBetSettingsInteractor(V7OneClickBetSettingsInteractor v7OneClickBetSettingsInteractor) {
        Intrinsics.checkNotNullParameter(v7OneClickBetSettingsInteractor, "<set-?>");
        this.v7OneClickBetSettingsInteractor = v7OneClickBetSettingsInteractor;
    }

    public final BetsController getBetsController() {
        BetsController betsController = this.betsController;
        if (betsController != null) {
            return betsController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("betsController");
        return null;
    }

    public final void setBetsController(BetsController betsController) {
        Intrinsics.checkNotNullParameter(betsController, "<set-?>");
        this.betsController = betsController;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Function1 function1 = new Function1() { // from class: org.betup.ui.dialogs.OneClickBetSettingsDialogFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Function2 onCreateView$lambda$1;
                onCreateView$lambda$1 = OneClickBetSettingsDialogFragment.onCreateView$lambda$1(OneClickBetSettingsDialogFragment.this, (Context) obj);
                return onCreateView$lambda$1;
            }
        };
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1433939715, true, new OneClickBetSettingsDialogFragment$onCreateView$1$1(this, function1, requireContext, composeView)));
        return composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2 onCreateView$lambda$1(final OneClickBetSettingsDialogFragment oneClickBetSettingsDialogFragment, Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        return new Function2() { // from class: org.betup.ui.dialogs.OneClickBetSettingsDialogFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit onCreateView$lambda$1$lambda$0;
                onCreateView$lambda$1$lambda$0 = OneClickBetSettingsDialogFragment.onCreateView$lambda$1$lambda$0(OneClickBetSettingsDialogFragment.this, (CharSequence) obj, ((Long) obj2).longValue());
                return onCreateView$lambda$1$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreateView$lambda$1$lambda$0(OneClickBetSettingsDialogFragment oneClickBetSettingsDialogFragment, CharSequence msg, long j) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (oneClickBetSettingsDialogFragment.isAdded()) {
            oneClickBetSettingsDialogFragment.showSnackbar(msg, Long.valueOf(j));
        }
        return Unit.INSTANCE;
    }

    @Override // org.betup.ui.base.SnackbarDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(null);
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.setDimAmount(0.6f);
    }

    /* compiled from: OneClickBetSettingsDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\t"}, d2 = {"Lorg/betup/ui/dialogs/OneClickBetSettingsDialogFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/dialogs/OneClickBetSettingsDialogFragment;", "onSaved", "Lkotlin/Function0;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OneClickBetSettingsDialogFragment newInstance(Function0<Unit> onSaved) {
            Intrinsics.checkNotNullParameter(onSaved, "onSaved");
            OneClickBetSettingsDialogFragment oneClickBetSettingsDialogFragment = new OneClickBetSettingsDialogFragment();
            oneClickBetSettingsDialogFragment.onSavedListener = onSaved;
            return oneClickBetSettingsDialogFragment;
        }
    }
}
