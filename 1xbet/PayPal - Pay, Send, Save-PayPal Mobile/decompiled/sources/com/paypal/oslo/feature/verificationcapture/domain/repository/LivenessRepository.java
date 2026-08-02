package com.paypal.oslo.feature.verificationcapture.domain.repository;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J<\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\t2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0006H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H&¢\u0006\u0004\b\u0018\u0010\u0019À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/repository/LivenessRepository;", "", "Landroid/content/Context;", "activityContext", "", "isWebFlow", "", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "entityId", "Lkotlin/Result;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/LivenessResult;", "performLivenessCheck-yxL6bBk", "(Landroid/content/Context;ZLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performLivenessCheck", "deviceKeyIdentifier", "productionKey", "licenseExpirationDate", "", "initializeSdk-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initializeSdk", "sessionToken", "setSessionToken", "(Ljava/lang/String;)V", "isSdkReady", "()Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface LivenessRepository {
    /* renamed from: initializeSdk-BWLJW6A */
    java.lang.Object mo20598initializeSdkBWLJW6A(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> continuation);

    boolean isSdkReady();

    /* renamed from: performLivenessCheck-yxL6bBk */
    java.lang.Object mo20599performLivenessCheckyxL6bBk(android.content.Context context, boolean z, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult>> continuation);

    void setSessionToken(java.lang.String sessionToken);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class DefaultImpls {
    }

    /* renamed from: performLivenessCheck-yxL6bBk$default, reason: not valid java name */
    static /* synthetic */ java.lang.Object m20616performLivenessCheckyxL6bBk$default(com.paypal.oslo.feature.verificationcapture.domain.repository.LivenessRepository livenessRepository, android.content.Context context, boolean z, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: performLivenessCheck-yxL6bBk");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return livenessRepository.mo20599performLivenessCheckyxL6bBk(context, z, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, continuation);
    }
}
