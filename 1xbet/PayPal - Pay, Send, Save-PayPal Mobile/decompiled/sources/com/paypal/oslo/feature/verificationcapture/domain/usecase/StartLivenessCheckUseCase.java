package com.paypal.oslo.feature.verificationcapture.domain.usecase;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J<\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/StartLivenessCheckUseCase;", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/repository/LivenessRepository;", "livenessRepository", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/domain/repository/LivenessRepository;)V", "Landroid/content/Context;", "activityContext", "", "isWebFlow", "", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "entityId", "Lkotlin/Result;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/LivenessResult;", "invoke-yxL6bBk", "(Landroid/content/Context;ZLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/verificationcapture/domain/repository/LivenessRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class StartLivenessCheckUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.verificationcapture.domain.repository.LivenessRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public StartLivenessCheckUseCase(com.paypal.oslo.feature.verificationcapture.domain.repository.LivenessRepository livenessRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(livenessRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = livenessRepository;
    }

    /* renamed from: invoke-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m20619invokeyxL6bBk$default(com.paypal.oslo.feature.verificationcapture.domain.usecase.StartLivenessCheckUseCase startLivenessCheckUseCase, android.content.Context context, boolean z, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return startLivenessCheckUseCase.m20620invokeyxL6bBk(context, z, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: invoke-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object m20620invokeyxL6bBk(android.content.Context context, boolean z, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult>> continuation) {
        com.paypal.oslo.feature.verificationcapture.domain.usecase.StartLivenessCheckUseCase$invoke$1 startLivenessCheckUseCase$invoke$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.verificationcapture.domain.usecase.StartLivenessCheckUseCase$invoke$1) {
            startLivenessCheckUseCase$invoke$1 = (com.paypal.oslo.feature.verificationcapture.domain.usecase.StartLivenessCheckUseCase$invoke$1) continuation;
            if ((startLivenessCheckUseCase$invoke$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                startLivenessCheckUseCase$invoke$1.getHighSpeedVideoFpsRanges -= 2147483648;
                com.paypal.oslo.feature.verificationcapture.domain.usecase.StartLivenessCheckUseCase$invoke$1 startLivenessCheckUseCase$invoke$12 = startLivenessCheckUseCase$invoke$1;
                java.lang.Object obj = startLivenessCheckUseCase$invoke$12.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = startLivenessCheckUseCase$invoke$12.getHighSpeedVideoFpsRanges;
                if (i == 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = startLivenessCheckUseCase$invoke$12.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return ((kotlin.Result) obj).getCamera2StreamConfigurationMap();
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.oslo.feature.verificationcapture.domain.repository.LivenessRepository livenessRepository = this.getHighResolutionOutputSizeshNQ4ISI;
                startLivenessCheckUseCase$invoke$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(context);
                startLivenessCheckUseCase$invoke$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                startLivenessCheckUseCase$invoke$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                startLivenessCheckUseCase$invoke$12.getHighSpeedVideoFpsRangesFor = z;
                startLivenessCheckUseCase$invoke$12.getHighSpeedVideoFpsRanges = 1;
                java.lang.Object mo20599performLivenessCheckyxL6bBk = livenessRepository.mo20599performLivenessCheckyxL6bBk(context, z, str, str2, startLivenessCheckUseCase$invoke$12);
                return mo20599performLivenessCheckyxL6bBk == coroutine_suspended ? coroutine_suspended : mo20599performLivenessCheckyxL6bBk;
            }
        }
        startLivenessCheckUseCase$invoke$1 = new com.paypal.oslo.feature.verificationcapture.domain.usecase.StartLivenessCheckUseCase$invoke$1(this, continuation);
        com.paypal.oslo.feature.verificationcapture.domain.usecase.StartLivenessCheckUseCase$invoke$1 startLivenessCheckUseCase$invoke$122 = startLivenessCheckUseCase$invoke$1;
        java.lang.Object obj2 = startLivenessCheckUseCase$invoke$122.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = startLivenessCheckUseCase$invoke$122.getHighSpeedVideoFpsRanges;
        if (i == 0) {
        }
    }
}
