package org.betup.utils;

import android.app.Dialog;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.betup.bus.NavigateMessage;
import org.betup.ui.MainActivity;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: OfferNavigationGate.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0016\u0010\u0017\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\u001c\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\rH\u0007J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010#\u001a\u00020\u001cH\u0002J\b\u0010$\u001a\u00020\u001cH\u0007J\b\u0010%\u001a\u00020\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lorg/betup/utils/OfferNavigationGate;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "SETTLE_AFTER_CLEAR_MS", "", "POLL_MS", "handler", "Landroid/os/Handler;", "queue", "Ljava/util/ArrayDeque;", "Lorg/betup/bus/NavigateMessage;", "Lorg/betup/bus/NavigateMessage$Target;", "poller", "Ljava/lang/Runnable;", "settle", "pendingSettleDelay", "", "shouldDeferOfferNavigation", "host", "Landroidx/fragment/app/FragmentActivity;", "hasShowingDialogRecursive", "fragments", "", "Landroidx/fragment/app/Fragment;", "enqueueOrDispatch", "", "activity", "Lorg/betup/ui/MainActivity;", "message", "process", "dispatchHeadAndContinue", "startPollerIfNeeded", "cancelSettleOnly", "cancelPending", "clearAll", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OfferNavigationGate {
    private static final long POLL_MS = 300;
    public static final long SETTLE_AFTER_CLEAR_MS = 750;
    private static final String TAG = "OfferNavigationGate";
    private static boolean pendingSettleDelay;
    private static Runnable poller;
    private static Runnable settle;
    public static final OfferNavigationGate INSTANCE = new OfferNavigationGate();
    private static final Handler handler = new Handler(Looper.getMainLooper());
    private static final ArrayDeque<NavigateMessage<NavigateMessage.Target>> queue = new ArrayDeque<>();
    public static final int $stable = 8;

    private OfferNavigationGate() {
    }

    @JvmStatic
    public static final boolean shouldDeferOfferNavigation(FragmentActivity host) {
        Intrinsics.checkNotNullParameter(host, "host");
        if (PresentationOverlayGate.isActive() || FlashBetImmersiveSessionGuard.isActive()) {
            return true;
        }
        FragmentManager supportFragmentManager = host.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        DialogManager.reconcileTrackedDialogsWith(supportFragmentManager);
        boolean hasTrackedDialogShowing = DialogManager.hasTrackedDialogShowing();
        OfferNavigationGate offerNavigationGate = INSTANCE;
        List<Fragment> fragments = host.getSupportFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        boolean hasShowingDialogRecursive = offerNavigationGate.hasShowingDialogRecursive(fragments);
        if (!hasTrackedDialogShowing && !hasShowingDialogRecursive) {
            return false;
        }
        Log.d(TAG, "defer OFFERS: trackedDialogManager=" + hasTrackedDialogShowing + " recursiveDialogFragments=" + hasShowingDialogRecursive);
        return true;
    }

    private final boolean hasShowingDialogRecursive(List<? extends Fragment> fragments) {
        Object m10853constructorimpl;
        Dialog dialog;
        for (Fragment fragment : fragments) {
            if (fragment.isAdded()) {
                if ((fragment instanceof DialogFragment) && (dialog = ((DialogFragment) fragment).getDialog()) != null && dialog.isShowing()) {
                    return true;
                }
                try {
                    Result.Companion companion = Result.INSTANCE;
                    OfferNavigationGate offerNavigationGate = this;
                    m10853constructorimpl = Result.m10853constructorimpl(fragment.getChildFragmentManager().getFragments());
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m10859isFailureimpl(m10853constructorimpl)) {
                    m10853constructorimpl = null;
                }
                List<? extends Fragment> list = (List) m10853constructorimpl;
                if (list != null && hasShowingDialogRecursive(list)) {
                    return true;
                }
            }
        }
        return false;
    }

    @JvmStatic
    public static final void enqueueOrDispatch(MainActivity activity, NavigateMessage<?> message) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(message, "message");
        OfferNavigationGate offerNavigationGate = INSTANCE;
        synchronized (offerNavigationGate) {
            queue.addLast(message);
            Unit unit = Unit.INSTANCE;
        }
        offerNavigationGate.process(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void process(final MainActivity activity) {
        if (activity.isFinishing() || activity.isDestroyed()) {
            clearAll();
            return;
        }
        if (shouldDeferOfferNavigation(activity)) {
            cancelSettleOnly();
            startPollerIfNeeded(activity);
            return;
        }
        synchronized (this) {
            if (queue.isEmpty()) {
                pendingSettleDelay = false;
                return;
            }
            Unit unit = Unit.INSTANCE;
            if (poller == null && settle == null) {
                if (pendingSettleDelay) {
                    pendingSettleDelay = false;
                    Runnable runnable = new Runnable() { // from class: org.betup.utils.OfferNavigationGate$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            OfferNavigationGate.process$lambda$3(MainActivity.this);
                        }
                    };
                    settle = runnable;
                    handler.postDelayed(runnable, 750L);
                    return;
                }
                dispatchHeadAndContinue(activity);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void process$lambda$3(MainActivity mainActivity) {
        OfferNavigationGate offerNavigationGate = INSTANCE;
        settle = null;
        if (mainActivity.isFinishing() || mainActivity.isDestroyed()) {
            offerNavigationGate.clearAll();
        } else {
            offerNavigationGate.dispatchHeadAndContinue(mainActivity);
        }
    }

    private final void dispatchHeadAndContinue(MainActivity activity) {
        NavigateMessage<NavigateMessage.Target> pollFirst;
        if (activity.isFinishing() || activity.isDestroyed()) {
            clearAll();
            return;
        }
        if (shouldDeferOfferNavigation(activity)) {
            startPollerIfNeeded(activity);
            return;
        }
        synchronized (this) {
            pollFirst = queue.pollFirst();
        }
        if (pollFirst == null) {
            return;
        }
        activity.dispatchNavigateMessage(pollFirst);
        process(activity);
    }

    private final void startPollerIfNeeded(final MainActivity activity) {
        if (poller != null) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: org.betup.utils.OfferNavigationGate$startPollerIfNeeded$pollLoop$1
            @Override // java.lang.Runnable
            public void run() {
                Handler handler2;
                if (MainActivity.this.isFinishing() || MainActivity.this.isDestroyed()) {
                    OfferNavigationGate.INSTANCE.clearAll();
                    return;
                }
                if (OfferNavigationGate.shouldDeferOfferNavigation(MainActivity.this)) {
                    handler2 = OfferNavigationGate.handler;
                    handler2.postDelayed(this, 300L);
                    return;
                }
                OfferNavigationGate offerNavigationGate = OfferNavigationGate.INSTANCE;
                OfferNavigationGate.poller = null;
                OfferNavigationGate offerNavigationGate2 = OfferNavigationGate.INSTANCE;
                OfferNavigationGate.pendingSettleDelay = true;
                OfferNavigationGate.INSTANCE.process(MainActivity.this);
            }
        };
        poller = runnable;
        handler.post(runnable);
    }

    private final void cancelSettleOnly() {
        Runnable runnable = settle;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        settle = null;
    }

    @JvmStatic
    public static final void cancelPending() {
        Runnable runnable = poller;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        OfferNavigationGate offerNavigationGate = INSTANCE;
        offerNavigationGate.cancelSettleOnly();
        poller = null;
        pendingSettleDelay = false;
        synchronized (offerNavigationGate) {
            queue.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearAll() {
        Runnable runnable = poller;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        cancelSettleOnly();
        poller = null;
        pendingSettleDelay = false;
        synchronized (this) {
            queue.clear();
            Unit unit = Unit.INSTANCE;
        }
    }
}
