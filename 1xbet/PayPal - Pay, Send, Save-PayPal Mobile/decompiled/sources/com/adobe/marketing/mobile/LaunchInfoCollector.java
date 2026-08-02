package com.adobe.marketing.mobile;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/adobe/marketing/mobile/LaunchInfoCollector;", "Lcom/adobe/marketing/mobile/services/internal/context/App$ActivityLifecycleCallbacks;", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "onActivityResumed", "(Landroid/app/Activity;)V"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class LaunchInfoCollector implements com.adobe.marketing.mobile.services.internal.context.App.ActivityLifecycleCallbacks {
    @Override // com.adobe.marketing.mobile.services.internal.context.App.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        com.adobe.marketing.mobile.services.internal.context.App.ActivityLifecycleCallbacks.DefaultImpls.onActivityPaused(this, activity);
    }

    @Override // com.adobe.marketing.mobile.services.internal.context.App.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        com.adobe.marketing.mobile.MobileCore.getHighSpeedVideoFpsRangesFor(activity);
    }
}
