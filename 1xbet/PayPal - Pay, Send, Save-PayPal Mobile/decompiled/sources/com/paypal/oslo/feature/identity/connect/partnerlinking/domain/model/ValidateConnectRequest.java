package com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectRequest;", "", "", "type", "partnerName", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_CONTEXT_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getType", "getPartnerName", "getFlowContextId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ValidateConnectRequest {
    public static final int $stable = 0;
    private final java.lang.String flowContextId;
    private final java.lang.String partnerName;
    private final java.lang.String type;

    public ValidateConnectRequest(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.type = str;
        this.partnerName = str2;
        this.flowContextId = str3;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final java.lang.String getPartnerName() {
        return this.partnerName;
    }

    public final java.lang.String getFlowContextId() {
        return this.flowContextId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.type;
        java.lang.String str2 = this.partnerName;
        java.lang.String str3 = this.flowContextId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidateConnectRequest(type=");
        sb.append(str);
        sb.append(", partnerName=");
        sb.append(str2);
        sb.append(", flowContextId=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.type.hashCode() * 31) + this.partnerName.hashCode()) * 31) + this.flowContextId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectRequest)) {
            return false;
        }
        com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectRequest validateConnectRequest = (com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.type, validateConnectRequest.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.partnerName, validateConnectRequest.partnerName) && kotlin.jvm.internal.Intrinsics.areEqual(this.flowContextId, validateConnectRequest.flowContextId);
    }

    public final com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectRequest copy(java.lang.String type, java.lang.String partnerName, java.lang.String flowContextId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partnerName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowContextId, "");
        return new com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectRequest(type, partnerName, flowContextId);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getFlowContextId() {
        return this.flowContextId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPartnerName() {
        return this.partnerName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectRequest copy$default(com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectRequest validateConnectRequest, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = validateConnectRequest.type;
        }
        if ((i & 2) != 0) {
            str2 = validateConnectRequest.partnerName;
        }
        if ((i & 4) != 0) {
            str3 = validateConnectRequest.flowContextId;
        }
        return validateConnectRequest.copy(str, str2, str3);
    }
}
