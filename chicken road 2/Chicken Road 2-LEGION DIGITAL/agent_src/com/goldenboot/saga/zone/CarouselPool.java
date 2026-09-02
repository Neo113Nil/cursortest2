package com.goldenboot.saga.zone;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class CarouselPool {
    public static ColorStateList evictLayout(Context context, int i) {
        return LayoutUploader.injectMetric(context, i);
    }

    public static Drawable growPayload(Context context, int i) {
        return WorkerSnapshot.flushSample().applyTask(context, i);
    }
}
