package com.unity3d.ads.core.domain;

import android.app.Application;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ContextKt;

/* compiled from: AndroidGetLifecycleFlow.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetLifecycleFlow;", "", "applicationContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/core/domain/LifecycleEvent;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidGetLifecycleFlow {
    private final Context applicationContext;

    public AndroidGetLifecycleFlow(Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
    }

    public final Flow<LifecycleEvent> invoke() {
        if (this.applicationContext instanceof Application) {
            return FlowKt__ContextKt.buffer$default(FlowKt.channelFlow(new AndroidGetLifecycleFlow$invoke$2(this, null)), Integer.MAX_VALUE, null, 2, null);
        }
        throw new IllegalArgumentException("Application context is required".toString());
    }
}
