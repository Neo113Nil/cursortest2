package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ.\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/LogActivityActionInput;", "", "", "activityId", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;", "type", "createdTime", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;", "component3", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;Ljava/lang/Object;)Lcom/paypal/oslo/api/graphql/schema/type/LogActivityActionInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getActivityId", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;", "getType", "Ljava/lang/Object;", "getCreatedTime"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LogActivityActionInput {
    private final java.lang.String activityId;
    private final java.lang.Object createdTime;
    private final com.paypal.oslo.api.graphql.schema.type.ActivityType type;

    public LogActivityActionInput(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.ActivityType activityType, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.activityId = str;
        this.type = activityType;
        this.createdTime = obj;
    }

    public final java.lang.String getActivityId() {
        return this.activityId;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ActivityType getType() {
        return this.type;
    }

    public final java.lang.Object getCreatedTime() {
        return this.createdTime;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.activityId;
        com.paypal.oslo.api.graphql.schema.type.ActivityType activityType = this.type;
        java.lang.Object obj = this.createdTime;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LogActivityActionInput(activityId=");
        sb.append(str);
        sb.append(", type=");
        sb.append(activityType);
        sb.append(", createdTime=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.activityId.hashCode() * 31) + this.type.hashCode()) * 31) + this.createdTime.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.LogActivityActionInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.LogActivityActionInput logActivityActionInput = (com.paypal.oslo.api.graphql.schema.type.LogActivityActionInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.activityId, logActivityActionInput.activityId) && this.type == logActivityActionInput.type && kotlin.jvm.internal.Intrinsics.areEqual(this.createdTime, logActivityActionInput.createdTime);
    }

    public final com.paypal.oslo.api.graphql.schema.type.LogActivityActionInput copy(java.lang.String activityId, com.paypal.oslo.api.graphql.schema.type.ActivityType type, java.lang.Object createdTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createdTime, "");
        return new com.paypal.oslo.api.graphql.schema.type.LogActivityActionInput(activityId, type, createdTime);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Object getCreatedTime() {
        return this.createdTime;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ActivityType getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getActivityId() {
        return this.activityId;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.LogActivityActionInput copy$default(com.paypal.oslo.api.graphql.schema.type.LogActivityActionInput logActivityActionInput, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.ActivityType activityType, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = logActivityActionInput.activityId;
        }
        if ((i & 2) != 0) {
            activityType = logActivityActionInput.type;
        }
        if ((i & 4) != 0) {
            obj = logActivityActionInput.createdTime;
        }
        return logActivityActionInput.copy(str, activityType, obj);
    }
}
