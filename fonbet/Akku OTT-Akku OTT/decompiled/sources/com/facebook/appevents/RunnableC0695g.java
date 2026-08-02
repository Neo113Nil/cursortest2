package com.facebook.appevents;

import com.facebook.appevents.l;
import com.facebook.appevents.p;

/* renamed from: com.facebook.appevents.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0695g implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ RunnableC0695g(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                if (!com.facebook.internal.instrument.crashshield.a.b(j.class)) {
                    try {
                        j.e = null;
                        l.Companion.getClass();
                        p.Companion.getClass();
                        if (p.a.c() != l.b.b) {
                            j.d(w.b);
                            break;
                        }
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, j.class);
                        return;
                    }
                }
                break;
            default:
                if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.ml.d.class)) {
                    try {
                        com.facebook.appevents.integrity.c cVar = com.facebook.appevents.integrity.c.a;
                        if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.integrity.c.class)) {
                            try {
                                com.facebook.appevents.integrity.c.b = true;
                                com.facebook.appevents.integrity.c.c = com.facebook.internal.m.b("FBSDKFeatureIntegritySample", com.facebook.w.b(), false);
                                break;
                            } catch (Throwable th2) {
                                com.facebook.internal.instrument.crashshield.a.a(th2, com.facebook.appevents.integrity.c.class);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        com.facebook.internal.instrument.crashshield.a.a(th3, com.facebook.appevents.ml.d.class);
                    }
                }
                break;
        }
    }
}
