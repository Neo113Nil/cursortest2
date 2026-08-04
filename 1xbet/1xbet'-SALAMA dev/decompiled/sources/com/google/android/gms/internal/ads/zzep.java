package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzep implements zzau {
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    public zzep(String str, byte[] bArr, int i7, int i8) {
        byte b7;
        byte b8;
        boolean z4 = true;
        switch (str) {
            case "com.android.capture.fps":
                b7 = 0;
                break;
            case "auxiliary.tracks.interleaved":
                b7 = 4;
                break;
            case "auxiliary.tracks.length":
                b7 = 2;
                break;
            case "auxiliary.tracks.offset":
                b7 = 1;
                break;
            case "auxiliary.tracks.map":
                b7 = 3;
                break;
            default:
                b7 = -1;
                break;
        }
        if (b7 == 0) {
            if (i8 != 23) {
                z4 = false;
            } else if (bArr.length == 4) {
                i8 = 23;
            } else {
                i8 = 23;
                z4 = false;
            }
            zzcv.zzd(z4);
        } else if (b7 == 1 || b7 == 2) {
            if (i8 != 78) {
                z4 = false;
            } else if (bArr.length == 8) {
                i8 = 78;
            } else {
                i8 = 78;
                z4 = false;
            }
            zzcv.zzd(z4);
        } else if (b7 == 3) {
            zzcv.zzd(i8 == 0);
        } else if (b7 == 4) {
            if (i8 != 75) {
                z4 = false;
            } else if (bArr.length == 1 && ((b8 = bArr[0]) == 0 || b8 == 1)) {
                i8 = 75;
            } else {
                i8 = 75;
                z4 = false;
            }
            zzcv.zzd(z4);
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
        int iHashCode = this.zza.hashCode() + 527;
        return ((((Arrays.hashCode(this.zzb) + (iHashCode * 31)) * 31) + this.zzc) * 31) + this.zzd;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0079  */
    /* JADX WARN: Code duplicated, block: B:25:0x0087 A[LOOP:0: B:23:0x0084->B:25:0x0087, LOOP_END] */
    public final String toString() {
        String string;
        byte[] bArr;
        StringBuilder sb;
        int i7 = this.zzd;
        if (i7 != 0) {
            if (i7 == 1) {
                string = zzen.zzB(this.zzb);
            } else if (i7 == 23) {
                string = String.valueOf(Float.intBitsToFloat(zzfzk.zzd(this.zzb)));
            } else if (i7 == 67) {
                string = String.valueOf(zzfzk.zzd(this.zzb));
            } else if (i7 == 75) {
                string = String.valueOf(this.zzb[0] & 255);
            } else if (i7 != 78) {
                bArr = this.zzb;
                int i8 = zzen.zza;
                int length = bArr.length;
                sb = new StringBuilder(length + length);
                for (int i9 = 0; i9 < bArr.length; i9++) {
                    sb.append(Character.forDigit((bArr[i9] >> 4) & 15, 16));
                    sb.append(Character.forDigit(bArr[i9] & 15, 16));
                }
                string = sb.toString();
            } else {
                string = String.valueOf(new zzed(this.zzb).zzw());
            }
        } else if (this.zza.equals("auxiliary.tracks.map")) {
            List listZzb = zzb();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("track types = ");
            zzfsz.zzb(sb2, listZzb, ",");
            string = sb2.toString();
        } else {
            bArr = this.zzb;
            int i10 = zzen.zza;
            int length2 = bArr.length;
            sb = new StringBuilder(length2 + length2);
            while (i9 < bArr.length) {
                sb.append(Character.forDigit((bArr[i9] >> 4) & 15, 16));
                sb.append(Character.forDigit(bArr[i9] & 15, 16));
            }
            string = sb.toString();
        }
        return p150v0.a.f("mdta: key=", this.zza, ", value=", string);
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
