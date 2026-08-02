package com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/IssuerDTO;", "", "", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/NameDTO;", "names", "", "countryCode", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/IssuerDTO;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$savings_prodRelease", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/IssuerDTO;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/List;", "getNames", "Ljava/lang/String;", "getCountryCode", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class IssuerDTO {
    private final java.lang.String countryCode;
    private final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.NameDTO> names;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.IssuerDTO.Companion INSTANCE = new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.IssuerDTO.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.IssuerDTO$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.IssuerDTO.$r8$lambda$KoM_fyj1EFNmf_usF4vIwr916sc();
        }
    }), null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/IssuerDTO$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/IssuerDTO;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.IssuerDTO> serializer() {
            return com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.IssuerDTO$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ IssuerDTO(int i, java.util.List list, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.IssuerDTO$$serializer.INSTANCE.getDescriptor());
        }
        this.names = list;
        this.countryCode = str;
    }

    public IssuerDTO(java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.NameDTO> list, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.names = list;
        this.countryCode = str;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$savings_prodRelease(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.IssuerDTO self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, $childSerializers[0].getValue(), self.names);
        output.encodeStringElement(serialDesc, 1, self.countryCode);
    }

    public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.NameDTO> getNames() {
        return this.names;
    }

    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$KoM_fyj1EFNmf_usF4vIwr916sc() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.NameDTO$$serializer.INSTANCE);
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.NameDTO> list = this.names;
        java.lang.String str = this.countryCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IssuerDTO(names=");
        sb.append(list);
        sb.append(", countryCode=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.names.hashCode() * 31) + this.countryCode.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.IssuerDTO)) {
            return false;
        }
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.IssuerDTO issuerDTO = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.IssuerDTO) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.names, issuerDTO.names) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, issuerDTO.countryCode);
    }

    public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.IssuerDTO copy(java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.NameDTO> names, java.lang.String countryCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(names, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        return new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.IssuerDTO(names, countryCode);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.NameDTO> component1() {
        return this.names;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.IssuerDTO copy$default(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.IssuerDTO issuerDTO, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = issuerDTO.names;
        }
        if ((i & 2) != 0) {
            str = issuerDTO.countryCode;
        }
        return issuerDTO.copy(list, str);
    }
}
