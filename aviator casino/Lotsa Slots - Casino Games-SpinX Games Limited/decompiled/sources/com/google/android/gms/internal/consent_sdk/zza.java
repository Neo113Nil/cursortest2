package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public abstract class zza {
    private static com.google.android.gms.internal.consent_sdk.zza zza;

    public static com.google.android.gms.internal.consent_sdk.zza zza(android.content.Context context) {
        com.google.android.gms.internal.consent_sdk.zza zzaVar;
        synchronized (com.google.android.gms.internal.consent_sdk.zza.class) {
            if (zza == null) {
                com.google.android.gms.internal.consent_sdk.zzai zzaiVar = new com.google.android.gms.internal.consent_sdk.zzai(null);
                zzaiVar.zzb((android.app.Application) context.getApplicationContext());
                zza = zzaiVar.zza();
            }
            zzaVar = zza;
        }
        return zzaVar;
    }

    public abstract com.google.android.gms.internal.consent_sdk.zzj zzb();

    public abstract com.google.android.gms.internal.consent_sdk.zzbq zzc();

    public abstract com.google.android.gms.internal.consent_sdk.zzcr zzd();
}
