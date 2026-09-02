package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÂ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u000b*\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/goldenboot/saga/zone/SystemReporter;", "Lcom/goldenboot/saga/zone/BackgroundCollection;", "", "density", "fontScale", "Lcom/goldenboot/saga/zone/RailProvider;", "converter", "<init>", "(FFLcom/goldenboot/saga/zone/RailProvider;)V", "storeCharset", "()Lcom/goldenboot/saga/zone/RailProvider;", "Lcom/goldenboot/saga/zone/InsetsEdge;", "Lcom/goldenboot/saga/zone/PooledStatus;", "filterPayload", "(F)J", "packPackage", "(J)F", "popBlueprint", "()F", "injectConstraint", "queryModel", "(FFLcom/goldenboot/saga/zone/RailProvider;)Lcom/goldenboot/saga/zone/SystemReporter;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "reduceScope", "F", "getDensity", "notifyMessage", "formatPosition", "connectPatch", "Lcom/goldenboot/saga/zone/RailProvider;", "ui-unit"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.goldenboot.saga.zone.SystemReporter, reason: from toString */
/* loaded from: classes.dex */
final /* data */ class DensityWithConverter implements BackgroundCollection {

    /* renamed from: connectPatch, reason: from kotlin metadata and from toString */
    private final RailProvider converter;

    /* renamed from: notifyMessage, reason: from kotlin metadata and from toString */
    private final float fontScale;

    /* renamed from: reduceScope, reason: from kotlin metadata and from toString */
    private final float density;

    public DensityWithConverter(float f, float f2, RailProvider railProvider) {
        this.density = f;
        this.fontScale = f2;
        this.converter = railProvider;
    }

    /* renamed from: storeCharset, reason: from getter */
    private final RailProvider getConverter() {
        return this.converter;
    }

    public static /* synthetic */ DensityWithConverter unlockMessage(DensityWithConverter densityWithConverter, float f, float f2, RailProvider railProvider, int i, Object obj) {
        if ((i & 1) != 0) {
            f = densityWithConverter.density;
        }
        if ((i & 2) != 0) {
            f2 = densityWithConverter.fontScale;
        }
        if ((i & 4) != 0) {
            railProvider = densityWithConverter.converter;
        }
        return densityWithConverter.queryModel(f, f2, railProvider);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DensityWithConverter)) {
            return false;
        }
        DensityWithConverter densityWithConverter = (DensityWithConverter) other;
        return Float.compare(this.density, densityWithConverter.density) == 0 && Float.compare(this.fontScale, densityWithConverter.fontScale) == 0 && Intrinsics.areEqual(this.converter, densityWithConverter.converter);
    }

    @Override // com.goldenboot.saga.zone.SequenceFacilitator
    public long filterPayload(float f) {
        return FrameSaver.connectJob(this.converter.evictLayout(f));
    }

    @Override // com.goldenboot.saga.zone.SequenceFacilitator
    /* renamed from: formatPosition, reason: from getter */
    public float getFontScale() {
        return this.fontScale;
    }

    @Override // com.goldenboot.saga.zone.BackgroundCollection
    public float getDensity() {
        return this.density;
    }

    public int hashCode() {
        return (((Float.hashCode(this.density) * 31) + Float.hashCode(this.fontScale)) * 31) + this.converter.hashCode();
    }

    public final float injectConstraint() {
        return this.fontScale;
    }

    @Override // com.goldenboot.saga.zone.SequenceFacilitator
    public float packPackage(long j) {
        if (AlarmEmitter.flushSample(PooledStatus.peekRevision(j), AlarmEmitter.INSTANCE.growPayload())) {
            return InsetsEdge.drawField(this.converter.growPayload(PooledStatus.serializeOffset(j)));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public final float popBlueprint() {
        return this.density;
    }

    public final DensityWithConverter queryModel(float density, float fontScale, RailProvider converter) {
        return new DensityWithConverter(density, fontScale, converter);
    }

    public String toString() {
        return "DensityWithConverter(density=" + this.density + ", fontScale=" + this.fontScale + ", converter=" + this.converter + ')';
    }
}
