package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbxj extends com.google.android.libraries.places.internal.zzblr {
    static final boolean zza = com.google.android.libraries.places.internal.zzbsz.zzj("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST", false);
    public static final /* synthetic */ int zzb = 0;

    @Override // com.google.android.libraries.places.internal.zzble
    public final com.google.android.libraries.places.internal.zzblp zza(com.google.android.libraries.places.internal.zzblg zzblgVar) {
        return zza ? new com.google.android.libraries.places.internal.zzbxc(zzblgVar) : new com.google.android.libraries.places.internal.zzbxi(zzblgVar);
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final int zzc() {
        return 5;
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final com.google.android.libraries.places.internal.zzbms zze(java.util.Map map) {
        try {
            java.lang.Boolean zzi = com.google.android.libraries.places.internal.zzbud.zzi(map, "shuffleAddressList");
            return com.google.android.libraries.places.internal.zzbms.zza(zza ? new com.google.android.libraries.places.internal.zzbwx(zzi, null) : new com.google.android.libraries.places.internal.zzbxe(zzi, null));
        } catch (java.lang.RuntimeException e) {
            return com.google.android.libraries.places.internal.zzbms.zzb(com.google.android.libraries.places.internal.zzbnp.zzi.zzd(e).zze("Failed parsing configuration for pick_first"));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final java.lang.String zzd() {
        return "pick_first";
    }
}
