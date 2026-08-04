package F2;

import U5.EnumC0446m;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbhf;
import com.google.android.gms.internal.ads.zzbsl;
import com.google.android.gms.tasks.Tasks;
import p155w1.C1017n0;

/* JADX INFO: renamed from: F2.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0247p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f2706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f2710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f2711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f2712g;

    public C0247p(j1 j1Var, Y0 y4, Y0 y5, zzbhf zzbhfVar, zzbsl zzbslVar, Y0 y7) {
        this.f2706a = j1Var;
        this.f2707b = y4;
        this.f2708c = y5;
        this.f2709d = zzbhfVar;
        this.f2710e = zzbslVar;
        this.f2712g = y7;
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
        EnumC0446m enumC0446mU = aVar.f6675d.u();
        Q0.a.v(1, "GrpcCallProvider", "Current gRPC connectivity state: " + enumC0446mU, new Object[0]);
        if (((C1017n0) this.f2709d) != null) {
            Q0.a.v(1, "GrpcCallProvider", "Clearing the connectivityAttemptTimer", new Object[0]);
            ((C1017n0) this.f2709d).f();
            this.f2709d = null;
        }
        if (enumC0446mU == EnumC0446m.f6550a) {
            Q0.a.v(1, "GrpcCallProvider", "Setting the connectivityAttemptTimer", new Object[0]);
            this.f2709d = ((L4.f) this.f2707b).b(L4.e.f4358z, 15000L, new K4.t(this, aVar, 1));
        }
        aVar.v(enumC0446mU, new K4.t(this, aVar, 2));
    }

    public C0247p(L4.f fVar, Context context, D3.j jVar, K4.m mVar) {
        this.f2707b = fVar;
        this.f2710e = context;
        this.f2711f = jVar;
        this.f2712g = mVar;
        this.f2706a = Tasks.call(L4.l.f4378c, new K4.s(this, 0));
    }
}
