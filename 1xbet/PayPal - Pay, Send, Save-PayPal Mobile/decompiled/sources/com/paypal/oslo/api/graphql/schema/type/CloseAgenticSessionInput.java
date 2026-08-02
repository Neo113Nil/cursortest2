package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ>\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CloseAgenticSessionInput;", "", "sessionId", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/AgenticCloseReason;", "reason", "", "reasonText", "<init>", "(Ljava/lang/Object;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "copy", "(Ljava/lang/Object;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/CloseAgenticSessionInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getSessionId", "Lcom/apollographql/apollo/api/Optional;", "getReason", "getReasonText"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CloseAgenticSessionInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.AgenticCloseReason> reason;
    private final com.apollographql.apollo.api.Optional<java.lang.String> reasonText;
    private final java.lang.Object sessionId;

    /* JADX WARN: Multi-variable type inference failed */
    public CloseAgenticSessionInput(java.lang.Object obj, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.AgenticCloseReason> optional, com.apollographql.apollo.api.Optional<java.lang.String> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.sessionId = obj;
        this.reason = optional;
        this.reasonText = optional2;
    }

    public final java.lang.Object getSessionId() {
        return this.sessionId;
    }

    public /* synthetic */ CloseAgenticSessionInput(java.lang.Object obj, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.AgenticCloseReason> getReason() {
        return this.reason;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getReasonText() {
        return this.reasonText;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.sessionId;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.AgenticCloseReason> optional = this.reason;
        com.apollographql.apollo.api.Optional<java.lang.String> optional2 = this.reasonText;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CloseAgenticSessionInput(sessionId=");
        sb.append(obj);
        sb.append(", reason=");
        sb.append(optional);
        sb.append(", reasonText=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.sessionId.hashCode() * 31) + this.reason.hashCode()) * 31) + this.reasonText.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CloseAgenticSessionInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CloseAgenticSessionInput closeAgenticSessionInput = (com.paypal.oslo.api.graphql.schema.type.CloseAgenticSessionInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, closeAgenticSessionInput.sessionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, closeAgenticSessionInput.reason) && kotlin.jvm.internal.Intrinsics.areEqual(this.reasonText, closeAgenticSessionInput.reasonText);
    }

    public final com.paypal.oslo.api.graphql.schema.type.CloseAgenticSessionInput copy(java.lang.Object sessionId, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.AgenticCloseReason> reason, com.apollographql.apollo.api.Optional<java.lang.String> reasonText) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reasonText, "");
        return new com.paypal.oslo.api.graphql.schema.type.CloseAgenticSessionInput(sessionId, reason, reasonText);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component3() {
        return this.reasonText;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.AgenticCloseReason> component2() {
        return this.reason;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getSessionId() {
        return this.sessionId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CloseAgenticSessionInput copy$default(com.paypal.oslo.api.graphql.schema.type.CloseAgenticSessionInput closeAgenticSessionInput, java.lang.Object obj, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = closeAgenticSessionInput.sessionId;
        }
        if ((i & 2) != 0) {
            optional = closeAgenticSessionInput.reason;
        }
        if ((i & 4) != 0) {
            optional2 = closeAgenticSessionInput.reasonText;
        }
        return closeAgenticSessionInput.copy(obj, optional, optional2);
    }
}
