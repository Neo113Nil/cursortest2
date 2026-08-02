package com.paypal.oslo.feature.identity.login;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u000202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00103R\u001d\u00105\u001a\b\u0012\u0004\u0012\u000202048\u0007¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020:098\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u0010;R\u0014\u0010.\u001a\u00020=8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010>"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/IdentityLoginFlowStoreImpl;", "Lcom/paypal/oslo/feature/identity/login/domain/IdentityLoginFlowStore;", "Lcom/paypal/oslo/feature/identity/login/domain/reducer/IdentityLoginFlowReducer;", "reducer", "Lcom/paypal/oslo/feature/identity/login/IdentityLoginFlowEffectExecutor;", "effectExecutor", "Lcom/paypal/oslo/feature/identity/login/domain/repository/InContextLoginProvider;", "inContextLoginProvider", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/GetRememberedUserUseCase;", "getRememberedUserUseCase", "<init>", "(Lcom/paypal/oslo/feature/identity/login/domain/reducer/IdentityLoginFlowReducer;Lcom/paypal/oslo/feature/identity/login/IdentityLoginFlowEffectExecutor;Lcom/paypal/oslo/feature/identity/login/domain/repository/InContextLoginProvider;Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/GetRememberedUserUseCase;)V", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction;", "action", "", "dispatch", "(Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction;)V", "p0", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Larrow/core/Either;", "Lcom/paypal/oslo/core/identity/domain/model/TokenError;", "Lcom/paypal/oslo/core/identity/domain/model/Token;", "awaitTerminal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitIdle", "Lcom/paypal/oslo/core/identity/domain/model/TokenType$UserAccessTokenType;", "tokenType", "requestToken", "(Lcom/paypal/oslo/core/identity/domain/model/TokenType$UserAccessTokenType;)V", "reset", "()V", "Lcom/paypal/oslo/feature/identity/login/domain/model/InterruptReason;", "reason", "interrupt", "(Lcom/paypal/oslo/feature/identity/login/domain/model/InterruptReason;)V", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/identity/login/domain/reducer/IdentityLoginFlowReducer;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/login/IdentityLoginFlowEffectExecutor;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/login/domain/repository/InContextLoginProvider;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/GetRememberedUserUseCase;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CoroutineScope;", "getOutputFormats", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "", "Lkotlinx/coroutines/Job;", "Ljava/util/List;", "getOutputMinFrameDuration", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/sync/Mutex;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class IdentityLoginFlowStoreImpl implements com.paypal.oslo.feature.identity.login.domain.IdentityLoginFlowStore {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutor Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Mutex getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState> getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.List<kotlinx.coroutines.Job> getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.login.domain.repository.InContextLoginProvider getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState> state;

    @javax.inject.Inject
    public IdentityLoginFlowStoreImpl(com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer identityLoginFlowReducer, com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutor identityLoginFlowEffectExecutor, com.paypal.oslo.feature.identity.login.domain.repository.InContextLoginProvider inContextLoginProvider, com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase getRememberedUserUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityLoginFlowReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityLoginFlowEffectExecutor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inContextLoginProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getRememberedUserUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = identityLoginFlowReducer;
        this.Camera2StreamConfigurationMap = identityLoginFlowEffectExecutor;
        this.getHighSpeedVideoFpsRanges = inContextLoginProvider;
        this.getHighSpeedVideoFpsRangesFor = getRememberedUserUseCase;
        this.getHighSpeedVideoSizes = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null));
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState(null, null, false, null, null, 31, null));
        this.getHighSpeedVideoSizesFor = MutableStateFlow;
        this.state = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        this.getOutputMinFrameDuration = new java.util.ArrayList();
        this.getOutputFormats = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState> getState() {
        return this.state;
    }

    public final void dispatch(com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoSizes, null, null, new com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$dispatch$1(this, action, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fc A[Catch: all -> 0x014e, TryCatch #0 {all -> 0x014e, blocks: (B:11:0x0054, B:15:0x008d, B:18:0x00a4, B:21:0x00c4, B:22:0x00f6, B:24:0x00fc, B:31:0x0106, B:32:0x010e, B:34:0x0114, B:36:0x011e, B:27:0x0124, B:39:0x0146), top: B:10:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction authFlowAction, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$processAction$1 identityLoginFlowStoreImpl$processAction$1;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        java.lang.String simpleName;
        java.lang.String simpleName2;
        java.lang.String simpleName3;
        final kotlinx.coroutines.Job launch$default;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$processAction$1) {
                identityLoginFlowStoreImpl$processAction$1 = (com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$processAction$1) continuation;
                if ((identityLoginFlowStoreImpl$processAction$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    identityLoginFlowStoreImpl$processAction$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = identityLoginFlowStoreImpl$processAction$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = identityLoginFlowStoreImpl$processAction$1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = this.getOutputFormats;
                        identityLoginFlowStoreImpl$processAction$1.getHighSpeedVideoSizes = authFlowAction;
                        identityLoginFlowStoreImpl$processAction$1.getHighSpeedVideoFpsRanges = mutex;
                        identityLoginFlowStoreImpl$processAction$1.Camera2StreamConfigurationMap = 0;
                        identityLoginFlowStoreImpl$processAction$1.getHighSpeedVideoFpsRangesFor = 1;
                        if (mutex.lock(null, identityLoginFlowStoreImpl$processAction$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = identityLoginFlowStoreImpl$processAction$1.Camera2StreamConfigurationMap;
                        kotlinx.coroutines.sync.Mutex mutex2 = (kotlinx.coroutines.sync.Mutex) identityLoginFlowStoreImpl$processAction$1.getHighSpeedVideoFpsRanges;
                        com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction authFlowAction2 = (com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction) identityLoginFlowStoreImpl$processAction$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                        authFlowAction = authFlowAction2;
                    }
                    com.paypal.oslo.feature.identity.login.domain.model.AuthPhase phase = this.getHighSpeedVideoSizesFor.getValue().getPhase();
                    com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput reduce = this.getHighResolutionOutputSizeshNQ4ISI.reduce(this.getHighSpeedVideoSizesFor.getValue(), authFlowAction);
                    this.getHighSpeedVideoSizesFor.setValue(reduce.getState());
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[4];
                    simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(phase.getClass()).getSimpleName();
                    java.lang.String str = "";
                    if (simpleName == null) {
                        simpleName = "";
                    }
                    pairArr[0] = kotlin.TuplesKt.to("from", simpleName);
                    simpleName2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(authFlowAction.getClass()).getSimpleName();
                    if (simpleName2 == null) {
                        simpleName2 = "";
                    }
                    pairArr[1] = kotlin.TuplesKt.to("action", simpleName2);
                    simpleName3 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(reduce.getState().getPhase().getClass()).getSimpleName();
                    if (simpleName3 == null) {
                        str = simpleName3;
                    }
                    pairArr[2] = kotlin.TuplesKt.to(androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, str);
                    pairArr[3] = kotlin.TuplesKt.to("effects", java.lang.String.valueOf(reduce.getEffects().size()));
                    com.paypal.android.logger.Logger.d$default(logger, "AuthFlow transition", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                    for (com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect identityLoginFlowEffect : reduce.getEffects()) {
                        if (!(identityLoginFlowEffect instanceof com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.CancelInFlightEffects)) {
                            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoSizes, null, null, new com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$executeEffects$job$1(this, identityLoginFlowEffect, null), 3, null);
                            this.getOutputMinFrameDuration.add(launch$default);
                            launch$default.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl.m15168$r8$lambda$b4FVHXwVtMFjkYmAsPYxL7A7kM(com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl.this, launch$default, (java.lang.Throwable) obj2);
                                }
                            });
                        } else {
                            java.util.Iterator<T> it = this.getOutputMinFrameDuration.iterator();
                            while (it.hasNext()) {
                                kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) it.next(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                            }
                            this.getOutputMinFrameDuration.clear();
                        }
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    mutex.unlock(null);
                    return kotlin.Unit.INSTANCE;
                }
            }
            com.paypal.oslo.feature.identity.login.domain.model.AuthPhase phase2 = this.getHighSpeedVideoSizesFor.getValue().getPhase();
            com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput reduce2 = this.getHighResolutionOutputSizeshNQ4ISI.reduce(this.getHighSpeedVideoSizesFor.getValue(), authFlowAction);
            this.getHighSpeedVideoSizesFor.setValue(reduce2.getState());
            com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.identity.LoggerKt.log;
            kotlin.Pair[] pairArr2 = new kotlin.Pair[4];
            simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(phase2.getClass()).getSimpleName();
            java.lang.String str2 = "";
            if (simpleName == null) {
            }
            pairArr2[0] = kotlin.TuplesKt.to("from", simpleName);
            simpleName2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(authFlowAction.getClass()).getSimpleName();
            if (simpleName2 == null) {
            }
            pairArr2[1] = kotlin.TuplesKt.to("action", simpleName2);
            simpleName3 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(reduce2.getState().getPhase().getClass()).getSimpleName();
            if (simpleName3 == null) {
            }
            pairArr2[2] = kotlin.TuplesKt.to(androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, str2);
            pairArr2[3] = kotlin.TuplesKt.to("effects", java.lang.String.valueOf(reduce2.getEffects().size()));
            com.paypal.android.logger.Logger.d$default(logger2, "AuthFlow transition", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
            while (r14.hasNext()) {
            }
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            mutex.unlock(null);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        identityLoginFlowStoreImpl$processAction$1 = new com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$processAction$1(this, continuation);
        java.lang.Object obj2 = identityLoginFlowStoreImpl$processAction$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = identityLoginFlowStoreImpl$processAction$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
    }

    @Override // com.paypal.oslo.feature.identity.login.domain.IdentityLoginFlowStore
    public final java.lang.Object awaitTerminal(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.TokenError, ? extends com.paypal.oslo.core.identity.domain.model.Token>> continuation) {
        final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState> stateFlow = this.state;
        return kotlinx.coroutines.flow.FlowKt.first(new kotlinx.coroutines.flow.Flow<arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.TokenError, ? extends com.paypal.oslo.core.identity.domain.model.Token>>() { // from class: com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$awaitTerminal$$inlined$mapNotNull$1

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$awaitTerminal$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector Camera2StreamConfigurationMap;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$awaitTerminal$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    arrow.core.Either left;
                    if (continuation instanceof com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$awaitTerminal$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$awaitTerminal$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getOutputMinFrameDuration -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getInputFormats;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getOutputMinFrameDuration;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.Camera2StreamConfigurationMap;
                                com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState authFlowState = (com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState) obj;
                                com.paypal.oslo.feature.identity.login.domain.model.AuthPhase phase = authFlowState.getPhase();
                                if (phase instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.Completed) {
                                    left = arrow.core.EitherKt.right(((com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.Completed) authFlowState.getPhase()).getToken());
                                } else if (phase instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.Failed) {
                                    left = arrow.core.EitherKt.left(((com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.Failed) authFlowState.getPhase()).getError());
                                } else {
                                    left = phase instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.Cancelled ? arrow.core.EitherKt.left(com.paypal.oslo.core.identity.domain.model.TokenError.NotFound.INSTANCE) : null;
                                }
                                if (left != null) {
                                    anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                    anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                    anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                    anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                    anonymousClass1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(left);
                                    anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                    anonymousClass1.getOutputMinFrameDuration = 1;
                                    if (flowCollector.emit(left, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoSizes;
                                java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$awaitTerminal$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getInputFormats;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getOutputMinFrameDuration;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$awaitTerminal$$inlined$mapNotNull$1$2", f = "IdentityLoginFlowStoreImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {57}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$mapNotNull_u24lambda_u246", "transformed", "$i$a$-unsafeTransform-FlowKt__TransformKt$mapNotNull$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$awaitTerminal$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    int getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    /* synthetic */ java.lang.Object getInputFormats;
                    java.lang.Object getInputSizeshNQ4ISI;
                    int getOutputMinFrameDuration;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getInputFormats = obj;
                        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$awaitTerminal$$inlined$mapNotNull$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.Camera2StreamConfigurationMap = flowCollector;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.TokenError, ? extends com.paypal.oslo.core.identity.domain.model.Token>> flowCollector, kotlin.coroutines.Continuation continuation2) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$awaitTerminal$$inlined$mapNotNull$1.AnonymousClass2(flowCollector), continuation2);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        }, continuation);
    }

    public final java.lang.Object awaitIdle(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object first = kotlinx.coroutines.flow.FlowKt.first(this.state, new com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$awaitIdle$2(null), continuation);
        return first == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? first : kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.identity.login.domain.IdentityLoginFlowStore
    public final void requestToken(com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType tokenType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenType, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoSizes, null, null, new com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$requestToken$1(this, tokenType, null), 3, null);
    }

    @Override // com.paypal.oslo.feature.identity.login.domain.IdentityLoginFlowStore
    public final void reset() {
        dispatch(com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.Reset.INSTANCE);
    }

    @Override // com.paypal.oslo.feature.identity.login.domain.IdentityLoginFlowStore
    public final void interrupt(com.paypal.oslo.feature.identity.login.domain.model.InterruptReason reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
        dispatch(new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.Interrupt(reason));
    }

    /* renamed from: $r8$lambda$b4FVHXwVtMFjkY-mAsPYxL7A7kM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15168$r8$lambda$b4FVHXwVtMFjkYmAsPYxL7A7kM(com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl identityLoginFlowStoreImpl, kotlinx.coroutines.Job job, java.lang.Throwable th) {
        identityLoginFlowStoreImpl.getOutputMinFrameDuration.remove(job);
        return kotlin.Unit.INSTANCE;
    }
}
