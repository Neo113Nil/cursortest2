package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\nR\u0012\u0010\u0014\u001a\u00020\f8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0016\u001a\u00020\f8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0012\u0010\u0018\u001a\u00020\f8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0019"}, d2 = {"Lcom/goldenboot/saga/zone/PanelStep;", "", "", "value", "growPayload", "(I)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "evictLayout", "I", "updateTimer", "flushSample", "(I)Z", "dispatchedToAPointerInputModifier", "clipOrigin", "anyMovementConsumed", "releaseHeader", "anyChangeConsumed", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PanelStep {

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final int value;

    private /* synthetic */ PanelStep(int i) {
        this.value = i;
    }

    public static int applyTask(int i) {
        return Integer.hashCode(i);
    }

    public static final boolean clipOrigin(int i) {
        return (i & 2) != 0;
    }

    public static final boolean detachStream(int i, int i2) {
        return i == i2;
    }

    public static final /* synthetic */ PanelStep evictLayout(int i) {
        return new PanelStep(i);
    }

    public static final boolean flushSample(int i) {
        return (i & 1) != 0;
    }

    public static boolean injectMetric(int i, Object obj) {
        return (obj instanceof PanelStep) && i == ((PanelStep) obj).getValue();
    }

    public static String popBlueprint(int i) {
        return "ProcessResult(value=" + i + ')';
    }

    public static final boolean releaseHeader(int i) {
        return (i & 4) != 0;
    }

    /* renamed from: drawField, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        return injectMetric(this.value, other);
    }

    public int hashCode() {
        return applyTask(this.value);
    }

    public String toString() {
        return popBlueprint(this.value);
    }

    public final int updateTimer() {
        return this.value;
    }

    public static int growPayload(int i) {
        return i;
    }
}
