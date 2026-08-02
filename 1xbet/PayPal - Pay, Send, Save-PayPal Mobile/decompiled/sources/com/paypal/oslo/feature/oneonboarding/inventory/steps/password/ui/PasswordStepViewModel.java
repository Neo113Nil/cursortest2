package com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui;

@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\b\u0010\u001f\u001a\u00020 H\u0002J\u000e\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#JP\u0010$\u001a\u00020 22\u0010%\u001a.\u0012*\u0012(\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0006j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0007`\u000b0\u00052\b\b\u0002\u0010&\u001a\u00020 2\b\b\u0002\u0010'\u001a\u00020 H\u0002J\u0010\u0010(\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010)\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#H\u0002J\u0016\u0010*\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#2\u0006\u0010+\u001a\u00020,R:\u0010\u0004\u001a.\u0012*\u0012(\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0006j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0007`\u000b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R:\u0010\f\u001a.\u0012*\u0012(\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0006j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0007`\u000b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006-"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/password/ui/PasswordStepViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "realTimeValidators", "", "Lkotlin/Function1;", "", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/oneonboarding/validators/domain/ValidationError;", "Lcom/paypal/oslo/feature/oneonboarding/validators/domain/ValidationSuccess;", "Lcom/paypal/oslo/feature/oneonboarding/validators/domain/Validator;", "navigationValidators", "_passwordDataFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/password/ui/model/PasswordData;", "passwordDataFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getPasswordDataFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "_passwordAction", "Lkotlinx/coroutines/channels/Channel;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/password/domain/PasswordStepAction;", "passwordAction", "Lkotlinx/coroutines/flow/Flow;", "getPasswordAction", "()Lkotlinx/coroutines/flow/Flow;", "onPasswordChange", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "validateAll", "", "onSubmitPassword", "intentId", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "checkValidators", "validators", "showPasswordHints", "clearErrors", "getEmailAddress", "trackValidationErrors", "handleCredentialResult", "result", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/password/domain/SaveCredentialResult;", "one-onboarding_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PasswordStepViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.oneonboarding.inventory.steps.password.domain.PasswordStepAction> Camera2StreamConfigurationMap;
    private final java.util.List<kotlin.jvm.functions.Function1<java.lang.CharSequence, arrow.core.Either<com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationError, com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationSuccess>>> getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.model.PasswordData> getHighSpeedVideoFpsRangesFor;
    private final java.util.List<kotlin.jvm.functions.Function1<java.lang.CharSequence, arrow.core.Either<com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationError, com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationSuccess>>> getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.oneonboarding.inventory.steps.password.domain.PasswordStepAction> passwordAction;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.model.PasswordData> passwordDataFlow;

    @javax.inject.Inject
    public PasswordStepViewModel() {
        java.util.List<kotlin.jvm.functions.Function1<java.lang.CharSequence, arrow.core.Either<com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationError, com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationSuccess>>> realTimePasswordValidators = com.paypal.oslo.feature.oneonboarding.inventory.steps.password.validator.PasswordValidatorsKt.realTimePasswordValidators(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_password_length_message, com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_password_regex_message, com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_password_key_sequence_message, com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_password_consecutive_number_message, com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_password_consecutive_repeated_char_message, com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_password_hard_message);
        this.getHighSpeedVideoSizes = realTimePasswordValidators;
        this.getHighSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.oneonboarding.validators.factory.ValidatorsFactoryKt.required(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_password_required_message));
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.model.PasswordData> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.model.PasswordData(null, false, null, 7, null));
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        this.passwordDataFlow = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.oneonboarding.inventory.steps.password.domain.PasswordStepAction> Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(0, null, null, 7, null);
        this.Camera2StreamConfigurationMap = Channel$default;
        this.passwordAction = kotlinx.coroutines.flow.FlowKt.receiveAsFlow(Channel$default);
        final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.model.PasswordData> mutableStateFlow = MutableStateFlow;
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(new kotlinx.coroutines.flow.Flow<java.lang.String>() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel$special$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.String> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel$special$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighResolutionOutputSizeshNQ4ISI;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighSpeedVideoSizesFor -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getInputSizeshNQ4ISI;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighSpeedVideoSizesFor;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.String password = ((com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.model.PasswordData) obj).getPassword();
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = 0;
                                anonymousClass1.getHighSpeedVideoSizesFor = 1;
                                if (flowCollector.emit(password, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                java.lang.Object obj3 = anonymousClass1.Camera2StreamConfigurationMap;
                                java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoSizes;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getInputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighSpeedVideoSizesFor;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel$special$$inlined$map$1$2", f = "PasswordStepViewModel.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    int getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    int getHighSpeedVideoSizesFor;
                    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getInputSizeshNQ4ISI = obj;
                        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel$special$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
                }
            }
        }), new com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel.AnonymousClass2(null)), androidx.view.ViewModelKt.getViewModelScope(this));
        getHighSpeedVideoFpsRanges(realTimePasswordValidators, true, false);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.model.PasswordData> getPasswordDataFlow() {
        return this.passwordDataFlow;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.oneonboarding.inventory.steps.password.domain.PasswordStepAction> getPasswordAction() {
        return this.passwordAction;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel$2", f = "PasswordStepViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRanges != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel passwordStepViewModel = com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel.this;
            com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel.Camera2StreamConfigurationMap(passwordStepViewModel, passwordStepViewModel.getHighSpeedVideoSizes, false, true, 2);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel.AnonymousClass2) create(str, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel.this.new AnonymousClass2(continuation);
        }

        AnonymousClass2(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel.AnonymousClass2> continuation) {
            super(2, continuation);
        }
    }

    public final void onPasswordChange(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.model.PasswordData> mutableStateFlow = this.getHighSpeedVideoFpsRangesFor;
        mutableStateFlow.setValue(com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.model.PasswordData.copy$default(mutableStateFlow.getValue(), value, false, null, 6, null));
    }

    public final void onSubmitPassword(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel$onSubmitPassword$1(this, intentId, null), 3, null);
    }

    static /* synthetic */ boolean Camera2StreamConfigurationMap(com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel passwordStepViewModel, java.util.List list, boolean z, boolean z2, int i) {
        return passwordStepViewModel.getHighSpeedVideoFpsRanges(list, false, true);
    }

    private final boolean getHighSpeedVideoFpsRanges(java.util.List<? extends kotlin.jvm.functions.Function1<? super java.lang.CharSequence, ? extends arrow.core.Either<com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationError, com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationSuccess>>> list, boolean z, boolean z2) {
        java.lang.String password = this.getHighSpeedVideoFpsRangesFor.getValue().getPassword();
        com.paypal.oslo.feature.oneonboarding.validators.domain.ValidatorResult validatePassword = com.paypal.oslo.feature.oneonboarding.inventory.steps.password.validator.PasswordValidatorsKt.validatePassword(password, z2, list);
        this.getHighSpeedVideoFpsRangesFor.setValue(new com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.model.PasswordData(password, z, validatePassword.getResults()));
        return validatePassword.isValid();
    }

    public final void handleCredentialResult(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.inventory.steps.password.domain.SaveCredentialResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel$handleCredentialResult$1(result, intentId, this, null), 3, null);
    }

    public static final /* synthetic */ java.lang.String access$getEmailAddress(com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel passwordStepViewModel, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
        return intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreation ? ((com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreation) intentId).m16650getEmailpoA_XDo() : "";
    }

    public static final /* synthetic */ void access$trackValidationErrors(com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel passwordStepViewModel, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
        com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode passwordErrorCode;
        if (passwordStepViewModel.getHighSpeedVideoFpsRangesFor.getValue().getPassword().length() == 0) {
            com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordStepAnalyticsKt.trackPasswordFieldError$default(intentId, com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode.PASSWORD_VALIDATION_FAILED, null, 4, null);
            return;
        }
        java.util.Iterator<T> it = passwordStepViewModel.getHighSpeedVideoFpsRangesFor.getValue().getValidationResults().iterator();
        while (true) {
            if (!it.hasNext()) {
                passwordErrorCode = null;
                break;
            }
            arrow.core.Either either = (arrow.core.Either) it.next();
            if (either instanceof arrow.core.Either.Right) {
                passwordErrorCode = null;
            } else if (either instanceof arrow.core.Either.Left) {
                passwordErrorCode = com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode.INSTANCE.fromMessageResId(((com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationError) ((arrow.core.Either.Left) either).getValue()).getMessageResId());
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (passwordErrorCode != null) {
                break;
            }
        }
        if (passwordErrorCode != null) {
            com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordStepAnalyticsKt.trackPasswordFieldError$default(intentId, passwordErrorCode, null, 4, null);
        }
    }

    public static final /* synthetic */ boolean access$validateAll(com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel passwordStepViewModel) {
        return passwordStepViewModel.getHighSpeedVideoFpsRanges(passwordStepViewModel.getHighSpeedVideoFpsRanges, false, false) && passwordStepViewModel.getHighSpeedVideoFpsRanges(passwordStepViewModel.getHighSpeedVideoSizes, false, false);
    }
}
