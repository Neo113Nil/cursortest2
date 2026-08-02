package y2;

import F2.M;
import F2.O0;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbtl;

/* loaded from: classes.dex */
public final /* synthetic */ class C implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18136a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f18137b;

    public /* synthetic */ C(l lVar, int i7) {
        this.f18136a = i7;
        this.f18137b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18136a) {
            case 0:
                l lVar = this.f18137b;
                try {
                    O0 o02 = lVar.f18174a;
                    o02.getClass();
                    try {
                        M m7 = o02.f2624i;
                        if (m7 != null) {
                            m7.zzB();
                            break;
                        }
                    } catch (RemoteException e7) {
                        J2.j.i("#007 Could not call remote method.", e7);
                        return;
                    }
                } catch (IllegalStateException e8) {
                    zzbtl.zza(lVar.getContext()).zzh(e8, "BaseAdView.resume");
                    return;
                }
                break;
            case 1:
                l lVar2 = this.f18137b;
                try {
                    O0 o03 = lVar2.f18174a;
                    o03.getClass();
                    try {
                        M m8 = o03.f2624i;
                        if (m8 != null) {
                            m8.zzx();
                        }
                    } catch (RemoteException e9) {
                        J2.j.i("#007 Could not call remote method.", e9);
                    }
                    break;
                } catch (IllegalStateException e10) {
                    zzbtl.zza(lVar2.getContext()).zzh(e10, "BaseAdView.destroy");
                    return;
                }
            default:
                l lVar3 = this.f18137b;
                try {
                    O0 o04 = lVar3.f18174a;
                    o04.getClass();
                    try {
                        M m9 = o04.f2624i;
                        if (m9 != null) {
                            m9.zzz();
                            break;
                        }
                    } catch (RemoteException e11) {
                        J2.j.i("#007 Could not call remote method.", e11);
                        return;
                    }
                } catch (IllegalStateException e12) {
                    zzbtl.zza(lVar3.getContext()).zzh(e12, "BaseAdView.pause");
                }
                break;
        }
    }
}
