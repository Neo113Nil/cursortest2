package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.gms.internal.ads.zzbbd;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzxt extends zzbt {
    public static final zzxt zzF = new zzxt(new zzxs());
    public final boolean zzG;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final boolean zzU;
    private final SparseArray zzV;
    private final SparseBooleanArray zzW;

    static {
        int i7 = zzen.zza;
        Integer.toString(zzbbd.zzq.zzf, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    @Override // com.google.android.gms.internal.ads.zzbt
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzxt.class == obj.getClass()) {
            zzxt zzxtVar = (zzxt) obj;
            if (super.equals(zzxtVar) && this.zzG == zzxtVar.zzG && this.zzI == zzxtVar.zzI && this.zzK == zzxtVar.zzK && this.zzP == zzxtVar.zzP && this.zzQ == zzxtVar.zzQ && this.zzR == zzxtVar.zzR && this.zzT == zzxtVar.zzT) {
                SparseBooleanArray sparseBooleanArray = this.zzW;
                SparseBooleanArray sparseBooleanArray2 = zzxtVar.zzW;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size) {
                            SparseArray sparseArray = this.zzV;
                            SparseArray sparseArray2 = zzxtVar.zzV;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i8 = 0; i8 < size2; i8++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i8));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i8);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzwv zzwvVar = (zzwv) entry.getKey();
                                                if (map2.containsKey(zzwvVar)) {
                                                    Object value = entry.getValue();
                                                    Object obj2 = map2.get(zzwvVar);
                                                    int i9 = zzen.zza;
                                                    if (!Objects.equals(value, obj2)) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i7)) < 0) {
                                break;
                            }
                            i7++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbt
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.zzG ? 1 : 0)) * 961) + (this.zzI ? 1 : 0)) * 961) + (this.zzK ? 1 : 0)) * 28629151) + (this.zzP ? 1 : 0)) * 31) + (this.zzQ ? 1 : 0)) * 31) + (this.zzR ? 1 : 0)) * 961) + (this.zzT ? 1 : 0)) * 31;
    }

    public final zzxs zzc() {
        return new zzxs(this, null);
    }

    @Deprecated
    public final zzxu zzd(int i7, zzwv zzwvVar) {
        Map map = (Map) this.zzV.get(i7);
        if (map != null) {
            return (zzxu) map.get(zzwvVar);
        }
        return null;
    }

    public final boolean zze(int i7) {
        return this.zzW.get(i7);
    }

    @Deprecated
    public final boolean zzf(int i7, zzwv zzwvVar) {
        Map map = (Map) this.zzV.get(i7);
        return map != null && map.containsKey(zzwvVar);
    }

    private zzxt(zzxs zzxsVar) {
        super(zzxsVar);
        this.zzG = zzxsVar.zza;
        this.zzH = false;
        this.zzI = zzxsVar.zzb;
        this.zzJ = false;
        this.zzK = zzxsVar.zzc;
        this.zzL = false;
        this.zzM = false;
        this.zzN = false;
        this.zzO = false;
        this.zzP = zzxsVar.zzd;
        this.zzQ = zzxsVar.zze;
        this.zzR = zzxsVar.zzf;
        this.zzS = false;
        this.zzT = zzxsVar.zzg;
        this.zzU = false;
        this.zzV = zzxsVar.zzh;
        this.zzW = zzxsVar.zzi;
    }
}
