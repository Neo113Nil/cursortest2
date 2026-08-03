package com.unity3d.ads.core.domain;

/* compiled from: AndroidGetLifecycleFlow.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetLifecycleFlow;", "", "applicationContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/core/domain/LifecycleEvent;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidGetLifecycleFlow {
    private final android.content.Context applicationContext;

    public AndroidGetLifecycleFlow(android.content.Context applicationContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
    }

    public final kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.domain.LifecycleEvent> invoke() {
        if (!(this.applicationContext instanceof android.app.Application)) {
            throw new java.lang.IllegalArgumentException("Application context is required".toString());
        }
        return kotlinx.coroutines.flow.FlowKt.channelFlow(new com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2(this, null));
    }
}
