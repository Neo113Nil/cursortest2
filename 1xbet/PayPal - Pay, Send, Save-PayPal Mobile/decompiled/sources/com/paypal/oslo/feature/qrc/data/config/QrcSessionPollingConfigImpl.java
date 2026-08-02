package com.paypal.oslo.feature.qrc.data.config;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/qrc/data/config/QrcSessionPollingConfigImpl;", "Lcom/paypal/oslo/feature/qrc/domain/config/QrcSessionPollingConfig;", "<init>", "()V", "", "getPollingIntervalMs", "()J", "pollingIntervalMs", "", "getPollingApiMaxRetries", "()I", "pollingApiMaxRetries"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class QrcSessionPollingConfigImpl implements com.paypal.oslo.feature.qrc.domain.config.QrcSessionPollingConfig {
    public static final int $stable = 0;

    @Override // com.paypal.oslo.feature.qrc.domain.config.QrcSessionPollingConfig
    public final int getPollingApiMaxRetries() {
        return 10;
    }

    @Override // com.paypal.oslo.feature.qrc.domain.config.QrcSessionPollingConfig
    public final long getPollingIntervalMs() {
        return 1000L;
    }

    @javax.inject.Inject
    public QrcSessionPollingConfigImpl() {
    }
}
