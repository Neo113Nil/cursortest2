package com.paypal.oslo.feature.bnplservicing.navigation;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0002#\"B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/navigation/PlanListDestination;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/feature/bnplservicing/navigation/BnplServicingDeepLinkBackstackProvider;", "", "payLaterSource", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/navigation/PlanListDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bnpl_servicing_prodRelease", "(Lcom/paypal/oslo/feature/bnplservicing/navigation/PlanListDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getPayLaterSource", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class PlanListDestination implements androidx.navigation3.runtime.NavKey, com.paypal.oslo.feature.bnplservicing.navigation.BnplServicingDeepLinkBackstackProvider {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.navigation.PlanListDestination.Companion INSTANCE = new com.paypal.oslo.feature.bnplservicing.navigation.PlanListDestination.Companion(null);
    private final java.lang.String payLaterSource;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/navigation/PlanListDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/bnplservicing/navigation/PlanListDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.bnplservicing.navigation.PlanListDestination> serializer() {
            return com.paypal.oslo.feature.bnplservicing.navigation.PlanListDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PlanListDestination(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.payLaterSource = null;
        } else {
            this.payLaterSource = str;
        }
    }

    public PlanListDestination(java.lang.String str) {
        this.payLaterSource = str;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$bnpl_servicing_prodRelease(com.paypal.oslo.feature.bnplservicing.navigation.PlanListDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.payLaterSource != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.payLaterSource);
        }
    }

    @Override // com.paypal.oslo.feature.bnplservicing.navigation.BnplServicingDeepLinkBackstackProvider, com.paypal.oslo.core.deeplink.DeepLinkBackstackProvider
    public final /* bridge */ java.util.List<androidx.navigation3.runtime.NavKey> getIntermediateDestinations() {
        return super.getIntermediateDestinations();
    }

    public /* synthetic */ PlanListDestination(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public final java.lang.String getPayLaterSource() {
        return this.payLaterSource;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.payLaterSource;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlanListDestination(payLaterSource=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.payLaterSource;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.bnplservicing.navigation.PlanListDestination) && kotlin.jvm.internal.Intrinsics.areEqual(this.payLaterSource, ((com.paypal.oslo.feature.bnplservicing.navigation.PlanListDestination) other).payLaterSource);
    }

    public final com.paypal.oslo.feature.bnplservicing.navigation.PlanListDestination copy(java.lang.String payLaterSource) {
        return new com.paypal.oslo.feature.bnplservicing.navigation.PlanListDestination(payLaterSource);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPayLaterSource() {
        return this.payLaterSource;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.navigation.PlanListDestination copy$default(com.paypal.oslo.feature.bnplservicing.navigation.PlanListDestination planListDestination, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = planListDestination.payLaterSource;
        }
        return planListDestination.copy(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlanListDestination() {
        this((java.lang.String) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }
}
