package com.paypal.oslo.feature.activity.domain.ledger.models;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityPartnerInfo;", "", "", "partnerId", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityPartnerTypeInfo;", "activityPartnerTypeInfo", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityPartnerTypeInfo;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityPartnerTypeInfo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityPartnerTypeInfo;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityPartnerTypeInfo;)Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityPartnerInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityPartnerInfo;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getPartnerId", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityPartnerTypeInfo;", "getActivityPartnerTypeInfo", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class ActivityPartnerInfo {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo activityPartnerTypeInfo;
    private final java.lang.String partnerId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo.Companion INSTANCE = new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityPartnerInfo$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityPartnerInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo> serializer() {
            return com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ActivityPartnerInfo(int i, java.lang.String str, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo activityPartnerTypeInfo, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.partnerId = str;
        this.activityPartnerTypeInfo = activityPartnerTypeInfo;
    }

    public ActivityPartnerInfo(java.lang.String str, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo activityPartnerTypeInfo) {
        this.partnerId = str;
        this.activityPartnerTypeInfo = activityPartnerTypeInfo;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$activity_prodRelease(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.partnerId);
        output.encodeNullableSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.activityPartnerTypeInfo);
    }

    public final java.lang.String getPartnerId() {
        return this.partnerId;
    }

    public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo getActivityPartnerTypeInfo() {
        return this.activityPartnerTypeInfo;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.partnerId;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo activityPartnerTypeInfo = this.activityPartnerTypeInfo;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityPartnerInfo(partnerId=");
        sb.append(str);
        sb.append(", activityPartnerTypeInfo=");
        sb.append(activityPartnerTypeInfo);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.partnerId;
        int hashCode = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo activityPartnerTypeInfo = this.activityPartnerTypeInfo;
        return (hashCode * 31) + (activityPartnerTypeInfo != null ? activityPartnerTypeInfo.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo)) {
            return false;
        }
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo activityPartnerInfo = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.partnerId, activityPartnerInfo.partnerId) && this.activityPartnerTypeInfo == activityPartnerInfo.activityPartnerTypeInfo;
    }

    public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo copy(java.lang.String partnerId, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo activityPartnerTypeInfo) {
        return new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo(partnerId, activityPartnerTypeInfo);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo getActivityPartnerTypeInfo() {
        return this.activityPartnerTypeInfo;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPartnerId() {
        return this.partnerId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo copy$default(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo activityPartnerInfo, java.lang.String str, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo activityPartnerTypeInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = activityPartnerInfo.partnerId;
        }
        if ((i & 2) != 0) {
            activityPartnerTypeInfo = activityPartnerInfo.activityPartnerTypeInfo;
        }
        return activityPartnerInfo.copy(str, activityPartnerTypeInfo);
    }
}
