package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ:\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoFooterContent;", "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "disclaimerText", "esignConsentLinkLabel", "stateDisclosuresLinkLabel", "continueButtonText", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "component3", "component4", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoFooterContent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getDisclaimerText", "getEsignConsentLinkLabel", "getStateDisclosuresLinkLabel", "getContinueButtonText"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PersonalInfoFooterContent {
    public static final int $stable = 0;
    private final com.paypal.oslo.core.commonui.utils.RefText continueButtonText;
    private final com.paypal.oslo.core.commonui.utils.RefText disclaimerText;
    private final com.paypal.oslo.core.commonui.utils.RefText esignConsentLinkLabel;
    private final com.paypal.oslo.core.commonui.utils.RefText stateDisclosuresLinkLabel;

    public PersonalInfoFooterContent(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.oslo.core.commonui.utils.RefText refText3, com.paypal.oslo.core.commonui.utils.RefText refText4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText4, "");
        this.disclaimerText = refText;
        this.esignConsentLinkLabel = refText2;
        this.stateDisclosuresLinkLabel = refText3;
        this.continueButtonText = refText4;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getDisclaimerText() {
        return this.disclaimerText;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getEsignConsentLinkLabel() {
        return this.esignConsentLinkLabel;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getStateDisclosuresLinkLabel() {
        return this.stateDisclosuresLinkLabel;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getContinueButtonText() {
        return this.continueButtonText;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.commonui.utils.RefText refText = this.disclaimerText;
        com.paypal.oslo.core.commonui.utils.RefText refText2 = this.esignConsentLinkLabel;
        com.paypal.oslo.core.commonui.utils.RefText refText3 = this.stateDisclosuresLinkLabel;
        com.paypal.oslo.core.commonui.utils.RefText refText4 = this.continueButtonText;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PersonalInfoFooterContent(disclaimerText=");
        sb.append(refText);
        sb.append(", esignConsentLinkLabel=");
        sb.append(refText2);
        sb.append(", stateDisclosuresLinkLabel=");
        sb.append(refText3);
        sb.append(", continueButtonText=");
        sb.append(refText4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.core.commonui.utils.RefText refText = this.disclaimerText;
        return ((((((refText == null ? 0 : refText.hashCode()) * 31) + this.esignConsentLinkLabel.hashCode()) * 31) + this.stateDisclosuresLinkLabel.hashCode()) * 31) + this.continueButtonText.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoFooterContent)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoFooterContent personalInfoFooterContent = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoFooterContent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.disclaimerText, personalInfoFooterContent.disclaimerText) && kotlin.jvm.internal.Intrinsics.areEqual(this.esignConsentLinkLabel, personalInfoFooterContent.esignConsentLinkLabel) && kotlin.jvm.internal.Intrinsics.areEqual(this.stateDisclosuresLinkLabel, personalInfoFooterContent.stateDisclosuresLinkLabel) && kotlin.jvm.internal.Intrinsics.areEqual(this.continueButtonText, personalInfoFooterContent.continueButtonText);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoFooterContent copy(com.paypal.oslo.core.commonui.utils.RefText disclaimerText, com.paypal.oslo.core.commonui.utils.RefText esignConsentLinkLabel, com.paypal.oslo.core.commonui.utils.RefText stateDisclosuresLinkLabel, com.paypal.oslo.core.commonui.utils.RefText continueButtonText) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(esignConsentLinkLabel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateDisclosuresLinkLabel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continueButtonText, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoFooterContent(disclaimerText, esignConsentLinkLabel, stateDisclosuresLinkLabel, continueButtonText);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getContinueButtonText() {
        return this.continueButtonText;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getStateDisclosuresLinkLabel() {
        return this.stateDisclosuresLinkLabel;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getEsignConsentLinkLabel() {
        return this.esignConsentLinkLabel;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getDisclaimerText() {
        return this.disclaimerText;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoFooterContent copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoFooterContent personalInfoFooterContent, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.oslo.core.commonui.utils.RefText refText3, com.paypal.oslo.core.commonui.utils.RefText refText4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            refText = personalInfoFooterContent.disclaimerText;
        }
        if ((i & 2) != 0) {
            refText2 = personalInfoFooterContent.esignConsentLinkLabel;
        }
        if ((i & 4) != 0) {
            refText3 = personalInfoFooterContent.stateDisclosuresLinkLabel;
        }
        if ((i & 8) != 0) {
            refText4 = personalInfoFooterContent.continueButtonText;
        }
        return personalInfoFooterContent.copy(refText, refText2, refText3, refText4);
    }
}
