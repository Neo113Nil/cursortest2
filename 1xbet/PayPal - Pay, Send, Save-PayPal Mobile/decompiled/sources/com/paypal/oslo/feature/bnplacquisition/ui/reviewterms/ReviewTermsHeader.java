package com.paypal.oslo.feature.bnplacquisition.ui.reviewterms;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsHeader;", "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "title", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsHeader;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getTitle"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ReviewTermsHeader {
    public static final int $stable = com.paypal.oslo.core.commonui.utils.RefText.$stable;
    private final com.paypal.oslo.core.commonui.utils.RefText title;

    public ReviewTermsHeader(com.paypal.oslo.core.commonui.utils.RefText refText) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
        this.title = refText;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
        return this.title;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.commonui.utils.RefText refText = this.title;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReviewTermsHeader(title=");
        sb.append(refText);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.title.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsHeader) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, ((com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsHeader) other).title);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsHeader copy(com.paypal.oslo.core.commonui.utils.RefText title) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsHeader(title);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsHeader copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsHeader reviewTermsHeader, com.paypal.oslo.core.commonui.utils.RefText refText, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            refText = reviewTermsHeader.title;
        }
        return reviewTermsHeader.copy(refText);
    }
}
