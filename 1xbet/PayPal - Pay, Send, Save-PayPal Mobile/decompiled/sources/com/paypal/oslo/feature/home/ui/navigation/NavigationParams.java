package com.paypal.oslo.feature.home.ui.navigation;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b1\u0018\u0000 \u00192\u00020\u0001:\u0005\u001a\u001b\u001c\u001d\u0019B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013\u0082\u0001\u0004\u001e\u001f !"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "getVariant", "()Ljava/lang/String;", "variant", "getId", "id", "getName", "name", "Companion", "ShoppingParams", "AccountParams", "NBAParams", "AdParams", "Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$AccountParams;", "Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$AdParams;", "Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$NBAParams;", "Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$ShoppingParams;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class NavigationParams {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.home.ui.navigation.NavigationParams.Companion INSTANCE = new com.paypal.oslo.feature.home.ui.navigation.NavigationParams.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.ui.navigation.NavigationParams$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.home.ui.navigation.NavigationParams.$r8$lambda$jT308YkgHf3mhta6Iy5KHC_X1e0();
        }
    });

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.paypal.oslo.feature.home.ui.navigation.NavigationParams self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    private NavigationParams() {
    }

    public /* synthetic */ NavigationParams(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    public final java.lang.String getVariant() {
        if (this instanceof com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams) {
            return ((com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams) this).getItemType().name();
        }
        if (this instanceof com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AccountParams) {
            return "accountSnapshot";
        }
        if (this instanceof com.paypal.oslo.feature.home.ui.navigation.NavigationParams.NBAParams) {
            return "spotlight_nba";
        }
        if (this instanceof com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AdParams) {
            return "ad";
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final java.lang.String getId() {
        if (this instanceof com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams) {
            return ((com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams) this).getItemId();
        }
        if (this instanceof com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AccountParams) {
            com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AccountParams accountParams = (com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AccountParams) this;
            java.lang.String accountType = accountParams.getAccountType();
            return accountType == null ? accountParams.getAccountId() : accountType;
        }
        if (this instanceof com.paypal.oslo.feature.home.ui.navigation.NavigationParams.NBAParams) {
            return ((com.paypal.oslo.feature.home.ui.navigation.NavigationParams.NBAParams) this).getNbaId();
        }
        if (this instanceof com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AdParams) {
            return ((com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AdParams) this).getAdId();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final java.lang.String getName() {
        if (this instanceof com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams) {
            java.lang.String itemName = ((com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams) this).getItemName();
            return itemName == null ? "" : itemName;
        }
        if (this instanceof com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AccountParams) {
            java.lang.String accountType = ((com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AccountParams) this).getAccountType();
            return accountType == null ? "" : accountType;
        }
        if (this instanceof com.paypal.oslo.feature.home.ui.navigation.NavigationParams.NBAParams) {
            java.lang.String title = ((com.paypal.oslo.feature.home.ui.navigation.NavigationParams.NBAParams) this).getTitle();
            return title == null ? "" : title;
        }
        if (this instanceof com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AdParams) {
            return "";
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fBg\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJb\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0016J'\u00100\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b6\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b7\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b8\u0010\u0016R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010\u001dR\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b<\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$ShoppingParams;", "Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams;", "", "itemId", "Lcom/paypal/oslo/feature/home/ui/navigation/CollectionType;", "itemType", "itemName", "storeUrl", "merchantLogoUrl", "", "Lcom/paypal/oslo/feature/shoppingrewards/api/shopping/navigation/NavBenefitType;", "benefitTypes", "Lcom/paypal/oslo/feature/shoppingrewards/api/shopping/navigation/BenefitsMetadata;", "benefitsMetadata", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/ui/navigation/CollectionType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/shoppingrewards/api/shopping/navigation/BenefitsMetadata;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/home/ui/navigation/CollectionType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/shoppingrewards/api/shopping/navigation/BenefitsMetadata;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/ui/navigation/CollectionType;", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "()Lcom/paypal/oslo/feature/shoppingrewards/api/shopping/navigation/BenefitsMetadata;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/ui/navigation/CollectionType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/shoppingrewards/api/shopping/navigation/BenefitsMetadata;)Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$ShoppingParams;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$home_prodRelease", "(Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$ShoppingParams;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getItemId", "Lcom/paypal/oslo/feature/home/ui/navigation/CollectionType;", "getItemType", "getItemName", "getStoreUrl", "getMerchantLogoUrl", "Ljava/util/List;", "getBenefitTypes", "Lcom/paypal/oslo/feature/shoppingrewards/api/shopping/navigation/BenefitsMetadata;", "getBenefitsMetadata", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class ShoppingParams extends com.paypal.oslo.feature.home.ui.navigation.NavigationParams {
        private final java.util.List<com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType> benefitTypes;
        private final com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata;
        private final java.lang.String itemId;
        private final java.lang.String itemName;
        private final com.paypal.oslo.feature.home.ui.navigation.CollectionType itemType;
        private final java.lang.String merchantLogoUrl;
        private final java.lang.String storeUrl;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams.Companion INSTANCE = new com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams.Companion(null);
        public static final int $stable = 8;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.ui.navigation.NavigationParams$ShoppingParams$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.home.ui.navigation.CollectionType", com.paypal.oslo.feature.home.ui.navigation.CollectionType.values());
                return createSimpleEnumSerializer;
            }
        }), null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.ui.navigation.NavigationParams$ShoppingParams$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams.m14983$r8$lambda$f8XZtJUClS4LvOBRNUFCRe6BjI();
            }
        }), null};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$ShoppingParams$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$ShoppingParams;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes12.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams> serializer() {
                return com.paypal.oslo.feature.home.ui.navigation.NavigationParams$ShoppingParams$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ShoppingParams(int i, java.lang.String str, com.paypal.oslo.feature.home.ui.navigation.CollectionType collectionType, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.home.ui.navigation.NavigationParams$ShoppingParams$$serializer.INSTANCE.getDescriptor());
            }
            this.itemId = str;
            this.itemType = collectionType;
            if ((i & 4) == 0) {
                this.itemName = null;
            } else {
                this.itemName = str2;
            }
            if ((i & 8) == 0) {
                this.storeUrl = null;
            } else {
                this.storeUrl = str3;
            }
            if ((i & 16) == 0) {
                this.merchantLogoUrl = null;
            } else {
                this.merchantLogoUrl = str4;
            }
            if ((i & 32) == 0) {
                this.benefitTypes = kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType.ACCEPTS_PAYPAL);
            } else {
                this.benefitTypes = list;
            }
            if ((i & 64) == 0) {
                this.benefitsMetadata = new com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            } else {
                this.benefitsMetadata = benefitsMetadata;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ShoppingParams(java.lang.String str, com.paypal.oslo.feature.home.ui.navigation.CollectionType collectionType, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List<? extends com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType> list, com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collectionType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(benefitsMetadata, "");
            this.itemId = str;
            this.itemType = collectionType;
            this.itemName = str2;
            this.storeUrl = str3;
            this.merchantLogoUrl = str4;
            this.benefitTypes = list;
            this.benefitsMetadata = benefitsMetadata;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$home_prodRelease(com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.home.ui.navigation.NavigationParams.write$Self(self, output, serialDesc);
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.itemId);
            output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.itemType);
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.itemName != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.itemName);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.storeUrl != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.storeUrl);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 4) || self.merchantLogoUrl != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.merchantLogoUrl);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 5) || !kotlin.jvm.internal.Intrinsics.areEqual(self.benefitTypes, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType.ACCEPTS_PAYPAL))) {
                output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.benefitTypes);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 6) || !kotlin.jvm.internal.Intrinsics.areEqual(self.benefitsMetadata, new com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null))) {
                output.encodeSerializableElement(serialDesc, 6, com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata$$serializer.INSTANCE, self.benefitsMetadata);
            }
        }

        public final java.lang.String getItemId() {
            return this.itemId;
        }

        public final com.paypal.oslo.feature.home.ui.navigation.CollectionType getItemType() {
            return this.itemType;
        }

        public final java.lang.String getItemName() {
            return this.itemName;
        }

        public final java.lang.String getStoreUrl() {
            return this.storeUrl;
        }

        public final java.lang.String getMerchantLogoUrl() {
            return this.merchantLogoUrl;
        }

        public /* synthetic */ ShoppingParams(java.lang.String str, com.paypal.oslo.feature.home.ui.navigation.CollectionType collectionType, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, collectionType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType.ACCEPTS_PAYPAL) : list, (i & 64) != 0 ? new com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null) : benefitsMetadata);
        }

        public final java.util.List<com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType> getBenefitTypes() {
            return this.benefitTypes;
        }

        public final com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata getBenefitsMetadata() {
            return this.benefitsMetadata;
        }

        /* renamed from: $r8$lambda$f8XZtJUClS4LvOB-RNUFCRe6BjI, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m14983$r8$lambda$f8XZtJUClS4LvOBRNUFCRe6BjI() {
            return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType.INSTANCE.serializer());
        }

        public final java.lang.String toString() {
            java.lang.String str = this.itemId;
            com.paypal.oslo.feature.home.ui.navigation.CollectionType collectionType = this.itemType;
            java.lang.String str2 = this.itemName;
            java.lang.String str3 = this.storeUrl;
            java.lang.String str4 = this.merchantLogoUrl;
            java.util.List<com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType> list = this.benefitTypes;
            com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata = this.benefitsMetadata;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShoppingParams(itemId=");
            sb.append(str);
            sb.append(", itemType=");
            sb.append(collectionType);
            sb.append(", itemName=");
            sb.append(str2);
            sb.append(", storeUrl=");
            sb.append(str3);
            sb.append(", merchantLogoUrl=");
            sb.append(str4);
            sb.append(", benefitTypes=");
            sb.append(list);
            sb.append(", benefitsMetadata=");
            sb.append(benefitsMetadata);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.itemId.hashCode();
            int hashCode2 = this.itemType.hashCode();
            java.lang.String str = this.itemName;
            int hashCode3 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.storeUrl;
            int hashCode4 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.merchantLogoUrl;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.benefitTypes.hashCode()) * 31) + this.benefitsMetadata.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams)) {
                return false;
            }
            com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams shoppingParams = (com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.itemId, shoppingParams.itemId) && this.itemType == shoppingParams.itemType && kotlin.jvm.internal.Intrinsics.areEqual(this.itemName, shoppingParams.itemName) && kotlin.jvm.internal.Intrinsics.areEqual(this.storeUrl, shoppingParams.storeUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantLogoUrl, shoppingParams.merchantLogoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.benefitTypes, shoppingParams.benefitTypes) && kotlin.jvm.internal.Intrinsics.areEqual(this.benefitsMetadata, shoppingParams.benefitsMetadata);
        }

        public final com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams copy(java.lang.String itemId, com.paypal.oslo.feature.home.ui.navigation.CollectionType itemType, java.lang.String itemName, java.lang.String storeUrl, java.lang.String merchantLogoUrl, java.util.List<? extends com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType> benefitTypes, com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(benefitTypes, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(benefitsMetadata, "");
            return new com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams(itemId, itemType, itemName, storeUrl, merchantLogoUrl, benefitTypes, benefitsMetadata);
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata getBenefitsMetadata() {
            return this.benefitsMetadata;
        }

        public final java.util.List<com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType> component6() {
            return this.benefitTypes;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getMerchantLogoUrl() {
            return this.merchantLogoUrl;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getStoreUrl() {
            return this.storeUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getItemName() {
            return this.itemName;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.ui.navigation.CollectionType getItemType() {
            return this.itemType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getItemId() {
            return this.itemId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams copy$default(com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams shoppingParams, java.lang.String str, com.paypal.oslo.feature.home.ui.navigation.CollectionType collectionType, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = shoppingParams.itemId;
            }
            if ((i & 2) != 0) {
                collectionType = shoppingParams.itemType;
            }
            com.paypal.oslo.feature.home.ui.navigation.CollectionType collectionType2 = collectionType;
            if ((i & 4) != 0) {
                str2 = shoppingParams.itemName;
            }
            java.lang.String str5 = str2;
            if ((i & 8) != 0) {
                str3 = shoppingParams.storeUrl;
            }
            java.lang.String str6 = str3;
            if ((i & 16) != 0) {
                str4 = shoppingParams.merchantLogoUrl;
            }
            java.lang.String str7 = str4;
            if ((i & 32) != 0) {
                list = shoppingParams.benefitTypes;
            }
            java.util.List list2 = list;
            if ((i & 64) != 0) {
                benefitsMetadata = shoppingParams.benefitsMetadata;
            }
            return shoppingParams.copy(str, collectionType2, str5, str6, str7, list2, benefitsMetadata);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ&\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$AccountParams;", "Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams;", "", "accountId", "accountType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$AccountParams;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$home_prodRelease", "(Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$AccountParams;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getAccountId", "getAccountType", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class AccountParams extends com.paypal.oslo.feature.home.ui.navigation.NavigationParams {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AccountParams.Companion INSTANCE = new com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AccountParams.Companion(null);
        private final java.lang.String accountId;
        private final java.lang.String accountType;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$AccountParams$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$AccountParams;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes12.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AccountParams> serializer() {
                return com.paypal.oslo.feature.home.ui.navigation.NavigationParams$AccountParams$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AccountParams(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.home.ui.navigation.NavigationParams$AccountParams$$serializer.INSTANCE.getDescriptor());
            }
            this.accountId = str;
            if ((i & 2) == 0) {
                this.accountType = null;
            } else {
                this.accountType = str2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AccountParams(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.accountId = str;
            this.accountType = str2;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$home_prodRelease(com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AccountParams self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.home.ui.navigation.NavigationParams.write$Self(self, output, serialDesc);
            output.encodeStringElement(serialDesc, 0, self.accountId);
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.accountType != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.accountType);
            }
        }

        public /* synthetic */ AccountParams(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        public final java.lang.String getAccountType() {
            return this.accountType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.accountId;
            java.lang.String str2 = this.accountType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AccountParams(accountId=");
            sb.append(str);
            sb.append(", accountType=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.accountId.hashCode();
            java.lang.String str = this.accountType;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AccountParams)) {
                return false;
            }
            com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AccountParams accountParams = (com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AccountParams) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.accountId, accountParams.accountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountType, accountParams.accountType);
        }

        public final com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AccountParams copy(java.lang.String accountId, java.lang.String accountType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountId, "");
            return new com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AccountParams(accountId, accountType);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAccountType() {
            return this.accountType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AccountParams copy$default(com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AccountParams accountParams, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = accountParams.accountId;
            }
            if ((i & 2) != 0) {
                str2 = accountParams.accountType;
            }
            return accountParams.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011JJ\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0011J'\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0001¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$NBAParams;", "Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams;", "", "nbaId", "ctaUrl", "title", "Lcom/paypal/oslo/feature/home/domain/model/NbaCtaType;", "ctaType", "nativeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/home/domain/model/NbaCtaType;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/home/domain/model/NbaCtaType;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/home/domain/model/NbaCtaType;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/home/domain/model/NbaCtaType;Ljava/lang/String;)Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$NBAParams;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$home_prodRelease", "(Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$NBAParams;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getNbaId", "getCtaUrl", "getTitle", "Lcom/paypal/oslo/feature/home/domain/model/NbaCtaType;", "getCtaType", "getNativeId", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class NBAParams extends com.paypal.oslo.feature.home.ui.navigation.NavigationParams {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.home.domain.model.NbaCtaType ctaType;
        private final java.lang.String ctaUrl;
        private final java.lang.String nativeId;
        private final java.lang.String nbaId;
        private final java.lang.String title;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.home.ui.navigation.NavigationParams.NBAParams.Companion INSTANCE = new com.paypal.oslo.feature.home.ui.navigation.NavigationParams.NBAParams.Companion(null);
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.ui.navigation.NavigationParams$NBAParams$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer serializer;
                serializer = com.paypal.oslo.feature.home.domain.model.NbaCtaType.INSTANCE.serializer();
                return serializer;
            }
        }), null};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$NBAParams$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$NBAParams;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes12.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.home.ui.navigation.NavigationParams.NBAParams> serializer() {
                return com.paypal.oslo.feature.home.ui.navigation.NavigationParams$NBAParams$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ NBAParams(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.home.domain.model.NbaCtaType nbaCtaType, java.lang.String str4, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.home.ui.navigation.NavigationParams$NBAParams$$serializer.INSTANCE.getDescriptor());
            }
            this.nbaId = str;
            if ((i & 2) == 0) {
                this.ctaUrl = null;
            } else {
                this.ctaUrl = str2;
            }
            if ((i & 4) == 0) {
                this.title = null;
            } else {
                this.title = str3;
            }
            if ((i & 8) == 0) {
                this.ctaType = null;
            } else {
                this.ctaType = nbaCtaType;
            }
            if ((i & 16) == 0) {
                this.nativeId = null;
            } else {
                this.nativeId = str4;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NBAParams(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.home.domain.model.NbaCtaType nbaCtaType, java.lang.String str4) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.nbaId = str;
            this.ctaUrl = str2;
            this.title = str3;
            this.ctaType = nbaCtaType;
            this.nativeId = str4;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$home_prodRelease(com.paypal.oslo.feature.home.ui.navigation.NavigationParams.NBAParams self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.home.ui.navigation.NavigationParams.write$Self(self, output, serialDesc);
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.nbaId);
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.ctaUrl != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.ctaUrl);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.title != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.title);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.ctaType != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.ctaType);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 4) || self.nativeId != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.nativeId);
            }
        }

        public /* synthetic */ NBAParams(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.home.domain.model.NbaCtaType nbaCtaType, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : nbaCtaType, (i & 16) != 0 ? null : str4);
        }

        public final java.lang.String getNbaId() {
            return this.nbaId;
        }

        public final java.lang.String getCtaUrl() {
            return this.ctaUrl;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final com.paypal.oslo.feature.home.domain.model.NbaCtaType getCtaType() {
            return this.ctaType;
        }

        public final java.lang.String getNativeId() {
            return this.nativeId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.nbaId;
            java.lang.String str2 = this.ctaUrl;
            java.lang.String str3 = this.title;
            com.paypal.oslo.feature.home.domain.model.NbaCtaType nbaCtaType = this.ctaType;
            java.lang.String str4 = this.nativeId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NBAParams(nbaId=");
            sb.append(str);
            sb.append(", ctaUrl=");
            sb.append(str2);
            sb.append(", title=");
            sb.append(str3);
            sb.append(", ctaType=");
            sb.append(nbaCtaType);
            sb.append(", nativeId=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.nbaId.hashCode();
            java.lang.String str = this.ctaUrl;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.title;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            com.paypal.oslo.feature.home.domain.model.NbaCtaType nbaCtaType = this.ctaType;
            int hashCode4 = nbaCtaType == null ? 0 : nbaCtaType.hashCode();
            java.lang.String str3 = this.nativeId;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.ui.navigation.NavigationParams.NBAParams)) {
                return false;
            }
            com.paypal.oslo.feature.home.ui.navigation.NavigationParams.NBAParams nBAParams = (com.paypal.oslo.feature.home.ui.navigation.NavigationParams.NBAParams) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.nbaId, nBAParams.nbaId) && kotlin.jvm.internal.Intrinsics.areEqual(this.ctaUrl, nBAParams.ctaUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, nBAParams.title) && this.ctaType == nBAParams.ctaType && kotlin.jvm.internal.Intrinsics.areEqual(this.nativeId, nBAParams.nativeId);
        }

        public final com.paypal.oslo.feature.home.ui.navigation.NavigationParams.NBAParams copy(java.lang.String nbaId, java.lang.String ctaUrl, java.lang.String title, com.paypal.oslo.feature.home.domain.model.NbaCtaType ctaType, java.lang.String nativeId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nbaId, "");
            return new com.paypal.oslo.feature.home.ui.navigation.NavigationParams.NBAParams(nbaId, ctaUrl, title, ctaType, nativeId);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getNativeId() {
            return this.nativeId;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.home.domain.model.NbaCtaType getCtaType() {
            return this.ctaType;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCtaUrl() {
            return this.ctaUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getNbaId() {
            return this.nbaId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.ui.navigation.NavigationParams.NBAParams copy$default(com.paypal.oslo.feature.home.ui.navigation.NavigationParams.NBAParams nBAParams, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.home.domain.model.NbaCtaType nbaCtaType, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = nBAParams.nbaId;
            }
            if ((i & 2) != 0) {
                str2 = nBAParams.ctaUrl;
            }
            java.lang.String str5 = str2;
            if ((i & 4) != 0) {
                str3 = nBAParams.title;
            }
            java.lang.String str6 = str3;
            if ((i & 8) != 0) {
                nbaCtaType = nBAParams.ctaType;
            }
            com.paypal.oslo.feature.home.domain.model.NbaCtaType nbaCtaType2 = nbaCtaType;
            if ((i & 16) != 0) {
                str4 = nBAParams.nativeId;
            }
            return nBAParams.copy(str, str5, str6, nbaCtaType2, str4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ&\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$AdParams;", "Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams;", "", "adId", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$AdParams;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$home_prodRelease", "(Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$AdParams;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getAdId", "getUrl", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class AdParams extends com.paypal.oslo.feature.home.ui.navigation.NavigationParams {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AdParams.Companion INSTANCE = new com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AdParams.Companion(null);
        private final java.lang.String adId;
        private final java.lang.String url;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$AdParams$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$AdParams;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes12.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AdParams> serializer() {
                return com.paypal.oslo.feature.home.ui.navigation.NavigationParams$AdParams$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AdParams(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.home.ui.navigation.NavigationParams$AdParams$$serializer.INSTANCE.getDescriptor());
            }
            this.adId = str;
            if ((i & 2) == 0) {
                this.url = null;
            } else {
                this.url = str2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AdParams(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.adId = str;
            this.url = str2;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$home_prodRelease(com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AdParams self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.home.ui.navigation.NavigationParams.write$Self(self, output, serialDesc);
            output.encodeStringElement(serialDesc, 0, self.adId);
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.url != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.url);
            }
        }

        public /* synthetic */ AdParams(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public final java.lang.String getAdId() {
            return this.adId;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.adId;
            java.lang.String str2 = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AdParams(adId=");
            sb.append(str);
            sb.append(", url=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.adId.hashCode();
            java.lang.String str = this.url;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AdParams)) {
                return false;
            }
            com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AdParams adParams = (com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AdParams) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.adId, adParams.adId) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, adParams.url);
        }

        public final com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AdParams copy(java.lang.String adId, java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "");
            return new com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AdParams(adId, url);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAdId() {
            return this.adId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AdParams copy$default(com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AdParams adParams, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = adParams.adId;
            }
            if ((i & 2) != 0) {
                str2 = adParams.url;
            }
            return adParams.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\r2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0015\u00100\u001a\u00020\u00162\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u0015\u00105\u001a\u0002042\u0006\u00103\u001a\u000202¢\u0006\u0004\b5\u00106J\u0013\u00108\u001a\b\u0012\u0004\u0012\u00020\b07¢\u0006\u0004\b8\u00109"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/home/ui/navigation/CollectionType;", "collectionType", "", "itemId", "Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams;", "fromCollectionType", "(Lcom/paypal/oslo/feature/home/ui/navigation/CollectionType;Ljava/lang/String;)Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams;", "Lcom/paypal/oslo/feature/home/domain/model/Merchant;", "merchant", "Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$ShoppingParams;", "fromMerchant", "(Lcom/paypal/oslo/feature/home/domain/model/Merchant;)Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$ShoppingParams;", "Lcom/paypal/oslo/feature/home/domain/model/HeroProduct;", "heroProduct", "fromHeroProduct", "(Lcom/paypal/oslo/feature/home/domain/model/HeroProduct;)Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$ShoppingParams;", "Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "accountSnapshotItem", "Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$AccountParams;", "fromAccountSnapshot", "(Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;)Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$AccountParams;", "Lcom/paypal/oslo/feature/home/domain/model/LargeTileContent;", "largeTileContent", "fromLargeTileContent", "(Lcom/paypal/oslo/feature/home/domain/model/LargeTileContent;)Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$ShoppingParams;", "Lcom/paypal/oslo/feature/home/domain/model/DeckCardContent;", "deckCardContent", "fromDeckCardContent", "(Lcom/paypal/oslo/feature/home/domain/model/DeckCardContent;)Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$ShoppingParams;", "Lcom/paypal/oslo/feature/home/domain/model/NextBestAction;", "nextBestAction", "fromNextBestAction", "(Lcom/paypal/oslo/feature/home/domain/model/NextBestAction;)Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$AccountParams;", "Lcom/paypal/oslo/feature/home/domain/model/SpotlightNBA;", "spotlightNBA", "Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$NBAParams;", "fromSpotlightNBA", "(Lcom/paypal/oslo/feature/home/domain/model/SpotlightNBA;)Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$NBAParams;", "Lcom/paypal/oslo/feature/home/domain/model/FannedCarouselItemData;", "fannedCarouselData", "fromFannedCarousel", "(Lcom/paypal/oslo/feature/home/domain/model/FannedCarouselItemData;)Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$ShoppingParams;", "Lcom/paypal/oslo/feature/home/domain/model/OfferNBAItem;", "offerNBAItem", "fromOfferNBA", "(Lcom/paypal/oslo/feature/home/domain/model/OfferNBAItem;)Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$AccountParams;", "Lcom/paypal/oslo/feature/home/domain/model/Advertisement;", "advertisement", "Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$AdParams;", "fromAdvertisement", "(Lcom/paypal/oslo/feature/home/domain/model/Advertisement;)Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$AdParams;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final com.paypal.oslo.feature.home.ui.navigation.NavigationParams fromCollectionType(com.paypal.oslo.feature.home.ui.navigation.CollectionType collectionType, java.lang.String itemId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collectionType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemId, "");
            switch (com.paypal.oslo.feature.home.ui.navigation.NavigationParams.Companion.WhenMappings.$EnumSwitchMapping$0[collectionType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return new com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams(itemId, collectionType, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata) null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                case 7:
                case 8:
                case 9:
                case 10:
                    return new com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AccountParams(itemId, (java.lang.String) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
                default:
                    throw new kotlin.NoWhenBranchMatchedException();
            }
        }

        public final com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams fromMerchant(com.paypal.oslo.feature.home.domain.model.Merchant merchant) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchant, "");
            return new com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams(merchant.getId(), com.paypal.oslo.feature.home.ui.navigation.CollectionType.MERCHANT, merchant.getName(), merchant.getStoreUrl(), merchant.getLogoUrl(), merchant.getBenefitTypes(), merchant.getBenefitsMetadata());
        }

        public final com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams fromHeroProduct(com.paypal.oslo.feature.home.domain.model.HeroProduct heroProduct) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heroProduct, "");
            return new com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams(heroProduct.getId(), com.paypal.oslo.feature.home.ui.navigation.CollectionType.HERO_PRODUCT, heroProduct.getName(), heroProduct.getStoreUrl(), heroProduct.getImageUrl(), heroProduct.getBenefitTypes(), heroProduct.getBenefitsMetadata());
        }

        public final com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AccountParams fromAccountSnapshot(com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem accountSnapshotItem) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSnapshotItem, "");
            return new com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AccountParams(accountSnapshotItem.getId(), com.paypal.oslo.feature.home.ui.navigation.AccountSnapshotTypeToStringMapper.INSTANCE.map(accountSnapshotItem.getType()));
        }

        public final com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams fromLargeTileContent(com.paypal.oslo.feature.home.domain.model.LargeTileContent largeTileContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(largeTileContent, "");
            return new com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams(largeTileContent.getId(), com.paypal.oslo.feature.home.ui.navigation.CollectionType.LARGE_TILE, largeTileContent.getTitle(), largeTileContent.getStoreUrl(), largeTileContent.getIconUrl(), largeTileContent.getBenefitTypes(), largeTileContent.getBenefitsMetadata());
        }

        public final com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams fromDeckCardContent(com.paypal.oslo.feature.home.domain.model.DeckCardContent deckCardContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deckCardContent, "");
            return new com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams(deckCardContent.getId(), com.paypal.oslo.feature.home.ui.navigation.CollectionType.DECK_CARD, deckCardContent.getTitle(), deckCardContent.getStoreUrl(), deckCardContent.getMerchantLogoUrl(), deckCardContent.getBenefitTypes(), deckCardContent.getBenefitsMetadata());
        }

        public final com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AccountParams fromNextBestAction(com.paypal.oslo.feature.home.domain.model.NextBestAction nextBestAction) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nextBestAction, "");
            return new com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AccountParams(nextBestAction.getId(), null);
        }

        public final com.paypal.oslo.feature.home.ui.navigation.NavigationParams.NBAParams fromSpotlightNBA(com.paypal.oslo.feature.home.domain.model.SpotlightNBA spotlightNBA) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spotlightNBA, "");
            return new com.paypal.oslo.feature.home.ui.navigation.NavigationParams.NBAParams(spotlightNBA.getId(), spotlightNBA.getCtaUrl(), (java.lang.String) null, spotlightNBA.getCtaType(), spotlightNBA.getCtaNativeId(), 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        public final com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams fromFannedCarousel(com.paypal.oslo.feature.home.domain.model.FannedCarouselItemData fannedCarouselData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fannedCarouselData, "");
            return new com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams(fannedCarouselData.getId(), com.paypal.oslo.feature.home.ui.navigation.CollectionType.FANNED_CAROUSEL, fannedCarouselData.getTitle(), fannedCarouselData.getStoreUrl(), fannedCarouselData.getImageUrl(), fannedCarouselData.getBenefitTypes(), fannedCarouselData.getBenefitsMetadata());
        }

        public final com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AccountParams fromOfferNBA(com.paypal.oslo.feature.home.domain.model.OfferNBAItem offerNBAItem) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerNBAItem, "");
            return new com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AccountParams(offerNBAItem.getId(), null);
        }

        public final com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AdParams fromAdvertisement(com.paypal.oslo.feature.home.domain.model.Advertisement advertisement) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advertisement, "");
            return new com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AdParams(advertisement.getId(), advertisement.getStoreUrl());
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.home.ui.navigation.NavigationParams> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.home.ui.navigation.NavigationParams.$cachedSerializer$delegate.getValue();
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.paypal.oslo.feature.home.ui.navigation.CollectionType.values().length];
                try {
                    iArr[com.paypal.oslo.feature.home.ui.navigation.CollectionType.MERCHANT.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.paypal.oslo.feature.home.ui.navigation.CollectionType.HERO_PRODUCT.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.paypal.oslo.feature.home.ui.navigation.CollectionType.LARGE_TILE.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[com.paypal.oslo.feature.home.ui.navigation.CollectionType.DECK_CARD.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[com.paypal.oslo.feature.home.ui.navigation.CollectionType.FANNED_CAROUSEL.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr[com.paypal.oslo.feature.home.ui.navigation.CollectionType.ADS.ordinal()] = 6;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                try {
                    iArr[com.paypal.oslo.feature.home.ui.navigation.CollectionType.ACCOUNTS.ordinal()] = 7;
                } catch (java.lang.NoSuchFieldError unused7) {
                }
                try {
                    iArr[com.paypal.oslo.feature.home.ui.navigation.CollectionType.NEXT_BEST_ACTION.ordinal()] = 8;
                } catch (java.lang.NoSuchFieldError unused8) {
                }
                try {
                    iArr[com.paypal.oslo.feature.home.ui.navigation.CollectionType.SPOTLIGHT_NBA.ordinal()] = 9;
                } catch (java.lang.NoSuchFieldError unused9) {
                }
                try {
                    iArr[com.paypal.oslo.feature.home.ui.navigation.CollectionType.OFFER_NBA.ordinal()] = 10;
                } catch (java.lang.NoSuchFieldError unused10) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$jT308YkgHf3mhta6Iy5KHC_X1e0() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.home.ui.navigation.NavigationParams", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.home.ui.navigation.NavigationParams.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AccountParams.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.home.ui.navigation.NavigationParams.AdParams.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.home.ui.navigation.NavigationParams.NBAParams.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.home.ui.navigation.NavigationParams$AccountParams$$serializer.INSTANCE, com.paypal.oslo.feature.home.ui.navigation.NavigationParams$AdParams$$serializer.INSTANCE, com.paypal.oslo.feature.home.ui.navigation.NavigationParams$NBAParams$$serializer.INSTANCE, com.paypal.oslo.feature.home.ui.navigation.NavigationParams$ShoppingParams$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ NavigationParams(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
