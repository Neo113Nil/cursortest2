package com.paypal.oslo.feature.inappcheckout.domain.repository;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/repository/TrackLatencyRepository;", "", "", "eventName", "", "timestampMillis", "", "recordEvent", "(Ljava/lang/String;Ljava/lang/Long;)V", "clearEvents", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface TrackLatencyRepository {
    void clearEvents();

    void recordEvent(java.lang.String eventName, java.lang.Long timestampMillis);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ void recordEvent$default(com.paypal.oslo.feature.inappcheckout.domain.repository.TrackLatencyRepository trackLatencyRepository, java.lang.String str, java.lang.Long l, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recordEvent");
        }
        if ((i & 2) != 0) {
            l = null;
        }
        trackLatencyRepository.recordEvent(str, l);
    }
}
