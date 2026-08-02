package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzani implements com.google.android.libraries.places.internal.zzbdw {
    static final com.google.android.libraries.places.internal.zzbdw zza = new com.google.android.libraries.places.internal.zzani();

    @Override // com.google.android.libraries.places.internal.zzbdw
    public final boolean zza(int i) {
        com.google.android.libraries.places.internal.zzanj zzanjVar;
        if (i == 0) {
            zzanjVar = com.google.android.libraries.places.internal.zzanj.POSITION_UNDEFINED;
        } else if (i != 1) {
            zzanjVar = i != 2 ? null : com.google.android.libraries.places.internal.zzanj.POSITION_BOTTOM;
        } else {
            zzanjVar = com.google.android.libraries.places.internal.zzanj.POSITION_TOP;
        }
        return zzanjVar != null;
    }

    private zzani() {
    }
}
