package com.datadog.android.rum.tracking;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/tracking/NoOpTrackingStrategy;", "Lcom/datadog/android/rum/tracking/TrackingStrategy;", "<init>", "()V", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "Landroid/content/Context;", "context", "", "register", "(Lcom/datadog/android/api/SdkCore;Landroid/content/Context;)V", "unregister", "(Landroid/content/Context;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NoOpTrackingStrategy implements com.datadog.android.rum.tracking.TrackingStrategy {
    @Override // com.datadog.android.rum.tracking.TrackingStrategy
    public final void unregister(android.content.Context context) {
    }

    @Override // com.datadog.android.rum.tracking.TrackingStrategy
    public final void register(com.datadog.android.api.SdkCore sdkCore, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }
}
