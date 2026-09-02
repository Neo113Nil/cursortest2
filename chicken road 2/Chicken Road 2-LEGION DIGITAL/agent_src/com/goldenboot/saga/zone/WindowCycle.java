package com.goldenboot.saga.zone;

import android.text.Editable;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class WindowCycle extends Editable.Factory {
    public static final Object evictLayout = new Object();
    public static volatile Editable.Factory growPayload;
    public static Class injectMetric;

    public WindowCycle() {
        try {
            injectMetric = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, WindowCycle.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (growPayload == null) {
            synchronized (evictLayout) {
                try {
                    if (growPayload == null) {
                        growPayload = new WindowCycle();
                    }
                } finally {
                }
            }
        }
        return growPayload;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = injectMetric;
        return cls != null ? SlotMulticaster.injectMetric(cls, charSequence) : super.newEditable(charSequence);
    }
}
