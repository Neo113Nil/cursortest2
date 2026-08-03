package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
public final class zzfe extends com.google.android.gms.internal.auth.zzdr implements java.util.RandomAccess, com.google.android.gms.internal.auth.zzff {

    @java.lang.Deprecated
    public static final com.google.android.gms.internal.auth.zzff zza;
    private static final com.google.android.gms.internal.auth.zzfe zzb;
    private final java.util.List zzc;

    static {
        com.google.android.gms.internal.auth.zzfe zzfeVar = new com.google.android.gms.internal.auth.zzfe(false);
        zzb = zzfeVar;
        zza = zzfeVar;
    }

    public zzfe() {
        this(10);
    }

    private static java.lang.String zzh(java.lang.Object obj) {
        return obj instanceof java.lang.String ? (java.lang.String) obj : obj instanceof com.google.android.gms.internal.auth.zzef ? ((com.google.android.gms.internal.auth.zzef) obj).zzl(com.google.android.gms.internal.auth.zzfa.zzb) : com.google.android.gms.internal.auth.zzfa.zzd((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, java.lang.Object obj) {
        zza();
        this.zzc.add(i, (java.lang.String) obj);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        zza();
        if (collection instanceof com.google.android.gms.internal.auth.zzff) {
            collection = ((com.google.android.gms.internal.auth.zzff) collection).zzg();
        }
        boolean addAll = this.zzc.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        this.zzc.clear();
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        zza();
        java.lang.Object remove = this.zzc.remove(i);
        this.modCount++;
        return zzh(remove);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        zza();
        return zzh(this.zzc.set(i, (java.lang.String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.auth.zzez zzd(int i) {
        if (i < size()) {
            throw new java.lang.IllegalArgumentException();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        arrayList.addAll(this.zzc);
        return new com.google.android.gms.internal.auth.zzfe(arrayList);
    }

    @Override // com.google.android.gms.internal.auth.zzff
    public final com.google.android.gms.internal.auth.zzff zze() {
        return zzc() ? new com.google.android.gms.internal.auth.zzhe(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final java.lang.String get(int i) {
        java.lang.Object obj = this.zzc.get(i);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof com.google.android.gms.internal.auth.zzef) {
            com.google.android.gms.internal.auth.zzef zzefVar = (com.google.android.gms.internal.auth.zzef) obj;
            java.lang.String zzl = zzefVar.zzl(com.google.android.gms.internal.auth.zzfa.zzb);
            if (zzefVar.zzh()) {
                this.zzc.set(i, zzl);
            }
            return zzl;
        }
        byte[] bArr = (byte[]) obj;
        java.lang.String zzd = com.google.android.gms.internal.auth.zzfa.zzd(bArr);
        if (com.google.android.gms.internal.auth.zzhn.zzb(bArr)) {
            this.zzc.set(i, zzd);
        }
        return zzd;
    }

    @Override // com.google.android.gms.internal.auth.zzff
    public final java.util.List zzg() {
        return java.util.Collections.unmodifiableList(this.zzc);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfe(int i) {
        super(true);
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        this.zzc = arrayList;
    }

    private zzfe(java.util.ArrayList arrayList) {
        super(true);
        this.zzc = arrayList;
    }

    private zzfe(boolean z) {
        super(false);
        this.zzc = java.util.Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        return addAll(size(), collection);
    }
}
