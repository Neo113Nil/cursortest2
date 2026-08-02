package com.paypal.oslo.feature.bnplacquisition.domain.model.requests;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ6\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001d\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/RepaymentRequest;", "", "", "experienceSessionId", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/ConsentType;", "consents", "selectedOfferId", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/RepaymentRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getExperienceSessionId", "Ljava/util/List;", "getConsents", "getSelectedOfferId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RepaymentRequest {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType> consents;
    private final java.lang.String experienceSessionId;
    private final java.lang.String selectedOfferId;

    /* JADX WARN: Multi-variable type inference failed */
    public RepaymentRequest(java.lang.String str, java.util.List<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType> list, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.experienceSessionId = str;
        this.consents = list;
        this.selectedOfferId = str2;
    }

    public /* synthetic */ RepaymentRequest(java.lang.String str, java.util.List list, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? null : str2);
    }

    public final java.lang.String getExperienceSessionId() {
        return this.experienceSessionId;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType> getConsents() {
        return this.consents;
    }

    public final java.lang.String getSelectedOfferId() {
        return this.selectedOfferId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.experienceSessionId;
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType> list = this.consents;
        java.lang.String str2 = this.selectedOfferId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RepaymentRequest(experienceSessionId=");
        sb.append(str);
        sb.append(", consents=");
        sb.append(list);
        sb.append(", selectedOfferId=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.experienceSessionId.hashCode();
        int hashCode2 = this.consents.hashCode();
        java.lang.String str = this.selectedOfferId;
        return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.requests.RepaymentRequest)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.RepaymentRequest repaymentRequest = (com.paypal.oslo.feature.bnplacquisition.domain.model.requests.RepaymentRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.experienceSessionId, repaymentRequest.experienceSessionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.consents, repaymentRequest.consents) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedOfferId, repaymentRequest.selectedOfferId);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.RepaymentRequest copy(java.lang.String experienceSessionId, java.util.List<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType> consents, java.lang.String selectedOfferId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(experienceSessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consents, "");
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.RepaymentRequest(experienceSessionId, consents, selectedOfferId);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSelectedOfferId() {
        return this.selectedOfferId;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType> component2() {
        return this.consents;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getExperienceSessionId() {
        return this.experienceSessionId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.requests.RepaymentRequest copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.RepaymentRequest repaymentRequest, java.lang.String str, java.util.List list, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = repaymentRequest.experienceSessionId;
        }
        if ((i & 2) != 0) {
            list = repaymentRequest.consents;
        }
        if ((i & 4) != 0) {
            str2 = repaymentRequest.selectedOfferId;
        }
        return repaymentRequest.copy(str, list, str2);
    }
}
