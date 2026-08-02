package com.paypal.oslo.feature.inappcheckout.data.dto;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002('B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/dto/ErrorExtensionsDTO;", "", "", "name", "", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/ErrorDetailDTO;", "details", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/inappcheckout/data/dto/ErrorExtensionsDTO;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$inappcheckout_prodRelease", "(Lcom/paypal/oslo/feature/inappcheckout/data/dto/ErrorExtensionsDTO;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getName", "Ljava/util/List;", "getDetails", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class ErrorExtensionsDTO {
    private final java.util.List<com.paypal.oslo.feature.inappcheckout.data.dto.ErrorDetailDTO> details;
    private final java.lang.String name;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.data.dto.ErrorExtensionsDTO.Companion INSTANCE = new com.paypal.oslo.feature.inappcheckout.data.dto.ErrorExtensionsDTO.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.data.dto.ErrorExtensionsDTO$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.inappcheckout.data.dto.ErrorExtensionsDTO.$r8$lambda$ofGzpiXU8Onk0FMceyHgOKzF8Ww();
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/dto/ErrorExtensionsDTO$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/ErrorExtensionsDTO;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.inappcheckout.data.dto.ErrorExtensionsDTO> serializer() {
            return com.paypal.oslo.feature.inappcheckout.data.dto.ErrorExtensionsDTO$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ErrorExtensionsDTO(int i, java.lang.String str, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.inappcheckout.data.dto.ErrorExtensionsDTO$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        if ((i & 2) == 0) {
            this.details = kotlin.collections.CollectionsKt.emptyList();
        } else {
            this.details = list;
        }
    }

    public ErrorExtensionsDTO(java.lang.String str, java.util.List<com.paypal.oslo.feature.inappcheckout.data.dto.ErrorDetailDTO> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.name = str;
        this.details = list;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$inappcheckout_prodRelease(com.paypal.oslo.feature.inappcheckout.data.dto.ErrorExtensionsDTO self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.name);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !kotlin.jvm.internal.Intrinsics.areEqual(self.details, kotlin.collections.CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.details);
        }
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public /* synthetic */ ErrorExtensionsDTO(java.lang.String str, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final java.util.List<com.paypal.oslo.feature.inappcheckout.data.dto.ErrorDetailDTO> getDetails() {
        return this.details;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$ofGzpiXU8Onk0FMceyHgOKzF8Ww() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.inappcheckout.data.dto.ErrorDetailDTO$$serializer.INSTANCE);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.util.List<com.paypal.oslo.feature.inappcheckout.data.dto.ErrorDetailDTO> list = this.details;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ErrorExtensionsDTO(name=");
        sb.append(str);
        sb.append(", details=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.name;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.details.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.data.dto.ErrorExtensionsDTO)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.data.dto.ErrorExtensionsDTO errorExtensionsDTO = (com.paypal.oslo.feature.inappcheckout.data.dto.ErrorExtensionsDTO) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, errorExtensionsDTO.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.details, errorExtensionsDTO.details);
    }

    public final com.paypal.oslo.feature.inappcheckout.data.dto.ErrorExtensionsDTO copy(java.lang.String name2, java.util.List<com.paypal.oslo.feature.inappcheckout.data.dto.ErrorDetailDTO> details) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(details, "");
        return new com.paypal.oslo.feature.inappcheckout.data.dto.ErrorExtensionsDTO(name2, details);
    }

    public final java.util.List<com.paypal.oslo.feature.inappcheckout.data.dto.ErrorDetailDTO> component2() {
        return this.details;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.dto.ErrorExtensionsDTO copy$default(com.paypal.oslo.feature.inappcheckout.data.dto.ErrorExtensionsDTO errorExtensionsDTO, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = errorExtensionsDTO.name;
        }
        if ((i & 2) != 0) {
            list = errorExtensionsDTO.details;
        }
        return errorExtensionsDTO.copy(str, list);
    }
}
