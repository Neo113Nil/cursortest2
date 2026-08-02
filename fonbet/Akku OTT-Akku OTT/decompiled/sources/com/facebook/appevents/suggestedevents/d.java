package com.facebook.appevents.suggestedevents;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (com.facebook.internal.instrument.crashshield.a.b(e.class)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = e.b;
            if (atomicBoolean.get()) {
                return;
            }
            atomicBoolean.set(true);
            e.a.b();
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, e.class);
        }
    }
}
