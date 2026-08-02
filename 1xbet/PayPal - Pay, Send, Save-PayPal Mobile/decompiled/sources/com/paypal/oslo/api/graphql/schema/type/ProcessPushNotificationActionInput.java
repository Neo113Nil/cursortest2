package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ProcessPushNotificationActionInput;", "", "", "id", "action", "accountId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/ProcessPushNotificationActionInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getAction", "getAccountId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProcessPushNotificationActionInput {
    private final java.lang.String accountId;
    private final java.lang.String action;
    private final java.lang.String id;

    public ProcessPushNotificationActionInput(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.id = str;
        this.action = str2;
        this.accountId = str3;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getAction() {
        return this.action;
    }

    public final java.lang.String getAccountId() {
        return this.accountId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.action;
        java.lang.String str3 = this.accountId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProcessPushNotificationActionInput(id=");
        sb.append(str);
        sb.append(", action=");
        sb.append(str2);
        sb.append(", accountId=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.id.hashCode() * 31) + this.action.hashCode()) * 31) + this.accountId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.ProcessPushNotificationActionInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.ProcessPushNotificationActionInput processPushNotificationActionInput = (com.paypal.oslo.api.graphql.schema.type.ProcessPushNotificationActionInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, processPushNotificationActionInput.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, processPushNotificationActionInput.action) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountId, processPushNotificationActionInput.accountId);
    }

    public final com.paypal.oslo.api.graphql.schema.type.ProcessPushNotificationActionInput copy(java.lang.String id, java.lang.String action, java.lang.String accountId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountId, "");
        return new com.paypal.oslo.api.graphql.schema.type.ProcessPushNotificationActionInput(id, action, accountId);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAccountId() {
        return this.accountId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAction() {
        return this.action;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ProcessPushNotificationActionInput copy$default(com.paypal.oslo.api.graphql.schema.type.ProcessPushNotificationActionInput processPushNotificationActionInput, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = processPushNotificationActionInput.id;
        }
        if ((i & 2) != 0) {
            str2 = processPushNotificationActionInput.action;
        }
        if ((i & 4) != 0) {
            str3 = processPushNotificationActionInput.accountId;
        }
        return processPushNotificationActionInput.copy(str, str2, str3);
    }
}
