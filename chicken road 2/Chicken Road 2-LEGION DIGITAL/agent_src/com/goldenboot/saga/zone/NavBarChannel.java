package com.goldenboot.saga.zone;

import android.os.SystemClock;
import android.view.MotionEvent;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a/\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\t\u0010\b\u001a-\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\f\u0010\r\u001a7\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/goldenboot/saga/zone/DrawableCustodian;", "Lcom/goldenboot/saga/zone/RuntimeHeap;", "offset", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "Lcom/goldenboot/saga/zone/DpadBuilder;", "block", "detachStream", "(Lcom/goldenboot/saga/zone/DrawableCustodian;JLcom/goldenboot/saga/zone/TouchRecord;)V", "injectMetric", "", "nowMillis", "evictLayout", "(JLcom/goldenboot/saga/zone/TouchRecord;)V", "", "cancel", "releaseHeader", "(Lcom/goldenboot/saga/zone/DrawableCustodian;JLcom/goldenboot/saga/zone/TouchRecord;Z)V", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavBarChannel {
    public static final void detachStream(DrawableCustodian drawableCustodian, long j, TouchRecord touchRecord) {
        releaseHeader(drawableCustodian, j, touchRecord, false);
    }

    public static final void evictLayout(long j, TouchRecord touchRecord) {
        MotionEvent obtain = MotionEvent.obtain(j, j, 3, 0.0f, 0.0f, 0);
        obtain.setSource(0);
        touchRecord.invoke(obtain);
        obtain.recycle();
    }

    public static /* synthetic */ void growPayload(long j, TouchRecord touchRecord, int i, Object obj) {
        if ((i & 1) != 0) {
            j = SystemClock.uptimeMillis();
        }
        evictLayout(j, touchRecord);
    }

    public static final void injectMetric(DrawableCustodian drawableCustodian, long j, TouchRecord touchRecord) {
        releaseHeader(drawableCustodian, j, touchRecord, true);
    }

    private static final void releaseHeader(DrawableCustodian drawableCustodian, long j, TouchRecord touchRecord, boolean z) {
        MotionEvent applyTask = drawableCustodian.applyTask();
        if (applyTask == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = applyTask.getAction();
        if (z) {
            applyTask.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        applyTask.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        touchRecord.invoke(applyTask);
        applyTask.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        applyTask.setAction(action);
    }
}
