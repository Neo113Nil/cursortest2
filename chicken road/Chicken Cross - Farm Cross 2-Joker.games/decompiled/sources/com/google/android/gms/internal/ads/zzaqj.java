package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzaqj implements zzaqh {
    private static final double[] zzc = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zza;
    private zzaht zzb;
    private final zzarz zzd;
    private final String zze;
    private final zzeu zzf;
    private final zzaqy zzg;
    private final boolean[] zzh = new boolean[4];
    private final zzaqi zzi = new zzaqi(128);
    private long zzj;
    private boolean zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private boolean zzq;
    private boolean zzr;

    zzaqj(zzarz zzarzVar, String str) {
        zzeu zzeuVar;
        this.zzd = zzarzVar;
        this.zze = str;
        if (zzarzVar != null) {
            this.zzg = new zzaqy(178, 128);
            zzeuVar = new zzeu();
        } else {
            zzeuVar = null;
            this.zzg = null;
        }
        this.zzf = zzeuVar;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza() {
        zzgr.zzj(this.zzh);
        this.zzi.zza();
        zzaqy zzaqyVar = this.zzg;
        if (zzaqyVar != null) {
            zzaqyVar.zza();
        }
        this.zzj = 0L;
        this.zzk = false;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzb(zzagk zzagkVar, zzarv zzarvVar) {
        zzarvVar.zza();
        this.zza = zzarvVar.zzc();
        this.zzb = zzagkVar.zzs(zzarvVar.zzb(), 2);
        zzarz zzarzVar = this.zzd;
        if (zzarzVar != null) {
            zzarzVar.zza(zzagkVar, zzarvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzc(long j, int i) {
        this.zzn = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c4  */
    @Override // com.google.android.gms.internal.ads.zzaqh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzeu zzeuVar) {
        int i;
        int i2;
        zzaqy zzaqyVar;
        int i3;
        long j;
        boolean z;
        boolean z2;
        long j2;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        long j3;
        byte b;
        int i8;
        this.zzb.getClass();
        int zzg = zzeuVar.zzg();
        int zze = zzeuVar.zze();
        byte[] zzi = zzeuVar.zzi();
        this.zzj += zzeuVar.zzd();
        this.zzb.zzc(zzeuVar, zzeuVar.zzd());
        while (true) {
            int zzi2 = zzgr.zzi(zzi, zzg, zze, this.zzh);
            if (zzi2 == zze) {
                break;
            }
            int i9 = zzi2 + 3;
            int i10 = zzeuVar.zzi()[i9] & 255;
            int i11 = zzi2 - zzg;
            if (!this.zzl) {
                if (i11 > 0) {
                    this.zzi.zzc(zzi, zzg, zzi2);
                }
                int i12 = i11 < 0 ? -i11 : 0;
                zzaqi zzaqiVar = this.zzi;
                if (zzaqiVar.zzb(i10, i12)) {
                    String str = this.zza;
                    str.getClass();
                    String str2 = this.zze;
                    byte[] copyOf = Arrays.copyOf(zzaqiVar.zzc, zzaqiVar.zza);
                    int i13 = copyOf[4] & 255;
                    byte b2 = copyOf[5];
                    int i14 = copyOf[6] & 255;
                    i2 = i9;
                    i = zze;
                    int i15 = (i13 << 4) | ((b2 & 255) >> 4);
                    int i16 = (copyOf[7] & 240) >> 4;
                    int i17 = i14 | ((b2 & Ascii.SI) << 8);
                    if (i16 == 2) {
                        i5 = i17 * 4;
                        i6 = i15 * 3;
                    } else if (i16 == 3) {
                        i5 = i17 * 16;
                        i6 = i15 * 9;
                    } else if (i16 != 4) {
                        f = 1.0f;
                        zzt zztVar = new zzt();
                        zztVar.zza(str);
                        zztVar.zzn(str2);
                        zztVar.zzo("video/mpeg2");
                        zztVar.zzv(i15);
                        zztVar.zzw(i17);
                        zztVar.zzC(f);
                        zztVar.zzr(Collections.singletonList(copyOf));
                        zzv zzQ = zztVar.zzQ();
                        i7 = (copyOf[7] & Ascii.SI) - 1;
                        j3 = 0;
                        if (i7 >= 0 && i7 < 8) {
                            double d = zzc[i7];
                            b = copyOf[zzaqiVar.zzb + 9];
                            i8 = (b & 96) >> 5;
                            if (i8 != (b & Ascii.US)) {
                                d *= (i8 + 1.0d) / (r9 + 1);
                            }
                            j3 = (long) (1000000.0d / d);
                        }
                        Pair create = Pair.create(zzQ, Long.valueOf(j3));
                        this.zzb.zzA((zzv) create.first);
                        this.zzm = ((Long) create.second).longValue();
                        this.zzl = true;
                        zzaqyVar = this.zzg;
                        if (zzaqyVar != null) {
                            if (i11 > 0) {
                                zzaqyVar.zzd(zzi, zzg, zzi2);
                                i4 = 0;
                            } else {
                                i4 = -i11;
                            }
                            if (zzaqyVar.zze(i4)) {
                                int zza = zzgr.zza(zzaqyVar.zza, zzaqyVar.zzb);
                                zzeu zzeuVar2 = this.zzf;
                                String str3 = zzfm.zza;
                                zzeuVar2.zzb(zzaqyVar.zza, zza);
                                this.zzd.zzb(this.zzp, zzeuVar2);
                            }
                            if (i10 == 178) {
                                if (zzeuVar.zzi()[zzi2 + 2] == 1) {
                                    zzaqyVar.zzc(178);
                                }
                                i10 = 178;
                            }
                        }
                        if (i10 != 0 || i10 == 179) {
                            i3 = i - zzi2;
                            if (this.zzr && this.zzl) {
                                j2 = this.zzp;
                                if (j2 != -9223372036854775807L) {
                                    this.zzb.zze(j2, this.zzq ? 1 : 0, ((int) (this.zzj - this.zzo)) - i3, i3, null);
                                }
                            }
                            if (this.zzk || this.zzr) {
                                this.zzo = this.zzj - i3;
                                j = this.zzn;
                                if (j == -9223372036854775807L) {
                                    long j4 = this.zzp;
                                    j = j4 != -9223372036854775807L ? j4 + this.zzm : -9223372036854775807L;
                                }
                                this.zzp = j;
                                z = false;
                                this.zzq = false;
                                this.zzn = -9223372036854775807L;
                                z2 = true;
                                this.zzk = true;
                            } else {
                                z = false;
                                z2 = true;
                            }
                            this.zzr = i10 == 0 ? z2 : z;
                        } else if (i10 == 184) {
                            this.zzq = true;
                        }
                        zzg = i2;
                        zze = i;
                    } else {
                        i5 = i17 * Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                        i6 = i15 * 100;
                    }
                    f = i5 / i6;
                    zzt zztVar2 = new zzt();
                    zztVar2.zza(str);
                    zztVar2.zzn(str2);
                    zztVar2.zzo("video/mpeg2");
                    zztVar2.zzv(i15);
                    zztVar2.zzw(i17);
                    zztVar2.zzC(f);
                    zztVar2.zzr(Collections.singletonList(copyOf));
                    zzv zzQ2 = zztVar2.zzQ();
                    i7 = (copyOf[7] & Ascii.SI) - 1;
                    j3 = 0;
                    if (i7 >= 0) {
                        double d2 = zzc[i7];
                        b = copyOf[zzaqiVar.zzb + 9];
                        i8 = (b & 96) >> 5;
                        if (i8 != (b & Ascii.US)) {
                        }
                        j3 = (long) (1000000.0d / d2);
                    }
                    Pair create2 = Pair.create(zzQ2, Long.valueOf(j3));
                    this.zzb.zzA((zzv) create2.first);
                    this.zzm = ((Long) create2.second).longValue();
                    this.zzl = true;
                    zzaqyVar = this.zzg;
                    if (zzaqyVar != null) {
                    }
                    if (i10 != 0) {
                    }
                    i3 = i - zzi2;
                    if (this.zzr) {
                        j2 = this.zzp;
                        if (j2 != -9223372036854775807L) {
                        }
                    }
                    if (this.zzk) {
                    }
                    this.zzo = this.zzj - i3;
                    j = this.zzn;
                    if (j == -9223372036854775807L) {
                    }
                    this.zzp = j;
                    z = false;
                    this.zzq = false;
                    this.zzn = -9223372036854775807L;
                    z2 = true;
                    this.zzk = true;
                    this.zzr = i10 == 0 ? z2 : z;
                    zzg = i2;
                    zze = i;
                }
            }
            i = zze;
            i2 = i9;
            zzaqyVar = this.zzg;
            if (zzaqyVar != null) {
            }
            if (i10 != 0) {
            }
            i3 = i - zzi2;
            if (this.zzr) {
            }
            if (this.zzk) {
            }
            this.zzo = this.zzj - i3;
            j = this.zzn;
            if (j == -9223372036854775807L) {
            }
            this.zzp = j;
            z = false;
            this.zzq = false;
            this.zzn = -9223372036854775807L;
            z2 = true;
            this.zzk = true;
            this.zzr = i10 == 0 ? z2 : z;
            zzg = i2;
            zze = i;
        }
        if (!this.zzl) {
            this.zzi.zzc(zzi, zzg, zze);
        }
        zzaqy zzaqyVar2 = this.zzg;
        if (zzaqyVar2 != null) {
            zzaqyVar2.zzd(zzi, zzg, zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzn() {
        zzaht zzahtVar = this.zzb;
        zzahtVar.getClass();
        long j = this.zzp;
        if (j != -9223372036854775807L) {
            boolean z = this.zzq;
            zzahtVar.zze(j, z ? 1 : 0, (int) (this.zzj - this.zzo), 0, null);
        }
    }
}
