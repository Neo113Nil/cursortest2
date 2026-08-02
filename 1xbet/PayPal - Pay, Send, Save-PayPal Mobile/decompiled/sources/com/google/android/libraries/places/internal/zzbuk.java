package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbuk implements com.google.android.libraries.places.internal.zzbpa {
    final /* synthetic */ com.google.android.libraries.places.internal.zzcag zza;

    zzbuk(com.google.android.libraries.places.internal.zzbvr zzbvrVar, com.google.android.libraries.places.internal.zzcag zzcagVar) {
        this.zza = zzcagVar;
        java.util.Objects.requireNonNull(zzbvrVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbpa
    public final com.google.android.libraries.places.internal.zzbpb zza() {
        return new com.google.android.libraries.places.internal.zzbpb(this.zza);
    }
}
