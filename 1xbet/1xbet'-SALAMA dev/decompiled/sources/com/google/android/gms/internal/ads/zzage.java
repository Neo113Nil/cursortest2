package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class zzage {
    public static final zzagc zza = new Object() { // from class: com.google.android.gms.internal.ads.zzagc
    };

    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00df A[SYNTHETIC] */
    public static final zzav zza(byte[] bArr, int i7, zzagc zzagcVar, zzafq zzafqVar) {
        boolean z4;
        zzagd zzagdVar;
        int i8;
        int iZze;
        zzagf zzagfVarZzl;
        ArrayList arrayList = new ArrayList();
        zzed zzedVar = new zzed(bArr, i7);
        boolean z7 = false;
        if (zzedVar.zzb() < 10) {
            zzdq.zzf("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iZzo = zzedVar.zzo();
            if (iZzo == 4801587) {
                int iZzm = zzedVar.zzm();
                zzedVar.zzM(1);
                int iZzm2 = zzedVar.zzm();
                int iZzl = zzedVar.zzl();
                if (iZzm != 2) {
                    if (iZzm == 3) {
                        if ((iZzm2 & 64) != 0) {
                            int iZzg = zzedVar.zzg();
                            zzedVar.zzM(iZzg);
                            iZzl -= iZzg + 4;
                        }
                    } else if (iZzm == 4) {
                        if ((iZzm2 & 64) != 0) {
                            int iZzl2 = zzedVar.zzl();
                            zzedVar.zzM(iZzl2 - 4);
                            iZzl -= iZzl2;
                        }
                        if ((iZzm2 & 16) != 0) {
                            iZzl -= 10;
                        }
                    } else {
                        AbstractC0486a1.k(iZzm, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                    }
                    if (iZzm < 4) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    zzagdVar = new zzagd(iZzm, z4, iZzl);
                } else if ((iZzm2 & 64) != 0) {
                    zzdq.zzf("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iZzm < 4 || (iZzm2 & 128) == 0) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    zzagdVar = new zzagd(iZzm, z4, iZzl);
                }
                if (zzagdVar == null) {
                    return null;
                }
                int iZzd = zzedVar.zzd();
                i8 = zzagdVar.zza == 2 ? 6 : 10;
                iZze = zzagdVar.zzc;
                if (zzagdVar.zzb) {
                    iZze = zze(zzedVar, zzagdVar.zzc);
                }
                zzedVar.zzK(iZzd + iZze);
                if (!zzj(zzedVar, zzagdVar.zza, i8, false)) {
                    if (zzagdVar.zza == 4 || !zzj(zzedVar, 4, i8, true)) {
                        AbstractC0486a1.k(zzagdVar.zza, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                        return null;
                    }
                    z7 = true;
                }
                while (zzedVar.zzb() >= i8) {
                    zzagfVarZzl = zzl(zzagdVar.zza, zzedVar, z7, i8, zzagcVar);
                    if (zzagfVarZzl != null) {
                        arrayList.add(zzagfVarZzl);
                    }
                }
                return new zzav(arrayList);
            }
            zzdq.zzf("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iZzo))));
        }
        zzagdVar = null;
        if (zzagdVar == null) {
            return null;
        }
        int iZzd2 = zzedVar.zzd();
        if (zzagdVar.zza == 2) {
        }
        iZze = zzagdVar.zzc;
        if (zzagdVar.zzb) {
            iZze = zze(zzedVar, zzagdVar.zzc);
        }
        zzedVar.zzK(iZzd2 + iZze);
        if (!zzj(zzedVar, zzagdVar.zza, i8, false)) {
            if (zzagdVar.zza == 4) {
            }
            AbstractC0486a1.k(zzagdVar.zza, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
            return null;
        }
        while (zzedVar.zzb() >= i8) {
            zzagfVarZzl = zzl(zzagdVar.zza, zzedVar, z7, i8, zzagcVar);
            if (zzagfVarZzl != null) {
                arrayList.add(zzagfVarZzl);
            }
        }
        return new zzav(arrayList);
    }

    private static int zzb(int i7) {
        return (i7 == 0 || i7 == 3) ? 1 : 2;
    }

    private static int zzc(byte[] bArr, int i7, int i8) {
        int iZzd = zzd(bArr, i7);
        if (i8 == 0 || i8 == 3) {
            return iZzd;
        }
        while (true) {
            int length = bArr.length;
            if (iZzd >= length - 1) {
                return length;
            }
            int i9 = iZzd + 1;
            if ((iZzd - i7) % 2 == 0 && bArr[i9] == 0) {
                return iZzd;
            }
            iZzd = zzd(bArr, i9);
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
        byte[] bArrZzN = zzedVar.zzN();
        int iZzd = zzedVar.zzd();
        int i8 = iZzd;
        while (true) {
            int i9 = i8 + 1;
            if (i9 >= iZzd + i7) {
                return i7;
            }
            if ((bArrZzN[i8] & 255) == 255 && bArrZzN[i9] == 0) {
                System.arraycopy(bArrZzN, i8 + 2, bArrZzN, i9, (i7 - (i8 - iZzd)) - 2);
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
        int iZzc = zzc(bArr, i8, i7);
        while (i8 < iZzc) {
            zzfweVar.zzf(new String(bArr, i8, iZzc - i8, zzi(i7)));
            i8 = zzb(i7) + iZzc;
            iZzc = zzc(bArr, i8, i7);
        }
        zzfwh zzfwhVarZzi = zzfweVar.zzi();
        return zzfwhVarZzi.isEmpty() ? zzfwh.zzo("") : zzfwhVarZzi;
    }

    private static String zzg(byte[] bArr, int i7, int i8, Charset charset) {
        return (i8 <= i7 || i8 > bArr.length) ? "" : new String(bArr, i7, i8 - i7, charset);
    }

    private static String zzh(int i7, int i8, int i9, int i10, int i11) {
        return i7 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
    }

    private static Charset zzi(int i7) {
        if (i7 == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i7 != 2) {
            return i7 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0008, B:7:0x0015, B:20:0x0040, B:23:0x004b, B:25:0x006d, B:29:0x0073, B:41:0x008f, B:42:0x0091, B:45:0x0097, B:48:0x00a1, B:31:0x007d, B:35:0x0084, B:10:0x0025), top: B:54:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x007d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0008, B:7:0x0015, B:20:0x0040, B:23:0x004b, B:25:0x006d, B:29:0x0073, B:41:0x008f, B:42:0x0091, B:45:0x0097, B:48:0x00a1, B:31:0x007d, B:35:0x0084, B:10:0x0025), top: B:54:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0081  */
    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:41:0x008f A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0008, B:7:0x0015, B:20:0x0040, B:23:0x004b, B:25:0x006d, B:29:0x0073, B:41:0x008f, B:42:0x0091, B:45:0x0097, B:48:0x00a1, B:31:0x007d, B:35:0x0084, B:10:0x0025), top: B:54:0x0008 }] */
    private static boolean zzj(zzed zzedVar, int i7, int i8, boolean z4) {
        boolean z7;
        int iZzo;
        long jZzo;
        int iZzq;
        int i9;
        int iZzd = zzedVar.zzd();
        while (true) {
            try {
                z7 = true;
                z7 = true;
                int i10 = 1;
                int i11 = 1;
                if (zzedVar.zzb() >= i8) {
                    if (i7 >= 3) {
                        iZzo = zzedVar.zzg();
                        jZzo = zzedVar.zzu();
                        iZzq = zzedVar.zzq();
                    } else {
                        iZzo = zzedVar.zzo();
                        jZzo = zzedVar.zzo();
                        iZzq = 0;
                    }
                    if (iZzo != 0 || jZzo != 0 || iZzq != 0) {
                        if (i7 != 4 || z4) {
                            if (i7 == 4) {
                                if ((iZzq & 64) != 0) {
                                    i10 = 0;
                                }
                                int i12 = i10;
                                i11 = iZzq & 1;
                                i9 = i12;
                            } else if (i7 == 3) {
                                if ((iZzq & 32) != 0) {
                                    i9 = 1;
                                } else {
                                    i9 = 0;
                                }
                                if ((iZzq & 128) != 0) {
                                    i11 = 0;
                                }
                            } else {
                                i9 = 0;
                                i11 = 0;
                            }
                            if (i11 != 0) {
                                i9 += 4;
                            }
                            if (jZzo >= i9 && zzedVar.zzb() >= jZzo) {
                                zzedVar.zzM((int) jZzo);
                            }
                        } else if ((8421504 & jZzo) == 0) {
                            long j = ((jZzo >> 16) & 255) << 14;
                            jZzo = ((jZzo >> 24) << 21) | j | (jZzo & 255) | (((jZzo >> 8) & 255) << 7);
                            if (i7 == 4) {
                                if ((iZzq & 64) != 0) {
                                    i10 = 0;
                                }
                                int i13 = i10;
                                i11 = iZzq & 1;
                                i9 = i13;
                            } else if (i7 == 3) {
                                if ((iZzq & 32) != 0) {
                                    i9 = 1;
                                } else {
                                    i9 = 0;
                                }
                                if ((iZzq & 128) != 0) {
                                    i11 = 0;
                                }
                            } else {
                                i9 = 0;
                                i11 = 0;
                            }
                            if (i11 != 0) {
                                i9 += 4;
                            }
                            if (jZzo >= i9) {
                                zzedVar.zzM((int) jZzo);
                            }
                        }
                        z7 = false;
                        break;
                    }
                    break;
                }
                break;
            } catch (Throwable th) {
                zzedVar.zzL(iZzd);
                throw th;
            }
        }
        zzedVar.zzL(iZzd);
        return z7;
    }

    private static byte[] zzk(byte[] bArr, int i7, int i8) {
        return i8 <= i7 ? zzen.zzc : Arrays.copyOfRange(bArr, i7, i8);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 15311. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    private static com.google.android.gms.internal.ads.zzagf zzl(int r35, com.google.android.gms.internal.ads.zzed r36, boolean r37, int r38, com.google.android.gms.internal.ads.zzagc r39) {
        /*
            Method dump skipped, instruction units count: 1531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzage.zzl(int, com.google.android.gms.internal.ads.zzed, boolean, int, com.google.android.gms.internal.ads.zzagc):com.google.android.gms.internal.ads.zzagf");
    }
}
