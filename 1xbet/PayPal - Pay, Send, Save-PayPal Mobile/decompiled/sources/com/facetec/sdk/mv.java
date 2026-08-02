package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class mv {
    private static final char[] d = {com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    final java.lang.String f3663a;
    final int b;
    final java.lang.String c;

    @javax.annotation.Nullable
    public final java.util.List<java.lang.String> e;
    private final java.lang.String f;
    private final java.lang.String g;
    private final java.util.List<java.lang.String> h;
    private final java.lang.String i;

    @javax.annotation.Nullable
    private final java.lang.String j;

    public static final class d {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static char[] h;
        private static long i;
        private static int l;
        private static int n;

        /* renamed from: a, reason: collision with root package name */
        @javax.annotation.Nullable
        java.lang.String f3664a;

        @javax.annotation.Nullable
        java.lang.String e;
        final java.util.List<java.lang.String> f;

        @javax.annotation.Nullable
        java.util.List<java.lang.String> g;

        @javax.annotation.Nullable
        java.lang.String j;
        java.lang.String c = "";
        java.lang.String b = "";
        int d = -1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static java.lang.String $$e(byte b, int i2, int i3) {
            int i4;
            int i5 = i3 * 3;
            int i6 = b + 102;
            byte[] bArr = $$c;
            int i7 = i2 + 4;
            byte[] bArr2 = new byte[1 - i5];
            if (bArr == null) {
                int i8 = i7;
                int i9 = 0;
                i6 += -i7;
                i7 = i8;
                i4 = i9;
                int i10 = i7 + 1;
                bArr2[i4] = (byte) i6;
                if (i4 == 0 - i5) {
                    return new java.lang.String(bArr2, 0);
                }
                int i11 = i4 + 1;
                i8 = i10;
                i7 = bArr[i10];
                i9 = i11;
                i6 += -i7;
                i7 = i8;
                i4 = i9;
                int i102 = i7 + 1;
                bArr2[i4] = (byte) i6;
                if (i4 == 0 - i5) {
                }
            } else {
                i4 = 0;
                int i1022 = i7 + 1;
                bArr2[i4] = (byte) i6;
                if (i4 == 0 - i5) {
                }
            }
        }

        public static /* synthetic */ java.lang.Object e(int i2, int i3, int i4, java.lang.Object[] objArr, int i5, int i6, int i7) {
            int i8 = ~i7;
            int i9 = ~(i8 | i4);
            int i10 = (~(i8 | i3)) | i9;
            int i11 = ~i4;
            int i12 = ~(i11 | i7);
            int i13 = i9 | i12 | (~(i11 | i3));
            int i14 = (~((~i3) | i11)) | i9 | i12;
            int i15 = i7 + i4 + i2 + ((-369695973) * i5) + (1794320298 * i6);
            int i16 = i15 * i15;
            int i17 = ((1872133577 * i7) - 2052485254) + (1872135674 * i4) + (i10 * 2097) + (i13 * (-1398)) + (i14 * 699) + (1872134975 * i2) + ((-1328892763) * i5) + ((-1296121642) * i6) + ((-1691287552) * i16);
            int i18 = (i7 * (-1820121865)) + 1478230016 + (i4 * 776760710) + (i10 * (-1698084721)) + (i13 * (-1731255050)) + (i14 * 865627525) + (i2 * (-88866816)) + (i5 * 217841664) + (i6 * (-410517504)) + (i16 * (-175177728)) + (i17 * i17 * (-1729036288));
            if (i18 != 1) {
                if (i18 == 2) {
                    return e(objArr);
                }
                java.lang.String str = (java.lang.String) objArr[0];
                int intValue = ((java.lang.Number) objArr[1]).intValue();
                int intValue2 = ((java.lang.Number) objArr[2]).intValue();
                l = (n + 107) % 128;
                java.lang.String e = com.facetec.sdk.nh.e(com.facetec.sdk.mv.d(str, intValue, intValue2, false));
                n = (l + 27) % 128;
                return e;
            }
            com.facetec.sdk.mv.d dVar = (com.facetec.sdk.mv.d) objArr[0];
            l = (n + 81) % 128;
            java.util.List<java.lang.String> list = dVar.f;
            if (list.remove(list.size() - 1).isEmpty()) {
                n = (l + 17) % 128;
                if (!dVar.f.isEmpty()) {
                    java.util.List<java.lang.String> list2 = dVar.f;
                    list2.set(list2.size() - 1, "");
                    return null;
                }
            }
            dVar.f.add("");
            l = (n + 53) % 128;
            return null;
        }

        static void init$0() {
            $$a = new byte[]{com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 122, 71, 33};
            $$b = 77;
        }

        static void init$1() {
            $$c = new byte[]{36, 100, 1, 58};
            $$d = 144;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void m(short s, int i2, byte b, java.lang.Object[] objArr) {
            int i3;
            int i4 = s + 97;
            int i5 = 1 - (b * 2);
            byte[] bArr = $$a;
            int i6 = i2 + 4;
            byte[] bArr2 = new byte[i5];
            if (bArr == null) {
                int i7 = i6;
                int i8 = i5;
                i3 = 0;
                int i9 = i6 + i8;
                i6 = i7;
                i4 = i9;
                bArr2[i3] = (byte) i4;
                i3++;
                int i10 = i6 + 1;
                if (i3 == i5) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                i8 = bArr[i10];
                i6 = i4;
                i7 = i10;
                int i92 = i6 + i8;
                i6 = i7;
                i4 = i92;
                bArr2[i3] = (byte) i4;
                i3++;
                int i102 = i6 + 1;
                if (i3 == i5) {
                }
            } else {
                i3 = 0;
                bArr2[i3] = (byte) i4;
                i3++;
                int i1022 = i6 + 1;
                if (i3 == i5) {
                }
            }
        }

        private static void k(char c, int i2, int i3, java.lang.Object[] objArr) {
            com.facetec.sdk.hh hhVar = new com.facetec.sdk.hh();
            long[] jArr = new long[i3];
            hhVar.e = 0;
            while (hhVar.e < i3) {
                int i4 = $11 + 103;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = hhVar.e;
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(h[i2 * i5])};
                        java.lang.Object d = com.facetec.sdk.al.d(-719238807);
                        if (d == null) {
                            char size = (char) (45150 - android.view.View.MeasureSpec.getSize(0));
                            int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(0L);
                            long currentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
                            byte b = (byte) (-$$c[2]);
                            d = com.facetec.sdk.al.c(size, packedPositionChild + 2151, 25 - (currentThreadTimeMillis > (-1L) ? 1 : (currentThreadTimeMillis == (-1L) ? 0 : -1)), 1926116241, false, $$e((byte) 3, b, (byte) (b + 1)), new java.lang.Class[]{java.lang.Integer.TYPE});
                        }
                        java.lang.Object[] objArr3 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) d).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(i5), java.lang.Long.valueOf(i), java.lang.Integer.valueOf(c)};
                        java.lang.Object d2 = com.facetec.sdk.al.d(671690243);
                        if (d2 == null) {
                            char maximumFlingVelocity = (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            long currentThreadTimeMillis2 = android.os.SystemClock.currentThreadTimeMillis();
                            int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
                            byte[] bArr = $$c;
                            byte length = (byte) bArr.length;
                            byte b2 = (byte) (-bArr[2]);
                            d2 = com.facetec.sdk.al.c(maximumFlingVelocity, 1835 - (currentThreadTimeMillis2 > (-1L) ? 1 : (currentThreadTimeMillis2 == (-1L) ? 0 : -1)), combineMeasuredStates + 24, -1880730373, false, $$e(length, b2, (byte) (b2 + 1)), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                        }
                        jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, objArr3)).longValue();
                        java.lang.Object[] objArr4 = {hhVar, hhVar};
                        java.lang.Object d3 = com.facetec.sdk.al.d(898558648);
                        if (d3 == null) {
                            char edgeSlop = (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16);
                            int offsetAfter = android.text.TextUtils.getOffsetAfter("", 0);
                            int threadPriority = android.os.Process.getThreadPriority(0);
                            byte b3 = $$c[2];
                            byte b4 = (byte) (b3 - 1);
                            byte b5 = (byte) (-b3);
                            d3 = com.facetec.sdk.al.c(edgeSlop, 2341 - offsetAfter, 24 - ((threadPriority + 20) >> 6), -1839099840, false, $$e(b4, b5, (byte) (b5 + 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                        }
                        ((java.lang.reflect.Method) d3).invoke(null, objArr4);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i6 = hhVar.e;
                    java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(h[i2 + i6])};
                    java.lang.Object d4 = com.facetec.sdk.al.d(-719238807);
                    if (d4 == null) {
                        char edgeSlop2 = (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 45150);
                        int green = android.graphics.Color.green(0);
                        int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(0);
                        byte b6 = (byte) (-$$c[2]);
                        d4 = com.facetec.sdk.al.c(edgeSlop2, 2150 - green, bitsPerPixel + 25, 1926116241, false, $$e((byte) 3, b6, (byte) (b6 + 1)), new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    java.lang.Object[] objArr6 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr5)).longValue()), java.lang.Long.valueOf(i6), java.lang.Long.valueOf(i), java.lang.Integer.valueOf(c)};
                    java.lang.Object d5 = com.facetec.sdk.al.d(671690243);
                    if (d5 == null) {
                        char trimmedLength = (char) android.text.TextUtils.getTrimmedLength("");
                        int blue = android.graphics.Color.blue(0);
                        long packedPositionForChild = android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
                        byte[] bArr2 = $$c;
                        byte length2 = (byte) bArr2.length;
                        byte b7 = (byte) (-bArr2[2]);
                        d5 = com.facetec.sdk.al.c(trimmedLength, 1834 - blue, (packedPositionForChild > 0L ? 1 : (packedPositionForChild == 0L ? 0 : -1)) + 25, -1880730373, false, $$e(length2, b7, (byte) (b7 + 1)), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                    }
                    jArr[i6] = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, objArr6)).longValue();
                    java.lang.Object[] objArr7 = {hhVar, hhVar};
                    java.lang.Object d6 = com.facetec.sdk.al.d(898558648);
                    if (d6 == null) {
                        char modifierMetaStateMask = (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()));
                        int myPid = android.os.Process.myPid();
                        int trimmedLength2 = android.text.TextUtils.getTrimmedLength("");
                        byte b8 = $$c[2];
                        byte b9 = (byte) (b8 - 1);
                        byte b10 = (byte) (-b8);
                        d6 = com.facetec.sdk.al.c(modifierMetaStateMask, (myPid >> 22) + 2341, 24 - trimmedLength2, -1839099840, false, $$e(b9, b10, (byte) (b10 + 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) d6).invoke(null, objArr7);
                }
            }
            char[] cArr = new char[i3];
            hhVar.e = 0;
            $11 = ($10 + 71) % 128;
            while (hhVar.e < i3) {
                cArr[hhVar.e] = (char) jArr[hhVar.e];
                java.lang.Object[] objArr8 = {hhVar, hhVar};
                java.lang.Object d7 = com.facetec.sdk.al.d(898558648);
                if (d7 == null) {
                    char maximumFlingVelocity2 = (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration();
                    int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                    byte b11 = $$c[2];
                    byte b12 = (byte) (b11 - 1);
                    byte b13 = (byte) (-b11);
                    d7 = com.facetec.sdk.al.c(maximumFlingVelocity2, (scrollBarFadeDuration >> 16) + 2341, lastIndexOf + 25, -1839099840, false, $$e(b12, b13, (byte) (b13 + 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d7).invoke(null, objArr8);
            }
            objArr[0] = new java.lang.String(cArr);
        }

        public d() {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.f = arrayList;
            arrayList.add("");
        }

        final int e() {
            int i2 = (n + 59) % 128;
            l = i2;
            int i3 = this.d;
            if (i3 == -1) {
                return com.facetec.sdk.mv.e(this.e);
            }
            n = (i2 + 23) % 128;
            return i3;
        }

        public final com.facetec.sdk.mv.d d(@javax.annotation.Nullable java.lang.String str) {
            int i2 = l + 65;
            n = i2 % 128;
            java.util.List<java.lang.String> list = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (str != null) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                k((char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), android.graphics.Color.argb(0, 0, 0, 0), 6 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
                list = com.facetec.sdk.mv.d(com.facetec.sdk.mv.d(str, (java.lang.String) objArr[0], true, false, true, true));
            }
            this.g = list;
            n = (l + 11) % 128;
            return this;
        }

        public final com.facetec.sdk.mv a() {
            n = (l + 7) % 128;
            if (this.e == null) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                k((char) (47114 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), 6 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 14, objArr);
                throw new java.lang.IllegalStateException((java.lang.String) objArr[0]);
            }
            if (this.f3664a == null) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                k((char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), 20 - android.view.KeyEvent.keyCodeFromString(""), 12 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr2);
                throw new java.lang.IllegalStateException((java.lang.String) objArr2[0]);
            }
            com.facetec.sdk.mv mvVar = new com.facetec.sdk.mv(this);
            l = (n + 49) % 128;
            return mvVar;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = this.e;
            if (str != null) {
                sb.append(str);
                java.lang.Object[] objArr = new java.lang.Object[1];
                k((char) (19089 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 33, 3 - android.graphics.Color.alpha(0), objArr);
                sb.append((java.lang.String) objArr[0]);
            } else {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                k((char) (6700 - android.text.TextUtils.getOffsetAfter("", 0)), 34 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 2 - android.text.TextUtils.indexOf("", ""), objArr2);
                sb.append((java.lang.String) objArr2[0]);
            }
            if (!this.c.isEmpty() || !this.b.isEmpty()) {
                sb.append(this.c);
                if (!this.b.isEmpty()) {
                    int i2 = l + 59;
                    n = i2 % 128;
                    if (i2 % 2 != 0) {
                        sb.append('?');
                    } else {
                        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
                    }
                    sb.append(this.b);
                }
                sb.append('@');
            }
            java.lang.String str2 = this.f3664a;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
                    sb.append(this.f3664a);
                    sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                } else {
                    sb.append(this.f3664a);
                }
            }
            if (this.d != -1 || this.e != null) {
                int e = e();
                java.lang.String str3 = this.e;
                if (str3 == null || e != com.facetec.sdk.mv.e(str3)) {
                    sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
                    sb.append(e);
                }
            }
            com.facetec.sdk.mv.a(sb, this.f);
            if (this.g != null) {
                int i3 = l + 59;
                n = i3 % 128;
                if (i3 % 2 != 0) {
                    sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
                } else {
                    sb.append('?');
                }
                com.facetec.sdk.mv.e(sb, this.g);
            }
            if (this.j != null) {
                sb.append('#');
                sb.append(this.j);
            }
            return sb.toString();
        }

        /* JADX WARN: Code restructure failed: missing block: B:68:0x0369, code lost:
        
            if (r6 != (-1)) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x03a1, code lost:
        
            r12 = new java.lang.Object[r14];
            k((char) (31172 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1))), 193 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)), android.text.TextUtils.lastIndexOf(r13, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 20, r12);
            r2 = new java.lang.StringBuilder((java.lang.String) r12[0]);
            r2.append(r30.substring(r4, r8));
            r2.append('\"');
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x03dd, code lost:
        
            throw new java.lang.IllegalArgumentException(r2.toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x039e, code lost:
        
            if (r6 != (-1)) goto L67;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final com.facetec.sdk.mv.d d(@javax.annotation.Nullable com.facetec.sdk.mv mvVar, java.lang.String str) {
            java.lang.String str2;
            int i2;
            int b;
            long j;
            char c;
            int i3;
            int i4;
            char c2;
            l = (n + 33) % 128;
            int d = com.facetec.sdk.nh.d(str, 0, str.length());
            int c3 = com.facetec.sdk.nh.c(str, d, str.length());
            int c4 = c(str, d, c3);
            long j2 = 0;
            if (c4 != -1) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                k((char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 37, 6 - android.text.TextUtils.indexOf("", "", 0, 0), objArr);
                i2 = 1;
                if (str.regionMatches(true, d, (java.lang.String) objArr[0], 0, 6)) {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    k((char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), android.widget.ExpandableListView.getPackedPositionChild(0L) + 44, 5 - android.graphics.Color.blue(0), objArr2);
                    this.e = (java.lang.String) objArr2[0];
                    d += 6;
                    str2 = "";
                } else {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    k((char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 21017), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 47, 4 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr3);
                    str2 = "";
                    if (!str.regionMatches(true, d, (java.lang.String) objArr3[0], 0, 5)) {
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        k((char) (48410 - android.text.TextUtils.indexOf(str2, str2)), 57 - android.text.TextUtils.getOffsetAfter(str2, 0), android.os.Process.getGidForName(str2) + 48, objArr4);
                        java.lang.StringBuilder sb = new java.lang.StringBuilder((java.lang.String) objArr4[0]);
                        sb.append(str.substring(0, c4));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        k((char) (39568 - android.text.TextUtils.indexOf(str2, str2, 0, 0)), 103 - android.widget.ExpandableListView.getPackedPositionChild(0L), -android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr5);
                        sb.append((java.lang.String) objArr5[0]);
                        throw new java.lang.IllegalArgumentException(sb.toString());
                    }
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    k((char) (40092 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 53, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 4, objArr6);
                    this.e = (java.lang.String) objArr6[0];
                    d += 5;
                }
            } else {
                str2 = "";
                i2 = 1;
                if (mvVar == null) {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    k((char) (android.graphics.Color.rgb(0, 0, 0) + 16785187), android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 106, (-16777156) - android.graphics.Color.rgb(0, 0, 0), objArr7);
                    throw new java.lang.IllegalArgumentException((java.lang.String) objArr7[0]);
                }
                this.e = mvVar.c;
            }
            int b2 = b(str, d, c3);
            char c5 = '?';
            char c6 = '#';
            char c7 = 2;
            if (b2 >= 2 || mvVar == null || !mvVar.c.equals(this.e)) {
                int i5 = d + b2;
                int i6 = 0;
                int i7 = 0;
                while (true) {
                    java.lang.Object[] objArr8 = new java.lang.Object[i2];
                    k((char) android.text.TextUtils.getTrimmedLength(str2), android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 166, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 5, objArr8);
                    b = com.facetec.sdk.nh.b(str, i5, c3, (java.lang.String) objArr8[0]);
                    char charAt = b != c3 ? str.charAt(b) : (char) 65535;
                    if (charAt == 65535 || charAt == c6 || charAt == '/' || charAt == '\\' || charAt == c5) {
                        break;
                    }
                    if (charAt == '@') {
                        if (i6 == 0) {
                            int c8 = com.facetec.sdk.nh.c(str, i5, b, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
                            java.lang.Object[] objArr9 = new java.lang.Object[i2];
                            k((char) android.view.View.combineMeasuredStates(0, 0), (android.view.ViewConfiguration.getTapTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 21 - (android.os.SystemClock.elapsedRealtime() > j2 ? 1 : (android.os.SystemClock.elapsedRealtime() == j2 ? 0 : -1)), objArr9);
                            c = 2;
                            java.lang.String e = com.facetec.sdk.mv.e(str, i5, c8, (java.lang.String) objArr9[0], true, false, false, true, null);
                            if (i7 != 0) {
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                sb2.append(this.c);
                                java.lang.Object[] objArr10 = new java.lang.Object[i2];
                                k((char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 19606), 189 - android.view.MotionEvent.axisFromString(str2), 2 - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr10);
                                sb2.append((java.lang.String) objArr10[0]);
                                sb2.append(e);
                                e = sb2.toString();
                            }
                            this.c = e;
                            if (c8 != b) {
                                n = (l + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                                java.lang.Object[] objArr11 = new java.lang.Object[i2];
                                k((char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), (android.view.ViewConfiguration.getTapTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 20, objArr11);
                                i3 = b;
                                this.b = com.facetec.sdk.mv.e(str, c8 + 1, b, (java.lang.String) objArr11[0], true, false, false, true, null);
                                i4 = i2;
                            } else {
                                i3 = b;
                                i4 = i6;
                            }
                            i6 = i4;
                            i7 = i2;
                        } else {
                            c = c7;
                            i3 = b;
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                            sb3.append(this.b);
                            java.lang.Object[] objArr12 = new java.lang.Object[i2];
                            k((char) (19605 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), 189 - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 2 - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr12);
                            sb3.append((java.lang.String) objArr12[0]);
                            java.lang.Object[] objArr13 = new java.lang.Object[i2];
                            k((char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 20 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr13);
                            sb3.append(com.facetec.sdk.mv.e(str, i5, i3, (java.lang.String) objArr13[0], true, false, false, true, null));
                            this.b = sb3.toString();
                            n = (l + 81) % 128;
                        }
                        i5 = i3 + 1;
                        c7 = c;
                        c6 = '#';
                        c5 = '?';
                        j2 = 0;
                    }
                }
                int d2 = d(str, i5, b);
                int i8 = d2 + 1;
                if (i8 < b) {
                    int i9 = l + 83;
                    n = i9 % 128;
                    if (i9 % 2 != 0) {
                        this.f3664a = (java.lang.String) e(com.facetec.sdk.ou.d(), com.facetec.sdk.ou.d(), -461853234, new java.lang.Object[]{str, java.lang.Integer.valueOf(i5), java.lang.Integer.valueOf(d2)}, com.facetec.sdk.ou.d(), com.facetec.sdk.ou.d(), 461853234);
                        int i10 = i(str, d2, b);
                        this.d = i10;
                    } else {
                        this.f3664a = (java.lang.String) e(com.facetec.sdk.ou.d(), com.facetec.sdk.ou.d(), -461853234, new java.lang.Object[]{str, java.lang.Integer.valueOf(i5), java.lang.Integer.valueOf(d2)}, com.facetec.sdk.ou.d(), com.facetec.sdk.ou.d(), 461853234);
                        int i11 = i(str, i8, b);
                        this.d = i11;
                    }
                } else {
                    this.f3664a = (java.lang.String) e(com.facetec.sdk.ou.d(), com.facetec.sdk.ou.d(), -461853234, new java.lang.Object[]{str, java.lang.Integer.valueOf(i5), java.lang.Integer.valueOf(d2)}, com.facetec.sdk.ou.d(), com.facetec.sdk.ou.d(), 461853234);
                    this.d = com.facetec.sdk.mv.e(this.e);
                }
                if (this.f3664a == null) {
                    java.lang.Object[] objArr14 = new java.lang.Object[i2];
                    k((char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, 18 - android.view.MotionEvent.axisFromString(str2), objArr14);
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder((java.lang.String) objArr14[0]);
                    sb4.append(str.substring(i5, d2));
                    sb4.append('\"');
                    throw new java.lang.IllegalArgumentException(sb4.toString());
                }
                d = b;
                j = 0;
            } else {
                this.c = mvVar.e();
                this.b = mvVar.b();
                this.f3664a = mvVar.f3663a;
                this.d = mvVar.b;
                this.f.clear();
                this.f.addAll(mvVar.i());
                if (d == c3 || str.charAt(d) == '#') {
                    d(mvVar.j());
                }
                j = 0;
            }
            java.lang.Object[] objArr15 = new java.lang.Object[i2];
            k((char) (android.widget.ExpandableListView.getPackedPositionChild(j) + i2), android.graphics.Color.blue(0) + 231, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 2, objArr15);
            int b3 = com.facetec.sdk.nh.b(str, d, c3, (java.lang.String) objArr15[0]);
            a(str, d, b3);
            if (b3 >= c3 || str.charAt(b3) != '?') {
                c2 = '#';
            } else {
                l = (n + 73) % 128;
                c2 = '#';
                int c9 = com.facetec.sdk.nh.c(str, b3, c3, '#');
                java.lang.Object[] objArr16 = new java.lang.Object[i2];
                k((char) android.widget.ExpandableListView.getPackedPositionGroup(0L), 1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 7 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr16);
                this.g = com.facetec.sdk.mv.d(com.facetec.sdk.mv.e(str, b3 + 1, c9, (java.lang.String) objArr16[0], true, false, true, true, null));
                n = (l + 103) % 128;
                b3 = c9;
            }
            if (b3 < c3) {
                int i12 = l + 119;
                n = i12 % 128;
                if (i12 % 2 == 0 ? str.charAt(b3) == c2 : str.charAt(b3) == i2) {
                    this.j = com.facetec.sdk.mv.e(str, b3 + 1, c3, "", true, false, false, false, null);
                }
            }
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void a(java.lang.String str, int i2, int i3) {
            int i4 = i2;
            if (i4 == i3) {
                return;
            }
            char charAt = str.charAt(i2);
            if (charAt != '/') {
                l = (n + 85) % 128;
                if (charAt != '\\') {
                    java.util.List<java.lang.String> list = this.f;
                    list.set(list.size() - 1, "");
                    while (i4 < i3) {
                        n = (l + 1) % 128;
                        boolean z = false;
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        k((char) android.view.View.MeasureSpec.getSize(0), 232 - android.os.Process.getGidForName(""), 2 - android.text.TextUtils.getTrimmedLength(""), objArr);
                        int b = com.facetec.sdk.nh.b(str, i4, i3, (java.lang.String) objArr[0]);
                        if (b < i3) {
                            int i5 = n + 1;
                            l = i5 % 128;
                            if (i5 % 2 != 0) {
                                z = true;
                            }
                        }
                        e(com.facetec.sdk.ou.d(), com.facetec.sdk.ou.d(), -2027364431, new java.lang.Object[]{this, str, java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(b), java.lang.Boolean.valueOf(z)}, com.facetec.sdk.ou.d(), com.facetec.sdk.ou.d(), 2027364433);
                        if (z) {
                            b++;
                        }
                        i4 = b;
                    }
                }
            }
            this.f.clear();
            this.f.add("");
            i4++;
            while (i4 < i3) {
            }
        }

        private static /* synthetic */ java.lang.Object e(java.lang.Object[] objArr) {
            com.facetec.sdk.mv.d dVar = (com.facetec.sdk.mv.d) objArr[0];
            java.lang.String str = (java.lang.String) objArr[1];
            int intValue = ((java.lang.Number) objArr[2]).intValue();
            int intValue2 = ((java.lang.Number) objArr[3]).intValue();
            boolean booleanValue = ((java.lang.Boolean) objArr[4]).booleanValue();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            k((char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10325), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, android.graphics.Color.blue(0) + 13, objArr2);
            java.lang.String e = com.facetec.sdk.mv.e(str, intValue, intValue2, (java.lang.String) objArr2[0], true, false, false, true, null);
            if (e(e)) {
                return null;
            }
            if (!c(e)) {
                java.util.List<java.lang.String> list = dVar.f;
                if (list.get(list.size() - 1).isEmpty()) {
                    java.util.List<java.lang.String> list2 = dVar.f;
                    list2.set(list2.size() - 1, e);
                } else {
                    dVar.f.add(e);
                }
                if (booleanValue) {
                    int i2 = n + 13;
                    l = i2 % 128;
                    if (i2 % 2 != 0) {
                        dVar.f.add("");
                    } else {
                        dVar.f.add("");
                        throw null;
                    }
                }
                return null;
            }
            int i3 = l + 3;
            n = i3 % 128;
            if (i3 % 2 == 0) {
                int d = com.facetec.sdk.ou.d();
                e(com.facetec.sdk.ou.d(), d, 1240308393, new java.lang.Object[]{dVar}, com.facetec.sdk.ou.d(), com.facetec.sdk.ou.d(), -1240308392);
                return null;
            }
            int d2 = com.facetec.sdk.ou.d();
            e(com.facetec.sdk.ou.d(), d2, 1240308393, new java.lang.Object[]{dVar}, com.facetec.sdk.ou.d(), com.facetec.sdk.ou.d(), -1240308392);
            throw null;
        }

        private static boolean e(java.lang.String str) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            k((char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1834), android.view.Gravity.getAbsoluteGravity(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, (android.os.Process.myTid() >> 22) + 1, objArr);
            if (!str.equals((java.lang.String) objArr[0])) {
                n = (l + 95) % 128;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                k((char) android.view.View.resolveSize(0, 0), 250 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 3 - android.view.View.resolveSize(0, 0), objArr2);
                if (!str.equalsIgnoreCase((java.lang.String) objArr2[0])) {
                    l = (n + 77) % 128;
                    return false;
                }
            }
            int i2 = n + 89;
            l = i2 % 128;
            if (i2 % 2 != 0) {
                return true;
            }
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x00ab, code lost:
        
            if (r10.equalsIgnoreCase((java.lang.String) r6[0]) != false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x00d6, code lost:
        
            com.facetec.sdk.mv.d.n = (com.facetec.sdk.mv.d.l + 33) % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x00de, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x00d3, code lost:
        
            if (r10.equalsIgnoreCase((java.lang.String) r6[0]) != false) goto L18;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static boolean c(java.lang.String str) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            k((char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, android.text.TextUtils.indexOf("", "", 0, 0) + 2, objArr);
            if (!str.equals((java.lang.String) objArr[0])) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                k((char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), android.text.TextUtils.getOffsetAfter("", 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, android.widget.ExpandableListView.getPackedPositionChild(0L) + 5, objArr2);
                if (!str.equalsIgnoreCase((java.lang.String) objArr2[0])) {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    k((char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 258 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 5, objArr3);
                    if (!str.equalsIgnoreCase((java.lang.String) objArr3[0])) {
                        int i2 = l + 99;
                        n = i2 % 128;
                        if (i2 % 2 != 0) {
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            k((char) (51055 >> (android.view.ViewConfiguration.getPressedStateDuration() * 7)), 29215 % (android.graphics.PointF.length(0.0f, 1.0f) > 1.0f ? 1 : (android.graphics.PointF.length(0.0f, 1.0f) == 1.0f ? 0 : -1)), (android.view.ViewConfiguration.getTouchSlop() << 26) * 55, objArr4);
                        } else {
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            k((char) (51055 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, 6 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr5);
                        }
                    }
                }
            }
            return true;
        }

        private static int c(java.lang.String str, int i2, int i3) {
            n = (l + 61) % 128;
            if (i3 - i2 < 2) {
                return -1;
            }
            char charAt = str.charAt(i2);
            if (charAt < 'a' || charAt > 'z') {
                if (charAt >= 'A') {
                    int i4 = l + 87;
                    n = i4 % 128;
                    if (i4 % 2 == 0) {
                    }
                }
                return -1;
            }
            while (true) {
                i2++;
                if (i2 >= i3) {
                    break;
                }
                char charAt2 = str.charAt(i2);
                if (charAt2 < 'a' || charAt2 > 'z') {
                    if (charAt2 < 'A' || charAt2 > 'Z') {
                        if (charAt2 < '0' || charAt2 > '9') {
                            if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                if (charAt2 == ':') {
                                    int i5 = n + 65;
                                    l = i5 % 128;
                                    if (i5 % 2 != 0) {
                                        return i2;
                                    }
                                    java.lang.Object obj = null;
                                    obj.hashCode();
                                    throw null;
                                }
                                l = (n + 17) % 128;
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private static int b(java.lang.String str, int i2, int i3) {
            int i4 = 0;
            while (i2 < i3) {
                char charAt = str.charAt(i2);
                if (charAt != '\\') {
                    l = (n + 55) % 128;
                    if (charAt != '/') {
                        return i4;
                    }
                }
                i4++;
                i2++;
                l = (n + 5) % 128;
            }
            return i4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        
            com.facetec.sdk.mv.d.l = (com.facetec.sdk.mv.d.n + 29) % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static int d(java.lang.String str, int i2, int i3) {
            while (i2 < i3) {
                int i4 = l + 61;
                n = i4 % 128;
                if (i4 % 2 == 0) {
                    char charAt = str.charAt(i2);
                    if (charAt == ':') {
                        return i2;
                    }
                    if (charAt == '[') {
                        while (true) {
                            i2++;
                            if (i2 < i3) {
                                int i5 = l + 87;
                                n = i5 % 128;
                                if (i5 % 2 != 0) {
                                    if (str.charAt(i2) == 16) {
                                        break;
                                    }
                                } else if (str.charAt(i2) == ']') {
                                    break;
                                }
                            }
                        }
                    }
                    i2++;
                } else {
                    str.charAt(i2);
                    throw null;
                }
            }
            return i3;
        }

        private static int i(java.lang.String str, int i2, int i3) {
            try {
                int parseInt = java.lang.Integer.parseInt(com.facetec.sdk.mv.e(str, i2, i3, "", false, false, false, true, null));
                java.lang.Object obj = null;
                if (parseInt > 0) {
                    int i4 = l + 73;
                    int i5 = i4 % 128;
                    n = i5;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                    if (parseInt <= 65535) {
                        int i6 = i5 + 101;
                        l = i6 % 128;
                        if (i6 % 2 != 0) {
                            return parseInt;
                        }
                        obj.hashCode();
                        throw null;
                    }
                }
                int i7 = l + 101;
                n = i7 % 128;
                if (i7 % 2 == 0) {
                    return -1;
                }
                throw null;
            } catch (java.lang.NumberFormatException unused) {
                return -1;
            }
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            n = 0;
            l = 1;
            char[] cArr = new char[2424];
            java.nio.ByteBuffer.wrap("l:LÖ-á\u000eìï\u009cÈ\u009fÔcô\u009d\u0095¤¶¿WÅpÓ\u0011¤2¯Ó]ün\u009d2¾__TxjlrL\u009b-µ\u000e¤ï\u0082È\u0081©³\u008a¸k\u0004D1%:\u0006L&±\u0006Jgxv\u0019V÷lrL\u0080-²\u000e ïÑÈ\u0086lrL\u0080-²\u000e ïÑ>k\u001e\u0099\u007f«\\¹½\u0081ðïÐ\u001d±/\u0092=ÑEñ\u0096\u0090¬³¯RÛuÒ\u0014ñ7æÖPù\u000b\u0098\u001e»vZ\b}e\u001cg<\u009aß\u0085þ£\u0081Ù \u008aC¿bî\u0005\u0000$\u0016Ç æ\u0019\u0089\f¨uKzkÖ\nÃ-ºÌ´ïÚ\u008eìQùp_\u0013F26Õ7ôD\u0097>¶{V\u009by\u009b\u0018ö;ãö\u00ads|S¯2\u0095\u0011\u0096ðâ×ë¶È\u0095ßti[2:'\u0019Oø1ß\\¾^\u009e£}¼\\\u009a#à\u0002³á\u0086À×§9\u0086/e\u0019D +5\nLéCÉï¨ú\u008f\u0083n\u008dMã,ÕóÀÒf±\u007f\u0090\u000fw\u000eV}5\u0007\u0014[ô¬Ûñº\u008c\u0099\u0092xç_ö>Ù\u001deü$Ã\u0000¢\f\u0081-`}GF'²\u0006»å\u0087lZLÛ-\u009a\u000eïï\u0081l:LÖ-á\u000eêï\u0099È\u0080©³\u008a¦k*D\u001f%\u000b\u0006~çRÀw¡c\u0081\u0094bÕC\u0088<\u0099\u001d\u0093 ª\u0000Uac\u0015\u00905YTswr\u0096\r±\u0016Ð)ó{\u0012ü=Õ\\Ù\u007fÃ\u009e\u0081¹ Ø¯ø_\u001b\u0003:7EGlSL\u009a-°\u000e±ïÎÈÕ©ê\u008a¸k?D\u0016%\u001a\u0006\u0000çZÀc¡m\u0081\u009cbÀCô<\u0084l%L×l5L¨Dod\u0083\u0005¯&»Ç©à\u0089\u0081 ¢°CCl>\r_.JÏDk\u001fl?LÆ-£l4LÚl?LÆ-£\u000eþl4LÑ-ô\u000eµ«P\u008b©êÌÉ\u009a(ÿ\u000f¶\u008e±®\u0014Ï'ì\"\r\t*_Kehp\u0089\u008a¦¦Ç»ä×\u0005Þ\"×Cûc\b\u0080\u001a¡\"ÞGÿG\u001cu=GZ\u0099{\u008c\u0098¯¹ÃÖ×\u000eÁ.dOWlR\u008dyª/Ë\u0015è\u0000\tú&ÖGËd§\u0085®¢§Ã\u009aãu\u0000~!E^\r\u007f \u009c\u0006½\u001aÚùûø\u0018Úl5L\u0090-£\u000e¦ï\u008dÈÛ©á\u008aôk\u000eD\"%?\u0006SçZÀS¡m\u0081\u0091b\u0094C·l5L\u0087-¿\u000e£ï\u008dÈÑ©á\u008aük\u001fD(%3\u0006\u000fçUÀc¡r\u0081\u008cb\u009cC½<Õ\u001dØþÝßþ¸\u000f\u0099\fz>[A4D\u0015y\u009dÅ½aÜBÿC\u001e}9(X\u0019{F\u009aêµÆÔÉ÷ l5L\u0091-²\u000e³ï\u008dÈÏ©ç\u008aõkDD4%$\u0006OçBl5L\u0087-¢\u000e³ïÃÈÎ©ê\u008a·k8D\u0002%\u001b\u0006OçDÀi¡Z\u0081\u0089b\u008eCµl5L\u0090-§\u000e¤ïÃÈ\u0093© \u008aûk\u001aD1%?\u0006NçTÀclhL\u009b-è\u000e²ïÍÈÓ©ú\u008a¶k\u0018D!%2\u0006Rç]Àe¡z\u0081·b\u0094C±<Ò\u001dïþæßò¸\u001d\u0099IlhL\u009b-è\u000e²ïÍÈÓ©ú\u008a¶k\u0018D!%2\u0006Rç]Àe¡z\u0081·b\u0094C±<Ò\u001dïþæßò¸\u001d\u0099J{\u009c[.:\u0016\u0019\nø\u007fßp¾J\u009d\u001e|¯S\u00842\u009d\u0011¦ð÷×Ì¶Õ\u0096/u1TS+|\nv\u0003«#NBram\u0080\u001e§\u0017y¢YQ\u0087á§SÆkåw\u0004\u0002#\rB7ac\u0080Ü¯ùÎìíÛ\f\u0088+½J§jI\u0089x¨M×_ö\n\u001534%SÏr\u0081\u0091ý°\u009fß\u008cþ \u001d´=W\\F\u0095:µ\u0088Ô°÷¬\u0016Ù1ÖPìs¸\u0092\u0007½\"Ü7ÿ\u0000\u001eS9fX|x\u0092\u009b£º\u0096Å\u0084äÏ\u0007ÿ&üA\u0011l5L\u0087-¿\u000e£ïÖÈÙ©ã\u008a·k\u0006D-%4\u0006\u000fç^Àe¡|\u0081\u0086b\u009fC¹<Ó\u001dæþÏßì¸\u001c\u0099\u0017z:[\n4E\u0015ol5L\u0090-£\u000e¦ï\u008dÈÒ©ë\u008aõk\u001fD#%#\u0006EçAÀxlhL\u009b-è\u000e²ï×ÈÕ©â\u008aükDD,%9\u0006SçFltL\u0091-§\u000e£ïÇÈ\u0092©à\u008aýk\u001eä&Ä\u0097¥§\u0086¬gÒ@\u0080!û\u0002âã\u0015Ì2\u00ad6\u008eJoRHk)h\t\u0096ê\u009axíX\b92\u001a<ûHÜClhL\u009b-è\u000e ïÐÈÓ©ê\u008aík\tD0%x\u0006MçSÀb¡k\u0081\u008eb\u009bC·<Ò\u001dÅþðßù¸\u001c5[\u0015·t\u008eW\u008fljL\u0091-´\u000e£ïËÈÏ©ú\u008a¶k\u0019D=%%\u0006\u000eçPÀh¡0\u0081\u008cb\u009fC¶<Ó\u001d×þ¬ßû¸\u001e\u0099\rzd[B4W\u0015köwÖ³·\u0099\u0090¸q¯Rë3ôìõÍ\f®\u0018\u008f+h*IO*vljL\u0091-´\u000e£ïËÈÏ©ú\u008a¶k\u0019D=%%\u0006\u000eçPÀh¡0\u0081\u008cb\u009fC¶<Ó\u001d×þ¬ßû¸\u001e\u0099\rzd[B4W\u0015köwÖ³·\u0099\u0090¸q¯Rë3ðìõÍ\f®\u0018\u008f!h*ljL\u0091-´\u000e£ïËÈÏ©ú\u008a¶k\u0019D=%%\u0006\u000eçPÀh¡0\u0081\u008cb\u009fC¶<Ó\u001d×þ¬ßî¸\u0001\u0099Vz)[U4_·Ï\u00974ö\u0011Õ\u00064n\u0013jr_Q\u0013°¼\u009f\u0098þ\u0080Ý«<õ\u001bÍz\u0095Z)¹:\u0098\u0013çvÆr%\t\u0004Kc¤Bó¡\u0083\u0080àïðÏÿï\u0004\u008e!\u00ad6L^kZ\no)#È\u008cç¨\u0086°¥\u009bDÅcý\u0002¥\"\u0019Á\nà#\u009fF¾B]9|{\u001b\u0094:ÃÙ²øÒ\u0097À\u000b\u001a+áJÄiÓ\u0088»¯¿Î\u008aíÆ\fi#MBUa~\u0080 §\u0018Æ@æü\u0005ï$Æ[£z§\u0099Ü¸\u009eßqþ&\u001dW<:S%v\u0086V|7C\u0014Bõ;Ò0l5L\u0084-´\u000e¿ïÁÈ\u0093©ã\u008a÷k\u000eD1%:\u0006EçAllL\u0096-©\u000e¨ïÅÈÉ©ë\u008aëk\u001e\u0019¬9\u001eX&{:\u009aO½@Üzÿ.\u001e\u00951¯P®sÔ\u0092ÎµâÔèô\u0003\u0017\b6bIHh@\u008buªaÍ\u0098ì\u0096\u000f .\u0090AÜ`à\u0083ø£\u0001Â\u0002å<\u0004\u001c'^Fz\u0099{¸\u008dÛ\u0080ú¥\u001dï<Ù_ü~ýl5L\u0082-£\u000e¾ïÆÈÓ©ü\u008a·k\u0006D-%4\u0006\u0016ç\u0006À#¡v\u0081\u009fbÕCµ<Ó\u001dÔþëßó¸@\u0099\bz8[M4[\u0015aö`Ö\u0095·Ð\u0090¿q³RÚ3âìÿÍ\u0015®\u000f\u008f`h+IEl5L\u0082-£\u000e¾ïÆÈÓ©ü\u008a·k\u0006D-%4\u0006\u0016ç\u0006À#¡v\u0081\u009fbÕC¼<Ñ\u001dÓþíßñ¸\u001e\u0099\u0017z9[A4D\u0015.öeÖ\u0085·\u0090\u0090¬qµRÃ3õì¾Í\u0011®\u0013\u0081Î¡|ÀDãX\u0002-%\"D\u0018gL\u0086ý©ÖÈÏëí\ný-ØL\u0086l\u007f\u008fn®ZÑ9ð\u0014\u0013\u00182\u000eUñtï\u0097î¶¶Ù£ø\u008f\u001b\u008c;eZc}R\u009cB¿*ÞP\u0001\b éC÷b\u009b\u0085Ð¤¾µÜ\u0095xô[×Z6d\u0011<p\tS\u0018²÷\u009d\u0082üÖß§>²\u0019\u0091xÙXb»\u007f\u009aRå:Ä='\u0018\u0006\u0010aõ@ç£Ê\u0082®íºÌÇ/\u0089\u000ffl]L\u0091-¨\u000e©ïÏÈÓ©ú\u008añk\u0005D*äEÄ°¥\u0087\u0086\u0094gç@á!ÊlyL\u009c-´\u000e¿ïÏÈÕ©û\u008aõeJE¹$Ê\u0007\u0082æòÁñ È\u0083Ïb+M\u0012,Z\u000ffîuÉX¨U\u0088©k½llL\u0096-©\u000e¨ï\u009aÈ\u008a©þ]\u001e}ò\u001cË?ÖÞ³ù¶\u0098\u008eTPt¼\u0015\u00856\u0098×ýðø\u0091À²êS?|Q\u001dM\\\u000f|ã\u001dÚ>Çß¢ø§\u0099\u009fºµ[`t\u000e\u0015\u00126\r×vðJNøn\u000b\u000fx,0Í@êC\u008bz¨}I\u0099f \u0007è$ÝÅÍâø\u0083ë£\u0014liL\u0090-\u00ad\u0011Æ1 P\ns\u0005\u0092zµqÔX÷Sì&Ìù\u00adË\u008e\u008do\u008dH´)\u009d\n\u0091ë~ÄT¥N\u0086}g)@\u001e!\u0011\u0001µâÄÃÁ¼©\u009d¢~\u0092_\u0084\u0010\u00840EQ}r}\u0093\u0012´\nÕ5ög\u0017æ8ßYÂzß\u009b\u008f¼¦Ý¨ý[\u001eQ?+@\u001fa\u0000\u0082/£cÄÉå\u009f\u0006£l[L\u009a-¢\u000e¢ïÍÈÕ©ê\u008a¸k9D\u0000%\u001d\u0006\u0000çPÀy¡w\u0081\u0084b\u008eCô<À\u001dßþðß¼¸\u0016\u0099@z|[{4\u0000\u00154ÿ\u007fß\u008c¾ÿ\u009d¯|Ô[Ù:ý\u0019øø\u001c×!¶$ÀUà³\u0081\u0082¢\u009cCìdý\u0005Õ&Ø¶\u0098\u0096b÷]Ô\\5n\u0012~»ð\u009b\rú0Ù+8R\u001fQTÒt!\u0015R6\u001a×jði\u0091P²WS³|\u008a\u001dÂ>øßúø×\u0099Ê¹6ÜMü¾\u009dÍ¾\u009e_âxë\u0019Å:ØÛ#ôO\u0095\u0002¶`Wzp\\c\u0099lhL\u009b-è\u000e£ïÇÈß©û\u008aêk\u000fA¸lhL\u009b-è\u000e²ï×ÈÕ©â\u008aükDD4%$\u0006OçVÀy¡}\u0081\u009cl|L\u0081-ª\u000e¼ïýÈÄ©¶\u008a®Ø\u009føl\u0099\u001fºE[ |\"\u001d\u0015>\u000bß³ðÕ\u0091È²¹S¢t\u009e\u0015\u009b5oÖ\u007f÷J\u0088?©3\u0000å \tA0b-\u0083H¤MÅuæ/\u0007\u0081(¸I¥j\u0097\u008bÍ¬ñÍèí\u0015\u000e\u0010/%P]l}L\u0091-¨\u000eµïÐÈÕ©í\u008aÇk\u0012D|%`\u0006\u000fçAÀh¡u\u0081·b\u0082Cì<\u0090\u001d\u009fþåßù¸\u0000\u0099\u001dz8[M4U\u0015_öjÖÔ·Èl}L\u0091-¨\u000eµïÐÈÕ©í\u008a·k\rD+%9\u0006Gç^Ài¡A\u0081\u009bb\u009eC¿<\u0089\u001d×þçßò¸\u000b\u0099\nz#[Gl}L\u0091-¨\u000eµïÐÈÕ©í\u008a·k\u001cD&%9\u0006Xç\nÀ:¡n\u0081Çb\u008cC¶<É\u001dÈþºßª¸\u001ew(WÎ6ü\u0015âô\u009bÓ\u008c²ô\u0091¾p[_z>\\\u001d\u0012ü\u0017Û1º$\u009aÓyÊXÞ'\u008b\u0006ÝåáÄæ£\\\u0082Haq@\u0014/\u0011\u000e<í$Íæ¬Ó\u008b¥j¹\u0000É :AIb\u0013\u0083l¤rÅ[æU\u0007¤(\u0084I\u0093jä\u008bálhL\u009b-è\u000e²ïÍÈÓ©ú\u008añk\u0007D%%1\u0006Eç\u001cÀn¡k\u0081\u0081b\u0096C°<\u0088\u001dÖþëßò¸\t\u0099\u001dz8[T4D\u0015iö|Ö\u0098l[L\u009a-¢\u000e¢ïÍÈÕ©ê\u008aµk\u0012D|%`lhL\u009b-è\u000e²ï×ÈÕ©â\u008aükDD %?\u0006SçBÀ`¡\u007f\u0081\u0091bÔC½<ÂÃ\u000fãð\u0082Ô¡Å@îlsL\u009a-¯\u000e¤ï\u008cÈÏ©ø\u008aûkDD5%3\u0006MçGÀ!¡n\u0081\u009ab\u0095C¤<Õ\u001cÂ<8]\u0002~\f\u009f%¸}ÙPú\u001f\u001b®4\u008cU\u0096vç\u0097ð°ÀÑÎñ2[2{È\u001aò9üØÕÿ\u0096\u009e±½ï\\Us|\u0012d1\u001cÐ4÷6\u0096&¶ÜUÆtÿ\u000b\u009elkL\u0091-«\u000e¥ï\u008cÈÏ©è\u008a¶k\u0006D'%2\u0006\u007fçVÀi¡p\u0081\u009bb\u0093C <ßlhL\u009b-è\u000e»ïÇÈÎ©à\u008aýk\u0006Dj%7\u0006NçVÀ~¡q\u0081\u0081b\u009eCú<×\u001dÕþïßé¸\n\u001d»=H\\;\u007fa\u009e\u001e¹\u0000Ø)ûe\u001aÈ5òTèw\u0086\u0096Ï±¾Ð»ð_\u0013v2iM\u0014l\u000e\u008f4lhL\u009b-è\u000e¿ïÆÈÑ© \u008aúk\u001fD-%:\u0006Dç\u001cÀj¡w\u0081\u0086b\u009dC±<Ô\u001dÀþðßõ¸\u0000\u0099\f³\u0006\u0093õò\u0086ÑÎ0¾\u0017½v\u0084U\u0083´g\u009b^ú\u0016Ù,8)\u001f\u000b~\u001c^â½º\u009cÜã¡Â°!\u008b\u0000\u0097grFf¥V\u0084#ë6Ê\u001alhL\u009b-è\u000e£ïÛÈÏ©ú\u008aýk\u0007Dj%4\u0006Uç[À`¡z\u0081Æb\u009cC½<È\u001d×þçßî¸\u001e\u0099\nz#[J4BlhL\u009b-è\u000e£ïÛÈÏ©ú\u008aýk\u0007D\u001b%3\u0006XçFÀ\"¡|\u0081\u009db\u0093C¸<Â\u001d\u009eþäßõ¸\u0000\u0099\u001fz/[V4F\u0015rö{Ö\u0082·\u008alhL\u009b-è\u000e¦ïÇÈÒ©ê\u008a÷k\u0018Dj%4\u0006Uç[À`¡z\u0081Æb\u009cC½<È\u001d×þçßî¸\u001e\u0099\nz#[J4BeïE\u001c$o\u0007!æ@ÁU m\u0083pb\u009fM\u009c,µ\u000fËîÞÉæ¨·\u0088\rk\bJ:5M\u0014S÷+Ö}±\u0080\u0090\u0091sªRÆ=Ã\u001c÷ÿçß\u0002¾\u0017\u0099;Ü¿l6LÔYMl3\u001ez>ß_ì|é\u009dÂº\u0082Û¤øº\u0019P6TWit\u0006\u0095\r²&l5L\u0090-£\u000e¦ï\u008dÈÏ©á\u008aûk\u0001D!%\"\u0006\u000fçPÀm¡m\u0081\u008db\u0098Cµ<È\u001dÔþÝßû¸\u000b\u0099\u0016z3[@S\u0083s&\u0012\u00151\u0010Ð;÷y\u0096WµMT·{\u0097\u001a\u00949¹Øãÿß\u009eÆ¾'](\u0000Ò wADbA\u0083j¤(Å\u0006æ\u001c\u0007æ(ÆIÅjè\u008b¤¬\u008eÍ\u0094íz\u000ey$\u0086\u00044e\fF\u0010§>\u0080~áXÂF#¬\f¨m\u0091Ná¯à\u0088ÜéÈl5L\u0087-¿\u000e£ïÖÈÙ©ã\u008a·k\u0006D-%4\u0006\u000fç^Àe¡|\u0081\u008bb¥C¹<Ç\u001dÜþîßó¸\r\u0099'z.[A4T\u0015uöuÖ³·\u008f\u0090\u00adq·RÁ3¨ìãÍ\rl5L\u0090-£\u000e¦ï\u008dÈÞ©ý\u008aìk5D#%&\u0006S\r\u0097-2L\u0001o\u0004\u008e/©|È_ëN\n\u0097%\u0092D\u009dgï\u0086õl5L\u0090-£\u000e¦ï\u008dÈÏ©á\u008aûk\u0001D!%\"\u0006\u000fçPÀ\u007f¡j\u0081\u008eb\u0095C¸<Â\u001dÕþðßøl5L\u0087-¿\u000e£ïÖÈÙ©ã\u008a·k\u0006D-%4\u0006\u000fç^Àe¡|\u0081\u008ab\u0089C <À\u001dßþîßø¸\u000b\u0099\nz\u0015[N4X\u0015iö<Ö\u009f·\u0091ñgÑÂ°ñ\u0093ôrßU\u008c4¯\u0017¾öYÙu¸g\u009b\u0017l5L\u0090-£\u000e¦ï\u008dÈÞ©ý\u008aìk\rD=%$\u0006OÍ¡í\u0004\u008c7¯2N\u0019iJ\bi+xÊ\u0093åµ\u0084¥§Úl5L\u0090-£\u000e¦ï\u008dÈÞ©ý\u008aìk\u0005D6%?\u0006Ed\u0089D,%\u001f\u0006\u001aç1Àb¡A\u0082Pc L\u0095-\u0099\u000eû\u0083\u008d£(Â\u001bá\u001e\u00005'fFEeT\u0084¢«\u009bÊ\u008féñ\bú/×ã\u000bÃ®¢\u009d\u0081\u0098`³Gà&Ã\u0005Òä\u000bË\u0013ª\u0005\u0089{\u009d\u0007½¢Ü\u0095ÿ\u0096\u001eñ9¡XØ{Å\u009a/µ\u0018Ô\b÷}\u0016a1ZP_põ\u0093æ²\u009eÍöì\u00ad\u000fÒ.ÝI(h!l5L\u0099-¨\u000e¤ï\u008dÈË©ç\u008aök\u000eD+%!\u0006Sç\u001dÀN¡m\u0081\u009cb©C¼<Ç\u001dÂþçßø¸(\u0099\u0017z&[@4S\u0015rºr\u009aÃûóØø9\u0086\u001eÔ\u007f \\°½]\u0092lócÐ\u00131\u0006¯m\u008fÕîçÍ·,ß\u008c/¬\u009eÍ®î¥\u000fÛ(\u0089Içjç\u008b\u001c¤8ÅcæW\u0007I fAwÅ}å\u0086\u0084§§¼FÎaÓ\u0000í#¶Â\rí+\u008c:¯DNTie\bm(\u0080ËÔê§\u0095ÉlvL\u009d-¤\u000e\u0097ïîÈù©Ý\u008aÇk\bD7%\"\u0006\u000eçAÀcã\u0018Ã¼¢\u009f\u0081\u009e` Gü&Æ\u0005Ñä.Ë\bª$\u0089nhpOE.V\u000e¦í¤Ì×³ó\u0092ðqÃN:nÚ\u000fñ,÷Í\u0093ê\u008a\u008b\u00ad¨¹ICfuXExá\u0019Â:ÃÛýü¡\u009d\u0091¾\u009d_tp@\u0011U-3\r\u0096l¡O¢®Å\u0089\u0095èìËñ*\u001b\u0005,d<GI¦U\u0081nàkÀÁ#Ò\u0002¶}Ð\\\u0099¿å\u009eêù\u0018Ø\r;b\u001aZu]Tjq¼Q\r0=\u00136òHÕ\u001a´d\u0097av\u0096Y¤8±\u001bÏúÔQ\u009dq[\u0010j3tÒ\u0004õ\u0015\u0094=·0LolÊ\rý.þÏ\u0099èÉ\u0089¹ª«KCd}\u0005#&\nÇ\u001aà9\u0081\"¡ÛBÌcë\u001c\u008f=ÅÞ»ÿ³\u0098F¹\rZ {Q\u0014\u000f55Ö%ö\u0098\u0097É°ûQãr\u009c\u0013³Ì¼íQ\u008eT¯`H,i\u001d\n;+!ËÏäÁ\u0085û¦á".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2424);
            h = cArr;
            i = 1495042293025492212L;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(30:166|(1:168)(1:353)|169|170|(1:172)(1:352)|173|174|(1:176)(1:351)|177|178|(12:(6:180|181|(1:183)(1:349)|184|185|(24:187|188|189|(1:191)|192|(1:194)(4:299|(1:301)|302|303)|195|(1:298)(5:199|(3:202|(6:204|205|(1:207)|208|209|(3:285|286|221)(4:211|212|(5:214|(1:216)|217|218|(2:220|221)(1:281))(2:283|284)|282))(9:287|288|(1:290)|291|292|(3:294|295|221)|212|(0)(0)|282)|200)|296|297|222)|223|(2:224|(6:226|(1:228)(1:278)|229|(6:231|232|(1:234)(1:275)|235|236|(2:239|240)(1:238))|276|277)(2:279|280))|241|242|243|245|246|(1:248)|249|250|(1:252)(1:263)|253|254|(1:256)|257|258))(1:350)|245|246|(0)|249|250|(0)(0)|253|254|(0)|257|258)|304|(11:307|308|(1:310)(1:342)|311|312|(2:314|(2:316|(7:318|(5:320|(1:322)(1:336)|323|324|(4:326|327|328|329))(1:337)|330|(1:332)(1:335)|333|334|329))(3:338|339|340))|341|327|328|329|305)|343|344|(1:346)(1:348)|347|188|189|(0)|192|(0)(0)|195|(1:197)|298|223|(3:224|(0)(0)|277)|241|242|243) */
        /* JADX WARN: Code restructure failed: missing block: B:274:0x38d9, code lost:
        
            r3 = r39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:433:0x067f, code lost:
        
            if (r1.length() != 0) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:434:0x0722, code lost:
        
            r1 = (~(r67 & com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE)) & (r67 | com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE);
         */
        /* JADX WARN: Code restructure failed: missing block: B:444:0x0720, code lost:
        
            if (r1.length() != 0) goto L66;
         */
        /* JADX WARN: Removed duplicated region for block: B:101:0x0ecb A[Catch: all -> 0x0240, TryCatch #1 {all -> 0x0240, blocks: (B:6:0x00fb, B:8:0x0108, B:9:0x0147, B:21:0x02df, B:23:0x02ec, B:24:0x0339, B:31:0x04af, B:33:0x04bc, B:34:0x04f6, B:41:0x0742, B:43:0x0748, B:44:0x078c, B:64:0x0a48, B:66:0x0a55, B:67:0x0a9e, B:76:0x0d20, B:78:0x0d2d, B:79:0x0d66, B:99:0x0ebe, B:101:0x0ecb, B:102:0x0f08, B:110:0x10ed, B:112:0x10fa, B:113:0x113e, B:136:0x1492, B:138:0x149f, B:139:0x14d9, B:150:0x164d, B:152:0x165a, B:153:0x1694, B:160:0x1772, B:162:0x1778, B:163:0x17b1, B:166:0x184f, B:168:0x1861, B:169:0x18aa, B:174:0x1984, B:176:0x1991, B:177:0x19de, B:181:0x19f1, B:183:0x1a08, B:184:0x1a53, B:189:0x29ef, B:191:0x29fc, B:192:0x2a36, B:205:0x2f14, B:207:0x2f21, B:208:0x2f62, B:232:0x35e7, B:234:0x35f4, B:235:0x364f, B:254:0x3919, B:256:0x3926, B:257:0x3965, B:214:0x3183, B:216:0x3190, B:217:0x31c9, B:288:0x302f, B:290:0x303c, B:291:0x3081, B:299:0x2a44, B:301:0x2a5c, B:302:0x2a9a, B:308:0x26d7, B:310:0x26e4, B:311:0x2730, B:320:0x2759, B:322:0x2766, B:323:0x27b1, B:400:0x0b7b, B:402:0x0b88, B:403:0x0bcd, B:425:0x060b, B:427:0x0618, B:428:0x065f, B:438:0x06b1, B:440:0x06be, B:441:0x0704), top: B:5:0x00fb }] */
        /* JADX WARN: Removed duplicated region for block: B:105:0x0f4a  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x10eb  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x11fa  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x1243 A[Catch: IOException -> 0x1262, TryCatch #5 {IOException -> 0x1262, blocks: (B:124:0x1200, B:126:0x1243, B:127:0x1249), top: B:123:0x1200 }] */
        /* JADX WARN: Removed duplicated region for block: B:129:0x1252  */
        /* JADX WARN: Removed duplicated region for block: B:132:0x13e5  */
        /* JADX WARN: Removed duplicated region for block: B:149:0x164b  */
        /* JADX WARN: Removed duplicated region for block: B:162:0x1778 A[Catch: all -> 0x0240, TryCatch #1 {all -> 0x0240, blocks: (B:6:0x00fb, B:8:0x0108, B:9:0x0147, B:21:0x02df, B:23:0x02ec, B:24:0x0339, B:31:0x04af, B:33:0x04bc, B:34:0x04f6, B:41:0x0742, B:43:0x0748, B:44:0x078c, B:64:0x0a48, B:66:0x0a55, B:67:0x0a9e, B:76:0x0d20, B:78:0x0d2d, B:79:0x0d66, B:99:0x0ebe, B:101:0x0ecb, B:102:0x0f08, B:110:0x10ed, B:112:0x10fa, B:113:0x113e, B:136:0x1492, B:138:0x149f, B:139:0x14d9, B:150:0x164d, B:152:0x165a, B:153:0x1694, B:160:0x1772, B:162:0x1778, B:163:0x17b1, B:166:0x184f, B:168:0x1861, B:169:0x18aa, B:174:0x1984, B:176:0x1991, B:177:0x19de, B:181:0x19f1, B:183:0x1a08, B:184:0x1a53, B:189:0x29ef, B:191:0x29fc, B:192:0x2a36, B:205:0x2f14, B:207:0x2f21, B:208:0x2f62, B:232:0x35e7, B:234:0x35f4, B:235:0x364f, B:254:0x3919, B:256:0x3926, B:257:0x3965, B:214:0x3183, B:216:0x3190, B:217:0x31c9, B:288:0x302f, B:290:0x303c, B:291:0x3081, B:299:0x2a44, B:301:0x2a5c, B:302:0x2a9a, B:308:0x26d7, B:310:0x26e4, B:311:0x2730, B:320:0x2759, B:322:0x2766, B:323:0x27b1, B:400:0x0b7b, B:402:0x0b88, B:403:0x0bcd, B:425:0x060b, B:427:0x0618, B:428:0x065f, B:438:0x06b1, B:440:0x06be, B:441:0x0704), top: B:5:0x00fb }] */
        /* JADX WARN: Removed duplicated region for block: B:166:0x184f A[Catch: all -> 0x0240, TRY_ENTER, TryCatch #1 {all -> 0x0240, blocks: (B:6:0x00fb, B:8:0x0108, B:9:0x0147, B:21:0x02df, B:23:0x02ec, B:24:0x0339, B:31:0x04af, B:33:0x04bc, B:34:0x04f6, B:41:0x0742, B:43:0x0748, B:44:0x078c, B:64:0x0a48, B:66:0x0a55, B:67:0x0a9e, B:76:0x0d20, B:78:0x0d2d, B:79:0x0d66, B:99:0x0ebe, B:101:0x0ecb, B:102:0x0f08, B:110:0x10ed, B:112:0x10fa, B:113:0x113e, B:136:0x1492, B:138:0x149f, B:139:0x14d9, B:150:0x164d, B:152:0x165a, B:153:0x1694, B:160:0x1772, B:162:0x1778, B:163:0x17b1, B:166:0x184f, B:168:0x1861, B:169:0x18aa, B:174:0x1984, B:176:0x1991, B:177:0x19de, B:181:0x19f1, B:183:0x1a08, B:184:0x1a53, B:189:0x29ef, B:191:0x29fc, B:192:0x2a36, B:205:0x2f14, B:207:0x2f21, B:208:0x2f62, B:232:0x35e7, B:234:0x35f4, B:235:0x364f, B:254:0x3919, B:256:0x3926, B:257:0x3965, B:214:0x3183, B:216:0x3190, B:217:0x31c9, B:288:0x302f, B:290:0x303c, B:291:0x3081, B:299:0x2a44, B:301:0x2a5c, B:302:0x2a9a, B:308:0x26d7, B:310:0x26e4, B:311:0x2730, B:320:0x2759, B:322:0x2766, B:323:0x27b1, B:400:0x0b7b, B:402:0x0b88, B:403:0x0bcd, B:425:0x060b, B:427:0x0618, B:428:0x065f, B:438:0x06b1, B:440:0x06be, B:441:0x0704), top: B:5:0x00fb }] */
        /* JADX WARN: Removed duplicated region for block: B:191:0x29fc A[Catch: all -> 0x0240, TryCatch #1 {all -> 0x0240, blocks: (B:6:0x00fb, B:8:0x0108, B:9:0x0147, B:21:0x02df, B:23:0x02ec, B:24:0x0339, B:31:0x04af, B:33:0x04bc, B:34:0x04f6, B:41:0x0742, B:43:0x0748, B:44:0x078c, B:64:0x0a48, B:66:0x0a55, B:67:0x0a9e, B:76:0x0d20, B:78:0x0d2d, B:79:0x0d66, B:99:0x0ebe, B:101:0x0ecb, B:102:0x0f08, B:110:0x10ed, B:112:0x10fa, B:113:0x113e, B:136:0x1492, B:138:0x149f, B:139:0x14d9, B:150:0x164d, B:152:0x165a, B:153:0x1694, B:160:0x1772, B:162:0x1778, B:163:0x17b1, B:166:0x184f, B:168:0x1861, B:169:0x18aa, B:174:0x1984, B:176:0x1991, B:177:0x19de, B:181:0x19f1, B:183:0x1a08, B:184:0x1a53, B:189:0x29ef, B:191:0x29fc, B:192:0x2a36, B:205:0x2f14, B:207:0x2f21, B:208:0x2f62, B:232:0x35e7, B:234:0x35f4, B:235:0x364f, B:254:0x3919, B:256:0x3926, B:257:0x3965, B:214:0x3183, B:216:0x3190, B:217:0x31c9, B:288:0x302f, B:290:0x303c, B:291:0x3081, B:299:0x2a44, B:301:0x2a5c, B:302:0x2a9a, B:308:0x26d7, B:310:0x26e4, B:311:0x2730, B:320:0x2759, B:322:0x2766, B:323:0x27b1, B:400:0x0b7b, B:402:0x0b88, B:403:0x0bcd, B:425:0x060b, B:427:0x0618, B:428:0x065f, B:438:0x06b1, B:440:0x06be, B:441:0x0704), top: B:5:0x00fb }] */
        /* JADX WARN: Removed duplicated region for block: B:194:0x2a3f  */
        /* JADX WARN: Removed duplicated region for block: B:214:0x3183 A[Catch: all -> 0x0240, TRY_ENTER, TryCatch #1 {all -> 0x0240, blocks: (B:6:0x00fb, B:8:0x0108, B:9:0x0147, B:21:0x02df, B:23:0x02ec, B:24:0x0339, B:31:0x04af, B:33:0x04bc, B:34:0x04f6, B:41:0x0742, B:43:0x0748, B:44:0x078c, B:64:0x0a48, B:66:0x0a55, B:67:0x0a9e, B:76:0x0d20, B:78:0x0d2d, B:79:0x0d66, B:99:0x0ebe, B:101:0x0ecb, B:102:0x0f08, B:110:0x10ed, B:112:0x10fa, B:113:0x113e, B:136:0x1492, B:138:0x149f, B:139:0x14d9, B:150:0x164d, B:152:0x165a, B:153:0x1694, B:160:0x1772, B:162:0x1778, B:163:0x17b1, B:166:0x184f, B:168:0x1861, B:169:0x18aa, B:174:0x1984, B:176:0x1991, B:177:0x19de, B:181:0x19f1, B:183:0x1a08, B:184:0x1a53, B:189:0x29ef, B:191:0x29fc, B:192:0x2a36, B:205:0x2f14, B:207:0x2f21, B:208:0x2f62, B:232:0x35e7, B:234:0x35f4, B:235:0x364f, B:254:0x3919, B:256:0x3926, B:257:0x3965, B:214:0x3183, B:216:0x3190, B:217:0x31c9, B:288:0x302f, B:290:0x303c, B:291:0x3081, B:299:0x2a44, B:301:0x2a5c, B:302:0x2a9a, B:308:0x26d7, B:310:0x26e4, B:311:0x2730, B:320:0x2759, B:322:0x2766, B:323:0x27b1, B:400:0x0b7b, B:402:0x0b88, B:403:0x0bcd, B:425:0x060b, B:427:0x0618, B:428:0x065f, B:438:0x06b1, B:440:0x06be, B:441:0x0704), top: B:5:0x00fb }] */
        /* JADX WARN: Removed duplicated region for block: B:226:0x35ab  */
        /* JADX WARN: Removed duplicated region for block: B:248:0x37ce A[Catch: all -> 0x38ce, TryCatch #8 {all -> 0x38ce, blocks: (B:246:0x37c1, B:248:0x37ce, B:249:0x3815), top: B:245:0x37c1 }] */
        /* JADX WARN: Removed duplicated region for block: B:252:0x38ba  */
        /* JADX WARN: Removed duplicated region for block: B:256:0x3926 A[Catch: all -> 0x0240, TryCatch #1 {all -> 0x0240, blocks: (B:6:0x00fb, B:8:0x0108, B:9:0x0147, B:21:0x02df, B:23:0x02ec, B:24:0x0339, B:31:0x04af, B:33:0x04bc, B:34:0x04f6, B:41:0x0742, B:43:0x0748, B:44:0x078c, B:64:0x0a48, B:66:0x0a55, B:67:0x0a9e, B:76:0x0d20, B:78:0x0d2d, B:79:0x0d66, B:99:0x0ebe, B:101:0x0ecb, B:102:0x0f08, B:110:0x10ed, B:112:0x10fa, B:113:0x113e, B:136:0x1492, B:138:0x149f, B:139:0x14d9, B:150:0x164d, B:152:0x165a, B:153:0x1694, B:160:0x1772, B:162:0x1778, B:163:0x17b1, B:166:0x184f, B:168:0x1861, B:169:0x18aa, B:174:0x1984, B:176:0x1991, B:177:0x19de, B:181:0x19f1, B:183:0x1a08, B:184:0x1a53, B:189:0x29ef, B:191:0x29fc, B:192:0x2a36, B:205:0x2f14, B:207:0x2f21, B:208:0x2f62, B:232:0x35e7, B:234:0x35f4, B:235:0x364f, B:254:0x3919, B:256:0x3926, B:257:0x3965, B:214:0x3183, B:216:0x3190, B:217:0x31c9, B:288:0x302f, B:290:0x303c, B:291:0x3081, B:299:0x2a44, B:301:0x2a5c, B:302:0x2a9a, B:308:0x26d7, B:310:0x26e4, B:311:0x2730, B:320:0x2759, B:322:0x2766, B:323:0x27b1, B:400:0x0b7b, B:402:0x0b88, B:403:0x0bcd, B:425:0x060b, B:427:0x0618, B:428:0x065f, B:438:0x06b1, B:440:0x06be, B:441:0x0704), top: B:5:0x00fb }] */
        /* JADX WARN: Removed duplicated region for block: B:263:0x38c2  */
        /* JADX WARN: Removed duplicated region for block: B:279:0x3750 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:283:0x32a7  */
        /* JADX WARN: Removed duplicated region for block: B:299:0x2a44 A[Catch: all -> 0x0240, TryCatch #1 {all -> 0x0240, blocks: (B:6:0x00fb, B:8:0x0108, B:9:0x0147, B:21:0x02df, B:23:0x02ec, B:24:0x0339, B:31:0x04af, B:33:0x04bc, B:34:0x04f6, B:41:0x0742, B:43:0x0748, B:44:0x078c, B:64:0x0a48, B:66:0x0a55, B:67:0x0a9e, B:76:0x0d20, B:78:0x0d2d, B:79:0x0d66, B:99:0x0ebe, B:101:0x0ecb, B:102:0x0f08, B:110:0x10ed, B:112:0x10fa, B:113:0x113e, B:136:0x1492, B:138:0x149f, B:139:0x14d9, B:150:0x164d, B:152:0x165a, B:153:0x1694, B:160:0x1772, B:162:0x1778, B:163:0x17b1, B:166:0x184f, B:168:0x1861, B:169:0x18aa, B:174:0x1984, B:176:0x1991, B:177:0x19de, B:181:0x19f1, B:183:0x1a08, B:184:0x1a53, B:189:0x29ef, B:191:0x29fc, B:192:0x2a36, B:205:0x2f14, B:207:0x2f21, B:208:0x2f62, B:232:0x35e7, B:234:0x35f4, B:235:0x364f, B:254:0x3919, B:256:0x3926, B:257:0x3965, B:214:0x3183, B:216:0x3190, B:217:0x31c9, B:288:0x302f, B:290:0x303c, B:291:0x3081, B:299:0x2a44, B:301:0x2a5c, B:302:0x2a9a, B:308:0x26d7, B:310:0x26e4, B:311:0x2730, B:320:0x2759, B:322:0x2766, B:323:0x27b1, B:400:0x0b7b, B:402:0x0b88, B:403:0x0bcd, B:425:0x060b, B:427:0x0618, B:428:0x065f, B:438:0x06b1, B:440:0x06be, B:441:0x0704), top: B:5:0x00fb }] */
        /* JADX WARN: Removed duplicated region for block: B:354:0x3a29  */
        /* JADX WARN: Removed duplicated region for block: B:355:0x175a A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:359:0x15af  */
        /* JADX WARN: Removed duplicated region for block: B:361:0x1248  */
        /* JADX WARN: Removed duplicated region for block: B:365:0x12b9  */
        /* JADX WARN: Removed duplicated region for block: B:370:0x1338  */
        /* JADX WARN: Removed duplicated region for block: B:375:0x13cc  */
        /* JADX WARN: Removed duplicated region for block: B:384:0x13c2  */
        /* JADX WARN: Removed duplicated region for block: B:390:0x116d A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:392:0x0f51  */
        /* JADX WARN: Removed duplicated region for block: B:394:0x0e5d  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0a35  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0d2d A[Catch: all -> 0x0240, TryCatch #1 {all -> 0x0240, blocks: (B:6:0x00fb, B:8:0x0108, B:9:0x0147, B:21:0x02df, B:23:0x02ec, B:24:0x0339, B:31:0x04af, B:33:0x04bc, B:34:0x04f6, B:41:0x0742, B:43:0x0748, B:44:0x078c, B:64:0x0a48, B:66:0x0a55, B:67:0x0a9e, B:76:0x0d20, B:78:0x0d2d, B:79:0x0d66, B:99:0x0ebe, B:101:0x0ecb, B:102:0x0f08, B:110:0x10ed, B:112:0x10fa, B:113:0x113e, B:136:0x1492, B:138:0x149f, B:139:0x14d9, B:150:0x164d, B:152:0x165a, B:153:0x1694, B:160:0x1772, B:162:0x1778, B:163:0x17b1, B:166:0x184f, B:168:0x1861, B:169:0x18aa, B:174:0x1984, B:176:0x1991, B:177:0x19de, B:181:0x19f1, B:183:0x1a08, B:184:0x1a53, B:189:0x29ef, B:191:0x29fc, B:192:0x2a36, B:205:0x2f14, B:207:0x2f21, B:208:0x2f62, B:232:0x35e7, B:234:0x35f4, B:235:0x364f, B:254:0x3919, B:256:0x3926, B:257:0x3965, B:214:0x3183, B:216:0x3190, B:217:0x31c9, B:288:0x302f, B:290:0x303c, B:291:0x3081, B:299:0x2a44, B:301:0x2a5c, B:302:0x2a9a, B:308:0x26d7, B:310:0x26e4, B:311:0x2730, B:320:0x2759, B:322:0x2766, B:323:0x27b1, B:400:0x0b7b, B:402:0x0b88, B:403:0x0bcd, B:425:0x060b, B:427:0x0618, B:428:0x065f, B:438:0x06b1, B:440:0x06be, B:441:0x0704), top: B:5:0x00fb }] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0d71  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0e0c  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0e55  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0e67  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object[] b(android.content.Context context, int i2, int i3, int i4) {
            int i5;
            java.lang.String str;
            int i6;
            int i7;
            java.lang.String str2;
            int i8;
            int i9;
            java.lang.String str3;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            java.lang.String str4;
            long j;
            int i15;
            int i16;
            java.lang.Object d;
            java.lang.String str5;
            int i17;
            java.lang.String str6;
            java.io.File file;
            int i18;
            java.lang.Object d2;
            int i19;
            int i20;
            java.lang.String str7;
            java.io.File file2;
            java.lang.String str8;
            java.io.File file3;
            int i21;
            java.util.Scanner useDelimiter;
            java.lang.String str9;
            java.lang.String str10;
            java.lang.String str11;
            java.lang.String[] strArr;
            int i22;
            int i23;
            java.lang.String str12;
            int i24;
            java.lang.Object d3;
            long j2;
            int myTid;
            int i25;
            int i26;
            java.lang.String[] strArr2;
            long j3;
            char c;
            long j4;
            long j5;
            int i27;
            java.lang.String str13;
            java.lang.String[] strArr3;
            char c2;
            int i28;
            java.lang.String[][] strArr4;
            int i29;
            int i30;
            java.lang.String str14;
            java.lang.StringBuilder sb;
            int i31;
            int i32;
            java.lang.String str15;
            java.lang.String str16;
            java.lang.StringBuilder sb2;
            java.lang.String[] strArr5;
            char c3;
            java.lang.Object d4;
            java.lang.Object invoke;
            java.lang.String[] strArr6;
            int i33;
            java.lang.String str17;
            int i34;
            int i35;
            int i36;
            java.lang.String str18;
            int i37;
            int i38;
            int i39;
            java.lang.Object d5;
            java.lang.Object d6;
            long j6;
            int i40;
            int i41;
            java.lang.String[] strArr7;
            int i42;
            int length;
            java.lang.String str19;
            java.lang.String[][] strArr8;
            java.lang.String[] strArr9;
            java.lang.String str20;
            int i43;
            java.lang.String str21;
            int i44;
            java.lang.String str22;
            java.lang.String[] strArr10;
            int i45;
            java.lang.Object[] objArr;
            java.lang.String[] strArr11;
            java.lang.String str23;
            java.lang.String[] strArr12;
            int i46;
            java.lang.String next;
            java.util.Scanner useDelimiter2;
            java.lang.String str24;
            java.lang.String[] strArr13;
            int i47;
            int i48;
            java.lang.String str25;
            java.lang.String[] strArr14;
            int i49;
            int i50;
            int i51 = i2;
            l = (n + 55) % 128;
            int i52 = 0;
            int i53 = -android.view.View.getDefaultSize(0, 0);
            int i54 = -(-(android.os.Process.myPid() >> 22));
            long j7 = 0;
            int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
            int i55 = 1;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            k((char) ((i53 & 32185) + (i53 | 32185)), ((i54 | 1178) << 1) - (i54 ^ 1178), (packedPositionGroup & 8) + (packedPositionGroup | 8), objArr2);
            java.lang.String str26 = (java.lang.String) objArr2[0];
            char scrollBarSize = (char) (57988 - (android.view.ViewConfiguration.getScrollBarSize() >> 8));
            int i56 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            int i57 = -(android.view.ViewConfiguration.getScrollBarSize() >> 8);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            k(scrollBarSize, ((i56 | com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE) << 1) - (i56 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE), (i57 & 27) + (i57 | 27), objArr3);
            java.lang.String str27 = (java.lang.String) objArr3[0];
            int i58 = -(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int gidForName = android.os.Process.getGidForName("");
            int longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout() >> 16;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            k((char) (((i58 | 25333) << 1) - (i58 ^ 25333)), ((gidForName | com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_VALUE) << 1) - (gidForName ^ com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_VALUE), (longPressTimeout ^ 25) + ((longPressTimeout & 25) << 1), objArr4);
            java.lang.String str28 = (java.lang.String) objArr4[0];
            char scrollDefaultDelay = (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
            int maximumDrawingCacheSize = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
            int i59 = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            k(scrollDefaultDelay, (maximumDrawingCacheSize >> 24) + 320, (i59 & 17) + (i59 | 17), objArr5);
            java.lang.String str29 = (java.lang.String) objArr5[0];
            char touchSlop = (char) (android.view.ViewConfiguration.getTouchSlop() >> 8);
            int i60 = -(-android.view.View.combineMeasuredStates(0, 0));
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            k(touchSlop, ((i60 | 338) << 1) - (i60 ^ 338), 27 - (~(-(-android.view.Gravity.getAbsoluteGravity(0, 0)))), objArr6);
            java.lang.String[] strArr15 = {str27, str28, str29, (java.lang.String) objArr6[0]};
            int i61 = 0;
            while (true) {
                if (i61 >= 4) {
                    i5 = i51;
                    break;
                }
                int i62 = l;
                n = ((i62 ^ 15) + ((i62 & 15) << i55)) % 128;
                try {
                    java.lang.Object[] objArr7 = {strArr15[i61]};
                    java.lang.Object d7 = com.facetec.sdk.al.d(2084539986);
                    if (d7 == null) {
                        char longPressTimeout2 = (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 6935);
                        int packedPositionGroup2 = android.widget.ExpandableListView.getPackedPositionGroup(j7);
                        int red = android.graphics.Color.red(i52);
                        byte length2 = (byte) $$a.length;
                        byte b = (byte) (length2 - 5);
                        java.lang.Object[] objArr8 = new java.lang.Object[i55];
                        m(length2, b, (byte) (b + 1), objArr8);
                        java.lang.String str30 = (java.lang.String) objArr8[i52];
                        java.lang.Class[] clsArr = new java.lang.Class[i55];
                        clsArr[i52] = java.lang.String.class;
                        d7 = com.facetec.sdk.al.c(longPressTimeout2, 2389 - packedPositionGroup2, red + 23, -607062870, false, str30, clsArr);
                    }
                    long longValue = ((java.lang.Long) ((java.lang.reflect.Method) d7).invoke(null, objArr7)).longValue();
                    long j8 = 582610537;
                    int i63 = (int) java.lang.Runtime.getRuntime().totalMemory();
                    long j9 = -167;
                    long j10 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE;
                    java.lang.String[] strArr16 = strArr15;
                    long j11 = -1;
                    long j12 = j8 ^ j11;
                    long j13 = longValue ^ j11;
                    long j14 = j12 | j13;
                    int i64 = i61;
                    long j15 = i63;
                    long j16 = j15 ^ j11;
                    long j17 = (j9 * j8) + (j9 * longValue) + (((j14 ^ j11) | ((j13 | j16) ^ j11)) * j10) + (((j14 | j15) ^ j11) * j10) + (j10 * ((j11 ^ (j15 | (j13 | j8))) | ((j12 | longValue) ^ j11) | ((j12 | j16) ^ j11))) + 389538805;
                    int i65 = ~i51;
                    int i66 = ((int) (j17 >> 32)) & (((((~((-134239233) | i51)) | (-1605238748)) * 449) - 311262366) + (((~((-134239233) | i65)) | (-1605238748)) * 449));
                    int freeMemory = (int) java.lang.Runtime.getRuntime().freeMemory();
                    int i67 = ~freeMemory;
                    int i68 = ((int) j17) & ((((~((-1213713769) | freeMemory)) | 134349056 | (~(1644027117 | freeMemory))) * (-754)) + 524022939 + (((~(freeMemory | (-134349057))) | (~(1778376173 | i67))) * (-754)) + (((-1213713769) | i67) * 754));
                    if (((i68 ^ i66) | (i68 & i66)) != 0) {
                        int i69 = l + 27;
                        n = i69 % 128;
                        if (i69 % 2 != 0) {
                            int i70 = i64 * 7491;
                            i49 = (~i70) & i51;
                            i50 = i70 & i65;
                        } else {
                            int i71 = (i64 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE) + (i64 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE);
                            i49 = i71 & i65;
                            i50 = (~i71) & i51;
                        }
                        i5 = i49 | i50;
                    } else {
                        int i72 = (i64 ^ 55) + ((i64 & 55) << 1);
                        i61 = ((i72 | (-54)) << 1) - (i72 ^ (-54));
                        l = (n + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                        strArr15 = strArr16;
                        i52 = 0;
                        j7 = 0;
                        i55 = 1;
                    }
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i73 = 3;
            float f = 0.0f;
            char c4 = (char) (61934 - (~(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))));
            int i74 = -(android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
            int i75 = -(-android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            k(c4, ((i74 | 366) << 1) - (i74 ^ 366), (i75 ^ (-36)) + ((i75 & (-36)) << 1), objArr9);
            char packedPositionType = (char) android.widget.ExpandableListView.getPackedPositionType(0L);
            int blue = android.graphics.Color.blue(0);
            int i76 = -(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            k(packedPositionType, (blue ^ 378) + ((blue & 378) << 1), (i76 & 13) + (i76 | 13), objArr10);
            char alpha = (char) android.graphics.Color.alpha(0);
            int i77 = -android.view.View.resolveSize(0, 0);
            java.lang.String str31 = "";
            int i78 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            k(alpha, ((i77 | 391) << 1) - (i77 ^ 391), (i78 ^ 17) + ((i78 & 17) << 1), objArr11);
            java.lang.String[] strArr17 = {(java.lang.String) objArr9[0], (java.lang.String) objArr10[0], (java.lang.String) objArr11[0]};
            int i79 = 0;
            while (true) {
                if (i79 >= i73) {
                    str = str26;
                    i6 = i51;
                    i7 = i5;
                    str2 = str31;
                    i8 = i6;
                    break;
                }
                n = (l + 19) % 128;
                java.lang.Object[] objArr12 = {strArr17[i79]};
                java.lang.Object d8 = com.facetec.sdk.al.d(1450487247);
                if (d8 == null) {
                    char indexOf = (char) (android.text.TextUtils.indexOf(str31, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 6936);
                    long packedPositionForChild = android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
                    float length3 = android.graphics.PointF.length(f, f);
                    byte b2 = (byte) ($$b & i73);
                    byte b3 = (byte) (-b2);
                    strArr14 = strArr17;
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    m(b2, b3, (byte) (b3 + 1), objArr13);
                    d8 = com.facetec.sdk.al.c(indexOf, 2388 - (packedPositionForChild > 0L ? 1 : (packedPositionForChild == 0L ? 0 : -1)), 23 - (length3 > 0.0f ? 1 : (length3 == 0.0f ? 0 : -1)), -241445065, false, (java.lang.String) objArr13[0], new java.lang.Class[]{java.lang.String.class});
                } else {
                    strArr14 = strArr17;
                }
                long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) d8).invoke(null, objArr12)).longValue();
                long j18 = 309834396;
                str2 = str31;
                i7 = i5;
                long j19 = -1;
                long j20 = j18 ^ j19;
                str = str26;
                long nextInt = new java.util.Random().nextInt(1883937121);
                long j21 = nextInt ^ j19;
                long j22 = 54;
                long j23 = ((longValue2 ^ j19) | j18) ^ j19;
                long j24 = (55 * j18) + ((-107) * longValue2) + ((-108) * (((j21 | longValue2) ^ j19) | ((j20 | longValue2) ^ j19))) + (((j19 ^ (j21 | j18)) | ((j20 | nextInt) ^ j19) | j23) * j22) + (j22 * (nextInt | j23)) + 1541342245;
                int myTid2 = android.os.Process.myTid();
                int i80 = ~myTid2;
                i6 = i2;
                int i81 = ~i6;
                if (((((int) (j24 >> 32)) & (((((-1575290709) | myTid2) * (-50)) - 319898302) + (((~(myTid2 | 1576380244)) | (~((-293930069) | i80))) * 50) + (((~((-1575290709) | i80)) | (~(i80 | 1282450176)) | 293930068) * 50))) | (((((((~((-138413450) | i81)) | (~((-33890337) | i81))) * (-184)) + 1019428157) + ((((~((-1376608887) | i81)) | 1342718550) | (~(i81 | (-1481132000)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)) - 408764600) & ((int) j24))) != 0) {
                    int d9 = com.facetec.sdk.ou.d();
                    int i82 = -(-(i79 * (-163)));
                    int i83 = ~d9;
                    int i84 = ~((i83 ^ i79) | (i83 & i79));
                    int i85 = ~i79;
                    int i86 = ~((i85 & (-271)) | (i85 ^ (-271)));
                    int i87 = ~((i85 ^ d9) | (d9 & i85));
                    int i88 = (i87 ^ i86) | (i87 & i86);
                    int i89 = (i83 ^ 270) | (i83 & 270);
                    int i90 = ~((i89 ^ i79) | (i79 & i89));
                    int i91 = (((44550 | i82) << 1) - (i82 ^ 44550)) + (((i84 & 270) | (i84 ^ 270)) * (-328)) + (((d9 & 270) | (d9 ^ 270)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((i88 & i90) | (i88 ^ i90)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE);
                    i8 = (~(i6 & i91)) & (i6 | i91);
                    break;
                }
                int i92 = (i79 ^ (-58)) + ((i79 & (-58)) << 1);
                i79 = (i92 ^ 59) + ((i92 & 59) << 1);
                i51 = i6;
                strArr17 = strArr14;
                str31 = str2;
                i5 = i7;
                str26 = str;
                i73 = 3;
                f = 0.0f;
            }
            int i93 = (~(i6 & i7)) & (i6 | i7);
            int i94 = -i93;
            int i95 = ((i93 ^ i94) | (i93 & i94)) >> 31;
            int i96 = i8 & (~i95);
            int i97 = i7 & i95;
            int i98 = (i96 ^ i97) | (i96 & i97);
            char mode = (char) android.view.View.MeasureSpec.getMode(0);
            java.lang.String str32 = str2;
            int lastIndexOf = android.text.TextUtils.lastIndexOf(str32, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
            int defaultSize = android.view.View.getDefaultSize(0, 0);
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            k(mode, (lastIndexOf ^ 410) + ((lastIndexOf & 410) << 1), (defaultSize ^ 14) + ((defaultSize & 14) << 1), objArr14);
            java.lang.Object[] objArr15 = {(java.lang.String) objArr14[0]};
            java.lang.Object d10 = com.facetec.sdk.al.d(2084539986);
            if (d10 == null) {
                char absoluteGravity = (char) (6935 - android.view.Gravity.getAbsoluteGravity(0, 0));
                int indexOf2 = android.text.TextUtils.indexOf(str32, str32, 0, 0);
                float minVolume = android.media.AudioTrack.getMinVolume();
                byte length4 = (byte) $$a.length;
                byte b4 = (byte) (length4 - 5);
                java.lang.Object[] objArr16 = new java.lang.Object[1];
                m(length4, b4, (byte) (b4 + 1), objArr16);
                d10 = com.facetec.sdk.al.c(absoluteGravity, 2389 - indexOf2, (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)) + 23, -607062870, false, (java.lang.String) objArr16[0], new java.lang.Class[]{java.lang.String.class});
            }
            long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) d10).invoke(null, objArr15)).longValue();
            long j25 = 378508358;
            long j26 = -112;
            long j27 = -1;
            long j28 = longValue3 ^ j27;
            long j29 = i6;
            long j30 = j29 ^ j27;
            long j31 = j28 | j30;
            long j32 = j25 ^ j27;
            long j33 = (j26 * j25) + (j26 * longValue3) + (((j31 ^ j27) | j25) * 226) + ((-113) * (((j32 | longValue3) ^ j27) | ((j32 | j29) ^ j27) | ((j31 | j25) ^ j27))) + (113 * ((j28 | j29) ^ j27)) + 593640984;
            int freeMemory2 = (int) java.lang.Runtime.getRuntime().freeMemory();
            int i99 = ~freeMemory2;
            int i100 = ((int) (j33 >> 32)) & ((((((~(137863407 | freeMemory2)) | (~(1575089818 | i99))) | r6) * (-516)) - 1978342526) + (((~(freeMemory2 | (-1438668305))) | (~(i99 | (-136421515)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + ((136421514 | (~((-137863408) | i99))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR));
            int i101 = ~i2;
            int i102 = ((int) j33) & (((((~(1705212868 | i101)) | (~((-267986459) | i101))) * (-867)) - 1972008908) + (((~(1705212868 | i2)) | 173540378 | (~((-267986459) | i2))) * (-1734)) + (((~((-173540379) | i101)) | (~(1878753246 | i2)) | (~((-94446081) | i2))) * 867));
            if (((i102 ^ i100) | (i100 & i102)) != 0) {
                int i103 = n + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                l = i103 % 128;
                i9 = i103 % 2 == 0 ? i2 ^ com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes.SIGN_IN_FAILED : i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE;
            } else {
                int i104 = -(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int i105 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
                int i106 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                java.lang.Object[] objArr17 = new java.lang.Object[1];
                k((char) ((i104 & 1) + (i104 | 1)), (i105 ^ androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PERIOD) + ((i105 & androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PERIOD) << 1), (i106 & 24) + (i106 | 24), objArr17);
                java.lang.Object[] objArr18 = {(java.lang.String) objArr17[0]};
                java.lang.Object d11 = com.facetec.sdk.al.d(1590238701);
                if (d11 == null) {
                    char c5 = (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1);
                    int windowTouchSlop = android.view.ViewConfiguration.getWindowTouchSlop();
                    int maximumDrawingCacheSize2 = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
                    byte length5 = (byte) $$a.length;
                    byte b5 = (byte) (length5 - 5);
                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                    m(length5, b5, (byte) (b5 + 1), objArr19);
                    d11 = com.facetec.sdk.al.c(c5, (windowTouchSlop >> 8) + 2078, (maximumDrawingCacheSize2 >> 24) + 24, -114923755, false, (java.lang.String) objArr19[0], new java.lang.Class[]{java.lang.String.class});
                }
                java.lang.String str33 = (java.lang.String) ((java.lang.reflect.Method) d11).invoke(null, objArr18);
                if (str33 != null) {
                    int i107 = n;
                    int i108 = ((i107 | 63) << 1) - (i107 ^ 63);
                    l = i108 % 128;
                    if (i108 % 2 == 0) {
                        str33.length();
                        throw null;
                    }
                }
                java.lang.Object[] objArr20 = new java.lang.Object[1];
                k((char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), 446 - (~(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 23 - (~(-(android.view.ViewConfiguration.getFadingEdgeLength() >> 16))), objArr20);
                java.lang.Object[] objArr21 = {(java.lang.String) objArr20[0]};
                java.lang.Object d12 = com.facetec.sdk.al.d(1590238701);
                if (d12 == null) {
                    char c6 = (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    float scrollFriction = android.view.ViewConfiguration.getScrollFriction();
                    int maximumDrawingCacheSize3 = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
                    byte length6 = (byte) $$a.length;
                    byte b6 = (byte) (length6 - 5);
                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                    m(length6, b6, (byte) (b6 + 1), objArr22);
                    d12 = com.facetec.sdk.al.c(c6, (scrollFriction > 0.0f ? 1 : (scrollFriction == 0.0f ? 0 : -1)) + 2077, 24 - (maximumDrawingCacheSize3 >> 24), -114923755, false, (java.lang.String) objArr22[0], new java.lang.Class[]{java.lang.String.class});
                }
                java.lang.String str34 = (java.lang.String) ((java.lang.reflect.Method) d12).invoke(null, objArr21);
                if (str34 != null) {
                    int i109 = l;
                    n = ((i109 ^ 117) + ((i109 & 117) << 1)) % 128;
                }
                l = (n + 99) % 128;
                i9 = i2;
            }
            int i110 = ((~i98) & i2) | (i98 & i101);
            int i111 = (i110 | (-i110)) >> 31;
            int i112 = (i98 & i111) | (i9 & (~i111));
            java.lang.Object d13 = com.facetec.sdk.al.d(-318294282);
            if (d13 == null) {
                char c7 = (char) (28045 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int jumpTapTimeout = android.view.ViewConfiguration.getJumpTapTimeout();
                str3 = str32;
                int indexOf3 = android.text.TextUtils.indexOf(str3, str3, 0);
                byte b7 = (byte) 3;
                byte b8 = (byte) (b7 - 4);
                java.lang.Object[] objArr23 = new java.lang.Object[1];
                m(b7, b8, (byte) (b8 + 1), objArr23);
                d13 = com.facetec.sdk.al.c(c7, (jumpTapTimeout >> 16) + 2318, indexOf3 + 23, 1256737806, false, (java.lang.String) objArr23[0], new java.lang.Class[0]);
            } else {
                str3 = str32;
            }
            long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) d13).invoke(null, null)).longValue();
            long j34 = -421833841;
            java.lang.String str35 = str3;
            long j35 = 530;
            long j36 = 529;
            long j37 = org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO + (j35 * j34) + (j35 * longValue4) + ((((j30 | j34) ^ j27) | ((j34 | longValue4) ^ j27)) * j36) + (j36 * ((longValue4 ^ j27) | ((j34 | j29) ^ j27))) + 853651942;
            int i113 = i2;
            int i114 = ((int) (j37 >> 32)) & (((((~((-169278604) | i101)) | 1267947807) * 226) - 2055567968) + (((~((-1267947808) | i113)) | 1098973460 | (~((-304257) | i101))) * (-113)) + ((~((-169278604) | i113)) * 113));
            int i115 = ((int) j37) & ((((~(1109928863 | i113)) | 33565194) * (-502)) + 818843687 + ((~((-293732353) | i101)) * (-502)) + (((~(327297546 | i113)) | 1109928863) * 502));
            int i116 = (i114 ^ i115) | (i114 & i115);
            int i117 = 199 - (~((-2) - (~i116)));
            int i118 = -i116;
            int i119 = ((i116 ^ i118) | (i116 & i118)) >> 31;
            int i120 = (~i119) & i113;
            int i121 = i119 & (((~i117) & i113) | (i117 & i101));
            int i122 = (~(i113 & i112)) & (i113 | i112);
            int i123 = -i122;
            int i124 = ((i122 ^ i123) | (i122 & i123)) >> 31;
            int i125 = ((i121 ^ i120) | (i121 & i120)) & (~i124);
            int i126 = i112 & i124;
            int i127 = (i125 ^ i126) | (i126 & i125);
            java.lang.Object[] objArr24 = new java.lang.Object[1];
            k((char) (6057 - android.view.KeyEvent.normalizeMetaState(0)), 470 - (~(-android.graphics.drawable.Drawable.resolveOpacity(0, 0))), 20 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr24);
            java.lang.String str36 = (java.lang.String) objArr24[0];
            int resolveOpacity = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
            int i128 = resolveOpacity * (-947);
            int i129 = ~resolveOpacity;
            int i130 = ~((i113 & (-28628)) | (i113 ^ (-28628)));
            char c8 = (char) ((((((27167023 ^ i128) + ((i128 & 27167023) << 1)) + (((i130 & i129) | (i130 ^ i129)) * (-948))) - (~((~(((i129 & (-28628)) | (i129 ^ (-28628))) | i101)) * (-948)))) - 1) + (((resolveOpacity & (-28628)) | (resolveOpacity ^ (-28628))) * 948));
            int i131 = -android.view.MotionEvent.axisFromString(str35);
            int i132 = -(-((byte) android.view.KeyEvent.getModifierMetaStateMask()));
            java.lang.Object[] objArr25 = new java.lang.Object[1];
            k(c8, (i131 & 490) + (i131 | 490), (i132 ^ 7) + ((i132 & 7) << 1), objArr25);
            java.lang.String str37 = (java.lang.String) objArr25[0];
            java.io.File file4 = new java.io.File(str36);
            if (file4.exists() && file4.isFile()) {
                try {
                    java.util.Scanner scanner = new java.util.Scanner(new java.io.FileInputStream(file4));
                    char tapTimeout = (char) (5604 - (android.view.ViewConfiguration.getTapTimeout() >> 16));
                    int absoluteGravity2 = android.view.Gravity.getAbsoluteGravity(0, 0);
                    int i133 = -android.view.KeyEvent.keyCodeFromString(str35);
                    java.lang.Object[] objArr26 = new java.lang.Object[1];
                    k(tapTimeout, (absoluteGravity2 ^ 497) + ((absoluteGravity2 & 497) << 1), (i133 & 2) + (i133 | 2), objArr26);
                    java.util.Scanner useDelimiter3 = scanner.useDelimiter((java.lang.String) objArr26[0]);
                    if (useDelimiter3.hasNext()) {
                        int i134 = n;
                        int i135 = (i134 & 89) + (i134 | 89);
                        l = i135 % 128;
                        if (i135 % 2 == 0) {
                            useDelimiter3.next();
                            throw null;
                        }
                        str25 = useDelimiter3.next();
                    } else {
                        str25 = str35;
                    }
                    useDelimiter3.close();
                } catch (java.io.IOException unused) {
                }
                if (str25.contains(str37)) {
                    i10 = 1;
                    int i136 = -i10;
                    int i137 = ((i10 ^ i136) | (i10 & i136)) >> 31;
                    int i138 = (~i137) & i113;
                    int i139 = i137 & ((i113 & (-263)) | (i101 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE));
                    int i140 = ((~i127) & i113) | (i127 & i101);
                    int i141 = -i140;
                    int i142 = ((i140 ^ i141) | (i140 & i141)) >> 31;
                    int i143 = ((i139 ^ i138) | (i139 & i138)) & (~i142);
                    int i144 = i127 & i142;
                    int i145 = (i144 ^ i143) | (i144 & i143);
                    int i146 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                    java.lang.String str38 = str35;
                    int offsetBefore = android.text.TextUtils.getOffsetBefore(str38, 0);
                    int i147 = -(-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    java.lang.Object[] objArr27 = new java.lang.Object[1];
                    k((char) (((60372 | i146) << 1) - (i146 ^ 60372)), (offsetBefore ^ 499) + ((offsetBefore & 499) << 1), ((i147 | 30) << 1) - (i147 ^ 30), objArr27);
                    java.lang.String str39 = (java.lang.String) objArr27[0];
                    int i148 = -android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                    k((char) (((63759 | i148) << 1) - (i148 ^ 63759)), 529 - (~android.graphics.drawable.Drawable.resolveOpacity(0, 0)), 23 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr28);
                    java.lang.String str40 = (java.lang.String) objArr28[0];
                    char doubleTapTimeout = (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int i149 = (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    int i150 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                    k(doubleTapTimeout, (i149 ^ com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_ATC_OUT_SIDE_PERMISSIBLE_RANGE) + ((i149 & com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_ATC_OUT_SIDE_PERMISSIBLE_RANGE) << 1), ((i150 | 29) << 1) - (i150 ^ 29), objArr29);
                    java.lang.String str41 = (java.lang.String) objArr29[0];
                    int i151 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                    float complexToFraction = android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
                    int lastIndexOf2 = android.text.TextUtils.lastIndexOf(str38, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                    k((char) ((i151 & 48) + (i151 | 48)), (complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)) + 581, ((lastIndexOf2 | 15) << 1) - (lastIndexOf2 ^ 15), objArr30);
                    java.lang.String[] strArr18 = {str39, str40, str41, (java.lang.String) objArr30[0]};
                    int i152 = n;
                    l = ((i152 ^ 17) + ((i152 & 17) << 1)) % 128;
                    i11 = 0;
                    while (i11 < 4) {
                        int i153 = n;
                        int i154 = (i153 ^ 105) + ((i153 & 105) << 1);
                        l = i154 % 128;
                        if (i154 % 2 == 0) {
                            java.lang.Object[] objArr31 = {strArr18[i11]};
                            java.lang.Object d14 = com.facetec.sdk.al.d(1450487247);
                            if (d14 == null) {
                                char indexOf4 = (char) (android.text.TextUtils.indexOf(str38, str38, 0, 0) + 6935);
                                int size = android.view.View.MeasureSpec.getSize(0);
                                int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
                                byte b9 = (byte) ($$b & 3);
                                byte b10 = (byte) (-b9);
                                j = j29;
                                str4 = str38;
                                java.lang.Object[] objArr32 = new java.lang.Object[1];
                                m(b9, b10, (byte) (b10 + 1), objArr32);
                                d14 = com.facetec.sdk.al.c(indexOf4, size + 2389, combineMeasuredStates + 23, -241445065, false, (java.lang.String) objArr32[0], new java.lang.Class[]{java.lang.String.class});
                            } else {
                                str4 = str38;
                                j = j29;
                            }
                            long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) d14).invoke(null, objArr31)).longValue();
                            long j38 = 711417630;
                            i12 = i145;
                            strArr13 = strArr18;
                            long j39 = longValue5 ^ j27;
                            i47 = i11;
                            long nextInt2 = new java.util.Random().nextInt();
                            long j40 = (j38 | nextInt2) ^ j27;
                            long j41 = 407;
                            long j42 = j38 ^ j27;
                            long j43 = (j42 | longValue5) ^ j27;
                            long j44 = ((-813) * j38) + (408 * longValue5) + ((((j39 | j38) ^ j27) | j40) * (-814)) + ((((j39 | (nextInt2 ^ j27)) ^ j27) | j43 | j40) * j41) + (j41 * (j43 | ((j42 | nextInt2) ^ j27) | ((longValue5 | nextInt2) ^ j27))) + 1139759011;
                            int elapsedCpuTime = (int) android.os.Process.getElapsedCpuTime();
                            i14 = i101;
                            if (((((int) (j44 >>> 21)) & (((((~(569993893 | i101)) | 867232517) * (-328)) - 1355246806) + ((867232517 | i2) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((~((-569993894) | i2)) | 565209605 | (~(872016805 | i101))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE))) | (((int) j44) & ((((671158272 | r3) * (-814)) - 1070940755) + (((~(1107053903 | elapsedCpuTime)) | (~((~elapsedCpuTime) | (-1750686983))) | 27525193) * 407) + (((~(elapsedCpuTime | (-1107053904))) | 27525193 | (~(1750686982 | elapsedCpuTime))) * 407)))) != 0) {
                                int i155 = i47 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE;
                                i13 = i2;
                                i15 = (~(i13 & i155)) & (i155 | i13);
                                break;
                            }
                            i48 = i2;
                            int i156 = i47;
                            i11 = ((i156 ^ 14) + ((i156 & 14) << 1)) - 13;
                            i113 = i48;
                            j29 = j;
                            i145 = i12;
                            strArr18 = strArr13;
                            str38 = str4;
                            i101 = i14;
                        } else {
                            i12 = i145;
                            strArr13 = strArr18;
                            i47 = i11;
                            str4 = str38;
                            j = j29;
                            java.lang.Object[] objArr33 = {strArr13[i47]};
                            java.lang.Object d15 = com.facetec.sdk.al.d(1450487247);
                            if (d15 == null) {
                                char c9 = (char) (6935 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength();
                                int red2 = android.graphics.Color.red(0);
                                byte b11 = (byte) ($$b & 3);
                                byte b12 = (byte) (-b11);
                                java.lang.Object[] objArr34 = new java.lang.Object[1];
                                m(b11, b12, (byte) (b12 + 1), objArr34);
                                d15 = com.facetec.sdk.al.c(c9, 2389 - (fadingEdgeLength >> 16), 23 - red2, -241445065, false, (java.lang.String) objArr34[0], new java.lang.Class[]{java.lang.String.class});
                            }
                            long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) d15).invoke(null, objArr33)).longValue();
                            long j45 = 1836154857;
                            long j46 = longValue6 ^ j27;
                            long nextInt3 = new java.util.Random().nextInt(1790985932);
                            long j47 = (j45 | nextInt3) ^ j27;
                            i14 = i101;
                            long j48 = 407;
                            long j49 = j45 ^ j27;
                            long j50 = (j49 | longValue6) ^ j27;
                            long j51 = ((-813) * j45) + (408 * longValue6) + ((((j46 | j45) ^ j27) | j47) * (-814)) + ((((j46 | (nextInt3 ^ j27)) ^ j27) | j50 | j47) * j48) + (j48 * (((longValue6 | nextInt3) ^ j27) | j50 | ((j49 | nextInt3) ^ j27))) + 15021784;
                            int i157 = ~(i14 | 1113290190);
                            int i158 = (int) java.lang.Runtime.getRuntime().totalMemory();
                            int i159 = ~((-1812825985) | i158);
                            if (((((int) (j51 >> 32)) & (((1074864130 | i157) * (-970)) + 1759807046 + ((i157 | 38426060) * 970))) | (((((~(1812825984 | i158)) | 308424790 | (~((-375599575) | i158))) * (-880)) + 818884229 + (((~((~i158) | 1812825984)) | 375599574 | i159) * (-880)) + (i159 * 880)) & ((int) j51))) != 0) {
                                int i1552 = i47 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE;
                                i13 = i2;
                                i15 = (~(i13 & i1552)) & (i1552 | i13);
                                break;
                            }
                            i48 = i2;
                            int i1562 = i47;
                            i11 = ((i1562 ^ 14) + ((i1562 & 14) << 1)) - 13;
                            i113 = i48;
                            j29 = j;
                            i145 = i12;
                            strArr18 = strArr13;
                            str38 = str4;
                            i101 = i14;
                        }
                    }
                    i12 = i145;
                    i13 = i113;
                    i14 = i101;
                    str4 = str38;
                    j = j29;
                    i15 = i13;
                    int i160 = i13 ^ i12;
                    int i161 = -i160;
                    int i162 = ((i160 ^ i161) | (i160 & i161)) >> 31;
                    int i163 = i15 & (~i162);
                    int i164 = i12 & i162;
                    int i165 = (i163 ^ i164) | (i163 & i164);
                    char c10 = (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    java.lang.String str42 = str4;
                    int lastIndexOf3 = android.text.TextUtils.lastIndexOf(str42, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                    int i166 = lastIndexOf3 * (-244);
                    int i167 = (146616 ^ i166) + ((i166 & 146616) << 1);
                    i16 = i14;
                    int i168 = -(-(((~(i16 | (-597))) | (~((lastIndexOf3 & (-597)) | (lastIndexOf3 ^ (-597))))) * (-245)));
                    int i169 = (i167 & i168) + (i167 | i168);
                    int i170 = ~((i13 & (-597)) | (i13 ^ (-597)));
                    int i171 = i169 + (i170 * (-245));
                    int i172 = -(-(((i170 ^ lastIndexOf3) | (i170 & lastIndexOf3)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE));
                    int i173 = -android.text.TextUtils.getCapsMode(str42, 0, 0);
                    java.lang.Object[] objArr35 = new java.lang.Object[1];
                    k(c10, (i171 ^ i172) + ((i172 & i171) << 1), ((i173 | 13) << 1) - (i173 ^ 13), objArr35);
                    java.lang.Object[] objArr36 = {(java.lang.String) objArr35[0]};
                    d = com.facetec.sdk.al.d(1590238701);
                    if (d == null) {
                        char alpha2 = (char) android.graphics.Color.alpha(0);
                        int scrollBarSize2 = android.view.ViewConfiguration.getScrollBarSize();
                        int keyCodeFromString = android.view.KeyEvent.keyCodeFromString(str42);
                        byte length7 = (byte) $$a.length;
                        byte b13 = (byte) (length7 - 5);
                        java.lang.Object[] objArr37 = new java.lang.Object[1];
                        m(length7, b13, (byte) (b13 + 1), objArr37);
                        d = com.facetec.sdk.al.c(alpha2, 2078 - (scrollBarSize2 >> 8), keyCodeFromString + 24, -114923755, false, (java.lang.String) objArr37[0], new java.lang.Class[]{java.lang.String.class});
                    }
                    str5 = (java.lang.String) ((java.lang.reflect.Method) d).invoke(null, objArr36);
                    if (str5 != null) {
                        java.lang.Object[] objArr38 = new java.lang.Object[1];
                        k((char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 608 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), android.text.TextUtils.indexOf(str42, str42) + 9, objArr38);
                        if (str5.contains((java.lang.String) objArr38[0])) {
                            i17 = (i13 & (-251)) | (i16 & 250);
                            int i174 = (~(i13 & i165)) & (i13 | i165);
                            int i175 = -i174;
                            int i176 = ((i174 ^ i175) | (i174 & i175)) >> 31;
                            int i177 = i17 & (~i176);
                            int i178 = i165 & i176;
                            int i179 = (i178 ^ i177) | (i178 & i177);
                            char maxKeyCode = (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 34835);
                            int i180 = -android.view.View.combineMeasuredStates(0, 0);
                            java.lang.Object[] objArr39 = new java.lang.Object[1];
                            k(maxKeyCode, (i180 & 617) + (i180 | 617), 17 - android.view.View.getDefaultSize(0, 0), objArr39);
                            java.lang.String str43 = (java.lang.String) objArr39[0];
                            char c11 = (char) (5272 - (~(-(-(android.view.ViewConfiguration.getTouchSlop() >> 8)))));
                            int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                            int packedPositionGroup3 = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                            java.lang.Object[] objArr40 = new java.lang.Object[1];
                            k(c11, 634 - makeMeasureSpec, ((packedPositionGroup3 | 6) << 1) - (packedPositionGroup3 ^ 6), objArr40);
                            str6 = (java.lang.String) objArr40[0];
                            file = new java.io.File(str43);
                            if (file.exists() && file.isFile()) {
                                try {
                                    java.util.Scanner scanner2 = new java.util.Scanner(new java.io.FileInputStream(file));
                                    int i181 = -(-(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                    int i182 = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                    java.lang.Object[] objArr41 = new java.lang.Object[1];
                                    k((char) ((i181 & 5604) + (i181 | 5604)), ((i182 | 496) << 1) - (i182 ^ 496), 2 - android.view.View.resolveSize(0, 0), objArr41);
                                    useDelimiter2 = scanner2.useDelimiter((java.lang.String) objArr41[0]);
                                    if (useDelimiter2.hasNext()) {
                                        str24 = str42;
                                    } else {
                                        com.facetec.sdk.ou.d();
                                        str24 = useDelimiter2.next();
                                    }
                                    useDelimiter2.close();
                                } catch (java.io.IOException unused2) {
                                }
                                if (str24.contains(str6)) {
                                    int i183 = l;
                                    int i184 = (i183 ^ 65) + ((i183 & 65) << 1);
                                    int i185 = i184 % 128;
                                    n = i185;
                                    if (i184 % 2 == 0) {
                                        l = (i185 + 75) % 128;
                                        i18 = (i13 & (-252)) | (i16 & 251);
                                        int i186 = (~(i13 & i179)) & (i13 | i179);
                                        int i187 = (i186 | (-i186)) >> 31;
                                        int i188 = (i179 & i187) | (i18 & (~i187));
                                        java.lang.Object[] objArr42 = new java.lang.Object[1];
                                        k((char) (0 - (~android.text.TextUtils.indexOf(str42, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0))), (android.os.Process.myTid() >> 22) + 640, 23 - (~(-(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)))), objArr42);
                                        java.lang.Object[] objArr43 = {(java.lang.String) objArr42[0]};
                                        d2 = com.facetec.sdk.al.d(1590238701);
                                        if (d2 == null) {
                                            char absoluteGravity3 = (char) android.view.Gravity.getAbsoluteGravity(0, 0);
                                            float length8 = android.graphics.PointF.length(0.0f, 0.0f);
                                            long packedPositionForChild2 = android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
                                            byte length9 = (byte) $$a.length;
                                            byte b14 = (byte) (length9 - 5);
                                            java.lang.Object[] objArr44 = new java.lang.Object[1];
                                            m(length9, b14, (byte) (b14 + 1), objArr44);
                                            d2 = com.facetec.sdk.al.c(absoluteGravity3, (length8 > 0.0f ? 1 : (length8 == 0.0f ? 0 : -1)) + 2078, 23 - (packedPositionForChild2 > 0L ? 1 : (packedPositionForChild2 == 0L ? 0 : -1)), -114923755, false, (java.lang.String) objArr44[0], new java.lang.Class[]{java.lang.String.class});
                                        }
                                        java.lang.String lowerCase = ((java.lang.String) ((java.lang.reflect.Method) d2).invoke(null, objArr43)).toLowerCase();
                                        int i189 = -android.os.Process.getGidForName(str42);
                                        int i190 = -((android.os.Process.getThreadPriority(0) + 20) >> 6);
                                        java.lang.Object[] objArr45 = new java.lang.Object[1];
                                        k((char) ((i189 & 22821) + (i189 | 22821)), ((i190 | 663) << 1) - (i190 ^ 663), 4 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr45);
                                        int i191 = i13 ^ i188;
                                        int i192 = -i191;
                                        int i193 = ((i191 ^ i192) | (i191 & i192)) >> 31;
                                        int i194 = (!lowerCase.contains((java.lang.String) objArr45[0]) ? (~(i13 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE)) & (i13 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE) : i13) & (~i193);
                                        int i195 = i188 & i193;
                                        int i196 = (i195 ^ i194) | (i195 & i194);
                                        java.lang.Object[] objArr46 = new java.lang.Object[1];
                                        k((char) ((-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))) - 1), 666 - (~(-(android.view.ViewConfiguration.getFadingEdgeLength() >> 16))), 41 - (~android.view.KeyEvent.normalizeMetaState(0)), objArr46);
                                        java.lang.String str44 = (java.lang.String) objArr46[0];
                                        char red3 = (char) android.graphics.Color.red(0);
                                        int capsMode = android.text.TextUtils.getCapsMode(str42, 0, 0);
                                        java.lang.Object[] objArr47 = new java.lang.Object[1];
                                        k(red3, (capsMode ^ 709) + ((capsMode & 709) << 1), 39 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr47);
                                        java.lang.String str45 = (java.lang.String) objArr47[0];
                                        int i197 = -android.text.TextUtils.lastIndexOf(str42, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                        char c12 = (char) ((~i197) + (i197 << 1));
                                        int offsetAfter = android.text.TextUtils.getOffsetAfter(str42, 0);
                                        int i198 = (offsetAfter * 960) - 1435833;
                                        int i199 = ~((i16 ^ (-750)) | (i16 & (-750)));
                                        int i200 = ~((offsetAfter ^ i13) | (offsetAfter & i13));
                                        int i201 = ((i199 ^ i200) | (i199 & i200)) * 959;
                                        int i202 = ((i198 | i201) << 1) - (i198 ^ i201);
                                        int i203 = ~((i13 ^ (-750)) | (i13 & (-750)));
                                        int i204 = ~((offsetAfter ^ i16) | (offsetAfter & i16));
                                        int i205 = -(-(((i203 ^ i204) | (i204 & i203)) * 959));
                                        int i206 = -android.widget.ExpandableListView.getPackedPositionType(0L);
                                        java.lang.Object[] objArr48 = new java.lang.Object[1];
                                        k(c12, (((719250 ^ i202) + ((i202 & 719250) << 1)) - (~i205)) - 1, (i206 ^ 27) + ((i206 & 27) << 1), objArr48);
                                        java.lang.String str46 = (java.lang.String) objArr48[0];
                                        int i207 = -android.view.View.getDefaultSize(0, 0);
                                        int i208 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                                        int i209 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                        int d16 = com.facetec.sdk.ou.d();
                                        int i210 = ~i209;
                                        int i211 = ~((i210 ^ 27) | (i210 & 27));
                                        int i212 = ~((~d16) | i209);
                                        int i213 = ~((i210 ^ (-28)) | (i210 & (-28)));
                                        java.lang.Object[] objArr49 = new java.lang.Object[1];
                                        k((char) (((56229 | i207) << 1) - (i207 ^ 56229)), (i208 ^ 776) + ((i208 & 776) << 1), ((((((i209 * 375) - 20169) - (~(((i212 & i211) | (i211 ^ i212)) * (-374)))) - 1) + ((~((i209 & (-28)) | (i209 ^ (-28)))) * 748)) - (~(-(-(((i213 ^ i212) | (i213 & i212)) * 374))))) - 1, objArr49);
                                        java.lang.String str47 = (java.lang.String) objArr49[0];
                                        int i214 = (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                        int touchSlop2 = android.view.ViewConfiguration.getTouchSlop();
                                        int i215 = -(-(android.os.Process.myTid() >> 22));
                                        java.lang.Object[] objArr50 = new java.lang.Object[1];
                                        k((char) ((41877 & i214) + (i214 | 41877)), 803 - (touchSlop2 >> 8), (i215 ^ 27) + ((i215 & 27) << 1), objArr50);
                                        java.lang.String str48 = (java.lang.String) objArr50[0];
                                        int i216 = -android.graphics.Color.rgb(0, 0, 0);
                                        double convertQuartSecToDecDegrees = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
                                        int i217 = -(-android.text.TextUtils.lastIndexOf(str42, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                        java.lang.Object[] objArr51 = new java.lang.Object[1];
                                        k((char) (((-16750736) & i216) + (i216 | (-16750736))), 829 - (~(convertQuartSecToDecDegrees > 0.0d ? 1 : (convertQuartSecToDecDegrees == 0.0d ? 0 : -1))), (i217 & 28) + (i217 | 28), objArr51);
                                        java.lang.String[] strArr19 = {str44, str45, str46, str47, str48, (java.lang.String) objArr51[0]};
                                        i19 = 0;
                                        while (true) {
                                            if (i19 < 6) {
                                                i20 = i13;
                                                break;
                                            }
                                            java.lang.Object[] objArr52 = {strArr19[i19]};
                                            java.lang.Object d17 = com.facetec.sdk.al.d(1590238701);
                                            if (d17 == null) {
                                                char myPid = (char) (android.os.Process.myPid() >> 22);
                                                float scrollFriction2 = android.view.ViewConfiguration.getScrollFriction();
                                                int jumpTapTimeout2 = android.view.ViewConfiguration.getJumpTapTimeout();
                                                byte length10 = (byte) $$a.length;
                                                byte b15 = (byte) (length10 - 5);
                                                java.lang.Object[] objArr53 = new java.lang.Object[1];
                                                m(length10, b15, (byte) (b15 + 1), objArr53);
                                                d17 = com.facetec.sdk.al.c(myPid, 2079 - (scrollFriction2 > 0.0f ? 1 : (scrollFriction2 == 0.0f ? 0 : -1)), (jumpTapTimeout2 >> 16) + 24, -114923755, false, (java.lang.String) objArr53[0], new java.lang.Class[]{java.lang.String.class});
                                            }
                                            java.lang.String str49 = (java.lang.String) ((java.lang.reflect.Method) d17).invoke(null, objArr52);
                                            if (str49 != null && str49.length() != 0) {
                                                int i218 = l;
                                                n = ((i218 ^ 121) + ((i218 & 121) << 1)) % 128;
                                                i20 = (i13 & (-266)) | (i16 & com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE);
                                                break;
                                            }
                                            i19 = ((i19 ^ 67) + ((i19 & 67) << 1)) - 66;
                                        }
                                        int i219 = (~(i13 & i196)) & (i13 | i196);
                                        int i220 = -i219;
                                        int i221 = ((i219 ^ i220) | (i219 & i220)) >> 31;
                                        int i222 = i20 & (~i221);
                                        int i223 = i196 & i221;
                                        int i224 = (i223 ^ i222) | (i222 & i223);
                                        int i225 = -(-(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                        int i226 = (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                        int i227 = (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                        java.lang.Object[] objArr54 = new java.lang.Object[1];
                                        k((char) ((34835 & i225) + (i225 | 34835)), ((i226 | 617) << 1) - (i226 ^ 617), (i227 ^ 16) + ((i227 & 16) << 1), objArr54);
                                        java.lang.String str50 = (java.lang.String) objArr54[0];
                                        int i228 = -android.graphics.Color.alpha(0);
                                        int threadPriority = android.os.Process.getThreadPriority(0);
                                        int i229 = -(-((((threadPriority | 20) << 1) - (threadPriority ^ 20)) >> 6));
                                        int capsMode2 = android.text.TextUtils.getCapsMode(str42, 0, 0);
                                        java.lang.Object[] objArr55 = new java.lang.Object[1];
                                        k((char) (((i228 | 6890) << 1) - (i228 ^ 6890)), (i229 ^ 857) + ((i229 & 857) << 1), (capsMode2 ^ 6) + ((capsMode2 & 6) << 1), objArr55);
                                        str7 = (java.lang.String) objArr55[0];
                                        file2 = new java.io.File(str50);
                                        if (file2.exists() && file2.isFile()) {
                                            try {
                                                java.util.Scanner scanner3 = new java.util.Scanner(new java.io.FileInputStream(file2));
                                                int red4 = android.graphics.Color.red(0);
                                                int lastIndexOf4 = android.text.TextUtils.lastIndexOf(str42, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                java.lang.Object[] objArr56 = new java.lang.Object[1];
                                                k((char) ((red4 & 5604) + (red4 | 5604)), (lastIndexOf4 ^ 498) + ((lastIndexOf4 & 498) << 1), 0 - (~(-(-(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))))), objArr56);
                                                java.util.Scanner useDelimiter4 = scanner3.useDelimiter((java.lang.String) objArr56[0]);
                                                next = !useDelimiter4.hasNext() ? useDelimiter4.next() : str42;
                                                useDelimiter4.close();
                                            } catch (java.io.IOException unused3) {
                                            }
                                            if (next.contains(str7)) {
                                                n = (l + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                                                i21 = (~(i13 & com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE)) & (i13 | com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE);
                                                int i230 = (~(i13 & i224)) & (i13 | i224);
                                                int i231 = (i230 | (-i230)) >> 31;
                                                int i232 = (i224 & i231) | (i21 & (~i231));
                                                if ((i3 & 8) != 0) {
                                                    int doubleTapTimeout2 = android.view.ViewConfiguration.getDoubleTapTimeout() >> 16;
                                                    int i233 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
                                                    int jumpTapTimeout3 = android.view.ViewConfiguration.getJumpTapTimeout() >> 16;
                                                    int i234 = (jumpTapTimeout3 * (-129)) + 5633;
                                                    int i235 = i16 | (-44);
                                                    int i236 = (~((i235 ^ jumpTapTimeout3) | (i235 & jumpTapTimeout3))) * 130;
                                                    int i237 = (jumpTapTimeout3 ^ (-44)) | (jumpTapTimeout3 & (-44));
                                                    int i238 = ((((i234 | i236) << 1) - (i234 ^ i236)) - (~((~i237) * (-260)))) - 1;
                                                    int i239 = ~((~jumpTapTimeout3) | 43);
                                                    int i240 = ~(i237 | i13);
                                                    int i241 = ((i239 ^ i240) | (i239 & i240)) * 130;
                                                    java.lang.Object[] objArr57 = new java.lang.Object[1];
                                                    k((char) (((doubleTapTimeout2 | 30105) << 1) - (doubleTapTimeout2 ^ 30105)), (i233 ^ 885) + ((i233 & 885) << 1), (i238 & i241) + (i241 | i238), objArr57);
                                                    java.lang.String str51 = (java.lang.String) objArr57[0];
                                                    char c13 = (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                    byte modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                                                    int i242 = -(-(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                                    java.lang.Object[] objArr58 = new java.lang.Object[1];
                                                    k(c13, 927 - modifierMetaStateMask, (i242 ^ 40) + ((i242 & 40) << 1), objArr58);
                                                    java.lang.String str52 = (java.lang.String) objArr58[0];
                                                    java.lang.Object[] objArr59 = new java.lang.Object[1];
                                                    k((char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 968 - android.graphics.ImageFormat.getBitsPerPixel(0), 38 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr59);
                                                    java.lang.String[] strArr20 = {str51, str52, (java.lang.String) objArr59[0]};
                                                    int i243 = 0;
                                                    while (true) {
                                                        if (i243 >= 3) {
                                                            str10 = str42;
                                                            i46 = i13;
                                                            break;
                                                        }
                                                        java.lang.Object[] objArr60 = {strArr20[i243]};
                                                        java.lang.Object d18 = com.facetec.sdk.al.d(1873189073);
                                                        if (d18 == null) {
                                                            char windowTouchSlop2 = (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 6935);
                                                            int resolveSizeAndState = android.view.View.resolveSizeAndState(0, 0, 0);
                                                            int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                                            byte b16 = (byte) 3;
                                                            byte b17 = (byte) (b16 - 4);
                                                            java.lang.Object[] objArr61 = new java.lang.Object[1];
                                                            m(b16, b17, (byte) (b17 + 1), objArr61);
                                                            d18 = com.facetec.sdk.al.c(windowTouchSlop2, resolveSizeAndState + 2389, 23 - makeMeasureSpec2, -934682071, false, (java.lang.String) objArr61[0], new java.lang.Class[]{java.lang.String.class});
                                                        }
                                                        long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) d18).invoke(null, objArr60)).longValue();
                                                        long j52 = -654357215;
                                                        long j53 = 46;
                                                        long j54 = longValue7 ^ j27;
                                                        str10 = str42;
                                                        int i244 = i243;
                                                        long maxMemory = (int) java.lang.Runtime.getRuntime().maxMemory();
                                                        long j55 = maxMemory ^ j27;
                                                        long j56 = (j53 * j52) + (j53 * longValue7) + ((-90) * (((j54 | j55) ^ j27) | j52)) + ((-45) * (((longValue7 | j52) ^ j27) | ((j54 | maxMemory) ^ j27))) + (45 * (j54 | ((maxMemory | (j52 ^ j27)) ^ j27) | ((j55 | j52) ^ j27))) + 1591436858;
                                                        int i245 = ((int) (j56 >> 32)) & ((((((~((-583322096) | i16)) | 16452) | (~(853904315 | i16))) * 464) - 1861642390) + (((-583305644) | i13) * (-464)) + (((~(853904315 | i13)) | 16452) * 464));
                                                        int i246 = ((int) j56) & ((((((~((-721866883) | i16)) | (-2135874004)) | (~(1867436499 | i13))) * (-68)) - 952667951) + ((~((-268437505) | i16)) * (-68)) + (((~((-1867436500) | i16)) | (-990304387)) * 68));
                                                        if (((i246 ^ i245) | (i245 & i246)) != 0) {
                                                            i46 = i13 ^ (i244 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE);
                                                            break;
                                                        }
                                                        i243 = i244 + 1;
                                                        str42 = str10;
                                                    }
                                                    int i247 = (~(i13 & i232)) & (i13 | i232);
                                                    int i248 = (i247 | (-i247)) >> 31;
                                                    int i249 = i46 & (~i248);
                                                    int i250 = i232 & i248;
                                                    i232 = (i250 ^ i249) | (i249 & i250);
                                                } else {
                                                    str10 = str42;
                                                }
                                                char doubleTapTimeout3 = (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 60923);
                                                int myPid2 = android.os.Process.myPid() >> 22;
                                                int i251 = myPid2 * (-159);
                                                int i252 = ((-160113) ^ i251) + ((i251 & (-160113)) << 1);
                                                int i253 = ~myPid2;
                                                int i254 = ((i253 ^ 1007) | (i253 & 1007)) * 160;
                                                int i255 = ~((i16 & (-1008)) | (i16 ^ (-1008)));
                                                java.lang.Object[] objArr62 = new java.lang.Object[1];
                                                k(doubleTapTimeout3, (((((i252 | i254) << 1) - (i254 ^ i252)) + (((~((i16 ^ myPid2) | (i16 & myPid2))) | (~((myPid2 ^ 1007) | (myPid2 & 1007)))) * (-160))) - (~(((myPid2 ^ i255) | (myPid2 & i255)) * 160))) - 1, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 41, objArr62);
                                                java.lang.String str53 = (java.lang.String) objArr62[0];
                                                str11 = str10;
                                                char lastIndexOf5 = (char) (55784 - android.text.TextUtils.lastIndexOf(str11, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                                int packedPositionType2 = android.widget.ExpandableListView.getPackedPositionType(0L);
                                                int i256 = -(-android.graphics.Color.blue(0));
                                                java.lang.Object[] objArr63 = new java.lang.Object[1];
                                                k(lastIndexOf5, (packedPositionType2 ^ 1048) + ((packedPositionType2 & 1048) << 1), ((i256 | 30) << 1) - (i256 ^ 30), objArr63);
                                                strArr = new java.lang.String[]{str53, (java.lang.String) objArr63[0]};
                                                i22 = 0;
                                                while (true) {
                                                    if (i22 < 2) {
                                                        i23 = i16;
                                                        str12 = str11;
                                                        i24 = i13;
                                                        break;
                                                    }
                                                    java.lang.Object[] objArr64 = {strArr[i22]};
                                                    java.lang.Object d19 = com.facetec.sdk.al.d(1450487247);
                                                    if (d19 == null) {
                                                        char indexOf5 = (char) (6935 - android.text.TextUtils.indexOf(str11, str11));
                                                        int size2 = android.view.View.MeasureSpec.getSize(0);
                                                        int size3 = android.view.View.MeasureSpec.getSize(0);
                                                        byte b18 = (byte) ($$b & 3);
                                                        byte b19 = (byte) (-b18);
                                                        java.lang.Object[] objArr65 = new java.lang.Object[1];
                                                        m(b18, b19, (byte) (b19 + 1), objArr65);
                                                        d19 = com.facetec.sdk.al.c(indexOf5, size2 + 2389, size3 + 23, -241445065, false, (java.lang.String) objArr65[0], new java.lang.Class[]{java.lang.String.class});
                                                    }
                                                    long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) d19).invoke(null, objArr64)).longValue();
                                                    long j57 = 1163675982;
                                                    strArr12 = strArr;
                                                    i23 = i16;
                                                    long j58 = 959;
                                                    long j59 = longValue8 ^ j27;
                                                    str12 = str11;
                                                    long myPid3 = android.os.Process.myPid();
                                                    long j60 = myPid3 ^ j27;
                                                    long j61 = (960 * j57) + ((-1917) * longValue8) + ((((j59 | j60) ^ j27) | ((j57 | myPid3) ^ j27)) * j58) + ((-959) * j59) + ((((j59 | myPid3) ^ j27) | ((j60 | j57) ^ j27)) * j58) + 687500659;
                                                    int elapsedCpuTime2 = (int) android.os.Process.getElapsedCpuTime();
                                                    int nextInt4 = new java.util.Random().nextInt();
                                                    if (((((int) (j61 >> 32)) & ((((~((~elapsedCpuTime2) | 1001575090)) | (-1856165795)) * (-235)) + 1770718743 + (((~(1001575090 | elapsedCpuTime2)) | (-1856165795)) * (-470)) + (((~(elapsedCpuTime2 | (-1140851969))) | 286261264) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE))) | (((int) j61) & (((~((~nextInt4) | (-432215573))) * (-116)) + 2072280017 + (((-434313110) | nextInt4) * 116) + (((~(nextInt4 | 1002913300)) | (-1005010838)) * 116)))) != 0) {
                                                        i24 = (i22 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE) ^ i13;
                                                        break;
                                                    }
                                                    int i257 = (i22 ^ (-122)) + ((i22 & (-122)) << 1);
                                                    i22 = (i257 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i257 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1);
                                                    strArr = strArr12;
                                                    str11 = str12;
                                                    i16 = i23;
                                                }
                                                int i258 = ((~i232) & i13) | (i232 & i23);
                                                int i259 = (i258 | (-i258)) >> 31;
                                                int i260 = i24 & (~i259);
                                                int i261 = i232 & i259;
                                                int i262 = (i261 ^ i260) | (i261 & i260);
                                                d3 = com.facetec.sdk.al.d(-1270134912);
                                                if (d3 == null) {
                                                    char mirror = (char) (45198 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                                    int trimmedLength = android.text.TextUtils.getTrimmedLength(str12);
                                                    int packedPositionGroup4 = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                                    byte b20 = (byte) 0;
                                                    byte b21 = (byte) (b20 - 1);
                                                    java.lang.Object[] objArr66 = new java.lang.Object[1];
                                                    m(b20, b21, (byte) (b21 + 1), objArr66);
                                                    d3 = com.facetec.sdk.al.c(mirror, 2150 - trimmedLength, packedPositionGroup4 + 24, 329530744, false, (java.lang.String) objArr66[0], new java.lang.Class[0]);
                                                }
                                                long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, null)).longValue();
                                                long j62 = -1817303566;
                                                long j63 = 302;
                                                long j64 = -301;
                                                long j65 = longValue9 ^ j27;
                                                long j66 = 301;
                                                j2 = ((((((-300) * j62) + (j63 * longValue9)) + ((((longValue9 | j62) | j) ^ j27) * j64)) + ((((j65 | j) ^ j27) | ((j30 | j62) ^ j27)) * j64)) + (((((j62 ^ j27) | j) ^ j27) | j65) * j66)) - 7618927;
                                                myTid = android.os.Process.myTid();
                                                if (((((int) (j2 >> 32)) & ((((((~myTid) | (-362123669)) * 1444) - 1153123274) + ((((~(myTid | (-1593085285))) | 1247808608) | (~((-1264655601) | myTid))) * (-1444))) - 539716760)) | (((int) j2) & (((((~(i23 | 678904824)) | (-2116131235)) * (-328)) - 261639415) + (((-2116131235) | i13) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((~((-678904825) | i13)) | 5653080 | (~(i23 | (-1442879491)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE)))) == 1) {
                                                    java.lang.Object[] objArr67 = {1};
                                                    java.lang.Object d20 = com.facetec.sdk.al.d(-1836228463);
                                                    if (d20 == null) {
                                                        char rgb = (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216);
                                                        int doubleTapTimeout4 = android.view.ViewConfiguration.getDoubleTapTimeout();
                                                        char mirror2 = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                        byte b22 = (byte) 3;
                                                        byte b23 = (byte) (b22 - 4);
                                                        j3 = j66;
                                                        java.lang.Object[] objArr68 = new java.lang.Object[1];
                                                        m(b22, b23, (byte) (b23 + 1), objArr68);
                                                        d20 = com.facetec.sdk.al.c(rgb, (doubleTapTimeout4 >> 16) + 455, mirror2 - 24, 895621737, false, (java.lang.String) objArr68[0], new java.lang.Class[]{java.lang.Integer.TYPE});
                                                    } else {
                                                        j3 = j66;
                                                    }
                                                    long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) d20).invoke(null, objArr67)).longValue();
                                                    long j67 = -986569598;
                                                    long j68 = longValue10 ^ j27;
                                                    long j69 = 676;
                                                    long j70 = (((((677 * j67) + ((-675) * longValue10)) + ((-676) * ((j67 | j) | j68))) + ((((j68 | j67) ^ j27) | ((j30 | j67) ^ j27)) * j69)) + (j69 * ((((longValue10 | j67) | j) ^ j27) | ((((j67 ^ j27) | j68) ^ j27) | ((j68 | j30) ^ j27))))) - 383958007;
                                                    int i263 = ((int) (j70 >> 32)) & ((((~(359993291 | i13)) | 1779064884) * 336) + 501358106 + (((~(1797219702 | i13)) | 341838473) * (-168)) + (((~(i23 | 1797219702)) | 359993291) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
                                                    int i264 = ((int) j70) & (((~(969317471 | i13)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) + 1899352813 + ((i23 | (-1074332065)) * (-216)) + (((~(i23 | 969317471)) | 1888423414) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE));
                                                    int i265 = ((i263 ^ i264) | (i263 & i264)) != 0 ? (~(i13 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)) & (i13 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) : i13;
                                                    int i266 = (~(i13 & i262)) & (i13 | i262);
                                                    int i267 = (i266 | (-i266)) >> 31;
                                                    int i268 = (i262 & i267) | (i265 & (~i267));
                                                    java.lang.Object[] objArr69 = new java.lang.Object[1];
                                                    k((char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 639, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 23, objArr69);
                                                    java.lang.Object[] objArr70 = {(java.lang.String) objArr69[0]};
                                                    java.lang.Object d21 = com.facetec.sdk.al.d(1590238701);
                                                    if (d21 == null) {
                                                        char c14 = (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                                        int touchSlop3 = android.view.ViewConfiguration.getTouchSlop();
                                                        int longPressTimeout3 = android.view.ViewConfiguration.getLongPressTimeout();
                                                        byte length11 = (byte) $$a.length;
                                                        byte b24 = (byte) (length11 - 5);
                                                        java.lang.Object[] objArr71 = new java.lang.Object[1];
                                                        m(length11, b24, (byte) (b24 + 1), objArr71);
                                                        d21 = com.facetec.sdk.al.c(c14, 2078 - (touchSlop3 >> 8), 24 - (longPressTimeout3 >> 16), -114923755, false, (java.lang.String) objArr71[0], new java.lang.Class[]{java.lang.String.class});
                                                    }
                                                    java.lang.Object invoke2 = ((java.lang.reflect.Method) d21).invoke(null, objArr70);
                                                    try {
                                                        if (invoke2 != null) {
                                                            n = (l + 19) % 128;
                                                            java.lang.Object[] objArr72 = {invoke2, 42};
                                                            java.lang.Object d22 = com.facetec.sdk.al.d(-582857820);
                                                            if (d22 == null) {
                                                                str23 = str12;
                                                                char offsetBefore2 = (char) android.text.TextUtils.getOffsetBefore(str23, 0);
                                                                int touchSlop4 = android.view.ViewConfiguration.getTouchSlop();
                                                                int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(0L);
                                                                byte b25 = (byte) 3;
                                                                byte b26 = (byte) (b25 - 4);
                                                                java.lang.Object[] objArr73 = new java.lang.Object[1];
                                                                m(b25, b26, (byte) (b26 + 1), objArr73);
                                                                c = 2;
                                                                d22 = com.facetec.sdk.al.c(offsetBefore2, 2365 - (touchSlop4 >> 8), packedPositionChild + 25, 2058170716, false, (java.lang.String) objArr73[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                                            } else {
                                                                str23 = str12;
                                                                c = 2;
                                                            }
                                                            long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) d22).invoke(null, objArr72)).longValue();
                                                            long j71 = -499588837;
                                                            str12 = str23;
                                                            long j72 = j71 ^ j27;
                                                            long j73 = (j63 * j71) + (603 * longValue11) + ((-602) * (((j72 | j30) ^ j27) | longValue11)) + ((((j72 | (longValue11 ^ j27)) ^ j27) | ((j72 | j) ^ j27) | (((j30 | j71) | longValue11) ^ j27)) * j64) + (((j30 | longValue11) ^ j27) * j3) + 1658786235;
                                                            int elapsedRealtime = (int) android.os.SystemClock.elapsedRealtime();
                                                            int i269 = ~elapsedRealtime;
                                                            int i270 = ((int) (j73 >> 32)) & ((((((~(i269 | 1069236430)) | 1073752320) | (~((-1788504455) | i269))) * 464) - 1590654934) + ((2142988750 | elapsedRealtime) * (-464)) + (((~(elapsedRealtime | (-1788504455))) | 1073752320) * 464));
                                                            int i271 = ~(576198579 | i13);
                                                            int i272 = ((int) j73) & ((((~(i23 | (-39326371))) | (~((-2013424990) | i13))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) + 578248653 + (((~(i23 | 2013424989)) | i271) * (-1040)) + ((i271 | (~(i23 | (-576198580))) | (-2052751360)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL));
                                                            if (((i270 ^ i272) | (i270 & i272)) == 1986687685) {
                                                                i27 = i13;
                                                                str13 = str12;
                                                                c2 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                                                                strArr3 = null;
                                                                long j74 = j;
                                                                j4 = j27;
                                                                j5 = j74;
                                                                int i273 = -android.text.AndroidCharacter.getMirror(c2);
                                                                int i274 = -(-(android.view.ViewConfiguration.getEdgeSlop() >> 16));
                                                                java.lang.Object[] objArr74 = new java.lang.Object[1];
                                                                k((char) ((i273 & 8896) + (i273 | 8896)), (i274 & 1159) + (i274 | 1159), 16 - (~android.text.TextUtils.lastIndexOf(str13, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr74);
                                                                java.lang.Object[] objArr75 = {(java.lang.String) objArr74[0]};
                                                                d4 = com.facetec.sdk.al.d(1590238701);
                                                                if (d4 == null) {
                                                                    char defaultSize2 = (char) android.view.View.getDefaultSize(0, 0);
                                                                    byte modifierMetaStateMask2 = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                                                                    int packedPositionType3 = android.widget.ExpandableListView.getPackedPositionType(0L);
                                                                    byte length12 = (byte) $$a.length;
                                                                    byte b27 = (byte) (length12 - 5);
                                                                    java.lang.Object[] objArr76 = new java.lang.Object[1];
                                                                    m(length12, b27, (byte) (b27 + 1), objArr76);
                                                                    d4 = com.facetec.sdk.al.c(defaultSize2, modifierMetaStateMask2 + com.google.common.base.Ascii.US, packedPositionType3 + 24, -114923755, false, (java.lang.String) objArr76[0], new java.lang.Class[]{java.lang.String.class});
                                                                }
                                                                invoke = ((java.lang.reflect.Method) d4).invoke(null, objArr75);
                                                                if (invoke != null) {
                                                                    strArr6 = strArr3;
                                                                    i33 = 0;
                                                                } else {
                                                                    java.lang.Object[] objArr77 = {invoke, 42};
                                                                    java.lang.Object d23 = com.facetec.sdk.al.d(-582857820);
                                                                    if (d23 == null) {
                                                                        char trimmedLength2 = (char) android.text.TextUtils.getTrimmedLength(str13);
                                                                        int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay();
                                                                        int red5 = android.graphics.Color.red(0);
                                                                        byte b28 = (byte) 3;
                                                                        byte b29 = (byte) (b28 - 4);
                                                                        java.lang.Object[] objArr78 = new java.lang.Object[1];
                                                                        m(b28, b29, (byte) (b29 + 1), objArr78);
                                                                        d23 = com.facetec.sdk.al.c(trimmedLength2, (keyRepeatDelay >> 16) + 2365, red5 + 24, 2058170716, false, (java.lang.String) objArr78[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                                                    }
                                                                    long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) d23).invoke(null, objArr77)).longValue();
                                                                    long j75 = -702674626;
                                                                    long j76 = -103;
                                                                    long j77 = 104;
                                                                    long j78 = longValue12 ^ j4;
                                                                    strArr6 = strArr3;
                                                                    long freeMemory3 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                                                    long j79 = (j76 * j75) + (j76 * longValue12) + (((((j75 ^ j4) | j78) ^ j4) | ((j78 | freeMemory3) ^ j4)) * j77) + ((-104) * ((longValue12 | ((freeMemory3 ^ j4) | j75)) ^ j4)) + (j77 * (j75 | freeMemory3)) + 1861872024;
                                                                    int elapsedCpuTime3 = (int) android.os.Process.getElapsedCpuTime();
                                                                    int i275 = ~elapsedCpuTime3;
                                                                    int i276 = ((int) (j79 >> 32)) & ((((~(2062146715 | i275)) | (~(795594169 | elapsedCpuTime3))) * (-370)) + 635053406 + (((~(elapsedCpuTime3 | 2062146715)) | (~(i275 | 795594169)) | 711576729) * (-370)) + 1290384674);
                                                                    int myPid4 = android.os.Process.myPid();
                                                                    int i277 = ((int) j79) & (((((~((-5251329) | myPid4)) | (-1996423135)) * 449) - 2008459885) + (((~((~myPid4) | (-5251329))) | (-1996423135)) * 449));
                                                                    i33 = (i277 ^ i276) | (i276 & i277);
                                                                }
                                                                if (i33 != 1986687685 || i33 == -1514516938) {
                                                                    str17 = str13;
                                                                    i34 = i268;
                                                                } else {
                                                                    int i278 = -(-(android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                                                                    int trimmedLength3 = android.text.TextUtils.getTrimmedLength(str13);
                                                                    int minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                                                    java.lang.Object[] objArr79 = new java.lang.Object[1];
                                                                    k((char) ((i278 ^ 29263) + ((i278 & 29263) << 1)), 1878 - trimmedLength3, (minimumFlingVelocity ^ 14) + ((minimumFlingVelocity & 14) << 1), objArr79);
                                                                    java.lang.String str54 = (java.lang.String) objArr79[0];
                                                                    char argb = (char) android.graphics.Color.argb(0, 0, 0, 0);
                                                                    int i279 = -android.text.TextUtils.lastIndexOf(str13, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                                    int maxKeyCode2 = android.view.KeyEvent.getMaxKeyCode() >> 16;
                                                                    java.lang.Object[] objArr80 = new java.lang.Object[1];
                                                                    k(argb, 1890 - (~i279), ((maxKeyCode2 | 26) << 1) - (maxKeyCode2 ^ 26), objArr80);
                                                                    java.lang.String str55 = (java.lang.String) objArr80[0];
                                                                    char minimumFlingVelocity2 = (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16310);
                                                                    int i280 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                                    int i281 = -(-(android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                                                    java.lang.Object[] objArr81 = new java.lang.Object[1];
                                                                    k(minimumFlingVelocity2, (i280 & 1918) + (i280 | 1918), (i281 & 17) + (i281 | 17), objArr81);
                                                                    java.lang.String str56 = (java.lang.String) objArr81[0];
                                                                    int i282 = -(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                                    int i283 = -(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                                    int indexOf6 = android.text.TextUtils.indexOf(str13, str13);
                                                                    java.lang.Object[] objArr82 = new java.lang.Object[1];
                                                                    k((char) (((i282 | 27880) << 1) - (i282 ^ 27880)), (i283 ^ 1935) + ((i283 & 1935) << 1), (indexOf6 ^ 17) + ((indexOf6 & 17) << 1), objArr82);
                                                                    java.lang.String str57 = (java.lang.String) objArr82[0];
                                                                    int i284 = -(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                                    int i285 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                    int i286 = -(-(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                                                    java.lang.Object[] objArr83 = new java.lang.Object[1];
                                                                    k((char) (((i284 | 18612) << 1) - (i284 ^ 18612)), (i285 ^ 1952) + ((i285 & 1952) << 1), (i286 ^ 15) + ((i286 & 15) << 1), objArr83);
                                                                    java.lang.String str58 = (java.lang.String) objArr83[0];
                                                                    java.lang.Object[] objArr84 = new java.lang.Object[1];
                                                                    k((char) ((-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))) - 1), android.text.TextUtils.indexOf(str13, str13, 0) + 1967, 37 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr84);
                                                                    java.lang.String str59 = (java.lang.String) objArr84[0];
                                                                    char normalizeMetaState = (char) android.view.KeyEvent.normalizeMetaState(0);
                                                                    int i287 = -(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                                    java.lang.Object[] objArr85 = new java.lang.Object[1];
                                                                    k(normalizeMetaState, ((i287 | androidx.media3.common.PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND) << 1) - (i287 ^ androidx.media3.common.PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND), 12 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr85);
                                                                    java.lang.String str60 = (java.lang.String) objArr85[0];
                                                                    int i288 = -(-android.view.KeyEvent.getDeadChar(0, 0));
                                                                    int i289 = -android.view.KeyEvent.getDeadChar(0, 0);
                                                                    java.lang.Object[] objArr86 = new java.lang.Object[1];
                                                                    k((char) (((i288 | 24994) << 1) - (i288 ^ 24994)), (i289 ^ 2016) + ((i289 & 2016) << 1), 13 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr86);
                                                                    java.lang.String str61 = (java.lang.String) objArr86[0];
                                                                    char c15 = (char) ((-2) - (~(-(-(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))))));
                                                                    int i290 = -android.widget.ExpandableListView.getPackedPositionChild(0L);
                                                                    int i291 = -(-(android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                                                                    java.lang.Object[] objArr87 = new java.lang.Object[1];
                                                                    k(c15, 2027 - (~i290), (i291 & 22) + (i291 | 22), objArr87);
                                                                    java.lang.String str62 = (java.lang.String) objArr87[0];
                                                                    char mode2 = (char) android.view.View.MeasureSpec.getMode(0);
                                                                    int i292 = -(-android.widget.ExpandableListView.getPackedPositionType(0L));
                                                                    int i293 = -(-(android.view.KeyEvent.getMaxKeyCode() >> 16));
                                                                    java.lang.Object[] objArr88 = new java.lang.Object[1];
                                                                    k(mode2, (i292 ^ 2051) + ((i292 & 2051) << 1), (i293 ^ 31) + ((i293 & 31) << 1), objArr88);
                                                                    java.lang.String str63 = (java.lang.String) objArr88[0];
                                                                    int windowTouchSlop3 = android.view.ViewConfiguration.getWindowTouchSlop() >> 8;
                                                                    int i294 = -android.widget.ExpandableListView.getPackedPositionChild(0L);
                                                                    int i295 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                                    java.lang.Object[] objArr89 = new java.lang.Object[1];
                                                                    k((char) (((40274 | windowTouchSlop3) << 1) - (windowTouchSlop3 ^ 40274)), ((i294 | 2081) << 1) - (i294 ^ 2081), (i295 & 12) + (i295 | 12), objArr89);
                                                                    java.lang.String str64 = (java.lang.String) objArr89[0];
                                                                    int i296 = -android.widget.ExpandableListView.getPackedPositionChild(0L);
                                                                    java.lang.Object[] objArr90 = new java.lang.Object[1];
                                                                    k((char) ((~i296) + (i296 << 1)), 2095 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 11 - (~(-android.text.TextUtils.getOffsetBefore(str13, 0))), objArr90);
                                                                    java.lang.String str65 = (java.lang.String) objArr90[0];
                                                                    java.lang.Object[] objArr91 = new java.lang.Object[1];
                                                                    k((char) (41364 - (~(-(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))))), 2105 - (~android.text.TextUtils.getOffsetBefore(str13, 0)), 11 - (~(android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), objArr91);
                                                                    java.lang.String str66 = (java.lang.String) objArr91[0];
                                                                    java.lang.Object[] objArr92 = new java.lang.Object[1];
                                                                    k((char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.text.TextUtils.getCapsMode(str13, 0, 0) + 2118, 11 - (~(-(android.view.ViewConfiguration.getWindowTouchSlop() >> 8))), objArr92);
                                                                    java.lang.String str67 = (java.lang.String) objArr92[0];
                                                                    int touchSlop5 = android.view.ViewConfiguration.getTouchSlop() >> 8;
                                                                    int i297 = -(-(android.os.Process.myTid() >> 22));
                                                                    java.lang.Object[] objArr93 = new java.lang.Object[1];
                                                                    k((char) ((touchSlop5 ^ 2236) + ((touchSlop5 & 2236) << 1)), (i297 & 2130) + (i297 | 2130), 11 - (~(-android.view.View.resolveSize(0, 0))), objArr93);
                                                                    java.lang.String str68 = (java.lang.String) objArr93[0];
                                                                    int i298 = -(-android.view.View.resolveSizeAndState(0, 0, 0));
                                                                    int fadingEdgeLength2 = android.view.ViewConfiguration.getFadingEdgeLength() >> 16;
                                                                    java.lang.Object[] objArr94 = new java.lang.Object[1];
                                                                    k((char) ((61368 & i298) + (i298 | 61368)), (fadingEdgeLength2 & 2142) + (fadingEdgeLength2 | 2142), 13 - (~(-android.text.TextUtils.indexOf(str13, str13, 0, 0))), objArr94);
                                                                    java.lang.String str69 = (java.lang.String) objArr94[0];
                                                                    char c16 = (char) (36669 - (~(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16))));
                                                                    int argb2 = android.graphics.Color.argb(0, 0, 0, 0);
                                                                    int indexOf7 = android.text.TextUtils.indexOf(str13, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                                    java.lang.Object[] objArr95 = new java.lang.Object[1];
                                                                    k(c16, 2155 - (~argb2), (indexOf7 & 13) + (indexOf7 | 13), objArr95);
                                                                    java.lang.String str70 = (java.lang.String) objArr95[0];
                                                                    int i299 = -android.text.TextUtils.lastIndexOf(str13, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                                    int d24 = com.facetec.sdk.ou.d();
                                                                    int i300 = ~d24;
                                                                    int i301 = ~(((-61746) & i300) | ((-61746) ^ i300));
                                                                    int i302 = ~(((-61746) & d24) | ((-61746) ^ d24));
                                                                    int i303 = ~((61745 & i299) | (61745 ^ i299));
                                                                    int i304 = ((((i299 * 46) + 2840270) - (~(((i301 ^ i299) | (i301 & i299)) * (-90)))) - 1) + (((i302 & i303) | (i302 ^ i303)) * (-45));
                                                                    int i305 = ~i299;
                                                                    int i306 = ~((d24 ^ i305) | (d24 & i305));
                                                                    int i307 = (i306 ^ (-61746)) | ((-61746) & i306);
                                                                    int i308 = ~((i299 ^ i300) | (i299 & i300));
                                                                    int i309 = -(-(((i308 ^ i307) | (i308 & i307)) * 45));
                                                                    int lastIndexOf6 = android.text.TextUtils.lastIndexOf(str13, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                                    int jumpTapTimeout4 = android.view.ViewConfiguration.getJumpTapTimeout() >> 16;
                                                                    java.lang.Object[] objArr96 = new java.lang.Object[1];
                                                                    k((char) ((i304 ^ i309) + ((i309 & i304) << 1)), ((lastIndexOf6 | 2169) << 1) - (lastIndexOf6 ^ 2169), (jumpTapTimeout4 & 24) + (jumpTapTimeout4 | 24), objArr96);
                                                                    java.lang.String str71 = (java.lang.String) objArr96[0];
                                                                    char c17 = (char) ((-2) - (~(-android.widget.ExpandableListView.getPackedPositionChild(0L))));
                                                                    int keyRepeatDelay2 = android.view.ViewConfiguration.getKeyRepeatDelay();
                                                                    int myPid5 = android.os.Process.myPid() >> 22;
                                                                    java.lang.Object[] objArr97 = new java.lang.Object[1];
                                                                    k(c17, (keyRepeatDelay2 >> 16) + 2192, ((myPid5 | 28) << 1) - (myPid5 ^ 28), objArr97);
                                                                    java.lang.String[] strArr21 = {str54, str55, str56, str57, str58, str59, str60, str61, str62, str63, str64, str65, str66, str67, str68, str69, str70, str71, (java.lang.String) objArr97[0]};
                                                                    int i310 = 0;
                                                                    while (i310 < 19) {
                                                                        int i311 = n + 103;
                                                                        l = i311 % 128;
                                                                        if (i311 % 2 == 0) {
                                                                            str22 = strArr21[i310];
                                                                            java.lang.Object[] objArr98 = {str22};
                                                                            java.lang.Object d25 = com.facetec.sdk.al.d(1450487247);
                                                                            if (d25 == null) {
                                                                                char resolveSize = (char) (6935 - android.view.View.resolveSize(0, 0));
                                                                                int red6 = android.graphics.Color.red(0);
                                                                                long packedPositionForGroup = android.widget.ExpandableListView.getPackedPositionForGroup(0);
                                                                                byte b30 = (byte) ($$b & 3);
                                                                                byte b31 = (byte) (-b30);
                                                                                java.lang.Object[] objArr99 = new java.lang.Object[1];
                                                                                m(b30, b31, (byte) (b31 + 1), objArr99);
                                                                                d25 = com.facetec.sdk.al.c(resolveSize, red6 + 2389, (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)) + 23, -241445065, false, (java.lang.String) objArr99[0], new java.lang.Class[]{java.lang.String.class});
                                                                            }
                                                                            long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) d25).invoke(null, objArr98)).longValue();
                                                                            long j80 = 80257642;
                                                                            long j81 = -518;
                                                                            long j82 = my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE;
                                                                            long j83 = (j80 ^ j4) | j30;
                                                                            long j84 = (j81 * j80) + (j81 * longValue13) + (((j83 ^ j4) | longValue13) * j82) + ((-519) * (((j83 | longValue13) ^ j4) | (((j80 | longValue13) | j5) ^ j4))) + ((((longValue13 | j5) ^ j4) | j80) * j82) + 1770918999;
                                                                            int elapsedRealtime2 = (int) android.os.SystemClock.elapsedRealtime();
                                                                            int i312 = ((int) (j84 >> 60)) & (((~((~elapsedRealtime2) | (-671105035))) * 433) + 709783808 + (((~(1747121423 | elapsedRealtime2)) | 1110619461) * (-433)) + (((~(elapsedRealtime2 | 1110619461)) | 1076016389) * 433));
                                                                            int i313 = ((int) j84) & ((((((~(i23 | (-23640760))) | 6859414) | (~(i23 | 1460867169))) * (-1136)) - 1738041619) + (((~((-23640760) | i27)) | (~(1460867169 | i27)) | (~(i23 | (-1444085825)))) * (-568)) + (((~(i23 | 23640759)) | (~(i23 | (-1460867170))) | (~((-6859415) | i27))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION));
                                                                            if (((i313 ^ i312) | (i312 & i313)) != 0) {
                                                                                i43 = i268;
                                                                                str21 = str13;
                                                                                i45 = i310;
                                                                                i44 = i45;
                                                                                break;
                                                                            }
                                                                            strArr10 = strArr21;
                                                                            i45 = i310;
                                                                            int i314 = -(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                                            int lastIndexOf7 = android.text.TextUtils.lastIndexOf(str13, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                                            objArr = new java.lang.Object[1];
                                                                            k((char) ((61369 & i314) + (i314 | 61369)), (lastIndexOf7 & 2143) + (lastIndexOf7 | 2143), 13 - (~(-(-android.view.Gravity.getAbsoluteGravity(0, 0)))), objArr);
                                                                            if (str22.equals((java.lang.String) objArr[0])) {
                                                                                i43 = i268;
                                                                                str21 = str13;
                                                                                strArr11 = strArr10;
                                                                            } else {
                                                                                java.lang.Object[] objArr100 = {str22};
                                                                                java.lang.Object d26 = com.facetec.sdk.al.d(1873189073);
                                                                                if (d26 == null) {
                                                                                    char longPressTimeout4 = (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 6935);
                                                                                    int axisFromString = android.view.MotionEvent.axisFromString(str13);
                                                                                    int mode3 = android.view.View.MeasureSpec.getMode(0);
                                                                                    byte b32 = (byte) 3;
                                                                                    byte b33 = (byte) (b32 - 4);
                                                                                    java.lang.Object[] objArr101 = new java.lang.Object[1];
                                                                                    m(b32, b33, (byte) (b33 + 1), objArr101);
                                                                                    d26 = com.facetec.sdk.al.c(longPressTimeout4, 2388 - axisFromString, mode3 + 23, -934682071, false, (java.lang.String) objArr101[0], new java.lang.Class[]{java.lang.String.class});
                                                                                }
                                                                                long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) d26).invoke(null, objArr100)).longValue();
                                                                                long j85 = 609750399;
                                                                                int freeMemory4 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                                                                long j86 = androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION;
                                                                                long j87 = j85 ^ j4;
                                                                                strArr11 = strArr10;
                                                                                long j88 = freeMemory4;
                                                                                long j89 = j88 ^ j4;
                                                                                i43 = i268;
                                                                                str21 = str13;
                                                                                long j90 = androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN;
                                                                                long j91 = longValue14 ^ j4;
                                                                                long j92 = j89 | j85;
                                                                                long j93 = (j86 * j85) + ((-903) * longValue14) + ((-1808) * (((j87 | j88) ^ j4) | ((j89 | longValue14) ^ j4))) + (((((j87 | j91) | j88) ^ j4) | ((j92 | longValue14) ^ j4)) * j90) + (j90 * (((j87 | longValue14) ^ j4) | ((j91 | j88) ^ j4) | (j92 ^ j4))) + 327329244;
                                                                                int nextInt5 = new java.util.Random().nextInt();
                                                                                int i315 = ~nextInt5;
                                                                                int i316 = (int) j93;
                                                                                int nextInt6 = new java.util.Random().nextInt(1698907466);
                                                                                int i317 = ~nextInt6;
                                                                                int i318 = ~((-1392163379) | nextInt6);
                                                                                if (((((int) (j93 >> 32)) & ((((~(955634958 | i315)) | 1091174464) * 98) + 1886261969 + (((~(i315 | 1902105926)) | 955634958 | (~((-1902105927) | nextInt5))) * (-49)) + (((~(nextInt5 | 955634958)) | 810931462) * 49))) | ((((((~(1392491383 | i317)) | (~((-45063032) | nextInt6))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) - 1024715219) + (((~(45063031 | i317)) | i318) * (-1040)) + (((~(1392163378 | i317)) | 1347428352 | i318) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL)) & i316)) != 0) {
                                                                                    i44 = i45;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            int i319 = (i45 & 65) + (i45 | 65);
                                                                            i310 = (i319 & (-64)) + (i319 | (-64));
                                                                            strArr21 = strArr11;
                                                                            str13 = str21;
                                                                            i268 = i43;
                                                                        } else {
                                                                            str22 = strArr21[i310];
                                                                            java.lang.Object[] objArr102 = {str22};
                                                                            java.lang.Object d27 = com.facetec.sdk.al.d(1450487247);
                                                                            if (d27 == null) {
                                                                                char c18 = (char) (6936 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                                                                int maxKeyCode3 = android.view.KeyEvent.getMaxKeyCode();
                                                                                int packedPositionGroup5 = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                                                                byte b34 = (byte) ($$b & 3);
                                                                                byte b35 = (byte) (-b34);
                                                                                java.lang.Object[] objArr103 = new java.lang.Object[1];
                                                                                m(b34, b35, (byte) (b35 + 1), objArr103);
                                                                                d27 = com.facetec.sdk.al.c(c18, (maxKeyCode3 >> 16) + 2389, 23 - packedPositionGroup5, -241445065, false, (java.lang.String) objArr103[0], new java.lang.Class[]{java.lang.String.class});
                                                                            }
                                                                            long longValue15 = ((java.lang.Long) ((java.lang.reflect.Method) d27).invoke(null, objArr102)).longValue();
                                                                            long j94 = -187815531;
                                                                            long j95 = -167;
                                                                            long j96 = longValue15 ^ j4;
                                                                            strArr10 = strArr21;
                                                                            i45 = i310;
                                                                            long nextInt7 = new java.util.Random().nextInt(2057070471);
                                                                            long j97 = (j95 * j94) + (j95 * longValue15) + (336 * ((((j94 ^ j4) | j96) ^ j4) | ((j96 | nextInt7) ^ j4))) + ((-168) * (((longValue15 | j94) ^ j4) | ((j94 | nextInt7) ^ j4))) + (com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE * (j96 | (((nextInt7 ^ j4) | j94) ^ j4))) + 2038992172;
                                                                            int uptimeMillis = (int) android.os.SystemClock.uptimeMillis();
                                                                            int i320 = ~uptimeMillis;
                                                                            int i321 = ~(873837766 | i320);
                                                                            if (((((int) j97) & ((((~((-873837767) | uptimeMillis)) | (~(1983903119 | i320)) | i321) * (-516)) + 1294669105 + (((~(uptimeMillis | (-873837703))) | (~(i320 | (-1110065418)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + ((1110065417 | i321) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR))) | (((int) (j97 >> 32)) & ((((-2126247936) | i27) * 988) + 198343794 + (((~(i23 | (-411668796))) | 134316066) * (-1976)) + (((~((-1848895207) | i27)) | (-2126247936) | (~(i23 | 1848895206))) * 988)))) != 0) {
                                                                                i43 = i268;
                                                                                str21 = str13;
                                                                                i44 = i45;
                                                                                break;
                                                                            }
                                                                            int i3142 = -(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                                            int lastIndexOf72 = android.text.TextUtils.lastIndexOf(str13, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                                            objArr = new java.lang.Object[1];
                                                                            k((char) ((61369 & i3142) + (i3142 | 61369)), (lastIndexOf72 & 2143) + (lastIndexOf72 | 2143), 13 - (~(-(-android.view.Gravity.getAbsoluteGravity(0, 0)))), objArr);
                                                                            if (str22.equals((java.lang.String) objArr[0])) {
                                                                            }
                                                                            int i3192 = (i45 & 65) + (i45 | 65);
                                                                            i310 = (i3192 & (-64)) + (i3192 | (-64));
                                                                            strArr21 = strArr11;
                                                                            str13 = str21;
                                                                            i268 = i43;
                                                                        }
                                                                    }
                                                                    i43 = i268;
                                                                    str21 = str13;
                                                                    i44 = -1;
                                                                    int i322 = (i44 & 130) + (i44 | 130);
                                                                    int i323 = ~i44;
                                                                    int i324 = -i323;
                                                                    int i325 = ((i323 ^ i324) | (i323 & i324)) >> 31;
                                                                    int i326 = (~i325) & i27;
                                                                    int i327 = (((~i322) & i27) | (i322 & i23)) & i325;
                                                                    int i328 = (~(i27 & i43)) & (i27 | i43);
                                                                    int i329 = (i328 | (-i328)) >> 31;
                                                                    i34 = (((i327 ^ i326) | (i327 & i326)) & (~i329)) | (i43 & i329);
                                                                    str17 = str21;
                                                                }
                                                                int i330 = -android.text.TextUtils.indexOf(str17, str17, 0);
                                                                int i331 = -(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                                java.lang.Object[] objArr104 = new java.lang.Object[1];
                                                                k((char) ((54855 ^ i330) + ((i330 & 54855) << 1)), (i331 ^ 2220) + ((i331 & 2220) << 1), 13 - android.view.View.combineMeasuredStates(0, 0), objArr104);
                                                                java.lang.String str72 = (java.lang.String) objArr104[0];
                                                                char c19 = (char) (49992 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                                                int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(0);
                                                                int i332 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                                java.lang.Object[] objArr105 = new java.lang.Object[1];
                                                                k(c19, bitsPerPixel + 2234, (i332 ^ 6) + ((i332 & 6) << 1), objArr105);
                                                                java.lang.String[] strArr22 = {str72, (java.lang.String) objArr105[0]};
                                                                int i333 = -(-android.graphics.Color.blue(0));
                                                                java.lang.Object[] objArr106 = new java.lang.Object[1];
                                                                k((char) ((57370 & i333) + (i333 | 57370)), 2237 - (~(-(-(android.os.Process.myTid() >> 22)))), android.text.TextUtils.indexOf(str17, str17, 0, 0) + 15, objArr106);
                                                                java.lang.String str73 = (java.lang.String) objArr106[0];
                                                                int i334 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                                int d28 = com.facetec.sdk.ou.d();
                                                                int i335 = ~i334;
                                                                int i336 = ~(43265 | i335);
                                                                int i337 = ~(((-43266) ^ i334) | ((-43266) & i334));
                                                                int i338 = (i336 ^ i337) | (i336 & i337);
                                                                int i339 = ~(((-43266) & d28) | ((-43266) ^ d28));
                                                                int i340 = (i334 * 399) + 17262735 + (((i338 ^ i339) | (i338 & i339)) * 398) + (((i334 & 43265) | (43265 ^ i334)) * (-1194));
                                                                int i341 = ~d28;
                                                                int i342 = ~((i341 ^ (-43266)) | ((-43266) & i341));
                                                                int i343 = ~((43265 & i335) | (i335 ^ 43265));
                                                                int i344 = (i342 ^ i343) | (i342 & i343);
                                                                int i345 = -(-(((i344 ^ i337) | (i337 & i344)) * 398));
                                                                int i346 = -(-android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                                                int i347 = -(-(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                                                java.lang.Object[] objArr107 = new java.lang.Object[1];
                                                                k((char) ((i340 & i345) + (i345 | i340)), (i346 & 2253) + (i346 | 2253), (i347 & 19) + (i347 | 19), objArr107);
                                                                java.lang.String str74 = (java.lang.String) objArr107[0];
                                                                char c20 = (char) ((-2) - (~(-android.text.TextUtils.indexOf(str17, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0))));
                                                                int i348 = -android.view.View.resolveSizeAndState(0, 0, 0);
                                                                int i349 = -(-android.view.View.resolveSizeAndState(0, 0, 0));
                                                                java.lang.Object[] objArr108 = new java.lang.Object[1];
                                                                k(c20, ((i348 | 2272) << 1) - (i348 ^ 2272), ((i349 | 14) << 1) - (i349 ^ 14), objArr108);
                                                                java.lang.String[] strArr23 = {str73, str74, (java.lang.String) objArr108[0]};
                                                                int i350 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                                char mirror3 = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                                int i351 = -android.view.MotionEvent.axisFromString(str17);
                                                                java.lang.Object[] objArr109 = new java.lang.Object[1];
                                                                k((char) ((36653 & i350) + (i350 | 36653)), mirror3 + 2238, (i351 ^ 20) + ((i351 & 20) << 1), objArr109);
                                                                java.lang.String str75 = (java.lang.String) objArr109[0];
                                                                java.lang.Object[] objArr110 = new java.lang.Object[1];
                                                                k((char) (8769 - (~(-android.text.TextUtils.indexOf(str17, str17, 0, 0)))), 2306 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 9 - (~(-android.graphics.Color.alpha(0))), objArr110);
                                                                java.lang.String[] strArr24 = {str75, (java.lang.String) objArr110[0]};
                                                                char c21 = (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 13423);
                                                                int i352 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                                int packedPositionGroup6 = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                                                java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                                k(c21, 2316 - (~i352), (packedPositionGroup6 ^ 11) + ((packedPositionGroup6 & 11) << 1), objArr111);
                                                                java.lang.String str76 = (java.lang.String) objArr111[0];
                                                                java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                                k((char) (6889 - (~(android.view.ViewConfiguration.getEdgeSlop() >> 16))), 856 - (~(-(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16))), 5 - (~(-(-(android.view.ViewConfiguration.getWindowTouchSlop() >> 8)))), objArr112);
                                                                java.lang.String[] strArr25 = {str76, (java.lang.String) objArr112[0]};
                                                                int i353 = -(-(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                                                int i354 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
                                                                java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                                k((char) ((i353 ^ 16646) + ((i353 & 16646) << 1)), (i354 & 2328) + (i354 | 2328), 27 - (~(-(-android.graphics.Color.green(0)))), objArr113);
                                                                java.lang.String str77 = (java.lang.String) objArr113[0];
                                                                int i355 = -(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                                int i356 = i355 * (-830);
                                                                int i357 = (7296640 ^ i356) + ((i356 & 7296640) << 1);
                                                                int i358 = i23;
                                                                int i359 = ~((i358 & (-8771)) | (i358 ^ (-8771)));
                                                                int i360 = ~((i355 ^ 8770) | (i355 & 8770) | i27);
                                                                int i361 = ((i359 ^ i360) | (i359 & i360)) * (-831);
                                                                int i362 = (i355 & (-8771)) | (i355 ^ (-8771));
                                                                int i363 = ~i355;
                                                                int i364 = ~((i363 ^ i358) | (i363 & i358));
                                                                int i365 = ~(i355 | i27);
                                                                char c22 = (char) ((((((i357 & i361) + (i357 | i361)) - (~((~((i362 & i27) | (i362 ^ i27))) * (-1662)))) - 1) - (~((((i365 ^ i364) | (i365 & i364)) | (~(i27 | 8770))) * 831))) - 1);
                                                                int i366 = -(-(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                                                int i367 = (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                                java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                                k(c22, ((i366 | 2306) << 1) - (i366 ^ 2306), (i367 ^ 9) + ((i367 & 9) << 1), objArr114);
                                                                java.lang.String[][] strArr26 = {strArr22, strArr23, strArr24, strArr25, new java.lang.String[]{str77, (java.lang.String) objArr114[0]}};
                                                                int i368 = -1;
                                                                i35 = 0;
                                                                loop7: while (true) {
                                                                    if (i35 < 5) {
                                                                        i36 = i34;
                                                                        str18 = str17;
                                                                        i25 = i27;
                                                                        i37 = i358;
                                                                        i38 = i25;
                                                                        break;
                                                                    }
                                                                    int i369 = l;
                                                                    int i370 = 1;
                                                                    int i371 = (i369 ^ 117) + ((i369 & 117) << 1);
                                                                    n = i371 % 128;
                                                                    if (i371 % 2 != 0) {
                                                                        java.lang.String[] strArr27 = strArr26[i35];
                                                                        str19 = strArr27[1];
                                                                        strArr7 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr27, 1, strArr27.length);
                                                                        length = strArr7.length;
                                                                        i42 = 1;
                                                                    } else {
                                                                        java.lang.String[] strArr28 = strArr26[i35];
                                                                        java.lang.String str78 = strArr28[0];
                                                                        strArr7 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr28, 1, strArr28.length);
                                                                        i42 = 0;
                                                                        length = strArr7.length;
                                                                        str19 = str78;
                                                                    }
                                                                    while (i42 < length) {
                                                                        i368 = ((i368 & 1) << i370) + (i368 ^ 1);
                                                                        java.lang.Object[] objArr115 = {str19, strArr7[i42]};
                                                                        java.lang.Object d29 = com.facetec.sdk.al.d(-100890377);
                                                                        if (d29 == null) {
                                                                            char green = (char) (23780 - android.graphics.Color.green(0));
                                                                            int jumpTapTimeout5 = android.view.ViewConfiguration.getJumpTapTimeout();
                                                                            char mirror4 = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                                            byte b36 = (byte) ($$b & 3);
                                                                            byte b37 = (byte) (-b36);
                                                                            strArr8 = strArr26;
                                                                            strArr9 = strArr7;
                                                                            str20 = str19;
                                                                            java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                                            m(b36, b37, (byte) (b37 + 1), objArr116);
                                                                            d29 = com.facetec.sdk.al.c(green, (jumpTapTimeout5 >> 16) + 1364, mirror4 - 24, 1578365455, false, (java.lang.String) objArr116[0], new java.lang.Class[]{java.lang.String.class, java.lang.String.class});
                                                                        } else {
                                                                            strArr8 = strArr26;
                                                                            strArr9 = strArr7;
                                                                            str20 = str19;
                                                                        }
                                                                        long longValue16 = ((java.lang.Long) ((java.lang.reflect.Method) d29).invoke(null, objArr115)).longValue();
                                                                        long j98 = -1558186423;
                                                                        int i372 = length;
                                                                        int i373 = i35;
                                                                        i37 = i358;
                                                                        long j99 = longValue16 ^ j4;
                                                                        str18 = str17;
                                                                        long j100 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                                                        long j101 = (j98 | j100) ^ j4;
                                                                        i36 = i34;
                                                                        long j102 = 407;
                                                                        long j103 = j98 ^ j4;
                                                                        long j104 = (j103 | longValue16) ^ j4;
                                                                        long j105 = ((((((-813) * j98) + (408 * longValue16)) + ((((j99 | j98) ^ j4) | j101) * (-814))) + (((((j99 | (j100 ^ j4)) ^ j4) | j104) | j101) * j102)) + (j102 * ((j104 | ((j103 | j100) ^ j4)) | ((longValue16 | j100) ^ j4)))) - 461877724;
                                                                        int nextInt8 = new java.util.Random().nextInt(637780096);
                                                                        int i374 = ~nextInt8;
                                                                        int i375 = ((int) (j105 >> 32)) & ((((~(1543081754 | i374)) | (~(1314659130 | nextInt8))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 1373860304 + (((~(nextInt8 | (-67375137))) | (~(i374 | (-295797761)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                                                                        int myUid = android.os.Process.myUid();
                                                                        int i376 = ((int) j105) & ((((~myUid) | (-1302983578)) * 1324) + 818885255 + (((~(myUid | (-136373017))) | (~((-1300853394) | myUid))) * (-1324)) + 612259910);
                                                                        if (((i375 ^ i376) | (i375 & i376)) != 0) {
                                                                            int i377 = ((i368 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE) << 1) - (i368 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE);
                                                                            i25 = i2;
                                                                            i38 = ((~i377) & i25) | (i377 & i37);
                                                                            break loop7;
                                                                        }
                                                                        i42 = (i42 ^ 1) + ((i42 & 1) << 1);
                                                                        i27 = i2;
                                                                        i35 = i373;
                                                                        length = i372;
                                                                        str17 = str18;
                                                                        i358 = i37;
                                                                        strArr26 = strArr8;
                                                                        strArr7 = strArr9;
                                                                        str19 = str20;
                                                                        i34 = i36;
                                                                        i370 = 1;
                                                                    }
                                                                    i35++;
                                                                    str17 = str17;
                                                                }
                                                                int i378 = i25 ^ i36;
                                                                int i379 = -i378;
                                                                int i380 = ((i378 ^ i379) | (i378 & i379)) >> 31;
                                                                int i381 = (i36 & i380) | (i38 & (~i380));
                                                                int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
                                                                int i382 = -android.graphics.Color.green(0);
                                                                java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                                k((char) (((deadChar | 7561) << 1) - (deadChar ^ 7561)), (i382 ^ 2356) + ((i382 & 2356) << 1), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 13, objArr117);
                                                                java.lang.String str79 = (java.lang.String) objArr117[0];
                                                                int i383 = -(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                                int i384 = -(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                                java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                                k((char) ((i383 ^ 15808) + ((i383 & 15808) << 1)), ((i384 | 2369) << 1) - (i384 ^ 2369), 7 - (~android.graphics.Color.red(0)), objArr118);
                                                                java.lang.Object[] objArr119 = {str79, (java.lang.String) objArr118[0]};
                                                                d6 = com.facetec.sdk.al.d(-100890377);
                                                                if (d6 == null) {
                                                                    char c23 = (char) (23781 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                                                    int tapTimeout2 = android.view.ViewConfiguration.getTapTimeout();
                                                                    float maxVolume = android.media.AudioTrack.getMaxVolume();
                                                                    byte b38 = (byte) ($$b & 3);
                                                                    byte b39 = (byte) (-b38);
                                                                    java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                                    m(b38, b39, (byte) (b39 + 1), objArr120);
                                                                    d6 = com.facetec.sdk.al.c(c23, (tapTimeout2 >> 16) + 1364, (maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1)) + 23, 1578365455, false, (java.lang.String) objArr120[0], new java.lang.Class[]{java.lang.String.class, java.lang.String.class});
                                                                }
                                                                long longValue17 = ((java.lang.Long) ((java.lang.reflect.Method) d6).invoke(null, objArr119)).longValue();
                                                                long j106 = -1372533218;
                                                                long j107 = j106 ^ j4;
                                                                long j108 = longValue17 ^ j4;
                                                                long j109 = ((j108 | j106) | j5) ^ j4;
                                                                j6 = (((((714 * j106) + ((-712) * longValue17)) + ((-713) * ((((longValue17 | j107) ^ j4) | ((j107 | j30) ^ j4)) | j109))) + (1426 * j109)) + (713 * ((j108 | j30) ^ j4))) - 647530929;
                                                                i40 = (int) (j6 >> 32);
                                                                i41 = ~(752419454 | i25);
                                                                if (((i40 & ((((((~((-752419455) | i25)) | 684786220) | (~((-684806957) | i25))) * (-880)) - 818885110) + (((~(i37 | (-752419455))) | 684806956 | i41) * (-880)) + (i41 * 880))) | (((int) j6) & (((((~(i37 | (-8965145))) | (~((-1446191555) | i25))) * (-272)) - 234428123) + (((~((-696831546) | i25)) | 687866401) * (-272)) + (((~(696831545 | i25)) | (-2134057956)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE)))) == 0) {
                                                                    i26 = i37;
                                                                    i39 = (i25 & (-151)) | (i26 & 150);
                                                                } else {
                                                                    i26 = i37;
                                                                    n = (l + 41) % 128;
                                                                    i39 = i25;
                                                                }
                                                                int i385 = ((~i381) & i25) | (i381 & i26);
                                                                int i386 = -i385;
                                                                int i387 = ((i385 ^ i386) | (i385 & i386)) >> 31;
                                                                int i388 = i39 & (~i387);
                                                                int i389 = i381 & i387;
                                                                int i390 = (i388 ^ i389) | (i388 & i389);
                                                                char c24 = (char) (8281 - (~(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))));
                                                                byte modifierMetaStateMask3 = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                                                                java.lang.String str80 = str18;
                                                                java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                                k(c24, ((modifierMetaStateMask3 | 2378) << 1) - (modifierMetaStateMask3 ^ 2378), 47 - android.text.TextUtils.getOffsetBefore(str80, 0), objArr121);
                                                                java.lang.Object[] objArr122 = {(java.lang.String) objArr121[0]};
                                                                d5 = com.facetec.sdk.al.d(1450487247);
                                                                if (d5 == null) {
                                                                    char minimumFlingVelocity3 = (char) (6935 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                                                    int trimmedLength4 = android.text.TextUtils.getTrimmedLength(str80);
                                                                    long uptimeMillis2 = android.os.SystemClock.uptimeMillis();
                                                                    byte b40 = (byte) ($$b & 3);
                                                                    byte b41 = (byte) (-b40);
                                                                    java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                                    m(b40, b41, (byte) (b41 + 1), objArr123);
                                                                    d5 = com.facetec.sdk.al.c(minimumFlingVelocity3, 2389 - trimmedLength4, 24 - (uptimeMillis2 > 0L ? 1 : (uptimeMillis2 == 0L ? 0 : -1)), -241445065, false, (java.lang.String) objArr123[0], new java.lang.Class[]{java.lang.String.class});
                                                                }
                                                                long longValue18 = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, objArr122)).longValue();
                                                                long j110 = 919664190;
                                                                long j111 = -560;
                                                                long j112 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                                                long j113 = j112 ^ j4;
                                                                long j114 = ((-559) * j110) + (561 * longValue18) + (((j113 | j110) ^ j4) * j111) + (j111 * ((((longValue18 ^ j4) | j110) | j112) ^ j4)) + (560 * (((longValue18 | (j110 ^ j4)) ^ j4) | ((j113 | longValue18) ^ j4))) + 931512451;
                                                                int myTid3 = android.os.Process.myTid();
                                                                int i391 = ((int) (j114 >> 32)) & ((((276834917 | r5) * (-757)) - 1695170742) + ((~((-1160380673) | myTid3)) * 1514) + (((~(myTid3 | 1437215589)) | (~((~myTid3) | (-1160391494))) | 10821) * 757));
                                                                int elapsedRealtime3 = (int) android.os.SystemClock.elapsedRealtime();
                                                                int i392 = ((int) j114) & (((((~(885925309 | elapsedRealtime3)) | (-886976510)) * 336) - 501357939) + (((~((-551301101) | elapsedRealtime3)) | 550249900) * (-168)) + (((~((~elapsedRealtime3) | (-551301101))) | 885925309) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
                                                                int i393 = ((i391 ^ i392) | (i391 & i392)) * 263;
                                                                int i394 = (~(i25 & i390)) & (i25 | i390);
                                                                int i395 = -i394;
                                                                int i396 = ((i394 ^ i395) | (i394 & i395)) >> 31;
                                                                i262 = (i390 & i396) | ((~(i393 & i25)) & (i393 | i25) & (~i396));
                                                                strArr2 = strArr6;
                                                            }
                                                        } else {
                                                            c = 2;
                                                        }
                                                        java.lang.Object[] objArr1192 = {str79, (java.lang.String) objArr118[0]};
                                                        d6 = com.facetec.sdk.al.d(-100890377);
                                                        if (d6 == null) {
                                                        }
                                                        long longValue172 = ((java.lang.Long) ((java.lang.reflect.Method) d6).invoke(null, objArr1192)).longValue();
                                                        long j1062 = -1372533218;
                                                        long j1072 = j1062 ^ j4;
                                                        long j1082 = longValue172 ^ j4;
                                                        long j1092 = ((j1082 | j1062) | j5) ^ j4;
                                                        j6 = (((((714 * j1062) + ((-712) * longValue172)) + ((-713) * ((((longValue172 | j1072) ^ j4) | ((j1072 | j30) ^ j4)) | j1092))) + (1426 * j1092)) + (713 * ((j1082 | j30) ^ j4))) - 647530929;
                                                        i40 = (int) (j6 >> 32);
                                                        i41 = ~(752419454 | i25);
                                                        if (((i40 & ((((((~((-752419455) | i25)) | 684786220) | (~((-684806957) | i25))) * (-880)) - 818885110) + (((~(i37 | (-752419455))) | 684806956 | i41) * (-880)) + (i41 * 880))) | (((int) j6) & (((((~(i37 | (-8965145))) | (~((-1446191555) | i25))) * (-272)) - 234428123) + (((~((-696831546) | i25)) | 687866401) * (-272)) + (((~(696831545 | i25)) | (-2134057956)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE)))) == 0) {
                                                        }
                                                        int i3852 = ((~i381) & i25) | (i381 & i26);
                                                        int i3862 = -i3852;
                                                        int i3872 = ((i3852 ^ i3862) | (i3852 & i3862)) >> 31;
                                                        int i3882 = i39 & (~i3872);
                                                        int i3892 = i381 & i3872;
                                                        int i3902 = (i3882 ^ i3892) | (i3882 & i3892);
                                                        char c242 = (char) (8281 - (~(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))));
                                                        byte modifierMetaStateMask32 = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                                                        java.lang.String str802 = str18;
                                                        java.lang.Object[] objArr1212 = new java.lang.Object[1];
                                                        k(c242, ((modifierMetaStateMask32 | 2378) << 1) - (modifierMetaStateMask32 ^ 2378), 47 - android.text.TextUtils.getOffsetBefore(str802, 0), objArr1212);
                                                        java.lang.Object[] objArr1222 = {(java.lang.String) objArr1212[0]};
                                                        d5 = com.facetec.sdk.al.d(1450487247);
                                                        if (d5 == null) {
                                                        }
                                                        long longValue182 = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, objArr1222)).longValue();
                                                        long j1102 = 919664190;
                                                        long j1112 = -560;
                                                        long j1122 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                                        long j1132 = j1122 ^ j4;
                                                        long j1142 = ((-559) * j1102) + (561 * longValue182) + (((j1132 | j1102) ^ j4) * j1112) + (j1112 * ((((longValue182 ^ j4) | j1102) | j1122) ^ j4)) + (560 * (((longValue182 | (j1102 ^ j4)) ^ j4) | ((j1132 | longValue182) ^ j4))) + 931512451;
                                                        int myTid32 = android.os.Process.myTid();
                                                        int i3912 = ((int) (j1142 >> 32)) & ((((276834917 | r5) * (-757)) - 1695170742) + ((~((-1160380673) | myTid32)) * 1514) + (((~(myTid32 | 1437215589)) | (~((~myTid32) | (-1160391494))) | 10821) * 757));
                                                        int elapsedRealtime32 = (int) android.os.SystemClock.elapsedRealtime();
                                                        int i3922 = ((int) j1142) & (((((~(885925309 | elapsedRealtime32)) | (-886976510)) * 336) - 501357939) + (((~((-551301101) | elapsedRealtime32)) | 550249900) * (-168)) + (((~((~elapsedRealtime32) | (-551301101))) | 885925309) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
                                                        int i3932 = ((i3912 ^ i3922) | (i3912 & i3922)) * 263;
                                                        int i3942 = (~(i25 & i3902)) & (i25 | i3902);
                                                        int i3952 = -i3942;
                                                        int i3962 = ((i3942 ^ i3952) | (i3942 & i3952)) >> 31;
                                                        i262 = (i3902 & i3962) | ((~(i3932 & i25)) & (i3932 | i25) & (~i3962));
                                                        strArr2 = strArr6;
                                                    } catch (java.lang.Throwable th2) {
                                                        i26 = i37;
                                                        try {
                                                            java.lang.Throwable cause2 = th2.getCause();
                                                            if (cause2 != null) {
                                                                throw cause2;
                                                            }
                                                            throw th2;
                                                        } catch (java.lang.Exception unused4) {
                                                            i39 = i25 ^ 151;
                                                            int i38522 = ((~i381) & i25) | (i381 & i26);
                                                            int i38622 = -i38522;
                                                            int i38722 = ((i38522 ^ i38622) | (i38522 & i38622)) >> 31;
                                                            int i38822 = i39 & (~i38722);
                                                            int i38922 = i381 & i38722;
                                                            int i39022 = (i38822 ^ i38922) | (i38822 & i38922);
                                                            char c2422 = (char) (8281 - (~(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))));
                                                            byte modifierMetaStateMask322 = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                                                            java.lang.String str8022 = str18;
                                                            java.lang.Object[] objArr12122 = new java.lang.Object[1];
                                                            k(c2422, ((modifierMetaStateMask322 | 2378) << 1) - (modifierMetaStateMask322 ^ 2378), 47 - android.text.TextUtils.getOffsetBefore(str8022, 0), objArr12122);
                                                            java.lang.Object[] objArr12222 = {(java.lang.String) objArr12122[0]};
                                                            d5 = com.facetec.sdk.al.d(1450487247);
                                                            if (d5 == null) {
                                                            }
                                                            long longValue1822 = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, objArr12222)).longValue();
                                                            long j11022 = 919664190;
                                                            long j11122 = -560;
                                                            long j11222 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                                            long j11322 = j11222 ^ j4;
                                                            long j11422 = ((-559) * j11022) + (561 * longValue1822) + (((j11322 | j11022) ^ j4) * j11122) + (j11122 * ((((longValue1822 ^ j4) | j11022) | j11222) ^ j4)) + (560 * (((longValue1822 | (j11022 ^ j4)) ^ j4) | ((j11322 | longValue1822) ^ j4))) + 931512451;
                                                            int myTid322 = android.os.Process.myTid();
                                                            int i39122 = ((int) (j11422 >> 32)) & ((((276834917 | r5) * (-757)) - 1695170742) + ((~((-1160380673) | myTid322)) * 1514) + (((~(myTid322 | 1437215589)) | (~((~myTid322) | (-1160391494))) | 10821) * 757));
                                                            int elapsedRealtime322 = (int) android.os.SystemClock.elapsedRealtime();
                                                            int i39222 = ((int) j11422) & (((((~(885925309 | elapsedRealtime322)) | (-886976510)) * 336) - 501357939) + (((~((-551301101) | elapsedRealtime322)) | 550249900) * (-168)) + (((~((~elapsedRealtime322) | (-551301101))) | 885925309) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
                                                            int i39322 = ((i39122 ^ i39222) | (i39122 & i39222)) * 263;
                                                            int i39422 = (~(i25 & i39022)) & (i25 | i39022);
                                                            int i39522 = -i39422;
                                                            int i39622 = ((i39422 ^ i39522) | (i39422 & i39522)) >> 31;
                                                            i262 = (i39022 & i39622) | ((~(i39322 & i25)) & (i39322 | i25) & (~i39622));
                                                            strArr2 = strArr6;
                                                            int i397 = ((~i262) & i25) | (i262 & i26);
                                                            int i398 = -i397;
                                                            java.lang.Object[] objArr124 = {new int[1], strArr2, new int[]{i262}, new int[]{i25}};
                                                            int i399 = ((((~(777876558 | r4)) | (-1860042320)) * 305) - 1995483012) + (((~((~android.os.Process.myPid()) | 777876558)) | (-1250799176)) * 305) + ((((i397 ^ i398) | (i397 & i398)) >> 31) & 16);
                                                            int i400 = ~i399;
                                                            int i401 = (i400 ^ i4) | (i400 & i4);
                                                            int i402 = ~i401;
                                                            int i403 = ~((i400 & i25) | (i400 ^ i25));
                                                            int i404 = ~((i401 ^ i25) | (i25 & i401));
                                                            int i405 = (i26 ^ i399) | (i26 & i399);
                                                            int i406 = ~((i405 ^ i4) | (i4 & i405));
                                                            int i407 = (((i399 * 755) - (~(-(-(i4 * (-753)))))) - 1) + (((~((i4 & i25) | (i4 ^ i25))) | (i403 & i402) | (i402 ^ i403)) * (-754)) + (((i404 & i406) | (i404 ^ i406)) * (-754));
                                                            int i408 = ((i400 ^ i26) | (i400 & i26)) * 754;
                                                            int i409 = ((i407 | i408) << 1) - (i408 ^ i407);
                                                            int i410 = i409 << 13;
                                                            int i411 = ((~i410) & i409) | ((~i409) & i410);
                                                            int i412 = i411 >>> 17;
                                                            int i413 = (i411 & (~i412)) | ((~i411) & i412);
                                                            ((int[]) objArr124[0])[0] = i413 ^ (i413 << 5);
                                                            return objArr124;
                                                        }
                                                    }
                                                    char combineMeasuredStates2 = (char) android.view.View.combineMeasuredStates(0, 0);
                                                    int myPid6 = android.os.Process.myPid() >> 22;
                                                    java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                    k(combineMeasuredStates2, (myPid6 ^ 640) + ((myPid6 & 640) << 1), 22 - (~(-android.view.Gravity.getAbsoluteGravity(0, 0))), objArr125);
                                                    java.lang.String str81 = (java.lang.String) objArr125[0];
                                                    java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                    k((char) android.view.KeyEvent.normalizeMetaState(0), 1077 - (~(-(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))), 9 - (~(-android.graphics.Color.alpha(0))), objArr126);
                                                    java.lang.String str82 = (java.lang.String) objArr126[0];
                                                    java.lang.String str83 = str12;
                                                    int indexOf8 = android.text.TextUtils.indexOf(str83, str83);
                                                    int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                                    java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                    k((char) (((34858 | indexOf8) << 1) - (indexOf8 ^ 34858)), (scrollBarFadeDuration ^ 1088) + ((scrollBarFadeDuration & 1088) << 1), 6 - (~(-(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))), objArr127);
                                                    java.lang.String str84 = (java.lang.String) objArr127[0];
                                                    char rgb2 = (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216);
                                                    int i414 = -(-android.graphics.Color.red(0));
                                                    int pressedStateDuration = android.view.ViewConfiguration.getPressedStateDuration() >> 16;
                                                    int i415 = pressedStateDuration * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE;
                                                    int i416 = (i415 ^ (-1752)) + ((i415 & (-1752)) << 1);
                                                    int i417 = ~pressedStateDuration;
                                                    int i418 = ~((i417 ^ (-9)) | (i417 & (-9)));
                                                    int i419 = (i23 ^ pressedStateDuration) | (i23 & pressedStateDuration);
                                                    int i420 = ~((i419 & 8) | (i419 ^ 8));
                                                    int i421 = ((i418 & i420) | (i418 ^ i420)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE;
                                                    int i422 = ((i416 | i421) << 1) - (i421 ^ i416);
                                                    int i423 = ~((i23 ^ 8) | (i23 & 8));
                                                    int i424 = ((i423 ^ pressedStateDuration) | (i423 & pressedStateDuration)) * (-440);
                                                    int i425 = ((i422 | i424) << 1) - (i424 ^ i422);
                                                    int i426 = ((pressedStateDuration ^ 8) | (pressedStateDuration & 8) | i13) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE;
                                                    java.lang.Object[] objArr128 = new java.lang.Object[1];
                                                    k(rgb2, 1094 - (~i414), (i425 ^ i426) + ((i426 & i425) << 1), objArr128);
                                                    java.lang.String[] strArr29 = {str81, str82, str84, (java.lang.String) objArr128[0]};
                                                    int i427 = -android.view.View.combineMeasuredStates(0, 0);
                                                    int i428 = -android.view.View.MeasureSpec.getMode(0);
                                                    int i429 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
                                                    java.lang.Object[] objArr129 = new java.lang.Object[1];
                                                    k((char) ((i427 & 2338) + (i427 | 2338)), (i428 ^ 1103) + ((i428 & 1103) << 1), (i429 ^ 17) + ((i429 & 17) << 1), objArr129);
                                                    java.lang.String str85 = (java.lang.String) objArr129[0];
                                                    char argb3 = (char) android.graphics.Color.argb(0, 0, 0, 0);
                                                    int i430 = -(-android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                                    java.lang.Object[] objArr130 = new java.lang.Object[1];
                                                    k(argb3, (i430 ^ 1120) + ((i430 & 1120) << 1), 6 - (~(-(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)))), objArr130);
                                                    java.lang.String str86 = (java.lang.String) objArr130[0];
                                                    char c25 = (char) (12642 - (~(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))));
                                                    int i431 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                    java.lang.Object[] objArr131 = new java.lang.Object[1];
                                                    k(c25, (i431 & 1127) + (i431 | 1127), 6 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr131);
                                                    java.lang.String str87 = (java.lang.String) objArr131[0];
                                                    char c26 = (char) (14382 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                                    int i432 = -(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                    int i433 = -android.text.TextUtils.getOffsetAfter(str83, 0);
                                                    java.lang.Object[] objArr132 = new java.lang.Object[1];
                                                    k(c26, (i432 & 1135) + (i432 | 1135), (i433 & 11) + (i433 | 11), objArr132);
                                                    java.lang.String str88 = (java.lang.String) objArr132[0];
                                                    int normalizeMetaState2 = android.view.KeyEvent.normalizeMetaState(0);
                                                    int bitsPerPixel2 = android.graphics.ImageFormat.getBitsPerPixel(0);
                                                    int i434 = -android.text.TextUtils.lastIndexOf(str83, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                    java.lang.Object[] objArr133 = new java.lang.Object[1];
                                                    k((char) ((normalizeMetaState2 & 12402) + (normalizeMetaState2 | 12402)), bitsPerPixel2 + 1146, ((i434 | 13) << 1) - (i434 ^ 13), objArr133);
                                                    java.lang.String[] strArr30 = {str85, str86, str87, str88, (java.lang.String) objArr133[0]};
                                                    int i435 = -android.view.Gravity.getAbsoluteGravity(0, 0);
                                                    int scrollBarFadeDuration2 = android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                                    int i436 = -(-android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                                    java.lang.Object[] objArr134 = new java.lang.Object[1];
                                                    k((char) (((i435 | 8848) << 1) - (i435 ^ 8848)), (scrollBarFadeDuration2 & 1159) + (scrollBarFadeDuration2 | 1159), (i436 ^ 16) + ((i436 & 16) << 1), objArr134);
                                                    java.lang.String str89 = (java.lang.String) objArr134[0];
                                                    char deadChar2 = (char) android.view.KeyEvent.getDeadChar(0, 0);
                                                    int maximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity();
                                                    int i437 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                                    java.lang.Object[] objArr135 = new java.lang.Object[1];
                                                    k(deadChar2, (maximumFlingVelocity >> 16) + 1175, (i437 ^ 3) + ((i437 & 3) << 1), objArr135);
                                                    java.lang.String str90 = (java.lang.String) objArr135[0];
                                                    int i438 = -android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                                    int d30 = com.facetec.sdk.ou.d();
                                                    int i439 = (i438 * (-518)) - 17038574;
                                                    int i440 = ~i438;
                                                    int i441 = ~d30;
                                                    int i442 = (i440 ^ i441) | (i440 & i441);
                                                    int i443 = ~i442;
                                                    int i444 = ((i443 ^ 32893) | (32893 & i443)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE;
                                                    int i445 = ((i439 | i444) << 1) - (i439 ^ i444);
                                                    int i446 = 32893 | i438;
                                                    int i447 = -(-(((~((i446 ^ d30) | (i446 & d30))) | (~((i442 ^ 32893) | (32893 & i442)))) * (-519)));
                                                    int i448 = ((i445 | i447) << 1) - (i447 ^ i445);
                                                    int i449 = ~((d30 ^ 32893) | (32893 & d30));
                                                    int i450 = ((i438 ^ i449) | (i438 & i449)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE;
                                                    int i451 = -(-((android.os.Process.getThreadPriority(0) + 20) >> 6));
                                                    java.lang.Object[] objArr136 = new java.lang.Object[1];
                                                    k((char) ((i448 & i450) + (i450 | i448)), (i451 & 1186) + (i451 | 1186), 20 - (~(-(-(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))))), objArr136);
                                                    java.lang.String str91 = (java.lang.String) objArr136[0];
                                                    char c27 = (char) (31966 - (~(-android.text.TextUtils.indexOf(str83, str83, 0, 0))));
                                                    int i452 = -(-android.text.TextUtils.indexOf(str83, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                                    java.lang.Object[] objArr137 = new java.lang.Object[1];
                                                    k(c27, (i452 & 1209) + (i452 | 1209), 25 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr137);
                                                    java.lang.String str92 = (java.lang.String) objArr137[0];
                                                    char c28 = (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                    int i453 = -(-(android.os.Process.myTid() >> 22));
                                                    int i454 = -android.text.TextUtils.indexOf(str83, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                    java.lang.Object[] objArr138 = new java.lang.Object[1];
                                                    k(c28, (i453 & 1233) + (i453 | 1233), (i454 & 27) + (i454 | 27), objArr138);
                                                    long j115 = j;
                                                    j4 = j27;
                                                    java.lang.String[] strArr31 = {str89, str90, str, str91, str92, (java.lang.String) objArr138[0]};
                                                    char c29 = (char) (37656 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                                    int scrollBarSize3 = android.view.ViewConfiguration.getScrollBarSize();
                                                    int i455 = -android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                                    java.lang.Object[] objArr139 = new java.lang.Object[1];
                                                    k(c29, 1261 - (scrollBarSize3 >> 8), (i455 & 11) + (i455 | 11), objArr139);
                                                    java.lang.String str93 = (java.lang.String) objArr139[0];
                                                    int i456 = -android.view.Gravity.getAbsoluteGravity(0, 0);
                                                    int longPressTimeout5 = android.view.ViewConfiguration.getLongPressTimeout() >> 16;
                                                    int i457 = -android.text.TextUtils.lastIndexOf(str83, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                    java.lang.Object[] objArr140 = new java.lang.Object[1];
                                                    k((char) (((44072 | i456) << 1) - (i456 ^ 44072)), (longPressTimeout5 ^ 1272) + ((longPressTimeout5 & 1272) << 1), (i457 & 7) + (i457 | 7), objArr140);
                                                    java.lang.String str94 = (java.lang.String) objArr140[0];
                                                    int i458 = -(-android.view.Gravity.getAbsoluteGravity(0, 0));
                                                    int i459 = -(-android.graphics.Color.argb(0, 0, 0, 0));
                                                    int i460 = -(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                    java.lang.Object[] objArr141 = new java.lang.Object[1];
                                                    k((char) ((56052 ^ i458) + ((i458 & 56052) << 1)), (i459 & 1280) + (i459 | 1280), (i460 ^ 6) + ((i460 & 6) << 1), objArr141);
                                                    java.lang.String str95 = (java.lang.String) objArr141[0];
                                                    int i461 = -android.view.View.MeasureSpec.getMode(0);
                                                    int i462 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                                    java.lang.Object[] objArr142 = new java.lang.Object[1];
                                                    k((char) (((55192 | i461) << 1) - (i461 ^ 55192)), ((i462 | 1286) << 1) - (i462 ^ 1286), 5 - (~(-(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16))), objArr142);
                                                    java.lang.String[] strArr32 = {str93, str94, str95, (java.lang.String) objArr142[0]};
                                                    char tapTimeout3 = (char) (14522 - (android.view.ViewConfiguration.getTapTimeout() >> 16));
                                                    int i463 = -android.view.Gravity.getAbsoluteGravity(0, 0);
                                                    int i464 = i463 * 829;
                                                    int i465 = (1071068 & i464) + (i464 | 1071068);
                                                    int i466 = ~i463;
                                                    int i467 = ~((i466 ^ (-1293)) | (i466 & (-1293)));
                                                    int i468 = (i23 ^ i463) | (i23 & i463);
                                                    int i469 = ~((i468 ^ 1292) | (i468 & 1292));
                                                    int i470 = ((i467 ^ i469) | (i467 & i469)) * (-828);
                                                    int i471 = i463 | 1292;
                                                    int i472 = ((((i465 | i470) << 1) - (i470 ^ i465)) - (~(((i471 & i23) | (i471 ^ i23)) * (-828)))) - 1;
                                                    int i473 = -(-((~((i463 ^ 1292) | (i463 & 1292))) * 828));
                                                    java.lang.Object[] objArr143 = new java.lang.Object[1];
                                                    k(tapTimeout3, (i472 & i473) + (i473 | i472), 15 - (~android.text.TextUtils.getOffsetAfter(str83, 0)), objArr143);
                                                    java.lang.String str96 = (java.lang.String) objArr143[0];
                                                    int i474 = -android.text.TextUtils.indexOf(str83, str83, 0);
                                                    byte modifierMetaStateMask4 = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                                                    int d31 = com.facetec.sdk.ou.d();
                                                    int i475 = modifierMetaStateMask4 * 905;
                                                    int i476 = ((-1018584) ^ i475) + ((i475 & (-1018584)) << 1);
                                                    int i477 = ~modifierMetaStateMask4;
                                                    int i478 = ~d31;
                                                    int i479 = -(-(((~((i478 ^ 1128) | (i478 & 1128))) | (~((i477 ^ d31) | (i477 & d31)))) * (-1808)));
                                                    int i480 = (i477 & (-1129)) | (i477 ^ (-1129));
                                                    int i481 = (i478 ^ modifierMetaStateMask4) | (i478 & modifierMetaStateMask4);
                                                    int i482 = ~((i477 ^ 1128) | (i477 & 1128));
                                                    j5 = j115;
                                                    int i483 = ~((d31 & (-1129)) | (d31 ^ (-1129)));
                                                    int i484 = (i482 ^ i483) | (i482 & i483);
                                                    int i485 = ~(i478 | modifierMetaStateMask4);
                                                    java.lang.Object[] objArr144 = new java.lang.Object[1];
                                                    k((char) ((i474 ^ 12643) + ((i474 & 12643) << 1)), (((i476 | i479) << 1) - (i479 ^ i476)) + (((~((i480 ^ d31) | (i480 & d31))) | (~((i481 ^ 1128) | (i481 & 1128)))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((i484 ^ i485) | (i484 & i485)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN), 5 - (~(-(-(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))))), objArr144);
                                                    java.lang.String str97 = (java.lang.String) objArr144[0];
                                                    char keyRepeatTimeout = (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                    int deadChar3 = android.view.KeyEvent.getDeadChar(0, 0);
                                                    int i486 = -(-(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                    java.lang.Object[] objArr145 = new java.lang.Object[1];
                                                    k(keyRepeatTimeout, deadChar3 + 1095, (i486 & 8) + (i486 | 8), objArr145);
                                                    java.lang.String[] strArr33 = {str96, str97, (java.lang.String) objArr145[0]};
                                                    int myTid4 = android.os.Process.myTid() >> 22;
                                                    int i487 = -(-(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                    java.lang.Object[] objArr146 = new java.lang.Object[1];
                                                    k((char) ((45093 ^ myTid4) + ((myTid4 & 45093) << 1)), (i487 ^ 1308) + ((i487 & 1308) << 1), 13 - (~(android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), objArr146);
                                                    java.lang.String str98 = (java.lang.String) objArr146[0];
                                                    char lastIndexOf8 = (char) (android.text.TextUtils.lastIndexOf(str83, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 4019);
                                                    int i488 = -(-android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                                    java.lang.Object[] objArr147 = new java.lang.Object[1];
                                                    k(lastIndexOf8, (i488 ^ 1322) + ((i488 & 1322) << 1), 1 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr147);
                                                    java.lang.String[] strArr34 = {str98, (java.lang.String) objArr147[0]};
                                                    int i489 = -(-android.text.TextUtils.lastIndexOf(str83, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
                                                    int scrollBarSize4 = android.view.ViewConfiguration.getScrollBarSize();
                                                    int i490 = (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                    java.lang.Object[] objArr148 = new java.lang.Object[1];
                                                    k((char) ((i489 & 1) + (i489 | 1)), 1322 - (~(scrollBarSize4 >> 8)), (i490 ^ 8) + ((i490 & 8) << 1), objArr148);
                                                    java.lang.String str99 = (java.lang.String) objArr148[0];
                                                    char size4 = (char) (android.view.View.MeasureSpec.getSize(0) + 11666);
                                                    int i491 = -android.text.TextUtils.indexOf(str83, str83, 0);
                                                    java.lang.Object[] objArr149 = new java.lang.Object[1];
                                                    k(size4, (i491 & 1332) + (i491 | 1332), 0 - (~(-(-android.graphics.drawable.Drawable.resolveOpacity(0, 0)))), objArr149);
                                                    java.lang.String[] strArr35 = {str99, (java.lang.String) objArr149[0]};
                                                    char maximumFlingVelocity2 = (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                    int packedPositionGroup7 = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                                    java.lang.Object[] objArr150 = new java.lang.Object[1];
                                                    k(maximumFlingVelocity2, (packedPositionGroup7 ^ 1333) + ((packedPositionGroup7 & 1333) << 1), 15 - (~(-android.graphics.Color.red(0))), objArr150);
                                                    java.lang.String str100 = (java.lang.String) objArr150[0];
                                                    char keyRepeatTimeout2 = (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                    int i492 = -(-(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                                                    int packedPositionGroup8 = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                                    java.lang.Object[] objArr151 = new java.lang.Object[1];
                                                    k(keyRepeatTimeout2, ((i492 | 1175) << 1) - (i492 ^ 1175), (packedPositionGroup8 ^ 3) + ((packedPositionGroup8 & 3) << 1), objArr151);
                                                    java.lang.String str101 = (java.lang.String) objArr151[0];
                                                    int i493 = -(-android.view.MotionEvent.axisFromString(str83));
                                                    int maxKeyCode4 = android.view.KeyEvent.getMaxKeyCode() >> 16;
                                                    int i494 = -(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                    java.lang.Object[] objArr152 = new java.lang.Object[1];
                                                    k((char) (((i493 | 1) << 1) - (i493 ^ 1)), ((maxKeyCode4 | 1120) << 1) - (maxKeyCode4 ^ 1120), (i494 & 7) + (i494 | 7), objArr152);
                                                    java.lang.String str102 = (java.lang.String) objArr152[0];
                                                    java.lang.Object[] objArr153 = new java.lang.Object[1];
                                                    k((char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), android.text.TextUtils.getTrimmedLength(str83) + 1349, 6 - (~(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr153);
                                                    java.lang.String str103 = (java.lang.String) objArr153[0];
                                                    int i495 = -(android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                                                    int i496 = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                    int i497 = -(-(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                                    java.lang.Object[] objArr154 = new java.lang.Object[1];
                                                    k((char) ((i495 ^ 14381) + ((i495 & 14381) << 1)), (i496 & 1133) + (i496 | 1133), (i497 ^ 11) + ((i497 & 11) << 1), objArr154);
                                                    java.lang.String str104 = (java.lang.String) objArr154[0];
                                                    char keyRepeatTimeout3 = (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12402);
                                                    int i498 = -(-android.view.Gravity.getAbsoluteGravity(0, 0));
                                                    java.lang.Object[] objArr155 = new java.lang.Object[1];
                                                    k(keyRepeatTimeout3, (i498 & 1145) + (i498 | 1145), 14 - (~(-(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))), objArr155);
                                                    java.lang.String[] strArr36 = {str100, str101, str102, str103, str104, (java.lang.String) objArr155[0]};
                                                    int i499 = -android.text.TextUtils.lastIndexOf(str83, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                    int i500 = -(-(android.view.ViewConfiguration.getScrollBarSize() >> 8));
                                                    int i501 = -(-(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                                    java.lang.Object[] objArr156 = new java.lang.Object[1];
                                                    k((char) ((46326 ^ i499) + ((i499 & 46326) << 1)), 1356 - (~i500), (i501 ^ 20) + ((i501 & 20) << 1), objArr156);
                                                    java.lang.String str105 = (java.lang.String) objArr156[0];
                                                    int i502 = -android.view.View.MeasureSpec.getSize(0);
                                                    int i503 = -android.graphics.Color.argb(0, 0, 0, 0);
                                                    java.lang.Object[] objArr157 = new java.lang.Object[1];
                                                    k((char) ((i502 ^ 27800) + ((i502 & 27800) << 1)), (i503 ^ 1377) + ((i503 & 1377) << 1), 18 - (~(-android.text.TextUtils.getTrimmedLength(str83))), objArr157);
                                                    java.lang.String str106 = (java.lang.String) objArr157[0];
                                                    char alpha3 = (char) android.graphics.Color.alpha(0);
                                                    int i504 = -(-android.view.View.getDefaultSize(0, 0));
                                                    int i505 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                    java.lang.Object[] objArr158 = new java.lang.Object[1];
                                                    k(alpha3, (i504 ^ 1396) + ((i504 & 1396) << 1), (i505 ^ 31) + ((i505 & 31) << 1), objArr158);
                                                    java.lang.String str107 = (java.lang.String) objArr158[0];
                                                    char indexOf9 = (char) android.text.TextUtils.indexOf(str83, str83);
                                                    int i506 = -(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                    int packedPositionType4 = android.widget.ExpandableListView.getPackedPositionType(0L);
                                                    java.lang.Object[] objArr159 = new java.lang.Object[1];
                                                    k(indexOf9, ((i506 | 1427) << 1) - (i506 ^ 1427), (packedPositionType4 ^ 26) + ((packedPositionType4 & 26) << 1), objArr159);
                                                    java.lang.String str108 = (java.lang.String) objArr159[0];
                                                    int i507 = (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                    char c30 = (char) ((~i507) + (i507 << 1));
                                                    int maximumFlingVelocity3 = android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16;
                                                    int i508 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                    int i509 = ~i508;
                                                    int i510 = ~((i509 ^ 23) | (i509 & 23));
                                                    int i511 = ~((i509 ^ i13) | (i509 & i13));
                                                    int i512 = ((((i508 * 141) - 3197) + (((i510 & i511) | (i510 ^ i511)) * (-280))) - (~(-(-(((~((i13 ^ (-24)) | (i13 & (-24)))) | i511) * 140))))) - 1;
                                                    int i513 = (i509 ^ (-24)) | (i509 & (-24));
                                                    int i514 = i509 | i23;
                                                    int i515 = (i23 ^ (-24)) | (i23 & (-24));
                                                    int i516 = ((~((i508 ^ i515) | (i508 & i515))) | (~((i514 ^ 23) | (i514 & 23))) | (~((i513 ^ i13) | (i513 & i13)))) * 140;
                                                    java.lang.Object[] objArr160 = new java.lang.Object[1];
                                                    k(c30, (maximumFlingVelocity3 & 1453) + (maximumFlingVelocity3 | 1453), (i512 ^ i516) + ((i516 & i512) << 1), objArr160);
                                                    java.lang.String str109 = (java.lang.String) objArr160[0];
                                                    int windowTouchSlop4 = android.view.ViewConfiguration.getWindowTouchSlop() >> 8;
                                                    java.lang.Object[] objArr161 = new java.lang.Object[1];
                                                    k((char) ((windowTouchSlop4 ^ 6997) + ((windowTouchSlop4 & 6997) << 1)), 1475 - (~(-(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16))), 32 - (~(-((android.os.Process.getThreadPriority(0) + 20) >> 6))), objArr161);
                                                    java.lang.String[] strArr37 = {str105, str106, str107, str108, str109, (java.lang.String) objArr161[0], str};
                                                    int i517 = -(-(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                                    int i518 = -android.graphics.Color.rgb(0, 0, 0);
                                                    int i519 = -android.view.KeyEvent.keyCodeFromString(str83);
                                                    java.lang.Object[] objArr162 = new java.lang.Object[1];
                                                    k((char) (((i517 | 27808) << 1) - (i517 ^ 27808)), (-16775708) - (~i518), (i519 ^ 13) + ((i519 & 13) << 1), objArr162);
                                                    java.lang.String str110 = (java.lang.String) objArr162[0];
                                                    int i520 = -android.view.KeyEvent.getDeadChar(0, 0);
                                                    int resolveSize2 = android.view.View.resolveSize(0, 0);
                                                    java.lang.Object[] objArr163 = new java.lang.Object[1];
                                                    k((char) (((34858 | i520) << 1) - (i520 ^ 34858)), (resolveSize2 ^ 1088) + ((resolveSize2 & 1088) << 1), 7 - (android.os.Process.myPid() >> 22), objArr163);
                                                    java.lang.String[] strArr38 = {str110, (java.lang.String) objArr163[0]};
                                                    char jumpTapTimeout6 = (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                                                    int i521 = -(-android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                                    int i522 = -(-android.graphics.ImageFormat.getBitsPerPixel(0));
                                                    java.lang.Object[] objArr164 = new java.lang.Object[1];
                                                    k(jumpTapTimeout6, (i521 & 1474) + (i521 | 1474), (i522 & 31) + (i522 | 31), objArr164);
                                                    java.lang.String str111 = (java.lang.String) objArr164[0];
                                                    char packedPositionType5 = (char) android.widget.ExpandableListView.getPackedPositionType(0L);
                                                    int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
                                                    int argb4 = android.graphics.Color.argb(0, 0, 0, 0);
                                                    java.lang.Object[] objArr165 = new java.lang.Object[1];
                                                    k(packedPositionType5, (edgeSlop >> 16) + 1552, (argb4 ^ 11) + ((argb4 & 11) << 1), objArr165);
                                                    java.lang.String[] strArr39 = {str111, (java.lang.String) objArr165[0]};
                                                    char combineMeasuredStates3 = (char) android.view.View.combineMeasuredStates(0, 0);
                                                    int i523 = -android.view.Gravity.getAbsoluteGravity(0, 0);
                                                    int i524 = -android.text.TextUtils.lastIndexOf(str83, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                    java.lang.Object[] objArr166 = new java.lang.Object[1];
                                                    k(combineMeasuredStates3, (i523 ^ 1563) + ((i523 & 1563) << 1), ((i524 | 18) << 1) - (i524 ^ 18), objArr166);
                                                    java.lang.String str112 = (java.lang.String) objArr166[0];
                                                    char c31 = (char) (44896 - (~(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)));
                                                    int i525 = -android.text.TextUtils.getOffsetBefore(str83, 0);
                                                    int i526 = -android.text.TextUtils.indexOf(str83, str83, 0);
                                                    java.lang.Object[] objArr167 = new java.lang.Object[1];
                                                    k(c31, (i525 ^ 1582) + ((i525 & 1582) << 1), ((i526 | 5) << 1) - (i526 ^ 5), objArr167);
                                                    java.lang.String[] strArr40 = {str112, (java.lang.String) objArr167[0]};
                                                    char modifierMetaStateMask5 = (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1);
                                                    int i527 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                    int axisFromString2 = android.view.MotionEvent.axisFromString(str83);
                                                    java.lang.Object[] objArr168 = new java.lang.Object[1];
                                                    k(modifierMetaStateMask5, ((i527 | 1587) << 1) - (i527 ^ 1587), (axisFromString2 & 20) + (axisFromString2 | 20), objArr168);
                                                    java.lang.String[] strArr41 = {(java.lang.String) objArr168[0]};
                                                    java.lang.Object[] objArr169 = new java.lang.Object[1];
                                                    k((char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 28793), 1606 - (~(-(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))), 16 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr169);
                                                    java.lang.String[] strArr42 = {(java.lang.String) objArr169[0]};
                                                    char c32 = (char) (14168 - (~(-(android.os.Process.myPid() >> 22))));
                                                    int i528 = -android.view.MotionEvent.axisFromString(str83);
                                                    int i529 = i528 * 934;
                                                    int i530 = ~i528;
                                                    int i531 = ~((i530 ^ i23) | (i530 & i23));
                                                    int i532 = i23;
                                                    int i533 = ~((i532 ^ (-1622)) | (i532 & (-1622)));
                                                    int i534 = ~(i528 | (-1622));
                                                    int i535 = -(-android.graphics.ImageFormat.getBitsPerPixel(0));
                                                    java.lang.Object[] objArr170 = new java.lang.Object[1];
                                                    k(c32, (((((-1510772) & i529) + (i529 | (-1510772))) - (~(((i531 & (-1622)) | (i531 ^ (-1622))) * (-933)))) - 1) + (((i533 & i534) | (i533 ^ i534)) * 933) + ((~((i528 ^ 1621) | (i528 & 1621))) * 933), (i535 & 20) + (i535 | 20), objArr170);
                                                    java.lang.String[] strArr43 = {(java.lang.String) objArr170[0]};
                                                    char indexOf10 = (char) android.text.TextUtils.indexOf(str83, str83, 0);
                                                    int i536 = -(-android.text.TextUtils.lastIndexOf(str83, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                                    java.lang.Object[] objArr171 = new java.lang.Object[1];
                                                    k(indexOf10, ((i536 | 1642) << 1) - (i536 ^ 1642), 19 - android.view.View.MeasureSpec.getSize(0), objArr171);
                                                    java.lang.String[] strArr44 = {(java.lang.String) objArr171[0]};
                                                    char absoluteGravity4 = (char) android.view.Gravity.getAbsoluteGravity(0, 0);
                                                    int i537 = -(-(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                                    java.lang.Object[] objArr172 = new java.lang.Object[1];
                                                    k(absoluteGravity4, (i537 & 1660) + (i537 | 1660), 22 - (~(-android.graphics.Color.blue(0))), objArr172);
                                                    java.lang.String[] strArr45 = {(java.lang.String) objArr172[0]};
                                                    int i538 = -(-android.graphics.Color.alpha(0));
                                                    int i539 = -android.widget.ExpandableListView.getPackedPositionType(0L);
                                                    int i540 = -(-(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                                    java.lang.Object[] objArr173 = new java.lang.Object[1];
                                                    k((char) ((i538 & 29139) + (i538 | 29139)), (i539 & 1683) + (i539 | 1683), ((i540 | 21) << 1) - (i540 ^ 21), objArr173);
                                                    java.lang.String[] strArr46 = {(java.lang.String) objArr173[0]};
                                                    char tapTimeout4 = (char) (android.view.ViewConfiguration.getTapTimeout() >> 16);
                                                    int i541 = -android.text.TextUtils.indexOf(str83, str83, 0);
                                                    int i542 = -android.view.View.resolveSize(0, 0);
                                                    java.lang.Object[] objArr174 = new java.lang.Object[1];
                                                    k(tapTimeout4, ((i541 | 1704) << 1) - (i541 ^ 1704), (i542 & 24) + (i542 | 24), objArr174);
                                                    java.lang.String str113 = str;
                                                    java.lang.String[] strArr47 = {(java.lang.String) objArr174[0], str113};
                                                    int i543 = -(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                                    int i544 = (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                    int i545 = -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                    java.lang.Object[] objArr175 = new java.lang.Object[1];
                                                    k((char) (((57199 | i543) << 1) - (i543 ^ 57199)), (i544 & 1727) + (i544 | 1727), (i545 & 27) + (i545 | 27), objArr175);
                                                    java.lang.String[] strArr48 = {(java.lang.String) objArr175[0], str113};
                                                    java.lang.Object[] objArr176 = new java.lang.Object[1];
                                                    k((char) ((-1) - android.text.TextUtils.lastIndexOf(str83, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), 1755 - (~android.view.View.getDefaultSize(0, 0)), 26 - (~(-android.text.TextUtils.getOffsetAfter(str83, 0))), objArr176);
                                                    java.lang.String[] strArr49 = {(java.lang.String) objArr176[0], str113};
                                                    char minimumFlingVelocity4 = (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                    int i546 = -((android.os.Process.getThreadPriority(0) + 20) >> 6);
                                                    int i547 = -android.text.TextUtils.lastIndexOf(str83, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                    java.lang.Object[] objArr177 = new java.lang.Object[1];
                                                    k(minimumFlingVelocity4, (i546 ^ 1783) + ((i546 & 1783) << 1), (i547 ^ 30) + ((i547 & 30) << 1), objArr177);
                                                    java.lang.String[] strArr50 = {(java.lang.String) objArr177[0], str113};
                                                    char c33 = (char) ((-android.text.TextUtils.lastIndexOf(str83, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)) - 1);
                                                    int i548 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    java.lang.Object[] objArr178 = new java.lang.Object[1];
                                                    k(c33, (i548 & 1814) + (i548 | 1814), 27 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr178);
                                                    java.lang.String[] strArr51 = {(java.lang.String) objArr178[0], str113};
                                                    char c34 = (char) (2438 - (~(android.view.ViewConfiguration.getJumpTapTimeout() >> 16)));
                                                    int trimmedLength5 = android.text.TextUtils.getTrimmedLength(str83);
                                                    int i549 = -android.text.TextUtils.getCapsMode(str83, 0, 0);
                                                    int i550 = ~i549;
                                                    int i551 = (i549 * (-665)) + 10688 + (i550 * (-333));
                                                    int i552 = ~((i550 & i532) | (i550 ^ i532));
                                                    int i553 = ~((i13 ^ 32) | (i13 & 32));
                                                    int i554 = -(-(((i552 ^ i553) | (i552 & i553)) * com.visa.cbp.getCertUsage.getODAData));
                                                    int i555 = ((i551 | i554) << 1) - (i551 ^ i554);
                                                    int i556 = ~((i550 ^ i13) | (i550 & i13));
                                                    int i557 = ~((i532 & 32) | (i532 ^ 32));
                                                    int i558 = -(-(((i556 ^ i557) | (i556 & i557)) * com.visa.cbp.getCertUsage.getODAData));
                                                    java.lang.Object[] objArr179 = new java.lang.Object[1];
                                                    k(c34, trimmedLength5 + 1841, (i555 & i558) + (i558 | i555), objArr179);
                                                    java.lang.String[][] strArr52 = {strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, strArr39, strArr40, strArr41, strArr42, strArr43, strArr44, strArr45, strArr46, strArr47, strArr48, strArr49, strArr50, strArr51, new java.lang.String[]{(java.lang.String) objArr179[0], str113}};
                                                    java.lang.Object[] objArr180 = new java.lang.Object[1];
                                                    k((char) (45197 - android.text.TextUtils.indexOf(str83, str83, 0)), 1874 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1 - android.text.TextUtils.getTrimmedLength(str83), objArr180);
                                                    int i559 = 0;
                                                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder((java.lang.String) objArr180[0]);
                                                    int i560 = i13;
                                                    int i561 = 0;
                                                    int i562 = 0;
                                                    while (i561 < 24) {
                                                        java.lang.String[] strArr53 = strArr52[i561];
                                                        java.lang.Object[] objArr181 = {strArr53[i559]};
                                                        java.lang.Object d32 = com.facetec.sdk.al.d(1590238701);
                                                        if (d32 == null) {
                                                            char indexOf11 = (char) android.text.TextUtils.indexOf(str83, str83, i559, i559);
                                                            int offsetBefore3 = android.text.TextUtils.getOffsetBefore(str83, i559);
                                                            int resolveSizeAndState2 = android.view.View.resolveSizeAndState(i559, i559, i559);
                                                            byte length13 = (byte) $$a.length;
                                                            byte b42 = (byte) (length13 - 5);
                                                            strArr4 = strArr52;
                                                            i28 = i268;
                                                            i29 = i560;
                                                            java.lang.Object[] objArr182 = new java.lang.Object[1];
                                                            m(length13, b42, (byte) (b42 + 1), objArr182);
                                                            d32 = com.facetec.sdk.al.c(indexOf11, 2078 - offsetBefore3, 24 - resolveSizeAndState2, -114923755, false, (java.lang.String) objArr182[0], new java.lang.Class[]{java.lang.String.class});
                                                        } else {
                                                            i28 = i268;
                                                            strArr4 = strArr52;
                                                            i29 = i560;
                                                        }
                                                        java.lang.String str114 = (java.lang.String) ((java.lang.reflect.Method) d32).invoke(null, objArr181);
                                                        java.lang.String[] strArr54 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr53, 1, strArr53.length);
                                                        if (str114 != null) {
                                                            int i563 = l + 67;
                                                            n = i563 % 128;
                                                            if (i563 % 2 != 0) {
                                                                str114.length();
                                                                java.lang.Object obj = null;
                                                                obj.hashCode();
                                                                throw null;
                                                            }
                                                            if (str114.length() != 0) {
                                                                if (strArr53.length != 1) {
                                                                    java.lang.Object[] objArr183 = {str114, strArr54};
                                                                    java.lang.Object d33 = com.facetec.sdk.al.d(-1033567267);
                                                                    if (d33 == null) {
                                                                        char pressedStateDuration2 = (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                                                                        int indexOf12 = android.text.TextUtils.indexOf(str83, str83, 0, 0);
                                                                        int axisFromString3 = android.view.MotionEvent.axisFromString(str83);
                                                                        byte b43 = (byte) 3;
                                                                        byte b44 = (byte) (b43 - 4);
                                                                        str15 = str114;
                                                                        java.lang.Object[] objArr184 = new java.lang.Object[1];
                                                                        m(b43, b44, (byte) (b44 + 1), objArr184);
                                                                        d33 = com.facetec.sdk.al.c(pressedStateDuration2, 662 - indexOf12, axisFromString3 + 24, 1703573797, false, (java.lang.String) objArr184[0], new java.lang.Class[]{java.lang.String.class, java.lang.String[].class});
                                                                    } else {
                                                                        str15 = str114;
                                                                    }
                                                                    long longValue19 = ((java.lang.Long) ((java.lang.reflect.Method) d33).invoke(null, objArr183)).longValue();
                                                                    long j116 = -584866591;
                                                                    int myUid2 = android.os.Process.myUid();
                                                                    long j117 = my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL;
                                                                    strArr5 = strArr53;
                                                                    sb2 = sb3;
                                                                    long j118 = myUid2;
                                                                    long j119 = j118 ^ j4;
                                                                    str16 = str83;
                                                                    i31 = i561;
                                                                    i32 = i532;
                                                                    long j120 = my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
                                                                    long j121 = j116 ^ j4;
                                                                    long j122 = (j117 * j116) + ((-520) * longValue19) + ((-1042) * (((j119 | longValue19) ^ j4) | j116)) + ((longValue19 | j118) * j120) + (j120 * (((j121 | j118) ^ j4) | ((j121 | (longValue19 ^ j4)) ^ j4) | (((j119 | j116) | longValue19) ^ j4))) + 1207795849;
                                                                    int nextInt9 = new java.util.Random().nextInt();
                                                                    int i564 = ((int) (j122 >> 32)) & (((((~((~nextInt9) | (-687999265))) | (~((-9818198) | nextInt9))) * (-302)) - 2032109922) + ((~((-687999265) | nextInt9)) * (-604)) + (((~(nextInt9 | (-697817462))) | (-2144862070)) * 302));
                                                                    int i565 = ~(i32 | 1513005432);
                                                                    i30 = i2;
                                                                    int i566 = ((int) j122) & (((((((~(i32 | (-1344735454))) | 1344667736) | (~(i32 | (-1513005433)))) | (~(1513073149 | i30))) * (-84)) - 1905160647) + (((~((-1513005433) | i30)) | 1344735453 | i565) * (-84)) + ((i565 | (-1513073150)) * 84));
                                                                    if (((i564 ^ i566) | (i564 & i566)) == 0) {
                                                                        sb = sb2;
                                                                        str14 = str16;
                                                                        i560 = i29;
                                                                        i561 = i31 + 1;
                                                                        int i567 = l;
                                                                        n = ((i567 & 3) + (i567 | 3)) % 128;
                                                                        str83 = str14;
                                                                        sb3 = sb;
                                                                        i13 = i30;
                                                                        strArr52 = strArr4;
                                                                        i532 = i32;
                                                                        i268 = i28;
                                                                        i559 = 0;
                                                                    }
                                                                } else {
                                                                    str15 = str114;
                                                                    i30 = i13;
                                                                    str16 = str83;
                                                                    sb2 = sb3;
                                                                    i31 = i561;
                                                                    i32 = i532;
                                                                    strArr5 = strArr53;
                                                                }
                                                                int i568 = i31 + 10;
                                                                i560 = ((~i568) & i30) | (i568 & i32);
                                                                int i569 = (i562 ^ 1) + ((i562 & 1) << 1);
                                                                if (i569 > 1) {
                                                                    char c35 = (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                                                    int keyRepeatTimeout4 = android.view.ViewConfiguration.getKeyRepeatTimeout();
                                                                    int keyCodeFromString2 = android.view.KeyEvent.keyCodeFromString(str16);
                                                                    java.lang.Object[] objArr185 = new java.lang.Object[1];
                                                                    k(c35, (keyRepeatTimeout4 >> 16) + 1874, ((keyCodeFromString2 | 2) << 1) - (keyCodeFromString2 ^ 2), objArr185);
                                                                    c3 = 0;
                                                                    sb = sb2;
                                                                    sb.append((java.lang.String) objArr185[0]);
                                                                } else {
                                                                    sb = sb2;
                                                                    c3 = 0;
                                                                }
                                                                sb.append(strArr5[c3]);
                                                                str14 = str16;
                                                                int i570 = -(-android.text.TextUtils.indexOf(str14, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                                                int i571 = -(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                                                int alpha4 = android.graphics.Color.alpha(0);
                                                                java.lang.Object[] objArr186 = new java.lang.Object[1];
                                                                k((char) ((i570 & 13678) + (i570 | 13678)), ((i571 | 1875) << 1) - (i571 ^ 1875), (alpha4 ^ 1) + ((alpha4 & 1) << 1), objArr186);
                                                                sb.append((java.lang.String) objArr186[0]);
                                                                sb.append(str15);
                                                                i562 = i569;
                                                                i561 = i31 + 1;
                                                                int i5672 = l;
                                                                n = ((i5672 & 3) + (i5672 | 3)) % 128;
                                                                str83 = str14;
                                                                sb3 = sb;
                                                                i13 = i30;
                                                                strArr52 = strArr4;
                                                                i532 = i32;
                                                                i268 = i28;
                                                                i559 = 0;
                                                            }
                                                        }
                                                        i30 = i13;
                                                        str14 = str83;
                                                        sb = sb3;
                                                        i31 = i561;
                                                        i32 = i532;
                                                        i560 = i29;
                                                        i561 = i31 + 1;
                                                        int i56722 = l;
                                                        n = ((i56722 & 3) + (i56722 | 3)) % 128;
                                                        str83 = str14;
                                                        sb3 = sb;
                                                        i13 = i30;
                                                        strArr52 = strArr4;
                                                        i532 = i32;
                                                        i268 = i28;
                                                        i559 = 0;
                                                    }
                                                    int i572 = i268;
                                                    i27 = i13;
                                                    str13 = str83;
                                                    java.lang.StringBuilder sb4 = sb3;
                                                    i23 = i532;
                                                    int i573 = i560;
                                                    int i574 = -(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                    int i575 = -(-(android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                                                    java.lang.Object[] objArr187 = new java.lang.Object[1];
                                                    k((char) ((i574 & 1) + (i574 | 1)), (i575 & 1877) + (i575 | 1877), 0 - (~(-(android.view.ViewConfiguration.getScrollBarSize() >> 8))), objArr187);
                                                    sb4.append((java.lang.String) objArr187[0]);
                                                    java.lang.Object[] objArr188 = new java.lang.Object[2];
                                                    if (i562 > 2) {
                                                        objArr188[1] = new int[1];
                                                        java.lang.String[] strArr55 = {sb4.toString()};
                                                        ((int[]) objArr188[1])[0] = i573;
                                                        objArr188[0] = strArr55;
                                                    } else {
                                                        objArr188[1] = new int[]{i27};
                                                        objArr188[0] = null;
                                                    }
                                                    int i576 = ((int[]) objArr188[1])[0];
                                                    int i577 = (~(i27 & i572)) & (i27 | i572);
                                                    int i578 = -i577;
                                                    int i579 = ((i577 ^ i578) | (i577 & i578)) >> 31;
                                                    i268 = (i576 & (~i579)) | (i572 & i579);
                                                    strArr3 = (java.lang.String[]) objArr188[0];
                                                    c2 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                                                    int i2732 = -android.text.AndroidCharacter.getMirror(c2);
                                                    int i2742 = -(-(android.view.ViewConfiguration.getEdgeSlop() >> 16));
                                                    java.lang.Object[] objArr742 = new java.lang.Object[1];
                                                    k((char) ((i2732 & 8896) + (i2732 | 8896)), (i2742 & 1159) + (i2742 | 1159), 16 - (~android.text.TextUtils.lastIndexOf(str13, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr742);
                                                    java.lang.Object[] objArr752 = {(java.lang.String) objArr742[0]};
                                                    d4 = com.facetec.sdk.al.d(1590238701);
                                                    if (d4 == null) {
                                                    }
                                                    invoke = ((java.lang.reflect.Method) d4).invoke(null, objArr752);
                                                    if (invoke != null) {
                                                    }
                                                    if (i33 != 1986687685) {
                                                    }
                                                    str17 = str13;
                                                    i34 = i268;
                                                    int i3302 = -android.text.TextUtils.indexOf(str17, str17, 0);
                                                    int i3312 = -(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                    java.lang.Object[] objArr1042 = new java.lang.Object[1];
                                                    k((char) ((54855 ^ i3302) + ((i3302 & 54855) << 1)), (i3312 ^ 2220) + ((i3312 & 2220) << 1), 13 - android.view.View.combineMeasuredStates(0, 0), objArr1042);
                                                    java.lang.String str722 = (java.lang.String) objArr1042[0];
                                                    char c192 = (char) (49992 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                                    int bitsPerPixel3 = android.graphics.ImageFormat.getBitsPerPixel(0);
                                                    int i3322 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                    java.lang.Object[] objArr1052 = new java.lang.Object[1];
                                                    k(c192, bitsPerPixel3 + 2234, (i3322 ^ 6) + ((i3322 & 6) << 1), objArr1052);
                                                    java.lang.String[] strArr222 = {str722, (java.lang.String) objArr1052[0]};
                                                    int i3332 = -(-android.graphics.Color.blue(0));
                                                    java.lang.Object[] objArr1062 = new java.lang.Object[1];
                                                    k((char) ((57370 & i3332) + (i3332 | 57370)), 2237 - (~(-(-(android.os.Process.myTid() >> 22)))), android.text.TextUtils.indexOf(str17, str17, 0, 0) + 15, objArr1062);
                                                    java.lang.String str732 = (java.lang.String) objArr1062[0];
                                                    int i3342 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                    int d282 = com.facetec.sdk.ou.d();
                                                    int i3352 = ~i3342;
                                                    int i3362 = ~(43265 | i3352);
                                                    int i3372 = ~(((-43266) ^ i3342) | ((-43266) & i3342));
                                                    int i3382 = (i3362 ^ i3372) | (i3362 & i3372);
                                                    int i3392 = ~(((-43266) & d282) | ((-43266) ^ d282));
                                                    int i3402 = (i3342 * 399) + 17262735 + (((i3382 ^ i3392) | (i3382 & i3392)) * 398) + (((i3342 & 43265) | (43265 ^ i3342)) * (-1194));
                                                    int i3412 = ~d282;
                                                    int i3422 = ~((i3412 ^ (-43266)) | ((-43266) & i3412));
                                                    int i3432 = ~((43265 & i3352) | (i3352 ^ 43265));
                                                    int i3442 = (i3422 ^ i3432) | (i3422 & i3432);
                                                    int i3452 = -(-(((i3442 ^ i3372) | (i3372 & i3442)) * 398));
                                                    int i3462 = -(-android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                                    int i3472 = -(-(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                                    java.lang.Object[] objArr1072 = new java.lang.Object[1];
                                                    k((char) ((i3402 & i3452) + (i3452 | i3402)), (i3462 & 2253) + (i3462 | 2253), (i3472 & 19) + (i3472 | 19), objArr1072);
                                                    java.lang.String str742 = (java.lang.String) objArr1072[0];
                                                    char c202 = (char) ((-2) - (~(-android.text.TextUtils.indexOf(str17, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0))));
                                                    int i3482 = -android.view.View.resolveSizeAndState(0, 0, 0);
                                                    int i3492 = -(-android.view.View.resolveSizeAndState(0, 0, 0));
                                                    java.lang.Object[] objArr1082 = new java.lang.Object[1];
                                                    k(c202, ((i3482 | 2272) << 1) - (i3482 ^ 2272), ((i3492 | 14) << 1) - (i3492 ^ 14), objArr1082);
                                                    java.lang.String[] strArr232 = {str732, str742, (java.lang.String) objArr1082[0]};
                                                    int i3502 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                    char mirror32 = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                    int i3512 = -android.view.MotionEvent.axisFromString(str17);
                                                    java.lang.Object[] objArr1092 = new java.lang.Object[1];
                                                    k((char) ((36653 & i3502) + (i3502 | 36653)), mirror32 + 2238, (i3512 ^ 20) + ((i3512 & 20) << 1), objArr1092);
                                                    java.lang.String str752 = (java.lang.String) objArr1092[0];
                                                    java.lang.Object[] objArr1102 = new java.lang.Object[1];
                                                    k((char) (8769 - (~(-android.text.TextUtils.indexOf(str17, str17, 0, 0)))), 2306 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 9 - (~(-android.graphics.Color.alpha(0))), objArr1102);
                                                    java.lang.String[] strArr242 = {str752, (java.lang.String) objArr1102[0]};
                                                    char c212 = (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 13423);
                                                    int i3522 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                    int packedPositionGroup62 = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                                    java.lang.Object[] objArr1112 = new java.lang.Object[1];
                                                    k(c212, 2316 - (~i3522), (packedPositionGroup62 ^ 11) + ((packedPositionGroup62 & 11) << 1), objArr1112);
                                                    java.lang.String str762 = (java.lang.String) objArr1112[0];
                                                    java.lang.Object[] objArr1122 = new java.lang.Object[1];
                                                    k((char) (6889 - (~(android.view.ViewConfiguration.getEdgeSlop() >> 16))), 856 - (~(-(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16))), 5 - (~(-(-(android.view.ViewConfiguration.getWindowTouchSlop() >> 8)))), objArr1122);
                                                    java.lang.String[] strArr252 = {str762, (java.lang.String) objArr1122[0]};
                                                    int i3532 = -(-(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                                    int i3542 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
                                                    java.lang.Object[] objArr1132 = new java.lang.Object[1];
                                                    k((char) ((i3532 ^ 16646) + ((i3532 & 16646) << 1)), (i3542 & 2328) + (i3542 | 2328), 27 - (~(-(-android.graphics.Color.green(0)))), objArr1132);
                                                    java.lang.String str772 = (java.lang.String) objArr1132[0];
                                                    int i3552 = -(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                    int i3562 = i3552 * (-830);
                                                    int i3572 = (7296640 ^ i3562) + ((i3562 & 7296640) << 1);
                                                    int i3582 = i23;
                                                    int i3592 = ~((i3582 & (-8771)) | (i3582 ^ (-8771)));
                                                    int i3602 = ~((i3552 ^ 8770) | (i3552 & 8770) | i27);
                                                    int i3612 = ((i3592 ^ i3602) | (i3592 & i3602)) * (-831);
                                                    int i3622 = (i3552 & (-8771)) | (i3552 ^ (-8771));
                                                    int i3632 = ~i3552;
                                                    int i3642 = ~((i3632 ^ i3582) | (i3632 & i3582));
                                                    int i3652 = ~(i3552 | i27);
                                                    char c222 = (char) ((((((i3572 & i3612) + (i3572 | i3612)) - (~((~((i3622 & i27) | (i3622 ^ i27))) * (-1662)))) - 1) - (~((((i3652 ^ i3642) | (i3652 & i3642)) | (~(i27 | 8770))) * 831))) - 1);
                                                    int i3662 = -(-(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                                    int i3672 = (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                    java.lang.Object[] objArr1142 = new java.lang.Object[1];
                                                    k(c222, ((i3662 | 2306) << 1) - (i3662 ^ 2306), (i3672 ^ 9) + ((i3672 & 9) << 1), objArr1142);
                                                    java.lang.String[][] strArr262 = {strArr222, strArr232, strArr242, strArr252, new java.lang.String[]{str772, (java.lang.String) objArr1142[0]}};
                                                    int i3682 = -1;
                                                    i35 = 0;
                                                    loop7: while (true) {
                                                        if (i35 < 5) {
                                                        }
                                                        i35++;
                                                        str17 = str17;
                                                    }
                                                    int i3782 = i25 ^ i36;
                                                    int i3792 = -i3782;
                                                    int i3802 = ((i3782 ^ i3792) | (i3782 & i3792)) >> 31;
                                                    int i3812 = (i36 & i3802) | (i38 & (~i3802));
                                                    int deadChar4 = android.view.KeyEvent.getDeadChar(0, 0);
                                                    int i3822 = -android.graphics.Color.green(0);
                                                    java.lang.Object[] objArr1172 = new java.lang.Object[1];
                                                    k((char) (((deadChar4 | 7561) << 1) - (deadChar4 ^ 7561)), (i3822 ^ 2356) + ((i3822 & 2356) << 1), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 13, objArr1172);
                                                    java.lang.String str792 = (java.lang.String) objArr1172[0];
                                                    int i3832 = -(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                    int i3842 = -(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                    java.lang.Object[] objArr1182 = new java.lang.Object[1];
                                                    k((char) ((i3832 ^ 15808) + ((i3832 & 15808) << 1)), ((i3842 | 2369) << 1) - (i3842 ^ 2369), 7 - (~android.graphics.Color.red(0)), objArr1182);
                                                } else {
                                                    i25 = i13;
                                                    i26 = i23;
                                                    strArr2 = null;
                                                }
                                                int i3972 = ((~i262) & i25) | (i262 & i26);
                                                int i3982 = -i3972;
                                                java.lang.Object[] objArr1242 = {new int[1], strArr2, new int[]{i262}, new int[]{i25}};
                                                int i3992 = ((((~(777876558 | r4)) | (-1860042320)) * 305) - 1995483012) + (((~((~android.os.Process.myPid()) | 777876558)) | (-1250799176)) * 305) + ((((i3972 ^ i3982) | (i3972 & i3982)) >> 31) & 16);
                                                int i4002 = ~i3992;
                                                int i4012 = (i4002 ^ i4) | (i4002 & i4);
                                                int i4022 = ~i4012;
                                                int i4032 = ~((i4002 & i25) | (i4002 ^ i25));
                                                int i4042 = ~((i4012 ^ i25) | (i25 & i4012));
                                                int i4052 = (i26 ^ i3992) | (i26 & i3992);
                                                int i4062 = ~((i4052 ^ i4) | (i4 & i4052));
                                                int i4072 = (((i3992 * 755) - (~(-(-(i4 * (-753)))))) - 1) + (((~((i4 & i25) | (i4 ^ i25))) | (i4032 & i4022) | (i4022 ^ i4032)) * (-754)) + (((i4042 & i4062) | (i4042 ^ i4062)) * (-754));
                                                int i4082 = ((i4002 ^ i26) | (i4002 & i26)) * 754;
                                                int i4092 = ((i4072 | i4082) << 1) - (i4082 ^ i4072);
                                                int i4102 = i4092 << 13;
                                                int i4112 = ((~i4102) & i4092) | ((~i4092) & i4102);
                                                int i4122 = i4112 >>> 17;
                                                int i4132 = (i4112 & (~i4122)) | ((~i4112) & i4122);
                                                ((int[]) objArr1242[0])[0] = i4132 ^ (i4132 << 5);
                                                return objArr1242;
                                            }
                                        }
                                        char keyRepeatTimeout5 = (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                        int defaultSize3 = android.view.View.getDefaultSize(0, 0);
                                        java.lang.Object[] objArr189 = new java.lang.Object[1];
                                        k(keyRepeatTimeout5, (defaultSize3 ^ 863) + ((defaultSize3 & 863) << 1), 12 - (~(-(-(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)))), objArr189);
                                        java.lang.String str115 = (java.lang.String) objArr189[0];
                                        char c36 = (char) ((-(-(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))) - 1);
                                        int defaultSize4 = android.view.View.getDefaultSize(0, 0);
                                        int normalizeMetaState3 = android.view.KeyEvent.normalizeMetaState(0);
                                        java.lang.Object[] objArr190 = new java.lang.Object[1];
                                        k(c36, defaultSize4 + 876, (normalizeMetaState3 & 9) + (normalizeMetaState3 | 9), objArr190);
                                        str8 = (java.lang.String) objArr190[0];
                                        file3 = new java.io.File(str115);
                                        if (file3.exists() && file3.isFile()) {
                                            try {
                                                java.util.Scanner scanner4 = new java.util.Scanner(new java.io.FileInputStream(file3));
                                                int i580 = (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                int i581 = (i580 * 367) + 2056301;
                                                int i582 = ((i580 ^ 5603) | (i580 & 5603)) * (-366);
                                                int i583 = ~((i13 & (-5604)) | (i13 ^ (-5604)));
                                                int i584 = ((((i581 | i582) << 1) - (i581 ^ i582)) - (~(-(-(((i583 & i580) | (i580 ^ i583)) * (-366)))))) - 1;
                                                int i585 = ~((~i580) | 5603);
                                                int i586 = i580 | (-5604);
                                                int i587 = ~((i586 ^ i13) | (i586 & i13));
                                                int i588 = ((i587 ^ i585) | (i587 & i585)) * 366;
                                                char c37 = (char) ((i584 ^ i588) + ((i588 & i584) << 1));
                                                int i589 = -android.view.Gravity.getAbsoluteGravity(0, 0);
                                                java.lang.Object[] objArr191 = new java.lang.Object[1];
                                                k(c37, ((i589 | 497) << 1) - (i589 ^ 497), 1 - (~(-(android.view.ViewConfiguration.getJumpTapTimeout() >> 16))), objArr191);
                                                useDelimiter = scanner4.useDelimiter((java.lang.String) objArr191[0]);
                                                if (useDelimiter.hasNext()) {
                                                    str9 = str42;
                                                } else {
                                                    int i590 = ((~((1296851872 & i16) | (1296851872 ^ i16))) | (~(192468605 | i13))) * com.visa.cbp.getCertUsage.getODAData;
                                                    int i591 = ((918097199 | i590) << 1) - (i590 ^ 918097199);
                                                    int i592 = ~((1296851872 & i13) | (1296851872 ^ i13));
                                                    int i593 = ~(192468605 | i16);
                                                    int i594 = -(-(((i592 ^ i593) | (i592 & i593)) * com.visa.cbp.getCertUsage.getODAData));
                                                    int d34 = com.facetec.sdk.ou.d();
                                                    int i595 = ~d34;
                                                    int i596 = ((i595 ^ (-1937464288)) | ((-1937464288) & i595)) * 1324;
                                                    int i597 = ~(((-57825946) & d34) | ((-57825946) ^ d34));
                                                    int i598 = ~((d34 ^ (-1934166855)) | ((-1934166855) & d34));
                                                    int i599 = ((((-1847718411) | i596) << 1) - (i596 ^ (-1847718411))) + (((i598 ^ i597) | (i598 & i597)) * (-1324));
                                                    if (((i591 | i594) << 1) - (i594 ^ i591) <= ((962967210 | i599) << 1) - (962967210 ^ i599)) {
                                                        useDelimiter.next();
                                                        java.lang.Object obj2 = null;
                                                        obj2.hashCode();
                                                        throw null;
                                                    }
                                                    str9 = useDelimiter.next();
                                                }
                                                useDelimiter.close();
                                            } catch (java.io.IOException unused5) {
                                            }
                                            if (str9.contains(str8)) {
                                                i21 = (i13 & (-262)) | (i16 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE);
                                                int i2302 = (~(i13 & i224)) & (i13 | i224);
                                                int i2312 = (i2302 | (-i2302)) >> 31;
                                                int i2322 = (i224 & i2312) | (i21 & (~i2312));
                                                if ((i3 & 8) != 0) {
                                                }
                                                char doubleTapTimeout32 = (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 60923);
                                                int myPid22 = android.os.Process.myPid() >> 22;
                                                int i2512 = myPid22 * (-159);
                                                int i2522 = ((-160113) ^ i2512) + ((i2512 & (-160113)) << 1);
                                                int i2532 = ~myPid22;
                                                int i2542 = ((i2532 ^ 1007) | (i2532 & 1007)) * 160;
                                                int i2552 = ~((i16 & (-1008)) | (i16 ^ (-1008)));
                                                java.lang.Object[] objArr622 = new java.lang.Object[1];
                                                k(doubleTapTimeout32, (((((i2522 | i2542) << 1) - (i2542 ^ i2522)) + (((~((i16 ^ myPid22) | (i16 & myPid22))) | (~((myPid22 ^ 1007) | (myPid22 & 1007)))) * (-160))) - (~(((myPid22 ^ i2552) | (myPid22 & i2552)) * 160))) - 1, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 41, objArr622);
                                                java.lang.String str532 = (java.lang.String) objArr622[0];
                                                str11 = str10;
                                                char lastIndexOf52 = (char) (55784 - android.text.TextUtils.lastIndexOf(str11, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                                int packedPositionType22 = android.widget.ExpandableListView.getPackedPositionType(0L);
                                                int i2562 = -(-android.graphics.Color.blue(0));
                                                java.lang.Object[] objArr632 = new java.lang.Object[1];
                                                k(lastIndexOf52, (packedPositionType22 ^ 1048) + ((packedPositionType22 & 1048) << 1), ((i2562 | 30) << 1) - (i2562 ^ 30), objArr632);
                                                strArr = new java.lang.String[]{str532, (java.lang.String) objArr632[0]};
                                                i22 = 0;
                                                while (true) {
                                                    if (i22 < 2) {
                                                    }
                                                    int i2572 = (i22 ^ (-122)) + ((i22 & (-122)) << 1);
                                                    i22 = (i2572 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i2572 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1);
                                                    strArr = strArr12;
                                                    str11 = str12;
                                                    i16 = i23;
                                                }
                                                int i2582 = ((~i2322) & i13) | (i2322 & i23);
                                                int i2592 = (i2582 | (-i2582)) >> 31;
                                                int i2602 = i24 & (~i2592);
                                                int i2612 = i2322 & i2592;
                                                int i2622 = (i2612 ^ i2602) | (i2612 & i2602);
                                                d3 = com.facetec.sdk.al.d(-1270134912);
                                                if (d3 == null) {
                                                }
                                                long longValue92 = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, null)).longValue();
                                                long j622 = -1817303566;
                                                long j632 = 302;
                                                long j642 = -301;
                                                long j652 = longValue92 ^ j27;
                                                long j662 = 301;
                                                j2 = ((((((-300) * j622) + (j632 * longValue92)) + ((((longValue92 | j622) | j) ^ j27) * j642)) + ((((j652 | j) ^ j27) | ((j30 | j622) ^ j27)) * j642)) + (((((j622 ^ j27) | j) ^ j27) | j652) * j662)) - 7618927;
                                                myTid = android.os.Process.myTid();
                                                if (((((int) (j2 >> 32)) & ((((((~myTid) | (-362123669)) * 1444) - 1153123274) + ((((~(myTid | (-1593085285))) | 1247808608) | (~((-1264655601) | myTid))) * (-1444))) - 539716760)) | (((int) j2) & (((((~(i23 | 678904824)) | (-2116131235)) * (-328)) - 261639415) + (((-2116131235) | i13) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((~((-678904825) | i13)) | 5653080 | (~(i23 | (-1442879491)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE)))) == 1) {
                                                }
                                                int i39722 = ((~i2622) & i25) | (i2622 & i26);
                                                int i39822 = -i39722;
                                                java.lang.Object[] objArr12422 = {new int[1], strArr2, new int[]{i2622}, new int[]{i25}};
                                                int i39922 = ((((~(777876558 | r4)) | (-1860042320)) * 305) - 1995483012) + (((~((~android.os.Process.myPid()) | 777876558)) | (-1250799176)) * 305) + ((((i39722 ^ i39822) | (i39722 & i39822)) >> 31) & 16);
                                                int i40022 = ~i39922;
                                                int i40122 = (i40022 ^ i4) | (i40022 & i4);
                                                int i40222 = ~i40122;
                                                int i40322 = ~((i40022 & i25) | (i40022 ^ i25));
                                                int i40422 = ~((i40122 ^ i25) | (i25 & i40122));
                                                int i40522 = (i26 ^ i39922) | (i26 & i39922);
                                                int i40622 = ~((i40522 ^ i4) | (i4 & i40522));
                                                int i40722 = (((i39922 * 755) - (~(-(-(i4 * (-753)))))) - 1) + (((~((i4 & i25) | (i4 ^ i25))) | (i40322 & i40222) | (i40222 ^ i40322)) * (-754)) + (((i40422 & i40622) | (i40422 ^ i40622)) * (-754));
                                                int i40822 = ((i40022 ^ i26) | (i40022 & i26)) * 754;
                                                int i40922 = ((i40722 | i40822) << 1) - (i40822 ^ i40722);
                                                int i41022 = i40922 << 13;
                                                int i41122 = ((~i41022) & i40922) | ((~i40922) & i41022);
                                                int i41222 = i41122 >>> 17;
                                                int i41322 = (i41122 & (~i41222)) | ((~i41122) & i41222);
                                                ((int[]) objArr12422[0])[0] = i41322 ^ (i41322 << 5);
                                                return objArr12422;
                                            }
                                        }
                                        i21 = i13;
                                        int i23022 = (~(i13 & i224)) & (i13 | i224);
                                        int i23122 = (i23022 | (-i23022)) >> 31;
                                        int i23222 = (i224 & i23122) | (i21 & (~i23122));
                                        if ((i3 & 8) != 0) {
                                        }
                                        char doubleTapTimeout322 = (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 60923);
                                        int myPid222 = android.os.Process.myPid() >> 22;
                                        int i25122 = myPid222 * (-159);
                                        int i25222 = ((-160113) ^ i25122) + ((i25122 & (-160113)) << 1);
                                        int i25322 = ~myPid222;
                                        int i25422 = ((i25322 ^ 1007) | (i25322 & 1007)) * 160;
                                        int i25522 = ~((i16 & (-1008)) | (i16 ^ (-1008)));
                                        java.lang.Object[] objArr6222 = new java.lang.Object[1];
                                        k(doubleTapTimeout322, (((((i25222 | i25422) << 1) - (i25422 ^ i25222)) + (((~((i16 ^ myPid222) | (i16 & myPid222))) | (~((myPid222 ^ 1007) | (myPid222 & 1007)))) * (-160))) - (~(((myPid222 ^ i25522) | (myPid222 & i25522)) * 160))) - 1, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 41, objArr6222);
                                        java.lang.String str5322 = (java.lang.String) objArr6222[0];
                                        str11 = str10;
                                        char lastIndexOf522 = (char) (55784 - android.text.TextUtils.lastIndexOf(str11, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                        int packedPositionType222 = android.widget.ExpandableListView.getPackedPositionType(0L);
                                        int i25622 = -(-android.graphics.Color.blue(0));
                                        java.lang.Object[] objArr6322 = new java.lang.Object[1];
                                        k(lastIndexOf522, (packedPositionType222 ^ 1048) + ((packedPositionType222 & 1048) << 1), ((i25622 | 30) << 1) - (i25622 ^ 30), objArr6322);
                                        strArr = new java.lang.String[]{str5322, (java.lang.String) objArr6322[0]};
                                        i22 = 0;
                                        while (true) {
                                            if (i22 < 2) {
                                            }
                                            int i25722 = (i22 ^ (-122)) + ((i22 & (-122)) << 1);
                                            i22 = (i25722 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i25722 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1);
                                            strArr = strArr12;
                                            str11 = str12;
                                            i16 = i23;
                                        }
                                        int i25822 = ((~i23222) & i13) | (i23222 & i23);
                                        int i25922 = (i25822 | (-i25822)) >> 31;
                                        int i26022 = i24 & (~i25922);
                                        int i26122 = i23222 & i25922;
                                        int i26222 = (i26122 ^ i26022) | (i26122 & i26022);
                                        d3 = com.facetec.sdk.al.d(-1270134912);
                                        if (d3 == null) {
                                        }
                                        long longValue922 = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, null)).longValue();
                                        long j6222 = -1817303566;
                                        long j6322 = 302;
                                        long j6422 = -301;
                                        long j6522 = longValue922 ^ j27;
                                        long j6622 = 301;
                                        j2 = ((((((-300) * j6222) + (j6322 * longValue922)) + ((((longValue922 | j6222) | j) ^ j27) * j6422)) + ((((j6522 | j) ^ j27) | ((j30 | j6222) ^ j27)) * j6422)) + (((((j6222 ^ j27) | j) ^ j27) | j6522) * j6622)) - 7618927;
                                        myTid = android.os.Process.myTid();
                                        if (((((int) (j2 >> 32)) & ((((((~myTid) | (-362123669)) * 1444) - 1153123274) + ((((~(myTid | (-1593085285))) | 1247808608) | (~((-1264655601) | myTid))) * (-1444))) - 539716760)) | (((int) j2) & (((((~(i23 | 678904824)) | (-2116131235)) * (-328)) - 261639415) + (((-2116131235) | i13) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((~((-678904825) | i13)) | 5653080 | (~(i23 | (-1442879491)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE)))) == 1) {
                                        }
                                        int i397222 = ((~i26222) & i25) | (i26222 & i26);
                                        int i398222 = -i397222;
                                        java.lang.Object[] objArr124222 = {new int[1], strArr2, new int[]{i26222}, new int[]{i25}};
                                        int i399222 = ((((~(777876558 | r4)) | (-1860042320)) * 305) - 1995483012) + (((~((~android.os.Process.myPid()) | 777876558)) | (-1250799176)) * 305) + ((((i397222 ^ i398222) | (i397222 & i398222)) >> 31) & 16);
                                        int i400222 = ~i399222;
                                        int i401222 = (i400222 ^ i4) | (i400222 & i4);
                                        int i402222 = ~i401222;
                                        int i403222 = ~((i400222 & i25) | (i400222 ^ i25));
                                        int i404222 = ~((i401222 ^ i25) | (i25 & i401222));
                                        int i405222 = (i26 ^ i399222) | (i26 & i399222);
                                        int i406222 = ~((i405222 ^ i4) | (i4 & i405222));
                                        int i407222 = (((i399222 * 755) - (~(-(-(i4 * (-753)))))) - 1) + (((~((i4 & i25) | (i4 ^ i25))) | (i403222 & i402222) | (i402222 ^ i403222)) * (-754)) + (((i404222 & i406222) | (i404222 ^ i406222)) * (-754));
                                        int i408222 = ((i400222 ^ i26) | (i400222 & i26)) * 754;
                                        int i409222 = ((i407222 | i408222) << 1) - (i408222 ^ i407222);
                                        int i410222 = i409222 << 13;
                                        int i411222 = ((~i410222) & i409222) | ((~i409222) & i410222);
                                        int i412222 = i411222 >>> 17;
                                        int i413222 = (i411222 & (~i412222)) | ((~i411222) & i412222);
                                        ((int[]) objArr124222[0])[0] = i413222 ^ (i413222 << 5);
                                        return objArr124222;
                                    }
                                }
                            }
                            i18 = i13;
                            int i1862 = (~(i13 & i179)) & (i13 | i179);
                            int i1872 = (i1862 | (-i1862)) >> 31;
                            int i1882 = (i179 & i1872) | (i18 & (~i1872));
                            java.lang.Object[] objArr422 = new java.lang.Object[1];
                            k((char) (0 - (~android.text.TextUtils.indexOf(str42, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0))), (android.os.Process.myTid() >> 22) + 640, 23 - (~(-(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)))), objArr422);
                            java.lang.Object[] objArr432 = {(java.lang.String) objArr422[0]};
                            d2 = com.facetec.sdk.al.d(1590238701);
                            if (d2 == null) {
                            }
                            java.lang.String lowerCase2 = ((java.lang.String) ((java.lang.reflect.Method) d2).invoke(null, objArr432)).toLowerCase();
                            int i1892 = -android.os.Process.getGidForName(str42);
                            int i1902 = -((android.os.Process.getThreadPriority(0) + 20) >> 6);
                            java.lang.Object[] objArr452 = new java.lang.Object[1];
                            k((char) ((i1892 & 22821) + (i1892 | 22821)), ((i1902 | 663) << 1) - (i1902 ^ 663), 4 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr452);
                            int i1912 = i13 ^ i1882;
                            int i1922 = -i1912;
                            int i1932 = ((i1912 ^ i1922) | (i1912 & i1922)) >> 31;
                            int i1942 = (!lowerCase2.contains((java.lang.String) objArr452[0]) ? (~(i13 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE)) & (i13 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE) : i13) & (~i1932);
                            int i1952 = i1882 & i1932;
                            int i1962 = (i1952 ^ i1942) | (i1952 & i1942);
                            java.lang.Object[] objArr462 = new java.lang.Object[1];
                            k((char) ((-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))) - 1), 666 - (~(-(android.view.ViewConfiguration.getFadingEdgeLength() >> 16))), 41 - (~android.view.KeyEvent.normalizeMetaState(0)), objArr462);
                            java.lang.String str442 = (java.lang.String) objArr462[0];
                            char red32 = (char) android.graphics.Color.red(0);
                            int capsMode3 = android.text.TextUtils.getCapsMode(str42, 0, 0);
                            java.lang.Object[] objArr472 = new java.lang.Object[1];
                            k(red32, (capsMode3 ^ 709) + ((capsMode3 & 709) << 1), 39 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr472);
                            java.lang.String str452 = (java.lang.String) objArr472[0];
                            int i1972 = -android.text.TextUtils.lastIndexOf(str42, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                            char c122 = (char) ((~i1972) + (i1972 << 1));
                            int offsetAfter2 = android.text.TextUtils.getOffsetAfter(str42, 0);
                            int i1982 = (offsetAfter2 * 960) - 1435833;
                            int i1992 = ~((i16 ^ (-750)) | (i16 & (-750)));
                            int i2002 = ~((offsetAfter2 ^ i13) | (offsetAfter2 & i13));
                            int i2012 = ((i1992 ^ i2002) | (i1992 & i2002)) * 959;
                            int i2022 = ((i1982 | i2012) << 1) - (i1982 ^ i2012);
                            int i2032 = ~((i13 ^ (-750)) | (i13 & (-750)));
                            int i2042 = ~((offsetAfter2 ^ i16) | (offsetAfter2 & i16));
                            int i2052 = -(-(((i2032 ^ i2042) | (i2042 & i2032)) * 959));
                            int i2062 = -android.widget.ExpandableListView.getPackedPositionType(0L);
                            java.lang.Object[] objArr482 = new java.lang.Object[1];
                            k(c122, (((719250 ^ i2022) + ((i2022 & 719250) << 1)) - (~i2052)) - 1, (i2062 ^ 27) + ((i2062 & 27) << 1), objArr482);
                            java.lang.String str462 = (java.lang.String) objArr482[0];
                            int i2072 = -android.view.View.getDefaultSize(0, 0);
                            int i2082 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                            int i2092 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            int d162 = com.facetec.sdk.ou.d();
                            int i2102 = ~i2092;
                            int i2112 = ~((i2102 ^ 27) | (i2102 & 27));
                            int i2122 = ~((~d162) | i2092);
                            int i2132 = ~((i2102 ^ (-28)) | (i2102 & (-28)));
                            java.lang.Object[] objArr492 = new java.lang.Object[1];
                            k((char) (((56229 | i2072) << 1) - (i2072 ^ 56229)), (i2082 ^ 776) + ((i2082 & 776) << 1), ((((((i2092 * 375) - 20169) - (~(((i2122 & i2112) | (i2112 ^ i2122)) * (-374)))) - 1) + ((~((i2092 & (-28)) | (i2092 ^ (-28)))) * 748)) - (~(-(-(((i2132 ^ i2122) | (i2132 & i2122)) * 374))))) - 1, objArr492);
                            java.lang.String str472 = (java.lang.String) objArr492[0];
                            int i2142 = (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            int touchSlop22 = android.view.ViewConfiguration.getTouchSlop();
                            int i2152 = -(-(android.os.Process.myTid() >> 22));
                            java.lang.Object[] objArr502 = new java.lang.Object[1];
                            k((char) ((41877 & i2142) + (i2142 | 41877)), 803 - (touchSlop22 >> 8), (i2152 ^ 27) + ((i2152 & 27) << 1), objArr502);
                            java.lang.String str482 = (java.lang.String) objArr502[0];
                            int i2162 = -android.graphics.Color.rgb(0, 0, 0);
                            double convertQuartSecToDecDegrees2 = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
                            int i2172 = -(-android.text.TextUtils.lastIndexOf(str42, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                            java.lang.Object[] objArr512 = new java.lang.Object[1];
                            k((char) (((-16750736) & i2162) + (i2162 | (-16750736))), 829 - (~(convertQuartSecToDecDegrees2 > 0.0d ? 1 : (convertQuartSecToDecDegrees2 == 0.0d ? 0 : -1))), (i2172 & 28) + (i2172 | 28), objArr512);
                            java.lang.String[] strArr192 = {str442, str452, str462, str472, str482, (java.lang.String) objArr512[0]};
                            i19 = 0;
                            while (true) {
                                if (i19 < 6) {
                                }
                                i19 = ((i19 ^ 67) + ((i19 & 67) << 1)) - 66;
                            }
                            int i2192 = (~(i13 & i1962)) & (i13 | i1962);
                            int i2202 = -i2192;
                            int i2212 = ((i2192 ^ i2202) | (i2192 & i2202)) >> 31;
                            int i2222 = i20 & (~i2212);
                            int i2232 = i1962 & i2212;
                            int i2242 = (i2232 ^ i2222) | (i2222 & i2232);
                            int i2252 = -(-(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                            int i2262 = (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int i2272 = (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            java.lang.Object[] objArr542 = new java.lang.Object[1];
                            k((char) ((34835 & i2252) + (i2252 | 34835)), ((i2262 | 617) << 1) - (i2262 ^ 617), (i2272 ^ 16) + ((i2272 & 16) << 1), objArr542);
                            java.lang.String str502 = (java.lang.String) objArr542[0];
                            int i2282 = -android.graphics.Color.alpha(0);
                            int threadPriority2 = android.os.Process.getThreadPriority(0);
                            int i2292 = -(-((((threadPriority2 | 20) << 1) - (threadPriority2 ^ 20)) >> 6));
                            int capsMode22 = android.text.TextUtils.getCapsMode(str42, 0, 0);
                            java.lang.Object[] objArr552 = new java.lang.Object[1];
                            k((char) (((i2282 | 6890) << 1) - (i2282 ^ 6890)), (i2292 ^ 857) + ((i2292 & 857) << 1), (capsMode22 ^ 6) + ((capsMode22 & 6) << 1), objArr552);
                            str7 = (java.lang.String) objArr552[0];
                            file2 = new java.io.File(str502);
                            if (file2.exists()) {
                                java.util.Scanner scanner32 = new java.util.Scanner(new java.io.FileInputStream(file2));
                                int red42 = android.graphics.Color.red(0);
                                int lastIndexOf42 = android.text.TextUtils.lastIndexOf(str42, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                java.lang.Object[] objArr562 = new java.lang.Object[1];
                                k((char) ((red42 & 5604) + (red42 | 5604)), (lastIndexOf42 ^ 498) + ((lastIndexOf42 & 498) << 1), 0 - (~(-(-(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))))), objArr562);
                                java.util.Scanner useDelimiter42 = scanner32.useDelimiter((java.lang.String) objArr562[0]);
                                if (!useDelimiter42.hasNext()) {
                                }
                                useDelimiter42.close();
                                if (next.contains(str7)) {
                                }
                            }
                            char keyRepeatTimeout52 = (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            int defaultSize32 = android.view.View.getDefaultSize(0, 0);
                            java.lang.Object[] objArr1892 = new java.lang.Object[1];
                            k(keyRepeatTimeout52, (defaultSize32 ^ 863) + ((defaultSize32 & 863) << 1), 12 - (~(-(-(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)))), objArr1892);
                            java.lang.String str1152 = (java.lang.String) objArr1892[0];
                            char c362 = (char) ((-(-(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))) - 1);
                            int defaultSize42 = android.view.View.getDefaultSize(0, 0);
                            int normalizeMetaState32 = android.view.KeyEvent.normalizeMetaState(0);
                            java.lang.Object[] objArr1902 = new java.lang.Object[1];
                            k(c362, defaultSize42 + 876, (normalizeMetaState32 & 9) + (normalizeMetaState32 | 9), objArr1902);
                            str8 = (java.lang.String) objArr1902[0];
                            file3 = new java.io.File(str1152);
                            if (file3.exists()) {
                                java.util.Scanner scanner42 = new java.util.Scanner(new java.io.FileInputStream(file3));
                                int i5802 = (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                int i5812 = (i5802 * 367) + 2056301;
                                int i5822 = ((i5802 ^ 5603) | (i5802 & 5603)) * (-366);
                                int i5832 = ~((i13 & (-5604)) | (i13 ^ (-5604)));
                                int i5842 = ((((i5812 | i5822) << 1) - (i5812 ^ i5822)) - (~(-(-(((i5832 & i5802) | (i5802 ^ i5832)) * (-366)))))) - 1;
                                int i5852 = ~((~i5802) | 5603);
                                int i5862 = i5802 | (-5604);
                                int i5872 = ~((i5862 ^ i13) | (i5862 & i13));
                                int i5882 = ((i5872 ^ i5852) | (i5872 & i5852)) * 366;
                                char c372 = (char) ((i5842 ^ i5882) + ((i5882 & i5842) << 1));
                                int i5892 = -android.view.Gravity.getAbsoluteGravity(0, 0);
                                java.lang.Object[] objArr1912 = new java.lang.Object[1];
                                k(c372, ((i5892 | 497) << 1) - (i5892 ^ 497), 1 - (~(-(android.view.ViewConfiguration.getJumpTapTimeout() >> 16))), objArr1912);
                                useDelimiter = scanner42.useDelimiter((java.lang.String) objArr1912[0]);
                                if (useDelimiter.hasNext()) {
                                }
                                useDelimiter.close();
                                if (str9.contains(str8)) {
                                }
                            }
                            i21 = i13;
                            int i230222 = (~(i13 & i2242)) & (i13 | i2242);
                            int i231222 = (i230222 | (-i230222)) >> 31;
                            int i232222 = (i2242 & i231222) | (i21 & (~i231222));
                            if ((i3 & 8) != 0) {
                            }
                            char doubleTapTimeout3222 = (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 60923);
                            int myPid2222 = android.os.Process.myPid() >> 22;
                            int i251222 = myPid2222 * (-159);
                            int i252222 = ((-160113) ^ i251222) + ((i251222 & (-160113)) << 1);
                            int i253222 = ~myPid2222;
                            int i254222 = ((i253222 ^ 1007) | (i253222 & 1007)) * 160;
                            int i255222 = ~((i16 & (-1008)) | (i16 ^ (-1008)));
                            java.lang.Object[] objArr62222 = new java.lang.Object[1];
                            k(doubleTapTimeout3222, (((((i252222 | i254222) << 1) - (i254222 ^ i252222)) + (((~((i16 ^ myPid2222) | (i16 & myPid2222))) | (~((myPid2222 ^ 1007) | (myPid2222 & 1007)))) * (-160))) - (~(((myPid2222 ^ i255222) | (myPid2222 & i255222)) * 160))) - 1, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 41, objArr62222);
                            java.lang.String str53222 = (java.lang.String) objArr62222[0];
                            str11 = str10;
                            char lastIndexOf5222 = (char) (55784 - android.text.TextUtils.lastIndexOf(str11, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                            int packedPositionType2222 = android.widget.ExpandableListView.getPackedPositionType(0L);
                            int i256222 = -(-android.graphics.Color.blue(0));
                            java.lang.Object[] objArr63222 = new java.lang.Object[1];
                            k(lastIndexOf5222, (packedPositionType2222 ^ 1048) + ((packedPositionType2222 & 1048) << 1), ((i256222 | 30) << 1) - (i256222 ^ 30), objArr63222);
                            strArr = new java.lang.String[]{str53222, (java.lang.String) objArr63222[0]};
                            i22 = 0;
                            while (true) {
                                if (i22 < 2) {
                                }
                                int i257222 = (i22 ^ (-122)) + ((i22 & (-122)) << 1);
                                i22 = (i257222 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i257222 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1);
                                strArr = strArr12;
                                str11 = str12;
                                i16 = i23;
                            }
                            int i258222 = ((~i232222) & i13) | (i232222 & i23);
                            int i259222 = (i258222 | (-i258222)) >> 31;
                            int i260222 = i24 & (~i259222);
                            int i261222 = i232222 & i259222;
                            int i262222 = (i261222 ^ i260222) | (i261222 & i260222);
                            d3 = com.facetec.sdk.al.d(-1270134912);
                            if (d3 == null) {
                            }
                            long longValue9222 = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, null)).longValue();
                            long j62222 = -1817303566;
                            long j63222 = 302;
                            long j64222 = -301;
                            long j65222 = longValue9222 ^ j27;
                            long j66222 = 301;
                            j2 = ((((((-300) * j62222) + (j63222 * longValue9222)) + ((((longValue9222 | j62222) | j) ^ j27) * j64222)) + ((((j65222 | j) ^ j27) | ((j30 | j62222) ^ j27)) * j64222)) + (((((j62222 ^ j27) | j) ^ j27) | j65222) * j66222)) - 7618927;
                            myTid = android.os.Process.myTid();
                            if (((((int) (j2 >> 32)) & ((((((~myTid) | (-362123669)) * 1444) - 1153123274) + ((((~(myTid | (-1593085285))) | 1247808608) | (~((-1264655601) | myTid))) * (-1444))) - 539716760)) | (((int) j2) & (((((~(i23 | 678904824)) | (-2116131235)) * (-328)) - 261639415) + (((-2116131235) | i13) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((~((-678904825) | i13)) | 5653080 | (~(i23 | (-1442879491)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE)))) == 1) {
                            }
                            int i3972222 = ((~i262222) & i25) | (i262222 & i26);
                            int i3982222 = -i3972222;
                            java.lang.Object[] objArr1242222 = {new int[1], strArr2, new int[]{i262222}, new int[]{i25}};
                            int i3992222 = ((((~(777876558 | r4)) | (-1860042320)) * 305) - 1995483012) + (((~((~android.os.Process.myPid()) | 777876558)) | (-1250799176)) * 305) + ((((i3972222 ^ i3982222) | (i3972222 & i3982222)) >> 31) & 16);
                            int i4002222 = ~i3992222;
                            int i4012222 = (i4002222 ^ i4) | (i4002222 & i4);
                            int i4022222 = ~i4012222;
                            int i4032222 = ~((i4002222 & i25) | (i4002222 ^ i25));
                            int i4042222 = ~((i4012222 ^ i25) | (i25 & i4012222));
                            int i4052222 = (i26 ^ i3992222) | (i26 & i3992222);
                            int i4062222 = ~((i4052222 ^ i4) | (i4 & i4052222));
                            int i4072222 = (((i3992222 * 755) - (~(-(-(i4 * (-753)))))) - 1) + (((~((i4 & i25) | (i4 ^ i25))) | (i4032222 & i4022222) | (i4022222 ^ i4032222)) * (-754)) + (((i4042222 & i4062222) | (i4042222 ^ i4062222)) * (-754));
                            int i4082222 = ((i4002222 ^ i26) | (i4002222 & i26)) * 754;
                            int i4092222 = ((i4072222 | i4082222) << 1) - (i4082222 ^ i4072222);
                            int i4102222 = i4092222 << 13;
                            int i4112222 = ((~i4102222) & i4092222) | ((~i4092222) & i4102222);
                            int i4122222 = i4112222 >>> 17;
                            int i4132222 = (i4112222 & (~i4122222)) | ((~i4112222) & i4122222);
                            ((int[]) objArr1242222[0])[0] = i4132222 ^ (i4132222 << 5);
                            return objArr1242222;
                        }
                    }
                    i17 = i13;
                    int i1742 = (~(i13 & i165)) & (i13 | i165);
                    int i1752 = -i1742;
                    int i1762 = ((i1742 ^ i1752) | (i1742 & i1752)) >> 31;
                    int i1772 = i17 & (~i1762);
                    int i1782 = i165 & i1762;
                    int i1792 = (i1782 ^ i1772) | (i1782 & i1772);
                    char maxKeyCode5 = (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 34835);
                    int i1802 = -android.view.View.combineMeasuredStates(0, 0);
                    java.lang.Object[] objArr392 = new java.lang.Object[1];
                    k(maxKeyCode5, (i1802 & 617) + (i1802 | 617), 17 - android.view.View.getDefaultSize(0, 0), objArr392);
                    java.lang.String str432 = (java.lang.String) objArr392[0];
                    char c112 = (char) (5272 - (~(-(-(android.view.ViewConfiguration.getTouchSlop() >> 8)))));
                    int makeMeasureSpec3 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                    int packedPositionGroup32 = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                    java.lang.Object[] objArr402 = new java.lang.Object[1];
                    k(c112, 634 - makeMeasureSpec3, ((packedPositionGroup32 | 6) << 1) - (packedPositionGroup32 ^ 6), objArr402);
                    str6 = (java.lang.String) objArr402[0];
                    file = new java.io.File(str432);
                    if (file.exists()) {
                        java.util.Scanner scanner22 = new java.util.Scanner(new java.io.FileInputStream(file));
                        int i1812 = -(-(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        int i1822 = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        java.lang.Object[] objArr412 = new java.lang.Object[1];
                        k((char) ((i1812 & 5604) + (i1812 | 5604)), ((i1822 | 496) << 1) - (i1822 ^ 496), 2 - android.view.View.resolveSize(0, 0), objArr412);
                        useDelimiter2 = scanner22.useDelimiter((java.lang.String) objArr412[0]);
                        if (useDelimiter2.hasNext()) {
                        }
                        useDelimiter2.close();
                        if (str24.contains(str6)) {
                        }
                    }
                    i18 = i13;
                    int i18622 = (~(i13 & i1792)) & (i13 | i1792);
                    int i18722 = (i18622 | (-i18622)) >> 31;
                    int i18822 = (i1792 & i18722) | (i18 & (~i18722));
                    java.lang.Object[] objArr4222 = new java.lang.Object[1];
                    k((char) (0 - (~android.text.TextUtils.indexOf(str42, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0))), (android.os.Process.myTid() >> 22) + 640, 23 - (~(-(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)))), objArr4222);
                    java.lang.Object[] objArr4322 = {(java.lang.String) objArr4222[0]};
                    d2 = com.facetec.sdk.al.d(1590238701);
                    if (d2 == null) {
                    }
                    java.lang.String lowerCase22 = ((java.lang.String) ((java.lang.reflect.Method) d2).invoke(null, objArr4322)).toLowerCase();
                    int i18922 = -android.os.Process.getGidForName(str42);
                    int i19022 = -((android.os.Process.getThreadPriority(0) + 20) >> 6);
                    java.lang.Object[] objArr4522 = new java.lang.Object[1];
                    k((char) ((i18922 & 22821) + (i18922 | 22821)), ((i19022 | 663) << 1) - (i19022 ^ 663), 4 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr4522);
                    int i19122 = i13 ^ i18822;
                    int i19222 = -i19122;
                    int i19322 = ((i19122 ^ i19222) | (i19122 & i19222)) >> 31;
                    int i19422 = (!lowerCase22.contains((java.lang.String) objArr4522[0]) ? (~(i13 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE)) & (i13 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE) : i13) & (~i19322);
                    int i19522 = i18822 & i19322;
                    int i19622 = (i19522 ^ i19422) | (i19522 & i19422);
                    java.lang.Object[] objArr4622 = new java.lang.Object[1];
                    k((char) ((-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))) - 1), 666 - (~(-(android.view.ViewConfiguration.getFadingEdgeLength() >> 16))), 41 - (~android.view.KeyEvent.normalizeMetaState(0)), objArr4622);
                    java.lang.String str4422 = (java.lang.String) objArr4622[0];
                    char red322 = (char) android.graphics.Color.red(0);
                    int capsMode32 = android.text.TextUtils.getCapsMode(str42, 0, 0);
                    java.lang.Object[] objArr4722 = new java.lang.Object[1];
                    k(red322, (capsMode32 ^ 709) + ((capsMode32 & 709) << 1), 39 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr4722);
                    java.lang.String str4522 = (java.lang.String) objArr4722[0];
                    int i19722 = -android.text.TextUtils.lastIndexOf(str42, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                    char c1222 = (char) ((~i19722) + (i19722 << 1));
                    int offsetAfter22 = android.text.TextUtils.getOffsetAfter(str42, 0);
                    int i19822 = (offsetAfter22 * 960) - 1435833;
                    int i19922 = ~((i16 ^ (-750)) | (i16 & (-750)));
                    int i20022 = ~((offsetAfter22 ^ i13) | (offsetAfter22 & i13));
                    int i20122 = ((i19922 ^ i20022) | (i19922 & i20022)) * 959;
                    int i20222 = ((i19822 | i20122) << 1) - (i19822 ^ i20122);
                    int i20322 = ~((i13 ^ (-750)) | (i13 & (-750)));
                    int i20422 = ~((offsetAfter22 ^ i16) | (offsetAfter22 & i16));
                    int i20522 = -(-(((i20322 ^ i20422) | (i20422 & i20322)) * 959));
                    int i20622 = -android.widget.ExpandableListView.getPackedPositionType(0L);
                    java.lang.Object[] objArr4822 = new java.lang.Object[1];
                    k(c1222, (((719250 ^ i20222) + ((i20222 & 719250) << 1)) - (~i20522)) - 1, (i20622 ^ 27) + ((i20622 & 27) << 1), objArr4822);
                    java.lang.String str4622 = (java.lang.String) objArr4822[0];
                    int i20722 = -android.view.View.getDefaultSize(0, 0);
                    int i20822 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                    int i20922 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int d1622 = com.facetec.sdk.ou.d();
                    int i21022 = ~i20922;
                    int i21122 = ~((i21022 ^ 27) | (i21022 & 27));
                    int i21222 = ~((~d1622) | i20922);
                    int i21322 = ~((i21022 ^ (-28)) | (i21022 & (-28)));
                    java.lang.Object[] objArr4922 = new java.lang.Object[1];
                    k((char) (((56229 | i20722) << 1) - (i20722 ^ 56229)), (i20822 ^ 776) + ((i20822 & 776) << 1), ((((((i20922 * 375) - 20169) - (~(((i21222 & i21122) | (i21122 ^ i21222)) * (-374)))) - 1) + ((~((i20922 & (-28)) | (i20922 ^ (-28)))) * 748)) - (~(-(-(((i21322 ^ i21222) | (i21322 & i21222)) * 374))))) - 1, objArr4922);
                    java.lang.String str4722 = (java.lang.String) objArr4922[0];
                    int i21422 = (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int touchSlop222 = android.view.ViewConfiguration.getTouchSlop();
                    int i21522 = -(-(android.os.Process.myTid() >> 22));
                    java.lang.Object[] objArr5022 = new java.lang.Object[1];
                    k((char) ((41877 & i21422) + (i21422 | 41877)), 803 - (touchSlop222 >> 8), (i21522 ^ 27) + ((i21522 & 27) << 1), objArr5022);
                    java.lang.String str4822 = (java.lang.String) objArr5022[0];
                    int i21622 = -android.graphics.Color.rgb(0, 0, 0);
                    double convertQuartSecToDecDegrees22 = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
                    int i21722 = -(-android.text.TextUtils.lastIndexOf(str42, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                    java.lang.Object[] objArr5122 = new java.lang.Object[1];
                    k((char) (((-16750736) & i21622) + (i21622 | (-16750736))), 829 - (~(convertQuartSecToDecDegrees22 > 0.0d ? 1 : (convertQuartSecToDecDegrees22 == 0.0d ? 0 : -1))), (i21722 & 28) + (i21722 | 28), objArr5122);
                    java.lang.String[] strArr1922 = {str4422, str4522, str4622, str4722, str4822, (java.lang.String) objArr5122[0]};
                    i19 = 0;
                    while (true) {
                        if (i19 < 6) {
                        }
                        i19 = ((i19 ^ 67) + ((i19 & 67) << 1)) - 66;
                    }
                    int i21922 = (~(i13 & i19622)) & (i13 | i19622);
                    int i22022 = -i21922;
                    int i22122 = ((i21922 ^ i22022) | (i21922 & i22022)) >> 31;
                    int i22222 = i20 & (~i22122);
                    int i22322 = i19622 & i22122;
                    int i22422 = (i22322 ^ i22222) | (i22222 & i22322);
                    int i22522 = -(-(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                    int i22622 = (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int i22722 = (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    java.lang.Object[] objArr5422 = new java.lang.Object[1];
                    k((char) ((34835 & i22522) + (i22522 | 34835)), ((i22622 | 617) << 1) - (i22622 ^ 617), (i22722 ^ 16) + ((i22722 & 16) << 1), objArr5422);
                    java.lang.String str5022 = (java.lang.String) objArr5422[0];
                    int i22822 = -android.graphics.Color.alpha(0);
                    int threadPriority22 = android.os.Process.getThreadPriority(0);
                    int i22922 = -(-((((threadPriority22 | 20) << 1) - (threadPriority22 ^ 20)) >> 6));
                    int capsMode222 = android.text.TextUtils.getCapsMode(str42, 0, 0);
                    java.lang.Object[] objArr5522 = new java.lang.Object[1];
                    k((char) (((i22822 | 6890) << 1) - (i22822 ^ 6890)), (i22922 ^ 857) + ((i22922 & 857) << 1), (capsMode222 ^ 6) + ((capsMode222 & 6) << 1), objArr5522);
                    str7 = (java.lang.String) objArr5522[0];
                    file2 = new java.io.File(str5022);
                    if (file2.exists()) {
                    }
                    char keyRepeatTimeout522 = (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int defaultSize322 = android.view.View.getDefaultSize(0, 0);
                    java.lang.Object[] objArr18922 = new java.lang.Object[1];
                    k(keyRepeatTimeout522, (defaultSize322 ^ 863) + ((defaultSize322 & 863) << 1), 12 - (~(-(-(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)))), objArr18922);
                    java.lang.String str11522 = (java.lang.String) objArr18922[0];
                    char c3622 = (char) ((-(-(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))) - 1);
                    int defaultSize422 = android.view.View.getDefaultSize(0, 0);
                    int normalizeMetaState322 = android.view.KeyEvent.normalizeMetaState(0);
                    java.lang.Object[] objArr19022 = new java.lang.Object[1];
                    k(c3622, defaultSize422 + 876, (normalizeMetaState322 & 9) + (normalizeMetaState322 | 9), objArr19022);
                    str8 = (java.lang.String) objArr19022[0];
                    file3 = new java.io.File(str11522);
                    if (file3.exists()) {
                    }
                    i21 = i13;
                    int i2302222 = (~(i13 & i22422)) & (i13 | i22422);
                    int i2312222 = (i2302222 | (-i2302222)) >> 31;
                    int i2322222 = (i22422 & i2312222) | (i21 & (~i2312222));
                    if ((i3 & 8) != 0) {
                    }
                    char doubleTapTimeout32222 = (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 60923);
                    int myPid22222 = android.os.Process.myPid() >> 22;
                    int i2512222 = myPid22222 * (-159);
                    int i2522222 = ((-160113) ^ i2512222) + ((i2512222 & (-160113)) << 1);
                    int i2532222 = ~myPid22222;
                    int i2542222 = ((i2532222 ^ 1007) | (i2532222 & 1007)) * 160;
                    int i2552222 = ~((i16 & (-1008)) | (i16 ^ (-1008)));
                    java.lang.Object[] objArr622222 = new java.lang.Object[1];
                    k(doubleTapTimeout32222, (((((i2522222 | i2542222) << 1) - (i2542222 ^ i2522222)) + (((~((i16 ^ myPid22222) | (i16 & myPid22222))) | (~((myPid22222 ^ 1007) | (myPid22222 & 1007)))) * (-160))) - (~(((myPid22222 ^ i2552222) | (myPid22222 & i2552222)) * 160))) - 1, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 41, objArr622222);
                    java.lang.String str532222 = (java.lang.String) objArr622222[0];
                    str11 = str10;
                    char lastIndexOf52222 = (char) (55784 - android.text.TextUtils.lastIndexOf(str11, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                    int packedPositionType22222 = android.widget.ExpandableListView.getPackedPositionType(0L);
                    int i2562222 = -(-android.graphics.Color.blue(0));
                    java.lang.Object[] objArr632222 = new java.lang.Object[1];
                    k(lastIndexOf52222, (packedPositionType22222 ^ 1048) + ((packedPositionType22222 & 1048) << 1), ((i2562222 | 30) << 1) - (i2562222 ^ 30), objArr632222);
                    strArr = new java.lang.String[]{str532222, (java.lang.String) objArr632222[0]};
                    i22 = 0;
                    while (true) {
                        if (i22 < 2) {
                        }
                        int i2572222 = (i22 ^ (-122)) + ((i22 & (-122)) << 1);
                        i22 = (i2572222 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i2572222 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1);
                        strArr = strArr12;
                        str11 = str12;
                        i16 = i23;
                    }
                    int i2582222 = ((~i2322222) & i13) | (i2322222 & i23);
                    int i2592222 = (i2582222 | (-i2582222)) >> 31;
                    int i2602222 = i24 & (~i2592222);
                    int i2612222 = i2322222 & i2592222;
                    int i2622222 = (i2612222 ^ i2602222) | (i2612222 & i2602222);
                    d3 = com.facetec.sdk.al.d(-1270134912);
                    if (d3 == null) {
                    }
                    long longValue92222 = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, null)).longValue();
                    long j622222 = -1817303566;
                    long j632222 = 302;
                    long j642222 = -301;
                    long j652222 = longValue92222 ^ j27;
                    long j662222 = 301;
                    j2 = ((((((-300) * j622222) + (j632222 * longValue92222)) + ((((longValue92222 | j622222) | j) ^ j27) * j642222)) + ((((j652222 | j) ^ j27) | ((j30 | j622222) ^ j27)) * j642222)) + (((((j622222 ^ j27) | j) ^ j27) | j652222) * j662222)) - 7618927;
                    myTid = android.os.Process.myTid();
                    if (((((int) (j2 >> 32)) & ((((((~myTid) | (-362123669)) * 1444) - 1153123274) + ((((~(myTid | (-1593085285))) | 1247808608) | (~((-1264655601) | myTid))) * (-1444))) - 539716760)) | (((int) j2) & (((((~(i23 | 678904824)) | (-2116131235)) * (-328)) - 261639415) + (((-2116131235) | i13) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((~((-678904825) | i13)) | 5653080 | (~(i23 | (-1442879491)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE)))) == 1) {
                    }
                    int i39722222 = ((~i2622222) & i25) | (i2622222 & i26);
                    int i39822222 = -i39722222;
                    java.lang.Object[] objArr12422222 = {new int[1], strArr2, new int[]{i2622222}, new int[]{i25}};
                    int i39922222 = ((((~(777876558 | r4)) | (-1860042320)) * 305) - 1995483012) + (((~((~android.os.Process.myPid()) | 777876558)) | (-1250799176)) * 305) + ((((i39722222 ^ i39822222) | (i39722222 & i39822222)) >> 31) & 16);
                    int i40022222 = ~i39922222;
                    int i40122222 = (i40022222 ^ i4) | (i40022222 & i4);
                    int i40222222 = ~i40122222;
                    int i40322222 = ~((i40022222 & i25) | (i40022222 ^ i25));
                    int i40422222 = ~((i40122222 ^ i25) | (i25 & i40122222));
                    int i40522222 = (i26 ^ i39922222) | (i26 & i39922222);
                    int i40622222 = ~((i40522222 ^ i4) | (i4 & i40522222));
                    int i40722222 = (((i39922222 * 755) - (~(-(-(i4 * (-753)))))) - 1) + (((~((i4 & i25) | (i4 ^ i25))) | (i40322222 & i40222222) | (i40222222 ^ i40322222)) * (-754)) + (((i40422222 & i40622222) | (i40422222 ^ i40622222)) * (-754));
                    int i40822222 = ((i40022222 ^ i26) | (i40022222 & i26)) * 754;
                    int i40922222 = ((i40722222 | i40822222) << 1) - (i40822222 ^ i40722222);
                    int i41022222 = i40922222 << 13;
                    int i41122222 = ((~i41022222) & i40922222) | ((~i40922222) & i41022222);
                    int i41222222 = i41122222 >>> 17;
                    int i41322222 = (i41122222 & (~i41222222)) | ((~i41122222) & i41222222);
                    ((int[]) objArr12422222[0])[0] = i41322222 ^ (i41322222 << 5);
                    return objArr12422222;
                }
            }
            i10 = 0;
            int i1362 = -i10;
            int i1372 = ((i10 ^ i1362) | (i10 & i1362)) >> 31;
            int i1382 = (~i1372) & i113;
            int i1392 = i1372 & ((i113 & (-263)) | (i101 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE));
            int i1402 = ((~i127) & i113) | (i127 & i101);
            int i1412 = -i1402;
            int i1422 = ((i1402 ^ i1412) | (i1402 & i1412)) >> 31;
            int i1432 = ((i1392 ^ i1382) | (i1392 & i1382)) & (~i1422);
            int i1442 = i127 & i1422;
            int i1452 = (i1442 ^ i1432) | (i1442 & i1432);
            int i1462 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
            java.lang.String str382 = str35;
            int offsetBefore4 = android.text.TextUtils.getOffsetBefore(str382, 0);
            int i1472 = -(-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            java.lang.Object[] objArr272 = new java.lang.Object[1];
            k((char) (((60372 | i1462) << 1) - (i1462 ^ 60372)), (offsetBefore4 ^ 499) + ((offsetBefore4 & 499) << 1), ((i1472 | 30) << 1) - (i1472 ^ 30), objArr272);
            java.lang.String str392 = (java.lang.String) objArr272[0];
            int i1482 = -android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            java.lang.Object[] objArr282 = new java.lang.Object[1];
            k((char) (((63759 | i1482) << 1) - (i1482 ^ 63759)), 529 - (~android.graphics.drawable.Drawable.resolveOpacity(0, 0)), 23 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr282);
            java.lang.String str402 = (java.lang.String) objArr282[0];
            char doubleTapTimeout5 = (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
            int i1492 = (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
            int i1502 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            java.lang.Object[] objArr292 = new java.lang.Object[1];
            k(doubleTapTimeout5, (i1492 ^ com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_ATC_OUT_SIDE_PERMISSIBLE_RANGE) + ((i1492 & com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_ATC_OUT_SIDE_PERMISSIBLE_RANGE) << 1), ((i1502 | 29) << 1) - (i1502 ^ 29), objArr292);
            java.lang.String str412 = (java.lang.String) objArr292[0];
            int i1512 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            float complexToFraction2 = android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
            int lastIndexOf22 = android.text.TextUtils.lastIndexOf(str382, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            java.lang.Object[] objArr302 = new java.lang.Object[1];
            k((char) ((i1512 & 48) + (i1512 | 48)), (complexToFraction2 > 0.0f ? 1 : (complexToFraction2 == 0.0f ? 0 : -1)) + 581, ((lastIndexOf22 | 15) << 1) - (lastIndexOf22 ^ 15), objArr302);
            java.lang.String[] strArr182 = {str392, str402, str412, (java.lang.String) objArr302[0]};
            int i1522 = n;
            l = ((i1522 ^ 17) + ((i1522 & 17) << 1)) % 128;
            i11 = 0;
            while (i11 < 4) {
            }
            i12 = i1452;
            i13 = i113;
            i14 = i101;
            str4 = str382;
            j = j29;
            i15 = i13;
            int i1602 = i13 ^ i12;
            int i1612 = -i1602;
            int i1622 = ((i1602 ^ i1612) | (i1602 & i1612)) >> 31;
            int i1632 = i15 & (~i1622);
            int i1642 = i12 & i1622;
            int i1652 = (i1632 ^ i1642) | (i1632 & i1642);
            char c102 = (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            java.lang.String str422 = str4;
            int lastIndexOf32 = android.text.TextUtils.lastIndexOf(str422, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
            int i1662 = lastIndexOf32 * (-244);
            int i1672 = (146616 ^ i1662) + ((i1662 & 146616) << 1);
            i16 = i14;
            int i1682 = -(-(((~(i16 | (-597))) | (~((lastIndexOf32 & (-597)) | (lastIndexOf32 ^ (-597))))) * (-245)));
            int i1692 = (i1672 & i1682) + (i1672 | i1682);
            int i1702 = ~((i13 & (-597)) | (i13 ^ (-597)));
            int i1712 = i1692 + (i1702 * (-245));
            int i1722 = -(-(((i1702 ^ lastIndexOf32) | (i1702 & lastIndexOf32)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE));
            int i1732 = -android.text.TextUtils.getCapsMode(str422, 0, 0);
            java.lang.Object[] objArr352 = new java.lang.Object[1];
            k(c102, (i1712 ^ i1722) + ((i1722 & i1712) << 1), ((i1732 | 13) << 1) - (i1732 ^ 13), objArr352);
            java.lang.Object[] objArr362 = {(java.lang.String) objArr352[0]};
            d = com.facetec.sdk.al.d(1590238701);
            if (d == null) {
            }
            str5 = (java.lang.String) ((java.lang.reflect.Method) d).invoke(null, objArr362);
            if (str5 != null) {
            }
            i17 = i13;
            int i17422 = (~(i13 & i1652)) & (i13 | i1652);
            int i17522 = -i17422;
            int i17622 = ((i17422 ^ i17522) | (i17422 & i17522)) >> 31;
            int i17722 = i17 & (~i17622);
            int i17822 = i1652 & i17622;
            int i17922 = (i17822 ^ i17722) | (i17822 & i17722);
            char maxKeyCode52 = (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 34835);
            int i18022 = -android.view.View.combineMeasuredStates(0, 0);
            java.lang.Object[] objArr3922 = new java.lang.Object[1];
            k(maxKeyCode52, (i18022 & 617) + (i18022 | 617), 17 - android.view.View.getDefaultSize(0, 0), objArr3922);
            java.lang.String str4322 = (java.lang.String) objArr3922[0];
            char c1122 = (char) (5272 - (~(-(-(android.view.ViewConfiguration.getTouchSlop() >> 8)))));
            int makeMeasureSpec32 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            int packedPositionGroup322 = android.widget.ExpandableListView.getPackedPositionGroup(0L);
            java.lang.Object[] objArr4022 = new java.lang.Object[1];
            k(c1122, 634 - makeMeasureSpec32, ((packedPositionGroup322 | 6) << 1) - (packedPositionGroup322 ^ 6), objArr4022);
            str6 = (java.lang.String) objArr4022[0];
            file = new java.io.File(str4322);
            if (file.exists()) {
            }
            i18 = i13;
            int i186222 = (~(i13 & i17922)) & (i13 | i17922);
            int i187222 = (i186222 | (-i186222)) >> 31;
            int i188222 = (i17922 & i187222) | (i18 & (~i187222));
            java.lang.Object[] objArr42222 = new java.lang.Object[1];
            k((char) (0 - (~android.text.TextUtils.indexOf(str422, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0))), (android.os.Process.myTid() >> 22) + 640, 23 - (~(-(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)))), objArr42222);
            java.lang.Object[] objArr43222 = {(java.lang.String) objArr42222[0]};
            d2 = com.facetec.sdk.al.d(1590238701);
            if (d2 == null) {
            }
            java.lang.String lowerCase222 = ((java.lang.String) ((java.lang.reflect.Method) d2).invoke(null, objArr43222)).toLowerCase();
            int i189222 = -android.os.Process.getGidForName(str422);
            int i190222 = -((android.os.Process.getThreadPriority(0) + 20) >> 6);
            java.lang.Object[] objArr45222 = new java.lang.Object[1];
            k((char) ((i189222 & 22821) + (i189222 | 22821)), ((i190222 | 663) << 1) - (i190222 ^ 663), 4 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr45222);
            int i191222 = i13 ^ i188222;
            int i192222 = -i191222;
            int i193222 = ((i191222 ^ i192222) | (i191222 & i192222)) >> 31;
            int i194222 = (!lowerCase222.contains((java.lang.String) objArr45222[0]) ? (~(i13 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE)) & (i13 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE) : i13) & (~i193222);
            int i195222 = i188222 & i193222;
            int i196222 = (i195222 ^ i194222) | (i195222 & i194222);
            java.lang.Object[] objArr46222 = new java.lang.Object[1];
            k((char) ((-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))) - 1), 666 - (~(-(android.view.ViewConfiguration.getFadingEdgeLength() >> 16))), 41 - (~android.view.KeyEvent.normalizeMetaState(0)), objArr46222);
            java.lang.String str44222 = (java.lang.String) objArr46222[0];
            char red3222 = (char) android.graphics.Color.red(0);
            int capsMode322 = android.text.TextUtils.getCapsMode(str422, 0, 0);
            java.lang.Object[] objArr47222 = new java.lang.Object[1];
            k(red3222, (capsMode322 ^ 709) + ((capsMode322 & 709) << 1), 39 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr47222);
            java.lang.String str45222 = (java.lang.String) objArr47222[0];
            int i197222 = -android.text.TextUtils.lastIndexOf(str422, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
            char c12222 = (char) ((~i197222) + (i197222 << 1));
            int offsetAfter222 = android.text.TextUtils.getOffsetAfter(str422, 0);
            int i198222 = (offsetAfter222 * 960) - 1435833;
            int i199222 = ~((i16 ^ (-750)) | (i16 & (-750)));
            int i200222 = ~((offsetAfter222 ^ i13) | (offsetAfter222 & i13));
            int i201222 = ((i199222 ^ i200222) | (i199222 & i200222)) * 959;
            int i202222 = ((i198222 | i201222) << 1) - (i198222 ^ i201222);
            int i203222 = ~((i13 ^ (-750)) | (i13 & (-750)));
            int i204222 = ~((offsetAfter222 ^ i16) | (offsetAfter222 & i16));
            int i205222 = -(-(((i203222 ^ i204222) | (i204222 & i203222)) * 959));
            int i206222 = -android.widget.ExpandableListView.getPackedPositionType(0L);
            java.lang.Object[] objArr48222 = new java.lang.Object[1];
            k(c12222, (((719250 ^ i202222) + ((i202222 & 719250) << 1)) - (~i205222)) - 1, (i206222 ^ 27) + ((i206222 & 27) << 1), objArr48222);
            java.lang.String str46222 = (java.lang.String) objArr48222[0];
            int i207222 = -android.view.View.getDefaultSize(0, 0);
            int i208222 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
            int i209222 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int d16222 = com.facetec.sdk.ou.d();
            int i210222 = ~i209222;
            int i211222 = ~((i210222 ^ 27) | (i210222 & 27));
            int i212222 = ~((~d16222) | i209222);
            int i213222 = ~((i210222 ^ (-28)) | (i210222 & (-28)));
            java.lang.Object[] objArr49222 = new java.lang.Object[1];
            k((char) (((56229 | i207222) << 1) - (i207222 ^ 56229)), (i208222 ^ 776) + ((i208222 & 776) << 1), ((((((i209222 * 375) - 20169) - (~(((i212222 & i211222) | (i211222 ^ i212222)) * (-374)))) - 1) + ((~((i209222 & (-28)) | (i209222 ^ (-28)))) * 748)) - (~(-(-(((i213222 ^ i212222) | (i213222 & i212222)) * 374))))) - 1, objArr49222);
            java.lang.String str47222 = (java.lang.String) objArr49222[0];
            int i214222 = (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int touchSlop2222 = android.view.ViewConfiguration.getTouchSlop();
            int i215222 = -(-(android.os.Process.myTid() >> 22));
            java.lang.Object[] objArr50222 = new java.lang.Object[1];
            k((char) ((41877 & i214222) + (i214222 | 41877)), 803 - (touchSlop2222 >> 8), (i215222 ^ 27) + ((i215222 & 27) << 1), objArr50222);
            java.lang.String str48222 = (java.lang.String) objArr50222[0];
            int i216222 = -android.graphics.Color.rgb(0, 0, 0);
            double convertQuartSecToDecDegrees222 = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
            int i217222 = -(-android.text.TextUtils.lastIndexOf(str422, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
            java.lang.Object[] objArr51222 = new java.lang.Object[1];
            k((char) (((-16750736) & i216222) + (i216222 | (-16750736))), 829 - (~(convertQuartSecToDecDegrees222 > 0.0d ? 1 : (convertQuartSecToDecDegrees222 == 0.0d ? 0 : -1))), (i217222 & 28) + (i217222 | 28), objArr51222);
            java.lang.String[] strArr19222 = {str44222, str45222, str46222, str47222, str48222, (java.lang.String) objArr51222[0]};
            i19 = 0;
            while (true) {
                if (i19 < 6) {
                }
                i19 = ((i19 ^ 67) + ((i19 & 67) << 1)) - 66;
            }
            int i219222 = (~(i13 & i196222)) & (i13 | i196222);
            int i220222 = -i219222;
            int i221222 = ((i219222 ^ i220222) | (i219222 & i220222)) >> 31;
            int i222222 = i20 & (~i221222);
            int i223222 = i196222 & i221222;
            int i224222 = (i223222 ^ i222222) | (i222222 & i223222);
            int i225222 = -(-(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
            int i226222 = (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i227222 = (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            java.lang.Object[] objArr54222 = new java.lang.Object[1];
            k((char) ((34835 & i225222) + (i225222 | 34835)), ((i226222 | 617) << 1) - (i226222 ^ 617), (i227222 ^ 16) + ((i227222 & 16) << 1), objArr54222);
            java.lang.String str50222 = (java.lang.String) objArr54222[0];
            int i228222 = -android.graphics.Color.alpha(0);
            int threadPriority222 = android.os.Process.getThreadPriority(0);
            int i229222 = -(-((((threadPriority222 | 20) << 1) - (threadPriority222 ^ 20)) >> 6));
            int capsMode2222 = android.text.TextUtils.getCapsMode(str422, 0, 0);
            java.lang.Object[] objArr55222 = new java.lang.Object[1];
            k((char) (((i228222 | 6890) << 1) - (i228222 ^ 6890)), (i229222 ^ 857) + ((i229222 & 857) << 1), (capsMode2222 ^ 6) + ((capsMode2222 & 6) << 1), objArr55222);
            str7 = (java.lang.String) objArr55222[0];
            file2 = new java.io.File(str50222);
            if (file2.exists()) {
            }
            char keyRepeatTimeout5222 = (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int defaultSize3222 = android.view.View.getDefaultSize(0, 0);
            java.lang.Object[] objArr189222 = new java.lang.Object[1];
            k(keyRepeatTimeout5222, (defaultSize3222 ^ 863) + ((defaultSize3222 & 863) << 1), 12 - (~(-(-(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)))), objArr189222);
            java.lang.String str115222 = (java.lang.String) objArr189222[0];
            char c36222 = (char) ((-(-(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))) - 1);
            int defaultSize4222 = android.view.View.getDefaultSize(0, 0);
            int normalizeMetaState3222 = android.view.KeyEvent.normalizeMetaState(0);
            java.lang.Object[] objArr190222 = new java.lang.Object[1];
            k(c36222, defaultSize4222 + 876, (normalizeMetaState3222 & 9) + (normalizeMetaState3222 | 9), objArr190222);
            str8 = (java.lang.String) objArr190222[0];
            file3 = new java.io.File(str115222);
            if (file3.exists()) {
            }
            i21 = i13;
            int i23022222 = (~(i13 & i224222)) & (i13 | i224222);
            int i23122222 = (i23022222 | (-i23022222)) >> 31;
            int i23222222 = (i224222 & i23122222) | (i21 & (~i23122222));
            if ((i3 & 8) != 0) {
            }
            char doubleTapTimeout322222 = (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 60923);
            int myPid222222 = android.os.Process.myPid() >> 22;
            int i25122222 = myPid222222 * (-159);
            int i25222222 = ((-160113) ^ i25122222) + ((i25122222 & (-160113)) << 1);
            int i25322222 = ~myPid222222;
            int i25422222 = ((i25322222 ^ 1007) | (i25322222 & 1007)) * 160;
            int i25522222 = ~((i16 & (-1008)) | (i16 ^ (-1008)));
            java.lang.Object[] objArr6222222 = new java.lang.Object[1];
            k(doubleTapTimeout322222, (((((i25222222 | i25422222) << 1) - (i25422222 ^ i25222222)) + (((~((i16 ^ myPid222222) | (i16 & myPid222222))) | (~((myPid222222 ^ 1007) | (myPid222222 & 1007)))) * (-160))) - (~(((myPid222222 ^ i25522222) | (myPid222222 & i25522222)) * 160))) - 1, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 41, objArr6222222);
            java.lang.String str5322222 = (java.lang.String) objArr6222222[0];
            str11 = str10;
            char lastIndexOf522222 = (char) (55784 - android.text.TextUtils.lastIndexOf(str11, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
            int packedPositionType222222 = android.widget.ExpandableListView.getPackedPositionType(0L);
            int i25622222 = -(-android.graphics.Color.blue(0));
            java.lang.Object[] objArr6322222 = new java.lang.Object[1];
            k(lastIndexOf522222, (packedPositionType222222 ^ 1048) + ((packedPositionType222222 & 1048) << 1), ((i25622222 | 30) << 1) - (i25622222 ^ 30), objArr6322222);
            strArr = new java.lang.String[]{str5322222, (java.lang.String) objArr6322222[0]};
            i22 = 0;
            while (true) {
                if (i22 < 2) {
                }
                int i25722222 = (i22 ^ (-122)) + ((i22 & (-122)) << 1);
                i22 = (i25722222 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i25722222 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1);
                strArr = strArr12;
                str11 = str12;
                i16 = i23;
            }
            int i25822222 = ((~i23222222) & i13) | (i23222222 & i23);
            int i25922222 = (i25822222 | (-i25822222)) >> 31;
            int i26022222 = i24 & (~i25922222);
            int i26122222 = i23222222 & i25922222;
            int i26222222 = (i26122222 ^ i26022222) | (i26122222 & i26022222);
            d3 = com.facetec.sdk.al.d(-1270134912);
            if (d3 == null) {
            }
            long longValue922222 = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, null)).longValue();
            long j6222222 = -1817303566;
            long j6322222 = 302;
            long j6422222 = -301;
            long j6522222 = longValue922222 ^ j27;
            long j6622222 = 301;
            j2 = ((((((-300) * j6222222) + (j6322222 * longValue922222)) + ((((longValue922222 | j6222222) | j) ^ j27) * j6422222)) + ((((j6522222 | j) ^ j27) | ((j30 | j6222222) ^ j27)) * j6422222)) + (((((j6222222 ^ j27) | j) ^ j27) | j6522222) * j6622222)) - 7618927;
            myTid = android.os.Process.myTid();
            if (((((int) (j2 >> 32)) & ((((((~myTid) | (-362123669)) * 1444) - 1153123274) + ((((~(myTid | (-1593085285))) | 1247808608) | (~((-1264655601) | myTid))) * (-1444))) - 539716760)) | (((int) j2) & (((((~(i23 | 678904824)) | (-2116131235)) * (-328)) - 261639415) + (((-2116131235) | i13) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((~((-678904825) | i13)) | 5653080 | (~(i23 | (-1442879491)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE)))) == 1) {
            }
            int i397222222 = ((~i26222222) & i25) | (i26222222 & i26);
            int i398222222 = -i397222222;
            java.lang.Object[] objArr124222222 = {new int[1], strArr2, new int[]{i26222222}, new int[]{i25}};
            int i399222222 = ((((~(777876558 | r4)) | (-1860042320)) * 305) - 1995483012) + (((~((~android.os.Process.myPid()) | 777876558)) | (-1250799176)) * 305) + ((((i397222222 ^ i398222222) | (i397222222 & i398222222)) >> 31) & 16);
            int i400222222 = ~i399222222;
            int i401222222 = (i400222222 ^ i4) | (i400222222 & i4);
            int i402222222 = ~i401222222;
            int i403222222 = ~((i400222222 & i25) | (i400222222 ^ i25));
            int i404222222 = ~((i401222222 ^ i25) | (i25 & i401222222));
            int i405222222 = (i26 ^ i399222222) | (i26 & i399222222);
            int i406222222 = ~((i405222222 ^ i4) | (i4 & i405222222));
            int i407222222 = (((i399222222 * 755) - (~(-(-(i4 * (-753)))))) - 1) + (((~((i4 & i25) | (i4 ^ i25))) | (i403222222 & i402222222) | (i402222222 ^ i403222222)) * (-754)) + (((i404222222 & i406222222) | (i404222222 ^ i406222222)) * (-754));
            int i408222222 = ((i400222222 ^ i26) | (i400222222 & i26)) * 754;
            int i409222222 = ((i407222222 | i408222222) << 1) - (i408222222 ^ i407222222);
            int i410222222 = i409222222 << 13;
            int i411222222 = ((~i410222222) & i409222222) | ((~i409222222) & i410222222);
            int i412222222 = i411222222 >>> 17;
            int i413222222 = (i411222222 & (~i412222222)) | ((~i411222222) & i412222222);
            ((int[]) objArr124222222[0])[0] = i413222222 ^ (i413222222 << 5);
            return objArr124222222;
        }

        static java.lang.String e(java.lang.String str, int i2, int i3) {
            java.lang.Object[] objArr = {str, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)};
            return (java.lang.String) e(com.facetec.sdk.ou.d(), com.facetec.sdk.ou.d(), -461853234, objArr, com.facetec.sdk.ou.d(), com.facetec.sdk.ou.d(), 461853234);
        }

        private void b() {
            int d = com.facetec.sdk.ou.d();
            e(com.facetec.sdk.ou.d(), d, 1240308393, new java.lang.Object[]{this}, com.facetec.sdk.ou.d(), com.facetec.sdk.ou.d(), -1240308392);
        }

        private void c(java.lang.String str, int i2, int i3, boolean z) {
            java.lang.Object[] objArr = {this, str, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Boolean.valueOf(z)};
            e(com.facetec.sdk.ou.d(), com.facetec.sdk.ou.d(), -2027364431, objArr, com.facetec.sdk.ou.d(), com.facetec.sdk.ou.d(), 2027364433);
        }
    }

    mv(com.facetec.sdk.mv.d dVar) {
        this.c = dVar.e;
        this.g = c(dVar.c, false);
        this.i = c(dVar.b, false);
        this.f3663a = dVar.f3664a;
        this.b = dVar.e();
        this.h = c(dVar.f, false);
        this.e = dVar.g != null ? c(dVar.g, true) : null;
        this.j = dVar.j != null ? c(dVar.j, false) : null;
        this.f = dVar.toString();
    }

    public final java.lang.String c() {
        return this.c;
    }

    public final boolean a() {
        return this.c.equals("https");
    }

    public final java.lang.String e() {
        if (this.g.isEmpty()) {
            return "";
        }
        int length = this.c.length() + 3;
        java.lang.String str = this.f;
        return this.f.substring(length, com.facetec.sdk.nh.b(str, length, str.length(), ":@"));
    }

    public final java.lang.String b() {
        if (this.i.isEmpty()) {
            return "";
        }
        int indexOf = this.f.indexOf(58, this.c.length() + 3);
        return this.f.substring(indexOf + 1, this.f.indexOf(64));
    }

    public final java.lang.String g() {
        return this.f3663a;
    }

    public final int h() {
        return this.b;
    }

    public static int e(java.lang.String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public final java.lang.String f() {
        int indexOf = this.f.indexOf(47, this.c.length() + 3);
        java.lang.String str = this.f;
        return this.f.substring(indexOf, com.facetec.sdk.nh.b(str, indexOf, str.length(), "?#"));
    }

    static void a(java.lang.StringBuilder sb, java.util.List<java.lang.String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
            sb.append(list.get(i));
        }
    }

    public final java.util.List<java.lang.String> i() {
        int indexOf = this.f.indexOf(47, this.c.length() + 3);
        java.lang.String str = this.f;
        int b = com.facetec.sdk.nh.b(str, indexOf, str.length(), "?#");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (indexOf < b) {
            int i = indexOf + 1;
            int c = com.facetec.sdk.nh.c(this.f, i, b, kotlinx.io.files.FileSystemKt.UnixPathSeparator);
            arrayList.add(this.f.substring(i, c));
            indexOf = c;
        }
        return arrayList;
    }

    @javax.annotation.Nullable
    public final java.lang.String j() {
        if (this.e == null) {
            return null;
        }
        int indexOf = this.f.indexOf(63) + 1;
        java.lang.String str = this.f;
        return this.f.substring(indexOf, com.facetec.sdk.nh.c(str, indexOf, str.length(), '#'));
    }

    public static void e(java.lang.StringBuilder sb, java.util.List<java.lang.String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            java.lang.String str = list.get(i);
            java.lang.String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append(kotlin.text.Typography.amp);
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    static java.util.List<java.lang.String> d(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    @javax.annotation.Nullable
    public final com.facetec.sdk.mv.d b(java.lang.String str) {
        try {
            return new com.facetec.sdk.mv.d().d(this, str);
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    public static com.facetec.sdk.mv c(java.lang.String str) {
        return new com.facetec.sdk.mv.d().d(null, str).a();
    }

    public final boolean equals(@javax.annotation.Nullable java.lang.Object obj) {
        return (obj instanceof com.facetec.sdk.mv) && ((com.facetec.sdk.mv) obj).f.equals(this.f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final java.lang.String toString() {
        return this.f;
    }

    private static java.lang.String c(java.lang.String str, boolean z) {
        return d(str, 0, str.length(), z);
    }

    private static java.util.List<java.lang.String> c(java.util.List<java.lang.String> list, boolean z) {
        int size = list.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        for (int i = 0; i < size; i++) {
            java.lang.String str = list.get(i);
            arrayList.add(str != null ? c(str, z) : null);
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    static java.lang.String d(java.lang.String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                com.facetec.sdk.pk pkVar = new com.facetec.sdk.pk();
                pkVar.e(str, i, i3);
                a(pkVar, str, i3, i2, z);
                return pkVar.k();
            }
        }
        return str.substring(i, i2);
    }

    private static void a(com.facetec.sdk.pk pkVar, java.lang.String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int a2 = com.facetec.sdk.nh.a(str.charAt(i + 1));
                int a3 = com.facetec.sdk.nh.a(str.charAt(i3));
                if (a2 != -1 && a3 != -1) {
                    pkVar.g((a2 << 4) + a3);
                    i = i3;
                }
                pkVar.d(codePointAt);
            } else {
                if (codePointAt == 43 && z) {
                    pkVar.g(32);
                }
                pkVar.d(codePointAt);
            }
            i += java.lang.Character.charCount(codePointAt);
        }
    }

    private static boolean c(java.lang.String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && com.facetec.sdk.nh.a(str.charAt(i + 1)) != -1 && com.facetec.sdk.nh.a(str.charAt(i3)) != -1;
    }

    static java.lang.String e(java.lang.String str, int i, int i2, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, java.nio.charset.Charset charset) {
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            int i4 = 43;
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z4) && str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || c(str, i3, i2)))) && (codePointAt != 43 || !z3)))) {
                i3 += java.lang.Character.charCount(codePointAt);
            } else {
                com.facetec.sdk.pk pkVar = new com.facetec.sdk.pk();
                pkVar.e(str, i, i3);
                com.facetec.sdk.pk pkVar2 = null;
                while (i3 < i2) {
                    int codePointAt2 = str.codePointAt(i3);
                    if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == i4 && z3) {
                            pkVar.c(z ? "+" : "%2B");
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= 128 && z4) || str2.indexOf(codePointAt2) != -1 || (codePointAt2 == 37 && (!z || (z2 && !c(str, i3, i2)))))) {
                            if (pkVar2 == null) {
                                pkVar2 = new com.facetec.sdk.pk();
                            }
                            if (charset == null || charset.equals(com.facetec.sdk.nh.f3678a)) {
                                pkVar2.d(codePointAt2);
                            } else {
                                int charCount = java.lang.Character.charCount(codePointAt2) + i3;
                                if (str == null) {
                                    throw new java.lang.IllegalArgumentException("string == null");
                                }
                                if (i3 < 0) {
                                    throw new java.lang.IllegalAccessError("beginIndex < 0: ".concat(java.lang.String.valueOf(i3)));
                                }
                                if (charCount < i3) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder("endIndex < beginIndex: ");
                                    sb.append(charCount);
                                    sb.append(" < ");
                                    sb.append(i3);
                                    throw new java.lang.IllegalArgumentException(sb.toString());
                                }
                                if (charCount > str.length()) {
                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("endIndex > string.length: ");
                                    sb2.append(charCount);
                                    sb2.append(" > ");
                                    sb2.append(str.length());
                                    throw new java.lang.IllegalArgumentException(sb2.toString());
                                }
                                if (charset == null) {
                                    throw new java.lang.IllegalArgumentException("charset == null");
                                }
                                if (charset.equals(com.facetec.sdk.qd.e)) {
                                    pkVar2.e(str, i3, charCount);
                                } else {
                                    byte[] bytes = str.substring(i3, charCount).getBytes(charset);
                                    pkVar2.e(bytes, 0, bytes.length);
                                }
                            }
                            while (!pkVar2.b()) {
                                byte j = pkVar2.j();
                                pkVar.g(37);
                                char[] cArr = d;
                                pkVar.g((int) cArr[((j & 255) >> 4) & 15]);
                                pkVar.g((int) cArr[j & com.google.common.base.Ascii.SI]);
                            }
                        } else {
                            pkVar.d(codePointAt2);
                        }
                    }
                    i3 += java.lang.Character.charCount(codePointAt2);
                    i4 = 43;
                }
                return pkVar.k();
            }
        }
        return str.substring(i, i2);
    }

    static java.lang.String b(java.lang.String str, java.lang.String str2, java.nio.charset.Charset charset) {
        return e(str, 0, str.length(), str2, false, false, true, true, charset);
    }

    static java.lang.String d(java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return e(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }

    public final java.net.URI d() {
        com.facetec.sdk.mv.d dVar = new com.facetec.sdk.mv.d();
        dVar.e = this.c;
        dVar.c = e();
        dVar.b = b();
        dVar.f3664a = this.f3663a;
        dVar.d = this.b != e(this.c) ? this.b : -1;
        dVar.f.clear();
        dVar.f.addAll(i());
        dVar.d(j());
        dVar.j = this.j == null ? null : this.f.substring(this.f.indexOf(35) + 1);
        int size = dVar.f.size();
        for (int i = 0; i < size; i++) {
            dVar.f.set(i, d(dVar.f.get(i), okhttp3.internal.url._UrlKt.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, true));
        }
        if (dVar.g != null) {
            int size2 = dVar.g.size();
            for (int i2 = 0; i2 < size2; i2++) {
                java.lang.String str = dVar.g.get(i2);
                if (str != null) {
                    dVar.g.set(i2, d(str, okhttp3.internal.url._UrlKt.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, true));
                }
            }
        }
        if (dVar.j != null) {
            dVar.j = d(dVar.j, okhttp3.internal.url._UrlKt.FRAGMENT_ENCODE_SET_URI, true, true, false, false);
        }
        java.lang.String obj = dVar.toString();
        try {
            return new java.net.URI(obj);
        } catch (java.net.URISyntaxException e) {
            try {
                return java.net.URI.create(obj.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (java.lang.Exception unused) {
                throw new java.lang.RuntimeException(e);
            }
        }
    }
}
