package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzand implements com.google.android.libraries.places.internal.zzbdw {
    static final com.google.android.libraries.places.internal.zzbdw zza = new com.google.android.libraries.places.internal.zzand();

    @Override // com.google.android.libraries.places.internal.zzbdw
    public final boolean zza(int i) {
        com.google.android.libraries.places.internal.zzane zzaneVar;
        if (i == 0) {
            zzaneVar = com.google.android.libraries.places.internal.zzane.ORIENTATION_UNDEFINED;
        } else if (i != 1) {
            zzaneVar = i != 2 ? null : com.google.android.libraries.places.internal.zzane.ORIENTATION_HORIZONTAL;
        } else {
            zzaneVar = com.google.android.libraries.places.internal.zzane.ORIENTATION_VERTICAL;
        }
        return zzaneVar != null;
    }

    private zzand() {
    }
}
