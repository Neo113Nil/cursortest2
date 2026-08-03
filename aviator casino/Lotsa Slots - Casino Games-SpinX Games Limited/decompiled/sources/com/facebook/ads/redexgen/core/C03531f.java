package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.1f, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C03531f extends com.facebook.ads.redexgen.core.AE implements android.os.Handler.Callback {
    public static byte[] A0C;
    public static java.lang.String[] A0D = {"NK", "vMUMQm9t3PVEHAhulw0MAIkQwbUiUT4C", "VzHAp2e3DLoJMdzQNED0QcuPK7cYUDq5", "FnbOiwq", "xIduLB4T8250", "Cs28mBuu0mG0MZGGLuKaoZOHc13snW3U", "yvPpy336WGNf4g7OJVDaRPYRY7Bcuv5q", "KVpXSq2ZIE7gcar9k8WJ"};
    public int A00;
    public int A01;
    public long A02;
    public com.facebook.ads.redexgen.core.InterfaceC0762Hw A03;
    public java.util.List<com.facebook.ads.redexgen.core.ImfDataTrack> A04;
    public boolean A05;
    public final android.os.Handler A06;
    public final com.facebook.ads.redexgen.core.InterfaceC0591Bd A07;
    public final com.facebook.ads.redexgen.core.InterfaceC0593Bf A08;
    public final com.facebook.ads.redexgen.core.C05509e A09;
    public final long[] A0A;
    public final com.facebook.ads.androidx.media3.common.Metadata[] A0B;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 31);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A0C = new byte[]{86, 97, 97, 124, 97, 51, 122, 125, 51, 99, 114, 97, 96, 122, 125, 116, 51, 90, 94, 85, 51, 96, 99, 118, 112, 124, 84, 69, 80, 85, 80, 69, 80, 99, 84, 95, 85, 84, 67, 84, 67};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A07(com.facebook.ads.androidx.media3.common.Metadata metadata, java.util.List<com.facebook.ads.androidx.media3.common.Metadata.Entry> list) {
        for (int i = 0; i < metadata.A02(); i++) {
            com.facebook.ads.redexgen.core.C2196qI A9b = metadata.A03(i).A9b();
            if (A9b == null || !this.A07.AKN(A9b)) {
                list.add(metadata.A03(i));
            } else {
                com.facebook.ads.redexgen.core.InterfaceC0762Hw A5J = this.A07.A5J(A9b);
                byte[] bArr = (byte[]) com.facebook.ads.redexgen.core.AbstractC04203y.A01(metadata.A03(i).A9a());
                this.A09.A0A();
                this.A09.A0C(bArr.length);
                ((java.nio.ByteBuffer) com.facebook.ads.redexgen.core.C5C.A0f(this.A09.A02)).put(bArr);
                this.A09.A0B();
                com.facebook.ads.androidx.media3.common.Metadata A5o = A5J.A5o(this.A09);
                if (A5o != null) {
                    A07(A5o, list);
                }
            }
        }
    }

    static {
        A02();
    }

    public C03531f(com.facebook.ads.redexgen.core.InterfaceC0593Bf interfaceC0593Bf, android.os.Looper looper) {
        this(interfaceC0593Bf, looper, com.facebook.ads.redexgen.core.InterfaceC0591Bd.A00, null);
    }

    public C03531f(com.facebook.ads.redexgen.core.InterfaceC0593Bf interfaceC0593Bf, android.os.Looper looper, com.facebook.ads.redexgen.core.InterfaceC0591Bd interfaceC0591Bd, java.lang.String str) {
        super(5);
        this.A08 = (com.facebook.ads.redexgen.core.InterfaceC0593Bf) com.facebook.ads.redexgen.core.AbstractC04203y.A01(interfaceC0593Bf);
        this.A06 = looper == null ? null : com.facebook.ads.redexgen.core.C5C.A0c(looper, this);
        this.A07 = (com.facebook.ads.redexgen.core.InterfaceC0591Bd) com.facebook.ads.redexgen.core.AbstractC04203y.A01(interfaceC0591Bd);
        this.A09 = new com.facebook.ads.redexgen.core.C05509e();
        this.A0B = new com.facebook.ads.androidx.media3.common.Metadata[5];
        this.A0A = new long[5];
        A08(str);
    }

    private void A01() {
        java.util.Arrays.fill(this.A0B, (java.lang.Object) null);
        this.A01 = 0;
        this.A00 = 0;
    }

    private void A03(long j) {
        if (this.A04 == null) {
            return;
        }
        for (com.facebook.ads.redexgen.core.ImfDataTrack imfDataTrack : this.A04) {
            if (imfDataTrack.A01 > j || imfDataTrack.A00 >= j) {
            }
        }
    }

    private void A04(long j) {
        if (this.A04 == null) {
            return;
        }
        long A01 = com.facebook.ads.redexgen.core.C2Y.A01(j);
        if (this.A06 != null) {
            this.A06.obtainMessage(1, java.lang.Long.valueOf(A01)).sendToTarget();
        } else {
            A03(A01);
        }
    }

    private void A05(com.facebook.ads.androidx.media3.common.Metadata metadata, long j) {
        if (this.A06 != null) {
            android.os.Handler handler = this.A06;
            java.lang.String[] strArr = A0D;
            if (strArr[4].length() == strArr[0].length()) {
                throw new java.lang.RuntimeException();
            }
            A0D[5] = "4kdXpcjsywiaLxx0LOctAJHWIf081Tdg";
            handler.obtainMessage(0, new java.lang.Object[]{metadata, java.lang.Long.valueOf(j)}).sendToTarget();
            return;
        }
        A06(metadata, j);
    }

    private void A06(com.facebook.ads.androidx.media3.common.Metadata metadata, long j) {
        this.A08.AEt(metadata, j);
    }

    private void A08(java.lang.String str) {
        if (str != null && !str.isEmpty()) {
            try {
                this.A04 = com.facebook.ads.redexgen.core.ImfSpecParser.A01(str);
            } catch (org.json.JSONException unused) {
                com.facebook.ads.redexgen.core.AbstractC04284g.A05(A00(25, 16, 46), A00(0, 25, 12));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AE
    public final void A1Z() {
        A01();
        this.A03 = null;
    }

    @Override // com.facebook.ads.redexgen.core.AE
    public final void A1a(long j, boolean z) {
        A01();
        this.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.core.AE
    public final void A1c(com.facebook.ads.redexgen.core.C2196qI[] c2196qIArr, long j, long j2) {
        this.A03 = this.A07.A5J(c2196qIArr[0]);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2105oo
    public final boolean AAP() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2105oo
    public final boolean AAe() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2105oo
    public final void AIX(long j, long j2) {
        A04(j);
        if (!this.A05) {
            int i = this.A00;
            java.lang.String[] strArr = A0D;
            if (strArr[7].length() == strArr[3].length()) {
                throw new java.lang.RuntimeException();
            }
            A0D[6] = "1aiib0Ku6fHDvKwfwiyuvRv8M83XUpBK";
            if (i < 5) {
                this.A09.A0A();
                com.facebook.ads.redexgen.core.C04996z A1U = A1U();
                int A1R = A1R(A1U, this.A09, 0);
                if (A1R == -4) {
                    if (this.A09.A05()) {
                        this.A05 = true;
                    } else if (!this.A09.A04()) {
                        this.A09.A00 = this.A02;
                        this.A09.A0B();
                        com.facebook.ads.androidx.media3.common.Metadata A5o = ((com.facebook.ads.redexgen.core.InterfaceC0762Hw) com.facebook.ads.redexgen.core.C5C.A0f(this.A03)).A5o(this.A09);
                        if (A5o != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList(A5o.A02());
                            A07(A5o, arrayList);
                            if (!arrayList.isEmpty()) {
                                com.facebook.ads.androidx.media3.common.Metadata metadata = new com.facebook.ads.androidx.media3.common.Metadata(arrayList);
                                int i2 = (this.A01 + this.A00) % 5;
                                this.A0B[i2] = metadata;
                                this.A0A[i2] = this.A09.A01;
                                this.A00++;
                            }
                        }
                    }
                } else if (A1R == -5) {
                    this.A02 = ((com.facebook.ads.redexgen.core.C2196qI) com.facebook.ads.redexgen.core.AbstractC04203y.A01(A1U.A00)).A0M;
                }
            }
        }
        if (this.A00 > 0 && this.A0A[this.A01] <= j) {
            A05((com.facebook.ads.androidx.media3.common.Metadata) com.facebook.ads.redexgen.core.C5C.A0f(this.A0B[this.A01]), com.facebook.ads.redexgen.core.C2Y.A01(j - this.A0A[this.A01]));
            this.A0B[this.A01] = null;
            this.A01 = (this.A01 + 1) % 5;
            this.A00--;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05157p
    public final int AKM(com.facebook.ads.redexgen.core.C2196qI c2196qI) {
        int i;
        if (this.A07.AKN(c2196qI)) {
            if (com.facebook.ads.redexgen.core.AbstractC03541g.A1G(c2196qI)) {
                i = 4;
            } else {
                i = 2;
            }
            return com.facebook.ads.redexgen.core.AbstractC05087i.A00(i);
        }
        return com.facebook.ads.redexgen.core.AbstractC05087i.A00(0);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2105oo, com.facebook.ads.redexgen.core.InterfaceC05157p
    public final java.lang.String getName() {
        return A00(25, 16, 46);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        switch (message.what) {
            case 0:
                java.lang.Object[] objArr = (java.lang.Object[]) message.obj;
                A06((com.facebook.ads.androidx.media3.common.Metadata) objArr[0], ((java.lang.Long) objArr[1]).longValue());
                return true;
            case 1:
                A03(((java.lang.Long) message.obj).longValue());
                java.lang.String[] strArr = A0D;
                if (strArr[2].charAt(28) != strArr[1].charAt(28)) {
                    throw new java.lang.RuntimeException();
                }
                A0D[5] = "UckPrHUV0DeFsLdW0mSA3sL7bYTaY94z";
                return true;
            default:
                throw new java.lang.IllegalStateException();
        }
    }
}
