package com.datadog.android.rum.tracking;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/datadog/android/rum/tracking/NoOpActionTrackingStrategy;", "Lcom/datadog/android/rum/tracking/ActionTrackingStrategy;", "<init>", "()V", "Landroid/view/View;", "view", "", "x", "y", "Lcom/datadog/android/rum/tracking/ViewTarget;", "findTargetForScroll", "(Landroid/view/View;FF)Lcom/datadog/android/rum/tracking/ViewTarget;", "findTargetForTap", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "Landroid/content/Context;", "context", "", "register", "(Lcom/datadog/android/api/SdkCore;Landroid/content/Context;)V", "unregister", "(Landroid/content/Context;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NoOpActionTrackingStrategy implements com.datadog.android.rum.tracking.ActionTrackingStrategy {
    @Override // com.datadog.android.rum.tracking.TrackingStrategy
    public final void unregister(android.content.Context context) {
    }

    @Override // com.datadog.android.rum.tracking.TrackingStrategy
    public final void register(com.datadog.android.api.SdkCore sdkCore, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // com.datadog.android.rum.tracking.ActionTrackingStrategy
    public final com.datadog.android.rum.tracking.ViewTarget findTargetForTap(android.view.View view, float x, float y) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        return null;
    }

    @Override // com.datadog.android.rum.tracking.ActionTrackingStrategy
    public final com.datadog.android.rum.tracking.ViewTarget findTargetForScroll(android.view.View view, float x, float y) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        return null;
    }
}
