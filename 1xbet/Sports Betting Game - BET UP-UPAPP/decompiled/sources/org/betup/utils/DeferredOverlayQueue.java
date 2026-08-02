package org.betup.utils;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: DeferredOverlayQueue.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\fH\u0007J\b\u0010\u0015\u001a\u00020\u0012H\u0007J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0007J\b\u0010\u0017\u001a\u00020\u0012H\u0007J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lorg/betup/utils/DeferredOverlayQueue;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "POLL_MS", "", "handler", "Landroid/os/Handler;", "queue", "Ljava/util/ArrayDeque;", "Ljava/lang/Runnable;", "weakHost", "Ljava/lang/ref/WeakReference;", "Landroidx/fragment/app/FragmentActivity;", "poller", "enqueue", "", "host", "showAction", "onImmersiveSessionEnded", "flushPending", "cancelPending", "process", "startPollerIfNeeded", "stopPoller", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeferredOverlayQueue {
    private static final long POLL_MS = 300;
    private static final String TAG = "DeferredOverlayQueue";
    private static Runnable poller;
    private static WeakReference<FragmentActivity> weakHost;
    public static final DeferredOverlayQueue INSTANCE = new DeferredOverlayQueue();
    private static final Handler handler = new Handler(Looper.getMainLooper());
    private static final ArrayDeque<Runnable> queue = new ArrayDeque<>();
    public static final int $stable = 8;

    private DeferredOverlayQueue() {
    }

    @JvmStatic
    public static final void enqueue(FragmentActivity host, Runnable showAction) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(showAction, "showAction");
        ArrayDeque<Runnable> arrayDeque = queue;
        synchronized (arrayDeque) {
            arrayDeque.addLast(showAction);
            Unit unit = Unit.INSTANCE;
        }
        DeferredOverlayQueue deferredOverlayQueue = INSTANCE;
        weakHost = new WeakReference<>(host);
        deferredOverlayQueue.process(host);
    }

    @JvmStatic
    public static final void onImmersiveSessionEnded() {
        WeakReference<FragmentActivity> weakReference = weakHost;
        FragmentActivity fragmentActivity = weakReference != null ? weakReference.get() : null;
        if (fragmentActivity == null || fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
            INSTANCE.startPollerIfNeeded();
        } else {
            INSTANCE.process(fragmentActivity);
        }
    }

    @JvmStatic
    public static final void flushPending(FragmentActivity host) {
        Intrinsics.checkNotNullParameter(host, "host");
        DeferredOverlayQueue deferredOverlayQueue = INSTANCE;
        weakHost = new WeakReference<>(host);
        deferredOverlayQueue.process(host);
    }

    @JvmStatic
    public static final void cancelPending() {
        Runnable runnable = poller;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        poller = null;
        ArrayDeque<Runnable> arrayDeque = queue;
        synchronized (arrayDeque) {
            arrayDeque.clear();
            Unit unit = Unit.INSTANCE;
        }
        weakHost = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void process(FragmentActivity host) {
        Runnable peekFirst;
        weakHost = new WeakReference<>(host);
        if (host.isFinishing() || host.isDestroyed()) {
            ArrayDeque<Runnable> arrayDeque = queue;
            synchronized (arrayDeque) {
                arrayDeque.clear();
                Unit unit = Unit.INSTANCE;
            }
            return;
        }
        if (ExternalOverlayDeferral.shouldDefer(host)) {
            startPollerIfNeeded();
            return;
        }
        while (true) {
            ArrayDeque<Runnable> arrayDeque2 = queue;
            synchronized (arrayDeque2) {
                peekFirst = arrayDeque2.peekFirst();
            }
            if (peekFirst != null) {
                if (ExternalOverlayDeferral.shouldDefer(host)) {
                    startPollerIfNeeded();
                    return;
                }
                try {
                    peekFirst.run();
                } catch (Exception e) {
                    Log.e(TAG, "Deferred overlay action failed", e);
                }
                ArrayDeque<Runnable> arrayDeque3 = queue;
                synchronized (arrayDeque3) {
                    arrayDeque3.pollFirst();
                }
            } else {
                stopPoller();
                return;
            }
        }
    }

    private final void startPollerIfNeeded() {
        if (poller != null) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: org.betup.utils.DeferredOverlayQueue$startPollerIfNeeded$loop$1
            @Override // java.lang.Runnable
            public void run() {
                WeakReference weakReference;
                Handler handler2;
                weakReference = DeferredOverlayQueue.weakHost;
                FragmentActivity fragmentActivity = weakReference != null ? (FragmentActivity) weakReference.get() : null;
                if (fragmentActivity == null || fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
                    DeferredOverlayQueue deferredOverlayQueue = DeferredOverlayQueue.INSTANCE;
                    DeferredOverlayQueue.poller = null;
                } else if (ExternalOverlayDeferral.shouldDefer(fragmentActivity)) {
                    handler2 = DeferredOverlayQueue.handler;
                    handler2.postDelayed(this, 300L);
                } else {
                    DeferredOverlayQueue deferredOverlayQueue2 = DeferredOverlayQueue.INSTANCE;
                    DeferredOverlayQueue.poller = null;
                    DeferredOverlayQueue.INSTANCE.process(fragmentActivity);
                }
            }
        };
        poller = runnable;
        handler.postDelayed(runnable, POLL_MS);
    }

    private final void stopPoller() {
        Runnable runnable = poller;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        poller = null;
    }
}
