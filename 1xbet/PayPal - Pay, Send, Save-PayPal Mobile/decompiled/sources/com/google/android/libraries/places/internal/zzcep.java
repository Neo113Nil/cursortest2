package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcep extends com.google.android.libraries.places.internal.zzcel {
    final /* synthetic */ com.google.android.libraries.places.internal.zzceq zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcep(com.google.android.libraries.places.internal.zzceq zzceqVar) {
        super(zzceqVar);
        java.util.Objects.requireNonNull(zzceqVar);
        this.zzb = zzceqVar;
    }

    @Override // com.google.android.libraries.places.internal.zzcel, com.google.android.libraries.places.internal.zzcek, com.google.android.libraries.places.internal.zzblg
    public final void zzb(com.google.android.libraries.places.internal.zzbjn zzbjnVar, com.google.android.libraries.places.internal.zzbln zzblnVar) {
        super.zzb(zzbjnVar, zzblnVar);
        com.google.android.libraries.places.internal.zzceq zzceqVar = this.zzb;
        if (zzceqVar.zzb.zzf || zzbjnVar != com.google.android.libraries.places.internal.zzbjn.IDLE) {
            return;
        }
        zzceqVar.zzd().zzd();
    }
}
