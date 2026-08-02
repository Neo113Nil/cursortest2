package com.paypal.oslo.feature.wallet.api.navigation;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/ThirdPartyLoyaltyCardScanDestination;", "Landroidx/navigation3/runtime/NavKey;", "", "merchantName", "", "merchantRes", "<init>", "(Ljava/lang/String;I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/paypal/oslo/feature/wallet/api/navigation/ThirdPartyLoyaltyCardScanDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/navigation/ThirdPartyLoyaltyCardScanDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getMerchantName", com.visa.cbp.getEncExpo.warmup, "getMerchantRes", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class ThirdPartyLoyaltyCardScanDestination implements androidx.navigation3.runtime.NavKey {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyCardScanDestination.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyCardScanDestination.Companion(null);
    private final java.lang.String merchantName;
    private final int merchantRes;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/ThirdPartyLoyaltyCardScanDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/ThirdPartyLoyaltyCardScanDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyCardScanDestination> serializer() {
            return com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyCardScanDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ThirdPartyLoyaltyCardScanDestination(int i, java.lang.String str, int i2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyCardScanDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.merchantName = str;
        this.merchantRes = i2;
    }

    public ThirdPartyLoyaltyCardScanDestination(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.merchantName = str;
        this.merchantRes = i;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$wallet_api_prodRelease(com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyCardScanDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.merchantName);
        output.encodeIntElement(serialDesc, 1, self.merchantRes);
    }

    public final java.lang.String getMerchantName() {
        return this.merchantName;
    }

    public final int getMerchantRes() {
        return this.merchantRes;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.merchantName;
        int i = this.merchantRes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ThirdPartyLoyaltyCardScanDestination(merchantName=");
        sb.append(str);
        sb.append(", merchantRes=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.merchantName.hashCode() * 31) + java.lang.Integer.hashCode(this.merchantRes);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyCardScanDestination)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyCardScanDestination thirdPartyLoyaltyCardScanDestination = (com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyCardScanDestination) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.merchantName, thirdPartyLoyaltyCardScanDestination.merchantName) && this.merchantRes == thirdPartyLoyaltyCardScanDestination.merchantRes;
    }

    public final com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyCardScanDestination copy(java.lang.String merchantName, int merchantRes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantName, "");
        return new com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyCardScanDestination(merchantName, merchantRes);
    }

    /* renamed from: component2, reason: from getter */
    public final int getMerchantRes() {
        return this.merchantRes;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMerchantName() {
        return this.merchantName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyCardScanDestination copy$default(com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyCardScanDestination thirdPartyLoyaltyCardScanDestination, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = thirdPartyLoyaltyCardScanDestination.merchantName;
        }
        if ((i2 & 2) != 0) {
            i = thirdPartyLoyaltyCardScanDestination.merchantRes;
        }
        return thirdPartyLoyaltyCardScanDestination.copy(str, i);
    }
}
