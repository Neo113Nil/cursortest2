package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaor {
    private boolean zzd;
    private boolean zze;
    private int[] zzf;
    private int zzg;
    private int zzh;
    private android.graphics.Rect zzi;
    private long zzb = -9223372036854775807L;
    private long zzc = -9223372036854775807L;
    private final int[] zza = new int[4];
    private int zzj = -1;
    private int zzk = -1;

    private static int zzg(int[] iArr, int i) {
        if (i >= iArr.length) {
            i = 0;
        }
        return iArr[i];
    }

    private static int zzh(int i, int i2) {
        return (i & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK) | ((i2 * 17) << 24);
    }

    private final void zzi(com.google.android.gms.internal.ads.zzes zzesVar, boolean z, android.graphics.Rect rect, int[] iArr) {
        int i;
        int i2;
        int i3 = !z ? 1 : 0;
        int width = rect.width();
        int i4 = i3 * width;
        int height = rect.height();
        while (true) {
            int i5 = 0;
            do {
                int i6 = 0;
                for (int i7 = 1; i6 < i7 && i7 <= 64; i7 <<= 2) {
                    if (zzesVar.zzc() < 4) {
                        i2 = 0;
                        i = -1;
                        break;
                    }
                    i6 = (i6 << 4) | zzesVar.zzj(4);
                }
                i = i6 & 3;
                i2 = i6 < 4 ? width : i6 >> 2;
                int min = java.lang.Math.min(i2, width - i5);
                if (min > 0) {
                    int i8 = i4 + min;
                    java.util.Arrays.fill(iArr, i4, i8, this.zza[i]);
                    i5 += min;
                    i4 = i8;
                }
            } while (i5 < width);
            i3 += 2;
            if (i3 >= height) {
                return;
            }
            i4 = i3 * width;
            zzesVar.zzm();
        }
    }

    public final void zza(java.lang.String str) {
        int i;
        java.lang.String trim = str.trim();
        java.lang.String str2 = com.google.android.gms.internal.ads.zzfl.zza;
        for (java.lang.String str3 : trim.split("\\r?\\n", -1)) {
            if (str3.startsWith("palette: ")) {
                java.lang.String[] split = str3.substring(9).split(",", -1);
                this.zzf = new int[split.length];
                for (int i2 = 0; i2 < split.length; i2++) {
                    int[] iArr = this.zzf;
                    try {
                        i = java.lang.Integer.parseInt(split[i2].trim(), 16);
                    } catch (java.lang.RuntimeException e) {
                        com.google.android.gms.internal.ads.zzeg.zzd("VobsubParser", "Parsing color failed", e);
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str3.startsWith("size: ")) {
                java.lang.String[] split2 = str3.substring(6).trim().split("x", -1);
                if (split2.length != 2) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str3).length() + 36);
                    sb.append("Ignoring malformed IDX size line: '");
                    sb.append(str3);
                    sb.append("'");
                    com.google.android.gms.internal.ads.zzeg.zzc("VobsubParser", sb.toString());
                } else {
                    try {
                        this.zzg = java.lang.Integer.parseInt(split2[0]);
                        this.zzh = java.lang.Integer.parseInt(split2[1]);
                        this.zzd = true;
                    } catch (java.lang.RuntimeException e2) {
                        com.google.android.gms.internal.ads.zzeg.zzd("VobsubParser", "Parsing IDX failed", e2);
                    }
                }
            }
        }
    }

    public final com.google.android.gms.internal.ads.zzcx zzb(com.google.android.gms.internal.ads.zzet zzetVar) {
        android.graphics.Rect rect;
        if (this.zzf == null || !this.zzd || !this.zze || (rect = this.zzi) == null || this.zzj == -1 || this.zzk == -1 || rect.width() < 2 || this.zzi.height() < 2) {
            return null;
        }
        android.graphics.Rect rect2 = this.zzi;
        int[] iArr = new int[rect2.width() * rect2.height()];
        com.google.android.gms.internal.ads.zzes zzesVar = new com.google.android.gms.internal.ads.zzes();
        zzetVar.zzh(this.zzj);
        zzesVar.zza(zzetVar);
        zzi(zzesVar, true, rect2, iArr);
        zzetVar.zzh(this.zzk);
        zzesVar.zza(zzetVar);
        zzi(zzesVar, false, rect2, iArr);
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), android.graphics.Bitmap.Config.ARGB_8888);
        com.google.android.gms.internal.ads.zzcw zzcwVar = new com.google.android.gms.internal.ads.zzcw();
        zzcwVar.zzc(createBitmap);
        zzcwVar.zzi(rect2.left / this.zzg);
        zzcwVar.zzj(0);
        zzcwVar.zzf(rect2.top / this.zzh, 0);
        zzcwVar.zzg(0);
        zzcwVar.zzm(rect2.width() / this.zzg);
        zzcwVar.zzn(rect2.height() / this.zzh);
        return zzcwVar.zzr();
    }

    public final void zzc() {
        this.zzb = -9223372036854775807L;
        this.zzc = -9223372036854775807L;
        this.zze = false;
        this.zzi = null;
        this.zzj = -1;
        this.zzk = -1;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0068. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzet zzetVar) {
        boolean z;
        if (this.zzf == null) {
            com.google.android.gms.internal.ads.zzeg.zzc("VobsubParser", "Skipping SPU (no palette)");
            return;
        }
        if (!this.zzd) {
            com.google.android.gms.internal.ads.zzeg.zzc("VobsubParser", "Skipping SPU (no plane)");
            return;
        }
        int zzg = zzetVar.zzg() - 2;
        zzetVar.zzh(zzetVar.zzt() + zzg);
        do {
            int i = 4;
            if (zzetVar.zzd() < 4) {
                return;
            }
            int zzg2 = zzetVar.zzg();
            int zzt = zzetVar.zzt() * 10000;
            int zzt2 = zzetVar.zzt() + zzg;
            z = zzt2 != zzg2 && zzt2 < zzetVar.zze();
            int zze = z ? zzt2 : zzetVar.zze();
            while (true) {
                for (boolean z2 = true; zzetVar.zzg() < zze && z2; z2 = false) {
                    long j = zzt;
                    int zzs = zzetVar.zzs();
                    if (zzs == 255) {
                        switch (zzs) {
                            case 0:
                                break;
                            case 1:
                                this.zzb = j;
                                i = 4;
                            case 2:
                                this.zzc = j;
                                i = 4;
                            case 3:
                                if (zzetVar.zzd() < 2) {
                                    com.google.android.gms.internal.ads.zzeg.zzc("VobsubParser", "Incomplete color command");
                                    i = 4;
                                    break;
                                } else {
                                    int zzs2 = zzetVar.zzs();
                                    int zzs3 = zzetVar.zzs();
                                    int[] iArr = this.zza;
                                    iArr[3] = zzg(this.zzf, zzs2 >> 4);
                                    iArr[2] = zzg(this.zzf, zzs2 & 15);
                                    iArr[1] = zzg(this.zzf, zzs3 >> 4);
                                    iArr[0] = zzg(this.zzf, zzs3 & 15);
                                    this.zze = true;
                                    i = 4;
                                }
                            case 4:
                                if (zzetVar.zzd() < 2) {
                                    com.google.android.gms.internal.ads.zzeg.zzc("VobsubParser", "Incomplete alpha command");
                                } else if (this.zze) {
                                    int zzs4 = zzetVar.zzs();
                                    int zzs5 = zzetVar.zzs();
                                    int[] iArr2 = this.zza;
                                    iArr2[3] = zzh(iArr2[3], zzs4 >> 4);
                                    iArr2[2] = zzh(iArr2[2], zzs4 & 15);
                                    iArr2[1] = zzh(iArr2[1], zzs5 >> 4);
                                    iArr2[0] = zzh(iArr2[0], zzs5 & 15);
                                    i = 4;
                                } else {
                                    com.google.android.gms.internal.ads.zzeg.zzc("VobsubParser", "Ignoring alpha command before color command");
                                }
                                i = 4;
                                break;
                            case 5:
                                if (zzetVar.zzd() < 6) {
                                    com.google.android.gms.internal.ads.zzeg.zzc("VobsubParser", "Incomplete area command");
                                    break;
                                } else {
                                    int zzs6 = zzetVar.zzs();
                                    int zzs7 = zzetVar.zzs();
                                    int i2 = zzs7 >> 4;
                                    int zzs8 = ((zzs7 & 15) << 8) | zzetVar.zzs();
                                    int zzs9 = zzetVar.zzs();
                                    int zzs10 = zzetVar.zzs();
                                    this.zzi = new android.graphics.Rect((zzs6 << i) | i2, (zzs9 << i) | (zzs10 >> 4), zzs8 + 1, (((zzs10 & 15) << 8) | zzetVar.zzs()) + 1);
                                    i = 4;
                                }
                            case 6:
                                if (zzetVar.zzd() < i) {
                                    com.google.android.gms.internal.ads.zzeg.zzc("VobsubParser", "Incomplete offsets command");
                                    break;
                                } else {
                                    this.zzj = zzetVar.zzt();
                                    this.zzk = zzetVar.zzt();
                                }
                            default:
                                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzs).length() + 22);
                                sb.append("Unrecognized command: ");
                                sb.append(zzs);
                                com.google.android.gms.internal.ads.zzeg.zzc("VobsubParser", sb.toString());
                                break;
                        }
                        while (zzetVar.zzg() < zze) {
                            long j2 = zzt;
                            int zzs11 = zzetVar.zzs();
                            if (zzs11 == 255) {
                            }
                        }
                    }
                }
            }
            if (z) {
                zzetVar.zzh(zzt2);
            }
        } while (z);
    }

    final /* synthetic */ long zze() {
        return this.zzb;
    }

    final /* synthetic */ long zzf() {
        return this.zzc;
    }
}
