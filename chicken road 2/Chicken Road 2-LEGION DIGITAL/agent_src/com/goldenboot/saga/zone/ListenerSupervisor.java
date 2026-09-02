package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.AlarmHook;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/goldenboot/saga/zone/ListenerSupervisor;", "Lcom/goldenboot/saga/zone/ListLauncher;", "Lcom/goldenboot/saga/zone/AlarmHook$BounceHandler;", "loader", "<init>", "(Lcom/goldenboot/saga/zone/AlarmHook$BounceHandler;)V", "Lcom/goldenboot/saga/zone/AlarmHook;", "font", "", "evictLayout", "(Lcom/goldenboot/saga/zone/AlarmHook;)Ljava/lang/Object;", "growPayload", "(Lcom/goldenboot/saga/zone/AlarmHook;Lcom/goldenboot/saga/zone/ServiceRegulator;)Ljava/lang/Object;", "Lcom/goldenboot/saga/zone/AlarmHook$BounceHandler;", "detachStream", "()Lcom/goldenboot/saga/zone/AlarmHook$BounceHandler;", "Ljava/lang/Object;", "injectMetric", "()Ljava/lang/Object;", "cacheKey", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ListenerSupervisor implements ListLauncher {
    public static final int injectMetric = 8;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final AlarmHook.BounceHandler loader;

    /* renamed from: growPayload, reason: from kotlin metadata */
    private final Object cacheKey = new Object();

    public ListenerSupervisor(AlarmHook.BounceHandler bounceHandler) {
        this.loader = bounceHandler;
    }

    /* renamed from: detachStream, reason: from getter */
    public final AlarmHook.BounceHandler getLoader() {
        return this.loader;
    }

    @Override // com.goldenboot.saga.zone.ListLauncher
    public Object evictLayout(AlarmHook font) {
        return this.loader.evictLayout(font);
    }

    @Override // com.goldenboot.saga.zone.ListLauncher
    public Object growPayload(AlarmHook alarmHook, ServiceRegulator serviceRegulator) {
        return this.loader.evictLayout(alarmHook);
    }

    @Override // com.goldenboot.saga.zone.ListLauncher
    /* renamed from: injectMetric, reason: from getter */
    public Object getCacheKey() {
        return this.cacheKey;
    }
}
