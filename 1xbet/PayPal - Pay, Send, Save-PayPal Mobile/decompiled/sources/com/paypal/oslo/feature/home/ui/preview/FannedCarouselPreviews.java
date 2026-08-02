package com.paypal.oslo.feature.home.ui.preview;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/preview/FannedCarouselPreviews;", "", "<init>", "()V", "", io.ktor.http.ContentDisposition.Parameters.Size, "", "Lcom/paypal/oslo/feature/home/domain/model/FannedCarouselItemData;", "createFannedCarouselDataItems$home_prodRelease", "(I)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FannedCarouselPreviews {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.home.ui.preview.FannedCarouselPreviews INSTANCE = new com.paypal.oslo.feature.home.ui.preview.FannedCarouselPreviews();

    private FannedCarouselPreviews() {
    }

    public final java.util.List<com.paypal.oslo.feature.home.domain.model.FannedCarouselItemData> createFannedCarouselDataItems$home_prodRelease(int size) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < size; i++) {
            java.lang.String concat = "Item-".concat(java.lang.String.valueOf(i));
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item ");
            sb.append(i);
            sb.append(" copy");
            java.lang.String str = (java.lang.String) kotlin.collections.CollectionsKt.random(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{sb.toString(), null}), kotlin.random.Random.INSTANCE);
            arrayList.add(new com.paypal.oslo.feature.home.domain.model.FannedCarouselItemData(java.lang.String.valueOf(i), "imageUrl/".concat(java.lang.String.valueOf(i)), concat, str, (java.lang.String) kotlin.collections.CollectionsKt.random(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{null, "#FF0000", "#00FF00", "#0000FF"}), kotlin.random.Random.INSTANCE), (java.lang.String) kotlin.collections.CollectionsKt.random(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{null, "#0CFEFE"}), kotlin.random.Random.INSTANCE), null, null, null, null, 960, null));
        }
        return arrayList;
    }
}
