package com.paypal.oslo.feature.bnplacquisition.ui.common.components;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ExitConfirmationContent;", "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "title", "primaryButtonText", "secondaryButtonText", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "component3", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ExitConfirmationContent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getTitle", "getPrimaryButtonText", "getSecondaryButtonText"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ExitConfirmationContent {
    public static final int $stable;
    private final com.paypal.oslo.core.commonui.utils.RefText primaryButtonText;
    private final com.paypal.oslo.core.commonui.utils.RefText secondaryButtonText;
    private final com.paypal.oslo.core.commonui.utils.RefText title;

    public ExitConfirmationContent(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.oslo.core.commonui.utils.RefText refText3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText3, "");
        this.title = refText;
        this.primaryButtonText = refText2;
        this.secondaryButtonText = refText3;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
        return this.title;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.commonui.utils.RefText refText = this.title;
        com.paypal.oslo.core.commonui.utils.RefText refText2 = this.primaryButtonText;
        com.paypal.oslo.core.commonui.utils.RefText refText3 = this.secondaryButtonText;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExitConfirmationContent(title=");
        sb.append(refText);
        sb.append(", primaryButtonText=");
        sb.append(refText2);
        sb.append(", secondaryButtonText=");
        sb.append(refText3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.title.hashCode() * 31) + this.primaryButtonText.hashCode()) * 31) + this.secondaryButtonText.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContent)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContent exitConfirmationContent = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, exitConfirmationContent.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryButtonText, exitConfirmationContent.primaryButtonText) && kotlin.jvm.internal.Intrinsics.areEqual(this.secondaryButtonText, exitConfirmationContent.secondaryButtonText);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContent copy(com.paypal.oslo.core.commonui.utils.RefText title, com.paypal.oslo.core.commonui.utils.RefText primaryButtonText, com.paypal.oslo.core.commonui.utils.RefText secondaryButtonText) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryButtonText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secondaryButtonText, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContent(title, primaryButtonText, secondaryButtonText);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContent copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContent exitConfirmationContent, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.oslo.core.commonui.utils.RefText refText3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            refText = exitConfirmationContent.title;
        }
        if ((i & 2) != 0) {
            refText2 = exitConfirmationContent.primaryButtonText;
        }
        if ((i & 4) != 0) {
            refText3 = exitConfirmationContent.secondaryButtonText;
        }
        return exitConfirmationContent.copy(refText, refText2, refText3);
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable;
    }
}
