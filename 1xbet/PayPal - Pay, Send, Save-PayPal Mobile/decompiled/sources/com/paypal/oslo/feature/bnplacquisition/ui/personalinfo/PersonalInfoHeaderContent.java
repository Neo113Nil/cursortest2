package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoHeaderContent;", "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "title", "subtitle", "", "showSubtitle", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Z)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "component3", "()Z", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Z)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoHeaderContent;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getTitle", "getSubtitle", "Z", "getShowSubtitle"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PersonalInfoHeaderContent {
    public static final int $stable = 0;
    private final boolean showSubtitle;
    private final com.paypal.oslo.core.commonui.utils.RefText subtitle;
    private final com.paypal.oslo.core.commonui.utils.RefText title;

    public PersonalInfoHeaderContent(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText2, "");
        this.title = refText;
        this.subtitle = refText2;
        this.showSubtitle = z;
    }

    public /* synthetic */ PersonalInfoHeaderContent(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(refText, refText2, (i & 4) != 0 ? true : z);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
        return this.title;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getSubtitle() {
        return this.subtitle;
    }

    public final boolean getShowSubtitle() {
        return this.showSubtitle;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.commonui.utils.RefText refText = this.title;
        com.paypal.oslo.core.commonui.utils.RefText refText2 = this.subtitle;
        boolean z = this.showSubtitle;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PersonalInfoHeaderContent(title=");
        sb.append(refText);
        sb.append(", subtitle=");
        sb.append(refText2);
        sb.append(", showSubtitle=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + java.lang.Boolean.hashCode(this.showSubtitle);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoHeaderContent)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoHeaderContent personalInfoHeaderContent = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoHeaderContent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, personalInfoHeaderContent.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.subtitle, personalInfoHeaderContent.subtitle) && this.showSubtitle == personalInfoHeaderContent.showSubtitle;
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoHeaderContent copy(com.paypal.oslo.core.commonui.utils.RefText title, com.paypal.oslo.core.commonui.utils.RefText subtitle, boolean showSubtitle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subtitle, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoHeaderContent(title, subtitle, showSubtitle);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowSubtitle() {
        return this.showSubtitle;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoHeaderContent copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoHeaderContent personalInfoHeaderContent, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            refText = personalInfoHeaderContent.title;
        }
        if ((i & 2) != 0) {
            refText2 = personalInfoHeaderContent.subtitle;
        }
        if ((i & 4) != 0) {
            z = personalInfoHeaderContent.showSubtitle;
        }
        return personalInfoHeaderContent.copy(refText, refText2, z);
    }
}
