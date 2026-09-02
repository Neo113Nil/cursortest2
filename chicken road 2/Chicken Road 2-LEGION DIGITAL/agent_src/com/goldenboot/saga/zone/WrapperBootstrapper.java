package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\b2\b\b\u0002\u0010\u0002\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\b2\b\b\u0002\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "start", "top", "end", "bottom", "Lcom/goldenboot/saga/zone/ClickFlag;", "injectMetric", "(IIII)J", "Lcom/goldenboot/saga/zone/InsetsEdge;", "Lcom/goldenboot/saga/zone/ChannelCheckpoint;", "evictLayout", "(FFFF)Lcom/goldenboot/saga/zone/ChannelCheckpoint;", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WrapperBootstrapper {
    public static /* synthetic */ long detachStream(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        return injectMetric(i, i2, i3, i4);
    }

    public static final DpTouchBoundsExpansion evictLayout(float f, float f2, float f3, float f4) {
        return new DpTouchBoundsExpansion(f, f2, f3, f4, true, null);
    }

    public static /* synthetic */ DpTouchBoundsExpansion growPayload(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = InsetsEdge.drawField(0);
        }
        if ((i & 2) != 0) {
            f2 = InsetsEdge.drawField(0);
        }
        if ((i & 4) != 0) {
            f3 = InsetsEdge.drawField(0);
        }
        if ((i & 8) != 0) {
            f4 = InsetsEdge.drawField(0);
        }
        return evictLayout(f, f2, f3, f4);
    }

    public static final long injectMetric(int i, int i2, int i3, int i4) {
        if (!(i >= 0 && i < 32768)) {
            PagerBridge.flushSample("Start must be in the range of 0 .. 32767");
        }
        if (!(i2 >= 0 && i2 < 32768)) {
            PagerBridge.flushSample("Top must be in the range of 0 .. 32767");
        }
        if (!(i3 >= 0 && i3 < 32768)) {
            PagerBridge.flushSample("End must be in the range of 0 .. 32767");
        }
        if (!(i4 >= 0 && i4 < 32768)) {
            PagerBridge.flushSample("Bottom must be in the range of 0 .. 32767");
        }
        return ClickFlag.releaseHeader(ClickFlag.INSTANCE.releaseHeader(i, i2, i3, i4, true));
    }
}
