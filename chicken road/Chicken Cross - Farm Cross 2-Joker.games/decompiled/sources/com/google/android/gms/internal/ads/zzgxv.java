package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzgxv extends zzgxg {
    Object[] zzd;
    private int zze;

    public zzgxv() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzgxg, com.google.android.gms.internal.ads.zzgxh
    public final /* bridge */ /* synthetic */ zzgxh zzd(Object obj) {
        zzf(obj);
        return this;
    }

    zzgxv(int i, boolean z) {
        super(i);
        this.zzd = new Object[zzgxw.zzo(i)];
    }

    public final zzgxv zzg(Iterable iterable) {
        iterable.getClass();
        if (this.zzd != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                zzf(it.next());
            }
        } else {
            super.zzc(iterable);
        }
        return this;
    }

    public final zzgxw zzh() {
        zzgxw zzw;
        boolean zzx;
        int i = this.zzb;
        if (i == 0) {
            return zzgzn.zza;
        }
        if (i == 1) {
            return new zzgzx(Objects.requireNonNull(this.zza[0]));
        }
        if (this.zzd == null || zzgxw.zzo(i) != this.zzd.length) {
            zzw = zzgxw.zzw(this.zzb, this.zza);
            this.zzb = zzw.size();
        } else {
            int i2 = this.zzb;
            Object[] objArr = this.zza;
            zzx = zzgxw.zzx(i2, objArr.length);
            if (zzx) {
                objArr = Arrays.copyOf(objArr, i2);
            }
            zzw = new zzgzn(objArr, this.zze, this.zzd, r6.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzw;
    }

    public final zzgxv zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int zzo = zzgxw.zzo(this.zzb);
            Object[] objArr = this.zzd;
            if (zzo <= objArr.length) {
                Objects.requireNonNull(objArr);
                int length = this.zzd.length - 1;
                int hashCode = obj.hashCode();
                int zza = zzgxf.zza(hashCode);
                while (true) {
                    int i = zza & length;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i];
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
