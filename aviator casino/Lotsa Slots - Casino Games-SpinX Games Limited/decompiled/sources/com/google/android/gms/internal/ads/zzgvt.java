package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgvt extends java.util.AbstractMap implements java.io.Serializable {
    private static final java.lang.Object zzd = new java.lang.Object();
    transient int[] zza;
    transient java.lang.Object[] zzb;
    transient java.lang.Object[] zzc;
    private transient java.lang.Object zze;
    private transient int zzf;
    private transient int zzg;
    private transient java.util.Set zzh;
    private transient java.util.Set zzi;
    private transient java.util.Collection zzj;

    zzgvt() {
        zza(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzA, reason: merged with bridge method [inline-methods] */
    public final int[] zzl() {
        return (int[]) java.util.Objects.requireNonNull(this.zza);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzB, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object[] zzm() {
        return (java.lang.Object[]) java.util.Objects.requireNonNull(this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzC, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object[] zzn() {
        return (java.lang.Object[]) java.util.Objects.requireNonNull(this.zzc);
    }

    private final void zzv(int i) {
        this.zzf = ((32 - java.lang.Integer.numberOfLeadingZeros(i)) & 31) | (this.zzf & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzw, reason: merged with bridge method [inline-methods] */
    public final int zzh() {
        return (1 << (this.zzf & 31)) - 1;
    }

    private final int zzx(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        java.lang.Object zza = com.google.android.gms.internal.ads.zzgvu.zza(i2);
        if (i4 != 0) {
            com.google.android.gms.internal.ads.zzgvu.zzc(zza, i3 & i5, i4 + 1);
        }
        java.lang.Object requireNonNull = java.util.Objects.requireNonNull(this.zze);
        int[] zzl = zzl();
        for (int i6 = 0; i6 <= i; i6++) {
            int zzb = com.google.android.gms.internal.ads.zzgvu.zzb(requireNonNull, i6);
            while (zzb != 0) {
                int i7 = zzb - 1;
                int i8 = zzl[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int zzb2 = com.google.android.gms.internal.ads.zzgvu.zzb(zza, i10);
                com.google.android.gms.internal.ads.zzgvu.zzc(zza, i10, zzb);
                zzl[i7] = ((~i5) & i9) | (zzb2 & i5);
                zzb = i8 & i;
            }
        }
        this.zze = zza;
        zzv(i5);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzy, reason: merged with bridge method [inline-methods] */
    public final int zzi(java.lang.Object obj) {
        if (zzb()) {
            return -1;
        }
        int zzb = com.google.android.gms.internal.ads.zzgwf.zzb(obj);
        int zzh = zzh();
        int zzb2 = com.google.android.gms.internal.ads.zzgvu.zzb(java.util.Objects.requireNonNull(this.zze), zzb & zzh);
        if (zzb2 != 0) {
            int i = ~zzh;
            int i2 = zzb & i;
            do {
                int i3 = zzb2 - 1;
                int i4 = zzl()[i3];
                if ((i4 & i) == i2 && java.util.Objects.equals(obj, zzm()[i3])) {
                    return i3;
                }
                zzb2 = i4 & zzh;
            } while (zzb2 != 0);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object zzj(java.lang.Object obj) {
        if (!zzb()) {
            int zzh = zzh();
            int zze = com.google.android.gms.internal.ads.zzgvu.zze(obj, null, zzh, java.util.Objects.requireNonNull(this.zze), zzl(), zzm(), null);
            if (zze != -1) {
                java.lang.Object obj2 = zzn()[zze];
                zze(zze, zzh);
                this.zzg--;
                zzd();
                return obj2;
            }
        }
        return zzd;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzb()) {
            return;
        }
        zzd();
        java.util.Map zzc = zzc();
        if (zzc != null) {
            this.zzf = com.google.android.gms.internal.ads.zzhah.zzc(size(), 3, kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            zzc.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        java.util.Arrays.fill(zzm(), 0, this.zzg, (java.lang.Object) null);
        java.util.Arrays.fill(zzn(), 0, this.zzg, (java.lang.Object) null);
        java.lang.Object requireNonNull = java.util.Objects.requireNonNull(this.zze);
        if (requireNonNull instanceof byte[]) {
            java.util.Arrays.fill((byte[]) requireNonNull, (byte) 0);
        } else if (requireNonNull instanceof short[]) {
            java.util.Arrays.fill((short[]) requireNonNull, (short) 0);
        } else {
            java.util.Arrays.fill((int[]) requireNonNull, 0);
        }
        java.util.Arrays.fill(zzl(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        java.util.Map zzc = zzc();
        return zzc != null ? zzc.containsKey(obj) : zzi(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        java.util.Map zzc = zzc();
        if (zzc != null) {
            return zzc.containsValue(obj);
        }
        for (int i = 0; i < this.zzg; i++) {
            if (java.util.Objects.equals(obj, zzn()[i])) {
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
        com.google.android.gms.internal.ads.zzgvo zzgvoVar = new com.google.android.gms.internal.ads.zzgvo(this, null);
        this.zzi = zzgvoVar;
        return zzgvoVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        java.util.Map zzc = zzc();
        if (zzc != null) {
            return zzc.get(obj);
        }
        int zzi = zzi(obj);
        if (zzi == -1) {
            return null;
        }
        return zzn()[zzi];
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
        com.google.android.gms.internal.ads.zzgvq zzgvqVar = new com.google.android.gms.internal.ads.zzgvq(this, null);
        this.zzh = zzgvqVar;
        return zzgvqVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        int min;
        if (zzb()) {
            com.google.android.gms.internal.ads.zzgtj.zzj(zzb(), "Arrays already allocated");
            int i = this.zzf;
            int max = java.lang.Math.max(i + 1, 2);
            int highestOneBit = java.lang.Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = java.lang.Math.max(4, highestOneBit);
            this.zze = com.google.android.gms.internal.ads.zzgvu.zza(max2);
            zzv(max2 - 1);
            this.zza = new int[i];
            this.zzb = new java.lang.Object[i];
            this.zzc = new java.lang.Object[i];
        }
        java.util.Map zzc = zzc();
        if (zzc != null) {
            return zzc.put(obj, obj2);
        }
        int[] zzl = zzl();
        java.lang.Object[] zzm = zzm();
        java.lang.Object[] zzn = zzn();
        int i2 = this.zzg;
        int i3 = i2 + 1;
        int zzb = com.google.android.gms.internal.ads.zzgwf.zzb(obj);
        int zzh = zzh();
        int i4 = zzb & zzh;
        int zzb2 = com.google.android.gms.internal.ads.zzgvu.zzb(java.util.Objects.requireNonNull(this.zze), i4);
        if (zzb2 != 0) {
            int i5 = ~zzh;
            int i6 = zzb & i5;
            int i7 = 0;
            while (true) {
                int i8 = zzb2 - 1;
                int i9 = zzl[i8];
                int i10 = i9 & i5;
                if (i10 == i6 && java.util.Objects.equals(obj, zzm[i8])) {
                    java.lang.Object obj3 = zzn[i8];
                    zzn[i8] = obj2;
                    return obj3;
                }
                int i11 = i9 & zzh;
                i7++;
                if (i11 != 0) {
                    zzb2 = i11;
                } else {
                    if (i7 >= 9) {
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(zzh() + 1, 1.0f);
                        int zzf = zzf();
                        while (zzf >= 0) {
                            linkedHashMap.put(zzm()[zzf], zzn()[zzf]);
                            zzf = zzg(zzf);
                        }
                        this.zze = linkedHashMap;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        zzd();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i3 > zzh) {
                        zzh = zzx(zzh, com.google.android.gms.internal.ads.zzgvu.zzd(zzh), zzb, i2);
                    } else {
                        zzl[i8] = (i3 & zzh) | i10;
                    }
                }
            }
        } else if (i3 > zzh) {
            zzh = zzx(zzh, com.google.android.gms.internal.ads.zzgvu.zzd(zzh), zzb, i2);
        } else {
            com.google.android.gms.internal.ads.zzgvu.zzc(java.util.Objects.requireNonNull(this.zze), i4, i3);
        }
        int length = zzl().length;
        if (i3 > length && (min = java.lang.Math.min(kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (java.lang.Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.zza = java.util.Arrays.copyOf(zzl(), min);
            this.zzb = java.util.Arrays.copyOf(zzm(), min);
            this.zzc = java.util.Arrays.copyOf(zzn(), min);
        }
        zzl()[i2] = (~zzh) & zzb;
        zzm()[i2] = obj;
        zzn()[i2] = obj2;
        this.zzg = i3;
        zzd();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        java.util.Map zzc = zzc();
        if (zzc != null) {
            return zzc.remove(obj);
        }
        java.lang.Object zzj = zzj(obj);
        if (zzj == zzd) {
            return null;
        }
        return zzj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        java.util.Map zzc = zzc();
        return zzc != null ? zzc.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Collection values() {
        java.util.Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        com.google.android.gms.internal.ads.zzgvs zzgvsVar = new com.google.android.gms.internal.ads.zzgvs(this, null);
        this.zzj = zzgvsVar;
        return zzgvsVar;
    }

    final void zza(int i) {
        this.zzf = com.google.android.gms.internal.ads.zzhah.zzc(i, 1, kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    final boolean zzb() {
        return this.zze == null;
    }

    final java.util.Map zzc() {
        java.lang.Object obj = this.zze;
        if (obj instanceof java.util.Map) {
            return (java.util.Map) obj;
        }
        return null;
    }

    final void zzd() {
        this.zzf += 32;
    }

    final void zze(int i, int i2) {
        java.lang.Object requireNonNull = java.util.Objects.requireNonNull(this.zze);
        int[] zzl = zzl();
        java.lang.Object[] zzm = zzm();
        java.lang.Object[] zzn = zzn();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            zzm[i] = null;
            zzn[i] = null;
            zzl[i] = 0;
            return;
        }
        int i4 = i + 1;
        java.lang.Object obj = zzm[i3];
        zzm[i] = obj;
        zzn[i] = zzn[i3];
        zzm[i3] = null;
        zzn[i3] = null;
        zzl[i] = zzl[i3];
        zzl[i3] = 0;
        int zzb = com.google.android.gms.internal.ads.zzgwf.zzb(obj) & i2;
        int zzb2 = com.google.android.gms.internal.ads.zzgvu.zzb(requireNonNull, zzb);
        if (zzb2 == size) {
            com.google.android.gms.internal.ads.zzgvu.zzc(requireNonNull, zzb, i4);
            return;
        }
        while (true) {
            int i5 = zzb2 - 1;
            int i6 = zzl[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                zzl[i5] = (i6 & (~i2)) | (i2 & i4);
                return;
            }
            zzb2 = i7;
        }
    }

    final int zzf() {
        return isEmpty() ? -1 : 0;
    }

    final int zzg(int i) {
        int i2 = i + 1;
        if (i2 < this.zzg) {
            return i2;
        }
        return -1;
    }

    final /* synthetic */ java.lang.Object zzk() {
        return java.util.Objects.requireNonNull(this.zze);
    }

    final /* synthetic */ java.lang.Object zzo(int i) {
        return zzm()[i];
    }

    final /* synthetic */ java.lang.Object zzp(int i) {
        return zzn()[i];
    }

    final /* synthetic */ void zzq(int i, java.lang.Object obj) {
        zzn()[i] = obj;
    }

    final /* synthetic */ int zzs() {
        return this.zzf;
    }

    final /* synthetic */ int zzt() {
        return this.zzg;
    }

    final /* synthetic */ void zzu(int i) {
        this.zzg = i;
    }

    zzgvt(int i) {
        zza(8);
    }
}
