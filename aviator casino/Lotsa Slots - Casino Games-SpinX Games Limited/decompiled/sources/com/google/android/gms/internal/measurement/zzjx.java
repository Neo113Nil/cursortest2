package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzjx implements com.google.android.gms.internal.measurement.zzju {
    private static com.google.android.gms.internal.measurement.zzjx zza;
    private final android.content.Context zzb;
    private final android.database.ContentObserver zzc;
    private boolean zzd;

    private zzjx() {
        this.zzd = false;
        this.zzb = null;
        this.zzc = null;
    }

    private zzjx(android.content.Context context) {
        this.zzd = false;
        this.zzb = context;
        this.zzc = new com.google.android.gms.internal.measurement.zzjv(this, null);
    }

    static com.google.android.gms.internal.measurement.zzjx zza(android.content.Context context) {
        com.google.android.gms.internal.measurement.zzjx zzjxVar;
        synchronized (com.google.android.gms.internal.measurement.zzjx.class) {
            if (zza == null) {
                zza = androidx.core.content.PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new com.google.android.gms.internal.measurement.zzjx(context) : new com.google.android.gms.internal.measurement.zzjx();
            }
            com.google.android.gms.internal.measurement.zzjx zzjxVar2 = zza;
            if (zzjxVar2 != null && zzjxVar2.zzc != null && !zzjxVar2.zzd) {
                try {
                    context.getContentResolver().registerContentObserver(com.google.android.gms.internal.measurement.zzjg.zza, true, zza.zzc);
                    ((com.google.android.gms.internal.measurement.zzjx) com.google.common.base.Preconditions.checkNotNull(zza)).zzd = true;
                } catch (java.lang.SecurityException e) {
                    android.util.Log.e("GservicesLoader", "Unable to register Gservices content observer", e);
                }
            }
            zzjxVar = (com.google.android.gms.internal.measurement.zzjx) com.google.common.base.Preconditions.checkNotNull(zza);
        }
        return zzjxVar;
    }

    static synchronized void zzc() {
        android.content.Context context;
        synchronized (com.google.android.gms.internal.measurement.zzjx.class) {
            com.google.android.gms.internal.measurement.zzjx zzjxVar = zza;
            if (zzjxVar != null && (context = zzjxVar.zzb) != null && zzjxVar.zzc != null && zzjxVar.zzd) {
                context.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzju
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final java.lang.String zze(final java.lang.String str) {
        android.content.Context context = this.zzb;
        if (context != null && !com.google.android.gms.internal.measurement.zzjm.zzb(context)) {
            try {
                return (java.lang.String) com.google.android.gms.internal.measurement.zzju.CC.zzg(new com.google.android.gms.internal.measurement.zzjt() { // from class: com.google.android.gms.internal.measurement.zzjw
                    @Override // com.google.android.gms.internal.measurement.zzjt
                    public final /* synthetic */ java.lang.Object zza() {
                        return com.google.android.gms.internal.measurement.zzjx.this.zzd(str);
                    }
                });
            } catch (java.lang.IllegalStateException | java.lang.NullPointerException | java.lang.SecurityException e) {
                android.util.Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
            }
        }
        return null;
    }

    final /* synthetic */ java.lang.String zzd(java.lang.String str) {
        return com.google.android.gms.internal.measurement.zzjf.zza(((android.content.Context) com.google.common.base.Preconditions.checkNotNull(this.zzb)).getContentResolver(), str, null);
    }
}
