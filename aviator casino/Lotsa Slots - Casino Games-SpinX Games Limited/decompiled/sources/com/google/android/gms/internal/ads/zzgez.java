package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgez implements com.google.android.gms.internal.ads.zzgfa {
    private final com.google.android.gms.internal.ads.zzifp zza;

    public zzgez(com.google.android.gms.internal.ads.zzifp zzifpVar) {
        this.zza = zzifpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final /* synthetic */ void zza(java.lang.Object obj, java.io.OutputStream outputStream) throws java.io.IOException {
        ((com.google.android.gms.internal.ads.zzifp) obj).zzaO(outputStream);
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(java.io.InputStream inputStream) {
        try {
            return (com.google.android.gms.internal.ads.zzifp) this.zza.zzbd().zza(inputStream, com.google.android.gms.internal.ads.zzido.zza());
        } catch (com.google.android.gms.internal.ads.zziet e) {
            throw new com.google.android.gms.internal.ads.zzgew("Cannot read proto.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final /* synthetic */ java.lang.Object zzc() {
        return this.zza;
    }
}
