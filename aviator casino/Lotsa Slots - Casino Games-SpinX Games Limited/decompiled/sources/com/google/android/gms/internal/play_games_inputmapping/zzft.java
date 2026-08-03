package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzft extends com.google.android.gms.internal.play_games_inputmapping.zzdz implements java.util.RandomAccess, com.google.android.gms.internal.play_games_inputmapping.zzfh, com.google.android.gms.internal.play_games_inputmapping.zzgl {
    private static final com.google.android.gms.internal.play_games_inputmapping.zzft zza;
    private long[] zzb;
    private int zzc;

    static {
        com.google.android.gms.internal.play_games_inputmapping.zzft zzftVar = new com.google.android.gms.internal.play_games_inputmapping.zzft(new long[0], 0);
        zza = zzftVar;
        zzftVar.zzb();
    }

    zzft() {
        this(new long[10], 0);
    }

    private final void zze(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new java.lang.IndexOutOfBoundsException(zzf(i));
        }
    }

    private final java.lang.String zzf(int i) {
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
        long longValue = ((java.lang.Long) obj).longValue();
        zzc();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw new java.lang.IndexOutOfBoundsException(zzf(i));
        }
        long[] jArr = this.zzb;
        if (i2 < jArr.length) {
            java.lang.System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(jArr, 0, jArr2, 0, i);
            java.lang.System.arraycopy(this.zzb, i, jArr2, i + 1, this.zzc - i);
            this.zzb = jArr2;
        }
        this.zzb[i] = longValue;
        this.zzc++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdz, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        zzc();
        com.google.android.gms.internal.play_games_inputmapping.zzfi.zza(collection);
        if (!(collection instanceof com.google.android.gms.internal.play_games_inputmapping.zzft)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.play_games_inputmapping.zzft zzftVar = (com.google.android.gms.internal.play_games_inputmapping.zzft) collection;
        int i = zzftVar.zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzc;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.zzb;
        if (i3 > jArr.length) {
            this.zzb = java.util.Arrays.copyOf(jArr, i3);
        }
        java.lang.System.arraycopy(zzftVar.zzb, 0, this.zzb, this.zzc, zzftVar.zzc);
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
        if (!(obj instanceof com.google.android.gms.internal.play_games_inputmapping.zzft)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.play_games_inputmapping.zzft zzftVar = (com.google.android.gms.internal.play_games_inputmapping.zzft) obj;
        if (this.zzc != zzftVar.zzc) {
            return false;
        }
        long[] jArr = zzftVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (this.zzb[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        zze(i);
        return java.lang.Long.valueOf(this.zzb[i]);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdz, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            i = (i * 31) + com.google.android.gms.internal.play_games_inputmapping.zzfi.zze(this.zzb[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Long)) {
            return -1;
        }
        long longValue = ((java.lang.Long) obj).longValue();
        int i = this.zzc;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzb[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        zzc();
        zze(i);
        long[] jArr = this.zzb;
        long j = jArr[i];
        if (i < this.zzc - 1) {
            java.lang.System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return java.lang.Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzc();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzb;
        java.lang.System.arraycopy(jArr, i2, jArr, i, this.zzc - i2);
        this.zzc -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        long longValue = ((java.lang.Long) obj).longValue();
        zzc();
        zze(i);
        long[] jArr = this.zzb;
        long j = jArr[i];
        jArr[i] = longValue;
        return java.lang.Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    public final long zzd(int i) {
        zze(i);
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzfh
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.play_games_inputmapping.zzfh zzh(int i) {
        if (i >= this.zzc) {
            return new com.google.android.gms.internal.play_games_inputmapping.zzft(java.util.Arrays.copyOf(this.zzb, i), this.zzc);
        }
        throw new java.lang.IllegalArgumentException();
    }

    private zzft(long[] jArr, int i) {
        this.zzb = jArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        long longValue = ((java.lang.Long) obj).longValue();
        zzc();
        int i = this.zzc;
        long[] jArr = this.zzb;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            java.lang.System.arraycopy(jArr, 0, jArr2, 0, i);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        jArr3[i2] = longValue;
        return true;
    }
}
