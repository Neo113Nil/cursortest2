package com.paypal.oslo.feature.wallet.banks.domain.model;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012JD\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0012J'\u0010(\u001a\u00020'2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b1\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/LinkedBankAccountResult;", "", "", "bankAccountId", "lastNChars", "Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "type", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountAction;", "action", "inlineLogoData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountAction;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountAction;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "component4", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountAction;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountAction;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/LinkedBankAccountResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/LinkedBankAccountResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getBankAccountId", "getLastNChars", "Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "getType", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountAction;", "getAction", "getInlineLogoData", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class LinkedBankAccountResult {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction action;
    private final java.lang.String bankAccountId;
    private final java.lang.String inlineLogoData;
    private final java.lang.String lastNChars;
    private final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult.Companion INSTANCE = new com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.INSTANCE.serializer();
            return serializer;
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction", com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction.values());
            return createSimpleEnumSerializer;
        }
    }), null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/LinkedBankAccountResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/LinkedBankAccountResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult> serializer() {
            return com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ LinkedBankAccountResult(int i, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction bankAccountAction, java.lang.String str3, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 15, com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult$$serializer.INSTANCE.getDescriptor());
        }
        this.bankAccountId = str;
        this.lastNChars = str2;
        this.type = bankAccountType;
        this.action = bankAccountAction;
        if ((i & 16) == 0) {
            this.inlineLogoData = null;
        } else {
            this.inlineLogoData = str3;
        }
    }

    public LinkedBankAccountResult(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction bankAccountAction, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountAction, "");
        this.bankAccountId = str;
        this.lastNChars = str2;
        this.type = bankAccountType;
        this.action = bankAccountAction;
        this.inlineLogoData = str3;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$wallet_prodRelease(com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.bankAccountId);
        output.encodeStringElement(serialDesc, 1, self.lastNChars);
        output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.type);
        output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.action);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.inlineLogoData != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.inlineLogoData);
        }
    }

    public /* synthetic */ LinkedBankAccountResult(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction bankAccountAction, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bankAccountType, bankAccountAction, (i & 16) != 0 ? null : str3);
    }

    public final java.lang.String getBankAccountId() {
        return this.bankAccountId;
    }

    public final java.lang.String getLastNChars() {
        return this.lastNChars;
    }

    public final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType getType() {
        return this.type;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction getAction() {
        return this.action;
    }

    public final java.lang.String getInlineLogoData() {
        return this.inlineLogoData;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.bankAccountId;
        java.lang.String str2 = this.lastNChars;
        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType = this.type;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction bankAccountAction = this.action;
        java.lang.String str3 = this.inlineLogoData;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkedBankAccountResult(bankAccountId=");
        sb.append(str);
        sb.append(", lastNChars=");
        sb.append(str2);
        sb.append(", type=");
        sb.append(bankAccountType);
        sb.append(", action=");
        sb.append(bankAccountAction);
        sb.append(", inlineLogoData=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.bankAccountId.hashCode();
        int hashCode2 = this.lastNChars.hashCode();
        int hashCode3 = this.type.hashCode();
        int hashCode4 = this.action.hashCode();
        java.lang.String str = this.inlineLogoData;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult linkedBankAccountResult = (com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccountId, linkedBankAccountResult.bankAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, linkedBankAccountResult.lastNChars) && this.type == linkedBankAccountResult.type && this.action == linkedBankAccountResult.action && kotlin.jvm.internal.Intrinsics.areEqual(this.inlineLogoData, linkedBankAccountResult.inlineLogoData);
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult copy(java.lang.String bankAccountId, java.lang.String lastNChars, com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType type, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction action, java.lang.String inlineLogoData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        return new com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult(bankAccountId, lastNChars, type, action, inlineLogoData);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getInlineLogoData() {
        return this.inlineLogoData;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLastNChars() {
        return this.lastNChars;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getBankAccountId() {
        return this.bankAccountId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult linkedBankAccountResult, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction bankAccountAction, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = linkedBankAccountResult.bankAccountId;
        }
        if ((i & 2) != 0) {
            str2 = linkedBankAccountResult.lastNChars;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            bankAccountType = linkedBankAccountResult.type;
        }
        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType2 = bankAccountType;
        if ((i & 8) != 0) {
            bankAccountAction = linkedBankAccountResult.action;
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction bankAccountAction2 = bankAccountAction;
        if ((i & 16) != 0) {
            str3 = linkedBankAccountResult.inlineLogoData;
        }
        return linkedBankAccountResult.copy(str, str4, bankAccountType2, bankAccountAction2, str3);
    }
}
