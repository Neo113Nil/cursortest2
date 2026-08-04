package N1;

import C1.C0095a;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f4738a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static p096n1.e b(byte[] bArr) {
        C0095a c0095a = new C0095a(bArr);
        if (c0095a.f1464b < 32) {
            return null;
        }
        c0095a.D(0);
        if (c0095a.g() != c0095a.d() + 4 || c0095a.g() != 1886614376) {
            return null;
        }
        int iL = D1.a.l(c0095a.g());
        if (iL > 1) {
            p150v0.a.j(iL, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(c0095a.n(), c0095a.n());
        if (iL == 1) {
            c0095a.E(c0095a.w() * 16);
        }
        int iW = c0095a.w();
        if (iW != c0095a.d()) {
            return null;
        }
        byte[] bArr2 = new byte[iW];
        c0095a.f(bArr2, 0, iW);
        return new p096n1.e(uuid, iL, bArr2);
    }

    public static boolean c(F1.l lVar, boolean z4, boolean z7) {
        boolean z8;
        boolean z9;
        boolean z10;
        int i7;
        boolean z11;
        long j = lVar.j();
        long j3 = -1;
        int i8 = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
        long j7 = 4096;
        if (i8 != 0 && j <= 4096) {
            j7 = j;
        }
        int i9 = (int) j7;
        C0095a c0095a = new C0095a(64);
        boolean z12 = false;
        int i10 = 0;
        boolean z13 = false;
        while (true) {
            if (i10 < i9) {
                c0095a.A(8);
                if (lVar.c((byte[]) c0095a.f1465c, z12 ? 1 : 0, 8, true)) {
                    long jU = c0095a.u();
                    int iG = c0095a.g();
                    if (jU == 1) {
                        lVar.y((byte[]) c0095a.f1465c, 8, 8);
                        c0095a.C(16);
                        i7 = 16;
                        jU = c0095a.n();
                    } else {
                        if (jU == 0) {
                            long j8 = lVar.j();
                            if (j8 != j3) {
                                jU = (j8 - lVar.d()) + ((long) 8);
                            }
                        }
                        i7 = 8;
                    }
                    long j9 = i7;
                    if (jU < j9) {
                        return z12;
                    }
                    i10 += i7;
                    if (iG == 1836019574) {
                        i9 += (int) jU;
                        if (i8 != 0 && i9 > j) {
                            i9 = (int) j;
                        }
                    } else if (iG == 1836019558 || iG == 1836475768) {
                        z8 = z12 ? 1 : 0;
                        z9 = true;
                        z10 = true;
                    } else {
                        int i11 = i8;
                        if ((((long) i10) + jU) - j9 >= i9) {
                            z8 = false;
                            z9 = true;
                            z10 = z8 ? 1 : 0;
                        } else {
                            int i12 = (int) (jU - j9);
                            i10 += i12;
                            if (iG != 1718909296) {
                                z11 = false;
                                if (i12 != 0) {
                                    z13 = z13;
                                    lVar.h(i12);
                                    z13 = z13;
                                }
                            } else {
                                if (i12 < 8) {
                                    return false;
                                }
                                c0095a.A(i12);
                                lVar.y((byte[]) c0095a.f1465c, 0, i12);
                                int i13 = i12 / 4;
                                for (int i14 = 0; i14 < i13; i14++) {
                                    if (i14 != 1) {
                                        int iG2 = c0095a.g();
                                        if ((iG2 >>> 8) != 3368816 && (iG2 != 1751476579 || !z7)) {
                                            int[] iArr = f4738a;
                                            int i15 = 0;
                                            while (true) {
                                                if (i15 >= 29) {
                                                    continue;
                                                } else if (iArr[i15] != iG2) {
                                                    i15++;
                                                }
                                            }
                                        }
                                        z13 = true;
                                        break;
                                    }
                                    c0095a.E(4);
                                }
                                if (!z13) {
                                    return false;
                                }
                                z11 = false;
                                z13 = z13;
                            }
                            z13 = z13;
                            z12 = z11;
                            i8 = i11;
                        }
                    }
                    j3 = -1;
                    z13 = z13;
                }
                return (z13 || z4 != z10) ? z8 : z9;
            }
            z8 = z12 ? 1 : 0;
            z9 = true;
            z10 = z8 ? 1 : 0;
            if (z13) {
            }
        }
    }
}
