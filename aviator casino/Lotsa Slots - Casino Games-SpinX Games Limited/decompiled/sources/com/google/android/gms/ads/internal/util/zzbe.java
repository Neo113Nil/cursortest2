package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzbe {
    private final java.util.List zza = new java.util.ArrayList();
    private final java.util.List zzb = new java.util.ArrayList();
    private final java.util.List zzc = new java.util.ArrayList();

    public final com.google.android.gms.ads.internal.util.zzbe zza(java.lang.String str, double d, double d2) {
        java.util.List list;
        int i = 0;
        while (true) {
            list = this.zza;
            if (i >= list.size()) {
                break;
            }
            double doubleValue = ((java.lang.Double) this.zzc.get(i)).doubleValue();
            double doubleValue2 = ((java.lang.Double) this.zzb.get(i)).doubleValue();
            if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                break;
            }
            i++;
        }
        list.add(i, str);
        this.zzc.add(i, java.lang.Double.valueOf(d));
        this.zzb.add(i, java.lang.Double.valueOf(d2));
        return this;
    }

    public final com.google.android.gms.ads.internal.util.zzbf zzb() {
        return new com.google.android.gms.ads.internal.util.zzbf(this, null);
    }

    final /* synthetic */ java.util.List zzc() {
        return this.zza;
    }

    final /* synthetic */ java.util.List zzd() {
        return this.zzb;
    }

    final /* synthetic */ java.util.List zze() {
        return this.zzc;
    }
}
