package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
public final class zzae implements com.google.android.play.core.splitinstall.internal.zzcb {
    private final com.google.android.play.core.splitinstall.internal.zzcb zza;

    @Override // com.google.android.play.core.splitinstall.internal.zzcb, com.google.android.play.core.splitinstall.internal.zzby
    public final /* bridge */ /* synthetic */ java.lang.Object zza() {
        java.io.File file = (java.io.File) this.zza.zza();
        if (file == null) {
            return null;
        }
        return com.google.android.play.core.splitinstall.testing.zzaa.zza(file);
    }

    public zzae(com.google.android.play.core.splitinstall.internal.zzcb zzcbVar) {
        this.zza = zzcbVar;
    }
}
