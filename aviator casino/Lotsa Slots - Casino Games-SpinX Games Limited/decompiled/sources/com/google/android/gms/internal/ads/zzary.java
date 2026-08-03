package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzary implements android.content.ServiceConnection {
    final /* synthetic */ com.google.android.gms.internal.ads.zzarz zza;
    private final com.google.android.gms.internal.ads.zzasa zzb;

    /* synthetic */ zzary(com.google.android.gms.internal.ads.zzarz zzarzVar, com.google.android.gms.internal.ads.zzasa zzasaVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzarzVar);
        this.zza = zzarzVar;
        this.zzb = zzasaVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.google.android.gms.internal.ads.zzasc.zza("InstallReferrerClient", "Install Referrer service connected.");
        com.google.android.gms.internal.ads.zzarz zzarzVar = this.zza;
        zzarzVar.zzf(com.google.android.gms.internal.ads.zzbei.zzb(iBinder));
        zzarzVar.zze(2);
        this.zzb.zza(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        com.google.android.gms.internal.ads.zzasc.zzb("InstallReferrerClient", "Install Referrer service disconnected.");
        com.google.android.gms.internal.ads.zzarz zzarzVar = this.zza;
        zzarzVar.zzf(null);
        zzarzVar.zze(0);
    }
}
