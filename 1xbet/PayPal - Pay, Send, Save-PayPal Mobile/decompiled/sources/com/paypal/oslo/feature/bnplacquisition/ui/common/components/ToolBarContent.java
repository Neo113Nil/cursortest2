package com.paypal.oslo.feature.bnplacquisition.ui.common.components;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ToolBarContent;", "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "backButtonLabel", "closeButtonLabel", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ToolBarContent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getBackButtonLabel", "getCloseButtonLabel"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ToolBarContent {
    public static final int $stable;
    private final com.paypal.oslo.core.commonui.utils.RefText backButtonLabel;
    private final com.paypal.oslo.core.commonui.utils.RefText closeButtonLabel;

    public ToolBarContent(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText2, "");
        this.backButtonLabel = refText;
        this.closeButtonLabel = refText2;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getBackButtonLabel() {
        return this.backButtonLabel;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getCloseButtonLabel() {
        return this.closeButtonLabel;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.commonui.utils.RefText refText = this.backButtonLabel;
        com.paypal.oslo.core.commonui.utils.RefText refText2 = this.closeButtonLabel;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ToolBarContent(backButtonLabel=");
        sb.append(refText);
        sb.append(", closeButtonLabel=");
        sb.append(refText2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.backButtonLabel.hashCode() * 31) + this.closeButtonLabel.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarContent)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarContent toolBarContent = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarContent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.backButtonLabel, toolBarContent.backButtonLabel) && kotlin.jvm.internal.Intrinsics.areEqual(this.closeButtonLabel, toolBarContent.closeButtonLabel);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarContent copy(com.paypal.oslo.core.commonui.utils.RefText backButtonLabel, com.paypal.oslo.core.commonui.utils.RefText closeButtonLabel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backButtonLabel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeButtonLabel, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarContent(backButtonLabel, closeButtonLabel);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getCloseButtonLabel() {
        return this.closeButtonLabel;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getBackButtonLabel() {
        return this.backButtonLabel;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarContent copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarContent toolBarContent, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            refText = toolBarContent.backButtonLabel;
        }
        if ((i & 2) != 0) {
            refText2 = toolBarContent.closeButtonLabel;
        }
        return toolBarContent.copy(refText, refText2);
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i;
    }
}
