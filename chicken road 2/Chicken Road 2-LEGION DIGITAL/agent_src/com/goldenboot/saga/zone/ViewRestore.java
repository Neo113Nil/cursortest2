package com.goldenboot.saga.zone;

import android.content.Context;
import com.goldenboot.saga.zone.AlarmHook;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/goldenboot/saga/zone/ViewRestore;", "Lcom/goldenboot/saga/zone/ListLauncher;", "Lcom/goldenboot/saga/zone/AlarmHook$BounceHandler;", "loader", "Landroid/content/Context;", "context", "<init>", "(Lcom/goldenboot/saga/zone/AlarmHook$BounceHandler;Landroid/content/Context;)V", "Lcom/goldenboot/saga/zone/AlarmHook;", "font", "", "evictLayout", "(Lcom/goldenboot/saga/zone/AlarmHook;)Ljava/lang/Object;", "growPayload", "(Lcom/goldenboot/saga/zone/AlarmHook;Lcom/goldenboot/saga/zone/ServiceRegulator;)Ljava/lang/Object;", "Lcom/goldenboot/saga/zone/AlarmHook$BounceHandler;", "detachStream", "()Lcom/goldenboot/saga/zone/AlarmHook$BounceHandler;", "Landroid/content/Context;", "injectMetric", "Ljava/lang/Object;", "()Ljava/lang/Object;", "cacheKey", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ViewRestore implements ListLauncher {
    public static final int detachStream = 8;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final AlarmHook.BounceHandler loader;

    /* renamed from: growPayload, reason: from kotlin metadata */
    private final Context context;

    /* renamed from: injectMetric, reason: from kotlin metadata */
    private final Object cacheKey = new Object();

    public ViewRestore(AlarmHook.BounceHandler bounceHandler, Context context) {
        this.loader = bounceHandler;
        this.context = context;
    }

    /* renamed from: detachStream, reason: from getter */
    public final AlarmHook.BounceHandler getLoader() {
        return this.loader;
    }

    @Override // com.goldenboot.saga.zone.ListLauncher
    public Object evictLayout(AlarmHook font) {
        if (!(font instanceof LifecycleBackup)) {
            return this.loader.evictLayout(font);
        }
        LifecycleBackup lifecycleBackup = (LifecycleBackup) font;
        return lifecycleBackup.getTypefaceLoader().evictLayout(this.context, lifecycleBackup);
    }

    @Override // com.goldenboot.saga.zone.ListLauncher
    public Object growPayload(AlarmHook alarmHook, ServiceRegulator serviceRegulator) {
        if (!(alarmHook instanceof LifecycleBackup)) {
            return this.loader.evictLayout(alarmHook);
        }
        LifecycleBackup lifecycleBackup = (LifecycleBackup) alarmHook;
        return lifecycleBackup.getTypefaceLoader().growPayload(this.context, lifecycleBackup, serviceRegulator);
    }

    @Override // com.goldenboot.saga.zone.ListLauncher
    /* renamed from: injectMetric, reason: from getter */
    public Object getCacheKey() {
        return this.cacheKey;
    }
}
