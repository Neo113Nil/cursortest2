package F2;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbok;
import com.google.android.gms.internal.ads.zzbya;
import o3.BinderC1507b;

/* renamed from: F2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0225e extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2660b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbok f2661c;

    public C0225e(Context context, zzbok zzbokVar) {
        this.f2660b = context;
        this.f2661c = zzbokVar;
    }

    @Override // F2.r
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // F2.r
    public final Object b(InterfaceC0220b0 interfaceC0220b0) {
        return interfaceC0220b0.N(new BinderC1507b(this.f2660b), this.f2661c, 250930000);
    }

    @Override // F2.r
    public final Object c() {
        Context context = this.f2660b;
        BinderC1507b binderC1507b = new BinderC1507b(context);
        try {
            try {
                return zzbya.zzb(Q0.a.l0(context).b("com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl")).zze(binderC1507b, this.f2661c, 250930000);
            } catch (J2.l | RemoteException | NullPointerException unused) {
                return null;
            }
        } catch (Exception e7) {
            throw new J2.l(e7);
        }
    }
}
