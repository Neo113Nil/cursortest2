package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;

/* loaded from: classes.dex */
public abstract class V7 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6743a;

    /* renamed from: b, reason: collision with root package name */
    public final ProtobufStateStorage f6744b;

    /* renamed from: c, reason: collision with root package name */
    public final X7 f6745c;

    /* renamed from: d, reason: collision with root package name */
    public final Cdo f6746d;

    /* renamed from: e, reason: collision with root package name */
    public final Mm f6747e;
    public final Zi f;

    /* renamed from: g, reason: collision with root package name */
    public final Xi f6748g;

    /* renamed from: h, reason: collision with root package name */
    public final G6 f6749h;

    /* renamed from: i, reason: collision with root package name */
    public W7 f6750i;

    public V7(Context context, ProtobufStateStorage protobufStateStorage, X7 x7, Cdo cdo, Mm mm, Zi zi, Xi xi, G6 g6, W7 w7) {
        this.f6743a = context;
        this.f6744b = protobufStateStorage;
        this.f6745c = x7;
        this.f6746d = cdo;
        this.f6747e = mm;
        this.f = zi;
        this.f6748g = xi;
        this.f6749h = g6;
        this.f6750i = w7;
    }

    public final synchronized W7 a() {
        return this.f6750i;
    }

    public final synchronized boolean b(Z7 z7) {
        try {
            boolean z3 = false;
            if (z7.a() == Y7.f6853b) {
                return false;
            }
            if (z7.equals(this.f6750i.b())) {
                return false;
            }
            List list = (List) this.f6746d.invoke(this.f6750i.a(), z7);
            boolean z4 = list != null;
            if (list == null) {
                list = this.f6750i.a();
            }
            if (this.f6745c.a(z7, this.f6750i.b())) {
                z3 = true;
            } else {
                z7 = (Z7) this.f6750i.b();
            }
            if (z3 || z4) {
                W7 w7 = this.f6750i;
                W7 w72 = (W7) this.f6747e.invoke(z7, list);
                this.f6750i = w72;
                this.f6744b.save(w72);
                AbstractC0628kj.a("Update distribution data: %s -> %s", w7, this.f6750i);
            }
            return z3;
        } finally {
        }
    }

    public final synchronized Z7 c() {
        try {
            if (!this.f6748g.a()) {
                Z7 z7 = (Z7) this.f.invoke();
                this.f6748g.b();
                if (z7 != null) {
                    b(z7);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Z7) this.f6750i.b();
    }

    public final Z7 a(Z7 z7) {
        Z7 c3;
        this.f6749h.a(this.f6743a);
        synchronized (this) {
            b(z7);
            c3 = c();
        }
        return c3;
    }

    public final Z7 b() {
        this.f6749h.a(this.f6743a);
        return c();
    }
}
