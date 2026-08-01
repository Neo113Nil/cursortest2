package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.common.base.Ascii;
import com.moloco.sdk.BidRequest;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzasa implements zzasb {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, BidRequest.SdkBidRequest.Imp.Native.NativeRequest.EventTrackers.EventType.CUSTOM_ACTION_07_VALUE, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 130, 143, 157, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, FacebookRequestErrorClassification.EC_INVALID_TOKEN, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzagk zzc;
    private final zzaht zzd;
    private final zzasf zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzeu zzh;
    private final int zzi;
    private final zzv zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzasa(zzagk zzagkVar, zzaht zzahtVar, zzasf zzasfVar) throws zzat {
        this.zzc = zzagkVar;
        this.zzd = zzahtVar;
        this.zze = zzasfVar;
        int max = Math.max(1, zzasfVar.zzc / 10);
        this.zzi = max;
        zzeu zzeuVar = new zzeu(zzasfVar.zzf);
        zzeuVar.zzu();
        int zzu = zzeuVar.zzu();
        this.zzf = zzu;
        int i = zzasfVar.zzb;
        int i2 = (((zzasfVar.zzd - (i * 4)) * 8) / (zzasfVar.zze * i)) + 1;
        if (zzu != i2) {
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 34 + String.valueOf(zzu).length());
            sb.append("Expected frames per block: ");
            sb.append(i2);
            sb.append("; got: ");
            sb.append(zzu);
            throw zzat.zzb(sb.toString(), null);
        }
        String str = zzfm.zza;
        int i3 = ((max + zzu) - 1) / zzu;
        this.zzg = new byte[zzasfVar.zzd * i3];
        this.zzh = new zzeu(i3 * (zzu + zzu) * i);
        int i4 = ((zzasfVar.zzc * zzasfVar.zzd) * 8) / zzu;
        zzt zztVar = new zzt();
        zztVar.zzo("audio/raw");
        zztVar.zzi(i4);
        zztVar.zzj(i4);
        zztVar.zzp((max + max) * i);
        zztVar.zzH(zzasfVar.zzb);
        zztVar.zzI(zzft.zzb(zzasfVar.zzg));
        zztVar.zzJ(zzasfVar.zzc);
        zztVar.zzK(2);
        this.zzj = zztVar.zzQ();
    }

    private final void zzd(int i) {
        long zzw = this.zzl + zzfm.zzw(this.zzn, 1000000L, this.zze.zzc, RoundingMode.DOWN);
        int zzf = zzf(i);
        this.zzd.zze(zzw, 1, zzf, this.zzm - zzf, null);
        this.zzn += i;
        this.zzm -= zzf;
    }

    private final int zze(int i) {
        int i2 = this.zze.zzb;
        return i / (i2 + i2);
    }

    private final int zzf(int i) {
        return (i + i) * this.zze.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzasb
    public final void zza(long j) {
        this.zzk = 0;
        this.zzl = j;
        this.zzm = 0;
        this.zzn = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzasb
    public final void zzb(int i, long j) {
        zzasi zzasiVar = new zzasi(this.zze, this.zzf, i, j);
        this.zzc.zzw(zzasiVar);
        zzaht zzahtVar = this.zzd;
        zzahtVar.zzA(this.zzj);
        zzahtVar.zzP(zzasiVar.zza());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003c -> B:3:0x0021). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzasb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzc(zzagi zzagiVar, long j) throws IOException {
        boolean z;
        int i;
        boolean z2;
        int zze;
        int zze2 = zze(this.zzm);
        int i2 = this.zzi;
        String str = zzfm.zza;
        int i3 = this.zzf;
        zzasf zzasfVar = this.zze;
        int i4 = zzasfVar.zzd;
        int i5 = ((((i2 - zze2) + i3) - 1) / i3) * i4;
        if (j != 0) {
            z = false;
            while (!z) {
                if (this.zzk >= i5) {
                    break;
                }
                int zza2 = zzagiVar.zza(this.zzg, this.zzk, (int) Math.min(i5 - r12, j));
                if (zza2 != -1) {
                    this.zzk += zza2;
                }
            }
            i = this.zzk / i4;
            if (i <= 0) {
                byte[] bArr = this.zzg;
                zzeu zzeuVar = this.zzh;
                for (int i6 = 0; i6 < i; i6++) {
                    int i7 = 0;
                    while (true) {
                        int i8 = zzasfVar.zzb;
                        if (i7 < i8) {
                            byte[] zzi = zzeuVar.zzi();
                            int i9 = (i4 / i8) - 4;
                            int i10 = (i6 * i4) + (i7 * 4);
                            int i11 = bArr[i10 + 1] & 255;
                            int i12 = bArr[i10] & 255;
                            zzasf zzasfVar2 = zzasfVar;
                            boolean z3 = z;
                            int min = Math.min(bArr[i10 + 2] & 255, 88);
                            int[] iArr = zzb;
                            int i13 = iArr[min];
                            int i14 = (i6 * i3 * i8) + i7;
                            int i15 = (short) ((i11 << 8) | i12);
                            int i16 = i14 + i14;
                            zzi[i16] = (byte) (i15 & 255);
                            zzi[i16 + 1] = (byte) (i15 >> 8);
                            int i17 = 0;
                            while (i17 < i9 + i9) {
                                byte b = bArr[(i8 * 4) + i10 + ((i17 / 8) * i8 * 4) + ((i17 / 2) % 4)];
                                byte[] bArr2 = bArr;
                                int i18 = i17 % 2 == 0 ? b & Ascii.SI : (b & 255) >> 4;
                                int i19 = i18 & 7;
                                int i20 = (((i19 + i19) + 1) * i13) >> 3;
                                if ((i18 & 8) != 0) {
                                    i20 = -i20;
                                }
                                i15 = Math.max(-32768, Math.min(i15 + i20, 32767));
                                i16 += i8 + i8;
                                zzi[i16] = (byte) (i15 & 255);
                                zzi[i16 + 1] = (byte) (i15 >> 8);
                                min = Math.max(0, Math.min(min + zza[i18], 88));
                                i17++;
                                i8 = i8;
                                bArr = bArr2;
                                i13 = iArr[min];
                            }
                            i7++;
                            z = z3;
                            zzasfVar = zzasfVar2;
                        }
                    }
                }
                z2 = z;
                int zzf = zzf(i3 * i);
                zzeuVar.zzh(0);
                zzeuVar.zzf(zzf);
                this.zzk -= i * i4;
                int zze3 = zzeuVar.zze();
                this.zzd.zzc(zzeuVar, zze3);
                int i21 = this.zzm + zze3;
                this.zzm = i21;
                if (zze(i21) >= i2) {
                    zzd(i2);
                }
            } else {
                z2 = z;
            }
            if (z2 && (zze = zze(this.zzm)) > 0) {
                zzd(zze);
            }
            return z2;
        }
        z = true;
        while (!z) {
        }
        i = this.zzk / i4;
        if (i <= 0) {
        }
        if (z2) {
            zzd(zze);
        }
        return z2;
    }
}
