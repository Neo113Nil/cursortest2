package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class zzep implements zzau {
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public zzep(String str, byte[] bArr, int i7, int i8) {
        char c3;
        byte b7;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals("com.android.capture.fps")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case -269399509:
                if (str.equals("auxiliary.tracks.interleaved")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 1011693540:
                if (str.equals("auxiliary.tracks.length")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case 1098277265:
                if (str.equals("auxiliary.tracks.offset")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 2002123038:
                if (str.equals("auxiliary.tracks.map")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        if (c3 == 0) {
            if (i8 == 23) {
                if (bArr.length == 4) {
                    i8 = 23;
                    zzcv.zzd(r4);
                } else {
                    i8 = 23;
                }
            }
            r4 = false;
            zzcv.zzd(r4);
        } else if (c3 == 1 || c3 == 2) {
            if (i8 == 78) {
                if (bArr.length == 8) {
                    i8 = 78;
                    zzcv.zzd(r4);
                } else {
                    i8 = 78;
                }
            }
            r4 = false;
            zzcv.zzd(r4);
        } else if (c3 == 3) {
            zzcv.zzd(i8 == 0);
        } else if (c3 == 4) {
            if (i8 == 75) {
                if (bArr.length == 1 && ((b7 = bArr[0]) == 0 || b7 == 1)) {
                    i8 = 75;
                    zzcv.zzd(r4);
                } else {
                    i8 = 75;
                }
            }
            r4 = false;
            zzcv.zzd(r4);
        }
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i7;
        this.zzd = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzep.class == obj.getClass()) {
            zzep zzepVar = (zzep) obj;
            if (this.zza.equals(zzepVar.zza) && Arrays.equals(this.zzb, zzepVar.zzb) && this.zzc == zzepVar.zzc && this.zzd == zzepVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() + 527;
        return ((((Arrays.hashCode(this.zzb) + (hashCode * 31)) * 31) + this.zzc) * 31) + this.zzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0087 A[LOOP:0: B:17:0x0084->B:19:0x0087, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String sb;
        byte[] bArr;
        int i7 = this.zzd;
        if (i7 == 0) {
            if (this.zza.equals("auxiliary.tracks.map")) {
                List zzb = zzb();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("track types = ");
                zzfsz.zzb(sb2, zzb, ",");
                sb = sb2.toString();
            }
            bArr = this.zzb;
            int i8 = zzen.zza;
            int length = bArr.length;
            StringBuilder sb3 = new StringBuilder(length + length);
            while (r2 < bArr.length) {
            }
            sb = sb3.toString();
        } else if (i7 == 1) {
            sb = zzen.zzB(this.zzb);
        } else if (i7 == 23) {
            sb = String.valueOf(Float.intBitsToFloat(zzfzk.zzd(this.zzb)));
        } else if (i7 == 67) {
            sb = String.valueOf(zzfzk.zzd(this.zzb));
        } else if (i7 != 75) {
            if (i7 == 78) {
                sb = String.valueOf(new zzed(this.zzb).zzw());
            }
            bArr = this.zzb;
            int i82 = zzen.zza;
            int length2 = bArr.length;
            StringBuilder sb32 = new StringBuilder(length2 + length2);
            for (int i9 = 0; i9 < bArr.length; i9++) {
                sb32.append(Character.forDigit((bArr[i9] >> 4) & 15, 16));
                sb32.append(Character.forDigit(bArr[i9] & 15, 16));
            }
            sb = sb32.toString();
        } else {
            sb = String.valueOf(this.zzb[0] & 255);
        }
        return AbstractC1663a.f("mdta: key=", this.zza, ", value=", sb);
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final /* synthetic */ void zza(zzar zzarVar) {
    }

    public final List zzb() {
        zzcv.zzg(this.zza.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte b7 = this.zzb[1];
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < b7; i7++) {
            arrayList.add(Integer.valueOf(this.zzb[i7 + 2]));
        }
        return arrayList;
    }
}
