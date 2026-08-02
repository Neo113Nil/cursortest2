package P2;

import a3.F;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.AbstractC1260lo;
import com.google.android.gms.internal.ads.C1109iE;
import com.google.android.gms.internal.ads.C1876zb;
import com.google.android.gms.internal.ads.Cj;
import com.google.android.gms.internal.ads.Er;
import com.google.android.gms.internal.ads.Fk;
import com.google.android.gms.internal.ads.Fz;
import com.google.android.gms.internal.ads.SurfaceHolderCallbackC0974fE;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4724k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f4725l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f4726m;

    public /* synthetic */ f(int i, Object obj, boolean z3) {
        this.f4724k = i;
        this.f4726m = obj;
        this.f4725l = z3;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.E5, com.google.android.gms.internal.ads.bk] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.internal.ads.E5, com.google.android.gms.internal.ads.bk] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.gms.internal.ads.E5, com.google.android.gms.internal.ads.bk] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z3 = this.f4725l;
        Object obj = this.f4726m;
        switch (this.f4724k) {
            case 0:
                g gVar = (g) obj;
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    g.p(gVar.f4736t, gVar.f4738v, z3, gVar.f4739w).l();
                    break;
                } catch (NullPointerException e3) {
                    gVar.f4734r.g(2027, System.currentTimeMillis() - currentTimeMillis, e3);
                    return;
                }
            case 1:
                ((F) obj).e(z3, false);
                break;
            case 2:
                ((C1876zb) obj).B(z3);
                break;
            case 3:
                Cj cj = (Cj) obj;
                ?? r02 = cj.f8069u;
                if (r02 != 0) {
                    View c5 = r02.c();
                    Map o5 = cj.f8069u.o();
                    Map l5 = cj.f8069u.l();
                    ImageView.ScaleType q5 = cj.q();
                    cj.f8060l.t(null, c5, o5, l5, this.f4725l, q5, 0);
                    break;
                } else {
                    U2.j.d("Ad should be associated with an ad view before calling recordCustomClickGesture()");
                    break;
                }
            default:
                Er er = (Er) obj;
                er.getClass();
                int i = AbstractC1260lo.f14419a;
                C1109iE c1109iE = ((SurfaceHolderCallbackC0974fE) er.f8618m).f13463k;
                if (c1109iE.f13902V != z3) {
                    c1109iE.f13902V = z3;
                    Fz fz = new Fz(28);
                    Fk fk = c1109iE.f13921v;
                    fk.c(23, fz);
                    fk.b();
                    break;
                }
                break;
        }
    }
}
