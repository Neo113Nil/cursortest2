package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzamk implements com.google.android.libraries.places.internal.zzbdw {
    static final com.google.android.libraries.places.internal.zzbdw zza = new com.google.android.libraries.places.internal.zzamk();

    @Override // com.google.android.libraries.places.internal.zzbdw
    public final boolean zza(int i) {
        com.google.android.libraries.places.internal.zzaml zzamlVar;
        if (i == 0) {
            zzamlVar = com.google.android.libraries.places.internal.zzaml.VARIANT_UNDEFINED;
        } else if (i != 1) {
            zzamlVar = i != 2 ? null : com.google.android.libraries.places.internal.zzaml.VARIANT_FULL;
        } else {
            zzamlVar = com.google.android.libraries.places.internal.zzaml.VARIANT_COMPACT;
        }
        return zzamlVar != null;
    }

    private zzamk() {
    }
}
