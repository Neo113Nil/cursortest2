package com.paypal.oslo.feature.bnplacquisition.domain.model.requests;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/ReviewTermsRequest;", "", "", "experienceSessionId", "selectedOfferId", "nationalIdentificationShort", "", "annualIncome", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/ReviewTermsRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getExperienceSessionId", "getSelectedOfferId", "getNationalIdentificationShort", "Ljava/lang/Long;", "getAnnualIncome"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ReviewTermsRequest {
    public static final int $stable = 0;
    private final java.lang.Long annualIncome;
    private final java.lang.String experienceSessionId;
    private final java.lang.String nationalIdentificationShort;
    private final java.lang.String selectedOfferId;

    public ReviewTermsRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.experienceSessionId = str;
        this.selectedOfferId = str2;
        this.nationalIdentificationShort = str3;
        this.annualIncome = l;
    }

    public /* synthetic */ ReviewTermsRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l);
    }

    public final java.lang.String getExperienceSessionId() {
        return this.experienceSessionId;
    }

    public final java.lang.String getSelectedOfferId() {
        return this.selectedOfferId;
    }

    public final java.lang.String getNationalIdentificationShort() {
        return this.nationalIdentificationShort;
    }

    public final java.lang.Long getAnnualIncome() {
        return this.annualIncome;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.experienceSessionId;
        java.lang.String str2 = this.selectedOfferId;
        java.lang.String str3 = this.nationalIdentificationShort;
        java.lang.Long l = this.annualIncome;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReviewTermsRequest(experienceSessionId=");
        sb.append(str);
        sb.append(", selectedOfferId=");
        sb.append(str2);
        sb.append(", nationalIdentificationShort=");
        sb.append(str3);
        sb.append(", annualIncome=");
        sb.append(l);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.experienceSessionId.hashCode();
        int hashCode2 = this.selectedOfferId.hashCode();
        java.lang.String str = this.nationalIdentificationShort;
        int hashCode3 = str == null ? 0 : str.hashCode();
        java.lang.Long l = this.annualIncome;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (l != null ? l.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ReviewTermsRequest)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ReviewTermsRequest reviewTermsRequest = (com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ReviewTermsRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.experienceSessionId, reviewTermsRequest.experienceSessionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedOfferId, reviewTermsRequest.selectedOfferId) && kotlin.jvm.internal.Intrinsics.areEqual(this.nationalIdentificationShort, reviewTermsRequest.nationalIdentificationShort) && kotlin.jvm.internal.Intrinsics.areEqual(this.annualIncome, reviewTermsRequest.annualIncome);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ReviewTermsRequest copy(java.lang.String experienceSessionId, java.lang.String selectedOfferId, java.lang.String nationalIdentificationShort, java.lang.Long annualIncome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(experienceSessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedOfferId, "");
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ReviewTermsRequest(experienceSessionId, selectedOfferId, nationalIdentificationShort, annualIncome);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Long getAnnualIncome() {
        return this.annualIncome;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getNationalIdentificationShort() {
        return this.nationalIdentificationShort;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSelectedOfferId() {
        return this.selectedOfferId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getExperienceSessionId() {
        return this.experienceSessionId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ReviewTermsRequest copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ReviewTermsRequest reviewTermsRequest, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = reviewTermsRequest.experienceSessionId;
        }
        if ((i & 2) != 0) {
            str2 = reviewTermsRequest.selectedOfferId;
        }
        if ((i & 4) != 0) {
            str3 = reviewTermsRequest.nationalIdentificationShort;
        }
        if ((i & 8) != 0) {
            l = reviewTermsRequest.annualIncome;
        }
        return reviewTermsRequest.copy(str, str2, str3, l);
    }
}
