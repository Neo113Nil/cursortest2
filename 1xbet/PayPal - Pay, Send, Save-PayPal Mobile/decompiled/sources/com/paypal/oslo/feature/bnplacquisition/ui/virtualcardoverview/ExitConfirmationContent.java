package com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/ExitConfirmationContent;", "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "confirmExitButtonText", "stayButtonText", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "component3", "component4", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/ExitConfirmationContent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getTitle", "getDescription", "getConfirmExitButtonText", "getStayButtonText"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ExitConfirmationContent {
    public static final int $stable;
    private final com.paypal.oslo.core.commonui.utils.RefText confirmExitButtonText;
    private final com.paypal.oslo.core.commonui.utils.RefText description;
    private final com.paypal.oslo.core.commonui.utils.RefText stayButtonText;
    private final com.paypal.oslo.core.commonui.utils.RefText title;

    public ExitConfirmationContent(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.oslo.core.commonui.utils.RefText refText3, com.paypal.oslo.core.commonui.utils.RefText refText4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText4, "");
        this.title = refText;
        this.description = refText2;
        this.confirmExitButtonText = refText3;
        this.stayButtonText = refText4;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
        return this.title;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getDescription() {
        return this.description;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getConfirmExitButtonText() {
        return this.confirmExitButtonText;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getStayButtonText() {
        return this.stayButtonText;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.commonui.utils.RefText refText = this.title;
        com.paypal.oslo.core.commonui.utils.RefText refText2 = this.description;
        com.paypal.oslo.core.commonui.utils.RefText refText3 = this.confirmExitButtonText;
        com.paypal.oslo.core.commonui.utils.RefText refText4 = this.stayButtonText;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExitConfirmationContent(title=");
        sb.append(refText);
        sb.append(", description=");
        sb.append(refText2);
        sb.append(", confirmExitButtonText=");
        sb.append(refText3);
        sb.append(", stayButtonText=");
        sb.append(refText4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.confirmExitButtonText.hashCode()) * 31) + this.stayButtonText.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.ExitConfirmationContent)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.ExitConfirmationContent exitConfirmationContent = (com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.ExitConfirmationContent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, exitConfirmationContent.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, exitConfirmationContent.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmExitButtonText, exitConfirmationContent.confirmExitButtonText) && kotlin.jvm.internal.Intrinsics.areEqual(this.stayButtonText, exitConfirmationContent.stayButtonText);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.ExitConfirmationContent copy(com.paypal.oslo.core.commonui.utils.RefText title, com.paypal.oslo.core.commonui.utils.RefText description, com.paypal.oslo.core.commonui.utils.RefText confirmExitButtonText, com.paypal.oslo.core.commonui.utils.RefText stayButtonText) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmExitButtonText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stayButtonText, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.ExitConfirmationContent(title, description, confirmExitButtonText, stayButtonText);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getStayButtonText() {
        return this.stayButtonText;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getConfirmExitButtonText() {
        return this.confirmExitButtonText;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getDescription() {
        return this.description;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.ExitConfirmationContent copy$default(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.ExitConfirmationContent exitConfirmationContent, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.oslo.core.commonui.utils.RefText refText3, com.paypal.oslo.core.commonui.utils.RefText refText4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            refText = exitConfirmationContent.title;
        }
        if ((i & 2) != 0) {
            refText2 = exitConfirmationContent.description;
        }
        if ((i & 4) != 0) {
            refText3 = exitConfirmationContent.confirmExitButtonText;
        }
        if ((i & 8) != 0) {
            refText4 = exitConfirmationContent.stayButtonText;
        }
        return exitConfirmationContent.copy(refText, refText2, refText3, refText4);
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable;
    }
}
