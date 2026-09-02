package com.goldenboot.saga.zone;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u0010J\u0018\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0086\b¢\u0006\u0004\b\u001a\u0010\u0010J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0011H\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001e\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nH\u0086\n¢\u0006\u0004\b\u001e\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010\u0003J\u0018\u0010 \u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0086\b¢\u0006\u0004\b \u0010\u0010J\u0015\u0010!\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\u0010R$\u0010%\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010&R\u0012\u0010)\u001a\u00020\u00048Æ\u0002¢\u0006\u0006\u001a\u0004\b(\u0010$¨\u0006*"}, d2 = {"Lcom/goldenboot/saga/zone/WindowScheduler;", "", "<init>", "()V", "", "minSize", "", "peekRevision", "(I)[J", "index", "Lcom/goldenboot/saga/zone/WatcherAnalyzer;", "clipOrigin", "(I)J", "pointerId", "", "drawField", "(J)Z", "", "pointerIdValue", "popBlueprint", "connectJob", "(I)Z", "applyTask", "()Z", "value", "evictLayout", "growPayload", "Lcom/goldenboot/saga/zone/DpadBuilder;", "serializeOffset", "(IJ)V", "reduceScope", "injectMetric", "releaseHeader", "detachStream", "I", "updateTimer", "()I", "size", "[J", "internalArray", "flushSample", "lastIndex", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WindowScheduler {
    public static final int injectMetric = 8;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private int size;

    /* renamed from: growPayload, reason: from kotlin metadata */
    private long[] internalArray = new long[2];

    private final long[] peekRevision(int minSize) {
        long[] jArr = this.internalArray;
        long[] copyOf = Arrays.copyOf(jArr, Math.max(minSize, jArr.length * 2));
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        this.internalArray = copyOf;
        return copyOf;
    }

    public final boolean applyTask() {
        return this.size == 0;
    }

    public final long clipOrigin(int index) {
        return WatcherAnalyzer.growPayload(this.internalArray[index]);
    }

    public final boolean connectJob(int index) {
        int i = this.size;
        if (index >= i) {
            return false;
        }
        int i2 = i - 1;
        while (index < i2) {
            long[] jArr = this.internalArray;
            int i3 = index + 1;
            jArr[index] = jArr[i3];
            index = i3;
        }
        this.size--;
        return true;
    }

    public final boolean detachStream(long pointerIdValue) {
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.internalArray[i2] == pointerIdValue) {
                return true;
            }
        }
        return false;
    }

    public final boolean drawField(long pointerId) {
        return popBlueprint(pointerId);
    }

    public final boolean evictLayout(long value) {
        if (detachStream(value)) {
            return false;
        }
        serializeOffset(this.size, value);
        return true;
    }

    public final int flushSample() {
        return getSize() - 1;
    }

    public final boolean growPayload(long pointerId) {
        return evictLayout(pointerId);
    }

    public final void injectMetric() {
        this.size = 0;
    }

    public final boolean popBlueprint(long pointerIdValue) {
        int i = this.size;
        int i2 = 0;
        while (i2 < i) {
            if (pointerIdValue == this.internalArray[i2]) {
                int i3 = this.size - 1;
                while (i2 < i3) {
                    long[] jArr = this.internalArray;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.size--;
                return true;
            }
            i2++;
        }
        return false;
    }

    public final void reduceScope(int index, long pointerId) {
        serializeOffset(index, pointerId);
    }

    public final boolean releaseHeader(long pointerId) {
        return detachStream(pointerId);
    }

    public final void serializeOffset(int index, long value) {
        long[] jArr = this.internalArray;
        if (index >= jArr.length) {
            jArr = peekRevision(index + 1);
        }
        jArr[index] = value;
        if (index >= this.size) {
            this.size = index + 1;
        }
    }

    /* renamed from: updateTimer, reason: from getter */
    public final int getSize() {
        return this.size;
    }
}
