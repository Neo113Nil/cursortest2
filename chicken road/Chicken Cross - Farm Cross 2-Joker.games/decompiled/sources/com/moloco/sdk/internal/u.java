package com.moloco.sdk.internal;

import com.moloco.sdk.publisher.MolocoAdError;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class u {
    public static /* synthetic */ t a(String str, MolocoAdError.ErrorType errorType, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar, Map map, int i, Object obj) {
        if ((i & 8) != 0) {
            map = MapsKt.emptyMap();
        }
        return a(str, errorType, cVar, map);
    }

    public static final t a(String adUnitId, MolocoAdError.ErrorType errorType, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c subErrorType, Map<String, String> details) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(subErrorType, "subErrorType");
        Intrinsics.checkNotNullParameter(details, "details");
        return new t(new MolocoAdError("Moloco", adUnitId, errorType, null, 8, null), subErrorType, details);
    }
}
