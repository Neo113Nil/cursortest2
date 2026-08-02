package y2;

import F2.C0239l;
import F2.C0247p;
import F2.C0252s;
import F2.I;
import F2.Z0;
import F2.a1;
import F2.h1;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzfx;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.ads.zzbey;
import com.google.android.gms.internal.ads.zzbok;
import com.google.android.gms.internal.ads.zzbsd;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18150a;

    /* renamed from: b, reason: collision with root package name */
    public final I f18151b;

    public f(Context context, String str) {
        D.j(context, "context cannot be null");
        C0247p c0247p = C0252s.f2717f.f2719b;
        zzbok zzbokVar = new zzbok();
        c0247p.getClass();
        I i7 = (I) new C0239l(c0247p, context, str, zzbokVar).d(context, false);
        this.f18150a = context;
        this.f18151b = i7;
    }

    public final g a() {
        Context context = this.f18150a;
        try {
            return new g(context, this.f18151b.zze());
        } catch (RemoteException e7) {
            J2.j.e("Failed to build AdLoader.", e7);
            return new g(context, new Z0(new a1()));
        }
    }

    public final void b(O2.c cVar) {
        try {
            this.f18151b.zzk(new zzbsd(cVar));
        } catch (RemoteException e7) {
            J2.j.h("Failed to add google native ad listener", e7);
        }
    }

    public final void c(d dVar) {
        try {
            this.f18151b.zzl(new h1(dVar));
        } catch (RemoteException e7) {
            J2.j.h("Failed to set AdListener.", e7);
        }
    }

    public final void d(O2.f fVar) {
        try {
            I i7 = this.f18151b;
            boolean z4 = fVar.f4989a;
            boolean z7 = fVar.f4991c;
            int i8 = fVar.f4992d;
            C1796A c1796a = fVar.f4993e;
            i7.zzo(new zzbey(4, z4, -1, z7, i8, c1796a != null ? new zzfx(c1796a) : null, fVar.f4994f, fVar.f4990b, fVar.f4996h, fVar.f4995g, fVar.f4997i - 1));
        } catch (RemoteException e7) {
            J2.j.h("Failed to specify native ad options", e7);
        }
    }
}
