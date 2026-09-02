package com.goldenboot.saga.zone;

import android.view.MotionEvent;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/goldenboot/saga/zone/HeaderCustodian;", "", "", "uptime", "", "Lcom/goldenboot/saga/zone/BridgePhase;", "pointers", "Landroid/view/MotionEvent;", "motionEvent", "<init>", "(JLjava/util/List;Landroid/view/MotionEvent;)V", "evictLayout", "J", "injectMetric", "()J", "growPayload", "Ljava/util/List;", "()Ljava/util/List;", "Landroid/view/MotionEvent;", "()Landroid/view/MotionEvent;", "detachStream", "(Landroid/view/MotionEvent;)V", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HeaderCustodian {
    public static final int detachStream = 8;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final long uptime;

    /* renamed from: growPayload, reason: from kotlin metadata */
    private final List<PointerInputEventData> pointers;

    /* renamed from: injectMetric, reason: from kotlin metadata */
    private MotionEvent motionEvent;

    public HeaderCustodian(long j, List<PointerInputEventData> list, MotionEvent motionEvent) {
        this.uptime = j;
        this.pointers = list;
        this.motionEvent = motionEvent;
    }

    public final void detachStream(MotionEvent motionEvent) {
        this.motionEvent = motionEvent;
    }

    /* renamed from: evictLayout, reason: from getter */
    public final MotionEvent getMotionEvent() {
        return this.motionEvent;
    }

    public final List<PointerInputEventData> growPayload() {
        return this.pointers;
    }

    /* renamed from: injectMetric, reason: from getter */
    public final long getUptime() {
        return this.uptime;
    }
}
