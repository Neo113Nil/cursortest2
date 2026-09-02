package com.goldenboot.saga.zone;

import android.view.MotionEvent;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class ScaleInvoker {
    public static boolean evictLayout(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
