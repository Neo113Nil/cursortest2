package com.paypal.oslo.feature.dataprivacy.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/domain/usecase/CheckErasureEligibilityUseCase;", "", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "<init>", "(Lcom/paypal/oslo/core/userstore/UserStore;Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)V", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/dataprivacy/domain/usecase/ErasureEligibility;", "invoke", "()Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/userstore/UserStore;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckErasureEligibilityUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public CheckErasureEligibilityUseCase(com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        this.getHighSpeedVideoFpsRangesFor = userStore;
        this.getHighResolutionOutputSizeshNQ4ISI = featureGate;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.dataprivacy.domain.usecase.ErasureEligibility> invoke() {
        final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.userstore.model.UserState> userState = this.getHighSpeedVideoFpsRangesFor.getUserState();
        return new kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.dataprivacy.domain.usecase.ErasureEligibility>() { // from class: com.paypal.oslo.feature.dataprivacy.domain.usecase.CheckErasureEligibilityUseCase$invoke$$inlined$map$1

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.dataprivacy.domain.usecase.CheckErasureEligibilityUseCase$invoke$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ com.paypal.oslo.feature.dataprivacy.domain.usecase.CheckErasureEligibilityUseCase Camera2StreamConfigurationMap;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoSizes;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.dataprivacy.domain.usecase.CheckErasureEligibilityUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    com.paypal.oslo.feature.dataprivacy.domain.usecase.ErasureEligibility erasureEligibility;
                    if (continuation instanceof com.paypal.oslo.feature.dataprivacy.domain.usecase.CheckErasureEligibilityUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.dataprivacy.domain.usecase.CheckErasureEligibilityUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getInputSizeshNQ4ISI -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getInputFormats;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getInputSizeshNQ4ISI;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoSizes;
                                com.paypal.oslo.core.userstore.model.UserState userState = (com.paypal.oslo.core.userstore.model.UserState) obj;
                                if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
                                    erasureEligibility = com.paypal.oslo.feature.dataprivacy.domain.usecase.CheckErasureEligibilityUseCase.access$checkEligibility(this.Camera2StreamConfigurationMap, ((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState).getUser().getAccountType());
                                } else {
                                    erasureEligibility = com.paypal.oslo.feature.dataprivacy.domain.usecase.ErasureEligibility.Unknown.INSTANCE;
                                }
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.Camera2StreamConfigurationMap = 0;
                                anonymousClass1.getInputSizeshNQ4ISI = 1;
                                if (flowCollector.emit(erasureEligibility, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.Camera2StreamConfigurationMap;
                                java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoSizes;
                                java.lang.Object obj4 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.feature.dataprivacy.domain.usecase.CheckErasureEligibilityUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getInputFormats;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getInputSizeshNQ4ISI;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.dataprivacy.domain.usecase.CheckErasureEligibilityUseCase$invoke$$inlined$map$1$2", f = "CheckErasureEligibilityUseCase.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.dataprivacy.domain.usecase.CheckErasureEligibilityUseCase$invoke$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    int Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    /* synthetic */ java.lang.Object getInputFormats;
                    int getInputSizeshNQ4ISI;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getInputFormats = obj;
                        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.dataprivacy.domain.usecase.CheckErasureEligibilityUseCase$invoke$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.paypal.oslo.feature.dataprivacy.domain.usecase.CheckErasureEligibilityUseCase checkErasureEligibilityUseCase) {
                    this.getHighSpeedVideoSizes = flowCollector;
                    this.Camera2StreamConfigurationMap = checkErasureEligibilityUseCase;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.dataprivacy.domain.usecase.ErasureEligibility> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.dataprivacy.domain.usecase.CheckErasureEligibilityUseCase$invoke$$inlined$map$1.AnonymousClass2(flowCollector, this), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        return com.paypal.oslo.feature.dataprivacy.domain.usecase.ErasureEligibility.Eligible.INSTANCE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ com.paypal.oslo.feature.dataprivacy.domain.usecase.ErasureEligibility access$checkEligibility(com.paypal.oslo.feature.dataprivacy.domain.usecase.CheckErasureEligibilityUseCase checkErasureEligibilityUseCase, java.lang.String str) {
        java.util.Locale locale = java.util.Locale.ROOT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase = str.toUpperCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        int hashCode = upperCase.hashCode();
        if (hashCode != -364204096) {
            if (hashCode != 214856694) {
            }
        } else if (upperCase.equals("BUSINESS")) {
            if (checkErasureEligibilityUseCase.getHighResolutionOutputSizeshNQ4ISI.checkGate(com.paypal.oslo.feature.dataprivacy.config.DataPrivacyFeatureGates.INSTANCE.getErasureEligible())) {
                return com.paypal.oslo.feature.dataprivacy.domain.usecase.ErasureEligibility.Eligible.INSTANCE;
            }
            return new com.paypal.oslo.feature.dataprivacy.domain.usecase.ErasureEligibility.NotEligible(com.paypal.oslo.feature.dataprivacy.domain.usecase.ErasureIneligibilityReason.BusinessAccountNotEligible.INSTANCE);
        }
        return new com.paypal.oslo.feature.dataprivacy.domain.usecase.ErasureEligibility.NotEligible(new com.paypal.oslo.feature.dataprivacy.domain.usecase.ErasureIneligibilityReason.UnsupportedAccountType(str));
    }
}
