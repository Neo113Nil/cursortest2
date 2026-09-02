package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/goldenboot/saga/zone/ObserverNegotiator;", "Lcom/goldenboot/saga/zone/LayerTunnel;", "Lcom/goldenboot/saga/zone/ContainerSource;", "value", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/goldenboot/saga/zone/ShapeSender;", "size", "Lcom/goldenboot/saga/zone/ScopedProcess;", "p", "", "alpha", "Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "(JLcom/goldenboot/saga/zone/ScopedProcess;F)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "injectMetric", "J", "()J", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.goldenboot.saga.zone.ObserverNegotiator, reason: from toString */
/* loaded from: classes.dex */
public final class SolidColor extends LayerTunnel {

    /* renamed from: injectMetric, reason: from kotlin metadata and from toString */
    private final long value;

    public /* synthetic */ SolidColor(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SolidColor) && ContainerSource.drawScope(this.value, ((SolidColor) other).value);
    }

    @Override // com.goldenboot.saga.zone.LayerTunnel
    public void evictLayout(long size, ScopedProcess p, float alpha) {
        long gatherAdapter;
        p.detachStream(1.0f);
        if (alpha == 1.0f) {
            gatherAdapter = this.value;
        } else {
            long j = this.value;
            gatherAdapter = ContainerSource.gatherAdapter(j, ContainerSource.findTask(j) * alpha, 0.0f, 0.0f, 0.0f, 14, null);
        }
        p.serializeTask(gatherAdapter);
        if (p.getInternalShader() != null) {
            p.purgeMetric(null);
        }
    }

    public int hashCode() {
        return ContainerSource.unlockMessage(this.value);
    }

    /* renamed from: injectMetric, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    public String toString() {
        return "SolidColor(value=" + ((Object) ContainerSource.bindBody(this.value)) + ')';
    }

    private SolidColor(long j) {
        super(null);
        this.value = j;
    }
}
