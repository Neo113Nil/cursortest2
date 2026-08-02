package com.paypal.oslo.feature.cryptocurrency.navigation;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/navigation/CryptoBuyReviewDestination;", "Lcom/paypal/oslo/feature/cryptocurrency/navigation/CryptoBuyFlowDestination;", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/navigation/CryptoBuyReviewDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$cryptocurrency_prodRelease", "(Lcom/paypal/oslo/feature/cryptocurrency/navigation/CryptoBuyReviewDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getAssetSymbol", "getAmount", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class CryptoBuyReviewDestination implements com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyFlowDestination {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyReviewDestination.Companion INSTANCE = new com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyReviewDestination.Companion(null);
    private final java.lang.String amount;
    private final java.lang.String assetSymbol;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/navigation/CryptoBuyReviewDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/cryptocurrency/navigation/CryptoBuyReviewDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyReviewDestination> serializer() {
            return com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyReviewDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CryptoBuyReviewDestination(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyReviewDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.assetSymbol = str;
        this.amount = str2;
    }

    public CryptoBuyReviewDestination(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.assetSymbol = str;
        this.amount = str2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$cryptocurrency_prodRelease(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyReviewDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.getAssetSymbol());
        output.encodeStringElement(serialDesc, 1, self.amount);
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyFlowDestination
    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
    }

    public final java.lang.String getAmount() {
        return this.amount;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.assetSymbol;
        java.lang.String str2 = this.amount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoBuyReviewDestination(assetSymbol=");
        sb.append(str);
        sb.append(", amount=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.assetSymbol.hashCode() * 31) + this.amount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyReviewDestination)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyReviewDestination cryptoBuyReviewDestination = (com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyReviewDestination) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, cryptoBuyReviewDestination.assetSymbol) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, cryptoBuyReviewDestination.amount);
    }

    public final com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyReviewDestination copy(java.lang.String assetSymbol, java.lang.String amount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        return new com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyReviewDestination(assetSymbol, amount);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAmount() {
        return this.amount;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyReviewDestination copy$default(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyReviewDestination cryptoBuyReviewDestination, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cryptoBuyReviewDestination.assetSymbol;
        }
        if ((i & 2) != 0) {
            str2 = cryptoBuyReviewDestination.amount;
        }
        return cryptoBuyReviewDestination.copy(str, str2);
    }
}
