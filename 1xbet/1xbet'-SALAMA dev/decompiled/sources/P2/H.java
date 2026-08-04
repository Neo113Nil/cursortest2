package P2;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzbed;
import com.google.android.gms.internal.ads.zzdqv;

/* JADX INFO: loaded from: classes.dex */
public final class H extends R2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f5428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzdqv f5429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f5433f;

    public H(G g3, boolean z4, int i7, Boolean bool, zzdqv zzdqvVar) {
        this.f5428a = g3;
        this.f5430c = z4;
        this.f5431d = i7;
        this.f5433f = bool;
        this.f5429b = zzdqvVar;
        E2.o.f1952C.j.getClass();
        this.f5432e = System.currentTimeMillis();
    }

    @Override // R2.b
    public final void onFailure(String str) {
        Pair pair = new Pair("sgf_reason", str);
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        E2.o oVar = E2.o.f1952C;
        oVar.j.getClass();
        Pair pair6 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.f5432e));
        Pair pair7 = new Pair("sgpc_rn", Integer.toString(this.f5431d));
        Pair pair8 = new Pair("sgpc_lsu", String.valueOf(this.f5433f));
        boolean z4 = this.f5430c;
        Q0.a.n0(this.f5429b, "sgpcf", pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("tpc", true != z4 ? "0" : "1"));
        oVar.j.getClass();
        this.f5428a.a(z4, new I(null, str, ((Long) zzbed.zzg.zze()).longValue() + System.currentTimeMillis(), this.f5431d));
    }

    @Override // R2.b
    public final void onSuccess(R2.a aVar) {
        Pair pair = new Pair("se", "query_g");
        Pair pair2 = new Pair("ad_format", "BANNER");
        Pair pair3 = new Pair("rtype", Integer.toString(6));
        Pair pair4 = new Pair("scar", "true");
        E2.o oVar = E2.o.f1952C;
        oVar.j.getClass();
        Pair pair5 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.f5432e));
        Pair pair6 = new Pair("sgpc_rn", Integer.toString(this.f5431d));
        Pair pair7 = new Pair("sgpc_lsu", String.valueOf(this.f5433f));
        boolean z4 = this.f5430c;
        Q0.a.n0(this.f5429b, "sgpcs", pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("tpc", true != z4 ? "0" : "1"));
        oVar.j.getClass();
        this.f5428a.a(z4, new I(aVar, "", ((Long) zzbed.zzg.zze()).longValue() + System.currentTimeMillis(), this.f5431d));
    }
}
