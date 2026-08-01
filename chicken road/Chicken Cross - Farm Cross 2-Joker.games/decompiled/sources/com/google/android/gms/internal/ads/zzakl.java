package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.firebase.FirebaseError;
import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzakl {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzakv zzc = new zzakv();
    private zzakm zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzagi zzagiVar, int i) throws IOException {
        zzagiVar.zzc(this.zza, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (r0[i2] & 255);
        }
        return j;
    }

    public final void zza(zzakm zzakmVar) {
        this.zzd = zzakmVar;
    }

    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zza();
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0090, code lost:
    
        if (r1 == 1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzc(zzagi zzagiVar) throws IOException {
        String str;
        int zzd;
        int zze;
        this.zzd.getClass();
        while (true) {
            ArrayDeque arrayDeque = this.zzb;
            zzakk zzakkVar = (zzakk) arrayDeque.peek();
            if (zzakkVar != null && zzagiVar.zzn() >= zzakkVar.zzb()) {
                ((zzako) this.zzd).zza.zzi(((zzakk) arrayDeque.pop()).zza());
                return true;
            }
            int i = this.zze;
            if (i == 0) {
                long zzb = this.zzc.zzb(zzagiVar, true, false, 4);
                if (zzb == -2) {
                    zzagiVar.zzl();
                    while (true) {
                        byte[] bArr = this.zza;
                        zzagiVar.zzi(bArr, 0, 4);
                        zzd = zzakv.zzd(bArr[0]);
                        if (zzd != -1 && zzd <= 4) {
                            zze = (int) zzakv.zze(bArr, zzd, false);
                            zzakt zzaktVar = ((zzako) this.zzd).zza;
                            if (zze != 357149030 && zze != 272869232 && zze != 524531317 && zze != 475249515) {
                                if (zze == 374648427) {
                                    zze = 374648427;
                                }
                            }
                        }
                        zzagiVar.zzf(1);
                    }
                    zzagiVar.zzf(zzd);
                    zzb = zze;
                }
                if (zzb == -1) {
                    return false;
                }
                this.zzf = (int) zzb;
                this.zze = 1;
            }
            this.zzg = this.zzc.zzb(zzagiVar, false, true, 8);
            this.zze = 2;
            zzakm zzakmVar = this.zzd;
            int i2 = this.zzf;
            zzakt zzaktVar2 = ((zzako) zzakmVar).zza;
            switch (i2) {
                case 128:
                case 143:
                case 160:
                case 166:
                case 174:
                case 182:
                case 183:
                case 187:
                case 224:
                case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
                case 16868:
                case 17849:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 272869232:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    long zzn = zzagiVar.zzn();
                    arrayDeque.push(new zzakk(i2, this.zzg + zzn, null));
                    ((zzako) this.zzd).zza.zzh(this.zzf, zzn, this.zzg);
                    this.zze = 0;
                    return true;
                case MRAID_JS_WRITE_FAILED_VALUE:
                case 136:
                case TPAT_RETRY_FAILED_VALUE:
                case 145:
                case 146:
                case 152:
                case ModuleDescriptor.MODULE_VERSION /* 155 */:
                case 159:
                case 176:
                case 179:
                case 186:
                case AD_RESPONSE_EMPTY_VALUE:
                case 231:
                case 238:
                case 240:
                case 241:
                case 247:
                case 251:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21938:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 29636:
                case 29637:
                case 30114:
                case 30321:
                case 2352003:
                case 2807729:
                    long j = this.zzg;
                    if (j <= 8) {
                        zzaktVar2.zzj(i2, zzd(zzagiVar, (int) j));
                        this.zze = 0;
                        return true;
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 22);
                    sb.append("Invalid integer size: ");
                    sb.append(j);
                    throw zzat.zzb(sb.toString(), null);
                case OMSDK_JS_WRITE_FAILED_VALUE:
                case 134:
                case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
                case 17276:
                case 21358:
                case 2274716:
                    long j2 = this.zzg;
                    if (j2 > 2147483647L) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(j2).length() + 21);
                        sb2.append("String element size: ");
                        sb2.append(j2);
                        throw zzat.zzb(sb2.toString(), null);
                    }
                    int i3 = (int) j2;
                    if (i3 == 0) {
                        str = "";
                    } else {
                        byte[] bArr2 = new byte[i3];
                        zzagiVar.zzc(bArr2, 0, i3);
                        while (i3 > 0) {
                            int i4 = i3 - 1;
                            if (bArr2[i4] == 0) {
                                i3 = i4;
                            } else {
                                str = new String(bArr2, 0, i3);
                            }
                        }
                        str = new String(bArr2, 0, i3);
                    }
                    zzaktVar2.zzl(i2, str);
                    this.zze = 0;
                    return true;
                case 161:
                case 163:
                case 165:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    zzaktVar2.zzm(i2, (int) this.zzg, zzagiVar);
                    this.zze = 0;
                    return true;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    long j3 = this.zzg;
                    if (j3 != 4 && j3 != 8) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(j3).length() + 20);
                        sb3.append("Invalid float size: ");
                        sb3.append(j3);
                        throw zzat.zzb(sb3.toString(), null);
                    }
                    int i5 = (int) j3;
                    zzaktVar2.zzk(i2, i5 == 4 ? Float.intBitsToFloat((int) r6) : Double.longBitsToDouble(zzd(zzagiVar, i5)));
                    this.zze = 0;
                    return true;
                default:
                    zzagiVar.zzf((int) this.zzg);
                    this.zze = 0;
            }
        }
    }
}
