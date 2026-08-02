package F2;

import C0.RunnableC0085d;
import com.google.android.gms.ads.internal.client.zzm;

/* loaded from: classes.dex */
public final class Z0 extends E {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1 f2649a;

    public /* synthetic */ Z0(a1 a1Var) {
        this.f2649a = a1Var;
    }

    @Override // F2.F
    public final String zze() {
        return null;
    }

    @Override // F2.F
    public final String zzf() {
        return null;
    }

    @Override // F2.F
    public final void zzg(zzm zzmVar) {
        zzh(zzmVar, 1);
    }

    @Override // F2.F
    public final void zzh(zzm zzmVar, int i7) {
        J2.j.d("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        J2.d.f3805b.post(new RunnableC0085d(this, 4));
    }

    @Override // F2.F
    public final boolean zzi() {
        return false;
    }
}
