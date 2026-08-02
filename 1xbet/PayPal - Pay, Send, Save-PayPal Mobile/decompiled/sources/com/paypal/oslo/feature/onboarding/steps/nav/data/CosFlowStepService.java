package com.paypal.oslo.feature.onboarding.steps.nav.data;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/steps/nav/data/CosFlowStepService;", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/ReadableFlowStepService;", "Lcom/paypal/oslo/feature/onboarding/steps/nav/data/CosFlowStepApi;", "cosFlowStepApi", "<init>", "(Lcom/paypal/oslo/feature/onboarding/steps/nav/data/CosFlowStepApi;)V", "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/FlowId;", com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/StepId;", "stepId", "Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Transition;", "transition", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/StepError;", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "getFlowStep-vm54Raw", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Transition;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFlowStep", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/onboarding/steps/nav/data/CosFlowStepApi;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CosFlowStepService implements com.paypal.oslo.feature.onboarding.steps.nav.domain.ReadableFlowStepService {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepApi getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public CosFlowStepService(com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepApi cosFlowStepApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cosFlowStepApi, "");
        this.getHighSpeedVideoFpsRanges = cosFlowStepApi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ab A[Catch: all -> 0x0101, RaiseCancellationException -> 0x0105, TryCatch #6 {RaiseCancellationException -> 0x0105, all -> 0x0101, blocks: (B:14:0x0099, B:16:0x00ab, B:19:0x00b8, B:20:0x0100), top: B:13:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b8 A[Catch: all -> 0x0101, RaiseCancellationException -> 0x0105, TryCatch #6 {RaiseCancellationException -> 0x0105, all -> 0x0101, blocks: (B:14:0x0099, B:16:0x00ab, B:19:0x00b8, B:20:0x0100), top: B:13:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Type inference failed for: r0v30, types: [arrow.core.raise.Raise] */
    /* JADX WARN: Type inference failed for: r2v8, types: [arrow.core.raise.Raise] */
    @Override // com.paypal.oslo.feature.onboarding.steps.nav.domain.ReadableFlowStepService
    /* renamed from: getFlowStep-vm54Raw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo16512getFlowStepvm54Raw(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition transition, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.onboarding.steps.nav.domain.StepError, com.paypal.oslo.feature.onboarding.steps.nav.domain.Step>> continuation) {
        com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepService$getFlowStep$1 cosFlowStepService$getFlowStep$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        java.lang.Object obj;
        arrow.core.raise.DefaultRaise defaultRaise3;
        arrow.core.raise.DefaultRaise defaultRaise4;
        arrow.core.raise.DefaultRaise defaultRaise5;
        java.lang.Object firstOrNull;
        java.lang.String str3 = str;
        java.lang.String str4 = str2;
        com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition transition2 = transition;
        try {
            if (continuation instanceof com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepService$getFlowStep$1) {
                cosFlowStepService$getFlowStep$1 = (com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepService$getFlowStep$1) continuation;
                if ((cosFlowStepService$getFlowStep$1.getOutputMinFrameDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                    cosFlowStepService$getFlowStep$1.getOutputMinFrameDurationlomOqCM -= 2147483648;
                    java.lang.Object obj2 = cosFlowStepService$getFlowStep$1.getOutputStallDuration;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = cosFlowStepService$getFlowStep$1.getOutputMinFrameDurationlomOqCM;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        try {
                            defaultRaise2 = defaultRaise;
                            com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepApi cosFlowStepApi = this.getHighSpeedVideoFpsRanges;
                            cosFlowStepService$getFlowStep$1.Camera2StreamConfigurationMap = str3;
                            cosFlowStepService$getFlowStep$1.getOutputFormats = str4;
                            cosFlowStepService$getFlowStep$1.getInputFormats = transition2;
                            cosFlowStepService$getFlowStep$1.getHighSpeedVideoSizesFor = defaultRaise;
                            cosFlowStepService$getFlowStep$1.getOutputMinFrameDuration = defaultRaise2;
                            cosFlowStepService$getFlowStep$1.getInputSizeshNQ4ISI = defaultRaise2;
                            cosFlowStepService$getFlowStep$1.getHighSpeedVideoSizes = 0;
                            cosFlowStepService$getFlowStep$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            cosFlowStepService$getFlowStep$1.getHighSpeedVideoFpsRanges = 0;
                            cosFlowStepService$getFlowStep$1.getHighSpeedVideoFpsRangesFor = 0;
                            cosFlowStepService$getFlowStep$1.getOutputMinFrameDurationlomOqCM = 1;
                            java.lang.Object m16511queryFlowStep3FChOw0 = cosFlowStepApi.m16511queryFlowStep3FChOw0(str3, str4, transition2, cosFlowStepService$getFlowStep$1);
                            if (m16511queryFlowStep3FChOw0 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj = m16511queryFlowStep3FChOw0;
                            defaultRaise3 = defaultRaise;
                            defaultRaise4 = defaultRaise2;
                        } catch (arrow.core.raise.RaiseCancellationException e) {
                            e = e;
                            defaultRaise.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                        } catch (java.lang.Throwable th) {
                            th = th;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = cosFlowStepService$getFlowStep$1.getHighSpeedVideoFpsRangesFor;
                        int i3 = cosFlowStepService$getFlowStep$1.getHighSpeedVideoFpsRanges;
                        int i4 = cosFlowStepService$getFlowStep$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i5 = cosFlowStepService$getFlowStep$1.getHighSpeedVideoSizes;
                        ?? r0 = (arrow.core.raise.Raise) cosFlowStepService$getFlowStep$1.getInputSizeshNQ4ISI;
                        ?? r2 = (arrow.core.raise.Raise) cosFlowStepService$getFlowStep$1.getOutputMinFrameDuration;
                        defaultRaise5 = (arrow.core.raise.DefaultRaise) cosFlowStepService$getFlowStep$1.getHighSpeedVideoSizesFor;
                        com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition transition3 = (com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition) cosFlowStepService$getFlowStep$1.getInputFormats;
                        java.lang.String str5 = (java.lang.String) cosFlowStepService$getFlowStep$1.getOutputFormats;
                        java.lang.String str6 = (java.lang.String) cosFlowStepService$getFlowStep$1.Camera2StreamConfigurationMap;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj2);
                            defaultRaise2 = r0;
                            str3 = str6;
                            defaultRaise3 = defaultRaise5;
                            transition2 = transition3;
                            obj = obj2;
                            defaultRaise4 = r2;
                            str4 = str5;
                        } catch (arrow.core.raise.RaiseCancellationException e2) {
                            e = e2;
                            defaultRaise = defaultRaise5;
                            defaultRaise.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            defaultRaise = defaultRaise5;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    }
                    firstOrNull = kotlin.collections.CollectionsKt.firstOrNull((java.util.List<? extends java.lang.Object>) ((com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowSteps) defaultRaise2.bind((arrow.core.Either) obj)).getSteps());
                    if (firstOrNull != null) {
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.onboarding.LoggerKt.log, "CosFlowStepApi returned an empty list of steps.", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16020boximpl(str3)), kotlin.TuplesKt.to("stepId", com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16029boximpl(str4)), kotlin.TuplesKt.to("transition", transition2)), null, new java.util.NoSuchElementException("CosFlowStepApi returned an empty list of steps."), 4, null);
                        defaultRaise4.raise(new com.paypal.oslo.feature.onboarding.steps.nav.domain.StepError("CosFlowStepApi returned an empty list of steps.", null, 2, null));
                        throw new kotlin.KotlinNothingValueException();
                    }
                    defaultRaise3.complete();
                    return new arrow.core.Either.Right((com.paypal.oslo.feature.onboarding.steps.nav.domain.Step) firstOrNull);
                }
            }
            firstOrNull = kotlin.collections.CollectionsKt.firstOrNull((java.util.List<? extends java.lang.Object>) ((com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowSteps) defaultRaise2.bind((arrow.core.Either) obj)).getSteps());
            if (firstOrNull != null) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e3) {
            e = e3;
            defaultRaise5 = defaultRaise3;
            defaultRaise = defaultRaise5;
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th3) {
            th = th3;
            defaultRaise5 = defaultRaise3;
            defaultRaise = defaultRaise5;
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        cosFlowStepService$getFlowStep$1 = new com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepService$getFlowStep$1(this, continuation);
        java.lang.Object obj22 = cosFlowStepService$getFlowStep$1.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cosFlowStepService$getFlowStep$1.getOutputMinFrameDurationlomOqCM;
        if (i != 0) {
        }
    }
}
