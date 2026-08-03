package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaam extends com.google.android.gms.internal.ads.zzbl {
    public static final com.google.android.gms.internal.ads.zzaam zzJ = new com.google.android.gms.internal.ads.zzaam(new com.google.android.gms.internal.ads.zzaal());
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
    public final boolean zzV;
    public final boolean zzW;
    public final boolean zzX;
    public final boolean zzY;
    private final android.util.SparseArray zzZ;
    private final android.util.SparseBooleanArray zzaa;

    static {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        java.lang.Integer.toString(1000, 36);
        java.lang.Integer.toString(1001, 36);
        java.lang.Integer.toString(1002, 36);
        java.lang.Integer.toString(1003, 36);
        java.lang.Integer.toString(1004, 36);
        java.lang.Integer.toString(1005, 36);
        java.lang.Integer.toString(1006, 36);
        java.lang.Integer.toString(1007, 36);
        java.lang.Integer.toString(1008, 36);
        java.lang.Integer.toString(1009, 36);
        java.lang.Integer.toString(1010, 36);
        java.lang.Integer.toString(1011, 36);
        java.lang.Integer.toString(1012, 36);
        java.lang.Integer.toString(1013, 36);
        java.lang.Integer.toString(1014, 36);
        java.lang.Integer.toString(1015, 36);
        java.lang.Integer.toString(1016, 36);
        java.lang.Integer.toString(1017, 36);
        java.lang.Integer.toString(1018, 36);
    }

    private zzaam(com.google.android.gms.internal.ads.zzaal zzaalVar) {
        super(zzaalVar);
        this.zzK = zzaalVar.zzz();
        this.zzL = false;
        this.zzM = zzaalVar.zzA();
        this.zzN = false;
        this.zzO = zzaalVar.zzB();
        this.zzP = false;
        this.zzQ = false;
        this.zzR = false;
        this.zzS = false;
        this.zzT = zzaalVar.zzC();
        this.zzU = zzaalVar.zzD();
        this.zzV = zzaalVar.zzE();
        this.zzW = false;
        this.zzX = zzaalVar.zzF();
        this.zzY = false;
        this.zzZ = zzaalVar.zzG();
        this.zzaa = zzaalVar.zzH();
    }

    /* synthetic */ zzaam(com.google.android.gms.internal.ads.zzaal zzaalVar, byte[] bArr) {
        this(zzaalVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzaam zzaamVar = (com.google.android.gms.internal.ads.zzaam) obj;
            if (super.equals(zzaamVar) && this.zzK == zzaamVar.zzK && this.zzM == zzaamVar.zzM && this.zzO == zzaamVar.zzO && this.zzT == zzaamVar.zzT && this.zzU == zzaamVar.zzU && this.zzV == zzaamVar.zzV && this.zzX == zzaamVar.zzX) {
                android.util.SparseBooleanArray sparseBooleanArray = this.zzaa;
                android.util.SparseBooleanArray sparseBooleanArray2 = zzaamVar.zzaa;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            android.util.SparseArray sparseArray = this.zzZ;
                            android.util.SparseArray sparseArray2 = zzaamVar.zzZ;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        java.util.Map map = (java.util.Map) sparseArray.valueAt(i2);
                                        java.util.Map map2 = (java.util.Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (java.util.Map.Entry entry : map.entrySet()) {
                                                com.google.android.gms.internal.ads.zzzn zzznVar = (com.google.android.gms.internal.ads.zzzn) entry.getKey();
                                                if (map2.containsKey(zzznVar) && java.util.Objects.equals(entry.getValue(), map2.get(zzznVar))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.zzK ? 1 : 0)) * 961) + (this.zzM ? 1 : 0)) * 961) + (this.zzO ? 1 : 0)) * 28629151) + (this.zzT ? 1 : 0)) * 31) + (this.zzU ? 1 : 0)) * 31) + (this.zzV ? 1 : 0)) * 961) + (this.zzX ? 1 : 0)) * 31;
    }

    public final boolean zza(int i) {
        return this.zzaa.get(i);
    }

    @java.lang.Deprecated
    public final boolean zzb(int i, com.google.android.gms.internal.ads.zzzn zzznVar) {
        java.util.Map map = (java.util.Map) this.zzZ.get(i);
        return map != null && map.containsKey(zzznVar);
    }

    @java.lang.Deprecated
    public final com.google.android.gms.internal.ads.zzaan zzc(int i, com.google.android.gms.internal.ads.zzzn zzznVar) {
        java.util.Map map = (java.util.Map) this.zzZ.get(i);
        if (map != null) {
            return (com.google.android.gms.internal.ads.zzaan) map.get(zzznVar);
        }
        return null;
    }

    public final com.google.android.gms.internal.ads.zzaal zzd() {
        return new com.google.android.gms.internal.ads.zzaal(this, null);
    }

    final /* synthetic */ android.util.SparseArray zze() {
        return this.zzZ;
    }

    final /* synthetic */ android.util.SparseBooleanArray zzf() {
        return this.zzaa;
    }
}
