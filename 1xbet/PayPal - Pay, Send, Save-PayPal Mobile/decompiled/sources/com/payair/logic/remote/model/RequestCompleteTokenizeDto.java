package com.payair.logic.remote.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/payair/logic/remote/model/RequestCompleteTokenizeDto;", "", "", "termsAndConditionsAcceptedAt", "<init>", "(J)V", "component1", "()J", "copy", "(J)Lcom/payair/logic/remote/model/RequestCompleteTokenizeDto;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getTermsAndConditionsAcceptedAt"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RequestCompleteTokenizeDto {
    private final long termsAndConditionsAcceptedAt;

    public RequestCompleteTokenizeDto(long j) {
        this.termsAndConditionsAcceptedAt = j;
    }

    public final long getTermsAndConditionsAcceptedAt() {
        return this.termsAndConditionsAcceptedAt;
    }

    public final java.lang.String toString() {
        long j = this.termsAndConditionsAcceptedAt;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestCompleteTokenizeDto(termsAndConditionsAcceptedAt=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.termsAndConditionsAcceptedAt);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.payair.logic.remote.model.RequestCompleteTokenizeDto) && this.termsAndConditionsAcceptedAt == ((com.payair.logic.remote.model.RequestCompleteTokenizeDto) other).termsAndConditionsAcceptedAt;
    }

    public final com.payair.logic.remote.model.RequestCompleteTokenizeDto copy(long termsAndConditionsAcceptedAt) {
        return new com.payair.logic.remote.model.RequestCompleteTokenizeDto(termsAndConditionsAcceptedAt);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTermsAndConditionsAcceptedAt() {
        return this.termsAndConditionsAcceptedAt;
    }

    public static /* synthetic */ com.payair.logic.remote.model.RequestCompleteTokenizeDto copy$default(com.payair.logic.remote.model.RequestCompleteTokenizeDto requestCompleteTokenizeDto, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = requestCompleteTokenizeDto.termsAndConditionsAcceptedAt;
        }
        return requestCompleteTokenizeDto.copy(j);
    }
}
