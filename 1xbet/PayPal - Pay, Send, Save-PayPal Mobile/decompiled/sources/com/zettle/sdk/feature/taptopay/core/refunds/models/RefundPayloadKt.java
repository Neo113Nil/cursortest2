package com.zettle.sdk.feature.taptopay.core.refunds.models;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Ljava/util/Date;", "getHighSpeedVideoSizes", "(Ljava/lang/String;)Ljava/util/Date;", "Lcom/zettle/sdk/commons/network/Response;", "", "originalAmount", "Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundPayload;", "toRefundPayload", "(Lcom/zettle/sdk/commons/network/Response;J)Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundPayload;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RefundPayloadKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Date getHighSpeedVideoSizes(java.lang.String str) {
        try {
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", java.util.Locale.getDefault());
            simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC));
            return simpleDateFormat.parse(str);
        } catch (java.text.ParseException unused) {
            return null;
        }
    }

    public static final com.zettle.sdk.feature.taptopay.core.refunds.models.RefundPayload toRefundPayload(com.zettle.sdk.commons.network.Response response, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        return (com.zettle.sdk.feature.taptopay.core.refunds.models.RefundPayload) response.payload(new com.zettle.sdk.feature.taptopay.core.refunds.models.RefundPayloadParser(j));
    }
}
