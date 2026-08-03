package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaal extends com.google.android.gms.internal.ads.zzbk {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private final android.util.SparseArray zzh;
    private final android.util.SparseBooleanArray zzi;

    public zzaal() {
        this.zzh = new android.util.SparseArray();
        this.zzi = new android.util.SparseBooleanArray();
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
    }

    final /* synthetic */ boolean zzA() {
        return this.zzb;
    }

    final /* synthetic */ boolean zzB() {
        return this.zzc;
    }

    final /* synthetic */ boolean zzC() {
        return this.zzd;
    }

    final /* synthetic */ boolean zzD() {
        return this.zze;
    }

    final /* synthetic */ boolean zzE() {
        return this.zzf;
    }

    final /* synthetic */ boolean zzF() {
        return this.zzg;
    }

    final /* synthetic */ android.util.SparseArray zzG() {
        return this.zzh;
    }

    final /* synthetic */ android.util.SparseBooleanArray zzH() {
        return this.zzi;
    }

    protected final com.google.android.gms.internal.ads.zzaal zzx(com.google.android.gms.internal.ads.zzbl zzblVar) {
        super.zza(zzblVar);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzaal zzy(int i, boolean z) {
        android.util.SparseBooleanArray sparseBooleanArray = this.zzi;
        if (sparseBooleanArray.get(i) != z) {
            if (z) {
                sparseBooleanArray.put(i, true);
            } else {
                sparseBooleanArray.delete(i);
            }
        }
        return this;
    }

    final /* synthetic */ boolean zzz() {
        return this.zza;
    }

    /* synthetic */ zzaal(com.google.android.gms.internal.ads.zzaam zzaamVar, byte[] bArr) {
        super(zzaamVar);
        this.zza = zzaamVar.zzK;
        this.zzb = zzaamVar.zzM;
        this.zzc = zzaamVar.zzO;
        this.zzd = zzaamVar.zzT;
        this.zze = zzaamVar.zzU;
        this.zzf = zzaamVar.zzV;
        this.zzg = zzaamVar.zzX;
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        int i = 0;
        while (true) {
            android.util.SparseArray zze = zzaamVar.zze();
            if (i < zze.size()) {
                sparseArray.put(zze.keyAt(i), new java.util.HashMap((java.util.Map) zze.valueAt(i)));
                i++;
            } else {
                this.zzh = sparseArray;
                this.zzi = zzaamVar.zzf().clone();
                return;
            }
        }
    }
}
