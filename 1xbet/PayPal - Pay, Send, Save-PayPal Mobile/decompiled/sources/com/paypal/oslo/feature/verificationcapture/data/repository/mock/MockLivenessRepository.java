package com.paypal.oslo.feature.verificationcapture.data.repository.mock;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ.\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/data/repository/mock/MockLivenessRepository;", "Lcom/paypal/oslo/feature/verificationcapture/domain/repository/LivenessRepository;", "<init>", "()V", "Landroid/content/Context;", "activityContext", "", "isWebFlow", "", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "entityId", "Lkotlin/Result;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/LivenessResult;", "performLivenessCheck-yxL6bBk", "(Landroid/content/Context;ZLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performLivenessCheck", "deviceKeyIdentifier", "productionKey", "licenseExpirationDate", "", "initializeSdk-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initializeSdk", "sessionToken", "setSessionToken", "(Ljava/lang/String;)V", "isSdkReady", "()Z", "getHighSpeedVideoFpsRanges", "Z", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MockLivenessRepository implements com.paypal.oslo.feature.verificationcapture.domain.repository.LivenessRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public MockLivenessRepository() {
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.repository.LivenessRepository
    /* renamed from: performLivenessCheck-yxL6bBk */
    public final java.lang.Object mo20599performLivenessCheckyxL6bBk(android.content.Context context, boolean z, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult>> continuation) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        java.lang.String obj = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return kotlin.Result.m23436constructorimpl(new com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Success(obj, "mock_face_scan_data_base64", kotlin.collections.CollectionsKt.emptyList(), null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("mock", "true"), kotlin.TuplesKt.to("is_web_flow", java.lang.String.valueOf(z)), kotlin.TuplesKt.to("timestamp", java.lang.String.valueOf(java.lang.System.currentTimeMillis()))), 0, null, 104, null));
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.repository.LivenessRepository
    /* renamed from: initializeSdk-BWLJW6A */
    public final java.lang.Object mo20598initializeSdkBWLJW6A(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> continuation) {
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        return kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.repository.LivenessRepository
    /* renamed from: isSdkReady, reason: from getter */
    public final boolean getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.repository.LivenessRepository
    public final void setSessionToken(java.lang.String sessionToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionToken, "");
    }
}
