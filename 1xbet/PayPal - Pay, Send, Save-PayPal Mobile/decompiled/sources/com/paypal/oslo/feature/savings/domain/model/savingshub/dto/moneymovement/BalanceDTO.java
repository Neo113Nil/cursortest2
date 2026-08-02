package com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/BalanceDTO;", "", "", "instrumentId", "currencyCode", "", "primary", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/BalanceDTO;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$savings_prodRelease", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/BalanceDTO;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getInstrumentId", "getCurrencyCode", "Z", "getPrimary", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class BalanceDTO {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.BalanceDTO.Companion INSTANCE = new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.BalanceDTO.Companion(null);
    private final java.lang.String currencyCode;
    private final java.lang.String instrumentId;
    private final boolean primary;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/BalanceDTO$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/BalanceDTO;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.BalanceDTO> serializer() {
            return com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.BalanceDTO$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BalanceDTO(int i, java.lang.String str, java.lang.String str2, boolean z, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.BalanceDTO$$serializer.INSTANCE.getDescriptor());
        }
        this.instrumentId = str;
        this.currencyCode = str2;
        this.primary = z;
    }

    public BalanceDTO(java.lang.String str, java.lang.String str2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.instrumentId = str;
        this.currencyCode = str2;
        this.primary = z;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$savings_prodRelease(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.BalanceDTO self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.instrumentId);
        output.encodeStringElement(serialDesc, 1, self.currencyCode);
        output.encodeBooleanElement(serialDesc, 2, self.primary);
    }

    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final boolean getPrimary() {
        return this.primary;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.instrumentId;
        java.lang.String str2 = this.currencyCode;
        boolean z = this.primary;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BalanceDTO(instrumentId=");
        sb.append(str);
        sb.append(", currencyCode=");
        sb.append(str2);
        sb.append(", primary=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.instrumentId.hashCode() * 31) + this.currencyCode.hashCode()) * 31) + java.lang.Boolean.hashCode(this.primary);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.BalanceDTO)) {
            return false;
        }
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.BalanceDTO balanceDTO = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.BalanceDTO) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, balanceDTO.instrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, balanceDTO.currencyCode) && this.primary == balanceDTO.primary;
    }

    public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.BalanceDTO copy(java.lang.String instrumentId, java.lang.String currencyCode, boolean primary) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        return new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.BalanceDTO(instrumentId, currencyCode, primary);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getPrimary() {
        return this.primary;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.BalanceDTO copy$default(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.BalanceDTO balanceDTO, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = balanceDTO.instrumentId;
        }
        if ((i & 2) != 0) {
            str2 = balanceDTO.currencyCode;
        }
        if ((i & 4) != 0) {
            z = balanceDTO.primary;
        }
        return balanceDTO.copy(str, str2, z);
    }
}
