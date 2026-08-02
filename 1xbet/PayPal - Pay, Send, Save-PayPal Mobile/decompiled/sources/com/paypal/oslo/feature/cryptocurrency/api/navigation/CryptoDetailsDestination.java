package com.paypal.oslo.feature.cryptocurrency.api.navigation;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0002&%B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/api/navigation/CryptoDetailsDestination;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/core/deeplink/DeepLinkBackstackProvider;", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "getIntermediateDestinations", "()Ljava/util/List;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/api/navigation/CryptoDetailsDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$cryptocurrency_api_prodRelease", "(Lcom/paypal/oslo/feature/cryptocurrency/api/navigation/CryptoDetailsDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getAssetSymbol", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class CryptoDetailsDestination implements androidx.navigation3.runtime.NavKey, com.paypal.oslo.core.deeplink.DeepLinkBackstackProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoDetailsDestination.Companion INSTANCE = new com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoDetailsDestination.Companion(null);
    private final java.lang.String assetSymbol;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/api/navigation/CryptoDetailsDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/cryptocurrency/api/navigation/CryptoDetailsDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoDetailsDestination> serializer() {
            return com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoDetailsDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CryptoDetailsDestination(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoDetailsDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.assetSymbol = str;
    }

    public CryptoDetailsDestination(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.assetSymbol = str;
    }

    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
    }

    @Override // com.paypal.oslo.core.deeplink.DeepLinkBackstackProvider
    public final java.util.List<androidx.navigation3.runtime.NavKey> getIntermediateDestinations() {
        return kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoHubDestination.INSTANCE);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.assetSymbol;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoDetailsDestination(assetSymbol=");
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
        return (other instanceof com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoDetailsDestination) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, ((com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoDetailsDestination) other).assetSymbol);
    }

    public final com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoDetailsDestination copy(java.lang.String assetSymbol) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
        return new com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoDetailsDestination(assetSymbol);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoDetailsDestination copy$default(com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoDetailsDestination cryptoDetailsDestination, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cryptoDetailsDestination.assetSymbol;
        }
        return cryptoDetailsDestination.copy(str);
    }
}
