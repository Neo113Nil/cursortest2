package com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ@\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR,\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001f\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/components/ReviewPlanFooterContent;", "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "legalText", "", "Lkotlin/Pair;", "", "links", "applyButtonText", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Ljava/util/List;Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "()Ljava/util/List;", "component3", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Ljava/util/List;Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/components/ReviewPlanFooterContent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getLegalText", "Ljava/util/List;", "getLinks", "getApplyButtonText"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ReviewPlanFooterContent {
    public static final int $stable = 0;
    private final com.paypal.oslo.core.commonui.utils.RefText applyButtonText;
    private final com.paypal.oslo.core.commonui.utils.RefText legalText;
    private final java.util.List<kotlin.Pair<com.paypal.oslo.core.commonui.utils.RefText, java.lang.String>> links;

    /* JADX WARN: Multi-variable type inference failed */
    public ReviewPlanFooterContent(com.paypal.oslo.core.commonui.utils.RefText refText, java.util.List<? extends kotlin.Pair<? extends com.paypal.oslo.core.commonui.utils.RefText, java.lang.String>> list, com.paypal.oslo.core.commonui.utils.RefText refText2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText2, "");
        this.legalText = refText;
        this.links = list;
        this.applyButtonText = refText2;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getLegalText() {
        return this.legalText;
    }

    public final java.util.List<kotlin.Pair<com.paypal.oslo.core.commonui.utils.RefText, java.lang.String>> getLinks() {
        return this.links;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getApplyButtonText() {
        return this.applyButtonText;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.commonui.utils.RefText refText = this.legalText;
        java.util.List<kotlin.Pair<com.paypal.oslo.core.commonui.utils.RefText, java.lang.String>> list = this.links;
        com.paypal.oslo.core.commonui.utils.RefText refText2 = this.applyButtonText;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReviewPlanFooterContent(legalText=");
        sb.append(refText);
        sb.append(", links=");
        sb.append(list);
        sb.append(", applyButtonText=");
        sb.append(refText2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.legalText.hashCode() * 31) + this.links.hashCode()) * 31) + this.applyButtonText.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.ReviewPlanFooterContent)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.ReviewPlanFooterContent reviewPlanFooterContent = (com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.ReviewPlanFooterContent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.legalText, reviewPlanFooterContent.legalText) && kotlin.jvm.internal.Intrinsics.areEqual(this.links, reviewPlanFooterContent.links) && kotlin.jvm.internal.Intrinsics.areEqual(this.applyButtonText, reviewPlanFooterContent.applyButtonText);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.ReviewPlanFooterContent copy(com.paypal.oslo.core.commonui.utils.RefText legalText, java.util.List<? extends kotlin.Pair<? extends com.paypal.oslo.core.commonui.utils.RefText, java.lang.String>> links, com.paypal.oslo.core.commonui.utils.RefText applyButtonText) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legalText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(links, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applyButtonText, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.ReviewPlanFooterContent(legalText, links, applyButtonText);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getApplyButtonText() {
        return this.applyButtonText;
    }

    public final java.util.List<kotlin.Pair<com.paypal.oslo.core.commonui.utils.RefText, java.lang.String>> component2() {
        return this.links;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getLegalText() {
        return this.legalText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.ReviewPlanFooterContent copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.ReviewPlanFooterContent reviewPlanFooterContent, com.paypal.oslo.core.commonui.utils.RefText refText, java.util.List list, com.paypal.oslo.core.commonui.utils.RefText refText2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            refText = reviewPlanFooterContent.legalText;
        }
        if ((i & 2) != 0) {
            list = reviewPlanFooterContent.links;
        }
        if ((i & 4) != 0) {
            refText2 = reviewPlanFooterContent.applyButtonText;
        }
        return reviewPlanFooterContent.copy(refText, list, refText2);
    }
}
