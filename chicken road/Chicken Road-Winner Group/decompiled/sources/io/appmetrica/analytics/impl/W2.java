package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class W2 implements InterfaceC0759pk {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6771a;

    /* renamed from: b, reason: collision with root package name */
    public Intent f6772b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f6773c;

    /* renamed from: d, reason: collision with root package name */
    public final N5 f6774d;

    public W2(Context context, ICommonExecutor iCommonExecutor) {
        this(context, iCommonExecutor, 0);
    }

    public final synchronized Intent a(Consumer<Intent> consumer) {
        this.f6771a.add(consumer);
        return this.f6772b;
    }

    public final void b() {
        this.f6772b = null;
        N5 n5 = this.f6774d;
        Context context = this.f6773c;
        synchronized (n5) {
            if (n5.f6313b) {
                try {
                    context.unregisterReceiver(n5.f6312a);
                    n5.f6313b = false;
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0759pk
    public final synchronized void onCreate() {
        Intent a3 = a();
        this.f6772b = a3;
        Iterator it = this.f6771a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(a3);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0759pk
    public final synchronized void onDestroy() {
        this.f6772b = null;
        b();
        Iterator it = this.f6771a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(null);
        }
    }

    public W2(Context context, ICommonExecutor iCommonExecutor, int i3) {
        this.f6771a = new ArrayList();
        this.f6772b = null;
        this.f6773c = context;
        this.f6774d = M5.a(new B2(new V2(this), iCommonExecutor));
    }

    public final Intent a() {
        Intent intent;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        N5 n5 = this.f6774d;
        Context context = this.f6773c;
        synchronized (n5) {
            try {
                intent = context.registerReceiver(n5.f6312a, intentFilter);
                try {
                    n5.f6313b = true;
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                intent = null;
            }
        }
        return intent;
    }
}
