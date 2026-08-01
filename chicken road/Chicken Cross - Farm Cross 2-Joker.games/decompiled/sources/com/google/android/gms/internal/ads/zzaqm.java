package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzaqm implements zzaqh {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzarz zzb;
    private zzaql zzg;
    private long zzh;
    private String zzi;
    private zzaht zzj;
    private boolean zzk;
    private final boolean[] zzd = new boolean[4];
    private final zzaqk zze = new zzaqk(128);
    private long zzl = -9223372036854775807L;
    private final zzaqy zzf = new zzaqy(178, 128);
    private final zzeu zzc = new zzeu();

    zzaqm(zzarz zzarzVar, String str) {
        this.zzb = zzarzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza() {
        zzgr.zzj(this.zzd);
        this.zze.zza();
        zzaql zzaqlVar = this.zzg;
        if (zzaqlVar != null) {
            zzaqlVar.zza();
        }
        this.zzf.zza();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzb(zzagk zzagkVar, zzarv zzarvVar) {
        zzarvVar.zza();
        this.zzi = zzarvVar.zzc();
        this.zzj = zzagkVar.zzs(zzarvVar.zzb(), 2);
        this.zzg = new zzaql(this.zzj);
        this.zzb.zza(zzagkVar, zzarvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzc(long j, int i) {
        this.zzl = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012d  */
    @Override // com.google.android.gms.internal.ads.zzaqh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzeu zzeuVar) {
        int i;
        int i2;
        this.zzg.getClass();
        this.zzj.getClass();
        int zzg = zzeuVar.zzg();
        int zze = zzeuVar.zze();
        byte[] zzi = zzeuVar.zzi();
        this.zzh += zzeuVar.zzd();
        this.zzj.zzc(zzeuVar, zzeuVar.zzd());
        while (true) {
            int zzi2 = zzgr.zzi(zzi, zzg, zze, this.zzd);
            if (zzi2 == zze) {
                break;
            }
            int i3 = zzi2 + 3;
            int i4 = zzeuVar.zzi()[i3] & 255;
            int i5 = zzi2 - zzg;
            if (!this.zzk) {
                if (i5 > 0) {
                    this.zze.zzc(zzi, zzg, zzi2);
                }
                int i6 = i5 < 0 ? -i5 : 0;
                zzaqk zzaqkVar = this.zze;
                if (zzaqkVar.zzb(i4, i6)) {
                    zzaht zzahtVar = this.zzj;
                    int i7 = zzaqkVar.zzb;
                    String str = this.zzi;
                    str.getClass();
                    byte[] copyOf = Arrays.copyOf(zzaqkVar.zzc, zzaqkVar.zza);
                    zzet zzetVar = new zzet(copyOf, copyOf.length);
                    zzetVar.zzo(i7);
                    zzetVar.zzo(4);
                    zzetVar.zzg();
                    zzetVar.zzh(8);
                    if (zzetVar.zzi()) {
                        zzetVar.zzh(4);
                        zzetVar.zzh(3);
                    }
                    int zzj = zzetVar.zzj(4);
                    float f = 1.0f;
                    if (zzj == 15) {
                        int zzj2 = zzetVar.zzj(8);
                        int zzj3 = zzetVar.zzj(8);
                        if (zzj3 == 0) {
                            zzeh.zzc("H263Reader", "Invalid aspect ratio");
                        } else {
                            f = zzj2 / zzj3;
                        }
                    } else if (zzj < 7) {
                        f = zza[zzj];
                    } else {
                        zzeh.zzc("H263Reader", "Invalid aspect ratio");
                    }
                    float f2 = f;
                    if (zzetVar.zzi()) {
                        zzetVar.zzh(2);
                        zzetVar.zzh(1);
                        if (zzetVar.zzi()) {
                            zzetVar.zzh(15);
                            zzetVar.zzg();
                            zzetVar.zzh(15);
                            zzetVar.zzg();
                            zzetVar.zzh(15);
                            zzetVar.zzg();
                            zzetVar.zzh(3);
                            zzetVar.zzh(11);
                            zzetVar.zzg();
                            zzetVar.zzh(15);
                            zzetVar.zzg();
                            i2 = 2;
                            if (zzetVar.zzj(i2) != 0) {
                                zzeh.zzc("H263Reader", "Unhandled video object layer shape");
                            }
                            zzetVar.zzg();
                            int zzj4 = zzetVar.zzj(16);
                            zzetVar.zzg();
                            if (zzetVar.zzi()) {
                                if (zzj4 == 0) {
                                    zzeh.zzc("H263Reader", "Invalid vop_increment_time_resolution");
                                } else {
                                    int i8 = zzj4 - 1;
                                    int i9 = 0;
                                    while (i8 > 0) {
                                        i8 >>= 1;
                                        i9++;
                                    }
                                    zzetVar.zzh(i9);
                                }
                            }
                            zzetVar.zzg();
                            int zzj5 = zzetVar.zzj(13);
                            zzetVar.zzg();
                            int zzj6 = zzetVar.zzj(13);
                            zzetVar.zzg();
                            zzetVar.zzg();
                            zzt zztVar = new zzt();
                            zztVar.zza(str);
                            zztVar.zzn("video/mp2t");
                            zztVar.zzo("video/mp4v-es");
                            zztVar.zzv(zzj5);
                            zztVar.zzw(zzj6);
                            zztVar.zzC(f2);
                            zztVar.zzr(Collections.singletonList(copyOf));
                            zzahtVar.zzA(zztVar.zzQ());
                            this.zzk = true;
                        }
                    }
                    i2 = 2;
                    if (zzetVar.zzj(i2) != 0) {
                    }
                    zzetVar.zzg();
                    int zzj42 = zzetVar.zzj(16);
                    zzetVar.zzg();
                    if (zzetVar.zzi()) {
                    }
                    zzetVar.zzg();
                    int zzj52 = zzetVar.zzj(13);
                    zzetVar.zzg();
                    int zzj62 = zzetVar.zzj(13);
                    zzetVar.zzg();
                    zzetVar.zzg();
                    zzt zztVar2 = new zzt();
                    zztVar2.zza(str);
                    zztVar2.zzn("video/mp2t");
                    zztVar2.zzo("video/mp4v-es");
                    zztVar2.zzv(zzj52);
                    zztVar2.zzw(zzj62);
                    zztVar2.zzC(f2);
                    zztVar2.zzr(Collections.singletonList(copyOf));
                    zzahtVar.zzA(zztVar2.zzQ());
                    this.zzk = true;
                }
            }
            this.zzg.zzc(zzi, zzg, zzi2);
            zzaqy zzaqyVar = this.zzf;
            if (i5 > 0) {
                zzaqyVar.zzd(zzi, zzg, zzi2);
                i = 0;
            } else {
                i = -i5;
            }
            if (zzaqyVar.zze(i)) {
                int zza2 = zzgr.zza(zzaqyVar.zza, zzaqyVar.zzb);
                zzeu zzeuVar2 = this.zzc;
                String str2 = zzfm.zza;
                zzeuVar2.zzb(zzaqyVar.zza, zza2);
                this.zzb.zzb(this.zzl, zzeuVar2);
            }
            if (i4 == 178) {
                if (zzeuVar.zzi()[zzi2 + 2] == 1) {
                    zzaqyVar.zzc(178);
                }
                i4 = 178;
            }
            int i10 = zze - zzi2;
            this.zzg.zzd(this.zzh - i10, i10, this.zzk);
            this.zzg.zzb(i4, this.zzl);
            zzg = i3;
        }
        if (!this.zzk) {
            this.zze.zzc(zzi, zzg, zze);
        }
        this.zzg.zzc(zzi, zzg, zze);
        this.zzf.zzd(zzi, zzg, zze);
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzn() {
        zzaql zzaqlVar = this.zzg;
        zzaqlVar.getClass();
        zzaqlVar.zzd(this.zzh, 0, this.zzk);
        this.zzg.zza();
    }
}
