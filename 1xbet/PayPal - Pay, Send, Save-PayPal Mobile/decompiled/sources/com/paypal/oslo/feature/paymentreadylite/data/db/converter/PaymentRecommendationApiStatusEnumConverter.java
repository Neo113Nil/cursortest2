package com.paypal.oslo.feature.paymentreadylite.data.db.converter;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/paymentreadylite/data/db/converter/PaymentRecommendationApiStatusEnumConverter;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/paymentreadylite/data/db/model/PaymentRecommendationApiStatusEnum;", "status", "", "fromEnum", "(Lcom/paypal/oslo/feature/paymentreadylite/data/db/model/PaymentRecommendationApiStatusEnum;)Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "toEnum", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/paymentreadylite/data/db/model/PaymentRecommendationApiStatusEnum;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentRecommendationApiStatusEnumConverter {
    public static final int $stable = 0;

    public final java.lang.String fromEnum(com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        return status.name();
    }

    public final com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum toEnum(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        try {
            return com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum.valueOf(value);
        } catch (java.lang.IllegalArgumentException e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.paymentreadylite.LoggerKt.log, "Failed to convert string to PaymentRecommendationApiStatusEnum", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("method", "toEnum"), kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, value), kotlin.TuplesKt.to("defaultValue", com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED)), null, e, 4, null);
            return com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum.FAILED;
        }
    }
}
