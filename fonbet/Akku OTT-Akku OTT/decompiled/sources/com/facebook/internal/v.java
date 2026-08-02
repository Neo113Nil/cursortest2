package com.facebook.internal;

import com.facebook.internal.w;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final /* synthetic */ class v implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        AtomicBoolean atomicBoolean = w.c;
        if (com.facebook.internal.instrument.crashshield.a.b(w.class)) {
            return;
        }
        try {
            try {
                Iterator it = w.b.iterator();
                while (it.hasNext()) {
                    ((w.e) it.next()).a(true);
                }
            } finally {
                atomicBoolean.set(false);
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, w.class);
        }
    }
}
