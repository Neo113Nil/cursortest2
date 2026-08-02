package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzami implements com.google.android.libraries.places.internal.zzbdw {
    static final com.google.android.libraries.places.internal.zzbdw zza = new com.google.android.libraries.places.internal.zzami();

    @Override // com.google.android.libraries.places.internal.zzbdw
    public final boolean zza(int i) {
        com.google.android.libraries.places.internal.zzamj zzamjVar;
        if (i == 0) {
            zzamjVar = com.google.android.libraries.places.internal.zzamj.ORIENTATION_UNDEFINED;
        } else if (i != 1) {
            zzamjVar = i != 2 ? null : com.google.android.libraries.places.internal.zzamj.ORIENTATION_HORIZONTAL;
        } else {
            zzamjVar = com.google.android.libraries.places.internal.zzamj.ORIENTATION_VERTICAL;
        }
        return zzamjVar != null;
    }

    private zzami() {
    }
}
