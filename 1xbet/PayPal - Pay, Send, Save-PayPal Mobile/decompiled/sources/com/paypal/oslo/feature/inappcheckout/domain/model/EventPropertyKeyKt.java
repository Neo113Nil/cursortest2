package com.paypal.oslo.feature.inappcheckout.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0080\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080\u0004¢\u0006\u0004\b\u0006\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/EventPropertyKey;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/inappcheckout/domain/model/EventProperty;", "with", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/EventPropertyKey;Ljava/lang/Object;)Lcom/paypal/oslo/feature/inappcheckout/domain/model/EventProperty;", "withNonNull"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventPropertyKeyKt {
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty with(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey eventPropertyKey, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventPropertyKey, "");
        return new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty(eventPropertyKey, obj);
    }

    public static final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty withNonNull(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey eventPropertyKey, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventPropertyKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        return new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty(eventPropertyKey, obj);
    }
}
