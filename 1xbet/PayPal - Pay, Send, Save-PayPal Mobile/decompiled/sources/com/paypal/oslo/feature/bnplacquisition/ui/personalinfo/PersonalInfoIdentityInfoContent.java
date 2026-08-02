package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoIdentityInfoContent;", "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "dobTitle", "ssnTitle", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoIdentityInfoContent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getDobTitle", "getSsnTitle"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PersonalInfoIdentityInfoContent {
    public static final int $stable = 0;
    private final com.paypal.oslo.core.commonui.utils.RefText dobTitle;
    private final com.paypal.oslo.core.commonui.utils.RefText ssnTitle;

    public PersonalInfoIdentityInfoContent(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText2, "");
        this.dobTitle = refText;
        this.ssnTitle = refText2;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getDobTitle() {
        return this.dobTitle;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getSsnTitle() {
        return this.ssnTitle;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.commonui.utils.RefText refText = this.dobTitle;
        com.paypal.oslo.core.commonui.utils.RefText refText2 = this.ssnTitle;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PersonalInfoIdentityInfoContent(dobTitle=");
        sb.append(refText);
        sb.append(", ssnTitle=");
        sb.append(refText2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.dobTitle.hashCode() * 31) + this.ssnTitle.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoIdentityInfoContent)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoIdentityInfoContent personalInfoIdentityInfoContent = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoIdentityInfoContent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.dobTitle, personalInfoIdentityInfoContent.dobTitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.ssnTitle, personalInfoIdentityInfoContent.ssnTitle);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoIdentityInfoContent copy(com.paypal.oslo.core.commonui.utils.RefText dobTitle, com.paypal.oslo.core.commonui.utils.RefText ssnTitle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dobTitle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ssnTitle, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoIdentityInfoContent(dobTitle, ssnTitle);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getSsnTitle() {
        return this.ssnTitle;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getDobTitle() {
        return this.dobTitle;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoIdentityInfoContent copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoIdentityInfoContent personalInfoIdentityInfoContent, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            refText = personalInfoIdentityInfoContent.dobTitle;
        }
        if ((i & 2) != 0) {
            refText2 = personalInfoIdentityInfoContent.ssnTitle;
        }
        return personalInfoIdentityInfoContent.copy(refText, refText2);
    }
}
