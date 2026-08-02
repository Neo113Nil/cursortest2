package com.paypal.oslo.feature.taptopay.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/mapper/ResponseMapper;", "", "<init>", "()V", "Lcom/payair/model/Response;", "sdk", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/setup/SdkSetupError;", "", "sdkToDomainEither", "(Lcom/payair/model/Response;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ResponseMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.taptopay.data.mapper.ResponseMapper INSTANCE = new com.paypal.oslo.feature.taptopay.data.mapper.ResponseMapper();

    private ResponseMapper() {
    }

    public final arrow.core.Either<com.paypal.oslo.feature.taptopay.domain.model.setup.SdkSetupError, kotlin.Unit> sdkToDomainEither(com.payair.model.Response sdk) {
        java.lang.String obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdk, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            if (!(sdk instanceof com.payair.model.Response.Success)) {
                if (!(sdk instanceof com.payair.model.Response.Error)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (!((com.payair.model.Response.Error) sdk).getNetworkErrors().isEmpty()) {
                    obj = kotlin.collections.CollectionsKt.joinToString$default(((com.payair.model.Response.Error) sdk).getNetworkErrors(), ", ", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.mapper.ResponseMapper$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.taptopay.data.mapper.ResponseMapper.$r8$lambda$AmHKFuXQM2slTkA4fDArePf1VOg((com.payair.model.NetworkError) obj2);
                        }
                    }, 30, null);
                } else {
                    int errorCode = ((com.payair.model.Response.Error) sdk).getErrorCode();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialization error occurred with code: ");
                    sb.append(errorCode);
                    obj = sb.toString();
                }
                defaultRaise2.raise(new com.paypal.oslo.feature.taptopay.domain.model.setup.SdkSetupError.InitializationError(obj, java.lang.Integer.valueOf(((com.payair.model.Response.Error) sdk).getErrorCode())));
                throw new kotlin.KotlinNothingValueException();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            defaultRaise.complete();
            return new arrow.core.Either.Right(unit);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$AmHKFuXQM2slTkA4fDArePf1VOg(com.payair.model.NetworkError networkError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkError, "");
        java.lang.String description = networkError.getDescription();
        if (description == null) {
            description = com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR;
        }
        java.lang.String errorCode = networkError.getErrorCode();
        if (errorCode == null) {
            errorCode = com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.NA;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(description);
        sb.append(" (Code: ");
        sb.append(errorCode);
        sb.append(")");
        return sb.toString();
    }
}
