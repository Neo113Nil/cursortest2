package com.paypal.oslo.feature.home.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/data/mapper/SectionMapperFactory;", "", "<init>", "()V", "Lcom/paypal/oslo/api/graphql/schema/type/ShoppingCollectionStoreVariant;", "variant", "Lcom/paypal/oslo/feature/home/data/mapper/SectionMapper;", "getMapper", "(Lcom/paypal/oslo/api/graphql/schema/type/ShoppingCollectionStoreVariant;)Lcom/paypal/oslo/feature/home/data/mapper/SectionMapper;", "", "getSectionIdPrefix", "(Lcom/paypal/oslo/api/graphql/schema/type/ShoppingCollectionStoreVariant;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SectionMapperFactory {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.home.data.mapper.SectionMapperFactory INSTANCE = new com.paypal.oslo.feature.home.data.mapper.SectionMapperFactory();

    private SectionMapperFactory() {
    }

    public final com.paypal.oslo.feature.home.data.mapper.SectionMapper<?> getMapper(com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionStoreVariant variant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variant, "");
        switch (com.paypal.oslo.feature.home.data.mapper.SectionMapperFactory.WhenMappings.$EnumSwitchMapping$0[variant.ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.home.data.mapper.HeroProductSectionMapper.INSTANCE;
            case 2:
                return com.paypal.oslo.feature.home.data.mapper.DeckCardSectionMapper.INSTANCE;
            case 3:
                return com.paypal.oslo.feature.home.data.mapper.FannedCarouselSectionMapper.INSTANCE;
            case 4:
                return com.paypal.oslo.feature.home.data.mapper.LargeTileSectionMapper.INSTANCE;
            case 5:
            case 6:
                return com.paypal.oslo.feature.home.data.mapper.MerchantSectionMapper.INSTANCE;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public final java.lang.String getSectionIdPrefix(com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionStoreVariant variant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variant, "");
        switch (com.paypal.oslo.feature.home.data.mapper.SectionMapperFactory.WhenMappings.$EnumSwitchMapping$0[variant.ordinal()]) {
            case 1:
                return "slim_collection";
            case 2:
                return "deck_collection";
            case 3:
                return "fanned_collection";
            case 4:
                return "splash_collection";
            case 5:
                return "square_collection";
            case 6:
                return "unknown_collection";
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionStoreVariant.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionStoreVariant.SLIM.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionStoreVariant.DECK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionStoreVariant.FAN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionStoreVariant.SPLASH.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionStoreVariant.SQUARE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionStoreVariant.UNKNOWN__.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
