package com.paypal.oslo.feature.smartroute.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/usecase/CalculateSourcePercentageUseCase;", "", "<init>", "()V", "", "", "sliderPercentages", "invoke", "(Ljava/util/List;)F"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CalculateSourcePercentageUseCase {
    public static final int $stable = 0;

    @javax.inject.Inject
    public CalculateSourcePercentageUseCase() {
    }

    public final float invoke(java.util.List<java.lang.Float> sliderPercentages) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sliderPercentages, "");
        double d = 0.0d;
        while (sliderPercentages.iterator().hasNext()) {
            d += ((java.lang.Number) r5.next()).floatValue();
        }
        return 100.0f - ((float) d);
    }
}
