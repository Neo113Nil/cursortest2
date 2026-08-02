package com.facebook.internal.instrument;

import com.facebook.S;
import com.facebook.internal.C0715k;
import com.facebook.w;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements C0715k.a {
    @Override // com.facebook.internal.C0715k.a
    public final void b(boolean z) {
        if (z) {
            AtomicBoolean atomicBoolean = com.facebook.internal.instrument.anrreport.e.a;
            synchronized (com.facebook.internal.instrument.anrreport.e.class) {
                if (com.facebook.internal.instrument.crashshield.a.b(com.facebook.internal.instrument.anrreport.e.class)) {
                    return;
                }
                try {
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.internal.instrument.anrreport.e.class);
                }
                if (com.facebook.internal.instrument.anrreport.e.a.getAndSet(true)) {
                    return;
                }
                w wVar = w.a;
                if (S.c()) {
                    com.facebook.internal.instrument.anrreport.e.a();
                }
                int i = com.facebook.internal.instrument.anrreport.b.a;
                if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.internal.instrument.anrreport.b.class)) {
                    try {
                        com.facebook.internal.instrument.anrreport.b.b.scheduleWithFixedDelay(com.facebook.internal.instrument.anrreport.b.d, 0L, 500L, TimeUnit.MILLISECONDS);
                    } catch (Throwable th2) {
                        com.facebook.internal.instrument.crashshield.a.a(th2, com.facebook.internal.instrument.anrreport.b.class);
                    }
                }
            }
        }
    }
}
