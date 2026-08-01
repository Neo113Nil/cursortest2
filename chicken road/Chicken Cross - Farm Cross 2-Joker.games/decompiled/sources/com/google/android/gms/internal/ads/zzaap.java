package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzaap extends zzbk {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private final SparseArray zzh;
    private final SparseBooleanArray zzi;

    public zzaap() {
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
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

    final /* synthetic */ SparseArray zzG() {
        return this.zzh;
    }

    final /* synthetic */ SparseBooleanArray zzH() {
        return this.zzi;
    }

    protected final zzaap zzx(zzbl zzblVar) {
        super.zza(zzblVar);
        return this;
    }

    public final zzaap zzy(int i, boolean z) {
        SparseBooleanArray sparseBooleanArray = this.zzi;
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

    /* synthetic */ zzaap(zzaaq zzaaqVar, byte[] bArr) {
        super(zzaaqVar);
        this.zza = zzaaqVar.zzK;
        this.zzb = zzaaqVar.zzM;
        this.zzc = zzaaqVar.zzO;
        this.zzd = zzaaqVar.zzT;
        this.zze = zzaaqVar.zzU;
        this.zzf = zzaaqVar.zzV;
        this.zzg = zzaaqVar.zzX;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray zze = zzaaqVar.zze();
            if (i < zze.size()) {
                sparseArray.put(zze.keyAt(i), new HashMap((Map) zze.valueAt(i)));
                i++;
            } else {
                this.zzh = sparseArray;
                this.zzi = zzaaqVar.zzf().clone();
                return;
            }
        }
    }
}
