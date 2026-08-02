package com.zettle.sdk.feature.taptopay.core.refunds.models;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundRequestImpl;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundRequest;", "Lcom/zettle/sdk/meta/AppInfo;", "p0", "Lcom/zettle/sdk/meta/PlatformInfo;", "p1", "Lcom/zettle/sdk/core/os/LocationData;", "p2", "<init>", "(Lcom/zettle/sdk/meta/AppInfo;Lcom/zettle/sdk/meta/PlatformInfo;Lcom/zettle/sdk/core/os/LocationData;)V", "", "amount", "(J)Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundRequest;", "", "build", "()Ljava/lang/String;", "cardPaymentUuid", "(Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundRequest;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE, "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;)Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundRequest;", "Lorg/json/JSONObject;", "getHighSpeedVideoFpsRanges", "Lorg/json/JSONObject;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class RefundRequestImpl implements com.zettle.sdk.feature.taptopay.core.refunds.models.RefundRequest {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final org.json.JSONObject getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final org.json.JSONObject getHighSpeedVideoFpsRanges;

    public RefundRequestImpl(com.zettle.sdk.meta.AppInfo appInfo, com.zettle.sdk.meta.PlatformInfo platformInfo, com.zettle.sdk.core.os.LocationData locationData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platformInfo, "");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.zettle.sdk.commons.network.JsonKt.putSdkInfo(jSONObject, appInfo);
        com.zettle.sdk.commons.network.JsonKt.putPlatformInfo(jSONObject, platformInfo);
        com.zettle.sdk.commons.network.JsonKt.putLastLocation(jSONObject, locationData);
        this.getHighSpeedVideoFpsRanges = jSONObject;
        this.getHighResolutionOutputSizeshNQ4ISI = new org.json.JSONObject();
    }

    @Override // com.zettle.sdk.feature.taptopay.core.refunds.models.RefundRequest
    public final com.zettle.sdk.feature.taptopay.core.refunds.models.RefundRequest amount(long p0) {
        this.getHighSpeedVideoFpsRanges.put(com.zettle.sdk.commons.network.JsonKt.KEY_REFUND_AMOUNT, p0);
        return this;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.refunds.models.RefundRequest
    public final com.zettle.sdk.feature.taptopay.core.refunds.models.RefundRequest cardPaymentUuid(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighSpeedVideoFpsRanges.put(com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_UUID, p0);
        return this;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.refunds.models.RefundRequest
    public final com.zettle.sdk.feature.taptopay.core.refunds.models.RefundRequest reference(com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        p0.packToObject$core_publicRelease(this.getHighResolutionOutputSizeshNQ4ISI);
        return this;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.refunds.models.RefundRequest
    public final java.lang.String build() {
        this.getHighSpeedVideoFpsRanges.put(com.zettle.sdk.commons.network.JsonKt.KEY_REFERENCES, this.getHighResolutionOutputSizeshNQ4ISI);
        java.lang.String jSONObject = this.getHighSpeedVideoFpsRanges.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "");
        return jSONObject;
    }
}
