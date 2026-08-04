package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzxs extends zzbs {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private final SparseArray zzh;
    private final SparseBooleanArray zzi;

    public zzxs() {
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

    public final zzxs zzw(zzbt zzbtVar) {
        zzj(zzbtVar);
        return this;
    }

    public final zzxs zzx(int i7, boolean z4) {
        if (this.zzi.get(i7) != z4) {
            if (z4) {
                this.zzi.put(i7, true);
            } else {
                this.zzi.delete(i7);
            }
        }
        return this;
    }

    public /* synthetic */ zzxs(zzxt zzxtVar, zzye zzyeVar) {
        super(zzxtVar);
        this.zza = zzxtVar.zzG;
        this.zzb = zzxtVar.zzI;
        this.zzc = zzxtVar.zzK;
        this.zzd = zzxtVar.zzP;
        this.zze = zzxtVar.zzQ;
        this.zzf = zzxtVar.zzR;
        this.zzg = zzxtVar.zzT;
        SparseArray sparseArray = zzxtVar.zzV;
        SparseArray sparseArray2 = new SparseArray();
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            sparseArray2.put(sparseArray.keyAt(i7), new HashMap((Map) sparseArray.valueAt(i7)));
        }
        this.zzh = sparseArray2;
        this.zzi = zzxtVar.zzW.clone();
    }
}
