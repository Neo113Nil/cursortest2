package com.paypal.oslo.feature.paypalassistant.ui.token;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR!\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/paypalassistant/ui/token/PdsTypographyResolver;", "", "<init>", "()V", "", "name", "Lcom/paypal/pds/core/Typography;", "findTypography", "(Ljava/lang/String;)Lcom/paypal/pds/core/Typography;", "", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PdsTypographyResolver {
    public static final com.paypal.oslo.feature.paypalassistant.ui.token.PdsTypographyResolver INSTANCE = new com.paypal.oslo.feature.paypalassistant.ui.token.PdsTypographyResolver();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final kotlin.Lazy getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.paypalassistant.ui.token.PdsTypographyResolver$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            java.util.Map mapOf;
            mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("bodylarge", com.paypal.pds.core.Typography.BodyLarge.INSTANCE), kotlin.TuplesKt.to("bodymedium", com.paypal.pds.core.Typography.BodyMedium.INSTANCE), kotlin.TuplesKt.to("bodysmall", com.paypal.pds.core.Typography.BodySmall.INSTANCE), kotlin.TuplesKt.to("displaylarge", com.paypal.pds.core.Typography.DisplayLarge.INSTANCE), kotlin.TuplesKt.to("displaymedium", com.paypal.pds.core.Typography.DisplayMedium.INSTANCE), kotlin.TuplesKt.to("displaysmall", com.paypal.pds.core.Typography.DisplaySmall.INSTANCE), kotlin.TuplesKt.to("headinglarge", com.paypal.pds.core.Typography.HeadingLarge.INSTANCE), kotlin.TuplesKt.to("headingmedium", com.paypal.pds.core.Typography.HeadingMedium.INSTANCE), kotlin.TuplesKt.to("headingsmall", com.paypal.pds.core.Typography.HeadingSmall.INSTANCE), kotlin.TuplesKt.to("labellarge", com.paypal.pds.core.Typography.LabelLarge.INSTANCE), kotlin.TuplesKt.to("labelmedium", com.paypal.pds.core.Typography.LabelMedium.INSTANCE), kotlin.TuplesKt.to("labelsmall", com.paypal.pds.core.Typography.LabelSmall.INSTANCE), kotlin.TuplesKt.to("linklarge", com.paypal.pds.core.Typography.LinkLarge.INSTANCE), kotlin.TuplesKt.to("linkmedium", com.paypal.pds.core.Typography.LinkMedium.INSTANCE), kotlin.TuplesKt.to("linksmall", com.paypal.pds.core.Typography.LinkSmall.INSTANCE), kotlin.TuplesKt.to("titlelarge", com.paypal.pds.core.Typography.TitleLarge.INSTANCE), kotlin.TuplesKt.to("titlemedium", com.paypal.pds.core.Typography.TitleMedium.INSTANCE));
            return mapOf;
        }
    });
    public static final int $stable = 8;

    private PdsTypographyResolver() {
    }

    public final com.paypal.pds.core.Typography findTypography(java.lang.String name2) {
        if (name2 == null) {
            return null;
        }
        java.util.Map map = (java.util.Map) getHighSpeedVideoFpsRanges.getValue();
        java.lang.String replace$default = kotlin.text.StringsKt.replace$default(name2, "_", "", false, 4, (java.lang.Object) null);
        java.util.Locale locale = java.util.Locale.ROOT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = replace$default.toLowerCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return (com.paypal.pds.core.Typography) map.get(lowerCase);
    }
}
