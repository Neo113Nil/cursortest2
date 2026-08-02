package F2;

import U5.EnumC0446m;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbhf;
import com.google.android.gms.internal.ads.zzbsl;
import com.google.android.gms.tasks.Tasks;
import w1.C1726n0;

/* renamed from: F2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0247p {

    /* renamed from: a, reason: collision with root package name */
    public Object f2706a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2707b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2708c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2709d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2710e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2711f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2712g;

    public C0247p(j1 j1Var, Y0 y02, Y0 y03, zzbhf zzbhfVar, zzbsl zzbslVar, Y0 y04) {
        this.f2706a = j1Var;
        this.f2707b = y02;
        this.f2708c = y03;
        this.f2709d = zzbhfVar;
        this.f2710e = zzbslVar;
        this.f2712g = y04;
    }

    public static void b(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        C0252s c0252s = C0252s.f2717f;
        J2.d dVar = c0252s.f2718a;
        String str2 = c0252s.f2721d.f10834a;
        dVar.getClass();
        J2.d.o(context, str2, bundle, new B4.V(dVar));
    }

    public void a(V5.a aVar) {
        EnumC0446m u4 = aVar.f6675d.u();
        Q0.a.v(1, "GrpcCallProvider", "Current gRPC connectivity state: " + u4, new Object[0]);
        if (((C1726n0) this.f2709d) != null) {
            Q0.a.v(1, "GrpcCallProvider", "Clearing the connectivityAttemptTimer", new Object[0]);
            ((C1726n0) this.f2709d).f();
            this.f2709d = null;
        }
        if (u4 == EnumC0446m.f6550a) {
            Q0.a.v(1, "GrpcCallProvider", "Setting the connectivityAttemptTimer", new Object[0]);
            this.f2709d = ((L4.f) this.f2707b).b(L4.e.f4358z, 15000L, new K4.t(this, aVar, 1));
        }
        aVar.v(u4, new K4.t(this, aVar, 2));
    }

    public C0247p(L4.f fVar, Context context, D3.j jVar, K4.m mVar) {
        this.f2707b = fVar;
        this.f2710e = context;
        this.f2711f = jVar;
        this.f2712g = mVar;
        this.f2706a = Tasks.call(L4.l.f4378c, new K4.s(this, 0));
    }
}
