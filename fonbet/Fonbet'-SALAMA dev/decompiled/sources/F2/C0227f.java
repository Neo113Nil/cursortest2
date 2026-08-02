package F2;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbok;
import com.google.android.gms.internal.ads.zzbsj;
import o3.BinderC1507b;

/* renamed from: F2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0227f extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2662b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbok f2663c;

    public C0227f(Context context, zzbok zzbokVar) {
        this.f2662b = context;
        this.f2663c = zzbokVar;
    }

    @Override // F2.r
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // F2.r
    public final Object b(InterfaceC0220b0 interfaceC0220b0) {
        return interfaceC0220b0.f(new BinderC1507b(this.f2662b), this.f2663c, 250930000);
    }

    @Override // F2.r
    public final Object c() {
        Context context = this.f2662b;
        BinderC1507b binderC1507b = new BinderC1507b(context);
        try {
            try {
                return zzbsj.zzb(Q0.a.l0(context).b("com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl")).zze(binderC1507b, this.f2663c, 250930000);
            } catch (J2.l | RemoteException | NullPointerException unused) {
                return null;
            }
        } catch (Exception e7) {
            throw new J2.l(e7);
        }
    }
}
