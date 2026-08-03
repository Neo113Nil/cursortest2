package com.unity3d.ads.core.domain.work;

/* compiled from: UniversalRequestWorkerData.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0006H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/domain/work/UniversalRequestWorkerData;", "", com.unity3d.ads.core.domain.work.UniversalRequestWorkerData.KEY_UNIVERSAL_REQUEST_ID, "", "(Ljava/lang/String;)V", "invoke", "Landroidx/work/Data;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UniversalRequestWorkerData {
    public static final java.lang.String KEY_UNIVERSAL_REQUEST_ID = "universalRequestId";
    private final java.lang.String universalRequestId;

    public UniversalRequestWorkerData(java.lang.String universalRequestId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(universalRequestId, "universalRequestId");
        this.universalRequestId = universalRequestId;
    }

    public final androidx.work.Data invoke() {
        androidx.work.Data build = new androidx.work.Data.Builder().putString(KEY_UNIVERSAL_REQUEST_ID, this.universalRequestId).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .p…tId)\n            .build()");
        return build;
    }
}
