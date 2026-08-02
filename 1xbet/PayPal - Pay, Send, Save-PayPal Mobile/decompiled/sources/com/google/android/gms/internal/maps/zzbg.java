package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
final class zzbg extends com.google.android.gms.internal.maps.zzbc {
    private final com.google.android.gms.internal.maps.zzbi zza;

    zzbg(com.google.android.gms.internal.maps.zzbi zzbiVar, int i) {
        super(zzbiVar.size(), i);
        this.zza = zzbiVar;
    }

    @Override // com.google.android.gms.internal.maps.zzbc
    protected final java.lang.Object zza(int i) {
        return this.zza.get(i);
    }
}
