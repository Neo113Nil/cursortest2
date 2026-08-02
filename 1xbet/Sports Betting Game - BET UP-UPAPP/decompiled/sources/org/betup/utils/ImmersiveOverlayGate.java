package org.betup.utils;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.dialogs.interstitial.InterstitialVideoDialogFragment;
import org.betup.ui.dialogs.interstitial.InterstitialWebViewDialogFragment;
import org.betup.ui.dialogs.presentation.PresentationWebViewDialogFragment;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ImmersiveOverlayGate.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0007J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0010H\u0007J\b\u0010\u0011\u001a\u00020\fH\u0007J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\bH\u0007J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0016\u0010\u0017\u001a\u00020\f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lorg/betup/utils/ImmersiveOverlayGate;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "Ljava/util/concurrent/atomic/AtomicBoolean;", "immersiveTags", "", "", "isActive", "", "onImmersiveShown", "", "host", "Landroidx/fragment/app/FragmentActivity;", "onDialogsDismissed", "Lkotlin/Function0;", "onImmersiveDismissed", "shouldBlockDialog", "tag", "dismissExistingDialogs", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "dismissRecursive", "fragments", "", "Landroidx/fragment/app/Fragment;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImmersiveOverlayGate {
    public static final ImmersiveOverlayGate INSTANCE = new ImmersiveOverlayGate();
    private static final AtomicBoolean active = new AtomicBoolean(false);
    private static final Set<String> immersiveTags = SetsKt.setOf((Object[]) new String[]{PresentationWebViewDialogFragment.TAG, InterstitialWebViewDialogFragment.TAG, InterstitialVideoDialogFragment.TAG});
    public static final int $stable = 8;

    @JvmStatic
    public static final void onImmersiveShown(FragmentActivity host) {
        Intrinsics.checkNotNullParameter(host, "host");
        onImmersiveShown$default(host, null, 2, null);
    }

    private ImmersiveOverlayGate() {
    }

    @JvmStatic
    public static final boolean isActive() {
        return active.get();
    }

    public static /* synthetic */ void onImmersiveShown$default(FragmentActivity fragmentActivity, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        onImmersiveShown(fragmentActivity, function0);
    }

    @JvmStatic
    public static final void onImmersiveShown(final FragmentActivity host, final Function0<Unit> onDialogsDismissed) {
        Intrinsics.checkNotNullParameter(host, "host");
        active.set(true);
        FragmentSafeOps.INSTANCE.runAfterFragmentTransactions(host, new Function0() { // from class: org.betup.utils.ImmersiveOverlayGate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onImmersiveShown$lambda$0;
                onImmersiveShown$lambda$0 = ImmersiveOverlayGate.onImmersiveShown$lambda$0(FragmentActivity.this, onDialogsDismissed);
                return onImmersiveShown$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onImmersiveShown$lambda$0(FragmentActivity fragmentActivity, Function0 function0) {
        ImmersiveOverlayGate immersiveOverlayGate = INSTANCE;
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        immersiveOverlayGate.dismissExistingDialogs(supportFragmentManager);
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    @JvmStatic
    public static final void onImmersiveDismissed() {
        active.set(false);
        DeferredOverlayQueue.onImmersiveSessionEnded();
    }

    @JvmStatic
    public static final boolean shouldBlockDialog(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (isActive()) {
            return !immersiveTags.contains(tag);
        }
        return false;
    }

    private final void dismissExistingDialogs(FragmentManager fragmentManager) {
        if (fragmentManager.isDestroyed()) {
            return;
        }
        List<Fragment> fragments = fragmentManager.getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        dismissRecursive(fragments);
        FragmentSafeOps.INSTANCE.executePendingTransactionsSafely(fragmentManager);
        DialogManager.reconcileTrackedDialogsWith(fragmentManager);
    }

    private final void dismissRecursive(List<? extends Fragment> fragments) {
        Object m10853constructorimpl;
        for (Fragment fragment : fragments) {
            if (fragment.isAdded()) {
                if (fragment instanceof DialogFragment) {
                    DialogFragment dialogFragment = (DialogFragment) fragment;
                    if (!CollectionsKt.contains(immersiveTags, dialogFragment.getTag()) && dialogFragment.isAdded()) {
                        FragmentDialogSafeOps.INSTANCE.dismissAllowingStateLoss(dialogFragment);
                        String tag = dialogFragment.getTag();
                        if (tag != null) {
                            DialogManager.onDialogDismissed(tag);
                        }
                    }
                }
                try {
                    Result.Companion companion = Result.INSTANCE;
                    ImmersiveOverlayGate immersiveOverlayGate = this;
                    m10853constructorimpl = Result.m10853constructorimpl(fragment.getChildFragmentManager().getFragments());
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m10859isFailureimpl(m10853constructorimpl)) {
                    m10853constructorimpl = null;
                }
                List<? extends Fragment> list = (List) m10853constructorimpl;
                if (list != null) {
                    dismissRecursive(list);
                }
            }
        }
    }
}
