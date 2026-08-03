package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfbf implements com.google.android.gms.internal.ads.zzfci {
    private com.google.android.gms.internal.ads.zzgcg zza;
    private com.google.android.gms.internal.ads.zzgcg zzb;
    private boolean zzc;
    private boolean zzd;
    private final boolean zze = false;
    private final boolean zzf;

    public zzfbf(com.google.android.gms.internal.ads.zzgcg zzgcgVar, com.google.android.gms.internal.ads.zzgcg zzgcgVar2, boolean z, boolean z2, boolean z3) {
        this.zza = zzgcgVar;
        this.zzb = zzgcgVar2;
        this.zzc = z;
        this.zzd = z2;
        this.zzf = z3;
    }

    public zzfbf(boolean z) {
        this.zzf = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdX)).booleanValue() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0084, code lost:
    
        if (r6.zzb.zzc() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0086, code lost:
    
        r1.putString("paidv2_id_android", r6.zzb.zza());
        r1.putLong("paidv2_creation_time_android", r6.zzb.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009c, code lost:
    
        r1.putBoolean("paidv2_pub_option_android", r6.zzc);
        r1.putBoolean("paidv2_user_option_android", r6.zzd);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdZ)).booleanValue() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0036, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdY)).booleanValue() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdW)).booleanValue() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        if (r6.zza.zzc() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        r1.putString("paidv1_id_android", r6.zza.zza());
        r1.putLong("paidv1_creation_time_android", r6.zza.zzb());
     */
    @Override // com.google.android.gms.internal.ads.zzfci
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (this.zze) {
            return;
        }
        android.os.Bundle zza = com.google.android.gms.internal.ads.zzfln.zza(bundle, "pii");
        boolean z = this.zzf;
        if (!z) {
        }
        if (z) {
        }
        if (!z) {
        }
        if (z) {
        }
        if (zza.isEmpty()) {
            return;
        }
        bundle.putBundle("pii", zza);
    }
}
