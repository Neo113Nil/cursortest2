package com.paypal.oslo.feature.verificationcapture.data.repository;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/data/repository/LivenessRepositoryImpl;", "Lcom/paypal/oslo/feature/verificationcapture/domain/repository/LivenessRepository;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/verificationcapture/data/datasource/FaceTecLivenessDataSource;", "faceTecDataSource", "<init>", "(Landroid/content/Context;Lcom/paypal/oslo/feature/verificationcapture/data/datasource/FaceTecLivenessDataSource;)V", "activityContext", "", "isWebFlow", "", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "entityId", "Lkotlin/Result;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/LivenessResult;", "performLivenessCheck-yxL6bBk", "(Landroid/content/Context;ZLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performLivenessCheck", "deviceKeyIdentifier", "productionKey", "licenseExpirationDate", "", "initializeSdk-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initializeSdk", "sessionToken", "setSessionToken", "(Ljava/lang/String;)V", "isSdkReady", "()Z", "getHighSpeedVideoSizes", "Landroid/content/Context;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/verificationcapture/data/datasource/FaceTecLivenessDataSource;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LivenessRepositoryImpl implements com.paypal.oslo.feature.verificationcapture.domain.repository.LivenessRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource getHighSpeedVideoFpsRangesFor;
    private final android.content.Context getHighSpeedVideoSizes;

    @javax.inject.Inject
    public LivenessRepositoryImpl(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource faceTecLivenessDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(faceTecLivenessDataSource, "");
        this.getHighSpeedVideoSizes = context;
        this.getHighSpeedVideoFpsRangesFor = faceTecLivenessDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.verificationcapture.domain.repository.LivenessRepository
    /* renamed from: performLivenessCheck-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo20599performLivenessCheckyxL6bBk(android.content.Context context, boolean z, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult>> continuation) {
        com.paypal.oslo.feature.verificationcapture.data.repository.LivenessRepositoryImpl$performLivenessCheck$1 livenessRepositoryImpl$performLivenessCheck$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.verificationcapture.data.repository.LivenessRepositoryImpl$performLivenessCheck$1) {
            livenessRepositoryImpl$performLivenessCheck$1 = (com.paypal.oslo.feature.verificationcapture.data.repository.LivenessRepositoryImpl$performLivenessCheck$1) continuation;
            if ((livenessRepositoryImpl$performLivenessCheck$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                livenessRepositoryImpl$performLivenessCheck$1.Camera2StreamConfigurationMap -= 2147483648;
                com.paypal.oslo.feature.verificationcapture.data.repository.LivenessRepositoryImpl$performLivenessCheck$1 livenessRepositoryImpl$performLivenessCheck$12 = livenessRepositoryImpl$performLivenessCheck$1;
                java.lang.Object obj = livenessRepositoryImpl$performLivenessCheck$12.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = livenessRepositoryImpl$performLivenessCheck$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource faceTecLivenessDataSource = this.getHighSpeedVideoFpsRangesFor;
                    livenessRepositoryImpl$performLivenessCheck$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(context);
                    livenessRepositoryImpl$performLivenessCheck$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    livenessRepositoryImpl$performLivenessCheck$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    livenessRepositoryImpl$performLivenessCheck$12.getHighResolutionOutputSizeshNQ4ISI = z;
                    livenessRepositoryImpl$performLivenessCheck$12.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource.performLivenessCheck$verification_capture_prodRelease$default(faceTecLivenessDataSource, context, z, str, str2, null, livenessRepositoryImpl$performLivenessCheck$12, 16, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = livenessRepositoryImpl$performLivenessCheck$12.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult livenessResult = (com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult) ((arrow.core.Either.Right) either).getValue();
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    return kotlin.Result.m23436constructorimpl(livenessResult);
                }
                if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError verificationError = (com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError) ((arrow.core.Either.Left) either).getValue();
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    return kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception(verificationError.getMessage(), verificationError.getThrowable())));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        livenessRepositoryImpl$performLivenessCheck$1 = new com.paypal.oslo.feature.verificationcapture.data.repository.LivenessRepositoryImpl$performLivenessCheck$1(this, continuation);
        com.paypal.oslo.feature.verificationcapture.data.repository.LivenessRepositoryImpl$performLivenessCheck$1 livenessRepositoryImpl$performLivenessCheck$122 = livenessRepositoryImpl$performLivenessCheck$1;
        java.lang.Object obj2 = livenessRepositoryImpl$performLivenessCheck$122.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = livenessRepositoryImpl$performLivenessCheck$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.verificationcapture.domain.repository.LivenessRepository
    /* renamed from: initializeSdk-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo20598initializeSdkBWLJW6A(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.verificationcapture.data.repository.LivenessRepositoryImpl$initializeSdk$1 livenessRepositoryImpl$initializeSdk$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.verificationcapture.data.repository.LivenessRepositoryImpl$initializeSdk$1) {
            livenessRepositoryImpl$initializeSdk$1 = (com.paypal.oslo.feature.verificationcapture.data.repository.LivenessRepositoryImpl$initializeSdk$1) continuation;
            if ((livenessRepositoryImpl$initializeSdk$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                livenessRepositoryImpl$initializeSdk$1.getHighSpeedVideoSizes -= 2147483648;
                com.paypal.oslo.feature.verificationcapture.data.repository.LivenessRepositoryImpl$initializeSdk$1 livenessRepositoryImpl$initializeSdk$12 = livenessRepositoryImpl$initializeSdk$1;
                java.lang.Object obj = livenessRepositoryImpl$initializeSdk$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = livenessRepositoryImpl$initializeSdk$12.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource faceTecLivenessDataSource = this.getHighSpeedVideoFpsRangesFor;
                    android.content.Context context = this.getHighSpeedVideoSizes;
                    livenessRepositoryImpl$initializeSdk$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    livenessRepositoryImpl$initializeSdk$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    livenessRepositoryImpl$initializeSdk$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    livenessRepositoryImpl$initializeSdk$12.getHighSpeedVideoSizes = 1;
                    obj = faceTecLivenessDataSource.initialize(context, str, str2, str3, livenessRepositoryImpl$initializeSdk$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    return kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
                }
                if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError verificationError = (com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError) ((arrow.core.Either.Left) either).getValue();
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    return kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception(verificationError.getMessage(), verificationError.getThrowable())));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        livenessRepositoryImpl$initializeSdk$1 = new com.paypal.oslo.feature.verificationcapture.data.repository.LivenessRepositoryImpl$initializeSdk$1(this, continuation);
        com.paypal.oslo.feature.verificationcapture.data.repository.LivenessRepositoryImpl$initializeSdk$1 livenessRepositoryImpl$initializeSdk$122 = livenessRepositoryImpl$initializeSdk$1;
        java.lang.Object obj2 = livenessRepositoryImpl$initializeSdk$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = livenessRepositoryImpl$initializeSdk$122.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.repository.LivenessRepository
    public final void setSessionToken(java.lang.String sessionToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionToken, "");
        this.getHighSpeedVideoFpsRangesFor.setSessionToken(sessionToken);
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.repository.LivenessRepository
    /* renamed from: isSdkReady */
    public final boolean getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighSpeedVideoFpsRangesFor.getGetHighResolutionOutputSizeshNQ4ISI();
    }
}
