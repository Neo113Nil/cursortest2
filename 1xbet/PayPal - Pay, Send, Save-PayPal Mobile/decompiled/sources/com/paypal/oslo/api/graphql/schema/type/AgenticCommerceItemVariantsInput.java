package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AgenticCommerceItemVariantsInput;", "", "", "commerceItemId", "sessionId", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Lcom/paypal/oslo/api/graphql/schema/type/AgenticCommerceItemVariantsInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCommerceItemId", "Ljava/lang/Object;", "getSessionId", "getActionId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AgenticCommerceItemVariantsInput {
    private final java.lang.Object actionId;
    private final java.lang.String commerceItemId;
    private final java.lang.Object sessionId;

    public AgenticCommerceItemVariantsInput(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
        this.commerceItemId = str;
        this.sessionId = obj;
        this.actionId = obj2;
    }

    public final java.lang.String getCommerceItemId() {
        return this.commerceItemId;
    }

    public final java.lang.Object getSessionId() {
        return this.sessionId;
    }

    public final java.lang.Object getActionId() {
        return this.actionId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.commerceItemId;
        java.lang.Object obj = this.sessionId;
        java.lang.Object obj2 = this.actionId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AgenticCommerceItemVariantsInput(commerceItemId=");
        sb.append(str);
        sb.append(", sessionId=");
        sb.append(obj);
        sb.append(", actionId=");
        sb.append(obj2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.commerceItemId.hashCode() * 31) + this.sessionId.hashCode()) * 31) + this.actionId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.AgenticCommerceItemVariantsInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.AgenticCommerceItemVariantsInput agenticCommerceItemVariantsInput = (com.paypal.oslo.api.graphql.schema.type.AgenticCommerceItemVariantsInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.commerceItemId, agenticCommerceItemVariantsInput.commerceItemId) && kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, agenticCommerceItemVariantsInput.sessionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.actionId, agenticCommerceItemVariantsInput.actionId);
    }

    public final com.paypal.oslo.api.graphql.schema.type.AgenticCommerceItemVariantsInput copy(java.lang.String commerceItemId, java.lang.Object sessionId, java.lang.Object actionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commerceItemId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionId, "");
        return new com.paypal.oslo.api.graphql.schema.type.AgenticCommerceItemVariantsInput(commerceItemId, sessionId, actionId);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Object getActionId() {
        return this.actionId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCommerceItemId() {
        return this.commerceItemId;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.AgenticCommerceItemVariantsInput copy$default(com.paypal.oslo.api.graphql.schema.type.AgenticCommerceItemVariantsInput agenticCommerceItemVariantsInput, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, int i, java.lang.Object obj3) {
        if ((i & 1) != 0) {
            str = agenticCommerceItemVariantsInput.commerceItemId;
        }
        if ((i & 2) != 0) {
            obj = agenticCommerceItemVariantsInput.sessionId;
        }
        if ((i & 4) != 0) {
            obj2 = agenticCommerceItemVariantsInput.actionId;
        }
        return agenticCommerceItemVariantsInput.copy(str, obj, obj2);
    }
}
