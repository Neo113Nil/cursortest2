package p167y2;

import F2.M;
import F2.O0;
import J2.j;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbtl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f18143b;

    public /* synthetic */ C(l lVar, int i7) {
        this.f18142a = i7;
        this.f18143b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18142a) {
            case 0:
                l lVar = this.f18143b;
                try {
                    O0 o7 = lVar.f18180a;
                    o7.getClass();
                    try {
                        M m7 = o7.f2624i;
                        if (m7 != null) {
                            m7.zzB();
                        }
                    } catch (RemoteException e7) {
                        j.i("#007 Could not call remote method.", e7);
                        return;
                    }
                } catch (IllegalStateException e8) {
                    zzbtl.zza(lVar.getContext()).zzh(e8, "BaseAdView.resume");
                    return;
                }
                zzbtl.zza(lVar.getContext()).zzh(e8, "BaseAdView.resume");
                break;
            case 1:
                l lVar2 = this.f18143b;
                try {
                    O0 o8 = lVar2.f18180a;
                    o8.getClass();
                    try {
                        M m8 = o8.f2624i;
                        if (m8 != null) {
                            m8.zzx();
                        }
                    } catch (RemoteException e9) {
                        j.i("#007 Could not call remote method.", e9);
                    }
                } catch (IllegalStateException e10) {
                    zzbtl.zza(lVar2.getContext()).zzh(e10, "BaseAdView.destroy");
                    return;
                }
                break;
            default:
                l lVar3 = this.f18143b;
                try {
                    O0 o9 = lVar3.f18180a;
                    o9.getClass();
                    try {
                        M m9 = o9.f2624i;
                        if (m9 != null) {
                            m9.zzz();
                        }
                    } catch (RemoteException e11) {
                        j.i("#007 Could not call remote method.", e11);
                        return;
                    }
                } catch (IllegalStateException e12) {
                    zzbtl.zza(lVar3.getContext()).zzh(e12, "BaseAdView.pause");
                }
                zzbtl.zza(lVar3.getContext()).zzh(e12, "BaseAdView.pause");
                break;
        }
    }
}
