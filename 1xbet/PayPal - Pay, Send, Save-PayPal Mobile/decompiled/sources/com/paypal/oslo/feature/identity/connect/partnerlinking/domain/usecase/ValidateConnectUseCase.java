package com.paypal.oslo.feature.identity.connect.partnerlinking.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/usecase/ValidateConnectUseCase;", "", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/repository/ValidateConnectRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/repository/ValidateConnectRepository;)V", "", "type", "partnerName", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_CONTEXT_ID, "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectError;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectResult;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/repository/ValidateConnectRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ValidateConnectUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.connect.partnerlinking.domain.repository.ValidateConnectRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public ValidateConnectUseCase(com.paypal.oslo.feature.identity.connect.partnerlinking.domain.repository.ValidateConnectRepository validateConnectRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateConnectRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = validateConnectRepository;
    }

    public final java.lang.Object invoke(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError, com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectResult>> continuation) {
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = kotlin.TuplesKt.to("type", str);
        java.lang.String str4 = str3;
        pairArr[1] = kotlin.TuplesKt.to("hasFlowContextId", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(str4.length() > 0));
        kotlin.collections.MapsKt.mapOf(pairArr);
        kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("partnerName", str2));
        return this.getHighResolutionOutputSizeshNQ4ISI.validateConnect(new com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectRequest(kotlin.text.StringsKt.trim(str).toString(), kotlin.text.StringsKt.trim(str2).toString(), kotlin.text.StringsKt.trim(str4).toString()), continuation);
    }
}
