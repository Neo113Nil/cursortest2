package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/goldenboot/saga/zone/ListLauncher;", "", "Lcom/goldenboot/saga/zone/AlarmHook;", "font", "evictLayout", "(Lcom/goldenboot/saga/zone/AlarmHook;)Ljava/lang/Object;", "growPayload", "(Lcom/goldenboot/saga/zone/AlarmHook;Lcom/goldenboot/saga/zone/ServiceRegulator;)Ljava/lang/Object;", "injectMetric", "()Ljava/lang/Object;", "cacheKey", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ListLauncher {
    Object evictLayout(AlarmHook font);

    Object growPayload(AlarmHook alarmHook, ServiceRegulator serviceRegulator);

    Object injectMetric();
}
