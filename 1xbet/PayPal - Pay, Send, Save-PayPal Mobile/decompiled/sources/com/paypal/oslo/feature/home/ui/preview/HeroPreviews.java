package com.paypal.oslo.feature.home.ui.preview;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/preview/HeroPreviews;", "", "<init>", "()V", "", "id", "name", "logoUrl", "label", "", "qualifiers", "Lcom/paypal/oslo/feature/home/domain/model/HeroProduct;", "createHeroProduct$home_prodRelease", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/home/domain/model/HeroProduct;", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "createSampleHeroProducts$home_prodRelease", "(I)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HeroPreviews {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.home.ui.preview.HeroPreviews INSTANCE = new com.paypal.oslo.feature.home.ui.preview.HeroPreviews();

    private HeroPreviews() {
    }

    public static /* synthetic */ com.paypal.oslo.feature.home.domain.model.HeroProduct createHeroProduct$home_prodRelease$default(com.paypal.oslo.feature.home.ui.preview.HeroPreviews heroPreviews, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "preview-hero-".concat(java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        }
        if ((i & 2) != 0) {
            str2 = "Preview Hero";
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = "https://preview.url/logo.png";
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = "Preview Hero Label";
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        return heroPreviews.createHeroProduct$home_prodRelease(str, str5, str6, str7, list);
    }

    public final com.paypal.oslo.feature.home.domain.model.HeroProduct createHeroProduct$home_prodRelease(java.lang.String id, java.lang.String name2, java.lang.String logoUrl, java.lang.String label, java.util.List<java.lang.String> qualifiers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logoUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qualifiers, "");
        return new com.paypal.oslo.feature.home.domain.model.HeroProduct(id, name2, logoUrl, label, qualifiers, null, null, null, null, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, null);
    }

    public static /* synthetic */ java.util.List createSampleHeroProducts$home_prodRelease$default(com.paypal.oslo.feature.home.ui.preview.HeroPreviews heroPreviews, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 3;
        }
        return heroPreviews.createSampleHeroProducts$home_prodRelease(i);
    }

    public final java.util.List<com.paypal.oslo.feature.home.domain.model.HeroProduct> createSampleHeroProducts$home_prodRelease(int count) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < count; i++) {
            arrayList.add(INSTANCE.createHeroProduct$home_prodRelease("hero-".concat(java.lang.String.valueOf(i)), "Hero ".concat(java.lang.String.valueOf(i)), "https://preview.url/".concat(java.lang.String.valueOf(i)), "Label ".concat(java.lang.String.valueOf(i)), kotlin.collections.CollectionsKt.listOf("Limited time")));
        }
        return arrayList;
    }
}
