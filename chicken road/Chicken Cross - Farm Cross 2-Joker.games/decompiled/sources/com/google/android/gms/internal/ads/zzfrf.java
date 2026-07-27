package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfrf {
    public static boolean zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzki), str);
    }

    public static void zzb(ListenableFuture listenableFuture, zzfqw zzfqwVar) {
        if (((Boolean) zzbla.zzc.zze()).booleanValue()) {
            zzhcy.zzr(zzhcq.zzw(listenableFuture), new zzfrb(zzfqwVar), zzcgj.zzh);
        }
    }

    public static zzfpi zzc(final zzfqw zzfqwVar) {
        return new zzfpi() { // from class: com.google.android.gms.internal.ads.zzfre
            @Override // com.google.android.gms.internal.ads.zzfpi
            public final /* synthetic */ Object zza(Object obj) {
                if (((Boolean) zzbla.zzc.zze()).booleanValue()) {
                    zzfqw.this.zza();
                }
                return obj;
            }
        };
    }

    public static void zzd(ListenableFuture listenableFuture, zzfrg zzfrgVar, zzfqw zzfqwVar) {
        zzh(listenableFuture, zzfrgVar, zzfqwVar, false);
    }

    public static void zze(ListenableFuture listenableFuture, zzfrg zzfrgVar, zzfqw zzfqwVar) {
        zzh(listenableFuture, zzfrgVar, zzfqwVar, true);
    }

    public static void zzf(ListenableFuture listenableFuture, zzfrg zzfrgVar, zzfqw zzfqwVar) {
        if (((Boolean) zzbla.zzc.zze()).booleanValue()) {
            zzhcy.zzr(zzhcq.zzw(listenableFuture), new zzfrd(zzfrgVar, zzfqwVar), zzcgj.zzh);
        }
    }

    public static int zzg(zzflw zzflwVar) {
        int zzg = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzg(zzflwVar) - 1;
        return (zzg == 0 || zzg == 1) ? 7 : 23;
    }

    private static void zzh(ListenableFuture listenableFuture, zzfrg zzfrgVar, zzfqw zzfqwVar, boolean z) {
        if (((Boolean) zzbla.zzc.zze()).booleanValue()) {
            zzhcy.zzr(zzhcq.zzw(listenableFuture), new zzfrc(zzfrgVar, zzfqwVar, z), zzcgj.zzh);
        }
    }
}
