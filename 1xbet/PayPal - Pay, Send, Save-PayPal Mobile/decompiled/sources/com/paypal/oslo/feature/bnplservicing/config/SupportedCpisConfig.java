package com.paypal.oslo.feature.bnplservicing.config;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\tJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000b\u0010\tJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0004\b\u0013\u0010\tR\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/config/SupportedCpisConfig;", "", "Lcom/paypal/oslo/feature/bnplservicing/config/ConfigContext;", "configContext", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/config/ConfigContext;)V", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "supportedCpis", "()Ljava/util/List;", "supportedPrequalCpis", "supportedInstoreCpis", "Lcom/paypal/oslo/feature/bnplservicing/config/SupportedCpisConfig$CpiType;", "cpiType", "", "supports", "(Lcom/paypal/oslo/feature/bnplservicing/config/SupportedCpisConfig$CpiType;)Z", "cpiFor", "(Lcom/paypal/oslo/feature/bnplservicing/config/SupportedCpisConfig$CpiType;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "supportedCpiTypes", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/bnplservicing/config/ConfigContext;", "getHighSpeedVideoSizes", "Companion", "CpiType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SupportedCpisConfig {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.config.ConfigContext getHighSpeedVideoSizes;
    public static final int $stable = 8;
    private static final java.util.Map<com.paypal.oslo.feature.bnplservicing.config.Country, java.util.Map<com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier>> Camera2StreamConfigurationMap = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.Country.US, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType.SHORT_TERM, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_US), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType.LONG_TERM, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_LONG_TERM_US))), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.Country.DE, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType.LONG_TERM, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_DE), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType.PAY_IN_1, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_PAY_IN_1_DE))), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.Country.AU, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType.SHORT_TERM, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_AU))), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.Country.CA, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType.SHORT_TERM, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_SHORT_TERM_CA))), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.Country.FR, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType.SHORT_TERM, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_FR), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType.LONG_TERM, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_LONG_TERM_FR))), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.Country.ES, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType.SHORT_TERM, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_SHORT_TERM_ES), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType.LONG_TERM, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_LONG_TERM_ES))), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.Country.IT, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType.SHORT_TERM, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_SHORT_TERM_IT), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType.LONG_TERM, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_LONG_TERM_IT))), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.Country.GB, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType.SHORT_TERM, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_GB))), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.Country.AT, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType.LONG_TERM, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_LONG_TERM_AT), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType.PAY_IN_1, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_PAY_IN_1_AT))));
    private static final java.util.Map<com.paypal.oslo.feature.bnplservicing.config.Country, java.util.Map<com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier>> getHighSpeedVideoSizes = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.Country.US, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType.SHORT_TERM, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_US))), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.Country.DE, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType.LONG_TERM, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_DE))), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.Country.AU, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType.SHORT_TERM, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_AU))), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.Country.FR, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType.SHORT_TERM, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_FR))), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.Country.ES, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType.SHORT_TERM, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_SHORT_TERM_ES))), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.Country.IT, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType.SHORT_TERM, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_SHORT_TERM_IT))), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.Country.GB, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType.SHORT_TERM, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_GB))));
    private static final java.util.Map<com.paypal.oslo.feature.bnplservicing.config.Country, java.util.Map<com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier>> getHighSpeedVideoFpsRangesFor = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.Country.US, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType.LONG_TERM, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_LONG_TERM_US))), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.Country.DE, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType.LONG_TERM, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_DE))), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.Country.AT, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType.LONG_TERM, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_LONG_TERM_AT))));

    @javax.inject.Inject
    public SupportedCpisConfig(com.paypal.oslo.feature.bnplservicing.config.ConfigContext configContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
        this.getHighSpeedVideoSizes = configContext;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/config/SupportedCpisConfig$CpiType;", "", "<init>", "(Ljava/lang/String;I)V", "LONG_TERM", "SHORT_TERM", "PAY_IN_1"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CpiType {
        private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType[] Camera2StreamConfigurationMap;
        public static final com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType LONG_TERM;
        public static final com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType PAY_IN_1;
        public static final com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType SHORT_TERM;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

        private CpiType(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType cpiType = new com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType("LONG_TERM", 0);
            LONG_TERM = cpiType;
            com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType cpiType2 = new com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType("SHORT_TERM", 1);
            SHORT_TERM = cpiType2;
            com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType cpiType3 = new com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType("PAY_IN_1", 2);
            PAY_IN_1 = cpiType3;
            com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType[] cpiTypeArr = {cpiType, cpiType2, cpiType3};
            Camera2StreamConfigurationMap = cpiTypeArr;
            getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(cpiTypeArr);
        }

        public static com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType[] values() {
            return (com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType[]) Camera2StreamConfigurationMap.clone();
        }

        public static com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType> getEntries() {
            return getHighSpeedVideoFpsRangesFor;
        }
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> supportedCpis() {
        java.util.Collection<com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> values;
        java.util.Map<com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> map = Camera2StreamConfigurationMap.get(this.getHighSpeedVideoSizes.getCountry());
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> list = (map == null || (values = map.values()) == null) ? null : kotlin.collections.CollectionsKt.toList(values);
        return list == null ? kotlin.collections.CollectionsKt.emptyList() : list;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> supportedPrequalCpis() {
        java.util.Collection<com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> values;
        java.util.Map<com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> map = getHighSpeedVideoSizes.get(this.getHighSpeedVideoSizes.getCountry());
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> list = (map == null || (values = map.values()) == null) ? null : kotlin.collections.CollectionsKt.toList(values);
        return list == null ? kotlin.collections.CollectionsKt.emptyList() : list;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> supportedInstoreCpis() {
        java.util.Collection<com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> values;
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> list;
        java.util.Map<com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> map = getHighSpeedVideoFpsRangesFor.get(this.getHighSpeedVideoSizes.getCountry());
        return (map == null || (values = map.values()) == null || (list = kotlin.collections.CollectionsKt.toList(values)) == null) ? kotlin.collections.CollectionsKt.emptyList() : list;
    }

    public final boolean supports(com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType cpiType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpiType, "");
        java.util.Map<com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> map = Camera2StreamConfigurationMap.get(this.getHighSpeedVideoSizes.getCountry());
        if (map != null) {
            return map.containsKey(cpiType);
        }
        return false;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier cpiFor(com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType cpiType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpiType, "");
        java.util.Map<com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> map = Camera2StreamConfigurationMap.get(this.getHighSpeedVideoSizes.getCountry());
        if (map != null) {
            return map.get(cpiType);
        }
        return null;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType> supportedCpiTypes() {
        java.util.Set<com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType> keySet;
        java.util.List<com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType> list;
        java.util.Map<com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig.CpiType, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> map = Camera2StreamConfigurationMap.get(this.getHighSpeedVideoSizes.getCountry());
        return (map == null || (keySet = map.keySet()) == null || (list = kotlin.collections.CollectionsKt.toList(keySet)) == null) ? kotlin.collections.CollectionsKt.emptyList() : list;
    }
}
