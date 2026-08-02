package com.google.android.gms.internal.ads;

import F2.C0229g;
import F2.C0247p;
import F2.C0252s;
import F2.C0254t;
import J2.j;
import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.internal.D;

/* loaded from: classes.dex */
public final class zzbkf {
    private final Context zza;
    private final C2.b zzb;
    private zzbkb zzc;

    public zzbkf(Context context, C2.b bVar) {
        D.i(context);
        D.i(bVar);
        this.zza = context;
        this.zzb = bVar;
        zzbby.zza(context);
    }

    public static final boolean zzc(String str) {
        zzbbp zzbbpVar = zzbby.zzjU;
        C0254t c0254t = C0254t.f2723d;
        if (!((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            return false;
        }
        D.i(str);
        if (str.length() > ((Integer) c0254t.f2726c.zzb(zzbby.zzjW)).intValue()) {
            j.b("H5 GMSG exceeds max length");
            return false;
        }
        Uri parse = Uri.parse(str);
        return "gmsg".equals(parse.getScheme()) && "mobileads.google.com".equals(parse.getHost()) && "/h5ads".equals(parse.getPath());
    }

    private final void zzd() {
        if (this.zzc != null) {
            return;
        }
        Context context = this.zza;
        C0247p c0247p = C0252s.f2717f.f2719b;
        zzbok zzbokVar = new zzbok();
        C2.b bVar = this.zzb;
        c0247p.getClass();
        this.zzc = (zzbkb) new C0229g(context, zzbokVar, bVar).d(context, false);
    }

    public final void zza() {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjU)).booleanValue()) {
            zzd();
            zzbkb zzbkbVar = this.zzc;
            if (zzbkbVar != null) {
                try {
                    zzbkbVar.zze();
                } catch (RemoteException e7) {
                    j.i("#007 Could not call remote method.", e7);
                }
            }
        }
    }

    public final boolean zzb(String str) {
        if (!zzc(str)) {
            return false;
        }
        zzd();
        zzbkb zzbkbVar = this.zzc;
        if (zzbkbVar == null) {
            return false;
        }
        try {
            zzbkbVar.zzf(str);
            return true;
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
            return true;
        }
    }
}
