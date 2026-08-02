package io.sentry.android.core.internal.util;

import E4.RunnableC0181n;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import io.sentry.android.core.BuildInfoProvider;
import io.sentry.android.core.internal.gestures.NoOpWindowCallback;
import io.sentry.android.core.performance.WindowContentChangedCallback;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class FirstDrawDoneListener implements ViewTreeObserver.OnDrawListener {
    private final Runnable callback;
    private final Handler mainThreadHandler = new Handler(Looper.getMainLooper());
    private final AtomicReference<View> viewReference;

    private FirstDrawDoneListener(View view, Runnable runnable) {
        this.viewReference = new AtomicReference<>(view);
        this.callback = runnable;
    }

    private static boolean isAliveAndAttached(View view) {
        return view.getViewTreeObserver().isAlive() && view.isAttachedToWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDraw$1(View view) {
        view.getViewTreeObserver().removeOnDrawListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$registerForNextDraw$0(Window window, Window.Callback callback, Runnable runnable, BuildInfoProvider buildInfoProvider) {
        View peekDecorView = window.peekDecorView();
        if (peekDecorView != null) {
            window.setCallback(callback);
            registerForNextDraw(peekDecorView, runnable, buildInfoProvider);
        }
    }

    public static void registerForNextDraw(Activity activity, Runnable runnable, BuildInfoProvider buildInfoProvider) {
        Window window = activity.getWindow();
        if (window != null) {
            View peekDecorView = window.peekDecorView();
            if (peekDecorView != null) {
                registerForNextDraw(peekDecorView, runnable, buildInfoProvider);
            } else {
                Window.Callback callback = window.getCallback();
                window.setCallback(new WindowContentChangedCallback(callback != null ? callback : new NoOpWindowCallback(), new RunnableC0181n(window, callback, runnable, buildInfoProvider, 10)));
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View andSet = this.viewReference.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.sentry.android.core.internal.util.b
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                FirstDrawDoneListener.this.lambda$onDraw$1(andSet);
            }
        });
        this.mainThreadHandler.postAtFrontOfQueue(this.callback);
    }

    public static void registerForNextDraw(View view, Runnable runnable, BuildInfoProvider buildInfoProvider) {
        FirstDrawDoneListener firstDrawDoneListener = new FirstDrawDoneListener(view, runnable);
        if (buildInfoProvider.getSdkInfoVersion() < 26 && !isAliveAndAttached(view)) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: io.sentry.android.core.internal.util.FirstDrawDoneListener.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    view2.getViewTreeObserver().addOnDrawListener(FirstDrawDoneListener.this);
                    view2.removeOnAttachStateChangeListener(this);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                    view2.removeOnAttachStateChangeListener(this);
                }
            });
        } else {
            view.getViewTreeObserver().addOnDrawListener(firstDrawDoneListener);
        }
    }
}
