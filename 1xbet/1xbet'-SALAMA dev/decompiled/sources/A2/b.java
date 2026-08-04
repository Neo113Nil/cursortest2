package A2;

import F2.C0254t;
import J2.j;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.ads.zzazm;
import com.google.android.gms.internal.ads.zzazq;
import com.google.android.gms.internal.ads.zzazy;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbdw;
import p167y2.B;
import p167y2.i;
import p167y2.m;
import p167y2.r;
import p167y2.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static boolean isAdAvailable(Context context, String str) {
        try {
            return B.a(context).zzj(str);
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
            return false;
        }
    }

    public static void load(Context context, String str, i iVar, a aVar) {
        D.j(context, "Context cannot be null.");
        D.j(str, "adUnitId cannot be null.");
        D.j(iVar, "AdRequest cannot be null.");
        D.d("#008 Must be called on the main UI thread.");
        zzbby.zza(context);
        if (((Boolean) zzbdw.zzd.zze()).booleanValue()) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlh)).booleanValue()) {
                J2.b.f3804b.execute(new c(context, str, iVar, aVar, 0));
                return;
            }
        }
        new zzazy(context, str, iVar.f18160a, aVar).zza();
    }

    public static b pollAd(Context context, String str) {
        try {
            zzazq zzazqVarZze = B.a(context).zze(str);
            if (zzazqVarZze != null) {
                return new zzazm(zzazqVarZze, str);
            }
            j.i("Failed to obtain an App Open ad from the preloader.", null);
            return null;
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
            return null;
        }
    }

    public abstract v getResponseInfo();

    public abstract void setFullScreenContentCallback(m mVar);

    public abstract void setImmersiveMode(boolean z4);

    public abstract void setOnPaidEventListener(r rVar);

    public abstract void show(Activity activity);
}
