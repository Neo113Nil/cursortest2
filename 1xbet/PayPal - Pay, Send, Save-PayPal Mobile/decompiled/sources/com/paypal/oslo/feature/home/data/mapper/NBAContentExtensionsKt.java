package com.paypal.oslo.feature.home.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$NbaContent;", "Lcom/paypal/oslo/feature/home/data/mapper/ValidatedNBAContent;", "toValidatedContentOrLog", "(Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$NbaContent;)Lcom/paypal/oslo/feature/home/data/mapper/ValidatedNBAContent;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NBAContentExtensionsKt {
    public static final com.paypal.oslo.feature.home.data.mapper.ValidatedNBAContent toValidatedContentOrLog(com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.NbaContent nbaContent) {
        java.lang.Object url;
        java.lang.String obj;
        com.paypal.oslo.feature.home.domain.model.NbaCtaType nbaCtaType;
        com.paypal.oslo.api.graphql.schema.type.CTAType type;
        com.paypal.oslo.feature.home.domain.model.NbaCtaType nbaCtaType2;
        java.lang.Object url2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nbaContent, "");
        com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnURLIcon1 onURLIcon = nbaContent.getVisualAsset().getOnURLIcon();
        if (onURLIcon != null && (url = onURLIcon.getUrl()) != null && (obj = url.toString()) != null) {
            java.lang.String id = nbaContent.getId();
            java.lang.String description = nbaContent.getDescription();
            java.lang.String str = description == null ? "" : description;
            java.lang.String subDescription = nbaContent.getSubDescription();
            com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.Cta cta = nbaContent.getCta();
            java.lang.String text = cta != null ? cta.getText() : null;
            java.lang.String str2 = text == null ? "" : text;
            com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.Cta cta2 = nbaContent.getCta();
            java.lang.String obj2 = (cta2 == null || (url2 = cta2.getUrl()) == null) ? null : url2.toString();
            com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.Cta cta3 = nbaContent.getCta();
            if (cta3 == null || (type = cta3.getType()) == null) {
                nbaCtaType = null;
            } else {
                int i = com.paypal.oslo.feature.home.data.mapper.NBAContentExtensionsKt.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                if (i == 1) {
                    nbaCtaType2 = com.paypal.oslo.feature.home.domain.model.NbaCtaType.SECURE_WEBVIEW;
                } else if (i == 2) {
                    nbaCtaType2 = com.paypal.oslo.feature.home.domain.model.NbaCtaType.NATIVE;
                } else {
                    nbaCtaType2 = i != 3 ? null : com.paypal.oslo.feature.home.domain.model.NbaCtaType.IAB;
                }
                nbaCtaType = nbaCtaType2;
            }
            com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.Cta cta4 = nbaContent.getCta();
            return new com.paypal.oslo.feature.home.data.mapper.ValidatedNBAContent(id, obj, str, subDescription, str2, obj2, nbaCtaType, cta4 != null ? cta4.getNativeId() : null);
        }
        com.paypal.android.logger.standardized.LoggerExtensionsKt.w$default(com.paypal.oslo.feature.home.LoggerKt.log, com.paypal.android.logger.categories.Data.Warning.INSTANCE, "NBA content dropped: missing visualAsset URL", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("nbaId", nbaContent.getId())), null, 8, null);
        return null;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.CTAType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CTAType.SECURE_WEBVIEW.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CTAType.NATIVE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CTAType.IAB.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
