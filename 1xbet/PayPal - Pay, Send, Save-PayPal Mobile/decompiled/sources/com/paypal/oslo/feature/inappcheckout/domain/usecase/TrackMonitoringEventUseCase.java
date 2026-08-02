package com.paypal.oslo.feature.inappcheckout.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/TrackMonitoringEventUseCase;", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/TrackLatencyRepository;", "trackLatencyRepository", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/repository/TrackLatencyRepository;)V", "", "eventName", "", "timestampMillis", "", "invoke", "(Ljava/lang/String;Ljava/lang/Long;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/TrackLatencyRepository;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TrackMonitoringEventUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.repository.TrackLatencyRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public TrackMonitoringEventUseCase(com.paypal.oslo.feature.inappcheckout.domain.repository.TrackLatencyRepository trackLatencyRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackLatencyRepository, "");
        this.getHighSpeedVideoSizes = trackLatencyRepository;
    }

    public static /* synthetic */ void invoke$default(com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase trackMonitoringEventUseCase, java.lang.String str, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        trackMonitoringEventUseCase.invoke(str, l);
    }

    public final void invoke(java.lang.String eventName, java.lang.Long timestampMillis) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "");
        this.getHighSpeedVideoSizes.recordEvent(eventName, timestampMillis);
    }
}
