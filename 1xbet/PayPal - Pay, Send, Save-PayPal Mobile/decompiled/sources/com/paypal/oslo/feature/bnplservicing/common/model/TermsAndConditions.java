package com.paypal.oslo.feature.bnplservicing.common.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/common/model/TermsAndConditions;", "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "text", "link", "", "url", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/common/model/TermsAndConditions;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getText", "getLink", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TermsAndConditions {
    public static final int $stable;
    private final com.paypal.oslo.core.commonui.utils.RefText link;
    private final com.paypal.oslo.core.commonui.utils.RefText text;
    private final java.lang.String url;

    public TermsAndConditions(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.text = refText;
        this.link = refText2;
        this.url = str;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getText() {
        return this.text;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getLink() {
        return this.link;
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.commonui.utils.RefText refText = this.text;
        com.paypal.oslo.core.commonui.utils.RefText refText2 = this.link;
        java.lang.String str = this.url;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TermsAndConditions(text=");
        sb.append(refText);
        sb.append(", link=");
        sb.append(refText2);
        sb.append(", url=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.text.hashCode() * 31) + this.link.hashCode()) * 31) + this.url.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.common.model.TermsAndConditions)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.common.model.TermsAndConditions termsAndConditions = (com.paypal.oslo.feature.bnplservicing.common.model.TermsAndConditions) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.text, termsAndConditions.text) && kotlin.jvm.internal.Intrinsics.areEqual(this.link, termsAndConditions.link) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, termsAndConditions.url);
    }

    public final com.paypal.oslo.feature.bnplservicing.common.model.TermsAndConditions copy(com.paypal.oslo.core.commonui.utils.RefText text, com.paypal.oslo.core.commonui.utils.RefText link, java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(link, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        return new com.paypal.oslo.feature.bnplservicing.common.model.TermsAndConditions(text, link, url);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getLink() {
        return this.link;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getText() {
        return this.text;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.common.model.TermsAndConditions copy$default(com.paypal.oslo.feature.bnplservicing.common.model.TermsAndConditions termsAndConditions, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            refText = termsAndConditions.text;
        }
        if ((i & 2) != 0) {
            refText2 = termsAndConditions.link;
        }
        if ((i & 4) != 0) {
            str = termsAndConditions.url;
        }
        return termsAndConditions.copy(refText, refText2, str);
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i;
    }
}
