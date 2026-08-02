package com.paypal.oslo.feature.bnplacquisition.ui.reviewterms;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ConsentLink;", "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "label", "", "url", "tag", "html", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ConsentLink;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getLabel", "Ljava/lang/String;", "getUrl", "getTag", "getHtml"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ConsentLink {
    public static final int $stable = com.paypal.oslo.core.commonui.utils.RefText.$stable;
    private final java.lang.String html;
    private final com.paypal.oslo.core.commonui.utils.RefText label;
    private final java.lang.String tag;
    private final java.lang.String url;

    public ConsentLink(com.paypal.oslo.core.commonui.utils.RefText refText, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.label = refText;
        this.url = str;
        this.tag = str2;
        this.html = str3;
    }

    public /* synthetic */ ConsentLink(com.paypal.oslo.core.commonui.utils.RefText refText, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(refText, str, str2, (i & 8) != 0 ? null : str3);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getLabel() {
        return this.label;
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public final java.lang.String getTag() {
        return this.tag;
    }

    public final java.lang.String getHtml() {
        return this.html;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.commonui.utils.RefText refText = this.label;
        java.lang.String str = this.url;
        java.lang.String str2 = this.tag;
        java.lang.String str3 = this.html;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConsentLink(label=");
        sb.append(refText);
        sb.append(", url=");
        sb.append(str);
        sb.append(", tag=");
        sb.append(str2);
        sb.append(", html=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.label.hashCode();
        int hashCode2 = this.url.hashCode();
        int hashCode3 = this.tag.hashCode();
        java.lang.String str = this.html;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ConsentLink)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ConsentLink consentLink = (com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ConsentLink) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.label, consentLink.label) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, consentLink.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.tag, consentLink.tag) && kotlin.jvm.internal.Intrinsics.areEqual(this.html, consentLink.html);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ConsentLink copy(com.paypal.oslo.core.commonui.utils.RefText label, java.lang.String url, java.lang.String tag, java.lang.String html) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ConsentLink(label, url, tag, html);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getHtml() {
        return this.html;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getTag() {
        return this.tag;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getLabel() {
        return this.label;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ConsentLink copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ConsentLink consentLink, com.paypal.oslo.core.commonui.utils.RefText refText, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            refText = consentLink.label;
        }
        if ((i & 2) != 0) {
            str = consentLink.url;
        }
        if ((i & 4) != 0) {
            str2 = consentLink.tag;
        }
        if ((i & 8) != 0) {
            str3 = consentLink.html;
        }
        return consentLink.copy(refText, str, str2, str3);
    }
}
