package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhdl {
    private final java.io.OutputStream zza;

    private zzhdl(java.io.OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static com.google.android.gms.internal.ads.zzhdl zzb(java.io.OutputStream outputStream) {
        return new com.google.android.gms.internal.ads.zzhdl(outputStream);
    }

    public final void zza(com.google.android.gms.internal.ads.zzhsz zzhszVar) throws java.io.IOException {
        try {
            zzhszVar.zzaO(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
