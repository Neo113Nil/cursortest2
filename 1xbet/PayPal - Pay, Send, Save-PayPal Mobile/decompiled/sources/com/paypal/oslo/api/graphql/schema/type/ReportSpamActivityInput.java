package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J@\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ReportSpamActivityInput;", "", "", "id", "Lcom/apollographql/apollo/api/Optional;", "groupId", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;", "type", "createdTime", "<init>", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;", "component4", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;Ljava/lang/Object;)Lcom/paypal/oslo/api/graphql/schema/type/ReportSpamActivityInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/apollographql/apollo/api/Optional;", "getGroupId", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;", "getType", "Ljava/lang/Object;", "getCreatedTime"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ReportSpamActivityInput {
    private final java.lang.Object createdTime;
    private final com.apollographql.apollo.api.Optional<java.lang.String> groupId;
    private final java.lang.String id;
    private final com.paypal.oslo.api.graphql.schema.type.ActivityType type;

    public ReportSpamActivityInput(java.lang.String str, com.apollographql.apollo.api.Optional<java.lang.String> optional, com.paypal.oslo.api.graphql.schema.type.ActivityType activityType, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.id = str;
        this.groupId = optional;
        this.type = activityType;
        this.createdTime = obj;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public /* synthetic */ ReportSpamActivityInput(java.lang.String str, com.apollographql.apollo.api.Optional.Absent absent, com.paypal.oslo.api.graphql.schema.type.ActivityType activityType, java.lang.Object obj, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, activityType, obj);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getGroupId() {
        return this.groupId;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ActivityType getType() {
        return this.type;
    }

    public final java.lang.Object getCreatedTime() {
        return this.createdTime;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.groupId;
        com.paypal.oslo.api.graphql.schema.type.ActivityType activityType = this.type;
        java.lang.Object obj = this.createdTime;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReportSpamActivityInput(id=");
        sb.append(str);
        sb.append(", groupId=");
        sb.append(optional);
        sb.append(", type=");
        sb.append(activityType);
        sb.append(", createdTime=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.id.hashCode() * 31) + this.groupId.hashCode()) * 31) + this.type.hashCode()) * 31) + this.createdTime.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.ReportSpamActivityInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.ReportSpamActivityInput reportSpamActivityInput = (com.paypal.oslo.api.graphql.schema.type.ReportSpamActivityInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, reportSpamActivityInput.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.groupId, reportSpamActivityInput.groupId) && this.type == reportSpamActivityInput.type && kotlin.jvm.internal.Intrinsics.areEqual(this.createdTime, reportSpamActivityInput.createdTime);
    }

    public final com.paypal.oslo.api.graphql.schema.type.ReportSpamActivityInput copy(java.lang.String id, com.apollographql.apollo.api.Optional<java.lang.String> groupId, com.paypal.oslo.api.graphql.schema.type.ActivityType type, java.lang.Object createdTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(groupId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createdTime, "");
        return new com.paypal.oslo.api.graphql.schema.type.ReportSpamActivityInput(id, groupId, type, createdTime);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Object getCreatedTime() {
        return this.createdTime;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ActivityType getType() {
        return this.type;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.groupId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ReportSpamActivityInput copy$default(com.paypal.oslo.api.graphql.schema.type.ReportSpamActivityInput reportSpamActivityInput, java.lang.String str, com.apollographql.apollo.api.Optional optional, com.paypal.oslo.api.graphql.schema.type.ActivityType activityType, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = reportSpamActivityInput.id;
        }
        if ((i & 2) != 0) {
            optional = reportSpamActivityInput.groupId;
        }
        if ((i & 4) != 0) {
            activityType = reportSpamActivityInput.type;
        }
        if ((i & 8) != 0) {
            obj = reportSpamActivityInput.createdTime;
        }
        return reportSpamActivityInput.copy(str, optional, activityType, obj);
    }
}
