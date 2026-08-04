package io.sentry.clientreport;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface IClientReportStorage {
    void addCount(ClientReportKey clientReportKey, Long l7);

    List<DiscardedEvent> resetCountsAndGet();
}
