package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0081\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBW\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJX\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0015J'\u0010.\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b:\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditInstrument;", "", "", "creditInstrumentId", "lastDigits", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CreditInstrumentStatus;", "status", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/PinOrigin;", "pinOrigin", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CreditInstrumentActivationStatus;", "activationStatus", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/InstrumentType;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CreditInstrumentStatus;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/PinOrigin;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CreditInstrumentActivationStatus;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/InstrumentType;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CreditInstrumentStatus;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/PinOrigin;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CreditInstrumentActivationStatus;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/InstrumentType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CreditInstrumentStatus;", "component4", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/PinOrigin;", "component5", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CreditInstrumentActivationStatus;", "component6", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/InstrumentType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CreditInstrumentStatus;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/PinOrigin;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CreditInstrumentActivationStatus;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/InstrumentType;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditInstrument;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getCreditInstrumentId", "getLastDigits", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CreditInstrumentStatus;", "getStatus", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/PinOrigin;", "getPinOrigin", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CreditInstrumentActivationStatus;", "getActivationStatus", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/InstrumentType;", "getType", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class CreditInstrument {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus activationStatus;
    private final java.lang.String creditInstrumentId;
    private final java.lang.String lastDigits;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.PinOrigin pinOrigin;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus status;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus.values());
            return createSimpleEnumSerializer;
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.PinOrigin", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.PinOrigin.values());
            return createSimpleEnumSerializer;
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus.values());
            return createSimpleEnumSerializer;
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType.values());
            return createSimpleEnumSerializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditInstrument$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditInstrument;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument> serializer() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CreditInstrument(int i, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus creditInstrumentStatus, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.PinOrigin pinOrigin, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus creditInstrumentActivationStatus, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType instrumentType, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 31, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument$$serializer.INSTANCE.getDescriptor());
        }
        this.creditInstrumentId = str;
        this.lastDigits = str2;
        this.status = creditInstrumentStatus;
        this.pinOrigin = pinOrigin;
        this.activationStatus = creditInstrumentActivationStatus;
        if ((i & 32) == 0) {
            this.type = null;
        } else {
            this.type = instrumentType;
        }
    }

    public CreditInstrument(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus creditInstrumentStatus, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.PinOrigin pinOrigin, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus creditInstrumentActivationStatus, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType instrumentType) {
        this.creditInstrumentId = str;
        this.lastDigits = str2;
        this.status = creditInstrumentStatus;
        this.pinOrigin = pinOrigin;
        this.activationStatus = creditInstrumentActivationStatus;
        this.type = instrumentType;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.creditInstrumentId);
        output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.lastDigits);
        output.encodeNullableSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.status);
        output.encodeNullableSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.pinOrigin);
        output.encodeNullableSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.activationStatus);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.type != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.type);
        }
    }

    public /* synthetic */ CreditInstrument(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus creditInstrumentStatus, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.PinOrigin pinOrigin, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus creditInstrumentActivationStatus, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType instrumentType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, creditInstrumentStatus, pinOrigin, creditInstrumentActivationStatus, (i & 32) != 0 ? null : instrumentType);
    }

    public final java.lang.String getCreditInstrumentId() {
        return this.creditInstrumentId;
    }

    public final java.lang.String getLastDigits() {
        return this.lastDigits;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus getStatus() {
        return this.status;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.PinOrigin getPinOrigin() {
        return this.pinOrigin;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus getActivationStatus() {
        return this.activationStatus;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType getType() {
        return this.type;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.creditInstrumentId;
        java.lang.String str2 = this.lastDigits;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus creditInstrumentStatus = this.status;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.PinOrigin pinOrigin = this.pinOrigin;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus creditInstrumentActivationStatus = this.activationStatus;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType instrumentType = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreditInstrument(creditInstrumentId=");
        sb.append(str);
        sb.append(", lastDigits=");
        sb.append(str2);
        sb.append(", status=");
        sb.append(creditInstrumentStatus);
        sb.append(", pinOrigin=");
        sb.append(pinOrigin);
        sb.append(", activationStatus=");
        sb.append(creditInstrumentActivationStatus);
        sb.append(", type=");
        sb.append(instrumentType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.creditInstrumentId;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.lastDigits;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus creditInstrumentStatus = this.status;
        int hashCode3 = creditInstrumentStatus == null ? 0 : creditInstrumentStatus.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.PinOrigin pinOrigin = this.pinOrigin;
        int hashCode4 = pinOrigin == null ? 0 : pinOrigin.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus creditInstrumentActivationStatus = this.activationStatus;
        int hashCode5 = creditInstrumentActivationStatus == null ? 0 : creditInstrumentActivationStatus.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType instrumentType = this.type;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (instrumentType != null ? instrumentType.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument creditInstrument = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.creditInstrumentId, creditInstrument.creditInstrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastDigits, creditInstrument.lastDigits) && this.status == creditInstrument.status && this.pinOrigin == creditInstrument.pinOrigin && this.activationStatus == creditInstrument.activationStatus && this.type == creditInstrument.type;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument copy(java.lang.String creditInstrumentId, java.lang.String lastDigits, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus status, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.PinOrigin pinOrigin, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus activationStatus, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType type) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument(creditInstrumentId, lastDigits, status, pinOrigin, activationStatus, type);
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType getType() {
        return this.type;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus getActivationStatus() {
        return this.activationStatus;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.PinOrigin getPinOrigin() {
        return this.pinOrigin;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLastDigits() {
        return this.lastDigits;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCreditInstrumentId() {
        return this.creditInstrumentId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument creditInstrument, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus creditInstrumentStatus, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.PinOrigin pinOrigin, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus creditInstrumentActivationStatus, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType instrumentType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = creditInstrument.creditInstrumentId;
        }
        if ((i & 2) != 0) {
            str2 = creditInstrument.lastDigits;
        }
        java.lang.String str3 = str2;
        if ((i & 4) != 0) {
            creditInstrumentStatus = creditInstrument.status;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus creditInstrumentStatus2 = creditInstrumentStatus;
        if ((i & 8) != 0) {
            pinOrigin = creditInstrument.pinOrigin;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.PinOrigin pinOrigin2 = pinOrigin;
        if ((i & 16) != 0) {
            creditInstrumentActivationStatus = creditInstrument.activationStatus;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus creditInstrumentActivationStatus2 = creditInstrumentActivationStatus;
        if ((i & 32) != 0) {
            instrumentType = creditInstrument.type;
        }
        return creditInstrument.copy(str, str3, creditInstrumentStatus2, pinOrigin2, creditInstrumentActivationStatus2, instrumentType);
    }
}
