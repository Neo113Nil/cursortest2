package F2;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbjv;
import com.google.android.gms.internal.ads.zzbkd;
import com.google.android.gms.internal.ads.zzbki;
import com.google.android.gms.internal.ads.zzbok;

/* JADX INFO: renamed from: F2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0229g extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbok f2666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2.b f2667d;

    public C0229g(Context context, zzbok zzbokVar, C2.b bVar) {
        this.f2665b = context;
        this.f2666c = zzbokVar;
        this.f2667d = bVar;
    }

    @Override // F2.r
    public final /* synthetic */ Object a() {
        return new zzbki();
    }

    @Override // F2.r
    public final Object b(InterfaceC0220b0 interfaceC0220b0) {
        return interfaceC0220b0.H(new p105o3.b(this.f2665b), this.f2666c, 250930000, new zzbjv(this.f2667d));
    }

    @Override // F2.r
    public final Object c() {
        Context context = this.f2665b;
        p105o3.b bVar = new p105o3.b(context);
        try {
            try {
                return zzbkd.zzb(Q0.a.l0(context).b("com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl")).zze(bVar, this.f2666c, 250930000, new zzbjv(this.f2667d));
            } catch (J2.l | RemoteException | NullPointerException unused) {
                return null;
            }
        } catch (Exception e7) {
            throw new J2.l(e7);
        }
    }
}
