package com.paypal.oslo.feature.debitcard.shared.domain.model;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGBg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u008b\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b!\u0010 J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0082\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u0019J'\u00106\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b:\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b;\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b<\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\b>\u0010\u001eR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\b@\u0010 R\u001a\u0010\u000b\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\bA\u0010 R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010B\u001a\u0004\bC\u0010#R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\bD\u0010#R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010E\u001a\u0004\bF\u0010&"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentProductDetails;", "", "", "name", "legalName", "longName", "shortName", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentCardBrand;", "brand", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentImageUrls;", "largeImage", "smallImage", "", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLinkDetails;", "links", "actionLinks", "", "maxAdditionalCardsAllowed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentCardBrand;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentImageUrls;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentImageUrls;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentCardBrand;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentImageUrls;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentImageUrls;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentCardBrand;", "component6", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentImageUrls;", "component7", "component8", "()Ljava/util/List;", "component9", "component10", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentCardBrand;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentImageUrls;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentImageUrls;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentProductDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$debit_card_prodRelease", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentProductDetails;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getName", "getLegalName", "getLongName", "getShortName", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentCardBrand;", "getBrand", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentImageUrls;", "getLargeImage", "getSmallImage", "Ljava/util/List;", "getLinks", "getActionLinks", "Ljava/lang/Integer;", "getMaxAdditionalCardsAllowed", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class DebitInstrumentProductDetails {
    private final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails> actionLinks;
    private final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardBrand brand;
    private final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls largeImage;
    private final java.lang.String legalName;
    private final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails> links;
    private final java.lang.String longName;
    private final java.lang.Integer maxAdditionalCardsAllowed;
    private final java.lang.String name;
    private final java.lang.String shortName;
    private final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls smallImage;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardBrand.INSTANCE.serializer();
            return serializer;
        }
    }), null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails.m14578$r8$lambda$y5_bkjsGkBLdiNAVf7cEecq6A();
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails.$r8$lambda$olmUr1VX5a3kvnwTe2C5KwvkRrM();
        }
    }), null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentProductDetails$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentProductDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails> serializer() {
            return com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DebitInstrumentProductDetails(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardBrand debitInstrumentCardBrand, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls debitInstrumentImageUrls, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls debitInstrumentImageUrls2, java.util.List list, java.util.List list2, java.lang.Integer num, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (767 != (i & 767)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 767, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        this.legalName = str2;
        this.longName = str3;
        this.shortName = str4;
        this.brand = debitInstrumentCardBrand;
        this.largeImage = debitInstrumentImageUrls;
        this.smallImage = debitInstrumentImageUrls2;
        this.links = list;
        if ((i & 256) == 0) {
            this.actionLinks = kotlin.collections.CollectionsKt.emptyList();
        } else {
            this.actionLinks = list2;
        }
        this.maxAdditionalCardsAllowed = num;
    }

    public DebitInstrumentProductDetails(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardBrand debitInstrumentCardBrand, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls debitInstrumentImageUrls, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls debitInstrumentImageUrls2, java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails> list, java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails> list2, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentCardBrand, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentImageUrls, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentImageUrls2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.name = str;
        this.legalName = str2;
        this.longName = str3;
        this.shortName = str4;
        this.brand = debitInstrumentCardBrand;
        this.largeImage = debitInstrumentImageUrls;
        this.smallImage = debitInstrumentImageUrls2;
        this.links = list;
        this.actionLinks = list2;
        this.maxAdditionalCardsAllowed = num;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$debit_card_prodRelease(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.name);
        output.encodeStringElement(serialDesc, 1, self.legalName);
        output.encodeStringElement(serialDesc, 2, self.longName);
        output.encodeStringElement(serialDesc, 3, self.shortName);
        output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.brand);
        output.encodeSerializableElement(serialDesc, 5, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls$$serializer.INSTANCE, self.largeImage);
        output.encodeSerializableElement(serialDesc, 6, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls$$serializer.INSTANCE, self.smallImage);
        output.encodeSerializableElement(serialDesc, 7, lazyArr[7].getValue(), self.links);
        if (output.shouldEncodeElementDefault(serialDesc, 8) || !kotlin.jvm.internal.Intrinsics.areEqual(self.actionLinks, kotlin.collections.CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 8, lazyArr[8].getValue(), self.actionLinks);
        }
        output.encodeNullableSerializableElement(serialDesc, 9, kotlinx.serialization.internal.IntSerializer.INSTANCE, self.maxAdditionalCardsAllowed);
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getLegalName() {
        return this.legalName;
    }

    public final java.lang.String getLongName() {
        return this.longName;
    }

    public final java.lang.String getShortName() {
        return this.shortName;
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardBrand getBrand() {
        return this.brand;
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls getLargeImage() {
        return this.largeImage;
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls getSmallImage() {
        return this.smallImage;
    }

    public final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails> getLinks() {
        return this.links;
    }

    public /* synthetic */ DebitInstrumentProductDetails(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardBrand debitInstrumentCardBrand, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls debitInstrumentImageUrls, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls debitInstrumentImageUrls2, java.util.List list, java.util.List list2, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, debitInstrumentCardBrand, debitInstrumentImageUrls, debitInstrumentImageUrls2, list, (i & 256) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, num);
    }

    public final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails> getActionLinks() {
        return this.actionLinks;
    }

    public final java.lang.Integer getMaxAdditionalCardsAllowed() {
        return this.maxAdditionalCardsAllowed;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$olmUr1VX5a3kvnwTe2C5KwvkRrM() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails$$serializer.INSTANCE);
    }

    /* renamed from: $r8$lambda$y5_bkjsGkBLdiN-AVf7cEec-q6A, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m14578$r8$lambda$y5_bkjsGkBLdiNAVf7cEecq6A() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails$$serializer.INSTANCE);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.String str2 = this.legalName;
        java.lang.String str3 = this.longName;
        java.lang.String str4 = this.shortName;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardBrand debitInstrumentCardBrand = this.brand;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls debitInstrumentImageUrls = this.largeImage;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls debitInstrumentImageUrls2 = this.smallImage;
        java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails> list = this.links;
        java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails> list2 = this.actionLinks;
        java.lang.Integer num = this.maxAdditionalCardsAllowed;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentProductDetails(name=");
        sb.append(str);
        sb.append(", legalName=");
        sb.append(str2);
        sb.append(", longName=");
        sb.append(str3);
        sb.append(", shortName=");
        sb.append(str4);
        sb.append(", brand=");
        sb.append(debitInstrumentCardBrand);
        sb.append(", largeImage=");
        sb.append(debitInstrumentImageUrls);
        sb.append(", smallImage=");
        sb.append(debitInstrumentImageUrls2);
        sb.append(", links=");
        sb.append(list);
        sb.append(", actionLinks=");
        sb.append(list2);
        sb.append(", maxAdditionalCardsAllowed=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        int hashCode2 = this.legalName.hashCode();
        int hashCode3 = this.longName.hashCode();
        int hashCode4 = this.shortName.hashCode();
        int hashCode5 = this.brand.hashCode();
        int hashCode6 = this.largeImage.hashCode();
        int hashCode7 = this.smallImage.hashCode();
        int hashCode8 = this.links.hashCode();
        int hashCode9 = this.actionLinks.hashCode();
        java.lang.Integer num = this.maxAdditionalCardsAllowed;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (num == null ? 0 : num.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails debitInstrumentProductDetails = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, debitInstrumentProductDetails.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.legalName, debitInstrumentProductDetails.legalName) && kotlin.jvm.internal.Intrinsics.areEqual(this.longName, debitInstrumentProductDetails.longName) && kotlin.jvm.internal.Intrinsics.areEqual(this.shortName, debitInstrumentProductDetails.shortName) && this.brand == debitInstrumentProductDetails.brand && kotlin.jvm.internal.Intrinsics.areEqual(this.largeImage, debitInstrumentProductDetails.largeImage) && kotlin.jvm.internal.Intrinsics.areEqual(this.smallImage, debitInstrumentProductDetails.smallImage) && kotlin.jvm.internal.Intrinsics.areEqual(this.links, debitInstrumentProductDetails.links) && kotlin.jvm.internal.Intrinsics.areEqual(this.actionLinks, debitInstrumentProductDetails.actionLinks) && kotlin.jvm.internal.Intrinsics.areEqual(this.maxAdditionalCardsAllowed, debitInstrumentProductDetails.maxAdditionalCardsAllowed);
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails copy(java.lang.String name2, java.lang.String legalName, java.lang.String longName, java.lang.String shortName, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardBrand brand, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls largeImage, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls smallImage, java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails> links, java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails> actionLinks, java.lang.Integer maxAdditionalCardsAllowed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legalName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shortName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(brand, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(largeImage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smallImage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(links, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionLinks, "");
        return new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails(name2, legalName, longName, shortName, brand, largeImage, smallImage, links, actionLinks, maxAdditionalCardsAllowed);
    }

    public final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails> component9() {
        return this.actionLinks;
    }

    public final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails> component8() {
        return this.links;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls getSmallImage() {
        return this.smallImage;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls getLargeImage() {
        return this.largeImage;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardBrand getBrand() {
        return this.brand;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getShortName() {
        return this.shortName;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getLongName() {
        return this.longName;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLegalName() {
        return this.legalName;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.Integer getMaxAdditionalCardsAllowed() {
        return this.maxAdditionalCardsAllowed;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }
}
