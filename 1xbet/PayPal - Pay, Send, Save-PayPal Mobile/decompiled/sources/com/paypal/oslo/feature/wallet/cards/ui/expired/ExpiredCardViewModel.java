package com.paypal.oslo.feature.wallet.cards.ui.expired;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0006H&¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H&¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/expired/ExpiredCardViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "onExpiryDateChanged", "(Ljava/lang/String;)V", "onCvvChanged", "", "isFocused", "onExpiryDateFocusChanged", "(Z)V", "onCvvFocusChanged", "onSubmit", "onReset", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardBrand;", "cardBrand", "initialize", "(Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardBrand;)V", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/wallet/cards/ui/expired/ExpiredCardViewModel$UiState;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "UiState"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class ExpiredCardViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    public abstract kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState> getUiState();

    public abstract void initialize(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand);

    public abstract void onCvvChanged(java.lang.String value);

    public abstract void onCvvFocusChanged(boolean isFocused);

    public abstract void onExpiryDateChanged(java.lang.String value);

    public abstract void onExpiryDateFocusChanged(boolean isFocused);

    public abstract void onReset();

    public abstract void onSubmit();

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015JZ\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b%\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b\t\u0010\u0015R\u001a\u0010\n\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b\n\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b\u000b\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/expired/ExpiredCardViewModel$UiState;", "", "", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.ExpiryDate, "", "cvvError", "expiryDateError", "", "isLoading", "isSuccess", "isLoadingDefinitions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZZ)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "component5", "()Z", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZZ)Lcom/paypal/oslo/feature/wallet/cards/ui/expired/ExpiredCardViewModel$UiState;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCvv", "getExpiryDate", "Ljava/lang/Integer;", "getCvvError", "getExpiryDateError", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UiState {
        public static final int $stable = 0;
        private final java.lang.String cvv;
        private final java.lang.Integer cvvError;
        private final java.lang.String expiryDate;
        private final java.lang.Integer expiryDateError;
        private final boolean isLoading;
        private final boolean isLoadingDefinitions;
        private final boolean isSuccess;

        public UiState(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, boolean z, boolean z2, boolean z3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.cvv = str;
            this.expiryDate = str2;
            this.cvvError = num;
            this.expiryDateError = num2;
            this.isLoading = z;
            this.isSuccess = z2;
            this.isLoadingDefinitions = z3;
        }

        public /* synthetic */ UiState(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, boolean z, boolean z2, boolean z3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3);
        }

        public final java.lang.String getCvv() {
            return this.cvv;
        }

        public final java.lang.String getExpiryDate() {
            return this.expiryDate;
        }

        public final java.lang.Integer getCvvError() {
            return this.cvvError;
        }

        public final java.lang.Integer getExpiryDateError() {
            return this.expiryDateError;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final boolean isSuccess() {
            return this.isSuccess;
        }

        public final boolean isLoadingDefinitions() {
            return this.isLoadingDefinitions;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cvv;
            java.lang.String str2 = this.expiryDate;
            java.lang.Integer num = this.cvvError;
            java.lang.Integer num2 = this.expiryDateError;
            boolean z = this.isLoading;
            boolean z2 = this.isSuccess;
            boolean z3 = this.isLoadingDefinitions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UiState(cvv=");
            sb.append(str);
            sb.append(", expiryDate=");
            sb.append(str2);
            sb.append(", cvvError=");
            sb.append(num);
            sb.append(", expiryDateError=");
            sb.append(num2);
            sb.append(", isLoading=");
            sb.append(z);
            sb.append(", isSuccess=");
            sb.append(z2);
            sb.append(", isLoadingDefinitions=");
            sb.append(z3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.cvv.hashCode();
            int hashCode2 = this.expiryDate.hashCode();
            java.lang.Integer num = this.cvvError;
            int hashCode3 = num == null ? 0 : num.hashCode();
            java.lang.Integer num2 = this.expiryDateError;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isLoading)) * 31) + java.lang.Boolean.hashCode(this.isSuccess)) * 31) + java.lang.Boolean.hashCode(this.isLoadingDefinitions);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState uiState = (com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cvv, uiState.cvv) && kotlin.jvm.internal.Intrinsics.areEqual(this.expiryDate, uiState.expiryDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.cvvError, uiState.cvvError) && kotlin.jvm.internal.Intrinsics.areEqual(this.expiryDateError, uiState.expiryDateError) && this.isLoading == uiState.isLoading && this.isSuccess == uiState.isSuccess && this.isLoadingDefinitions == uiState.isLoadingDefinitions;
        }

        public final com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState copy(java.lang.String cvv, java.lang.String expiryDate, java.lang.Integer cvvError, java.lang.Integer expiryDateError, boolean isLoading, boolean isSuccess, boolean isLoadingDefinitions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvv, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expiryDate, "");
            return new com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState(cvv, expiryDate, cvvError, expiryDateError, isLoading, isSuccess, isLoadingDefinitions);
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsLoadingDefinitions() {
            return this.isLoadingDefinitions;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsSuccess() {
            return this.isSuccess;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Integer getExpiryDateError() {
            return this.expiryDateError;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Integer getCvvError() {
            return this.cvvError;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getExpiryDate() {
            return this.expiryDate;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCvv() {
            return this.cvv;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState copy$default(com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState uiState, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = uiState.cvv;
            }
            if ((i & 2) != 0) {
                str2 = uiState.expiryDate;
            }
            java.lang.String str3 = str2;
            if ((i & 4) != 0) {
                num = uiState.cvvError;
            }
            java.lang.Integer num3 = num;
            if ((i & 8) != 0) {
                num2 = uiState.expiryDateError;
            }
            java.lang.Integer num4 = num2;
            if ((i & 16) != 0) {
                z = uiState.isLoading;
            }
            boolean z4 = z;
            if ((i & 32) != 0) {
                z2 = uiState.isSuccess;
            }
            boolean z5 = z2;
            if ((i & 64) != 0) {
                z3 = uiState.isLoadingDefinitions;
            }
            return uiState.copy(str, str3, num3, num4, z4, z5, z3);
        }

        public UiState() {
            this(null, null, null, null, false, false, false, 127, null);
        }
    }
}
