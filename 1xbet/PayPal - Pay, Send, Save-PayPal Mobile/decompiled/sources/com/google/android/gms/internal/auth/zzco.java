package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzco implements com.google.android.gms.internal.auth.zzcl {
    private static com.google.android.gms.internal.auth.zzco zza;

    @javax.annotation.Nullable
    private final android.content.Context zzb;

    @javax.annotation.Nullable
    private final android.database.ContentObserver zzc;

    private zzco(android.content.Context context) {
        this.zzb = context;
        com.google.android.gms.internal.auth.zzcn zzcnVar = new com.google.android.gms.internal.auth.zzcn(this, null);
        this.zzc = zzcnVar;
        context.getContentResolver().registerContentObserver(com.google.android.gms.internal.auth.zzcb.zza, true, zzcnVar);
    }

    static com.google.android.gms.internal.auth.zzco zza(android.content.Context context) {
        com.google.android.gms.internal.auth.zzco zzcoVar;
        synchronized (com.google.android.gms.internal.auth.zzco.class) {
            if (zza == null) {
                zza = androidx.core.content.PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new com.google.android.gms.internal.auth.zzco(context) : new com.google.android.gms.internal.auth.zzco();
            }
            zzcoVar = zza;
        }
        return zzcoVar;
    }

    static void zze() {
        android.content.Context context;
        synchronized (com.google.android.gms.internal.auth.zzco.class) {
            com.google.android.gms.internal.auth.zzco zzcoVar = zza;
            if (zzcoVar != null && (context = zzcoVar.zzb) != null && zzcoVar.zzc != null) {
                context.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        }
    }

    @Override // com.google.android.gms.internal.auth.zzcl
    @javax.annotation.Nullable
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final java.lang.String zzb(final java.lang.String str) {
        android.content.Context context = this.zzb;
        if (context == null || com.google.android.gms.internal.auth.zzcc.zza(context)) {
            return null;
        }
        try {
            return (java.lang.String) com.google.android.gms.internal.auth.zzcj.zza(new com.google.android.gms.internal.auth.zzck() { // from class: com.google.android.gms.internal.auth.zzcm
                @Override // com.google.android.gms.internal.auth.zzck
                public final java.lang.Object zza() {
                    return com.google.android.gms.internal.auth.zzco.this.zzd(str);
                }
            });
        } catch (java.lang.IllegalStateException | java.lang.NullPointerException | java.lang.SecurityException e) {
            android.util.Log.e("GservicesLoader", "Unable to read GServices for: ".concat(java.lang.String.valueOf(str)), e);
            return null;
        }
    }

    final /* synthetic */ java.lang.String zzd(java.lang.String str) {
        return com.google.android.gms.internal.auth.zzcb.zza(this.zzb.getContentResolver(), str, null);
    }

    private zzco() {
        this.zzb = null;
        this.zzc = null;
    }
}
