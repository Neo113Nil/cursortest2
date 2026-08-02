package com.paypal.oslo.core.network.http;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/network/http/PayPalRequestFilter;", "", "Lcom/paypal/oslo/core/network/http/PayPalDomainValidator;", "domainValidator", "<init>", "(Lcom/paypal/oslo/core/network/http/PayPalDomainValidator;)V", "Lokhttp3/Request;", "request", "Ljava/lang/Class;", "noAuthTagClass", "", "shouldAddPayPalHeaders", "(Lokhttp3/Request;Ljava/lang/Class;)Z", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/network/http/PayPalDomainValidator;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PayPalRequestFilter {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.network.http.PayPalDomainValidator Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public PayPalRequestFilter(com.paypal.oslo.core.network.http.PayPalDomainValidator payPalDomainValidator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalDomainValidator, "");
        this.Camera2StreamConfigurationMap = payPalDomainValidator;
    }

    public final boolean shouldAddPayPalHeaders(okhttp3.Request request, java.lang.Class<?> noAuthTagClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(noAuthTagClass, "");
        if (request.tag(noAuthTagClass) != null) {
            return false;
        }
        return this.Camera2StreamConfigurationMap.isPayPalDomain(request.url().toString());
    }
}
