package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzanf implements com.google.android.libraries.places.internal.zzbdw {
    static final com.google.android.libraries.places.internal.zzbdw zza = new com.google.android.libraries.places.internal.zzanf();

    @Override // com.google.android.libraries.places.internal.zzbdw
    public final boolean zza(int i) {
        com.google.android.libraries.places.internal.zzang zzangVar;
        if (i == 0) {
            zzangVar = com.google.android.libraries.places.internal.zzang.UNDEFINED;
        } else if (i != 1) {
            zzangVar = i != 2 ? null : com.google.android.libraries.places.internal.zzang.SEARCH_NEARBY_REQUEST;
        } else {
            zzangVar = com.google.android.libraries.places.internal.zzang.SEARCH_BY_TEXT_REQUEST;
        }
        return zzangVar != null;
    }

    private zzanf() {
    }
}
