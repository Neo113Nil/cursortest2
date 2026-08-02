package com.facebook.appevents.ml;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (com.facebook.internal.instrument.crashshield.a.b(d.class)) {
            return;
        }
        try {
            com.facebook.appevents.suggestedevents.e.a();
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, d.class);
        }
    }
}
