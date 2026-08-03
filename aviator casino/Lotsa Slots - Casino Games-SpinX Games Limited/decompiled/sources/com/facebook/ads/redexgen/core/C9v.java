package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.9v, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C9v implements com.facebook.ads.redexgen.core.InterfaceC2045np, com.facebook.ads.redexgen.core.InterfaceC2046nq {
    public static java.lang.String[] A06 = {"JXRw8dEnvO1Lr4g7cFUS0dvQrSj2gCrD", "hvHNuBxl", "xmWilmV3z2eIIj1", "UUtHfwhImwRJiupXWlBcpFq10hKf2hZ3", "Gjwbiw3zcCnfnivX0C6Z4KLegMayRhyW", "PFLAFIzQgEofbdrT2htWxpP7W2gVOOgi", "405rypbMY6P", "HWuA8Rz9jBHRgd5bymvhijPSyV36G6mN"};
    public long A00;
    public long A01;
    public long A02;
    public com.facebook.ads.redexgen.core.InterfaceC2046nq A03;
    public com.facebook.ads.redexgen.core.C2049nt[] A04 = new com.facebook.ads.redexgen.core.C2049nt[0];
    public final com.facebook.ads.redexgen.core.InterfaceC2045np A05;

    public C9v(com.facebook.ads.redexgen.core.InterfaceC2045np interfaceC2045np, boolean z, long j, long j2) {
        this.A05 = interfaceC2045np;
        this.A02 = z ? j : -9223372036854775807L;
        this.A01 = j;
        this.A00 = j2;
    }

    private com.facebook.ads.redexgen.core.C05207u A00(long j, com.facebook.ads.redexgen.core.C05207u c05207u) {
        long toleranceBeforeUs = com.facebook.ads.redexgen.core.C5C.A0T(c05207u.A01, 0L, j - this.A01);
        long A0T = com.facebook.ads.redexgen.core.C5C.A0T(c05207u.A00, 0L, this.A00 == Long.MIN_VALUE ? Long.MAX_VALUE : this.A00 - j);
        if (toleranceBeforeUs == c05207u.A01) {
            long j2 = c05207u.A00;
            if (A06[6].length() != 11) {
                throw new java.lang.RuntimeException();
            }
            A06[0] = "SySHx2FlEzism2SEaRZKk1Ki9OIwKCgL";
            if (A0T == j2) {
                return c05207u;
            }
        }
        return new com.facebook.ads.redexgen.core.C05207u(toleranceBeforeUs, A0T);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.DW
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void ADV(com.facebook.ads.redexgen.core.InterfaceC2045np interfaceC2045np) {
        ((com.facebook.ads.redexgen.core.InterfaceC2046nq) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A03)).ADV(this);
    }

    public static boolean A02(long j, com.facebook.ads.redexgen.core.InterfaceC2008nE[] interfaceC2008nEArr) {
        if (j != 0) {
            for (com.facebook.ads.redexgen.core.InterfaceC2008nE interfaceC2008nE : interfaceC2008nEArr) {
                if (interfaceC2008nE != null) {
                    com.facebook.ads.redexgen.core.C2196qI A92 = interfaceC2008nE.A92();
                    if (!com.facebook.ads.redexgen.core.C3J.A0G(A92.A0W, A92.A0R)) {
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

    @Override // com.facebook.ads.redexgen.core.DX
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Added in D19760981 for cancel request")
    public final void A4s(long j) {
        this.A05.A4s(j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2045np
    public final boolean A5C(long j) {
        return this.A05.A5C(j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2045np
    public final void A60(long j, boolean z) {
        this.A05.A60(j, z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2045np
    public final long A6r(long j, com.facebook.ads.redexgen.core.C05207u c05207u) {
        if (j == this.A01) {
            return this.A01;
        }
        return this.A05.A6r(j, A00(j, c05207u));
    }

    @Override // com.facebook.ads.redexgen.core.DX
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Added in D9949576 for unstall buffer")
    public final long A76(long j) {
        return this.A05.A76(j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2045np
    public final long A78() {
        long A78 = this.A05.A78();
        if (A78 == Long.MIN_VALUE || (this.A00 != Long.MIN_VALUE && A78 >= this.A00)) {
            return Long.MIN_VALUE;
        }
        return A78;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2045np
    public final long A8b() {
        long A8b = this.A05.A8b();
        if (A8b != Long.MIN_VALUE) {
            long nextLoadPositionUs = this.A00;
            if (A06[0].charAt(29) != 'C') {
                throw new java.lang.RuntimeException();
            }
            A06[0] = "QBPPyRyowan8CCGBQiXIHMf03VOUOCSC";
            if (nextLoadPositionUs == Long.MIN_VALUE || A8b < this.A00) {
                return A8b;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2045np
    public final com.facebook.ads.redexgen.core.C2026nW A9M() {
        return this.A05.A9M();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2045np
    public final void ACS() throws java.io.IOException {
        if (0 == 0) {
            this.A05.ACS();
            return;
        }
        throw null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2046nq
    public final void AFS(com.facebook.ads.redexgen.core.InterfaceC2045np interfaceC2045np) {
        if (0 != 0) {
            return;
        }
        ((com.facebook.ads.redexgen.core.InterfaceC2046nq) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A03)).AFS(this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2045np
    public final void AH5(com.facebook.ads.redexgen.core.InterfaceC2046nq interfaceC2046nq, long j) {
        this.A03 = interfaceC2046nq;
        this.A05.AH5(this, j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2045np
    public final long AHQ() {
        if (A03()) {
            long childDiscontinuityUs = this.A02;
            this.A02 = -9223372036854775807L;
            long AHQ = AHQ();
            return AHQ != -9223372036854775807L ? AHQ : childDiscontinuityUs;
        }
        com.facebook.ads.redexgen.core.InterfaceC2045np interfaceC2045np = this.A05;
        if (A06[2].length() == 0) {
            throw new java.lang.RuntimeException();
        }
        A06[6] = "ABWUoGiNBoa";
        long AHQ2 = interfaceC2045np.AHQ();
        if (AHQ2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long discontinuityUs = this.A01;
        boolean z = true;
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(AHQ2 >= discontinuityUs);
        if (this.A00 != Long.MIN_VALUE) {
            long discontinuityUs2 = this.A00;
            if (AHQ2 > discontinuityUs2) {
                z = false;
            }
        }
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(z);
        return AHQ2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2045np
    public final void AHW(long j) {
        this.A05.AHW(j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2045np
    public final long AJ8(@com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization long j, boolean z) {
        this.A02 = -9223372036854775807L;
        boolean z2 = false;
        for (com.facebook.ads.redexgen.core.C2049nt c2049nt : this.A04) {
            if (c2049nt != null) {
                c2049nt.A00();
            }
        }
        long AJ8 = this.A05.AJ8(j, z);
        if (AJ8 == j || (AJ8 >= this.A01 && (this.A00 == Long.MIN_VALUE || AJ8 <= this.A00))) {
            z2 = true;
        }
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(z2);
        return AJ8;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2045np
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long AJ9(com.facebook.ads.redexgen.core.InterfaceC2008nE[] interfaceC2008nEArr, boolean[] zArr, com.facebook.ads.redexgen.core.DT[] dtArr, boolean[] zArr2, long j) {
        long j2;
        int i;
        this.A04 = new com.facebook.ads.redexgen.core.C2049nt[dtArr.length];
        com.facebook.ads.redexgen.core.DT[] dtArr2 = new com.facebook.ads.redexgen.core.DT[dtArr.length];
        int i2 = 0;
        while (true) {
            com.facebook.ads.redexgen.core.DT dt = null;
            if (i2 >= dtArr.length) {
                break;
            }
            this.A04[i2] = (com.facebook.ads.redexgen.core.C2049nt) dtArr[i2];
            com.facebook.ads.redexgen.core.DT[] childStreams = this.A04;
            if (childStreams[i2] != null) {
                dt = this.A04[i2].A01;
            }
            dtArr2[i2] = dt;
            i2++;
        }
        long AJ9 = this.A05.AJ9(interfaceC2008nEArr, zArr, dtArr2, zArr2, j);
        if (A03() && j == this.A01) {
            long j3 = this.A01;
            java.lang.String[] strArr = A06;
            if (strArr[4].charAt(5) == strArr[3].charAt(5)) {
                java.lang.String[] strArr2 = A06;
                strArr2[7] = "en1LL2zHQFU7eKPWWtw7tqDicZnmZ9l5";
                strArr2[5] = "t66o2OzEfyctLQHjRBlZ897u0IFgDWGZ";
                if (A02(j3, interfaceC2008nEArr)) {
                    j2 = AJ9;
                    this.A02 = j2;
                    com.facebook.ads.redexgen.core.AbstractC04203y.A08(AJ9 != j || (AJ9 >= this.A01 && (this.A00 == Long.MIN_VALUE || AJ9 <= this.A00)));
                    i = 0;
                    while (true) {
                        int length = dtArr.length;
                        if (A06[1].length() == 30) {
                            java.lang.String[] strArr3 = A06;
                            strArr3[7] = "DNi9UWzwfCWyYPkB4uGGg0YkPCShAQe6";
                            strArr3[5] = "fAixbEz1F3G47KA6JLUGcT01MO1ZofiJ";
                            if (i >= length) {
                                break;
                            }
                            if (dtArr2[i] != null) {
                                com.facebook.ads.redexgen.core.C2049nt[] c2049ntArr = this.A04;
                                java.lang.String[] strArr4 = A06;
                                if (strArr4[4].charAt(5) != strArr4[3].charAt(5)) {
                                    break;
                                }
                                A06[6] = "ocXNdzhjsFv";
                                c2049ntArr[i] = null;
                            } else {
                                com.facebook.ads.redexgen.core.DT[] childStreams2 = this.A04;
                                if (childStreams2[i] != null) {
                                    com.facebook.ads.redexgen.core.DT dt2 = this.A04[i].A01;
                                    com.facebook.ads.redexgen.core.DT dt3 = dtArr2[i];
                                    if (A06[1].length() != 30) {
                                        java.lang.String[] strArr5 = A06;
                                        strArr5[4] = "cYzDBwspbZ8a8DM9Dz10VjvDatAoG4Oi";
                                        strArr5[3] = "WIkG6wjldaaFwlHYCP34A8xHiCA5NCte";
                                        if (dt2 == dt3) {
                                        }
                                    } else if (dt2 == dt3) {
                                    }
                                }
                                this.A04[i] = new com.facebook.ads.redexgen.core.C2049nt(this, dtArr2[i]);
                            }
                            com.facebook.ads.redexgen.core.DT[] childStreams3 = this.A04;
                            dtArr[i] = childStreams3[i];
                            i++;
                        } else {
                            if (i >= length) {
                                break;
                            }
                            if (dtArr2[i] != null) {
                            }
                            com.facebook.ads.redexgen.core.DT[] childStreams32 = this.A04;
                            dtArr[i] = childStreams32[i];
                            i++;
                        }
                    }
                    return AJ9;
                }
            }
            throw new java.lang.RuntimeException();
        }
        j2 = -9223372036854775807L;
        this.A02 = j2;
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(AJ9 != j || (AJ9 >= this.A01 && (this.A00 == Long.MIN_VALUE || AJ9 <= this.A00)));
        i = 0;
        while (true) {
            int length2 = dtArr.length;
            if (A06[1].length() == 30) {
            }
            com.facebook.ads.redexgen.core.DT[] childStreams322 = this.A04;
            dtArr[i] = childStreams322[i];
            i++;
        }
        return AJ9;
    }

    @Override // com.facebook.ads.redexgen.core.DX
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Added in D19875605 for error load during pause")
    public final void AJc(boolean z) {
        this.A05.AJc(z);
    }

    @Override // com.facebook.ads.redexgen.core.DX
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Added in D13267633 for lower priority during pause")
    public final void AKb(byte b) {
        this.A05.AKb(b);
    }
}
