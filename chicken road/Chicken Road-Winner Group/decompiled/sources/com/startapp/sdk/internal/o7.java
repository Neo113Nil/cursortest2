package com.startapp.sdk.internal;

import android.content.Context;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import d2.C0279i;
import e2.AbstractC0292g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class o7 implements j0 {
    public static final Object f = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Context f4132a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f4133b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4134c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4135d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f4136e;

    public o7(Context context, ib executor) {
        kotlin.jvm.internal.j.e(context, "context");
        kotlin.jvm.internal.j.e(executor, "executor");
        this.f4132a = context;
        this.f4133b = executor;
        this.f4136e = new ArrayList();
    }

    @Override // com.startapp.sdk.internal.j0
    public final void a() {
        b(new A(3));
    }

    public final void b(o2.l lVar) {
        synchronized (f) {
            try {
                if (this.f4135d) {
                    lVar.invoke(Boolean.TRUE);
                    return;
                }
                if (!this.f4134c) {
                    this.f4134c = true;
                    ((Executor) this.f4133b.a()).execute(new G0.m(13, this));
                }
                a(lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final C0279i a(boolean z3) {
        return C0279i.f4852a;
    }

    public static final void a(o7 this$0) {
        kotlin.jvm.internal.j.e(this$0, "this$0");
        try {
            MobileAds.initialize(this$0.f4132a, new G());
        } catch (Throwable unused) {
            synchronized (f) {
                List f0 = AbstractC0292g.f0(this$0.f4136e);
                this$0.f4136e.clear();
                this$0.f4134c = false;
                Iterator it = f0.iterator();
                while (it.hasNext()) {
                    ((o2.l) it.next()).invoke(Boolean.FALSE);
                }
            }
        }
    }

    public static final C0279i b(o2.l listener, o7 this$0, AdUnitConfig config, boolean z3) {
        kotlin.jvm.internal.j.e(listener, "$listener");
        kotlin.jvm.internal.j.e(this$0, "this$0");
        kotlin.jvm.internal.j.e(config, "$config");
        listener.invoke(z3 ? new q7(this$0.f4132a, config) : null);
        return C0279i.f4852a;
    }

    public static final void a(o7 this$0, InitializationStatus it) {
        kotlin.jvm.internal.j.e(this$0, "this$0");
        kotlin.jvm.internal.j.e(it, "it");
        synchronized (f) {
            List f0 = AbstractC0292g.f0(this$0.f4136e);
            this$0.f4136e.clear();
            this$0.f4134c = false;
            this$0.f4135d = true;
            Iterator it2 = f0.iterator();
            while (it2.hasNext()) {
                ((o2.l) it2.next()).invoke(Boolean.TRUE);
            }
        }
    }

    @Override // com.startapp.sdk.internal.j0
    public final void b(AdUnitConfig config, o2.l listener) {
        kotlin.jvm.internal.j.e(config, "config");
        kotlin.jvm.internal.j.e(listener, "listener");
        b(new H(listener, this, config, 1));
    }

    public final void a(o2.l lVar) {
        synchronized (f) {
            this.f4136e.add(lVar);
        }
    }

    @Override // com.startapp.sdk.internal.j0
    public final void a(AdUnitConfig config, o2.l listener) {
        kotlin.jvm.internal.j.e(config, "config");
        kotlin.jvm.internal.j.e(listener, "listener");
        b(new H(listener, this, config, 0));
    }

    public static final C0279i a(o2.l listener, o7 this$0, AdUnitConfig config, boolean z3) {
        kotlin.jvm.internal.j.e(listener, "$listener");
        kotlin.jvm.internal.j.e(this$0, "this$0");
        kotlin.jvm.internal.j.e(config, "$config");
        listener.invoke(z3 ? new n7(this$0.f4132a, config) : null);
        return C0279i.f4852a;
    }
}
