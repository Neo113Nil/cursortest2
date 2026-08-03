package com.unity3d.ads.core.extensions;

/* compiled from: FlowExtensions.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001ao\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u000627\u0010\u0007\u001a3\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\n0\t¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\bø\u0001\u0000¢\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"timeoutAfter", "Lkotlinx/coroutines/flow/Flow;", "T", "timeoutMillis", "", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "block", "Lkotlin/Function2;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", "name", "close", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/Flow;JZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FlowExtensionsKt {
    public static final <T> kotlinx.coroutines.flow.Flow<T> timeoutAfter(kotlinx.coroutines.flow.Flow<? extends T> flow, long j, boolean z, kotlin.jvm.functions.Function2<? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        return kotlinx.coroutines.flow.FlowKt.channelFlow(new com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1(j, z, block, flow, null));
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow timeoutAfter$default(kotlinx.coroutines.flow.Flow flow, long j, boolean z, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return timeoutAfter(flow, j, z, function2);
    }
}
