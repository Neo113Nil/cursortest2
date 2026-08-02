package org.betup.utils;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.dialogs.push.PushNotificationDialogFragment;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: PushNotificationDisplayGate.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\fH\u0007J\b\u0010\u0018\u001a\u00020\u0015H\u0007J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011H\u0002J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011H\u0002J\b\u0010\u001b\u001a\u00020\u0015H\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lorg/betup/utils/PushNotificationDisplayGate;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "POLL_MS", "", "handler", "Landroid/os/Handler;", "queue", "Ljava/util/ArrayDeque;", "Landroid/os/Bundle;", "poller", "Ljava/lang/Runnable;", "weakHost", "Ljava/lang/ref/WeakReference;", "Landroidx/fragment/app/FragmentActivity;", "pendingIdleRunnables", "Ljava/util/concurrent/CopyOnWriteArrayList;", "enqueue", "", "host", "bundle", "cancelPending", "process", "registerDrainWhenAllOverlaysIdle", "startPollerIfNeeded", "stopPollerIfRunning", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PushNotificationDisplayGate {
    private static final long POLL_MS = 300;
    private static final String TAG = "PushNotificationGate";
    private static Runnable poller;
    private static WeakReference<FragmentActivity> weakHost;
    public static final PushNotificationDisplayGate INSTANCE = new PushNotificationDisplayGate();
    private static final Handler handler = new Handler(Looper.getMainLooper());
    private static final ArrayDeque<Bundle> queue = new ArrayDeque<>();
    private static final CopyOnWriteArrayList<Runnable> pendingIdleRunnables = new CopyOnWriteArrayList<>();
    public static final int $stable = 8;

    private PushNotificationDisplayGate() {
    }

    @JvmStatic
    public static final void enqueue(FragmentActivity host, Bundle bundle) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        ArrayDeque<Bundle> arrayDeque = queue;
        synchronized (arrayDeque) {
            arrayDeque.addLast(new Bundle(bundle));
            Unit unit = Unit.INSTANCE;
        }
        PushNotificationDisplayGate pushNotificationDisplayGate = INSTANCE;
        weakHost = new WeakReference<>(host);
        pushNotificationDisplayGate.process(host);
    }

    @JvmStatic
    public static final void cancelPending() {
        Runnable runnable = poller;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        poller = null;
        ArrayDeque<Bundle> arrayDeque = queue;
        synchronized (arrayDeque) {
            arrayDeque.clear();
            Unit unit = Unit.INSTANCE;
        }
        Iterator<Runnable> it = pendingIdleRunnables.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Runnable next = it.next();
            Intrinsics.checkNotNull(next);
            DialogManager.unregisterOnLastTrackedDialogDismissed(next);
        }
        pendingIdleRunnables.clear();
        weakHost = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void process(FragmentActivity host) {
        Bundle peekFirst;
        boolean z;
        boolean isEmpty;
        weakHost = new WeakReference<>(host);
        if (host.isFinishing() || host.isDestroyed()) {
            ArrayDeque<Bundle> arrayDeque = queue;
            synchronized (arrayDeque) {
                arrayDeque.clear();
                Unit unit = Unit.INSTANCE;
            }
            return;
        }
        FragmentManager supportFragmentManager = host.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        DialogManager.reconcileTrackedDialogsWith(supportFragmentManager);
        if (ExternalOverlayDeferral.shouldDefer(host)) {
            startPollerIfNeeded();
            return;
        }
        ArrayDeque<Bundle> arrayDeque2 = queue;
        synchronized (arrayDeque2) {
            peekFirst = arrayDeque2.peekFirst();
        }
        if (peekFirst == null) {
            stopPollerIfRunning();
            return;
        }
        try {
            PushNotificationDialogFragment newInstance = PushNotificationDialogFragment.INSTANCE.newInstance(peekFirst);
            FragmentManager supportFragmentManager2 = host.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
            z = DialogManager.showDialogReplacingPrevious(newInstance, supportFragmentManager2, PushNotificationDialogFragment.TAG);
        } catch (Exception e) {
            Log.e(TAG, "Failed to show push notification dialog", e);
            z = false;
        }
        if (z) {
            ArrayDeque<Bundle> arrayDeque3 = queue;
            synchronized (arrayDeque3) {
                arrayDeque3.pollFirst();
            }
            synchronized (arrayDeque3) {
                isEmpty = arrayDeque3.isEmpty();
            }
            if (isEmpty) {
                return;
            }
            registerDrainWhenAllOverlaysIdle(host);
            return;
        }
        startPollerIfNeeded();
    }

    private final void registerDrainWhenAllOverlaysIdle(FragmentActivity host) {
        final Runnable[] runnableArr = new Runnable[1];
        runnableArr[0] = new Runnable() { // from class: org.betup.utils.PushNotificationDisplayGate$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                PushNotificationDisplayGate.registerDrainWhenAllOverlaysIdle$lambda$8(runnableArr);
            }
        };
        Runnable runnable = runnableArr[0];
        Intrinsics.checkNotNull(runnable);
        pendingIdleRunnables.add(runnable);
        DialogManager.registerOnLastTrackedDialogDismissed(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerDrainWhenAllOverlaysIdle$lambda$8(Runnable[] runnableArr) {
        Runnable runnable = runnableArr[0];
        if (runnable == null) {
            return;
        }
        DialogManager.unregisterOnLastTrackedDialogDismissed(runnable);
        pendingIdleRunnables.remove(runnable);
        WeakReference<FragmentActivity> weakReference = weakHost;
        FragmentActivity fragmentActivity = weakReference != null ? weakReference.get() : null;
        if (fragmentActivity == null || fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
            return;
        }
        INSTANCE.process(fragmentActivity);
    }

    private final void startPollerIfNeeded() {
        if (poller != null) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: org.betup.utils.PushNotificationDisplayGate$startPollerIfNeeded$loop$1
            @Override // java.lang.Runnable
            public void run() {
                WeakReference weakReference;
                Handler handler2;
                weakReference = PushNotificationDisplayGate.weakHost;
                FragmentActivity fragmentActivity = weakReference != null ? (FragmentActivity) weakReference.get() : null;
                if (fragmentActivity == null || fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
                    PushNotificationDisplayGate pushNotificationDisplayGate = PushNotificationDisplayGate.INSTANCE;
                    PushNotificationDisplayGate.poller = null;
                } else if (ExternalOverlayDeferral.shouldDefer(fragmentActivity)) {
                    handler2 = PushNotificationDisplayGate.handler;
                    handler2.postDelayed(this, 300L);
                } else {
                    PushNotificationDisplayGate pushNotificationDisplayGate2 = PushNotificationDisplayGate.INSTANCE;
                    PushNotificationDisplayGate.poller = null;
                    PushNotificationDisplayGate.INSTANCE.process(fragmentActivity);
                }
            }
        };
        poller = runnable;
        handler.postDelayed(runnable, POLL_MS);
    }

    private final void stopPollerIfRunning() {
        Runnable runnable = poller;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        poller = null;
    }
}
