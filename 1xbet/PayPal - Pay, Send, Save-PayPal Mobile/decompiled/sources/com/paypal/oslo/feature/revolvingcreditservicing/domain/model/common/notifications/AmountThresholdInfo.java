package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/AmountThresholdInfo;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/NotificationPreferenceAttributeName;", "name", "", "formattedAmount", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/NotificationPreferenceAttributeName;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/NotificationPreferenceAttributeName;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/NotificationPreferenceAttributeName;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/NotificationPreferenceAttributeName;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/AmountThresholdInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/AmountThresholdInfo;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/NotificationPreferenceAttributeName;", "getName", "Ljava/lang/String;", "getFormattedAmount", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class AmountThresholdInfo {
    public static final int $stable = 0;
    private final java.lang.String formattedAmount;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceAttributeName name;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.AmountThresholdInfo.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.AmountThresholdInfo.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.AmountThresholdInfo$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceAttributeName", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceAttributeName.values());
            return createSimpleEnumSerializer;
        }
    }), null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/AmountThresholdInfo$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/AmountThresholdInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.AmountThresholdInfo> serializer() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.AmountThresholdInfo$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AmountThresholdInfo(int i, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceAttributeName notificationPreferenceAttributeName, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.AmountThresholdInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.name = notificationPreferenceAttributeName;
        this.formattedAmount = str;
    }

    public AmountThresholdInfo(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceAttributeName notificationPreferenceAttributeName, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationPreferenceAttributeName, "");
        this.name = notificationPreferenceAttributeName;
        this.formattedAmount = str;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.AmountThresholdInfo self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, $childSerializers[0].getValue(), self.name);
        output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.formattedAmount);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceAttributeName getName() {
        return this.name;
    }

    public final java.lang.String getFormattedAmount() {
        return this.formattedAmount;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceAttributeName notificationPreferenceAttributeName = this.name;
        java.lang.String str = this.formattedAmount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountThresholdInfo(name=");
        sb.append(notificationPreferenceAttributeName);
        sb.append(", formattedAmount=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        java.lang.String str = this.formattedAmount;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.AmountThresholdInfo)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.AmountThresholdInfo amountThresholdInfo = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.AmountThresholdInfo) other;
        return this.name == amountThresholdInfo.name && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAmount, amountThresholdInfo.formattedAmount);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.AmountThresholdInfo copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceAttributeName name2, java.lang.String formattedAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.AmountThresholdInfo(name2, formattedAmount);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFormattedAmount() {
        return this.formattedAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceAttributeName getName() {
        return this.name;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.AmountThresholdInfo copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.AmountThresholdInfo amountThresholdInfo, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceAttributeName notificationPreferenceAttributeName, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            notificationPreferenceAttributeName = amountThresholdInfo.name;
        }
        if ((i & 2) != 0) {
            str = amountThresholdInfo.formattedAmount;
        }
        return amountThresholdInfo.copy(notificationPreferenceAttributeName, str);
    }
}
