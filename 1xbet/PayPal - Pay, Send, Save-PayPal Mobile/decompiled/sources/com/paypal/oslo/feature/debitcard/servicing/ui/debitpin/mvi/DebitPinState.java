package com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Input", "Processing", "Success", "Error", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState$Error;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState$Input;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState$Processing;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DebitPinState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private DebitPinState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JF\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0012J\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b!\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState$Input;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState;", "", "pin", "confirmPin", "", "pinErrorResId", "confirmPinErrorResId", "retryCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "component5", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;I)Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState$Input;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getPin", "getConfirmPin", "Ljava/lang/Integer;", "getPinErrorResId", "getConfirmPinErrorResId", com.visa.cbp.getEncExpo.warmup, "getRetryCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Input extends com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState {
        public static final int $stable = 0;
        private final java.lang.String confirmPin;
        private final java.lang.Integer confirmPinErrorResId;
        private final java.lang.String pin;
        private final java.lang.Integer pinErrorResId;
        private final int retryCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Input(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, int i) {
            super("Input", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.pin = str;
            this.confirmPin = str2;
            this.pinErrorResId = num;
            this.confirmPinErrorResId = num2;
            this.retryCount = i;
        }

        public /* synthetic */ Input(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) == 0 ? str2 : "", (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : num2, (i2 & 16) != 0 ? 0 : i);
        }

        public final java.lang.String getPin() {
            return this.pin;
        }

        public final java.lang.String getConfirmPin() {
            return this.confirmPin;
        }

        public final java.lang.Integer getPinErrorResId() {
            return this.pinErrorResId;
        }

        public final java.lang.Integer getConfirmPinErrorResId() {
            return this.confirmPinErrorResId;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.pin;
            java.lang.String str2 = this.confirmPin;
            java.lang.Integer num = this.pinErrorResId;
            java.lang.Integer num2 = this.confirmPinErrorResId;
            int i = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Input(pin=");
            sb.append(str);
            sb.append(", confirmPin=");
            sb.append(str2);
            sb.append(", pinErrorResId=");
            sb.append(num);
            sb.append(", confirmPinErrorResId=");
            sb.append(num2);
            sb.append(", retryCount=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.pin.hashCode();
            int hashCode2 = this.confirmPin.hashCode();
            java.lang.Integer num = this.pinErrorResId;
            int hashCode3 = num == null ? 0 : num.hashCode();
            java.lang.Integer num2 = this.confirmPinErrorResId;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.retryCount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Input)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Input input = (com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Input) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.pin, input.pin) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmPin, input.confirmPin) && kotlin.jvm.internal.Intrinsics.areEqual(this.pinErrorResId, input.pinErrorResId) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmPinErrorResId, input.confirmPinErrorResId) && this.retryCount == input.retryCount;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Input copy(java.lang.String pin, java.lang.String confirmPin, java.lang.Integer pinErrorResId, java.lang.Integer confirmPinErrorResId, int retryCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pin, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmPin, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Input(pin, confirmPin, pinErrorResId, confirmPinErrorResId, retryCount);
        }

        /* renamed from: component5, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Integer getConfirmPinErrorResId() {
            return this.confirmPinErrorResId;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Integer getPinErrorResId() {
            return this.pinErrorResId;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getConfirmPin() {
            return this.confirmPin;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPin() {
            return this.pin;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Input copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Input input, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = input.pin;
            }
            if ((i2 & 2) != 0) {
                str2 = input.confirmPin;
            }
            java.lang.String str3 = str2;
            if ((i2 & 4) != 0) {
                num = input.pinErrorResId;
            }
            java.lang.Integer num3 = num;
            if ((i2 & 8) != 0) {
                num2 = input.confirmPinErrorResId;
            }
            java.lang.Integer num4 = num2;
            if ((i2 & 16) != 0) {
                i = input.retryCount;
            }
            return input.copy(str, str3, num3, num4, i);
        }

        public Input() {
            this(null, null, null, null, 0, 31, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState$Processing;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState;", "", "pin", "confirmPin", "", "retryCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;I)Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState$Processing;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getPin", "getConfirmPin", com.visa.cbp.getEncExpo.warmup, "getRetryCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Processing extends com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState {
        public static final int $stable = 0;
        private final java.lang.String confirmPin;
        private final java.lang.String pin;
        private final int retryCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Processing(java.lang.String str, java.lang.String str2, int i) {
            super("Processing", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.pin = str;
            this.confirmPin = str2;
            this.retryCount = i;
        }

        public /* synthetic */ Processing(java.lang.String str, java.lang.String str2, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i2 & 4) != 0 ? 0 : i);
        }

        public final java.lang.String getPin() {
            return this.pin;
        }

        public final java.lang.String getConfirmPin() {
            return this.confirmPin;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.pin;
            java.lang.String str2 = this.confirmPin;
            int i = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Processing(pin=");
            sb.append(str);
            sb.append(", confirmPin=");
            sb.append(str2);
            sb.append(", retryCount=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.pin.hashCode() * 31) + this.confirmPin.hashCode()) * 31) + java.lang.Integer.hashCode(this.retryCount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Processing)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Processing processing = (com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Processing) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.pin, processing.pin) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmPin, processing.confirmPin) && this.retryCount == processing.retryCount;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Processing copy(java.lang.String pin, java.lang.String confirmPin, int retryCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pin, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmPin, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Processing(pin, confirmPin, retryCount);
        }

        /* renamed from: component3, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getConfirmPin() {
            return this.confirmPin;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPin() {
            return this.pin;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Processing copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Processing processing, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = processing.pin;
            }
            if ((i2 & 2) != 0) {
                str2 = processing.confirmPin;
            }
            if ((i2 & 4) != 0) {
                i = processing.retryCount;
            }
            return processing.copy(str, str2, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState$Success;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState;", "", "pin", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPin"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState {
        public static final int $stable = 0;
        private final java.lang.String pin;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(java.lang.String str) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.pin = str;
        }

        public final java.lang.String getPin() {
            return this.pin;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.pin;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(pin=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.pin.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.pin, ((com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Success) other).pin);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Success copy(java.lang.String pin) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pin, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Success(pin);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPin() {
            return this.pin;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Success copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Success success, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = success.pin;
            }
            return success.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JL\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0015J\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0013R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState$Error;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState;", "", "errorMessage", "errorCode", "pin", "confirmPin", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "", "retryCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "component6", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;I)Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getErrorMessage", "getErrorCode", "getPin", "getConfirmPin", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType", com.visa.cbp.getEncExpo.warmup, "getRetryCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState {
        public static final int $stable = 0;
        private final java.lang.String confirmPin;
        private final java.lang.String errorCode;
        private final java.lang.String errorMessage;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;
        private final java.lang.String pin;
        private final int retryCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
            this.errorMessage = str;
            this.errorCode = str2;
            this.pin = str3;
            this.confirmPin = str4;
            this.errorType = debitErrorType;
            this.retryCount = i;
        }

        public /* synthetic */ Error(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.RECOVERABLE : debitErrorType, (i2 & 32) != 0 ? 0 : i);
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String getPin() {
            return this.pin;
        }

        public final java.lang.String getConfirmPin() {
            return this.confirmPin;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorMessage;
            java.lang.String str2 = this.errorCode;
            java.lang.String str3 = this.pin;
            java.lang.String str4 = this.confirmPin;
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            int i = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorMessage=");
            sb.append(str);
            sb.append(", errorCode=");
            sb.append(str2);
            sb.append(", pin=");
            sb.append(str3);
            sb.append(", confirmPin=");
            sb.append(str4);
            sb.append(", errorType=");
            sb.append(debitErrorType);
            sb.append(", retryCount=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((this.errorMessage.hashCode() * 31) + this.errorCode.hashCode()) * 31) + this.pin.hashCode()) * 31) + this.confirmPin.hashCode()) * 31) + this.errorType.hashCode()) * 31) + java.lang.Integer.hashCode(this.retryCount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Error error = (com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, error.errorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, error.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.pin, error.pin) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmPin, error.confirmPin) && this.errorType == error.errorType && this.retryCount == error.retryCount;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Error copy(java.lang.String errorMessage, java.lang.String errorCode, java.lang.String pin, java.lang.String confirmPin, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType, int retryCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pin, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmPin, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Error(errorMessage, errorCode, pin, confirmPin, errorType, retryCount);
        }

        /* renamed from: component6, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getConfirmPin() {
            return this.confirmPin;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getPin() {
            return this.pin;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Error copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Error error, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = error.errorMessage;
            }
            if ((i2 & 2) != 0) {
                str2 = error.errorCode;
            }
            java.lang.String str5 = str2;
            if ((i2 & 4) != 0) {
                str3 = error.pin;
            }
            java.lang.String str6 = str3;
            if ((i2 & 8) != 0) {
                str4 = error.confirmPin;
            }
            java.lang.String str7 = str4;
            if ((i2 & 16) != 0) {
                debitErrorType = error.errorType;
            }
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType2 = debitErrorType;
            if ((i2 & 32) != 0) {
                i = error.retryCount;
            }
            return error.copy(str, str5, str6, str7, debitErrorType2, i);
        }
    }

    public /* synthetic */ DebitPinState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
