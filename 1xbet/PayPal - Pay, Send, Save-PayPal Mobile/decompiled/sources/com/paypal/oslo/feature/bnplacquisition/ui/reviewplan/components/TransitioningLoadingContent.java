package com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/components/TransitioningLoadingContent;", "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "progressText", "footerText", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/components/TransitioningLoadingContent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getProgressText", "getFooterText"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TransitioningLoadingContent {
    public static final int $stable = 0;
    private final com.paypal.oslo.core.commonui.utils.RefText footerText;
    private final com.paypal.oslo.core.commonui.utils.RefText progressText;

    public TransitioningLoadingContent(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2) {
        this.progressText = refText;
        this.footerText = refText2;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getProgressText() {
        return this.progressText;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getFooterText() {
        return this.footerText;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.commonui.utils.RefText refText = this.progressText;
        com.paypal.oslo.core.commonui.utils.RefText refText2 = this.footerText;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransitioningLoadingContent(progressText=");
        sb.append(refText);
        sb.append(", footerText=");
        sb.append(refText2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.core.commonui.utils.RefText refText = this.progressText;
        int hashCode = refText == null ? 0 : refText.hashCode();
        com.paypal.oslo.core.commonui.utils.RefText refText2 = this.footerText;
        return (hashCode * 31) + (refText2 != null ? refText2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.TransitioningLoadingContent)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.TransitioningLoadingContent transitioningLoadingContent = (com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.TransitioningLoadingContent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.progressText, transitioningLoadingContent.progressText) && kotlin.jvm.internal.Intrinsics.areEqual(this.footerText, transitioningLoadingContent.footerText);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.TransitioningLoadingContent copy(com.paypal.oslo.core.commonui.utils.RefText progressText, com.paypal.oslo.core.commonui.utils.RefText footerText) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.TransitioningLoadingContent(progressText, footerText);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getFooterText() {
        return this.footerText;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getProgressText() {
        return this.progressText;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.TransitioningLoadingContent copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.TransitioningLoadingContent transitioningLoadingContent, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            refText = transitioningLoadingContent.progressText;
        }
        if ((i & 2) != 0) {
            refText2 = transitioningLoadingContent.footerText;
        }
        return transitioningLoadingContent.copy(refText, refText2);
    }
}
