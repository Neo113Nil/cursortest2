package com.paypal.oslo.feature.businesscustomers.ui.addressform;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/Field;", "", "isSupportedForCustomers", "(Lcom/paypal/oslo/core/i18n/domain/model/Field;)Z", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "updateWithValue", "(Lcom/paypal/oslo/core/i18n/domain/model/Field;Ljava/lang/String;)Lcom/paypal/oslo/core/i18n/domain/model/Field;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FieldExtKt {
    public static final boolean isSupportedForCustomers(com.paypal.oslo.core.i18n.domain.model.Field field) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
        return (field instanceof com.paypal.oslo.core.i18n.domain.model.AddressLine1) || (field instanceof com.paypal.oslo.core.i18n.domain.model.AddressLine2) || (field instanceof com.paypal.oslo.core.i18n.domain.model.AdminArea1) || (field instanceof com.paypal.oslo.core.i18n.domain.model.AdminArea2) || (field instanceof com.paypal.oslo.core.i18n.domain.model.PostalCode);
    }

    public static final com.paypal.oslo.core.i18n.domain.model.Field updateWithValue(com.paypal.oslo.core.i18n.domain.model.Field field, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (field instanceof com.paypal.oslo.core.i18n.domain.model.AddressLine1) {
            return com.paypal.oslo.core.i18n.domain.model.AddressLine1.m11272boximpl(com.paypal.oslo.core.i18n.domain.model.AddressLine1.m11273constructorimpl(str));
        }
        if (field instanceof com.paypal.oslo.core.i18n.domain.model.AddressLine2) {
            return com.paypal.oslo.core.i18n.domain.model.AddressLine2.m11281boximpl(com.paypal.oslo.core.i18n.domain.model.AddressLine2.m11282constructorimpl(str));
        }
        if (field instanceof com.paypal.oslo.core.i18n.domain.model.AdminArea1) {
            return com.paypal.oslo.core.i18n.domain.model.AdminArea1.m11299boximpl(com.paypal.oslo.core.i18n.domain.model.AdminArea1.m11300constructorimpl(str));
        }
        if (field instanceof com.paypal.oslo.core.i18n.domain.model.AdminArea2) {
            return com.paypal.oslo.core.i18n.domain.model.AdminArea2.m11308boximpl(com.paypal.oslo.core.i18n.domain.model.AdminArea2.m11309constructorimpl(str));
        }
        if (field instanceof com.paypal.oslo.core.i18n.domain.model.PostalCode) {
            return com.paypal.oslo.core.i18n.domain.model.PostalCode.m11459boximpl(com.paypal.oslo.core.i18n.domain.model.PostalCode.m11460constructorimpl(str));
        }
        return null;
    }
}
