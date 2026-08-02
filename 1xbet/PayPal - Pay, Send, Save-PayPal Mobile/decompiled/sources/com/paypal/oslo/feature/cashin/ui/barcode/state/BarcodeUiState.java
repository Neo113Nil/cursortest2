package com.paypal.oslo.feature.cashin.ui.barcode.state;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/cashin/ui/barcode/state/BarcodeUiState;", "", "<init>", "()V", "Loading", "Error", "Success", "Lcom/paypal/oslo/feature/cashin/ui/barcode/state/BarcodeUiState$Error;", "Lcom/paypal/oslo/feature/cashin/ui/barcode/state/BarcodeUiState$Loading;", "Lcom/paypal/oslo/feature/cashin/ui/barcode/state/BarcodeUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class BarcodeUiState {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cashin/ui/barcode/state/BarcodeUiState$Loading;", "Lcom/paypal/oslo/feature/cashin/ui/barcode/state/BarcodeUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeUiState.Loading INSTANCE = new com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeUiState.Loading();

        public final int hashCode() {
            return -1897906709;
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
            if (!(other instanceof com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    private BarcodeUiState() {
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cashin/ui/barcode/state/BarcodeUiState$Error;", "Lcom/paypal/oslo/feature/cashin/ui/barcode/state/BarcodeUiState;", "", "message", "", "attemptNumber", "<init>", "(Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/paypal/oslo/feature/cashin/ui/barcode/state/BarcodeUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getMessage", com.visa.cbp.getEncExpo.warmup, "getAttemptNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeUiState {
        public static final int $stable = 0;
        private final int attemptNumber;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str, int i) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.attemptNumber = i;
        }

        public /* synthetic */ Error(java.lang.String str, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? 0 : i);
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final int getAttemptNumber() {
            return this.attemptNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            int i = this.attemptNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(message=");
            sb.append(str);
            sb.append(", attemptNumber=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.message.hashCode() * 31) + java.lang.Integer.hashCode(this.attemptNumber);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeUiState.Error error = (com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeUiState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, error.message) && this.attemptNumber == error.attemptNumber;
        }

        public final com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeUiState.Error copy(java.lang.String message, int attemptNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeUiState.Error(message, attemptNumber);
        }

        /* renamed from: component2, reason: from getter */
        public final int getAttemptNumber() {
            return this.attemptNumber;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeUiState.Error copy$default(com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeUiState.Error error, java.lang.String str, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = error.message;
            }
            if ((i2 & 2) != 0) {
                i = error.attemptNumber;
            }
            return error.copy(str, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0010\u0010#\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b)\u0010$J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u0019J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u0019J¶\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\r2\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b9\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b:\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b;\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b<\u0010\u0019R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b=\u0010\u0019R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b>\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b?\u0010\u0019R\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b@\u0010\u0019R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\b\u000e\u0010$R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010B\u001a\u0004\bC\u0010&R\u001a\u0010\u0012\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010D\u001a\u0004\bE\u0010(R\u001a\u0010\u0013\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010A\u001a\u0004\bF\u0010$R\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\bG\u0010\u0019R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00106\u001a\u0004\bH\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/cashin/ui/barcode/state/BarcodeUiState$Success;", "Lcom/paypal/oslo/feature/cashin/ui/barcode/state/BarcodeUiState;", "", "storeLogoUrl", "storeName", "feeText", "barcodeNumber", "expiresAtText", "transactionTimeDelay", "minLimitPerTransaction", "maxLimitPerTransaction", "transactionMinLimitPerDay", "transactionMaxLimitPerMonth", "", "isBarcodeUnavailable", "Landroidx/compose/ui/graphics/ImageBitmap;", "barcodeBitmap", "Lcom/paypal/oslo/feature/cashin/ui/barcode/state/BarcodeDisplayMode;", "displayMode", "showDebitCardWidget", "bundleEligibilityStatus", "debitCardImageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/graphics/ImageBitmap;Lcom/paypal/oslo/feature/cashin/ui/barcode/state/BarcodeDisplayMode;ZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "()Z", "component12", "()Landroidx/compose/ui/graphics/ImageBitmap;", "component13", "()Lcom/paypal/oslo/feature/cashin/ui/barcode/state/BarcodeDisplayMode;", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/graphics/ImageBitmap;Lcom/paypal/oslo/feature/cashin/ui/barcode/state/BarcodeDisplayMode;ZLjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/cashin/ui/barcode/state/BarcodeUiState$Success;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getStoreLogoUrl", "getStoreName", "getFeeText", "getBarcodeNumber", "getExpiresAtText", "getTransactionTimeDelay", "getMinLimitPerTransaction", "getMaxLimitPerTransaction", "getTransactionMinLimitPerDay", "getTransactionMaxLimitPerMonth", "Z", "Landroidx/compose/ui/graphics/ImageBitmap;", "getBarcodeBitmap", "Lcom/paypal/oslo/feature/cashin/ui/barcode/state/BarcodeDisplayMode;", "getDisplayMode", "getShowDebitCardWidget", "getBundleEligibilityStatus", "getDebitCardImageUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeUiState {
        public static final int $stable = 8;
        private final androidx.compose.ui.graphics.ImageBitmap barcodeBitmap;
        private final java.lang.String barcodeNumber;
        private final java.lang.String bundleEligibilityStatus;
        private final java.lang.String debitCardImageUrl;
        private final com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeDisplayMode displayMode;
        private final java.lang.String expiresAtText;
        private final java.lang.String feeText;
        private final boolean isBarcodeUnavailable;
        private final java.lang.String maxLimitPerTransaction;
        private final java.lang.String minLimitPerTransaction;
        private final boolean showDebitCardWidget;
        private final java.lang.String storeLogoUrl;
        private final java.lang.String storeName;
        private final java.lang.String transactionMaxLimitPerMonth;
        private final java.lang.String transactionMinLimitPerDay;
        private final java.lang.String transactionTimeDelay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, boolean z, androidx.compose.ui.graphics.ImageBitmap imageBitmap, com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeDisplayMode barcodeDisplayMode, boolean z2, java.lang.String str11, java.lang.String str12) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str9, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str10, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barcodeDisplayMode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str11, "");
            this.storeLogoUrl = str;
            this.storeName = str2;
            this.feeText = str3;
            this.barcodeNumber = str4;
            this.expiresAtText = str5;
            this.transactionTimeDelay = str6;
            this.minLimitPerTransaction = str7;
            this.maxLimitPerTransaction = str8;
            this.transactionMinLimitPerDay = str9;
            this.transactionMaxLimitPerMonth = str10;
            this.isBarcodeUnavailable = z;
            this.barcodeBitmap = imageBitmap;
            this.displayMode = barcodeDisplayMode;
            this.showDebitCardWidget = z2;
            this.bundleEligibilityStatus = str11;
            this.debitCardImageUrl = str12;
        }

        public final java.lang.String getStoreLogoUrl() {
            return this.storeLogoUrl;
        }

        public final java.lang.String getStoreName() {
            return this.storeName;
        }

        public final java.lang.String getFeeText() {
            return this.feeText;
        }

        public final java.lang.String getBarcodeNumber() {
            return this.barcodeNumber;
        }

        public final java.lang.String getExpiresAtText() {
            return this.expiresAtText;
        }

        public final java.lang.String getTransactionTimeDelay() {
            return this.transactionTimeDelay;
        }

        public final java.lang.String getMinLimitPerTransaction() {
            return this.minLimitPerTransaction;
        }

        public final java.lang.String getMaxLimitPerTransaction() {
            return this.maxLimitPerTransaction;
        }

        public final java.lang.String getTransactionMinLimitPerDay() {
            return this.transactionMinLimitPerDay;
        }

        public final java.lang.String getTransactionMaxLimitPerMonth() {
            return this.transactionMaxLimitPerMonth;
        }

        public final boolean isBarcodeUnavailable() {
            return this.isBarcodeUnavailable;
        }

        public final androidx.compose.ui.graphics.ImageBitmap getBarcodeBitmap() {
            return this.barcodeBitmap;
        }

        public /* synthetic */ Success(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, boolean z, androidx.compose.ui.graphics.ImageBitmap imageBitmap, com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeDisplayMode barcodeDisplayMode, boolean z2, java.lang.String str11, java.lang.String str12, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? null : imageBitmap, (i & 4096) != 0 ? com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeDisplayMode.BarcodeAndSwipe.INSTANCE : barcodeDisplayMode, (i & 8192) != 0 ? false : z2, (i & 16384) != 0 ? "" : str11, (i & 32768) != 0 ? null : str12);
        }

        public final com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeDisplayMode getDisplayMode() {
            return this.displayMode;
        }

        public final boolean getShowDebitCardWidget() {
            return this.showDebitCardWidget;
        }

        public final java.lang.String getBundleEligibilityStatus() {
            return this.bundleEligibilityStatus;
        }

        public final java.lang.String getDebitCardImageUrl() {
            return this.debitCardImageUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.storeLogoUrl;
            java.lang.String str2 = this.storeName;
            java.lang.String str3 = this.feeText;
            java.lang.String str4 = this.barcodeNumber;
            java.lang.String str5 = this.expiresAtText;
            java.lang.String str6 = this.transactionTimeDelay;
            java.lang.String str7 = this.minLimitPerTransaction;
            java.lang.String str8 = this.maxLimitPerTransaction;
            java.lang.String str9 = this.transactionMinLimitPerDay;
            java.lang.String str10 = this.transactionMaxLimitPerMonth;
            boolean z = this.isBarcodeUnavailable;
            androidx.compose.ui.graphics.ImageBitmap imageBitmap = this.barcodeBitmap;
            com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeDisplayMode barcodeDisplayMode = this.displayMode;
            boolean z2 = this.showDebitCardWidget;
            java.lang.String str11 = this.bundleEligibilityStatus;
            java.lang.String str12 = this.debitCardImageUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(storeLogoUrl=");
            sb.append(str);
            sb.append(", storeName=");
            sb.append(str2);
            sb.append(", feeText=");
            sb.append(str3);
            sb.append(", barcodeNumber=");
            sb.append(str4);
            sb.append(", expiresAtText=");
            sb.append(str5);
            sb.append(", transactionTimeDelay=");
            sb.append(str6);
            sb.append(", minLimitPerTransaction=");
            sb.append(str7);
            sb.append(", maxLimitPerTransaction=");
            sb.append(str8);
            sb.append(", transactionMinLimitPerDay=");
            sb.append(str9);
            sb.append(", transactionMaxLimitPerMonth=");
            sb.append(str10);
            sb.append(", isBarcodeUnavailable=");
            sb.append(z);
            sb.append(", barcodeBitmap=");
            sb.append(imageBitmap);
            sb.append(", displayMode=");
            sb.append(barcodeDisplayMode);
            sb.append(", showDebitCardWidget=");
            sb.append(z2);
            sb.append(", bundleEligibilityStatus=");
            sb.append(str11);
            sb.append(", debitCardImageUrl=");
            sb.append(str12);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.storeLogoUrl;
            int hashCode = str == null ? 0 : str.hashCode();
            int hashCode2 = this.storeName.hashCode();
            int hashCode3 = this.feeText.hashCode();
            int hashCode4 = this.barcodeNumber.hashCode();
            int hashCode5 = this.expiresAtText.hashCode();
            int hashCode6 = this.transactionTimeDelay.hashCode();
            int hashCode7 = this.minLimitPerTransaction.hashCode();
            int hashCode8 = this.maxLimitPerTransaction.hashCode();
            int hashCode9 = this.transactionMinLimitPerDay.hashCode();
            int hashCode10 = this.transactionMaxLimitPerMonth.hashCode();
            int hashCode11 = java.lang.Boolean.hashCode(this.isBarcodeUnavailable);
            androidx.compose.ui.graphics.ImageBitmap imageBitmap = this.barcodeBitmap;
            int hashCode12 = imageBitmap == null ? 0 : imageBitmap.hashCode();
            int hashCode13 = this.displayMode.hashCode();
            int hashCode14 = java.lang.Boolean.hashCode(this.showDebitCardWidget);
            int hashCode15 = this.bundleEligibilityStatus.hashCode();
            java.lang.String str2 = this.debitCardImageUrl;
            return (((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeUiState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeUiState.Success success = (com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeUiState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.storeLogoUrl, success.storeLogoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.storeName, success.storeName) && kotlin.jvm.internal.Intrinsics.areEqual(this.feeText, success.feeText) && kotlin.jvm.internal.Intrinsics.areEqual(this.barcodeNumber, success.barcodeNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.expiresAtText, success.expiresAtText) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionTimeDelay, success.transactionTimeDelay) && kotlin.jvm.internal.Intrinsics.areEqual(this.minLimitPerTransaction, success.minLimitPerTransaction) && kotlin.jvm.internal.Intrinsics.areEqual(this.maxLimitPerTransaction, success.maxLimitPerTransaction) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionMinLimitPerDay, success.transactionMinLimitPerDay) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionMaxLimitPerMonth, success.transactionMaxLimitPerMonth) && this.isBarcodeUnavailable == success.isBarcodeUnavailable && kotlin.jvm.internal.Intrinsics.areEqual(this.barcodeBitmap, success.barcodeBitmap) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayMode, success.displayMode) && this.showDebitCardWidget == success.showDebitCardWidget && kotlin.jvm.internal.Intrinsics.areEqual(this.bundleEligibilityStatus, success.bundleEligibilityStatus) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitCardImageUrl, success.debitCardImageUrl);
        }

        public final com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeUiState.Success copy(java.lang.String storeLogoUrl, java.lang.String storeName, java.lang.String feeText, java.lang.String barcodeNumber, java.lang.String expiresAtText, java.lang.String transactionTimeDelay, java.lang.String minLimitPerTransaction, java.lang.String maxLimitPerTransaction, java.lang.String transactionMinLimitPerDay, java.lang.String transactionMaxLimitPerMonth, boolean isBarcodeUnavailable, androidx.compose.ui.graphics.ImageBitmap barcodeBitmap, com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeDisplayMode displayMode, boolean showDebitCardWidget, java.lang.String bundleEligibilityStatus, java.lang.String debitCardImageUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storeName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feeText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barcodeNumber, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expiresAtText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionTimeDelay, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minLimitPerTransaction, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxLimitPerTransaction, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionMinLimitPerDay, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionMaxLimitPerMonth, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayMode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundleEligibilityStatus, "");
            return new com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeUiState.Success(storeLogoUrl, storeName, feeText, barcodeNumber, expiresAtText, transactionTimeDelay, minLimitPerTransaction, maxLimitPerTransaction, transactionMinLimitPerDay, transactionMaxLimitPerMonth, isBarcodeUnavailable, barcodeBitmap, displayMode, showDebitCardWidget, bundleEligibilityStatus, debitCardImageUrl);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getTransactionMinLimitPerDay() {
            return this.transactionMinLimitPerDay;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getMaxLimitPerTransaction() {
            return this.maxLimitPerTransaction;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getMinLimitPerTransaction() {
            return this.minLimitPerTransaction;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getTransactionTimeDelay() {
            return this.transactionTimeDelay;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getExpiresAtText() {
            return this.expiresAtText;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getBarcodeNumber() {
            return this.barcodeNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getFeeText() {
            return this.feeText;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getStoreName() {
            return this.storeName;
        }

        /* renamed from: component16, reason: from getter */
        public final java.lang.String getDebitCardImageUrl() {
            return this.debitCardImageUrl;
        }

        /* renamed from: component15, reason: from getter */
        public final java.lang.String getBundleEligibilityStatus() {
            return this.bundleEligibilityStatus;
        }

        /* renamed from: component14, reason: from getter */
        public final boolean getShowDebitCardWidget() {
            return this.showDebitCardWidget;
        }

        /* renamed from: component13, reason: from getter */
        public final com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeDisplayMode getDisplayMode() {
            return this.displayMode;
        }

        /* renamed from: component12, reason: from getter */
        public final androidx.compose.ui.graphics.ImageBitmap getBarcodeBitmap() {
            return this.barcodeBitmap;
        }

        /* renamed from: component11, reason: from getter */
        public final boolean getIsBarcodeUnavailable() {
            return this.isBarcodeUnavailable;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.String getTransactionMaxLimitPerMonth() {
            return this.transactionMaxLimitPerMonth;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getStoreLogoUrl() {
            return this.storeLogoUrl;
        }
    }

    public /* synthetic */ BarcodeUiState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
