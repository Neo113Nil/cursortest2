package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PrequalSectionUiModel;", "", "", "amount", "", "preQualificationEligible", "Lcom/paypal/oslo/feature/bnplservicing/ui/common/content/ErrorContentProvider$PrequalAmountErrorContent;", "errorContent", "<init>", "(Ljava/lang/String;ZLcom/paypal/oslo/feature/bnplservicing/ui/common/content/ErrorContentProvider$PrequalAmountErrorContent;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Lcom/paypal/oslo/feature/bnplservicing/ui/common/content/ErrorContentProvider$PrequalAmountErrorContent;", "copy", "(Ljava/lang/String;ZLcom/paypal/oslo/feature/bnplservicing/ui/common/content/ErrorContentProvider$PrequalAmountErrorContent;)Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PrequalSectionUiModel;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmount", "Z", "getPreQualificationEligible", "Lcom/paypal/oslo/feature/bnplservicing/ui/common/content/ErrorContentProvider$PrequalAmountErrorContent;", "getErrorContent", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PrequalSectionUiModel {
    public static final int $stable;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PrequalSectionUiModel.Companion INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PrequalSectionUiModel.Companion(null);
    private static final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PrequalSectionUiModel placeholder;
    private final java.lang.String amount;
    private final com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider.PrequalAmountErrorContent errorContent;
    private final boolean preQualificationEligible;

    public PrequalSectionUiModel(java.lang.String str, boolean z, com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider.PrequalAmountErrorContent prequalAmountErrorContent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prequalAmountErrorContent, "");
        this.amount = str;
        this.preQualificationEligible = z;
        this.errorContent = prequalAmountErrorContent;
    }

    public /* synthetic */ PrequalSectionUiModel(java.lang.String str, boolean z, com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider.PrequalAmountErrorContent prequalAmountErrorContent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, prequalAmountErrorContent);
    }

    public final java.lang.String getAmount() {
        return this.amount;
    }

    public final boolean getPreQualificationEligible() {
        return this.preQualificationEligible;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider.PrequalAmountErrorContent getErrorContent() {
        return this.errorContent;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PrequalSectionUiModel$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PrequalSectionUiModel;", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_PLACEHOLDER, "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PrequalSectionUiModel;", "getPlaceholder", "()Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PrequalSectionUiModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PrequalSectionUiModel getPlaceholder() {
            return com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PrequalSectionUiModel.placeholder;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable;
        placeholder = new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PrequalSectionUiModel(com.paypal.oslo.feature.bnplservicing.ui.common.ShimmerPlaceholderConstantsKt.PlaceholderShort, false, new com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider.PrequalAmountErrorContent(null, 1, null));
    }

    public final java.lang.String toString() {
        java.lang.String str = this.amount;
        boolean z = this.preQualificationEligible;
        com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider.PrequalAmountErrorContent prequalAmountErrorContent = this.errorContent;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PrequalSectionUiModel(amount=");
        sb.append(str);
        sb.append(", preQualificationEligible=");
        sb.append(z);
        sb.append(", errorContent=");
        sb.append(prequalAmountErrorContent);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.amount.hashCode() * 31) + java.lang.Boolean.hashCode(this.preQualificationEligible)) * 31) + this.errorContent.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PrequalSectionUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PrequalSectionUiModel prequalSectionUiModel = (com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PrequalSectionUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, prequalSectionUiModel.amount) && this.preQualificationEligible == prequalSectionUiModel.preQualificationEligible && kotlin.jvm.internal.Intrinsics.areEqual(this.errorContent, prequalSectionUiModel.errorContent);
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PrequalSectionUiModel copy(java.lang.String amount, boolean preQualificationEligible, com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider.PrequalAmountErrorContent errorContent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContent, "");
        return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PrequalSectionUiModel(amount, preQualificationEligible, errorContent);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider.PrequalAmountErrorContent getErrorContent() {
        return this.errorContent;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getPreQualificationEligible() {
        return this.preQualificationEligible;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAmount() {
        return this.amount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PrequalSectionUiModel copy$default(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PrequalSectionUiModel prequalSectionUiModel, java.lang.String str, boolean z, com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider.PrequalAmountErrorContent prequalAmountErrorContent, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = prequalSectionUiModel.amount;
        }
        if ((i & 2) != 0) {
            z = prequalSectionUiModel.preQualificationEligible;
        }
        if ((i & 4) != 0) {
            prequalAmountErrorContent = prequalSectionUiModel.errorContent;
        }
        return prequalSectionUiModel.copy(str, z, prequalAmountErrorContent);
    }
}
