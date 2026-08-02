package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.9F, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9F implements InterfaceC1678mM, InterfaceC1679mN {
    public static String[] A06 = {"JXRw8dEnvO1Lr4g7cFUS0dvQrSj2gCrD", "hvHNuBxl", "xmWilmV3z2eIIj1", "UUtHfwhImwRJiupXWlBcpFq10hKf2hZ3", "Gjwbiw3zcCnfnivX0C6Z4KLegMayRhyW", "PFLAFIzQgEofbdrT2htWxpP7W2gVOOgi", "405rypbMY6P", "HWuA8Rz9jBHRgd5bymvhijPSyV36G6mN"};
    public long A00;
    public long A01;
    public long A02;
    public InterfaceC1679mN A03;
    public C1682mQ[] A04 = new C1682mQ[0];
    public final InterfaceC1678mM A05;

    public C9F(InterfaceC1678mM interfaceC1678mM, boolean z, long j, long j2) {
        this.A05 = interfaceC1678mM;
        this.A02 = z ? j : -9223372036854775807L;
        this.A01 = j;
        this.A00 = j2;
    }

    private C7I A00(long j, C7I c7i) {
        long toleranceBeforeUs = AbstractC01424a.A0T(c7i.A01, 0L, j - this.A01);
        long A0T = AbstractC01424a.A0T(c7i.A00, 0L, this.A00 == Long.MIN_VALUE ? Long.MAX_VALUE : this.A00 - j);
        if (toleranceBeforeUs == c7i.A01) {
            long j2 = c7i.A00;
            if (A06[6].length() != 11) {
                throw new RuntimeException();
            }
            A06[0] = "SySHx2FlEzism2SEaRZKk1Ki9OIwKCgL";
            if (A0T == j2) {
                return c7i;
            }
        }
        return new C7I(toleranceBeforeUs, A0T);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0354Cu
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void ACs(InterfaceC1678mM interfaceC1678mM) {
        ((InterfaceC1679mN) C3M.A01(this.A03)).ACs(this);
    }

    public static boolean A02(long j, InterfaceC1640lj[] interfaceC1640ljArr) {
        if (j != 0) {
            for (InterfaceC1640lj interfaceC1640lj : interfaceC1640ljArr) {
                if (interfaceC1640lj != null) {
                    C1830or A8u = interfaceC1640lj.A8u();
                    if (!AbstractC00972h.A0G(A8u.A0W, A8u.A0R)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean A03() {
        return this.A02 != -9223372036854775807L;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0355Cv
    @MetaExoPlayerCustomization("Added in D19760981 for cancel request")
    public final void A4k(long j) {
        this.A05.A4k(j);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1678mM
    public final boolean A54(long j) {
        return this.A05.A54(j);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1678mM
    public final void A5s(long j, boolean z) {
        this.A05.A5s(j, z);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1678mM
    public final long A6j(long j, C7I c7i) {
        if (j == this.A01) {
            return this.A01;
        }
        return this.A05.A6j(j, A00(j, c7i));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0355Cv
    @MetaExoPlayerCustomization("Added in D9949576 for unstall buffer")
    public final long A6y(long j) {
        return this.A05.A6y(j);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1678mM
    public final long A70() {
        long A70 = this.A05.A70();
        if (A70 == Long.MIN_VALUE || (this.A00 != Long.MIN_VALUE && A70 >= this.A00)) {
            return Long.MIN_VALUE;
        }
        return A70;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1678mM
    public final long A8T() {
        long A8T = this.A05.A8T();
        if (A8T != Long.MIN_VALUE) {
            long nextLoadPositionUs = this.A00;
            if (A06[0].charAt(29) != 'C') {
                throw new RuntimeException();
            }
            A06[0] = "QBPPyRyowan8CCGBQiXIHMf03VOUOCSC";
            if (nextLoadPositionUs == Long.MIN_VALUE || A8T < this.A00) {
                return A8T;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1678mM
    public final C1667mA A9E() {
        return this.A05.A9E();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1678mM
    public final void ABt() throws IOException {
        if (0 == 0) {
            this.A05.ABt();
            return;
        }
        throw null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1679mN
    public final void AEk(InterfaceC1678mM interfaceC1678mM) {
        if (0 != 0) {
            return;
        }
        ((InterfaceC1679mN) C3M.A01(this.A03)).AEk(this);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1678mM
    public final void AGL(InterfaceC1679mN interfaceC1679mN, long j) {
        this.A03 = interfaceC1679mN;
        this.A05.AGL(this, j);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1678mM
    public final long AGg() {
        if (A03()) {
            long childDiscontinuityUs = this.A02;
            this.A02 = -9223372036854775807L;
            long AGg = AGg();
            return AGg != -9223372036854775807L ? AGg : childDiscontinuityUs;
        }
        InterfaceC1678mM interfaceC1678mM = this.A05;
        if (A06[2].length() == 0) {
            throw new RuntimeException();
        }
        A06[6] = "ABWUoGiNBoa";
        long AGg2 = interfaceC1678mM.AGg();
        if (AGg2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long discontinuityUs = this.A01;
        boolean z = true;
        C3M.A08(AGg2 >= discontinuityUs);
        if (this.A00 != Long.MIN_VALUE) {
            long discontinuityUs2 = this.A00;
            if (AGg2 > discontinuityUs2) {
                z = false;
            }
        }
        C3M.A08(z);
        return AGg2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1678mM
    public final void AGm(long j) {
        this.A05.AGm(j);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1678mM
    public final long AIO(@MetaExoPlayerCustomization long j, boolean z) {
        this.A02 = -9223372036854775807L;
        boolean z2 = false;
        for (C1682mQ c1682mQ : this.A04) {
            if (c1682mQ != null) {
                c1682mQ.A00();
            }
        }
        long AIO = this.A05.AIO(j, z);
        if (AIO == j || (AIO >= this.A01 && (this.A00 == Long.MIN_VALUE || AIO <= this.A00))) {
            z2 = true;
        }
        C3M.A08(z2);
        return AIO;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    @Override // com.instagram.common.viewpoint.core.InterfaceC1678mM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long AIP(InterfaceC1640lj[] interfaceC1640ljArr, boolean[] zArr, InterfaceC0351Cr[] interfaceC0351CrArr, boolean[] zArr2, long j) {
        long j2;
        int i;
        this.A04 = new C1682mQ[interfaceC0351CrArr.length];
        InterfaceC0351Cr[] interfaceC0351CrArr2 = new InterfaceC0351Cr[interfaceC0351CrArr.length];
        int i2 = 0;
        while (true) {
            InterfaceC0351Cr interfaceC0351Cr = null;
            if (i2 >= interfaceC0351CrArr.length) {
                break;
            }
            this.A04[i2] = (C1682mQ) interfaceC0351CrArr[i2];
            InterfaceC0351Cr[] childStreams = this.A04;
            if (childStreams[i2] != null) {
                interfaceC0351Cr = this.A04[i2].A01;
            }
            interfaceC0351CrArr2[i2] = interfaceC0351Cr;
            i2++;
        }
        long AIP = this.A05.AIP(interfaceC1640ljArr, zArr, interfaceC0351CrArr2, zArr2, j);
        if (A03() && j == this.A01) {
            long j3 = this.A01;
            String[] strArr = A06;
            if (strArr[4].charAt(5) == strArr[3].charAt(5)) {
                String[] strArr2 = A06;
                strArr2[7] = "en1LL2zHQFU7eKPWWtw7tqDicZnmZ9l5";
                strArr2[5] = "t66o2OzEfyctLQHjRBlZ897u0IFgDWGZ";
                if (A02(j3, interfaceC1640ljArr)) {
                    j2 = AIP;
                    this.A02 = j2;
                    C3M.A08(AIP != j || (AIP >= this.A01 && (this.A00 == Long.MIN_VALUE || AIP <= this.A00)));
                    i = 0;
                    while (true) {
                        int length = interfaceC0351CrArr.length;
                        if (A06[1].length() == 30) {
                            String[] strArr3 = A06;
                            strArr3[7] = "DNi9UWzwfCWyYPkB4uGGg0YkPCShAQe6";
                            strArr3[5] = "fAixbEz1F3G47KA6JLUGcT01MO1ZofiJ";
                            if (i >= length) {
                                break;
                            }
                            if (interfaceC0351CrArr2[i] != null) {
                                C1682mQ[] c1682mQArr = this.A04;
                                String[] strArr4 = A06;
                                if (strArr4[4].charAt(5) != strArr4[3].charAt(5)) {
                                    break;
                                }
                                A06[6] = "ocXNdzhjsFv";
                                c1682mQArr[i] = null;
                            } else {
                                InterfaceC0351Cr[] childStreams2 = this.A04;
                                if (childStreams2[i] != null) {
                                    InterfaceC0351Cr interfaceC0351Cr2 = this.A04[i].A01;
                                    InterfaceC0351Cr interfaceC0351Cr3 = interfaceC0351CrArr2[i];
                                    if (A06[1].length() != 30) {
                                        String[] strArr5 = A06;
                                        strArr5[4] = "cYzDBwspbZ8a8DM9Dz10VjvDatAoG4Oi";
                                        strArr5[3] = "WIkG6wjldaaFwlHYCP34A8xHiCA5NCte";
                                        if (interfaceC0351Cr2 == interfaceC0351Cr3) {
                                        }
                                    } else if (interfaceC0351Cr2 == interfaceC0351Cr3) {
                                    }
                                }
                                this.A04[i] = new C1682mQ(this, interfaceC0351CrArr2[i]);
                            }
                            InterfaceC0351Cr[] childStreams3 = this.A04;
                            interfaceC0351CrArr[i] = childStreams3[i];
                            i++;
                        } else {
                            if (i >= length) {
                                break;
                            }
                            if (interfaceC0351CrArr2[i] != null) {
                            }
                            InterfaceC0351Cr[] childStreams32 = this.A04;
                            interfaceC0351CrArr[i] = childStreams32[i];
                            i++;
                        }
                    }
                    return AIP;
                }
            }
            throw new RuntimeException();
        }
        j2 = -9223372036854775807L;
        this.A02 = j2;
        C3M.A08(AIP != j || (AIP >= this.A01 && (this.A00 == Long.MIN_VALUE || AIP <= this.A00)));
        i = 0;
        while (true) {
            int length2 = interfaceC0351CrArr.length;
            if (A06[1].length() == 30) {
            }
            InterfaceC0351Cr[] childStreams322 = this.A04;
            interfaceC0351CrArr[i] = childStreams322[i];
            i++;
        }
        return AIP;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0355Cv
    @MetaExoPlayerCustomization("Added in D19875605 for error load during pause")
    public final void AIs(boolean z) {
        this.A05.AIs(z);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0355Cv
    @MetaExoPlayerCustomization("Added in D13267633 for lower priority during pause")
    public final void AJq(byte b) {
        this.A05.AJq(b);
    }
}
