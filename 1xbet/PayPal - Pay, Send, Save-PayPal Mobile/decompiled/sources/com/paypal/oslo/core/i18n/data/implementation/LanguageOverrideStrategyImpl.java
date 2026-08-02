package com.paypal.oslo.core.i18n.data.implementation;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR,\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\n\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/i18n/data/implementation/LanguageOverrideStrategyImpl;", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LanguageOverrideStrategy;", "<init>", "()V", "", com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY, com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "override", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "Lkotlin/Pair;", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LanguageOverrideStrategyImpl implements com.paypal.oslo.core.i18n.domain.interfaces.LanguageOverrideStrategy {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Map<kotlin.Pair<java.lang.String, java.lang.String>, java.lang.String> Camera2StreamConfigurationMap = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(new kotlin.Pair("IL", "iw"), "he"), kotlin.TuplesKt.to(new kotlin.Pair("ID", "in"), "id"), kotlin.TuplesKt.to(new kotlin.Pair("PH", "fil"), "tl"));

    @javax.inject.Inject
    public LanguageOverrideStrategyImpl() {
    }

    @Override // com.paypal.oslo.core.i18n.domain.interfaces.LanguageOverrideStrategy
    public final java.lang.String override(java.lang.String language, java.lang.String country) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(language, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
        java.lang.String str = this.Camera2StreamConfigurationMap.get(new kotlin.Pair(country, language));
        if (str == null) {
            return language;
        }
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Language override applied", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("overriddenLanguage", str), kotlin.TuplesKt.to(com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, country)), null, 4, null);
        return str;
    }
}
