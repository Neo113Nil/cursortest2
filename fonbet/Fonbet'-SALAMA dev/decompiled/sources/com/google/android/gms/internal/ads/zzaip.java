package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaip {
    public final boolean zza;
    public final String zzb;
    public final zzaea zzc;
    public final int zzd;
    public final byte[] zze;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r6.equals("cenc") != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzaip(boolean z4, String str, int i7, byte[] bArr, int i8, int i9, byte[] bArr2) {
        char c3 = 0;
        int i10 = 1;
        zzcv.zzd((i7 == 0) ^ (bArr2 == null));
        this.zza = z4;
        this.zzb = str;
        this.zzd = i7;
        this.zze = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (str.equals("cbc1")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3046671:
                    if (str.equals("cbcs")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3049879:
                    break;
                case 3049895:
                    if (str.equals("cens")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            if (c3 != 0 && c3 != 1) {
                if (c3 == 2 || c3 == 3) {
                    i10 = 2;
                } else {
                    zzdq.zzf("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                }
            }
        }
        this.zzc = new zzaea(i10, bArr, i8, i9);
    }
}
