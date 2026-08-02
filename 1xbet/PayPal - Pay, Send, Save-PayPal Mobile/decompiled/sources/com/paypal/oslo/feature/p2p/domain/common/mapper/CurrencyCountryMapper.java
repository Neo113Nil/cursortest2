package com.paypal.oslo.feature.p2p.domain.common.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/common/mapper/CurrencyCountryMapper;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "", "<init>", "()V", "input", "map", "(Ljava/lang/String;)Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CurrencyCountryMapper implements com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<java.lang.String, java.lang.String> {
    public static final int $stable = 0;
    private static final com.paypal.oslo.feature.p2p.domain.common.mapper.CurrencyCountryMapper.Companion Companion = new com.paypal.oslo.feature.p2p.domain.common.mapper.CurrencyCountryMapper.Companion(null);
    private static final java.util.Map<java.lang.String, java.lang.String> Camera2StreamConfigurationMap = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("DNK", "DK"));

    @javax.inject.Inject
    public CurrencyCountryMapper() {
    }

    @Override // com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper
    public final java.lang.String map(java.lang.String input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.util.Map<java.lang.String, java.lang.String> map = Camera2StreamConfigurationMap;
        java.lang.String upperCase = input.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        java.lang.String str = map.get(upperCase);
        if (str != null) {
            return str;
        }
        java.lang.String upperCase2 = kotlin.text.StringsKt.take(input, 2).toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase2, "");
        return upperCase2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/common/mapper/CurrencyCountryMapper$Companion;", "", "<init>", "()V", "", "", "Camera2StreamConfigurationMap", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
