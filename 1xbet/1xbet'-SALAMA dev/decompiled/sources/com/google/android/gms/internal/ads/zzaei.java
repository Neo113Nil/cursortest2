package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzaei implements zzacv {
    private static final int[] zza = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] zzb = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] zzc;
    private static final byte[] zzd;
    private final byte[] zze;
    private final zzaeb zzf;
    private boolean zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private zzacy zzn;
    private zzaeb zzo;
    private zzaeb zzp;
    private zzadu zzq;
    private long zzr;
    private boolean zzs;

    static {
        int i7 = zzen.zza;
        Charset charset = StandardCharsets.UTF_8;
        zzc = "#!AMR\n".getBytes(charset);
        zzd = "#!AMR-WB\n".getBytes(charset);
    }

    public zzaei() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    private final int zza(zzacw zzacwVar) throws zzaz {
        int i7 = this.zzj;
        if (i7 == 0) {
            try {
                zzacwVar.zzj();
                zzacwVar.zzh(this.zze, 0, 1);
                byte b7 = this.zze[0];
                if ((b7 & 131) > 0) {
                    throw zzaz.zza("Invalid padding bits for frame header " + ((int) b7), null);
                }
                int i8 = b7 >> 3;
                boolean z4 = this.zzg;
                int i9 = i8 & 15;
                if (!z4) {
                    if (!z4) {
                        if (i9 >= 12 && i9 <= 14) {
                        }
                    }
                    throw zzaz.zza("Illegal AMR " + (true != z4 ? "NB" : "WB") + " frame type " + i9, null);
                }
                if (i9 >= 10 && i9 <= 13) {
                    if (!z4) {
                        if (i9 >= 12) {
                        }
                    }
                    if (true != z4) {
                    }
                    throw zzaz.zza("Illegal AMR " + (true != z4 ? "NB" : "WB") + " frame type " + i9, null);
                }
                i7 = z4 ? zzb[i9] : zza[i9];
                this.zzi = i7;
                this.zzj = i7;
                int i10 = this.zzk;
                if (i10 == -1) {
                    this.zzk = i7;
                    i10 = i7;
                }
                if (i10 == i7) {
                    this.zzl++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iZzf = this.zzp.zzf(zzacwVar, i7, true);
        if (iZzf == -1) {
            return -1;
        }
        int i11 = this.zzj - iZzf;
        this.zzj = i11;
        if (i11 > 0) {
            return 0;
        }
        this.zzp.zzt(this.zzh, 1, this.zzi, 0, null);
        this.zzh += 20000;
        return 0;
    }

    private static boolean zzg(zzacw zzacwVar, byte[] bArr) {
        zzacwVar.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        zzacwVar.zzh(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean zzh(zzacw zzacwVar) {
        byte[] bArr = zzc;
        if (zzg(zzacwVar, bArr)) {
            this.zzg = false;
            zzacwVar.zzk(bArr.length);
            return true;
        }
        byte[] bArr2 = zzd;
        if (!zzg(zzacwVar, bArr2)) {
            return false;
        }
        this.zzg = true;
        zzacwVar.zzk(bArr2.length);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final int zzb(zzacw zzacwVar, zzadr zzadrVar) throws zzaz {
        zzcv.zzb(this.zzo);
        int i7 = zzen.zza;
        if (zzacwVar.zzf() == 0 && !zzh(zzacwVar)) {
            throw zzaz.zza("Could not find AMR header.", null);
        }
        if (!this.zzs) {
            this.zzs = true;
            boolean z4 = this.zzg;
            String str = true != z4 ? "audio/amr" : "audio/amr-wb";
            String str2 = true != z4 ? "audio/3gpp" : "audio/amr-wb";
            int i8 = true != z4 ? 8000 : 16000;
            int i9 = z4 ? zzb[8] : zza[7];
            zzaeb zzaebVar = this.zzo;
            zzx zzxVar = new zzx();
            zzxVar.zzE(str);
            zzxVar.zzad(str2);
            zzxVar.zzT(i9);
            zzxVar.zzB(1);
            zzxVar.zzae(i8);
            zzaebVar.zzm(zzxVar.zzaj());
        }
        int iZza = zza(zzacwVar);
        if (this.zzq == null) {
            zzadt zzadtVar = new zzadt(-9223372036854775807L, 0L);
            this.zzq = zzadtVar;
            this.zzn.zzP(zzadtVar);
        }
        return iZza == -1 ? -1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final /* synthetic */ zzacv zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final /* synthetic */ List zzd() {
        return zzfwh.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zze(zzacy zzacyVar) {
        this.zzn = zzacyVar;
        zzaeb zzaebVarZzw = zzacyVar.zzw(0, 1);
        this.zzo = zzaebVarZzw;
        this.zzp = zzaebVarZzw;
        zzacyVar.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzf(long j, long j3) {
        this.zzh = 0L;
        this.zzi = 0;
        this.zzj = 0;
        this.zzr = j3;
        this.zzm = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final boolean zzi(zzacw zzacwVar) {
        return zzh(zzacwVar);
    }

    public zzaei(int i7) {
        this.zze = new byte[1];
        this.zzk = -1;
        zzacq zzacqVar = new zzacq();
        this.zzf = zzacqVar;
        this.zzp = zzacqVar;
    }
}
