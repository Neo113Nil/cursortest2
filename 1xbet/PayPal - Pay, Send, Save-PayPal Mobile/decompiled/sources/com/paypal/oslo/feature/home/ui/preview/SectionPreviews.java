package com.paypal.oslo.feature.home.ui.preview;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jc\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\n2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/preview/SectionPreviews;", "", "<init>", "()V", "T", "", "id", "type", "title", "subtitle", "", "items", "buttonText", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "createSection$home_prodRelease", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/home/domain/model/Section;", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "createSampleSections$home_prodRelease", "(I)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SectionPreviews {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.home.ui.preview.SectionPreviews INSTANCE = new com.paypal.oslo.feature.home.ui.preview.SectionPreviews();

    private SectionPreviews() {
    }

    public static /* synthetic */ com.paypal.oslo.feature.home.domain.model.Section createSection$home_prodRelease$default(com.paypal.oslo.feature.home.ui.preview.SectionPreviews sectionPreviews, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "preview-section-".concat(java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        }
        if ((i & 2) != 0) {
            str2 = "unknown";
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = "Preview Section";
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = "Preview Subtitle";
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list2 = list;
        if ((i & 32) != 0) {
            str5 = "View All";
        }
        return sectionPreviews.createSection$home_prodRelease(str, str6, str7, str8, list2, str5);
    }

    public final <T> com.paypal.oslo.feature.home.domain.model.Section<T> createSection$home_prodRelease(java.lang.String id, java.lang.String type, java.lang.String title, java.lang.String subtitle, java.util.List<? extends T> items, java.lang.String buttonText) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
        return new com.paypal.oslo.feature.home.domain.model.Section<>(id, type, title, subtitle, items, buttonText, (java.lang.String) null, (com.paypal.oslo.feature.home.domain.model.SectionInstrumentation) null, 192, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static /* synthetic */ java.util.List createSampleSections$home_prodRelease$default(com.paypal.oslo.feature.home.ui.preview.SectionPreviews sectionPreviews, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        return sectionPreviews.createSampleSections$home_prodRelease(i);
    }

    public final java.util.List<com.paypal.oslo.feature.home.domain.model.Section<?>> createSampleSections$home_prodRelease(int count) {
        java.util.List<com.paypal.oslo.feature.home.domain.model.Merchant> createSampleMerchants$home_prodRelease = com.paypal.oslo.feature.home.ui.preview.MerchantPreviews.INSTANCE.createSampleMerchants$home_prodRelease(5);
        java.util.List<com.paypal.oslo.feature.home.domain.model.HeroProduct> createSampleHeroProducts$home_prodRelease = com.paypal.oslo.feature.home.ui.preview.HeroPreviews.INSTANCE.createSampleHeroProducts$home_prodRelease(7);
        java.util.List<com.paypal.oslo.feature.home.domain.model.LargeTileContent> createSampleLargeTiles$home_prodRelease = com.paypal.oslo.feature.home.ui.preview.LargeTilePreviews.INSTANCE.createSampleLargeTiles$home_prodRelease(4);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(createSection$home_prodRelease$default(this, "next-best-action", null, "Score bonus", "PayPal+ points", com.paypal.oslo.feature.home.ui.preview.NextBestActionPreviews.INSTANCE.createSampleActionItems$home_prodRelease(3), "View All", 2, null));
        for (int i = 0; i < count; i++) {
            com.paypal.oslo.feature.home.ui.preview.SectionPreviews sectionPreviews = INSTANCE;
            arrayList.add(createSection$home_prodRelease$default(sectionPreviews, "section-".concat(java.lang.String.valueOf(i)), null, "Section ".concat(java.lang.String.valueOf(i)), "Check out this section ".concat(java.lang.String.valueOf(i)), kotlin.collections.CollectionsKt.take(kotlin.collections.CollectionsKt.shuffled(createSampleMerchants$home_prodRelease), kotlin.random.Random.INSTANCE.nextInt(1, 6)), "View all button", 2, null));
            arrayList.add(createSection$home_prodRelease$default(sectionPreviews, "section-".concat(java.lang.String.valueOf(i)), null, "Section ".concat(java.lang.String.valueOf(i)), "Check out this section ".concat(java.lang.String.valueOf(i)), kotlin.collections.CollectionsKt.take(kotlin.collections.CollectionsKt.shuffled(createSampleHeroProducts$home_prodRelease), kotlin.random.Random.INSTANCE.nextInt(1, 7)), "View all button", 2, null));
            arrayList.add(createSection$home_prodRelease$default(sectionPreviews, "large-tile-section-".concat(java.lang.String.valueOf(i)), null, "Featured Content ".concat(java.lang.String.valueOf(i)), "Exclusive offers and rewards", kotlin.collections.CollectionsKt.take(kotlin.collections.CollectionsKt.shuffled(createSampleLargeTiles$home_prodRelease), kotlin.random.Random.INSTANCE.nextInt(1, 5)), "See all featured content", 2, null));
        }
        return kotlin.collections.CollectionsKt.shuffled(arrayList);
    }
}
