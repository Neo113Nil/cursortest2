package com.paypal.oslo.feature.xoom.data.repository;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/xoom/data/repository/XoomRepositoryImpl;", "Lcom/paypal/oslo/feature/xoom/domain/repository/XoomRepository;", "Lcom/paypal/oslo/feature/xoom/data/XoomApiService;", "apiService", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "localeInformation", "Lcom/paypal/oslo/core/security/RiskDataProvider;", "riskDataProvider", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lcom/paypal/oslo/feature/xoom/data/XoomApiService;Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;Lcom/paypal/oslo/core/security/RiskDataProvider;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "userAccessToken", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/xoom/domain/model/UserError;", "Lcom/paypal/oslo/feature/xoom/domain/model/UserInfo;", "getUsersMe", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/xoom/domain/model/FailedPaymentInfo;", "createFailedPaymentInfo", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/xoom/data/XoomApiService;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/security/RiskDataProvider;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineDispatcher;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class XoomRepositoryImpl implements com.paypal.oslo.feature.xoom.domain.repository.XoomRepository {
    private final com.paypal.oslo.core.security.RiskDataProvider Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.CoroutineDispatcher getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.LocaleInformation getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.xoom.data.XoomApiService getHighSpeedVideoFpsRanges;
    private static final com.paypal.oslo.feature.xoom.data.repository.XoomRepositoryImpl.Companion Companion = new com.paypal.oslo.feature.xoom.data.repository.XoomRepositoryImpl.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public XoomRepositoryImpl(com.paypal.oslo.feature.xoom.data.XoomApiService xoomApiService, com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation, com.paypal.oslo.core.security.RiskDataProvider riskDataProvider, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(xoomApiService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeInformation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(riskDataProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoFpsRanges = xoomApiService;
        this.getHighSpeedVideoSizes = localeInformation;
        this.Camera2StreamConfigurationMap = riskDataProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineDispatcher;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/xoom/data/repository/XoomRepositoryImpl$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.paypal.oslo.feature.xoom.domain.repository.XoomRepository
    public final java.lang.Object getUsersMe(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.xoom.domain.model.UserError, com.paypal.oslo.feature.xoom.domain.model.UserInfo>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighResolutionOutputSizeshNQ4ISI, new com.paypal.oslo.feature.xoom.data.repository.XoomRepositoryImpl$getUsersMe$2(this, str, null), continuation);
    }

    @Override // com.paypal.oslo.feature.xoom.domain.repository.XoomRepository
    public final java.lang.Object createFailedPaymentInfo(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.xoom.domain.model.UserError, com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighResolutionOutputSizeshNQ4ISI, new com.paypal.oslo.feature.xoom.data.repository.XoomRepositoryImpl$createFailedPaymentInfo$2(this, str, null), continuation);
    }

    public static final /* synthetic */ java.lang.String access$getRiskClientMetadataId(com.paypal.oslo.feature.xoom.data.repository.XoomRepositoryImpl xoomRepositoryImpl) {
        java.lang.String clientMetadataId = com.paypal.oslo.core.security.RiskDataProvider.generateFreshDeviceRiskData$default(xoomRepositoryImpl.Camera2StreamConfigurationMap, null, null, 3, null).getClientMetadataId();
        if (clientMetadataId.length() == 0) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.xoom.LoggerKt.log, "Invalid empty value for Risk Client Metadata ID", null, null, 6, null);
        }
        return clientMetadataId;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.xoom.domain.model.UserError access$mapNetworkError(com.paypal.oslo.feature.xoom.data.repository.XoomRepositoryImpl xoomRepositoryImpl, com.paypal.oslo.core.network.http.error.NetworkError networkError) {
        if (networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
            com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) networkError;
            int code = httpError.getCode();
            if (code == 401) {
                return com.paypal.oslo.feature.xoom.domain.model.UserError.UnauthorizedError.INSTANCE;
            }
            if (code == 403) {
                com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType.Companion companion = com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType.INSTANCE;
                com.paypal.oslo.feature.xoom.data.response.ForbiddenErrorResponse forbiddenErrorResponse = (com.paypal.oslo.feature.xoom.data.response.ForbiddenErrorResponse) com.paypal.oslo.feature.xoom.extensions.XoomJsonParser.INSTANCE.fromJson(httpError.getBody(), com.paypal.oslo.feature.xoom.data.response.ForbiddenErrorResponse.INSTANCE.serializer());
                return new com.paypal.oslo.feature.xoom.domain.model.UserError.ForbiddenError(companion.fromString(forbiddenErrorResponse != null ? forbiddenErrorResponse.getErrorType() : null));
            }
            if (code == 409) {
                return com.paypal.oslo.feature.xoom.domain.model.UserError.ConflictError.INSTANCE;
            }
        }
        return com.paypal.oslo.feature.xoom.domain.model.UserError.NetworkError.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo access$mapToFailedPaymentInfo(com.paypal.oslo.feature.xoom.data.repository.XoomRepositoryImpl xoomRepositoryImpl, com.paypal.oslo.feature.xoom.data.response.FailedPaymentResponse failedPaymentResponse) {
        com.paypal.oslo.feature.xoom.data.response.UserAccountBlockedContent userAccountBlockedContent = failedPaymentResponse.getUserAccountBlockedContent();
        return new com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo(userAccountBlockedContent.getHeader(), userAccountBlockedContent.getErrorMessage(), userAccountBlockedContent.getPrimaryButtonLabel().getContent());
    }

    public static final /* synthetic */ com.paypal.oslo.feature.xoom.domain.model.UserInfo access$mapToUserInfo(com.paypal.oslo.feature.xoom.data.repository.XoomRepositoryImpl xoomRepositoryImpl, com.paypal.oslo.feature.xoom.data.response.UserResponse userResponse) {
        com.paypal.oslo.feature.xoom.data.response.User user = userResponse.getUser();
        return new com.paypal.oslo.feature.xoom.domain.model.UserInfo(user.getId(), user.getTransactionsFound(), user.getCountryOfResidence(), user.getStatus());
    }
}
