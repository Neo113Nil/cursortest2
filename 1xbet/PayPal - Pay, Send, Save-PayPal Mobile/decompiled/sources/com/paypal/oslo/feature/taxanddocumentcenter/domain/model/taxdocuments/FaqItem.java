package com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/FaqItem;", "", "", "id", "question", "", "rank", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;I)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/FaqItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getId", "getQuestion", com.visa.cbp.getEncExpo.warmup, "getRank"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class FaqItem {
    public static final int $stable = 0;
    private final java.lang.String id;
    private final java.lang.String question;
    private final int rank;

    public FaqItem(java.lang.String str, java.lang.String str2, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.id = str;
        this.question = str2;
        this.rank = i;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getQuestion() {
        return this.question;
    }

    public final int getRank() {
        return this.rank;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.question;
        int i = this.rank;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FaqItem(id=");
        sb.append(str);
        sb.append(", question=");
        sb.append(str2);
        sb.append(", rank=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.id.hashCode() * 31) + this.question.hashCode()) * 31) + java.lang.Integer.hashCode(this.rank);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem)) {
            return false;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem faqItem = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, faqItem.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.question, faqItem.question) && this.rank == faqItem.rank;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem copy(java.lang.String id, java.lang.String question, int rank) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(question, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem(id, question, rank);
    }

    /* renamed from: component3, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getQuestion() {
        return this.question;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem copy$default(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem faqItem, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = faqItem.id;
        }
        if ((i2 & 2) != 0) {
            str2 = faqItem.question;
        }
        if ((i2 & 4) != 0) {
            i = faqItem.rank;
        }
        return faqItem.copy(str, str2, i);
    }
}
