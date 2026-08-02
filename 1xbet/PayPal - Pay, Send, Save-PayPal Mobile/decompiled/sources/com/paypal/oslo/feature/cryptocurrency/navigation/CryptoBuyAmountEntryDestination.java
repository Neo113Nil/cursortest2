package com.paypal.oslo.feature.cryptocurrency.navigation;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/navigation/CryptoBuyAmountEntryDestination;", "Lcom/paypal/oslo/feature/cryptocurrency/navigation/CryptoBuyFlowDestination;", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/navigation/CryptoBuyAmountEntryDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$cryptocurrency_prodRelease", "(Lcom/paypal/oslo/feature/cryptocurrency/navigation/CryptoBuyAmountEntryDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getAssetSymbol", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class CryptoBuyAmountEntryDestination implements com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyFlowDestination {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyAmountEntryDestination.Companion INSTANCE = new com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyAmountEntryDestination.Companion(null);
    private final java.lang.String assetSymbol;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/navigation/CryptoBuyAmountEntryDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/cryptocurrency/navigation/CryptoBuyAmountEntryDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyAmountEntryDestination> serializer() {
            return com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyAmountEntryDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CryptoBuyAmountEntryDestination(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyAmountEntryDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.assetSymbol = str;
    }

    public CryptoBuyAmountEntryDestination(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.assetSymbol = str;
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyFlowDestination
    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.assetSymbol;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoBuyAmountEntryDestination(assetSymbol=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.assetSymbol.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyAmountEntryDestination) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, ((com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyAmountEntryDestination) other).assetSymbol);
    }

    public final com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyAmountEntryDestination copy(java.lang.String assetSymbol) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
        return new com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyAmountEntryDestination(assetSymbol);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyAmountEntryDestination copy$default(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyAmountEntryDestination cryptoBuyAmountEntryDestination, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cryptoBuyAmountEntryDestination.assetSymbol;
        }
        return cryptoBuyAmountEntryDestination.copy(str);
    }
}
