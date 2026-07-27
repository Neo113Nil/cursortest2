package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzase implements zzagh {
    private zzagk zza;
    private zzaht zzb;
    private zzasb zze;
    private int zzc = 0;
    private long zzd = -1;
    private int zzf = -1;
    private long zzg = -1;

    static {
        int i = zzasd.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean zza(zzagi zzagiVar) throws IOException {
        return zzash.zza(zzagiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzc(zzagk zzagkVar) {
        this.zza = zzagkVar;
        this.zzb = zzagkVar.zzs(0, 1);
        zzagkVar.zzv();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0129  */
    @Override // com.google.android.gms.internal.ads.zzagh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzagi zzagiVar, zzahh zzahhVar) throws IOException {
        int zzC;
        int i;
        this.zzb.getClass();
        String str = zzfm.zza;
        int i2 = this.zzc;
        if (i2 == 0) {
            zzguk.zzi(zzagiVar.zzn() == 0);
            int i3 = this.zzf;
            if (i3 != -1) {
                zzagiVar.zzf(i3);
                this.zzc = 4;
            } else {
                if (!zzash.zza(zzagiVar)) {
                    throw zzat.zzb("Unsupported or unrecognized wav file type.", null);
                }
                zzagiVar.zzf((int) (zzagiVar.zzm() - zzagiVar.zzn()));
                this.zzc = 1;
            }
            return 0;
        }
        long j = -1;
        if (i2 == 1) {
            int i4 = zzash.zza;
            zzeu zzeuVar = new zzeu(8);
            zzasg zza = zzasg.zza(zzagiVar, zzeuVar);
            if (zza.zza != 1685272116) {
                zzagiVar.zzl();
            } else {
                zzagiVar.zzk(8);
                zzeuVar.zzh(0);
                zzagiVar.zzi(zzeuVar.zzi(), 0, 8);
                j = zzeuVar.zzE();
                zzagiVar.zzf(((int) zza.zzb) + 8);
            }
            this.zzd = j;
            this.zzc = 2;
            return 0;
        }
        if (i2 == 2) {
            zzasf zzb = zzash.zzb(zzagiVar);
            int i5 = zzb.zza;
            if (i5 == 17) {
                this.zze = new zzasa(this.zza, this.zzb, zzb);
            } else if (i5 == 6) {
                this.zze = new zzasc(this.zza, this.zzb, zzb, "audio/g711-alaw", -1);
            } else if (i5 == 7) {
                this.zze = new zzasc(this.zza, this.zzb, zzb, "audio/g711-mlaw", -1);
            } else {
                int i6 = zzb.zze;
                if (i5 != 1) {
                    if (i5 == 3) {
                        zzC = zzfm.zzD(i6, ByteOrder.LITTLE_ENDIAN);
                        i = zzC;
                        if (i == 0) {
                        }
                    } else if (i5 != 65534) {
                        i = 0;
                        if (i == 0) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 29);
                            sb.append("Unsupported WAV format type: ");
                            sb.append(i5);
                            throw zzat.zzc(sb.toString());
                        }
                        this.zze = new zzasc(this.zza, this.zzb, zzb, "audio/raw", i);
                    }
                }
                zzC = zzfm.zzC(i6, ByteOrder.LITTLE_ENDIAN);
                i = zzC;
                if (i == 0) {
                }
            }
            this.zzc = 3;
            return 0;
        }
        if (i2 != 3) {
            zzguk.zzi(this.zzg != -1);
            long zzn = this.zzg - zzagiVar.zzn();
            zzasb zzasbVar = this.zze;
            zzasbVar.getClass();
            return zzasbVar.zzc(zzagiVar, zzn) ? -1 : 0;
        }
        Pair zzc = zzash.zzc(zzagiVar);
        this.zzf = ((Long) zzc.first).intValue();
        long longValue = ((Long) zzc.second).longValue();
        long j2 = this.zzd;
        if (j2 != -1 && longValue == 4294967295L) {
            longValue = j2;
        }
        long j3 = this.zzf + longValue;
        this.zzg = j3;
        long zzo = zzagiVar.zzo();
        if (zzo != -1 && j3 > zzo) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j3).length() + 29 + String.valueOf(zzo).length());
            sb2.append("Data exceeds input length: ");
            sb2.append(j3);
            sb2.append(", ");
            sb2.append(zzo);
            zzeh.zzc("WavExtractor", sb2.toString());
            this.zzg = zzo;
            j3 = zzo;
        }
        zzasb zzasbVar2 = this.zze;
        zzasbVar2.getClass();
        zzasbVar2.zzb(this.zzf, j3);
        this.zzc = 4;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j, long j2) {
        this.zzc = j == 0 ? 0 : 4;
        zzasb zzasbVar = this.zze;
        if (zzasbVar != null) {
            zzasbVar.zza(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }
}
