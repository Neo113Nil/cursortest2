package com.paypal.oslo.feature.cryptocurrency.domain.usecase.rollover;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0086B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rollover/CreateCryptoRolloverUseCase;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/rollover/CryptoRolloverRepository;", "repository", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rollover/DateOfBirthFormatter;", "dateFormatter", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/rollover/CryptoRolloverRepository;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rollover/DateOfBirthFormatter;)V", "", "claimCode", "dateOfBirth", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/rollover/ClaimRolloverResult;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/rollover/CryptoRolloverRepository;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rollover/DateOfBirthFormatter;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CreateCryptoRolloverUseCase {
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.rollover.DateOfBirthFormatter getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.repository.rollover.CryptoRolloverRepository getHighSpeedVideoFpsRangesFor;
    private static final com.paypal.oslo.feature.cryptocurrency.domain.usecase.rollover.CreateCryptoRolloverUseCase.Companion Companion = new com.paypal.oslo.feature.cryptocurrency.domain.usecase.rollover.CreateCryptoRolloverUseCase.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public CreateCryptoRolloverUseCase(com.paypal.oslo.feature.cryptocurrency.domain.repository.rollover.CryptoRolloverRepository cryptoRolloverRepository, com.paypal.oslo.feature.cryptocurrency.domain.usecase.rollover.DateOfBirthFormatter dateOfBirthFormatter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoRolloverRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateOfBirthFormatter, "");
        this.getHighSpeedVideoFpsRangesFor = cryptoRolloverRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = dateOfBirthFormatter;
    }

    public final java.lang.Object invoke(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.rollover.ClaimRolloverResult>> continuation) {
        java.lang.String str3 = str;
        if (kotlin.text.StringsKt.isBlank(str3)) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.InvalidInput("Claim code cannot be empty"));
        }
        java.lang.String format = this.getHighResolutionOutputSizeshNQ4ISI.format(str2);
        if (format == null) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.InvalidInput("Invalid date of birth format. Expected MMddyyyy"));
        }
        return this.getHighSpeedVideoFpsRangesFor.createRollover(kotlin.text.StringsKt.trim(str3).toString(), format, "CELSIUS", continuation);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rollover/CreateCryptoRolloverUseCase$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
