package com.facebook.appevents.iap;

import android.content.Context;
import com.facebook.w;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Context context = w.a();
        f.a(f.a, context, q.f(context, f.h), false);
        Object obj = f.h;
        ArrayList<String> arrayList = null;
        if (!com.facebook.internal.instrument.crashshield.a.b(q.class)) {
            try {
                Intrinsics.checkNotNullParameter(context, "context");
                q qVar = q.a;
                arrayList = qVar.a(qVar.e(context, obj, "subs"));
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, q.class);
            }
        }
        f.a(f.a, context, arrayList, true);
    }
}
