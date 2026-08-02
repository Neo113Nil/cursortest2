package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzrn extends com.google.android.libraries.places.internal.zzro {
    static final com.google.android.libraries.places.internal.zzro zza;

    static {
        com.google.android.libraries.places.internal.zzrm zzrmVar;
        com.google.android.libraries.places.internal.zzro zzb = new com.google.android.libraries.places.internal.zzrn(null, new androidx.collection.SimpleArrayMap(0)).zzb();
        zza = zzb;
        com.google.android.libraries.places.internal.zzrn zzrnVar = new com.google.android.libraries.places.internal.zzrn(zzb, new androidx.collection.SimpleArrayMap(), null);
        boolean zzh = zzrnVar.zzh();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        com.google.common.base.Preconditions.checkState(!zzh, "Can't mutate after handing to trace");
        com.google.common.base.Preconditions.checkNotNull(bool);
        zzrmVar = com.google.android.libraries.places.internal.zzro.zza;
        com.google.common.base.Preconditions.checkState(!zzrnVar.zzd(zzrmVar), "Key already present");
        zzrnVar.zzg().put(zzrmVar, bool);
        zzrnVar.zzb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private zzrn(com.google.android.libraries.places.internal.zzro zzroVar, androidx.collection.SimpleArrayMap simpleArrayMap) {
        super(null, simpleArrayMap, 0 == true ? 1 : 0);
    }

    /* synthetic */ zzrn(com.google.android.libraries.places.internal.zzro zzroVar, androidx.collection.SimpleArrayMap simpleArrayMap, byte[] bArr) {
        super(zzroVar, simpleArrayMap, null);
    }
}
