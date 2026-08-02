package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
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

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a A[Catch: EOFException -> 0x0089, TryCatch #0 {EOFException -> 0x0089, blocks: (B:13:0x000b, B:15:0x001c, B:23:0x003a, B:25:0x0045, B:31:0x0040, B:41:0x005f, B:42:0x0077, B:43:0x0078, B:44:0x0088), top: B:12:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0040 A[Catch: EOFException -> 0x0089, TryCatch #0 {EOFException -> 0x0089, blocks: (B:13:0x000b, B:15:0x001c, B:23:0x003a, B:25:0x0045, B:31:0x0040, B:41:0x005f, B:42:0x0077, B:43:0x0078, B:44:0x0088), top: B:12:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zza(zzacw zzacwVar) {
        int i7;
        int i8 = this.zzj;
        if (i8 == 0) {
            try {
                zzacwVar.zzj();
                zzacwVar.zzh(this.zze, 0, 1);
                byte b7 = this.zze[0];
                if ((b7 & 131) > 0) {
                    throw zzaz.zza("Invalid padding bits for frame header " + ((int) b7), null);
                }
                int i9 = b7 >> 3;
                boolean z4 = this.zzg;
                int i10 = i9 & 15;
                if (z4) {
                    if (i10 >= 10) {
                        if (i10 > 13) {
                        }
                    }
                    i8 = !z4 ? zzb[i10] : zza[i10];
                    this.zzi = i8;
                    this.zzj = i8;
                    i7 = this.zzk;
                    if (i7 == -1) {
                        this.zzk = i8;
                        i7 = i8;
                    }
                    if (i7 == i8) {
                        this.zzl++;
                    }
                }
                if (!z4) {
                    if (i10 >= 12 && i10 <= 14) {
                    }
                    i8 = !z4 ? zzb[i10] : zza[i10];
                    this.zzi = i8;
                    this.zzj = i8;
                    i7 = this.zzk;
                    if (i7 == -1) {
                    }
                    if (i7 == i8) {
                    }
                }
                throw zzaz.zza("Illegal AMR " + (true != z4 ? "NB" : "WB") + " frame type " + i10, null);
            } catch (EOFException unused) {
                return -1;
            }
        }
        int zzf = this.zzp.zzf(zzacwVar, i8, true);
        if (zzf == -1) {
            return -1;
        }
        int i11 = this.zzj - zzf;
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
    public final int zzb(zzacw zzacwVar, zzadr zzadrVar) {
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
        int zza2 = zza(zzacwVar);
        if (this.zzq == null) {
            zzadt zzadtVar = new zzadt(-9223372036854775807L, 0L);
            this.zzq = zzadtVar;
            this.zzn.zzP(zzadtVar);
        }
        return zza2 == -1 ? -1 : 0;
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
        zzaeb zzw = zzacyVar.zzw(0, 1);
        this.zzo = zzw;
        this.zzp = zzw;
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
