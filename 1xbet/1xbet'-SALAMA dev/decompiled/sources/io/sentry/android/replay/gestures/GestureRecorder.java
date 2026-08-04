package io.sentry.android.replay.gestures;

import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.replay.OnRootViewsChangedListener;
import io.sentry.android.replay.WindowsKt;
import io.sentry.android.replay.util.FixedWindowCallback;
import io.sentry.rrweb.RRWebOptionsEvent;
import io.sentry.util.AutoClosableReentrantLock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p050g6.n;
import q6.a;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class GestureRecorder implements OnRootViewsChangedListener {
    public static final int $stable = 8;
    private final SentryOptions options;
    private final ArrayList<WeakReference<View>> rootViews;
    private final AutoClosableReentrantLock rootViewsLock;
    private final TouchRecorderCallback touchRecorderCallback;

    @StabilityInferred(parameters = 0)
    public static final class SentryReplayGestureRecorder extends FixedWindowCallback {
        public static final int $stable = 8;
        private final SentryOptions options;
        private final TouchRecorderCallback touchRecorderCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SentryReplayGestureRecorder(SentryOptions sentryOptions, TouchRecorderCallback touchRecorderCallback, Window.Callback callback) {
            super(callback);
            h.e(sentryOptions, RRWebOptionsEvent.EVENT_TAG);
            this.options = sentryOptions;
            this.touchRecorderCallback = touchRecorderCallback;
        }

        @Override // io.sentry.android.replay.util.FixedWindowCallback, android.view.Window.Callback
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent != null) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                h.d(motionEventObtainNoHistory, "obtainNoHistory(event)");
                try {
                    TouchRecorderCallback touchRecorderCallback = this.touchRecorderCallback;
                    if (touchRecorderCallback != null) {
                        touchRecorderCallback.onTouchEvent(motionEventObtainNoHistory);
                    }
                } catch (Throwable th) {
                    try {
                        this.options.getLogger().log(SentryLevel.ERROR, "Error dispatching touch event", th);
                    } finally {
                        motionEventObtainNoHistory.recycle();
                    }
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    public GestureRecorder(SentryOptions sentryOptions, TouchRecorderCallback touchRecorderCallback) {
        h.e(sentryOptions, RRWebOptionsEvent.EVENT_TAG);
        h.e(touchRecorderCallback, "touchRecorderCallback");
        this.options = sentryOptions;
        this.touchRecorderCallback = touchRecorderCallback;
        this.rootViews = new ArrayList<>();
        this.rootViewsLock = new AutoClosableReentrantLock();
    }

    private final void startGestureTracking(View view) {
        Window phoneWindow = WindowsKt.getPhoneWindow(view);
        if (phoneWindow == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Window is invalid, not tracking gestures", new Object[0]);
            return;
        }
        Window.Callback callback = phoneWindow.getCallback();
        if (callback instanceof SentryReplayGestureRecorder) {
            return;
        }
        phoneWindow.setCallback(new SentryReplayGestureRecorder(this.options, this.touchRecorderCallback, callback));
    }

    private final void stopGestureTracking(View view) {
        Window phoneWindow = WindowsKt.getPhoneWindow(view);
        if (phoneWindow == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Window was null in stopGestureTracking", new Object[0]);
            return;
        }
        Window.Callback callback = phoneWindow.getCallback();
        if (callback instanceof SentryReplayGestureRecorder) {
            phoneWindow.setCallback(((SentryReplayGestureRecorder) callback).delegate);
        }
    }

    @Override // io.sentry.android.replay.OnRootViewsChangedListener
    public void onRootViewsChanged(View view, boolean z4) {
        h.e(view, "root");
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.rootViewsLock.acquire();
        try {
            if (z4) {
                this.rootViews.add(new WeakReference<>(view));
                startGestureTracking(view);
            } else {
                stopGestureTracking(view);
                n.P0(this.rootViews, new GestureRecorder$onRootViewsChanged$1$1(view));
            }
            a.a(iSentryLifecycleTokenAcquire, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                a.a(iSentryLifecycleTokenAcquire, th);
                throw th2;
            }
        }
    }

    public final void stop() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.rootViewsLock.acquire();
        try {
            Iterator<T> it = this.rootViews.iterator();
            while (it.hasNext()) {
                View view = (View) ((WeakReference) it.next()).get();
                if (view != null) {
                    stopGestureTracking(view);
                }
            }
            this.rootViews.clear();
            a.a(iSentryLifecycleTokenAcquire, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                a.a(iSentryLifecycleTokenAcquire, th);
                throw th2;
            }
        }
    }
}
