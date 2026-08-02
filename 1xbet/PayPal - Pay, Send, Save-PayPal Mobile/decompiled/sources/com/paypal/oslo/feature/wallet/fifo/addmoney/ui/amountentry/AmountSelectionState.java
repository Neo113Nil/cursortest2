package com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/amountentry/AmountSelectionState;", "", "<init>", "()V", "Loading", "Loaded", "Error", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/amountentry/AmountSelectionState$Error;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/amountentry/AmountSelectionState$Loaded;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/amountentry/AmountSelectionState$Loading;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class AmountSelectionState {
    public static final int $stable = 0;

    private AmountSelectionState() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/amountentry/AmountSelectionState$Loading;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/amountentry/AmountSelectionState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Loading INSTANCE = new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Loading();

        public final int hashCode() {
            return 1174020936;
        }

        private Loading() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J@\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b!\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/amountentry/AmountSelectionState$Loaded;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/amountentry/AmountSelectionState;", "", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/amountentry/model/AmountOptionItem;", "amountList", "", "selectedAmount", "currencyCode", "", "amountValidationError", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/lang/Integer;", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/amountentry/AmountSelectionState$Loaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/util/List;", "getAmountList", "Ljava/lang/String;", "getSelectedAmount", "getCurrencyCode", "Ljava/lang/Integer;", "getAmountValidationError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loaded extends com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem> amountList;
        private final java.lang.Integer amountValidationError;
        private final java.lang.String currencyCode;
        private final java.lang.String selectedAmount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem> list, java.lang.String str, java.lang.String str2, java.lang.Integer num) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.amountList = list;
            this.selectedAmount = str;
            this.currencyCode = str2;
            this.amountValidationError = num;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem> getAmountList() {
            return this.amountList;
        }

        public /* synthetic */ Loaded(java.util.List list, java.lang.String str, java.lang.String str2, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? "0" : str, (i & 4) != 0 ? "USD" : str2, (i & 8) != 0 ? null : num);
        }

        public final java.lang.String getSelectedAmount() {
            return this.selectedAmount;
        }

        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.Integer getAmountValidationError() {
            return this.amountValidationError;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem> list = this.amountList;
            java.lang.String str = this.selectedAmount;
            java.lang.String str2 = this.currencyCode;
            java.lang.Integer num = this.amountValidationError;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loaded(amountList=");
            sb.append(list);
            sb.append(", selectedAmount=");
            sb.append(str);
            sb.append(", currencyCode=");
            sb.append(str2);
            sb.append(", amountValidationError=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.amountList.hashCode();
            int hashCode2 = this.selectedAmount.hashCode();
            int hashCode3 = this.currencyCode.hashCode();
            java.lang.Integer num = this.amountValidationError;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (num == null ? 0 : num.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Loaded)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Loaded loaded = (com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Loaded) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amountList, loaded.amountList) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedAmount, loaded.selectedAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, loaded.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountValidationError, loaded.amountValidationError);
        }

        public final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Loaded copy(java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem> amountList, java.lang.String selectedAmount, java.lang.String currencyCode, java.lang.Integer amountValidationError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountList, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            return new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Loaded(amountList, selectedAmount, currencyCode, amountValidationError);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Integer getAmountValidationError() {
            return this.amountValidationError;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSelectedAmount() {
            return this.selectedAmount;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem> component1() {
            return this.amountList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Loaded copy$default(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Loaded loaded, java.util.List list, java.lang.String str, java.lang.String str2, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = loaded.amountList;
            }
            if ((i & 2) != 0) {
                str = loaded.selectedAmount;
            }
            if ((i & 4) != 0) {
                str2 = loaded.currencyCode;
            }
            if ((i & 8) != 0) {
                num = loaded.amountValidationError;
            }
            return loaded.copy(list, str, str2, num);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/amountentry/AmountSelectionState$Error;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/amountentry/AmountSelectionState;", "Lcom/paypal/oslo/feature/wallet/common/ui/UiText;", "errorMessage", "errorDesc", "", "errorCode", "<init>", "(Lcom/paypal/oslo/feature/wallet/common/ui/UiText;Lcom/paypal/oslo/feature/wallet/common/ui/UiText;Ljava/lang/Integer;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/common/ui/UiText;", "component2", "component3", "()Ljava/lang/Integer;", "copy", "(Lcom/paypal/oslo/feature/wallet/common/ui/UiText;Lcom/paypal/oslo/feature/wallet/common/ui/UiText;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/amountentry/AmountSelectionState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/common/ui/UiText;", "getErrorMessage", "getErrorDesc", "Ljava/lang/Integer;", "getErrorCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState {
        public static final int $stable = 0;
        private final java.lang.Integer errorCode;
        private final com.paypal.oslo.feature.wallet.common.ui.UiText errorDesc;
        private final com.paypal.oslo.feature.wallet.common.ui.UiText errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.wallet.common.ui.UiText uiText, com.paypal.oslo.feature.wallet.common.ui.UiText uiText2, java.lang.Integer num) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiText2, "");
            this.errorMessage = uiText;
            this.errorDesc = uiText2;
            this.errorCode = num;
        }

        public /* synthetic */ Error(com.paypal.oslo.feature.wallet.common.ui.UiText uiText, com.paypal.oslo.feature.wallet.common.ui.UiText uiText2, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(uiText, uiText2, (i & 4) != 0 ? null : num);
        }

        public final com.paypal.oslo.feature.wallet.common.ui.UiText getErrorMessage() {
            return this.errorMessage;
        }

        public final com.paypal.oslo.feature.wallet.common.ui.UiText getErrorDesc() {
            return this.errorDesc;
        }

        public final java.lang.Integer getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.common.ui.UiText uiText = this.errorMessage;
            com.paypal.oslo.feature.wallet.common.ui.UiText uiText2 = this.errorDesc;
            java.lang.Integer num = this.errorCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorMessage=");
            sb.append(uiText);
            sb.append(", errorDesc=");
            sb.append(uiText2);
            sb.append(", errorCode=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.errorMessage.hashCode();
            int hashCode2 = this.errorDesc.hashCode();
            java.lang.Integer num = this.errorCode;
            return (((hashCode * 31) + hashCode2) * 31) + (num == null ? 0 : num.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Error error = (com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, error.errorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDesc, error.errorDesc) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, error.errorCode);
        }

        public final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Error copy(com.paypal.oslo.feature.wallet.common.ui.UiText errorMessage, com.paypal.oslo.feature.wallet.common.ui.UiText errorDesc, java.lang.Integer errorCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDesc, "");
            return new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Error(errorMessage, errorDesc, errorCode);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Integer getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.common.ui.UiText getErrorDesc() {
            return this.errorDesc;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.common.ui.UiText getErrorMessage() {
            return this.errorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Error copy$default(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Error error, com.paypal.oslo.feature.wallet.common.ui.UiText uiText, com.paypal.oslo.feature.wallet.common.ui.UiText uiText2, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uiText = error.errorMessage;
            }
            if ((i & 2) != 0) {
                uiText2 = error.errorDesc;
            }
            if ((i & 4) != 0) {
                num = error.errorCode;
            }
            return error.copy(uiText, uiText2, num);
        }
    }

    public /* synthetic */ AmountSelectionState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
