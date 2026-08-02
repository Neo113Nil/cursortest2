package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public class zzro {
    private static final com.google.android.libraries.places.internal.zzrm zza = com.google.android.libraries.places.internal.zzrm.zza(java.lang.Boolean.class);

    @javax.annotation.Nullable
    private final com.google.android.libraries.places.internal.zzro zzb;
    private final androidx.collection.SimpleArrayMap zzc;
    private boolean zzd = false;

    /* synthetic */ zzro(com.google.android.libraries.places.internal.zzro zzroVar, androidx.collection.SimpleArrayMap simpleArrayMap, byte[] bArr) {
        if (zzroVar != null) {
            com.google.common.base.Preconditions.checkArgument(zzroVar.zzd);
        }
        this.zzb = zzroVar;
        this.zzc = simpleArrayMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static com.google.android.libraries.places.internal.zzro zza(com.google.android.libraries.places.internal.zzro zzroVar, com.google.android.libraries.places.internal.zzro zzroVar2) {
        if (zzroVar.zzc()) {
            return zzroVar2;
        }
        if (zzroVar2.zzc()) {
            return zzroVar;
        }
        com.google.common.collect.ImmutableSet<com.google.android.libraries.places.internal.zzro> of = com.google.common.collect.ImmutableSet.of(zzroVar, zzroVar2);
        if (of.isEmpty()) {
            return com.google.android.libraries.places.internal.zzrn.zza;
        }
        if (of.size() == 1) {
            return (com.google.android.libraries.places.internal.zzro) of.iterator().next();
        }
        int i = 0;
        for (com.google.android.libraries.places.internal.zzro zzroVar3 : of) {
            do {
                i += zzroVar3.zzc.getCamera2StreamConfigurationMap();
                zzroVar3 = zzroVar3.zzb;
            } while (zzroVar3 != null);
        }
        if (i == 0) {
            return com.google.android.libraries.places.internal.zzrn.zza;
        }
        androidx.collection.SimpleArrayMap simpleArrayMap = new androidx.collection.SimpleArrayMap(i);
        for (com.google.android.libraries.places.internal.zzro zzroVar4 : of) {
            do {
                int i2 = 0;
                while (true) {
                    androidx.collection.SimpleArrayMap simpleArrayMap2 = zzroVar4.zzc;
                    if (i2 >= simpleArrayMap2.getCamera2StreamConfigurationMap()) {
                        break;
                    }
                    com.google.common.base.Preconditions.checkArgument(simpleArrayMap.put((com.google.android.libraries.places.internal.zzrm) simpleArrayMap2.keyAt(i2), simpleArrayMap2.valueAt(i2)) == null, "Duplicate bindings: %s", simpleArrayMap2.keyAt(i2));
                    i2++;
                }
                zzroVar4 = zzroVar4.zzb;
            } while (zzroVar4 != null);
        }
        return new com.google.android.libraries.places.internal.zzrn(null, simpleArrayMap, 0 == true ? 1 : 0).zzb();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SpanExtras<");
        for (com.google.android.libraries.places.internal.zzro zzroVar = this; zzroVar != null; zzroVar = zzroVar.zzb) {
            for (int i = 0; i < zzroVar.zzc.getCamera2StreamConfigurationMap(); i++) {
                sb.append(this.zzc.valueAt(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }

    final com.google.android.libraries.places.internal.zzro zzb() {
        if (this.zzd) {
            throw new java.lang.IllegalStateException("Already frozen");
        }
        this.zzd = true;
        com.google.android.libraries.places.internal.zzro zzroVar = this.zzb;
        return (zzroVar == null || !this.zzc.isEmpty()) ? this : zzroVar;
    }

    public final boolean zzc() {
        return this == com.google.android.libraries.places.internal.zzrn.zza;
    }

    final boolean zzd(com.google.android.libraries.places.internal.zzrm zzrmVar) {
        if (this.zzc.containsKey(zzrmVar)) {
            return true;
        }
        com.google.android.libraries.places.internal.zzro zzroVar = this.zzb;
        return zzroVar != null && zzroVar.zzd(zzrmVar);
    }

    final /* synthetic */ boolean zzh() {
        return this.zzd;
    }

    final /* synthetic */ androidx.collection.SimpleArrayMap zzg() {
        return this.zzc;
    }

    final boolean zze() {
        return this.zzd;
    }
}
