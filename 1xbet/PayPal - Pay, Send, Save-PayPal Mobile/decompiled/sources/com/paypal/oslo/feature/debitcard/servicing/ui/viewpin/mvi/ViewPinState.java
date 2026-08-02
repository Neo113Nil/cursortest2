package com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Input", "Processing", "DisplayPin", "Error", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState$DisplayPin;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState$Error;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState$Input;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState$Processing;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ViewPinState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ViewPinState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JF\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0012J\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b!\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState$Input;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState;", "", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "confirmCvv", "", "cvvErrorResId", "confirmCvvErrorResId", "retryCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "component5", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;I)Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState$Input;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getCvv", "getConfirmCvv", "Ljava/lang/Integer;", "getCvvErrorResId", "getConfirmCvvErrorResId", com.visa.cbp.getEncExpo.warmup, "getRetryCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Input extends com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState {
        public static final int $stable = 0;
        private final java.lang.String confirmCvv;
        private final java.lang.Integer confirmCvvErrorResId;
        private final java.lang.String cvv;
        private final java.lang.Integer cvvErrorResId;
        private final int retryCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Input(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, int i) {
            super("Input", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.cvv = str;
            this.confirmCvv = str2;
            this.cvvErrorResId = num;
            this.confirmCvvErrorResId = num2;
            this.retryCount = i;
        }

        public /* synthetic */ Input(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) == 0 ? str2 : "", (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : num2, (i2 & 16) != 0 ? 0 : i);
        }

        public final java.lang.String getCvv() {
            return this.cvv;
        }

        public final java.lang.String getConfirmCvv() {
            return this.confirmCvv;
        }

        public final java.lang.Integer getCvvErrorResId() {
            return this.cvvErrorResId;
        }

        public final java.lang.Integer getConfirmCvvErrorResId() {
            return this.confirmCvvErrorResId;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cvv;
            java.lang.String str2 = this.confirmCvv;
            java.lang.Integer num = this.cvvErrorResId;
            java.lang.Integer num2 = this.confirmCvvErrorResId;
            int i = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Input(cvv=");
            sb.append(str);
            sb.append(", confirmCvv=");
            sb.append(str2);
            sb.append(", cvvErrorResId=");
            sb.append(num);
            sb.append(", confirmCvvErrorResId=");
            sb.append(num2);
            sb.append(", retryCount=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.cvv.hashCode();
            int hashCode2 = this.confirmCvv.hashCode();
            java.lang.Integer num = this.cvvErrorResId;
            int hashCode3 = num == null ? 0 : num.hashCode();
            java.lang.Integer num2 = this.confirmCvvErrorResId;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.retryCount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Input)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Input input = (com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Input) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cvv, input.cvv) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmCvv, input.confirmCvv) && kotlin.jvm.internal.Intrinsics.areEqual(this.cvvErrorResId, input.cvvErrorResId) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmCvvErrorResId, input.confirmCvvErrorResId) && this.retryCount == input.retryCount;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Input copy(java.lang.String cvv, java.lang.String confirmCvv, java.lang.Integer cvvErrorResId, java.lang.Integer confirmCvvErrorResId, int retryCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvv, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmCvv, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Input(cvv, confirmCvv, cvvErrorResId, confirmCvvErrorResId, retryCount);
        }

        /* renamed from: component5, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Integer getConfirmCvvErrorResId() {
            return this.confirmCvvErrorResId;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Integer getCvvErrorResId() {
            return this.cvvErrorResId;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getConfirmCvv() {
            return this.confirmCvv;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCvv() {
            return this.cvv;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Input copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Input input, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = input.cvv;
            }
            if ((i2 & 2) != 0) {
                str2 = input.confirmCvv;
            }
            java.lang.String str3 = str2;
            if ((i2 & 4) != 0) {
                num = input.cvvErrorResId;
            }
            java.lang.Integer num3 = num;
            if ((i2 & 8) != 0) {
                num2 = input.confirmCvvErrorResId;
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

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState$Processing;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState;", "", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "confirmCvv", "", "retryCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;I)Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState$Processing;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getCvv", "getConfirmCvv", com.visa.cbp.getEncExpo.warmup, "getRetryCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Processing extends com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState {
        public static final int $stable = 0;
        private final java.lang.String confirmCvv;
        private final java.lang.String cvv;
        private final int retryCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Processing(java.lang.String str, java.lang.String str2, int i) {
            super("Processing", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.cvv = str;
            this.confirmCvv = str2;
            this.retryCount = i;
        }

        public /* synthetic */ Processing(java.lang.String str, java.lang.String str2, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i2 & 4) != 0 ? 0 : i);
        }

        public final java.lang.String getCvv() {
            return this.cvv;
        }

        public final java.lang.String getConfirmCvv() {
            return this.confirmCvv;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cvv;
            java.lang.String str2 = this.confirmCvv;
            int i = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Processing(cvv=");
            sb.append(str);
            sb.append(", confirmCvv=");
            sb.append(str2);
            sb.append(", retryCount=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.cvv.hashCode() * 31) + this.confirmCvv.hashCode()) * 31) + java.lang.Integer.hashCode(this.retryCount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Processing)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Processing processing = (com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Processing) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cvv, processing.cvv) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmCvv, processing.confirmCvv) && this.retryCount == processing.retryCount;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Processing copy(java.lang.String cvv, java.lang.String confirmCvv, int retryCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvv, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmCvv, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Processing(cvv, confirmCvv, retryCount);
        }

        /* renamed from: component3, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getConfirmCvv() {
            return this.confirmCvv;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCvv() {
            return this.cvv;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Processing copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Processing processing, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = processing.cvv;
            }
            if ((i2 & 2) != 0) {
                str2 = processing.confirmCvv;
            }
            if ((i2 & 4) != 0) {
                i = processing.retryCount;
            }
            return processing.copy(str, str2, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState$DisplayPin;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/DebitInstrumentPinDetails;", "result", "", "remainingSeconds", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/DebitInstrumentPinDetails;I)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/DebitInstrumentPinDetails;", "component2", "()I", "copy", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/DebitInstrumentPinDetails;I)Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState$DisplayPin;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/DebitInstrumentPinDetails;", "getResult", com.visa.cbp.getEncExpo.warmup, "getRemainingSeconds"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DisplayPin extends com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState {
        public static final int $stable = 0;
        private final int remainingSeconds;
        private final com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitInstrumentPinDetails result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayPin(com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitInstrumentPinDetails debitInstrumentPinDetails, int i) {
            super("DisplayPin", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentPinDetails, "");
            this.result = debitInstrumentPinDetails;
            this.remainingSeconds = i;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitInstrumentPinDetails getResult() {
            return this.result;
        }

        public final int getRemainingSeconds() {
            return this.remainingSeconds;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitInstrumentPinDetails debitInstrumentPinDetails = this.result;
            int i = this.remainingSeconds;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DisplayPin(result=");
            sb.append(debitInstrumentPinDetails);
            sb.append(", remainingSeconds=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.result.hashCode() * 31) + java.lang.Integer.hashCode(this.remainingSeconds);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.DisplayPin)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.DisplayPin displayPin = (com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.DisplayPin) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.result, displayPin.result) && this.remainingSeconds == displayPin.remainingSeconds;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.DisplayPin copy(com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitInstrumentPinDetails result, int remainingSeconds) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.DisplayPin(result, remainingSeconds);
        }

        /* renamed from: component2, reason: from getter */
        public final int getRemainingSeconds() {
            return this.remainingSeconds;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitInstrumentPinDetails getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.DisplayPin copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.DisplayPin displayPin, com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitInstrumentPinDetails debitInstrumentPinDetails, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                debitInstrumentPinDetails = displayPin.result;
            }
            if ((i2 & 2) != 0) {
                i = displayPin.remainingSeconds;
            }
            return displayPin.copy(debitInstrumentPinDetails, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JL\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0015J\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0013R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState$Error;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState;", "", "errorMessage", "errorCode", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "confirmCvv", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "", "retryCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "component6", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;I)Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getErrorMessage", "getErrorCode", "getCvv", "getConfirmCvv", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType", com.visa.cbp.getEncExpo.warmup, "getRetryCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState {
        public static final int $stable = 0;
        private final java.lang.String confirmCvv;
        private final java.lang.String cvv;
        private final java.lang.String errorCode;
        private final java.lang.String errorMessage;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;
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
            this.cvv = str3;
            this.confirmCvv = str4;
            this.errorType = debitErrorType;
            this.retryCount = i;
        }

        public /* synthetic */ Error(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) == 0 ? str4 : "", (i2 & 16) != 0 ? com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.RECOVERABLE : debitErrorType, (i2 & 32) != 0 ? 0 : i);
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String getCvv() {
            return this.cvv;
        }

        public final java.lang.String getConfirmCvv() {
            return this.confirmCvv;
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
            java.lang.String str3 = this.cvv;
            java.lang.String str4 = this.confirmCvv;
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            int i = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorMessage=");
            sb.append(str);
            sb.append(", errorCode=");
            sb.append(str2);
            sb.append(", cvv=");
            sb.append(str3);
            sb.append(", confirmCvv=");
            sb.append(str4);
            sb.append(", errorType=");
            sb.append(debitErrorType);
            sb.append(", retryCount=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((this.errorMessage.hashCode() * 31) + this.errorCode.hashCode()) * 31) + this.cvv.hashCode()) * 31) + this.confirmCvv.hashCode()) * 31) + this.errorType.hashCode()) * 31) + java.lang.Integer.hashCode(this.retryCount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Error error = (com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, error.errorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, error.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.cvv, error.cvv) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmCvv, error.confirmCvv) && this.errorType == error.errorType && this.retryCount == error.retryCount;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Error copy(java.lang.String errorMessage, java.lang.String errorCode, java.lang.String cvv, java.lang.String confirmCvv, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType, int retryCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvv, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmCvv, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Error(errorMessage, errorCode, cvv, confirmCvv, errorType, retryCount);
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
        public final java.lang.String getConfirmCvv() {
            return this.confirmCvv;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getCvv() {
            return this.cvv;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Error copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Error error, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = error.errorMessage;
            }
            if ((i2 & 2) != 0) {
                str2 = error.errorCode;
            }
            java.lang.String str5 = str2;
            if ((i2 & 4) != 0) {
                str3 = error.cvv;
            }
            java.lang.String str6 = str3;
            if ((i2 & 8) != 0) {
                str4 = error.confirmCvv;
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

    public /* synthetic */ ViewPinState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
