package com.paypal.oslo.feature.bnplservicing.ui.autopay;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "ShowAutopayUpdatedHalfSheet", "ShowErrorHalfSheet", "DismissAutopayOffHalfSheet", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayUiEffect$DismissAutopayOffHalfSheet;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayUiEffect$ShowAutopayUpdatedHalfSheet;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayUiEffect$ShowErrorHalfSheet;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class UpdateAutopayUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayUiEffect$ShowAutopayUpdatedHalfSheet;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayUiEffect;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayUpdatedModel;", "model", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayUpdatedModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayUpdatedModel;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayUpdatedModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayUiEffect$ShowAutopayUpdatedHalfSheet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayUpdatedModel;", "getModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowAutopayUpdatedHalfSheet extends com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayUpdatedModel model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowAutopayUpdatedHalfSheet(com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayUpdatedModel autopayUpdatedModel) {
            super("ShowAutopayUpdatedHalfSheet", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autopayUpdatedModel, "");
            this.model = autopayUpdatedModel;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayUpdatedModel getModel() {
            return this.model;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayUpdatedModel autopayUpdatedModel = this.model;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowAutopayUpdatedHalfSheet(model=");
            sb.append(autopayUpdatedModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.model.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect.ShowAutopayUpdatedHalfSheet) && kotlin.jvm.internal.Intrinsics.areEqual(this.model, ((com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect.ShowAutopayUpdatedHalfSheet) other).model);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect.ShowAutopayUpdatedHalfSheet copy(com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayUpdatedModel model) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect.ShowAutopayUpdatedHalfSheet(model);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayUpdatedModel getModel() {
            return this.model;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect.ShowAutopayUpdatedHalfSheet copy$default(com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect.ShowAutopayUpdatedHalfSheet showAutopayUpdatedHalfSheet, com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayUpdatedModel autopayUpdatedModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                autopayUpdatedModel = showAutopayUpdatedHalfSheet.model;
            }
            return showAutopayUpdatedHalfSheet.copy(autopayUpdatedModel);
        }
    }

    private UpdateAutopayUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayUiEffect$ShowErrorHalfSheet;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayUiEffect;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayUiEffect$ShowErrorHalfSheet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowErrorHalfSheet extends com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect {
        public static final int $stable = 0;
        private final java.lang.String correlationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowErrorHalfSheet(java.lang.String str) {
            super("ShowErrorHalfSheet", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.correlationId = str;
        }

        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowErrorHalfSheet(correlationId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.correlationId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect.ShowErrorHalfSheet) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect.ShowErrorHalfSheet) other).correlationId);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect.ShowErrorHalfSheet copy(java.lang.String correlationId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(correlationId, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect.ShowErrorHalfSheet(correlationId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect.ShowErrorHalfSheet copy$default(com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect.ShowErrorHalfSheet showErrorHalfSheet, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showErrorHalfSheet.correlationId;
            }
            return showErrorHalfSheet.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayUiEffect$DismissAutopayOffHalfSheet;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayUiEffect;", "", "autopayStatusUpdated", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayUiEffect$DismissAutopayOffHalfSheet;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getAutopayStatusUpdated"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissAutopayOffHalfSheet extends com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect {
        public static final int $stable = 0;
        private final boolean autopayStatusUpdated;

        public DismissAutopayOffHalfSheet(boolean z) {
            super("DismissAutopayOffHalfSheet", null);
            this.autopayStatusUpdated = z;
        }

        public final boolean getAutopayStatusUpdated() {
            return this.autopayStatusUpdated;
        }

        public final java.lang.String toString() {
            boolean z = this.autopayStatusUpdated;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DismissAutopayOffHalfSheet(autopayStatusUpdated=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.autopayStatusUpdated);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect.DismissAutopayOffHalfSheet) && this.autopayStatusUpdated == ((com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect.DismissAutopayOffHalfSheet) other).autopayStatusUpdated;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect.DismissAutopayOffHalfSheet copy(boolean autopayStatusUpdated) {
            return new com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect.DismissAutopayOffHalfSheet(autopayStatusUpdated);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getAutopayStatusUpdated() {
            return this.autopayStatusUpdated;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect.DismissAutopayOffHalfSheet copy$default(com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect.DismissAutopayOffHalfSheet dismissAutopayOffHalfSheet, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = dismissAutopayOffHalfSheet.autopayStatusUpdated;
            }
            return dismissAutopayOffHalfSheet.copy(z);
        }
    }

    public /* synthetic */ UpdateAutopayUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
