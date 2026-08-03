package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class RA {
    public static byte[] A09;
    public static java.lang.String[] A0A = {"", "d6jyZ4YF4aAx6mY2oyMV8cMH3x1tTmGX", "6ShmsSFKDmdiSeaEbVJI0pMmhv", "Jy6CLSdjiTJVmxisrmhO9od6ZqYVQGpz", "aKDRqPZxmSwbRmY5O7VQCqOvGq0yRVmO", "vr6xx06LqTBYtEPA9ZzozSqPDwzkbNaY", "Y84hViIy7qYskGYmJ3QVEouknT", ""};
    public com.facebook.ads.redexgen.core.R9 A01;
    public com.facebook.ads.redexgen.core.RI A04;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C7M A08;
    public final java.util.ArrayList<com.facebook.ads.redexgen.core.RK> A05 = new java.util.ArrayList<>();
    public java.util.ArrayList<com.facebook.ads.redexgen.core.RK> A02 = null;
    public final java.util.ArrayList<com.facebook.ads.redexgen.core.RK> A06 = new java.util.ArrayList<>();
    public final java.util.List<com.facebook.ads.redexgen.core.RK> A07 = java.util.Collections.unmodifiableList(this.A05);
    public int A03 = 2;
    public int A00 = 2;

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 10);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A05() {
        A09 = new byte[]{113, 56, 34, com.google.common.base.Ascii.DLE, 37, 37, 48, 50, 57, 52, 53, 107, 56, 86, 17, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.ESC, 10, 68, 32, 39, 41, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 125, 108, 100, 41, 106, 102, 124, 103, 125, 51, 79, 72, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC2, 7, com.google.common.base.Ascii.DC2, 3, 92, 121, 91, 86, 86, 95, 94, com.google.common.base.Ascii.SUB, 73, 89, 72, 91, 74, com.google.common.base.Ascii.SUB, 76, 83, 95, 77, com.google.common.base.Ascii.SUB, 77, 83, 78, 82, com.google.common.base.Ascii.SUB, 91, 84, com.google.common.base.Ascii.SUB, 83, 84, 76, 91, 86, 83, 94, com.google.common.base.Ascii.SUB, 76, 83, 95, 77, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.SUB, 115, 84, 76, 91, 86, 83, 94, com.google.common.base.Ascii.SUB, 76, 83, 95, 77, 73, com.google.common.base.Ascii.SUB, 89, 91, 84, 84, 85, 78, com.google.common.base.Ascii.SUB, 88, 95, com.google.common.base.Ascii.SUB, 72, 95, 79, 73, 95, 94, com.google.common.base.Ascii.SUB, 92, 72, 85, 87, com.google.common.base.Ascii.SUB, 73, 89, 72, 91, 74, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.SUB, 78, 82, 95, 67, com.google.common.base.Ascii.SUB, 73, 82, 85, 79, 86, 94, com.google.common.base.Ascii.SUB, 72, 95, 88, 85, 79, 84, 94, com.google.common.base.Ascii.SUB, 92, 72, 85, 87, com.google.common.base.Ascii.SUB, 72, 95, 89, 67, 89, 86, 95, 72, com.google.common.base.Ascii.SUB, 74, 85, 85, 86, com.google.common.base.Ascii.DC4, 116, 83, 94, 82, 83, 78, 84, 78, 73, 88, 83, 94, 68, com.google.common.base.Ascii.GS, 89, 88, 73, 88, 94, 73, 88, 89, 19, com.google.common.base.Ascii.GS, 116, 83, 75, 92, 81, 84, 89, com.google.common.base.Ascii.GS, 84, 73, 88, 80, com.google.common.base.Ascii.GS, 77, 82, 78, 84, 73, 84, 82, 83, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.US, 56, 53, 57, 56, 37, 63, 37, 34, 51, 56, 53, 47, 118, 50, 51, 34, 51, 53, 34, 51, 50, 120, 118, com.google.common.base.Ascii.US, 56, 32, 55, 58, 63, 50, 118, 32, 63, 51, 33, 118, 62, 57, 58, 50, 51, 36, 118, 55, 50, 55, 38, 34, 51, 36, 118, 38, 57, 37, 63, 34, 63, 57, 56, 89, 126, 102, 113, 124, 121, 116, 48, 121, 100, 117, 125, 48, 96, Byte.MAX_VALUE, 99, 121, 100, 121, Byte.MAX_VALUE, 126, 48, com.google.common.base.Ascii.DC2, 34, 51, 32, 49, 49, 36, 37, 97, 46, 51, 97, 32, 53, 53, 32, 34, 41, 36, 37, 97, 55, 40, 36, 54, 50, 97, 44, 32, 56, 97, 47, 46, 53, 97, 35, 36, 97, 51, 36, 34, 56, 34, 45, 36, 37, 111, 97, 40, 50, com.google.common.base.Ascii.DC2, 34, 51, 32, 49, 123, 108, 85, 72, com.google.common.base.Ascii.CAN, 92, 93, 76, 89, 91, 80, 93, 92, com.google.common.base.Ascii.CAN, 78, 81, 93, 79, com.google.common.base.Ascii.CAN, 75, 80, 87, 77, 84, 92, com.google.common.base.Ascii.CAN, 90, 93, com.google.common.base.Ascii.CAN, 74, 93, 85, 87, 78, 93, 92, com.google.common.base.Ascii.CAN, 94, 74, 87, 85, com.google.common.base.Ascii.CAN, 106, 93, 91, 65, 91, 84, 93, 74, 110, 81, 93, 79, com.google.common.base.Ascii.CAN, 90, 93, 94, 87, 74, 93, com.google.common.base.Ascii.CAN, 81, 76, com.google.common.base.Ascii.CAN, 91, 89, 86, com.google.common.base.Ascii.CAN, 90, 93, com.google.common.base.Ascii.CAN, 74, 93, 91, 65, 91, 84, 93, 92, 2, com.google.common.base.Ascii.CAN, 87, 113, 122, 106, 109, 100, 35, 119, 108, 35, 113, 102, 96, 122, 96, 111, 102, 35, 98, 109, 35, 106, 100, 109, 108, 113, 102, 103, 35, 117, 106, 102, 116, 35, 107, 108, 111, 103, 102, 113, 45, 35, 90, 108, 118, 35, 112, 107, 108, 118, 111, 103, 35, 101, 106, 113, 112, 119, 35, 96, 98, 111, 111, 35, 112, 119, 108, 115, 74, 100, 109, 108, 113, 106, 109, 100, 85, 106, 102, 116, 43, 117, 106, 102, 116, 42, 35, 97, 102, 101, 108, 113, 102, 35, 96, 98, 111, 111, 106, 109, 100, 35, 113, 102, 96, 122, 96, 111, 102, 45, 48, 50, 35, 1, 62, 50, 32, 17, 56, 37, 7, 56, 36, 62, 35, 62, 56, 57, com.google.common.base.Ascii.SYN, 57, 51, 3, 46, 39, 50, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.DLE, 8, com.google.common.base.Ascii.RS, 4, 5, 81, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC4, 9, 81, 2, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.RS, 4, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.NAK, 81, com.google.common.base.Ascii.US, com.google.common.base.Ascii.RS, 5, 81, 19, com.google.common.base.Ascii.DC4, 81, 92, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 81, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.ETB, 5, com.google.common.base.Ascii.DC4, 3, 81, 4, com.google.common.base.Ascii.US, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.US, com.google.common.base.Ascii.SYN, 81, com.google.common.base.Ascii.DLE, 81, 7, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.DC4, 6, 75, 69, 68, 124, 67, 79, 93, 120, 79, 73, 83, 73, 70, 79, 78};
    }

    static {
        A05();
    }

    public RA(com.facebook.ads.redexgen.core.C7M c7m) {
        this.A08 = c7m;
    }

    private final android.view.View A00(int i, boolean z) {
        return A0I(i, z, Long.MAX_VALUE).A0H;
    }

    private final com.facebook.ads.redexgen.core.RK A01(int i) {
        int size;
        int A04;
        if (this.A02 == null || (size = this.A02.size()) == 0) {
            return null;
        }
        for (int i2 = 0; i2 < size; i2++) {
            com.facebook.ads.redexgen.core.RK rk = this.A02.get(i2);
            if (!rk.A0m()) {
                int i3 = rk.A0O();
                if (i3 == i) {
                    rk.A0Z(32);
                    return rk;
                }
            }
        }
        if (this.A08.A04.A0M() && (A04 = this.A08.A00.A04(i)) > 0) {
            int offsetPosition = this.A08.A04.A0B();
            if (A04 < offsetPosition) {
                long A0D = this.A08.A04.A0D(A04);
                for (int i4 = 0; i4 < size; i4++) {
                    com.facebook.ads.redexgen.core.RK rk2 = this.A02.get(i4);
                    if (!rk2.A0m() && rk2.A0Q() == A0D) {
                        rk2.A0Z(32);
                        return rk2;
                    }
                }
            }
        }
        return null;
    }

    private final com.facebook.ads.redexgen.core.RK A02(int i, boolean z) {
        android.view.View A08;
        int size = this.A05.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.facebook.ads.redexgen.core.RK rk = this.A05.get(i2);
            if (!rk.A0m()) {
                int scrapCount = rk.A0O();
                if (scrapCount == i && !rk.A0f() && (this.A08.A0s.A09 || !rk.A0g())) {
                    rk.A0Z(32);
                    return rk;
                }
            }
        }
        if (!z && (A08 = this.A08.A01.A08(i)) != null) {
            com.facebook.ads.redexgen.core.RK A0F = com.facebook.ads.redexgen.core.C7M.A0F(A08);
            this.A08.A01.A0G(A08);
            int A07 = this.A08.A01.A07(A08);
            if (A07 != -1) {
                this.A08.A01.A0C(A07);
                A0S(A08);
                A0F.A0Z(8224);
                return A0F;
            }
            throw new java.lang.IllegalStateException(A04(565, 52, 123) + A0F + this.A08.A1J());
        }
        int size2 = this.A06.size();
        for (int i3 = 0; i3 < size2; i3++) {
            com.facebook.ads.redexgen.core.RK holder = this.A06.get(i3);
            java.lang.String[] strArr = A0A;
            java.lang.String str = strArr[7];
            java.lang.String str2 = strArr[0];
            int cacheSize = str.length();
            int scrapCount2 = str2.length();
            if (cacheSize != scrapCount2) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0A;
            strArr2[4] = "JIr6ryR6hWTh2WYmHdarh5TP4xAypylw";
            strArr2[1] = "npmC62BAQEqZygYceoAiNhkQGghR92x0";
            if (!holder.A0f()) {
                int scrapCount3 = holder.A0O();
                if (scrapCount3 == i) {
                    if (!z) {
                        this.A06.remove(i3);
                    }
                    return holder;
                }
            }
        }
        return null;
    }

    private final com.facebook.ads.redexgen.core.RK A03(long j, int i, boolean z) {
        int count = this.A05.size();
        for (int i2 = count - 1; i2 >= 0; i2--) {
            com.facebook.ads.redexgen.core.RK rk = this.A05.get(i2);
            if (rk.A0Q() == j && !rk.A0m()) {
                int count2 = rk.A0N();
                if (i == count2) {
                    rk.A0Z(32);
                    boolean A0g = rk.A0g();
                    java.lang.String[] strArr = A0A;
                    java.lang.String str = strArr[2];
                    java.lang.String str2 = strArr[6];
                    int i3 = str.length();
                    int count3 = str2.length();
                    if (i3 == count3) {
                        java.lang.String[] strArr2 = A0A;
                        strArr2[4] = "3Wf6vMFZ4V6K3VYEAeXlgILB3Kqn8tmj";
                        strArr2[1] = "2gRFj7AUivxslEY3Do0gPT185jjA6g6i";
                        if (A0g && !this.A08.A0s.A07()) {
                            rk.A0a(2, 14);
                        }
                        return rk;
                    }
                } else if (z) {
                    continue;
                } else {
                    this.A05.remove(i2);
                    com.facebook.ads.redexgen.core.C7M c7m = this.A08;
                    android.view.View view = rk.A0H;
                    java.lang.String[] strArr3 = A0A;
                    java.lang.String str3 = strArr3[7];
                    java.lang.String str4 = strArr3[0];
                    int i4 = str3.length();
                    int count4 = str4.length();
                    if (i4 == count4) {
                        java.lang.String[] strArr4 = A0A;
                        strArr4[5] = "QSy8SYzj9TGZXONlvrRd2Hl7xNggaX2t";
                        strArr4[3] = "FStY7c67BTbAcWAeNWEJdNOuKPlMCdqH";
                        c7m.removeDetachedView(view, false);
                        A0R(rk.A0H);
                    }
                }
                throw new java.lang.RuntimeException();
            }
        }
        int count5 = this.A06.size();
        for (int i5 = count5 - 1; i5 >= 0; i5--) {
            com.facebook.ads.redexgen.core.RK rk2 = this.A06.get(i5);
            if (rk2.A0Q() == j) {
                int count6 = rk2.A0N();
                if (i == count6) {
                    if (!z) {
                        this.A06.remove(i5);
                    }
                    return rk2;
                }
                if (!z) {
                    A07(i5);
                    java.lang.String[] strArr5 = A0A;
                    java.lang.String str5 = strArr5[7];
                    java.lang.String str6 = strArr5[0];
                    int cacheSize = str5.length();
                    int count7 = str6.length();
                    if (cacheSize != count7) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr6 = A0A;
                    strArr6[2] = "Px4MCeB3tpw5Kws4bgsL6OQ2tD";
                    strArr6[6] = "cZzmTfGm3PDqBsfSjCaAnG9aB7";
                    return null;
                }
            }
        }
        return null;
    }

    private final void A06() {
        boolean z;
        int count = this.A06.size();
        for (int count2 = count - 1; count2 >= 0; count2--) {
            A07(count2);
        }
        this.A06.clear();
        z = com.facebook.ads.redexgen.core.C7M.A1E;
        if (z) {
            this.A08.A02.A02();
        }
    }

    private final void A07(int i) {
        A0Z(this.A06.get(i), true);
        this.A06.remove(i);
    }

    private void A08(android.view.ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            android.view.View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof android.view.ViewGroup) {
                A08((android.view.ViewGroup) childAt, true);
            }
        }
        if (!z) {
            return;
        }
        if (viewGroup.getVisibility() == 4) {
            viewGroup.setVisibility(0);
            viewGroup.setVisibility(4);
        } else {
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }
    }

    private void A09(com.facebook.ads.redexgen.core.RK rk) {
        if (this.A08.A1q()) {
            android.view.View view = rk.A0H;
            if (com.facebook.ads.redexgen.core.Ph.A00(view) == 0) {
                com.facebook.ads.redexgen.core.Ph.A09(view, 1);
            }
            if (com.facebook.ads.redexgen.core.Ph.A0F(view)) {
                return;
            }
            java.lang.String[] strArr = A0A;
            if (strArr[4].charAt(14) != strArr[1].charAt(14)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0A;
            strArr2[5] = "r5izwM6EITTd8J0QgfTuliuK3Ylx6gnH";
            strArr2[3] = "CLm8SGIYJT8sX0J5oMrTiG0qZUHKeksn";
            rk.A0Z(16384);
            com.facebook.ads.redexgen.core.Ph.A0B(view, this.A08.A09.A0A());
        }
    }

    private void A0A(com.facebook.ads.redexgen.core.RK rk) {
        if (rk.A0H instanceof android.view.ViewGroup) {
            A08((android.view.ViewGroup) rk.A0H, false);
        }
    }

    private final void A0B(com.facebook.ads.redexgen.core.RK rk) {
        if (0 != 0) {
            throw new java.lang.NullPointerException(A04(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_BANNER_CONTAINER_IS_NULL, 14, 32));
        }
        if (this.A08.A0s != null) {
            this.A08.A0t.A0B(rk);
        }
    }

    private final boolean A0C(com.facebook.ads.redexgen.core.RK rk) {
        if (rk.A0g()) {
            return this.A08.A0s.A07();
        }
        if (rk.A03 >= 0 && rk.A03 < this.A08.A04.A0B()) {
            if (!this.A08.A0s.A07()) {
                int A0C = this.A08.A04.A0C(rk.A03);
                int type = rk.A0N();
                if (A0C != type) {
                    return false;
                }
            }
            return !this.A08.A04.A0M() || rk.A0Q() == this.A08.A04.A0D(rk.A03);
        }
        throw new java.lang.IndexOutOfBoundsException(A04(211, 60, 92) + rk + this.A08.A1J());
    }

    private boolean A0D(com.facebook.ads.redexgen.core.RK rk, int i, int i2, long j) {
        rk.A08 = this.A08;
        int A0N = rk.A0N();
        long nanoTime = this.A08.getNanoTime();
        if (j != Long.MAX_VALUE && !this.A01.A0A(A0N, nanoTime, j)) {
            return false;
        }
        this.A08.A04.A0J(rk, i);
        this.A01.A05(rk.A0N(), this.A08.getNanoTime() - nanoTime);
        A09(rk);
        if (this.A08.A0s.A07()) {
            rk.A04 = i2;
            return true;
        }
        return true;
    }

    public final int A0E() {
        return this.A05.size();
    }

    public final android.view.View A0F(int i) {
        return this.A05.get(i).A0H;
    }

    public final android.view.View A0G(int i) {
        return A00(i, false);
    }

    public final com.facebook.ads.redexgen.core.R9 A0H() {
        if (this.A01 == null) {
            this.A01 = new com.facebook.ads.redexgen.core.R9();
        }
        return this.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0242, code lost:
    
        if (r6 == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0244, code lost:
    
        r5 = (com.facebook.ads.redexgen.core.R3) r22.A08.generateLayoutParams(r5);
        r11.A0H.setLayoutParams(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0261, code lost:
    
        r5 = (com.facebook.ads.redexgen.core.R3) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x025e, code lost:
    
        if (r6 == false) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.facebook.ads.redexgen.core.RK A0I(int i, boolean z, long j) {
        com.facebook.ads.redexgen.core.R3 r3;
        boolean fromScrapOrHiddenOrCache;
        com.facebook.ads.redexgen.core.C7M A0H;
        if (i >= 0 && i < this.A08.A0s.A03()) {
            boolean z2 = false;
            com.facebook.ads.redexgen.core.RK rk = null;
            boolean fromScrapOrHiddenOrCache2 = this.A08.A0s.A07();
            if (fromScrapOrHiddenOrCache2) {
                rk = A01(i);
                z2 = rk != null;
            }
            if (rk == null && (rk = A02(i, z)) != null) {
                boolean fromScrapOrHiddenOrCache3 = A0C(rk);
                if (!fromScrapOrHiddenOrCache3) {
                    if (!z) {
                        java.lang.String[] strArr = A0A;
                        if (strArr[2].length() == strArr[6].length()) {
                            java.lang.String[] strArr2 = A0A;
                            strArr2[7] = "";
                            strArr2[0] = "";
                            rk.A0Z(4);
                            boolean fromScrapOrHiddenOrCache4 = rk.A0h();
                            if (fromScrapOrHiddenOrCache4) {
                                this.A08.removeDetachedView(rk.A0H, false);
                                rk.A0Y();
                            } else {
                                boolean fromScrapOrHiddenOrCache5 = rk.A0m();
                                if (fromScrapOrHiddenOrCache5) {
                                    rk.A0U();
                                }
                            }
                            A0X(rk);
                        }
                        throw new java.lang.RuntimeException();
                    }
                    rk = null;
                } else {
                    z2 = true;
                }
            }
            if (rk == null) {
                int A04 = this.A08.A00.A04(i);
                if (A04 < 0 || A04 >= this.A08.A04.A0B()) {
                    throw new java.lang.IndexOutOfBoundsException(A04(165, 46, 55) + i + A04(13, 8, 116) + A04 + A04(35, 8, 108) + this.A08.A0s.A03() + this.A08.A1J());
                }
                int offsetPosition = this.A08.A04.A0C(A04);
                boolean fromScrapOrHiddenOrCache6 = this.A08.A04.A0M();
                if (fromScrapOrHiddenOrCache6 && (rk = A03(this.A08.A04.A0D(A04), offsetPosition, z)) != null) {
                    rk.A03 = A04;
                    z2 = true;
                }
                if (rk == null && 0 != 0) {
                    throw new java.lang.NullPointerException(A04(540, 25, 93));
                }
                if (rk == null && (rk = A0H().A03(offsetPosition)) != null) {
                    rk.A0W();
                    boolean fromScrapOrHiddenOrCache7 = com.facebook.ads.redexgen.core.C7M.A1C;
                    if (fromScrapOrHiddenOrCache7) {
                        A0A(rk);
                    }
                }
                if (rk == null) {
                    long nanoTime = this.A08.getNanoTime();
                    java.lang.String[] strArr3 = A0A;
                    if (strArr3[4].charAt(14) == strArr3[1].charAt(14)) {
                        java.lang.String[] strArr4 = A0A;
                        strArr4[5] = "boNM8OY2bTpFYgdjXbnYcgq0xZrcwPhs";
                        strArr4[3] = "UkhWCoe8HTTYlCSa40rnYF5pqDe823no";
                        if (j != Long.MAX_VALUE) {
                            boolean fromScrapOrHiddenOrCache8 = this.A01.A0B(offsetPosition, nanoTime, j);
                            if (!fromScrapOrHiddenOrCache8) {
                                return null;
                            }
                        }
                        rk = this.A08.A04.A0E(this.A08, offsetPosition);
                        fromScrapOrHiddenOrCache = com.facebook.ads.redexgen.core.C7M.A1E;
                        if (fromScrapOrHiddenOrCache && (A0H = com.facebook.ads.redexgen.core.C7M.A0H(rk.A0H)) != null) {
                            rk.A09 = new java.lang.ref.WeakReference<>(A0H);
                        }
                        this.A01.A06(offsetPosition, this.A08.getNanoTime() - nanoTime);
                    }
                    throw new java.lang.RuntimeException();
                }
            }
            if (z2 && !this.A08.A0s.A07() && rk.A0o(8192)) {
                rk.A0a(0, 8192);
                if (this.A08.A0s.A0C) {
                    int changeFlags = com.facebook.ads.redexgen.core.AbstractC0992Qy.A06(rk);
                    com.facebook.ads.redexgen.core.C0991Qx info = this.A08.A05.A0F(this.A08.A0s, rk, changeFlags | 4096, rk.A0R());
                    this.A08.A1k(rk, info);
                }
            }
            boolean z3 = false;
            if (this.A08.A0s.A07() && rk.A0e()) {
                rk.A04 = i;
            } else if (!rk.A0e() || rk.A0k() || rk.A0f()) {
                z3 = A0D(rk, this.A08.A00.A04(i), i, j);
            }
            android.view.ViewGroup.LayoutParams layoutParams = rk.A0H.getLayoutParams();
            if (layoutParams == null) {
                r3 = (com.facebook.ads.redexgen.core.R3) this.A08.generateDefaultLayoutParams();
                rk.A0H.setLayoutParams(r3);
            } else {
                boolean checkLayoutParams = this.A08.checkLayoutParams(layoutParams);
                java.lang.String[] strArr5 = A0A;
                if (strArr5[5].charAt(9) != strArr5[3].charAt(9)) {
                    java.lang.String[] strArr6 = A0A;
                    strArr6[2] = "zCboBEvvN0uPYmtuolLcQSfyvv";
                    strArr6[6] = "oQlbeeNPYINxaBCA8kGLswkn0x";
                } else {
                    java.lang.String[] strArr7 = A0A;
                    strArr7[7] = "";
                    strArr7[0] = "";
                }
            }
            r3.A00 = rk;
            r3.A02 = z2 && z3;
            return rk;
        }
        throw new java.lang.IndexOutOfBoundsException(A04(271, 22, 26) + i + A04(12, 1, 26) + i + A04(21, 14, 3) + this.A08.A0s.A03() + this.A08.A1J());
    }

    public final java.util.List<com.facebook.ads.redexgen.core.RK> A0J() {
        return this.A07;
    }

    public final void A0K() {
        int size = this.A06.size();
        for (int i = 0; i < size; i++) {
            this.A06.get(i).A0S();
        }
        int i2 = this.A05.size();
        for (int scrapCount = 0; scrapCount < i2; scrapCount++) {
            this.A05.get(scrapCount).A0S();
        }
        if (this.A02 != null) {
            int changedScrapCount = this.A02.size();
            for (int scrapCount2 = 0; scrapCount2 < changedScrapCount; scrapCount2++) {
                this.A02.get(scrapCount2).A0S();
            }
        }
    }

    public final void A0L() {
        this.A05.clear();
        if (this.A02 != null) {
            this.A02.clear();
        }
    }

    public final void A0M() {
        int size = this.A06.size();
        for (int i = 0; i < size; i++) {
            com.facebook.ads.redexgen.core.R3 r3 = (com.facebook.ads.redexgen.core.R3) this.A06.get(i).A0H.getLayoutParams();
            if (r3 != null) {
                r3.A01 = true;
            }
        }
    }

    public final void A0N() {
        if (this.A08.A04 != null && this.A08.A04.A0M()) {
            int size = this.A06.size();
            for (int i = 0; i < size; i++) {
                com.facebook.ads.redexgen.core.RK rk = this.A06.get(i);
                if (rk != null) {
                    rk.A0Z(6);
                    rk.A0c(null);
                }
            }
            return;
        }
        A06();
    }

    public final void A0O() {
        int i = this.A08.A06 != null ? this.A08.A06.A00 : 0;
        int extraCache = this.A03;
        this.A00 = extraCache + i;
        int extraCache2 = this.A06.size();
        for (int i2 = extraCache2 - 1; i2 >= 0; i2--) {
            int size = this.A06.size();
            int i3 = this.A00;
            java.lang.String[] strArr = A0A;
            java.lang.String str = strArr[5];
            java.lang.String str2 = strArr[3];
            int i4 = str.charAt(9);
            int extraCache3 = str2.charAt(9);
            if (i4 != extraCache3) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0A;
            strArr2[5] = "FM5srU9o6TBj8QlSYYqmaX9MZyJMPTMr";
            strArr2[3] = "mnADOFh1HT7Eu0tfTP5EsiAEmob0QgOc";
            if (size > i3) {
                A07(i2);
            } else {
                return;
            }
        }
    }

    public final void A0P() {
        this.A05.clear();
        A06();
    }

    public final void A0Q(int i) {
        this.A03 = i;
        A0O();
    }

    public final void A0R(android.view.View view) {
        com.facebook.ads.redexgen.core.RK A0F = com.facebook.ads.redexgen.core.C7M.A0F(view);
        A0F.A0F = null;
        A0F.A0G = false;
        A0F.A0U();
        A0X(A0F);
    }

    public final void A0S(android.view.View view) {
        com.facebook.ads.redexgen.core.RK A0F = com.facebook.ads.redexgen.core.C7M.A0F(view);
        if (A0F.A0o(12) || !A0F.A0j() || this.A08.A1y(A0F)) {
            if (!A0F.A0f() || A0F.A0g() || this.A08.A04.A0M()) {
                A0F.A0b(this, false);
                this.A05.add(A0F);
                return;
            }
            throw new java.lang.IllegalArgumentException(A04(43, 122, 48) + this.A08.A1J());
        }
        if (this.A02 == null) {
            this.A02 = new java.util.ArrayList<>();
        }
        A0F.A0b(this, true);
        this.A02.add(A0F);
    }

    public final void A0T(android.view.View view) {
        com.facebook.ads.redexgen.core.RK A0F = com.facebook.ads.redexgen.core.C7M.A0F(view);
        if (A0F.A0i()) {
            this.A08.removeDetachedView(view, false);
        }
        if (A0F.A0h()) {
            A0F.A0Y();
        } else if (A0F.A0m()) {
            A0F.A0U();
        }
        A0X(A0F);
    }

    public final void A0U(com.facebook.ads.redexgen.core.AbstractC0984Qq abstractC0984Qq, com.facebook.ads.redexgen.core.AbstractC0984Qq abstractC0984Qq2, boolean z) {
        A0P();
        A0H().A08(abstractC0984Qq, abstractC0984Qq2, z);
    }

    public final void A0V(com.facebook.ads.redexgen.core.R9 r9) {
        if (this.A01 != null) {
            this.A01.A04();
        }
        this.A01 = r9;
        if (r9 != null) {
            com.facebook.ads.redexgen.core.R9 r92 = this.A01;
            com.facebook.ads.redexgen.core.AbstractC0984Qq adapter = this.A08.getAdapter();
            java.lang.String[] strArr = A0A;
            if (strArr[2].length() != strArr[6].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0A;
            strArr2[4] = "lsZK0accpgBQgJYjkQv5Abfcayw6pcR0";
            strArr2[1] = "Z7g3Rn3k4gV3vNYe90sCMa52PcoBzFf1";
            r92.A07(adapter);
        }
    }

    public final void A0W(com.facebook.ads.redexgen.core.RI ri) {
        this.A04 = ri;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        if (r0 != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0X(com.facebook.ads.redexgen.core.RK rk) {
        boolean A0F;
        boolean transientStatePreventsRecycling;
        int targetCacheIndex;
        boolean transientStatePreventsRecycling2;
        if (rk.A0h() || rk.A0H.getParent() != null) {
            throw new java.lang.IllegalArgumentException(A04(293, 56, 75) + rk.A0h() + A04(0, 12, 91) + (rk.A0H.getParent() != null) + this.A08.A1J());
        }
        boolean A0i = rk.A0i();
        java.lang.String[] strArr = A0A;
        if (strArr[4].charAt(14) == strArr[1].charAt(14)) {
            java.lang.String[] strArr2 = A0A;
            strArr2[2] = "XmVzY8sdohxIZJ5Ojk7HGi6GVO";
            strArr2[6] = "m3xjIJQIi7Ro4dRZ8OgPCgQ0SJ";
            if (!A0i) {
                if (rk.A0l()) {
                    throw new java.lang.IllegalArgumentException(A04(430, 110, 9) + this.A08.A1J());
                }
                A0F = rk.A0F();
                if (this.A08.A04 != null && A0F) {
                    boolean transientStatePreventsRecycling3 = this.A08.A04.A0N(rk);
                    if (transientStatePreventsRecycling3) {
                        transientStatePreventsRecycling = true;
                        targetCacheIndex = 0;
                        boolean z = false;
                        if (!transientStatePreventsRecycling) {
                            boolean transientStatePreventsRecycling4 = rk.A0n();
                        }
                        if (this.A00 > 0) {
                            boolean transientStatePreventsRecycling5 = rk.A0o(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CAPPED_PER_SESSION);
                            if (!transientStatePreventsRecycling5) {
                                int size = this.A06.size();
                                if (size >= this.A00 && size > 0) {
                                    A07(0);
                                    size--;
                                }
                                java.lang.String[] strArr3 = A0A;
                                if (strArr3[5].charAt(9) == strArr3[3].charAt(9)) {
                                    java.lang.String[] strArr4 = A0A;
                                    strArr4[4] = "Q1OZT6LnkVYbRcYxNkw6Mn7gWXto99yC";
                                    strArr4[1] = "RVxEgLz70808ymY8dF1xTnmhZlFYlEUe";
                                    transientStatePreventsRecycling2 = com.facebook.ads.redexgen.core.C7M.A1E;
                                    if (transientStatePreventsRecycling2 && size > 0) {
                                        boolean transientStatePreventsRecycling6 = this.A08.A02.A05(rk.A03);
                                        if (!transientStatePreventsRecycling6) {
                                            int i = size - 1;
                                            while (i >= 0) {
                                                boolean transientStatePreventsRecycling7 = this.A08.A02.A05(this.A06.get(i).A03);
                                                if (!transientStatePreventsRecycling7) {
                                                    break;
                                                } else {
                                                    i--;
                                                }
                                            }
                                            size = i + 1;
                                        }
                                    }
                                    this.A06.add(size, rk);
                                    targetCacheIndex = 1;
                                }
                            }
                        }
                        if (targetCacheIndex == 0) {
                            A0Z(rk, true);
                            z = true;
                        }
                        this.A08.A0t.A0B(rk);
                        if (targetCacheIndex != 0 && !z && A0F) {
                            rk.A08 = null;
                            return;
                        }
                        return;
                    }
                }
                transientStatePreventsRecycling = false;
                targetCacheIndex = 0;
                boolean z2 = false;
                if (!transientStatePreventsRecycling) {
                }
                if (this.A00 > 0) {
                }
                if (targetCacheIndex == 0) {
                }
                this.A08.A0t.A0B(rk);
                if (targetCacheIndex != 0) {
                    return;
                } else {
                    return;
                }
            }
            throw new java.lang.IllegalArgumentException(A04(349, 81, 50) + rk + this.A08.A1J());
        }
        throw new java.lang.RuntimeException();
    }

    public final void A0Y(com.facebook.ads.redexgen.core.RK rk) {
        boolean z;
        z = rk.A0G;
        if (z) {
            java.util.ArrayList<com.facebook.ads.redexgen.core.RK> arrayList = this.A02;
            java.lang.String[] strArr = A0A;
            if (strArr[7].length() != strArr[0].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0A;
            strArr2[2] = "g9dUUHlnr2dNWy2bvXbXpUnxFV";
            strArr2[6] = "1VljHDZyW4yQ7QRXruVc6WBcEp";
            arrayList.remove(rk);
        } else {
            this.A05.remove(rk);
        }
        rk.A0F = null;
        rk.A0G = false;
        rk.A0U();
    }

    public final void A0Z(com.facebook.ads.redexgen.core.RK rk, boolean z) {
        com.facebook.ads.redexgen.core.C7M.A0s(rk);
        if (rk.A0o(16384)) {
            rk.A0a(0, 16384);
            com.facebook.ads.redexgen.core.Ph.A0B(rk.A0H, null);
        }
        if (z) {
            A0B(rk);
        }
        rk.A08 = null;
        A0H().A09(rk);
    }
}
