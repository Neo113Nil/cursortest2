package com.paypal.oslo.feature.subscriptions.bulkfi.ui;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiPostUpdatePreviewData;", "", "", "name", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/model/BulkUpdateFiResultWithAgreements;", "resultWithAgreements", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/model/BulkUpdateFiResultWithAgreements;)V", "toString", "()Ljava/lang/String;", "component1", "component2", "()Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/model/BulkUpdateFiResultWithAgreements;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/model/BulkUpdateFiResultWithAgreements;)Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiPostUpdatePreviewData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getName", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/model/BulkUpdateFiResultWithAgreements;", "getResultWithAgreements"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BulkUpdateFiPostUpdatePreviewData {
    public static final int $stable = 8;
    private final java.lang.String name;
    private final com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiResultWithAgreements resultWithAgreements;

    public BulkUpdateFiPostUpdatePreviewData(java.lang.String str, com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiResultWithAgreements bulkUpdateFiResultWithAgreements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bulkUpdateFiResultWithAgreements, "");
        this.name = str;
        this.resultWithAgreements = bulkUpdateFiResultWithAgreements;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiResultWithAgreements getResultWithAgreements() {
        return this.resultWithAgreements;
    }

    public final java.lang.String toString() {
        return this.name;
    }

    public final int hashCode() {
        return (this.name.hashCode() * 31) + this.resultWithAgreements.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdatePreviewData)) {
            return false;
        }
        com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdatePreviewData bulkUpdateFiPostUpdatePreviewData = (com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdatePreviewData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, bulkUpdateFiPostUpdatePreviewData.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.resultWithAgreements, bulkUpdateFiPostUpdatePreviewData.resultWithAgreements);
    }

    public final com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdatePreviewData copy(java.lang.String name2, com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiResultWithAgreements resultWithAgreements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultWithAgreements, "");
        return new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdatePreviewData(name2, resultWithAgreements);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiResultWithAgreements getResultWithAgreements() {
        return this.resultWithAgreements;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdatePreviewData copy$default(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdatePreviewData bulkUpdateFiPostUpdatePreviewData, java.lang.String str, com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiResultWithAgreements bulkUpdateFiResultWithAgreements, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = bulkUpdateFiPostUpdatePreviewData.name;
        }
        if ((i & 2) != 0) {
            bulkUpdateFiResultWithAgreements = bulkUpdateFiPostUpdatePreviewData.resultWithAgreements;
        }
        return bulkUpdateFiPostUpdatePreviewData.copy(str, bulkUpdateFiResultWithAgreements);
    }
}
