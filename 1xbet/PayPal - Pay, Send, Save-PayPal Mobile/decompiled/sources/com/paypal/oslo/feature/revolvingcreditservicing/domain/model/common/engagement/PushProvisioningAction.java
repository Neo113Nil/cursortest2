package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/PushProvisioningAction;", "", "", "visible", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/EngagementTracking;", "tracking", "<init>", "(ZLcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/EngagementTracking;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/EngagementTracking;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/EngagementTracking;", "copy", "(ZLcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/EngagementTracking;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/PushProvisioningAction;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/PushProvisioningAction;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", "getVisible", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/EngagementTracking;", "getTracking", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class PushProvisioningAction {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.PushProvisioningAction.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.PushProvisioningAction.Companion(null);
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementTracking tracking;
    private final boolean visible;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/PushProvisioningAction$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/PushProvisioningAction;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.PushProvisioningAction> serializer() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.PushProvisioningAction$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PushProvisioningAction(int i, boolean z, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementTracking engagementTracking, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.PushProvisioningAction$$serializer.INSTANCE.getDescriptor());
        }
        this.visible = z;
        this.tracking = engagementTracking;
    }

    public PushProvisioningAction(boolean z, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementTracking engagementTracking) {
        this.visible = z;
        this.tracking = engagementTracking;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.PushProvisioningAction self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.visible);
        output.encodeNullableSerializableElement(serialDesc, 1, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementTracking$$serializer.INSTANCE, self.tracking);
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementTracking getTracking() {
        return this.tracking;
    }

    public final java.lang.String toString() {
        boolean z = this.visible;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementTracking engagementTracking = this.tracking;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PushProvisioningAction(visible=");
        sb.append(z);
        sb.append(", tracking=");
        sb.append(engagementTracking);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.visible);
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementTracking engagementTracking = this.tracking;
        return (hashCode * 31) + (engagementTracking == null ? 0 : engagementTracking.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.PushProvisioningAction)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.PushProvisioningAction pushProvisioningAction = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.PushProvisioningAction) other;
        return this.visible == pushProvisioningAction.visible && kotlin.jvm.internal.Intrinsics.areEqual(this.tracking, pushProvisioningAction.tracking);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.PushProvisioningAction copy(boolean visible, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementTracking tracking) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.PushProvisioningAction(visible, tracking);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementTracking getTracking() {
        return this.tracking;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.PushProvisioningAction copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.PushProvisioningAction pushProvisioningAction, boolean z, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementTracking engagementTracking, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = pushProvisioningAction.visible;
        }
        if ((i & 2) != 0) {
            engagementTracking = pushProvisioningAction.tracking;
        }
        return pushProvisioningAction.copy(z, engagementTracking);
    }
}
