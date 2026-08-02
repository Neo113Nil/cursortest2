package com.paypal.oslo.feature.wallet.fifo.common.domain.model;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013JP\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0013J'\u0010+\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b3\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b4\u0010\u0013R\u001a\u0010\n\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b5\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/FundingInstrumentBank;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/FundingInstrument;", "", "id", "Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;", "fundingInstrumentType", "Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "bankType", "lastNChars", "logoUrl", "name", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;", "component3", "()Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/FundingInstrumentBank;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/FundingInstrumentBank;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;", "getFundingInstrumentType", "Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "getBankType", "getLastNChars", "getLogoUrl", "getName", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class FundingInstrumentBank implements com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrument {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankType;
    private final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType;
    private final java.lang.String id;
    private final java.lang.String lastNChars;
    private final java.lang.String logoUrl;
    private final java.lang.String name;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrumentBank.Companion INSTANCE = new com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrumentBank.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrumentBank$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType.INSTANCE.serializer();
            return serializer;
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrumentBank$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.INSTANCE.serializer();
            return serializer;
        }
    }), null, null, null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/FundingInstrumentBank$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/FundingInstrumentBank;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrumentBank> serializer() {
            return com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrumentBank$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FundingInstrumentBank(int i, java.lang.String str, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType, com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 63, com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrumentBank$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.fundingInstrumentType = fundingInstrumentType;
        this.bankType = bankAccountType;
        this.lastNChars = str2;
        this.logoUrl = str3;
        this.name = str4;
    }

    public FundingInstrumentBank(java.lang.String str, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType, com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.id = str;
        this.fundingInstrumentType = fundingInstrumentType;
        this.bankType = bankAccountType;
        this.lastNChars = str2;
        this.logoUrl = str3;
        this.name = str4;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$wallet_prodRelease(com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrumentBank self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.getId());
        output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.getFundingInstrumentType());
        output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.bankType);
        output.encodeNullableSerializableElement(serialDesc, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.lastNChars);
        output.encodeNullableSerializableElement(serialDesc, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.getLogoUrl());
        output.encodeStringElement(serialDesc, 5, self.getName());
    }

    @Override // com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrument
    public final java.lang.String getId() {
        return this.id;
    }

    @Override // com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrument
    public final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType getFundingInstrumentType() {
        return this.fundingInstrumentType;
    }

    public final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType getBankType() {
        return this.bankType;
    }

    public final java.lang.String getLastNChars() {
        return this.lastNChars;
    }

    @Override // com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrument
    public final java.lang.String getLogoUrl() {
        return this.logoUrl;
    }

    @Override // com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrument
    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType = this.fundingInstrumentType;
        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType = this.bankType;
        java.lang.String str2 = this.lastNChars;
        java.lang.String str3 = this.logoUrl;
        java.lang.String str4 = this.name;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingInstrumentBank(id=");
        sb.append(str);
        sb.append(", fundingInstrumentType=");
        sb.append(fundingInstrumentType);
        sb.append(", bankType=");
        sb.append(bankAccountType);
        sb.append(", lastNChars=");
        sb.append(str2);
        sb.append(", logoUrl=");
        sb.append(str3);
        sb.append(", name=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.fundingInstrumentType.hashCode();
        int hashCode3 = this.bankType.hashCode();
        java.lang.String str = this.lastNChars;
        int hashCode4 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.logoUrl;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.name.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrumentBank)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrumentBank fundingInstrumentBank = (com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrumentBank) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, fundingInstrumentBank.id) && this.fundingInstrumentType == fundingInstrumentBank.fundingInstrumentType && this.bankType == fundingInstrumentBank.bankType && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, fundingInstrumentBank.lastNChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoUrl, fundingInstrumentBank.logoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, fundingInstrumentBank.name);
    }

    public final com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrumentBank copy(java.lang.String id, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType, com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankType, java.lang.String lastNChars, java.lang.String logoUrl, java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return new com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrumentBank(id, fundingInstrumentType, bankType, lastNChars, logoUrl, name2);
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getLogoUrl() {
        return this.logoUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getLastNChars() {
        return this.lastNChars;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType getBankType() {
        return this.bankType;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType getFundingInstrumentType() {
        return this.fundingInstrumentType;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrumentBank copy$default(com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrumentBank fundingInstrumentBank, java.lang.String str, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType, com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = fundingInstrumentBank.id;
        }
        if ((i & 2) != 0) {
            fundingInstrumentType = fundingInstrumentBank.fundingInstrumentType;
        }
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType2 = fundingInstrumentType;
        if ((i & 4) != 0) {
            bankAccountType = fundingInstrumentBank.bankType;
        }
        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType2 = bankAccountType;
        if ((i & 8) != 0) {
            str2 = fundingInstrumentBank.lastNChars;
        }
        java.lang.String str5 = str2;
        if ((i & 16) != 0) {
            str3 = fundingInstrumentBank.logoUrl;
        }
        java.lang.String str6 = str3;
        if ((i & 32) != 0) {
            str4 = fundingInstrumentBank.name;
        }
        return fundingInstrumentBank.copy(str, fundingInstrumentType2, bankAccountType2, str5, str6, str4);
    }
}
