package com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder;

/* loaded from: classes15.dex */
public final class SectionReportSorter_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SectionReportSorter> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SectionReportSorter get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SectionReportSorter_Factory create() {
        return com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SectionReportSorter_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SectionReportSorter newInstance() {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SectionReportSorter();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SectionReportSorter_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SectionReportSorter_Factory();

        private InstanceHolder() {
        }
    }
}
