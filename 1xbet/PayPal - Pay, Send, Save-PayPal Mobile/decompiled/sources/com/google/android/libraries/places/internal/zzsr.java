package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzsr {
    public static final kotlinx.coroutines.flow.Flow zza(kotlinx.coroutines.flow.Flow flow, int i, kotlin.jvm.functions.Function2 function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        if (i > 0) {
            return i == 1 ? new com.google.android.libraries.places.internal.zzsk(flow, function2) : new com.google.android.libraries.places.internal.zzsn(kotlinx.coroutines.flow.FlowKt__ContextKt.buffer$default(kotlinx.coroutines.flow.FlowKt.channelFlow(new com.google.android.libraries.places.internal.zzsq(flow, function2, null)), i - 2, null, 2, null));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 39);
        sb.append("concurrency must be at least 1 but was ");
        sb.append(i);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
