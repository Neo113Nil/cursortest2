package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class zzlk extends zzhh {
    public static final /* synthetic */ int zzb = 0;
    private final int zzc;
    private final int zzd;
    private final int[] zze;
    private final int[] zzf;
    private final zzbn[] zzg;
    private final Object[] zzh;
    private final HashMap zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzlk(Collection collection, zzwn zzwnVar) {
        this(r0, r1, zzwnVar);
        zzbn[] zzbnVarArr = new zzbn[collection.size()];
        Iterator it = collection.iterator();
        int i7 = 0;
        int i8 = 0;
        while (it.hasNext()) {
            zzbnVarArr[i8] = ((zzks) it.next()).zza();
            i8++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i7] = ((zzks) it2.next()).zzb();
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final int zzp(Object obj) {
        Integer num = (Integer) this.zzi.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final int zzq(int i7) {
        return zzen.zzc(this.zze, i7 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final int zzr(int i7) {
        return zzen.zzc(this.zzf, i7 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final int zzs(int i7) {
        return this.zze[i7];
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final int zzt(int i7) {
        return this.zzf[i7];
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final zzbn zzu(int i7) {
        return this.zzg[i7];
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final Object zzv(int i7) {
        return this.zzh[i7];
    }

    public final List zzw() {
        return Arrays.asList(this.zzg);
    }

    public final zzlk zzx(zzwn zzwnVar) {
        zzbn[] zzbnVarArr = new zzbn[this.zzg.length];
        int i7 = 0;
        while (true) {
            zzbn[] zzbnVarArr2 = this.zzg;
            if (i7 >= zzbnVarArr2.length) {
                return new zzlk(zzbnVarArr, this.zzh, zzwnVar);
            }
            zzbnVarArr[i7] = new zzlj(this, zzbnVarArr2[i7]);
            i7++;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzlk(zzbn[] zzbnVarArr, Object[] objArr, zzwn zzwnVar) {
        super(false, zzwnVar);
        int i7 = 0;
        this.zzg = zzbnVarArr;
        int length = zzbnVarArr.length;
        this.zze = new int[length];
        this.zzf = new int[length];
        this.zzh = objArr;
        this.zzi = new HashMap();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i7 < zzbnVarArr.length) {
            zzbn zzbnVar = zzbnVarArr[i7];
            this.zzg[i10] = zzbnVar;
            this.zzf[i10] = i8;
            this.zze[i10] = i9;
            i8 += zzbnVar.zzc();
            i9 += this.zzg[i10].zzb();
            this.zzi.put(objArr[i10], Integer.valueOf(i10));
            i7++;
            i10++;
        }
        this.zzc = i8;
        this.zzd = i9;
    }
}
