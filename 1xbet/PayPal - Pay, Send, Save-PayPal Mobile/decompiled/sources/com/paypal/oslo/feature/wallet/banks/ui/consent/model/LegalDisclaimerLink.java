package com.paypal.oslo.feature.wallet.banks.ui.consent.model;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\tJ\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/consent/model/LegalDisclaimerLink;", "", "", "displayText", "", "annotationTag", "<init>", "(ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/ui/consent/model/LegalDisclaimerLink;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getDisplayText", "Ljava/lang/String;", "getAnnotationTag"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LegalDisclaimerLink {
    public static final int $stable = 0;
    private final java.lang.String annotationTag;
    private final int displayText;

    public LegalDisclaimerLink(int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.displayText = i;
        this.annotationTag = str;
    }

    public final int getDisplayText() {
        return this.displayText;
    }

    public final java.lang.String getAnnotationTag() {
        return this.annotationTag;
    }

    public final java.lang.String toString() {
        int i = this.displayText;
        java.lang.String str = this.annotationTag;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LegalDisclaimerLink(displayText=");
        sb.append(i);
        sb.append(", annotationTag=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Integer.hashCode(this.displayText) * 31) + this.annotationTag.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.consent.model.LegalDisclaimerLink)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.banks.ui.consent.model.LegalDisclaimerLink legalDisclaimerLink = (com.paypal.oslo.feature.wallet.banks.ui.consent.model.LegalDisclaimerLink) other;
        return this.displayText == legalDisclaimerLink.displayText && kotlin.jvm.internal.Intrinsics.areEqual(this.annotationTag, legalDisclaimerLink.annotationTag);
    }

    public final com.paypal.oslo.feature.wallet.banks.ui.consent.model.LegalDisclaimerLink copy(int displayText, java.lang.String annotationTag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotationTag, "");
        return new com.paypal.oslo.feature.wallet.banks.ui.consent.model.LegalDisclaimerLink(displayText, annotationTag);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAnnotationTag() {
        return this.annotationTag;
    }

    /* renamed from: component1, reason: from getter */
    public final int getDisplayText() {
        return this.displayText;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.consent.model.LegalDisclaimerLink copy$default(com.paypal.oslo.feature.wallet.banks.ui.consent.model.LegalDisclaimerLink legalDisclaimerLink, int i, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = legalDisclaimerLink.displayText;
        }
        if ((i2 & 2) != 0) {
            str = legalDisclaimerLink.annotationTag;
        }
        return legalDisclaimerLink.copy(i, str);
    }
}
