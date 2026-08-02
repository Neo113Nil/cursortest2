package com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/models/SelectionText;", "", "", com.paypal.oslo.feature.debitcard.shared.analytics.TermsConditionsBottomSheetAnalytics.ACTION, "ctaLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/models/SelectionText;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTerms", "getCtaLabel"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SelectionText {
    public static final int $stable = 0;
    private final java.lang.String ctaLabel;
    private final java.lang.String terms;

    public SelectionText(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.terms = str;
        this.ctaLabel = str2;
    }

    public final java.lang.String getTerms() {
        return this.terms;
    }

    public final java.lang.String getCtaLabel() {
        return this.ctaLabel;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.terms;
        java.lang.String str2 = this.ctaLabel;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectionText(terms=");
        sb.append(str);
        sb.append(", ctaLabel=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.terms.hashCode() * 31) + this.ctaLabel.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.SelectionText)) {
            return false;
        }
        com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.SelectionText selectionText = (com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.SelectionText) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.terms, selectionText.terms) && kotlin.jvm.internal.Intrinsics.areEqual(this.ctaLabel, selectionText.ctaLabel);
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.SelectionText copy(java.lang.String terms, java.lang.String ctaLabel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(terms, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ctaLabel, "");
        return new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.SelectionText(terms, ctaLabel);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCtaLabel() {
        return this.ctaLabel;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTerms() {
        return this.terms;
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.SelectionText copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.SelectionText selectionText, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = selectionText.terms;
        }
        if ((i & 2) != 0) {
            str2 = selectionText.ctaLabel;
        }
        return selectionText.copy(str, str2);
    }
}
