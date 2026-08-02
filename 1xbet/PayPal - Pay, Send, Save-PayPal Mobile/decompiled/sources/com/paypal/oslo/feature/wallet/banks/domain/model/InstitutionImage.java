package com.paypal.oslo.feature.wallet.banks.domain.model;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JJ\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0011J'\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0001¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b.\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstitutionImage;", "", "", "url", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "", "width", "height", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstitutionImageCategory;", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstitutionImageCategory;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstitutionImageCategory;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "component5", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstitutionImageCategory;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstitutionImageCategory;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstitutionImage;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstitutionImage;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getUrl", "getMimeType", "Ljava/lang/Integer;", "getWidth", "getHeight", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstitutionImageCategory;", "getCategory", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class InstitutionImage {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory category;
    private final java.lang.Integer height;
    private final java.lang.String mimeType;
    private final java.lang.String url;
    private final java.lang.Integer width;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage.Companion INSTANCE = new com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstitutionImage$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstitutionImage;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage> serializer() {
            return com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InstitutionImage(int i, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory institutionImageCategory, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 31, com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage$$serializer.INSTANCE.getDescriptor());
        }
        this.url = str;
        this.mimeType = str2;
        this.width = num;
        this.height = num2;
        this.category = institutionImageCategory;
    }

    public InstitutionImage(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory institutionImageCategory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.url = str;
        this.mimeType = str2;
        this.width = num;
        this.height = num2;
        this.category = institutionImageCategory;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$wallet_prodRelease(com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.url);
        output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.mimeType);
        output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.IntSerializer.INSTANCE, self.width);
        output.encodeNullableSerializableElement(serialDesc, 3, kotlinx.serialization.internal.IntSerializer.INSTANCE, self.height);
        output.encodeNullableSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.category);
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public final java.lang.String getMimeType() {
        return this.mimeType;
    }

    public final java.lang.Integer getWidth() {
        return this.width;
    }

    public final java.lang.Integer getHeight() {
        return this.height;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory getCategory() {
        return this.category;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.url;
        java.lang.String str2 = this.mimeType;
        java.lang.Integer num = this.width;
        java.lang.Integer num2 = this.height;
        com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory institutionImageCategory = this.category;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InstitutionImage(url=");
        sb.append(str);
        sb.append(", mimeType=");
        sb.append(str2);
        sb.append(", width=");
        sb.append(num);
        sb.append(", height=");
        sb.append(num2);
        sb.append(", category=");
        sb.append(institutionImageCategory);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.url.hashCode();
        java.lang.String str = this.mimeType;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.Integer num = this.width;
        int hashCode3 = num == null ? 0 : num.hashCode();
        java.lang.Integer num2 = this.height;
        int hashCode4 = num2 == null ? 0 : num2.hashCode();
        com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory institutionImageCategory = this.category;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (institutionImageCategory != null ? institutionImageCategory.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage institutionImage = (com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.url, institutionImage.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, institutionImage.mimeType) && kotlin.jvm.internal.Intrinsics.areEqual(this.width, institutionImage.width) && kotlin.jvm.internal.Intrinsics.areEqual(this.height, institutionImage.height) && this.category == institutionImage.category;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage copy(java.lang.String url, java.lang.String mimeType, java.lang.Integer width, java.lang.Integer height, com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory category) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        return new com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage(url, mimeType, width, height, category);
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory getCategory() {
        return this.category;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Integer getHeight() {
        return this.height;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Integer getWidth() {
        return this.width;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMimeType() {
        return this.mimeType;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage institutionImage, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory institutionImageCategory, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = institutionImage.url;
        }
        if ((i & 2) != 0) {
            str2 = institutionImage.mimeType;
        }
        java.lang.String str3 = str2;
        if ((i & 4) != 0) {
            num = institutionImage.width;
        }
        java.lang.Integer num3 = num;
        if ((i & 8) != 0) {
            num2 = institutionImage.height;
        }
        java.lang.Integer num4 = num2;
        if ((i & 16) != 0) {
            institutionImageCategory = institutionImage.category;
        }
        return institutionImage.copy(str, str3, num3, num4, institutionImageCategory);
    }
}
