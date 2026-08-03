package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzafd {
    public final java.util.List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final float zzk;
    public final java.lang.String zzl;

    private zzafd(java.util.List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, java.lang.String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = i8;
        this.zzj = i9;
        this.zzk = f;
        this.zzl = str;
    }

    public static com.google.android.gms.internal.ads.zzafd zza(com.google.android.gms.internal.ads.zzet zzetVar) throws com.google.android.gms.internal.ads.zzat {
        java.lang.String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        float f;
        try {
            zzetVar.zzk(4);
            int zzs = (zzetVar.zzs() & 3) + 1;
            if (zzs == 3) {
                throw new java.lang.IllegalStateException();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int zzs2 = zzetVar.zzs() & 31;
            for (int i9 = 0; i9 < zzs2; i9++) {
                arrayList.add(zzb(zzetVar));
            }
            int zzs3 = zzetVar.zzs();
            for (int i10 = 0; i10 < zzs3; i10++) {
                arrayList.add(zzb(zzetVar));
            }
            if (zzs2 > 0) {
                byte[] bArr = (byte[]) arrayList.get(0);
                byte[] bArr2 = (byte[]) arrayList.get(0);
                byte[] bArr3 = com.google.android.gms.internal.ads.zzgp.zza;
                com.google.android.gms.internal.ads.zzgo zze = com.google.android.gms.internal.ads.zzgp.zze(bArr2, 5, bArr.length);
                int i11 = zze.zze;
                int i12 = zze.zzf;
                int i13 = zze.zzh + 8;
                int i14 = zze.zzi + 8;
                int i15 = zze.zzj;
                int i16 = zze.zzk;
                int i17 = zze.zzl;
                int i18 = zze.zzm;
                float f2 = zze.zzg;
                str = com.google.android.gms.internal.ads.zzdq.zzb(zze.zza, zze.zzb, zze.zzc);
                i7 = i17;
                i8 = i18;
                f = f2;
                i4 = i14;
                i5 = i15;
                i6 = i16;
                i = i11;
                i2 = i12;
                i3 = i13;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                i8 = 16;
                f = 1.0f;
            }
            return new com.google.android.gms.internal.ads.zzafd(arrayList, zzs, i, i2, i3, i4, i5, i6, i7, i8, f, str);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            throw com.google.android.gms.internal.ads.zzat.zzb("Error parsing AVC config", e);
        }
    }

    private static byte[] zzb(com.google.android.gms.internal.ads.zzet zzetVar) {
        int zzt = zzetVar.zzt();
        int zzg = zzetVar.zzg();
        zzetVar.zzk(zzt);
        return com.google.android.gms.internal.ads.zzdq.zzh(zzetVar.zzi(), zzg, zzt);
    }
}
