package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzahp implements com.google.android.gms.internal.ads.zzafy {
    private static final int[] zza;
    private static final int[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private final byte[] zze;
    private final com.google.android.gms.internal.ads.zzahk zzf;
    private boolean zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private com.google.android.gms.internal.ads.zzagb zzn;
    private com.google.android.gms.internal.ads.zzahk zzo;
    private com.google.android.gms.internal.ads.zzahk zzp;
    private com.google.android.gms.internal.ads.zzahb zzq;
    private long zzr;
    private boolean zzs;

    static {
        int i = com.google.android.gms.internal.ads.zzaho.zza;
        zza = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        zzb = new int[]{18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        zzc = "#!AMR\n".getBytes(java.nio.charset.StandardCharsets.UTF_8);
        zzd = "#!AMR-WB\n".getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public zzahp() {
        throw null;
    }

    public zzahp(int i) {
        this.zze = new byte[1];
        this.zzk = -1;
        com.google.android.gms.internal.ads.zzafv zzafvVar = new com.google.android.gms.internal.ads.zzafv();
        this.zzf = zzafvVar;
        this.zzp = zzafvVar;
    }

    private final boolean zzh(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        byte[] bArr = zzc;
        if (zzi(zzafzVar, bArr)) {
            this.zzg = false;
            zzafzVar.zzf(bArr.length);
            return true;
        }
        byte[] bArr2 = zzd;
        if (!zzi(zzafzVar, bArr2)) {
            return false;
        }
        this.zzg = true;
        zzafzVar.zzf(bArr2.length);
        return true;
    }

    private static boolean zzi(com.google.android.gms.internal.ads.zzafz zzafzVar, byte[] bArr) throws java.io.IOException {
        zzafzVar.zzl();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        zzafzVar.zzi(bArr2, 0, length);
        return java.util.Arrays.equals(bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a A[Catch: EOFException -> 0x009f, TryCatch #0 {EOFException -> 0x009f, blocks: (B:13:0x0007, B:15:0x0018, B:23:0x003a, B:24:0x0043, B:30:0x003f, B:40:0x005d, B:41:0x0080, B:42:0x0081, B:43:0x009e), top: B:12:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f A[Catch: EOFException -> 0x009f, TryCatch #0 {EOFException -> 0x009f, blocks: (B:13:0x0007, B:15:0x0018, B:23:0x003a, B:24:0x0043, B:30:0x003f, B:40:0x005d, B:41:0x0080, B:42:0x0081, B:43:0x009e), top: B:12:0x0007 }] */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"realTrackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzj(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        int i;
        int i2 = this.zzj;
        if (i2 == 0) {
            try {
                zzafzVar.zzl();
                byte[] bArr = this.zze;
                zzafzVar.zzi(bArr, 0, 1);
                byte b = bArr[0];
                if ((b & 131) > 0) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf((int) b).length() + 38);
                    sb.append("Invalid padding bits for frame header ");
                    sb.append((int) b);
                    throw com.google.android.gms.internal.ads.zzat.zzb(sb.toString(), null);
                }
                boolean z = this.zzg;
                int i3 = (b >> 3) & 15;
                if (z) {
                    if (i3 >= 10) {
                        if (i3 > 13) {
                        }
                    }
                    i2 = !z ? zzb[i3] : zza[i3];
                    this.zzi = i2;
                    this.zzj = i2;
                    i = this.zzk;
                    if (i == -1) {
                        this.zzk = i2;
                        i = i2;
                    }
                    if (i == i2) {
                        this.zzl++;
                    }
                }
                if (!z) {
                    if (i3 >= 12 && i3 <= 14) {
                    }
                    if (!z) {
                    }
                    this.zzi = i2;
                    this.zzj = i2;
                    i = this.zzk;
                    if (i == -1) {
                    }
                    if (i == i2) {
                    }
                }
                java.lang.String str = true != z ? "NB" : "WB";
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(i3).length() + 26);
                sb2.append("Illegal AMR ");
                sb2.append(str);
                sb2.append(" frame type ");
                sb2.append(i3);
                throw com.google.android.gms.internal.ads.zzat.zzb(sb2.toString(), null);
            } catch (java.io.EOFException unused) {
                return -1;
            }
        }
        int zza2 = this.zzp.zza(zzafzVar, i2, true);
        if (zza2 == -1) {
            return -1;
        }
        int i4 = this.zzj - zza2;
        this.zzj = i4;
        if (i4 > 0) {
            return 0;
        }
        this.zzp.zze(this.zzh, 1, this.zzi, 0, null);
        this.zzh += 20000;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        return zzh(zzafzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public /* synthetic */ java.util.List zzb() {
        java.util.List zzi;
        zzi = com.google.android.gms.internal.ads.zzgwm.zzi();
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(com.google.android.gms.internal.ads.zzagb zzagbVar) {
        this.zzn = zzagbVar;
        com.google.android.gms.internal.ads.zzahk zzu = zzagbVar.zzu(0, 1);
        this.zzo = zzu;
        this.zzp = zzu;
        zzagbVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(com.google.android.gms.internal.ads.zzafz zzafzVar, com.google.android.gms.internal.ads.zzagy zzagyVar) throws java.io.IOException {
        this.zzo.getClass();
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        if (zzafzVar.zzn() == 0 && !zzh(zzafzVar)) {
            throw com.google.android.gms.internal.ads.zzat.zzb("Could not find AMR header.", null);
        }
        if (!this.zzs) {
            this.zzs = true;
            boolean z = this.zzg;
            java.lang.String str2 = true != z ? "audio/amr" : "audio/amr-wb";
            java.lang.String str3 = true != z ? "audio/3gpp" : "audio/amr-wb";
            int i = true != z ? 8000 : 16000;
            int i2 = z ? zzb[8] : zza[7];
            com.google.android.gms.internal.ads.zzahk zzahkVar = this.zzo;
            com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
            zztVar.zzn(str2);
            zztVar.zzo(str3);
            zztVar.zzp(i2);
            zztVar.zzG(1);
            zztVar.zzH(i);
            zzahkVar.zzA(zztVar.zzO());
        }
        int zzj = zzj(zzafzVar);
        if (this.zzq == null) {
            com.google.android.gms.internal.ads.zzaha zzahaVar = new com.google.android.gms.internal.ads.zzaha(-9223372036854775807L, 0L);
            this.zzq = zzahaVar;
            this.zzn.zzw(zzahaVar);
        }
        return zzj == -1 ? -1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j, long j2) {
        this.zzh = 0L;
        this.zzi = 0;
        this.zzj = 0;
        this.zzr = j2;
        this.zzm = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public /* synthetic */ com.google.android.gms.internal.ads.zzafy zzg() {
        return com.google.android.gms.internal.ads.zzafy.CC.$default$zzg(this);
    }
}
