package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public final class zzdj extends com.google.android.gms.internal.play_billing.zzba implements java.util.RandomAccess, com.google.android.gms.internal.play_billing.zzdk {

    @java.lang.Deprecated
    public static final com.google.android.gms.internal.play_billing.zzdk zza;
    private static final com.google.android.gms.internal.play_billing.zzdj zzb;
    private final java.util.List zzc;

    static {
        com.google.android.gms.internal.play_billing.zzdj zzdjVar = new com.google.android.gms.internal.play_billing.zzdj(false);
        zzb = zzdjVar;
        zza = zzdjVar;
    }

    public zzdj() {
        this(10);
    }

    private static java.lang.String zzi(java.lang.Object obj) {
        return obj instanceof java.lang.String ? (java.lang.String) obj : obj instanceof com.google.android.gms.internal.play_billing.zzbq ? ((com.google.android.gms.internal.play_billing.zzbq) obj).zzm(com.google.android.gms.internal.play_billing.zzda.zzb) : com.google.android.gms.internal.play_billing.zzda.zzd((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, java.lang.Object obj) {
        zza();
        this.zzc.add(i, (java.lang.String) obj);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        zza();
        if (collection instanceof com.google.android.gms.internal.play_billing.zzdk) {
            collection = ((com.google.android.gms.internal.play_billing.zzdk) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        this.zzc.clear();
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        zza();
        java.lang.Object remove = this.zzc.remove(i);
        this.modCount++;
        return zzi(remove);
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        zza();
        return zzi(this.zzc.set(i, (java.lang.String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcz
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.play_billing.zzcz zzd(int i) {
        if (i < size()) {
            throw new java.lang.IllegalArgumentException();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        arrayList.addAll(this.zzc);
        return new com.google.android.gms.internal.play_billing.zzdj(arrayList);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdk
    public final com.google.android.gms.internal.play_billing.zzdk zze() {
        return zzc() ? new com.google.android.gms.internal.play_billing.zzfk(this) : this;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdk
    public final java.lang.Object zzf(int i) {
        return this.zzc.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final java.lang.String get(int i) {
        java.lang.Object obj = this.zzc.get(i);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof com.google.android.gms.internal.play_billing.zzbq) {
            com.google.android.gms.internal.play_billing.zzbq zzbqVar = (com.google.android.gms.internal.play_billing.zzbq) obj;
            java.lang.String zzm = zzbqVar.zzm(com.google.android.gms.internal.play_billing.zzda.zzb);
            if (zzbqVar.zzi()) {
                this.zzc.set(i, zzm);
            }
            return zzm;
        }
        byte[] bArr = (byte[]) obj;
        java.lang.String zzd = com.google.android.gms.internal.play_billing.zzda.zzd(bArr);
        if (com.google.android.gms.internal.play_billing.zzfu.zzd(bArr)) {
            this.zzc.set(i, zzd);
        }
        return zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdk
    public final java.util.List zzh() {
        return java.util.Collections.unmodifiableList(this.zzc);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdj(int i) {
        super(true);
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        this.zzc = arrayList;
    }

    private zzdj(java.util.ArrayList arrayList) {
        super(true);
        this.zzc = arrayList;
    }

    private zzdj(boolean z) {
        super(false);
        this.zzc = java.util.Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        return addAll(size(), collection);
    }
}
