package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzbx extends android.webkit.WebView {
    private final android.os.Handler zza;
    private final com.google.android.gms.internal.consent_sdk.zzcd zzb;
    private boolean zzc;

    public zzbx(com.google.android.gms.internal.consent_sdk.zzbz zzbzVar, android.os.Handler handler, com.google.android.gms.internal.consent_sdk.zzcd zzcdVar) {
        super(zzbzVar);
        this.zzc = false;
        this.zza = handler;
        this.zzb = zzcdVar;
    }

    static /* bridge */ /* synthetic */ boolean zzf(com.google.android.gms.internal.consent_sdk.zzbx zzbxVar, java.lang.String str) {
        return str != null && str.startsWith("consent://");
    }

    public final void zzc() {
        final com.google.android.gms.internal.consent_sdk.zzcd zzcdVar = this.zzb;
        java.util.Objects.requireNonNull(zzcdVar);
        this.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbu
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.consent_sdk.zzcd.this.zzd();
            }
        });
    }

    public final void zzd(java.lang.String str, java.lang.String str2) {
        final java.lang.String str3 = str + "(" + str2 + ");";
        this.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbt
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.consent_sdk.zzda.zza(com.google.android.gms.internal.consent_sdk.zzbx.this, str3);
            }
        });
    }
}
