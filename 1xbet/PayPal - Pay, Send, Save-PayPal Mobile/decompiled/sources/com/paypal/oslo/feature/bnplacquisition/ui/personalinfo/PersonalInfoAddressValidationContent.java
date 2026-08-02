package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoAddressValidationContent;", "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "errorTitle", "editAddressButtonText", "chooseDifferentAddressButtonText", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "component3", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoAddressValidationContent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getErrorTitle", "getEditAddressButtonText", "getChooseDifferentAddressButtonText"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PersonalInfoAddressValidationContent {
    public static final int $stable = 0;
    private final com.paypal.oslo.core.commonui.utils.RefText chooseDifferentAddressButtonText;
    private final com.paypal.oslo.core.commonui.utils.RefText editAddressButtonText;
    private final com.paypal.oslo.core.commonui.utils.RefText errorTitle;

    public PersonalInfoAddressValidationContent(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.oslo.core.commonui.utils.RefText refText3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText3, "");
        this.errorTitle = refText;
        this.editAddressButtonText = refText2;
        this.chooseDifferentAddressButtonText = refText3;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getErrorTitle() {
        return this.errorTitle;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getEditAddressButtonText() {
        return this.editAddressButtonText;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getChooseDifferentAddressButtonText() {
        return this.chooseDifferentAddressButtonText;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.commonui.utils.RefText refText = this.errorTitle;
        com.paypal.oslo.core.commonui.utils.RefText refText2 = this.editAddressButtonText;
        com.paypal.oslo.core.commonui.utils.RefText refText3 = this.chooseDifferentAddressButtonText;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PersonalInfoAddressValidationContent(errorTitle=");
        sb.append(refText);
        sb.append(", editAddressButtonText=");
        sb.append(refText2);
        sb.append(", chooseDifferentAddressButtonText=");
        sb.append(refText3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.errorTitle.hashCode() * 31) + this.editAddressButtonText.hashCode()) * 31) + this.chooseDifferentAddressButtonText.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoAddressValidationContent)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoAddressValidationContent personalInfoAddressValidationContent = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoAddressValidationContent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.errorTitle, personalInfoAddressValidationContent.errorTitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.editAddressButtonText, personalInfoAddressValidationContent.editAddressButtonText) && kotlin.jvm.internal.Intrinsics.areEqual(this.chooseDifferentAddressButtonText, personalInfoAddressValidationContent.chooseDifferentAddressButtonText);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoAddressValidationContent copy(com.paypal.oslo.core.commonui.utils.RefText errorTitle, com.paypal.oslo.core.commonui.utils.RefText editAddressButtonText, com.paypal.oslo.core.commonui.utils.RefText chooseDifferentAddressButtonText) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorTitle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editAddressButtonText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chooseDifferentAddressButtonText, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoAddressValidationContent(errorTitle, editAddressButtonText, chooseDifferentAddressButtonText);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getChooseDifferentAddressButtonText() {
        return this.chooseDifferentAddressButtonText;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getEditAddressButtonText() {
        return this.editAddressButtonText;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getErrorTitle() {
        return this.errorTitle;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoAddressValidationContent copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoAddressValidationContent personalInfoAddressValidationContent, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.oslo.core.commonui.utils.RefText refText3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            refText = personalInfoAddressValidationContent.errorTitle;
        }
        if ((i & 2) != 0) {
            refText2 = personalInfoAddressValidationContent.editAddressButtonText;
        }
        if ((i & 4) != 0) {
            refText3 = personalInfoAddressValidationContent.chooseDifferentAddressButtonText;
        }
        return personalInfoAddressValidationContent.copy(refText, refText2, refText3);
    }
}
