package com.goldenboot.saga.zone;

import android.view.PointerIcon;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\f\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u001a\u0010\u000e\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\r\u0010\u000b\"\u001a\u0010\u0010\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u001a\u0010\u0012\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0013"}, d2 = {"Landroid/view/PointerIcon;", "pointerIcon", "Lcom/goldenboot/saga/zone/CarouselRing;", "growPayload", "(Landroid/view/PointerIcon;)Lcom/goldenboot/saga/zone/CarouselRing;", "", "pointerIconType", "evictLayout", "(I)Lcom/goldenboot/saga/zone/CarouselRing;", "Lcom/goldenboot/saga/zone/CarouselRing;", "detachStream", "()Lcom/goldenboot/saga/zone/CarouselRing;", "pointerIconDefault", "injectMetric", "pointerIconCrosshair", "clipOrigin", "pointerIconText", "releaseHeader", "pointerIconHand", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImageBus {
    private static final CarouselRing evictLayout = new AndroidPointerIcon(1000);
    private static final CarouselRing growPayload = new AndroidPointerIcon(1007);
    private static final CarouselRing injectMetric = new AndroidPointerIcon(1008);
    private static final CarouselRing detachStream = new AndroidPointerIcon(1002);

    public static final CarouselRing clipOrigin() {
        return injectMetric;
    }

    public static final CarouselRing detachStream() {
        return evictLayout;
    }

    public static final CarouselRing evictLayout(int i) {
        return new AndroidPointerIcon(i);
    }

    public static final CarouselRing growPayload(PointerIcon pointerIcon) {
        return new AndroidPointerIcon(pointerIcon);
    }

    public static final CarouselRing injectMetric() {
        return growPayload;
    }

    public static final CarouselRing releaseHeader() {
        return detachStream;
    }
}
