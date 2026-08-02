package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbfo extends com.google.android.libraries.places.internal.zzbfs {
    zzbfo() {
        super(null);
    }

    @Override // com.google.android.libraries.places.internal.zzbfs
    public final void zza() {
        if (!zzb()) {
            for (int i = 0; i < zzc(); i++) {
                ((com.google.android.libraries.places.internal.zzbdf) ((com.google.android.libraries.places.internal.zzbfp) zzd(i)).zza()).zzd();
            }
            java.util.Iterator it = zze().iterator();
            while (it.hasNext()) {
                ((com.google.android.libraries.places.internal.zzbdf) ((java.util.Map.Entry) it.next()).getKey()).zzd();
            }
        }
        super.zza();
    }
}
