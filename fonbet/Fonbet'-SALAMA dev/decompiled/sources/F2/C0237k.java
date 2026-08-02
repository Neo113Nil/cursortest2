package F2;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.internal.ads.zzbok;
import o3.BinderC1507b;

/* renamed from: F2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0237k extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2687b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzr f2688c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f2689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzbok f2690e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0247p f2691f;

    public C0237k(C0247p c0247p, Context context, zzr zzrVar, String str, zzbok zzbokVar) {
        this.f2687b = context;
        this.f2688c = zzrVar;
        this.f2689d = str;
        this.f2690e = zzbokVar;
        this.f2691f = c0247p;
    }

    @Override // F2.r
    public final Object a() {
        C0247p.b(this.f2687b, "interstitial");
        return new b1();
    }

    @Override // F2.r
    public final Object b(InterfaceC0220b0 interfaceC0220b0) {
        return interfaceC0220b0.U(new BinderC1507b(this.f2687b), this.f2688c, this.f2689d, this.f2690e, 250930000);
    }

    @Override // F2.r
    public final /* bridge */ /* synthetic */ Object c() {
        j1 j1Var = (j1) this.f2691f.f2706a;
        zzbok zzbokVar = this.f2690e;
        return j1Var.a(this.f2687b, this.f2688c, this.f2689d, zzbokVar, 2);
    }
}
