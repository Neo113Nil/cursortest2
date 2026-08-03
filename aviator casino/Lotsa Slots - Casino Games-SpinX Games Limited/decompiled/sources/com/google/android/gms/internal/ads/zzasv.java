package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzasv {
    private final java.util.concurrent.Executor zza;

    public zzasv(android.os.Handler handler) {
        this.zza = new com.google.android.gms.internal.ads.zzast(this, handler);
    }

    public final void zza(com.google.android.gms.internal.ads.zzate zzateVar, com.google.android.gms.internal.ads.zzatk zzatkVar, java.lang.Runnable runnable) {
        zzateVar.zzp();
        zzateVar.zzc("post-response");
        ((com.google.android.gms.internal.ads.zzast) this.zza).zza.post(new com.google.android.gms.internal.ads.zzasu(zzateVar, zzatkVar, runnable));
    }

    public final void zzb(com.google.android.gms.internal.ads.zzate zzateVar, com.google.android.gms.internal.ads.zzatn zzatnVar) {
        zzateVar.zzc("post-error");
        ((com.google.android.gms.internal.ads.zzast) this.zza).zza.post(new com.google.android.gms.internal.ads.zzasu(zzateVar, com.google.android.gms.internal.ads.zzatk.zzb(zzatnVar), null));
    }
}
