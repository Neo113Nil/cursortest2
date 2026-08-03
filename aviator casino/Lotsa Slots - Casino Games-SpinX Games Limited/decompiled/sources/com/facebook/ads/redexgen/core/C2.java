package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class C2 extends android.os.Handler {
    public static byte[] A0D;
    public static java.lang.String[] A0E = {"iNmXvBj9FTihCrbZiC4S7zhCL1s9H33W", "EvGedAo1NbwIZrU2eJLjABwCKULHNO", "OhLMnivBPD1ct3YE1XOZQ5ppblACA0SV", "Bbpc8NZfeBPLrlsLcOoRpsaFZoo07Ukk", "cYMMpvUaIb0CtoOD5hU2j4Ih7c76pz", "QlCwnx", "3GDIv0eUOBpBneHy6OJWPXV1MBWevv42", "cGd21R9dzjO1"};
    public boolean A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public boolean A05;
    public boolean A06;
    public final android.os.Handler A07;
    public final android.os.HandlerThread A08;
    public final com.facebook.ads.redexgen.core.CJ A09;
    public final com.facebook.ads.redexgen.core.InterfaceC2052nw A0A;
    public final java.util.ArrayList<com.facebook.ads.redexgen.core.C0598Bk> A0B;
    public final java.util.HashMap<java.lang.String, com.facebook.ads.redexgen.core.C2056o0> A0C;

    public static java.lang.String A08(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 73);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0D() {
        A0D = new byte[]{-42, -54, -9, 34, 42, 33, com.google.common.base.Ascii.US, 34, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.ETB, 0, com.google.common.base.Ascii.DC4, 33, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.CAN, 37, -61, -34, -26, -23, -30, -31, -99, -15, -20, -99, -23, -20, -34, -31, -99, -31, -20, -12, -21, -23, -20, -34, -31, -73, -99, -109, -82, -74, -71, -78, -79, 109, -63, -68, 109, -71, -68, -82, -79, 109, -79, -68, -60, -69, -71, -68, -82, -79, -64, 123, -99, -72, -64, -61, -68, -69, 119, -53, -58, 119, -61, -58, -72, -69, 119, -64, -59, -69, -68, -49, -123, -87, -60, -52, -49, -56, -57, -125, -41, -46, -125, -43, -56, -48, -46, -39, -56, -125, -55, -43, -46, -48, -125, -57, -60, -41, -60, -59, -60, -42, -56, -109, -82, -74, -71, -78, -79, 109, -63, -68, 109, -65, -78, -70, -68, -61, -78, 109, -69, -68, -69, -78, -59, -74, -64, -63, -78, -69, -63, 109, -79, -68, -60, -69, -71, -68, -82, -79, -121, 109, -12, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SUB, 19, com.google.common.base.Ascii.DC2, -50, 34, com.google.common.base.Ascii.GS, -50, 33, 19, 34, -50, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.FS, 35, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SUB, -50, 33, 34, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.RS, -50, 32, 19, com.google.common.base.Ascii.SI, 33, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.FS, -113, -86, -78, -75, -82, -83, 105, -67, -72, 105, -68, -82, -67, 105, -74, -86, -73, -66, -86, -75, 105, -68, -67, -72, -71, 105, -69, -82, -86, -68, -72, -73, -125, 105, -67, -40, -32, -29, -36, -37, -105, -21, -26, -105, -20, -25, -37, -40, -21, -36, -105, -32, -27, -37, -36, -17, -91, -13, 0, com.google.common.base.Ascii.DC2, 10, -65, 5, 0, 8, com.google.common.base.Ascii.VT, 4, 3, -39, -65};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A0Q(com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest downloadRequest, int i) {
        com.facebook.ads.redexgen.core.C0598Bk A06 = A06(downloadRequest.A02, true);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (A06 != null) {
            A03(com.facebook.ads.redexgen.core.C5.A00(A06, downloadRequest, i, currentTimeMillis));
        } else {
            A03(new com.facebook.ads.redexgen.core.C0598Bk(downloadRequest, i != 0 ? 1 : 0, currentTimeMillis, currentTimeMillis, -1L, i, 0));
        }
        A0B();
    }

    static {
        A0D();
    }

    public C2(android.os.HandlerThread handlerThread, com.facebook.ads.redexgen.core.InterfaceC2052nw interfaceC2052nw, com.facebook.ads.redexgen.core.CJ cj, android.os.Handler handler, int i, int i2, boolean z) {
        super(handlerThread.getLooper());
        this.A08 = handlerThread;
        this.A0A = interfaceC2052nw;
        this.A09 = cj;
        this.A07 = handler;
        this.A02 = i;
        this.A03 = i2;
        this.A05 = z;
        this.A0B = new java.util.ArrayList<>();
        this.A0C = new java.util.HashMap<>();
    }

    public static int A00(com.facebook.ads.redexgen.core.C0598Bk c0598Bk, com.facebook.ads.redexgen.core.C0598Bk c0598Bk2) {
        return com.facebook.ads.redexgen.core.C5C.A08(c0598Bk.A05, c0598Bk2.A05);
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int A02(java.lang.String str) {
        for (int i = 0; i < i; i++) {
            com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest downloadRequest = this.A0B.get(i).A07;
            java.lang.String[] strArr = A0E;
            java.lang.String str2 = strArr[4];
            java.lang.String str3 = strArr[2];
            int length = str2.length();
            int i2 = str3.length();
            if (length == i2) {
                throw new java.lang.RuntimeException();
            }
            A0E[6] = "id4WW5MNYn317aHfBDbhwYGK6MIHb4Bm";
            if (downloadRequest.A02.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    private com.facebook.ads.redexgen.core.C0598Bk A03(com.facebook.ads.redexgen.core.C0598Bk c0598Bk) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08((c0598Bk.A02 == 3 || c0598Bk.A02 == 4) ? false : true);
        int A02 = A02(c0598Bk.A07.A02);
        if (A02 == -1) {
            this.A0B.add(c0598Bk);
            java.util.Collections.sort(this.A0B, new com.facebook.ads.redexgen.core.C1());
        } else {
            boolean z = c0598Bk.A05 != this.A0B.get(A02).A05;
            this.A0B.set(A02, c0598Bk);
            if (z) {
                java.util.Collections.sort(this.A0B, new com.facebook.ads.redexgen.core.C1());
            }
        }
        try {
            this.A0A.AHF(c0598Bk);
        } catch (java.io.IOException e) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A08(A08(2, 15, 106), A08(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 23, 46), e);
        }
        this.A07.obtainMessage(2, new com.facebook.ads.redexgen.core.C0(c0598Bk, false, new java.util.ArrayList(this.A0B), null)).sendToTarget();
        return c0598Bk;
    }

    private com.facebook.ads.redexgen.core.C0598Bk A04(com.facebook.ads.redexgen.core.C0598Bk c0598Bk, int i, int i2) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08((i == 3 || i == 4) ? false : true);
        return A03(A05(c0598Bk, i, i2));
    }

    public static com.facebook.ads.redexgen.core.C0598Bk A05(com.facebook.ads.redexgen.core.C0598Bk c0598Bk, int i, int i2) {
        return new com.facebook.ads.redexgen.core.C0598Bk(c0598Bk.A07, i, c0598Bk.A05, java.lang.System.currentTimeMillis(), c0598Bk.A04, i2, 0, c0598Bk.A00);
    }

    private com.facebook.ads.redexgen.core.C0598Bk A06(java.lang.String str, boolean z) {
        int A02 = A02(str);
        if (A02 != -1) {
            return this.A0B.get(A02);
        }
        if (z) {
            try {
                return this.A0A.A7q(str);
            } catch (java.io.IOException e) {
                com.facebook.ads.redexgen.core.AbstractC04284g.A08(A08(2, 15, 106), A08(17, 25, 52) + str, e);
                return null;
            }
        }
        return null;
    }

    private com.facebook.ads.redexgen.core.C2056o0 A07(com.facebook.ads.redexgen.core.C2056o0 c2056o0, com.facebook.ads.redexgen.core.C0598Bk c0598Bk) {
        boolean z;
        if (c2056o0 == null) {
            if (A0U() && this.A01 < this.A02) {
                com.facebook.ads.redexgen.core.C0598Bk A04 = A04(c0598Bk, 2, 0);
                com.facebook.ads.redexgen.core.C2056o0 c2056o02 = new com.facebook.ads.redexgen.core.C2056o0(A04.A07, this.A09.A5M(A04.A07), A04.A00, false, this.A03, this);
                this.A0C.put(A04.A07.A02, c2056o02);
                int i = this.A01;
                this.A01 = i + 1;
                if (i == 0) {
                    sendEmptyMessageDelayed(11, 5000L);
                }
                c2056o02.start();
                return c2056o02;
            }
            return null;
        }
        z = c2056o0.A06;
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(!z);
        c2056o0.A05(false);
        return c2056o0;
    }

    private void A09() {
        java.util.Iterator<com.facebook.ads.redexgen.core.C2056o0> it = this.A0C.values().iterator();
        while (it.hasNext()) {
            it.next().A05(true);
        }
        try {
            this.A0A.AJO();
        } catch (java.io.IOException e) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A08(A08(2, 15, 106), A08(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 23, 46), e);
        }
        this.A0B.clear();
        this.A08.quit();
        synchronized (this) {
            this.A00 = true;
            notifyAll();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0A() {
        java.lang.String A08 = A08(2, 15, 106);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            com.facebook.ads.redexgen.core.C2059o4 A7r = this.A0A.A7r(3, 4);
            while (A7r.A01()) {
                try {
                    arrayList.add(A7r.A00());
                } finally {
                }
            }
            if (A7r != null) {
                A7r.close();
            }
        } catch (java.io.IOException unused) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A05(A08, A08(42, 25, 4));
        }
        for (int i = 0; i < this.A0B.size(); i++) {
            this.A0B.set(i, A05(this.A0B.get(i), 5, 0));
        }
        int i2 = 0;
        while (true) {
            int size = arrayList.size();
            if (A0E[6].charAt(14) != 'H') {
                break;
            }
            java.lang.String[] strArr = A0E;
            strArr[1] = "XqOejHHacjjZLx98zpLnY1LZJhfsrk";
            strArr[7] = "zG4BgrMO4aUj";
            if (i2 < size) {
                java.util.ArrayList<com.facebook.ads.redexgen.core.C0598Bk> arrayList2 = this.A0B;
                com.facebook.ads.redexgen.core.C0598Bk c0598Bk = (com.facebook.ads.redexgen.core.C0598Bk) arrayList.get(i2);
                java.lang.String[] strArr2 = A0E;
                if (strArr2[4].length() == strArr2[2].length()) {
                    break;
                }
                A0E[3] = "KT3y83B5rUupwCjllTydcOADIPFLf4ae";
                arrayList2.add(A05(c0598Bk, 5, 0));
                i2++;
            } else {
                java.util.List<com.facebook.ads.androidx.media3.exoplayer.offline.Download> terminalDownloads = this.A0B;
                java.util.Collections.sort(terminalDownloads, new com.facebook.ads.redexgen.core.C1());
                try {
                    this.A0A.AJp();
                } catch (java.io.IOException e) {
                    com.facebook.ads.redexgen.core.AbstractC04284g.A08(A08, A08(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 23, 46), e);
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList(this.A0B);
                for (int i3 = 0; i3 < this.A0B.size(); i3++) {
                    this.A07.obtainMessage(2, new com.facebook.ads.redexgen.core.C0(this.A0B.get(i3), false, arrayList3, null)).sendToTarget();
                }
                A0B();
                return;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0008 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0B() {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < accumulatingDownloadTaskCount; i2++) {
            com.facebook.ads.redexgen.core.C0598Bk download = this.A0B.get(i2);
            com.facebook.ads.redexgen.core.C2056o0 c2056o0 = this.A0C.get(download.A07.A02);
            int accumulatingDownloadTaskCount = download.A02;
            switch (accumulatingDownloadTaskCount) {
                case 0:
                    c2056o0 = A07(c2056o0, download);
                    break;
                case 1:
                    A0M(c2056o0);
                    break;
                case 2:
                    com.facebook.ads.redexgen.core.AbstractC04203y.A01(c2056o0);
                    A0P(c2056o0, download, i);
                    break;
                case 3:
                case 4:
                case 6:
                default:
                    throw new java.lang.IllegalStateException();
                case 5:
                case 7:
                    A0O(c2056o0, download);
                    break;
            }
            if (c2056o0 != null) {
                z = c2056o0.A06;
                if (!z) {
                    i++;
                }
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0C() {
        for (int i = 0; i < i; i++) {
            com.facebook.ads.redexgen.core.C0598Bk c0598Bk = this.A0B.get(i);
            if (c0598Bk.A02 == 2) {
                try {
                    this.A0A.AHF(c0598Bk);
                } catch (java.io.IOException e) {
                    com.facebook.ads.redexgen.core.AbstractC04284g.A08(A08(2, 15, 106), A08(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 23, 46), e);
                }
            }
        }
        sendEmptyMessageDelayed(11, 5000L);
    }

    private void A0E(int i) {
        this.A04 = i;
        com.facebook.ads.redexgen.core.C2059o4 c2059o4 = null;
        try {
            try {
                this.A0A.AJO();
                c2059o4 = this.A0A.A7r(0, 1, 2, 5, 7);
                while (c2059o4.A01()) {
                    this.A0B.add(c2059o4.A00());
                }
            } catch (java.io.IOException e) {
                com.facebook.ads.redexgen.core.AbstractC04284g.A08(A08(2, 15, 106), A08(67, 21, 14), e);
                this.A0B.clear();
            }
            com.facebook.ads.redexgen.core.C5C.A10(c2059o4);
            this.A07.obtainMessage(0, new java.util.ArrayList(this.A0B)).sendToTarget();
            A0B();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.C5C.A10(c2059o4);
            throw th;
        }
    }

    private void A0F(int i) {
        this.A02 = i;
        A0B();
    }

    private void A0G(int i) {
        this.A03 = i;
    }

    private void A0H(int i) {
        this.A04 = i;
        A0B();
    }

    private void A0I(com.facebook.ads.redexgen.core.C0598Bk c0598Bk) {
        if (c0598Bk.A02 == 7) {
            int i = c0598Bk.A03 == 0 ? 0 : 1;
            int state = c0598Bk.A03;
            A04(c0598Bk, i, state);
            A0B();
            return;
        }
        this.A0B.remove(A02(c0598Bk.A07.A02));
        try {
            this.A0A.AIR(c0598Bk.A07.A02);
        } catch (java.io.IOException unused) {
            java.lang.String A08 = A08(2, 15, 106);
            java.lang.String[] strArr = A0E;
            java.lang.String str = strArr[1];
            java.lang.String str2 = strArr[7];
            int length = str.length();
            int removeIndex = str2.length();
            if (length == removeIndex) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0E;
            strArr2[4] = "0mOws7zeqclkbY70VWtV8amCVjdjwc";
            strArr2[2] = "5byiBwQrvMTmrLaxdcHCyvzuNe0iHvcw";
            com.facebook.ads.redexgen.core.AbstractC04284g.A05(A08, A08(88, 30, 26));
        }
        this.A07.obtainMessage(2, new com.facebook.ads.redexgen.core.C0(c0598Bk, true, new java.util.ArrayList(this.A0B), null)).sendToTarget();
    }

    private void A0J(com.facebook.ads.redexgen.core.C0598Bk c0598Bk, int i) {
        if (i == 0) {
            if (c0598Bk.A02 == 1) {
                A04(c0598Bk, 0, 0);
                return;
            }
            return;
        }
        int i2 = c0598Bk.A03;
        if (A0E[6].charAt(14) != 'H') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0E;
        strArr[4] = "qDoL4xVSTO8RDQU7ZVoZcH2BhkCOc4";
        strArr[2] = "ugBXxeG19GlyVlR2WcoXaVyqVtSsbrKH";
        if (i == i2) {
            return;
        }
        int i3 = c0598Bk.A02;
        if (i3 == 0 || i3 == 2) {
            i3 = 1;
        }
        A03(new com.facebook.ads.redexgen.core.C0598Bk(c0598Bk.A07, i3, c0598Bk.A05, java.lang.System.currentTimeMillis(), c0598Bk.A04, i, 0, c0598Bk.A00));
    }

    private void A0K(com.facebook.ads.redexgen.core.C0598Bk c0598Bk, java.lang.Exception exc) {
        int i;
        com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest downloadRequest = c0598Bk.A07;
        int i2 = exc == null ? 3 : 4;
        long j = c0598Bk.A05;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j2 = c0598Bk.A04;
        int i3 = c0598Bk.A03;
        if (exc == null) {
            i = 0;
        } else {
            i = 1;
        }
        com.facebook.ads.redexgen.core.C0598Bk c0598Bk2 = new com.facebook.ads.redexgen.core.C0598Bk(downloadRequest, i2, j, currentTimeMillis, j2, i3, i, c0598Bk.A00);
        this.A0B.remove(A02(c0598Bk2.A07.A02));
        try {
            this.A0A.AHF(c0598Bk2);
        } catch (java.io.IOException e) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A08(A08(2, 15, 106), A08(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 23, 46), e);
        }
        this.A07.obtainMessage(2, new com.facebook.ads.redexgen.core.C0(c0598Bk2, false, new java.util.ArrayList(this.A0B), exc)).sendToTarget();
    }

    private void A0L(com.facebook.ads.redexgen.core.C2056o0 c2056o0) {
        com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest downloadRequest;
        boolean z;
        boolean z2;
        java.lang.Exception finalException;
        com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest downloadRequest2;
        downloadRequest = c2056o0.A04;
        java.lang.String str = downloadRequest.A02;
        this.A0C.remove(str);
        z = c2056o0.A06;
        if (z) {
            this.A06 = false;
        } else {
            int i = this.A01 - 1;
            this.A01 = i;
            if (i == 0) {
                removeMessages(11);
            }
        }
        z2 = c2056o0.A08;
        if (z2) {
            A0B();
            return;
        }
        finalException = c2056o0.A01;
        if (finalException != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String downloadId = A08(246, 13, 86);
            java.lang.StringBuilder append = sb.append(downloadId);
            downloadRequest2 = c2056o0.A04;
            java.lang.StringBuilder append2 = append.append(downloadRequest2);
            java.lang.String downloadId2 = A08(0, 2, 97);
            java.lang.String sb2 = append2.append(downloadId2).append(z).toString();
            java.lang.String downloadId3 = A08(2, 15, 106);
            com.facebook.ads.redexgen.core.AbstractC04284g.A08(downloadId3, sb2, finalException);
        }
        com.facebook.ads.redexgen.core.C0598Bk A06 = A06(str, false);
        if (A0E[3].charAt(4) != '8') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0E;
        strArr[4] = "ylCSlCHYxJLig8GFragBjcnbyuXWai";
        strArr[2] = "OMWcFhgpmCCD5KtgAO70M2kgxcAld7fK";
        com.facebook.ads.redexgen.core.C0598Bk c0598Bk = (com.facebook.ads.redexgen.core.C0598Bk) com.facebook.ads.redexgen.core.AbstractC04203y.A01(A06);
        switch (c0598Bk.A02) {
            case 2:
                com.facebook.ads.redexgen.core.AbstractC04203y.A08(!z);
                A0K(c0598Bk, finalException);
                break;
            case 3:
            case 4:
            case 6:
            default:
                throw new java.lang.IllegalStateException();
            case 5:
            case 7:
                com.facebook.ads.redexgen.core.AbstractC04203y.A08(z);
                A0I(c0598Bk);
                break;
        }
        A0B();
    }

    private void A0M(com.facebook.ads.redexgen.core.C2056o0 c2056o0) {
        boolean z;
        if (c2056o0 == null) {
            return;
        }
        z = c2056o0.A06;
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(!z);
        c2056o0.A05(false);
    }

    private void A0N(com.facebook.ads.redexgen.core.C2056o0 c2056o0, long j) {
        com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest downloadRequest;
        downloadRequest = c2056o0.A04;
        com.facebook.ads.redexgen.core.C0598Bk c0598Bk = (com.facebook.ads.redexgen.core.C0598Bk) com.facebook.ads.redexgen.core.AbstractC04203y.A01(A06(downloadRequest.A02, false));
        if (j == c0598Bk.A04 || j == -1) {
            return;
        }
        A03(new com.facebook.ads.redexgen.core.C0598Bk(c0598Bk.A07, c0598Bk.A02, c0598Bk.A05, java.lang.System.currentTimeMillis(), j, c0598Bk.A03, c0598Bk.A01, c0598Bk.A00));
    }

    private void A0O(com.facebook.ads.redexgen.core.C2056o0 c2056o0, com.facebook.ads.redexgen.core.C0598Bk c0598Bk) {
        boolean z;
        if (c2056o0 == null) {
            boolean z2 = this.A06;
            if (A0E[3].charAt(4) != '8') {
                throw new java.lang.RuntimeException();
            }
            A0E[0] = "e4XXQnURg6mIpThj5jyh4wOBvzx0EgPt";
            if (z2) {
                return;
            }
            com.facebook.ads.redexgen.core.C2056o0 c2056o02 = new com.facebook.ads.redexgen.core.C2056o0(c0598Bk.A07, this.A09.A5M(c0598Bk.A07), c0598Bk.A00, true, this.A03, this);
            this.A0C.put(c0598Bk.A07.A02, c2056o02);
            this.A06 = true;
            c2056o02.start();
            return;
        }
        z = c2056o0.A06;
        if (!z) {
            c2056o0.A05(false);
        }
    }

    private void A0P(com.facebook.ads.redexgen.core.C2056o0 c2056o0, com.facebook.ads.redexgen.core.C0598Bk c0598Bk, int i) {
        boolean z;
        z = c2056o0.A06;
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(!z);
        if (!A0U() || i >= this.A02) {
            A04(c0598Bk, 0, 0);
            c2056o0.A05(false);
        }
    }

    private void A0R(java.lang.String str) {
        com.facebook.ads.redexgen.core.C0598Bk A06 = A06(str, true);
        if (A06 == null) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A05(A08(2, 15, 106), A08(118, 39, 4) + str);
        } else {
            A04(A06, 5, 0);
            A0B();
        }
    }

    private void A0S(java.lang.String str, int i) {
        java.lang.String A08 = A08(2, 15, 106);
        if (str == null) {
            for (int i2 = 0; i2 < this.A0B.size(); i2++) {
                A0J(this.A0B.get(i2), i);
            }
            try {
                this.A0A.AJq(i);
            } catch (java.io.IOException e) {
                com.facebook.ads.redexgen.core.AbstractC04284g.A08(A08, A08(157, 32, 101), e);
            }
        } else {
            com.facebook.ads.redexgen.core.C0598Bk A06 = A06(str, false);
            if (A06 != null) {
                A0J(A06, i);
            } else {
                try {
                    this.A0A.AJr(str, i);
                } catch (java.io.IOException e2) {
                    com.facebook.ads.redexgen.core.AbstractC04284g.A08(A08, A08(189, 34, 0) + str, e2);
                }
            }
        }
        A0B();
    }

    private void A0T(boolean z) {
        this.A05 = z;
        A0B();
    }

    private boolean A0U() {
        if (!this.A05) {
            int i = this.A04;
            if (A0E[6].charAt(14) != 'H') {
                throw new java.lang.RuntimeException();
            }
            A0E[5] = "cfwXoVsCs";
            if (i == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        boolean z = true;
        try {
            switch (message.what) {
                case 0:
                    A0E(message.arg1);
                    break;
                case 1:
                    A0T(message.arg1 != 0);
                    break;
                case 2:
                    A0H(message.arg1);
                    break;
                case 3:
                    A0S((java.lang.String) message.obj, message.arg1);
                    break;
                case 4:
                    A0F(message.arg1);
                    break;
                case 5:
                    A0G(message.arg1);
                    break;
                case 6:
                    A0Q((com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest) message.obj, message.arg1);
                    break;
                case 7:
                    A0R((java.lang.String) message.obj);
                    break;
                case 8:
                    A0A();
                    break;
                case 9:
                    A0L((com.facebook.ads.redexgen.core.C2056o0) message.obj);
                    z = false;
                    break;
                case 10:
                    A0N((com.facebook.ads.redexgen.core.C2056o0) message.obj, com.facebook.ads.redexgen.core.C5C.A0N(message.arg1, message.arg2));
                    return;
                case 11:
                    A0C();
                    return;
                case 12:
                    A09();
                    return;
                default:
                    throw new java.lang.IllegalStateException();
            }
            this.A07.obtainMessage(1, z ? 1 : 0, this.A0C.size()).sendToTarget();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
