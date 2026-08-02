package com.razorpay;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.webkit.WebView;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"com/razorpay/RazorpayInitializer$registerWebViewWarmup$callbacks$1", "Landroid/app/Application$ActivityLifecycleCallbacks;", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "checkout-otpelf-lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RazorpayInitializer$O$$$__o0Oo implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ Context $appContext;
    final /* synthetic */ Application $application;
    final /* synthetic */ boolean[] $hasTriggered;
    final /* synthetic */ Handler $mainHandler;

    public RazorpayInitializer$O$$$__o0Oo(boolean[] zArr, Application application, Context context, Handler handler) {
        this.$hasTriggered = zArr;
        this.$application = application;
        this.$appContext = context;
        this.$mainHandler = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onActivityResumed$lambda-2, reason: not valid java name */
    public static final void m1706onActivityResumed$lambda2(Context appContext, Application application, RazorpayInitializer$O$$$__o0Oo self, Handler mainHandler) {
        Intrinsics.checkNotNullParameter(appContext, "$appContext");
        Intrinsics.checkNotNullParameter(application, "$application");
        Intrinsics.checkNotNullParameter(self, "$self");
        Intrinsics.checkNotNullParameter(mainHandler, "$mainHandler");
        try {
            _Oo_O_$.ensureInitialized(appContext);
            if (!_Oo_O_$.getInstance().isWebViewWarmupEnabled()) {
                application.unregisterActivityLifecycleCallbacks(self);
            } else {
                application.unregisterActivityLifecycleCallbacks(self);
                mainHandler.post(new androidx.core.app.a(appContext, 2));
            }
        } catch (Throwable th) {
            Logger.e("Error in RazorpayInitializer WebView warmup", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onActivityResumed$lambda-2$lambda-1, reason: not valid java name */
    public static final void m1707onActivityResumed$lambda2$lambda1(final Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "$appContext");
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.razorpay.t
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                boolean m1708onActivityResumed$lambda2$lambda1$lambda0;
                m1708onActivityResumed$lambda2$lambda1$lambda0 = RazorpayInitializer$O$$$__o0Oo.m1708onActivityResumed$lambda2$lambda1$lambda0(appContext);
                return m1708onActivityResumed$lambda2$lambda1$lambda0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onActivityResumed$lambda-2$lambda-1$lambda-0, reason: not valid java name */
    public static final boolean m1708onActivityResumed$lambda2$lambda1$lambda0(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "$appContext");
        if (Checkout.isPreloadTriggered) {
            return false;
        }
        try {
            new WebView(appContext).destroy();
            return false;
        } catch (Throwable th) {
            Logger.e("Error creating WebView in initializer", th);
            HashMap hashMap = new HashMap();
            hashMap.put("webview_type", "initializer_webview");
            hashMap.put(Constants.REASON, String.valueOf(th.getMessage()));
            AnalyticsUtil.trackEvent(AnalyticsEvent.WEBVIEW_CREATION_FAILED, AnalyticsUtil.getJSONResponse(hashMap));
            return false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if ((!(activity instanceof PaymentResultListener) && !(activity instanceof PaymentResultWithDataListener)) || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        boolean[] zArr = this.$hasTriggered;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        if (Checkout.isPreloadTriggered) {
            this.$application.unregisterActivityLifecycleCallbacks(this);
            return;
        }
        final Context context = this.$appContext;
        final Application application = this.$application;
        final Handler handler = this.$mainHandler;
        new Thread(new Runnable() { // from class: com.razorpay.u
            @Override // java.lang.Runnable
            public final void run() {
                RazorpayInitializer$O$$$__o0Oo.m1706onActivityResumed$lambda2(context, application, this, handler);
            }
        }).start();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
