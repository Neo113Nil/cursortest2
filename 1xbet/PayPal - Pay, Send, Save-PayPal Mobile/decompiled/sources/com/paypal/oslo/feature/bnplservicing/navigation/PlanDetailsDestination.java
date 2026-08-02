package com.paypal.oslo.feature.bnplservicing.navigation;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0002&%B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ&\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b$\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/navigation/PlanDetailsDestination;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/feature/bnplservicing/navigation/BnplServicingDeepLinkBackstackProvider;", "", "creditProductId", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/navigation/PlanDetailsDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bnpl_servicing_prodRelease", "(Lcom/paypal/oslo/feature/bnplservicing/navigation/PlanDetailsDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getCreditProductId", "getSource", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class PlanDetailsDestination implements androidx.navigation3.runtime.NavKey, com.paypal.oslo.feature.bnplservicing.navigation.BnplServicingDeepLinkBackstackProvider {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.navigation.PlanDetailsDestination.Companion INSTANCE = new com.paypal.oslo.feature.bnplservicing.navigation.PlanDetailsDestination.Companion(null);
    private final java.lang.String creditProductId;
    private final java.lang.String source;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/navigation/PlanDetailsDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/bnplservicing/navigation/PlanDetailsDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.bnplservicing.navigation.PlanDetailsDestination> serializer() {
            return com.paypal.oslo.feature.bnplservicing.navigation.PlanDetailsDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PlanDetailsDestination(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.bnplservicing.navigation.PlanDetailsDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.creditProductId = str;
        if ((i & 2) == 0) {
            this.source = null;
        } else {
            this.source = str2;
        }
    }

    public PlanDetailsDestination(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.creditProductId = str;
        this.source = str2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$bnpl_servicing_prodRelease(com.paypal.oslo.feature.bnplservicing.navigation.PlanDetailsDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.creditProductId);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.source != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.source);
        }
    }

    @Override // com.paypal.oslo.feature.bnplservicing.navigation.BnplServicingDeepLinkBackstackProvider, com.paypal.oslo.core.deeplink.DeepLinkBackstackProvider
    public final /* bridge */ java.util.List<androidx.navigation3.runtime.NavKey> getIntermediateDestinations() {
        return super.getIntermediateDestinations();
    }

    public /* synthetic */ PlanDetailsDestination(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    public final java.lang.String getCreditProductId() {
        return this.creditProductId;
    }

    public final java.lang.String getSource() {
        return this.source;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.creditProductId;
        java.lang.String str2 = this.source;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlanDetailsDestination(creditProductId=");
        sb.append(str);
        sb.append(", source=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.creditProductId.hashCode();
        java.lang.String str = this.source;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.navigation.PlanDetailsDestination)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.navigation.PlanDetailsDestination planDetailsDestination = (com.paypal.oslo.feature.bnplservicing.navigation.PlanDetailsDestination) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.creditProductId, planDetailsDestination.creditProductId) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, planDetailsDestination.source);
    }

    public final com.paypal.oslo.feature.bnplservicing.navigation.PlanDetailsDestination copy(java.lang.String creditProductId, java.lang.String source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductId, "");
        return new com.paypal.oslo.feature.bnplservicing.navigation.PlanDetailsDestination(creditProductId, source);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSource() {
        return this.source;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCreditProductId() {
        return this.creditProductId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.navigation.PlanDetailsDestination copy$default(com.paypal.oslo.feature.bnplservicing.navigation.PlanDetailsDestination planDetailsDestination, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = planDetailsDestination.creditProductId;
        }
        if ((i & 2) != 0) {
            str2 = planDetailsDestination.source;
        }
        return planDetailsDestination.copy(str, str2);
    }
}
