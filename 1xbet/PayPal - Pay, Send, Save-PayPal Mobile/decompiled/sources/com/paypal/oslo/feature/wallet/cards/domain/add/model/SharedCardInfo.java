package com.paypal.oslo.feature.wallet.cards.domain.add.model;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/SharedCardInfo;", "", "", "last4Char", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CreditCard;", "creditCard", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CreditCard;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CreditCard;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CreditCard;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CreditCard;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/SharedCardInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/SharedCardInfo;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getLast4Char", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CreditCard;", "getCreditCard", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class SharedCardInfo {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.SharedCardInfo.Companion INSTANCE = new com.paypal.oslo.feature.wallet.cards.domain.add.model.SharedCardInfo.Companion(null);
    private final com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard creditCard;
    private final java.lang.String last4Char;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/SharedCardInfo$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/SharedCardInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.cards.domain.add.model.SharedCardInfo> serializer() {
            return com.paypal.oslo.feature.wallet.cards.domain.add.model.SharedCardInfo$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SharedCardInfo(int i, java.lang.String str, com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard creditCard, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.wallet.cards.domain.add.model.SharedCardInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.last4Char = str;
        this.creditCard = creditCard;
    }

    public SharedCardInfo(java.lang.String str, com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard creditCard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCard, "");
        this.last4Char = str;
        this.creditCard = creditCard;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$wallet_prodRelease(com.paypal.oslo.feature.wallet.cards.domain.add.model.SharedCardInfo self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.last4Char);
        output.encodeSerializableElement(serialDesc, 1, com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard$$serializer.INSTANCE, self.creditCard);
    }

    public final java.lang.String getLast4Char() {
        return this.last4Char;
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard getCreditCard() {
        return this.creditCard;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.last4Char;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard creditCard = this.creditCard;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SharedCardInfo(last4Char=");
        sb.append(str);
        sb.append(", creditCard=");
        sb.append(creditCard);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.last4Char.hashCode() * 31) + this.creditCard.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.cards.domain.add.model.SharedCardInfo)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.cards.domain.add.model.SharedCardInfo sharedCardInfo = (com.paypal.oslo.feature.wallet.cards.domain.add.model.SharedCardInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.last4Char, sharedCardInfo.last4Char) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditCard, sharedCardInfo.creditCard);
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.SharedCardInfo copy(java.lang.String last4Char, com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard creditCard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(last4Char, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCard, "");
        return new com.paypal.oslo.feature.wallet.cards.domain.add.model.SharedCardInfo(last4Char, creditCard);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard getCreditCard() {
        return this.creditCard;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getLast4Char() {
        return this.last4Char;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.add.model.SharedCardInfo copy$default(com.paypal.oslo.feature.wallet.cards.domain.add.model.SharedCardInfo sharedCardInfo, java.lang.String str, com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard creditCard, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = sharedCardInfo.last4Char;
        }
        if ((i & 2) != 0) {
            creditCard = sharedCardInfo.creditCard;
        }
        return sharedCardInfo.copy(str, creditCard);
    }
}
