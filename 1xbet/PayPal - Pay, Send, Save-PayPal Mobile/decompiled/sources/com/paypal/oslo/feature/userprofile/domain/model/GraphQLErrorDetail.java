package com.paypal.oslo.feature.userprofile.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/domain/model/GraphQLErrorDetail;", "", "", com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "field", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/userprofile/domain/model/GraphQLErrorDetail;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getIssue", "getDescription", "getField", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class GraphQLErrorDetail {
    public static final int $stable = 0;
    private final java.lang.String description;
    private final java.lang.String field;
    private final java.lang.String issue;
    private final java.lang.String value;

    public GraphQLErrorDetail(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.issue = str;
        this.description = str2;
        this.field = str3;
        this.value = str4;
    }

    public final java.lang.String getIssue() {
        return this.issue;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final java.lang.String getField() {
        return this.field;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.issue;
        java.lang.String str2 = this.description;
        java.lang.String str3 = this.field;
        java.lang.String str4 = this.value;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GraphQLErrorDetail(issue=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", field=");
        sb.append(str3);
        sb.append(", value=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.issue;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.description;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.field;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.value;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail)) {
            return false;
        }
        com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail graphQLErrorDetail = (com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.issue, graphQLErrorDetail.issue) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, graphQLErrorDetail.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.field, graphQLErrorDetail.field) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, graphQLErrorDetail.value);
    }

    public final com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail copy(java.lang.String issue, java.lang.String description, java.lang.String field, java.lang.String value) {
        return new com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail(issue, description, field, value);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getField() {
        return this.field;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getIssue() {
        return this.issue;
    }

    public static /* synthetic */ com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail copy$default(com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail graphQLErrorDetail, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = graphQLErrorDetail.issue;
        }
        if ((i & 2) != 0) {
            str2 = graphQLErrorDetail.description;
        }
        if ((i & 4) != 0) {
            str3 = graphQLErrorDetail.field;
        }
        if ((i & 8) != 0) {
            str4 = graphQLErrorDetail.value;
        }
        return graphQLErrorDetail.copy(str, str2, str3, str4);
    }
}
