package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzfwl extends zzfwa {
    Object[] zzd;
    private int zze;

    public zzfwl() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzfwa, com.google.android.gms.internal.ads.zzfwb
    public final /* bridge */ /* synthetic */ zzfwb zzb(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzfwl zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int zzh = zzfwm.zzh(this.zzb);
            Object[] objArr = this.zzd;
            if (zzh <= objArr.length) {
                int length = objArr.length - 1;
                int hashCode = obj.hashCode();
                int zza = zzfvz.zza(hashCode);
                while (true) {
                    int i7 = zza & length;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i7];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        zza = i7 + 1;
                    } else {
                        objArr2[i7] = obj;
                        this.zze += hashCode;
                        zza(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.zzd = null;
        zza(obj);
        return this;
    }

    public final zzfwl zzg(Object... objArr) {
        if (this.zzd != null) {
            for (int i7 = 0; i7 < 2; i7++) {
                zzf(objArr[i7]);
            }
        } else {
            zzd(objArr, 2);
        }
        return this;
    }

    public final zzfwl zzh(Iterable iterable) {
        iterable.getClass();
        if (this.zzd != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                zzf(it.next());
            }
        } else {
            zzc(iterable);
        }
        return this;
    }

    public final zzfwm zzi() {
        zzfwm zzv;
        boolean zzw;
        int i7 = this.zzb;
        if (i7 == 0) {
            return zzfxz.zza;
        }
        if (i7 == 1) {
            Object obj = this.zza[0];
            Objects.requireNonNull(obj);
            return new zzfyk(obj);
        }
        if (this.zzd == null || zzfwm.zzh(i7) != this.zzd.length) {
            zzv = zzfwm.zzv(this.zzb, this.zza);
            this.zzb = zzv.size();
        } else {
            int i8 = this.zzb;
            Object[] objArr = this.zza;
            zzw = zzfwm.zzw(i8, objArr.length);
            if (zzw) {
                objArr = Arrays.copyOf(objArr, i8);
            }
            zzv = new zzfxz(objArr, this.zze, this.zzd, r6.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzv;
    }

    public zzfwl(int i7, boolean z4) {
        super(i7);
        this.zzd = new Object[zzfwm.zzh(i7)];
    }
}
