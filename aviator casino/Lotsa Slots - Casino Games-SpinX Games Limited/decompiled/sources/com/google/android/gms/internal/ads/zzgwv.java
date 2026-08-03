package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgwv extends com.google.android.gms.internal.ads.zzgwg {
    java.lang.Object[] zzd;
    private int zze;

    public zzgwv() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzgwg, com.google.android.gms.internal.ads.zzgwh
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgwh zzd(java.lang.Object obj) {
        zzf(obj);
        return this;
    }

    zzgwv(int i, boolean z) {
        super(i);
        this.zzd = new java.lang.Object[com.google.android.gms.internal.ads.zzgww.zzo(i)];
    }

    public final com.google.android.gms.internal.ads.zzgwv zzg(java.lang.Iterable iterable) {
        iterable.getClass();
        if (this.zzd != null) {
            java.util.Iterator it = iterable.iterator();
            while (it.hasNext()) {
                zzf(it.next());
            }
        } else {
            super.zzc(iterable);
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgww zzh() {
        com.google.android.gms.internal.ads.zzgww zzw;
        boolean zzx;
        int i = this.zzb;
        if (i == 0) {
            return com.google.android.gms.internal.ads.zzgyn.zza;
        }
        if (i == 1) {
            return new com.google.android.gms.internal.ads.zzgyx(java.util.Objects.requireNonNull(this.zza[0]));
        }
        if (this.zzd == null || com.google.android.gms.internal.ads.zzgww.zzo(i) != this.zzd.length) {
            zzw = com.google.android.gms.internal.ads.zzgww.zzw(this.zzb, this.zza);
            this.zzb = zzw.size();
        } else {
            int i2 = this.zzb;
            java.lang.Object[] objArr = this.zza;
            zzx = com.google.android.gms.internal.ads.zzgww.zzx(i2, objArr.length);
            if (zzx) {
                objArr = java.util.Arrays.copyOf(objArr, i2);
            }
            zzw = new com.google.android.gms.internal.ads.zzgyn(objArr, this.zze, this.zzd, r6.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzw;
    }

    public final com.google.android.gms.internal.ads.zzgwv zzf(java.lang.Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int zzo = com.google.android.gms.internal.ads.zzgww.zzo(this.zzb);
            java.lang.Object[] objArr = this.zzd;
            if (zzo <= objArr.length) {
                java.util.Objects.requireNonNull(objArr);
                int length = this.zzd.length - 1;
                int hashCode = obj.hashCode();
                int zza = com.google.android.gms.internal.ads.zzgwf.zza(hashCode);
                while (true) {
                    int i = zza & length;
                    java.lang.Object[] objArr2 = this.zzd;
                    java.lang.Object obj2 = objArr2[i];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        zza = i + 1;
                    } else {
                        objArr2[i] = obj;
                        this.zze += hashCode;
                        super.zza(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }
}
