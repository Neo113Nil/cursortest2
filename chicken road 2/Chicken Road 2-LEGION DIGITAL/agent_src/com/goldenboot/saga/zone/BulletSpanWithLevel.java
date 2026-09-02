package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/goldenboot/saga/zone/EndpointCheckpoint;", "", "Lcom/goldenboot/saga/zone/HapticArranger;", "bullet", "", "indentationLevel", "start", "<init>", "(Lcom/goldenboot/saga/zone/HapticArranger;II)V", "evictLayout", "()Lcom/goldenboot/saga/zone/HapticArranger;", "growPayload", "()I", "injectMetric", "detachStream", "(Lcom/goldenboot/saga/zone/HapticArranger;II)Lcom/goldenboot/saga/zone/EndpointCheckpoint;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/goldenboot/saga/zone/HapticArranger;", "clipOrigin", "I", "flushSample", "updateTimer", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.goldenboot.saga.zone.EndpointCheckpoint, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class BulletSpanWithLevel {
    public static final int detachStream = 8;

    /* renamed from: evictLayout, reason: from kotlin metadata and from toString */
    private final Bullet bullet;

    /* renamed from: growPayload, reason: from kotlin metadata and from toString */
    private final int indentationLevel;

    /* renamed from: injectMetric, reason: from kotlin metadata and from toString */
    private final int start;

    public BulletSpanWithLevel(Bullet bullet, int i, int i2) {
        this.bullet = bullet;
        this.indentationLevel = i;
        this.start = i2;
    }

    public static /* synthetic */ BulletSpanWithLevel releaseHeader(BulletSpanWithLevel bulletSpanWithLevel, Bullet bullet, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            bullet = bulletSpanWithLevel.bullet;
        }
        if ((i3 & 2) != 0) {
            i = bulletSpanWithLevel.indentationLevel;
        }
        if ((i3 & 4) != 0) {
            i2 = bulletSpanWithLevel.start;
        }
        return bulletSpanWithLevel.detachStream(bullet, i, i2);
    }

    /* renamed from: clipOrigin, reason: from getter */
    public final Bullet getBullet() {
        return this.bullet;
    }

    public final BulletSpanWithLevel detachStream(Bullet bullet, int indentationLevel, int start) {
        return new BulletSpanWithLevel(bullet, indentationLevel, start);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BulletSpanWithLevel)) {
            return false;
        }
        BulletSpanWithLevel bulletSpanWithLevel = (BulletSpanWithLevel) other;
        return Intrinsics.areEqual(this.bullet, bulletSpanWithLevel.bullet) && this.indentationLevel == bulletSpanWithLevel.indentationLevel && this.start == bulletSpanWithLevel.start;
    }

    public final Bullet evictLayout() {
        return this.bullet;
    }

    /* renamed from: flushSample, reason: from getter */
    public final int getIndentationLevel() {
        return this.indentationLevel;
    }

    public final int growPayload() {
        return this.indentationLevel;
    }

    public int hashCode() {
        return (((this.bullet.hashCode() * 31) + Integer.hashCode(this.indentationLevel)) * 31) + Integer.hashCode(this.start);
    }

    /* renamed from: injectMetric, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    public String toString() {
        return "BulletSpanWithLevel(bullet=" + this.bullet + ", indentationLevel=" + this.indentationLevel + ", start=" + this.start + ')';
    }

    public final int updateTimer() {
        return this.start;
    }
}
