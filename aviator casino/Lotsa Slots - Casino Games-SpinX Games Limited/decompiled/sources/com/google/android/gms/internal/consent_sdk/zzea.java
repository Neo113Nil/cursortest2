package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzea extends com.google.android.gms.internal.consent_sdk.zzdw {
    final transient java.lang.Object zza;

    zzea(java.lang.Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdw, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdw, com.google.android.gms.internal.consent_sdk.zzds, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return new com.google.android.gms.internal.consent_sdk.zzdx(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        return com.ironsource.X3.j.d + this.zza.toString() + com.ironsource.X3.j.e;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    final int zza(java.lang.Object[] objArr, int i) {
        objArr[0] = this.zza;
        return 1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdw, com.google.android.gms.internal.consent_sdk.zzds
    /* renamed from: zzd */
    public final com.google.android.gms.internal.consent_sdk.zzeb iterator() {
        return new com.google.android.gms.internal.consent_sdk.zzdx(this.zza);
    }
}
