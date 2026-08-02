package com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/HttpMethodDomain;", "", "<init>", "(Ljava/lang/String;)V", "GET"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class HttpMethodDomain {
    private static final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.HttpMethodDomain[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.HttpMethodDomain GET;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private HttpMethodDomain(java.lang.String str) {
    }

    static {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.HttpMethodDomain httpMethodDomain = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.HttpMethodDomain("GET");
        GET = httpMethodDomain;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.HttpMethodDomain[] httpMethodDomainArr = {httpMethodDomain};
        Camera2StreamConfigurationMap = httpMethodDomainArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(httpMethodDomainArr);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.HttpMethodDomain[] values() {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.HttpMethodDomain[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.HttpMethodDomain valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.HttpMethodDomain) java.lang.Enum.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.HttpMethodDomain.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.HttpMethodDomain> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
