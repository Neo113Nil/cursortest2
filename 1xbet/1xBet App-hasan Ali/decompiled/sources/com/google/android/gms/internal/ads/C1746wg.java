package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import q3.C2308a;

/* renamed from: com.google.android.gms.internal.ads.wg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1746wg implements L5 {

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0677Re f16127k;

    /* renamed from: l, reason: collision with root package name */
    public final Executor f16128l;

    /* renamed from: m, reason: collision with root package name */
    public final C1521rg f16129m;

    /* renamed from: n, reason: collision with root package name */
    public final C2308a f16130n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f16131o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f16132p = false;

    /* renamed from: q, reason: collision with root package name */
    public final C1611tg f16133q = new C1611tg();

    public C1746wg(Executor executor, C1521rg c1521rg, C2308a c2308a) {
        this.f16128l = executor;
        this.f16129m = c1521rg;
        this.f16130n = c2308a;
    }

    public final void a() {
        try {
            JSONObject o5 = this.f16129m.o(this.f16133q);
            if (this.f16127k != null) {
                this.f16128l.execute(new Kw(19, this, o5));
            }
        } catch (JSONException e3) {
            T2.G.n("Failed to call video active view js", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.L5
    public final void z0(K5 k5) {
        boolean z3 = this.f16132p ? false : k5.f10128j;
        C1611tg c1611tg = this.f16133q;
        c1611tg.f15697a = z3;
        this.f16130n.getClass();
        c1611tg.f15699c = SystemClock.elapsedRealtime();
        c1611tg.f15701e = k5;
        if (this.f16131o) {
            a();
        }
    }
}
