package com.paypal.oslo.feature.onboarding.signup.data.mapper;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/data/mapper/ConfirmationMapperImpl;", "Lcom/paypal/oslo/feature/onboarding/signup/domain/mapper/ResponseMapper;", "Lcom/paypal/oslo/feature/onboarding/signup/data/model/OtpResponse;", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/ValidationResponse;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/mapper/ErrorMapper;", "errorMapper", "<init>", "(Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/mapper/ErrorMapper;)V", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "callError", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "mapToApiCallError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Larrow/core/Either;", "mapResponse", "(Lcom/paypal/oslo/feature/onboarding/signup/data/model/OtpResponse;)Larrow/core/Either;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/mapper/ErrorMapper;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ConfirmationMapperImpl implements com.paypal.oslo.feature.onboarding.signup.domain.mapper.ResponseMapper<com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse<?>, com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse> {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public ConfirmationMapperImpl(com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper errorMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMapper, "");
        this.getHighSpeedVideoFpsRangesFor = errorMapper;
    }

    @Override // com.paypal.oslo.feature.onboarding.signup.domain.mapper.ResponseMapper
    public final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError mapToApiCallError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        return this.getHighSpeedVideoFpsRangesFor.mapToApiCallError(callError);
    }

    @Override // com.paypal.oslo.feature.onboarding.signup.domain.mapper.ResponseMapper
    public final arrow.core.Either<com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse> mapResponse(com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse<?> data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return com.paypal.oslo.feature.onboarding.signup.data.mapper.ConfirmationMapperImplKt.mapToResponse(data);
    }
}
