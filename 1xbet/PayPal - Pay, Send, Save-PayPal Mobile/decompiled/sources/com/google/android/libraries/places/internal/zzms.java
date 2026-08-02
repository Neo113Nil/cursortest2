package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzms implements com.google.android.libraries.places.internal.zzbie {
    private final com.google.android.libraries.places.internal.zzbih zza;

    public static android.content.Context zzd(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        com.google.android.libraries.places.internal.zzbig.zza(applicationContext);
        return applicationContext;
    }

    @Override // com.google.android.libraries.places.internal.zzcez
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final android.content.Context zzb() {
        return zzd((android.content.Context) this.zza.zzb());
    }

    public static com.google.android.libraries.places.internal.zzms zzc(com.google.android.libraries.places.internal.zzbih zzbihVar) {
        return new com.google.android.libraries.places.internal.zzms(zzbihVar);
    }

    private zzms(com.google.android.libraries.places.internal.zzbih zzbihVar) {
        this.zza = zzbihVar;
    }
}
