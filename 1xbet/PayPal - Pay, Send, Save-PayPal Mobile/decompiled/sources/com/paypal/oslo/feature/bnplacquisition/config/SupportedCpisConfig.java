package com.paypal.oslo.feature.bnplacquisition.config;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0012B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/config/SupportedCpisConfig;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplacquisition/config/Country;", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;", "supportedCpis", "(Lcom/paypal/oslo/feature/bnplacquisition/config/Country;)Ljava/util/List;", "Lcom/paypal/oslo/feature/bnplacquisition/config/SupportedCpisConfig$CpiType;", "cpiType", "", "supports", "(Lcom/paypal/oslo/feature/bnplacquisition/config/SupportedCpisConfig$CpiType;Lcom/paypal/oslo/feature/bnplacquisition/config/Country;)Z", "cpiFor", "(Lcom/paypal/oslo/feature/bnplacquisition/config/SupportedCpisConfig$CpiType;Lcom/paypal/oslo/feature/bnplacquisition/config/Country;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;", "supportedCpiTypes", "Companion", "CpiType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SupportedCpisConfig {
    public static final int $stable = 0;
    private static final java.util.Map<com.paypal.oslo.feature.bnplacquisition.config.Country, java.util.Map<com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType, com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier>> getHighSpeedVideoFpsRanges = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplacquisition.config.Country.US, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType.LONG_TERM, com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.PAY_LATER_LONG_TERM_US), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType.SHORT_TERM, com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.PAY_LATER_US))), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplacquisition.config.Country.DE, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType.LONG_TERM, com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.PAY_LATER_DE))));

    @javax.inject.Inject
    public SupportedCpisConfig() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/config/SupportedCpisConfig$CpiType;", "", "<init>", "(Ljava/lang/String;I)V", "LONG_TERM", "SHORT_TERM"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CpiType {
        public static final com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType LONG_TERM;
        public static final com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType SHORT_TERM;
        private static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType[] getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

        private CpiType(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType cpiType = new com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType("LONG_TERM", 0);
            LONG_TERM = cpiType;
            com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType cpiType2 = new com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType("SHORT_TERM", 1);
            SHORT_TERM = cpiType2;
            com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType[] cpiTypeArr = {cpiType, cpiType2};
            getHighResolutionOutputSizeshNQ4ISI = cpiTypeArr;
            getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(cpiTypeArr);
        }

        public static com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType[] values() {
            return (com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
        }

        public static com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType> getEntries() {
            return getHighSpeedVideoFpsRanges;
        }
    }

    public final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier> supportedCpis(com.paypal.oslo.feature.bnplacquisition.config.Country country) {
        java.util.Collection<com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier> values;
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier> list;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
        java.util.Map<com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType, com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier> map = getHighSpeedVideoFpsRanges.get(country);
        return (map == null || (values = map.values()) == null || (list = kotlin.collections.CollectionsKt.toList(values)) == null) ? kotlin.collections.CollectionsKt.emptyList() : list;
    }

    public final boolean supports(com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType cpiType, com.paypal.oslo.feature.bnplacquisition.config.Country country) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpiType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
        java.util.Map<com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType, com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier> map = getHighSpeedVideoFpsRanges.get(country);
        if (map != null) {
            return map.containsKey(cpiType);
        }
        return false;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier cpiFor(com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType cpiType, com.paypal.oslo.feature.bnplacquisition.config.Country country) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpiType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
        java.util.Map<com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType, com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier> map = getHighSpeedVideoFpsRanges.get(country);
        if (map != null) {
            return map.get(cpiType);
        }
        return null;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType> supportedCpiTypes(com.paypal.oslo.feature.bnplacquisition.config.Country country) {
        java.util.Set<com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType> keySet;
        java.util.List<com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType> list;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
        java.util.Map<com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig.CpiType, com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier> map = getHighSpeedVideoFpsRanges.get(country);
        return (map == null || (keySet = map.keySet()) == null || (list = kotlin.collections.CollectionsKt.toList(keySet)) == null) ? kotlin.collections.CollectionsKt.emptyList() : list;
    }
}
