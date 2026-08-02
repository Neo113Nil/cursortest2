package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzage {
    public static final zzagc zza = new Object() { // from class: com.google.android.gms.internal.ads.zzagc
    };

    /* JADX WARN: Removed duplicated region for block: B:6:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final zzav zza(byte[] bArr, int i7, zzagc zzagcVar, zzafq zzafqVar) {
        zzagd zzagdVar;
        int i8;
        int i9;
        boolean z4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ArrayList arrayList = new ArrayList();
        zzed zzedVar = new zzed(bArr, i7);
        boolean z7 = false;
        if (zzedVar.zzb() < 10) {
            zzdq.zzf("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int zzo = zzedVar.zzo();
            if (zzo == 4801587) {
                int zzm = zzedVar.zzm();
                zzedVar.zzM(1);
                int zzm2 = zzedVar.zzm();
                int zzl = zzedVar.zzl();
                if (zzm == 2) {
                    if ((zzm2 & 64) != 0) {
                        zzdq.zzf("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    zzagdVar = new zzagd(zzm, zzm >= 4 && (zzm2 & 128) != 0, zzl);
                } else {
                    if (zzm == 3) {
                        if ((zzm2 & 64) != 0) {
                            int zzg = zzedVar.zzg();
                            zzedVar.zzM(zzg);
                            zzl -= zzg + 4;
                        }
                    } else if (zzm == 4) {
                        if ((zzm2 & 64) != 0) {
                            int zzl2 = zzedVar.zzl();
                            zzedVar.zzM(zzl2 - 4);
                            zzl -= zzl2;
                        }
                        if ((zzm2 & 16) != 0) {
                            zzl -= 10;
                        }
                    } else {
                        AbstractC0486a1.k(zzm, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                    }
                    zzagdVar = new zzagd(zzm, zzm >= 4 && (zzm2 & 128) != 0, zzl);
                }
                if (zzagdVar != null) {
                    return null;
                }
                int zzd = zzedVar.zzd();
                i8 = zzagdVar.zza;
                int i15 = i8 == 2 ? 6 : 10;
                i9 = zzagdVar.zzc;
                z4 = zzagdVar.zzb;
                if (z4) {
                    i14 = zzagdVar.zzc;
                    i9 = zze(zzedVar, i14);
                }
                zzedVar.zzK(zzd + i9);
                i10 = zzagdVar.zza;
                if (!zzj(zzedVar, i10, i15, false)) {
                    i12 = zzagdVar.zza;
                    if (i12 != 4 || !zzj(zzedVar, 4, i15, true)) {
                        i13 = zzagdVar.zza;
                        AbstractC0486a1.k(i13, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                        return null;
                    }
                    z7 = true;
                }
                while (zzedVar.zzb() >= i15) {
                    i11 = zzagdVar.zza;
                    zzagf zzl3 = zzl(i11, zzedVar, z7, i15, zzagcVar);
                    if (zzl3 != null) {
                        arrayList.add(zzl3);
                    }
                }
                return new zzav(arrayList);
            }
            zzdq.zzf("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(zzo))));
        }
        zzagdVar = null;
        if (zzagdVar != null) {
        }
    }

    private static int zzb(int i7) {
        return (i7 == 0 || i7 == 3) ? 1 : 2;
    }

    private static int zzc(byte[] bArr, int i7, int i8) {
        int zzd = zzd(bArr, i7);
        if (i8 == 0 || i8 == 3) {
            return zzd;
        }
        while (true) {
            int length = bArr.length;
            if (zzd >= length - 1) {
                return length;
            }
            int i9 = zzd + 1;
            if ((zzd - i7) % 2 == 0 && bArr[i9] == 0) {
                return zzd;
            }
            zzd = zzd(bArr, i9);
        }
    }

    private static int zzd(byte[] bArr, int i7) {
        while (true) {
            int length = bArr.length;
            if (i7 >= length) {
                return length;
            }
            if (bArr[i7] == 0) {
                return i7;
            }
            i7++;
        }
    }

    private static int zze(zzed zzedVar, int i7) {
        byte[] zzN = zzedVar.zzN();
        int zzd = zzedVar.zzd();
        int i8 = zzd;
        while (true) {
            int i9 = i8 + 1;
            if (i9 >= zzd + i7) {
                return i7;
            }
            if ((zzN[i8] & 255) == 255 && zzN[i9] == 0) {
                System.arraycopy(zzN, i8 + 2, zzN, i9, (i7 - (i8 - zzd)) - 2);
                i7--;
            }
            i8 = i9;
        }
    }

    private static zzfwh zzf(byte[] bArr, int i7, int i8) {
        if (i8 >= bArr.length) {
            return zzfwh.zzo("");
        }
        int i9 = zzfwh.zzd;
        zzfwe zzfweVar = new zzfwe();
        int zzc = zzc(bArr, i8, i7);
        while (i8 < zzc) {
            zzfweVar.zzf(new String(bArr, i8, zzc - i8, zzi(i7)));
            i8 = zzb(i7) + zzc;
            zzc = zzc(bArr, i8, i7);
        }
        zzfwh zzi = zzfweVar.zzi();
        return zzi.isEmpty() ? zzfwh.zzo("") : zzi;
    }

    private static String zzg(byte[] bArr, int i7, int i8, Charset charset) {
        return (i8 <= i7 || i8 > bArr.length) ? "" : new String(bArr, i7, i8 - i7, charset);
    }

    private static String zzh(int i7, int i8, int i9, int i10, int i11) {
        return i7 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
    }

    private static Charset zzi(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean zzj(zzed zzedVar, int i7, int i8, boolean z4) {
        boolean z7;
        int zzo;
        long zzo2;
        int i9;
        int i10;
        int zzd = zzedVar.zzd();
        while (true) {
            try {
                z7 = true;
                z7 = true;
                int i11 = 1;
                int i12 = 1;
                if (zzedVar.zzb() < i8) {
                    break;
                }
                if (i7 >= 3) {
                    zzo = zzedVar.zzg();
                    zzo2 = zzedVar.zzu();
                    i9 = zzedVar.zzq();
                } else {
                    zzo = zzedVar.zzo();
                    zzo2 = zzedVar.zzo();
                    i9 = 0;
                }
                if (zzo != 0 || zzo2 != 0 || i9 != 0) {
                    if (i7 == 4 && !z4) {
                        if ((8421504 & zzo2) != 0) {
                            break;
                        }
                        zzo2 = ((zzo2 >> 24) << 21) | (((zzo2 >> 16) & 255) << 14) | (zzo2 & 255) | (((zzo2 >> 8) & 255) << 7);
                    }
                    if (i7 == 4) {
                        if ((i9 & 64) == 0) {
                            i11 = 0;
                        }
                        int i13 = i11;
                        i12 = i9 & 1;
                        i10 = i13;
                    } else if (i7 == 3) {
                        i10 = (i9 & 32) != 0 ? 1 : 0;
                        if ((i9 & 128) == 0) {
                            i12 = 0;
                        }
                    } else {
                        i10 = 0;
                        i12 = 0;
                    }
                    if (i12 != 0) {
                        i10 += 4;
                    }
                    if (zzo2 >= i10 && zzedVar.zzb() >= zzo2) {
                        zzedVar.zzM((int) zzo2);
                    }
                }
            } finally {
                zzedVar.zzL(zzd);
            }
        }
        return z7;
    }

    private static byte[] zzk(byte[] bArr, int i7, int i8) {
        return i8 <= i7 ? zzen.zzc : Arrays.copyOfRange(bArr, i7, i8);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private static com.google.android.gms.internal.ads.zzagf zzl(int r35, com.google.android.gms.internal.ads.zzed r36, boolean r37, int r38, com.google.android.gms.internal.ads.zzagc r39) {
        /*
            Method dump skipped, instructions count: 1531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzage.zzl(int, com.google.android.gms.internal.ads.zzed, boolean, int, com.google.android.gms.internal.ads.zzagc):com.google.android.gms.internal.ads.zzagf");
    }
}
