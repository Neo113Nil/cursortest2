package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhn extends com.google.android.gms.internal.ads.zzhh {
    private com.google.android.gms.internal.ads.zzht zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzhn() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.zzd;
        if (i3 == 0) {
            return -1;
        }
        int min = java.lang.Math.min(i2, i3);
        byte[] bArr2 = this.zzb;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        java.lang.System.arraycopy(bArr2, this.zzc, bArr, i, min);
        this.zzc += min;
        this.zzd -= min;
        zzh(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final long zzb(com.google.android.gms.internal.ads.zzht zzhtVar) throws java.io.IOException {
        zzf(zzhtVar);
        this.zza = zzhtVar;
        android.net.Uri normalizeScheme = zzhtVar.zza.normalizeScheme();
        java.lang.String scheme = normalizeScheme.getScheme();
        com.google.android.gms.internal.ads.zzgtj.zzf("data".equals(scheme), "Unsupported scheme: %s", scheme);
        java.lang.String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        java.lang.String[] split = schemeSpecificPart.split(",", -1);
        if (split.length != 2) {
            java.lang.String valueOf = java.lang.String.valueOf(normalizeScheme);
            java.lang.String.valueOf(valueOf);
            throw com.google.android.gms.internal.ads.zzat.zza("Unexpected URI format: ".concat(java.lang.String.valueOf(valueOf)), null);
        }
        java.lang.String str2 = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.zzb = android.util.Base64.decode(str2, 0);
            } catch (java.lang.IllegalArgumentException e) {
                java.lang.String.valueOf(str2);
                throw com.google.android.gms.internal.ads.zzat.zza("Error while parsing Base64 encoded string: ".concat(java.lang.String.valueOf(str2)), e);
            }
        } else {
            this.zzb = java.net.URLDecoder.decode(str2, java.nio.charset.StandardCharsets.US_ASCII.name()).getBytes(java.nio.charset.StandardCharsets.UTF_8);
        }
        long j = zzhtVar.zze;
        int length = this.zzb.length;
        if (j > length) {
            this.zzb = null;
            throw new com.google.android.gms.internal.ads.zzhq(2008);
        }
        int i = (int) j;
        this.zzc = i;
        int i2 = length - i;
        this.zzd = i2;
        long j2 = zzhtVar.zzf;
        if (j2 != -1) {
            this.zzd = (int) java.lang.Math.min(i2, j2);
        }
        zzg(zzhtVar);
        return j2 != -1 ? j2 : this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final android.net.Uri zzc() {
        com.google.android.gms.internal.ads.zzht zzhtVar = this.zza;
        if (zzhtVar != null) {
            return zzhtVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzi();
        }
        this.zza = null;
    }
}
