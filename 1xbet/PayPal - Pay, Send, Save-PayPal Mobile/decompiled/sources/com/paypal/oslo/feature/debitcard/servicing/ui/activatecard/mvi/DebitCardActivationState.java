package com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fB\u001b\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n\u0082\u0001\u0003\u0010\u0011\u0012"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "getCvv", "Initial", "Loading", "Error", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationState$Error;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationState$Initial;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationState$Loading;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DebitCardActivationState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String cvv;
    private final java.lang.String name;

    private DebitCardActivationState(java.lang.String str, java.lang.String str2) {
        this.name = str;
        this.cvv = str2;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    public /* synthetic */ DebitCardActivationState(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, null);
    }

    public java.lang.String getCvv() {
        return this.cvv;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationState$Initial;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationState;", "", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationState$Initial;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCvv"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState {
        public static final int $stable = 0;
        private final java.lang.String cvv;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initial(java.lang.String str) {
            super("Initial", str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.cvv = str;
        }

        public /* synthetic */ Initial(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }

        @Override // com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState
        public final java.lang.String getCvv() {
            return this.cvv;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cvv;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initial(cvv=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cvv.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Initial) && kotlin.jvm.internal.Intrinsics.areEqual(this.cvv, ((com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Initial) other).cvv);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Initial copy(java.lang.String cvv) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvv, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Initial(cvv);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCvv() {
            return this.cvv;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Initial copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Initial initial, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = initial.cvv;
            }
            return initial.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Initial() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationState$Loading;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationState;", "", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "", "retryCount", "<init>", "(Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getCvv", com.visa.cbp.getEncExpo.warmup, "getRetryCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState {
        public static final int $stable = 0;
        private final java.lang.String cvv;
        private final int retryCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(java.lang.String str, int i) {
            super("Loading", str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.cvv = str;
            this.retryCount = i;
        }

        public /* synthetic */ Loading(java.lang.String str, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? 0 : i);
        }

        @Override // com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState
        public final java.lang.String getCvv() {
            return this.cvv;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cvv;
            int i = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(cvv=");
            sb.append(str);
            sb.append(", retryCount=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.cvv.hashCode() * 31) + java.lang.Integer.hashCode(this.retryCount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Loading)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Loading loading = (com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Loading) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cvv, loading.cvv) && this.retryCount == loading.retryCount;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Loading copy(java.lang.String cvv, int retryCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvv, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Loading(cvv, retryCount);
        }

        /* renamed from: component2, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCvv() {
            return this.cvv;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Loading copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Loading loading, java.lang.String str, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = loading.cvv;
            }
            if ((i2 & 2) != 0) {
                i = loading.retryCount;
            }
            return loading.copy(str, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JD\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0015J\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0013R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationState$Error;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationState;", "", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInlineErrorType;", "inlineErrorType", "errorTag", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "", "retryCount", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInlineErrorType;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInlineErrorType;", "component3", "component4", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "component5", "()I", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInlineErrorType;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;I)Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getCvv", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInlineErrorType;", "getInlineErrorType", "getErrorTag", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType", com.visa.cbp.getEncExpo.warmup, "getRetryCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState {
        public static final int $stable = 0;
        private final java.lang.String cvv;
        private final java.lang.String errorTag;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;
        private final com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType inlineErrorType;
        private final int retryCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType debitCardActivationInlineErrorType, java.lang.String str2, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i) {
            super("Error", str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
            this.cvv = str;
            this.inlineErrorType = debitCardActivationInlineErrorType;
            this.errorTag = str2;
            this.errorType = debitErrorType;
            this.retryCount = i;
        }

        @Override // com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState
        public final java.lang.String getCvv() {
            return this.cvv;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType getInlineErrorType() {
            return this.inlineErrorType;
        }

        public /* synthetic */ Error(java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType debitCardActivationInlineErrorType, java.lang.String str2, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? null : debitCardActivationInlineErrorType, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.RECOVERABLE : debitErrorType, (i2 & 16) != 0 ? 0 : i);
        }

        public final java.lang.String getErrorTag() {
            return this.errorTag;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cvv;
            com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType debitCardActivationInlineErrorType = this.inlineErrorType;
            java.lang.String str2 = this.errorTag;
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            int i = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(cvv=");
            sb.append(str);
            sb.append(", inlineErrorType=");
            sb.append(debitCardActivationInlineErrorType);
            sb.append(", errorTag=");
            sb.append(str2);
            sb.append(", errorType=");
            sb.append(debitErrorType);
            sb.append(", retryCount=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.cvv.hashCode();
            com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType debitCardActivationInlineErrorType = this.inlineErrorType;
            return (((((((hashCode * 31) + (debitCardActivationInlineErrorType == null ? 0 : debitCardActivationInlineErrorType.hashCode())) * 31) + this.errorTag.hashCode()) * 31) + this.errorType.hashCode()) * 31) + java.lang.Integer.hashCode(this.retryCount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Error error = (com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cvv, error.cvv) && this.inlineErrorType == error.inlineErrorType && kotlin.jvm.internal.Intrinsics.areEqual(this.errorTag, error.errorTag) && this.errorType == error.errorType && this.retryCount == error.retryCount;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Error copy(java.lang.String cvv, com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType inlineErrorType, java.lang.String errorTag, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType, int retryCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvv, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorTag, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Error(cvv, inlineErrorType, errorTag, errorType, retryCount);
        }

        /* renamed from: component5, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getErrorTag() {
            return this.errorTag;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType getInlineErrorType() {
            return this.inlineErrorType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCvv() {
            return this.cvv;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Error copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Error error, java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType debitCardActivationInlineErrorType, java.lang.String str2, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = error.cvv;
            }
            if ((i2 & 2) != 0) {
                debitCardActivationInlineErrorType = error.inlineErrorType;
            }
            com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType debitCardActivationInlineErrorType2 = debitCardActivationInlineErrorType;
            if ((i2 & 4) != 0) {
                str2 = error.errorTag;
            }
            java.lang.String str3 = str2;
            if ((i2 & 8) != 0) {
                debitErrorType = error.errorType;
            }
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType2 = debitErrorType;
            if ((i2 & 16) != 0) {
                i = error.retryCount;
            }
            return error.copy(str, debitCardActivationInlineErrorType2, str3, debitErrorType2, i);
        }
    }

    public /* synthetic */ DebitCardActivationState(java.lang.String str, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }
}
