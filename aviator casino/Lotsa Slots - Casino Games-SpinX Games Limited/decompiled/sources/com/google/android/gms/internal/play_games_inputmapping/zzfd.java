package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzfd extends com.google.android.gms.internal.play_games_inputmapping.zzdz implements java.util.RandomAccess, com.google.android.gms.internal.play_games_inputmapping.zzff, com.google.android.gms.internal.play_games_inputmapping.zzgl {
    private static final com.google.android.gms.internal.play_games_inputmapping.zzfd zza;
    private int[] zzb;
    private int zzc;

    static {
        com.google.android.gms.internal.play_games_inputmapping.zzfd zzfdVar = new com.google.android.gms.internal.play_games_inputmapping.zzfd(new int[0], 0);
        zza = zzfdVar;
        zzfdVar.zzb();
    }

    zzfd() {
        this(new int[10], 0);
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzfd zzd() {
        return zza;
    }

    private final void zzi(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new java.lang.IndexOutOfBoundsException(zzj(i));
        }
    }

    private final java.lang.String zzj(int i) {
        int i2 = this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 13 + java.lang.String.valueOf(i2).length());
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdz, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        int intValue = ((java.lang.Integer) obj).intValue();
        zzc();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw new java.lang.IndexOutOfBoundsException(zzj(i));
        }
        int[] iArr = this.zzb;
        if (i2 < iArr.length) {
            java.lang.System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, i);
            java.lang.System.arraycopy(this.zzb, i, iArr2, i + 1, this.zzc - i);
            this.zzb = iArr2;
        }
        this.zzb[i] = intValue;
        this.zzc++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdz, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        zzc();
        com.google.android.gms.internal.play_games_inputmapping.zzfi.zza(collection);
        if (!(collection instanceof com.google.android.gms.internal.play_games_inputmapping.zzfd)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.play_games_inputmapping.zzfd zzfdVar = (com.google.android.gms.internal.play_games_inputmapping.zzfd) collection;
        int i = zzfdVar.zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzc;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.zzb;
        if (i3 > iArr.length) {
            this.zzb = java.util.Arrays.copyOf(iArr, i3);
        }
        java.lang.System.arraycopy(zzfdVar.zzb, 0, this.zzb, this.zzc, zzfdVar.zzc);
        this.zzc = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdz, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.play_games_inputmapping.zzfd)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.play_games_inputmapping.zzfd zzfdVar = (com.google.android.gms.internal.play_games_inputmapping.zzfd) obj;
        if (this.zzc != zzfdVar.zzc) {
            return false;
        }
        int[] iArr = zzfdVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (this.zzb[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        zzi(i);
        return java.lang.Integer.valueOf(this.zzb[i]);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdz, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            i = (i * 31) + this.zzb[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Integer)) {
            return -1;
        }
        int intValue = ((java.lang.Integer) obj).intValue();
        int i = this.zzc;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzb[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        zzc();
        zzi(i);
        int[] iArr = this.zzb;
        int i2 = iArr[i];
        if (i < this.zzc - 1) {
            java.lang.System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return java.lang.Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzc();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzb;
        java.lang.System.arraycopy(iArr, i2, iArr, i, this.zzc - i2);
        this.zzc -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        int intValue = ((java.lang.Integer) obj).intValue();
        zzc();
        zzi(i);
        int[] iArr = this.zzb;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return java.lang.Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzfh
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.play_games_inputmapping.zzff zzh(int i) {
        if (i >= this.zzc) {
            return new com.google.android.gms.internal.play_games_inputmapping.zzfd(java.util.Arrays.copyOf(this.zzb, i), this.zzc);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final int zzf(int i) {
        zzi(i);
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzff
    public final void zzg(int i) {
        zzc();
        int i2 = this.zzc;
        int[] iArr = this.zzb;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.zzb = iArr2;
        }
        int[] iArr3 = this.zzb;
        int i3 = this.zzc;
        this.zzc = i3 + 1;
        iArr3[i3] = i;
    }

    private zzfd(int[] iArr, int i) {
        this.zzb = iArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        zzg(((java.lang.Integer) obj).intValue());
        return true;
    }
}
