package F2;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.internal.ads.zzboo;
import o3.BinderC1507b;

/* renamed from: F2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0231h extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2669b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzr f2670c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f2671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzboo f2672e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0247p f2673f;

    public C0231h(C0247p c0247p, Context context, zzr zzrVar, String str, zzboo zzbooVar) {
        this.f2669b = context;
        this.f2670c = zzrVar;
        this.f2671d = str;
        this.f2672e = zzbooVar;
        this.f2673f = c0247p;
    }

    @Override // F2.r
    public final Object a() {
        C0247p.b(this.f2669b, "banner");
        return new b1();
    }

    @Override // F2.r
    public final Object b(InterfaceC0220b0 interfaceC0220b0) {
        return interfaceC0220b0.I(new BinderC1507b(this.f2669b), this.f2670c, this.f2671d, this.f2672e, 250930000);
    }

    @Override // F2.r
    public final /* bridge */ /* synthetic */ Object c() {
        return ((j1) this.f2673f.f2706a).a(this.f2669b, this.f2670c, this.f2671d, this.f2672e, 1);
    }
}
