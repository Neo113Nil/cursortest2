package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public final class zzfo extends com.google.android.gms.internal.play_games_inputmapping.zzdz implements java.util.RandomAccess, com.google.android.gms.internal.play_games_inputmapping.zzfp {
    public static final com.google.android.gms.internal.play_games_inputmapping.zzfp zza;
    private static final com.google.android.gms.internal.play_games_inputmapping.zzfo zzb;
    private final java.util.List zzc;

    static {
        com.google.android.gms.internal.play_games_inputmapping.zzfo zzfoVar = new com.google.android.gms.internal.play_games_inputmapping.zzfo(10);
        zzb = zzfoVar;
        zzfoVar.zzb();
        zza = zzfoVar;
    }

    public zzfo() {
        this(10);
    }

    private static java.lang.String zzi(java.lang.Object obj) {
        return obj instanceof java.lang.String ? (java.lang.String) obj : obj instanceof com.google.android.gms.internal.play_games_inputmapping.zzek ? ((com.google.android.gms.internal.play_games_inputmapping.zzek) obj).zzk(com.google.android.gms.internal.play_games_inputmapping.zzfi.zzb) : com.google.android.gms.internal.play_games_inputmapping.zzfi.zzd((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, java.lang.Object obj) {
        zzc();
        this.zzc.add(i, (java.lang.String) obj);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdz, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        zzc();
        if (collection instanceof com.google.android.gms.internal.play_games_inputmapping.zzfp) {
            collection = ((com.google.android.gms.internal.play_games_inputmapping.zzfp) collection).zzf();
        }
        boolean addAll = this.zzc.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzc();
        this.zzc.clear();
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        zzc();
        java.lang.Object remove = this.zzc.remove(i);
        this.modCount++;
        return zzi(remove);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        zzc();
        return zzi(this.zzc.set(i, (java.lang.String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final java.lang.String get(int i) {
        java.lang.Object obj = this.zzc.get(i);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof com.google.android.gms.internal.play_games_inputmapping.zzek) {
            com.google.android.gms.internal.play_games_inputmapping.zzek zzekVar = (com.google.android.gms.internal.play_games_inputmapping.zzek) obj;
            java.lang.String zzk = zzekVar.zzk(com.google.android.gms.internal.play_games_inputmapping.zzfi.zzb);
            if (zzekVar.zzh()) {
                this.zzc.set(i, zzk);
            }
            return zzk;
        }
        byte[] bArr = (byte[]) obj;
        java.lang.String zzd = com.google.android.gms.internal.play_games_inputmapping.zzfi.zzd(bArr);
        if (com.google.android.gms.internal.play_games_inputmapping.zzfi.zzc(bArr)) {
            this.zzc.set(i, zzd);
        }
        return zzd;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzfp
    public final java.lang.Object zze(int i) {
        return this.zzc.get(i);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzfp
    public final java.util.List zzf() {
        return java.util.Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzfp
    public final com.google.android.gms.internal.play_games_inputmapping.zzfp zzg() {
        return zza() ? new com.google.android.gms.internal.play_games_inputmapping.zzhi(this) : this;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzfh
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.play_games_inputmapping.zzfh zzh(int i) {
        if (i < size()) {
            throw new java.lang.IllegalArgumentException();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        arrayList.addAll(this.zzc);
        return new com.google.android.gms.internal.play_games_inputmapping.zzfo(arrayList);
    }

    public zzfo(int i) {
        this.zzc = new java.util.ArrayList(i);
    }

    private zzfo(java.util.ArrayList arrayList) {
        this.zzc = arrayList;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdz, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        return addAll(size(), collection);
    }
}
