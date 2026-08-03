package com.moloco.sdk.internal;

/* loaded from: classes5.dex */
public final class t {
    public static /* synthetic */ com.moloco.sdk.internal.s a(java.lang.String str, com.moloco.sdk.publisher.MolocoAdError.ErrorType errorType, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        return a(str, errorType, cVar, map);
    }

    public static final com.moloco.sdk.internal.s a(java.lang.String adUnitId, com.moloco.sdk.publisher.MolocoAdError.ErrorType errorType, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c subErrorType, java.util.Map<java.lang.String, java.lang.String> details) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "errorType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subErrorType, "subErrorType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(details, "details");
        return new com.moloco.sdk.internal.s(new com.moloco.sdk.publisher.MolocoAdError("Moloco", adUnitId, errorType, null, 8, null), subErrorType, details);
    }
}
