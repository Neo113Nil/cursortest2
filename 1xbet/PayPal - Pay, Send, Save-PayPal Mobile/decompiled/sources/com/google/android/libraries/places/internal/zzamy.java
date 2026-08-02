package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzamy implements com.google.android.libraries.places.internal.zzbdw {
    static final com.google.android.libraries.places.internal.zzbdw zza = new com.google.android.libraries.places.internal.zzamy();

    @Override // com.google.android.libraries.places.internal.zzbdw
    public final boolean zza(int i) {
        com.google.android.libraries.places.internal.zzamz zzamzVar;
        if (i == 0) {
            zzamzVar = com.google.android.libraries.places.internal.zzamz.SIZE_UNDEFINED;
        } else if (i == 1) {
            zzamzVar = com.google.android.libraries.places.internal.zzamz.SMALL;
        } else if (i != 2) {
            zzamzVar = i != 3 ? null : com.google.android.libraries.places.internal.zzamz.LARGE;
        } else {
            zzamzVar = com.google.android.libraries.places.internal.zzamz.MEDIUM;
        }
        return zzamzVar != null;
    }

    private zzamy() {
    }
}
