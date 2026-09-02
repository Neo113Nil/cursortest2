package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/goldenboot/saga/zone/PinchReducer;", "", "Lcom/goldenboot/saga/zone/PooledStatus;", "width", "height", "Lcom/goldenboot/saga/zone/WaveMolder;", "placeholderVerticalAlign", "<init>", "(JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "evictLayout", "(JJI)Lcom/goldenboot/saga/zone/PinchReducer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "releaseHeader", "()J", "growPayload", "injectMetric", "I", "detachStream", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.goldenboot.saga.zone.PinchReducer, reason: from toString */
/* loaded from: classes.dex */
public final class Placeholder {
    public static final int detachStream = 0;

    /* renamed from: evictLayout, reason: from kotlin metadata and from toString */
    private final long width;

    /* renamed from: growPayload, reason: from kotlin metadata and from toString */
    private final long height;

    /* renamed from: injectMetric, reason: from kotlin metadata and from toString */
    private final int placeholderVerticalAlign;

    public /* synthetic */ Placeholder(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, i);
    }

    public static /* synthetic */ Placeholder growPayload(Placeholder placeholder, long j, long j2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = placeholder.width;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = placeholder.height;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            i = placeholder.placeholderVerticalAlign;
        }
        return placeholder.evictLayout(j3, j4, i);
    }

    /* renamed from: detachStream, reason: from getter */
    public final int getPlaceholderVerticalAlign() {
        return this.placeholderVerticalAlign;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Placeholder)) {
            return false;
        }
        Placeholder placeholder = (Placeholder) other;
        return PooledStatus.popBlueprint(this.width, placeholder.width) && PooledStatus.popBlueprint(this.height, placeholder.height) && WaveMolder.drawField(this.placeholderVerticalAlign, placeholder.placeholderVerticalAlign);
    }

    public final Placeholder evictLayout(long width, long height, int placeholderVerticalAlign) {
        return new Placeholder(width, height, placeholderVerticalAlign, null);
    }

    public int hashCode() {
        return (((PooledStatus.reduceScope(this.width) * 31) + PooledStatus.reduceScope(this.height)) * 31) + WaveMolder.connectJob(this.placeholderVerticalAlign);
    }

    /* renamed from: injectMetric, reason: from getter */
    public final long getHeight() {
        return this.height;
    }

    /* renamed from: releaseHeader, reason: from getter */
    public final long getWidth() {
        return this.width;
    }

    public String toString() {
        return "Placeholder(width=" + ((Object) PooledStatus.purgeNode(this.width)) + ", height=" + ((Object) PooledStatus.purgeNode(this.height)) + ", placeholderVerticalAlign=" + ((Object) WaveMolder.peekRevision(this.placeholderVerticalAlign)) + ')';
    }

    private Placeholder(long j, long j2, int i) {
        this.width = j;
        this.height = j2;
        this.placeholderVerticalAlign = i;
        if (PooledStatus.connectJob(j) == 0) {
            EmitterUpgrade.releaseHeader("width cannot be TextUnit.Unspecified");
        }
        if (PooledStatus.connectJob(j2) == 0) {
            EmitterUpgrade.releaseHeader("height cannot be TextUnit.Unspecified");
        }
    }
}
