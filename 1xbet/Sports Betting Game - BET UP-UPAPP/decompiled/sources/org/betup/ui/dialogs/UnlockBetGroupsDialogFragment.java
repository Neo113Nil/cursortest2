package org.betup.ui.dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tiktok.appevents.contents.TTContentsEventConstants;
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.BetUpApp;
import org.betup.model.remote.entity.shop.ShopItemModel;
import org.betup.services.billing.PurchaseConfirmationListener;
import org.betup.services.user.UserService;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: UnlockBetGroupsDialogFragment.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 &2\u00020\u0001:\u0002%&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0016J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u001dH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lorg/betup/ui/dialogs/UnlockBetGroupsDialogFragment;", "Landroidx/fragment/app/DialogFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "unlockShopItemModel", "Lorg/betup/model/remote/entity/shop/ShopItemModel;", "videoAvailable", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lorg/betup/services/billing/PurchaseConfirmationListener;", "userDecision", "Lorg/betup/ui/dialogs/UnlockBetGroupsDialogFragment$UserDecision;", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onCancel", "dialog", "Landroid/content/DialogInterface;", "onDismiss", "onSaveInstanceState", "outState", "UserDecision", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UnlockBetGroupsDialogFragment extends DialogFragment {
    private static final String TAG = "UnlockBetGroupsDialog";
    private PurchaseConfirmationListener listener;
    private ShopItemModel unlockShopItemModel;
    private UserDecision userDecision = UserDecision.Cancel;

    @Inject
    public UserService userService;
    private boolean videoAvailable;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final UnlockBetGroupsDialogFragment showDialog(Activity activity, ShopItemModel shopItemModel, boolean z, PurchaseConfirmationListener purchaseConfirmationListener) {
        return INSTANCE.showDialog(activity, shopItemModel, z, purchaseConfirmationListener);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UnlockBetGroupsDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lorg/betup/ui/dialogs/UnlockBetGroupsDialogFragment$UserDecision;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", TTContentsEventConstants.ContentsEventName.EVENT_NAME_PURCHASE, VastTagName.VIDEO, "Cancel", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class UserDecision {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ UserDecision[] $VALUES;
        public static final UserDecision Purchase = new UserDecision(TTContentsEventConstants.ContentsEventName.EVENT_NAME_PURCHASE, 0);
        public static final UserDecision Video = new UserDecision(VastTagName.VIDEO, 1);
        public static final UserDecision Cancel = new UserDecision("Cancel", 2);

        private static final /* synthetic */ UserDecision[] $values() {
            return new UserDecision[]{Purchase, Video, Cancel};
        }

        public static EnumEntries<UserDecision> getEntries() {
            return $ENTRIES;
        }

        private UserDecision(String str, int i) {
        }

        static {
            UserDecision[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static UserDecision valueOf(String str) {
            return (UserDecision) Enum.valueOf(UserDecision.class, str);
        }

        public static UserDecision[] values() {
            return (UserDecision[]) $VALUES.clone();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int i;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        try {
            i = getUserService().getShortProfile().getUserProgressModel().getLevel();
        } catch (Exception unused) {
            i = 1;
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(120376421, true, new UnlockBetGroupsDialogFragment$onCreateView$1$1(this, i)));
        return composeView;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -2);
        window.setBackgroundDrawable(null);
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.setDimAmount(0.6f);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.userDecision = UserDecision.Cancel;
        super.onCancel(dialog);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        if (this.userDecision == UserDecision.Cancel) {
            try {
                PurchaseConfirmationListener purchaseConfirmationListener = this.listener;
                if (purchaseConfirmationListener != null) {
                    purchaseConfirmationListener.onPurchaseCanceledByUser();
                }
            } catch (Exception e) {
                Log.e(TAG, "Failed to handle dismiss callback", e);
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
    }

    /* compiled from: UnlockBetGroupsDialogFragment.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lorg/betup/ui/dialogs/UnlockBetGroupsDialogFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "showDialog", "Lorg/betup/ui/dialogs/UnlockBetGroupsDialogFragment;", "activity", "Landroid/app/Activity;", "unlockShopItemModel", "Lorg/betup/model/remote/entity/shop/ShopItemModel;", "videoAvailable", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lorg/betup/services/billing/PurchaseConfirmationListener;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final UnlockBetGroupsDialogFragment showDialog(Activity activity, ShopItemModel unlockShopItemModel, boolean videoAvailable, PurchaseConfirmationListener listener) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(unlockShopItemModel, "unlockShopItemModel");
            Intrinsics.checkNotNullParameter(listener, "listener");
            UnlockBetGroupsDialogFragment unlockBetGroupsDialogFragment = new UnlockBetGroupsDialogFragment();
            unlockBetGroupsDialogFragment.unlockShopItemModel = unlockShopItemModel;
            unlockBetGroupsDialogFragment.videoAvailable = videoAvailable;
            unlockBetGroupsDialogFragment.listener = listener;
            try {
            } catch (Exception e) {
                Log.e(UnlockBetGroupsDialogFragment.TAG, "Failed to show dialog", e);
            }
            if (activity instanceof FragmentActivity) {
                FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
                Intrinsics.checkNotNull(supportFragmentManager);
                Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(UnlockBetGroupsDialogFragment.TAG);
                UnlockBetGroupsDialogFragment unlockBetGroupsDialogFragment2 = findFragmentByTag instanceof UnlockBetGroupsDialogFragment ? (UnlockBetGroupsDialogFragment) findFragmentByTag : null;
                if (unlockBetGroupsDialogFragment2 != null && unlockBetGroupsDialogFragment2.isAdded()) {
                    return unlockBetGroupsDialogFragment2;
                }
                unlockBetGroupsDialogFragment.show(supportFragmentManager, UnlockBetGroupsDialogFragment.TAG);
                return unlockBetGroupsDialogFragment;
            }
            Log.e(UnlockBetGroupsDialogFragment.TAG, "Activity is not a FragmentActivity");
            return unlockBetGroupsDialogFragment;
        }
    }
}
