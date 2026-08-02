package com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "Content", "Error", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantUiState$Content;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantUiState$Error;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantUiState$Initial;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class PpwMerchantUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantUiState$Initial;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState.Initial INSTANCE = new com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState.Initial();

        public final int hashCode() {
            return 1796158686;
        }

        private Initial() {
            super("PpwMerchantUiState.Initial", null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState.Initial)) {
                return false;
            }
            return true;
        }
    }

    private PpwMerchantUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantUiState$Content;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantUiState;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantUiModel;", "copy", "(Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantUiModel;)Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantUiState$Content;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Content extends com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiModel ppwMerchantUiModel) {
            super("PpwMerchantUiState.Content", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ppwMerchantUiModel, "");
            this.uiModel = ppwMerchantUiModel;
        }

        public final com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiModel ppwMerchantUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Content(uiModel=");
            sb.append(ppwMerchantUiModel);
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
            return (other instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState.Content) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState.Content) other).uiModel);
        }

        public final com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState.Content copy(com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState.Content(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState.Content copy$default(com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState.Content content, com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiModel ppwMerchantUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                ppwMerchantUiModel = content.uiModel;
            }
            return content.copy(ppwMerchantUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantUiState$Error;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantUiState;", "", "titleRes", "descriptionRes", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getTitleRes", "getDescriptionRes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState {
        public static final int $stable = 0;
        private final int descriptionRes;
        private final int titleRes;

        public Error(int i, int i2) {
            super("PpwMerchantUiState.Error", null);
            this.titleRes = i;
            this.descriptionRes = i2;
        }

        public final int getTitleRes() {
            return this.titleRes;
        }

        public final int getDescriptionRes() {
            return this.descriptionRes;
        }

        public final java.lang.String toString() {
            int i = this.titleRes;
            int i2 = this.descriptionRes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(titleRes=");
            sb.append(i);
            sb.append(", descriptionRes=");
            sb.append(i2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Integer.hashCode(this.titleRes) * 31) + java.lang.Integer.hashCode(this.descriptionRes);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState.Error error = (com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState.Error) other;
            return this.titleRes == error.titleRes && this.descriptionRes == error.descriptionRes;
        }

        public final com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState.Error copy(int titleRes, int descriptionRes) {
            return new com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState.Error(titleRes, descriptionRes);
        }

        /* renamed from: component2, reason: from getter */
        public final int getDescriptionRes() {
            return this.descriptionRes;
        }

        /* renamed from: component1, reason: from getter */
        public final int getTitleRes() {
            return this.titleRes;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState.Error copy$default(com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState.Error error, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = error.titleRes;
            }
            if ((i3 & 2) != 0) {
                i2 = error.descriptionRes;
            }
            return error.copy(i, i2);
        }
    }

    public /* synthetic */ PpwMerchantUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
