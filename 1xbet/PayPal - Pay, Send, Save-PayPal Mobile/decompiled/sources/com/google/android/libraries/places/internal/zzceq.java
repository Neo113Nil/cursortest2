package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzceq extends com.google.android.libraries.places.internal.zzcem {
    final /* synthetic */ com.google.android.libraries.places.internal.zzces zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzceq(com.google.android.libraries.places.internal.zzces zzcesVar, java.lang.Object obj, com.google.android.libraries.places.internal.zzble zzbleVar) {
        super(zzcesVar, obj, zzbleVar);
        java.util.Objects.requireNonNull(zzcesVar);
        this.zzb = zzcesVar;
    }

    @Override // com.google.android.libraries.places.internal.zzcem
    protected final com.google.android.libraries.places.internal.zzcel zza() {
        return new com.google.android.libraries.places.internal.zzcep(this);
    }
}
