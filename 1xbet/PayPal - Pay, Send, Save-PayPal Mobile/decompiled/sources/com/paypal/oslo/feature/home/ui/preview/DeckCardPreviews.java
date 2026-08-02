package com.paypal.oslo.feature.home.ui.preview;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J{\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00142\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/preview/DeckCardPreviews;", "", "<init>", "()V", "", "id", "title", "highlightedTitle", "backgroundImageUrl", "primaryQualifier", "merchantName", "merchantLogoUrl", "buttonText", "subtitle", "storeUrl", "Lcom/paypal/oslo/feature/home/domain/model/DeckCardContent;", "createSampleDeckCard$home_prodRelease", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/home/domain/model/DeckCardContent;", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "", "createSampleDeckCards$home_prodRelease", "(I)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeckCardPreviews {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.home.ui.preview.DeckCardPreviews INSTANCE = new com.paypal.oslo.feature.home.ui.preview.DeckCardPreviews();

    private DeckCardPreviews() {
    }

    public static /* synthetic */ com.paypal.oslo.feature.home.domain.model.DeckCardContent createSampleDeckCard$home_prodRelease$default(com.paypal.oslo.feature.home.ui.preview.DeckCardPreviews deckCardPreviews, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, int i, java.lang.Object obj) {
        return deckCardPreviews.createSampleDeckCard$home_prodRelease((i & 1) != 0 ? "deck-".concat(java.lang.String.valueOf(java.lang.System.currentTimeMillis())) : str, (i & 2) != 0 ? "for every season" : str2, (i & 4) != 0 ? "Fan gear" : str3, (i & 8) != 0 ? "https://images.unsplash.com/photo-1577212017446-742c243ab835" : str4, (i & 16) != 0 ? "Pay in 4. Interest-free" : str5, (i & 32) != 0 ? "Nike" : str6, (i & 64) != 0 ? "https://logo.clearbit.com/nike.com" : str7, (i & 128) != 0 ? "Shop" : str8, (i & 256) != 0 ? "Sponsored" : str9, (i & 512) != 0 ? "https://www.nike.com" : str10);
    }

    public final com.paypal.oslo.feature.home.domain.model.DeckCardContent createSampleDeckCard$home_prodRelease(java.lang.String id, java.lang.String title, java.lang.String highlightedTitle, java.lang.String backgroundImageUrl, java.lang.String primaryQualifier, java.lang.String merchantName, java.lang.String merchantLogoUrl, java.lang.String buttonText, java.lang.String subtitle, java.lang.String storeUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundImageUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantLogoUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonText, "");
        return new com.paypal.oslo.feature.home.domain.model.DeckCardContent(id, title, highlightedTitle, backgroundImageUrl, primaryQualifier, merchantName, merchantLogoUrl, buttonText, subtitle, storeUrl, null, null, null, 7168, null);
    }

    public static /* synthetic */ java.util.List createSampleDeckCards$home_prodRelease$default(com.paypal.oslo.feature.home.ui.preview.DeckCardPreviews deckCardPreviews, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 3;
        }
        return deckCardPreviews.createSampleDeckCards$home_prodRelease(i);
    }

    public final java.util.List<com.paypal.oslo.feature.home.domain.model.DeckCardContent> createSampleDeckCards$home_prodRelease(int count) {
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.home.domain.model.DeckCardContent[]{createSampleDeckCard$home_prodRelease$default(this, "deck-1", "for every season", "Fan gear", "https://images.unsplash.com/photo-1577212017446-742c243ab835", null, "Nike", null, null, null, null, 976, null), createSampleDeckCard$home_prodRelease$default(this, "deck-2", "Watch like you're there", null, "https://images.unsplash.com/photo-1593305841991-05c297ba4575", null, "Amazon", "https://logo.clearbit.com/amazon.com", null, null, "https://www.amazon.com", 400, null), createSampleDeckCard$home_prodRelease$default(this, "deck-3", "TVs under $300", "Summer sale", "https://images.unsplash.com/photo-1552975084-6e027cd345c2", null, "Walmart", "https://logo.clearbit.com/walmart.com", null, null, "https://www.walmart.com", 400, null), createSampleDeckCard$home_prodRelease$default(this, "deck-4", "Back to School", "Save big", "https://images.unsplash.com/photo-1503676260728-1c00da094a0b", null, "Target", "https://logo.clearbit.com/target.com", null, null, "https://www.target.com", 400, null), createSampleDeckCard$home_prodRelease$default(this, "deck-5", "New Arrivals", "Fall Fashion", "https://images.unsplash.com/photo-1483985988355-763728e1935b", null, "H&M", "https://logo.clearbit.com/hm.com", null, null, "https://www.hm.com", 400, null)});
        return kotlin.collections.CollectionsKt.take(listOf, kotlin.ranges.RangesKt.coerceAtMost(count, listOf.size()));
    }
}
