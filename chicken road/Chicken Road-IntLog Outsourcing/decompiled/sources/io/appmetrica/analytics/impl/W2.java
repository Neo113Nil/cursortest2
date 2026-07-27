package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class W2 implements InterfaceC0908pk {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7644a;

    /* renamed from: b, reason: collision with root package name */
    public Intent f7645b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f7646c;

    /* renamed from: d, reason: collision with root package name */
    public final N5 f7647d;

    public W2(Context context, ICommonExecutor iCommonExecutor) {
        this(context, iCommonExecutor, 0);
    }

    public final synchronized Intent a(Consumer<Intent> consumer) {
        this.f7644a.add(consumer);
        return this.f7645b;
    }

    public final void b() {
        this.f7645b = null;
        N5 n52 = this.f7647d;
        Context context = this.f7646c;
        synchronized (n52) {
            if (n52.f7170b) {
                try {
                    context.unregisterReceiver(n52.f7169a);
                    n52.f7170b = false;
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0908pk
    public final synchronized void onCreate() {
        Intent a6 = a();
        this.f7645b = a6;
        Iterator it = this.f7644a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(a6);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0908pk
    public final synchronized void onDestroy() {
        this.f7645b = null;
        b();
        Iterator it = this.f7644a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(null);
        }
    }

    public W2(Context context, ICommonExecutor iCommonExecutor, int i2) {
        this.f7644a = new ArrayList();
        this.f7645b = null;
        this.f7646c = context;
        this.f7647d = M5.a(new B2(new V2(this), iCommonExecutor));
    }

    public final Intent a() {
        Intent intent;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        N5 n52 = this.f7647d;
        Context context = this.f7646c;
        synchronized (n52) {
            try {
                intent = context.registerReceiver(n52.f7169a, intentFilter);
                try {
                    n52.f7170b = true;
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                intent = null;
            }
        }
        return intent;
    }
}
