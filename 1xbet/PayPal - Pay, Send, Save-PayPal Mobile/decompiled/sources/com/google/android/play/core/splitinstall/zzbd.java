package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
public final class zzbd implements com.google.android.play.core.splitinstall.internal.zzcb {
    private final com.google.android.play.core.splitinstall.internal.zzcb zza;

    @Override // com.google.android.play.core.splitinstall.internal.zzcb, com.google.android.play.core.splitinstall.internal.zzby
    public final /* synthetic */ java.lang.Object zza() {
        android.content.Context zzb = ((com.google.android.play.core.splitinstall.zzad) this.zza).zzb();
        return new com.google.android.play.core.splitinstall.zzbc(zzb, zzb.getPackageName());
    }

    public zzbd(com.google.android.play.core.splitinstall.internal.zzcb zzcbVar) {
        this.zza = zzcbVar;
    }
}
