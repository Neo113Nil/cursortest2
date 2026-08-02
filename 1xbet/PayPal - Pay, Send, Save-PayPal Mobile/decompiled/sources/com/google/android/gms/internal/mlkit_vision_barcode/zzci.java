package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzci extends java.util.AbstractMap implements java.io.Serializable {
    private static final java.lang.Object zzd = new java.lang.Object();

    @javax.annotation.CheckForNull
    transient int[] zza;

    @javax.annotation.CheckForNull
    transient java.lang.Object[] zzb;

    @javax.annotation.CheckForNull
    transient java.lang.Object[] zzc;

    @javax.annotation.CheckForNull
    private transient java.lang.Object zze;
    private transient int zzf;
    private transient int zzg;

    @javax.annotation.CheckForNull
    private transient java.util.Set zzh;

    @javax.annotation.CheckForNull
    private transient java.util.Set zzi;

    @javax.annotation.CheckForNull
    private transient java.util.Collection zzj;

    zzci() {
        zzp(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzA() {
        return (int[]) java.util.Objects.requireNonNull(this.zza);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object[] zzB() {
        return (java.lang.Object[]) java.util.Objects.requireNonNull(this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object[] zzC() {
        return (java.lang.Object[]) java.util.Objects.requireNonNull(this.zzc);
    }

    static /* synthetic */ java.lang.Object zzg(com.google.android.gms.internal.mlkit_vision_barcode.zzci zzciVar, int i) {
        return zzciVar.zzB()[i];
    }

    static /* synthetic */ java.lang.Object zzj(com.google.android.gms.internal.mlkit_vision_barcode.zzci zzciVar, int i) {
        return zzciVar.zzC()[i];
    }

    static /* synthetic */ void zzn(com.google.android.gms.internal.mlkit_vision_barcode.zzci zzciVar, int i, java.lang.Object obj) {
        zzciVar.zzC()[i] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzw(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (zzr()) {
            return -1;
        }
        int zza = com.google.android.gms.internal.mlkit_vision_barcode.zzck.zza(obj);
        int zzv = zzv();
        int zzc = com.google.android.gms.internal.mlkit_vision_barcode.zzcj.zzc(java.util.Objects.requireNonNull(this.zze), zza & zzv);
        if (zzc != 0) {
            int i = ~zzv;
            do {
                int i2 = zzc - 1;
                int i3 = zzA()[i2];
                if ((i3 & i) == (zza & i) && com.google.android.gms.internal.mlkit_vision_barcode.zzax.zza(obj, zzB()[i2])) {
                    return i2;
                }
                zzc = i3 & zzv;
            } while (zzc != 0);
        }
        return -1;
    }

    private final int zzx(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        java.lang.Object zzd2 = com.google.android.gms.internal.mlkit_vision_barcode.zzcj.zzd(i2);
        if (i4 != 0) {
            com.google.android.gms.internal.mlkit_vision_barcode.zzcj.zze(zzd2, i3 & i5, i4 + 1);
        }
        java.lang.Object requireNonNull = java.util.Objects.requireNonNull(this.zze);
        int[] zzA = zzA();
        for (int i6 = 0; i6 <= i; i6++) {
            int zzc = com.google.android.gms.internal.mlkit_vision_barcode.zzcj.zzc(requireNonNull, i6);
            while (zzc != 0) {
                int i7 = zzc - 1;
                int i8 = zzA[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int zzc2 = com.google.android.gms.internal.mlkit_vision_barcode.zzcj.zzc(zzd2, i10);
                com.google.android.gms.internal.mlkit_vision_barcode.zzcj.zze(zzd2, i10, zzc);
                zzA[i7] = ((~i5) & i9) | (zzc2 & i5);
                zzc = i8 & i;
            }
        }
        this.zze = zzd2;
        zzz(i5);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object zzy(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (!zzr()) {
            int zzv = zzv();
            int zzb = com.google.android.gms.internal.mlkit_vision_barcode.zzcj.zzb(obj, null, zzv, java.util.Objects.requireNonNull(this.zze), zzA(), zzB(), null);
            if (zzb != -1) {
                java.lang.Object obj2 = zzC()[zzb];
                zzq(zzb, zzv);
                this.zzg--;
                zzo();
                return obj2;
            }
        }
        return zzd;
    }

    private final void zzz(int i) {
        this.zzf = ((32 - java.lang.Integer.numberOfLeadingZeros(i)) & 31) | (this.zzf & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzr()) {
            return;
        }
        zzo();
        java.util.Map zzl = zzl();
        if (zzl != null) {
            this.zzf = com.google.android.gms.internal.mlkit_vision_barcode.zzdw.zza(size(), 3, kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            zzl.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        java.util.Arrays.fill(zzB(), 0, this.zzg, (java.lang.Object) null);
        java.util.Arrays.fill(zzC(), 0, this.zzg, (java.lang.Object) null);
        java.lang.Object requireNonNull = java.util.Objects.requireNonNull(this.zze);
        if (requireNonNull instanceof byte[]) {
            java.util.Arrays.fill((byte[]) requireNonNull, (byte) 0);
        } else if (requireNonNull instanceof short[]) {
            java.util.Arrays.fill((short[]) requireNonNull, (short) 0);
        } else {
            java.util.Arrays.fill((int[]) requireNonNull, 0);
        }
        java.util.Arrays.fill(zzA(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@javax.annotation.CheckForNull java.lang.Object obj) {
        java.util.Map zzl = zzl();
        return zzl != null ? zzl.containsKey(obj) : zzw(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@javax.annotation.CheckForNull java.lang.Object obj) {
        java.util.Map zzl = zzl();
        if (zzl != null) {
            return zzl.containsValue(obj);
        }
        for (int i = 0; i < this.zzg; i++) {
            if (com.google.android.gms.internal.mlkit_vision_barcode.zzax.zza(obj, zzC()[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        java.util.Set set = this.zzi;
        if (set != null) {
            return set;
        }
        com.google.android.gms.internal.mlkit_vision_barcode.zzcc zzccVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzcc(this);
        this.zzi = zzccVar;
        return zzccVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @javax.annotation.CheckForNull
    public final java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object obj) {
        java.util.Map zzl = zzl();
        if (zzl != null) {
            return zzl.get(obj);
        }
        int zzw = zzw(obj);
        if (zzw == -1) {
            return null;
        }
        return zzC()[zzw];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
        java.util.Set set = this.zzh;
        if (set != null) {
            return set;
        }
        com.google.android.gms.internal.mlkit_vision_barcode.zzcf zzcfVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzcf(this);
        this.zzh = zzcfVar;
        return zzcfVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @javax.annotation.CheckForNull
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        int min;
        int i = 1;
        if (zzr()) {
            com.google.android.gms.internal.mlkit_vision_barcode.zzaz.zzf(zzr(), "Arrays already allocated");
            int i2 = this.zzf;
            int max = java.lang.Math.max(i2 + 1, 2);
            int highestOneBit = java.lang.Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = java.lang.Math.max(4, highestOneBit);
            this.zze = com.google.android.gms.internal.mlkit_vision_barcode.zzcj.zzd(max2);
            zzz(max2 - 1);
            this.zza = new int[i2];
            this.zzb = new java.lang.Object[i2];
            this.zzc = new java.lang.Object[i2];
        }
        java.util.Map zzl = zzl();
        if (zzl != null) {
            return zzl.put(obj, obj2);
        }
        int[] zzA = zzA();
        java.lang.Object[] zzB = zzB();
        java.lang.Object[] zzC = zzC();
        int i3 = this.zzg;
        int i4 = i3 + 1;
        int zza = com.google.android.gms.internal.mlkit_vision_barcode.zzck.zza(obj);
        int zzv = zzv();
        int i5 = zza & zzv;
        int zzc = com.google.android.gms.internal.mlkit_vision_barcode.zzcj.zzc(java.util.Objects.requireNonNull(this.zze), i5);
        if (zzc != 0) {
            int i6 = ~zzv;
            int i7 = 0;
            while (true) {
                int i8 = zzc - i;
                int i9 = zzA[i8];
                int i10 = i9 & i6;
                if (i10 == (zza & i6) && com.google.android.gms.internal.mlkit_vision_barcode.zzax.zza(obj, zzB[i8])) {
                    java.lang.Object obj3 = zzC[i8];
                    zzC[i8] = obj2;
                    return obj3;
                }
                int i11 = i9 & zzv;
                i7++;
                if (i11 != 0) {
                    zzc = i11;
                    i = 1;
                } else {
                    if (i7 >= 9) {
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(zzv() + 1, 1.0f);
                        int zze = zze();
                        while (zze >= 0) {
                            linkedHashMap.put(zzB()[zze], zzC()[zze]);
                            zze = zzf(zze);
                        }
                        this.zze = linkedHashMap;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        zzo();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i4 > zzv) {
                        zzv = zzx(zzv, com.google.android.gms.internal.mlkit_vision_barcode.zzcj.zza(zzv), zza, i3);
                    } else {
                        zzA[i8] = (i4 & zzv) | i10;
                    }
                }
            }
        } else if (i4 > zzv) {
            zzv = zzx(zzv, com.google.android.gms.internal.mlkit_vision_barcode.zzcj.zza(zzv), zza, i3);
        } else {
            com.google.android.gms.internal.mlkit_vision_barcode.zzcj.zze(java.util.Objects.requireNonNull(this.zze), i5, i4);
        }
        int length = zzA().length;
        if (i4 > length && (min = java.lang.Math.min(kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (java.lang.Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.zza = java.util.Arrays.copyOf(zzA(), min);
            this.zzb = java.util.Arrays.copyOf(zzB(), min);
            this.zzc = java.util.Arrays.copyOf(zzC(), min);
        }
        zzA()[i3] = (~zzv) & zza;
        zzB()[i3] = obj;
        zzC()[i3] = obj2;
        this.zzg = i4;
        zzo();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @javax.annotation.CheckForNull
    public final java.lang.Object remove(@javax.annotation.CheckForNull java.lang.Object obj) {
        java.util.Map zzl = zzl();
        if (zzl != null) {
            return zzl.remove(obj);
        }
        java.lang.Object zzy = zzy(obj);
        if (zzy == zzd) {
            return null;
        }
        return zzy;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        java.util.Map zzl = zzl();
        return zzl != null ? zzl.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Collection values() {
        java.util.Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        com.google.android.gms.internal.mlkit_vision_barcode.zzch zzchVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzch(this);
        this.zzj = zzchVar;
        return zzchVar;
    }

    final int zze() {
        return isEmpty() ? -1 : 0;
    }

    @javax.annotation.CheckForNull
    final java.util.Map zzl() {
        java.lang.Object obj = this.zze;
        if (obj instanceof java.util.Map) {
            return (java.util.Map) obj;
        }
        return null;
    }

    final void zzp(int i) {
        this.zzf = com.google.android.gms.internal.mlkit_vision_barcode.zzdw.zza(i, 1, kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    final void zzq(int i, int i2) {
        java.lang.Object requireNonNull = java.util.Objects.requireNonNull(this.zze);
        int[] zzA = zzA();
        java.lang.Object[] zzB = zzB();
        java.lang.Object[] zzC = zzC();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            zzB[i] = null;
            zzC[i] = null;
            zzA[i] = 0;
            return;
        }
        int i4 = i + 1;
        java.lang.Object obj = zzB[i3];
        zzB[i] = obj;
        zzC[i] = zzC[i3];
        zzB[i3] = null;
        zzC[i3] = null;
        zzA[i] = zzA[i3];
        zzA[i3] = 0;
        int zza = com.google.android.gms.internal.mlkit_vision_barcode.zzck.zza(obj) & i2;
        int zzc = com.google.android.gms.internal.mlkit_vision_barcode.zzcj.zzc(requireNonNull, zza);
        if (zzc == size) {
            com.google.android.gms.internal.mlkit_vision_barcode.zzcj.zze(requireNonNull, zza, i4);
            return;
        }
        while (true) {
            int i5 = zzc - 1;
            int i6 = zzA[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                zzA[i5] = (i6 & (~i2)) | (i2 & i4);
                return;
            }
            zzc = i7;
        }
    }

    zzci(int i) {
        zzp(12);
    }

    final boolean zzr() {
        return this.zze == null;
    }

    final void zzo() {
        this.zzf += 32;
    }

    final int zzf(int i) {
        int i2 = i + 1;
        if (i2 < this.zzg) {
            return i2;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzv() {
        return (1 << (this.zzf & 31)) - 1;
    }
}
