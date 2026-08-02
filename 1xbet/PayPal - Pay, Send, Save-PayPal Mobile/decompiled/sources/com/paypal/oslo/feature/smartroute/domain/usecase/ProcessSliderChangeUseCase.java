package com.paypal.oslo.feature.smartroute.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/usecase/ProcessSliderChangeUseCase;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/smartroute/utils/SourceState;", "sourceState", "Larrow/core/Either;", "", "invoke", "(Lcom/paypal/oslo/feature/smartroute/utils/SourceState;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ProcessSliderChangeUseCase {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ProcessSliderChangeUseCase() {
    }

    public final arrow.core.Either<java.lang.String, com.paypal.oslo.feature.smartroute.utils.SourceState> invoke(com.paypal.oslo.feature.smartroute.utils.SourceState sourceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceState, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            com.paypal.oslo.feature.smartroute.utils.SliderProcessReturn processSliderChange = com.paypal.oslo.feature.smartroute.utils.SliderUtils.INSTANCE.processSliderChange(sourceState);
            if (processSliderChange instanceof com.paypal.oslo.feature.smartroute.utils.SliderProcessReturn.Success) {
                com.paypal.oslo.feature.smartroute.utils.SourceState processMaxLimitSliders = com.paypal.oslo.feature.smartroute.utils.SliderUtils.INSTANCE.processMaxLimitSliders((com.paypal.oslo.feature.smartroute.utils.SliderProcessReturn.Success) processSliderChange);
                defaultRaise.complete();
                return new arrow.core.Either.Right(processMaxLimitSliders);
            }
            defaultRaise2.raise("Distribution exceeds allowed limits");
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
