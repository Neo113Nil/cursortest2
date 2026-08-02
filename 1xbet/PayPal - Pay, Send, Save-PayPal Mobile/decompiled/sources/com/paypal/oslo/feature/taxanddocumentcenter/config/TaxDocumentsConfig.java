package com.paypal.oslo.feature.taxanddocumentcenter.config;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001!B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000bR\u0014\u0010\u0018\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/config/TaxDocumentsConfig;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/config/CountryConfig;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "dynamicConfig", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "Camera2StreamConfigurationMap", "", "isCountryEligible", "()Z", "", "getBaseYear", "()Ljava/lang/String;", "baseYear", "", "getFinancialYearEndingMonth", "()I", "financialYearEndingMonth", "getFinancialYearEndingDate", "financialYearEndingDate", "isYearInReview", "getIneligibilityCutoffBuffer", "ineligibilityCutoffBuffer", "", "getSectionWiseAvailabilityDate", "()Ljava/util/Map;", "sectionWiseAvailabilityDate", "", "getTaxDocumentSectionOrder", "()Ljava/util/List;", "taxDocumentSectionOrder", "Specs"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TaxDocumentsConfig implements com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public TaxDocumentsConfig(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        this.Camera2StreamConfigurationMap = dynamicConfiguration;
    }

    @Override // com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig
    public final boolean isCountryEligible() {
        return ((java.lang.Boolean) this.Camera2StreamConfigurationMap.getValue((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs.getHighSpeedVideoFpsRanges.getValue(com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs.INSTANCE, com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs.getHighResolutionOutputSizeshNQ4ISI[0]))).booleanValue();
    }

    @Override // com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig
    public final java.lang.String getBaseYear() {
        return (java.lang.String) this.Camera2StreamConfigurationMap.getValue((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs.getHighSpeedVideoSizes.getValue(com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs.INSTANCE, com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs.getHighResolutionOutputSizeshNQ4ISI[1]));
    }

    @Override // com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig
    public final int getFinancialYearEndingMonth() {
        return ((java.lang.Number) this.Camera2StreamConfigurationMap.getValue((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs.Camera2StreamConfigurationMap.getValue(com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs.INSTANCE, com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs.getHighResolutionOutputSizeshNQ4ISI[2]))).intValue();
    }

    @Override // com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig
    public final int getFinancialYearEndingDate() {
        return ((java.lang.Number) this.Camera2StreamConfigurationMap.getValue((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs.getHighSpeedVideoFpsRangesFor.getValue(com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs.INSTANCE, com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs.getHighResolutionOutputSizeshNQ4ISI[3]))).intValue();
    }

    @Override // com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig
    public final boolean isYearInReview() {
        return ((java.lang.Boolean) this.Camera2StreamConfigurationMap.getValue((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs.getHighResolutionOutputSizeshNQ4ISI.getValue(com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs.INSTANCE, com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs.getHighResolutionOutputSizeshNQ4ISI[4]))).booleanValue();
    }

    @Override // com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig
    public final int getIneligibilityCutoffBuffer() {
        return ((java.lang.Number) this.Camera2StreamConfigurationMap.getValue((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs.getOutputMinFrameDuration.getValue(com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs.INSTANCE, com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs.getHighResolutionOutputSizeshNQ4ISI[5]))).intValue();
    }

    @Override // com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig
    public final java.util.Map<java.lang.String, java.lang.String> getSectionWiseAvailabilityDate() {
        java.util.Map map = (java.util.Map) this.Camera2StreamConfigurationMap.getValue((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs.getInputFormats.getValue(com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs.INSTANCE, com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs.getHighResolutionOutputSizeshNQ4ISI[6]));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(map.size()));
        for (java.util.Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return linkedHashMap;
    }

    @Override // com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig
    public final java.util.List<java.lang.String> getTaxDocumentSectionOrder() {
        return kotlin.collections.ArraysKt.toList((java.lang.Object[]) this.Camera2StreamConfigurationMap.getValue((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs.getHighSpeedVideoSizesFor.getValue(com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs.INSTANCE, com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs.getHighResolutionOutputSizeshNQ4ISI[7])));
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0087\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00048GX\u0087\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00048GX\u0087\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u00048GX\u0087\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0087\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00048GX\u0087\u0084\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R'\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00130\u00120\u00048GX\u0087\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R!\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00140\u00048GX\u0087\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/config/TaxDocumentsConfig$Specs;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfigurationSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "", "getHighSpeedVideoSizesFor", "Lkotlin/properties/ReadOnlyProperty;", "getHighSpeedVideoFpsRanges", "", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "", "Camera2StreamConfigurationMap", "getInputSizeshNQ4ISI", "getHighResolutionOutputSizeshNQ4ISI", "getInputFormats", "getOutputMinFrameDuration", "", "", "", "getOutputFormats"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    static final class Specs extends com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec {
        static final kotlin.properties.ReadOnlyProperty Camera2StreamConfigurationMap;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs INSTANCE;
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        static final kotlin.properties.ReadOnlyProperty getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        static final kotlin.properties.ReadOnlyProperty getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
        static final kotlin.properties.ReadOnlyProperty getHighSpeedVideoFpsRanges;

        /* renamed from: getInputFormats, reason: from kotlin metadata */
        static final kotlin.properties.ReadOnlyProperty getOutputMinFrameDuration;

        /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
        static final kotlin.properties.ReadOnlyProperty getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getOutputFormats, reason: from kotlin metadata */
        static final kotlin.properties.ReadOnlyProperty getHighSpeedVideoSizesFor;

        /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
        static final kotlin.properties.ReadOnlyProperty getInputFormats;

        private Specs() {
            super("tax_and_document_center", "tax_documents_config");
        }

        static {
            kotlin.reflect.KProperty1 property1 = kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs.class, "baseYear", "getBaseYear()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0));
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            getHighResolutionOutputSizeshNQ4ISI = new kotlin.reflect.KProperty[]{kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs.class, "isCountryEligible", "isCountryEligible()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0)), property1, kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs.class, "financialYearEndingMonth", "getFinancialYearEndingMonth()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs.class, "financialYearEndingDate", "getFinancialYearEndingDate()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs.class, "isYearInReview", "isYearInReview()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs.class, "ineligibilityCutoffBuffer", "getIneligibilityCutoffBuffer()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs.class, "sectionWiseAvailabilityDate", "getSectionWiseAvailabilityDate()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs.class, "taxDocumentSectionOrder", "getTaxDocumentSectionOrder()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0))};
            com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs specs = new com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig.Specs();
            INSTANCE = specs;
            getHighSpeedVideoFpsRanges = specs.create(bool, "is_country_eligible");
            getHighSpeedVideoSizes = specs.create("2021", "base_year");
            Camera2StreamConfigurationMap = specs.create(12, "financial_year_ending_month");
            getHighSpeedVideoFpsRangesFor = specs.create(31, "financial_year_ending_date");
            getHighResolutionOutputSizeshNQ4ISI = specs.create(bool, "is_year_in_review");
            getOutputMinFrameDuration = specs.create(30, "ineligibility_cutoff_buffer");
            getInputFormats = specs.create(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.SECTION_SALES, com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.STANDARD_AVAILABILITY_DATE), kotlin.TuplesKt.to(com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.SECTION_CRYPTO, com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.CRYPTO_AVAILABILITY_DATE), kotlin.TuplesKt.to(com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.SECTION_SAVINGS, com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.STANDARD_AVAILABILITY_DATE), kotlin.TuplesKt.to(com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.SECTION_REWARDS, com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.STANDARD_AVAILABILITY_DATE)), "section_wise_availability_date");
            getHighSpeedVideoSizesFor = specs.create(new java.lang.String[]{com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.SECTION_SALES, com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.SECTION_CRYPTO, com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.SECTION_SAVINGS, com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.SECTION_REWARDS}, "tax_document_section_order");
        }
    }
}
