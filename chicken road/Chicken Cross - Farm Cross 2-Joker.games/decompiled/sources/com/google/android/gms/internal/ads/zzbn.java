package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbn {
    public static final zzbn zza = new zzbn(zzgxm.zzi());
    private final zzgxm zzb;

    static {
        String str = zzfm.zza;
        Integer.toString(0, 36);
    }

    public zzbn(List list) {
        this.zzb = zzgxm.zzq(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zzb.equals(((zzbn) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final zzgxm zza() {
        return this.zzb;
    }

    public final boolean zzb(int i) {
        int i2 = 0;
        while (true) {
            zzgxm zzgxmVar = this.zzb;
            if (i2 >= zzgxmVar.size()) {
                return false;
            }
            zzbm zzbmVar = (zzbm) zzgxmVar.get(i2);
            if (zzbmVar.zzb() && zzbmVar.zzd() == i) {
                return true;
            }
            i2++;
        }
    }
}
