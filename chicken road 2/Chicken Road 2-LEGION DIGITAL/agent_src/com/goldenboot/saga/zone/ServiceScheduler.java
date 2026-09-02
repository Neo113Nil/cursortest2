package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0090\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0090\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0010\u001a\u00020\u000f2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0090\u0002¢\u0006\u0004\b\u0010\u0010\u0011R&\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0005¨\u0006\u0016"}, d2 = {"Lcom/goldenboot/saga/zone/ServiceScheduler;", "Lcom/goldenboot/saga/zone/ServerCallback;", "Lcom/goldenboot/saga/zone/SurfaceDecoder;", "element", "<init>", "(Lcom/goldenboot/saga/zone/SurfaceDecoder;)V", "T", "Lcom/goldenboot/saga/zone/VibrationParser;", "key", "value", "Lcom/goldenboot/saga/zone/DpadBuilder;", "injectMetric", "(Lcom/goldenboot/saga/zone/VibrationParser;Ljava/lang/Object;)V", "growPayload", "(Lcom/goldenboot/saga/zone/VibrationParser;)Ljava/lang/Object;", "", "evictLayout", "(Lcom/goldenboot/saga/zone/VibrationParser;)Z", "Lcom/goldenboot/saga/zone/SurfaceDecoder;", "detachStream", "()Lcom/goldenboot/saga/zone/SurfaceDecoder;", "releaseHeader", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ServiceScheduler extends ServerCallback {
    public static final int injectMetric = 8;

    /* renamed from: growPayload, reason: from kotlin metadata */
    private SurfaceDecoder<?> element;

    public ServiceScheduler(SurfaceDecoder<?> surfaceDecoder) {
        super(null);
        this.element = surfaceDecoder;
    }

    public final SurfaceDecoder<?> detachStream() {
        return this.element;
    }

    @Override // com.goldenboot.saga.zone.ServerCallback
    public boolean evictLayout(VibrationParser<?> key) {
        return key == this.element.getKey();
    }

    @Override // com.goldenboot.saga.zone.ServerCallback
    public <T> T growPayload(VibrationParser<T> key) {
        if (!(key == this.element.getKey())) {
            PagerBridge.applyTask("Check failed.");
        }
        return (T) this.element.getValue();
    }

    @Override // com.goldenboot.saga.zone.ServerCallback
    public <T> void injectMetric(VibrationParser<T> key, T value) {
        throw new IllegalStateException("Set is not allowed on a backwards compat provider");
    }

    public final void releaseHeader(SurfaceDecoder<?> surfaceDecoder) {
        this.element = surfaceDecoder;
    }
}
