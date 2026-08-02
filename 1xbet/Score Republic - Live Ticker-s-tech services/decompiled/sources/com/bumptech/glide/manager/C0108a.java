package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.lifecycle.C0030a;
import com.bumptech.glide.ComponentCallbacks2C0106a;
import java.io.File;
import java.util.HashMap;
import p000.AbstractActivityC0790v4;
import p000.C0270h1;
import p000.aa0;
import p000.ai0;
import p000.e50;
import p000.f50;
import p000.n11;
import p000.na0;
import p000.nc1;
import p000.o31;
import p000.t50;
import p000.zg1;

/* JADX INFO: renamed from: com.bumptech.glide.manager.a */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0108a implements Handler.Callback {

    /* JADX INFO: renamed from: d */
    public static final aa0 f1319d = new aa0(12);

    /* JADX INFO: renamed from: a */
    public volatile n11 f1320a;

    /* JADX INFO: renamed from: b */
    public final nc1 f1321b;

    /* JADX INFO: renamed from: c */
    public final f50 f1322c = new f50(f1319d);

    public C0108a() {
        File file = na0.f5345d;
        this.f1321b = new nc1(20);
    }

    /* JADX INFO: renamed from: a */
    public static Activity m988a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m988a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final n11 m989b(Context context) {
        if (context == null) {
            C0270h1.m2190f("You cannot start a load on a null Context");
            return null;
        }
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof AbstractActivityC0790v4) {
                AbstractActivityC0790v4 abstractActivityC0790v4 = (AbstractActivityC0790v4) context;
                if (!(Looper.myLooper() == Looper.getMainLooper())) {
                    return m989b(abstractActivityC0790v4.getApplicationContext());
                }
                if (abstractActivityC0790v4.isDestroyed()) {
                    C0270h1.m2190f("You cannot start a load for a destroyed activity");
                    return null;
                }
                this.f1321b.getClass();
                Activity activityM988a = m988a(abstractActivityC0790v4);
                boolean z = activityM988a == null || !activityM988a.isFinishing();
                ComponentCallbacks2C0106a componentCallbacks2C0106aM983a = ComponentCallbacks2C0106a.m983a(abstractActivityC0790v4.getApplicationContext());
                f50 f50Var = this.f1322c;
                C0030a c0030a = abstractActivityC0790v4.f2430j;
                t50 t50Var = ((e50) abstractActivityC0790v4.f8056D.f793k).f1954q;
                f50Var.getClass();
                zg1.m5891b();
                zg1.m5891b();
                n11 n11Var = (n11) ((HashMap) f50Var.f2313k).get(c0030a);
                if (n11Var != null) {
                    return n11Var;
                }
                LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(c0030a);
                aa0 aa0Var = (aa0) f50Var.f2314l;
                aa0 aa0Var2 = new aa0(f50Var, t50Var);
                aa0Var.getClass();
                n11 n11Var2 = new n11(componentCallbacks2C0106aM983a, lifecycleLifecycle, aa0Var2, abstractActivityC0790v4);
                ((HashMap) f50Var.f2313k).put(c0030a, n11Var2);
                lifecycleLifecycle.mo986B(new ai0(f50Var, c0030a));
                if (z) {
                    n11Var2.mo246b();
                }
                return n11Var2;
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return m989b(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f1320a == null) {
            synchronized (this) {
                try {
                    if (this.f1320a == null) {
                        this.f1320a = new n11(ComponentCallbacks2C0106a.m983a(context.getApplicationContext()), new nc1(11), new o31(22), context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f1320a;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
