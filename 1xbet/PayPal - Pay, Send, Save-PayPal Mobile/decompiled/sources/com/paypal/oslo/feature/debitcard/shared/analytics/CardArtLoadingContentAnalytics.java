package com.paypal.oslo.feature.debitcard.shared.analytics;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/analytics/CardArtLoadingContentAnalytics;", "", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "CARD_ART_LOADING_CONTENT", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "getCARD_ART_LOADING_CONTENT", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "CARD_ART_IMAGE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getCARD_ART_IMAGE", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "CARD_ART_MESSAGE", "getCARD_ART_MESSAGE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CardArtLoadingContentAnalytics {
    public static final int $stable;
    public static final com.paypal.oslo.feature.debitcard.shared.analytics.CardArtLoadingContentAnalytics INSTANCE = new com.paypal.oslo.feature.debitcard.shared.analytics.CardArtLoadingContentAnalytics();
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component CARD_ART_LOADING_CONTENT = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("card_art_loading_content", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CARD_ART_IMAGE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.cashin.ui.barcode.composable.DebitCardKt.CardArtImageTestTag, 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CARD_ART_MESSAGE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("card_art_message", 0, 2, null);

    private CardArtLoadingContentAnalytics() {
    }

    static {
        int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
        $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getCARD_ART_LOADING_CONTENT() {
        return CARD_ART_LOADING_CONTENT;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCARD_ART_IMAGE() {
        return CARD_ART_IMAGE;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCARD_ART_MESSAGE() {
        return CARD_ART_MESSAGE;
    }
}
