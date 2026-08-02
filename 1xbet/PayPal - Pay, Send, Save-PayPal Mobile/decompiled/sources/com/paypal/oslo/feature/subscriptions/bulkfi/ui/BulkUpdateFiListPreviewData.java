package com.paypal.oslo.feature.subscriptions.bulkfi.ui;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiListPreviewData;", "", "", "name", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiState$Success;", "state", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiState$Success;)V", "toString", "()Ljava/lang/String;", "component1", "component2", "()Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiState$Success;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiState$Success;)Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiListPreviewData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getName", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiState$Success;", "getState"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BulkUpdateFiListPreviewData {
    public static final int $stable = 8;
    private final java.lang.String name;
    private final com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Success state;

    public BulkUpdateFiListPreviewData(java.lang.String str, com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Success success) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(success, "");
        this.name = str;
        this.state = success;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Success getState() {
        return this.state;
    }

    public final java.lang.String toString() {
        return this.name;
    }

    public final int hashCode() {
        return (this.name.hashCode() * 31) + this.state.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiListPreviewData)) {
            return false;
        }
        com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiListPreviewData bulkUpdateFiListPreviewData = (com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiListPreviewData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, bulkUpdateFiListPreviewData.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.state, bulkUpdateFiListPreviewData.state);
    }

    public final com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiListPreviewData copy(java.lang.String name2, com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Success state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        return new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiListPreviewData(name2, state);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Success getState() {
        return this.state;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiListPreviewData copy$default(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiListPreviewData bulkUpdateFiListPreviewData, java.lang.String str, com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Success success, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = bulkUpdateFiListPreviewData.name;
        }
        if ((i & 2) != 0) {
            success = bulkUpdateFiListPreviewData.state;
        }
        return bulkUpdateFiListPreviewData.copy(str, success);
    }
}
