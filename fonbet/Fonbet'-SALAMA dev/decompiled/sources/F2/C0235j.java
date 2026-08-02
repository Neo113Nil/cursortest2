package F2;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzr;
import o3.BinderC1507b;

/* renamed from: F2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0235j extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2682b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzr f2683c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f2684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0247p f2685e;

    public C0235j(C0247p c0247p, Context context, zzr zzrVar, String str) {
        this.f2682b = context;
        this.f2683c = zzrVar;
        this.f2684d = str;
        this.f2685e = c0247p;
    }

    @Override // F2.r
    public final Object a() {
        C0247p.b(this.f2682b, "search");
        return new b1();
    }

    @Override // F2.r
    public final Object b(InterfaceC0220b0 interfaceC0220b0) {
        return interfaceC0220b0.x(new BinderC1507b(this.f2682b), this.f2683c, this.f2684d, 250930000);
    }

    @Override // F2.r
    public final /* bridge */ /* synthetic */ Object c() {
        return ((j1) this.f2685e.f2706a).a(this.f2682b, this.f2683c, this.f2684d, null, 3);
    }
}
