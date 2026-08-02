package com.paypal.oslo.feature.savings.domain.model.savingshub.parser;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ(\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\rR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/MoneyAmount;", "", "", "amount", "amountUnit", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/MoneyAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$savings_prodRelease", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/MoneyAmount;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getAmount", "getAmount$annotations", "()V", "getAmountUnit", "getAmountUnit$annotations", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class MoneyAmount {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.parser.MoneyAmount.Companion INSTANCE = new com.paypal.oslo.feature.savings.domain.model.savingshub.parser.MoneyAmount.Companion(null);
    private final java.lang.String amount;
    private final java.lang.String amountUnit;

    @kotlinx.serialization.SerialName("amount")
    public static /* synthetic */ void getAmount$annotations() {
    }

    @kotlinx.serialization.SerialName("amount_unit")
    public static /* synthetic */ void getAmountUnit$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/MoneyAmount$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/MoneyAmount;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.savings.domain.model.savingshub.parser.MoneyAmount> serializer() {
            return com.paypal.oslo.feature.savings.domain.model.savingshub.parser.MoneyAmount$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MoneyAmount(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.amount = null;
        } else {
            this.amount = str;
        }
        if ((i & 2) == 0) {
            this.amountUnit = null;
        } else {
            this.amountUnit = str2;
        }
    }

    public MoneyAmount(java.lang.String str, java.lang.String str2) {
        this.amount = str;
        this.amountUnit = str2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$savings_prodRelease(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.MoneyAmount self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.amount != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.amount);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.amountUnit != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.amountUnit);
        }
    }

    public /* synthetic */ MoneyAmount(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public final java.lang.String getAmount() {
        return this.amount;
    }

    public final java.lang.String getAmountUnit() {
        return this.amountUnit;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.amount;
        java.lang.String str2 = this.amountUnit;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MoneyAmount(amount=");
        sb.append(str);
        sb.append(", amountUnit=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.amount;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.amountUnit;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.parser.MoneyAmount)) {
            return false;
        }
        com.paypal.oslo.feature.savings.domain.model.savingshub.parser.MoneyAmount moneyAmount = (com.paypal.oslo.feature.savings.domain.model.savingshub.parser.MoneyAmount) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, moneyAmount.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountUnit, moneyAmount.amountUnit);
    }

    public final com.paypal.oslo.feature.savings.domain.model.savingshub.parser.MoneyAmount copy(java.lang.String amount, java.lang.String amountUnit) {
        return new com.paypal.oslo.feature.savings.domain.model.savingshub.parser.MoneyAmount(amount, amountUnit);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAmountUnit() {
        return this.amountUnit;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAmount() {
        return this.amount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.parser.MoneyAmount copy$default(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.MoneyAmount moneyAmount, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = moneyAmount.amount;
        }
        if ((i & 2) != 0) {
            str2 = moneyAmount.amountUnit;
        }
        return moneyAmount.copy(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MoneyAmount() {
        this((java.lang.String) null, (java.lang.String) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }
}
