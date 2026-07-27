package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
final class zzidx {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static int zza(byte[] bArr, int i, zzidw zzidwVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzb(b, bArr, i2, zzidwVar);
        }
        zzidwVar.zza = b;
        return i2;
    }

    static int zzb(int i, byte[] bArr, int i2, zzidw zzidwVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            zzidwVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzidwVar.zza = i5 | (b2 << Ascii.SO);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzidwVar.zza = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzidwVar.zza = i9 | (b4 << Ascii.FS);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzidwVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zzc(byte[] bArr, int i, zzidw zzidwVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzidwVar.zzb = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        zzidwVar.zzb = j2;
        return i3;
    }

    static int zzd(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static long zze(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    static int zzf(byte[] bArr, int i, zzidw zzidwVar) throws zzige {
        int zza2 = zza(bArr, i, zzidwVar);
        int i2 = zzidwVar.zza;
        if (i2 < 0) {
            throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            zzidwVar.zzc = "";
            return zza2;
        }
        zzidwVar.zzc = zziim.zzd(bArr, zza2, i2);
        return zza2 + i2;
    }

    static int zzg(byte[] bArr, int i, zzidw zzidwVar) throws zzige {
        int zza2 = zza(bArr, i, zzidwVar);
        int i2 = zzidwVar.zza;
        if (i2 < 0) {
            throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - zza2) {
            throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            zzidwVar.zzc = zziei.zza;
            return zza2;
        }
        zzidwVar.zzc = zziei.zzt(bArr, zza2, i2);
        return zza2 + i2;
    }

    static int zzh(zziho zzihoVar, byte[] bArr, int i, int i2, zzidw zzidwVar) throws IOException {
        Object zza2 = zzihoVar.zza();
        int zzj = zzj(zza2, zzihoVar, bArr, i, i2, zzidwVar);
        zzihoVar.zzk(zza2);
        zzidwVar.zzc = zza2;
        return zzj;
    }

    static int zzi(zziho zzihoVar, byte[] bArr, int i, int i2, int i3, zzidw zzidwVar) throws IOException {
        Object zza2 = zzihoVar.zza();
        int zzk = zzk(zza2, zzihoVar, bArr, i, i2, i3, zzidwVar);
        zzihoVar.zzk(zza2);
        zzidwVar.zzc = zza2;
        return zzk;
    }

    static int zzj(Object obj, zziho zzihoVar, byte[] bArr, int i, int i2, zzidw zzidwVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzb(i4, bArr, i3, zzidwVar);
            i4 = zzidwVar.zza;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = zzidwVar.zze + 1;
        zzidwVar.zze = i6;
        zzq(i6);
        int i7 = i4 + i5;
        zzihoVar.zzj(obj, bArr, i5, i7, zzidwVar);
        zzidwVar.zze--;
        zzidwVar.zzc = obj;
        return i7;
    }

    static int zzk(Object obj, zziho zzihoVar, byte[] bArr, int i, int i2, int i3, zzidw zzidwVar) throws IOException {
        zzigz zzigzVar = (zzigz) zzihoVar;
        int i4 = zzidwVar.zze + 1;
        zzidwVar.zze = i4;
        zzq(i4);
        int zzi = zzigzVar.zzi(obj, bArr, i, i2, i3, zzidwVar);
        zzidwVar.zze--;
        zzidwVar.zzc = obj;
        return zzi;
    }

    static int zzl(int i, byte[] bArr, int i2, int i3, zzify zzifyVar, zzidw zzidwVar) {
        zzifn zzifnVar = (zzifn) zzifyVar;
        int zza2 = zza(bArr, i2, zzidwVar);
        zzifnVar.zzi(zzidwVar.zza);
        while (zza2 < i3) {
            int zza3 = zza(bArr, zza2, zzidwVar);
            if (i != zzidwVar.zza) {
                break;
            }
            zza2 = zza(bArr, zza3, zzidwVar);
            zzifnVar.zzi(zzidwVar.zza);
        }
        return zza2;
    }

    static int zzm(byte[] bArr, int i, zzify zzifyVar, zzidw zzidwVar) throws IOException {
        zzifn zzifnVar = (zzifn) zzifyVar;
        int zza2 = zza(bArr, i, zzidwVar);
        int i2 = zzidwVar.zza;
        if (i2 < 0) {
            throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - zza2) {
            throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i3 = i2 + zza2;
        while (zza2 < i3) {
            zza2 = zza(bArr, zza2, zzidwVar);
            zzifnVar.zzi(zzidwVar.zza);
        }
        if (zza2 == i3) {
            return zza2;
        }
        throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zzn(zziho zzihoVar, int i, byte[] bArr, int i2, int i3, zzify zzifyVar, zzidw zzidwVar) throws IOException {
        int zzh = zzh(zzihoVar, bArr, i2, i3, zzidwVar);
        zzifyVar.add(zzidwVar.zzc);
        while (zzh < i3) {
            int zza2 = zza(bArr, zzh, zzidwVar);
            if (i != zzidwVar.zza) {
                break;
            }
            zzh = zzh(zzihoVar, bArr, zza2, i3, zzidwVar);
            zzifyVar.add(zzidwVar.zzc);
        }
        return zzh;
    }

    static int zzo(int i, byte[] bArr, int i2, int i3, zziib zziibVar, zzidw zzidwVar) throws zzige {
        if ((i >>> 3) == 0) {
            throw new zzige("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int zzc = zzc(bArr, i2, zzidwVar);
            zziibVar.zzk(i, Long.valueOf(zzidwVar.zzb));
            return zzc;
        }
        if (i4 == 1) {
            zziibVar.zzk(i, Long.valueOf(zze(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int zza2 = zza(bArr, i2, zzidwVar);
            int i5 = zzidwVar.zza;
            if (i5 < 0) {
                throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - zza2) {
                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                zziibVar.zzk(i, zziei.zza);
            } else {
                zziibVar.zzk(i, zziei.zzt(bArr, zza2, i5));
            }
            return zza2 + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new zzige("Protocol message contained an invalid tag (zero).");
            }
            zziibVar.zzk(i, Integer.valueOf(zzd(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zziib zzb2 = zziib.zzb();
        int i7 = zzidwVar.zze + 1;
        zzidwVar.zze = i7;
        zzq(i7);
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int zza3 = zza(bArr, i2, zzidwVar);
            i8 = zzidwVar.zza;
            if (i8 == i6) {
                i2 = zza3;
                break;
            }
            i2 = zzo(i8, bArr, zza3, i3, zzb2, zzidwVar);
        }
        zzidwVar.zze--;
        if (i2 > i3 || i8 != i6) {
            throw new zzige("Failed to parse the message.");
        }
        zziibVar.zzk(i, zzb2);
        return i2;
    }

    static int zzp(int i, byte[] bArr, int i2, int i3, zzidw zzidwVar) throws zzige {
        if ((i >>> 3) == 0) {
            throw new zzige("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return zzc(bArr, i2, zzidwVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return zza(bArr, i2, zzidwVar) + zzidwVar.zza;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw new zzige("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i & (-8)) | 4;
        int i6 = zzidwVar.zze + 1;
        zzidwVar.zze = i6;
        zzq(i6);
        int i7 = 0;
        while (i2 < i3) {
            i2 = zza(bArr, i2, zzidwVar);
            i7 = zzidwVar.zza;
            if (i7 == i5) {
                break;
            }
            i2 = zzp(i7, bArr, i2, i3, zzidwVar);
        }
        zzidwVar.zze--;
        if (i2 > i3 || i7 != i5) {
            throw new zzige("Failed to parse the message.");
        }
        return i2;
    }

    private static void zzq(int i) throws zzige {
        if (i >= zzb) {
            throw new zzige("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
