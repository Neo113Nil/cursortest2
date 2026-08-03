package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzmy extends com.google.android.gms.internal.ads.zziw {
    public static final /* synthetic */ int zzb = 0;
    private final int zzc;
    private final int zzd;
    private final int[] zze;
    private final int[] zzf;
    private final com.google.android.gms.internal.ads.zzbf[] zzg;
    private final java.lang.Object[] zzh;
    private final java.util.HashMap zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzmy(java.util.Collection collection, com.google.android.gms.internal.ads.zzzf zzzfVar) {
        this(r0, r1, zzzfVar);
        com.google.android.gms.internal.ads.zzbf[] zzbfVarArr = new com.google.android.gms.internal.ads.zzbf[collection.size()];
        java.util.Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            zzbfVarArr[i2] = ((com.google.android.gms.internal.ads.zzmg) it.next()).zzb();
            i2++;
        }
        java.lang.Object[] objArr = new java.lang.Object[collection.size()];
        java.util.Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((com.google.android.gms.internal.ads.zzmg) it2.next()).zza();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zziw
    protected final int zzp(int i) {
        return com.google.android.gms.internal.ads.zzfl.zzn(this.zze, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zziw
    protected final int zzq(int i) {
        return com.google.android.gms.internal.ads.zzfl.zzn(this.zzf, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zziw
    protected final int zzr(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) this.zzi.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zziw
    protected final com.google.android.gms.internal.ads.zzbf zzs(int i) {
        return this.zzg[i];
    }

    @Override // com.google.android.gms.internal.ads.zziw
    protected final int zzt(int i) {
        return this.zze[i];
    }

    @Override // com.google.android.gms.internal.ads.zziw
    protected final int zzu(int i) {
        return this.zzf[i];
    }

    @Override // com.google.android.gms.internal.ads.zziw
    protected final java.lang.Object zzv(int i) {
        return this.zzh[i];
    }

    final java.util.List zzw() {
        return java.util.Arrays.asList(this.zzg);
    }

    public final com.google.android.gms.internal.ads.zzmy zzx(com.google.android.gms.internal.ads.zzzf zzzfVar) {
        com.google.android.gms.internal.ads.zzbf[] zzbfVarArr = this.zzg;
        com.google.android.gms.internal.ads.zzbf[] zzbfVarArr2 = new com.google.android.gms.internal.ads.zzbf[zzbfVarArr.length];
        for (int i = 0; i < zzbfVarArr.length; i++) {
            zzbfVarArr2[i] = new com.google.android.gms.internal.ads.zzmx(this, zzbfVarArr[i]);
        }
        return new com.google.android.gms.internal.ads.zzmy(zzbfVarArr2, this.zzh, zzzfVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzmy(com.google.android.gms.internal.ads.zzbf[] zzbfVarArr, java.lang.Object[] objArr, com.google.android.gms.internal.ads.zzzf zzzfVar) {
        super(false, zzzfVar);
        int i = 0;
        this.zzg = zzbfVarArr;
        int length = zzbfVarArr.length;
        this.zze = new int[length];
        this.zzf = new int[length];
        this.zzh = objArr;
        this.zzi = new java.util.HashMap();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < zzbfVarArr.length) {
            com.google.android.gms.internal.ads.zzbf zzbfVar = zzbfVarArr[i];
            this.zzg[i4] = zzbfVar;
            this.zzf[i4] = i2;
            this.zze[i4] = i3;
            i2 += zzbfVar.zza();
            i3 += this.zzg[i4].zzc();
            this.zzi.put(objArr[i4], java.lang.Integer.valueOf(i4));
            i++;
            i4++;
        }
        this.zzc = i2;
        this.zzd = i3;
    }
}
