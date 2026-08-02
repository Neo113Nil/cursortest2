package com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0001\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0001\u000b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Content", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountUiState$Content;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class PpwEnterAmountUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountUiState$Content;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountUiState;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountUiModel;", "copy", "(Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountUiModel;)Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountUiState$Content;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Content extends com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiModel ppwEnterAmountUiModel) {
            super("PpwEnterAmountUiState.Content", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ppwEnterAmountUiModel, "");
            this.uiModel = ppwEnterAmountUiModel;
        }

        public final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiModel ppwEnterAmountUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Content(uiModel=");
            sb.append(ppwEnterAmountUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.uiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiState.Content) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiState.Content) other).uiModel);
        }

        public final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiState.Content copy(com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiState.Content(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiState.Content copy$default(com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiState.Content content, com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiModel ppwEnterAmountUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                ppwEnterAmountUiModel = content.uiModel;
            }
            return content.copy(ppwEnterAmountUiModel);
        }
    }

    private PpwEnterAmountUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    public /* synthetic */ PpwEnterAmountUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
