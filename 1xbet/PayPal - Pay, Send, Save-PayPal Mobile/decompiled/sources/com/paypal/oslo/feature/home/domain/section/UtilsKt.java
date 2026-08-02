package com.paypal.oslo.feature.home.domain.section;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u0006\u0012\u0002\b\u00030\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "", "getDisplayItems", "(Lcom/paypal/oslo/feature/home/domain/model/Section;)Ljava/util/List;", "", "isLoading", "(Lcom/paypal/oslo/feature/home/domain/model/Section;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UtilsKt {
    public static final <T> java.util.List<T> getDisplayItems(com.paypal.oslo.feature.home.domain.model.Section<?> section) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
        if (section.getItems().isEmpty()) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        if (!(kotlin.collections.CollectionsKt.first((java.util.List) section.getItems()) instanceof com.paypal.oslo.feature.home.domain.model.SectionLoading)) {
            java.util.List<T> list = (java.util.List<T>) section.getItems();
            kotlin.jvm.internal.Intrinsics.checkNotNull(list, "");
            return list;
        }
        java.lang.Object first = kotlin.collections.CollectionsKt.first((java.util.List<? extends java.lang.Object>) section.getItems());
        kotlin.jvm.internal.Intrinsics.checkNotNull(first, "");
        java.util.List<T> list2 = (java.util.List<T>) ((com.paypal.oslo.feature.home.domain.model.SectionLoading) first).getPlaceholders();
        kotlin.jvm.internal.Intrinsics.checkNotNull(list2, "");
        return list2;
    }

    public static final boolean isLoading(com.paypal.oslo.feature.home.domain.model.Section<?> section) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
        return kotlin.collections.CollectionsKt.firstOrNull((java.util.List) section.getItems()) instanceof com.paypal.oslo.feature.home.domain.model.SectionLoading;
    }
}
