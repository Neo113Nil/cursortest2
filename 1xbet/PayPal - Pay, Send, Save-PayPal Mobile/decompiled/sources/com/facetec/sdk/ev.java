package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class ev extends com.facetec.sdk.ew {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$f = 0;
    private static int $10;
    private static int $11;

    /* renamed from: a, reason: collision with root package name */
    private static char f3557a;
    private static char b;
    private static char c;
    private static char d;
    private static int e;
    private static int i;
    private static int j;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$g(short s, int i2, short s2) {
        int i3;
        int i4 = s2 + 4;
        byte[] bArr = $$c;
        int i5 = i2 * 4;
        int i6 = s + 112;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            i6 += i7;
            i3 = i8;
            int i9 = i4;
            int i10 = i6;
            int i11 = i9 + 1;
            bArr2[i3] = (byte) i10;
            i8 = i3 + 1;
            if (i3 == i5) {
                return new java.lang.String(bArr2, 0);
            }
            i4 = i11;
            i6 = bArr[i11];
            i7 = i10;
            i6 += i7;
            i3 = i8;
            int i92 = i4;
            int i102 = i6;
            int i112 = i92 + 1;
            bArr2[i3] = (byte) i102;
            i8 = i3 + 1;
            if (i3 == i5) {
            }
        } else {
            i3 = 0;
            int i922 = i4;
            int i1022 = i6;
            int i1122 = i922 + 1;
            bArr2[i3] = (byte) i1022;
            i8 = i3 + 1;
            if (i3 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void f(byte b2, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        int i5 = 4 - (i2 * 2);
        byte[] bArr = $$a;
        int i6 = i3 * 3;
        int i7 = 101 - b2;
        byte[] bArr2 = new byte[1 - i6];
        int i8 = 0 - i6;
        if (bArr == null) {
            int i9 = i8;
            i4 = 0;
            i7 += i9;
            i5++;
            bArr2[i4] = (byte) i7;
            if (i4 == i8) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i4++;
            i9 = bArr[i5];
            i7 += i9;
            i5++;
            bArr2[i4] = (byte) i7;
            if (i4 == i8) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i7;
            if (i4 == i8) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{115, -94, com.google.common.base.Ascii.DC4, -88};
        $$b = 174;
    }

    static void init$1() {
        $$c = new byte[]{57, -76, -24, 116};
        $$f = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE;
    }

    public ev(java.lang.String str) {
        super(str);
    }

    public ev(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
    }

    public ev(java.lang.Throwable th) {
        super(th);
    }

    private static void g(java.lang.String str, int i2, java.lang.Object[] objArr) {
        int i3 = $11 + 5;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.facetec.sdk.ho hoVar = new com.facetec.sdk.ho();
        char[] cArr = new char[charArray.length];
        int i4 = 0;
        hoVar.b = 0;
        char[] cArr2 = new char[2];
        while (hoVar.b < charArray.length) {
            cArr2[i4] = charArray[hoVar.b];
            cArr2[1] = charArray[hoVar.b + 1];
            $11 = ($10 + 59) % 128;
            int i5 = 58224;
            int i6 = i4;
            while (i6 < 16) {
                $11 = ($10 + 107) % 128;
                char c2 = cArr2[1];
                char c3 = cArr2[i4];
                char c4 = (char) (d ^ 2174069992062419062L);
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[4];
                    objArr2[3] = java.lang.Integer.valueOf(c);
                    objArr2[2] = java.lang.Integer.valueOf(c3 >>> 5);
                    objArr2[1] = java.lang.Integer.valueOf(((c3 << 4) + c4) ^ (c3 + i5));
                    objArr2[i4] = java.lang.Integer.valueOf(c2);
                    java.lang.Object d2 = com.facetec.sdk.al.d(1497828241);
                    if (d2 == null) {
                        char bitsPerPixel = (char) (android.graphics.ImageFormat.getBitsPerPixel(i4) + 1);
                        int offsetBefore = android.text.TextUtils.getOffsetBefore("", i4);
                        int tapTimeout = android.view.ViewConfiguration.getTapTimeout();
                        java.lang.Class[] clsArr = new java.lang.Class[4];
                        clsArr[i4] = java.lang.Integer.TYPE;
                        clsArr[1] = java.lang.Integer.TYPE;
                        clsArr[2] = java.lang.Integer.TYPE;
                        clsArr[3] = java.lang.Integer.TYPE;
                        d2 = com.facetec.sdk.al.c(bitsPerPixel, offsetBefore + 211, 23 - (tapTimeout >> 16), -22515351, false, lib.android.paypal.com.magnessdk.g.n2, clsArr);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                    cArr2[1] = charValue;
                    char[] cArr3 = cArr2;
                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr2[i4]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (f3557a ^ 2174069992062419062L))) ^ r6), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(b)};
                    int i7 = charValue + i5;
                    java.lang.Object d3 = com.facetec.sdk.al.d(1497828241);
                    if (d3 == null) {
                        d3 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), android.text.TextUtils.getOffsetAfter("", 0) + 211, android.view.View.resolveSize(0, 0) + 23, -22515351, false, lib.android.paypal.com.magnessdk.g.n2, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    cArr3[0] = ((java.lang.Character) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    cArr2 = cArr3;
                    i4 = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr4 = cArr2;
            cArr[hoVar.b] = cArr4[0];
            cArr[hoVar.b + 1] = cArr4[1];
            java.lang.Object[] objArr4 = {hoVar, hoVar};
            java.lang.Object d4 = com.facetec.sdk.al.d(-2113314280);
            if (d4 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                d4 = com.facetec.sdk.al.c((char) (31541 - android.view.View.getDefaultSize(0, 0)), 1913 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.widget.ExpandableListView.getPackedPositionChild(0L) + 24, 635836640, false, $$g(b2, b3, (byte) (b3 - 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) d4).invoke(null, objArr4);
            cArr2 = cArr4;
            i4 = 0;
        }
        objArr[0] = new java.lang.String(cArr, 0, i2);
    }

    private static void h(boolean z, int i2, java.lang.String str, int i3, int i4, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            int i5 = $10 + 111;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                cArr = str.toCharArray();
                int i6 = 40 / 0;
            } else {
                cArr = str.toCharArray();
            }
            $11 = ($10 + 105) % 128;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.facetec.sdk.hp hpVar = new com.facetec.sdk.hp();
        char[] cArr3 = new char[i2];
        hpVar.d = 0;
        while (hpVar.d < i2) {
            hpVar.b = cArr2[hpVar.d];
            cArr3[hpVar.d] = (char) (i3 + hpVar.b);
            int i7 = hpVar.d;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i7]), java.lang.Integer.valueOf(e)};
                java.lang.Object d2 = com.facetec.sdk.al.d(-1738479149);
                if (d2 == null) {
                    char indexOf = (char) (android.text.TextUtils.indexOf("", "", 0, 0) + 19485);
                    long uptimeMillis = android.os.SystemClock.uptimeMillis();
                    int maximumDrawingCacheSize = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
                    byte b2 = (byte) ($$f & 5);
                    byte b3 = (byte) (b2 - 1);
                    d2 = com.facetec.sdk.al.c(indexOf, (uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1)) + 729, 24 - (maximumDrawingCacheSize >> 24), 1066373931, false, $$g(b2, b3, (byte) (b3 - 1)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                cArr3[i7] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr3 = {hpVar, hpVar};
                java.lang.Object d3 = com.facetec.sdk.al.d(1965925374);
                if (d3 == null) {
                    d3 = com.facetec.sdk.al.c((char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 24338), 1622 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 24 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -758982394, false, "v", new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d3).invoke(null, objArr3);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i4 > 0) {
            hpVar.f3630a = i4;
            char[] cArr4 = new char[i2];
            java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i2);
            java.lang.System.arraycopy(cArr4, 0, cArr3, i2 - hpVar.f3630a, hpVar.f3630a);
            java.lang.System.arraycopy(cArr4, hpVar.f3630a, cArr3, 0, i2 - hpVar.f3630a);
        }
        if (z) {
            char[] cArr5 = new char[i2];
            hpVar.d = 0;
            while (hpVar.d < i2) {
                cArr5[hpVar.d] = cArr3[(i2 - hpVar.d) - 1];
                java.lang.Object[] objArr4 = {hpVar, hpVar};
                java.lang.Object d4 = com.facetec.sdk.al.d(1965925374);
                if (d4 == null) {
                    d4 = com.facetec.sdk.al.c((char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 24339), 1621 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 24 - android.widget.ExpandableListView.getPackedPositionType(0L), -758982394, false, "v", new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d4).invoke(null, objArr4);
                $11 = ($10 + 111) % 128;
            }
            cArr3 = cArr5;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        j = 0;
        i = 1;
        f3557a = (char) 14566;
        b = (char) 3067;
        d = (char) 45034;
        c = (char) 8252;
        e = 780577517;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x14a7, code lost:
    
        if (r3 != null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x14a9, code lost:
    
        r3 = (char) (android.view.ViewConfiguration.getTapTimeout() >> 16);
        r5 = android.text.TextUtils.getTrimmedLength(r1);
        r8 = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
        r10 = (byte) 0;
        r13 = new java.lang.Object[1];
        f(r10, r10, r10, r13);
        r3 = com.facetec.sdk.al.c(r3, 2078 - r5, 24 - (r8 >> 24), -114923755, false, (java.lang.String) r13[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x14e2, code lost:
    
        r2 = ((java.lang.reflect.Method) r3).invoke(null, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x14e9, code lost:
    
        r8 = new java.lang.Object[1];
        g("ꀌക瘛툯ꀌക⟆\uf60f崩鴋\uf723놼껐奛\uf050쵮\ude39奚쇇\uf485谲⼢䦛⺔崩鴋㨆䜸뼳⇼", 10 << (android.view.ViewConfiguration.getMaximumFlingVelocity() << 21), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x1500, code lost:
    
        r3 = new java.lang.Object[]{(java.lang.String) r8[0]};
        r5 = com.facetec.sdk.al.d(1590238701);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x150b, code lost:
    
        if (r5 != null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x150d, code lost:
    
        r5 = (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
        r10 = android.widget.ExpandableListView.getPackedPositionChild(0);
        r8 = (byte) android.view.KeyEvent.getModifierMetaStateMask();
        r11 = (byte) 0;
        r15 = new java.lang.Object[1];
        f(r11, r11, r11, r15);
        r5 = com.facetec.sdk.al.c(r5, 2077 - r10, 23 - r8, -114923755, false, (java.lang.String) r15[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x1547, code lost:
    
        r3 = ((java.lang.reflect.Method) r5).invoke(null, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x154e, code lost:
    
        if (r2 == null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x1552, code lost:
    
        r34 = r1;
        r21 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0120, code lost:
    
        if (((r2 ^ r3) | (r2 & r3)) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x1736, code lost:
    
        if (r3 == null) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x1739, code lost:
    
        r2 = new java.lang.Object[]{r3, 42};
        r3 = com.facetec.sdk.al.d(-582857820);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x174e, code lost:
    
        if (r3 != null) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x1750, code lost:
    
        r9 = r34;
        r3 = (char) (android.text.TextUtils.indexOf(r9, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1);
        r8 = android.view.ViewConfiguration.getScrollBarSize();
        r10 = android.graphics.Color.red(0);
        r1 = (byte) 1;
        r11 = (byte) (r1 - 1);
        r13 = new java.lang.Object[1];
        f(r1, r11, r11, r13);
        r3 = com.facetec.sdk.al.c(r3, (r8 >> 8) + 2365, 24 - r10, 2058170716, false, (java.lang.String) r13[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x1797, code lost:
    
        r1 = ((java.lang.Long) ((java.lang.reflect.Method) r3).invoke(null, r2)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x17a4, code lost:
    
        r3 = 605947383;
        r34 = r9;
        r8 = -1;
        r29 = r1 ^ r8;
        r14 = r6;
        r35 = r14 ^ r8;
        r5 = 865;
        r10 = (((((866 * r3) + ((-864) * r1)) + ((r29 | (((r3 ^ r8) | r35) ^ r8)) * (-865))) + (((r3 | r14) ^ r8) * r5)) + (r5 * (((r29 | r35) ^ r8) | ((r35 | r3) ^ r8)))) + 553250015;
        r4 = r64;
        r1 = ((int) (r10 >> 32)) & (((((~(100994337 | r4)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) + 913847786) + (((-1235239049) | r7) * (-216))) + (((~(100994337 | r7)) | 1336232073) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE));
        r3 = android.os.Process.myUid();
        r5 = ~r3;
        r2 = ((int) r10) & ((((((-994282445) | r3) * (-50)) + 1060620711) + (((~(r3 | 996658141)) | (~((-553714177) | r5))) * 50)) + (((~((-994282445) | r5)) | ((~(r5 | 442943965)) | 553714176)) * 50));
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x183d, code lost:
    
        if (((r1 ^ r2) | (r1 & r2)) != 477111747) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x183f, code lost:
    
        r1 = 0;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x02c8, code lost:
    
        r2 = android.view.ViewConfiguration.getEdgeSlop() >> 16;
        r5 = new java.lang.Object[1];
        g("ꀌക⼽纠庆\ufde1犠玢庆\ufde1\u2e66휉", (r2 ^ 11) + ((r2 & 11) << 1), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x1843, code lost:
    
        if (r1 >= 28) goto L571;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x1845, code lost:
    
        r3 = r21[r1];
        r5 = android.os.Process.myPid() >> 22;
        r6 = com.facetec.sdk.fl.d();
        r8 = r5 * 303;
        r9 = (r8 ^ (-3612)) + ((r8 & (-3612)) << 1);
        r8 = ~r5;
        r10 = ~r6;
        r10 = (r10 ^ r8) | (r10 & r8);
        r11 = (r5 ^ 12) | (r5 & 12);
        r10 = -(-(((~((r10 ^ 12) | (r10 & 12))) | (~((r11 ^ r6) | (r11 & r6)))) * (-302)));
        r11 = (((r9 ^ r10) + ((r9 & r10) << 1)) - (~((~(((r8 ^ 12) | (r8 & 12)) | r6)) * (-604)))) - 1;
        r5 = ((~((r5 ^ (-13)) | (r5 & (-13)))) | (~((r6 ^ 12) | (r6 & 12)))) * 302;
        r8 = new java.lang.Object[1];
        g("ﻲ艓껐奛\uf050쵮⌡\uf2a3錅ṹⰑ乏", (r11 & r5) + (r5 | r11), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x18b0, code lost:
    
        r3 = new java.lang.Object[]{((java.lang.String) r8[0]).concat(java.lang.String.valueOf(r3))};
        r5 = com.facetec.sdk.al.d(1873189073);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x18bb, code lost:
    
        if (r5 != null) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x18bd, code lost:
    
        r6 = r34;
        r8 = (char) (android.text.TextUtils.indexOf(r6, r6) + 6935);
        r5 = android.widget.ExpandableListView.getPackedPositionChild(0);
        r9 = android.os.Process.getGidForName(r6);
        r11 = (byte) 1;
        r12 = (byte) (r11 - 1);
        r14 = new java.lang.Object[1];
        f(r11, r12, r12, r14);
        r5 = com.facetec.sdk.al.c(r8, 2388 - r5, 22 - r9, -934682071, false, (java.lang.String) r14[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x18f7, code lost:
    
        r8 = ((java.lang.Long) ((java.lang.reflect.Method) r5).invoke(null, r3)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x1904, code lost:
    
        r10 = 488342107;
        r12 = 399;
        r14 = 398;
        r34 = r6;
        r5 = -1;
        r30 = ((r10 ^ r5) | r8) ^ r5;
        r32 = r8 ^ r5;
        r35 = (r32 | r10) ^ r5;
        r3 = r1;
        r37 = r2;
        r1 = r4;
        r1 = (((((r12 * r10) + (r12 * r8)) + (((r30 | r35) | ((r32 | r1) ^ r5)) * r14)) + ((-1194) * (r8 | r10))) + (r14 * ((((r32 | (r1 ^ r5)) ^ r5) | r30) | r35))) + 448737536;
        r6 = android.os.Process.myUid();
        r8 = ~r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x1993, code lost:
    
        if (((((int) r1) & (((r2 * 495) - 814092870) + (((~((~new java.util.Random().nextInt(1904356158)) | (-470696930))) | (-1033786346)) * 495))) | (((int) (r1 >> 32)) & ((((((~(r8 | (-1307038587))) | 1210405194) | (~(130187824 | r8))) * (-397)) + 1001018794) + ((r6 | 1243959626) * 397)))) != 0) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x1995, code lost:
    
        com.facetec.sdk.ev.j = (com.facetec.sdk.ev.i + 99) % 128;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x02e1, code lost:
    
        r2 = new java.lang.Object[]{(java.lang.String) r5[0]};
        r3 = com.facetec.sdk.al.d(1590238701);
        r6 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x19a0, code lost:
    
        r2 = (r37 | r1) + (r37 & r1);
        r1 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x199f, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x18f5, code lost:
    
        r6 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x19b1, code lost:
    
        if (r2 < 25.2d) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x19b3, code lost:
    
        r1 = new java.lang.Object[]{null, new int[1], new int[]{(r4 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE) & (~(r4 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE))}, new int[]{r4}};
        r2 = ~(((int) java.lang.Runtime.getRuntime().maxMemory()) | 269771884);
        r3 = (((1078706967 | r2) * (-658)) + 1629001263) + ((r2 | 1078690579) * 658);
        r3 = (-1763436072) - (~((r3 & 16) + (r3 | 16)));
        r2 = r3 << 13;
        r2 = ((~r2) & r3) | ((~r3) & r2);
        r2 = r2 ^ (r2 >>> 17);
        r3 = r2 << 5;
        ((int[]) r1[1])[0] = (r2 & (~r3)) | ((~r2) & r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x1a12, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x1a32, code lost:
    
        r1 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1));
        r2 = new java.lang.Object[1];
        g("ﻲ艓껐奛㺥뎊\ue28a옠\uaaff舟捰\ue04d谲⼢\ud987᬴⭎⿄纲⾗嗰榴\u2e66휉", (r1 & 24) + (r1 | 24), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x02ed, code lost:
    
        if (r3 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x1a4d, code lost:
    
        r2 = new java.lang.Object[]{(java.lang.String) r2[0]};
        r3 = com.facetec.sdk.al.d(-864328554);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x1a58, code lost:
    
        if (r3 != null) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x1a5a, code lost:
    
        r8 = (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        r1 = android.view.MotionEvent.axisFromString(r34);
        r3 = android.widget.ExpandableListView.getPackedPositionGroup(0);
        r6 = (byte) 3;
        r5 = (byte) (r6 - 3);
        r11 = new java.lang.Object[1];
        f(r6, r5, r5, r11);
        r3 = com.facetec.sdk.al.c(r8, r1 + 2342, 24 - r3, 1804869230, false, (java.lang.String) r11[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x1a8d, code lost:
    
        r1 = ((java.lang.Long) ((java.lang.reflect.Method) r3).invoke(null, r2)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x1a9a, code lost:
    
        r8 = 211051864;
        r10 = -919;
        r12 = 920;
        r14 = -1;
        r29 = r8 ^ r14;
        r31 = r1 ^ r14;
        r35 = r29 | r31;
        r5 = r4;
        r37 = r5 ^ r14;
        r1 = (((((r10 * r8) + (r10 * r1)) + ((((r35 | r5) ^ r14) | (((r31 | r37) | r8) ^ r14)) * r12)) + (((r35 ^ r14) | ((r29 | r37) ^ r14)) * r12)) + (r12 * (((((r29 | r1) | r5) ^ r14) | ((r35 | r37) ^ r14)) | (((r31 | r8) | r5) ^ r14)))) + 837146556;
        r8 = ((int) (r1 >> 32)) & ((((((-40977) | r4) * (-627)) + 635053320) + (((~(1152033553 | r4)) | (-1705707332)) * (-627))) + (((~((-1152033554) | r7)) | (~((-1705707332) | r4))) * 627));
        r2 = new java.util.Random().nextInt();
        r9 = ~r2;
        r10 = ~(1429740865 | r2);
        r1 = ((int) r1) & ((((((~(7485544 | r9)) | r10) * 1150) + 334239082) + ((r10 | (~((-1429740866) | r9))) * (-575))) + (((~(r2 | 7485544)) | (~(r9 | (-7485545)))) * 575));
        r1 = (r1 ^ r8) | (r8 & r1);
        r8 = android.media.AudioTrack.getMinVolume();
        r9 = -(-android.os.Process.getGidForName(r34));
        r13 = new java.lang.Object[1];
        h(false, (r8 > 0.0f ? 1 : (r8 == 0.0f ? 0 : -1)) + 17, "\u000e\u0010\r\u0001ￍ\u0011\u0003\n\u0004ￍ\u0011\u0012\uffff\u0012\u0013\u0011ￍ", ((r9 | 119) << 1) - (r9 ^ 119), (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)) + 15, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x1b75, code lost:
    
        r9 = new java.lang.Object[]{(java.lang.String) r13[0]};
        r10 = com.facetec.sdk.al.d(-864328554);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x1b80, code lost:
    
        if (r10 != null) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x1b82, code lost:
    
        r8 = (char) android.graphics.Color.red(0);
        r10 = android.view.ViewConfiguration.getWindowTouchSlop();
        r13 = android.widget.ExpandableListView.getPackedPositionType(0);
        r12 = (byte) 3;
        r11 = (byte) (r12 - 3);
        r30 = r5;
        r6 = new java.lang.Object[1];
        f(r12, r11, r11, r6);
        r10 = com.facetec.sdk.al.c(r8, 2341 - (r10 >> 8), 24 - r13, 1804869230, false, (java.lang.String) r6[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x1bc4, code lost:
    
        r5 = ((java.lang.Long) ((java.lang.reflect.Method) r10).invoke(null, r9)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x1bd1, code lost:
    
        r8 = 390435498;
        r3 = (int) android.os.Process.getElapsedCpuTime();
        r10 = -500;
        r12 = androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING;
        r32 = r5 ^ r14;
        r35 = r8 ^ r14;
        r1 = r3;
        r1 = (((((r10 * r8) + (r10 * r5)) + ((((r32 | r8) ^ r14) | (((r35 | r5) | r1) ^ r14)) * r12)) + (1002 * ((r35 | r32) ^ r14))) + (((((r1 ^ r14) | r35) | r5) ^ r14) * r12)) + 657762922;
        r5 = android.os.Process.myPid();
        r6 = ~r5;
        r1 = (((int) r1) & (((((~((-1678386153) | r7)) | 1610621376) * 529) - 1520785380) + (((~((-1678386153) | r4)) | (-241159743)) * 529))) | (((int) (r1 >> 32)) & ((((((~((-1155699988) | r6)) | (-281526424)) * (-865)) + 1683115174) + ((~(r5 | 1155699987)) * 865)) + (((~((-281526424) | r6)) | (~(r6 | 1155699987))) * 865)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x02ef, code lost:
    
        r7 = (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8);
        r3 = android.media.AudioTrack.getMaxVolume();
        r5 = android.view.ViewConfiguration.getScrollFriction();
        r9 = (byte) 0;
        r12 = new java.lang.Object[1];
        f(r9, r9, r9, r12);
        r3 = com.facetec.sdk.al.c(r7, (r3 > 0.0f ? 1 : (r3 == 0.0f ? 0 : -1)) + 2077, (r5 > 0.0f ? 1 : (r5 == 0.0f ? 0 : -1)) + 23, -114923755, false, (java.lang.String) r12[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x1c5e, code lost:
    
        if (r1 <= 0) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x1c60, code lost:
    
        r3 = com.facetec.sdk.ev.i;
        com.facetec.sdk.ev.j = ((r3 ^ 93) + ((r3 & 93) << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x1c6f, code lost:
    
        if (r1 <= 0) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x1c71, code lost:
    
        r3 = com.facetec.sdk.fl.d();
        r5 = (-2068823573) | r3;
        r5 = ((r5 ^ (-937536107)) | ((-937536107) & r5)) * (-381);
        r6 = (201942866 ^ r5) + ((r5 & 201942866) << 1);
        r3 = ~r3;
        r3 = ~((r3 ^ (-2068823573)) | ((-2068823573) & r3));
        r3 = -(-((((r3 ^ 77594730) | (77594730 & r3)) | 1208882196) * 381));
        r5 = ~((-1845674315) | r7);
        r8 = ~(((-32055974) & r4) | ((-32055974) ^ r4));
        r5 = (((r5 ^ r8) | (r5 & r8)) * (-831)) - 1146742096;
        r8 = (~(r4 | (-16707))) * (-1662);
        r9 = (r5 & r8) + (r5 | r8);
        r5 = ~((32072679 & r7) | (32072679 ^ r7));
        r8 = ~(((-32072680) & r4) | ((-32072680) ^ r4));
        r5 = (r5 ^ r8) | (r5 & r8);
        r8 = ~((1845674314 & r4) | (1845674314 ^ r4));
        r5 = ((r5 ^ r8) | (r5 & r8)) * 831;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x1d06, code lost:
    
        if ((((r6 ^ r3) + ((r3 & r6) << 1)) + 1220149760) <= (((r9 | r5) << 1) - (r5 ^ r9))) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x1d0b, code lost:
    
        if ((r1 ^ 3) >= r1) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x1d13, code lost:
    
        r1 = com.facetec.sdk.ev.i;
        r2 = ((r1 | 103) << 1) - (r1 ^ 103);
        com.facetec.sdk.ev.j = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x1d22, code lost:
    
        if ((r2 % 2) == 0) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x1d24, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0322, code lost:
    
        r2 = (java.lang.String) ((java.lang.reflect.Method) r3).invoke(null, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x1d27, code lost:
    
        r3 = ((r1 & 31) + (r1 | 31)) % 128;
        com.facetec.sdk.ev.j = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x1d30, code lost:
    
        if (r2 == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x1d32, code lost:
    
        com.facetec.sdk.ev.i = (((r3 | 69) << 1) - (r3 ^ 69)) % 128;
        r1 = new java.lang.Object[]{null, new int[1], new int[]{(r4 | 247) & (~(r4 & 247))}, new int[]{r4}};
        r2 = (int) android.os.Process.getElapsedCpuTime();
        r4 = (((((~((-1407303215) | r3)) | 1398911494) * 98) - 1408622924) + ((((~((~r2) | (-210914746))) | (-1407303215)) | (~(210914745 | r2))) * (-49))) + (((~(r2 | (-1407303215))) | (-1609826240)) * 49);
        r2 = ((r4 & 16) + (r4 | 16)) - 1763436071;
        r2 = r2 ^ (r2 << 13);
        r3 = r2 >>> 17;
        r2 = (r2 & (~r3)) | ((~r2) & r3);
        r3 = r2 << 5;
        ((int[]) r1[1])[0] = (~(r2 & r3)) & (r2 | r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x1dae, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x1d26, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x1d11, code lost:
    
        if ((r1 - 3) >= r1) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x1daf, code lost:
    
        r1 = r34;
        r2 = -android.text.TextUtils.lastIndexOf(r1, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        r5 = new java.lang.Object[1];
        g("ﻲ艓껐奛㺥뎊\ue28a옠\uaaff舟捰\ue04d谲⼢\ud987᬴⭎⿄纲⾗嗰榴\u2e66휉", ((r2 | 22) << 1) - (r2 ^ 22), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x1dcb, code lost:
    
        r2 = new java.lang.Object[]{(java.lang.String) r5[0]};
        r3 = com.facetec.sdk.al.d(-864328554);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x1dd6, code lost:
    
        if (r3 != null) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x032b, code lost:
    
        r3 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x1dd8, code lost:
    
        r3 = (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
        r5 = android.media.AudioTrack.getMinVolume();
        r6 = android.widget.ExpandableListView.getPackedPositionType(0);
        r9 = (byte) 3;
        r8 = (byte) (r9 - 3);
        r12 = new java.lang.Object[1];
        f(r9, r8, r8, r12);
        r3 = com.facetec.sdk.al.c(r3, (r5 > 0.0f ? 1 : (r5 == 0.0f ? 0 : -1)) + 2341, r6 + 24, 1804869230, false, (java.lang.String) r12[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x1e18, code lost:
    
        r2 = ((java.lang.Long) ((java.lang.reflect.Method) r3).invoke(null, r2)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x1e25, code lost:
    
        r5 = 983704584;
        r8 = new java.util.Random().nextInt(1249463447);
        r9 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE;
        r11 = -252;
        r32 = r2 ^ r14;
        r7 = r8;
        r34 = r32 | (r7 ^ r14);
        r39 = r5 | r2;
        r7 = (r39 | r7) ^ r14;
        r2 = (((((r9 * r5) + (r9 * r2)) + ((((((r5 ^ r14) | r32) ^ r14) | (r34 ^ r14)) | r7) * r11)) + (r11 * r39)) + (com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE * (((r34 | r5) ^ r14) | r7))) + 64493836;
        r5 = ((int) (r2 >> 32)) & ((((~((-1076465921) | r7)) * 130) - 175351190) + (((~((-1076465921) | r4)) | 92275872) * 130));
        r2 = ((int) r2) & ((((((~((-36278290) | r7)) | (~(r7 | (-513)))) * (-184)) + 1019428157) + ((((~(700474316 | r7)) | (-736752606)) | (~(736752093 | r7))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)) - 38161240);
        r2 = (r2 ^ r5) | (r5 & r2);
        r5 = android.view.ViewConfiguration.getKeyRepeatDelay() >> 16;
        r7 = new java.lang.Object[1];
        g("을ᗬꔎ襪", ((r5 | 4) << 1) - (r5 ^ 4), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x1ecf, code lost:
    
        r5 = new java.lang.Object[]{(java.lang.String) r7[0]};
        r6 = com.facetec.sdk.al.d(-864328554);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x1eda, code lost:
    
        if (r6 != null) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x1edc, code lost:
    
        r6 = (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
        r8 = android.view.View.MeasureSpec.getMode(0);
        r9 = android.view.KeyEvent.getDeadChar(0, 0);
        r10 = (byte) 3;
        r7 = (byte) (r10 - 3);
        r34 = r1;
        r1 = new java.lang.Object[1];
        f(r10, r7, r7, r1);
        r6 = com.facetec.sdk.al.c(r6, 2341 - r8, 24 - r9, 1804869230, false, (java.lang.String) r1[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x1f1e, code lost:
    
        r5 = ((java.lang.Long) ((java.lang.reflect.Method) r6).invoke(null, r5)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x1f2b, code lost:
    
        r7 = -1081328612;
        r9 = 236;
        r11 = 471;
        r1 = -235;
        r35 = r7 ^ r14;
        r3 = -470;
        r3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE;
        r5 = (((((r9 * r7) + (r11 * r5)) + ((r5 | ((r35 | r37) ^ r14)) * r1)) + ((r5 | ((r35 | r30) ^ r14)) * r3)) + (((((r35 | r5) | r30) ^ r14) | (((r5 ^ r14) | r7) ^ r14)) * r3)) + 2129527032;
        r7 = r64;
        r3 = ((int) (r5 >> 32)) & (((((~(2107696967 | r7)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) + 225990154) + ((r7 | 2146891743) * (-216))) + (((~(r7 | 2107696967)) | (-670470557)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE));
        r4 = (int) r5;
        r5 = android.os.Process.myPid();
        r4 = r4 & ((((r6 * 992) - 1537497691) + ((((~(1948766301 | r5)) | 173550242) | (~((~r5) | (-1610776653)))) * (-496))) + ((r5 | 511539891) * 496));
        r3 = (r3 ^ r4) | (r3 & r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x1fce, code lost:
    
        if (r2 <= 0) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x032d, code lost:
    
        if (r2 == null) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x1fd2, code lost:
    
        if (r3 <= 0) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x1fd4, code lost:
    
        r5 = com.facetec.sdk.ev.j;
        r6 = ((r5 | 95) << 1) - (r5 ^ 95);
        com.facetec.sdk.ev.i = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x1fe3, code lost:
    
        if ((r6 % 2) != 0) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x1fea, code lost:
    
        if ((r3 - 100) >= r2) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x1ff4, code lost:
    
        r1 = new java.lang.Object[]{null, new int[]{r3 ^ (r3 << 5)}, new int[]{(r7 & (-249)) | (r7 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE)}, new int[]{r7}};
        r3 = ((((((~((-605797350) | r7)) | 240613) | (~(1012420610 | r7))) * 464) + 1312850039) + (((-605556737) | r7) * (-464))) + (((~(1012420610 | r7)) | 240613) * 464);
        r4 = ((r3 | 16) << 1) - (r3 ^ 16);
        r5 = ((r4 | (-1763436071)) << 1) - ((-1763436071) ^ r4);
        r3 = r5 << 13;
        r3 = ((~r3) & r5) | ((~r5) & r3);
        r4 = r3 >>> 17;
        r3 = (~(r3 & r4)) & (r3 | r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x2060, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x1ff2, code lost:
    
        if ((r3 + 100) >= r2) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x2061, code lost:
    
        r8 = r7;
        r3 = -(-(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
        r6 = r34;
        r4 = -android.text.TextUtils.getOffsetAfter(r6, 0);
        r1 = new java.lang.Object[1];
        h(false, (r3 & 7) + (r3 | 7), "\u0012\f\r\ufffe\u0006\uffc8\f", ((r4 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (r4 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE), 4 - (~(-(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))), r1);
        r41 = (java.lang.String) r1[0];
        r1 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
        r2 = com.facetec.sdk.fl.d();
        r3 = (r1 * 319) - 3487;
        r4 = ~r1;
        r4 = ~((r4 ^ r2) | (r4 & r2));
        r4 = -(-(((r4 ^ (-12)) | (r4 & (-12))) * (-318)));
        r5 = (r3 & r4) + (r3 | r4);
        r3 = ~((r2 ^ (-12)) | (r2 & (-12)));
        r4 = ~r2;
        r13 = (r4 ^ r1) | (r4 & r1);
        r13 = ~((r13 ^ 11) | (r13 & 11));
        r3 = ((r3 ^ r13) | (r3 & r13)) * 318;
        r4 = r4 | (-12);
        r13 = (r1 & 11) | (r1 ^ 11);
        r12 = new java.lang.Object[1];
        g("ﻲ艓껐奛\uf050쵮⌡\uf2a3錅ṹꀊ꛴", (((r5 ^ r3) + ((r3 & r5) << 1)) - (~(((~((r1 ^ r4) | (r4 & r1))) | (~((r2 ^ r13) | (r13 & r2)))) * 318))) - 1, r12);
        r42 = (java.lang.String) r12[0];
        r4 = new java.lang.Object[1];
        g("ﻲ艓껐奛\uf050쵮⌡\uf2a3벱Ꚋ㈹꒮", 11 - (~(android.view.ViewConfiguration.getScrollBarSize() >> 8)), r4);
        r43 = (java.lang.String) r4[0];
        r1 = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
        r3 = -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1));
        r2 = -android.view.KeyEvent.getDeadChar(0, 0);
        r5 = new java.lang.Object[1];
        h(true, 11 - (~(r1 >> 24)), "\u0005\ufffe\u0014ￋ\t\u0001\u0010\u000f\u0015\u000fￋ\n", ((r3 | 119) << 1) - (r3 ^ 119), (r2 ^ 11) + ((r2 & 11) << 1), r5);
        r44 = (java.lang.String) r5[0];
        r4 = new java.lang.Object[1];
        g("匠콰⭎⿄軇\ue3cao辀錅ṹꀊ꛴", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 11, r4);
        r45 = (java.lang.String) r4[0];
        r1 = android.view.ViewConfiguration.getTapTimeout();
        r2 = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
        r3 = -(android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1));
        r5 = new java.lang.Object[1];
        h(true, 4 - (~(r1 >> 16)), "\u0014\uffd0\u000f\n\u0003", (r2 >> 24) + 115, (r3 & 3) + (r3 | 3), r5);
        r46 = (java.lang.String) r5[0];
        r2 = -(-(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
        r3 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
        r4 = android.view.View.resolveSize(0, 0);
        r5 = new java.lang.Object[1];
        h(true, 3 - (~r2), "\u001a\u000bￕ\t", (r3 ^ 110) + ((r3 & 110) << 1), ((r4 | 3) << 1) - (r4 ^ 3), r5);
        r1 = new java.lang.String[]{r41, r42, r43, r44, r45, r46, (java.lang.String) r5[0]};
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x032f, code lost:
    
        r5 = -(android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
        r8 = new java.lang.Object[1];
        g("讂\ue2ba훰薳椼⟈", ((r5 | 6) << 1) - (r5 ^ 6), r8);
        r7 = (java.lang.String) r8[0];
        r8 = -(-(android.view.ViewConfiguration.getTapTimeout() >> 16));
        r5 = -android.graphics.Color.rgb(0, 0, 0);
        r9 = r5 * (-515);
        r10 = ((-83820938) & r9) + (r9 | (-83820938));
        r9 = ~((16777089 & r1) | (16777089 ^ r1));
        r11 = ~r1;
        r12 = ~((r11 ^ r5) | (r11 & r5));
        r9 = (r9 & r12) | (r9 ^ r12);
        r12 = ~(((-16777090) ^ r11) | ((-16777090) & r11));
        r9 = ((r9 & r12) | (r9 ^ r12)) * (-516);
        r5 = ~r5;
        r13 = (16777089 ^ r5) | (16777089 & r5);
        r13 = ~((r13 & r1) | (r13 ^ r1));
        r14 = (r5 ^ r11) | (r5 & r11);
        r14 = ~((r14 & (-16777090)) | ((-16777090) ^ r14));
        r15 = (((r10 & r9) + (r9 | r10)) - (~(-(-(((r13 ^ r14) | (r14 & r13)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR))))) - 1;
        r5 = ((~((r5 ^ (-16777090)) | ((-16777090) & r5))) | r12) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR;
        r12 = new java.lang.Object[1];
        h(false, (r8 & 8) + (r8 | 8), "\ufffe�\u0005\u0002\ufffa￼\uffff\t", (r15 & r5) + (r5 | r15), -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), r12);
        r7 = new java.lang.String[]{r7, (java.lang.String) r12[0]};
        r5 = 2;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x21e4, code lost:
    
        if (r2 >= 7) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x21e8, code lost:
    
        r3 = new java.lang.Object[]{r1[r2]};
        r4 = com.facetec.sdk.al.d(493527529);
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x21f3, code lost:
    
        if (r4 != null) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x21f5, code lost:
    
        r4 = (char) android.text.TextUtils.indexOf(r6, r6, 0, 0);
        r11 = android.view.ViewConfiguration.getScrollFriction();
        r12 = android.util.TypedValue.complexToFloat(0);
        r13 = (byte) 1;
        r5 = (byte) (r13 - 1);
        r21 = r1;
        r50 = r9;
        r10 = new java.lang.Object[1];
        f(r13, r5, r5, r10);
        r4 = com.facetec.sdk.al.c(r4, (r11 > 0.0f ? 1 : (r11 == 0.0f ? 0 : -1)) + 1011, (r12 > 0.0f ? 1 : (r12 == 0.0f ? 0 : -1)) + 24, -1165632751, false, (java.lang.String) r10[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x223d, code lost:
    
        r3 = ((java.lang.Long) ((java.lang.reflect.Method) r4).invoke(null, r3)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x224a, code lost:
    
        r9 = 48006960;
        r34 = r6;
        r41 = r8;
        r13 = r2;
        r1 = (int) java.lang.Runtime.getRuntime().maxMemory();
        r42 = r1 ^ r14;
        r1 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
        r52 = r3 ^ r14;
        r11 = (((((165 * r9) + ((-163) * r3)) + ((-328) * (((r42 | r3) ^ r14) | r9))) + ((r9 | r1) * r1)) + (r1 * (((r3 | (r42 | r9)) ^ r14) | ((((r9 ^ r14) | r52) ^ r14) | ((r52 | r1) ^ r14))))) - 2062605001;
        r2 = (int) android.os.Process.getElapsedCpuTime();
        r5 = r64;
        r4 = ~((-670494832) | r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x22de, code lost:
    
        if (((((int) (r11 >> 32)) & ((((~((~r2) | 1269120919)) | (-168105492)) * 783) - 80159530)) | (((((((~(r41 | 2107721241)) | r4) * 1150) + 334239082) + ((r4 | (~(r41 | 670494831))) * (-575))) + (((~(2107721241 | r5)) | (~(r41 | (-2107721242)))) * 575)) & ((int) r11))) == 0) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x2329, code lost:
    
        r2 = ((r13 & 1) << 1) + (r13 ^ 1);
        r7 = r5;
        r1 = r21;
        r6 = r34;
        r8 = r41;
        r9 = r50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x03ef, code lost:
    
        if (r8 >= r5) goto L568;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x22e0, code lost:
    
        r3 = ~r13;
        r4 = ~((r41 & (-91)) | (r41 ^ (-91)));
        r4 = (r4 ^ r3) | (r4 & r3);
        r6 = ~((r5 ^ 90) | (r5 & 90));
        r1 = (((4499 - (~(-(-(r13 * (-97)))))) + (((~((r3 & r41) | (r3 ^ r41))) | (~((r3 ^ 90) | (r3 & 90)))) * 98)) - (~(((r4 ^ r6) | (r4 & r6)) * (-49)))) - 1;
        r3 = ~((r3 & r5) | (r3 ^ r5));
        r2 = ~(r13 | 90);
        r2 = ((r2 ^ r3) | (r3 & r2)) * 49;
        r1 = (r1 ^ r2) + ((r1 & r2) << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x2345, code lost:
    
        if (r1 == 0) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x2347, code lost:
    
        r1 = new java.lang.Object[]{null, new int[]{r2 ^ (r2 << 5)}, new int[]{((~r1) & r5) | (r1 & r41)}, new int[]{r5}};
        r2 = (((r41 | (-493535250)) * 494) + 45332005) + (((~(r41 | 579156846)) | (-527166232)) * 494);
        r4 = (-1763436072) - (~(-(-(((r2 | 16) << 1) - (r2 ^ 16)))));
        r2 = r4 << 13;
        r2 = (~(r2 & r4)) & (r2 | r4);
        r4 = r2 >>> 17;
        r2 = (r2 & (~r4)) | ((~r2) & r4);
        r2 = com.facetec.sdk.ev.i;
        com.facetec.sdk.ev.j = ((r2 & 89) + (r2 | 89)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x23aa, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x23ab, code lost:
    
        r1 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x23b0, code lost:
    
        r3 = android.text.TextUtils.indexOf(r1, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        r4 = new java.lang.Object[1];
        g("ꀌകю̾甆玫沌ퟐ⼽纠즒\ueb81\uda25⯧", (r3 ^ 14) + ((r3 & 14) << 1), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x23c7, code lost:
    
        r3 = new java.lang.Object[]{(java.lang.String) r4[0]};
        r4 = com.facetec.sdk.al.d(1590238701);
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x23d2, code lost:
    
        if (r4 != null) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x23d4, code lost:
    
        r6 = (char) android.view.View.MeasureSpec.getSize(0);
        r7 = android.widget.ExpandableListView.getPackedPositionForGroup(0);
        r4 = android.view.ViewConfiguration.getLongPressTimeout();
        r9 = (byte) 0;
        r12 = new java.lang.Object[1];
        f(r9, r9, r9, r12);
        r4 = com.facetec.sdk.al.c(r6, (r7 > 0 ? 1 : (r7 == 0 ? 0 : -1)) + 2078, (r4 >> 16) + 24, -114923755, false, (java.lang.String) r12[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x2408, code lost:
    
        r3 = (java.lang.String) ((java.lang.reflect.Method) r4).invoke(null, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x2411, code lost:
    
        if (r3 == null) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x2414, code lost:
    
        r7 = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
        r6 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
        r9 = new java.lang.Object[1];
        h(false, r7 + 11, "\u000f\ufff7\u0004\u0005�\ufffb\u0004\u0003\u0005\ufffa\ufff9", (r6 & 126) + (r6 | 126), 10 - (android.view.ViewConfiguration.getTapTimeout() >> 16), r9);
        r4 = new java.lang.String[]{(java.lang.String) r9[0]};
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x2446, code lost:
    
        if (r2 > 0) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x244e, code lost:
    
        if (r3.contains(r4[r2]) == false) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x2451, code lost:
    
        r2 = (r2 & 1) + (r2 | 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x03f7, code lost:
    
        if (r2.contains(r7[r8]) == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0e97, code lost:
    
        r6 = r1;
        r1 = ((r8 | (-19)) << 1) - (r8 ^ (-19));
        r8 = ((r1 | 20) << 1) - (r1 ^ 20);
        r1 = r6;
        r4 = r4;
        r3 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        r5 = 2;
        r6 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x03f9, code lost:
    
        r2 = com.facetec.sdk.ev.i;
        r5 = ((r2 | 63) << 1) - (r2 ^ 63);
        r2 = r5 % 128;
        com.facetec.sdk.ev.j = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0408, code lost:
    
        if ((r5 % 2) == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x040c, code lost:
    
        r5 = (r2 & 39) + (r2 | 39);
        com.facetec.sdk.ev.i = r5 % 128;
        r5 = r5 % 2;
        r7 = android.widget.ExpandableListView.getPackedPositionForGroup(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x041b, code lost:
    
        if (r5 != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x041d, code lost:
    
        r9 = new java.lang.Object[1];
        g("ꀌക瘛툯ꀌക⟆\uf60f崩鴋\udb7c\ud841썞筣흓\u1adf\ue0eb予Ŝ捡ᬖᜃﳣᗎ", (r7 > 0 ? 1 : (r7 == 0 ? 0 : -1)) * 19, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x042f, code lost:
    
        r2 = new java.lang.Object[]{(java.lang.String) r9[0]};
        r5 = com.facetec.sdk.al.d(1590238701);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x043a, code lost:
    
        if (r5 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x043c, code lost:
    
        r5 = (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
        r7 = android.text.TextUtils.indexOf("", r3);
        r8 = android.os.Process.getElapsedCpuTime();
        r12 = (byte) 0;
        r15 = new java.lang.Object[1];
        f(r12, r12, r12, r15);
        r5 = com.facetec.sdk.al.c(r5, r7 + 2079, (r8 > 0 ? 1 : (r8 == 0 ? 0 : -1)) + 23, -114923755, false, (java.lang.String) r15[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0479, code lost:
    
        r2 = ((java.lang.reflect.Method) r5).invoke(null, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0480, code lost:
    
        r8 = new java.lang.Object[1];
        g("ꀌക瘛툯ꀌക⟆\uf60f崩鴋\uf723놼껐奛\uf050쵮\ude39奚쇇\uf485谲⼢䦛⺔崩鴋㨆䜸뼳⇼", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 53) * 72, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0495, code lost:
    
        r5 = new java.lang.Object[]{(java.lang.String) r8[0]};
        r7 = com.facetec.sdk.al.d(1590238701);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x04a0, code lost:
    
        if (r7 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x04a2, code lost:
    
        r7 = (char) (android.view.KeyEvent.getMaxKeyCode() >> 16);
        r8 = android.text.TextUtils.indexOf("", r3, 0, 0);
        r10 = android.widget.ExpandableListView.getPackedPositionGroup(0);
        r12 = (byte) 0;
        r15 = new java.lang.Object[1];
        f(r12, r12, r12, r15);
        r7 = com.facetec.sdk.al.c(r7, r8 + 2079, r10 + 24, -114923755, false, (java.lang.String) r15[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x04dd, code lost:
    
        r5 = ((java.lang.reflect.Method) r7).invoke(null, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x04e4, code lost:
    
        if (r2 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x04e6, code lost:
    
        r7 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x05bf, code lost:
    
        r8 = new java.lang.Object[]{r2, 42};
        r9 = com.facetec.sdk.al.d(-582857820);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x05d5, code lost:
    
        if (r9 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x2e02, code lost:
    
        if (r4 == null) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x05d7, code lost:
    
        r9 = (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
        r10 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        r12 = android.view.KeyEvent.normalizeMetaState(0);
        r13 = (byte) 1;
        r14 = (byte) (r13 - 1);
        r6 = new java.lang.Object[1];
        f(r13, r14, r14, r6);
        r9 = com.facetec.sdk.al.c(r9, 2365 - r10, r12 + 24, 2058170716, false, (java.lang.String) r6[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0617, code lost:
    
        r8 = ((java.lang.Long) ((java.lang.reflect.Method) r9).invoke(null, r8)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x2457, code lost:
    
        r6 = new java.lang.Object[1];
        g("㈹꒮꽸\uf0df\uf723놼၆ð\uf723놼\uf4a8ຌ\ue8fc\ueda7썦塛뼝戥", 18 - android.view.Gravity.getAbsoluteGravity(0, 0), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x246a, code lost:
    
        r2 = new java.lang.Object[]{(java.lang.String) r6[0]};
        r3 = com.facetec.sdk.al.d(1590238701);
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x2475, code lost:
    
        if (r3 != null) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x2477, code lost:
    
        r6 = (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
        r4 = android.view.KeyEvent.getDeadChar(0, 0);
        r7 = android.view.ViewConfiguration.getKeyRepeatTimeout();
        r8 = (byte) 0;
        r11 = new java.lang.Object[1];
        f(r8, r8, r8, r11);
        r3 = com.facetec.sdk.al.c(r6, r4 + 2078, 24 - (r7 >> 16), -114923755, false, (java.lang.String) r11[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x24a9, code lost:
    
        r2 = ((java.lang.reflect.Method) r3).invoke(null, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x24b0, code lost:
    
        if (r2 == null) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x24b2, code lost:
    
        r3 = com.facetec.sdk.ev.j;
        com.facetec.sdk.ev.i = ((r3 & 41) + (r3 | 41)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0624, code lost:
    
        r12 = 813672646;
        r6 = (int) android.os.SystemClock.elapsedRealtime();
        r14 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE;
        r25 = r4;
        r24 = r11;
        r10 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE;
        r21 = r2;
        r1 = -1;
        r5 = r6;
        r29 = r5 ^ r1;
        r14 = (((((r14 * r12) + ((-219) * r8)) + (((((r12 ^ r1) | (r8 ^ r1)) ^ r1) | (((r29 | r12) | r8) ^ r1)) * r10)) + ((-440) * (((r29 | r8) ^ r1) | r12))) + (r10 * ((r12 | r8) | r5))) + 345524752;
        r2 = android.os.Process.myTid();
        r6 = r64;
        r4 = ~(1241379764 | r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x24be, code lost:
    
        r3 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
        r6 = new java.lang.Object[1];
        g("ﲿ\u2fd6랩嘭㈹꒮\u0c3a苴", ((r3 | 7) << 1) - (r3 ^ 7), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x24dc, code lost:
    
        if (r2.equals((java.lang.String) r6[0]) != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x24e0, code lost:
    
        r2 = android.view.ViewConfiguration.getKeyRepeatDelay() >> 16;
        r3 = com.facetec.sdk.fl.d();
        r4 = r2 * (-381);
        r6 = (r4 & 4416) + (r4 | 4416);
        r4 = ~r2;
        r7 = r4 * (-191);
        r8 = ~((r3 ^ 23) | (r3 & 23));
        r9 = (((r6 & r7) + (r6 | r7)) - (~(-(-(((r2 ^ r8) | (r8 & r2)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE))))) - 1;
        r2 = ~(r4 | 23);
        r3 = ~r3;
        r3 = ~((r3 ^ 23) | (r3 & 23));
        r2 = -(-(((r2 ^ r3) | (r2 & r3)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
        r4 = new java.lang.Object[1];
        g("獢킏쎞ᅕ옢潍\u0ffa\udabeᡃ렋況쀴ꀌക杬\uee4b䱲\uec60ᆐ촓㕶盶몼冫", (r9 & r2) + (r2 | r9), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x252d, code lost:
    
        r2 = new java.lang.Object[]{(java.lang.String) r4[0]};
        r3 = com.facetec.sdk.al.d(1590238701);
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x2538, code lost:
    
        if (r3 != null) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x253a, code lost:
    
        r6 = (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8);
        r7 = android.text.TextUtils.lastIndexOf(r1, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        r3 = android.view.View.MeasureSpec.getMode(0);
        r8 = (byte) 0;
        r11 = new java.lang.Object[1];
        f(r8, r8, r8, r11);
        r3 = com.facetec.sdk.al.c(r6, 2077 - r7, 24 - r3, -114923755, false, (java.lang.String) r11[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x256b, code lost:
    
        r2 = (java.lang.String) ((java.lang.reflect.Method) r3).invoke(null, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x2574, code lost:
    
        if (r2 == null) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x06d5, code lost:
    
        if (((((int) (r14 >> 32)) & ((((((~((-369793452) | (~r2))) | (~(1067432959 | r2))) * (-272)) + 840566506) + (((~((-907000256) | r2)) | 537206804) * (-272))) + (((~(r2 | 907000255)) | 530226155) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))) | (((((((~(r24 | (-1079358113))) | (~(1616361121 | r6))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) + 279550909) + (((~(r24 | (-1616361122))) | r4) * (-1040))) + ((r4 | ((~(r24 | (-1241379765))) | 537003009)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL)) & ((int) r14))) == 477111747) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x2576, code lost:
    
        r2 = java.lang.Integer.parseInt(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x257a, code lost:
    
        if (r2 == 0) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x257c, code lost:
    
        r3 = com.facetec.sdk.ev.i;
        com.facetec.sdk.ev.j = (((r3 | 25) << 1) - (r3 ^ 25)) % 128;
        r2 = ((r2 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE) << 1) - (r2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x2591, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x2593, code lost:
    
        r3 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x2597, code lost:
    
        if (r3 != null) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x2599, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x259a, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x06d7, code lost:
    
        r2 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x259b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x259c, code lost:
    
        r3 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x25a1, code lost:
    
        if (r3 != null) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x25a3, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x25a4, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x25a5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x25a6, code lost:
    
        r3 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x25ab, code lost:
    
        if (r3 != null) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x06e5, code lost:
    
        if (r7 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x25ad, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x25ae, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x2239, code lost:
    
        r21 = r1;
        r50 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x233d, code lost:
    
        r34 = r6;
        r5 = r7;
        r41 = r8;
        r50 = r9;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x1f1c, code lost:
    
        r34 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x1bc2, code lost:
    
        r30 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x1795, code lost:
    
        r9 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x1a31, code lost:
    
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x06e7, code lost:
    
        r1 = com.facetec.sdk.ev.j + 109;
        com.facetec.sdk.ev.i = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x1628, code lost:
    
        r8 = new java.lang.Object[]{r2, 42};
        r2 = com.facetec.sdk.al.d(-582857820);
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x163e, code lost:
    
        if (r2 != null) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x1640, code lost:
    
        r2 = (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1);
        r5 = android.widget.ExpandableListView.getPackedPositionGroup(0);
        r11 = android.view.View.MeasureSpec.getMode(0);
        r10 = (byte) 1;
        r12 = (byte) (r10 - 1);
        r14 = new java.lang.Object[1];
        f(r10, r12, r12, r14);
        r2 = com.facetec.sdk.al.c(r2, 2365 - r5, r11 + 24, 2058170716, false, (java.lang.String) r14[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x1684, code lost:
    
        r8 = ((java.lang.Long) ((java.lang.reflect.Method) r2).invoke(null, r8)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x1691, code lost:
    
        r10 = 684651600;
        r12 = 503;
        r14 = -502;
        r29 = r10 | r8;
        r31 = r3;
        r21 = r4;
        r3 = -1;
        r32 = r10 ^ r3;
        r34 = r1;
        r1 = r6;
        r35 = r32 | (r1 ^ r3);
        r1 = (r29 | r1) ^ r3;
        r10 = (((((r10 * r12) + (r12 * r8)) + (r29 * r14)) + (((((r32 | (r8 ^ r3)) ^ r3) | (r35 ^ r3)) | r1) * r14)) + (502 * (r1 | (r3 ^ (r8 | r35))))) + 474545798;
        r1 = ((int) (r10 >> 32)) & ((((((~(1132009886 | r6)) | (~((-1113067671) | r7))) * (-406)) + 1969829306) + ((~((-612663329) | r7)) * (-406))) + (((~(1725730998 | r6)) | (~((-1132009887) | r7))) * 406));
        r3 = android.os.Process.myPid();
        r2 = ((int) r10) & ((((((~(145977873 | r4)) | (-1593833404)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) - 1095289427) + ((r3 | 135348753) * (-184))) + ((~(1583204283 | (~r3))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE));
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x1729, code lost:
    
        if (((r1 ^ r2) | (r2 & r1)) == 477111747) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x172b, code lost:
    
        r3 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x172e, code lost:
    
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x1558, code lost:
    
        r3 = android.text.TextUtils.indexOf(r1, r1, 0, 0);
        r8 = new java.lang.Object[1];
        g("ꀌക瘛툯ꀌക⟆\uf60f崩鴋\udb7c\ud841썞筣흓\u1adf\ue0eb予Ŝ捡ᬖᜃﳣᗎ", ((r3 | 23) << 1) - (r3 ^ 23), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x156f, code lost:
    
        r2 = new java.lang.Object[]{(java.lang.String) r8[0]};
        r3 = com.facetec.sdk.al.d(1590238701);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x06f1, code lost:
    
        if ((r1 % 2) != 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x157a, code lost:
    
        if (r3 != null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x157c, code lost:
    
        r3 = (char) (android.widget.ExpandableListView.getPackedPositionChild(0) + 1);
        r9 = android.graphics.Color.green(0);
        r11 = android.text.TextUtils.indexOf(r1, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        r10 = (byte) 0;
        r13 = new java.lang.Object[1];
        f(r10, r10, r10, r13);
        r3 = com.facetec.sdk.al.c(r3, r9 + 2078, r11 + 25, -114923755, false, (java.lang.String) r13[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x15b6, code lost:
    
        r2 = ((java.lang.reflect.Method) r3).invoke(null, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x15bd, code lost:
    
        r3 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
        r8 = new java.lang.Object[1];
        g("ꀌക瘛툯ꀌക⟆\uf60f崩鴋\uf723놼껐奛\uf050쵮\ude39奚쇇\uf485谲⼢䦛⺔崩鴋㨆䜸뼳⇼", (r3 ^ 30) + ((r3 & 30) << 1), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x15d7, code lost:
    
        r5 = new java.lang.Object[]{(java.lang.String) r8[0]};
        r8 = com.facetec.sdk.al.d(1590238701);
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x15e2, code lost:
    
        if (r8 != null) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x15e4, code lost:
    
        r8 = (char) android.view.View.MeasureSpec.getMode(0);
        r9 = android.os.SystemClock.uptimeMillis();
        r11 = android.os.Process.myTid();
        r12 = (byte) 0;
        r14 = new java.lang.Object[1];
        f(r12, r12, r12, r14);
        r8 = com.facetec.sdk.al.c(r8, (r9 > 0 ? 1 : (r9 == 0 ? 0 : -1)) + 2077, (r11 >> 22) + 24, -114923755, false, (java.lang.String) r14[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x161e, code lost:
    
        r8 = ((java.lang.reflect.Method) r8).invoke(null, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x1625, code lost:
    
        if (r2 == null) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x1627, code lost:
    
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x06f3, code lost:
    
        r1 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x1731, code lost:
    
        r34 = r1;
        r21 = r4;
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x1a2f, code lost:
    
        r34 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0da3, code lost:
    
        r2 = -android.os.Process.getGidForName(r1);
        r4 = new java.lang.Object[1];
        g("ꀌക\ue24c晧荡笉侍\uda84䚧캡㗢뀞\u2e66휉", (r2 & 12) + (r2 | 12), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0dba, code lost:
    
        r2 = new java.lang.Object[]{(java.lang.String) r4[0]};
        r3 = com.facetec.sdk.al.d(1590238701);
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0dc5, code lost:
    
        if (r3 != null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0dc7, code lost:
    
        r7 = (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
        r3 = android.view.ViewConfiguration.getEdgeSlop();
        r5 = android.graphics.ImageFormat.getBitsPerPixel(0);
        r8 = (byte) 0;
        r11 = new java.lang.Object[1];
        f(r8, r8, r8, r11);
        r3 = com.facetec.sdk.al.c(r7, (r3 >> 16) + 2078, 23 - r5, -114923755, false, (java.lang.String) r11[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0df8, code lost:
    
        r2 = ((java.lang.reflect.Method) r3).invoke(null, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0dff, code lost:
    
        r8 = -android.text.TextUtils.indexOf(r1, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        r3 = -(-(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
        r4 = -android.graphics.Color.red(0);
        r13 = new java.lang.Object[1];
        h(false, r8, "\u0000", (r3 & 69) + (r3 | 69), (r4 ^ 1) + ((r4 & 1) << 1), r13);
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x0e32, code lost:
    
        if (r2.equals((java.lang.String) r13[0]) == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x06f5, code lost:
    
        r3 = new java.lang.Object[]{r7, r1};
        r4 = com.facetec.sdk.al.d(-582857820);
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x0e34, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x0ba2, code lost:
    
        if (r21 == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x0ba5, code lost:
    
        r2 = new java.lang.Object[]{r21, 42};
        r4 = com.facetec.sdk.al.d(-582857820);
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0bba, code lost:
    
        if (r4 != null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0bbc, code lost:
    
        r8 = r27;
        r9 = (char) (android.text.TextUtils.lastIndexOf(r8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1);
        r1 = android.os.Process.myTid();
        r4 = android.view.ViewConfiguration.getJumpTapTimeout();
        r7 = (byte) 1;
        r10 = (byte) (r7 - 1);
        r12 = new java.lang.Object[1];
        f(r7, r10, r10, r12);
        r4 = com.facetec.sdk.al.c(r9, (r1 >> 22) + 2365, (r4 >> 16) + 24, 2058170716, false, (java.lang.String) r12[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x0bfd, code lost:
    
        r1 = ((java.lang.Long) ((java.lang.reflect.Method) r4).invoke(null, r2)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0c0a, code lost:
    
        r3 = 481113145;
        r27 = r8;
        r7 = -1;
        r29 = r1 ^ r7;
        r13 = ((r6 ^ r7) | r1) ^ r7;
        r33 = r3 ^ r7;
        r9 = ((((((-1939) * r3) + (971 * r1)) + ((((r29 | r3) ^ r7) | r13) * (-970))) + (1940 * ((r33 | r1) ^ r7))) + (970 * (((r33 | r29) ^ r7) | r13))) + 678084253;
        r1 = (int) (r9 >> 32);
        r3 = (int) android.os.SystemClock.elapsedRealtime();
        r6 = r64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0ca6, code lost:
    
        if (((r1 & ((((((~((-5173443) | r6)) | 1442399853) * 672) + 700488074) + (((~(r24 | 5173442)) | (~(1442399853 | r6))) * (-672))) + (((~(r24 | (-1442399854))) | 4735040) * 672))) | (((int) r9) & ((((((~(401588098 | r3)) | (-2147467183)) * (-140)) + 648381051) + ((~((-1745879085) | r3)) * 70)) + (((~(r3 | (-1838814509))) | (-2054531759)) * 70)))) != 542074309) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0bfb, code lost:
    
        r8 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0700, code lost:
    
        if (r4 != null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0e94, code lost:
    
        r1 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0a9c, code lost:
    
        r27 = "";
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0aa0, code lost:
    
        r2 = new java.lang.Object[]{r26, 42};
        r4 = com.facetec.sdk.al.d(-582857820);
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0ab5, code lost:
    
        if (r4 != null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0ab7, code lost:
    
        r7 = (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1);
        r1 = (byte) android.view.KeyEvent.getModifierMetaStateMask();
        r4 = android.view.ViewConfiguration.getScrollFriction();
        r5 = (byte) 1;
        r8 = (byte) (r5 - 1);
        r10 = new java.lang.Object[1];
        f(r5, r8, r8, r10);
        r4 = com.facetec.sdk.al.c(r7, 2364 - r1, (r4 > 0.0f ? 1 : (r4 == 0.0f ? 0 : -1)) + 23, 2058170716, false, (java.lang.String) r10[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0af1, code lost:
    
        r1 = ((java.lang.Long) ((java.lang.reflect.Method) r4).invoke(null, r2)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0afe, code lost:
    
        r3 = -860750012;
        r7 = -167;
        r11 = -1;
        r13 = r1 ^ r11;
        r9 = r6;
        r1 = (((((r7 * r3) + (r7 * r1)) + (((((r3 ^ r11) | r13) ^ r11) | ((r13 | r9) ^ r11)) * 336)) + ((-168) * (((r1 | r3) ^ r11) | ((r3 | r9) ^ r11)))) + (com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE * (((r3 | (r9 ^ r11)) ^ r11) | r13))) + 2019947410;
        r4 = (int) java.lang.Runtime.getRuntime().freeMemory();
        r3 = ((int) (r1 >> 32)) & (((((~((-704684107) | r4)) | 4786688) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) - 1820323112) + ((~((~r4) | (-704684107))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING));
        r1 = ((int) r1) & ((((((~((-1481739051) | r6)) | 44512640) * 672) - 428902027) + (((~(r24 | 1481739050)) | (~(44512640 | r6))) * (-672))) + (((~(r24 | (-44512641))) | 65792) * 672));
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0b9c, code lost:
    
        if (((r1 ^ r3) | (r3 & r1)) == (-1032769152)) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0b9f, code lost:
    
        r27 = "";
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x080d, code lost:
    
        r15 = r2;
        r21 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0811, code lost:
    
        r2 = new java.lang.Object[]{r21, 42};
        r3 = com.facetec.sdk.al.d(-582857820);
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x0828, code lost:
    
        if (r3 != null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x082a, code lost:
    
        r8 = (char) android.text.TextUtils.indexOf("", "", 0);
        r9 = android.os.SystemClock.uptimeMillis();
        r11 = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
        r3 = (byte) 1;
        r5 = (byte) (r3 - 1);
        r14 = new java.lang.Object[1];
        f(r3, r5, r5, r14);
        r3 = com.facetec.sdk.al.c(r8, (r9 > 0 ? 1 : (r9 == 0 ? 0 : -1)) + 2364, (r11 > 0.0d ? 1 : (r11 == 0.0d ? 0 : -1)) + 24, 2058170716, false, (java.lang.String) r14[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0868, code lost:
    
        r1 = ((java.lang.Long) ((java.lang.reflect.Method) r3).invoke(null, r2)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x0875, code lost:
    
        r8 = 558412839;
        r27 = "";
        r26 = r15;
        r14 = -1;
        r29 = r8 ^ r14;
        r6 = (int) java.lang.Runtime.getRuntime().maxMemory();
        r10 = (((((236 * r8) + (471 * r1)) + ((-235) * (((r29 | (r6 ^ r14)) ^ r14) | r1))) + ((-470) * (((r29 | r6) ^ r14) | r1))) + (com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE * ((((r1 ^ r14) | r8) ^ r14) | (((r29 | r1) | r6) ^ r14)))) + 600784559;
        r3 = r64;
        r1 = ((int) (r10 >> 32)) & ((((((~(1830131289 | r3)) | (-392904879)) * 672) - 1586981366) + (((~(r24 | (-1830131290))) | (~((-392904879) | r3))) * (-672))) + (((~(r24 | 392904878)) | (-2139084544)) * 672));
        r2 = ((int) r10) & (((r4 * 495) - 838164114) + (((~((~android.os.Process.myPid()) | 1809820043)) | 710279306) * 495));
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x090f, code lost:
    
        if (((r1 ^ r2) | (r1 & r2)) == 477111747) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x0912, code lost:
    
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x0915, code lost:
    
        r26 = r2;
        r3 = r6;
        r21 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x06da, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0706, code lost:
    
        r9 = (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1);
        r8 = android.view.ViewConfiguration.getScrollBarSize();
        r4 = android.text.TextUtils.indexOf("", "", 0, 0);
        r10 = (byte) 1;
        r11 = (byte) (r10 - 1);
        r13 = new java.lang.Object[1];
        f(r10, r11, r11, r13);
        r4 = com.facetec.sdk.al.c(r9, (r8 >> 8) + 2365, r4 + 24, 2058170716, false, (java.lang.String) r13[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x04e9, code lost:
    
        r6 = r1;
        r25 = r4;
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x06e4, code lost:
    
        r7 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x04f0, code lost:
    
        r5 = -(r7 > 0 ? 1 : (r7 == 0 ? 0 : -1));
        r8 = new java.lang.Object[1];
        g("ꀌക瘛툯ꀌക⟆\uf60f崩鴋\udb7c\ud841썞筣흓\u1adf\ue0eb予Ŝ捡ᬖᜃﳣᗎ", (r5 & 23) + (r5 | 23), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0506, code lost:
    
        r2 = new java.lang.Object[]{(java.lang.String) r8[0]};
        r5 = com.facetec.sdk.al.d(1590238701);
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x0511, code lost:
    
        if (r5 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x0513, code lost:
    
        r5 = (char) ((android.view.ViewConfiguration.getScrollFriction() > r6 ? 1 : (android.view.ViewConfiguration.getScrollFriction() == r6 ? 0 : -1)) - 1);
        r8 = android.view.KeyEvent.getMaxKeyCode();
        r9 = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
        r12 = (byte) 0;
        r14 = new java.lang.Object[1];
        f(r12, r12, r12, r14);
        r5 = com.facetec.sdk.al.c(r5, (r8 >> 16) + 2078, (r9 >> 24) + 24, -114923755, false, (java.lang.String) r14[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x054f, code lost:
    
        r2 = ((java.lang.reflect.Method) r5).invoke(null, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x0556, code lost:
    
        r5 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
        r8 = new java.lang.Object[1];
        g("ꀌക瘛툯ꀌക⟆\uf60f崩鴋\uf723놼껐奛\uf050쵮\ude39奚쇇\uf485谲⼢䦛⺔崩鴋㨆䜸뼳⇼", ((r5 | 30) << 1) - (r5 ^ 30), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x0570, code lost:
    
        r5 = new java.lang.Object[]{(java.lang.String) r8[0]};
        r7 = com.facetec.sdk.al.d(1590238701);
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x057b, code lost:
    
        if (r7 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0740, code lost:
    
        r3 = ((java.lang.Long) ((java.lang.reflect.Method) r4).invoke(null, r3)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x057d, code lost:
    
        r7 = (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
        r9 = android.view.View.resolveSizeAndState(0, 0, 0);
        r10 = android.view.ViewConfiguration.getKeyRepeatTimeout();
        r12 = (byte) 0;
        r15 = new java.lang.Object[1];
        f(r12, r12, r12, r15);
        r7 = com.facetec.sdk.al.c(r7, 2078 - r9, 24 - (r10 >> 16), -114923755, false, (java.lang.String) r15[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x05b6, code lost:
    
        r7 = ((java.lang.reflect.Method) r7).invoke(null, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x05bd, code lost:
    
        if (r2 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x06de, code lost:
    
        r6 = r1;
        r25 = r4;
        r24 = r11;
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x0eb2, code lost:
    
        r6 = r1;
        r25 = r4;
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x01fb, code lost:
    
        r2 = com.facetec.sdk.ev.j;
        com.facetec.sdk.ev.i = ((r2 ^ 55) + ((r2 & 55) << 1)) % 128;
        r1 = new java.lang.Object[]{null, new int[1], new int[]{r1 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE}, new int[]{r1}};
        r2 = android.os.Process.myTid();
        r4 = (((((~((-701017341) | r3)) | (~(1072430847 | r2))) * (-831)) - 1936427754) + ((~((-155230229) | r2)) * (-1662))) + ((((~(r2 | 917200619)) | (~((~r2) | (-917200620)))) | (~(701017340 | r2))) * 831);
        r2 = com.facetec.sdk.fl.d();
        r3 = r4 * 399;
        r5 = ~((r4 & (-17)) | (r4 ^ (-17)));
        r6 = ~r4;
        r7 = ~(r6 | 16);
        r7 = (r7 ^ r5) | (r5 & r7);
        r8 = ~((r6 ^ r2) | (r6 & r2));
        r9 = (((r3 & 6384) + (r3 | 6384)) - (~(((r7 & r8) | (r7 ^ r8)) * 398))) - 1;
        r3 = -(-(((r4 ^ 16) | (r4 & 16)) * (-1194)));
        r2 = ~r2;
        r2 = ~((r2 ^ r6) | (r2 & r6));
        r2 = (r2 ^ r5) | (r2 & r5);
        r4 = ~((r6 ^ 16) | (r6 & 16));
        r2 = -(-(((r9 ^ r3) + ((r3 & r9) << 1)) + (((r2 ^ r4) | (r2 & r4)) * 398)));
        r4 = (r2 & (-1763436071)) + (r2 | (-1763436071));
        r2 = r4 << 13;
        r2 = ((~r2) & r4) | ((~r4) & r2);
        r3 = r2 >>> 17;
        r2 = (r2 & (~r3)) | ((~r2) & r3);
        r3 = r2 << 5;
        ((int[]) r1[1])[0] = (r2 & (~r3)) | ((~r2) & r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x02c7, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x074d, code lost:
    
        r8 = 140458162;
        r25 = r1;
        r15 = r2;
        r21 = r7;
        r6 = -1;
        r26 = r8 ^ r6;
        r1 = new java.util.Random().nextInt();
        r31 = (r26 | (r1 ^ r6)) ^ r6;
        r5 = 338;
        r11 = ((((((-337) * r8) + (339 * r3)) + (((r31 | (((r3 ^ r6) | r8) ^ r6)) | ((r8 | r1) ^ r6)) * (-338))) + (((r26 | r3) ^ r6) * r5)) + (r5 * (r31 | ((r1 | (r3 | r8)) ^ r6)))) + 1018739236;
        r2 = android.os.Process.myUid();
        r1 = ((int) (r11 >> 59)) & ((((((~(1781725167 | r2)) | (~((~r2) | (-1076015718)))) * (-318)) + 370585150) + (((~((-1076032486) | r2)) | 16768) * (-318))) + (((~(r2 | 1076032485)) | 1781708399) * 318));
        r6 = r64;
        r2 = ((int) r11) & ((((((~(r24 | 1867473702)) | (-2135910192)) | (~((-721830695) | r6))) * 717) + 2089307794) + (((~(1867473702 | r6)) | ((~(r24 | (-721830695))) | (-2135910192))) * 717));
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x01f9, code lost:
    
        if (((r2 ^ r5) | (r5 & r2)) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0806, code lost:
    
        if (((r1 ^ r2) | (r1 & r2)) == 477111747) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0808, code lost:
    
        r3 = r6;
        r26 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x091c, code lost:
    
        if (r26 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x091e, code lost:
    
        r2 = ~com.facetec.sdk.fl.d();
        r4 = ~(((-923192704) & r2) | ((-923192704) ^ r2));
        r5 = ((((-1149406312) & r4) | ((-1149406312) ^ r4)) * 764) + 928999640;
        r2 = -(-(((~((r2 ^ (-1149406312)) | ((-1149406312) & r2))) | 1082130432) * (-1528)));
        r6 = com.facetec.sdk.fl.d();
        r7 = ~((~r6) | 1958672933);
        r6 = ~((r6 ^ (-184550529)) | ((-184550529) & r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0992, code lost:
    
        if (((((r5 & r2) + (r2 | r5)) - (~(-(-((r4 | 1938047256) * 764))))) - 1) <= ((((-1292359429) - (~((((-2143223462) & r7) | ((-2143223462) ^ r7)) * 446))) - (~(((1614684704 & r6) | (1614684704 ^ r6)) * 446))) + 1900042955)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0995, code lost:
    
        r4 = new java.lang.Object[]{r26, 82};
        r2 = com.facetec.sdk.al.d(-582857820);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x09aa, code lost:
    
        if (r2 != null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x09ac, code lost:
    
        r7 = (char) ((-1) - android.view.MotionEvent.axisFromString(""));
        r2 = (byte) android.view.KeyEvent.getModifierMetaStateMask();
        r6 = android.media.AudioTrack.getMinVolume();
        r9 = (byte) 1;
        r10 = (byte) (r9 - 1);
        r12 = new java.lang.Object[1];
        f(r9, r10, r10, r12);
        r2 = com.facetec.sdk.al.c(r7, r2 + 2366, 24 - (r6 > 0.0f ? 1 : (r6 == 0.0f ? 0 : -1)), 2058170716, false, (java.lang.String) r12[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x09e9, code lost:
    
        r6 = ((java.lang.Long) ((java.lang.reflect.Method) r2).invoke(null, r4)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x09f6, code lost:
    
        r8 = 662447614;
        r14 = androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING;
        r5 = r3;
        r3 = -1;
        r27 = "";
        r32 = r8 ^ r3;
        r10 = ((((((-419) * r8) + (421 * r6)) + (((r6 | r5) ^ r3) * r14)) + ((-420) * (r6 | r32))) + (r14 * ((((r6 ^ r3) | r32) ^ r3) | (r3 ^ ((r5 ^ r3) | r6))))) + 496749784;
        r2 = ~((~android.os.Process.myTid()) | 28086320);
        r1 = ((int) (r10 >>> 6)) & ((((r2 | 4096) * (-374)) - 474058870) + ((r2 | 28082224) * 374));
        r6 = r64;
        r2 = ((int) r10) & (((((((~(r24 | (-1990588848))) | 849719462) | (~(r24 | (-867152039)))) * (-1136)) - 1738041619) + ((((~((-1990588848) | r6)) | (~((-867152039) | r6))) | (~(r24 | 2008021423))) * (-568))) + ((((~(r24 | 1990588847)) | (~(r24 | 867152038))) | (~((-849719463) | r6))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0a98, code lost:
    
        if (((r1 ^ r2) | (r1 & r2)) == (-1032769152)) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0ca8, code lost:
    
        r1 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0cae, code lost:
    
        if (android.os.Build.VERSION.SDK_INT <= 33) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0cb0, code lost:
    
        r5 = new java.lang.Object[1];
        g("칧诖溥ꉞ㳙뼀⫋\uf3da䘗쵊絽쩠㠨\uea84魰ꩠ荡笉侍\uda84䚧캡㗢뀞좨崠嗰榴", android.view.View.getDefaultSize(0, 0) + 28, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0cc3, code lost:
    
        r3 = new java.lang.Object[]{(java.lang.String) r5[0]};
        r4 = com.facetec.sdk.al.d(1450487247);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0cce, code lost:
    
        if (r4 != null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0cd0, code lost:
    
        r7 = (char) (android.graphics.Color.green(0) + 6935);
        r4 = android.view.View.combineMeasuredStates(0, 0);
        r5 = android.view.View.getDefaultSize(0, 0);
        r8 = (byte) 3;
        r2 = (byte) (r8 - 3);
        r11 = new java.lang.Object[1];
        f(r8, r2, r2, r11);
        r4 = com.facetec.sdk.al.c(r7, 2389 - r4, r5 + 23, -241445065, false, (java.lang.String) r11[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0d03, code lost:
    
        r2 = ((java.lang.Long) ((java.lang.reflect.Method) r4).invoke(null, r3)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0d10, code lost:
    
        r7 = 189841237;
        r4 = android.os.Process.myTid();
        r9 = -500;
        r11 = androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING;
        r13 = -1;
        r26 = r2 ^ r13;
        r29 = r7 ^ r13;
        r5 = r4;
        r2 = (((((r9 * r7) + (r9 * r2)) + ((((r26 | r7) ^ r13) | (((r29 | r2) | r5) ^ r13)) * r11)) + (1002 * ((r29 | r26) ^ r13))) + (r11 * ((r2 | ((r5 ^ r13) | r29)) ^ r13))) + 1661335404;
        r5 = ~((~((int) java.lang.Runtime.getRuntime().maxMemory())) | 260868257);
        r4 = ((int) (r2 >> 32)) & ((((159383712 | r5) * (-970)) + 1764843552) + ((r5 | 101484545) * 970));
        r6 = r64;
        r2 = ((int) r2) & (((((~(r24 | 1422409386)) | (~((-14817024) | r6))) * 959) - 175880279) + (((~(1422409386 | r6)) | (~(r24 | (-14817024)))) * 959));
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0d9d, code lost:
    
        if (((r2 ^ r4) | (r4 & r2)) != 1) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0d9f, code lost:
    
        r1 = 1;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0e35, code lost:
    
        r2 = new int[r1];
        r4 = new int[r1];
        r5 = new int[r1];
        r5[r3] = r6;
        r9 = r24;
        r4[r3] = (r6 & (-261)) | (r9 & com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE);
        r1 = new java.lang.Object[]{null, r2, r4, r5};
        r3 = (((((~((-117563747) | r9)) | (~(1610612711 | r6))) * (-302)) + 835327133) + ((~((-117563747) | r6)) * (-604))) + (((~(1493048965 | r6)) | 1485443717) * 302);
        r4 = (r3 ^ 16) + ((r3 & 16) << 1);
        r6 = (r4 ^ (-1763436071)) + (((-1763436071) & r4) << 1);
        r3 = (r6 << 13) ^ r6;
        r3 = r3 ^ (r3 >>> 17);
        r2[0] = r3 ^ (r3 << 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0e93, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0eb7, code lost:
    
        r3 = -(-android.text.TextUtils.getOffsetBefore(r1, 0));
        r4 = android.view.ViewConfiguration.getScrollBarSize() >> 8;
        r5 = android.graphics.Color.argb(0, 0, 0, 0);
        r13 = new java.lang.Object[1];
        h(false, (r3 & 8) + (r3 | 8), "\u0011\u000b\ufff9￼\ufffa\ufff7\u0003�", ((r4 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) << 1) - (r4 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), (r5 & 2) + (r5 | 2), r13);
        r29 = (java.lang.String) r13[0];
        r2 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
        r3 = (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1));
        r13 = new java.lang.Object[1];
        h(true, (r2 & 7) + (r2 | 7), "\uffff\u0006\b\ufff7�\u0004", (r3 & 125) + (r3 | 125), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 3, r13);
        r30 = (java.lang.String) r13[0];
        r2 = -(-(android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)));
        r4 = new java.lang.Object[1];
        g("\uf331൳塔쏉뼳⇼풢譝", (r2 ^ 6) + ((r2 & 6) << 1), r4);
        r31 = (java.lang.String) r4[0];
        r4 = new java.lang.Object[1];
        g("狇\uf639淥Ԋ뼳⇼폌ꢉﳣᗎ", 9 - (~android.text.TextUtils.indexOf(r1, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), r4);
        r32 = (java.lang.String) r4[0];
        r4 = new java.lang.Object[1];
        g("襨蟞都綧捰\ue04d", 4 - (~(-(-(android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1))))), r4);
        r33 = (java.lang.String) r4[0];
        r2 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1));
        r4 = ~r2;
        r7 = ~r6;
        r5 = (r4 & r7) | (r4 ^ r7);
        r2 = ((r2 * 784) + 797) + ((~((r5 ^ 14) | (r5 & 14))) * (-783));
        r5 = ~((r7 ^ 14) | (r7 & 14));
        r4 = -(-(((r4 ^ r5) | (r4 & r5)) * 783));
        r5 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
        r8 = android.view.ViewConfiguration.getWindowTouchSlop() >> 8;
        r10 = new java.lang.Object[1];
        h(true, ((r2 | r4) << 1) - (r2 ^ r4), "\u0005\u0004ￍ\u0014\t\u000e\t\u0003\u0012ￎ\u0007\u0015\u0002", 115 - (~r5), (r8 & 7) + (r8 | 7), r10);
        r34 = (java.lang.String) r10[0];
        r4 = android.os.SystemClock.uptimeMillis();
        r2 = -android.view.View.resolveSizeAndState(0, 0, 0);
        r8 = android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16;
        r9 = (r8 * 784) - 3910;
        r8 = ~r8;
        r10 = ((r9 & 4698) + (r9 | 4698)) + ((~((r8 | r7) | 5)) * (-783));
        r8 = (r8 | (~((r7 ^ 5) | (r7 & 5)))) * 783;
        r12 = new java.lang.Object[1];
        h(false, 6 - (r4 > 0 ? 1 : (r4 == 0 ? 0 : -1)), "\ufffa\u0000\u0005\u0000\u0001", (r2 ^ 131) + ((r2 & 131) << 1), ((r10 | r8) << 1) - (r8 ^ r10), r12);
        r35 = (java.lang.String) r12[0];
        r4 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1));
        r5 = -(-(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
        r2 = -android.graphics.Color.blue(0);
        r9 = new java.lang.Object[1];
        h(false, 6 - (~r4), "ￒ\b\u000f\u0004\u0011\u0005", (r5 & 117) + (r5 | 117), (r2 & 1) + (r2 | 1), r9);
        r36 = (java.lang.String) r9[0];
        r4 = -(-(android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)));
        r5 = -android.text.TextUtils.getCapsMode(r1, 0, 0);
        r8 = android.view.KeyEvent.getDeadChar(0, 0);
        r9 = new java.lang.Object[1];
        h(false, ((r4 | 1) << 1) - (r4 ^ 1), "\u0007\ufff9", ((r5 | 132) << 1) - (r5 ^ 132), ((r8 | 1) << 1) - (r8 ^ 1), r9);
        r37 = (java.lang.String) r9[0];
        r2 = (android.os.Process.getThreadPriority(0) + 20) >> 6;
        r5 = new java.lang.Object[1];
        g("\udce3ᙯ∭랡뼳⇼ꠤ趑\ue186㎤\uf723놼鬵\uf777\uf1ee⇩", (r2 & 16) + (r2 | 16), r5);
        r38 = (java.lang.String) r5[0];
        r5 = new java.lang.Object[1];
        g("\udce3ᙯຽ槙⦭局Ԩᜨ嗰榴", 8 - (~(-(-(android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1))))), r5);
        r39 = (java.lang.String) r5[0];
        r4 = android.graphics.Color.blue(0);
        r5 = android.graphics.Color.argb(0, 0, 0, 0);
        r2 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
        r9 = new java.lang.Object[1];
        h(true, (r4 & 8) + (r4 | 8), "\ufff7\u0003\u0006\u0004\uffff\u0002\ufff5\u0006", (r5 & 128) + (r5 | 128), (r2 & 4) + (r2 | 4), r9);
        r40 = (java.lang.String) r9[0];
        r2 = -(-(android.view.ViewConfiguration.getTouchSlop() >> 8));
        r5 = new java.lang.Object[1];
        g("≐߶꘣鍡᭘鱉絽쩠퓯嗁\uf4c8\udd74", ((r2 | 12) << 1) - (r2 ^ 12), r5);
        r41 = (java.lang.String) r5[0];
        r2 = (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1));
        r5 = new java.lang.Object[1];
        g("≐߶꘣鍡᭘鱉絽쩠퓯嗁溥ꉞ血왋", (r2 & 13) + (r2 | 13), r5);
        r42 = (java.lang.String) r5[0];
        r4 = -(-(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
        r9 = new java.lang.Object[1];
        h(false, (r4 ^ 7) + ((r4 & 7) << 1), "\uffff\u0005\u0003\ufff6\ufffe\u0000\u0006", 130 - (~(-(-android.view.View.getDefaultSize(0, 0)))), 1 - (~(-(android.view.ViewConfiguration.getWindowTouchSlop() >> 8))), r9);
        r43 = (java.lang.String) r9[0];
        r4 = -(-(android.view.ViewConfiguration.getLongPressTimeout() >> 16));
        r5 = -android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        r9 = new java.lang.Object[1];
        h(false, ((r4 | 7) << 1) - (r4 ^ 7), "\u0003\u0006\ufffb\u0002\n\u0000\ufff4", ((r5 | 129) << 1) - (r5 ^ 129), (-16777216) - (~(-android.graphics.Color.rgb(0, 0, 0))), r9);
        r44 = (java.lang.String) r9[0];
        r2 = android.widget.ExpandableListView.getPackedPositionGroup(0);
        r8 = android.os.SystemClock.elapsedRealtimeNanos();
        r10 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
        r13 = new java.lang.Object[1];
        h(true, r2 + 7, "\u0000\u000f\u0004\u0007\f\u000eￎ", 119 - (~(r8 > 0 ? 1 : (r8 == 0 ? 0 : -1))), ((r10 | 6) << 1) - (r10 ^ 6), r13);
        r45 = (java.lang.String) r13[0];
        r2 = -android.widget.ExpandableListView.getPackedPositionChild(0);
        r5 = new java.lang.Object[1];
        g("㶛訰", ((r2 | 1) << 1) - (r2 ^ 1), r5);
        r46 = (java.lang.String) r5[0];
        r9 = new java.lang.Object[1];
        h(true, 19 - android.text.TextUtils.lastIndexOf(r1, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), "\u0000\ufff8\u0004\u0001\ufff4�\t\ufffe\f\ufff4\t\u0007\ufff6\t\b\t\u0003\ufffa￼\ufff6", 127 - (~(-(android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)))), 14 - (~(-(-(android.view.ViewConfiguration.getFadingEdgeLength() >> 16)))), r9);
        r47 = (java.lang.String) r9[0];
        r2 = -(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
        r5 = new java.lang.Object[1];
        g("\ue186㎤讂\ue2baϋ㞻", ((r2 | 6) << 1) - (r2 ^ 6), r5);
        r48 = (java.lang.String) r5[0];
        r8 = new java.lang.Object[1];
        g("떦䣍", 2 - android.text.TextUtils.indexOf(r1, r1, 0, 0), r8);
        r49 = (java.lang.String) r8[0];
        r2 = -(android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1));
        r4 = android.media.AudioTrack.getMinVolume();
        r5 = -(android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1));
        r9 = new java.lang.Object[1];
        h(false, ((r2 | 17) << 1) - (r2 ^ 17), "\ufff7\u0004\uffff\n\uffff\u0010\ufffb\bￃ\t\n\ufff7\n\u000b\t\t", (r4 > 0.0f ? 1 : (r4 == 0.0f ? 0 : -1)) + 126, ((r5 | 16) << 1) - (r5 ^ 16), r9);
        r50 = (java.lang.String) r9[0];
        r2 = -android.view.MotionEvent.axisFromString(r1);
        r4 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
        r5 = (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1));
        r9 = new java.lang.Object[1];
        h(false, ((r2 | 8) << 1) - (r2 ^ 8), "\ufffb\u0006\ufff7\n\ufffe\n\b\ufff7\ufff9", 125 - (~r4), (r5 ^ 4) + ((r5 & 4) << 1), r9);
        r51 = (java.lang.String) r9[0];
        r5 = new java.lang.Object[1];
        g("跤ॐ\ue0eb予싟孎\ue71a\u09a9ઝ\udbe5", 9 - (~(-(-(android.view.ViewConfiguration.getLongPressTimeout() >> 16)))), r5);
        r52 = (java.lang.String) r5[0];
        r8 = new java.lang.Object[1];
        h(false, 10 - (~android.view.View.MeasureSpec.getSize(0)), "\ufffa￼\ufffe\u000b\b\u000e\r\ufffeￏ\r\u000b", 123 - android.view.View.resolveSize(0, 0), android.text.TextUtils.lastIndexOf(r1, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 10, r8);
        r53 = (java.lang.String) r8[0];
        r4 = android.view.KeyEvent.normalizeMetaState(0);
        r2 = r4 * (-721);
        r5 = (r2 & (-7931)) + (r2 | (-7931));
        r2 = ~r4;
        r8 = ~((r2 & (-12)) | (r2 ^ (-12)));
        r8 = (r8 ^ r7) | (r8 & r7);
        r9 = ~((r4 ^ 11) | (r4 & 11));
        r8 = -(-(((r8 ^ r9) | (r8 & r9)) * 1444));
        r10 = (r5 ^ r8) + ((r5 & r8) << 1);
        r5 = (~(r4 | r6)) | r9;
        r8 = ~((r6 ^ 11) | (r6 & 11));
        r5 = ((r5 ^ r8) | (r5 & r8)) * (-1444);
        r8 = ((r10 | r5) << 1) - (r5 ^ r10);
        r2 = ~((r2 ^ 11) | (r2 & 11));
        r4 = ~((r4 ^ (-12)) | (r4 & (-12)));
        r2 = ((r2 ^ r4) | (r4 & r2)) * 722;
        r4 = -android.graphics.Color.red(0);
        r5 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
        r10 = new java.lang.Object[1];
        h(true, ((r8 | r2) << 1) - (r2 ^ r8), "\u0004\ufffb\u0003\ufffe\ufff4\ufff9\u0003\ufffe\f\u0003\n", (r4 & 127) + (r4 | 127), ((r5 | 11) << 1) - (r5 ^ 11), r10);
        r54 = (java.lang.String) r10[0];
        r9 = new java.lang.Object[1];
        g("䖑\u09d4\u181e調鰬痋望ﾯ罎⅜瓱澿貝\ue2b1獆뚯", 15 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)), r9);
        r55 = (java.lang.String) r9[0];
        r4 = -android.view.View.resolveSizeAndState(0, 0, 0);
        r5 = new java.lang.Object[1];
        g("䖑\u09d4\u181e調鰬痋뙘䇣Ɦô\uec93ꃡ仌\uda33", (r4 & 14) + (r4 | 14), r5);
        r4 = new java.lang.String[]{r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, (java.lang.String) r5[0]};
        r10 = new java.lang.Object[1];
        g("ꀌക⼽纠庆\ufde1犠玢庆\ufde1\u2e66휉", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 11, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x13d5, code lost:
    
        r2 = new java.lang.Object[]{(java.lang.String) r10[0]};
        r5 = com.facetec.sdk.al.d(1590238701);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x13e0, code lost:
    
        if (r5 != null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x13e2, code lost:
    
        r5 = (char) (android.view.ViewConfiguration.getTapTimeout() >> 16);
        r8 = android.os.Process.getElapsedCpuTime();
        r12 = android.text.TextUtils.indexOf(r1, r1, 0);
        r13 = (byte) 0;
        r3 = new java.lang.Object[1];
        f(r13, r13, r13, r3);
        r5 = com.facetec.sdk.al.c(r5, (r8 > 0 ? 1 : (r8 == 0 ? 0 : -1)) + 2077, 24 - r12, -114923755, false, (java.lang.String) r3[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x141d, code lost:
    
        r2 = (java.lang.String) ((java.lang.reflect.Method) r5).invoke(null, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x1426, code lost:
    
        if (r2 == null) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x1428, code lost:
    
        r3 = (byte) android.view.KeyEvent.getModifierMetaStateMask();
        r8 = new java.lang.Object[1];
        g("讂\ue2ba훰薳椼⟈", (r3 & 7) + (r3 | 7), r8);
        r5 = (java.lang.String) r8[0];
        r8 = android.view.KeyEvent.normalizeMetaState(0);
        r3 = -(android.view.ViewConfiguration.getScrollBarSize() >> 8);
        r11 = new java.lang.Object[1];
        h(false, r8 + 8, "\ufffe�\u0005\u0002\ufffa￼\uffff\t", (r3 ^ 126) + ((r3 & 126) << 1), 0 - (~(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16))), r11);
        r3 = new java.lang.String[]{r5, (java.lang.String) r11[0]};
        r5 = 2;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x1473, code lost:
    
        if (r8 >= r5) goto L569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x147b, code lost:
    
        if (r2.contains(r3[r8]) == false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x1a13, code lost:
    
        r34 = r1;
        r1 = (r8 ^ 74) + ((r8 & 74) << 1);
        r8 = ((r1 | (-73)) << 1) - (r1 ^ (-73));
        r6 = r6;
        r4 = r4;
        r1 = r34;
        r5 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x147d, code lost:
    
        r2 = com.facetec.sdk.ev.i + 81;
        com.facetec.sdk.ev.j = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x1486, code lost:
    
        if ((r2 % r5) == 0) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x1488, code lost:
    
        r8 = new java.lang.Object[1];
        g("ꀌക瘛툯ꀌക⟆\uf60f崩鴋\udb7c\ud841썞筣흓\u1adf\ue0eb予Ŝ捡ᬖᜃﳣᗎ", 82 % android.text.TextUtils.indexOf(r1, r1, 0, 0), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x149c, code lost:
    
        r2 = new java.lang.Object[]{(java.lang.String) r8[0]};
        r3 = com.facetec.sdk.al.d(1590238701);
     */
    /* JADX WARN: Removed duplicated region for block: B:288:0x2d75  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x2dda  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x2e10 A[Catch: all -> 0x405a, TryCatch #11 {all -> 0x405a, blocks: (B:5:0x001c, B:7:0x0022, B:8:0x005c, B:12:0x02e1, B:14:0x02ef, B:15:0x0322, B:29:0x042f, B:31:0x043c, B:32:0x0479, B:34:0x0495, B:36:0x04a2, B:37:0x04dd, B:40:0x05bf, B:42:0x05d7, B:43:0x0617, B:51:0x06f5, B:54:0x0706, B:55:0x0740, B:64:0x0995, B:66:0x09ac, B:67:0x09e9, B:74:0x0cc3, B:76:0x0cd0, B:77:0x0d03, B:85:0x13d5, B:87:0x13e2, B:88:0x141d, B:99:0x149c, B:101:0x14a9, B:102:0x14e2, B:104:0x1500, B:106:0x150d, B:107:0x1547, B:112:0x1739, B:114:0x1750, B:115:0x1797, B:122:0x18b0, B:124:0x18bd, B:125:0x18f7, B:140:0x1a4d, B:142:0x1a5a, B:143:0x1a8d, B:145:0x1b75, B:147:0x1b82, B:148:0x1bc4, B:168:0x1dcb, B:170:0x1dd8, B:171:0x1e18, B:173:0x1ecf, B:175:0x1edc, B:176:0x1f1e, B:193:0x21e8, B:195:0x21f5, B:196:0x223d, B:228:0x2629, B:230:0x2636, B:231:0x266f, B:244:0x2a03, B:246:0x2a10, B:247:0x2a49, B:257:0x2ba4, B:259:0x2bc7, B:260:0x2c0e, B:292:0x2e0a, B:294:0x2e10, B:295:0x2e4b, B:305:0x35da, B:307:0x35eb, B:308:0x3623, B:314:0x3731, B:316:0x3737, B:317:0x3776, B:323:0x38c3, B:325:0x38e3, B:326:0x3934, B:332:0x3a8f, B:334:0x3a9c, B:335:0x3adb, B:341:0x3c4a, B:343:0x3c50, B:344:0x3c83, B:350:0x3dbb, B:352:0x3dc1, B:353:0x3dfa, B:359:0x3f20, B:361:0x3f48, B:362:0x3fa5, B:376:0x2fa5, B:378:0x2fab, B:379:0x2fe4, B:386:0x3129, B:388:0x312f, B:389:0x3162, B:394:0x32ab, B:396:0x32b1, B:397:0x32ea, B:403:0x3408, B:405:0x340e, B:406:0x3441, B:490:0x1628, B:492:0x1640, B:493:0x1684, B:499:0x156f, B:501:0x157c, B:502:0x15b6, B:504:0x15d7, B:506:0x15e4, B:507:0x161e, B:514:0x0dba, B:516:0x0dc7, B:517:0x0df8, B:523:0x0ba5, B:525:0x0bbc, B:526:0x0bfd, B:532:0x0aa0, B:534:0x0ab7, B:535:0x0af1, B:540:0x0811, B:543:0x082a, B:544:0x0868, B:553:0x0506, B:555:0x0513, B:556:0x054f, B:558:0x0570, B:560:0x057d, B:561:0x05b6, B:569:0x0127, B:571:0x012d, B:572:0x0160), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x2ee6  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x35d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x35d9  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x2fa1  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x4062  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x4063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] b$34ff007e(int i2, java.lang.Object obj) {
        java.lang.Throwable cause;
        java.lang.Integer num;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        int i3;
        int i4;
        long j9;
        java.lang.String str;
        java.lang.String str2;
        int i5;
        java.lang.String str3;
        java.lang.Throwable th;
        java.io.BufferedInputStream bufferedInputStream;
        int i6;
        java.io.BufferedInputStream bufferedInputStream2;
        java.lang.Object d2;
        long j10;
        int i7;
        int i8;
        int i9;
        java.lang.String str4;
        java.lang.Object[] objArr;
        int i10;
        char c2;
        java.lang.Object[] objArr2;
        int i11;
        java.lang.String str5;
        int i12;
        int i13 = i2;
        int i14 = j + 87;
        i = i14 % 128;
        java.lang.Integer num2 = 3;
        try {
            if (i14 % 2 == 0) {
                java.lang.Object d3 = com.facetec.sdk.al.d(60475645);
                if (d3 == null) {
                    char mode = (char) (41371 - android.view.View.MeasureSpec.getMode(0));
                    long elapsedCpuTime = android.os.Process.getElapsedCpuTime();
                    int threadPriority = android.os.Process.getThreadPriority(0);
                    byte b2 = (byte) 1;
                    byte b3 = (byte) (b2 - 1);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    f(b2, b3, b3, objArr3);
                    d3 = com.facetec.sdk.al.c(mode, 616 - (elapsedCpuTime > 0L ? 1 : (elapsedCpuTime == 0L ? 0 : -1)), 24 - ((threadPriority + 20) >> 6), -1535790587, false, (java.lang.String) objArr3[0], new java.lang.Class[0]);
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, null)).longValue();
                long j11 = 149972332;
                long j12 = 569;
                long j13 = -1;
                long j14 = j11 ^ j13;
                long j15 = longValue ^ j13;
                long j16 = j14 | j15;
                long j17 = i13;
                long j18 = j17 ^ j13;
                long j19 = j18 | j11;
                long j20 = (((((j11 * j12) + (j12 * longValue)) + ((-1136) * (((j16 ^ j13) | ((j14 | j18) ^ j13)) | ((j15 | j18) ^ j13)))) + ((-568) * ((((j14 | j17) ^ j13) | ((j15 | j17) ^ j13)) | ((j19 | longValue) ^ j13)))) + (com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION * ((((j18 | longValue) ^ j13) | (j19 ^ j13)) | ((j16 | j17) ^ j13)))) - 677163626;
                int elapsedCpuTime2 = (int) android.os.Process.getElapsedCpuTime();
                int i15 = ~elapsedCpuTime2;
                int i16 = ((int) (j20 >> 33)) & ((((~((-1760959141) | i15)) | (~(1096781744 | i15)) | (~(1760959140 | elapsedCpuTime2))) * 959) + 1782685812 + (((~(elapsedCpuTime2 | 1096781744)) | (~(i15 | 1760959140)) | (~((-1760959141) | elapsedCpuTime2))) * 959));
                int i17 = ((int) j20) & ((((~(1561257997 | i13)) | 4194880) * (-140)) + 1503352439 + ((~(1565452877 | i13)) * 70) + (((~(1296482888 | i13)) | 273164869) * 70));
            } else {
                java.lang.Object d4 = com.facetec.sdk.al.d(60475645);
                if (d4 == null) {
                    char c3 = (char) (41372 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int blue = android.graphics.Color.blue(0);
                    int defaultSize = android.view.View.getDefaultSize(0, 0);
                    byte b4 = (byte) 1;
                    byte b5 = (byte) (b4 - 1);
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    f(b4, b5, b5, objArr4);
                    d4 = com.facetec.sdk.al.c(c3, blue + 615, 24 - defaultSize, -1535790587, false, (java.lang.String) objArr4[0], new java.lang.Class[0]);
                }
                long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, null)).longValue();
                long j21 = 1521524181;
                long j22 = -112;
                long j23 = -1;
                long j24 = longValue2 ^ j23;
                long j25 = i13;
                long j26 = j24 | (j25 ^ j23);
                long j27 = j21 ^ j23;
                long j28 = (((((j22 * j21) + (j22 * longValue2)) + (226 * (j21 | (j26 ^ j23)))) + ((-113) * ((((j27 | longValue2) ^ j23) | ((j27 | j25) ^ j23)) | ((j26 | j21) ^ j23)))) + (113 * ((j24 | j25) ^ j23))) - 2048715475;
                int i18 = ((int) (j28 >> 32)) & (((((~((-2064534534) | i13)) | (-1584249440)) * 398) - 198877084) + (((~((-2064534534) | (~i13))) | (-1584249440)) * 398));
                int maxMemory = (int) java.lang.Runtime.getRuntime().maxMemory();
                int i19 = ((int) j28) & ((((~((-136319057) | maxMemory)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) - 1887275652) + (((~((~maxMemory) | (-136319057))) | (-2122186751)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL));
            }
        } catch (java.lang.Throwable th2) {
            cause = th2.getCause();
            if (cause == null) {
            }
        }
        cause = th2.getCause();
        if (cause == null) {
            throw cause;
        }
        throw th2;
        if (i12 == 0) {
            j = (i + 107) % 128;
            int i20 = i4;
            java.lang.Object[] objArr5 = {null, new int[]{(r3 & (~r4)) | r5}, new int[]{(i3 & (-243)) | (i20 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE)}, new int[]{i3}};
            int i21 = (((-104972328) | i20) * 494) + 299374469 + (((~(967976896 | i20)) | (-527680488)) * 494);
            int i22 = -(-(((i21 | 16) << 1) - (i21 ^ 16)));
            int i23 = ((i22 | (-1763436071)) << 1) - (i22 ^ (-1763436071));
            int i24 = i23 << 13;
            int i25 = ((~i24) & i23) | ((~i23) & i24);
            int i26 = i25 ^ (i25 >>> 17);
            int i27 = i26 << 5;
            int i28 = (~i26) & i27;
            return objArr5;
        }
        i6 = i4;
        d2 = com.facetec.sdk.al.d(-1699488110);
        if (d2 == null) {
            char c4 = (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22874);
            int indexOf = android.text.TextUtils.indexOf(str3, str3);
            int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
            byte b6 = (byte) 1;
            byte b7 = (byte) (b6 - 1);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            f(b6, b7, b7, objArr6);
            d2 = com.facetec.sdk.al.c(c4, 2031 - indexOf, 23 - deadChar, 1029481578, false, (java.lang.String) objArr6[0], new java.lang.Class[0]);
        }
        long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, null)).longValue();
        long j29 = -90430630;
        long j30 = 623;
        long j31 = longValue3 ^ j2;
        long j32 = j31 | j29;
        j10 = (((((624 * j29) + ((-622) * longValue3)) + (((j32 | j4) ^ j2) * j30)) + ((-623) * (j3 | (((j29 ^ j2) | longValue3) ^ j2)))) + ((((j32 ^ j2) | ((j31 | j4) ^ j2)) | ((j29 | j4) ^ j2)) * j30)) - 1097333953;
        i7 = (int) (j10 >> 32);
        i8 = ~((-905390975) | i3);
        if (((i7 & ((((~(1707054904 | i6)) | (-1150685981)) * (-90)) + 1687905420 + (((~(1707054904 | i3)) | 1150685976) * (-45)) + (((~(1150685980 | i3)) | 1707054904 | (~((-1150685981) | i6))) * 45))) | (((int) j10) & (((((~((-905390975) | i6)) | 27328808) * (-245)) - 244128216) + (i8 * (-245)) + ((i8 | 1952349911) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE)))) != 0) {
            objArr2 = new java.lang.Object[]{null, new int[1], new int[]{(i3 & (-265)) | (i6 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE)}, new int[]{i3}};
            int i29 = ~android.os.Process.myUid();
            int i30 = ((((~(r1 | 759615237)) | ((~((-553913345) | i29)) | (-1064304616))) * (-68)) - 240567653) + ((~((-304689379) | i29)) * (-68)) + (((~(i29 | (-759615238))) | (-858602723)) * 68) + 16;
            int i31 = (i30 * 483) - 1549766878;
            int i32 = ~i30;
            int i33 = ~((1763436070 & i32) | (1763436070 ^ i32));
            int i34 = (i32 & i6) | (i32 ^ i6);
            int i35 = ~i34;
            int i36 = ((i33 ^ i35) | (i33 & i35)) * (-241);
            int i37 = (i31 & i36) + (i31 | i36);
            int i38 = -(-((i30 | (-1763436071)) * (-482)));
            int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
            int i40 = ((~((i30 ^ 1763436070) | (1763436070 & i30))) | (~((i34 & (-1763436071)) | (i34 ^ (-1763436071))))) * 241;
            int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
            int i42 = i41 << 13;
            int i43 = ((~i42) & i41) | ((~i41) & i42);
            int i44 = i43 >>> 17;
            int i45 = (i43 & (~i44)) | ((~i43) & i44);
            int i46 = i45 << 5;
            int[] iArr = (int[]) objArr2[1];
            int i47 = (~(i45 & i46)) & (i45 | i46);
            i11 = 0;
            iArr[0] = i47;
        } else {
            java.lang.Object d5 = com.facetec.sdk.al.d(33831608);
            if (d5 == null) {
                char argb = (char) (44824 - android.graphics.Color.argb(0, 0, 0, 0));
                long packedPositionForGroup = android.widget.ExpandableListView.getPackedPositionForGroup(0);
                int red = android.graphics.Color.red(0);
                byte b8 = (byte) 0;
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                f(b8, b8, b8, objArr7);
                d5 = com.facetec.sdk.al.c(argb, 685 - (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)), 23 - red, -1511309248, false, (java.lang.String) objArr7[0], new java.lang.Class[0]);
            }
            long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, null)).longValue();
            long j33 = 374859456;
            long j34 = j33 ^ j2;
            long j35 = (((((j9 * j33) + (j5 * longValue4)) + ((((j34 | j3) ^ j2) | longValue4) * j6)) + ((((j34 | j4) ^ j2) | longValue4) * j7)) + (((((longValue4 ^ j2) | j33) ^ j2) | (((j34 | longValue4) | j4) ^ j2)) * j8)) - 606644310;
            if (((((int) (j35 >> 32)) & (((((~(1505057331 | i6)) | (~((-1352683554) | i3))) * (-272)) - 781916470) + (((~(1504006193 | i3)) | 1051138) * (-272)) + (((~((-1504006194) | i3)) | (-1353734692)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))) | (((int) j35) & ((((~(1958039067 | i6)) | (~((-520812658) | i3)) | (~(520812657 | i6))) * 959) + 1296758388 + (((~(1958039067 | i3)) | (~((-520812658) | i6)) | (~(520812657 | i3))) * 959)))) != 0) {
                j = (i + 67) % 128;
                i9 = (~(i3 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE)) & (i3 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE);
            } else {
                i9 = i3;
            }
            if (i9 != i3) {
                objArr2 = new java.lang.Object[]{null, new int[1], new int[]{i9}, new int[]{i3}};
                int i48 = ~((~((int) android.os.Process.getElapsedCpuTime())) | 927812336);
                int i49 = (((373885440 | i48) * (-374)) - 1292777145) + ((i48 | 553926896) * 374);
                int d6 = com.facetec.sdk.fl.d();
                int i50 = i49 * 319;
                int i51 = ~i49;
                int i52 = ~d6;
                int i53 = ~(i51 | 16);
                int i54 = ~((d6 ^ 16) | (d6 & 16));
                int i55 = ((((i50 ^ (-5072)) + ((i50 & (-5072)) << 1)) + (((~(i49 | ((i52 ^ 16) | (i52 & 16)))) | (~(((i51 & (-17)) | (i51 ^ (-17))) | d6))) * (-318))) - (~(((i53 & i54) | (i53 ^ i54)) * (-318)))) - 1;
                int i56 = ~(d6 | (-17));
                int i57 = ((i56 ^ i51) | (i56 & i51)) * 318;
                int i58 = -(-(((i55 | i57) << 1) - (i57 ^ i55)));
                int i59 = (i58 & (-1763436071)) + (i58 | (-1763436071));
                int i60 = (i59 << 13) ^ i59;
                int i61 = i60 >>> 17;
                int i62 = (~(i60 & i61)) & (i60 | i61);
                int i63 = i62 << 5;
                int[] iArr2 = (int[]) objArr2[1];
                int i64 = (~(i62 & i63)) & (i62 | i63);
                i11 = 0;
                iArr2[0] = i64;
            } else {
                java.lang.Object d7 = com.facetec.sdk.al.d(39533378);
                if (d7 == null) {
                    char resolveSize = (char) android.view.View.resolveSize(0, 0);
                    int maximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity();
                    int resolveSize2 = android.view.View.resolveSize(0, 0);
                    byte b9 = (byte) 0;
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    f(b9, b9, b9, objArr8);
                    d7 = com.facetec.sdk.al.c(resolveSize, (maximumFlingVelocity >> 16) + 2222, resolveSize2 + 24, -1514913350, false, (java.lang.String) objArr8[0], new java.lang.Class[0]);
                }
                long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) d7).invoke(null, null)).longValue();
                long j36 = 1725861720;
                long j37 = 764;
                long j38 = ((int) java.lang.Runtime.getRuntime().totalMemory()) ^ j2;
                long j39 = (j38 | j36) ^ j2;
                int i65 = i6;
                long j40 = ((j36 ^ j2) | longValue5) ^ j2;
                long j41 = (((((765 * j36) + ((-1527) * longValue5)) + ((longValue5 | j39) * j37)) + ((-1528) * (j40 | ((j38 | longValue5) ^ j2)))) + (j37 * ((j40 | (((longValue5 ^ j2) | j36) ^ j2)) | j39))) - 1965466143;
                int nextInt = new java.util.Random().nextInt(639665786);
                int i66 = ~((~android.os.Process.myTid()) | (-1747056663));
                if (((((int) (j41 >> 32)) & (((((~(200690318 | nextInt)) | (-1784081080)) * 398) - 1158472292) + (((~((~nextInt) | 200690318)) | (-1784081080)) * 398))) | ((((((-2054683263) | i66) * (-374)) - 177852197) + ((i66 | 307626600) * 374)) & ((int) j41))) != 0) {
                    i3 = i2;
                    objArr2 = new java.lang.Object[]{null, new int[1], new int[]{i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, new int[]{i3}};
                    int i67 = (((~((-329823667) | i3)) | 8918064) * 1504) + 194057559 + ((~((-320905603) | i3)) * (-1504)) + 896294032;
                    int i68 = (i67 & 16) + (i67 | 16);
                    int d8 = com.facetec.sdk.fl.d();
                    int i69 = i68 * (-1965);
                    int i70 = ((-54306280) ^ i69) + ((i69 & (-54306280)) << 1);
                    int i71 = -(-(((1763436070 ^ i68) | (1763436070 & i68)) * 983));
                    int i72 = ((i70 | i71) << 1) - (i71 ^ i70);
                    int i73 = ~i68;
                    int i74 = ~d8;
                    int i75 = ~(1763436070 | i74);
                    int i76 = -(-(((i75 ^ i73) | (i75 & i73)) * (-983)));
                    int i77 = ~(i74 | i73);
                    int i78 = ~((i73 & (-1763436071)) | (i73 ^ (-1763436071)));
                    int i79 = (((i72 | i76) << 1) - (i76 ^ i72)) + (((i77 ^ i78) | (i77 & i78)) * 983);
                    int i80 = (i79 << 13) ^ i79;
                    int i81 = i80 >>> 17;
                    int i82 = (i80 & (~i81)) | ((~i80) & i81);
                    int i83 = i82 << 5;
                    ((int[]) objArr2[1])[0] = (i82 & (~i83)) | ((~i82) & i83);
                    i10 = 0;
                    i6 = i65;
                    c2 = 3;
                    objArr = objArr2;
                    str4 = str3;
                    if (((int[]) objArr[c2])[i10] != ((int[]) objArr[2])[i10]) {
                        return objArr;
                    }
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    objArr9[i10] = 2;
                    java.lang.Object d9 = com.facetec.sdk.al.d(-1836228463);
                    if (d9 == null) {
                        char size = (char) android.view.View.MeasureSpec.getSize(i10);
                        int red2 = android.graphics.Color.red(i10);
                        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i10, i10);
                        byte b10 = (byte) 1;
                        byte b11 = (byte) (b10 - 1);
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        f(b10, b11, b11, objArr10);
                        d9 = com.facetec.sdk.al.c(size, red2 + 455, 24 - absoluteGravity, 895621737, false, (java.lang.String) objArr10[0], new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) d9).invoke(null, objArr9)).longValue();
                    long j42 = -1223893279;
                    java.lang.String str6 = str4;
                    int i84 = i6;
                    long j43 = 859;
                    long j44 = longValue6 ^ j2;
                    long j45 = (((((860 * j42) + ((-858) * longValue6)) + ((-859) * (j42 | j4))) + ((((j3 | j42) ^ j2) | ((((j42 ^ j2) | j44) | j4) ^ j2)) * j43)) + (j43 * (((j44 | j3) ^ j2) | ((j44 | j42) ^ j2)))) - 146634326;
                    int i85 = ~android.os.Process.myTid();
                    int i86 = ((int) (j45 >> 32)) & ((((-69763073) | i85) * 494) + 1274880318 + (((~(i85 | (-1455326505))) | (-86614021)) * 494));
                    int maxMemory2 = (int) java.lang.Runtime.getRuntime().maxMemory();
                    int i87 = ~maxMemory2;
                    int i88 = ~((-1476731001) | maxMemory2);
                    int i89 = ((int) j45) & ((((~((-1381009886) | i87)) | i88) * 1150) + 334239082 + ((i88 | (~(1476731000 | i87))) * (-575)) + (((~(maxMemory2 | (-1381009886))) | (~(i87 | 1381009885))) * 575));
                    if (((i86 ^ i89) | (i86 & i89)) == 2) {
                        java.lang.Object[] objArr11 = {null, new int[]{(r3 & (~r4)) | r5}, new int[]{(i3 & (-271)) | (i84 & 270)}, new int[]{i3}};
                        int i90 = ~((-671620696) | i3);
                        int i91 = -(-(((i90 | 4679) * (-280)) + 1776203963 + ((i90 | (~((-946597265) | i3))) * 140) + (((~((-671616017) | i3)) | (~(i84 | (-4680))) | (~((-274981249) | i84))) * 140) + 16));
                        int i92 = (i91 & (-1763436071)) + (i91 | (-1763436071));
                        int i93 = (i92 << 13) ^ i92;
                        int i94 = i93 >>> 17;
                        int i95 = (~(i93 & i94)) & (i93 | i94);
                        int i96 = i95 << 5;
                        int i97 = (~i95) & i96;
                        return objArr11;
                    }
                    java.lang.Object d10 = com.facetec.sdk.al.d(-1753496434);
                    if (d10 == null) {
                        char c5 = (char) (410 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        str5 = str6;
                        int indexOf2 = android.text.TextUtils.indexOf(str5, str5);
                        int lastIndexOf = android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                        byte b12 = (byte) 0;
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        f(b12, b12, b12, objArr12);
                        d10 = com.facetec.sdk.al.c(c5, indexOf2 + 2198, 23 - lastIndexOf, 815054454, false, (java.lang.String) objArr12[0], new java.lang.Class[0]);
                    } else {
                        str5 = str6;
                    }
                    long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) d10).invoke(null, null)).longValue();
                    long j46 = -133516821;
                    long j47 = 503;
                    long j48 = -502;
                    long j49 = j46 | longValue7;
                    long j50 = j46 ^ j2;
                    java.lang.String str7 = str5;
                    long nextInt2 = new java.util.Random().nextInt(1998223913);
                    long j51 = j50 | (nextInt2 ^ j2);
                    long j52 = (j49 | nextInt2) ^ j2;
                    long j53 = (j46 * j47) + (j47 * longValue7) + (j49 * j48) + (j48 * (((j50 | (longValue7 ^ j2)) ^ j2) | (j51 ^ j2) | j52)) + (502 * (j52 | ((longValue7 | j51) ^ j2))) + 858754359;
                    int nextInt3 = new java.util.Random().nextInt();
                    int i98 = ((int) (j53 >> 32)) & ((((~(1610328564 | nextInt3)) | (~((~nextInt3) | (-1247412321)))) * (-318)) + 1966936018 + (((~((-1524246625) | nextInt3)) | 276834304) * (-318)) + (((~(nextInt3 | 1524246624)) | 1333494260) * 318));
                    int i99 = ~(1509942607 | i3);
                    int i100 = ((int) j53) & ((((((~((-1507845447) | i84)) | 1347798278) | i99) * (-252)) - 1094476739) + ((i99 | (~((-160047169) | i84))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE));
                    if (((i98 ^ i100) | (i98 & i100)) != 0) {
                        int i101 = j;
                        i = ((i101 & 93) + (i101 | 93)) % 128;
                        java.lang.Object[] objArr13 = {null, new int[1], new int[]{i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, new int[]{i3}};
                        int elapsedRealtime = (int) android.os.SystemClock.elapsedRealtime();
                        int i102 = ~elapsedRealtime;
                        int i103 = (((~((-802997691) | elapsedRealtime)) | (~(1071630271 | i102))) * (-406)) + 950818181 + ((~((-256410003) | i102)) * (-406)) + (((~(elapsedRealtime | (-815220270))) | (~(i102 | 802997690))) * 406);
                        int i104 = ((i103 ^ 16) + ((i103 & 16) << 1)) - 1763436071;
                        int i105 = i104 << 13;
                        int i106 = (i104 & (~i105)) | ((~i104) & i105);
                        int i107 = i106 >>> 17;
                        int i108 = (i106 & (~i107)) | ((~i106) & i107);
                        int i109 = i108 << 5;
                        ((int[]) objArr13[1])[0] = (~(i108 & i109)) & (i108 | i109);
                        return objArr13;
                    }
                    long[] jArr = {624887784092251L};
                    int i110 = -android.view.View.MeasureSpec.getSize(0);
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    g("纯\ued7eꀌക鱹铘\uaaff舟堉㞫扄ᣍ࣋ꢦ샼矡몼冫", (i110 ^ 17) + ((i110 & 17) << 1), objArr14);
                    java.lang.Object[] objArr15 = {(java.lang.String) objArr14[0], num, 2251799813685247L, jArr};
                    java.lang.Object d11 = com.facetec.sdk.al.d(2143203995);
                    if (d11 == null) {
                        char indexOf3 = (char) (18697 - android.text.TextUtils.indexOf(str7, str7, 0, 0));
                        int lastIndexOf2 = android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                        int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                        byte b13 = (byte) 3;
                        byte b14 = (byte) (b13 - 3);
                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                        f(b13, b14, b14, objArr16);
                        d11 = com.facetec.sdk.al.c(indexOf3, 1786 - lastIndexOf2, packedPositionGroup + 24, -665728925, false, (java.lang.String) objArr16[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class});
                    }
                    long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) d11).invoke(null, objArr15)).longValue();
                    long j54 = -361468312;
                    long j55 = 371;
                    long j56 = -370;
                    long j57 = longValue8 ^ j2;
                    long nextInt4 = new java.util.Random().nextInt();
                    long j58 = nextInt4 ^ j2;
                    long j59 = j54 ^ j2;
                    long j60 = (longValue8 | j54) ^ j2;
                    long j61 = (((((j54 * j55) + (j55 * longValue8)) + ((((j57 | j58) ^ j2) | ((j59 | nextInt4) ^ j2)) * j56)) + (j56 * ((((j59 | j58) ^ j2) | ((nextInt4 | j57) ^ j2)) | j60))) + (com.knotapi.knot.utilities.Constants.ID_KROGER * j60)) - 139146322;
                    int i111 = ((int) (j61 >> 32)) & (((((~(1531258413 | i84)) | (-1326482472)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) - 1453938172) + (((~((-68190211) | i84)) | (~((-1258292262) | i3))) * (-519)) + (((~((-1326482472) | i3)) | (-1531258414)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE));
                    int i112 = (int) j61;
                    int nextInt5 = new java.util.Random().nextInt(414775472);
                    int i113 = i112 & (((r4 * 992) - 1537497691) + (((~(1131369359 | nextInt5)) | (-1400853408) | (~((~nextInt5) | (-36373003)))) * (-496)) + ((nextInt5 | (-305857051)) * 496));
                    if (((i111 ^ i113) | (i111 & i113)) != 0) {
                        int i114 = (j + 3) % 128;
                        i = i114;
                        j = ((i114 ^ 89) + ((i114 & 89) << 1)) % 128;
                        java.lang.Object[] objArr17 = {null, new int[]{r3 ^ (r3 << 5)}, new int[]{i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, new int[]{i3}};
                        int i115 = ((((~(1153517117 | i84)) | 464700842) * (-1042)) - 772775748) + ((1153517117 | i3) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~((-464700843) | i3)) | 8406056 | (~(1609811903 | i84))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL);
                        int i116 = (-1763436072) - (~((i115 & 16) + (i115 | 16)));
                        int i117 = i116 << 13;
                        int i118 = (~(i117 & i116)) & (i117 | i116);
                        int i119 = i118 ^ (i118 >>> 17);
                        return objArr17;
                    }
                    int i120 = -(android.view.ViewConfiguration.getScrollBarSize() >> 8);
                    int i121 = -(-(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                    int i122 = -(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                    h(true, (i120 ^ 11) + ((i120 & 11) << 1), "\u0017\u0018ￍ\u0014\u0003\u0002ￍ\t\u0011\u0007\u0005", 116 - (~i121), (i122 ^ 7) + ((7 & i122) << 1), objArr18);
                    java.lang.Object[] objArr19 = {(java.lang.String) objArr18[0]};
                    java.lang.Object d12 = com.facetec.sdk.al.d(1450487247);
                    if (d12 == null) {
                        char argb2 = (char) (6935 - android.graphics.Color.argb(0, 0, 0, 0));
                        int mode2 = android.view.View.MeasureSpec.getMode(0);
                        long zoomControlsTimeout = android.view.ViewConfiguration.getZoomControlsTimeout();
                        byte b15 = (byte) 3;
                        byte b16 = (byte) (b15 - 3);
                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                        f(b15, b16, b16, objArr20);
                        d12 = com.facetec.sdk.al.c(argb2, mode2 + 2389, (zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)) + 22, -241445065, false, (java.lang.String) objArr20[0], new java.lang.Class[]{java.lang.String.class});
                    }
                    long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) d12).invoke(null, objArr19)).longValue();
                    long j62 = 848377945;
                    long j63 = longValue9 ^ j2;
                    long myPid = android.os.Process.myPid() ^ j2;
                    long j64 = 933;
                    long j65 = (934 * j62) + ((-932) * longValue9) + ((j63 | (((j62 ^ j2) | myPid) ^ j2)) * (-933)) + ((((myPid | j63) ^ j2) | ((j63 | j62) ^ j2)) * j64) + (j64 * ((longValue9 | j62) ^ j2)) + 1002798696;
                    int myPid2 = android.os.Process.myPid();
                    int i123 = ((int) (j65 >> 32)) & ((((((~((-95447060) | myPid2)) | (~(1341779351 | myPid2))) * 69) - 735293418) + ((((~(myPid2 | (-1169714580))) | 1074267520) | (~(267511831 | myPid2))) * (-69))) - 1012432620);
                    int i124 = ~((int) android.os.SystemClock.elapsedRealtime());
                    int i125 = ((int) j65) & ((((((~(r3 | 612370323)) | (-900353944)) | (~((-536872467) | i124))) * 886) - 1399104167) + (((~((-612370324) | i124)) | (-824856087)) * (-1772)) + ((~(i124 | (-824856087))) * 886));
                    if (((i123 ^ i125) | (i123 & i125)) != 0) {
                        java.lang.Object[] objArr21 = {null, new int[1], new int[]{(i2 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE) & (~(i2 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE))}, new int[]{i2}};
                        int freeMemory = (int) java.lang.Runtime.getRuntime().freeMemory();
                        int i126 = ((((~((-1016758297) | r3)) | 601459663) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) - 718280042) + (((~((~freeMemory) | (-469893137))) | (~(1071352799 | freeMemory))) * (-519)) + (((~(freeMemory | 601459663)) | 1016758296) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE);
                        int i127 = (i126 & 16) + (i126 | 16);
                        int d13 = com.facetec.sdk.fl.d();
                        int i128 = (i127 * 55) - 290901427;
                        int i129 = ~i127;
                        int i130 = ~((i129 ^ (-1763436071)) | (i129 & (-1763436071)));
                        int i131 = ~d13;
                        int i132 = ~(((-1763436071) & i131) | (i131 ^ (-1763436071)));
                        int i133 = -(-(((i132 ^ i130) | (i130 & i132)) * (-108)));
                        int i134 = ~(i129 | d13);
                        int i135 = ~((1763436070 & i127) | (1763436070 ^ i127));
                        int i136 = (i134 ^ i135) | (i134 & i135);
                        int i137 = ~(i127 | i131);
                        int i138 = (((i128 & i133) + (i128 | i133)) - (~(((i137 ^ i136) | (i137 & i136)) * 54))) - 1;
                        int i139 = ((d13 & i135) | (d13 ^ i135)) * 54;
                        int i140 = (i138 ^ i139) + ((i139 & i138) << 1);
                        int i141 = (i140 << 13) ^ i140;
                        int i142 = i141 ^ (i141 >>> 17);
                        int i143 = i142 << 5;
                        ((int[]) objArr21[1])[0] = (~(i142 & i143)) & (i142 | i143);
                        return objArr21;
                    }
                    java.lang.Object d14 = com.facetec.sdk.al.d(-2029373905);
                    if (d14 == null) {
                        char bitsPerPixel = (char) (19037 - android.graphics.ImageFormat.getBitsPerPixel(0));
                        char mirror = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                        int maximumFlingVelocity2 = android.view.ViewConfiguration.getMaximumFlingVelocity();
                        byte b17 = (byte) 1;
                        byte b18 = (byte) (b17 - 1);
                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                        f(b17, b18, b18, objArr22);
                        d14 = com.facetec.sdk.al.c(bitsPerPixel, 988 - mirror, 24 - (maximumFlingVelocity2 >> 16), 551898327, false, (java.lang.String) objArr22[0], new java.lang.Class[0]);
                    }
                    long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) d14).invoke(null, null)).longValue();
                    long j66 = -277137642;
                    long j67 = -272;
                    long j68 = j66 ^ j2;
                    long myPid3 = android.os.Process.myPid();
                    long j69 = (com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE * j66) + ((-271) * longValue10) + (((((j68 | (longValue10 ^ j2)) | (myPid3 ^ j2)) ^ j2) | (((j66 | longValue10) | myPid3) ^ j2)) * j67) + (j67 * (((j68 | longValue10) ^ j2) | ((j68 | myPid3) ^ j2))) + (com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE * (longValue10 | ((j66 | myPid3) ^ j2))) + 824055378;
                    int myUid = android.os.Process.myUid();
                    int i144 = ~myUid;
                    int i145 = ~((-857611735) | i144);
                    int i146 = ((int) (j69 >> 32)) & ((((~(i144 | 857611734)) | (~(2000129150 | i144)) | (-2000657919) | (~((-857082967) | myUid))) * (-84)) + 1905160562 + (((~(myUid | 857611734)) | (-2000129151) | i145) * (-84)) + ((857082966 | i145) * 84));
                    int i147 = ~((int) android.os.Process.getElapsedCpuTime());
                    int i148 = ((int) j69) & ((((~(r3 | 318470705)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) - 93575859) + ((2063597563 | i147) * (-216)) + (((~(i147 | 318470705)) | (-1755697116)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE));
                    if (((i146 ^ i148) | (i146 & i148)) != 0) {
                        java.lang.Object[] objArr23 = {null, new int[1], new int[]{i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, new int[]{i2}};
                        int i149 = ~((int) android.os.SystemClock.elapsedRealtime());
                        int i150 = ((((~(r2 | 1461335529)) | ((~((-18355689) | i149)) | (-1599862272))) * (-68)) - 1185246853) + ((~((-138526743) | i149)) * (-68)) + (((~(i149 | (-1461335530))) | (-156882431)) * 68);
                        int i151 = -(-(((i150 | 16) << 1) - (i150 ^ 16)));
                        int i152 = (i151 ^ (-1763436071)) + ((i151 & (-1763436071)) << 1);
                        int i153 = i152 << 13;
                        int i154 = (~(i153 & i152)) & (i153 | i152);
                        int i155 = i154 >>> 17;
                        int i156 = (~(i154 & i155)) & (i154 | i155);
                        int i157 = i156 << 5;
                        ((int[]) objArr23[1])[0] = (~(i156 & i157)) & (i156 | i157);
                        return objArr23;
                    }
                    java.lang.Object d15 = com.facetec.sdk.al.d(1671466082);
                    if (d15 == null) {
                        char tapTimeout = (char) (58898 - (android.view.ViewConfiguration.getTapTimeout() >> 16));
                        int size2 = android.view.View.MeasureSpec.getSize(0);
                        long globalActionKeyTimeout = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
                        byte b19 = (byte) 3;
                        byte b20 = (byte) (b19 - 3);
                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                        f(b19, b20, b20, objArr24);
                        d15 = com.facetec.sdk.al.c(tapTimeout, 1529 - size2, (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)) + 22, -1001392486, false, (java.lang.String) objArr24[0], new java.lang.Class[0]);
                    }
                    long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) d15).invoke(null, null)).longValue();
                    long j70 = -1538376903;
                    long j71 = 85;
                    long j72 = -84;
                    long j73 = j70 ^ j2;
                    long j74 = longValue11 ^ j2;
                    long freeMemory2 = (int) java.lang.Runtime.getRuntime().freeMemory();
                    long j75 = freeMemory2 ^ j2;
                    long j76 = j70 | longValue11;
                    long j77 = (j75 | longValue11) ^ j2;
                    long j78 = (((((j71 * j70) + (j71 * longValue11)) + ((((((j73 | j74) ^ j2) | ((j73 | j75) ^ j2)) | ((j74 | j75) ^ j2)) | ((j76 | freeMemory2) ^ j2)) * j72)) + (j72 * ((((j74 | freeMemory2) ^ j2) | j70) | j77))) + (84 * (j77 | (j76 ^ j2)))) - 60134976;
                    int myPid4 = android.os.Process.myPid();
                    if (((((int) j78) & (((i84 | (-1250536193)) * (-490)) + 308301555 + (((~((-1519124306) | i2)) | 268588113) * 490) + 1207871598)) | (((int) (j78 >> 32)) & ((((~((~myPid4) | (-268566537))) | (~(886452138 | myPid4))) * (-302)) + 2147156478 + ((~((-268566537) | myPid4)) * (-604)) + (((~(myPid4 | 617885602)) | 67111330) * 302)))) != 0) {
                        java.lang.Object[] objArr25 = {null, new int[1], new int[]{(i2 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE) & (~(i2 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE))}, new int[]{i2}};
                        int elapsedRealtime2 = (int) android.os.SystemClock.elapsedRealtime();
                        int i158 = (((((~((-988956109) | r3)) | (-629261852)) | (~(988956108 | elapsedRealtime2))) * (-564)) - 1672651301) + ((~(elapsedRealtime2 | (-83984916))) * 1128) + (((~((-629261852) | (~elapsedRealtime2))) | (-1072941024)) * 564);
                        int i159 = -(-((i158 & 16) + (i158 | 16)));
                        int i160 = ((i159 | (-1763436071)) << 1) - (i159 ^ (-1763436071));
                        int i161 = i160 << 13;
                        int i162 = (~(i161 & i160)) & (i161 | i160);
                        int i163 = i162 ^ (i162 >>> 17);
                        int i164 = i163 << 5;
                        ((int[]) objArr25[1])[0] = (~(i163 & i164)) & (i163 | i164);
                        return objArr25;
                    }
                    java.lang.Object[] objArr26 = {java.lang.Integer.valueOf(i2), obj, -1763436071, 16777216};
                    java.lang.Object d16 = com.facetec.sdk.al.d(-1695430476);
                    if (d16 == null) {
                        d16 = com.facetec.sdk.al.c((char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (android.os.Process.myTid() >> 22) + 2270, 24 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 1025421900, false, null, new java.lang.Class[]{java.lang.Integer.TYPE, (java.lang.Class) com.facetec.sdk.al.b((char) android.graphics.Color.red(0), 2246 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 24), java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    java.lang.Object newInstance = ((java.lang.reflect.Constructor) d16).newInstance(objArr26);
                    try {
                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                        h(true, 15 - (~(-(android.view.ViewConfiguration.getTapTimeout() >> 16))), "ￏ\u0002\u0017\u0002\u000b\u0005\u0002\u0006\u0013\t\ufff5ￏ\b\u000f\u0002\r", 115 - android.view.View.MeasureSpec.getSize(0), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 5, objArr27);
                        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr27[0]);
                        int i165 = -android.view.View.combineMeasuredStates(0, 0);
                        java.lang.Object[] objArr28 = new java.lang.Object[1];
                        g("\ue186㎤庆\ufde1\uda25⯧", (i165 ^ 5) + ((i165 & 5) << 1), objArr28);
                        cls.getMethod((java.lang.String) objArr28[0], null).invoke(newInstance, null);
                        java.lang.Object[] objArr29 = {null, new int[1], new int[]{i2}, new int[]{i2}};
                        int freeMemory3 = (int) java.lang.Runtime.getRuntime().freeMemory();
                        int i166 = (((~(407202841 | freeMemory3)) | (-1483735008)) * 305) + 1253457024 + (((~((~freeMemory3) | 407202841)) | (-1211015119)) * 305);
                        int i167 = (i166 & (-1763436071)) + ((-1763436071) | i166);
                        int i168 = (i167 << 13) ^ i167;
                        int i169 = i168 >>> 17;
                        int i170 = (~(i168 & i169)) & (i168 | i169);
                        ((int[]) objArr29[1])[0] = i170 ^ (i170 << 5);
                        return objArr29;
                    } catch (java.lang.Throwable th3) {
                        java.lang.Throwable cause2 = th3.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th3;
                    }
                }
                i3 = i2;
                java.lang.Object d17 = com.facetec.sdk.al.d(39530495);
                if (d17 == null) {
                    str4 = str3;
                    char lastIndexOf3 = (char) (android.text.TextUtils.lastIndexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1);
                    int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
                    int green = android.graphics.Color.green(0);
                    byte b21 = (byte) 3;
                    byte b22 = (byte) (b21 - 3);
                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                    f(b21, b22, b22, objArr30);
                    d17 = com.facetec.sdk.al.c(lastIndexOf3, packedPositionType + 2222, green + 24, -1514908409, false, (java.lang.String) objArr30[0], new java.lang.Class[0]);
                } else {
                    str4 = str3;
                }
                long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) d17).invoke(null, null)).longValue();
                long j79 = 150298356;
                long j80 = -301;
                long j81 = longValue12 ^ j2;
                long j82 = ((((((-300) * j79) + (302 * longValue12)) + ((((longValue12 | j79) | j4) ^ j2) * j80)) + (j80 * (((j81 | j4) ^ j2) | ((j3 | j79) ^ j2)))) + (301 * (j81 | (((j79 ^ j2) | j4) ^ j2)))) - 2093705818;
                int i171 = ((int) (j82 >> 32)) & (((((~(i65 | 1714749380)) | (~((-1142991489) | i3))) * (-831)) - 1247165986) + ((~(i3 | (-17))) * (-1662)) + (((~(i65 | 1142991504)) | (~((-1142991505) | i3)) | (~((-1714749381) | i3))) * 831));
                int myTid = android.os.Process.myTid();
                int i172 = ((int) j82) & ((((((~(953742269 | myTid)) | (-1020916734)) | r6) * (-470)) - 231754239) + (((~(myTid | (-67174465))) | (~((~myTid) | (-416309677)))) * 470));
                if (((i171 ^ i172) | (i171 & i172)) != 0) {
                    i = (j + 27) % 128;
                    i6 = i65;
                    objArr = new java.lang.Object[]{null, new int[1], new int[]{(i3 & (-267)) | (i6 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE)}, new int[]{i3}};
                    int elapsedCpuTime3 = (int) android.os.Process.getElapsedCpuTime();
                    int i173 = ((((~(1572847720 | elapsedCpuTime3)) | (-45370240)) * (-465)) - 463605656) + (((~((-45370240) | elapsedCpuTime3)) | 1572847720) * 930) + ((elapsedCpuTime3 | (-33557272)) * 465);
                    int i174 = (i173 ^ 16) + ((i173 & 16) << 1);
                    int i175 = ((i174 | (-1763436071)) << 1) - (i174 ^ (-1763436071));
                    int i176 = i175 << 13;
                    int i177 = ((~i176) & i175) | ((~i175) & i176);
                    int i178 = i177 >>> 17;
                    int i179 = (i177 & (~i178)) | ((~i177) & i178);
                    int i180 = i179 << 5;
                    int[] iArr3 = (int[]) objArr[1];
                    int i181 = (i179 & (~i180)) | ((~i179) & i180);
                    i10 = 0;
                    iArr3[0] = i181;
                } else {
                    i6 = i65;
                    java.lang.Object d18 = com.facetec.sdk.al.d(589612749);
                    if (d18 == null) {
                        char combineMeasuredStates = (char) android.view.View.combineMeasuredStates(0, 0);
                        int maximumDrawingCacheSize = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
                        int alpha = android.graphics.Color.alpha(0);
                        byte b23 = (byte) 0;
                        java.lang.Object[] objArr31 = new java.lang.Object[1];
                        f(b23, b23, b23, objArr31);
                        d18 = com.facetec.sdk.al.c(combineMeasuredStates, (maximumDrawingCacheSize >> 24) + 2174, 24 - alpha, -2067022795, false, (java.lang.String) objArr31[0], new java.lang.Class[0]);
                    }
                    long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) d18).invoke(null, null)).longValue();
                    long j83 = -307306515;
                    long j84 = 881;
                    long j85 = -880;
                    long j86 = j83 ^ j2;
                    long j87 = longValue13 ^ j2;
                    long j88 = (j83 | j4) ^ j2;
                    long j89 = (j83 * j84) + (j84 * longValue13) + ((((j86 | j87) ^ j2) | ((j86 | j4) ^ j2) | ((j87 | j4) ^ j2)) * j85) + (j85 * (longValue13 | ((j86 | j3) ^ j2) | j88)) + (880 * j88) + 1290475544;
                    int i182 = ~((int) java.lang.Runtime.getRuntime().maxMemory());
                    int i183 = ((int) (j89 >> 32)) & (((((~((-571718619) | i182)) | 571644368) * (-241)) - 337042822) + (((~(i182 | (-74251))) | 293863424) * 241));
                    int i184 = (int) j89;
                    int elapsedCpuTime4 = (int) android.os.Process.getElapsedCpuTime();
                    int i185 = ~elapsedCpuTime4;
                    int i186 = i184 & ((((~((-1550035082) | i185)) | 112808671) * (-1042)) + 1615942406 + (((-1550035082) | elapsedCpuTime4) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~(elapsedCpuTime4 | (-112808672))) | 43536982 | (~(i185 | (-1480763393)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL));
                    if (((i183 ^ i186) | (i183 & i186)) != 0) {
                        int i187 = j;
                        i = ((i187 & 35) + (i187 | 35)) % 128;
                        java.lang.Object[] objArr32 = {null, new int[]{r1 ^ (r1 << 5)}, new int[]{(i3 & (-281)) | (i6 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE)}, new int[]{i3}};
                        int i188 = ((~((-1214826483) | i6)) * 979) + 1792297824 + ((403391477 | i3) * (-979)) + (((~((-1214826483) | i3)) | (~(403391477 | i6))) * 979);
                        int i189 = -(-((i188 & 16) + (i188 | 16)));
                        int i190 = ((i189 | (-1763436071)) << 1) - (i189 ^ (-1763436071));
                        int i191 = i190 << 13;
                        int i192 = (~(i191 & i190)) & (i191 | i190);
                        int i193 = i192 >>> 17;
                        int i194 = (~(i192 & i193)) & (i192 | i193);
                        objArr = objArr32;
                        i10 = 0;
                    } else {
                        objArr = new java.lang.Object[]{null, new int[1], new int[]{i3}, new int[]{i3}};
                        int nextInt6 = new java.util.Random().nextInt(1454260291);
                        int i195 = ~nextInt6;
                        int i196 = ((((~((-157713850) | i195)) | (-1460504111)) * (-865)) - 13926254) + ((~(nextInt6 | 157713849)) * 865) + (((~((-1460504111) | i195)) | (~(i195 | 157713849))) * 865);
                        int i197 = -(-((i196 << 1) - i196));
                        int i198 = (i197 & (-1763436071)) + (i197 | (-1763436071));
                        int i199 = i198 << 13;
                        int i200 = ((~i199) & i198) | ((~i198) & i199);
                        int i201 = i200 >>> 17;
                        int i202 = (~(i200 & i201)) & (i200 | i201);
                        int i203 = i202 << 5;
                        int[] iArr4 = (int[]) objArr[1];
                        int i204 = (i202 & (~i203)) | ((~i202) & i203);
                        i10 = 0;
                        iArr4[0] = i204;
                    }
                }
                c2 = 3;
                if (((int[]) objArr[c2])[i10] != ((int[]) objArr[2])[i10]) {
                }
            }
        }
        i10 = i11;
        c2 = 3;
        objArr = objArr2;
        str4 = str3;
        if (((int[]) objArr[c2])[i10] != ((int[]) objArr[2])[i10]) {
        }
        d2 = com.facetec.sdk.al.d(-1699488110);
        if (d2 == null) {
        }
        long longValue32 = ((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, null)).longValue();
        long j292 = -90430630;
        long j302 = 623;
        long j312 = longValue32 ^ j2;
        long j322 = j312 | j292;
        j10 = (((((624 * j292) + ((-622) * longValue32)) + (((j322 | j4) ^ j2) * j302)) + ((-623) * (j3 | (((j292 ^ j2) | longValue32) ^ j2)))) + ((((j322 ^ j2) | ((j312 | j4) ^ j2)) | ((j292 | j4) ^ j2)) * j302)) - 1097333953;
        i7 = (int) (j10 >> 32);
        i8 = ~((-905390975) | i3);
        if (((i7 & ((((~(1707054904 | i6)) | (-1150685981)) * (-90)) + 1687905420 + (((~(1707054904 | i3)) | 1150685976) * (-45)) + (((~(1150685980 | i3)) | 1707054904 | (~((-1150685981) | i6))) * 45))) | (((int) j10) & (((((~((-905390975) | i6)) | 27328808) * (-245)) - 244128216) + (i8 * (-245)) + ((i8 | 1952349911) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE)))) != 0) {
        }
        i10 = i11;
        c2 = 3;
        objArr = objArr2;
        str4 = str3;
        if (((int[]) objArr[c2])[i10] != ((int[]) objArr[2])[i10]) {
        }
        int i205 = 0;
        if (i205 != 0) {
            java.lang.Object[] objArr33 = {null, new int[]{(r3 & (~r4)) | r5}, new int[]{i205 ^ i3}, new int[]{i3}};
            int i206 = (~((-885460716) | i3)) | 545524968;
            int i207 = (i206 * 992) + 2140994647 + ((i206 | (~(i4 | 1072692991))) * (-496)) + ((732757244 | i3) * 496) + 16;
            int i208 = (i207 ^ (-1763436071)) + (((-1763436071) & i207) << 1);
            int i209 = i208 << 13;
            int i210 = (~(i209 & i208)) & (i208 | i209);
            int i211 = i210 >>> 17;
            int i212 = (~(i210 & i211)) & (i210 | i211);
            int i213 = i212 << 5;
            int i214 = (~i212) & i213;
            return objArr33;
        }
        int i215 = -(android.view.ViewConfiguration.getLongPressTimeout() >> 16);
        java.lang.Object[] objArr34 = new java.lang.Object[1];
        g("ꀌകю̾甆玫沌ퟐ⼽纠즒\ueb81\uda25⯧", (i215 & 13) + (i215 | 13), objArr34);
        java.lang.Object[] objArr35 = {(java.lang.String) objArr34[0]};
        java.lang.Object d19 = com.facetec.sdk.al.d(1590238701);
        if (d19 == null) {
            char lastIndexOf4 = (char) ((-1) - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
            long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
            int alpha2 = android.graphics.Color.alpha(0);
            byte b24 = (byte) 0;
            java.lang.Object[] objArr36 = new java.lang.Object[1];
            f(b24, b24, b24, objArr36);
            d19 = com.facetec.sdk.al.c(lastIndexOf4, 2079 - (elapsedRealtimeNanos > 0L ? 1 : (elapsedRealtimeNanos == 0L ? 0 : -1)), alpha2 + 24, -114923755, false, (java.lang.String) objArr36[0], new java.lang.Class[]{java.lang.String.class});
        }
        java.lang.String str8 = (java.lang.String) ((java.lang.reflect.Method) d19).invoke(null, objArr35);
        if (str8 != null) {
            int i216 = (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int keyRepeatTimeout = android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16;
            int i217 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
            java.lang.Object[] objArr37 = new java.lang.Object[1];
            h(false, ((i216 | 10) << 1) - (i216 ^ 10), "\u000f\ufff7\u0004\u0005�\ufffb\u0004\u0003\u0005\ufffa\ufff9", (keyRepeatTimeout ^ 126) + ((keyRepeatTimeout & 126) << 1), (i217 ^ 10) + ((i217 & 10) << 1), objArr37);
            java.lang.String[] strArr = {(java.lang.String) objArr37[0]};
            int i218 = 0;
            while (true) {
                if (i218 > 0) {
                    int i219 = -(-android.text.TextUtils.indexOf(str, str, 0, 0));
                    java.lang.Object[] objArr38 = new java.lang.Object[1];
                    h(true, ((i219 | 12) << 1) - (i219 ^ 12), "ￖￖ\u0013\b\n\u0016\u0013ￖ\b\u001b\b\u000b", 108 - (~(-android.text.TextUtils.getTrimmedLength(str))), (-16777216) - (~(-android.graphics.Color.rgb(0, 0, 0))), objArr38);
                    java.lang.String str9 = (java.lang.String) objArr38[0];
                    int offsetBefore = android.text.TextUtils.getOffsetBefore(str, 0);
                    int green2 = android.graphics.Color.green(0);
                    int i220 = -android.graphics.Color.alpha(0);
                    java.lang.Object[] objArr39 = new java.lang.Object[1];
                    h(true, 16 - offsetBefore, "\u0013\b\n\u0016\u0013ￖ\b\u001b\b\u000bￖￖ\u0015\u0010\tￖ", green2 + 109, ((i220 | 11) << 1) - (i220 ^ 11), objArr39);
                    java.lang.String str10 = (java.lang.String) objArr39[0];
                    int i221 = -(android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                    java.lang.Object[] objArr40 = new java.lang.Object[1];
                    g("을ᗬ\ue71a\u09a9器\u454e3ᙯ\ued1f\u0a29膉苁ᾧ賈㈹꒮㍹¨", (i221 & 17) + (i221 | 17), objArr40);
                    java.lang.String str11 = (java.lang.String) objArr40[0];
                    int i222 = (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                    int d20 = com.facetec.sdk.fl.d();
                    int i223 = ~i222;
                    int i224 = ~((i223 ^ 5) | (i223 & 5));
                    int i225 = (i224 ^ d20) | (i224 & d20);
                    int i226 = ~((i222 ^ (-6)) | (i222 & (-6)));
                    int i227 = (((i222 * 615) - 3065) - (~(((i225 ^ i226) | (i225 & i226)) * 614))) - 1;
                    int i228 = ~d20;
                    int i229 = ~((i223 & i228) | (i223 ^ i228));
                    int i230 = ~(i223 | 5);
                    int i231 = ((i229 & i230) | (i229 ^ i230) | (~((i228 & 5) | (i228 ^ 5)))) * (-1228);
                    int i232 = ((i227 | i231) << 1) - (i231 ^ i227);
                    int i233 = i223 | (-6);
                    int i234 = ~((i233 ^ i228) | (i233 & i228));
                    int i235 = ~((i222 ^ i228) | (i222 & i228) | 5);
                    int i236 = ((i235 ^ i234) | (i235 & i234)) * 614;
                    java.lang.Object[] objArr41 = new java.lang.Object[1];
                    h(true, (i232 ^ i236) + ((i236 & i232) << 1), "\u001c\uffd8\uffd8\u0017\u0012\u000b", android.text.TextUtils.getOffsetBefore(str, 0) + 107, '2' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr41);
                    java.lang.String str12 = (java.lang.String) objArr41[0];
                    java.lang.Object[] objArr42 = new java.lang.Object[1];
                    g("ﻲ艓껐奛\uf050쵮⌡\uf2a3錅ṹⰑ乏", 11 - (~(-(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24))), objArr42);
                    java.lang.String str13 = (java.lang.String) objArr42[0];
                    java.lang.Object[] objArr43 = new java.lang.Object[1];
                    g("ﻲ艓껐奛\uf050쵮⌡\uf2a3錅ṹⰑ乏亃䩣䐄㊣㍹¨", android.text.TextUtils.indexOf(str, str, 0) + 17, objArr43);
                    java.lang.String str14 = (java.lang.String) objArr43[0];
                    int resolveOpacity = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                    int absoluteGravity2 = android.view.Gravity.getAbsoluteGravity(0, 0);
                    int gidForName = android.os.Process.getGidForName(str);
                    java.lang.Object[] objArr44 = new java.lang.Object[1];
                    h(true, ((resolveOpacity | 21) << 1) - (resolveOpacity ^ 21), "\uffd0\u000f\n\u0003\uffd0\u000e\u0006\u0015\u0014\u001a\u0014\uffd0\uffd0\u0006\u0007\u0002\u0014\r\n\u0002\u0007", absoluteGravity2 + 115, (gidForName & 13) + (gidForName | 13), objArr44);
                    java.lang.String str15 = (java.lang.String) objArr44[0];
                    int i237 = -(-android.view.MotionEvent.axisFromString(str));
                    int i238 = -(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    int i239 = -(-(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    java.lang.Object[] objArr45 = new java.lang.Object[1];
                    h(false, (i237 ^ 17) + ((i237 & 17) << 1), "\u0004\u000b\u0010\uffd1\uffd1\u0015\u001b\u0015\u0016\u0007\u000f\uffd1\u0015\u0006\uffd1\u001a", 114 - (~i238), (i239 ^ 3) + ((i239 & 3) << 1), objArr45);
                    java.lang.String str16 = (java.lang.String) objArr45[0];
                    int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                    int i240 = makeMeasureSpec * 868;
                    int i241 = ((i240 | 21700) << 1) - (i240 ^ 21700);
                    int i242 = ~makeMeasureSpec;
                    int i243 = ~(i242 | i4);
                    int i244 = ~((i4 ^ (-26)) | (i4 & (-26)));
                    int i245 = -(-(((i243 ^ i244) | (i243 & i244)) * (-867)));
                    int i246 = ((i241 | i245) << 1) - (i241 ^ i245);
                    int i247 = (i242 ^ (-26)) | (i242 & (-26));
                    int i248 = ~i247;
                    int i249 = ~((i242 ^ i3) | (i242 & i3));
                    int i250 = (i248 ^ i249) | (i248 & i249);
                    int i251 = ~((i3 ^ (-26)) | (i3 & (-26)));
                    int i252 = -(-(((i250 ^ i251) | (i250 & i251)) * (-1734)));
                    int i253 = i242 | 25;
                    int i254 = (~((i253 ^ i3) | (i253 & i3))) | (~((i247 ^ i4) | (i247 & i4)));
                    int i255 = (makeMeasureSpec ^ (-26)) | (makeMeasureSpec & (-26));
                    int i256 = ~((i255 ^ i3) | (i255 & i3));
                    int keyRepeatTimeout2 = android.view.ViewConfiguration.getKeyRepeatTimeout();
                    int defaultSize2 = android.view.View.getDefaultSize(0, 0);
                    int i257 = ~defaultSize2;
                    int i258 = (defaultSize2 * (-183)) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CARD_ACTIVATION_ACT_CODE_TRY_LIMIT_EXCEEDED + (((i257 & 3) | (i257 ^ 3)) * (-368));
                    int i259 = (defaultSize2 ^ (-4)) | (defaultSize2 & (-4));
                    int i260 = -(-(((i259 ^ i4) | (i259 & i4)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE));
                    int i261 = ~((i257 ^ (-4)) | (i257 & (-4)));
                    int i262 = ~((i4 ^ defaultSize2) | (i4 & defaultSize2));
                    int i263 = (i261 & i262) | (i261 ^ i262);
                    int i264 = ~((defaultSize2 ^ 3) | (defaultSize2 & 3));
                    java.lang.Object[] objArr46 = new java.lang.Object[1];
                    h(false, (((i246 | i252) << 1) - (i252 ^ i246)) + (((i256 ^ i254) | (i256 & i254)) * 867), "\u0010\u0015\uffd0\uffd0\u0014\u001a\u0014\u0015\u0006\u000e\uffd0\u0016\u0014\u0013\uffd0\u0018\u0006ￎ\u000f\u0006\u0006\u0005ￎ\u0013\u0010", 115 - (keyRepeatTimeout2 >> 16), (i258 & i260) + (i258 | i260) + (((i264 & i263) | (i263 ^ i264)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE), objArr46);
                    java.lang.String str17 = (java.lang.String) objArr46[0];
                    int i265 = -android.view.View.resolveSizeAndState(0, 0, 0);
                    java.lang.Object[] objArr47 = new java.lang.Object[1];
                    g("ﻲ艓껐奛\uf050쵮⌡\uf2a3ᾧ賈㈹꒮㍹¨", (i265 & 13) + (i265 | 13), objArr47);
                    java.lang.String str18 = (java.lang.String) objArr47[0];
                    int i266 = (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int d21 = com.facetec.sdk.fl.d();
                    int i267 = i266 * 495;
                    int i268 = ((i267 | (-4437)) << 1) - (i267 ^ (-4437));
                    int i269 = (i266 | (-10)) * (-988);
                    int i270 = (i268 & i269) + (i269 | i268);
                    int i271 = ~i266;
                    int i272 = (i271 ^ 9) | (i271 & 9);
                    int i273 = ~d21;
                    int i274 = ((i272 ^ i273) | (i272 & i273)) * 494;
                    int i275 = (i270 ^ i274) + ((i274 & i270) << 1);
                    int i276 = (~((i273 ^ 9) | (i273 & 9))) | (~((i271 ^ (-10)) | (i271 & (-10))));
                    int i277 = ~(i266 | 9);
                    int i278 = -(-(((i277 ^ i276) | (i277 & i276)) * 494));
                    java.lang.Object[] objArr48 = new java.lang.Object[1];
                    h(false, (i275 & i278) + (i278 | i275), "ￗ\n\u0011\u0016ￗￗ\u001d\u001b\u001a", android.graphics.ImageFormat.getBitsPerPixel(0) + 109, 6 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr48);
                    java.lang.String str19 = (java.lang.String) objArr48[0];
                    int capsMode = android.text.TextUtils.getCapsMode(str, 0, 0);
                    byte modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                    int bitsPerPixel2 = android.graphics.ImageFormat.getBitsPerPixel(0);
                    java.lang.Object[] objArr49 = new java.lang.Object[1];
                    h(true, 8 - capsMode, " \u001eￚￚ\u0019\u0014\rￚ", (modifierMetaStateMask ^ 106) + ((modifierMetaStateMask & 106) << 1), (bitsPerPixel2 ^ 4) + ((bitsPerPixel2 & 4) << 1), objArr49);
                    java.lang.String[] strArr2 = {str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, (java.lang.String) objArr49[0]};
                    int i279 = 0;
                    while (i279 < 12) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(strArr2[i279]);
                        java.lang.Object[] objArr50 = new java.lang.Object[1];
                        g("떦䣍", (android.os.Process.myPid() >> 22) + 2, objArr50);
                        sb.append((java.lang.String) objArr50[0]);
                        java.lang.Object[] objArr51 = {sb.toString()};
                        java.lang.Object d22 = com.facetec.sdk.al.d(1873189073);
                        if (d22 == null) {
                            char scrollBarFadeDuration = (char) (6935 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                            int pressedStateDuration = android.view.ViewConfiguration.getPressedStateDuration();
                            int tapTimeout2 = android.view.ViewConfiguration.getTapTimeout();
                            byte b25 = (byte) 1;
                            byte b26 = (byte) (b25 - 1);
                            java.lang.Object[] objArr52 = new java.lang.Object[1];
                            f(b25, b26, b26, objArr52);
                            d22 = com.facetec.sdk.al.c(scrollBarFadeDuration, (pressedStateDuration >> 16) + 2389, 23 - (tapTimeout2 >> 16), -934682071, false, (java.lang.String) objArr52[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) d22).invoke(null, objArr51)).longValue();
                        long j90 = 872555439;
                        str2 = str;
                        java.lang.String[] strArr3 = strArr2;
                        int i280 = i279;
                        long j91 = 50;
                        long j92 = longValue14 ^ j2;
                        long j93 = j92 | j3;
                        long j94 = (51 * j90) + ((-49) * longValue14) + ((-50) * (j90 | j4)) + ((((((j90 ^ j2) | j92) | j4) ^ j2) | ((j93 | j90) ^ j2)) * j91) + (j91 * ((j93 ^ j2) | ((j92 | j90) ^ j2) | ((j3 | j90) ^ j2))) + 64524204;
                        int i281 = ((int) (j94 >> 32)) & ((((((~((-284105375) | i3)) | 272892050) | (~(1153121036 | i3))) * (-754)) - 965553746) + (((~((-272892051) | i3)) | (~(i4 | 1426013086))) * (-754)) + ((i4 | (-284105375)) * 754));
                        int i282 = ((int) j94) & ((((503461481 | i3) * 140) - 1785885555) + (((~(i4 | 503461481)) | (-2142158460)) * (-280)) + (((~(i4 | (-1940687892))) | 301990913 | (~(2142158459 | i3))) * 140));
                        if (((i281 ^ i282) | (i281 & i282)) != 0) {
                            i5 = ((i280 | 110) << 1) - (i280 ^ 110);
                            break;
                        }
                        int i283 = i280 - 10;
                        i279 = (i283 | 11) + (i283 & 11);
                        strArr2 = strArr3;
                        str = str2;
                    }
                } else {
                    if (str8.contains(strArr[i218])) {
                        break;
                    }
                    i218 = ((i218 | 1) << 1) - (i218 ^ 1);
                }
            }
        }
        str2 = str;
        i5 = 0;
        if (i5 != 0) {
            java.lang.Object[] objArr53 = {null, new int[1], new int[]{i5 ^ i3}, new int[]{i3}};
            int myUid2 = android.os.Process.myUid();
            int i284 = ~myUid2;
            int i285 = (-1763436072) - (~(((((((~((-789106736) | i284)) | 829111224) * (-90)) + 1423582082) + (((~((-789106736) | myUid2)) | (-1064041408)) * (-45))) + ((((~(myUid2 | (-829111225))) | (-789106736)) | (~(i284 | 829111224))) * 45)) + 16));
            int i286 = i285 << 13;
            int i287 = ((~i286) & i285) | ((~i285) & i286);
            int i288 = i287 >>> 17;
            int i289 = (i287 & (~i288)) | ((~i287) & i288);
            int i290 = i289 << 5;
            ((int[]) objArr53[1])[0] = (~(i289 & i290)) & (i289 | i290);
            return objArr53;
        }
        long[] jArr2 = {472001035};
        str3 = str2;
        int i291 = -android.text.TextUtils.getCapsMode(str3, 0, 0);
        java.lang.Object[] objArr54 = new java.lang.Object[1];
        g("纯\ued7eꀌക鱹铘\uaaff舟堉㞫扄ᣍ࣋ꢦ샼矡몼冫", (i291 & 17) + (i291 | 17), objArr54);
        java.lang.Object[] objArr55 = {(java.lang.String) objArr54[0], 5, java.lang.Long.valueOf(kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK), jArr2};
        java.lang.Object d23 = com.facetec.sdk.al.d(2143203995);
        if (d23 == null) {
            char lastIndexOf5 = (char) (18696 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
            int size3 = android.view.View.MeasureSpec.getSize(0);
            int myTid2 = android.os.Process.myTid();
            byte b27 = (byte) 3;
            byte b28 = (byte) (b27 - 3);
            java.lang.Object[] objArr56 = new java.lang.Object[1];
            f(b27, b28, b28, objArr56);
            d23 = com.facetec.sdk.al.c(lastIndexOf5, size3 + 1787, (myTid2 >> 22) + 24, -665728925, false, (java.lang.String) objArr56[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class});
        }
        long longValue15 = ((java.lang.Long) ((java.lang.reflect.Method) d23).invoke(null, objArr55)).longValue();
        long j95 = 1330421645;
        long j96 = j95 ^ j2;
        long j97 = (longValue15 | j4) ^ j2;
        long j98 = ((((((-109) * j95) + (111 * longValue15)) + ((-220) * (j96 | j97))) + (com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE * (((j95 | longValue15) ^ j2) | j97))) + (110 * ((((longValue15 ^ j2) | j95) ^ j2) | ((j96 | longValue15) ^ j2)))) - 1831036279;
        int i292 = (int) (j98 >> 32);
        int i293 = ~(((int) java.lang.Runtime.getRuntime().totalMemory()) | (-58818419));
        int i294 = ((i292 & (((((-1521134192) | i293) * (-658)) - 1248616790) + ((i293 | 16864528) * 658))) | (((int) j98) & (((((~((-206244610) | i3)) | (-1841195947)) * 398) + 785340425) + (((~(i4 | (-206244610))) | (-1841195947)) * 398)))) != 0 ? com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE : 0;
        if (i294 != 0) {
            java.lang.Object[] objArr57 = {null, new int[1], new int[]{((~i294) & i3) | (i294 & i4)}, new int[]{i3}};
            int elapsedCpuTime5 = (int) android.os.Process.getElapsedCpuTime();
            int i295 = (((~(167430039 | elapsedCpuTime5)) | 1450787920) * 56) + 1176840351 + (((~((~elapsedCpuTime5) | 1450787920)) | 167430039) * 56);
            int i296 = (-1763436072) - (~(-(-((i295 ^ 16) + ((i295 & 16) << 1)))));
            int i297 = i296 << 13;
            int i298 = (~(i297 & i296)) & (i297 | i296);
            int i299 = i298 >>> 17;
            int i300 = (~(i298 & i299)) & (i298 | i299);
            int i301 = i300 << 5;
            ((int[]) objArr57[1])[0] = (~(i300 & i301)) & (i300 | i301);
            return objArr57;
        }
        long[] jArr3 = {472001035};
        int i302 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
        java.lang.Object[] objArr58 = new java.lang.Object[1];
        h(true, (i302 & 22) + (i302 | 22), "\u0000\u0006\t\f\rￌ\u0015\u0012\u000b\u0006\t\u0002\u0010ￌ\u0010\u0003ￌ\u0010\u0016\u0010ￌ\u0016", 117 - (~(-((byte) android.view.KeyEvent.getModifierMetaStateMask()))), 21 - android.view.View.MeasureSpec.getSize(0), objArr58);
        try {
            bufferedInputStream2 = new java.io.BufferedInputStream(new java.io.FileInputStream((java.lang.String) objArr58[0]));
            long j99 = 0;
            while (true) {
                try {
                    int read = bufferedInputStream2.read();
                    if (read == -1) {
                        i6 = i4;
                        break;
                    }
                    int i303 = i;
                    j = ((i303 ^ 3) + ((i303 & 3) << 1)) % 128;
                    j99 = ((j99 << 5) ^ read) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK;
                    int i304 = 0;
                    for (int i305 = 1; i304 < i305; i305 = 1) {
                        if (j99 == jArr3[i304]) {
                            i12 = ((i304 | 1) << i305) - (i304 ^ i305);
                            try {
                                bufferedInputStream2.close();
                            } catch (java.lang.Exception unused) {
                            }
                            if (i12 == 0) {
                            }
                        } else {
                            int i306 = (i304 & (-68)) + (i304 | (-68));
                            i304 = (i306 & 69) + (i306 | 69);
                        }
                    }
                } catch (java.io.IOException unused2) {
                    i6 = i4;
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream == null) {
                        throw th;
                    }
                    try {
                        bufferedInputStream.close();
                        throw th;
                    } catch (java.lang.Exception unused3) {
                        throw th;
                    }
                }
            }
        } catch (java.io.IOException unused4) {
            i6 = i4;
            bufferedInputStream2 = null;
        } catch (java.lang.Throwable th5) {
            th = th5;
            bufferedInputStream = null;
        }
        try {
            bufferedInputStream2.close();
        } catch (java.lang.Exception unused5) {
        }
        d2 = com.facetec.sdk.al.d(-1699488110);
        if (d2 == null) {
        }
        long longValue322 = ((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, null)).longValue();
        long j2922 = -90430630;
        long j3022 = 623;
        long j3122 = longValue322 ^ j2;
        long j3222 = j3122 | j2922;
        j10 = (((((624 * j2922) + ((-622) * longValue322)) + (((j3222 | j4) ^ j2) * j3022)) + ((-623) * (j3 | (((j2922 ^ j2) | longValue322) ^ j2)))) + ((((j3222 ^ j2) | ((j3122 | j4) ^ j2)) | ((j2922 | j4) ^ j2)) * j3022)) - 1097333953;
        i7 = (int) (j10 >> 32);
        i8 = ~((-905390975) | i3);
        if (((i7 & ((((~(1707054904 | i6)) | (-1150685981)) * (-90)) + 1687905420 + (((~(1707054904 | i3)) | 1150685976) * (-45)) + (((~(1150685980 | i3)) | 1707054904 | (~((-1150685981) | i6))) * 45))) | (((int) j10) & (((((~((-905390975) | i6)) | 27328808) * (-245)) - 244128216) + (i8 * (-245)) + ((i8 | 1952349911) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE)))) != 0) {
        }
        i10 = i11;
        c2 = 3;
        objArr = objArr2;
        str4 = str3;
        if (((int[]) objArr[c2])[i10] != ((int[]) objArr[2])[i10]) {
        }
    }
}
