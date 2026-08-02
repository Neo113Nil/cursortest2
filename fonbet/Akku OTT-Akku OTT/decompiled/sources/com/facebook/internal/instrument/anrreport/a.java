package com.facebook.internal.instrument.anrreport;

import android.app.ActivityManager;
import com.facebook.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (com.facebook.internal.instrument.crashshield.a.b(b.class)) {
            return;
        }
        try {
            Object systemService = w.a().getSystemService("activity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            b.a((ActivityManager) systemService);
        } catch (Exception unused) {
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, b.class);
        }
    }
}
