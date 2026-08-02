package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/SystemTimeProvider;", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TimeProvider;", "<init>", "()V", "", "currentTimeMillis", "()J"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SystemTimeProvider implements com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimeProvider {
    public static final int $stable = 0;

    @Override // com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimeProvider
    public final long currentTimeMillis() {
        return java.lang.System.currentTimeMillis();
    }
}
