package com.goldenboot.saga.zone;

import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0000*\u00020\u0004¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\f\u001a\u00020\u0001*\u00020\u000b¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u000b*\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/goldenboot/saga/zone/ChipSnapshot;", "Landroid/graphics/Rect;", "growPayload", "(Lcom/goldenboot/saga/zone/ChipSnapshot;)Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "injectMetric", "(Lcom/goldenboot/saga/zone/ChipSnapshot;)Landroid/graphics/RectF;", "releaseHeader", "(Landroid/graphics/Rect;)Lcom/goldenboot/saga/zone/ChipSnapshot;", "clipOrigin", "(Landroid/graphics/RectF;)Lcom/goldenboot/saga/zone/ChipSnapshot;", "Lcom/goldenboot/saga/zone/ConnectionMemento;", "evictLayout", "(Lcom/goldenboot/saga/zone/ConnectionMemento;)Landroid/graphics/Rect;", "detachStream", "(Landroid/graphics/Rect;)Lcom/goldenboot/saga/zone/ConnectionMemento;", "ui-graphics_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MorphAllocator {
    public static final ChipSnapshot clipOrigin(RectF rectF) {
        return new ChipSnapshot(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final ConnectionMemento detachStream(Rect rect) {
        return new ConnectionMemento(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final Rect evictLayout(ConnectionMemento connectionMemento) {
        return new Rect(connectionMemento.inflateAdapter(), connectionMemento.mergeLocale(), connectionMemento.getRight(), connectionMemento.getBottom());
    }

    @ReceiverAdministrator
    public static final Rect growPayload(ChipSnapshot chipSnapshot) {
        return new Rect((int) chipSnapshot.inflateAdapter(), (int) chipSnapshot.mergeLocale(), (int) chipSnapshot.getRight(), (int) chipSnapshot.getBottom());
    }

    public static final RectF injectMetric(ChipSnapshot chipSnapshot) {
        return new RectF(chipSnapshot.inflateAdapter(), chipSnapshot.mergeLocale(), chipSnapshot.getRight(), chipSnapshot.getBottom());
    }

    public static final ChipSnapshot releaseHeader(Rect rect) {
        return new ChipSnapshot(rect.left, rect.top, rect.right, rect.bottom);
    }
}
