package z2;

import F2.C0254t;
import android.content.Context;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbdw;
import com.google.android.gms.internal.ads.zzblt;

/* loaded from: classes.dex */
public abstract class c extends K2.a {
    public static void load(Context context, String str, b bVar, d dVar) {
        D.j(context, "Context cannot be null.");
        D.j(str, "AdUnitId cannot be null.");
        D.j(bVar, "AdManagerAdRequest cannot be null.");
        D.j(dVar, "LoadCallback cannot be null.");
        D.d("#008 Must be called on the main UI thread.");
        zzbby.zza(context);
        if (((Boolean) zzbdw.zzi.zze()).booleanValue()) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlh)).booleanValue()) {
                J2.b.f3804b.execute(new A2.c(context, str, bVar, dVar, 21));
                return;
            }
        }
        new zzblt(context, str).zza(bVar.f18154a, dVar);
    }

    public abstract void setAppEventListener(e eVar);
}
