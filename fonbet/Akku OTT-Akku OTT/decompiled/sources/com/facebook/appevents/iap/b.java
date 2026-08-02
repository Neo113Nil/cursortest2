package com.facebook.appevents.iap;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.facebook.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder service) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(service, "service");
        f fVar = f.a;
        Context context = w.a();
        q qVar = q.a;
        Object obj = null;
        if (!com.facebook.internal.instrument.crashshield.a.b(q.class)) {
            try {
                Intrinsics.checkNotNullParameter(context, "context");
                obj = q.a.h(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{service});
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, q.class);
            }
        }
        f.h = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
    }
}
