package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class zzffx {
    public static void zza(I3.b bVar, zzffy zzffyVar, zzffn zzffnVar) {
        zzg(bVar, zzffyVar, zzffnVar, false);
    }

    public static void zzb(I3.b bVar, zzffy zzffyVar, zzffn zzffnVar) {
        zzg(bVar, zzffyVar, zzffnVar, true);
    }

    public static void zzc(I3.b bVar, zzffy zzffyVar, zzffn zzffnVar) {
        if (((Boolean) zzbdr.zzc.zze()).booleanValue()) {
            zzgbc.zzr(zzgat.zzu(bVar), new zzffw(zzffyVar, zzffnVar), zzbza.zzg);
        }
    }

    public static void zzd(I3.b bVar, zzffn zzffnVar) {
        if (((Boolean) zzbdr.zzc.zze()).booleanValue()) {
            zzgbc.zzr(zzgat.zzu(bVar), new zzffu(zzffnVar), zzbza.zzg);
        }
    }

    public static boolean zze(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) C0254t.f2723d.f2726c.zzb(zzbby.zziO), str);
    }

    public static int zzf(zzfba zzfbaVar) {
        int iO0 = Q0.a.o0(zzfbaVar) - 1;
        return (iO0 == 0 || iO0 == 1) ? 7 : 23;
    }

    private static void zzg(I3.b bVar, zzffy zzffyVar, zzffn zzffnVar, boolean z4) {
        if (((Boolean) zzbdr.zzc.zze()).booleanValue()) {
            zzgbc.zzr(zzgat.zzu(bVar), new zzffv(zzffyVar, zzffnVar, z4), zzbza.zzg);
        }
    }
}
