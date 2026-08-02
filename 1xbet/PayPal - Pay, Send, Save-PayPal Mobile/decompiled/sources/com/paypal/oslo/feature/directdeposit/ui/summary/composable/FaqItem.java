package com.paypal.oslo.feature.directdeposit.ui.summary.composable;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/summary/composable/FaqItem;", "", "", "title", "Lcom/paypal/pds/core/RichText;", "richText", "tag", "", "hasLinks", "<init>", "(Ljava/lang/String;Lcom/paypal/pds/core/RichText;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/pds/core/RichText;", "component3", "component4", "()Z", "copy", "(Ljava/lang/String;Lcom/paypal/pds/core/RichText;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/directdeposit/ui/summary/composable/FaqItem;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "Lcom/paypal/pds/core/RichText;", "getRichText", "getTag", "Z", "getHasLinks"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FaqItem {
    public static final int $stable = 0;
    private final boolean hasLinks;
    private final com.paypal.pds.core.RichText richText;
    private final java.lang.String tag;
    private final java.lang.String title;

    public FaqItem(java.lang.String str, com.paypal.pds.core.RichText richText, java.lang.String str2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(richText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.title = str;
        this.richText = richText;
        this.tag = str2;
        this.hasLinks = z;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final com.paypal.pds.core.RichText getRichText() {
        return this.richText;
    }

    public final java.lang.String getTag() {
        return this.tag;
    }

    public final boolean getHasLinks() {
        return this.hasLinks;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.title;
        com.paypal.pds.core.RichText richText = this.richText;
        java.lang.String str2 = this.tag;
        boolean z = this.hasLinks;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FaqItem(title=");
        sb.append(str);
        sb.append(", richText=");
        sb.append(richText);
        sb.append(", tag=");
        sb.append(str2);
        sb.append(", hasLinks=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.title.hashCode() * 31) + this.richText.hashCode()) * 31) + this.tag.hashCode()) * 31) + java.lang.Boolean.hashCode(this.hasLinks);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqItem)) {
            return false;
        }
        com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqItem faqItem = (com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, faqItem.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.richText, faqItem.richText) && kotlin.jvm.internal.Intrinsics.areEqual(this.tag, faqItem.tag) && this.hasLinks == faqItem.hasLinks;
    }

    public final com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqItem copy(java.lang.String title, com.paypal.pds.core.RichText richText, java.lang.String tag, boolean hasLinks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(richText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        return new com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqItem(title, richText, tag, hasLinks);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHasLinks() {
        return this.hasLinks;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getTag() {
        return this.tag;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.pds.core.RichText getRichText() {
        return this.richText;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqItem copy$default(com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqItem faqItem, java.lang.String str, com.paypal.pds.core.RichText richText, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = faqItem.title;
        }
        if ((i & 2) != 0) {
            richText = faqItem.richText;
        }
        if ((i & 4) != 0) {
            str2 = faqItem.tag;
        }
        if ((i & 8) != 0) {
            z = faqItem.hasLinks;
        }
        return faqItem.copy(str, richText, str2, z);
    }
}
