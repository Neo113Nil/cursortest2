package com.paypal.oslo.feature.smartroute.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/usecase/ValidateDistributionStateUseCase;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionAccount;", "accounts", "Larrow/core/Either;", "", "", "invoke", "(Ljava/util/List;)Larrow/core/Either;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ValidateDistributionStateUseCase {
    public static final int $stable = 0;
    private static final com.paypal.oslo.feature.smartroute.domain.usecase.ValidateDistributionStateUseCase.Companion Companion = new com.paypal.oslo.feature.smartroute.domain.usecase.ValidateDistributionStateUseCase.Companion(null);

    @java.lang.Deprecated
    public static final int PERCENTAGE_TOTAL = 100;

    @javax.inject.Inject
    public ValidateDistributionStateUseCase() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/usecase/ValidateDistributionStateUseCase$Companion;", "", "<init>", "()V", "", "PERCENTAGE_TOTAL", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final arrow.core.Either<java.lang.String, kotlin.Unit> invoke(java.util.List<com.paypal.oslo.feature.smartroute.domain.model.DistributionAccount> accounts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accounts, "");
        int i = 0;
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            java.util.Iterator<T> it = accounts.iterator();
            while (it.hasNext()) {
                i += kotlin.math.MathKt.roundToInt(((com.paypal.oslo.feature.smartroute.domain.model.DistributionAccount) it.next()).getPercentage());
            }
            if (i == 100) {
                java.util.List<com.paypal.oslo.feature.smartroute.domain.model.DistributionAccount> list = accounts;
                if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                    java.util.Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (((com.paypal.oslo.feature.smartroute.domain.model.DistributionAccount) it2.next()).getPercentage() < 0.0f) {
                            defaultRaise2.raise("Negative percentages not allowed");
                            throw new kotlin.KotlinNothingValueException();
                        }
                    }
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                defaultRaise.complete();
                return new arrow.core.Either.Right(unit);
            }
            defaultRaise2.raise("Distribution must total 100%");
            throw new kotlin.KotlinNothingValueException();
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }
}
