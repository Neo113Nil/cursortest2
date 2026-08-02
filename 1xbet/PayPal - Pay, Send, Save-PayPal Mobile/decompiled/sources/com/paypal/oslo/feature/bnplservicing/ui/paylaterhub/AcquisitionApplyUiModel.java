package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/AcquisitionApplyUiModel;", "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "title", "Lcom/paypal/oslo/feature/bnplservicing/ui/plhub/components/AcquisitionApplyTileModel;", "applyTileModel", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/feature/bnplservicing/ui/plhub/components/AcquisitionApplyTileModel;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/ui/plhub/components/AcquisitionApplyTileModel;", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/feature/bnplservicing/ui/plhub/components/AcquisitionApplyTileModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/AcquisitionApplyUiModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getTitle", "Lcom/paypal/oslo/feature/bnplservicing/ui/plhub/components/AcquisitionApplyTileModel;", "getApplyTileModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AcquisitionApplyUiModel {
    public static final int $stable;
    private final com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel applyTileModel;
    private final com.paypal.oslo.core.commonui.utils.RefText title;

    public AcquisitionApplyUiModel(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel acquisitionApplyTileModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acquisitionApplyTileModel, "");
        this.title = refText;
        this.applyTileModel = acquisitionApplyTileModel;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
        return this.title;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel getApplyTileModel() {
        return this.applyTileModel;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.commonui.utils.RefText refText = this.title;
        com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel acquisitionApplyTileModel = this.applyTileModel;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AcquisitionApplyUiModel(title=");
        sb.append(refText);
        sb.append(", applyTileModel=");
        sb.append(acquisitionApplyTileModel);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.title.hashCode() * 31) + this.applyTileModel.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.AcquisitionApplyUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.AcquisitionApplyUiModel acquisitionApplyUiModel = (com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.AcquisitionApplyUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, acquisitionApplyUiModel.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.applyTileModel, acquisitionApplyUiModel.applyTileModel);
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.AcquisitionApplyUiModel copy(com.paypal.oslo.core.commonui.utils.RefText title, com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel applyTileModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applyTileModel, "");
        return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.AcquisitionApplyUiModel(title, applyTileModel);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel getApplyTileModel() {
        return this.applyTileModel;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.AcquisitionApplyUiModel copy$default(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.AcquisitionApplyUiModel acquisitionApplyUiModel, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel acquisitionApplyTileModel, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            refText = acquisitionApplyUiModel.title;
        }
        if ((i & 2) != 0) {
            acquisitionApplyTileModel = acquisitionApplyUiModel.applyTileModel;
        }
        return acquisitionApplyUiModel.copy(refText, acquisitionApplyTileModel);
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable;
    }
}
