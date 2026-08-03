package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhlk extends com.google.android.gms.internal.ads.zzibm {
    public static final com.google.android.gms.internal.ads.zzibg zza(com.google.android.gms.internal.ads.zzicd zzicdVar) throws java.io.IOException {
        java.lang.String str;
        int zzm = zzicdVar.zzm();
        com.google.android.gms.internal.ads.zzibg zzc = zzc(zzicdVar, zzm);
        if (zzc == null) {
            return zzb(zzicdVar, zzm);
        }
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        while (true) {
            if (zzicdVar.zzf()) {
                if (zzc instanceof com.google.android.gms.internal.ads.zzibi) {
                    str = zzicdVar.zzh();
                    if (!com.google.android.gms.internal.ads.zzhlm.zza(str)) {
                        throw new java.io.IOException("illegal characters in string");
                    }
                } else {
                    str = null;
                }
                int zzm2 = zzicdVar.zzm();
                com.google.android.gms.internal.ads.zzibg zzc2 = zzc(zzicdVar, zzm2);
                com.google.android.gms.internal.ads.zzibg zzb = zzc2 == null ? zzb(zzicdVar, zzm2) : zzc2;
                if (zzc instanceof com.google.android.gms.internal.ads.zzibf) {
                    ((com.google.android.gms.internal.ads.zzibf) zzc).zza(zzb);
                } else {
                    com.google.android.gms.internal.ads.zzibi zzibiVar = (com.google.android.gms.internal.ads.zzibi) zzc;
                    if (zzibiVar.zzc(str)) {
                        java.lang.String.valueOf(str);
                        throw new java.io.IOException("duplicate key: ".concat(java.lang.String.valueOf(str)));
                    }
                    zzibiVar.zza(str, zzb);
                }
                if (zzc2 != null) {
                    arrayDeque.addLast(zzc);
                    if (arrayDeque.size() > 100) {
                        throw new java.io.IOException("too many recursions");
                    }
                    zzc = zzb;
                } else {
                    continue;
                }
            } else {
                if (zzc instanceof com.google.android.gms.internal.ads.zzibf) {
                    zzicdVar.zzc();
                } else {
                    zzicdVar.zze();
                }
                if (arrayDeque.isEmpty()) {
                    return zzc;
                }
                zzc = (com.google.android.gms.internal.ads.zzibg) arrayDeque.removeLast();
            }
        }
    }

    private static final com.google.android.gms.internal.ads.zzibg zzb(com.google.android.gms.internal.ads.zzicd zzicdVar, int i) throws java.io.IOException {
        int i2 = i - 1;
        if (i2 == 5) {
            java.lang.String zzi = zzicdVar.zzi();
            if (com.google.android.gms.internal.ads.zzhlm.zza(zzi)) {
                return new com.google.android.gms.internal.ads.zzibk(zzi);
            }
            throw new java.io.IOException("illegal characters in string");
        }
        if (i2 == 6) {
            return new com.google.android.gms.internal.ads.zzibk(new com.google.android.gms.internal.ads.zzhll(zzicdVar.zzi()));
        }
        if (i2 == 7) {
            return new com.google.android.gms.internal.ads.zzibk(java.lang.Boolean.valueOf(zzicdVar.zzj()));
        }
        if (i2 != 8) {
            throw new java.lang.IllegalStateException("Unexpected token: ".concat(com.google.android.gms.internal.ads.zzice.zza(i)));
        }
        zzicdVar.zzk();
        return com.google.android.gms.internal.ads.zzibh.zza;
    }

    @javax.annotation.Nullable
    private static final com.google.android.gms.internal.ads.zzibg zzc(com.google.android.gms.internal.ads.zzicd zzicdVar, int i) throws java.io.IOException {
        int i2 = i - 1;
        if (i2 == 0) {
            zzicdVar.zzb();
            return new com.google.android.gms.internal.ads.zzibf();
        }
        if (i2 != 2) {
            return null;
        }
        zzicdVar.zzd();
        return new com.google.android.gms.internal.ads.zzibi();
    }
}
