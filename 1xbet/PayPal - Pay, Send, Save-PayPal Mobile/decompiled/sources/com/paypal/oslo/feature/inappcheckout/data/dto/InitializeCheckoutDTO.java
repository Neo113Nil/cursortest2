package com.paypal.oslo.feature.inappcheckout.data.dto;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/dto/InitializeCheckoutDTO;", "", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Lcom/paypal/oslo/feature/inappcheckout/data/dto/InitializeCheckoutContextDTO;", "checkoutContext", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/data/dto/InitializeCheckoutContextDTO;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/data/dto/InitializeCheckoutContextDTO;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/inappcheckout/data/dto/InitializeCheckoutContextDTO;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/data/dto/InitializeCheckoutContextDTO;)Lcom/paypal/oslo/feature/inappcheckout/data/dto/InitializeCheckoutDTO;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$inappcheckout_prodRelease", "(Lcom/paypal/oslo/feature/inappcheckout/data/dto/InitializeCheckoutDTO;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getToken", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/InitializeCheckoutContextDTO;", "getCheckoutContext", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class InitializeCheckoutDTO {
    private final com.paypal.oslo.feature.inappcheckout.data.dto.InitializeCheckoutContextDTO checkoutContext;
    private final java.lang.String token;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.data.dto.InitializeCheckoutDTO.Companion INSTANCE = new com.paypal.oslo.feature.inappcheckout.data.dto.InitializeCheckoutDTO.Companion(null);
    public static final int $stable = 8;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/dto/InitializeCheckoutDTO$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/InitializeCheckoutDTO;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.inappcheckout.data.dto.InitializeCheckoutDTO> serializer() {
            return com.paypal.oslo.feature.inappcheckout.data.dto.InitializeCheckoutDTO$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InitializeCheckoutDTO(int i, java.lang.String str, com.paypal.oslo.feature.inappcheckout.data.dto.InitializeCheckoutContextDTO initializeCheckoutContextDTO, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.token = null;
        } else {
            this.token = str;
        }
        if ((i & 2) == 0) {
            this.checkoutContext = null;
        } else {
            this.checkoutContext = initializeCheckoutContextDTO;
        }
    }

    public InitializeCheckoutDTO(java.lang.String str, com.paypal.oslo.feature.inappcheckout.data.dto.InitializeCheckoutContextDTO initializeCheckoutContextDTO) {
        this.token = str;
        this.checkoutContext = initializeCheckoutContextDTO;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$inappcheckout_prodRelease(com.paypal.oslo.feature.inappcheckout.data.dto.InitializeCheckoutDTO self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.token != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.token);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.checkoutContext != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, com.paypal.oslo.feature.inappcheckout.data.dto.InitializeCheckoutContextDTO$$serializer.INSTANCE, self.checkoutContext);
        }
    }

    public /* synthetic */ InitializeCheckoutDTO(java.lang.String str, com.paypal.oslo.feature.inappcheckout.data.dto.InitializeCheckoutContextDTO initializeCheckoutContextDTO, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : initializeCheckoutContextDTO);
    }

    public final java.lang.String getToken() {
        return this.token;
    }

    public final com.paypal.oslo.feature.inappcheckout.data.dto.InitializeCheckoutContextDTO getCheckoutContext() {
        return this.checkoutContext;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.token;
        com.paypal.oslo.feature.inappcheckout.data.dto.InitializeCheckoutContextDTO initializeCheckoutContextDTO = this.checkoutContext;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InitializeCheckoutDTO(token=");
        sb.append(str);
        sb.append(", checkoutContext=");
        sb.append(initializeCheckoutContextDTO);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.token;
        int hashCode = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.inappcheckout.data.dto.InitializeCheckoutContextDTO initializeCheckoutContextDTO = this.checkoutContext;
        return (hashCode * 31) + (initializeCheckoutContextDTO != null ? initializeCheckoutContextDTO.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.data.dto.InitializeCheckoutDTO)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.data.dto.InitializeCheckoutDTO initializeCheckoutDTO = (com.paypal.oslo.feature.inappcheckout.data.dto.InitializeCheckoutDTO) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.token, initializeCheckoutDTO.token) && kotlin.jvm.internal.Intrinsics.areEqual(this.checkoutContext, initializeCheckoutDTO.checkoutContext);
    }

    public final com.paypal.oslo.feature.inappcheckout.data.dto.InitializeCheckoutDTO copy(java.lang.String token, com.paypal.oslo.feature.inappcheckout.data.dto.InitializeCheckoutContextDTO checkoutContext) {
        return new com.paypal.oslo.feature.inappcheckout.data.dto.InitializeCheckoutDTO(token, checkoutContext);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.data.dto.InitializeCheckoutContextDTO getCheckoutContext() {
        return this.checkoutContext;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getToken() {
        return this.token;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.dto.InitializeCheckoutDTO copy$default(com.paypal.oslo.feature.inappcheckout.data.dto.InitializeCheckoutDTO initializeCheckoutDTO, java.lang.String str, com.paypal.oslo.feature.inappcheckout.data.dto.InitializeCheckoutContextDTO initializeCheckoutContextDTO, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = initializeCheckoutDTO.token;
        }
        if ((i & 2) != 0) {
            initializeCheckoutContextDTO = initializeCheckoutDTO.checkoutContext;
        }
        return initializeCheckoutDTO.copy(str, initializeCheckoutContextDTO);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InitializeCheckoutDTO() {
        this((java.lang.String) null, (com.paypal.oslo.feature.inappcheckout.data.dto.InitializeCheckoutContextDTO) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }
}
