package T2;

import A2.c;
import F2.C0254t;
import S2.e;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbdw;
import com.google.android.gms.internal.ads.zzbwn;
import p167y2.i;
import p167y2.m;
import p167y2.r;
import p167y2.s;
import p167y2.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static void load(Context context, String str, i iVar, b bVar) {
        D.j(context, "Context cannot be null.");
        D.j(str, "AdUnitId cannot be null.");
        D.j(iVar, "AdRequest cannot be null.");
        D.j(bVar, "LoadCallback cannot be null.");
        D.d("#008 Must be called on the main UI thread.");
        zzbby.zza(context);
        if (((Boolean) zzbdw.zzk.zze()).booleanValue()) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlh)).booleanValue()) {
                J2.b.f3804b.execute(new c(context, str, iVar, bVar, 7));
                return;
            }
        }
        new zzbwn(context, str).zza(iVar.f18160a, bVar);
    }

    public abstract v getResponseInfo();

    public abstract void setFullScreenContentCallback(m mVar);

    public abstract void setImmersiveMode(boolean z4);

    public abstract void setOnAdMetadataChangedListener(S2.a aVar);

    public abstract void setOnPaidEventListener(r rVar);

    public abstract void setServerSideVerificationOptions(e eVar);

    public abstract void show(Activity activity, s sVar);

    public static void load(Context context, String str, p172z2.b bVar, b bVar2) {
        D.j(context, "Context cannot be null.");
        D.j(str, "AdUnitId cannot be null.");
        D.j(bVar, "AdManagerAdRequest cannot be null.");
        D.j(bVar2, "LoadCallback cannot be null.");
        D.d("#008 Must be called on the main UI thread.");
        zzbby.zza(context);
        if (((Boolean) zzbdw.zzk.zze()).booleanValue()) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlh)).booleanValue()) {
                J2.b.f3804b.execute(new c(context, str, bVar, bVar2, 6));
                return;
            }
        }
        new zzbwn(context, str).zza(bVar.f18160a, bVar2);
    }
}
