package com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/subscriptions/SubscriptionCapability;", "", "", "name", "", "isProvisioningRequired", "intent", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "copy", "(Ljava/lang/String;ZLjava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/subscriptions/SubscriptionCapability;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "Z", "getIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SubscriptionCapability {
    public static final int $stable = 0;
    private final java.lang.String intent;
    private final boolean isProvisioningRequired;
    private final java.lang.String name;

    public SubscriptionCapability(java.lang.String str, boolean z, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.name = str;
        this.isProvisioningRequired = z;
        this.intent = str2;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final boolean isProvisioningRequired() {
        return this.isProvisioningRequired;
    }

    public final java.lang.String getIntent() {
        return this.intent;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        boolean z = this.isProvisioningRequired;
        java.lang.String str2 = this.intent;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SubscriptionCapability(name=");
        sb.append(str);
        sb.append(", isProvisioningRequired=");
        sb.append(z);
        sb.append(", intent=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.name.hashCode() * 31) + java.lang.Boolean.hashCode(this.isProvisioningRequired)) * 31) + this.intent.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.SubscriptionCapability)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.SubscriptionCapability subscriptionCapability = (com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.SubscriptionCapability) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, subscriptionCapability.name) && this.isProvisioningRequired == subscriptionCapability.isProvisioningRequired && kotlin.jvm.internal.Intrinsics.areEqual(this.intent, subscriptionCapability.intent);
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.SubscriptionCapability copy(java.lang.String name2, boolean isProvisioningRequired, java.lang.String intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        return new com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.SubscriptionCapability(name2, isProvisioningRequired, intent);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getIntent() {
        return this.intent;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsProvisioningRequired() {
        return this.isProvisioningRequired;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.SubscriptionCapability copy$default(com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.SubscriptionCapability subscriptionCapability, java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionCapability.name;
        }
        if ((i & 2) != 0) {
            z = subscriptionCapability.isProvisioningRequired;
        }
        if ((i & 4) != 0) {
            str2 = subscriptionCapability.intent;
        }
        return subscriptionCapability.copy(str, z, str2);
    }
}
