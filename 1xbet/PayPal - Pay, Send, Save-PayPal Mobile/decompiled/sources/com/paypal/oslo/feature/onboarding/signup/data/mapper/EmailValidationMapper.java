package com.paypal.oslo.feature.onboarding.signup.data.mapper;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u000f2\n\u0010\u000e\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/data/mapper/EmailValidationMapper;", "Lcom/paypal/oslo/feature/onboarding/signup/domain/mapper/ResponseMapper;", "Lcom/paypal/oslo/feature/onboarding/graphql/GetEmailValidationQuery$PublicCredentialMetadata;", "Lcom/paypal/oslo/feature/onboarding/signup/data/mapper/GetEmailValidationResponse;", "Lcom/paypal/oslo/feature/onboarding/signup/email/domain/model/EmailCheckResult;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/mapper/ErrorMapper;", "errorMapper", "<init>", "(Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/mapper/ErrorMapper;)V", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "callError", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "mapToApiCallError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Larrow/core/Either;", "mapResponse", "(Lcom/paypal/oslo/feature/onboarding/graphql/GetEmailValidationQuery$PublicCredentialMetadata;)Larrow/core/Either;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/mapper/ErrorMapper;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EmailValidationMapper implements com.paypal.oslo.feature.onboarding.signup.domain.mapper.ResponseMapper<com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.PublicCredentialMetadata, com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailCheckResult> {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public EmailValidationMapper(com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper errorMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMapper, "");
        this.Camera2StreamConfigurationMap = errorMapper;
    }

    @Override // com.paypal.oslo.feature.onboarding.signup.domain.mapper.ResponseMapper
    public final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError mapToApiCallError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        return this.Camera2StreamConfigurationMap.mapToApiCallError(callError);
    }

    @Override // com.paypal.oslo.feature.onboarding.signup.domain.mapper.ResponseMapper
    public final arrow.core.Either<com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailCheckResult> mapResponse(com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.PublicCredentialMetadata data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return com.paypal.oslo.feature.onboarding.signup.data.mapper.EmailValidationMapperKt.mapToEmailCheckResult(data);
    }
}
