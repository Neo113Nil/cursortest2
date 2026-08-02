package com.paypal.oslo.feature.bnplacquisition.domain.model.requests;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JB\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\rR\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\"\u0010\rR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/SubmitCreditApplicationRequest;", "", "", "experienceSessionId", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/disclosure/ConsentType;", "consents", "selectedFundingInstrumentId", "", "includeVirtualCard", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/SubmitCreditApplicationRequest;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getExperienceSessionId", "setExperienceSessionId", "(Ljava/lang/String;)V", "Ljava/util/List;", "getConsents", "getSelectedFundingInstrumentId", "Z", "getIncludeVirtualCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SubmitCreditApplicationRequest {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType> consents;
    private java.lang.String experienceSessionId;
    private final boolean includeVirtualCard;
    private final java.lang.String selectedFundingInstrumentId;

    /* JADX WARN: Multi-variable type inference failed */
    public SubmitCreditApplicationRequest(java.lang.String str, java.util.List<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType> list, java.lang.String str2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.experienceSessionId = str;
        this.consents = list;
        this.selectedFundingInstrumentId = str2;
        this.includeVirtualCard = z;
    }

    public /* synthetic */ SubmitCreditApplicationRequest(java.lang.String str, java.util.List list, java.lang.String str2, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z);
    }

    public final java.lang.String getExperienceSessionId() {
        return this.experienceSessionId;
    }

    public final void setExperienceSessionId(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.experienceSessionId = str;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType> getConsents() {
        return this.consents;
    }

    public final java.lang.String getSelectedFundingInstrumentId() {
        return this.selectedFundingInstrumentId;
    }

    public final boolean getIncludeVirtualCard() {
        return this.includeVirtualCard;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.experienceSessionId;
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType> list = this.consents;
        java.lang.String str2 = this.selectedFundingInstrumentId;
        boolean z = this.includeVirtualCard;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SubmitCreditApplicationRequest(experienceSessionId=");
        sb.append(str);
        sb.append(", consents=");
        sb.append(list);
        sb.append(", selectedFundingInstrumentId=");
        sb.append(str2);
        sb.append(", includeVirtualCard=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.experienceSessionId.hashCode();
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType> list = this.consents;
        int hashCode2 = list == null ? 0 : list.hashCode();
        java.lang.String str = this.selectedFundingInstrumentId;
        return (((((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.includeVirtualCard);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.requests.SubmitCreditApplicationRequest)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.SubmitCreditApplicationRequest submitCreditApplicationRequest = (com.paypal.oslo.feature.bnplacquisition.domain.model.requests.SubmitCreditApplicationRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.experienceSessionId, submitCreditApplicationRequest.experienceSessionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.consents, submitCreditApplicationRequest.consents) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFundingInstrumentId, submitCreditApplicationRequest.selectedFundingInstrumentId) && this.includeVirtualCard == submitCreditApplicationRequest.includeVirtualCard;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.SubmitCreditApplicationRequest copy(java.lang.String experienceSessionId, java.util.List<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType> consents, java.lang.String selectedFundingInstrumentId, boolean includeVirtualCard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(experienceSessionId, "");
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.SubmitCreditApplicationRequest(experienceSessionId, consents, selectedFundingInstrumentId, includeVirtualCard);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIncludeVirtualCard() {
        return this.includeVirtualCard;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSelectedFundingInstrumentId() {
        return this.selectedFundingInstrumentId;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType> component2() {
        return this.consents;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getExperienceSessionId() {
        return this.experienceSessionId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.requests.SubmitCreditApplicationRequest copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.SubmitCreditApplicationRequest submitCreditApplicationRequest, java.lang.String str, java.util.List list, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = submitCreditApplicationRequest.experienceSessionId;
        }
        if ((i & 2) != 0) {
            list = submitCreditApplicationRequest.consents;
        }
        if ((i & 4) != 0) {
            str2 = submitCreditApplicationRequest.selectedFundingInstrumentId;
        }
        if ((i & 8) != 0) {
            z = submitCreditApplicationRequest.includeVirtualCard;
        }
        return submitCreditApplicationRequest.copy(str, list, str2, z);
    }
}
