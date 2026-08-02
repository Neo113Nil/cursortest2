package S2;

import F2.C0254t;
import J2.j;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbdw;
import com.google.android.gms.internal.ads.zzbvt;
import com.google.android.gms.internal.ads.zzbwc;
import y2.B;
import y2.i;
import y2.m;
import y2.r;
import y2.s;
import y2.v;

/* loaded from: classes.dex */
public abstract class c {
    public static boolean isAdAvailable(Context context, String str) {
        D.j(context, "Context cannot be null.");
        D.j(str, "AdUnitId cannot be null.");
        try {
            return B.a(context).zzl(str);
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
            return false;
        }
    }

    public static void load(Context context, String str, i iVar, d dVar) {
        D.j(context, "Context cannot be null.");
        D.j(str, "AdUnitId cannot be null.");
        D.j(iVar, "AdRequest cannot be null.");
        D.j(dVar, "LoadCallback cannot be null.");
        D.d("#008 Must be called on the main UI thread.");
        zzbby.zza(context);
        if (((Boolean) zzbdw.zzk.zze()).booleanValue()) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlh)).booleanValue()) {
                J2.b.f3804b.execute(new A2.c(context, str, iVar, dVar, 5));
                return;
            }
        }
        j.b("Loading on UI thread");
        new zzbwc(context, str).zza(iVar.f18154a, dVar);
    }

    public static c pollAd(Context context, String str) {
        D.j(context, "Context cannot be null.");
        D.j(str, "AdUnitId cannot be null.");
        try {
            zzbvt zzg = B.a(context).zzg(str);
            if (zzg != null) {
                return new zzbwc(context, str, zzg);
            }
            j.i("Failed to obtain a Rewarded Ad from the preloader.", null);
            return null;
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
            return null;
        }
    }

    public abstract v getResponseInfo();

    public abstract void setFullScreenContentCallback(m mVar);

    public abstract void setImmersiveMode(boolean z4);

    public abstract void setOnAdMetadataChangedListener(a aVar);

    public abstract void setOnPaidEventListener(r rVar);

    public abstract void setServerSideVerificationOptions(e eVar);

    public abstract void show(Activity activity, s sVar);

    public static void load(Context context, String str, z2.b bVar, d dVar) {
        D.j(context, "Context cannot be null.");
        D.j(str, "AdUnitId cannot be null.");
        D.j(bVar, "AdManagerAdRequest cannot be null.");
        D.j(dVar, "LoadCallback cannot be null.");
        D.d("#008 Must be called on the main UI thread.");
        zzbby.zza(context);
        if (((Boolean) zzbdw.zzk.zze()).booleanValue()) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlh)).booleanValue()) {
                j.b("Loading on background thread");
                J2.b.f3804b.execute(new A2.c(context, str, bVar, dVar, 4));
                return;
            }
        }
        j.b("Loading on UI thread");
        new zzbwc(context, str).zza(bVar.f18154a, dVar);
    }
}
