package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcaf {
    private static final com.google.android.libraries.places.internal.zzblu zza;
    private static final com.google.android.libraries.places.internal.zzblu zzb;
    private static final com.google.android.libraries.places.internal.zzblu zzc;
    private static final com.google.android.libraries.places.internal.zzblv zzd;
    private final com.google.android.libraries.places.internal.zzbmo zze;

    static {
        com.google.android.libraries.places.internal.zzbmn zza2 = com.google.android.libraries.places.internal.zzbmn.zza();
        zza = zza2.zzc("grpc.subchannel.disconnections", "EXPERIMENTAL. Number of times the selected subchannel becomes disconnected", "{disconnection}", com.google.common.collect.Lists.newArrayList("grpc.target"), com.google.common.collect.Lists.newArrayList("grpc.lb.backend_service", "grpc.lb.locality", "grpc.disconnect_error"), false);
        zzb = zza2.zzc("grpc.subchannel.connection_attempts_succeeded", "EXPERIMENTAL. Number of successful connection attempts", "{attempt}", com.google.common.collect.Lists.newArrayList("grpc.target"), com.google.common.collect.Lists.newArrayList("grpc.lb.backend_service", "grpc.lb.locality"), false);
        zzc = zza2.zzc("grpc.subchannel.connection_attempts_failed", "EXPERIMENTAL. Number of failed connection attempts", "{attempt}", com.google.common.collect.Lists.newArrayList("grpc.target"), com.google.common.collect.Lists.newArrayList("grpc.lb.backend_service", "grpc.lb.locality"), false);
        zzd = zza2.zzd("grpc.subchannel.open_connections", "EXPERIMENTAL. Number of open connections.", "{connection}", com.google.common.collect.Lists.newArrayList("grpc.target"), com.google.common.collect.Lists.newArrayList("grpc.security_level", "grpc.lb.backend_service", "grpc.lb.locality"), false);
    }

    public final void zza(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.google.android.libraries.places.internal.zzbmo zzbmoVar = this.zze;
        zzbmoVar.zza(zzb, 1L, com.google.common.collect.ImmutableList.of(str), com.google.common.collect.ImmutableList.of(str2, str3));
        zzbmoVar.zzb(zzd, 1L, com.google.common.collect.ImmutableList.of(str), com.google.common.collect.ImmutableList.of(str4, str2, str3));
    }

    public final void zzb(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.zze.zza(zzc, 1L, com.google.common.collect.ImmutableList.of(str), com.google.common.collect.ImmutableList.of(str2, str3));
    }

    public final void zzc(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        com.google.android.libraries.places.internal.zzbmo zzbmoVar = this.zze;
        zzbmoVar.zza(zza, 1L, com.google.common.collect.ImmutableList.of(str), com.google.common.collect.ImmutableList.of(str2, str3, str4));
        zzbmoVar.zzb(zzd, -1L, com.google.common.collect.ImmutableList.of(str), com.google.common.collect.ImmutableList.of(str5, str2, str3));
    }

    public zzcaf(com.google.android.libraries.places.internal.zzbmo zzbmoVar) {
        this.zze = zzbmoVar;
    }
}
