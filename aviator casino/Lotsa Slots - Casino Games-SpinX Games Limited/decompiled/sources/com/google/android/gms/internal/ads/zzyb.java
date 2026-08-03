package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzyb extends com.google.android.gms.internal.ads.zzws {
    private static final com.google.android.gms.internal.ads.zzak zza;
    private final com.google.android.gms.internal.ads.zzxm[] zzb;
    private final java.util.List zzc;
    private final com.google.android.gms.internal.ads.zzbf[] zzd;
    private final java.util.ArrayList zze;
    private int zzf = -1;
    private long[][] zzg;
    private com.google.android.gms.internal.ads.zzxz zzh;
    private final com.google.android.gms.internal.ads.zzwv zzi;

    static {
        com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
        zzzVar.zza("MergingMediaSource");
        zza = zzzVar.zzc();
    }

    public zzyb(boolean z, boolean z2, com.google.android.gms.internal.ads.zzwv zzwvVar, com.google.android.gms.internal.ads.zzxm... zzxmVarArr) {
        this.zzb = zzxmVarArr;
        this.zzi = zzwvVar;
        this.zze = new java.util.ArrayList(java.util.Arrays.asList(zzxmVarArr));
        this.zzc = new java.util.ArrayList(zzxmVarArr.length);
        int i = 0;
        while (true) {
            int length = zzxmVarArr.length;
            if (i >= length) {
                this.zzd = new com.google.android.gms.internal.ads.zzbf[length];
                this.zzg = new long[0][];
                new java.util.HashMap();
                com.google.android.gms.internal.ads.zzgyb.zzb(8).zzb(2).zza();
                return;
            }
            this.zzc.add(new java.util.ArrayList());
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwj, com.google.android.gms.internal.ads.zzxm
    public final void zzA(com.google.android.gms.internal.ads.zzak zzakVar) {
        this.zzb[0].zzA(zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzD(com.google.android.gms.internal.ads.zzxi zzxiVar) {
        com.google.android.gms.internal.ads.zzxy zzxyVar = (com.google.android.gms.internal.ads.zzxy) zzxiVar;
        int i = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzxm[] zzxmVarArr = this.zzb;
            if (i >= zzxmVarArr.length) {
                return;
            }
            java.util.List list = (java.util.List) this.zzc.get(i);
            com.google.android.gms.internal.ads.zzxi zza2 = zzxyVar.zza(i);
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (((com.google.android.gms.internal.ads.zzya) list.get(i2)).zzb().equals(zza2)) {
                    list.remove(i2);
                    break;
                }
                i2++;
            }
            zzxmVarArr[i].zzD(zzxyVar.zza(i));
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final com.google.android.gms.internal.ads.zzxi zzG(com.google.android.gms.internal.ads.zzxk zzxkVar, com.google.android.gms.internal.ads.zzabl zzablVar, long j) {
        com.google.android.gms.internal.ads.zzbf[] zzbfVarArr = this.zzd;
        com.google.android.gms.internal.ads.zzxm[] zzxmVarArr = this.zzb;
        int length = zzxmVarArr.length;
        com.google.android.gms.internal.ads.zzxi[] zzxiVarArr = new com.google.android.gms.internal.ads.zzxi[length];
        int zze = zzbfVarArr[0].zze(zzxkVar.zza);
        for (int i = 0; i < length; i++) {
            com.google.android.gms.internal.ads.zzxk zza2 = zzxkVar.zza(zzbfVarArr[i].zzf(zze));
            zzxiVarArr[i] = zzxmVarArr[i].zzG(zza2, zzablVar, j - this.zzg[zze][i]);
            ((java.util.List) this.zzc.get(i)).add(new com.google.android.gms.internal.ads.zzya(zza2, zzxiVarArr[i], null));
        }
        return new com.google.android.gms.internal.ads.zzxy(this.zzi, this.zzg[zze], zzxiVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final com.google.android.gms.internal.ads.zzak zzJ() {
        com.google.android.gms.internal.ads.zzxm[] zzxmVarArr = this.zzb;
        return zzxmVarArr.length > 0 ? zzxmVarArr[0].zzJ() : zza;
    }

    @Override // com.google.android.gms.internal.ads.zzws, com.google.android.gms.internal.ads.zzwj
    protected final void zza(com.google.android.gms.internal.ads.zzin zzinVar) {
        super.zza(zzinVar);
        int i = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzxm[] zzxmVarArr = this.zzb;
            if (i >= zzxmVarArr.length) {
                return;
            }
            zzv(java.lang.Integer.valueOf(i), zzxmVarArr[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzws, com.google.android.gms.internal.ads.zzwj
    protected final void zzd() {
        super.zzd();
        java.util.Arrays.fill(this.zzd, (java.lang.Object) null);
        this.zzf = -1;
        this.zzh = null;
        java.util.ArrayList arrayList = this.zze;
        arrayList.clear();
        java.util.Collections.addAll(arrayList, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzws, com.google.android.gms.internal.ads.zzxm
    public final void zzt() throws java.io.IOException {
        com.google.android.gms.internal.ads.zzxz zzxzVar = this.zzh;
        if (zzxzVar != null) {
            throw zzxzVar;
        }
        super.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzws
    protected final /* bridge */ /* synthetic */ void zzu(java.lang.Object obj, com.google.android.gms.internal.ads.zzxm zzxmVar, com.google.android.gms.internal.ads.zzbf zzbfVar) {
        int i;
        java.lang.Integer num = (java.lang.Integer) obj;
        if (this.zzh != null) {
            return;
        }
        if (this.zzf == -1) {
            i = zzbfVar.zzc();
            this.zzf = i;
        } else {
            int zzc = zzbfVar.zzc();
            int i2 = this.zzf;
            if (zzc != i2) {
                this.zzh = new com.google.android.gms.internal.ads.zzxz(0);
                return;
            }
            i = i2;
        }
        if (this.zzg.length == 0) {
            this.zzg = (long[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Long.TYPE, i, this.zzd.length);
        }
        java.util.ArrayList arrayList = this.zze;
        arrayList.remove(zzxmVar);
        com.google.android.gms.internal.ads.zzbf[] zzbfVarArr = this.zzd;
        zzbfVarArr[num.intValue()] = zzbfVar;
        if (arrayList.isEmpty()) {
            zze(zzbfVarArr[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzws
    protected final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzxk zzx(java.lang.Object obj, com.google.android.gms.internal.ads.zzxk zzxkVar) {
        int intValue = ((java.lang.Integer) obj).intValue();
        java.util.List list = this.zzc;
        java.util.List list2 = (java.util.List) list.get(intValue);
        for (int i = 0; i < list2.size(); i++) {
            if (((com.google.android.gms.internal.ads.zzya) list2.get(i)).zza().equals(zzxkVar)) {
                return ((com.google.android.gms.internal.ads.zzya) ((java.util.List) list.get(0)).get(i)).zza();
            }
        }
        return null;
    }
}
