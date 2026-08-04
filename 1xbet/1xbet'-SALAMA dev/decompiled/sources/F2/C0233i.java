package F2;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.internal.ads.zzboo;

/* JADX INFO: renamed from: F2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0233i extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzr f2676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f2677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzboo f2678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0247p f2679f;

    public C0233i(C0247p c0247p, Context context, zzr zzrVar, String str, zzboo zzbooVar) {
        this.f2675b = context;
        this.f2676c = zzrVar;
        this.f2677d = str;
        this.f2678e = zzbooVar;
        this.f2679f = c0247p;
    }

    @Override // F2.r
    public final Object a() {
        C0247p.b(this.f2675b, "app_open");
        return new b1();
    }

    @Override // F2.r
    public final Object b(InterfaceC0220b0 interfaceC0220b0) {
        return interfaceC0220b0.z(new p105o3.b(this.f2675b), this.f2676c, this.f2677d, this.f2678e, 250930000);
    }

    @Override // F2.r
    public final /* bridge */ /* synthetic */ Object c() {
        return ((j1) this.f2679f.f2706a).a(this.f2675b, this.f2676c, this.f2677d, this.f2678e, 4);
    }
}
