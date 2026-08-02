package com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/LinkDescriptionDomain;", "", "", "href", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/HttpMethodDomain;", "method", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/HttpMethodDomain;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/HttpMethodDomain;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/HttpMethodDomain;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/LinkDescriptionDomain;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getHref", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/HttpMethodDomain;", "getMethod"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LinkDescriptionDomain {
    public static final int $stable = 0;
    private final java.lang.String href;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.HttpMethodDomain method;

    public LinkDescriptionDomain(java.lang.String str, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.HttpMethodDomain httpMethodDomain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMethodDomain, "");
        this.href = str;
        this.method = httpMethodDomain;
    }

    public final java.lang.String getHref() {
        return this.href;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.HttpMethodDomain getMethod() {
        return this.method;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.href;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.HttpMethodDomain httpMethodDomain = this.method;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkDescriptionDomain(href=");
        sb.append(str);
        sb.append(", method=");
        sb.append(httpMethodDomain);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.href.hashCode() * 31) + this.method.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkDescriptionDomain)) {
            return false;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkDescriptionDomain linkDescriptionDomain = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkDescriptionDomain) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.href, linkDescriptionDomain.href) && this.method == linkDescriptionDomain.method;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkDescriptionDomain copy(java.lang.String href, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.HttpMethodDomain method) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(href, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkDescriptionDomain(href, method);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.HttpMethodDomain getMethod() {
        return this.method;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getHref() {
        return this.href;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkDescriptionDomain copy$default(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkDescriptionDomain linkDescriptionDomain, java.lang.String str, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.HttpMethodDomain httpMethodDomain, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = linkDescriptionDomain.href;
        }
        if ((i & 2) != 0) {
            httpMethodDomain = linkDescriptionDomain.method;
        }
        return linkDescriptionDomain.copy(str, httpMethodDomain);
    }
}
