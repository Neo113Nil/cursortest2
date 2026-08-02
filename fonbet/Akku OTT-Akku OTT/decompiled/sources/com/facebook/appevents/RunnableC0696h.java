package com.facebook.appevents;

/* renamed from: com.facebook.appevents.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0696h implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (com.facebook.internal.instrument.crashshield.a.b(j.class)) {
            return;
        }
        try {
            k.b(j.c);
            j.c = new C0693e();
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, j.class);
        }
    }
}
