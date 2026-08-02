package com.paypal.oslo.feature.qrc.navigation;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0002%$B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/qrc/navigation/PpwMerchantDestination;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/feature/qrc/api/navigation/QrcFlow;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantNavArgs;", "navArgs", "<init>", "(Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantNavArgs;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantNavArgs;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantNavArgs;", "copy", "(Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantNavArgs;)Lcom/paypal/oslo/feature/qrc/navigation/PpwMerchantDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$qrc_prodRelease", "(Lcom/paypal/oslo/feature/qrc/navigation/PpwMerchantDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantNavArgs;", "getNavArgs", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class PpwMerchantDestination implements androidx.navigation3.runtime.NavKey, com.paypal.oslo.feature.qrc.api.navigation.QrcFlow {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.qrc.navigation.PpwMerchantDestination.Companion INSTANCE = new com.paypal.oslo.feature.qrc.navigation.PpwMerchantDestination.Companion(null);
    private final com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantNavArgs navArgs;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/navigation/PpwMerchantDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/qrc/navigation/PpwMerchantDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.qrc.navigation.PpwMerchantDestination> serializer() {
            return com.paypal.oslo.feature.qrc.navigation.PpwMerchantDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PpwMerchantDestination(int i, com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantNavArgs ppwMerchantNavArgs, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.qrc.navigation.PpwMerchantDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.navArgs = ppwMerchantNavArgs;
    }

    public PpwMerchantDestination(com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantNavArgs ppwMerchantNavArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ppwMerchantNavArgs, "");
        this.navArgs = ppwMerchantNavArgs;
    }

    public final com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantNavArgs getNavArgs() {
        return this.navArgs;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantNavArgs ppwMerchantNavArgs = this.navArgs;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PpwMerchantDestination(navArgs=");
        sb.append(ppwMerchantNavArgs);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.navArgs.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.qrc.navigation.PpwMerchantDestination) && kotlin.jvm.internal.Intrinsics.areEqual(this.navArgs, ((com.paypal.oslo.feature.qrc.navigation.PpwMerchantDestination) other).navArgs);
    }

    public final com.paypal.oslo.feature.qrc.navigation.PpwMerchantDestination copy(com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantNavArgs navArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navArgs, "");
        return new com.paypal.oslo.feature.qrc.navigation.PpwMerchantDestination(navArgs);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantNavArgs getNavArgs() {
        return this.navArgs;
    }

    public static /* synthetic */ com.paypal.oslo.feature.qrc.navigation.PpwMerchantDestination copy$default(com.paypal.oslo.feature.qrc.navigation.PpwMerchantDestination ppwMerchantDestination, com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantNavArgs ppwMerchantNavArgs, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            ppwMerchantNavArgs = ppwMerchantDestination.navArgs;
        }
        return ppwMerchantDestination.copy(ppwMerchantNavArgs);
    }
}
