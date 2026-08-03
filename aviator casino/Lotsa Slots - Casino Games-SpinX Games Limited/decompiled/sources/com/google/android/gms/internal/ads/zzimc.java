package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public class zzimc extends com.google.android.gms.internal.ads.zzimf implements com.google.android.gms.internal.ads.zzaup {
    protected final java.lang.String zza = "moov";

    public zzimc(java.lang.String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final java.lang.String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zzb(com.google.android.gms.internal.ads.zzimg zzimgVar, java.nio.ByteBuffer byteBuffer, long j, com.google.android.gms.internal.ads.zzaum zzaumVar) throws java.io.IOException {
        zzimgVar.zzc();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzc = zzimgVar;
        this.zze = zzimgVar.zzc();
        zzimgVar.zzd(zzimgVar.zzc() + j);
        this.zzf = zzimgVar.zzc();
        this.zzb = zzaumVar;
    }
}
