package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzajw implements com.google.android.gms.internal.ads.zzao {
    public final java.util.List zza;

    public zzajw(java.util.List list) {
        this.zza = list;
        boolean z = false;
        if (!list.isEmpty()) {
            long j = ((com.google.android.gms.internal.ads.zzajv) list.get(0)).zzb;
            int i = 1;
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                if (((com.google.android.gms.internal.ads.zzajv) list.get(i)).zza < j) {
                    z = true;
                    break;
                } else {
                    j = ((com.google.android.gms.internal.ads.zzajv) list.get(i)).zzb;
                    i++;
                }
            }
        }
        com.google.android.gms.internal.ads.zzgtj.zza(!z);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((com.google.android.gms.internal.ads.zzajw) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final java.lang.String toString() {
        return "SlowMotion: segments=".concat(this.zza.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public /* synthetic */ void zza(com.google.android.gms.internal.ads.zzam zzamVar) {
        com.google.android.gms.internal.ads.zzao.CC.$default$zza(this, zzamVar);
    }
}
