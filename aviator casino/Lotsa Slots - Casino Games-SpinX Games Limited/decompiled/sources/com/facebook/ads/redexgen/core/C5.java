package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class C5 {
    public static byte[] A0G;
    public static java.lang.String[] A0H = {"pVyOFxmsQ66MTtm1tfRFfgviAXYtJVde", "2uUwIcomsi7SFa7PXkK2f37odc1wLlYz", "QkwYj4Lqiyfn1sjUd74ET1yWKOC2yQQp", "dFCgemChCTNfDzsLBkcDawIxAoCNtdjt", "sEgyiM3VxaELP8J5ElL8PsjgrXzRWZa", "oraRcW9NweHiYSV9WAd4vPrbGQ1KpHw2", "RucdtTHsidUdQvrsj3emf0t2ky4JUHkt", "bkvUCljONwekC27QIXEAtZgyfnOfNHe"};
    public static final com.facebook.ads.androidx.media3.exoplayer.scheduler.Requirements A0I;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public com.facebook.ads.redexgen.core.CX A05;
    public java.util.List<com.facebook.ads.redexgen.core.C0598Bk> A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final android.content.Context A0A;
    public final android.os.Handler A0B;
    public final com.facebook.ads.redexgen.core.C2 A0C;
    public final com.facebook.ads.redexgen.core.InterfaceC2052nw A0D;
    public final com.facebook.ads.redexgen.core.CT A0E;
    public final java.util.concurrent.CopyOnWriteArraySet<com.facebook.ads.redexgen.core.C4> A0F;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0G, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0H[0].charAt(31) != 'e') {
                throw new java.lang.RuntimeException();
            }
            A0H[1] = "Q4q55Cq4Bi7IKuCSPoembBRK5ZQkCbyv";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 123);
            i4++;
        }
    }

    public static void A03() {
        A0G = new byte[]{34, com.google.common.base.Ascii.US, 8, 55, com.google.common.base.Ascii.VT, 6, com.google.common.base.Ascii.RS, 2, com.google.common.base.Ascii.NAK, 93, 35, 8, com.google.common.base.Ascii.DLE, 9, com.google.common.base.Ascii.VT, 8, 6, 3, 42, 6, 9, 6, 0, 2, com.google.common.base.Ascii.NAK};
    }

    static {
        A03();
        A0I = new com.facebook.ads.androidx.media3.exoplayer.scheduler.Requirements(1);
    }

    public C5(android.content.Context context, com.facebook.ads.redexgen.core.C5O c5o, com.facebook.ads.redexgen.core.MP mp, com.facebook.ads.redexgen.core.C5Y c5y, java.util.concurrent.Executor executor) {
        this(context, new com.facebook.ads.redexgen.core.C9w(c5o), new com.facebook.ads.redexgen.core.C2058o3(new com.facebook.ads.redexgen.core.C1852kT().A06(mp).A05(c5y), executor));
    }

    public C5(android.content.Context context, com.facebook.ads.redexgen.core.InterfaceC2052nw interfaceC2052nw, com.facebook.ads.redexgen.core.CJ cj) {
        this.A0A = context.getApplicationContext();
        this.A0D = interfaceC2052nw;
        this.A01 = 3;
        this.A02 = 5;
        this.A07 = true;
        this.A06 = java.util.Collections.emptyList();
        this.A0F = new java.util.concurrent.CopyOnWriteArraySet<>();
        android.os.Handler A0b = com.facebook.ads.redexgen.core.C5C.A0b(new android.os.Handler.Callback() { // from class: com.facebook.ads.redexgen.X.By
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(android.os.Message message) {
                boolean A0B;
                A0B = com.facebook.ads.redexgen.core.C5.this.A0B(message);
                return A0B;
            }
        });
        this.A0B = A0b;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread(A01(0, 25, 28));
        handlerThread.start();
        this.A0C = new com.facebook.ads.redexgen.core.C2(handlerThread, interfaceC2052nw, cj, A0b, this.A01, this.A02, this.A07);
        com.facebook.ads.redexgen.core.CT requirementsListener = new com.facebook.ads.redexgen.core.CT() { // from class: com.facebook.ads.redexgen.X.o2
            @Override // com.facebook.ads.redexgen.core.CT
            public final void AFh(com.facebook.ads.redexgen.core.CX cx, int i) {
                com.facebook.ads.redexgen.core.C5.this.A07(cx, i);
            }
        };
        this.A0E = requirementsListener;
        this.A05 = new com.facebook.ads.redexgen.core.CX(context, requirementsListener, A0I);
        this.A03 = this.A05.A09();
        this.A04 = 1;
        this.A0C.obtainMessage(0, this.A03, 0).sendToTarget();
    }

    public static com.facebook.ads.redexgen.core.C0598Bk A00(com.facebook.ads.redexgen.core.C0598Bk c0598Bk, com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest downloadRequest, int i, long j) {
        long j2;
        int i2;
        int i3 = c0598Bk.A02;
        if (i3 == 5 || c0598Bk.A02()) {
            j2 = j;
        } else {
            j2 = c0598Bk.A05;
        }
        if (i3 == 5 || i3 == 7) {
            i2 = 7;
        } else if (i != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        return new com.facebook.ads.redexgen.core.C0598Bk(c0598Bk.A07.A02(downloadRequest), i2, j2, j, -1L, i, 0);
    }

    private void A02() {
        java.util.Iterator<com.facebook.ads.redexgen.core.C4> it = this.A0F.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0H[2].charAt(11) == 'k') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0H;
            strArr[4] = "SmTtusU6hPZNCMRD5EytmTKQlQAuGgF";
            strArr[7] = "GYCdxmdyxLWQsNM7s6qdd5Bkhe8SJ7C";
            if (hasNext) {
                com.facebook.ads.redexgen.core.C4 listener = it.next();
                listener.AGf(this, this.A09);
            } else {
                return;
            }
        }
    }

    private void A04(int i, int i2) {
        this.A04 -= i;
        this.A00 = i2;
        if (A0I()) {
            java.util.Iterator<com.facebook.ads.redexgen.core.C4> it = this.A0F.iterator();
            while (it.hasNext()) {
                it.next().AE6(this);
            }
        }
    }

    private void A05(com.facebook.ads.redexgen.core.C0 c0) {
        this.A06 = java.util.Collections.unmodifiableList(c0.A02);
        com.facebook.ads.redexgen.core.C0598Bk c0598Bk = c0.A00;
        boolean A0A = A0A();
        if (c0.A03) {
            java.util.Iterator<com.facebook.ads.redexgen.core.C4> it = this.A0F.iterator();
            while (it.hasNext()) {
                it.next().ADi(this, c0598Bk);
            }
        } else {
            java.util.Iterator<com.facebook.ads.redexgen.core.C4> it2 = this.A0F.iterator();
            while (true) {
                boolean hasNext = it2.hasNext();
                if (A0H[5].charAt(25) == 'r') {
                    throw new java.lang.RuntimeException();
                }
                A0H[5] = "ysMk9cu0SrkjVTb8eZ5DX1SyqV41ya5j";
                if (!hasNext) {
                    break;
                } else {
                    it2.next().ADh(this, c0598Bk, c0.A01);
                }
            }
        }
        if (A0A) {
            A02();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(com.facebook.ads.redexgen.core.CX cx, int i) {
        com.facebook.ads.androidx.media3.exoplayer.scheduler.Requirements A0A = cx.A0A();
        if (this.A03 != i) {
            this.A03 = i;
            this.A04++;
            this.A0C.obtainMessage(2, i, 0).sendToTarget();
        }
        boolean A0A2 = A0A();
        java.util.Iterator<com.facebook.ads.redexgen.core.C4> it = this.A0F.iterator();
        while (it.hasNext()) {
            it.next().AFg(this, A0A, i);
        }
        if (A0A2) {
            A02();
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0017 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A08(java.util.List<com.facebook.ads.redexgen.core.C0598Bk> list) {
        this.A08 = true;
        this.A06 = java.util.Collections.unmodifiableList(list);
        boolean A0A = A0A();
        java.util.Iterator<com.facebook.ads.redexgen.core.C4> it = this.A0F.iterator();
        while (waitingForRequirementsChanged) {
            it.next().AEB(this);
        }
        if (A0A) {
            A02();
        }
    }

    private void A09(boolean z) {
        if (this.A07 == z) {
            return;
        }
        this.A07 = z;
        this.A04++;
        this.A0C.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
        boolean A0A = A0A();
        java.util.Iterator<com.facebook.ads.redexgen.core.C4> it = this.A0F.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (A0A) {
            A02();
        }
    }

    private boolean A0A() {
        boolean z = false;
        boolean waitingForRequirements = this.A07;
        if (!waitingForRequirements && this.A03 != 0) {
            int i = 0;
            while (true) {
                if (i >= this.A06.size()) {
                    break;
                }
                if (this.A06.get(i).A02 == 0) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        boolean waitingForRequirements2 = this.A09;
        boolean z2 = waitingForRequirements2 != z;
        this.A09 = z;
        java.lang.String[] strArr = A0H;
        if (strArr[4].length() != strArr[7].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0H;
        strArr2[4] = "HT4e9GATQ3DYWsFwZyJzXpwOkn6HfQP";
        strArr2[7] = "eDZDx6DsGZ1y85uRp2IzKIBDtNa9GCG";
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0B(android.os.Message message) {
        switch (message.what) {
            case 0:
                A08((java.util.List) message.obj);
                return true;
            case 1:
                int i = message.arg1;
                int i2 = message.arg2;
                if (A0H[2].charAt(11) == 'k') {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A0H;
                strArr[3] = "sxyw1qPQ7JLPTOY8e9sgs42WDZnpuN2t";
                strArr[6] = "KeBMIxstq15Te8zzUw5dJy9ueqCuctUt";
                A04(i, i2);
                return true;
            case 2:
                com.facebook.ads.redexgen.core.C0 update = (com.facebook.ads.redexgen.core.C0) message.obj;
                A05(update);
                return true;
            default:
                throw new java.lang.IllegalStateException();
        }
    }

    public final java.util.List<com.facebook.ads.redexgen.core.C0598Bk> A0D() {
        return this.A06;
    }

    public final void A0E() {
        A09(false);
    }

    public final void A0F(com.facebook.ads.redexgen.core.C4 c4) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(c4);
        this.A0F.add(c4);
    }

    public final void A0G(com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest downloadRequest) {
        A0H(downloadRequest, 0);
    }

    public final void A0H(com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest downloadRequest, int i) {
        this.A04++;
        this.A0C.obtainMessage(6, i, 0, downloadRequest).sendToTarget();
    }

    public final boolean A0I() {
        return this.A00 == 0 && this.A04 == 0;
    }
}
