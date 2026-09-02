package com.goldenboot.saga.zone;

import android.content.Context;
import android.graphics.Typeface;
import com.goldenboot.saga.zone.SharedMonitor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b'\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/goldenboot/saga/zone/LifecycleBackup;", "Lcom/goldenboot/saga/zone/AlarmHook;", "Lcom/goldenboot/saga/zone/NativeArbitrator;", "loadingStrategy", "Lcom/goldenboot/saga/zone/LifecycleBackup$ActivityMutator;", "typefaceLoader", "Lcom/goldenboot/saga/zone/SharedMonitor$EndpointList;", "variationSettings", "<init>", "(ILcom/goldenboot/saga/zone/LifecycleBackup$ActivityMutator;Lcom/goldenboot/saga/zone/SharedMonitor$EndpointList;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(ILcom/goldenboot/saga/zone/LifecycleBackup$ActivityMutator;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "injectMetric", "I", "evictLayout", "()I", "detachStream", "Lcom/goldenboot/saga/zone/LifecycleBackup$ActivityMutator;", "()Lcom/goldenboot/saga/zone/LifecycleBackup$ActivityMutator;", "releaseHeader", "Lcom/goldenboot/saga/zone/SharedMonitor$EndpointList;", "()Lcom/goldenboot/saga/zone/SharedMonitor$EndpointList;", "ActivityMutator", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class LifecycleBackup implements AlarmHook {
    public static final int clipOrigin = 0;

    /* renamed from: detachStream, reason: from kotlin metadata */
    private final ActivityMutator typefaceLoader;

    /* renamed from: injectMetric, reason: from kotlin metadata */
    private final int loadingStrategy;

    /* renamed from: releaseHeader, reason: from kotlin metadata */
    private final SharedMonitor.EndpointList variationSettings;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/goldenboot/saga/zone/LifecycleBackup$ActivityMutator;", "", "Landroid/content/Context;", "context", "Lcom/goldenboot/saga/zone/LifecycleBackup;", "font", "Landroid/graphics/Typeface;", "evictLayout", "(Landroid/content/Context;Lcom/goldenboot/saga/zone/LifecycleBackup;)Landroid/graphics/Typeface;", "growPayload", "(Landroid/content/Context;Lcom/goldenboot/saga/zone/LifecycleBackup;Lcom/goldenboot/saga/zone/ServiceRegulator;)Ljava/lang/Object;", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ActivityMutator {
        Typeface evictLayout(Context context, LifecycleBackup font);

        Object growPayload(Context context, LifecycleBackup lifecycleBackup, ServiceRegulator serviceRegulator);
    }

    public /* synthetic */ LifecycleBackup(int i, ActivityMutator activityMutator, SharedMonitor.EndpointList endpointList, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, activityMutator, endpointList);
    }

    /* renamed from: detachStream, reason: from getter */
    public final ActivityMutator getTypefaceLoader() {
        return this.typefaceLoader;
    }

    @Override // com.goldenboot.saga.zone.AlarmHook
    /* renamed from: evictLayout, reason: from getter */
    public final int getLoadingStrategy() {
        return this.loadingStrategy;
    }

    /* renamed from: releaseHeader, reason: from getter */
    public final SharedMonitor.EndpointList getVariationSettings() {
        return this.variationSettings;
    }

    @ReceiverAdministrator
    public /* synthetic */ LifecycleBackup(int i, ActivityMutator activityMutator, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, activityMutator);
    }

    private LifecycleBackup(int i, ActivityMutator activityMutator, SharedMonitor.EndpointList endpointList) {
        this.loadingStrategy = i;
        this.typefaceLoader = activityMutator;
        this.variationSettings = endpointList;
    }

    private LifecycleBackup(int i, ActivityMutator activityMutator) {
        this(i, activityMutator, new SharedMonitor.EndpointList(new SharedMonitor.ActivityMutator[0]), null);
    }
}
