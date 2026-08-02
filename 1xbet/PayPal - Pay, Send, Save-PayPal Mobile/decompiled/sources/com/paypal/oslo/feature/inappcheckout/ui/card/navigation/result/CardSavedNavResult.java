package com.paypal.oslo.feature.inappcheckout.ui.card.navigation.result;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/card/navigation/result/CardSavedNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "", "cardSaved", "billingAddressAdded", "<init>", "(ZZ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/paypal/oslo/feature/inappcheckout/ui/card/navigation/result/CardSavedNavResult;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$inappcheckout_prodRelease", "(Lcom/paypal/oslo/feature/inappcheckout/ui/card/navigation/result/CardSavedNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", "getCardSaved", "getBillingAddressAdded", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class CardSavedNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.ui.card.navigation.result.CardSavedNavResult.Companion INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.card.navigation.result.CardSavedNavResult.Companion(null);
    private final boolean billingAddressAdded;
    private final boolean cardSaved;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/card/navigation/result/CardSavedNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/navigation/result/CardSavedNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.inappcheckout.ui.card.navigation.result.CardSavedNavResult> serializer() {
            return com.paypal.oslo.feature.inappcheckout.ui.card.navigation.result.CardSavedNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CardSavedNavResult(int i, boolean z, boolean z2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.inappcheckout.ui.card.navigation.result.CardSavedNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.cardSaved = z;
        this.billingAddressAdded = z2;
    }

    public CardSavedNavResult(boolean z, boolean z2) {
        this.cardSaved = z;
        this.billingAddressAdded = z2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$inappcheckout_prodRelease(com.paypal.oslo.feature.inappcheckout.ui.card.navigation.result.CardSavedNavResult self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.cardSaved);
        output.encodeBooleanElement(serialDesc, 1, self.billingAddressAdded);
    }

    public final boolean getCardSaved() {
        return this.cardSaved;
    }

    public final boolean getBillingAddressAdded() {
        return this.billingAddressAdded;
    }

    public final java.lang.String toString() {
        boolean z = this.cardSaved;
        boolean z2 = this.billingAddressAdded;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardSavedNavResult(cardSaved=");
        sb.append(z);
        sb.append(", billingAddressAdded=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Boolean.hashCode(this.cardSaved) * 31) + java.lang.Boolean.hashCode(this.billingAddressAdded);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.card.navigation.result.CardSavedNavResult)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.ui.card.navigation.result.CardSavedNavResult cardSavedNavResult = (com.paypal.oslo.feature.inappcheckout.ui.card.navigation.result.CardSavedNavResult) other;
        return this.cardSaved == cardSavedNavResult.cardSaved && this.billingAddressAdded == cardSavedNavResult.billingAddressAdded;
    }

    public final com.paypal.oslo.feature.inappcheckout.ui.card.navigation.result.CardSavedNavResult copy(boolean cardSaved, boolean billingAddressAdded) {
        return new com.paypal.oslo.feature.inappcheckout.ui.card.navigation.result.CardSavedNavResult(cardSaved, billingAddressAdded);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getBillingAddressAdded() {
        return this.billingAddressAdded;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getCardSaved() {
        return this.cardSaved;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.card.navigation.result.CardSavedNavResult copy$default(com.paypal.oslo.feature.inappcheckout.ui.card.navigation.result.CardSavedNavResult cardSavedNavResult, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = cardSavedNavResult.cardSaved;
        }
        if ((i & 2) != 0) {
            z2 = cardSavedNavResult.billingAddressAdded;
        }
        return cardSavedNavResult.copy(z, z2);
    }
}
