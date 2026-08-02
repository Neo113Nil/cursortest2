package com.paypal.oslo.feature.activity.domain.ledger.models;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b\u0003\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b\u0004\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b\u0005\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityFlags;", "", "", "isAnonymousContribution", "isUprTransaction", "isPaypalWorldTransaction", "<init>", "(ZZZ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Z", "component2", "component3", "copy", "(ZZZ)Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityFlags;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityFlags;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class ActivityFlags {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags.Companion INSTANCE = new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags.Companion(null);
    private final boolean isAnonymousContribution;
    private final boolean isPaypalWorldTransaction;
    private final boolean isUprTransaction;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityFlags$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityFlags;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags> serializer() {
            return com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ActivityFlags(int i, boolean z, boolean z2, boolean z3, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.isAnonymousContribution = false;
        } else {
            this.isAnonymousContribution = z;
        }
        if ((i & 2) == 0) {
            this.isUprTransaction = false;
        } else {
            this.isUprTransaction = z2;
        }
        if ((i & 4) == 0) {
            this.isPaypalWorldTransaction = false;
        } else {
            this.isPaypalWorldTransaction = z3;
        }
    }

    public ActivityFlags(boolean z, boolean z2, boolean z3) {
        this.isAnonymousContribution = z;
        this.isUprTransaction = z2;
        this.isPaypalWorldTransaction = z3;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$activity_prodRelease(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.isAnonymousContribution) {
            output.encodeBooleanElement(serialDesc, 0, self.isAnonymousContribution);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.isUprTransaction) {
            output.encodeBooleanElement(serialDesc, 1, self.isUprTransaction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.isPaypalWorldTransaction) {
            output.encodeBooleanElement(serialDesc, 2, self.isPaypalWorldTransaction);
        }
    }

    public /* synthetic */ ActivityFlags(boolean z, boolean z2, boolean z3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }

    public final boolean isAnonymousContribution() {
        return this.isAnonymousContribution;
    }

    public final boolean isUprTransaction() {
        return this.isUprTransaction;
    }

    public final boolean isPaypalWorldTransaction() {
        return this.isPaypalWorldTransaction;
    }

    public final java.lang.String toString() {
        boolean z = this.isAnonymousContribution;
        boolean z2 = this.isUprTransaction;
        boolean z3 = this.isPaypalWorldTransaction;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityFlags(isAnonymousContribution=");
        sb.append(z);
        sb.append(", isUprTransaction=");
        sb.append(z2);
        sb.append(", isPaypalWorldTransaction=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Boolean.hashCode(this.isAnonymousContribution) * 31) + java.lang.Boolean.hashCode(this.isUprTransaction)) * 31) + java.lang.Boolean.hashCode(this.isPaypalWorldTransaction);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags)) {
            return false;
        }
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags activityFlags = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags) other;
        return this.isAnonymousContribution == activityFlags.isAnonymousContribution && this.isUprTransaction == activityFlags.isUprTransaction && this.isPaypalWorldTransaction == activityFlags.isPaypalWorldTransaction;
    }

    public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags copy(boolean isAnonymousContribution, boolean isUprTransaction, boolean isPaypalWorldTransaction) {
        return new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags(isAnonymousContribution, isUprTransaction, isPaypalWorldTransaction);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsPaypalWorldTransaction() {
        return this.isPaypalWorldTransaction;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsUprTransaction() {
        return this.isUprTransaction;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsAnonymousContribution() {
        return this.isAnonymousContribution;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags copy$default(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags activityFlags, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = activityFlags.isAnonymousContribution;
        }
        if ((i & 2) != 0) {
            z2 = activityFlags.isUprTransaction;
        }
        if ((i & 4) != 0) {
            z3 = activityFlags.isPaypalWorldTransaction;
        }
        return activityFlags.copy(z, z2, z3);
    }

    public ActivityFlags() {
        this(false, false, false, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
