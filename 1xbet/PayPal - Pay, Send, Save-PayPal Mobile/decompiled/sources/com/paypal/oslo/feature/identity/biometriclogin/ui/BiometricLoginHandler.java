package com.paypal.oslo.feature.identity.biometriclogin.ui;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0019\b\u0002\u0010\u000e\u001a\u0013\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u001b8\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler;", "", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/usecase/BiometricLoginUseCase;", "biometricLoginUseCase", "<init>", "(Lcom/paypal/oslo/feature/identity/biometriclogin/domain/usecase/BiometricLoginUseCase;)V", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "", "onAttemptFailed", "attempt", "(Landroidx/fragment/app/FragmentActivity;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)V", "reset", "()V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/usecase/BiometricLoginUseCase;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler$BiometricLoginUiState;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "BiometricLoginUiState"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BiometricLoginHandler {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState> state;

    public BiometricLoginHandler(com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase biometricLoginUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biometricLoginUseCase, "");
        this.Camera2StreamConfigurationMap = biometricLoginUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Idle.INSTANCE);
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        this.state = MutableStateFlow;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState> getState() {
        return this.state;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void attempt$default(com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler biometricLoginHandler, androidx.fragment.app.FragmentActivity fragmentActivity, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit unit;
                    ((java.lang.Boolean) obj2).booleanValue();
                    unit = kotlin.Unit.INSTANCE;
                    return unit;
                }
            };
        }
        biometricLoginHandler.attempt(fragmentActivity, coroutineScope, function1);
    }

    public final void attempt(androidx.fragment.app.FragmentActivity activity, kotlinx.coroutines.CoroutineScope scope, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onAttemptFailed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onAttemptFailed, "");
        if ((this.getHighSpeedVideoFpsRangesFor.getValue() instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.AuthenticatingBiometric) || (this.getHighSpeedVideoFpsRangesFor.getValue() instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Loading)) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor.setValue(com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Loading.INSTANCE);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(scope, null, null, new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler$attempt$2(this, activity, onAttemptFailed, null), 3, null);
    }

    public final void reset() {
        this.getHighSpeedVideoFpsRangesFor.setValue(com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Idle.INSTANCE);
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler$BiometricLoginUiState;", "", "<init>", "()V", "Idle", "AuthenticatingBiometric", "Loading", "Cancelled", "NotAvailable", "Success", "ChallengeRequired", "Error", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler$BiometricLoginUiState$AuthenticatingBiometric;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler$BiometricLoginUiState$Cancelled;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler$BiometricLoginUiState$ChallengeRequired;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler$BiometricLoginUiState$Error;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler$BiometricLoginUiState$Idle;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler$BiometricLoginUiState$Loading;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler$BiometricLoginUiState$NotAvailable;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler$BiometricLoginUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class BiometricLoginUiState {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler$BiometricLoginUiState$Idle;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler$BiometricLoginUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Idle extends com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Idle INSTANCE = new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Idle();

            public final int hashCode() {
                return 1810853031;
            }

            private Idle() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Idle";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Idle)) {
                    return false;
                }
                return true;
            }
        }

        private BiometricLoginUiState() {
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler$BiometricLoginUiState$AuthenticatingBiometric;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler$BiometricLoginUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class AuthenticatingBiometric extends com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.AuthenticatingBiometric INSTANCE = new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.AuthenticatingBiometric();

            public final int hashCode() {
                return -151762221;
            }

            private AuthenticatingBiometric() {
                super(null);
            }

            public final java.lang.String toString() {
                return "AuthenticatingBiometric";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.AuthenticatingBiometric)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler$BiometricLoginUiState$Loading;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler$BiometricLoginUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Loading extends com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Loading INSTANCE = new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Loading();

            public final int hashCode() {
                return 1005789065;
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
                if (!(other instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Loading)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler$BiometricLoginUiState$Cancelled;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler$BiometricLoginUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Cancelled extends com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Cancelled INSTANCE = new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Cancelled();

            public final int hashCode() {
                return -726398882;
            }

            private Cancelled() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Cancelled";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Cancelled)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler$BiometricLoginUiState$NotAvailable;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler$BiometricLoginUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NotAvailable extends com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.NotAvailable INSTANCE = new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.NotAvailable();

            public final int hashCode() {
                return -1615649015;
            }

            private NotAvailable() {
                super(null);
            }

            public final java.lang.String toString() {
                return "NotAvailable";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.NotAvailable)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler$BiometricLoginUiState$Success;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler$BiometricLoginUiState;", "Lcom/paypal/oslo/feature/identity/foundation/model/Token;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", "Lcom/paypal/oslo/feature/identity/login/domain/model/PostAuthenticationOperation;", "postAuthOperations", "<init>", "(Lcom/paypal/oslo/feature/identity/foundation/model/Token;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/identity/foundation/model/Token;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/identity/foundation/model/Token;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler$BiometricLoginUiState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/foundation/model/Token;", "getToken", "Ljava/util/List;", "getPostAuthOperations"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Success extends com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState {
            public static final int $stable = 8;
            private final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> postAuthOperations;
            private final com.paypal.oslo.feature.identity.foundation.model.Token token;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(com.paypal.oslo.feature.identity.foundation.model.Token token, java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> list) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                this.token = token;
                this.postAuthOperations = list;
            }

            public final com.paypal.oslo.feature.identity.foundation.model.Token getToken() {
                return this.token;
            }

            public /* synthetic */ Success(com.paypal.oslo.feature.identity.foundation.model.Token token, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(token, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
            }

            public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> getPostAuthOperations() {
                return this.postAuthOperations;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.identity.foundation.model.Token token = this.token;
                java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> list = this.postAuthOperations;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(token=");
                sb.append(token);
                sb.append(", postAuthOperations=");
                sb.append(list);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.token.hashCode() * 31) + this.postAuthOperations.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Success)) {
                    return false;
                }
                com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Success success = (com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Success) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.token, success.token) && kotlin.jvm.internal.Intrinsics.areEqual(this.postAuthOperations, success.postAuthOperations);
            }

            public final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Success copy(com.paypal.oslo.feature.identity.foundation.model.Token token, java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> postAuthOperations) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postAuthOperations, "");
                return new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Success(token, postAuthOperations);
            }

            public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> component2() {
                return this.postAuthOperations;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.identity.foundation.model.Token getToken() {
                return this.token;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Success copy$default(com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Success success, com.paypal.oslo.feature.identity.foundation.model.Token token, java.util.List list, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    token = success.token;
                }
                if ((i & 2) != 0) {
                    list = success.postAuthOperations;
                }
                return success.copy(token, list);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler$BiometricLoginUiState$ChallengeRequired;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler$BiometricLoginUiState;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "challengeResult", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;)Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler$BiometricLoginUiState$ChallengeRequired;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "getChallengeResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ChallengeRequired extends com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ChallengeRequired(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeResult, "");
                this.challengeResult = challengeResult;
            }

            public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult getChallengeResult() {
                return this.challengeResult;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult = this.challengeResult;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ChallengeRequired(challengeResult=");
                sb.append(challengeResult);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.challengeResult.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.ChallengeRequired) && kotlin.jvm.internal.Intrinsics.areEqual(this.challengeResult, ((com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.ChallengeRequired) other).challengeResult);
            }

            public final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.ChallengeRequired copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeResult, "");
                return new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.ChallengeRequired(challengeResult);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult getChallengeResult() {
                return this.challengeResult;
            }

            public static /* synthetic */ com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.ChallengeRequired copy$default(com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.ChallengeRequired challengeRequired, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    challengeResult = challengeRequired.challengeResult;
                }
                return challengeRequired.copy(challengeResult);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler$BiometricLoginUiState$Error;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler$BiometricLoginUiState;", "", "messageResId", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler$BiometricLoginUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getMessageResId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Error extends com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState {
            public static final int $stable = 0;
            private final int messageResId;

            public Error(int i) {
                super(null);
                this.messageResId = i;
            }

            public final int getMessageResId() {
                return this.messageResId;
            }

            public final java.lang.String toString() {
                int i = this.messageResId;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(messageResId=");
                sb.append(i);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return java.lang.Integer.hashCode(this.messageResId);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Error) && this.messageResId == ((com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Error) other).messageResId;
            }

            public final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Error copy(int messageResId) {
                return new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Error(messageResId);
            }

            /* renamed from: component1, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Error copy$default(com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Error error, int i, int i2, java.lang.Object obj) {
                if ((i2 & 1) != 0) {
                    i = error.messageResId;
                }
                return error.copy(i);
            }
        }

        public /* synthetic */ BiometricLoginUiState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final /* synthetic */ com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState access$mapError(com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler biometricLoginHandler, com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError biometricLoginError) {
        if (biometricLoginError instanceof com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.UserCancelled) {
            return com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Cancelled.INSTANCE;
        }
        if ((biometricLoginError instanceof com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.Lockout) || (biometricLoginError instanceof com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.NotEligible) || (biometricLoginError instanceof com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.BiometricUnavailable) || (biometricLoginError instanceof com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.DeviceNotBound)) {
            return com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.NotAvailable.INSTANCE;
        }
        if (!(biometricLoginError instanceof com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.AuthenticationRejected) && !(biometricLoginError instanceof com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.SigningFailed) && !(biometricLoginError instanceof com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.AuthenticationFailed) && !(biometricLoginError instanceof com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.Unknown)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Error(com.paypal.oslo.feature.identity.R.string.feature_identity_remembered_login_error_message);
    }
}
