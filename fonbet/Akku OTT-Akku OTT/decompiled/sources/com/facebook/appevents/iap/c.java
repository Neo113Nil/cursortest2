package com.facebook.appevents.iap;

import android.content.Context;
import com.facebook.w;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        q qVar;
        Class<?> b;
        Context context = w.a();
        ArrayList<String> f = q.f(context, f.h);
        if (f.isEmpty()) {
            Object obj = f.h;
            if (!com.facebook.internal.instrument.crashshield.a.b(q.class)) {
                try {
                    Intrinsics.checkNotNullParameter(context, "context");
                    ArrayList<String> arrayList = new ArrayList<>();
                    if (obj != null && (b = (qVar = q.a).b(context, "com.android.vending.billing.IInAppBillingService")) != null && qVar.c(b, "getPurchaseHistory") != null) {
                        f = qVar.a(qVar.d(context, obj));
                    }
                    f = arrayList;
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, q.class);
                }
            }
            f = null;
        }
        f.a(f.a, context, f, false);
    }
}
