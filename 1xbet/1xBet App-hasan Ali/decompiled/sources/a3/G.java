package a3;

import A0.J0;
import android.util.Pair;
import c3.AbstractC0539a;
import com.google.android.gms.internal.ads.AbstractC1281m8;
import com.google.android.gms.internal.ads.C1616tl;

/* loaded from: classes.dex */
public final class G extends AbstractC0539a {

    /* renamed from: a, reason: collision with root package name */
    public final F f6487a;

    /* renamed from: b, reason: collision with root package name */
    public final C1616tl f6488b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6489c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6490d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6491e;
    public final Boolean f;

    public G(F f, boolean z3, int i, Boolean bool, C1616tl c1616tl) {
        this.f6487a = f;
        this.f6489c = z3;
        this.f6490d = i;
        this.f = bool;
        this.f6488b = c1616tl;
        P2.o.f4767B.f4776j.getClass();
        this.f6491e = System.currentTimeMillis();
    }

    @Override // c3.AbstractC0539a
    public final void a(String str) {
        Pair pair = new Pair("sgf_reason", str);
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        P2.o oVar = P2.o.f4767B;
        oVar.f4776j.getClass();
        Pair pair6 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.f6491e));
        Pair pair7 = new Pair("sgpc_rn", Integer.toString(this.f6490d));
        Pair pair8 = new Pair("sgpc_lsu", String.valueOf(this.f));
        boolean z3 = this.f6489c;
        G4.d.R(this.f6488b, "sgpcf", pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("tpc", true != z3 ? "0" : "1"));
        oVar.f4776j.getClass();
        this.f6487a.a(z3, new H(null, str, ((Long) AbstractC1281m8.f.s()).longValue() + System.currentTimeMillis(), this.f6490d));
    }

    @Override // c3.AbstractC0539a
    public final void b(J0 j02) {
        Pair pair = new Pair("se", "query_g");
        Pair pair2 = new Pair("ad_format", "BANNER");
        Pair pair3 = new Pair("rtype", Integer.toString(6));
        Pair pair4 = new Pair("scar", "true");
        P2.o oVar = P2.o.f4767B;
        oVar.f4776j.getClass();
        Pair pair5 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.f6491e));
        Pair pair6 = new Pair("sgpc_rn", Integer.toString(this.f6490d));
        Pair pair7 = new Pair("sgpc_lsu", String.valueOf(this.f));
        boolean z3 = this.f6489c;
        G4.d.R(this.f6488b, "sgpcs", pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("tpc", true != z3 ? "0" : "1"));
        oVar.f4776j.getClass();
        this.f6487a.a(z3, new H(j02, "", ((Long) AbstractC1281m8.f.s()).longValue() + System.currentTimeMillis(), this.f6490d));
    }
}
