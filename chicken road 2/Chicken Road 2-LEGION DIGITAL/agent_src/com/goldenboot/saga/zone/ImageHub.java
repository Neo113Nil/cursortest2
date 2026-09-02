package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\t\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\u0001\u0010\b¨\u0006\n"}, d2 = {"Lcom/goldenboot/saga/zone/TouchSnapshot;", "evictLayout", "Lcom/goldenboot/saga/zone/TouchSnapshot;", "growPayload", "()Lcom/goldenboot/saga/zone/TouchSnapshot;", "GlobalTypefaceRequestCache", "Lcom/goldenboot/saga/zone/ColumnEncoder;", "Lcom/goldenboot/saga/zone/ColumnEncoder;", "()Lcom/goldenboot/saga/zone/ColumnEncoder;", "GlobalAsyncTypefaceCache", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImageHub {
    private static final TouchSnapshot evictLayout = new TouchSnapshot();
    private static final ColumnEncoder growPayload = new ColumnEncoder();

    public static final ColumnEncoder evictLayout() {
        return growPayload;
    }

    public static final TouchSnapshot growPayload() {
        return evictLayout;
    }
}
