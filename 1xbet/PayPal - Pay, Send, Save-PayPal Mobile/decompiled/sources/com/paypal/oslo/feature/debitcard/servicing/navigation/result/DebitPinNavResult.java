package com.paypal.oslo.feature.debitcard.servicing.navigation.result;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0002)(B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J2\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011J'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b\u0003\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitPinNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "", "isPinSet", "", "errorMessage", "collectedPin", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "copy", "(ZLjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitPinNavResult;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$debit_card_prodRelease", "(Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitPinNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", "Ljava/lang/String;", "getErrorMessage", "getCollectedPin", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class DebitPinNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitPinNavResult.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitPinNavResult.Companion(null);
    private final java.lang.String collectedPin;
    private final java.lang.String errorMessage;
    private final boolean isPinSet;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitPinNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitPinNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitPinNavResult> serializer() {
            return com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitPinNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DebitPinNavResult(int i, boolean z, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitPinNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.isPinSet = z;
        if ((i & 2) == 0) {
            this.errorMessage = null;
        } else {
            this.errorMessage = str;
        }
        if ((i & 4) == 0) {
            this.collectedPin = null;
        } else {
            this.collectedPin = str2;
        }
    }

    public DebitPinNavResult(boolean z, java.lang.String str, java.lang.String str2) {
        this.isPinSet = z;
        this.errorMessage = str;
        this.collectedPin = str2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$debit_card_prodRelease(com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitPinNavResult self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.isPinSet);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.errorMessage != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.errorMessage);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.collectedPin != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.collectedPin);
        }
    }

    public /* synthetic */ DebitPinNavResult(boolean z, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    public final boolean isPinSet() {
        return this.isPinSet;
    }

    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    public final java.lang.String getCollectedPin() {
        return this.collectedPin;
    }

    public final java.lang.String toString() {
        boolean z = this.isPinSet;
        java.lang.String str = this.errorMessage;
        java.lang.String str2 = this.collectedPin;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitPinNavResult(isPinSet=");
        sb.append(z);
        sb.append(", errorMessage=");
        sb.append(str);
        sb.append(", collectedPin=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isPinSet);
        java.lang.String str = this.errorMessage;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.collectedPin;
        return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitPinNavResult)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitPinNavResult debitPinNavResult = (com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitPinNavResult) other;
        return this.isPinSet == debitPinNavResult.isPinSet && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, debitPinNavResult.errorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.collectedPin, debitPinNavResult.collectedPin);
    }

    public final com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitPinNavResult copy(boolean isPinSet, java.lang.String errorMessage, java.lang.String collectedPin) {
        return new com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitPinNavResult(isPinSet, errorMessage, collectedPin);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCollectedPin() {
        return this.collectedPin;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsPinSet() {
        return this.isPinSet;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitPinNavResult copy$default(com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitPinNavResult debitPinNavResult, boolean z, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = debitPinNavResult.isPinSet;
        }
        if ((i & 2) != 0) {
            str = debitPinNavResult.errorMessage;
        }
        if ((i & 4) != 0) {
            str2 = debitPinNavResult.collectedPin;
        }
        return debitPinNavResult.copy(z, str, str2);
    }
}
