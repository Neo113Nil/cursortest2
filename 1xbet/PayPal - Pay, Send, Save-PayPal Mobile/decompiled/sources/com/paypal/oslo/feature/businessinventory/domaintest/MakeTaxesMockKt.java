package com.paypal.oslo.feature.businessinventory.domaintest;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\t\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "makeTaxesMock", "()Ljava/util/List;", "", "id", "label", "Ljava/math/BigDecimal;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "makeTaxMock", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MakeTaxesMockKt {
    public static final java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption> makeTaxesMock() {
        int i = 0;
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{kotlin.TuplesKt.to("State Tax", new java.math.BigDecimal("8.5")), kotlin.TuplesKt.to("Tax02", new java.math.BigDecimal("8.0")), kotlin.TuplesKt.to("Tax03", new java.math.BigDecimal("9.0")), kotlin.TuplesKt.to("Tax04", new java.math.BigDecimal("10.0")), kotlin.TuplesKt.to("Tax05", new java.math.BigDecimal("11.0")), kotlin.TuplesKt.to("Tax06", new java.math.BigDecimal("12.5")), kotlin.TuplesKt.to("Tax07", new java.math.BigDecimal("25.0")), kotlin.TuplesKt.to("Tax11", new java.math.BigDecimal(com.caverock.androidsvg.BuildConfig.VERSION_NAME)), kotlin.TuplesKt.to("Tax12", new java.math.BigDecimal("8.0")), kotlin.TuplesKt.to("Tax13", new java.math.BigDecimal("9.0")), kotlin.TuplesKt.to("Tax14", new java.math.BigDecimal("10.0")), kotlin.TuplesKt.to("Tax15", new java.math.BigDecimal("11.0")), kotlin.TuplesKt.to("Tax16", new java.math.BigDecimal("12.5")), kotlin.TuplesKt.to("Tax17", new java.math.BigDecimal("25.0")), kotlin.TuplesKt.to("Tax21", new java.math.BigDecimal(com.caverock.androidsvg.BuildConfig.VERSION_NAME)), kotlin.TuplesKt.to("Tax22", new java.math.BigDecimal("8.0")), kotlin.TuplesKt.to("Tax23", new java.math.BigDecimal("9.0")), kotlin.TuplesKt.to("Tax24", new java.math.BigDecimal("10.0")), kotlin.TuplesKt.to("Tax25", new java.math.BigDecimal("11.0")), kotlin.TuplesKt.to("Tax26", new java.math.BigDecimal("12.5")), kotlin.TuplesKt.to("Tax27", new java.math.BigDecimal("25.0")), kotlin.TuplesKt.to("Tax31", new java.math.BigDecimal(com.caverock.androidsvg.BuildConfig.VERSION_NAME)), kotlin.TuplesKt.to("Tax32", new java.math.BigDecimal("8.0")), kotlin.TuplesKt.to("Tax33", new java.math.BigDecimal("9.0")), kotlin.TuplesKt.to("Tax34", new java.math.BigDecimal("10.0")), kotlin.TuplesKt.to("Tax35", new java.math.BigDecimal("11.0")), kotlin.TuplesKt.to("Tax36", new java.math.BigDecimal("12.5")), kotlin.TuplesKt.to("Tax37", new java.math.BigDecimal("25.0")), kotlin.TuplesKt.to("Tax41", new java.math.BigDecimal(com.caverock.androidsvg.BuildConfig.VERSION_NAME)), kotlin.TuplesKt.to("Tax42", new java.math.BigDecimal("8.0")), kotlin.TuplesKt.to("Tax43", new java.math.BigDecimal("9.0")), kotlin.TuplesKt.to("Tax44", new java.math.BigDecimal("10.0")), kotlin.TuplesKt.to("Tax45", new java.math.BigDecimal("11.0")), kotlin.TuplesKt.to("Tax46", new java.math.BigDecimal("12.5")), kotlin.TuplesKt.to("Tax47", new java.math.BigDecimal("25.0")), kotlin.TuplesKt.to("Tax51", new java.math.BigDecimal(com.caverock.androidsvg.BuildConfig.VERSION_NAME)), kotlin.TuplesKt.to("Tax52", new java.math.BigDecimal("8.0")), kotlin.TuplesKt.to("Tax53", new java.math.BigDecimal("9.0")), kotlin.TuplesKt.to("Tax54", new java.math.BigDecimal("10.0")), kotlin.TuplesKt.to("Tax55", new java.math.BigDecimal("11.0")), kotlin.TuplesKt.to("Tax56", new java.math.BigDecimal("12.5")), kotlin.TuplesKt.to("Tax57", new java.math.BigDecimal("25.0"))});
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listOf, 10));
        for (java.lang.Object obj : listOf) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            kotlin.Pair pair = (kotlin.Pair) obj;
            arrayList.add(makeTaxMock(java.lang.String.valueOf(i), (java.lang.String) pair.component1(), (java.math.BigDecimal) pair.component2()));
            i++;
        }
        return arrayList;
    }

    public static final com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption makeTaxMock(java.lang.String str, java.lang.String str2, java.math.BigDecimal bigDecimal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "");
        return new com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption(str, str2, bigDecimal.doubleValue());
    }
}
