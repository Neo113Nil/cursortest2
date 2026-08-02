package com.paypal.oslo.feature.cryptocurrency.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/data/repository/mock/MockCryptoRolloverRepository;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/rollover/CryptoRolloverRepository;", "<init>", "()V", "", "claimCode", "dateOfBirth", "partner", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/rollover/ClaimRolloverResult;", "createRollover", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MockCryptoRolloverRepository implements com.paypal.oslo.feature.cryptocurrency.domain.repository.rollover.CryptoRolloverRepository {
    public static final int $stable = 0;
    private static final com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoRolloverRepository.Companion Companion = new com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoRolloverRepository.Companion(null);

    @javax.inject.Inject
    public MockCryptoRolloverRepository() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.cryptocurrency.LoggerKt.log, "Using Mock Crypto Rollover Repository", null, null, 6, null);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/data/repository/mock/MockCryptoRolloverRepository$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.domain.repository.rollover.CryptoRolloverRepository
    public final java.lang.Object createRollover(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.rollover.ClaimRolloverResult>> continuation) {
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.cryptocurrency.LoggerKt.log;
        java.lang.String take = kotlin.text.StringsKt.take(str, 4);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(take);
        sb.append("****");
        com.paypal.android.logger.Logger.d$default(logger, "Creating rollover claim (mock)", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("claimCode", sb.toString()), kotlin.TuplesKt.to("partner", str3)), null, 4, null);
        java.lang.String obj = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        java.lang.String upperCase = kotlin.text.StringsKt.take(obj, 8).toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        com.paypal.oslo.feature.cryptocurrency.domain.model.rollover.ClaimRolloverResult claimRolloverResult = new com.paypal.oslo.feature.cryptocurrency.domain.model.rollover.ClaimRolloverResult("RO-".concat(java.lang.String.valueOf(upperCase)));
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.cryptocurrency.LoggerKt.log, "Successfully created mock rollover", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("rolloverId", claimRolloverResult.getId())), null, 4, null);
        return arrow.core.EitherKt.right(claimRolloverResult);
    }
}
