package com.paypal.oslo.feature.home.data.mapper;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002JA\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\r\u0010\u000eÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/home/data/mapper/SectionMapper;", "T", "", "", "sectionId", "", "sectionPosition", "Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$ShoppingCollection;", "shoppingCollection", "Lcom/paypal/oslo/feature/home/domain/StringProvider;", "stringProvider", "personalizationTrackingId", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "map", "(Ljava/lang/String;ILcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$ShoppingCollection;Lcom/paypal/oslo/feature/home/domain/StringProvider;Ljava/lang/String;)Lcom/paypal/oslo/feature/home/domain/model/Section;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface SectionMapper<T> {
    com.paypal.oslo.feature.home.domain.model.Section<T> map(java.lang.String sectionId, int sectionPosition, com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.ShoppingCollection shoppingCollection, com.paypal.oslo.feature.home.domain.StringProvider stringProvider, java.lang.String personalizationTrackingId);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ com.paypal.oslo.feature.home.domain.model.Section map$default(com.paypal.oslo.feature.home.data.mapper.SectionMapper sectionMapper, java.lang.String str, int i, com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.ShoppingCollection shoppingCollection, com.paypal.oslo.feature.home.domain.StringProvider stringProvider, java.lang.String str2, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: map");
        }
        if ((i2 & 16) != 0) {
            str2 = null;
        }
        return sectionMapper.map(str, i, shoppingCollection, stringProvider, str2);
    }
}
