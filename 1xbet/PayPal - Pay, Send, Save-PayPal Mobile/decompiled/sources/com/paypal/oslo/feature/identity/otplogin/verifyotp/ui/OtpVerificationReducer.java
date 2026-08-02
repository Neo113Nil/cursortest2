package com.paypal.oslo.feature.identity.otplogin.verifyotp.ui;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001a2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001aB\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010JW\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiState;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiState;Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent;)Larrow/core/Either;", "p0", "p1", "p2", "p3", "p4", "", "p5", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiState;Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Larrow/core/Either;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OtpVerificationReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState, com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent, com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion INSTANCE = new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion(null);
    public static final int OTP_CODE_LENGTH = 6;

    @javax.inject.Inject
    public OtpVerificationReducer() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationReducer$Companion;", "", "<init>", "()V", "", "OTP_CODE_LENGTH", com.visa.cbp.getEncExpo.warmup, "StateFactory"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationReducer$Companion$StateFactory;", "", "phoneNumber", "", "email", "otpInput", "autoSmsDetection", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "inputReady", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiState$InputReady;", "verifyingOtp", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiState$VerifyingOtp;", "requestingNewOtp", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiState$RequestingNewOtp;", "error", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiState$Error;", "message", "isExpired", "identity_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        static final class StateFactory {
            final java.lang.String Camera2StreamConfigurationMap;
            final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
            private final boolean getHighSpeedVideoFpsRanges;
            final java.lang.String getHighSpeedVideoFpsRangesFor;

            public StateFactory(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                this.getHighResolutionOutputSizeshNQ4ISI = str;
                this.getHighSpeedVideoFpsRangesFor = str2;
                this.Camera2StreamConfigurationMap = str3;
                this.getHighSpeedVideoFpsRanges = z;
            }

            public final com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.InputReady getHighResolutionOutputSizeshNQ4ISI() {
                return new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.InputReady(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
            }

            public static /* synthetic */ com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.Error getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion.StateFactory stateFactory, java.lang.String str) {
                return stateFactory.getHighResolutionOutputSizeshNQ4ISI(str, false);
            }

            public final com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.Error getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, boolean z) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                return new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.Error(str, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, z);
            }
        }

        public static final /* synthetic */ com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion.StateFactory access$createStateFromCredentials(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion companion, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
            return new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion.StateFactory(str, str2, str3, z);
        }

        public static final /* synthetic */ boolean access$extractAutoSmsDetection(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion companion, com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState otpVerificationUiState) {
            if (otpVerificationUiState instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.InputReady) {
                return ((com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.InputReady) otpVerificationUiState).getAutoSmsDetectionEnabled();
            }
            return true;
        }

        public static final /* synthetic */ kotlin.Triple access$extractCredentials(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion companion, com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState otpVerificationUiState) {
            if (otpVerificationUiState instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.InputReady) {
                com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.InputReady inputReady = (com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.InputReady) otpVerificationUiState;
                return new kotlin.Triple(inputReady.getPhoneNumber(), inputReady.getEmail(), inputReady.getOtpInput());
            }
            if (otpVerificationUiState instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.VerifyingOtp) {
                com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.VerifyingOtp verifyingOtp = (com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.VerifyingOtp) otpVerificationUiState;
                return new kotlin.Triple(verifyingOtp.getPhoneNumber(), verifyingOtp.getEmail(), verifyingOtp.getOtpInput());
            }
            if (otpVerificationUiState instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.RequestingNewOtp) {
                com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.RequestingNewOtp requestingNewOtp = (com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.RequestingNewOtp) otpVerificationUiState;
                return new kotlin.Triple(requestingNewOtp.getPhoneNumber(), requestingNewOtp.getEmail(), requestingNewOtp.getOtpInput());
            }
            if (otpVerificationUiState instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.Error) {
                com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.Error error = (com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.Error) otpVerificationUiState;
                return new kotlin.Triple(error.getPhoneNumber(), error.getEmail(), error.getOtpInput());
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(otpVerificationUiState, com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.Initial.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(otpVerificationUiState, com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.Success.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return new kotlin.Triple("", "", "");
        }

        public static final /* synthetic */ java.lang.String access$updateOtpInput(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion companion, java.lang.String str, char c, int i) {
            java.util.List<java.lang.Character> mutableList = kotlin.text.StringsKt.toMutableList(str);
            if (i < 6) {
                while (mutableList.size() <= i) {
                    mutableList.add(' ');
                }
                mutableList.set(i, java.lang.Character.valueOf(c));
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : mutableList) {
                if (((java.lang.Character) obj).charValue() != ' ') {
                    arrayList.add(obj);
                }
            }
            return kotlin.collections.CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "OtpVerificationReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState, com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect>> reduce(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState state, com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.VerifyingOtp)) {
                if (!(state instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.RequestingNewOtp)) {
                    if (!(state instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.InputReady)) {
                        if (!(state instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.Error)) {
                            if (state instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.Success) {
                                return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(state, event));
                            }
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion companion = INSTANCE;
                        com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.Error error = (com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.Error) state;
                        kotlin.Triple access$extractCredentials = com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion.access$extractCredentials(companion, error);
                        return getHighSpeedVideoFpsRangesFor(error, event, (java.lang.String) access$extractCredentials.component1(), (java.lang.String) access$extractCredentials.component2(), (java.lang.String) access$extractCredentials.component3(), com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion.access$extractAutoSmsDetection(companion, error));
                    }
                    com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.InputReady inputReady = (com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.InputReady) state;
                    com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.InputReady inputReady2 = inputReady;
                    kotlin.Triple access$extractCredentials2 = com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion.access$extractCredentials(INSTANCE, inputReady2);
                    return getHighSpeedVideoFpsRangesFor(inputReady2, event, (java.lang.String) access$extractCredentials2.component1(), (java.lang.String) access$extractCredentials2.component2(), (java.lang.String) access$extractCredentials2.component3(), inputReady.getAutoSmsDetectionEnabled());
                }
                com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.RequestingNewOtp requestingNewOtp = (com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.RequestingNewOtp) state;
                com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion companion2 = INSTANCE;
                com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.RequestingNewOtp requestingNewOtp2 = requestingNewOtp;
                kotlin.Triple access$extractCredentials3 = com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion.access$extractCredentials(companion2, requestingNewOtp2);
                java.lang.String str = (java.lang.String) access$extractCredentials3.component1();
                java.lang.String str2 = (java.lang.String) access$extractCredentials3.component2();
                java.lang.String str3 = (java.lang.String) access$extractCredentials3.component3();
                boolean access$extractAutoSmsDetection = com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion.access$extractAutoSmsDetection(companion2, requestingNewOtp2);
                if (!(event instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.NewOtpSent)) {
                    if (!(event instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.NewOtpFailed)) {
                        return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(requestingNewOtp, event));
                    }
                    return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion.StateFactory.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion.access$createStateFromCredentials(companion2, str, str2, str3, access$extractAutoSmsDetection), ((com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.NewOtpFailed) event).getErrorMessage()), null));
                }
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion.access$createStateFromCredentials(companion2, str, str2, "", access$extractAutoSmsDetection).getHighResolutionOutputSizeshNQ4ISI(), null));
            }
            com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.VerifyingOtp verifyingOtp = (com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.VerifyingOtp) state;
            com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion companion3 = INSTANCE;
            com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.VerifyingOtp verifyingOtp2 = verifyingOtp;
            kotlin.Triple access$extractCredentials4 = com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion.access$extractCredentials(companion3, verifyingOtp2);
            java.lang.String str4 = (java.lang.String) access$extractCredentials4.component1();
            java.lang.String str5 = (java.lang.String) access$extractCredentials4.component2();
            java.lang.String str6 = (java.lang.String) access$extractCredentials4.component3();
            boolean access$extractAutoSmsDetection2 = com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion.access$extractAutoSmsDetection(companion3, verifyingOtp2);
            if (event instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpVerificationSucceeded) {
                com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpVerificationSucceeded otpVerificationSucceeded = (com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpVerificationSucceeded) event;
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.Success.INSTANCE, new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.NavigateToNextChallenge(otpVerificationSucceeded.getToken(), otpVerificationSucceeded.getPostAuthOperations())));
            }
            if (event instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.ChallengeRequired) {
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.Success.INSTANCE, new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.ChallengeRequired(((com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.ChallengeRequired) event).getChallengeResult())));
            }
            if (event instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpVerificationFailed) {
                com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpVerificationFailed otpVerificationFailed = (com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpVerificationFailed) event;
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion.access$createStateFromCredentials(companion3, str4, str5, str6, access$extractAutoSmsDetection2).getHighResolutionOutputSizeshNQ4ISI(otpVerificationFailed.getErrorMessage(), otpVerificationFailed.isExpiredError()), null));
            }
            return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(verifyingOtp, event));
        }
        if (event instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.Initialize) {
            com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.Initialize initialize = (com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.Initialize) event;
            java.lang.String phoneNumber = initialize.getPhoneNumber();
            java.lang.String email = initialize.getEmail();
            boolean autoSmsDetectionEnabled = initialize.getAutoSmsDetectionEnabled();
            return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion.access$createStateFromCredentials(INSTANCE, phoneNumber, email, "", autoSmsDetectionEnabled).getHighResolutionOutputSizeshNQ4ISI(), com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.ShowKeyboard.INSTANCE));
        }
        return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.Initial.INSTANCE, event));
    }

    private static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState, com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect>> getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState p0, com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, boolean p5) {
        java.lang.String otpInput;
        if (p1 instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpDigitEntered) {
            com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpDigitEntered otpDigitEntered = (com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpDigitEntered) p1;
            if (p0 instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.InputReady) {
                otpInput = ((com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.InputReady) p0).getOtpInput();
            } else {
                otpInput = p0 instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.Error ? ((com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.Error) p0).getOtpInput() : "";
            }
            com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion companion = INSTANCE;
            return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion.access$createStateFromCredentials(companion, p2, p3, com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion.access$updateOtpInput(companion, otpInput, otpDigitEntered.getOtpDigit(), otpDigitEntered.getPosition()), p5).getHighResolutionOutputSizeshNQ4ISI(), null));
        }
        if (p1 instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpInputCompleted) {
            java.lang.String otpCode = ((com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpInputCompleted) p1).getOtpCode();
            com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.HideKeyboard hideKeyboard = com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.HideKeyboard.INSTANCE;
            com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion.StateFactory access$createStateFromCredentials = com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion.access$createStateFromCredentials(INSTANCE, p2, p3, otpCode, p5);
            return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.VerifyingOtp(access$createStateFromCredentials.getHighResolutionOutputSizeshNQ4ISI, access$createStateFromCredentials.getHighSpeedVideoFpsRangesFor, access$createStateFromCredentials.Camera2StreamConfigurationMap), hideKeyboard));
        }
        if (p1 instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.RequestNewOtp) {
            com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.HideKeyboard hideKeyboard2 = com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.HideKeyboard.INSTANCE;
            com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion.StateFactory access$createStateFromCredentials2 = com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion.access$createStateFromCredentials(INSTANCE, p2, p3, p4, p5);
            return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.RequestingNewOtp(access$createStateFromCredentials2.getHighResolutionOutputSizeshNQ4ISI, access$createStateFromCredentials2.getHighSpeedVideoFpsRangesFor, access$createStateFromCredentials2.Camera2StreamConfigurationMap), hideKeyboard2));
        }
        if (!(p1 instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.ChangeUser)) {
            if (!(p1 instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.SmsAutoDetected)) {
                return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(p0, p1));
            }
            return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion.access$createStateFromCredentials(INSTANCE, p2, p3, ((com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.SmsAutoDetected) p1).getOtpCode(), p5).getHighResolutionOutputSizeshNQ4ISI(), null));
        }
        return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationReducer.Companion.access$createStateFromCredentials(INSTANCE, p2, p3, p4, p5).getHighResolutionOutputSizeshNQ4ISI(), com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.NavigateBack.INSTANCE));
    }
}
