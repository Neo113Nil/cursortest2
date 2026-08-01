package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzag {
    public final Uri zza;
    public final String zzb;
    public final zzad zzc;
    public final zzy zzd;
    public final List zze;
    public final String zzf;
    public final zzgxm zzg;
    public final Object zzh;
    public final long zzi;

    static {
        String str = zzfm.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    /* synthetic */ zzag(Uri uri, String str, zzad zzadVar, zzy zzyVar, List list, String str2, zzgxm zzgxmVar, Object obj, long j, byte[] bArr) {
        this.zza = uri;
        int i = zzas.zza;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = list;
        this.zzf = null;
        this.zzg = zzgxmVar;
        int i2 = zzgxm.zzd;
        zzgxj zzgxjVar = new zzgxj();
        if (zzgxmVar.size() > 0) {
            throw null;
        }
        zzgxjVar.zzi();
        this.zzh = null;
        this.zzi = -9223372036854775807L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzag)) {
            return false;
        }
        zzag zzagVar = (zzag) obj;
        if (this.zza.equals(zzagVar.zza)) {
            String str = zzagVar.zzb;
            if (Objects.equals(null, null)) {
                zzad zzadVar = zzagVar.zzc;
                if (Objects.equals(null, null)) {
                    zzy zzyVar = zzagVar.zzd;
                    if (Objects.equals(null, null) && this.zze.equals(zzagVar.zze)) {
                        String str2 = zzagVar.zzf;
                        if (Objects.equals(null, null) && this.zzg.equals(zzagVar.zzg)) {
                            Object obj2 = zzagVar.zzh;
                            if (Objects.equals(null, null)) {
                                long j = zzagVar.zzi;
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) (((((((this.zza.hashCode() * 923521) + this.zze.hashCode()) * 961) + this.zzg.hashCode()) * 31) * 31) - Long.MAX_VALUE);
    }
}
