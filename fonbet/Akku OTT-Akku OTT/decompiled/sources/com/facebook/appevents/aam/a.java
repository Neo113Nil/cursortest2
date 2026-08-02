package com.facebook.appevents.aam;

import android.content.Context;
import com.facebook.internal.C0705a;
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
            Context context = w.a();
            C0705a.Companion.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            C0705a a = C0705a.C0089a.a(context);
            if (a == null || !a.e) {
                b.a.a();
                b.b = true;
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, b.class);
        }
    }
}
