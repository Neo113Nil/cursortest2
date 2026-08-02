package com.facetec.sdk;

/* loaded from: classes8.dex */
public abstract class mo {
    public static final com.facetec.sdk.mo c = new com.facetec.sdk.mo() { // from class: com.facetec.sdk.mo.1
    };

    public interface c {
        com.facetec.sdk.mo c();
    }

    /* renamed from: com.facetec.sdk.mo$5, reason: invalid class name */
    public final class AnonymousClass5 implements com.facetec.sdk.mo.c {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;

        /* renamed from: a, reason: collision with root package name */
        private static long f3654a;
        private static int b;
        private static int d;
        private static char e;
        private static int f;
        private static int h;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
        /* JADX WARN: Type inference failed for: r7v1, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static java.lang.String $$e(byte b2, byte b3, int i) {
            int i2;
            int i3;
            int i4 = i * 3;
            ?? r7 = 116 - b3;
            int i5 = 3 - (b2 * 2);
            byte[] bArr = $$c;
            byte[] bArr2 = new byte[i4 + 1];
            if (bArr == null) {
                byte b4 = r7;
                i2 = 0;
                int i6 = i5;
                int i7 = i6;
                i3 = i5 + b4;
                i5 = i7;
                int i8 = i5 + 1;
                bArr2[i2] = (byte) i3;
                if (i2 == i4) {
                    return new java.lang.String(bArr2, 0);
                }
                i2++;
                b4 = bArr[i8];
                int i9 = i3;
                i6 = i8;
                i5 = i9;
                int i72 = i6;
                i3 = i5 + b4;
                i5 = i72;
                int i82 = i5 + 1;
                bArr2[i2] = (byte) i3;
                if (i2 == i4) {
                }
            } else {
                i2 = 0;
                i3 = r7;
                int i822 = i5 + 1;
                bArr2[i2] = (byte) i3;
                if (i2 == i4) {
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void g(short s, short s2, byte b2, java.lang.Object[] objArr) {
            int i;
            int i2;
            int i3 = 3 - (b2 * 2);
            byte[] bArr = $$a;
            int i4 = (s2 * 4) + 1;
            int i5 = s + 98;
            byte[] bArr2 = new byte[i4];
            if (bArr == null) {
                int i6 = i3;
                int i7 = 0;
                i5 += i3;
                i3 = i6;
                i = i7;
                bArr2[i] = (byte) i5;
                i2 = i + 1;
                int i8 = i3 + 1;
                if (i2 == i4) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                i6 = i8;
                i3 = bArr[i8];
                i7 = i2;
                i5 += i3;
                i3 = i6;
                i = i7;
                bArr2[i] = (byte) i5;
                i2 = i + 1;
                int i82 = i3 + 1;
                if (i2 == i4) {
                }
            } else {
                i = 0;
                bArr2[i] = (byte) i5;
                i2 = i + 1;
                int i822 = i3 + 1;
                if (i2 == i4) {
                }
            }
        }

        static void init$0() {
            $$a = new byte[]{124, 62, -55, 82};
            $$b = 37;
        }

        static void init$1() {
            $$c = new byte[]{com.google.common.base.Ascii.EM, 104, com.google.common.base.Ascii.SI, -25};
            $$d = 109;
        }

        AnonymousClass5() {
        }

        @Override // com.facetec.sdk.mo.c
        public final com.facetec.sdk.mo c() {
            int i = h;
            f = (i + 35) % 128;
            com.facetec.sdk.mo moVar = com.facetec.sdk.mo.this;
            f = (i + 23) % 128;
            return moVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static void i(java.lang.String str, char c, java.lang.String str2, java.lang.String str3, int i, java.lang.Object[] objArr) {
            char[] cArr;
            int i2 = $10 + 53;
            $11 = i2 % 128;
            java.lang.Object obj = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (str3 != null) {
                cArr = str3.toCharArray();
                $11 = ($10 + 59) % 128;
            } else {
                cArr = str3;
            }
            char[] cArr2 = cArr;
            char[] charArray = str2 != 0 ? str2.toCharArray() : str2;
            char[] charArray2 = str != null ? str.toCharArray() : str;
            com.facetec.sdk.hs hsVar = new com.facetec.sdk.hs();
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int length2 = charArray2.length;
            char[] cArr4 = new char[length2];
            int i3 = 0;
            java.lang.System.arraycopy(cArr2, 0, cArr3, 0, length);
            java.lang.System.arraycopy(charArray2, 0, cArr4, 0, length2);
            cArr3[0] = (char) (cArr3[0] ^ c);
            cArr4[2] = (char) (cArr4[2] + ((char) i));
            int length3 = charArray.length;
            char[] cArr5 = new char[length3];
            hsVar.d = 0;
            while (hsVar.d < length3) {
                $10 = ($11 + 27) % 128;
                try {
                    java.lang.Object[] objArr2 = {hsVar};
                    java.lang.Object d2 = com.facetec.sdk.al.d(-1265265027);
                    if (d2 == null) {
                        char packedPositionGroup = (char) android.widget.ExpandableListView.getPackedPositionGroup(0L);
                        int trimmedLength = android.text.TextUtils.getTrimmedLength("");
                        int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength();
                        byte b2 = (byte) i3;
                        byte b3 = (byte) (b2 + 5);
                        java.lang.String $$e = $$e(b2, b3, (byte) (b3 - 5));
                        java.lang.Class[] clsArr = new java.lang.Class[1];
                        clsArr[i3] = java.lang.Object.class;
                        d2 = com.facetec.sdk.al.c(packedPositionGroup, trimmedLength + 988, 24 - (fadingEdgeLength >> 16), 326823045, false, $$e, clsArr);
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d2).invoke(obj, objArr2)).intValue();
                    java.lang.Object[] objArr3 = {hsVar};
                    java.lang.Object d3 = com.facetec.sdk.al.d(1957241543);
                    if (d3 == null) {
                        char myTid = (char) (android.os.Process.myTid() >> 22);
                        int maxKeyCode = android.view.KeyEvent.getMaxKeyCode();
                        int longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
                        byte b4 = (byte) i3;
                        java.lang.String $$e2 = $$e(b4, (byte) (b4 | 8), b4);
                        java.lang.Class[] clsArr2 = new java.lang.Class[1];
                        clsArr2[i3] = java.lang.Object.class;
                        d3 = com.facetec.sdk.al.c(myTid, (maxKeyCode >> 16) + 1505, 24 - (longPressTimeout >> 16), -750364609, false, $$e2, clsArr2);
                    }
                    int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) d3).invoke(obj, objArr3)).intValue();
                    char c2 = cArr3[hsVar.d % 4];
                    java.lang.Object[] objArr4 = new java.lang.Object[3];
                    objArr4[2] = java.lang.Integer.valueOf(cArr4[intValue]);
                    objArr4[1] = java.lang.Integer.valueOf(c2 * 32718);
                    objArr4[i3] = hsVar;
                    java.lang.Object d4 = com.facetec.sdk.al.d(-1182647832);
                    if (d4 == null) {
                        byte b5 = (byte) i3;
                        byte b6 = (byte) (b5 + 2);
                        d4 = com.facetec.sdk.al.c((char) (26699 - (android.util.TypedValue.complexToFraction(i3, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(i3, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 640 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), android.view.View.MeasureSpec.makeMeasureSpec(i3, i3) + 23, 510477072, false, $$e(b5, b6, (byte) (b6 - 2)), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    ((java.lang.reflect.Method) d4).invoke(null, objArr4);
                    java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(cArr3[intValue2] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                    java.lang.Object d5 = com.facetec.sdk.al.d(1279455729);
                    if (d5 == null) {
                        byte b7 = (byte) 0;
                        d5 = com.facetec.sdk.al.c((char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 409), 2199 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 24, -340948215, false, $$e(b7, b7, b7), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    cArr4[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) d5).invoke(null, objArr5)).charValue();
                    cArr3[intValue2] = hsVar.b;
                    cArr5[hsVar.d] = (char) ((((int) (d ^ 9010024738234916139L)) ^ ((charArray[hsVar.d] ^ cArr3[intValue2]) ^ (f3654a ^ 9010024738234916139L))) ^ ((char) (e ^ 9010024738234916139L)));
                    hsVar.d++;
                    $11 = ($10 + 3) % 128;
                    obj = null;
                    i3 = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new java.lang.String(cArr5);
        }

        /* JADX WARN: Code restructure failed: missing block: B:48:0x0019, code lost:
        
            com.facetec.sdk.mo.AnonymousClass5.$11 = (r3 + 43) % 128;
            r2 = r24.toCharArray();
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0017, code lost:
        
            if (r24 != null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
        
            if (r24 != null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
        
            r2 = r24;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void j(boolean z, int i, java.lang.String str, int i2, int i3, java.lang.Object[] objArr) {
            char[] charArray;
            int i4 = $11 + 7;
            int i5 = i4 % 128;
            $10 = i5;
            if (i4 % 2 != 0) {
                int i6 = 56 / 0;
            }
            char[] cArr = charArray;
            com.facetec.sdk.hp hpVar = new com.facetec.sdk.hp();
            char[] cArr2 = new char[i];
            hpVar.d = 0;
            while (hpVar.d < i) {
                $10 = ($11 + 57) % 128;
                hpVar.b = cArr[hpVar.d];
                cArr2[hpVar.d] = (char) (i2 + hpVar.b);
                int i7 = hpVar.d;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i7]), java.lang.Integer.valueOf(b)};
                    java.lang.Object d2 = com.facetec.sdk.al.d(-1738479149);
                    if (d2 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 3);
                        d2 = com.facetec.sdk.al.c((char) (19485 - android.graphics.Color.alpha(0)), 730 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 24 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 1066373931, false, $$e(b2, b3, (byte) (b3 - 3)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    cArr2[i7] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                    java.lang.Object[] objArr3 = {hpVar, hpVar};
                    java.lang.Object d3 = com.facetec.sdk.al.d(1965925374);
                    if (d3 == null) {
                        d3 = com.facetec.sdk.al.c((char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 24337), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1621, android.text.TextUtils.getTrimmedLength("") + 24, -758982394, false, "v", new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
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
            if (i3 > 0) {
                $11 = ($10 + 99) % 128;
                hpVar.f3630a = i3;
                char[] cArr3 = new char[i];
                java.lang.System.arraycopy(cArr2, 0, cArr3, 0, i);
                java.lang.System.arraycopy(cArr3, 0, cArr2, i - hpVar.f3630a, hpVar.f3630a);
                java.lang.System.arraycopy(cArr3, hpVar.f3630a, cArr2, 0, i - hpVar.f3630a);
            }
            if (z) {
                char[] cArr4 = new char[i];
                hpVar.d = 0;
                while (hpVar.d < i) {
                    cArr4[hpVar.d] = cArr2[(i - hpVar.d) - 1];
                    java.lang.Object[] objArr4 = {hpVar, hpVar};
                    java.lang.Object d4 = com.facetec.sdk.al.d(1965925374);
                    if (d4 == null) {
                        d4 = com.facetec.sdk.al.c((char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 24337), 1621 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 24 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -758982394, false, "v", new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) d4).invoke(null, objArr4);
                }
                cArr2 = cArr4;
            }
            objArr[0] = new java.lang.String(cArr2);
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            h = 0;
            f = 1;
            f3654a = 9010024738234916139L;
            d = 603544875;
            e = (char) 37903;
            b = 780577393;
        }

        /* JADX WARN: Code restructure failed: missing block: B:101:0x18d1, code lost:
        
            r4 = com.facetec.sdk.gh.b.d();
            r5 = (r15 * 615) + (r2 * (-613));
            r6 = ~r15;
            r7 = ~((r6 & r2) | (r6 ^ r2));
            r9 = (r7 & r4) | (r4 ^ r7);
            r10 = ~r2;
            r11 = ~(r10 | r15);
            r9 = -(-(((r9 ^ r11) | (r9 & r11)) * 614));
            r11 = (r5 & r9) + (r5 | r9);
            r4 = ~r4;
            r5 = ~((r6 ^ r4) | (r6 & r4));
            r5 = (((r5 ^ r7) | (r5 & r7)) | (~(r4 | r2))) * (-1228);
            r7 = (r11 ^ r5) + ((r5 & r11) << 1);
            r5 = (r6 & r10) | (r6 ^ r10);
            r5 = ~((r5 ^ r4) | (r4 & r5));
            r4 = (r4 ^ r15) | (r15 & r4);
            r2 = ~((r2 ^ r4) | (r2 & r4));
            r2 = -(-(((r2 ^ r5) | (r2 & r5)) * 614));
            r2 = (r2 & r7) + (r2 | r7);
            r1 = (((r1 | 90) << 1) - (r1 ^ 90)) - 89;
            r19 = r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:102:0x18d0, code lost:
        
            r15 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:104:0x1804, code lost:
        
            r8 = r19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:106:0x1938, code lost:
        
            r8 = r19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x1942, code lost:
        
            if (r2 < 25.2d) goto L171;
         */
        /* JADX WARN: Code restructure failed: missing block: B:108:0x1944, code lost:
        
            com.facetec.sdk.mo.AnonymousClass5.f = (com.facetec.sdk.mo.AnonymousClass5.h + 119) % 128;
            r1 = new java.lang.Object[]{null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, new int[]{0}};
            r3 = (((((~((-556421195) | r2)) | 1061796765) * (-366)) - 1711605929) + (((~(new java.util.Random().nextInt(337517549) | (-2244675))) | 507620245) * 366)) - 1673951360;
            r2 = (r3 << 13) ^ r3;
            r3 = r2 >>> 17;
            r2 = (r2 & (~r3)) | ((~r2) & r3);
            ((int[]) r1[1])[0] = r2 ^ (r2 << 5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:109:0x19a5, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:276:0x2fcb, code lost:
        
            r1 = com.facetec.sdk.gh.b.d();
         */
        /* JADX WARN: Code restructure failed: missing block: B:277:0x2fcf, code lost:
        
            r4 = 283 - (~(-(-(r6 * (-282)))));
            r5 = -(-(((~((r6 ^ (-2)) | (r6 & (-2)))) | (~((r1 & (-2)) | (r1 ^ (-2))))) * (-283)));
            r6 = ~r6;
            r7 = (r6 & (-2)) | (r6 ^ (-2));
            r1 = ((~((r1 ^ r7) | (r1 & r7))) * 283) + (((r4 ^ r5) + ((r4 & r5) << 1)) + ((~((r6 & 1) | (r6 ^ 1))) * 283));
         */
        /* JADX WARN: Code restructure failed: missing block: B:279:0x3003, code lost:
        
            r2.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:339:0x4058, code lost:
        
            if (((r1 ^ r2) | (r1 & r2)) != 0) goto L491;
         */
        /* JADX WARN: Code restructure failed: missing block: B:341:0x412b, code lost:
        
            r1 = new java.lang.Object[]{null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, new int[]{0}};
            r2 = (int) java.lang.Runtime.getRuntime().freeMemory();
            r3 = (((((~r2) | 8392720) * 1324) - 195214195) + (((~(r2 | 499225366)) | (~(1118992593 | r2))) * (-1324))) + 1912421402;
            r2 = r3 << 13;
            r2 = ((~r2) & r3) | ((~r3) & r2);
            r3 = r2 >>> 17;
            r2 = (~(r2 & r3)) & (r2 | r3);
            ((int[]) r1[1])[0] = r2 ^ (r2 << 5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:342:0x4182, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:344:0x4187, code lost:
        
            r1 = com.facetec.sdk.al.d(1671466082);
         */
        /* JADX WARN: Code restructure failed: missing block: B:345:0x418b, code lost:
        
            if (r1 != null) goto L506;
         */
        /* JADX WARN: Code restructure failed: missing block: B:346:0x418d, code lost:
        
            r5 = (char) (58898 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
            r1 = android.graphics.ImageFormat.getBitsPerPixel(0);
            r2 = android.text.TextUtils.indexOf(r3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            r6 = (byte) 0;
            r4 = r6;
            r9 = new java.lang.Object[1];
            g(r6, r4, r4, r9);
            r1 = com.facetec.sdk.al.c(r5, 1528 - r1, r2 + 24, -1001392486, false, (java.lang.String) r9[0], new java.lang.Class[0]);
         */
        /* JADX WARN: Code restructure failed: missing block: B:347:0x41c1, code lost:
        
            r1 = ((java.lang.Long) ((java.lang.reflect.Method) r1).invoke(null, null)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:348:0x41ce, code lost:
        
            r4 = 451954461;
            r6 = android.os.Process.myPid();
            r7 = androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION;
            r13 = r4 ^ r5;
            r11 = r6;
            r27 = r11 ^ r5;
            r11 = androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN;
            r31 = r1 ^ r5;
            r33 = r27 | r4;
            r7 = (((((r7 * r4) + ((-903) * r1)) + ((((r13 | r11) ^ r5) | ((r27 | r1) ^ r5)) * (-1808))) + (((((r13 | r31) | r11) ^ r5) | ((r33 | r1) ^ r5)) * r11)) + (r11 * ((((r1 | r13) ^ r5) | ((r31 | r11) ^ r5)) | (r33 ^ r5)))) - 2050466340;
            r2 = (int) java.lang.Runtime.getRuntime().totalMemory();
            r4 = ~r2;
            r1 = ((int) (r7 >> 32)) & ((((((~((-594579409) | r4)) | (~((-842647003) | r2))) * (-370)) + 635053406) + ((((~(r2 | (-594579409))) | (~(r4 | (-842647003)))) | (-863621083)) * (-370))) - 1712220806);
            r4 = new java.util.Random().nextInt(1722635574);
            r2 = ((int) r7) & (((((~((-208941388) | r4)) | 1646167797) * (-964)) + 181631829) + (((~((~r4) | (-208941388))) | 1310785) * (-964)));
         */
        /* JADX WARN: Code restructure failed: missing block: B:349:0x4282, code lost:
        
            if (((r1 ^ r2) | (r1 & r2)) == 0) goto L511;
         */
        /* JADX WARN: Code restructure failed: missing block: B:350:0x4284, code lost:
        
            r1 = new java.lang.Object[]{null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, new int[]{0}};
            r2 = (int) android.os.SystemClock.uptimeMillis();
            r3 = ((((~((-167987367) | r2)) | 357081921) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) + 551510228) + ((~((~r2) | (-167987367))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING);
            r2 = -(-((r3 ^ 16) + ((r3 & 16) << 1)));
            r5 = ((r2 | (-1673951376)) << 1) - (r2 ^ (-1673951376));
            r2 = r5 << 13;
            r2 = ((~r2) & r5) | ((~r5) & r2);
            r3 = r2 >>> 17;
            r2 = (r2 & (~r3)) | ((~r2) & r3);
            ((int[]) r1[1])[0] = r2 ^ (r2 << 5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:351:0x42e4, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:353:0x42e6, code lost:
        
            r1 = new java.lang.Object[]{0, r68, -1673951376, 16777216};
            r4 = com.facetec.sdk.al.d(-1695430476);
         */
        /* JADX WARN: Code restructure failed: missing block: B:354:0x430c, code lost:
        
            if (r4 != null) goto L515;
         */
        /* JADX WARN: Code restructure failed: missing block: B:355:0x430e, code lost:
        
            r4 = com.facetec.sdk.al.c((char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 1), 2271 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)), android.os.Process.getGidForName(r3) + 25, 1025421900, false, null, new java.lang.Class[]{java.lang.Integer.TYPE, (java.lang.Class) com.facetec.sdk.al.b((char) ((android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) - 1), android.graphics.Color.red(0) + 2246, 24 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), java.lang.Integer.TYPE, java.lang.Integer.TYPE});
         */
        /* JADX WARN: Code restructure failed: missing block: B:356:0x4366, code lost:
        
            r1 = ((java.lang.reflect.Constructor) r4).newInstance(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:358:0x436c, code lost:
        
            r2 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
            r3 = android.text.TextUtils.getOffsetBefore(r3, 0);
            r5 = android.graphics.Color.green(0);
            r12 = new java.lang.Object[1];
            j(true, (r2 & 16) + (r2 | 16), "ￏ\b\u000f\u0002\rￏ\u0002\u0017\u0002\u000b\u0005\u0002\u0006\u0013\t\ufff5", 231 - r3, (r5 & 10) + (r5 | 10), r12);
            r3 = java.lang.Class.forName((java.lang.String) r12[0]);
            r2 = (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1));
            r9 = (char) ((57495 & r2) + (r2 | 57495));
            r2 = -(-(android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)));
            r5 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", r9, "\udf01邙ൊ㐃ꘌ", "\ude3f鸳韒\ue1e0", (((-761383971) | r2) << 1) - (r2 ^ (-761383971)), r5);
            r3.getMethod((java.lang.String) r5[0], null).invoke(r1, null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:359:0x43dc, code lost:
        
            r1 = new java.lang.Object[]{null, new int[1], new int[]{0}, new int[]{0}};
            r2 = (int) android.os.SystemClock.uptimeMillis();
            r3 = ~r2;
            r3 = (-1673951377) - (~((((((~((-43918013) | r3)) | 1574299947) * (-602)) + 493433361) + ((((~(r2 | (-43918013))) | 9707560) | (~(1608510399 | r3))) * (-301))) + ((~(1574299947 | r3)) * 301)));
            r2 = r3 << 13;
            r2 = ((~r2) & r3) | ((~r3) & r2);
            r3 = r2 >>> 17;
            r2 = (r2 & (~r3)) | ((~r2) & r3);
            r3 = r2 << 5;
            ((int[]) r1[1])[0] = (r2 & (~r3)) | ((~r2) & r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:360:0x4443, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:362:0x4444, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:363:0x4445, code lost:
        
            r2 = r0.getCause();
         */
        /* JADX WARN: Code restructure failed: missing block: B:364:0x444a, code lost:
        
            if (r2 != null) goto L522;
         */
        /* JADX WARN: Code restructure failed: missing block: B:365:0x444c, code lost:
        
            throw r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:366:0x444d, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:374:0x4127, code lost:
        
            if (((r1 ^ r2) | (r1 & r2)) != 0) goto L491;
         */
        /* JADX WARN: Code restructure failed: missing block: B:422:0x30c7, code lost:
        
            if (r2 == null) goto L397;
         */
        /* JADX WARN: Code restructure failed: missing block: B:447:0x2ec6, code lost:
        
            if (r2 == null) goto L358;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x049d, code lost:
        
            if (((r1 ^ r2) | (r1 & r2)) != 477111747) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x05bb, code lost:
        
            r19 = "";
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0a0a, code lost:
        
            if (android.os.Build.VERSION.SDK_INT <= 33) goto L98;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0a0c, code lost:
        
            r2 = r19;
            r1 = -android.text.TextUtils.indexOf(r2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
            r3 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", (char) ((60485 ^ r1) + ((r1 & 60485) << 1)), "\uec46蹔ם螔ⵗ챹곪\uf764\uec9bɶ듗ꪼ轺臇\ud8df\ue22a拼祮發髹첍ᜡ\uee2d襓\ue00d⪧䂔\ude33", "巭\u0a80䘐鷬", android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0a39, code lost:
        
            r3 = new java.lang.Object[]{(java.lang.String) r3[0]};
            r4 = com.facetec.sdk.al.d(1450487247);
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0a44, code lost:
        
            if (r4 != null) goto L94;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0a46, code lost:
        
            r5 = (char) (6934 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)));
            r4 = android.view.ViewConfiguration.getScrollBarSize();
            r6 = android.view.ViewConfiguration.getMinimumFlingVelocity();
            r7 = (byte) 0;
            r8 = r7;
            r11 = new java.lang.Object[1];
            g(r7, r8, r8, r11);
            r4 = com.facetec.sdk.al.c(r5, 2389 - (r4 >> 8), 23 - (r6 >> 16), -241445065, false, (java.lang.String) r11[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:525:0x1738, code lost:
        
            if (((r1 ^ r4) | (r1 & r4)) == 477111747) goto L151;
         */
        /* JADX WARN: Code restructure failed: missing block: B:529:0x0b55, code lost:
        
            r1 = -(-(android.os.Process.myTid() >> 22));
            r4 = (char) ((r1 & 32084) + (r1 | 32084));
            r1 = -(-(android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)));
            r9 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", r4, "鰬䜮播⫵\ue889\udf86瘺ܼ싉䓂哢\ued17䀠", "䨺혍哸\ue47d", ((-120189623) & r1) + (r1 | (-120189623)), r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0a80, code lost:
        
            r3 = ((java.lang.Long) ((java.lang.reflect.Method) r4).invoke(null, r3)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:530:0x0b89, code lost:
        
            r1 = new java.lang.Object[]{(java.lang.String) r9[0]};
            r3 = com.facetec.sdk.al.d(1590238701);
         */
        /* JADX WARN: Code restructure failed: missing block: B:531:0x0b94, code lost:
        
            if (r3 != null) goto L102;
         */
        /* JADX WARN: Code restructure failed: missing block: B:532:0x0b96, code lost:
        
            r3 = (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
            r4 = android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
            r6 = android.graphics.Color.green(0);
            r7 = (byte) 3;
            r2 = (byte) (r7 - 3);
            r10 = new java.lang.Object[1];
            g(r7, r2, r2, r10);
            r3 = com.facetec.sdk.al.c(r3, 2077 - (r4 > 0 ? 1 : (r4 == 0 ? 0 : -1)), r6 + 24, -114923755, false, (java.lang.String) r10[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:533:0x0bcf, code lost:
        
            r1 = ((java.lang.reflect.Method) r3).invoke(null, r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:534:0x0bd6, code lost:
        
            r2 = android.view.ViewConfiguration.getMaximumFlingVelocity();
            r3 = android.os.Process.myPid();
            r5 = android.view.Gravity.getAbsoluteGravity(0, 0);
            r12 = new java.lang.Object[1];
            j(false, 1 - (r2 >> 16), "\u0000", (r3 >> 22) + 185, ((r5 | 1) << 1) - (r5 ^ 1), r12);
            r2 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:535:0x0c05, code lost:
        
            if (r1.equals((java.lang.String) r12[0]) == false) goto L108;
         */
        /* JADX WARN: Code restructure failed: missing block: B:536:0x0c07, code lost:
        
            r1 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0a8d, code lost:
        
            r5 = 1701971224;
            r13 = r5 ^ r5;
            r19 = r2;
            r1 = (int) java.lang.Runtime.getRuntime().totalMemory();
            r31 = r1 ^ r5;
            r7 = (((((302 * r5) + (603 * r3)) + ((-602) * (((r13 | r31) ^ r5) | r3))) + ((-301) * ((((r1 | r13) ^ r5) | (((r3 ^ r5) | r13) ^ r5)) | (((r31 | r5) | r3) ^ r5)))) + (301 * ((r31 | r3) ^ r5))) + 149205417;
            r2 = new java.util.Random().nextInt(796254944);
            r3 = ~r2;
            r1 = ((int) (r7 >> 32)) & ((((((-878227481) | r3) * (-369)) - 802173004) + (((~(1960622140 | r3)) | (-897118745)) * (-369))) + ((((~(r2 | (-1960622141))) | 1082394660) | (~(r3 | (-18891265)))) * 369));
            r3 = new java.util.Random().nextInt(1377155816);
            r4 = ~r3;
            r2 = ((int) r7) & (((((1609977356 | r3) * (-50)) - 506404245) + (((~(r3 | (-1247169545))) | (~((-593986) | r4))) * 50)) + (((~(1609977356 | r4)) | ((~(r4 | (-1247763530))) | 593985)) * 50));
         */
        /* JADX WARN: Code restructure failed: missing block: B:545:0x06cb, code lost:
        
            if (((((int) (r11 >> 110)) & ((((~(904305873 | r2)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) + 281077582) + (((~((~r2) | 904305873)) | 365074641) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING))) | ((((((~((-1657533386) | r4)) | 1657430464) * (-160)) + 676012181) + (((~(r4 | (-220306976))) | (-1657533386)) * 160)) & ((int) r11))) != 477111747) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0b4f, code lost:
        
            if (((r1 ^ r2) | (r1 & r2)) != 1) goto L108;
         */
        /* JADX WARN: Code restructure failed: missing block: B:551:0x07f1, code lost:
        
            if (((r1 ^ r2) | (r1 & r2)) != 477111747) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:559:0x0904, code lost:
        
            if (((r1 ^ r3) | (r1 & r3)) != (-1032769152)) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0b51, code lost:
        
            r1 = 1;
            r2 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:567:0x0a04, code lost:
        
            if (((r1 ^ r3) | (r1 & r3)) == 542074309) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0c08, code lost:
        
            r4 = new int[r1];
            r5 = new int[r1];
            r5[r2] = r2;
            r4[r2] = 260;
            r1 = new java.lang.Object[]{null, new int[r1], r4, r5};
            r2 = (int) android.os.Process.getElapsedCpuTime();
            r3 = ~r2;
            r2 = -(-((((((385894657 | r3) * (-192)) - 1216546521) + (((~((-685748863) | r3)) | 546574440) * (-384))) + ((((~(r2 | (-546574441))) | (~(r3 | (-139174423)))) | (~(1071643519 | r2))) * 192)) + 16));
            r4 = (r2 ^ (-1673951376)) + ((r2 & (-1673951376)) << 1);
            r2 = r4 << 13;
            r2 = ((~r2) & r4) | ((~r4) & r2);
            r3 = r2 >>> 17;
            r2 = (~(r2 & r3)) & (r2 | r3);
            ((int[]) r1[1])[0] = r2 ^ (r2 << 5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:576:0x05b8, code lost:
        
            if (((r1 & ((((((~(r3 | 1946507041)) | 38797330) | (~((-911233844) | r3))) * (-397)) + 232989098) + ((r2 | 1112867858) * 397))) | (((((((-2147481340) | r6) * 988) + 119434129) + (((~((-1809823324) | r7)) | 34938897) * (-1976))) + ((((~((-372596914) | r6)) | (-2147481340)) | (~(372596913 | r7))) * 988)) & r4)) != 477111747) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0c75, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x1620, code lost:
        
            if (((r1 ^ r2) | (r1 & r2)) != 477111747) goto L143;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x173a, code lost:
        
            r1 = 0;
            r2 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x173e, code lost:
        
            if (r1 >= 28) goto L579;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x1740, code lost:
        
            r4 = r3[r1];
            r8 = (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)) - 1);
            r5 = android.os.Process.getGidForName(r19);
            r6 = com.facetec.sdk.gh.b.d();
            r7 = (r5 * (-183)) - 183;
            r9 = ~r5;
            r6 = ~r6;
            r10 = (r9 ^ r6) | (r9 & r6);
            r6 = (r6 & (-2)) | (r6 ^ (-2));
            r11 = ((~((r6 ^ r5) | (r6 & r5))) | (~((r10 ^ 1) | (r10 & 1)))) * (-184);
            r9 = (~((r9 & (-2)) | (r9 ^ (-2)))) | (~r10);
            r6 = ~r6;
            r13 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", r8, "啧叀鴪ٹ㤦끄\uf4e9戠䦦䓝樳祖", "哂ᱪ꧐㉍", (((((r7 ^ r11) + ((r7 & r11) << 1)) - (~(-(-(((r6 ^ r9) | (r6 & r9)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))))) - 1) - (~(((r5 ^ 1) | (r5 & 1)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))) - 1, r13);
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x17b8, code lost:
        
            r4 = new java.lang.Object[]{((java.lang.String) r13[0]).concat(java.lang.String.valueOf(r4))};
            r6 = com.facetec.sdk.al.d(1450487247);
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x17c3, code lost:
        
            if (r6 != null) goto L158;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x17c5, code lost:
        
            r8 = r19;
            r6 = (char) (android.text.TextUtils.indexOf(r8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 6936);
            r7 = (byte) android.view.KeyEvent.getModifierMetaStateMask();
            r9 = android.view.ViewConfiguration.getPressedStateDuration();
            r10 = (byte) 0;
            r11 = r10;
            r14 = new java.lang.Object[1];
            g(r10, r11, r11, r14);
            r6 = com.facetec.sdk.al.c(r6, 2388 - r7, 23 - (r9 >> 16), -241445065, false, (java.lang.String) r14[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x1806, code lost:
        
            r4 = ((java.lang.Long) ((java.lang.reflect.Method) r6).invoke(null, r4)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x1813, code lost:
        
            r6 = 1066510853;
            r10 = -949;
            r14 = (int) java.lang.Runtime.getRuntime().maxMemory();
            r23 = r14 ^ r5;
            r4 = (((((r10 * r6) + (r10 * r4)) + (1900 * ((((r4 ^ r5) | r23) ^ r5) | (((r6 ^ r5) | r14) ^ r5)))) + ((-950) * (((r23 | r6) ^ r5) | ((r4 | r14) ^ r5)))) + (950 * (((r23 | r4) ^ r5) | ((r6 | r14) ^ r5)))) + 784665788;
            r7 = (int) java.lang.Runtime.getRuntime().maxMemory();
            r6 = ((int) (r4 >> 32)) & ((((((~(1359951802 | r7)) | (-77274609)) * (-465)) + 2124448518) + (((~((-77274609) | r7)) | 1359951802) * 930)) + ((r7 | (-76548161)) * 465));
            r5 = (int) java.lang.Runtime.getRuntime().totalMemory();
            r7 = ~r5;
            r4 = ((int) r4) & ((((((~(1415535627 | r7)) | 27263552) * (-108)) + 873421133) + (((~(r7 | 1442205258)) | ((~((-1442205259) | r5)) | 593921)) * 54)) + ((r5 | 593921) * 54));
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x18cc, code lost:
        
            if (((r4 ^ r6) | (r4 & r6)) != 0) goto L163;
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x18ce, code lost:
        
            r15 = 0;
         */
        /* JADX WARN: Removed duplicated region for block: B:113:0x19ec A[Catch: all -> 0x444e, TryCatch #10 {all -> 0x444e, blocks: (B:3:0x0003, B:5:0x000f, B:6:0x0042, B:13:0x01a0, B:15:0x01ae, B:16:0x01e6, B:27:0x02ba, B:29:0x02c4, B:30:0x02fe, B:32:0x033d, B:34:0x0347, B:35:0x0382, B:39:0x0397, B:41:0x03ae, B:42:0x03fc, B:49:0x0a39, B:51:0x0a46, B:52:0x0a80, B:60:0x1277, B:62:0x1284, B:63:0x12bf, B:66:0x133d, B:68:0x134a, B:69:0x1389, B:73:0x145f, B:75:0x146c, B:76:0x14a4, B:78:0x14dc, B:80:0x14e9, B:81:0x1521, B:83:0x152a, B:85:0x1542, B:86:0x157d, B:93:0x17b8, B:95:0x17c5, B:96:0x1806, B:111:0x19df, B:113:0x19ec, B:114:0x1a25, B:116:0x1b58, B:118:0x1b65, B:119:0x1ba6, B:131:0x1da4, B:133:0x1db1, B:134:0x1de4, B:136:0x1eaf, B:138:0x1ebc, B:139:0x1ef0, B:152:0x2195, B:154:0x21a2, B:155:0x21da, B:203:0x280a, B:205:0x2817, B:206:0x284d, B:210:0x2888, B:212:0x2895, B:213:0x28d3, B:220:0x2cc3, B:222:0x2cd0, B:223:0x2d0c, B:284:0x30cf, B:286:0x30d5, B:287:0x3108, B:296:0x3881, B:298:0x3892, B:299:0x38c9, B:305:0x39eb, B:307:0x39f1, B:308:0x3a27, B:314:0x3bc2, B:316:0x3be6, B:317:0x3c2a, B:323:0x3d88, B:325:0x3d95, B:326:0x3dc9, B:334:0x3f7f, B:336:0x3f85, B:337:0x3fbc, B:344:0x4187, B:346:0x418d, B:347:0x41c1, B:353:0x42e6, B:355:0x430e, B:356:0x4366, B:369:0x4060, B:371:0x4066, B:372:0x409a, B:376:0x3245, B:378:0x324b, B:379:0x327f, B:386:0x33c1, B:388:0x33c7, B:389:0x33f9, B:395:0x3533, B:397:0x3539, B:398:0x3569, B:403:0x36b1, B:405:0x36b7, B:406:0x36eb, B:520:0x1630, B:522:0x1647, B:523:0x1686, B:530:0x0b89, B:532:0x0b96, B:533:0x0bcf, B:540:0x05d6, B:542:0x05ed, B:543:0x0633, B:546:0x06cf, B:548:0x06e6, B:549:0x072b, B:554:0x07fb, B:556:0x0812, B:557:0x0852, B:562:0x0909, B:564:0x0920, B:565:0x095f, B:571:0x04a8, B:573:0x04bf, B:574:0x0503), top: B:2:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:118:0x1b65 A[Catch: all -> 0x444e, TryCatch #10 {all -> 0x444e, blocks: (B:3:0x0003, B:5:0x000f, B:6:0x0042, B:13:0x01a0, B:15:0x01ae, B:16:0x01e6, B:27:0x02ba, B:29:0x02c4, B:30:0x02fe, B:32:0x033d, B:34:0x0347, B:35:0x0382, B:39:0x0397, B:41:0x03ae, B:42:0x03fc, B:49:0x0a39, B:51:0x0a46, B:52:0x0a80, B:60:0x1277, B:62:0x1284, B:63:0x12bf, B:66:0x133d, B:68:0x134a, B:69:0x1389, B:73:0x145f, B:75:0x146c, B:76:0x14a4, B:78:0x14dc, B:80:0x14e9, B:81:0x1521, B:83:0x152a, B:85:0x1542, B:86:0x157d, B:93:0x17b8, B:95:0x17c5, B:96:0x1806, B:111:0x19df, B:113:0x19ec, B:114:0x1a25, B:116:0x1b58, B:118:0x1b65, B:119:0x1ba6, B:131:0x1da4, B:133:0x1db1, B:134:0x1de4, B:136:0x1eaf, B:138:0x1ebc, B:139:0x1ef0, B:152:0x2195, B:154:0x21a2, B:155:0x21da, B:203:0x280a, B:205:0x2817, B:206:0x284d, B:210:0x2888, B:212:0x2895, B:213:0x28d3, B:220:0x2cc3, B:222:0x2cd0, B:223:0x2d0c, B:284:0x30cf, B:286:0x30d5, B:287:0x3108, B:296:0x3881, B:298:0x3892, B:299:0x38c9, B:305:0x39eb, B:307:0x39f1, B:308:0x3a27, B:314:0x3bc2, B:316:0x3be6, B:317:0x3c2a, B:323:0x3d88, B:325:0x3d95, B:326:0x3dc9, B:334:0x3f7f, B:336:0x3f85, B:337:0x3fbc, B:344:0x4187, B:346:0x418d, B:347:0x41c1, B:353:0x42e6, B:355:0x430e, B:356:0x4366, B:369:0x4060, B:371:0x4066, B:372:0x409a, B:376:0x3245, B:378:0x324b, B:379:0x327f, B:386:0x33c1, B:388:0x33c7, B:389:0x33f9, B:395:0x3533, B:397:0x3539, B:398:0x3569, B:403:0x36b1, B:405:0x36b7, B:406:0x36eb, B:520:0x1630, B:522:0x1647, B:523:0x1686, B:530:0x0b89, B:532:0x0b96, B:533:0x0bcf, B:540:0x05d6, B:542:0x05ed, B:543:0x0633, B:546:0x06cf, B:548:0x06e6, B:549:0x072b, B:554:0x07fb, B:556:0x0812, B:557:0x0852, B:562:0x0909, B:564:0x0920, B:565:0x095f, B:571:0x04a8, B:573:0x04bf, B:574:0x0503), top: B:2:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:122:0x1c5c  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x1d03  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x1db1 A[Catch: all -> 0x444e, TryCatch #10 {all -> 0x444e, blocks: (B:3:0x0003, B:5:0x000f, B:6:0x0042, B:13:0x01a0, B:15:0x01ae, B:16:0x01e6, B:27:0x02ba, B:29:0x02c4, B:30:0x02fe, B:32:0x033d, B:34:0x0347, B:35:0x0382, B:39:0x0397, B:41:0x03ae, B:42:0x03fc, B:49:0x0a39, B:51:0x0a46, B:52:0x0a80, B:60:0x1277, B:62:0x1284, B:63:0x12bf, B:66:0x133d, B:68:0x134a, B:69:0x1389, B:73:0x145f, B:75:0x146c, B:76:0x14a4, B:78:0x14dc, B:80:0x14e9, B:81:0x1521, B:83:0x152a, B:85:0x1542, B:86:0x157d, B:93:0x17b8, B:95:0x17c5, B:96:0x1806, B:111:0x19df, B:113:0x19ec, B:114:0x1a25, B:116:0x1b58, B:118:0x1b65, B:119:0x1ba6, B:131:0x1da4, B:133:0x1db1, B:134:0x1de4, B:136:0x1eaf, B:138:0x1ebc, B:139:0x1ef0, B:152:0x2195, B:154:0x21a2, B:155:0x21da, B:203:0x280a, B:205:0x2817, B:206:0x284d, B:210:0x2888, B:212:0x2895, B:213:0x28d3, B:220:0x2cc3, B:222:0x2cd0, B:223:0x2d0c, B:284:0x30cf, B:286:0x30d5, B:287:0x3108, B:296:0x3881, B:298:0x3892, B:299:0x38c9, B:305:0x39eb, B:307:0x39f1, B:308:0x3a27, B:314:0x3bc2, B:316:0x3be6, B:317:0x3c2a, B:323:0x3d88, B:325:0x3d95, B:326:0x3dc9, B:334:0x3f7f, B:336:0x3f85, B:337:0x3fbc, B:344:0x4187, B:346:0x418d, B:347:0x41c1, B:353:0x42e6, B:355:0x430e, B:356:0x4366, B:369:0x4060, B:371:0x4066, B:372:0x409a, B:376:0x3245, B:378:0x324b, B:379:0x327f, B:386:0x33c1, B:388:0x33c7, B:389:0x33f9, B:395:0x3533, B:397:0x3539, B:398:0x3569, B:403:0x36b1, B:405:0x36b7, B:406:0x36eb, B:520:0x1630, B:522:0x1647, B:523:0x1686, B:530:0x0b89, B:532:0x0b96, B:533:0x0bcf, B:540:0x05d6, B:542:0x05ed, B:543:0x0633, B:546:0x06cf, B:548:0x06e6, B:549:0x072b, B:554:0x07fb, B:556:0x0812, B:557:0x0852, B:562:0x0909, B:564:0x0920, B:565:0x095f, B:571:0x04a8, B:573:0x04bf, B:574:0x0503), top: B:2:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:138:0x1ebc A[Catch: all -> 0x444e, TryCatch #10 {all -> 0x444e, blocks: (B:3:0x0003, B:5:0x000f, B:6:0x0042, B:13:0x01a0, B:15:0x01ae, B:16:0x01e6, B:27:0x02ba, B:29:0x02c4, B:30:0x02fe, B:32:0x033d, B:34:0x0347, B:35:0x0382, B:39:0x0397, B:41:0x03ae, B:42:0x03fc, B:49:0x0a39, B:51:0x0a46, B:52:0x0a80, B:60:0x1277, B:62:0x1284, B:63:0x12bf, B:66:0x133d, B:68:0x134a, B:69:0x1389, B:73:0x145f, B:75:0x146c, B:76:0x14a4, B:78:0x14dc, B:80:0x14e9, B:81:0x1521, B:83:0x152a, B:85:0x1542, B:86:0x157d, B:93:0x17b8, B:95:0x17c5, B:96:0x1806, B:111:0x19df, B:113:0x19ec, B:114:0x1a25, B:116:0x1b58, B:118:0x1b65, B:119:0x1ba6, B:131:0x1da4, B:133:0x1db1, B:134:0x1de4, B:136:0x1eaf, B:138:0x1ebc, B:139:0x1ef0, B:152:0x2195, B:154:0x21a2, B:155:0x21da, B:203:0x280a, B:205:0x2817, B:206:0x284d, B:210:0x2888, B:212:0x2895, B:213:0x28d3, B:220:0x2cc3, B:222:0x2cd0, B:223:0x2d0c, B:284:0x30cf, B:286:0x30d5, B:287:0x3108, B:296:0x3881, B:298:0x3892, B:299:0x38c9, B:305:0x39eb, B:307:0x39f1, B:308:0x3a27, B:314:0x3bc2, B:316:0x3be6, B:317:0x3c2a, B:323:0x3d88, B:325:0x3d95, B:326:0x3dc9, B:334:0x3f7f, B:336:0x3f85, B:337:0x3fbc, B:344:0x4187, B:346:0x418d, B:347:0x41c1, B:353:0x42e6, B:355:0x430e, B:356:0x4366, B:369:0x4060, B:371:0x4066, B:372:0x409a, B:376:0x3245, B:378:0x324b, B:379:0x327f, B:386:0x33c1, B:388:0x33c7, B:389:0x33f9, B:395:0x3533, B:397:0x3539, B:398:0x3569, B:403:0x36b1, B:405:0x36b7, B:406:0x36eb, B:520:0x1630, B:522:0x1647, B:523:0x1686, B:530:0x0b89, B:532:0x0b96, B:533:0x0bcf, B:540:0x05d6, B:542:0x05ed, B:543:0x0633, B:546:0x06cf, B:548:0x06e6, B:549:0x072b, B:554:0x07fb, B:556:0x0812, B:557:0x0852, B:562:0x0909, B:564:0x0920, B:565:0x095f, B:571:0x04a8, B:573:0x04bf, B:574:0x0503), top: B:2:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:142:0x1f92  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x2193  */
        /* JADX WARN: Removed duplicated region for block: B:162:0x22c5  */
        /* JADX WARN: Removed duplicated region for block: B:164:0x2391  */
        /* JADX WARN: Removed duplicated region for block: B:200:0x2772  */
        /* JADX WARN: Removed duplicated region for block: B:202:0x27db  */
        /* JADX WARN: Removed duplicated region for block: B:286:0x30d5 A[Catch: all -> 0x444e, TryCatch #10 {all -> 0x444e, blocks: (B:3:0x0003, B:5:0x000f, B:6:0x0042, B:13:0x01a0, B:15:0x01ae, B:16:0x01e6, B:27:0x02ba, B:29:0x02c4, B:30:0x02fe, B:32:0x033d, B:34:0x0347, B:35:0x0382, B:39:0x0397, B:41:0x03ae, B:42:0x03fc, B:49:0x0a39, B:51:0x0a46, B:52:0x0a80, B:60:0x1277, B:62:0x1284, B:63:0x12bf, B:66:0x133d, B:68:0x134a, B:69:0x1389, B:73:0x145f, B:75:0x146c, B:76:0x14a4, B:78:0x14dc, B:80:0x14e9, B:81:0x1521, B:83:0x152a, B:85:0x1542, B:86:0x157d, B:93:0x17b8, B:95:0x17c5, B:96:0x1806, B:111:0x19df, B:113:0x19ec, B:114:0x1a25, B:116:0x1b58, B:118:0x1b65, B:119:0x1ba6, B:131:0x1da4, B:133:0x1db1, B:134:0x1de4, B:136:0x1eaf, B:138:0x1ebc, B:139:0x1ef0, B:152:0x2195, B:154:0x21a2, B:155:0x21da, B:203:0x280a, B:205:0x2817, B:206:0x284d, B:210:0x2888, B:212:0x2895, B:213:0x28d3, B:220:0x2cc3, B:222:0x2cd0, B:223:0x2d0c, B:284:0x30cf, B:286:0x30d5, B:287:0x3108, B:296:0x3881, B:298:0x3892, B:299:0x38c9, B:305:0x39eb, B:307:0x39f1, B:308:0x3a27, B:314:0x3bc2, B:316:0x3be6, B:317:0x3c2a, B:323:0x3d88, B:325:0x3d95, B:326:0x3dc9, B:334:0x3f7f, B:336:0x3f85, B:337:0x3fbc, B:344:0x4187, B:346:0x418d, B:347:0x41c1, B:353:0x42e6, B:355:0x430e, B:356:0x4366, B:369:0x4060, B:371:0x4066, B:372:0x409a, B:376:0x3245, B:378:0x324b, B:379:0x327f, B:386:0x33c1, B:388:0x33c7, B:389:0x33f9, B:395:0x3533, B:397:0x3539, B:398:0x3569, B:403:0x36b1, B:405:0x36b7, B:406:0x36eb, B:520:0x1630, B:522:0x1647, B:523:0x1686, B:530:0x0b89, B:532:0x0b96, B:533:0x0bcf, B:540:0x05d6, B:542:0x05ed, B:543:0x0633, B:546:0x06cf, B:548:0x06e6, B:549:0x072b, B:554:0x07fb, B:556:0x0812, B:557:0x0852, B:562:0x0909, B:564:0x0920, B:565:0x095f, B:571:0x04a8, B:573:0x04bf, B:574:0x0503), top: B:2:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:290:0x31cb  */
        /* JADX WARN: Removed duplicated region for block: B:294:0x387f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:295:0x3880  */
        /* JADX WARN: Removed duplicated region for block: B:375:0x3241  */
        /* JADX WARN: Removed duplicated region for block: B:516:0x22c0 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:583:0x4456  */
        /* JADX WARN: Removed duplicated region for block: B:584:0x4457  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x1284 A[Catch: all -> 0x444e, TryCatch #10 {all -> 0x444e, blocks: (B:3:0x0003, B:5:0x000f, B:6:0x0042, B:13:0x01a0, B:15:0x01ae, B:16:0x01e6, B:27:0x02ba, B:29:0x02c4, B:30:0x02fe, B:32:0x033d, B:34:0x0347, B:35:0x0382, B:39:0x0397, B:41:0x03ae, B:42:0x03fc, B:49:0x0a39, B:51:0x0a46, B:52:0x0a80, B:60:0x1277, B:62:0x1284, B:63:0x12bf, B:66:0x133d, B:68:0x134a, B:69:0x1389, B:73:0x145f, B:75:0x146c, B:76:0x14a4, B:78:0x14dc, B:80:0x14e9, B:81:0x1521, B:83:0x152a, B:85:0x1542, B:86:0x157d, B:93:0x17b8, B:95:0x17c5, B:96:0x1806, B:111:0x19df, B:113:0x19ec, B:114:0x1a25, B:116:0x1b58, B:118:0x1b65, B:119:0x1ba6, B:131:0x1da4, B:133:0x1db1, B:134:0x1de4, B:136:0x1eaf, B:138:0x1ebc, B:139:0x1ef0, B:152:0x2195, B:154:0x21a2, B:155:0x21da, B:203:0x280a, B:205:0x2817, B:206:0x284d, B:210:0x2888, B:212:0x2895, B:213:0x28d3, B:220:0x2cc3, B:222:0x2cd0, B:223:0x2d0c, B:284:0x30cf, B:286:0x30d5, B:287:0x3108, B:296:0x3881, B:298:0x3892, B:299:0x38c9, B:305:0x39eb, B:307:0x39f1, B:308:0x3a27, B:314:0x3bc2, B:316:0x3be6, B:317:0x3c2a, B:323:0x3d88, B:325:0x3d95, B:326:0x3dc9, B:334:0x3f7f, B:336:0x3f85, B:337:0x3fbc, B:344:0x4187, B:346:0x418d, B:347:0x41c1, B:353:0x42e6, B:355:0x430e, B:356:0x4366, B:369:0x4060, B:371:0x4066, B:372:0x409a, B:376:0x3245, B:378:0x324b, B:379:0x327f, B:386:0x33c1, B:388:0x33c7, B:389:0x33f9, B:395:0x3533, B:397:0x3539, B:398:0x3569, B:403:0x36b1, B:405:0x36b7, B:406:0x36eb, B:520:0x1630, B:522:0x1647, B:523:0x1686, B:530:0x0b89, B:532:0x0b96, B:533:0x0bcf, B:540:0x05d6, B:542:0x05ed, B:543:0x0633, B:546:0x06cf, B:548:0x06e6, B:549:0x072b, B:554:0x07fb, B:556:0x0812, B:557:0x0852, B:562:0x0909, B:564:0x0920, B:565:0x095f, B:571:0x04a8, B:573:0x04bf, B:574:0x0503), top: B:2:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x12c8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object[] a$896c745(java.lang.Object obj) {
            java.lang.Throwable cause;
            long j;
            long j2;
            long j3;
            long j4;
            long j5;
            long j6;
            int elapsedRealtime;
            int freeMemory;
            int i;
            long j7;
            long j8;
            java.lang.String str;
            java.lang.Object d2;
            java.lang.Object invoke;
            java.lang.String str2;
            java.lang.Object d3;
            long j9;
            java.lang.Object d4;
            java.lang.Object d5;
            long j10;
            java.lang.Object d6;
            java.lang.String str3;
            java.lang.String[] strArr;
            int i2;
            java.lang.String str4;
            int i3;
            int i4;
            int i5;
            java.lang.Throwable th;
            java.io.BufferedInputStream bufferedInputStream;
            java.io.BufferedInputStream bufferedInputStream2;
            int i6;
            java.lang.Throwable th2;
            java.io.BufferedInputStream bufferedInputStream3;
            java.io.BufferedInputStream bufferedInputStream4;
            java.lang.Object d7;
            int i7;
            int i8;
            java.lang.Object[] objArr;
            int i9;
            char c;
            long j11;
            int i10;
            long j12;
            java.lang.String str5;
            java.lang.Throwable th3;
            java.lang.Object invoke2;
            java.lang.Object[] objArr2;
            int parseInt;
            java.lang.Throwable th4;
            java.lang.String[] strArr2;
            int i11;
            int i12;
            int i13;
            int i14;
            java.lang.String str6;
            java.lang.Object obj2;
            java.lang.Object obj3;
            java.lang.String str7;
            try {
                java.lang.Object d8 = com.facetec.sdk.al.d(60475645);
                if (d8 == null) {
                    char normalizeMetaState = (char) (android.view.KeyEvent.normalizeMetaState(0) + 41371);
                    float minVolume = android.media.AudioTrack.getMinVolume();
                    long uptimeMillis = android.os.SystemClock.uptimeMillis();
                    byte b2 = (byte) 2;
                    byte b3 = (byte) (b2 - 2);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    g(b2, b3, b3, objArr3);
                    d8 = com.facetec.sdk.al.c(normalizeMetaState, (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)) + 615, (uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1)) + 23, -1535790587, false, (java.lang.String) objArr3[0], new java.lang.Class[0]);
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) d8).invoke(null, null)).longValue();
                long j13 = -226277012;
                j = 70;
                j2 = -68;
                j3 = 69;
                j4 = -1;
                long j14 = j13 ^ j4;
                long j15 = longValue ^ j4;
                long uptimeMillis2 = (int) android.os.SystemClock.uptimeMillis();
                j5 = -69;
                j6 = (-300914282) + (j * j13) + (j2 * longValue) + (((((j14 | j15) | uptimeMillis2) ^ j4) | (((j13 | longValue) | uptimeMillis2) ^ j4)) * j3) + ((((j14 | longValue) ^ j4) | ((j14 | uptimeMillis2) ^ j4) | ((longValue | uptimeMillis2) ^ j4)) * j5) + (((j15 | j13) ^ j4) * j3);
                elapsedRealtime = (int) android.os.SystemClock.elapsedRealtime();
                freeMemory = (int) java.lang.Runtime.getRuntime().freeMemory();
                i = ~freeMemory;
            } catch (java.lang.Throwable th5) {
                cause = th5.getCause();
                if (cause == null) {
                }
            }
            if (((((int) j6) & (((((~((-1791615666) | i)) | (-1066125221)) * (-865)) - 953216702) + ((~(freeMemory | 1791615665)) * 865) + (((~((-1066125221) | i)) | (~(i | 1791615665))) * 865))) | (((int) (j6 >> 32)) & ((((~((-537592370) | elapsedRealtime)) | (~(899634041 | elapsedRealtime))) * 69) + 1286631826 + (((~(elapsedRealtime | (-873136698))) | 335544328 | (~(564089713 | elapsedRealtime))) * (-69)) + 1828316736))) != 0) {
                java.lang.Object[] objArr4 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE}, new int[]{0}};
                int elapsedCpuTime = (int) android.os.Process.getElapsedCpuTime();
                int i15 = (((~((-663782186) | elapsedCpuTime)) | (-1072925632)) * (-502)) + 1739004345 + ((~((~elapsedCpuTime) | (-118489858))) * (-502)) + (((~(elapsedCpuTime | (-954435775))) | (-663782186)) * 502);
                int i16 = -(-((i15 & 16) + (i15 | 16)));
                int i17 = (i16 ^ (-1673951376)) + ((i16 & (-1673951376)) << 1);
                int i18 = i17 << 13;
                int i19 = ((~i18) & i17) | ((~i17) & i18);
                int i20 = i19 ^ (i19 >>> 17);
                int i21 = i20 << 5;
                ((int[]) objArr4[1])[0] = (~(i20 & i21)) & (i20 | i21);
                return objArr4;
            }
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "㟧윭셟뜒誗ꯠ庪⾬\ue197ࢩ쾌", "쬗篃ᤧ龍", 662422475 - (~android.graphics.ImageFormat.getBitsPerPixel(0)), objArr5);
            java.lang.Object[] objArr6 = {(java.lang.String) objArr5[0]};
            int i22 = 1590238701;
            java.lang.Object d9 = com.facetec.sdk.al.d(1590238701);
            int i23 = 3;
            if (d9 == null) {
                char absoluteGravity = (char) android.view.Gravity.getAbsoluteGravity(0, 0);
                int absoluteGravity2 = android.view.Gravity.getAbsoluteGravity(0, 0);
                int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
                byte b4 = (byte) 3;
                byte b5 = (byte) (b4 - 3);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                g(b4, b5, b5, objArr7);
                d9 = com.facetec.sdk.al.c(absoluteGravity, 2078 - absoluteGravity2, deadChar + 24, -114923755, false, (java.lang.String) objArr7[0], new java.lang.Class[]{java.lang.String.class});
            }
            java.lang.String str8 = (java.lang.String) ((java.lang.reflect.Method) d9).invoke(null, objArr6);
            if (str8 != null) {
                h = (f + 37) % 128;
                int i24 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int i25 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int i26 = -(android.view.ViewConfiguration.getTouchSlop() >> 8);
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                j(true, (i24 & 7) + (i24 | 7), "\ufffe\ufff9\u0004\ufff7\b\u000b", (i25 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE) + ((i25 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE) << 1), (i26 ^ 5) + ((i26 & 5) << 1), objArr8);
                java.lang.String str9 = (java.lang.String) objArr8[0];
                int i27 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i28 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                j(false, (i27 & 8) + (i27 | 8), "�\u0005\u0002\ufffa￼\uffff\t\ufffe", ((i28 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE) << 1) - (i28 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 8, objArr9);
                java.lang.String[] strArr3 = {str9, (java.lang.String) objArr9[0]};
                int i29 = 0;
                while (i29 < 2) {
                    if (str8.contains(strArr3[i29])) {
                        int i30 = f;
                        h = ((i30 ^ 61) + ((i30 & 61) << 1)) % 128;
                        char touchSlop = (char) (android.view.ViewConfiguration.getTouchSlop() >> 8);
                        int mode = android.view.View.MeasureSpec.getMode(0);
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        i("\u0000\u0000\u0000\u0000", touchSlop, "˯明薉蒃檂팙̟뇄욻礔\uf537蒂\uefae⭩Ѿ\uded9■\u2fe8ꤸ\udeaa㦓᭔饈", "ꓲ撰ྡྷ仡", (((-1570459484) | mode) << 1) - ((-1570459484) ^ mode), objArr10);
                        java.lang.Object[] objArr11 = {(java.lang.String) objArr10[0]};
                        java.lang.Object d10 = com.facetec.sdk.al.d(i22);
                        if (d10 == null) {
                            char alpha = (char) android.graphics.Color.alpha(0);
                            int scrollDefaultDelay = android.view.ViewConfiguration.getScrollDefaultDelay();
                            int size = android.view.View.MeasureSpec.getSize(0);
                            byte b6 = (byte) i23;
                            byte b7 = (byte) (b6 - 3);
                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                            g(b6, b7, b7, objArr12);
                            d10 = com.facetec.sdk.al.c(alpha, (scrollDefaultDelay >> 16) + 2078, 24 - size, -114923755, false, (java.lang.String) objArr12[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        java.lang.Object invoke3 = ((java.lang.reflect.Method) d10).invoke(null, objArr11);
                        int i31 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
                        int i32 = (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int maximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16;
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        j(true, (i31 & 30) + (i31 | 30), "\u0006\ufffe\r\f\u0012\fￇ\r￼\u000e�\b\u000b\tￇ\b\u000b\u000b\ufffe\u000b\u000e\r￼\ufffa\uffff\u000e\u0007\ufffa\u0006ￇ", (i32 ^ 238) + ((i32 & 238) << 1), (maximumFlingVelocity & 17) + (maximumFlingVelocity | 17), objArr13);
                        java.lang.Object[] objArr14 = {(java.lang.String) objArr13[0]};
                        java.lang.Object d11 = com.facetec.sdk.al.d(i22);
                        if (d11 == null) {
                            char resolveSizeAndState = (char) android.view.View.resolveSizeAndState(0, 0, 0);
                            int longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
                            int offsetAfter = android.text.TextUtils.getOffsetAfter("", 0);
                            byte b8 = (byte) 3;
                            byte b9 = (byte) (b8 - 3);
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            g(b8, b9, b9, objArr15);
                            d11 = com.facetec.sdk.al.c(resolveSizeAndState, (longPressTimeout >> 16) + 2078, 24 - offsetAfter, -114923755, false, (java.lang.String) objArr15[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        java.lang.Object invoke4 = ((java.lang.reflect.Method) d11).invoke(null, objArr14);
                        if (invoke3 != null) {
                            int i33 = h + 83;
                            f = i33 % 128;
                            if (i33 % 2 == 0) {
                                java.lang.Object[] objArr16 = {invoke3, 97};
                                java.lang.Object d12 = com.facetec.sdk.al.d(-582857820);
                                if (d12 == null) {
                                    char mirror = (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                    long globalActionKeyTimeout = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
                                    int windowTouchSlop = android.view.ViewConfiguration.getWindowTouchSlop();
                                    byte b10 = (byte) 2;
                                    byte b11 = (byte) (b10 - 2);
                                    j7 = j2;
                                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                                    g(b10, b11, b11, objArr17);
                                    d12 = com.facetec.sdk.al.c(mirror, (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)) + 2364, (windowTouchSlop >> 8) + 24, 2058170716, false, (java.lang.String) objArr17[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                } else {
                                    j7 = j2;
                                }
                                long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) d12).invoke(null, objArr16)).longValue();
                                long j16 = 167464372;
                                int nextInt = new java.util.Random().nextInt();
                                j8 = j;
                                long j17 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
                                long j18 = j16 ^ j4;
                                obj2 = invoke3;
                                long j19 = nextInt;
                                long j20 = j19 ^ j4;
                                long j21 = ((-183) * j16) + (185 * longValue2) + ((((j18 | longValue2) ^ j4) | ((j20 | longValue2) ^ j4)) * j17) + ((-184) * ((((longValue2 ^ j4) | j16) ^ j4) | j19)) + (j17 * ((j18 | j20) ^ j4)) + 991733026;
                                int i34 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                int i35 = ((int) (j21 >> 75)) & (((((~((-22292993) | i34)) | 335609896) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) - 1778461342) + ((~((~i34) | (-22292993))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING));
                                int myPid = android.os.Process.myPid();
                                int i36 = ((int) j21) & ((((~(1522502939 | myPid)) | 1335237946) * 56) + 1501744349 + (((~((~myPid) | 1335237946)) | 1522502939) * 56));
                            } else {
                                j7 = j2;
                                obj2 = invoke3;
                                j8 = j;
                                java.lang.Object[] objArr18 = {obj2, 42};
                                java.lang.Object d13 = com.facetec.sdk.al.d(-582857820);
                                if (d13 == null) {
                                    char lastIndexOf = (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1);
                                    int pressedStateDuration = android.view.ViewConfiguration.getPressedStateDuration();
                                    int offsetBefore = android.text.TextUtils.getOffsetBefore("", 0);
                                    byte b12 = (byte) 2;
                                    byte b13 = (byte) (b12 - 2);
                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                    g(b12, b13, b13, objArr19);
                                    d13 = com.facetec.sdk.al.c(lastIndexOf, 2365 - (pressedStateDuration >> 16), offsetBefore + 24, 2058170716, false, (java.lang.String) objArr19[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                }
                                long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) d13).invoke(null, objArr18)).longValue();
                                long j22 = 50384944;
                                long j23 = longValue3 ^ j4;
                                long myTid = android.os.Process.myTid();
                                long j24 = myTid ^ j4;
                                long j25 = ((-830) * j22) + (832 * longValue3) + ((-831) * (((j23 | j24) ^ j4) | (((j22 | longValue3) | myTid) ^ j4))) + ((-1662) * (((j23 | j22) | myTid) ^ j4)) + (831 * (((longValue3 | myTid) ^ j4) | ((j22 | myTid) ^ j4) | (((j22 ^ j4) | j24) ^ j4))) + 1108812454;
                                int i37 = (int) (j25 >> 32);
                                int myPid2 = android.os.Process.myPid();
                                int i38 = ~myPid2;
                                int i39 = (int) j25;
                                int freeMemory2 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                int i40 = ~freeMemory2;
                            }
                            int i41 = -(-android.text.TextUtils.indexOf(str, str, 0));
                            int i42 = -(android.view.ViewConfiguration.getScrollBarSize() >> 8);
                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                            j(false, ((i41 | 8) << 1) - (i41 ^ 8), "￼\ufffa\ufff7\u0003�\u0011\u000b\ufff9", ((i42 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) << 1) - (i42 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE), 7 - (~android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr20);
                            java.lang.String str10 = (java.lang.String) objArr20[0];
                            int lastIndexOf2 = android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                            char c2 = (char) (((47200 | lastIndexOf2) << 1) - (lastIndexOf2 ^ 47200));
                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                            i("\u0000\u0000\u0000\u0000", c2, "棬潩Ꙧ䏷䏟ᤷ", "俐驊忭\uf7b8", android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr21);
                            java.lang.String str11 = (java.lang.String) objArr21[0];
                            char resolveSizeAndState2 = (char) android.view.View.resolveSizeAndState(0, 0, 0);
                            int i43 = -(android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                            i("\u0000\u0000\u0000\u0000", resolveSizeAndState2, "鍟䒮螉\uf736蔴❼繊", "꣰圄禥싉", (((-1521023832) | i43) << 1) - (i43 ^ (-1521023832)), objArr22);
                            java.lang.String str12 = (java.lang.String) objArr22[0];
                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                            i("\u0000\u0000\u0000\u0000", (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), "\uda3b\ue6baƲ捈\u009f\ue735箁鋾ᖖ", "譐\udc03\u218c疠", android.view.View.MeasureSpec.getSize(0) - 1931738229, objArr23);
                            java.lang.String str13 = (java.lang.String) objArr23[0];
                            int i44 = -android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                            int i45 = -(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                            j(true, (i44 ^ 5) + ((i44 & 5) << 1), "\u0001\u0001\u0004\ufffb\u0004￼", (i45 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) + (i45 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE), 0 - (~(-(android.view.ViewConfiguration.getScrollBarSize() >> 8))), objArr24);
                            java.lang.String str14 = (java.lang.String) objArr24[0];
                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                            i("\u0000\u0000\u0000\u0000", (char) (16855 - (~(-(-(android.os.Process.myPid() >> 22))))), "ᥝ궯ⳗ㝱ꃒ쬭䞍돵侚儈\u0e8b羹菣", "\udfb3狱\ud8c1㵁", (-1049431585) - (~android.os.Process.getGidForName(str)), objArr25);
                            java.lang.String str15 = (java.lang.String) objArr25[0];
                            int edgeSlop = android.view.ViewConfiguration.getEdgeSlop() >> 16;
                            char c3 = (char) ((48763 & edgeSlop) + (edgeSlop | 48763));
                            int gidForName = android.os.Process.getGidForName(str);
                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                            i("\u0000\u0000\u0000\u0000", c3, "풍둴蜄蛓䳨", "ﲮ₉笶达", (908102141 ^ gidForName) + ((gidForName & 908102141) << 1), objArr26);
                            java.lang.String str16 = (java.lang.String) objArr26[0];
                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                            i("\u0000\u0000\u0000\u0000", (char) (android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 49183), "媽꼸舵篃衧築", "誈魰Ṃ\ue9c0", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr27);
                            java.lang.String str17 = (java.lang.String) objArr27[0];
                            java.lang.Object[] objArr28 = new java.lang.Object[1];
                            i("\u0000\u0000\u0000\u0000", (char) (36852 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), "箶朰", "䧠툼\uf4d9ꪏ", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr28);
                            java.lang.String str18 = (java.lang.String) objArr28[0];
                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                            i("\u0000\u0000\u0000\u0000", (char) (android.view.View.MeasureSpec.getMode(0) + 49582), "\ue33a⚺\uee59\ue0aa뢣䳴遲읱\uf75e땲䬐擠켠㾒\uefa3쬛", "ኀ빫꺗菁", android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr29);
                            java.lang.String str19 = (java.lang.String) objArr29[0];
                            int maxKeyCode = android.view.KeyEvent.getMaxKeyCode() >> 16;
                            int d14 = com.facetec.sdk.gh.b.d();
                            int i46 = maxKeyCode * (-963);
                            int i47 = (i46 & (-964)) + (i46 | (-964)) + 9650;
                            int i48 = ~maxKeyCode;
                            int i49 = ~((d14 ^ (-11)) | (d14 & (-11)));
                            int i50 = ((i48 ^ i49) | (i48 & i49)) * (-964);
                            int i51 = ((i47 | i50) << 1) - (i50 ^ i47);
                            int i52 = ~((~d14) | (-11));
                            int i53 = ~(maxKeyCode | (-11));
                            int i54 = ((i53 ^ i52) | (i53 & i52)) * (-964);
                            int i55 = -android.view.KeyEvent.getDeadChar(0, 0);
                            int i56 = -(-android.graphics.ImageFormat.getBitsPerPixel(0));
                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                            j(true, (i51 & i54) + (i54 | i51), "\u000fￋ\u0001\u0004\ufffe\u0011\u0004\f\t\u0000", (i55 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE) + (i55 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE), (i56 ^ 10) + ((i56 & 10) << 1), objArr30);
                            java.lang.String str20 = (java.lang.String) objArr30[0];
                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                            j(true, android.view.MotionEvent.axisFromString(str) + 9, "\uffff\u0002\ufff5\u0006\ufff7\u0003\u0006\u0004", 243 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.view.View.getDefaultSize(0, 0) + 8, objArr31);
                            java.lang.String str21 = (java.lang.String) objArr31[0];
                            long elapsedCpuTime2 = android.os.Process.getElapsedCpuTime();
                            int i57 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int i58 = (i57 * (-391)) - 47190;
                            int d15 = com.facetec.sdk.gh.b.d() | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE;
                            int i59 = ~(i57 | (-243));
                            int i60 = ~d15;
                            int i61 = (i59 | i60) * (-196);
                            int i62 = ((i58 | i61) << 1) - (i58 ^ i61);
                            int i63 = -(-((i57 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE) * my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY));
                            int i64 = ~i57;
                            int i65 = ~((i64 ^ (-243)) | (i64 & (-243)));
                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                            j(true, 13 - (elapsedCpuTime2 > 0L ? 1 : (elapsedCpuTime2 == 0L ? 0 : -1)), "\u0005\ufff9￼\u0005\b\u0006\ufffa\n\ufff9\ufffb\u0002\u0002", (i62 ^ i63) + ((i63 & i62) << 1) + (((i65 & i60) | (i65 ^ i60)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE), android.text.TextUtils.getCapsMode(str, 0, 0) + 6, objArr32);
                            java.lang.String str22 = (java.lang.String) objArr32[0];
                            char minimumFlingVelocity = (char) (46076 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                            int lastIndexOf3 = android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                            java.lang.Object[] objArr33 = new java.lang.Object[1];
                            i("\u0000\u0000\u0000\u0000", minimumFlingVelocity, "聲\udbf3딒샄꩗偼\uf8ac\udf21ⷁ䊓빼₼죇꾲", "㲨峾ﱘ᮳", ((lastIndexOf3 | 1) << 1) - (lastIndexOf3 ^ 1), objArr33);
                            java.lang.String str23 = (java.lang.String) objArr33[0];
                            java.lang.Object[] objArr34 = new java.lang.Object[1];
                            i("\u0000\u0000\u0000\u0000", (char) android.view.KeyEvent.keyCodeFromString(str), "ᩴﴬ洜愥ꚝ\ueb93䆖", "\uefdf\uf7b4◣㏪", (-470305554) - (~(-(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))), objArr34);
                            java.lang.String str24 = (java.lang.String) objArr34[0];
                            java.lang.Object[] objArr35 = new java.lang.Object[1];
                            i("\u0000\u0000\u0000\u0000", (char) (0 - (~(-(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))))), "⠍u蕂䥓\udaa5\uf5f0洉", "ᮒ☶撚妈", (-1859766758) - (~(-(-android.graphics.drawable.Drawable.resolveOpacity(0, 0)))), objArr35);
                            java.lang.String str25 = (java.lang.String) objArr35[0];
                            java.lang.Object[] objArr36 = new java.lang.Object[1];
                            i("\u0000\u0000\u0000\u0000", (char) android.graphics.Color.green(0), "襷\uf5f2㤚正\uf812溻୕", "㥿პ힅ﾐ", android.view.Gravity.getAbsoluteGravity(0, 0) - 2062492103, objArr36);
                            java.lang.String str26 = (java.lang.String) objArr36[0];
                            int i66 = -android.graphics.Color.argb(0, 0, 0, 0);
                            java.lang.Object[] objArr37 = new java.lang.Object[1];
                            i("\u0000\u0000\u0000\u0000", (char) ((i66 ^ 30780) + ((i66 & 30780) << 1)), "渰潆", "ẟ\uf2ad㰨╸", android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr37);
                            java.lang.String str27 = (java.lang.String) objArr37[0];
                            java.lang.Object[] objArr38 = new java.lang.Object[1];
                            i("\u0000\u0000\u0000\u0000", (char) android.view.View.resolveSizeAndState(0, 0, 0), "\u12c7綪뒩甫녁\udd1fꅙ丰ꖐ풢鸓\ue5f3덒蛙⇰웳硻犙흁\ue6ec", "쾚戧\ued72录", android.view.ViewConfiguration.getWindowTouchSlop() >> 8, objArr38);
                            java.lang.String str28 = (java.lang.String) objArr38[0];
                            int i67 = (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int d16 = com.facetec.sdk.gh.b.d();
                            int i68 = ((i67 * 495) - 1417375) + (((i67 ^ (-2876)) | (i67 & (-2876))) * (-988));
                            int i69 = ~i67;
                            int i70 = ~d16;
                            int i71 = -(-(((i69 & 2875) | (i69 ^ 2875) | i70) * 494));
                            int i72 = ~(i69 | (-2876));
                            int i73 = ~((i70 ^ 2875) | (i70 & 2875));
                            int i74 = (i73 ^ i72) | (i73 & i72);
                            int i75 = ~((i67 ^ 2875) | (i67 & 2875));
                            char c4 = (char) ((i68 & i71) + (i68 | i71) + (((i75 ^ i74) | (i75 & i74)) * 494));
                            int i76 = -android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                            java.lang.Object[] objArr39 = new java.lang.Object[1];
                            i("\u0000\u0000\u0000\u0000", c4, "㜗뎇꾹裣ᓿ\udee5", "峈훂㳞̋", (~i76) + (i76 << 1), objArr39);
                            java.lang.String str29 = (java.lang.String) objArr39[0];
                            int i77 = -android.text.TextUtils.indexOf(str, str, 0);
                            int i78 = -android.view.MotionEvent.axisFromString(str);
                            int d17 = com.facetec.sdk.gh.b.d();
                            int i79 = i78 * (-109);
                            int i80 = ~i78;
                            int i81 = ~((d17 ^ 251) | (d17 & 251));
                            int i82 = (((i79 | 27861) << 1) - (i79 ^ 27861)) + (((i80 ^ i81) | (i80 & i81)) * (-220));
                            int i83 = ~(i78 | 251);
                            int i84 = ((i81 ^ i83) | (i81 & i83)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE;
                            int i85 = (i82 & i84) + (i84 | i82);
                            int i86 = ~((i80 ^ 251) | (i80 & 251));
                            int i87 = ~(i78 | (-252));
                            int i88 = ((i87 ^ i86) | (i87 & i86)) * 110;
                            java.lang.Object[] objArr40 = new java.lang.Object[1];
                            j(false, (i77 & 2) + (i77 | 2), "\uffff\u0001", (i85 ^ i88) + ((i88 & i85) << 1), 2 - (~(-(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))), objArr40);
                            java.lang.String str30 = (java.lang.String) objArr40[0];
                            int maxKeyCode2 = android.view.KeyEvent.getMaxKeyCode() >> 16;
                            int d18 = com.facetec.sdk.gh.b.d();
                            int i89 = ~maxKeyCode2;
                            int i90 = ~(48627 | i89);
                            int i91 = ~d18;
                            int i92 = (i91 ^ (-48628)) | ((-48628) & i91);
                            int i93 = ~((i92 ^ maxKeyCode2) | (maxKeyCode2 & i92));
                            int i94 = ~((i89 & (-48628)) | ((-48628) ^ i89));
                            int i95 = ((maxKeyCode2 * (-575)) - 27960525) + (((~(d18 | (-48628))) | i94) * 576) + (((i93 & i90) | (i90 ^ i93)) * 576);
                            int i96 = i94 * 576;
                            java.lang.Object[] objArr41 = new java.lang.Object[1];
                            i("\u0000\u0000\u0000\u0000", (char) ((i95 ^ i96) + ((i95 & i96) << 1)), "塾誙ꋫ\u0b81鏁ㆌ븗ﯡ\u0ee8喋筡啹ὁ❴商㹟", "ꦤ꣯\uf3af\udcbd", android.graphics.Color.red(0), objArr41);
                            java.lang.String str31 = (java.lang.String) objArr41[0];
                            char size2 = (char) android.view.View.MeasureSpec.getSize(0);
                            int jumpTapTimeout = android.view.ViewConfiguration.getJumpTapTimeout() >> 16;
                            java.lang.Object[] objArr42 = new java.lang.Object[1];
                            i("\u0000\u0000\u0000\u0000", size2, "ᨺ췾㽭圡蝛᧴\ua83eꦞ㺷", "ꣾﾀ楖\ud885", (1459585192 ^ jumpTapTimeout) + ((jumpTapTimeout & 1459585192) << 1), objArr42);
                            java.lang.String str32 = (java.lang.String) objArr42[0];
                            int i97 = -(-android.graphics.Color.alpha(0));
                            int edgeSlop2 = android.view.ViewConfiguration.getEdgeSlop();
                            int edgeSlop3 = android.view.ViewConfiguration.getEdgeSlop() >> 16;
                            java.lang.Object[] objArr43 = new java.lang.Object[1];
                            j(true, (i97 & 10) + (i97 | 10), "\u0000\ufffe￼\r\u000f\uffd1\u0003\u000f￼\u000b", 237 - (edgeSlop2 >> 16), ((edgeSlop3 | 5) << 1) - (edgeSlop3 ^ 5), objArr43);
                            java.lang.String str33 = (java.lang.String) objArr43[0];
                            char axisFromString = (char) ((-1) - android.view.MotionEvent.axisFromString(str));
                            int threadPriority = android.os.Process.getThreadPriority(0);
                            int i98 = -((((threadPriority | 20) << 1) - (threadPriority ^ 20)) >> 6);
                            java.lang.Object[] objArr44 = new java.lang.Object[1];
                            i("\u0000\u0000\u0000\u0000", axisFromString, "㣥\udd7d휍욄梆哯뒑蹕섪㉅婸", "蓃餝ှ廭", (1050221956 & i98) + (i98 | 1050221956), objArr44);
                            java.lang.String str34 = (java.lang.String) objArr44[0];
                            java.lang.Object[] objArr45 = new java.lang.Object[1];
                            i("\u0000\u0000\u0000\u0000", (char) (0 - (~(-(-android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask))))), "븠㊩ꁘ佖ٳꊬ옔殎귶∸\uf446", "얩㴯ޡꅋ", android.text.TextUtils.getTrimmedLength(str) - 1589825595, objArr45);
                            java.lang.String str35 = (java.lang.String) objArr45[0];
                            int i99 = -android.text.TextUtils.getTrimmedLength(str);
                            java.lang.Object[] objArr46 = new java.lang.Object[1];
                            i("\u0000\u0000\u0000\u0000", (char) ((51984 ^ i99) + ((i99 & 51984) << 1)), "枲㙻᭱۵省糓鱐倂˥\ue96a綱ͪ巒뤺뀗", "\uddc9䆙Ⴌ峋", (android.os.Process.myPid() >> 22) - 1404986915, objArr46);
                            java.lang.String str36 = (java.lang.String) objArr46[0];
                            int rgb = android.graphics.Color.rgb(0, 0, 0);
                            int resolveSizeAndState3 = android.view.View.resolveSizeAndState(0, 0, 0);
                            java.lang.Object[] objArr47 = new java.lang.Object[1];
                            j(false, (-16777202) - rgb, "\f\u0000\ufff5\u0002\uffff\u0006\b\u0001\n￼\u0001\ufff7\ufff2\u0006", (resolveSizeAndState3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE) + ((resolveSizeAndState3 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE) << 1), 5 - (~(-(-android.view.View.resolveSize(0, 0)))), objArr47);
                            java.lang.String[] strArr4 = {str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, (java.lang.String) objArr47[0]};
                            java.lang.Object[] objArr48 = new java.lang.Object[1];
                            i("\u0000\u0000\u0000\u0000", (char) android.view.KeyEvent.keyCodeFromString(str), "㟧윭셟뜒誗ꯠ庪⾬\ue197ࢩ쾌", "쬗篃ᤧ龍", 662422474 - (~(-android.view.View.resolveSizeAndState(0, 0, 0))), objArr48);
                            java.lang.Object[] objArr49 = {(java.lang.String) objArr48[0]};
                            d2 = com.facetec.sdk.al.d(1590238701);
                            if (d2 == null) {
                                char keyRepeatTimeout = (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                float scrollFriction = android.view.ViewConfiguration.getScrollFriction();
                                int edgeSlop4 = android.view.ViewConfiguration.getEdgeSlop();
                                byte b14 = (byte) 3;
                                byte b15 = (byte) (b14 - 3);
                                java.lang.Object[] objArr50 = new java.lang.Object[1];
                                g(b14, b15, b15, objArr50);
                                d2 = com.facetec.sdk.al.c(keyRepeatTimeout, 2079 - (scrollFriction > 0.0f ? 1 : (scrollFriction == 0.0f ? 0 : -1)), 24 - (edgeSlop4 >> 16), -114923755, false, (java.lang.String) objArr50[0], new java.lang.Class[]{java.lang.String.class});
                            }
                            invoke = ((java.lang.reflect.Method) d2).invoke(null, objArr49);
                            if (invoke != null) {
                                int i100 = -(-(android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                                int i101 = -(-(android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                                int i102 = -(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                java.lang.Object[] objArr51 = new java.lang.Object[1];
                                j(true, 5 - (~i100), "\ufffe\ufff9\u0004\ufff7\b\u000b", ((i101 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE) << 1) - (i101 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE), ((i102 | 6) << 1) - (i102 ^ 6), objArr51);
                                java.lang.String str37 = (java.lang.String) objArr51[0];
                                int i103 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                                int i104 = -android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                int i105 = (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                java.lang.Object[] objArr52 = new java.lang.Object[1];
                                j(false, (i103 & 8) + (i103 | 8), "�\u0005\u0002\ufffa￼\uffff\t\ufffe", (i104 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE) + ((i104 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE) << 1), (i105 & 7) + (i105 | 7), objArr52);
                                java.lang.Object[] objArr53 = {invoke, new java.lang.String[]{str37, (java.lang.String) objArr52[0]}};
                                java.lang.Object d19 = com.facetec.sdk.al.d(-1033567267);
                                if (d19 == null) {
                                    char indexOf = (char) ((-1) - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
                                    int normalizeMetaState2 = android.view.KeyEvent.normalizeMetaState(0);
                                    long globalActionKeyTimeout2 = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
                                    byte b16 = (byte) 2;
                                    byte b17 = (byte) (b16 - 2);
                                    java.lang.Object[] objArr54 = new java.lang.Object[1];
                                    g(b16, b17, b17, objArr54);
                                    d19 = com.facetec.sdk.al.c(indexOf, 662 - normalizeMetaState2, (globalActionKeyTimeout2 > 0L ? 1 : (globalActionKeyTimeout2 == 0L ? 0 : -1)) + 22, 1703573797, false, (java.lang.String) objArr54[0], new java.lang.Class[]{java.lang.String.class, java.lang.String[].class});
                                }
                                long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) d19).invoke(null, objArr53)).longValue();
                                long j26 = -993801897;
                                long j27 = j26 ^ j4;
                                long j28 = longValue4 ^ j4;
                                long maxMemory = (int) java.lang.Runtime.getRuntime().maxMemory();
                                long j29 = (j8 * j26) + (j7 * longValue4) + (((((j27 | j28) | maxMemory) ^ j4) | (((j26 | longValue4) | maxMemory) ^ j4)) * j3) + ((((longValue4 | maxMemory) ^ j4) | ((j27 | longValue4) ^ j4) | ((j27 | maxMemory) ^ j4)) * j5) + (((j28 | j26) ^ j4) * j3) + 1616731155;
                                int i106 = (int) (j29 >> 32);
                                int nextInt2 = new java.util.Random().nextInt();
                                int elapsedRealtime2 = (int) android.os.SystemClock.elapsedRealtime();
                                if (((i106 & ((((((~(3929605 | nextInt2)) | 1438910896) * 576) - 1771464918) + (((~((~nextInt2) | 1442840501)) | 2245120) * 576)) - 116012032)) | (((int) j29) & (((~((~elapsedRealtime2) | (-1328553))) * 130) + 2139769475 + (((~(elapsedRealtime2 | (-1328553))) | 4194305) * 130)))) != 0) {
                                    int i107 = (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                    char c5 = (char) ((~i107) + (i107 << 1));
                                    int i108 = -android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                    java.lang.Object[] objArr55 = new java.lang.Object[1];
                                    i("\u0000\u0000\u0000\u0000", c5, "˯明薉蒃檂팙̟뇄욻礔\uf537蒂\uefae⭩Ѿ\uded9■\u2fe8ꤸ\udeaa㦓᭔饈", "ꓲ撰ྡྷ仡", (((-1570459485) | i108) << 1) - (i108 ^ (-1570459485)), objArr55);
                                    java.lang.Object[] objArr56 = {(java.lang.String) objArr55[0]};
                                    java.lang.Object d20 = com.facetec.sdk.al.d(1590238701);
                                    if (d20 == null) {
                                        char scrollBarSize = (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8);
                                        int indexOf2 = android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                        int normalizeMetaState3 = android.view.KeyEvent.normalizeMetaState(0);
                                        byte b18 = (byte) 3;
                                        byte b19 = (byte) (b18 - 3);
                                        java.lang.Object[] objArr57 = new java.lang.Object[1];
                                        g(b18, b19, b19, objArr57);
                                        d20 = com.facetec.sdk.al.c(scrollBarSize, 2077 - indexOf2, normalizeMetaState3 + 24, -114923755, false, (java.lang.String) objArr57[0], new java.lang.Class[]{java.lang.String.class});
                                    }
                                    java.lang.Object invoke5 = ((java.lang.reflect.Method) d20).invoke(null, objArr56);
                                    double convertQuartSecToDecDegrees = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
                                    int i109 = -android.view.KeyEvent.getDeadChar(0, 0);
                                    int i110 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                    java.lang.Object[] objArr58 = new java.lang.Object[1];
                                    j(true, 30 - (convertQuartSecToDecDegrees > 0.0d ? 1 : (convertQuartSecToDecDegrees == 0.0d ? 0 : -1)), "\u0006\ufffe\r\f\u0012\fￇ\r￼\u000e�\b\u000b\tￇ\b\u000b\u000b\ufffe\u000b\u000e\r￼\ufffa\uffff\u000e\u0007\ufffa\u0006ￇ", 238 - (~i109), ((i110 | 17) << 1) - (i110 ^ 17), objArr58);
                                    java.lang.Object[] objArr59 = {(java.lang.String) objArr58[0]};
                                    java.lang.Object d21 = com.facetec.sdk.al.d(1590238701);
                                    if (d21 == null) {
                                        char red = (char) android.graphics.Color.red(0);
                                        long elapsedCpuTime3 = android.os.Process.getElapsedCpuTime();
                                        int indexOf3 = android.text.TextUtils.indexOf(str, str);
                                        byte b20 = (byte) 3;
                                        byte b21 = (byte) (b20 - 3);
                                        java.lang.Object[] objArr60 = new java.lang.Object[1];
                                        g(b20, b21, b21, objArr60);
                                        d21 = com.facetec.sdk.al.c(red, (elapsedCpuTime3 > 0L ? 1 : (elapsedCpuTime3 == 0L ? 0 : -1)) + 2077, 24 - indexOf3, -114923755, false, (java.lang.String) objArr60[0], new java.lang.Class[]{java.lang.String.class});
                                    }
                                    java.lang.Object invoke6 = ((java.lang.reflect.Method) d21).invoke(null, objArr59);
                                    if (invoke5 != null) {
                                        java.lang.Object[] objArr61 = {invoke5, 42};
                                        java.lang.Object d22 = com.facetec.sdk.al.d(-582857820);
                                        if (d22 == null) {
                                            char rgb2 = (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0));
                                            byte modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                                            int indexOf4 = android.text.TextUtils.indexOf(str, str, 0, 0);
                                            byte b22 = (byte) 2;
                                            byte b23 = (byte) (b22 - 2);
                                            java.lang.Object[] objArr62 = new java.lang.Object[1];
                                            g(b22, b23, b23, objArr62);
                                            d22 = com.facetec.sdk.al.c(rgb2, modifierMetaStateMask + 2366, indexOf4 + 24, 2058170716, false, (java.lang.String) objArr62[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                        }
                                        long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) d22).invoke(null, objArr61)).longValue();
                                        long j30 = 141829400;
                                        long j31 = 449;
                                        long j32 = ((j30 ^ j4) | longValue5) ^ j4;
                                        long j33 = longValue5 ^ j4;
                                        str6 = str;
                                        long elapsedRealtime3 = (int) android.os.SystemClock.elapsedRealtime();
                                        long j34 = (450 * j30) + ((-448) * longValue5) + ((j32 | (((j33 | j30) | elapsedRealtime3) ^ j4)) * j31) + ((-1347) * j32) + (j31 * (j32 | ((((elapsedRealtime3 ^ j4) | j33) | j30) ^ j4))) + 1017367998;
                                        int i111 = ~(1968637016 | android.os.Process.myTid());
                                        int i112 = ((int) (j34 >> 32)) & (((((~((~r2) | 1968637016)) | 11051428) * (-245)) - 1055389794) + (i111 * (-245)) + ((i111 | (-889103869)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE));
                                        int i113 = ((int) j34) & (((((~((-491383329) | r5)) | 406874624) * 305) - 1704616964) + (((~((~((int) java.lang.Runtime.getRuntime().maxMemory())) | (-491383329))) | 945843081) * 305));
                                    } else {
                                        str6 = str;
                                    }
                                    if (invoke6 != null) {
                                        f = (h + 5) % 128;
                                        java.lang.Object[] objArr63 = {invoke6, 42};
                                        java.lang.Object d23 = com.facetec.sdk.al.d(-582857820);
                                        if (d23 == null) {
                                            char c6 = (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(0L);
                                            char mirror2 = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                            byte b24 = (byte) 2;
                                            byte b25 = (byte) (b24 - 2);
                                            java.lang.Object[] objArr64 = new java.lang.Object[1];
                                            g(b24, b25, b25, objArr64);
                                            d23 = com.facetec.sdk.al.c(c6, packedPositionChild + 2366, 'H' - mirror2, 2058170716, false, (java.lang.String) objArr64[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                        }
                                        long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) d23).invoke(null, objArr63)).longValue();
                                        long j35 = -431910758;
                                        int elapsedRealtime4 = (int) android.os.SystemClock.elapsedRealtime();
                                        long j36 = -518;
                                        long j37 = my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE;
                                        long j38 = elapsedRealtime4;
                                        long j39 = (j35 ^ j4) | (j38 ^ j4);
                                        long j40 = (j36 * j35) + (j36 * longValue6) + (((j39 ^ j4) | longValue6) * j37) + ((-519) * (((j39 | longValue6) ^ j4) | (((j35 | longValue6) | j38) ^ j4))) + (j37 * (((longValue6 | j38) ^ j4) | j35)) + 1591108156;
                                        int i114 = ((int) (j40 >> 32)) & (((((-16847113) | r5) * (-381)) - 1981669662) + (((~((~((int) java.lang.Runtime.getRuntime().maxMemory())) | (-1365719903))) | (-159995305)) * 381) + 2123782376);
                                        int elapsedCpuTime4 = (int) android.os.Process.getElapsedCpuTime();
                                        int i115 = ((int) j40) & (((((~((-705029047) | r5)) | (~((-1437603905) | elapsedCpuTime4))) * (-831)) - 1870784514) + ((~((-704651553) | elapsedCpuTime4)) * (-1662)) + (((~(elapsedCpuTime4 | (-2142255457))) | (~((~elapsedCpuTime4) | 2142255456)) | (~(705029046 | elapsedCpuTime4))) * 831));
                                    }
                                    str2 = str6;
                                    f = (h + 41) % 128;
                                    char lastIndexOf4 = (char) (android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1);
                                    int i116 = -android.widget.ExpandableListView.getPackedPositionChild(0L);
                                    java.lang.Object[] objArr65 = new java.lang.Object[1];
                                    i("\u0000\u0000\u0000\u0000", lastIndexOf4, "韹砮౩ܢ\uf47e쓰▅쥂ࡳ骧뇰퓭๐손\ua631疝ᐷ黷䑻걯\u2e5f嚨吂", "쐓哈ᴆⱽ", (106219715 ^ i116) + ((i116 & 106219715) << 1), objArr65);
                                    java.lang.Object[] objArr66 = {(java.lang.String) objArr65[0]};
                                    d3 = com.facetec.sdk.al.d(-864328554);
                                    if (d3 == null) {
                                        char indexOf5 = (char) ((-1) - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
                                        int deadChar2 = android.view.KeyEvent.getDeadChar(0, 0);
                                        int absoluteGravity3 = android.view.Gravity.getAbsoluteGravity(0, 0);
                                        byte b26 = (byte) 0;
                                        byte b27 = b26;
                                        java.lang.Object[] objArr67 = new java.lang.Object[1];
                                        g(b26, b27, b27, objArr67);
                                        d3 = com.facetec.sdk.al.c(indexOf5, deadChar2 + 2341, 24 - absoluteGravity3, 1804869230, false, (java.lang.String) objArr67[0], new java.lang.Class[]{java.lang.String.class});
                                    }
                                    long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, objArr66)).longValue();
                                    long j41 = -697251165;
                                    int maxMemory2 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                    long j42 = com.visa.cbp.getCertUsage.setODAData;
                                    long j43 = j41 ^ j4;
                                    long j44 = com.visa.cbp.getCertUsage.getODAData;
                                    long j45 = maxMemory2;
                                    long j46 = j45 ^ j4;
                                    long j47 = ((-665) * j41) + (j42 * longValue7) + ((-333) * j43) + ((((j43 | j46) ^ j4) | ((longValue7 | j45) ^ j4)) * j44) + (j44 * (((j46 | longValue7) ^ j4) | ((j43 | j45) ^ j4))) + 1745449585;
                                    int freeMemory3 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                    int i117 = ~freeMemory3;
                                    int i118 = ((int) (j47 >> 32)) & ((((~((-1435820667) | i117)) | (~((-1405745) | freeMemory3)) | (~(1405744 | i117))) * 959) + 156141465 + (((~(freeMemory3 | (-1435820667))) | (~(i117 | (-1405745))) | (~(1405744 | freeMemory3))) * 959));
                                    int i119 = ~new java.util.Random().nextInt(1596166097);
                                    int i120 = ((int) j47) & ((((~((-2058401411) | i119)) | 715174530) * (-241)) + 312228214 + (((~(i119 | (-1343226881))) | 84164945) * 241));
                                    j9 = (i118 ^ i120) | (i118 & i120);
                                    int i121 = -(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    int i122 = -android.view.KeyEvent.keyCodeFromString(str2);
                                    int d24 = com.facetec.sdk.gh.b.d();
                                    int i123 = ~i122;
                                    int i124 = ~((i123 ^ (-235)) | (i123 & (-235)));
                                    int i125 = ~d24;
                                    int i126 = (i125 & i122) | (i125 ^ i122);
                                    int i127 = ~((i126 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE) | (i126 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE));
                                    int i128 = -(-(((i124 ^ i127) | (i124 & i127)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE));
                                    int i129 = ~((i125 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE) | (i125 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE));
                                    int i130 = ((((i122 * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE) - 51246) - (~i128)) - 1) + (((i129 & i122) | (i129 ^ i122)) * (-440));
                                    int i131 = i122 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE;
                                    int i132 = ((i131 ^ d24) | (i131 & d24)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE;
                                    int i133 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                    java.lang.Object[] objArr68 = new java.lang.Object[1];
                                    j(true, (i121 & 17) + (i121 | 17), "\n\u0003\u0011ￍ\u0001\r\u0010\u000eￍ\u0011\u0013\u0012\uffff\u0012\u0011ￍ\u0004", ((i130 | i132) << 1) - (i132 ^ i130), ((i133 | 9) << 1) - (i133 ^ 9), objArr68);
                                    java.lang.Object[] objArr69 = {(java.lang.String) objArr68[0]};
                                    d4 = com.facetec.sdk.al.d(-864328554);
                                    if (d4 == null) {
                                        char c7 = (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                                        int scrollBarSize2 = android.view.ViewConfiguration.getScrollBarSize();
                                        int threadPriority2 = android.os.Process.getThreadPriority(0);
                                        byte b28 = (byte) 0;
                                        byte b29 = b28;
                                        java.lang.Object[] objArr70 = new java.lang.Object[1];
                                        g(b28, b29, b29, objArr70);
                                        d4 = com.facetec.sdk.al.c(c7, 2341 - (scrollBarSize2 >> 8), 24 - ((threadPriority2 + 20) >> 6), 1804869230, false, (java.lang.String) objArr70[0], new java.lang.Class[]{java.lang.String.class});
                                    }
                                    long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr69)).longValue();
                                    long j48 = -224748211;
                                    long j49 = j48 ^ j4;
                                    long j50 = longValue8 ^ j4;
                                    java.lang.String str38 = str2;
                                    long myUid = android.os.Process.myUid();
                                    long j51 = 490;
                                    long j52 = (491 * j48) + ((-489) * longValue8) + ((-490) * (j49 | j50 | (myUid ^ j4))) + ((((myUid | j50) ^ j4) | ((j48 | j50) ^ j4)) * j51) + (j51 * j49) + 1272946631;
                                    int freeMemory4 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                    int i134 = ((int) (j52 >> 32)) & (((~((-73405570) | freeMemory4)) * (-301)) + 470469780 + (((~(82056385 | freeMemory4)) | (~((~freeMemory4) | 1519282796))) * (-301)) + (((~(freeMemory4 | (-1519282797))) | 82056385) * 301));
                                    int i135 = ~((int) android.os.SystemClock.uptimeMillis());
                                    int i136 = ((int) j52) & ((((~((-85197074) | i135)) | (~(2143268731 | i135))) * (-184)) + 1019428157 + (((~(i135 | (-395619698))) | (~(1832846107 | i135)) | 310422624) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 555124760);
                                    long j53 = (i134 ^ i136) | (i134 & i136);
                                    if (j9 > 0 && j53 > 0 && j53 - 3 < j9) {
                                        int d25 = com.facetec.sdk.gh.b.d();
                                        int i137 = -(-(((~((987755725 ^ d25) | (987755725 & d25))) | 501473449) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
                                        i11 = (((-120136431) | i137) << 1) - (i137 ^ (-120136431));
                                        int i138 = ~d25;
                                        int i139 = ~((i138 ^ 987755725) | (987755725 & i138));
                                        i12 = -(-(((i139 ^ 85983264) | (85983264 & i139)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
                                        int d26 = com.facetec.sdk.gh.b.d();
                                        int i140 = ~d26;
                                        int i141 = ~((170535141 ^ i140) | (170535141 & i140));
                                        int i142 = ~(((-2024781946) & d26) | ((-2024781946) ^ d26));
                                        int i143 = 814224485 - (~(-(-(((i141 ^ i142) | (i141 & i142)) * 1150))));
                                        int i144 = ~((2024781945 & i140) | (2024781945 ^ i140));
                                        int i145 = -(-(((i144 ^ i142) | (i142 & i144)) * (-575)));
                                        i13 = (i143 & i145) + (i145 | i143);
                                        int i146 = ~((d26 ^ 170535141) | (170535141 & d26));
                                        int i147 = ~((i140 ^ (-170535142)) | ((-170535142) & i140));
                                        i14 = -(-(((i146 ^ i147) | (i146 & i147)) * 575));
                                        if ((i11 & i12) + (i12 | i11) <= (i13 & i14) + (i14 | i13)) {
                                            java.lang.Object[] objArr71 = {null, new int[1], new int[]{247}, new int[]{0}};
                                            int i148 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                            int i149 = ~i148;
                                            int i150 = (((~((-1273829533) | i149)) | 1265174676) * 98) + 1032139146 + (((~(i149 | (-344388428))) | (-1273829533) | (~(344388427 | i148))) * (-49)) + (((~(i148 | (-1273829533))) | (-1609563104)) * 49);
                                            int i151 = ((i150 | 16) << 1) - (i150 ^ 16);
                                            int i152 = (i151 ^ (-1673951376)) + ((i151 & (-1673951376)) << 1);
                                            int i153 = i152 << 13;
                                            int i154 = ((~i153) & i152) | ((~i152) & i153);
                                            int i155 = i154 >>> 17;
                                            int i156 = (i154 & (~i155)) | ((~i154) & i155);
                                            ((int[]) objArr71[1])[0] = i156 ^ (i156 << 5);
                                            return objArr71;
                                        }
                                    }
                                    java.lang.Object[] objArr72 = new java.lang.Object[1];
                                    i("\u0000\u0000\u0000\u0000", (char) ((-1) - android.text.TextUtils.lastIndexOf(str38, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), "韹砮౩ܢ\uf47e쓰▅쥂ࡳ骧뇰퓭๐손\ua631疝ᐷ黷䑻걯\u2e5f嚨吂", "쐓哈ᴆⱽ", 106219716 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr72);
                                    java.lang.Object[] objArr73 = {(java.lang.String) objArr72[0]};
                                    d5 = com.facetec.sdk.al.d(-864328554);
                                    if (d5 == null) {
                                        char gidForName2 = (char) ((-1) - android.os.Process.getGidForName(str38));
                                        byte modifierMetaStateMask2 = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                                        int keyCodeFromString = android.view.KeyEvent.keyCodeFromString(str38);
                                        byte b30 = (byte) 0;
                                        byte b31 = b30;
                                        java.lang.Object[] objArr74 = new java.lang.Object[1];
                                        g(b30, b31, b31, objArr74);
                                        d5 = com.facetec.sdk.al.c(gidForName2, 2340 - modifierMetaStateMask2, keyCodeFromString + 24, 1804869230, false, (java.lang.String) objArr74[0], new java.lang.Class[]{java.lang.String.class});
                                    }
                                    long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, objArr73)).longValue();
                                    long j54 = -132561095;
                                    long j55 = -948;
                                    long j56 = j54 ^ j4;
                                    long j57 = longValue9 ^ j4;
                                    long elapsedCpuTime5 = (int) android.os.Process.getElapsedCpuTime();
                                    long j58 = ((-947) * j54) + (949 * longValue9) + ((((j57 | elapsedCpuTime5) ^ j4) | j56) * j55) + (j55 * (((elapsedCpuTime5 ^ j4) | (j56 | j57)) ^ j4)) + (948 * (j57 | j54)) + 1180759515;
                                    int i157 = ((int) (j58 >> 32)) & (((((~((-380891117) | r2)) | (-1056335295)) * (-983)) - 194158557) + (((~((~android.os.Process.myPid()) | (-1056335295))) | 675545106) * 983));
                                    int maxMemory3 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                    int i158 = ((int) j58) & (((((~((-845288035) | maxMemory3)) | (~((~maxMemory3) | 2012452851))) * (-318)) - 1768149325) + (((~(862130930 | maxMemory3)) | 1150321921) * (-318)) + (((~(maxMemory3 | (-862130931))) | (-1995609956)) * 318));
                                    j10 = (i157 ^ i158) | (i157 & i158);
                                    java.lang.Object[] objArr75 = new java.lang.Object[1];
                                    i("\u0000\u0000\u0000\u0000", (char) (25977 - (~(-(-(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))))), "똖廽㹰쟠", "呜䗨稵㡥", android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr75);
                                    java.lang.Object[] objArr76 = {(java.lang.String) objArr75[0]};
                                    d6 = com.facetec.sdk.al.d(-864328554);
                                    if (d6 == null) {
                                        char resolveSizeAndState4 = (char) android.view.View.resolveSizeAndState(0, 0, 0);
                                        int tapTimeout = android.view.ViewConfiguration.getTapTimeout();
                                        int edgeSlop5 = android.view.ViewConfiguration.getEdgeSlop();
                                        byte b32 = (byte) 0;
                                        byte b33 = b32;
                                        java.lang.Object[] objArr77 = new java.lang.Object[1];
                                        g(b32, b33, b33, objArr77);
                                        d6 = com.facetec.sdk.al.c(resolveSizeAndState4, (tapTimeout >> 16) + 2341, (edgeSlop5 >> 16) + 24, 1804869230, false, (java.lang.String) objArr77[0], new java.lang.Class[]{java.lang.String.class});
                                    }
                                    long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) d6).invoke(null, objArr76)).longValue();
                                    long j59 = -309522901;
                                    long j60 = 130;
                                    long j61 = longValue10 ^ j4;
                                    long uptimeMillis3 = (int) android.os.SystemClock.uptimeMillis();
                                    long j62 = j61 | j59;
                                    long j63 = ((-129) * j59) + (131 * longValue10) + ((((j61 | (uptimeMillis3 ^ j4)) | j59) ^ j4) * j60) + ((-260) * (j62 ^ j4)) + (j60 * ((((j59 ^ j4) | longValue10) ^ j4) | ((j62 | uptimeMillis3) ^ j4))) + 1357721321;
                                    int uptimeMillis4 = (int) android.os.SystemClock.uptimeMillis();
                                    int myUid2 = android.os.Process.myUid();
                                    long j64 = (((int) (j63 >> 32)) & ((((~((-775235488) | uptimeMillis4)) | 134218132) * (-566)) + 95277794 + ((~(uptimeMillis4 | (-641017356))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST))) | ((((((~(139570376 | myUid2)) | (-1297722602)) * 336) - 501357939) + (((~((-1297656034) | myUid2)) | 139503808) * (-168)) + (((~((~myUid2) | (-1297656034))) | 139570376) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)) & ((int) j63));
                                    if (j10 > 0) {
                                        int i159 = h;
                                        f = ((i159 ^ 75) + ((i159 & 75) << 1)) % 128;
                                        if (j64 > 0 && j64 + 100 < j10) {
                                            java.lang.Object[] objArr78 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, new int[]{0}};
                                            int i160 = ~((int) android.os.Process.getElapsedCpuTime());
                                            int i161 = (((~(r2 | 734284200)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) - 641315713) + (((-338395672) | i160) * (-216)) + (((~(i160 | 734284200)) | 883933759) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
                                            int i162 = ((i161 ^ 16) + ((i161 & 16) << 1)) - 1673951376;
                                            int i163 = (i162 << 13) ^ i162;
                                            int i164 = i163 ^ (i163 >>> 17);
                                            int i165 = i164 << 5;
                                            ((int[]) objArr78[1])[0] = (i164 & (~i165)) | ((~i164) & i165);
                                            return objArr78;
                                        }
                                    }
                                    char minimumFlingVelocity2 = (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                    str3 = str38;
                                    int i166 = -android.text.TextUtils.getOffsetBefore(str3, 0);
                                    java.lang.Object[] objArr79 = new java.lang.Object[1];
                                    i("\u0000\u0000\u0000\u0000", minimumFlingVelocity2, "\ue724㋨鳸ᮈ⬣컗︮", "Ἔ舲″儧", (864170527 & i166) + (i166 | 864170527), objArr79);
                                    java.lang.String str39 = (java.lang.String) objArr79[0];
                                    java.lang.Object[] objArr80 = new java.lang.Object[1];
                                    i("\u0000\u0000\u0000\u0000", (char) android.view.KeyEvent.normalizeMetaState(0), "齻긟话柬\udea9蘛⌌㞃㘂\uf63e㥕", "䟆쬷\u20ff敋", (-3459258) - (~(-android.graphics.Color.blue(0))), objArr80);
                                    java.lang.String str40 = (java.lang.String) objArr80[0];
                                    int indexOf6 = android.text.TextUtils.indexOf(str3, str3, 0);
                                    int i167 = -(-(android.os.Process.myTid() >> 22));
                                    int lastIndexOf5 = android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                    int d27 = com.facetec.sdk.gh.b.d();
                                    int i168 = (lastIndexOf5 * com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd) - 4935;
                                    int i169 = ~d27;
                                    int i170 = i169 | (-6);
                                    int i171 = (lastIndexOf5 ^ 5) | (lastIndexOf5 & 5);
                                    int i172 = ((~((i170 ^ lastIndexOf5) | (i170 & lastIndexOf5))) | (~((i171 & d27) | (i171 ^ d27)))) * 988;
                                    int i173 = ((i168 | i172) << 1) - (i168 ^ i172);
                                    int i174 = -(-(((lastIndexOf5 ^ (-6)) | (lastIndexOf5 & (-6))) * (-988)));
                                    int i175 = (i173 & i174) + (i174 | i173);
                                    int i176 = ~lastIndexOf5;
                                    int i177 = ~((i176 ^ (-6)) | (i176 & (-6)));
                                    int i178 = ~((d27 ^ (-6)) | (d27 & (-6)));
                                    int i179 = (i178 ^ i177) | (i178 & i177);
                                    int i180 = ~(lastIndexOf5 | i169 | 5);
                                    int i181 = -(-(((i179 ^ i180) | (i179 & i180)) * 988));
                                    java.lang.Object[] objArr81 = new java.lang.Object[1];
                                    j(true, 12 - indexOf6, "\u0010\u0016\u0010ￌ\u000b\u0006\uffff\u0010ￌ\n\u0002\u0011", (i167 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE) + (i167 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE), ((i175 | i181) << 1) - (i181 ^ i175), objArr81);
                                    java.lang.String str41 = (java.lang.String) objArr81[0];
                                    java.lang.Object[] objArr82 = new java.lang.Object[1];
                                    i("\u0000\u0000\u0000\u0000", (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), "ꇌᯔ௬秃⼻잱贑驝뷡\uf2be⌎옶", "嶏\ue6a0㗦햓", android.view.ViewConfiguration.getLongPressTimeout() >> 16, objArr82);
                                    java.lang.String str42 = (java.lang.String) objArr82[0];
                                    int maxKeyCode3 = android.view.KeyEvent.getMaxKeyCode();
                                    int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay() >> 16;
                                    java.lang.Object[] objArr83 = new java.lang.Object[1];
                                    j(false, (maxKeyCode3 >> 16) + 11, "ￏ\u0002\t\u000eￏ\u0016\u0005\u000e\u0004\u000f\u0012", (keyRepeatDelay & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE) + (keyRepeatDelay | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 4, objArr83);
                                    java.lang.String str43 = (java.lang.String) objArr83[0];
                                    char c8 = (char) (19121 - (~(-android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0))));
                                    int i182 = -(-android.graphics.Color.green(0));
                                    java.lang.Object[] objArr84 = new java.lang.Object[1];
                                    i("\u0000\u0000\u0000\u0000", c8, "꾺\udc42ᕩ竱མ", "怼ḡ뎓텊", ((-1826741920) & i182) + (i182 | (-1826741920)), objArr84);
                                    java.lang.String str44 = (java.lang.String) objArr84[0];
                                    int i183 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                    int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration();
                                    int i184 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                    java.lang.Object[] objArr85 = new java.lang.Object[1];
                                    j(true, ((i183 | 4) << 1) - (i183 ^ 4), "\t\u001a\u000bￕ", (scrollBarFadeDuration >> 16) + 226, ((i184 | 4) << 1) - (i184 ^ 4), objArr85);
                                    strArr = new java.lang.String[]{str39, str40, str41, str42, str43, str44, (java.lang.String) objArr85[0]};
                                    i2 = 0;
                                    while (true) {
                                        if (i2 < 7) {
                                            str4 = str3;
                                            i3 = 0;
                                            break;
                                        }
                                        java.lang.Object[] objArr86 = {strArr[i2]};
                                        java.lang.Object d28 = com.facetec.sdk.al.d(493527529);
                                        if (d28 == null) {
                                            char scrollDefaultDelay2 = (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                                            int absoluteGravity4 = android.view.Gravity.getAbsoluteGravity(0, 0);
                                            int windowTouchSlop2 = android.view.ViewConfiguration.getWindowTouchSlop();
                                            byte b34 = (byte) 2;
                                            byte b35 = (byte) (b34 - 2);
                                            java.lang.Object[] objArr87 = new java.lang.Object[1];
                                            g(b34, b35, b35, objArr87);
                                            d28 = com.facetec.sdk.al.c(scrollDefaultDelay2, absoluteGravity4 + 1012, 24 - (windowTouchSlop2 >> 8), -1165632751, false, (java.lang.String) objArr87[0], new java.lang.Class[]{java.lang.String.class});
                                        }
                                        long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) d28).invoke(null, objArr86)).longValue();
                                        long j65 = -376879825;
                                        long j66 = j65 ^ j4;
                                        str4 = str3;
                                        strArr2 = strArr;
                                        long maxMemory4 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                        long j67 = maxMemory4 ^ j4;
                                        long j68 = (((((302 * j65) + (603 * longValue11)) + ((-602) * (((j66 | j67) ^ j4) | longValue11))) + ((-301) * ((((j66 | maxMemory4) ^ j4) | ((j66 | (longValue11 ^ j4)) ^ j4)) | (((j65 | j67) | longValue11) ^ j4)))) + (301 * ((j67 | longValue11) ^ j4))) - 1637718216;
                                        int maxMemory5 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                        int uptimeMillis5 = (int) android.os.SystemClock.uptimeMillis();
                                        int i185 = ~(534599113 | uptimeMillis5);
                                        if (((((int) (j68 >> 32)) & (((((~(1767200751 | maxMemory5)) | (~((~maxMemory5) | (-1090540134)))) * (-318)) - 280708330) + (((~((-1230329584) | maxMemory5)) | 139789450) * (-318)) + (((~(maxMemory5 | 1230329583)) | 1627411301) * 318))) | (((((-2145386492) | i185) * (-814)) + 2111655883 + ((i185 | (~((~uptimeMillis5) | 1971825523)) | 361038145) * 407) + (((~(uptimeMillis5 | (-534599114))) | 361038145 | (~((-1971825524) | uptimeMillis5))) * 407)) & ((int) j68))) != 0) {
                                            i3 = (i2 & 90) + (i2 | 90);
                                            break;
                                        }
                                        int i186 = (i2 ^ 87) + ((i2 & 87) << 1);
                                        i2 = (i186 ^ (-86)) + ((i186 & (-86)) << 1);
                                        str3 = str4;
                                        strArr = strArr2;
                                    }
                                    if (i3 == 0) {
                                        java.lang.Object[] objArr88 = {null, new int[1], new int[]{i3}, new int[]{0}};
                                        int myUid3 = android.os.Process.myUid();
                                        int i187 = ((((~(1070038034 | myUid3)) | 2655173) * (-140)) - 552111303) + ((~(1072693207 | myUid3)) * 70) + (((~(myUid3 | 548179925)) | 527168455) * 70);
                                        int i188 = ((i187 | 16) << 1) - (i187 ^ 16);
                                        int d29 = com.facetec.sdk.gh.b.d();
                                        int i189 = i188 * (-830);
                                        int i190 = (((-1158140928) | i189) << 1) - ((-1158140928) ^ i189);
                                        int i191 = ~d29;
                                        int i192 = ~((1673951375 ^ i191) | (1673951375 & i191));
                                        int i193 = ~((i188 ^ (-1673951376)) | (i188 & (-1673951376)) | d29);
                                        int i194 = -(-(((i192 ^ i193) | (i192 & i193)) * (-831)));
                                        int i195 = ((i190 | i194) << 1) - (i194 ^ i190);
                                        int i196 = -(-((~((1673951375 & i188) | (1673951375 ^ i188) | d29)) * (-1662)));
                                        int i197 = (i195 & i196) + (i196 | i195);
                                        int i198 = ~i188;
                                        int i199 = ~((i191 ^ i198) | (i191 & i198));
                                        int i200 = ~((i188 ^ d29) | (i188 & d29));
                                        int i201 = (i200 ^ i199) | (i200 & i199);
                                        int i202 = ~(d29 | (-1673951376));
                                        int i203 = -(-(((i201 ^ i202) | (i201 & i202)) * 831));
                                        int i204 = (i197 ^ i203) + ((i203 & i197) << 1);
                                        int i205 = i204 << 13;
                                        int i206 = (~(i205 & i204)) & (i205 | i204);
                                        int i207 = i206 >>> 17;
                                        int i208 = (~(i206 & i207)) & (i206 | i207);
                                        int i209 = i208 << 5;
                                        ((int[]) objArr88[1])[0] = (~(i208 & i209)) & (i208 | i209);
                                        return objArr88;
                                    }
                                    try {
                                        int windowTouchSlop3 = android.view.ViewConfiguration.getWindowTouchSlop() >> 8;
                                        int i210 = -(-android.view.View.resolveSizeAndState(0, 0, 0));
                                        str5 = str4;
                                        try {
                                            int i211 = -android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                            int d30 = com.facetec.sdk.gh.b.d();
                                            int i212 = (i211 * 495) - 493;
                                            int i213 = ((i211 ^ (-2)) | (i211 & (-2))) * (-988);
                                            int i214 = ~i211;
                                            int i215 = i214 | 1;
                                            int i216 = ~d30;
                                            int i217 = (i212 ^ i213) + ((i212 & i213) << 1) + (((i215 & i216) | (i215 ^ i216)) * 494);
                                            int i218 = ~((i214 & (-2)) | (i214 ^ (-2)));
                                            int i219 = ~((i216 ^ 1) | (i216 & 1));
                                            int i220 = ((~((i211 ^ 1) | (i211 & 1))) | (i219 ^ i218) | (i219 & i218)) * 494;
                                            java.lang.Object[] objArr89 = new java.lang.Object[1];
                                            j(true, (windowTouchSlop3 & 13) + (windowTouchSlop3 | 13), "\f\u000f\u0011\u0010\f\u0005ￋ\u0001\t\u0006\u0012\uffffￋ", (i210 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE) + (i210 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE), ((i217 | i220) << 1) - (i220 ^ i217), objArr89);
                                            try {
                                                java.lang.Object[] objArr90 = {(java.lang.String) objArr89[0]};
                                                java.lang.Object d31 = com.facetec.sdk.al.d(1590238701);
                                                if (d31 == null) {
                                                    try {
                                                        char c9 = (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                        long packedPositionForGroup = android.widget.ExpandableListView.getPackedPositionForGroup(0);
                                                        float minVolume2 = android.media.AudioTrack.getMinVolume();
                                                        byte b36 = (byte) 3;
                                                        byte b37 = (byte) (b36 - 3);
                                                        java.lang.Object[] objArr91 = new java.lang.Object[1];
                                                        g(b36, b37, b37, objArr91);
                                                        d31 = com.facetec.sdk.al.c(c9, (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)) + 2078, 24 - (minVolume2 > 0.0f ? 1 : (minVolume2 == 0.0f ? 0 : -1)), -114923755, false, (java.lang.String) objArr91[0], new java.lang.Class[]{java.lang.String.class});
                                                    } catch (java.lang.Throwable th6) {
                                                        th3 = th6;
                                                        java.lang.Throwable cause2 = th3.getCause();
                                                        if (cause2 != null) {
                                                            throw cause2;
                                                        }
                                                        throw th3;
                                                    }
                                                }
                                                invoke2 = ((java.lang.reflect.Method) d31).invoke(null, objArr90);
                                            } catch (java.lang.Throwable th7) {
                                                th3 = th7;
                                            }
                                        } catch (java.lang.Exception unused) {
                                            str4 = str5;
                                        }
                                    } catch (java.lang.Exception unused2) {
                                    }
                                    try {
                                        if (invoke2 != null) {
                                            int i221 = -(-(android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                            java.lang.Object[] objArr92 = new java.lang.Object[1];
                                            j(false, (i221 ^ 11) + ((i221 & 11) << 1), "\u0005�\ufffb\u0004\u0003\u0005\ufffa\ufff9\u000f\ufff7\u0004", 240 - (~(-(-(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))))), 7 - (~(-(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))), objArr92);
                                            try {
                                                java.lang.Object[] objArr93 = {invoke2, new java.lang.String[]{(java.lang.String) objArr92[0]}};
                                                java.lang.Object d32 = com.facetec.sdk.al.d(-1033567267);
                                                if (d32 == null) {
                                                    try {
                                                        char threadPriority3 = (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6);
                                                        long currentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
                                                        int longPressTimeout2 = android.view.ViewConfiguration.getLongPressTimeout();
                                                        byte b38 = (byte) 2;
                                                        byte b39 = (byte) (b38 - 2);
                                                        java.lang.Object[] objArr94 = new java.lang.Object[1];
                                                        g(b38, b39, b39, objArr94);
                                                        d32 = com.facetec.sdk.al.c(threadPriority3, (currentThreadTimeMillis > (-1L) ? 1 : (currentThreadTimeMillis == (-1L) ? 0 : -1)) + 661, 23 - (longPressTimeout2 >> 16), 1703573797, false, (java.lang.String) objArr94[0], new java.lang.Class[]{java.lang.String.class, java.lang.String[].class});
                                                    } catch (java.lang.Throwable th8) {
                                                        th4 = th8;
                                                        java.lang.Throwable cause3 = th4.getCause();
                                                        if (cause3 != null) {
                                                            throw cause3;
                                                        }
                                                        throw th4;
                                                    }
                                                }
                                                long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) d32).invoke(null, objArr93)).longValue();
                                                long j69 = -432244657;
                                                long j70 = j69 ^ j4;
                                                str4 = str5;
                                                long maxMemory6 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                                long j71 = (303 * j69) + ((-301) * longValue12) + ((-302) * (((((maxMemory6 ^ j4) | j70) | longValue12) ^ j4) | (((j69 | longValue12) | maxMemory6) ^ j4))) + ((-604) * (((j70 | longValue12) | maxMemory6) ^ j4)) + (302 * ((((longValue12 ^ j4) | j69) ^ j4) | ((maxMemory6 | longValue12) ^ j4))) + 1055173915;
                                                int i222 = (int) (j71 >> 32);
                                                int myUid4 = android.os.Process.myUid();
                                                int i223 = i222 & (((((~(1471118654 | myUid4)) | (~((-16797705) | r3))) * 497) - 901259439) + (((~(myUid4 | (-16797705))) | (~((~myUid4) | 1403419934)) | 67698720) * 497));
                                                int i224 = (int) j71;
                                                int i225 = i224 & (((((~((-75887678) | r3)) | 1513114087) * (-983)) - 1500265898) + (((~((~((int) android.os.Process.getElapsedCpuTime())) | 1513114087)) | (-1588985344)) * 983));
                                                if (((i223 ^ i225) | (i223 & i225)) == 0) {
                                                    int i226 = f;
                                                    h = ((i226 ^ 63) + ((i226 & 63) << 1)) % 128;
                                                    i4 = 0;
                                                    if (i4 != 0) {
                                                        java.lang.Object[] objArr95 = {null, new int[1], new int[]{i4}, new int[]{0}};
                                                        int i227 = ~((int) java.lang.Runtime.getRuntime().maxMemory());
                                                        int i228 = (((~(r2 | 773031177)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) - 1082490833) + (((-274727639) | i227) * (-216)) + (((~(i227 | 773031177)) | 845186782) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
                                                        int i229 = (i228 & 16) + (i228 | 16);
                                                        int i230 = (i229 & (-1673951376)) + ((-1673951376) | i229);
                                                        int i231 = i230 << 13;
                                                        int i232 = ((~i231) & i230) | ((~i230) & i231);
                                                        int i233 = i232 >>> 17;
                                                        int i234 = (i232 & (~i233)) | ((~i232) & i233);
                                                        int i235 = i234 << 5;
                                                        ((int[]) objArr95[1])[0] = (i234 & (~i235)) | ((~i234) & i235);
                                                        return objArr95;
                                                    }
                                                    int i236 = -(-(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                                    int deadChar3 = android.view.KeyEvent.getDeadChar(0, 0);
                                                    int tapTimeout2 = android.view.ViewConfiguration.getTapTimeout() >> 16;
                                                    java.lang.Object[] objArr96 = new java.lang.Object[1];
                                                    j(true, 12 - (~i236), "\f\u000f\u0011\u0010\f\u0005ￋ\u0001\t\u0006\u0012\uffffￋ", 235 - deadChar3, (tapTimeout2 & 2) + (tapTimeout2 | 2), objArr96);
                                                    java.lang.Object[] objArr97 = {(java.lang.String) objArr96[0]};
                                                    java.lang.Object d33 = com.facetec.sdk.al.d(1590238701);
                                                    if (d33 == null) {
                                                        char bitsPerPixel = (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0));
                                                        int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength();
                                                        int mode2 = android.view.View.MeasureSpec.getMode(0);
                                                        byte b40 = (byte) 3;
                                                        byte b41 = (byte) (b40 - 3);
                                                        java.lang.Object[] objArr98 = new java.lang.Object[1];
                                                        g(b40, b41, b41, objArr98);
                                                        d33 = com.facetec.sdk.al.c(bitsPerPixel, (fadingEdgeLength >> 16) + 2078, 24 - mode2, -114923755, false, (java.lang.String) objArr98[0], new java.lang.Class[]{java.lang.String.class});
                                                    }
                                                    java.lang.Object invoke7 = ((java.lang.reflect.Method) d33).invoke(null, objArr97);
                                                    java.lang.String str45 = str4;
                                                    if (invoke7 != null) {
                                                        int indexOf7 = android.text.TextUtils.indexOf(str45, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                        int longPressTimeout3 = android.view.ViewConfiguration.getLongPressTimeout() >> 16;
                                                        java.lang.Object[] objArr99 = new java.lang.Object[1];
                                                        j(false, indexOf7 + 12, "\u0005�\ufffb\u0004\u0003\u0005\ufffa\ufff9\u000f\ufff7\u0004", (longPressTimeout3 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE) + (longPressTimeout3 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE), 54 - (~(-android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask))), objArr99);
                                                        java.lang.Object[] objArr100 = {invoke7, new java.lang.String[]{(java.lang.String) objArr99[0]}};
                                                        java.lang.Object d34 = com.facetec.sdk.al.d(-1033567267);
                                                        if (d34 == null) {
                                                            char axisFromString2 = (char) (android.view.MotionEvent.axisFromString(str45) + 1);
                                                            int gidForName3 = android.os.Process.getGidForName(str45);
                                                            float complexToFloat = android.util.TypedValue.complexToFloat(0);
                                                            byte b42 = (byte) 2;
                                                            byte b43 = (byte) (b42 - 2);
                                                            java.lang.Object[] objArr101 = new java.lang.Object[1];
                                                            g(b42, b43, b43, objArr101);
                                                            d34 = com.facetec.sdk.al.c(axisFromString2, 661 - gidForName3, (complexToFloat > 0.0f ? 1 : (complexToFloat == 0.0f ? 0 : -1)) + 23, 1703573797, false, (java.lang.String) objArr101[0], new java.lang.Class[]{java.lang.String.class, java.lang.String[].class});
                                                        }
                                                        long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) d34).invoke(null, objArr100)).longValue();
                                                        long j72 = 374745275;
                                                        long j73 = ((j72 ^ j4) | longValue13) ^ j4;
                                                        long j74 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                                        long j75 = (71 * j72) + (j5 * longValue13) + ((-140) * (j73 | ((longValue13 | j74) ^ j4))) + ((((j72 | longValue13) | j74) ^ j4) * j8) + (((((longValue13 ^ j4) | j72) ^ j4) | j73 | ((j72 | j74) ^ j4)) * j8) + 248183983;
                                                        int i237 = ~(((int) android.os.Process.getElapsedCpuTime()) | 2059451580);
                                                        int i238 = ((int) (j75 >> 32)) & (((((622225169 | i237) * (-220)) + 68925486) + ((i237 | 85345025) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)) - 777151684);
                                                        int nextInt3 = new java.util.Random().nextInt();
                                                        int i239 = ((int) j75) & (((((~((-1798933655) | r5)) | (~(2134744511 | nextInt3))) * (-831)) - 572492226) + ((~((-1075937281) | nextInt3)) * (-1662)) + (((~(nextInt3 | 1058807231)) | (~((~nextInt3) | (-1058807232))) | (~(1798933654 | nextInt3))) * 831));
                                                        if (((i238 ^ i239) | (i238 & i239)) != 1) {
                                                            java.lang.Object[] objArr102 = new java.lang.Object[1];
                                                            i("\u0000\u0000\u0000\u0000", (char) android.graphics.Color.green(0), "፬踲솟烲꺚翫\uf7fcꟳ쥽\udd44㯪\udd1c", "쾠\ue9c8焛\uf7f6", android.view.ViewConfiguration.getScrollDefaultDelay() >> 16, objArr102);
                                                            java.lang.String str46 = (java.lang.String) objArr102[0];
                                                            java.lang.Object[] objArr103 = new java.lang.Object[1];
                                                            i("\u0000\u0000\u0000\u0000", (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 65257), "⇨畉鈶廕冠豽壃퐈ᐁ溝㍺뙾危쓐\ue7d9\ue223", "튄㽇\ue9e9\uf0fe", android.graphics.Color.green(0), objArr103);
                                                            java.lang.String str47 = (java.lang.String) objArr103[0];
                                                            char mirror3 = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                            int indexOf8 = android.text.TextUtils.indexOf(str45, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                            int d35 = com.facetec.sdk.gh.b.d();
                                                            int i240 = indexOf8 * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE;
                                                            int i241 = ((-49020) & i240) + (i240 | (-49020));
                                                            int i242 = -(-((~(indexOf8 | d35)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE));
                                                            int i243 = (i241 ^ i242) + ((i242 & i241) << 1);
                                                            int i244 = (indexOf8 ^ (-229)) | (indexOf8 & (-229));
                                                            int i245 = ~d35;
                                                            int i246 = ((i244 ^ i245) | (i244 & i245)) * (-216);
                                                            int i247 = ((i243 | i246) << 1) - (i246 ^ i243);
                                                            int i248 = ~((i245 ^ indexOf8) | (indexOf8 & i245));
                                                            int i249 = -(-(((i248 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE) | (i248 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE));
                                                            int i250 = -(-(android.view.KeyEvent.getMaxKeyCode() >> 16));
                                                            java.lang.Object[] objArr104 = new java.lang.Object[1];
                                                            j(true, 'A' - mirror3, "\tￔￔ\u0013\u000e\u0007\u001dￔ\u0011\u0006\b\u0014\u0011ￔ\u0006\u0019\u0006", (i247 ^ i249) + ((i249 & i247) << 1), (i250 ^ 2) + ((i250 & 2) << 1), objArr104);
                                                            java.lang.String str48 = (java.lang.String) objArr104[0];
                                                            int i251 = -(-android.text.TextUtils.lastIndexOf(str45, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                                            int i252 = -(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                                            java.lang.Object[] objArr105 = new java.lang.Object[1];
                                                            j(true, ((i251 | 7) << 1) - (i251 ^ 7), "\uffd8\u0017\u0012\u000b\u001c\uffd8", (i252 & 224) + (i252 | 224), 5 - (~(-(-(android.view.ViewConfiguration.getLongPressTimeout() >> 16)))), objArr105);
                                                            java.lang.String str49 = (java.lang.String) objArr105[0];
                                                            java.lang.Object[] objArr106 = new java.lang.Object[1];
                                                            i("\u0000\u0000\u0000\u0000", (char) ((-2) - (~(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))), "啧叀鴪ٹ㤦끄\uf4e9戠䦦䓝樳祖", "哂ᱪ꧐㉍", android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, objArr106);
                                                            java.lang.String str50 = (java.lang.String) objArr106[0];
                                                            int i253 = -(-android.text.TextUtils.indexOf(str45, str45));
                                                            java.lang.Object[] objArr107 = new java.lang.Object[1];
                                                            j(true, (i253 & 17) + (i253 | 17), "\n\u0019\u0018\u001e\u0018ￔￔ\u0019\u001d\nￓￔ\u0013\u000e\u0007ￔ\u0012", android.text.TextUtils.getCapsMode(str45, 0, 0) + 227, 5 - (~(-(android.view.ViewConfiguration.getPressedStateDuration() >> 16))), objArr107);
                                                            java.lang.String str51 = (java.lang.String) objArr107[0];
                                                            int blue = android.graphics.Color.blue(0);
                                                            int scrollBarFadeDuration2 = android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                                            java.lang.Object[] objArr108 = new java.lang.Object[1];
                                                            j(false, 21 - blue, "\n\u000f\uffd0\u0007\u0002\n\r\u0014\u0002\u0007\u0006\uffd0\uffd0\u0014\u001a\u0014\u0015\u0006\u000e\uffd0\u0003", (scrollBarFadeDuration2 ^ 231) + ((scrollBarFadeDuration2 & 231) << 1), android.text.TextUtils.getTrimmedLength(str45) + 12, objArr108);
                                                            java.lang.String str52 = (java.lang.String) objArr108[0];
                                                            char c10 = (char) (18923 - (~(-(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))));
                                                            int indexOf9 = android.text.TextUtils.indexOf(str45, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                            java.lang.Object[] objArr109 = new java.lang.Object[1];
                                                            i("\u0000\u0000\u0000\u0000", c10, "\ue647㠃촰ﰮՊ痉棂䈌漖急㔢推촆\ud9af載抈", "㰒떮\uec69╉", (indexOf9 & 1) + (indexOf9 | 1), objArr109);
                                                            java.lang.String str53 = (java.lang.String) objArr109[0];
                                                            int trimmedLength = android.text.TextUtils.getTrimmedLength(str45);
                                                            int i254 = -(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                                            int i255 = -android.view.KeyEvent.getDeadChar(0, 0);
                                                            java.lang.Object[] objArr110 = new java.lang.Object[1];
                                                            j(true, 25 - trimmedLength, "\u0016\uffd0\u000e\u0006\u0015\u0014\u001a\u0014\uffd0\uffd0\u0015\u0010\u0010\u0013ￎ\u0005\u0006\u0006\u000fￎ\u0006\u0018\uffd0\u0013\u0014", (i254 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE) + ((i254 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE) << 1), (i255 ^ 9) + ((i255 & 9) << 1), objArr110);
                                                            java.lang.String str54 = (java.lang.String) objArr110[0];
                                                            java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                            i("\u0000\u0000\u0000\u0000", (char) ((android.os.Process.myPid() >> 22) + 16654), "籜䂕ᵴ氼굏ᴰļ䓒矎♳딳䏾䳨", "\u0558毬ກ큁", android.graphics.Color.alpha(0) - 2123633659, objArr111);
                                                            java.lang.String str55 = (java.lang.String) objArr111[0];
                                                            char trimmedLength2 = (char) android.text.TextUtils.getTrimmedLength(str45);
                                                            int i256 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
                                                            int d36 = com.facetec.sdk.gh.b.d();
                                                            int i257 = i256 * (-518);
                                                            int i258 = (914547828 ^ i257) + ((i257 & 914547828) << 1);
                                                            int i259 = ~d36;
                                                            int i260 = ~i256;
                                                            int i261 = ~(i260 | i259);
                                                            int i262 = -(-(((i261 ^ (-1892214462)) | ((-1892214462) & i261)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE));
                                                            int i263 = (i258 & i262) + (i258 | i262);
                                                            int i264 = (i259 ^ i260) | (i260 & i259);
                                                            int i265 = ~((i264 ^ (-1892214462)) | ((-1892214462) & i264));
                                                            int i266 = ((-1892214462) ^ i256) | ((-1892214462) & i256);
                                                            int i267 = ~((i266 ^ d36) | (i266 & d36));
                                                            int i268 = ((i265 ^ i267) | (i265 & i267)) * (-519);
                                                            int i269 = ~((d36 ^ (-1892214462)) | ((-1892214462) & d36));
                                                            java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                            i("\u0000\u0000\u0000\u0000", trimmedLength2, "\u0ebf㑂熟띚㍋憥힣\u31e5\udfe3", "䉋㜙펏䤅", (((i263 ^ i268) + ((i268 & i263) << 1)) - (~(-(-(((i256 ^ i269) | (i256 & i269)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE))))) - 1, objArr112);
                                                            java.lang.String str56 = (java.lang.String) objArr112[0];
                                                            int i270 = -(-(android.view.ViewConfiguration.getTouchSlop() >> 8));
                                                            int i271 = (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                            int d37 = com.facetec.sdk.gh.b.d();
                                                            int i272 = i271 * (-183);
                                                            int i273 = ~i271;
                                                            int i274 = ~d37;
                                                            int i275 = (i273 ^ i274) | (i273 & i274);
                                                            int i276 = ~(i275 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
                                                            int i277 = ~((i274 ^ (-221)) | (i274 & (-221)) | i271);
                                                            int i278 = ~((i273 & (-221)) | (i273 ^ (-221)));
                                                            int i279 = ~i275;
                                                            java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                            j(false, (i270 ^ 8) + ((i270 & 8) << 1), "ￚￚ\u001e ￚ\r\u0014\u0019", (((((((-40260) | i272) << 1) - (i272 ^ (-40260))) + (((i277 & i276) | (i276 ^ i277)) * (-184))) + (((~r4) | ((i278 & i279) | (i278 ^ i279))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)) - (~((i271 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))) - 1, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr113);
                                                            java.lang.String[] strArr5 = {str46, str47, str48, str49, str50, str51, str52, str53, str54, str55, str56, (java.lang.String) objArr113[0]};
                                                            f = (h + 43) % 128;
                                                            int i280 = 0;
                                                            while (i280 < 12) {
                                                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                sb.append(strArr5[i280]);
                                                                int i281 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
                                                                int i282 = -(-android.widget.ExpandableListView.getPackedPositionChild(0L));
                                                                int i283 = -android.view.View.resolveSize(0, 0);
                                                                java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                                j(false, 1 - (~i281), "\uffff\u0001", 252 - (~i282), ((i283 | 2) << 1) - (i283 ^ 2), objArr114);
                                                                sb.append((java.lang.String) objArr114[0]);
                                                                java.lang.Object[] objArr115 = {sb.toString()};
                                                                java.lang.Object d38 = com.facetec.sdk.al.d(1873189073);
                                                                if (d38 == null) {
                                                                    char pressedStateDuration2 = (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 6935);
                                                                    int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                                                    int rgb3 = android.graphics.Color.rgb(0, 0, 0);
                                                                    byte b44 = (byte) 2;
                                                                    byte b45 = (byte) (b44 - 2);
                                                                    java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                                    g(b44, b45, b45, objArr116);
                                                                    d38 = com.facetec.sdk.al.c(pressedStateDuration2, 2389 - packedPositionGroup, rgb3 + 16777239, -934682071, false, (java.lang.String) objArr116[0], new java.lang.Class[]{java.lang.String.class});
                                                                }
                                                                long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) d38).invoke(null, objArr115)).longValue();
                                                                long j76 = 277842050;
                                                                long j77 = j76 ^ j4;
                                                                java.lang.String[] strArr6 = strArr5;
                                                                int i284 = i280;
                                                                long uptimeMillis6 = (int) android.os.SystemClock.uptimeMillis();
                                                                long j78 = (j77 | (uptimeMillis6 ^ j4)) ^ j4;
                                                                long j79 = 338;
                                                                long j80 = ((-337) * j76) + (339 * longValue14) + ((j78 | (((longValue14 ^ j4) | j76) ^ j4) | ((j76 | uptimeMillis6) ^ j4)) * (-338)) + (((j77 | longValue14) ^ j4) * j79) + (j79 * (j78 | ((uptimeMillis6 | (longValue14 | j76)) ^ j4))) + 659237593;
                                                                int nextInt4 = new java.util.Random().nextInt();
                                                                int i285 = ~nextInt4;
                                                                int i286 = ((int) (j80 >> 32)) & (((((~((-1917041433) | i285)) | r5) * 1150) - 334238508) + (((~(479815021 | nextInt4)) | (~((-479815022) | i285))) * (-575)) + (((~(nextInt4 | (-1917041433))) | (~(i285 | 1917041432))) * 575));
                                                                int i287 = ~((int) android.os.Process.getElapsedCpuTime());
                                                                int i288 = ((int) j80) & (((~((-631841057) | i287)) * (-783)) + 1081536394 + (((~(i287 | (-1034533157))) | 402693253) * 783));
                                                                if (((i286 ^ i288) | (i286 & i288)) != 0) {
                                                                    i5 = i284 + 110;
                                                                    break;
                                                                }
                                                                i280 = (((i284 | 55) << 1) - (i284 ^ 55)) - 54;
                                                                strArr5 = strArr6;
                                                            }
                                                        }
                                                    }
                                                    i5 = 0;
                                                    if (i5 != 0) {
                                                        java.lang.Object[] objArr117 = {null, new int[1], new int[]{i5}, new int[]{0}};
                                                        int myUid5 = android.os.Process.myUid();
                                                        int i289 = ((((~((-136236491) | r3)) | (~((-1481981470) | myUid5))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) - 1141275426) + (((~(myUid5 | (-136236491))) | 135531528) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) + (((~((-1481981470) | (~myUid5))) | 136236490) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE);
                                                        int i290 = ((i289 ^ 16) + ((i289 & 16) << 1)) - 1673951376;
                                                        int i291 = i290 << 13;
                                                        int i292 = (i290 & (~i291)) | ((~i290) & i291);
                                                        int i293 = i292 >>> 17;
                                                        int i294 = (~(i292 & i293)) & (i292 | i293);
                                                        int i295 = i294 << 5;
                                                        ((int[]) objArr117[1])[0] = (~(i294 & i295)) & (i294 | i295);
                                                        return objArr117;
                                                    }
                                                    long[] jArr = {472001035};
                                                    int i296 = -(-((android.os.Process.getThreadPriority(0) + 20) >> 6));
                                                    java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                    j(true, (i296 ^ 17) + ((i296 & 17) << 1), "\r\u0010\u000eￍ\u0011\u0012\f\u0013\r\u000bￍ\u0004\n\u0003\u0011ￍ\u0001", 234 - android.text.TextUtils.getTrimmedLength(str45), 4 - (~(-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))), objArr118);
                                                    try {
                                                        bufferedInputStream2 = new java.io.BufferedInputStream(new java.io.FileInputStream((java.lang.String) objArr118[0]));
                                                        j12 = 0;
                                                    } catch (java.io.IOException unused3) {
                                                        bufferedInputStream2 = null;
                                                    } catch (java.lang.Throwable th9) {
                                                        th = th9;
                                                        bufferedInputStream = null;
                                                    }
                                                    while (true) {
                                                        try {
                                                            int read = bufferedInputStream2.read();
                                                            if (read != -1) {
                                                                j12 = ((j12 << 5) ^ read) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK;
                                                                for (int i297 = 0; i297 < 1; i297++) {
                                                                    if (j12 == jArr[i297]) {
                                                                        int i298 = (i297 & 1) + (i297 | 1);
                                                                        try {
                                                                            bufferedInputStream2.close();
                                                                        } catch (java.lang.Exception unused4) {
                                                                        }
                                                                        if (i298 != 0) {
                                                                            f = (h + 111) % 128;
                                                                            i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } catch (java.io.IOException unused5) {
                                                        } catch (java.lang.Throwable th10) {
                                                            th = th10;
                                                            bufferedInputStream = bufferedInputStream2;
                                                            if (bufferedInputStream == null) {
                                                                throw th;
                                                            }
                                                            try {
                                                                bufferedInputStream.close();
                                                                throw th;
                                                            } catch (java.lang.Exception unused6) {
                                                                throw th;
                                                            }
                                                        }
                                                        try {
                                                            bufferedInputStream2.close();
                                                            break;
                                                        } catch (java.lang.Exception unused7) {
                                                        }
                                                    }
                                                    f = (h + 117) % 128;
                                                    i6 = 0;
                                                    if (i6 != 0) {
                                                        h = (f + 111) % 128;
                                                        java.lang.Object[] objArr119 = {null, new int[1], new int[]{i6}, new int[]{0}};
                                                        int i299 = ~((int) android.os.SystemClock.elapsedRealtime());
                                                        int i300 = ((((~(r2 | (-323510403))) | r4) * 590) - 376437295) + (((~((-749181750) | i299)) | 203655941 | (~(869036210 | i299))) * (-1180)) + (((~(i299 | 749181749)) | (~((-869036211) | i299))) * 590) + 16;
                                                        int i301 = (i300 ^ (-1673951376)) + ((i300 & (-1673951376)) << 1);
                                                        int i302 = i301 << 13;
                                                        int i303 = ((~i302) & i301) | ((~i301) & i302);
                                                        int i304 = i303 >>> 17;
                                                        int i305 = (~(i303 & i304)) & (i303 | i304);
                                                        int i306 = i305 << 5;
                                                        ((int[]) objArr119[1])[0] = (i305 & (~i306)) | ((~i305) & i306);
                                                        return objArr119;
                                                    }
                                                    long[] jArr2 = {472001035};
                                                    char offsetAfter2 = (char) android.text.TextUtils.getOffsetAfter(str45, 0);
                                                    int i307 = -android.graphics.Color.rgb(0, 0, 0);
                                                    java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                    i("\u0000\u0000\u0000\u0000", offsetAfter2, "싔斚絛\uaa5a寊㏕晹\uf08a\uf447ꃼ៖䆜\ue3df\udb95褚穇樰滧靁䅭ⓧ殟", "\ude24嶁葉苕", ((-16777216) & i307) + (i307 | (-16777216)), objArr120);
                                                    try {
                                                        bufferedInputStream4 = new java.io.BufferedInputStream(new java.io.FileInputStream((java.lang.String) objArr120[0]));
                                                        com.facetec.sdk.gh.b.d();
                                                        com.facetec.sdk.gh.b.d();
                                                        j11 = 0;
                                                    } catch (java.io.IOException unused8) {
                                                        bufferedInputStream4 = null;
                                                    } catch (java.lang.Throwable th11) {
                                                        th2 = th11;
                                                        bufferedInputStream3 = null;
                                                    }
                                                    loop6: while (true) {
                                                        try {
                                                            int read2 = bufferedInputStream4.read();
                                                            if (read2 != -1) {
                                                                int i308 = f;
                                                                int i309 = (i308 & 113) + (i308 | 113);
                                                                h = i309 % 128;
                                                                j11 = i309 % 2 != 0 ? ((j11 >> 5) / read2) * kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK : ((j11 << 5) ^ read2) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK;
                                                                int i310 = 0;
                                                                while (i310 < 1) {
                                                                    int i311 = f;
                                                                    h = ((i311 ^ 109) + ((i311 & 109) << 1)) % 128;
                                                                    if (j11 == jArr2[i310]) {
                                                                        break loop6;
                                                                    }
                                                                    int i312 = i310 - 122;
                                                                    i310 = (i312 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i312 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                                                                }
                                                            }
                                                        } catch (java.io.IOException unused9) {
                                                        } catch (java.lang.Throwable th12) {
                                                            th2 = th12;
                                                            bufferedInputStream3 = bufferedInputStream4;
                                                            if (bufferedInputStream3 == null) {
                                                                throw th2;
                                                            }
                                                            try {
                                                                bufferedInputStream3.close();
                                                                throw th2;
                                                            } catch (java.lang.Exception unused10) {
                                                                throw th2;
                                                            }
                                                        }
                                                        try {
                                                            bufferedInputStream4.close();
                                                            break;
                                                        } catch (java.lang.Exception unused11) {
                                                        }
                                                    }
                                                    d7 = com.facetec.sdk.al.d(-1699488110);
                                                    if (d7 == null) {
                                                        char capsMode = (char) (android.text.TextUtils.getCapsMode(str45, 0, 0) + 22875);
                                                        int windowTouchSlop4 = android.view.ViewConfiguration.getWindowTouchSlop();
                                                        int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
                                                        byte b46 = (byte) 2;
                                                        byte b47 = (byte) (b46 - 2);
                                                        java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                        g(b46, b47, b47, objArr121);
                                                        d7 = com.facetec.sdk.al.c(capsMode, 2031 - (windowTouchSlop4 >> 8), 23 - combineMeasuredStates, 1029481578, false, (java.lang.String) objArr121[0], new java.lang.Class[0]);
                                                    }
                                                    long longValue15 = ((java.lang.Long) ((java.lang.reflect.Method) d7).invoke(null, null)).longValue();
                                                    long j81 = 435930541;
                                                    long j82 = ((j81 ^ j4) | longValue15) ^ j4;
                                                    long elapsedCpuTime6 = (int) android.os.Process.getElapsedCpuTime();
                                                    long j83 = elapsedCpuTime6 ^ j4;
                                                    long j84 = 594;
                                                    long j85 = longValue15 ^ j4;
                                                    long j86 = (j83 | j81) ^ j4;
                                                    long j87 = (((((595 * j81) + ((-1187) * longValue15)) + ((((j83 | longValue15) ^ j4) | j82) * (-1188))) + (((((elapsedCpuTime6 | j85) ^ j4) | j82) | j86) * j84)) + (j84 * ((((j85 | j81) ^ j4) | ((j85 | j83) ^ j4)) | j86))) - 1623695124;
                                                    int i313 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                                    i7 = ((int) (j87 >> 32)) & ((((~((-104884230) | (~i313))) | (~(1332342181 | i313))) * (-272)) + 244723626 + (((~((-1198025894) | i313)) | 1093141664) * (-272)) + (((~(i313 | 1198025893)) | 239200517) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE));
                                                    int freeMemory5 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                                    i8 = ((int) j87) & (((~((~freeMemory5) | 2142601205)) * (-116)) + 2072280017 + ((2057337844 | freeMemory5) * 116) + (((~(freeMemory5 | (-800403042))) | 715139680) * 116));
                                                    if (((i7 ^ i8) | (i7 & i8)) == 0) {
                                                        h = (f + 61) % 128;
                                                        objArr = new java.lang.Object[]{null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, new int[]{0}};
                                                        int freeMemory6 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                                        int i314 = -(-(((((~((-1235764978) | r4)) | (~((-382452983) | freeMemory6))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 1324690103) + (((~(freeMemory6 | (-1226834434))) | (~((~freeMemory6) | (-373522439)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 16));
                                                        int i315 = (i314 ^ (-1673951376)) + ((i314 & (-1673951376)) << 1);
                                                        int i316 = i315 << 13;
                                                        int i317 = ((~i316) & i315) | ((~i315) & i316);
                                                        int i318 = i317 >>> 17;
                                                        int i319 = (i317 & (~i318)) | ((~i317) & i318);
                                                        int i320 = i319 << 5;
                                                        int[] iArr = (int[]) objArr[1];
                                                        int i321 = (~(i319 & i320)) & (i319 | i320);
                                                        i9 = 0;
                                                        iArr[0] = i321;
                                                    } else {
                                                        java.lang.Object d39 = com.facetec.sdk.al.d(33831608);
                                                        if (d39 == null) {
                                                            char makeMeasureSpec = (char) (44824 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                                            int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                                            int touchSlop2 = android.view.ViewConfiguration.getTouchSlop();
                                                            byte b48 = (byte) 3;
                                                            byte b49 = (byte) (b48 - 3);
                                                            java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                            g(b48, b49, b49, objArr122);
                                                            d39 = com.facetec.sdk.al.c(makeMeasureSpec, 685 - makeMeasureSpec2, 23 - (touchSlop2 >> 8), -1511309248, false, (java.lang.String) objArr122[0], new java.lang.Class[0]);
                                                        }
                                                        long longValue16 = ((java.lang.Long) ((java.lang.reflect.Method) d39).invoke(null, null)).longValue();
                                                        long j88 = 1696953713;
                                                        int elapsedCpuTime7 = (int) android.os.Process.getElapsedCpuTime();
                                                        long j89 = my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CERTIFICATE;
                                                        long j90 = longValue16 ^ j4;
                                                        long j91 = elapsedCpuTime7;
                                                        long j92 = j91 ^ j4;
                                                        long j93 = (j92 | longValue16) ^ j4;
                                                        long j94 = my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR;
                                                        long j95 = j88 ^ j4;
                                                        long j96 = ((((((-515) * j88) + (j89 * longValue16)) + (((((j92 | j88) ^ j4) | ((j90 | j91) ^ j4)) | j93) * (-516))) + (((((j95 | j90) | j91) ^ j4) | (((j95 | j92) | longValue16) ^ j4)) * j94)) + (j94 * (((longValue16 | j95) ^ j4) | j93))) - 1928738567;
                                                        int i322 = ((int) (j96 >> 32)) & (((((~((-1130962098) | r2)) | 1114115233) * (-160)) - 127653494) + (((~((~((int) java.lang.Runtime.getRuntime().totalMemory())) | 1726778787)) | (-1130962098)) * 160));
                                                        int freeMemory7 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                                        int i323 = ~freeMemory7;
                                                        int i324 = ((int) j96) & ((((((~(866733471 | i323)) | (~((-294143109) | freeMemory7))) | (~((-2097426) | freeMemory7))) * 765) - 1525685504) + (((~(572590363 | i323)) | (-866733472)) * 1530) + (((~(freeMemory7 | 572590363)) | (~(i323 | (-2097426)))) * 765));
                                                        int i325 = ((i322 ^ i324) | (i322 & i324)) != 0 ? com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE : 0;
                                                        if (i325 == 0) {
                                                            java.lang.Object d40 = com.facetec.sdk.al.d(39533378);
                                                            if (d40 == null) {
                                                                char edgeSlop6 = (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                                                int resolveOpacity = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                                                int scrollDefaultDelay3 = android.view.ViewConfiguration.getScrollDefaultDelay();
                                                                byte b50 = (byte) 3;
                                                                byte b51 = (byte) (b50 - 3);
                                                                java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                                g(b50, b51, b51, objArr123);
                                                                d40 = com.facetec.sdk.al.c(edgeSlop6, resolveOpacity + 2222, 24 - (scrollDefaultDelay3 >> 16), -1514913350, false, (java.lang.String) objArr123[0], new java.lang.Class[0]);
                                                            }
                                                            long longValue17 = ((java.lang.Long) ((java.lang.reflect.Method) d40).invoke(null, null)).longValue();
                                                            long j97 = 727840355;
                                                            long j98 = longValue17 ^ j4;
                                                            long elapsedRealtime5 = (int) android.os.SystemClock.elapsedRealtime();
                                                            long j99 = ((j98 | j97) | elapsedRealtime5) ^ j4;
                                                            long j100 = (((((477 * j97) + ((-475) * longValue17)) + ((((longValue17 | (j97 ^ j4)) ^ j4) | j99) * (-476))) + (952 * j99)) + (476 * ((j97 | ((elapsedRealtime5 ^ j4) | j98)) ^ j4))) - 967444778;
                                                            int elapsedRealtime6 = (int) android.os.SystemClock.elapsedRealtime();
                                                            int i326 = ~elapsedRealtime6;
                                                            int i327 = ((int) (j100 >> 32)) & ((((((~(1765632588 | i326)) | (~((-136587265) | elapsedRealtime6))) | (~((-536937029) | elapsedRealtime6))) * 765) - 2145158975) + (((~(1629045324 | i326)) | (-1765632589)) * 1530) + (((~(elapsedRealtime6 | 1629045324)) | (~(i326 | (-536937029)))) * 765));
                                                            int maxMemory7 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                                            int i328 = ~maxMemory7;
                                                            int i329 = ((int) j100) & (((((~((-1908832192) | i328)) | (~((-948908695) | maxMemory7))) * 1900) - 1871736089) + (((~(948908694 | i328)) | (~(1908832191 | maxMemory7))) * (-950)) + (((~(maxMemory7 | 948908694)) | (~(i328 | 1908832191))) * 950));
                                                            if (((i327 ^ i329) | (i327 & i329)) != 0) {
                                                                com.facetec.sdk.gh.b.d();
                                                                com.facetec.sdk.gh.b.d();
                                                                objArr = new java.lang.Object[]{null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, new int[]{0}};
                                                                int elapsedCpuTime8 = (int) android.os.Process.getElapsedCpuTime();
                                                                int i330 = ~elapsedCpuTime8;
                                                                int i331 = (((((~((-771254084) | i330)) | 226509635) | r1) * (-713)) - 823256898) + ((~(elapsedCpuTime8 | (-302219429))) * 1426) + ((~((-846963877) | i330)) * 713);
                                                                int i332 = (-1673951377) - (~(-(-((i331 ^ 16) + ((i331 & 16) << 1)))));
                                                                int i333 = i332 << 13;
                                                                int i334 = ((~i333) & i332) | ((~i332) & i333);
                                                                int i335 = i334 >>> 17;
                                                                int i336 = (i334 & (~i335)) | ((~i334) & i335);
                                                                ((int[]) objArr[1])[0] = i336 ^ (i336 << 5);
                                                            } else {
                                                                java.lang.Object d41 = com.facetec.sdk.al.d(39530495);
                                                                if (d41 == null) {
                                                                    char windowTouchSlop5 = (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                                                                    int indexOf10 = android.text.TextUtils.indexOf(str45, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                                    int makeMeasureSpec3 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                                                    byte b52 = (byte) 0;
                                                                    byte b53 = b52;
                                                                    java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                                    g(b52, b53, b53, objArr124);
                                                                    d41 = com.facetec.sdk.al.c(windowTouchSlop5, 2221 - indexOf10, makeMeasureSpec3 + 24, -1514908409, false, (java.lang.String) objArr124[0], new java.lang.Class[0]);
                                                                }
                                                                long longValue18 = ((java.lang.Long) ((java.lang.reflect.Method) d41).invoke(null, null)).longValue();
                                                                long j101 = -693908118;
                                                                long j102 = 85;
                                                                long j103 = -84;
                                                                long j104 = j101 ^ j4;
                                                                long j105 = longValue18 ^ j4;
                                                                long nextInt5 = new java.util.Random().nextInt(1656815295);
                                                                long j106 = nextInt5 ^ j4;
                                                                long j107 = j101 | longValue18;
                                                                long j108 = (j106 | longValue18) ^ j4;
                                                                long j109 = (((((j102 * j101) + (j102 * longValue18)) + ((((((j104 | j105) ^ j4) | ((j104 | j106) ^ j4)) | ((j105 | j106) ^ j4)) | ((j107 | nextInt5) ^ j4)) * j103)) + (j103 * ((((j105 | nextInt5) ^ j4) | j101) | j108))) + (84 * (j108 | (j107 ^ j4)))) - 1249499344;
                                                                int elapsedRealtime7 = (int) android.os.SystemClock.elapsedRealtime();
                                                                int i337 = ~elapsedRealtime7;
                                                                int i338 = ((int) (j109 >> 32)) & ((((69632 | elapsedRealtime7) * 988) - 673887038) + (((~((-1714065344) | i337)) | 570459434) * (-1976)) + (((~(elapsedRealtime7 | 1143675541)) | 69632 | (~(i337 | (-1143675542)))) * 988));
                                                                int myPid3 = android.os.Process.myPid();
                                                                int i339 = ~myPid3;
                                                                int i340 = ((int) j109) & (((((-1878720496) | r6) * (-712)) - 917144339) + (((~(myPid3 | (-1638569995))) | (~(i339 | 1878720495))) * (-712)) + ((1677376911 | (~(240150501 | i339))) * 712));
                                                                if (((i340 ^ i338) | (i338 & i340)) != 0) {
                                                                    int i341 = h;
                                                                    f = ((i341 & 89) + (i341 | 89)) % 128;
                                                                    objArr = new java.lang.Object[]{null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, new int[]{0}};
                                                                    int nextInt6 = new java.util.Random().nextInt(1775187429);
                                                                    int i342 = ((((((~((~nextInt6) | (-105089685))) | (~(1601432511 | nextInt6))) * (-302)) - 1154165515) + ((~((-105089685) | nextInt6)) * (-604))) + (((~(nextInt6 | 1496342827)) | 1479557379) * 302)) - 1673951360;
                                                                    int i343 = i342 << 13;
                                                                    int i344 = (~(i343 & i342)) & (i343 | i342);
                                                                    int i345 = i344 >>> 17;
                                                                    int i346 = (~(i344 & i345)) & (i344 | i345);
                                                                    ((int[]) objArr[1])[0] = i346 ^ (i346 << 5);
                                                                } else {
                                                                    java.lang.Object d42 = com.facetec.sdk.al.d(589612749);
                                                                    if (d42 == null) {
                                                                        char trimmedLength3 = (char) android.text.TextUtils.getTrimmedLength(str45);
                                                                        int tapTimeout3 = android.view.ViewConfiguration.getTapTimeout();
                                                                        float length = android.graphics.PointF.length(0.0f, 0.0f);
                                                                        byte b54 = (byte) 3;
                                                                        byte b55 = (byte) (b54 - 3);
                                                                        java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                                        g(b54, b55, b55, objArr125);
                                                                        d42 = com.facetec.sdk.al.c(trimmedLength3, 2174 - (tapTimeout3 >> 16), (length > 0.0f ? 1 : (length == 0.0f ? 0 : -1)) + 24, -2067022795, false, (java.lang.String) objArr125[0], new java.lang.Class[0]);
                                                                    }
                                                                    long longValue19 = ((java.lang.Long) ((java.lang.reflect.Method) d42).invoke(null, null)).longValue();
                                                                    long j110 = -569476586;
                                                                    long maxMemory8 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                                                    long j111 = longValue19 ^ j4;
                                                                    long j112 = 676;
                                                                    long j113 = maxMemory8 ^ j4;
                                                                    long j114 = (677 * j110) + ((-675) * longValue19) + ((j110 | maxMemory8 | j111) * (-676)) + ((((j111 | j110) ^ j4) | ((j113 | j110) ^ j4)) * j112) + (j112 * ((((longValue19 | j110) | maxMemory8) ^ j4) | (((j110 ^ j4) | j111) ^ j4) | ((j111 | j113) ^ j4))) + 1552645615;
                                                                    int myUid6 = android.os.Process.myUid();
                                                                    int i347 = ((int) (j114 >> 32)) & ((((((~myUid6) | 1786240733) * 1444) - 1153123274) + ((((~(myUid6 | 1889082180)) | 174507161) | (~((-451855770) | myUid6))) * (-1444))) - 1175621148);
                                                                    int elapsedRealtime8 = (int) android.os.SystemClock.elapsedRealtime();
                                                                    int i348 = ~elapsedRealtime8;
                                                                    int i349 = ((int) j114) & (((((~(1357073 | elapsedRealtime8)) | 1435869336) * (-318)) - 528860153) + (((~(1435869336 | elapsedRealtime8)) | (~((-1351697) | i348))) * 318) + (((~(elapsedRealtime8 | (-1351697))) | (~(i348 | (-5378)))) * 318));
                                                                    if (((i347 ^ i349) | (i347 & i349)) != 0) {
                                                                        objArr = new java.lang.Object[]{null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, new int[]{0}};
                                                                        int myPid4 = android.os.Process.myPid();
                                                                        int i350 = (((205676564 | r4) * (-476)) - 1720686205) + ((~((-1394709380) | myPid4)) * 952) + ((~((~myPid4) | (-1394709380))) * 476);
                                                                        int i351 = (-1673951377) - (~((i350 & 16) + (i350 | 16)));
                                                                        int i352 = i351 << 13;
                                                                        int i353 = (~(i352 & i351)) & (i352 | i351);
                                                                        int i354 = i353 >>> 17;
                                                                        int i355 = (~(i353 & i354)) & (i353 | i354);
                                                                        ((int[]) objArr[1])[0] = i355 ^ (i355 << 5);
                                                                        i9 = 0;
                                                                    } else {
                                                                        objArr = new java.lang.Object[]{null, new int[1], new int[]{0}, new int[]{0}};
                                                                        int i356 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                                                        int i357 = ((((((~(1164942263 | r4)) | 436232192) * (-108)) - 934411053) + (((~((~i356) | 453275696)) | ((~((-453275697) | i356)) | 1147898759)) * 54)) + ((i356 | 1147898759) * 54)) - 1673951376;
                                                                        int i358 = i357 << 13;
                                                                        int i359 = (~(i358 & i357)) & (i358 | i357);
                                                                        int i360 = i359 >>> 17;
                                                                        int i361 = (~(i359 & i360)) & (i359 | i360);
                                                                        int i362 = i361 << 5;
                                                                        int[] iArr2 = (int[]) objArr[1];
                                                                        int i363 = (~(i361 & i362)) & (i361 | i362);
                                                                        i9 = 0;
                                                                        iArr2[0] = i363;
                                                                    }
                                                                }
                                                            }
                                                            c = 3;
                                                            i9 = 0;
                                                            if (((int[]) objArr[c])[i9] != ((int[]) objArr[2])[i9]) {
                                                                return objArr;
                                                            }
                                                            java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                            objArr126[i9] = 2;
                                                            java.lang.Object d43 = com.facetec.sdk.al.d(-1836228463);
                                                            if (d43 == null) {
                                                                char packedPositionChild2 = (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L));
                                                                int resolveSize = android.view.View.resolveSize(i9, i9);
                                                                int tapTimeout4 = android.view.ViewConfiguration.getTapTimeout();
                                                                byte b56 = (byte) 2;
                                                                byte b57 = (byte) (b56 - 2);
                                                                java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                                g(b56, b57, b57, objArr127);
                                                                d43 = com.facetec.sdk.al.c(packedPositionChild2, 455 - resolveSize, 24 - (tapTimeout4 >> 16), 895621737, false, (java.lang.String) objArr127[0], new java.lang.Class[]{java.lang.Integer.TYPE});
                                                            }
                                                            long longValue20 = ((java.lang.Long) ((java.lang.reflect.Method) d43).invoke(null, objArr126)).longValue();
                                                            long j115 = 143567516;
                                                            long j116 = j115 ^ j4;
                                                            long myPid5 = android.os.Process.myPid();
                                                            long j117 = (((((303 * j115) + ((-301) * longValue20)) + ((((((myPid5 ^ j4) | j116) | longValue20) ^ j4) | (((j115 | longValue20) | myPid5) ^ j4)) * (-302))) + ((-604) * (((j116 | longValue20) | myPid5) ^ j4))) + (302 * ((((longValue20 ^ j4) | j115) ^ j4) | ((myPid5 | longValue20) ^ j4)))) - 1514095121;
                                                            int i364 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                                            int i365 = ~i364;
                                                            int i366 = ((int) (j117 >> 32)) & ((((~(1157555035 | i365)) | (~(1700185849 | i364))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) + 878080396 + (((~(i364 | 1157555035)) | (-1711204348)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) + (((~(1700185849 | i365)) | (-1157555036)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE));
                                                            int i367 = ((int) j117) & (((((~((-1737113537) | r4)) | 1711281600) * 305) - 1704616964) + (((~((~((int) android.os.Process.getElapsedCpuTime())) | (-1737113537))) | (-299887127)) * 305));
                                                            if (((i366 ^ i367) | (i366 & i367)) == 2) {
                                                                java.lang.Object[] objArr128 = {null, new int[1], new int[]{270}, new int[]{0}};
                                                                int myTid2 = android.os.Process.myTid();
                                                                int i368 = (((~((~myTid2) | (-221116627))) | 1397101333) * (-235)) + 1548647739 + (((~((-221116627) | myTid2)) | 1397101333) * (-470)) + (((~(myTid2 | (-204073155))) | 1380057861) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE);
                                                                int i369 = ((i368 & 16) + (i368 | 16)) - 1673951376;
                                                                int i370 = i369 << 13;
                                                                int i371 = (i369 & (~i370)) | ((~i369) & i370);
                                                                int i372 = i371 >>> 17;
                                                                int i373 = (~(i371 & i372)) & (i371 | i372);
                                                                ((int[]) objArr128[1])[0] = i373 ^ (i373 << 5);
                                                                return objArr128;
                                                            }
                                                            java.lang.Object d44 = com.facetec.sdk.al.d(-1753496434);
                                                            if (d44 == null) {
                                                                char defaultSize = (char) (android.view.View.getDefaultSize(0, 0) + 409);
                                                                long currentThreadTimeMillis2 = android.os.SystemClock.currentThreadTimeMillis();
                                                                long currentThreadTimeMillis3 = android.os.SystemClock.currentThreadTimeMillis();
                                                                byte b58 = (byte) 3;
                                                                byte b59 = (byte) (b58 - 3);
                                                                java.lang.Object[] objArr129 = new java.lang.Object[1];
                                                                g(b58, b59, b59, objArr129);
                                                                d44 = com.facetec.sdk.al.c(defaultSize, 2199 - (currentThreadTimeMillis2 > (-1L) ? 1 : (currentThreadTimeMillis2 == (-1L) ? 0 : -1)), (currentThreadTimeMillis3 > (-1L) ? 1 : (currentThreadTimeMillis3 == (-1L) ? 0 : -1)) + 23, 815054454, false, (java.lang.String) objArr129[0], new java.lang.Class[0]);
                                                            }
                                                            long longValue21 = ((java.lang.Long) ((java.lang.reflect.Method) d44).invoke(null, null)).longValue();
                                                            long j118 = 236958664;
                                                            long nextInt7 = new java.util.Random().nextInt();
                                                            long j119 = 50;
                                                            long j120 = longValue21 ^ j4;
                                                            long j121 = nextInt7 ^ j4;
                                                            long j122 = j120 | j121;
                                                            long j123 = (51 * j118) + ((-49) * longValue21) + ((j118 | nextInt7) * (-50)) + ((((((j118 ^ j4) | j120) | nextInt7) ^ j4) | ((j122 | j118) ^ j4)) * j119) + (j119 * ((j122 ^ j4) | ((j120 | j118) ^ j4) | ((j118 | j121) ^ j4))) + 488278874;
                                                            int i374 = ((int) (j123 >> 32)) & (((((-83886353) | r2) * 494) - 884105626) + (((~((~android.os.Process.myPid()) | (-932590515))) | (-1160332561)) * 494));
                                                            int freeMemory8 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                                            int i375 = ((int) j123) & ((((~((-702573117) | r5)) * 979) - 981236100) + (((-2139799527) | freeMemory8) * (-979)) + (((~(freeMemory8 | (-702573117))) | (~((~freeMemory8) | (-2139799527)))) * 979));
                                                            if (((i374 ^ i375) | (i374 & i375)) != 0) {
                                                                java.lang.Object[] objArr130 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, new int[]{0}};
                                                                int nextInt8 = new java.util.Random().nextInt(1188697078);
                                                                int i376 = ~nextInt8;
                                                                int i377 = ((1051600031 | nextInt8) * 140) + 1245083999 + (((~(1051600031 | i376)) | 21087040) * (-280)) + (((~(nextInt8 | (-21087041))) | (~(i376 | 566617928)) | 506069143) * 140);
                                                                int i378 = (i377 & 16) + (i377 | 16);
                                                                int i379 = ((i378 | (-1673951376)) << 1) - (i378 ^ (-1673951376));
                                                                int i380 = (i379 << 13) ^ i379;
                                                                int i381 = i380 >>> 17;
                                                                int i382 = (i380 & (~i381)) | ((~i380) & i381);
                                                                int i383 = i382 << 5;
                                                                ((int[]) objArr130[1])[0] = (~(i382 & i383)) & (i382 | i383);
                                                                return objArr130;
                                                            }
                                                            long[] jArr3 = {624887784092251L};
                                                            int trimmedLength4 = android.text.TextUtils.getTrimmedLength(str45);
                                                            int d45 = com.facetec.sdk.gh.b.d();
                                                            int i384 = (trimmedLength4 * (-115)) - 1955;
                                                            int i385 = ~d45;
                                                            int i386 = (i385 ^ trimmedLength4) | (i385 & trimmedLength4);
                                                            int i387 = -(-((~((i386 ^ 17) | (i386 & 17))) * (-116)));
                                                            int i388 = (i384 & i387) + (i384 | i387);
                                                            int i389 = -(-(((trimmedLength4 ^ d45) | (trimmedLength4 & d45)) * 116));
                                                            int i390 = (i388 & i389) + (i389 | i388);
                                                            int i391 = ~trimmedLength4;
                                                            int i392 = ~((i391 ^ (-18)) | (i391 & (-18)));
                                                            int i393 = ~((d45 ^ (-18)) | (d45 & (-18)));
                                                            int i394 = -(-(((i392 ^ i393) | (i392 & i393)) * 116));
                                                            int i395 = -(-(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                                            java.lang.Object[] objArr131 = new java.lang.Object[1];
                                                            j(true, (i390 & i394) + (i394 | i390), "\r\u0010\u000eￍ\u0011\u0012\f\u0013\r\u000bￍ\u0004\n\u0003\u0011ￍ\u0001", (i395 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE) + (i395 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE), 3 - (~(-(-android.view.KeyEvent.normalizeMetaState(0)))), objArr131);
                                                            java.lang.Object[] objArr132 = {(java.lang.String) objArr131[0], 3, 2251799813685247L, jArr3};
                                                            java.lang.Object d46 = com.facetec.sdk.al.d(2143203995);
                                                            if (d46 == null) {
                                                                char c11 = (char) (18696 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                                                int absoluteGravity5 = android.view.Gravity.getAbsoluteGravity(0, 0);
                                                                int red2 = android.graphics.Color.red(0);
                                                                byte b60 = (byte) 0;
                                                                byte b61 = b60;
                                                                java.lang.Object[] objArr133 = new java.lang.Object[1];
                                                                g(b60, b61, b61, objArr133);
                                                                d46 = com.facetec.sdk.al.c(c11, 1787 - absoluteGravity5, red2 + 24, -665728925, false, (java.lang.String) objArr133[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class});
                                                            }
                                                            long longValue22 = ((java.lang.Long) ((java.lang.reflect.Method) d46).invoke(null, objArr132)).longValue();
                                                            long j124 = -952247;
                                                            long j125 = j124 ^ j4;
                                                            long elapsedRealtime9 = (int) android.os.SystemClock.elapsedRealtime();
                                                            long j126 = elapsedRealtime9 ^ j4;
                                                            long j127 = ((((((-563) * j124) + (565 * longValue22)) + ((((((longValue22 ^ j4) | j126) ^ j4) | j125) | ((longValue22 | elapsedRealtime9) ^ j4)) * (-564))) + (1128 * (((j125 | longValue22) | elapsedRealtime9) ^ j4))) + (564 * (((longValue22 | j124) ^ j4) | ((j125 | j126) ^ j4)))) - 499662387;
                                                            int myPid6 = android.os.Process.myPid();
                                                            int i396 = ((int) (j127 >> 32)) & (((((~(2118096428 | myPid6)) | (~((-1342275585) | r4))) * 497) - 326665917) + (((~(myPid6 | (-1342275585))) | (~((~myPid6) | 2081920040)) | 36176388) * 497));
                                                            int uptimeMillis7 = (int) android.os.SystemClock.uptimeMillis();
                                                            int i397 = ~uptimeMillis7;
                                                            int i398 = ((int) j127) & ((((((~(1048120630 | uptimeMillis7)) | 16793665) | (~((-389105780) | uptimeMillis7))) * (-754)) - 118217729) + (((~(uptimeMillis7 | (-16793666))) | (~((-372312115) | i397))) * (-754)) + ((1048120630 | i397) * 754));
                                                            if (((i396 ^ i398) | (i396 & i398)) != 0) {
                                                                java.lang.Object[] objArr134 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, new int[]{0}};
                                                                int freeMemory9 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                                                int i399 = ~freeMemory9;
                                                                int i400 = (((~((-691980673) | i399)) | (-926237288)) * (-865)) + 849708896 + ((~(freeMemory9 | 691980672)) * 865) + (((~((-926237288) | i399)) | (~(i399 | 691980672))) * 865);
                                                                int i401 = -(-((i400 ^ 16) + ((i400 & 16) << 1)));
                                                                int i402 = ((i401 | (-1673951376)) << 1) - (i401 ^ (-1673951376));
                                                                int i403 = i402 << 13;
                                                                int i404 = ((~i403) & i402) | ((~i402) & i403);
                                                                int i405 = i404 >>> 17;
                                                                int i406 = (i404 & (~i405)) | ((~i404) & i405);
                                                                int i407 = i406 << 5;
                                                                ((int[]) objArr134[1])[0] = (i406 & (~i407)) | ((~i406) & i407);
                                                                return objArr134;
                                                            }
                                                            char c12 = (char) ((-2) - (~(-android.text.TextUtils.lastIndexOf(str45, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0))));
                                                            int i408 = -android.view.View.combineMeasuredStates(0, 0);
                                                            java.lang.Object[] objArr135 = new java.lang.Object[1];
                                                            i("\u0000\u0000\u0000\u0000", c12, "坯킠—缑鉅禨螎֕\uea06ꛮ疀", "ㆍ궳뢍恠", (((-1917996239) | i408) << 1) - (i408 ^ (-1917996239)), objArr135);
                                                            java.lang.Object[] objArr136 = {(java.lang.String) objArr135[0]};
                                                            java.lang.Object d47 = com.facetec.sdk.al.d(1450487247);
                                                            if (d47 == null) {
                                                                char blue2 = (char) (android.graphics.Color.blue(0) + 6935);
                                                                int touchSlop3 = android.view.ViewConfiguration.getTouchSlop();
                                                                int argb = android.graphics.Color.argb(0, 0, 0, 0);
                                                                byte b62 = (byte) 0;
                                                                byte b63 = b62;
                                                                java.lang.Object[] objArr137 = new java.lang.Object[1];
                                                                g(b62, b63, b63, objArr137);
                                                                d47 = com.facetec.sdk.al.c(blue2, 2389 - (touchSlop3 >> 8), 23 - argb, -241445065, false, (java.lang.String) objArr137[0], new java.lang.Class[]{java.lang.String.class});
                                                            }
                                                            long longValue23 = ((java.lang.Long) ((java.lang.reflect.Method) d47).invoke(null, objArr136)).longValue();
                                                            long j128 = 1198038945;
                                                            long j129 = 764;
                                                            long j130 = ((int) java.lang.Runtime.getRuntime().totalMemory()) ^ j4;
                                                            long j131 = (j130 | j128) ^ j4;
                                                            long j132 = ((j128 ^ j4) | longValue23) ^ j4;
                                                            long j133 = (765 * j128) + ((-1527) * longValue23) + ((longValue23 | j131) * j129) + ((-1528) * (j132 | ((j130 | longValue23) ^ j4))) + (j129 * (j132 | (((longValue23 ^ j4) | j128) ^ j4) | j131)) + 653137696;
                                                            int i409 = (int) (j133 >> 32);
                                                            int i410 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                                            int i411 = (int) j133;
                                                            int uptimeMillis8 = (int) android.os.SystemClock.uptimeMillis();
                                                            int i412 = ~(1801500055 | uptimeMillis8);
                                                            int i413 = ~uptimeMillis8;
                                                            if (((i409 & (((~((~i410) | (-17825825))) * 433) + 820457844 + (((~(95464629 | i410)) | (-1532691041)) * (-433)) + (((~(i410 | (-1532691041))) | 77638805) * 433))) | (((((-2146893824) | i412) * (-280)) + 297133465 + ((i412 | (~((-364273646) | uptimeMillis8))) * 140) + (((~(uptimeMillis8 | (-345393769))) | (~(i413 | 2146893823)) | (~((-18879878) | i413))) * 140)) & i411)) != 0) {
                                                                java.lang.Object[] objArr138 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, new int[]{0}};
                                                                int freeMemory10 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                                                int i414 = -(-((((~(285596499 | r3)) * (-560)) - 458323433) + ((~(freeMemory10 | (-1315577989))) * (-560)) + (((~(1332621460 | (~freeMemory10))) | 268553027) * 560) + 16));
                                                                int i415 = (i414 & (-1673951376)) + (i414 | (-1673951376));
                                                                int i416 = i415 << 13;
                                                                int i417 = ((~i416) & i415) | ((~i415) & i416);
                                                                int i418 = i417 >>> 17;
                                                                int i419 = (~(i417 & i418)) & (i417 | i418);
                                                                int i420 = i419 << 5;
                                                                ((int[]) objArr138[1])[0] = (i419 & (~i420)) | ((~i419) & i420);
                                                                return objArr138;
                                                            }
                                                            int d48 = com.facetec.sdk.gh.b.d();
                                                            int i421 = ~(1265656673 | (~d48));
                                                            int i422 = (((i421 ^ 98233200) | (98233200 & i421)) * (-235)) + 975932600;
                                                            int i423 = ~(1265656673 | d48);
                                                            int i424 = -(-(((i423 ^ 98233200) | (98233200 & i423)) * (-470)));
                                                            int i425 = (i422 & i424) + (i422 | i424);
                                                            int i426 = ~(d48 | 1341844337);
                                                            int i427 = ((i426 ^ 22045536) | (22045536 & i426)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE;
                                                            int d49 = com.facetec.sdk.gh.b.d();
                                                            int i428 = ~d49;
                                                            int i429 = (i428 ^ 941038878) | (941038878 & i428);
                                                            int i430 = -(-((~((i429 ^ 2143104772) | (2143104772 & i429))) * (-116)));
                                                            int i431 = (1805765818 & i430) + (i430 | 1805765818) + (((941038878 ^ d49) | (941038878 & d49)) * 116);
                                                            int i432 = ~(d49 | (-2143104773));
                                                            int i433 = -(-(((i432 ^ 940903684) | (940903684 & i432)) * 116));
                                                            if ((i425 ^ i427) + ((i427 & i425) << 1) <= (i431 & i433) + (i433 | i431)) {
                                                                java.lang.Object d50 = com.facetec.sdk.al.d(-2029373905);
                                                                if (d50 == null) {
                                                                    char trimmedLength5 = (char) (19038 - android.text.TextUtils.getTrimmedLength(str45));
                                                                    long elapsedRealtime10 = android.os.SystemClock.elapsedRealtime();
                                                                    float length2 = android.graphics.PointF.length(0.0f, 0.0f);
                                                                    byte b64 = (byte) 2;
                                                                    byte b65 = (byte) (b64 - 2);
                                                                    java.lang.Object[] objArr139 = new java.lang.Object[1];
                                                                    g(b64, b65, b65, objArr139);
                                                                    d50 = com.facetec.sdk.al.c(trimmedLength5, 941 - (elapsedRealtime10 > 0L ? 1 : (elapsedRealtime10 == 0L ? 0 : -1)), (length2 > 0.0f ? 1 : (length2 == 0.0f ? 0 : -1)) + 24, 551898327, false, (java.lang.String) objArr139[0], new java.lang.Class[0]);
                                                                }
                                                                long longValue24 = ((java.lang.Long) ((java.lang.reflect.Method) d50).invoke(null, null)).longValue();
                                                                long j134 = -870106921;
                                                                long j135 = j134 ^ j4;
                                                                long j136 = longValue24 ^ j4;
                                                                long freeMemory11 = (((int) java.lang.Runtime.getRuntime().freeMemory()) ^ j4) | j135;
                                                                long j137 = (483 * j134) + (com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE * longValue24) + ((((j135 | j136) ^ j4) | (freeMemory11 ^ j4)) * (-241)) + ((-482) * (j134 | longValue24)) + (241 * (((longValue24 | freeMemory11) ^ j4) | ((j134 | j136) ^ j4))) + 1417024657;
                                                                int elapsedRealtime11 = (int) android.os.SystemClock.elapsedRealtime();
                                                                int i434 = ((int) (j137 >>> 84)) & (((((~elapsedRealtime11) | 1447209003) * 1324) - 818884594) + (((~(elapsedRealtime11 | 2001119275)) | (~((-563892865) | elapsedRealtime11))) * (-1324)) + 1706805048);
                                                                int i435 = ~(((int) android.os.Process.getElapsedCpuTime()) | (-1850457546));
                                                                int i436 = ((int) j137) & ((((-1995101655) | i435) * (-658)) + 1875058837 + ((i435 | 134293513) * 658));
                                                            } else {
                                                                java.lang.Object d51 = com.facetec.sdk.al.d(-2029373905);
                                                                if (d51 == null) {
                                                                    char c13 = (char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 19038);
                                                                    int resolveSize2 = android.view.View.resolveSize(0, 0);
                                                                    int gidForName4 = android.os.Process.getGidForName(str45);
                                                                    byte b66 = (byte) 2;
                                                                    byte b67 = (byte) (b66 - 2);
                                                                    java.lang.Object[] objArr140 = new java.lang.Object[1];
                                                                    g(b66, b67, b67, objArr140);
                                                                    d51 = com.facetec.sdk.al.c(c13, resolveSize2 + 940, gidForName4 + 25, 551898327, false, (java.lang.String) objArr140[0], new java.lang.Class[0]);
                                                                }
                                                                long longValue25 = ((java.lang.Long) ((java.lang.reflect.Method) d51).invoke(null, null)).longValue();
                                                                long j138 = -979458655;
                                                                long j139 = -245;
                                                                long j140 = longValue25 ^ j4;
                                                                long elapsedCpuTime9 = (int) android.os.Process.getElapsedCpuTime();
                                                                long j141 = (j140 | elapsedCpuTime9) ^ j4;
                                                                long j142 = ((-244) * j138) + (com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE * longValue25) + (((((elapsedCpuTime9 ^ j4) | j140) ^ j4) | ((j140 | j138) ^ j4)) * j139) + (j139 * j141) + (com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE * (j141 | j138)) + 1526376391;
                                                                int i437 = ~(((int) java.lang.Runtime.getRuntime().maxMemory()) | (-427387094));
                                                                int i438 = ((int) (j142 >> 32)) & (((((-2138832598) | i437) * (-196)) - 1598004782) + ((i437 | 1711445504) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE));
                                                                int i439 = ~((~android.os.Process.myUid()) | (-2096488327));
                                                                int i440 = ((int) j142) & ((((-2147475423) | i439) * (-970)) + 652876271 + ((i439 | 50987096) * 970));
                                                            }
                                                            cause = th5.getCause();
                                                            if (cause == null) {
                                                                throw cause;
                                                            }
                                                            throw th5;
                                                        }
                                                        f = (h + 1) % 128;
                                                        objArr = new java.lang.Object[]{null, new int[1], new int[]{i325}, new int[]{0}};
                                                        int i441 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                                        int i442 = (((~(25137723 | i441)) | (-1610611648)) * 305) + 1253457024 + (((~((~i441) | 25137723)) | (-1593080237)) * 305) + 16;
                                                        int i443 = ((i442 | (-1673951376)) << 1) - (i442 ^ (-1673951376));
                                                        int i444 = i443 << 13;
                                                        int i445 = ((~i444) & i443) | ((~i443) & i444);
                                                        int i446 = i445 >>> 17;
                                                        int i447 = (~(i445 & i446)) & (i445 | i446);
                                                        int i448 = i447 << 5;
                                                        int[] iArr3 = (int[]) objArr[1];
                                                        int i449 = (i447 & (~i448)) | ((~i447) & i448);
                                                        i9 = 0;
                                                        iArr3[0] = i449;
                                                    }
                                                    c = 3;
                                                    if (((int[]) objArr[c])[i9] != ((int[]) objArr[2])[i9]) {
                                                    }
                                                }
                                            } catch (java.lang.Throwable th13) {
                                                th4 = th13;
                                            }
                                        } else {
                                            str4 = str5;
                                        }
                                        java.lang.Object[] objArr141 = {(java.lang.String) objArr2[0]};
                                        java.lang.Object d52 = com.facetec.sdk.al.d(1590238701);
                                        if (d52 == null) {
                                            char resolveSize3 = (char) android.view.View.resolveSize(0, 0);
                                            long elapsedRealtime12 = android.os.SystemClock.elapsedRealtime();
                                            int threadPriority4 = android.os.Process.getThreadPriority(0);
                                            byte b68 = (byte) 3;
                                            byte b69 = (byte) (b68 - 3);
                                            java.lang.Object[] objArr142 = new java.lang.Object[1];
                                            g(b68, b69, b69, objArr142);
                                            d52 = com.facetec.sdk.al.c(resolveSize3, 2079 - (elapsedRealtime12 > 0L ? 1 : (elapsedRealtime12 == 0L ? 0 : -1)), 24 - ((threadPriority4 + 20) >> 6), -114923755, false, (java.lang.String) objArr142[0], new java.lang.Class[]{java.lang.String.class});
                                        }
                                        java.lang.Object invoke8 = ((java.lang.reflect.Method) d52).invoke(null, objArr141);
                                        if (invoke8 != null) {
                                            int resolveOpacity2 = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                            int d53 = com.facetec.sdk.gh.b.d();
                                            int i450 = (resolveOpacity2 * 677) - 4725;
                                            int i451 = resolveOpacity2 | d53;
                                            int i452 = ((i451 ^ (-8)) | (i451 & (-8))) * (-676);
                                            int i453 = (i450 & i452) + (i450 | i452);
                                            int i454 = ~((resolveOpacity2 ^ (-8)) | (resolveOpacity2 & (-8)));
                                            int i455 = ~d53;
                                            int i456 = ~((i455 & resolveOpacity2) | (i455 ^ resolveOpacity2));
                                            int i457 = ((i454 ^ i456) | (i454 & i456)) * 676;
                                            int i458 = ((i453 | i457) << 1) - (i457 ^ i453);
                                            int i459 = ~resolveOpacity2;
                                            int i460 = resolveOpacity2 | 7;
                                            int i461 = -(-(((~((d53 ^ i460) | (i460 & d53))) | (~((i459 & (-8)) | (i459 ^ (-8)))) | (~((i455 & (-8)) | (i455 ^ (-8))))) * 676));
                                            int i462 = -(-android.text.TextUtils.getTrimmedLength(str4));
                                            int i463 = -(-android.view.View.resolveSizeAndState(0, 0, 0));
                                            java.lang.Object[] objArr143 = new java.lang.Object[1];
                                            j(false, (i458 ^ i461) + ((i461 & i458) << 1), "\u0001\u0001￼\u0001\ufffa\u0005\b", 244 - (~i462), (i463 & 5) + (i463 | 5), objArr143);
                                            if (invoke8.equals((java.lang.String) objArr143[0])) {
                                                int edgeSlop7 = android.view.ViewConfiguration.getEdgeSlop();
                                                int i464 = -android.graphics.Color.blue(0);
                                                java.lang.Object[] objArr144 = new java.lang.Object[1];
                                                j(false, 23 - (edgeSlop7 >> 16), "ￆ\n\u0007\u0007\f\ufff7\ufff9\ufffb\ufffb�\u000b\u000b\b�\n\u000b\u0001\u000b\fￆ\u000b\u0011\u000b", (i464 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) + (i464 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE), 12 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr144);
                                                try {
                                                    java.lang.Object[] objArr145 = {(java.lang.String) objArr144[0]};
                                                    java.lang.Object d54 = com.facetec.sdk.al.d(1590238701);
                                                    if (d54 == null) {
                                                        char argb2 = (char) android.graphics.Color.argb(0, 0, 0, 0);
                                                        long globalActionKeyTimeout3 = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
                                                        float length3 = android.graphics.PointF.length(0.0f, 0.0f);
                                                        byte b70 = (byte) 3;
                                                        byte b71 = (byte) (b70 - 3);
                                                        java.lang.Object[] objArr146 = new java.lang.Object[1];
                                                        g(b70, b71, b71, objArr146);
                                                        d54 = com.facetec.sdk.al.c(argb2, 2079 - (globalActionKeyTimeout3 > 0L ? 1 : (globalActionKeyTimeout3 == 0L ? 0 : -1)), (length3 > 0.0f ? 1 : (length3 == 0.0f ? 0 : -1)) + 24, -114923755, false, (java.lang.String) objArr146[0], new java.lang.Class[]{java.lang.String.class});
                                                    }
                                                    java.lang.String str57 = (java.lang.String) ((java.lang.reflect.Method) d54).invoke(null, objArr145);
                                                    if (str57 != null && (parseInt = java.lang.Integer.parseInt(str57)) != 0) {
                                                        i4 = ((parseInt | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE) << 1) - (parseInt ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE);
                                                        if (i4 != 0) {
                                                        }
                                                    }
                                                } catch (java.lang.Throwable th14) {
                                                    java.lang.Throwable cause4 = th14.getCause();
                                                    if (cause4 != null) {
                                                        throw cause4;
                                                    }
                                                    throw th14;
                                                }
                                            }
                                        }
                                        i4 = 0;
                                        if (i4 != 0) {
                                        }
                                    } catch (java.lang.Throwable th15) {
                                        java.lang.Throwable cause5 = th15.getCause();
                                        if (cause5 != null) {
                                            throw cause5;
                                        }
                                        throw th15;
                                    }
                                    int i465 = -(-android.view.View.resolveSizeAndState(0, 0, 0));
                                    int i466 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                                    int i467 = -(-(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                    objArr2 = new java.lang.Object[1];
                                    j(true, ((i465 | 18) << 1) - (i465 ^ 18), "ￊ\uffff\u0012\u000fￊ\u0010\u0005\n\u0005\n\u000b\t\u0001�\u0000\ufffb\u0011\u000f", (i466 & 236) + (i466 | 236), (i467 & 9) + (i467 | 9), objArr2);
                                }
                            }
                            str2 = str;
                            f = (h + 41) % 128;
                            char lastIndexOf42 = (char) (android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1);
                            int i1162 = -android.widget.ExpandableListView.getPackedPositionChild(0L);
                            java.lang.Object[] objArr652 = new java.lang.Object[1];
                            i("\u0000\u0000\u0000\u0000", lastIndexOf42, "韹砮౩ܢ\uf47e쓰▅쥂ࡳ骧뇰퓭๐손\ua631疝ᐷ黷䑻걯\u2e5f嚨吂", "쐓哈ᴆⱽ", (106219715 ^ i1162) + ((i1162 & 106219715) << 1), objArr652);
                            java.lang.Object[] objArr662 = {(java.lang.String) objArr652[0]};
                            d3 = com.facetec.sdk.al.d(-864328554);
                            if (d3 == null) {
                            }
                            long longValue72 = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, objArr662)).longValue();
                            long j412 = -697251165;
                            int maxMemory22 = (int) java.lang.Runtime.getRuntime().maxMemory();
                            long j422 = com.visa.cbp.getCertUsage.setODAData;
                            long j432 = j412 ^ j4;
                            long j442 = com.visa.cbp.getCertUsage.getODAData;
                            long j452 = maxMemory22;
                            long j462 = j452 ^ j4;
                            long j472 = ((-665) * j412) + (j422 * longValue72) + ((-333) * j432) + ((((j432 | j462) ^ j4) | ((longValue72 | j452) ^ j4)) * j442) + (j442 * (((j462 | longValue72) ^ j4) | ((j432 | j452) ^ j4))) + 1745449585;
                            int freeMemory32 = (int) java.lang.Runtime.getRuntime().freeMemory();
                            int i1172 = ~freeMemory32;
                            int i1182 = ((int) (j472 >> 32)) & ((((~((-1435820667) | i1172)) | (~((-1405745) | freeMemory32)) | (~(1405744 | i1172))) * 959) + 156141465 + (((~(freeMemory32 | (-1435820667))) | (~(i1172 | (-1405745))) | (~(1405744 | freeMemory32))) * 959));
                            int i1192 = ~new java.util.Random().nextInt(1596166097);
                            int i1202 = ((int) j472) & ((((~((-2058401411) | i1192)) | 715174530) * (-241)) + 312228214 + (((~(i1192 | (-1343226881))) | 84164945) * 241));
                            j9 = (i1182 ^ i1202) | (i1182 & i1202);
                            int i1212 = -(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i1222 = -android.view.KeyEvent.keyCodeFromString(str2);
                            int d242 = com.facetec.sdk.gh.b.d();
                            int i1232 = ~i1222;
                            int i1242 = ~((i1232 ^ (-235)) | (i1232 & (-235)));
                            int i1252 = ~d242;
                            int i1262 = (i1252 & i1222) | (i1252 ^ i1222);
                            int i1272 = ~((i1262 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE) | (i1262 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE));
                            int i1282 = -(-(((i1242 ^ i1272) | (i1242 & i1272)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE));
                            int i1292 = ~((i1252 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE) | (i1252 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE));
                            int i1302 = ((((i1222 * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE) - 51246) - (~i1282)) - 1) + (((i1292 & i1222) | (i1292 ^ i1222)) * (-440));
                            int i1312 = i1222 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE;
                            int i1322 = ((i1312 ^ d242) | (i1312 & d242)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE;
                            int i1332 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                            java.lang.Object[] objArr682 = new java.lang.Object[1];
                            j(true, (i1212 & 17) + (i1212 | 17), "\n\u0003\u0011ￍ\u0001\r\u0010\u000eￍ\u0011\u0013\u0012\uffff\u0012\u0011ￍ\u0004", ((i1302 | i1322) << 1) - (i1322 ^ i1302), ((i1332 | 9) << 1) - (i1332 ^ 9), objArr682);
                            java.lang.Object[] objArr692 = {(java.lang.String) objArr682[0]};
                            d4 = com.facetec.sdk.al.d(-864328554);
                            if (d4 == null) {
                            }
                            long longValue82 = ((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr692)).longValue();
                            long j482 = -224748211;
                            long j492 = j482 ^ j4;
                            long j502 = longValue82 ^ j4;
                            java.lang.String str382 = str2;
                            long myUid7 = android.os.Process.myUid();
                            long j512 = 490;
                            long j522 = (491 * j482) + ((-489) * longValue82) + ((-490) * (j492 | j502 | (myUid7 ^ j4))) + ((((myUid7 | j502) ^ j4) | ((j482 | j502) ^ j4)) * j512) + (j512 * j492) + 1272946631;
                            int freeMemory42 = (int) java.lang.Runtime.getRuntime().freeMemory();
                            int i1342 = ((int) (j522 >> 32)) & (((~((-73405570) | freeMemory42)) * (-301)) + 470469780 + (((~(82056385 | freeMemory42)) | (~((~freeMemory42) | 1519282796))) * (-301)) + (((~(freeMemory42 | (-1519282797))) | 82056385) * 301));
                            int i1352 = ~((int) android.os.SystemClock.uptimeMillis());
                            int i1362 = ((int) j522) & ((((~((-85197074) | i1352)) | (~(2143268731 | i1352))) * (-184)) + 1019428157 + (((~(i1352 | (-395619698))) | (~(1832846107 | i1352)) | 310422624) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 555124760);
                            long j532 = (i1342 ^ i1362) | (i1342 & i1362);
                            if (j9 > 0) {
                                int d252 = com.facetec.sdk.gh.b.d();
                                int i1372 = -(-(((~((987755725 ^ d252) | (987755725 & d252))) | 501473449) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
                                i11 = (((-120136431) | i1372) << 1) - (i1372 ^ (-120136431));
                                int i1382 = ~d252;
                                int i1392 = ~((i1382 ^ 987755725) | (987755725 & i1382));
                                i12 = -(-(((i1392 ^ 85983264) | (85983264 & i1392)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
                                int d262 = com.facetec.sdk.gh.b.d();
                                int i1402 = ~d262;
                                int i1412 = ~((170535141 ^ i1402) | (170535141 & i1402));
                                int i1422 = ~(((-2024781946) & d262) | ((-2024781946) ^ d262));
                                int i1432 = 814224485 - (~(-(-(((i1412 ^ i1422) | (i1412 & i1422)) * 1150))));
                                int i1442 = ~((2024781945 & i1402) | (2024781945 ^ i1402));
                                int i1452 = -(-(((i1442 ^ i1422) | (i1422 & i1442)) * (-575)));
                                i13 = (i1432 & i1452) + (i1452 | i1432);
                                int i1462 = ~((d262 ^ 170535141) | (170535141 & d262));
                                int i1472 = ~((i1402 ^ (-170535142)) | ((-170535142) & i1402));
                                i14 = -(-(((i1462 ^ i1472) | (i1462 & i1472)) * 575));
                                if ((i11 & i12) + (i12 | i11) <= (i13 & i14) + (i14 | i13)) {
                                }
                            }
                            java.lang.Object[] objArr722 = new java.lang.Object[1];
                            i("\u0000\u0000\u0000\u0000", (char) ((-1) - android.text.TextUtils.lastIndexOf(str382, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), "韹砮౩ܢ\uf47e쓰▅쥂ࡳ骧뇰퓭๐손\ua631疝ᐷ黷䑻걯\u2e5f嚨吂", "쐓哈ᴆⱽ", 106219716 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr722);
                            java.lang.Object[] objArr732 = {(java.lang.String) objArr722[0]};
                            d5 = com.facetec.sdk.al.d(-864328554);
                            if (d5 == null) {
                            }
                            long longValue92 = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, objArr732)).longValue();
                            long j542 = -132561095;
                            long j552 = -948;
                            long j562 = j542 ^ j4;
                            long j572 = longValue92 ^ j4;
                            long elapsedCpuTime52 = (int) android.os.Process.getElapsedCpuTime();
                            long j582 = ((-947) * j542) + (949 * longValue92) + ((((j572 | elapsedCpuTime52) ^ j4) | j562) * j552) + (j552 * (((elapsedCpuTime52 ^ j4) | (j562 | j572)) ^ j4)) + (948 * (j572 | j542)) + 1180759515;
                            int i1572 = ((int) (j582 >> 32)) & (((((~((-380891117) | r2)) | (-1056335295)) * (-983)) - 194158557) + (((~((~android.os.Process.myPid()) | (-1056335295))) | 675545106) * 983));
                            int maxMemory32 = (int) java.lang.Runtime.getRuntime().maxMemory();
                            int i1582 = ((int) j582) & (((((~((-845288035) | maxMemory32)) | (~((~maxMemory32) | 2012452851))) * (-318)) - 1768149325) + (((~(862130930 | maxMemory32)) | 1150321921) * (-318)) + (((~(maxMemory32 | (-862130931))) | (-1995609956)) * 318));
                            j10 = (i1572 ^ i1582) | (i1572 & i1582);
                            java.lang.Object[] objArr752 = new java.lang.Object[1];
                            i("\u0000\u0000\u0000\u0000", (char) (25977 - (~(-(-(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))))), "똖廽㹰쟠", "呜䗨稵㡥", android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr752);
                            java.lang.Object[] objArr762 = {(java.lang.String) objArr752[0]};
                            d6 = com.facetec.sdk.al.d(-864328554);
                            if (d6 == null) {
                            }
                            long longValue102 = ((java.lang.Long) ((java.lang.reflect.Method) d6).invoke(null, objArr762)).longValue();
                            long j592 = -309522901;
                            long j602 = 130;
                            long j612 = longValue102 ^ j4;
                            long uptimeMillis32 = (int) android.os.SystemClock.uptimeMillis();
                            long j622 = j612 | j592;
                            long j632 = ((-129) * j592) + (131 * longValue102) + ((((j612 | (uptimeMillis32 ^ j4)) | j592) ^ j4) * j602) + ((-260) * (j622 ^ j4)) + (j602 * ((((j592 ^ j4) | longValue102) ^ j4) | ((j622 | uptimeMillis32) ^ j4))) + 1357721321;
                            int uptimeMillis42 = (int) android.os.SystemClock.uptimeMillis();
                            int myUid22 = android.os.Process.myUid();
                            long j642 = (((int) (j632 >> 32)) & ((((~((-775235488) | uptimeMillis42)) | 134218132) * (-566)) + 95277794 + ((~(uptimeMillis42 | (-641017356))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST))) | ((((((~(139570376 | myUid22)) | (-1297722602)) * 336) - 501357939) + (((~((-1297656034) | myUid22)) | 139503808) * (-168)) + (((~((~myUid22) | (-1297656034))) | 139570376) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)) & ((int) j632));
                            if (j10 > 0) {
                            }
                            char minimumFlingVelocity22 = (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            str3 = str382;
                            int i1662 = -android.text.TextUtils.getOffsetBefore(str3, 0);
                            java.lang.Object[] objArr792 = new java.lang.Object[1];
                            i("\u0000\u0000\u0000\u0000", minimumFlingVelocity22, "\ue724㋨鳸ᮈ⬣컗︮", "Ἔ舲″儧", (864170527 & i1662) + (i1662 | 864170527), objArr792);
                            java.lang.String str392 = (java.lang.String) objArr792[0];
                            java.lang.Object[] objArr802 = new java.lang.Object[1];
                            i("\u0000\u0000\u0000\u0000", (char) android.view.KeyEvent.normalizeMetaState(0), "齻긟话柬\udea9蘛⌌㞃㘂\uf63e㥕", "䟆쬷\u20ff敋", (-3459258) - (~(-android.graphics.Color.blue(0))), objArr802);
                            java.lang.String str402 = (java.lang.String) objArr802[0];
                            int indexOf62 = android.text.TextUtils.indexOf(str3, str3, 0);
                            int i1672 = -(-(android.os.Process.myTid() >> 22));
                            int lastIndexOf52 = android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                            int d272 = com.facetec.sdk.gh.b.d();
                            int i1682 = (lastIndexOf52 * com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd) - 4935;
                            int i1692 = ~d272;
                            int i1702 = i1692 | (-6);
                            int i1712 = (lastIndexOf52 ^ 5) | (lastIndexOf52 & 5);
                            int i1722 = ((~((i1702 ^ lastIndexOf52) | (i1702 & lastIndexOf52))) | (~((i1712 & d272) | (i1712 ^ d272)))) * 988;
                            int i1732 = ((i1682 | i1722) << 1) - (i1682 ^ i1722);
                            int i1742 = -(-(((lastIndexOf52 ^ (-6)) | (lastIndexOf52 & (-6))) * (-988)));
                            int i1752 = (i1732 & i1742) + (i1742 | i1732);
                            int i1762 = ~lastIndexOf52;
                            int i1772 = ~((i1762 ^ (-6)) | (i1762 & (-6)));
                            int i1782 = ~((d272 ^ (-6)) | (d272 & (-6)));
                            int i1792 = (i1782 ^ i1772) | (i1782 & i1772);
                            int i1802 = ~(lastIndexOf52 | i1692 | 5);
                            int i1812 = -(-(((i1792 ^ i1802) | (i1792 & i1802)) * 988));
                            java.lang.Object[] objArr812 = new java.lang.Object[1];
                            j(true, 12 - indexOf62, "\u0010\u0016\u0010ￌ\u000b\u0006\uffff\u0010ￌ\n\u0002\u0011", (i1672 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE) + (i1672 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE), ((i1752 | i1812) << 1) - (i1812 ^ i1752), objArr812);
                            java.lang.String str412 = (java.lang.String) objArr812[0];
                            java.lang.Object[] objArr822 = new java.lang.Object[1];
                            i("\u0000\u0000\u0000\u0000", (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), "ꇌᯔ௬秃⼻잱贑驝뷡\uf2be⌎옶", "嶏\ue6a0㗦햓", android.view.ViewConfiguration.getLongPressTimeout() >> 16, objArr822);
                            java.lang.String str422 = (java.lang.String) objArr822[0];
                            int maxKeyCode32 = android.view.KeyEvent.getMaxKeyCode();
                            int keyRepeatDelay2 = android.view.ViewConfiguration.getKeyRepeatDelay() >> 16;
                            java.lang.Object[] objArr832 = new java.lang.Object[1];
                            j(false, (maxKeyCode32 >> 16) + 11, "ￏ\u0002\t\u000eￏ\u0016\u0005\u000e\u0004\u000f\u0012", (keyRepeatDelay2 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE) + (keyRepeatDelay2 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 4, objArr832);
                            java.lang.String str432 = (java.lang.String) objArr832[0];
                            char c82 = (char) (19121 - (~(-android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0))));
                            int i1822 = -(-android.graphics.Color.green(0));
                            java.lang.Object[] objArr842 = new java.lang.Object[1];
                            i("\u0000\u0000\u0000\u0000", c82, "꾺\udc42ᕩ竱མ", "怼ḡ뎓텊", ((-1826741920) & i1822) + (i1822 | (-1826741920)), objArr842);
                            java.lang.String str442 = (java.lang.String) objArr842[0];
                            int i1832 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int scrollBarFadeDuration3 = android.view.ViewConfiguration.getScrollBarFadeDuration();
                            int i1842 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                            java.lang.Object[] objArr852 = new java.lang.Object[1];
                            j(true, ((i1832 | 4) << 1) - (i1832 ^ 4), "\t\u001a\u000bￕ", (scrollBarFadeDuration3 >> 16) + 226, ((i1842 | 4) << 1) - (i1842 ^ 4), objArr852);
                            strArr = new java.lang.String[]{str392, str402, str412, str422, str432, str442, (java.lang.String) objArr852[0]};
                            i2 = 0;
                            while (true) {
                                if (i2 < 7) {
                                }
                                int i1862 = (i2 ^ 87) + ((i2 & 87) << 1);
                                i2 = (i1862 ^ (-86)) + ((i1862 & (-86)) << 1);
                                str3 = str4;
                                strArr = strArr2;
                            }
                            if (i3 == 0) {
                            }
                        } else {
                            j7 = j2;
                            obj2 = invoke3;
                            j8 = j;
                        }
                        if (invoke4 != null) {
                            int i468 = f;
                            int i469 = (i468 & 75) + (i468 | 75);
                            h = i469 % 128;
                            if (i469 % 2 != 0) {
                                java.lang.Object[] objArr147 = {invoke4, 11};
                                java.lang.Object d55 = com.facetec.sdk.al.d(-582857820);
                                if (d55 == null) {
                                    char indexOf11 = (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1);
                                    int red3 = android.graphics.Color.red(0);
                                    int threadPriority5 = android.os.Process.getThreadPriority(0);
                                    byte b72 = (byte) 2;
                                    byte b73 = (byte) (b72 - 2);
                                    java.lang.Object[] objArr148 = new java.lang.Object[1];
                                    g(b72, b73, b73, objArr148);
                                    d55 = com.facetec.sdk.al.c(indexOf11, 2365 - red3, ((threadPriority5 + 20) >> 6) + 24, 2058170716, false, (java.lang.String) objArr148[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                }
                                long longValue26 = ((java.lang.Long) ((java.lang.reflect.Method) d55).invoke(null, objArr147)).longValue();
                                long j143 = 112240541;
                                long j144 = -964;
                                long j145 = longValue26 ^ j4;
                                long myPid7 = android.os.Process.myPid();
                                long j146 = ((-963) * j143) + j144 + (965 * longValue26) + (((j143 ^ j4) | ((j145 | myPid7) ^ j4)) * j144) + (j144 * (((j145 | (myPid7 ^ j4)) ^ j4) | ((j145 | j143) ^ j4))) + 1046956857;
                                int nextInt9 = new java.util.Random().nextInt(1105956068);
                                int i470 = ~new java.util.Random().nextInt(1269399112);
                            } else {
                                java.lang.Object[] objArr149 = {invoke4, 42};
                                java.lang.Object d56 = com.facetec.sdk.al.d(-582857820);
                                if (d56 == null) {
                                    char windowTouchSlop6 = (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                                    int fadingEdgeLength2 = android.view.ViewConfiguration.getFadingEdgeLength();
                                    int indexOf12 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                    byte b74 = (byte) 2;
                                    byte b75 = (byte) (b74 - 2);
                                    java.lang.Object[] objArr150 = new java.lang.Object[1];
                                    g(b74, b75, b75, objArr150);
                                    d56 = com.facetec.sdk.al.c(windowTouchSlop6, 2365 - (fadingEdgeLength2 >> 16), 23 - indexOf12, 2058170716, false, (java.lang.String) objArr150[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                }
                                long longValue27 = ((java.lang.Long) ((java.lang.reflect.Method) d56).invoke(null, objArr149)).longValue();
                                long j147 = 654154788;
                                long j148 = j147 ^ j4;
                                str7 = "";
                                long j149 = 717;
                                obj3 = invoke4;
                                long nextInt10 = new java.util.Random().nextInt();
                                long j150 = nextInt10 ^ j4;
                                long j151 = (j147 | longValue27) ^ j4;
                                long j152 = j148 | (longValue27 ^ j4);
                                long j153 = ((-716) * j147) + (1435 * longValue27) + ((-1434) * (longValue27 | j148)) + ((((j150 | longValue27) ^ j4) | j151 | ((j152 | nextInt10) ^ j4)) * j149) + (j149 * (((longValue27 | nextInt10) ^ j4) | ((j152 | j150) ^ j4) | j151)) + 505042610;
                                int nextInt11 = new java.util.Random().nextInt();
                                int i471 = ((int) (j153 >> 32)) & (((((~((-1480745521) | (~nextInt11))) | (~((-43519110) | nextInt11))) * (-272)) - 1418558646) + (((~(60362125 | nextInt11)) | (-1541107646)) * (-272)) + (((~(nextInt11 | (-60362126))) | 1497588536) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE));
                                int uptimeMillis9 = (int) android.os.SystemClock.uptimeMillis();
                                int i472 = ((int) j153) & ((((-1168785810) | uptimeMillis9) * 376) + 2088992125 + (((~((~uptimeMillis9) | 1935668338)) | (-2013263348)) * (-376)) + (((~(uptimeMillis9 | (-1935668339))) | 922072547) * 376));
                            }
                        }
                        obj3 = invoke4;
                        str7 = "";
                        if (obj2 != null) {
                            java.lang.Object[] objArr151 = {obj2, 42};
                            java.lang.Object d57 = com.facetec.sdk.al.d(-582857820);
                            if (d57 == null) {
                                char keyRepeatTimeout2 = (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                int jumpTapTimeout2 = android.view.ViewConfiguration.getJumpTapTimeout();
                                long currentThreadTimeMillis4 = android.os.SystemClock.currentThreadTimeMillis();
                                byte b76 = (byte) 2;
                                byte b77 = (byte) (b76 - 2);
                                java.lang.Object[] objArr152 = new java.lang.Object[1];
                                g(b76, b77, b77, objArr152);
                                d57 = com.facetec.sdk.al.c(keyRepeatTimeout2, 2365 - (jumpTapTimeout2 >> 16), (currentThreadTimeMillis4 > (-1L) ? 1 : (currentThreadTimeMillis4 == (-1L) ? 0 : -1)) + 23, 2058170716, false, (java.lang.String) objArr152[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                            }
                            long longValue28 = ((java.lang.Long) ((java.lang.reflect.Method) d57).invoke(null, objArr151)).longValue();
                            long j154 = -505443741;
                            long j155 = -445;
                            long j156 = 446;
                            long j157 = j154 ^ j4;
                            long j158 = longValue28 ^ j4;
                            long j159 = (j157 | j158) ^ j4;
                            long myPid8 = android.os.Process.myPid();
                            long j160 = (j155 * j154) + (j155 * longValue28) + ((j159 | (((myPid8 ^ j4) | j158) ^ j4)) * j156) + ((((longValue28 | j157) ^ j4) | (((j154 | j158) | myPid8) ^ j4)) * j156) + (j156 * j159) + 1664641139;
                            int myTid3 = android.os.Process.myTid();
                            int i473 = ((int) (j160 >> 32)) & (((((~(1575935995 | myTid3)) | (~((~myTid3) | (-1281804890)))) * (-318)) - 558815634) + (((~((-1567546970) | myTid3)) | 285742080) * (-318)) + (((~(myTid3 | 1567546969)) | 1290193915) * 318));
                            int myPid9 = android.os.Process.myPid();
                            int i474 = ~myPid9;
                            int i475 = ((int) j160) & ((((((~(i474 | 1898756356)) | (-2075065183)) | (~(461529946 | i474))) * 464) - 1481042299) + (((-176308827) | myPid9) * (-464)) + (((~(myPid9 | 461529946)) | (-2075065183)) * 464));
                        }
                        if (obj3 != null) {
                            java.lang.Object[] objArr153 = {obj3, 42};
                            java.lang.Object d58 = com.facetec.sdk.al.d(-582857820);
                            if (d58 == null) {
                                char jumpTapTimeout3 = (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                                int scrollBarFadeDuration4 = android.view.ViewConfiguration.getScrollBarFadeDuration();
                                float maxVolume = android.media.AudioTrack.getMaxVolume();
                                byte b78 = (byte) 2;
                                byte b79 = (byte) (b78 - 2);
                                java.lang.Object[] objArr154 = new java.lang.Object[1];
                                g(b78, b79, b79, objArr154);
                                d58 = com.facetec.sdk.al.c(jumpTapTimeout3, 2365 - (scrollBarFadeDuration4 >> 16), 25 - (maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1)), 2058170716, false, (java.lang.String) objArr154[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                            }
                            long longValue29 = ((java.lang.Long) ((java.lang.reflect.Method) d58).invoke(null, objArr153)).longValue();
                            long j161 = -302545034;
                            long j162 = -661;
                            long elapsedCpuTime10 = (int) android.os.Process.getElapsedCpuTime();
                            long j163 = j161 ^ j4;
                            long j164 = longValue29 ^ j4;
                            long j165 = (j162 * j161) + (j162 * longValue29) + (1324 * ((elapsedCpuTime10 ^ j4) | ((j163 | j164) ^ j4))) + ((-1324) * (((j161 | elapsedCpuTime10) ^ j4) | ((elapsedCpuTime10 | longValue29) ^ j4))) + (662 * (((longValue29 | j163) ^ j4) | ((j164 | j161) ^ j4))) + 1461742432;
                            int freeMemory12 = (int) java.lang.Runtime.getRuntime().freeMemory();
                            int i476 = ((int) (j165 >> 32)) & (((~((-411297377) | freeMemory12)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) + 2095902238 + (((~((~freeMemory12) | (-411297377))) | 1714165771) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
                            int i477 = ((int) j165) & (((((~((-312579848) | r2)) | (-1124646563)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) - 951306311) + (((~((~((int) android.os.SystemClock.elapsedRealtime())) | (-312579848))) | 278987013) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
                        }
                        str = str7;
                        int i4110 = -(-android.text.TextUtils.indexOf(str, str, 0));
                        int i4210 = -(android.view.ViewConfiguration.getScrollBarSize() >> 8);
                        java.lang.Object[] objArr202 = new java.lang.Object[1];
                        j(false, ((i4110 | 8) << 1) - (i4110 ^ 8), "￼\ufffa\ufff7\u0003�\u0011\u000b\ufff9", ((i4210 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) << 1) - (i4210 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE), 7 - (~android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr202);
                        java.lang.String str102 = (java.lang.String) objArr202[0];
                        int lastIndexOf22 = android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                        char c22 = (char) (((47200 | lastIndexOf22) << 1) - (lastIndexOf22 ^ 47200));
                        java.lang.Object[] objArr212 = new java.lang.Object[1];
                        i("\u0000\u0000\u0000\u0000", c22, "棬潩Ꙧ䏷䏟ᤷ", "俐驊忭\uf7b8", android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr212);
                        java.lang.String str112 = (java.lang.String) objArr212[0];
                        char resolveSizeAndState22 = (char) android.view.View.resolveSizeAndState(0, 0, 0);
                        int i4310 = -(android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
                        java.lang.Object[] objArr222 = new java.lang.Object[1];
                        i("\u0000\u0000\u0000\u0000", resolveSizeAndState22, "鍟䒮螉\uf736蔴❼繊", "꣰圄禥싉", (((-1521023832) | i4310) << 1) - (i4310 ^ (-1521023832)), objArr222);
                        java.lang.String str122 = (java.lang.String) objArr222[0];
                        java.lang.Object[] objArr232 = new java.lang.Object[1];
                        i("\u0000\u0000\u0000\u0000", (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), "\uda3b\ue6baƲ捈\u009f\ue735箁鋾ᖖ", "譐\udc03\u218c疠", android.view.View.MeasureSpec.getSize(0) - 1931738229, objArr232);
                        java.lang.String str132 = (java.lang.String) objArr232[0];
                        int i4410 = -android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                        int i4510 = -(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        java.lang.Object[] objArr242 = new java.lang.Object[1];
                        j(true, (i4410 ^ 5) + ((i4410 & 5) << 1), "\u0001\u0001\u0004\ufffb\u0004￼", (i4510 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) + (i4510 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE), 0 - (~(-(android.view.ViewConfiguration.getScrollBarSize() >> 8))), objArr242);
                        java.lang.String str142 = (java.lang.String) objArr242[0];
                        java.lang.Object[] objArr252 = new java.lang.Object[1];
                        i("\u0000\u0000\u0000\u0000", (char) (16855 - (~(-(-(android.os.Process.myPid() >> 22))))), "ᥝ궯ⳗ㝱ꃒ쬭䞍돵侚儈\u0e8b羹菣", "\udfb3狱\ud8c1㵁", (-1049431585) - (~android.os.Process.getGidForName(str)), objArr252);
                        java.lang.String str152 = (java.lang.String) objArr252[0];
                        int edgeSlop8 = android.view.ViewConfiguration.getEdgeSlop() >> 16;
                        char c32 = (char) ((48763 & edgeSlop8) + (edgeSlop8 | 48763));
                        int gidForName5 = android.os.Process.getGidForName(str);
                        java.lang.Object[] objArr262 = new java.lang.Object[1];
                        i("\u0000\u0000\u0000\u0000", c32, "풍둴蜄蛓䳨", "ﲮ₉笶达", (908102141 ^ gidForName5) + ((gidForName5 & 908102141) << 1), objArr262);
                        java.lang.String str162 = (java.lang.String) objArr262[0];
                        java.lang.Object[] objArr272 = new java.lang.Object[1];
                        i("\u0000\u0000\u0000\u0000", (char) (android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 49183), "媽꼸舵篃衧築", "誈魰Ṃ\ue9c0", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr272);
                        java.lang.String str172 = (java.lang.String) objArr272[0];
                        java.lang.Object[] objArr282 = new java.lang.Object[1];
                        i("\u0000\u0000\u0000\u0000", (char) (36852 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), "箶朰", "䧠툼\uf4d9ꪏ", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr282);
                        java.lang.String str182 = (java.lang.String) objArr282[0];
                        java.lang.Object[] objArr292 = new java.lang.Object[1];
                        i("\u0000\u0000\u0000\u0000", (char) (android.view.View.MeasureSpec.getMode(0) + 49582), "\ue33a⚺\uee59\ue0aa뢣䳴遲읱\uf75e땲䬐擠켠㾒\uefa3쬛", "ኀ빫꺗菁", android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr292);
                        java.lang.String str192 = (java.lang.String) objArr292[0];
                        int maxKeyCode4 = android.view.KeyEvent.getMaxKeyCode() >> 16;
                        int d142 = com.facetec.sdk.gh.b.d();
                        int i4610 = maxKeyCode4 * (-963);
                        int i478 = (i4610 & (-964)) + (i4610 | (-964)) + 9650;
                        int i482 = ~maxKeyCode4;
                        int i492 = ~((d142 ^ (-11)) | (d142 & (-11)));
                        int i502 = ((i482 ^ i492) | (i482 & i492)) * (-964);
                        int i512 = ((i478 | i502) << 1) - (i502 ^ i478);
                        int i522 = ~((~d142) | (-11));
                        int i532 = ~(maxKeyCode4 | (-11));
                        int i542 = ((i532 ^ i522) | (i532 & i522)) * (-964);
                        int i552 = -android.view.KeyEvent.getDeadChar(0, 0);
                        int i562 = -(-android.graphics.ImageFormat.getBitsPerPixel(0));
                        java.lang.Object[] objArr302 = new java.lang.Object[1];
                        j(true, (i512 & i542) + (i542 | i512), "\u000fￋ\u0001\u0004\ufffe\u0011\u0004\f\t\u0000", (i552 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE) + (i552 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE), (i562 ^ 10) + ((i562 & 10) << 1), objArr302);
                        java.lang.String str202 = (java.lang.String) objArr302[0];
                        java.lang.Object[] objArr312 = new java.lang.Object[1];
                        j(true, android.view.MotionEvent.axisFromString(str) + 9, "\uffff\u0002\ufff5\u0006\ufff7\u0003\u0006\u0004", 243 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.view.View.getDefaultSize(0, 0) + 8, objArr312);
                        java.lang.String str212 = (java.lang.String) objArr312[0];
                        long elapsedCpuTime22 = android.os.Process.getElapsedCpuTime();
                        int i572 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int i582 = (i572 * (-391)) - 47190;
                        int d152 = com.facetec.sdk.gh.b.d() | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE;
                        int i592 = ~(i572 | (-243));
                        int i602 = ~d152;
                        int i612 = (i592 | i602) * (-196);
                        int i622 = ((i582 | i612) << 1) - (i582 ^ i612);
                        int i632 = -(-((i572 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE) * my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY));
                        int i642 = ~i572;
                        int i652 = ~((i642 ^ (-243)) | (i642 & (-243)));
                        java.lang.Object[] objArr322 = new java.lang.Object[1];
                        j(true, 13 - (elapsedCpuTime22 > 0L ? 1 : (elapsedCpuTime22 == 0L ? 0 : -1)), "\u0005\ufff9￼\u0005\b\u0006\ufffa\n\ufff9\ufffb\u0002\u0002", (i622 ^ i632) + ((i632 & i622) << 1) + (((i652 & i602) | (i652 ^ i602)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE), android.text.TextUtils.getCapsMode(str, 0, 0) + 6, objArr322);
                        java.lang.String str222 = (java.lang.String) objArr322[0];
                        char minimumFlingVelocity3 = (char) (46076 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        int lastIndexOf32 = android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                        java.lang.Object[] objArr332 = new java.lang.Object[1];
                        i("\u0000\u0000\u0000\u0000", minimumFlingVelocity3, "聲\udbf3딒샄꩗偼\uf8ac\udf21ⷁ䊓빼₼죇꾲", "㲨峾ﱘ᮳", ((lastIndexOf32 | 1) << 1) - (lastIndexOf32 ^ 1), objArr332);
                        java.lang.String str232 = (java.lang.String) objArr332[0];
                        java.lang.Object[] objArr342 = new java.lang.Object[1];
                        i("\u0000\u0000\u0000\u0000", (char) android.view.KeyEvent.keyCodeFromString(str), "ᩴﴬ洜愥ꚝ\ueb93䆖", "\uefdf\uf7b4◣㏪", (-470305554) - (~(-(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))), objArr342);
                        java.lang.String str242 = (java.lang.String) objArr342[0];
                        java.lang.Object[] objArr352 = new java.lang.Object[1];
                        i("\u0000\u0000\u0000\u0000", (char) (0 - (~(-(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))))), "⠍u蕂䥓\udaa5\uf5f0洉", "ᮒ☶撚妈", (-1859766758) - (~(-(-android.graphics.drawable.Drawable.resolveOpacity(0, 0)))), objArr352);
                        java.lang.String str252 = (java.lang.String) objArr352[0];
                        java.lang.Object[] objArr362 = new java.lang.Object[1];
                        i("\u0000\u0000\u0000\u0000", (char) android.graphics.Color.green(0), "襷\uf5f2㤚正\uf812溻୕", "㥿პ힅ﾐ", android.view.Gravity.getAbsoluteGravity(0, 0) - 2062492103, objArr362);
                        java.lang.String str262 = (java.lang.String) objArr362[0];
                        int i662 = -android.graphics.Color.argb(0, 0, 0, 0);
                        java.lang.Object[] objArr372 = new java.lang.Object[1];
                        i("\u0000\u0000\u0000\u0000", (char) ((i662 ^ 30780) + ((i662 & 30780) << 1)), "渰潆", "ẟ\uf2ad㰨╸", android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr372);
                        java.lang.String str272 = (java.lang.String) objArr372[0];
                        java.lang.Object[] objArr382 = new java.lang.Object[1];
                        i("\u0000\u0000\u0000\u0000", (char) android.view.View.resolveSizeAndState(0, 0, 0), "\u12c7綪뒩甫녁\udd1fꅙ丰ꖐ풢鸓\ue5f3덒蛙⇰웳硻犙흁\ue6ec", "쾚戧\ued72录", android.view.ViewConfiguration.getWindowTouchSlop() >> 8, objArr382);
                        java.lang.String str282 = (java.lang.String) objArr382[0];
                        int i672 = (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int d162 = com.facetec.sdk.gh.b.d();
                        int i682 = ((i672 * 495) - 1417375) + (((i672 ^ (-2876)) | (i672 & (-2876))) * (-988));
                        int i692 = ~i672;
                        int i702 = ~d162;
                        int i712 = -(-(((i692 & 2875) | (i692 ^ 2875) | i702) * 494));
                        int i722 = ~(i692 | (-2876));
                        int i732 = ~((i702 ^ 2875) | (i702 & 2875));
                        int i742 = (i732 ^ i722) | (i732 & i722);
                        int i752 = ~((i672 ^ 2875) | (i672 & 2875));
                        char c42 = (char) ((i682 & i712) + (i682 | i712) + (((i752 ^ i742) | (i752 & i742)) * 494));
                        int i762 = -android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                        java.lang.Object[] objArr392 = new java.lang.Object[1];
                        i("\u0000\u0000\u0000\u0000", c42, "㜗뎇꾹裣ᓿ\udee5", "峈훂㳞̋", (~i762) + (i762 << 1), objArr392);
                        java.lang.String str292 = (java.lang.String) objArr392[0];
                        int i772 = -android.text.TextUtils.indexOf(str, str, 0);
                        int i782 = -android.view.MotionEvent.axisFromString(str);
                        int d172 = com.facetec.sdk.gh.b.d();
                        int i792 = i782 * (-109);
                        int i802 = ~i782;
                        int i812 = ~((d172 ^ 251) | (d172 & 251));
                        int i822 = (((i792 | 27861) << 1) - (i792 ^ 27861)) + (((i802 ^ i812) | (i802 & i812)) * (-220));
                        int i832 = ~(i782 | 251);
                        int i842 = ((i812 ^ i832) | (i812 & i832)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE;
                        int i852 = (i822 & i842) + (i842 | i822);
                        int i862 = ~((i802 ^ 251) | (i802 & 251));
                        int i872 = ~(i782 | (-252));
                        int i882 = ((i872 ^ i862) | (i872 & i862)) * 110;
                        java.lang.Object[] objArr402 = new java.lang.Object[1];
                        j(false, (i772 & 2) + (i772 | 2), "\uffff\u0001", (i852 ^ i882) + ((i882 & i852) << 1), 2 - (~(-(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))), objArr402);
                        java.lang.String str302 = (java.lang.String) objArr402[0];
                        int maxKeyCode22 = android.view.KeyEvent.getMaxKeyCode() >> 16;
                        int d182 = com.facetec.sdk.gh.b.d();
                        int i892 = ~maxKeyCode22;
                        int i902 = ~(48627 | i892);
                        int i912 = ~d182;
                        int i922 = (i912 ^ (-48628)) | ((-48628) & i912);
                        int i932 = ~((i922 ^ maxKeyCode22) | (maxKeyCode22 & i922));
                        int i942 = ~((i892 & (-48628)) | ((-48628) ^ i892));
                        int i952 = ((maxKeyCode22 * (-575)) - 27960525) + (((~(d182 | (-48628))) | i942) * 576) + (((i932 & i902) | (i902 ^ i932)) * 576);
                        int i962 = i942 * 576;
                        java.lang.Object[] objArr412 = new java.lang.Object[1];
                        i("\u0000\u0000\u0000\u0000", (char) ((i952 ^ i962) + ((i952 & i962) << 1)), "塾誙ꋫ\u0b81鏁ㆌ븗ﯡ\u0ee8喋筡啹ὁ❴商㹟", "ꦤ꣯\uf3af\udcbd", android.graphics.Color.red(0), objArr412);
                        java.lang.String str312 = (java.lang.String) objArr412[0];
                        char size22 = (char) android.view.View.MeasureSpec.getSize(0);
                        int jumpTapTimeout4 = android.view.ViewConfiguration.getJumpTapTimeout() >> 16;
                        java.lang.Object[] objArr422 = new java.lang.Object[1];
                        i("\u0000\u0000\u0000\u0000", size22, "ᨺ췾㽭圡蝛᧴\ua83eꦞ㺷", "ꣾﾀ楖\ud885", (1459585192 ^ jumpTapTimeout4) + ((jumpTapTimeout4 & 1459585192) << 1), objArr422);
                        java.lang.String str322 = (java.lang.String) objArr422[0];
                        int i972 = -(-android.graphics.Color.alpha(0));
                        int edgeSlop22 = android.view.ViewConfiguration.getEdgeSlop();
                        int edgeSlop32 = android.view.ViewConfiguration.getEdgeSlop() >> 16;
                        java.lang.Object[] objArr432 = new java.lang.Object[1];
                        j(true, (i972 & 10) + (i972 | 10), "\u0000\ufffe￼\r\u000f\uffd1\u0003\u000f￼\u000b", 237 - (edgeSlop22 >> 16), ((edgeSlop32 | 5) << 1) - (edgeSlop32 ^ 5), objArr432);
                        java.lang.String str332 = (java.lang.String) objArr432[0];
                        char axisFromString3 = (char) ((-1) - android.view.MotionEvent.axisFromString(str));
                        int threadPriority6 = android.os.Process.getThreadPriority(0);
                        int i982 = -((((threadPriority6 | 20) << 1) - (threadPriority6 ^ 20)) >> 6);
                        java.lang.Object[] objArr442 = new java.lang.Object[1];
                        i("\u0000\u0000\u0000\u0000", axisFromString3, "㣥\udd7d휍욄梆哯뒑蹕섪㉅婸", "蓃餝ှ廭", (1050221956 & i982) + (i982 | 1050221956), objArr442);
                        java.lang.String str342 = (java.lang.String) objArr442[0];
                        java.lang.Object[] objArr452 = new java.lang.Object[1];
                        i("\u0000\u0000\u0000\u0000", (char) (0 - (~(-(-android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask))))), "븠㊩ꁘ佖ٳꊬ옔殎귶∸\uf446", "얩㴯ޡꅋ", android.text.TextUtils.getTrimmedLength(str) - 1589825595, objArr452);
                        java.lang.String str352 = (java.lang.String) objArr452[0];
                        int i992 = -android.text.TextUtils.getTrimmedLength(str);
                        java.lang.Object[] objArr462 = new java.lang.Object[1];
                        i("\u0000\u0000\u0000\u0000", (char) ((51984 ^ i992) + ((i992 & 51984) << 1)), "枲㙻᭱۵省糓鱐倂˥\ue96a綱ͪ巒뤺뀗", "\uddc9䆙Ⴌ峋", (android.os.Process.myPid() >> 22) - 1404986915, objArr462);
                        java.lang.String str362 = (java.lang.String) objArr462[0];
                        int rgb4 = android.graphics.Color.rgb(0, 0, 0);
                        int resolveSizeAndState32 = android.view.View.resolveSizeAndState(0, 0, 0);
                        java.lang.Object[] objArr472 = new java.lang.Object[1];
                        j(false, (-16777202) - rgb4, "\f\u0000\ufff5\u0002\uffff\u0006\b\u0001\n￼\u0001\ufff7\ufff2\u0006", (resolveSizeAndState32 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE) + ((resolveSizeAndState32 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE) << 1), 5 - (~(-(-android.view.View.resolveSize(0, 0)))), objArr472);
                        java.lang.String[] strArr42 = {str102, str112, str122, str132, str142, str152, str162, str172, str182, str192, str202, str212, str222, str232, str242, str252, str262, str272, str282, str292, str302, str312, str322, str332, str342, str352, str362, (java.lang.String) objArr472[0]};
                        java.lang.Object[] objArr482 = new java.lang.Object[1];
                        i("\u0000\u0000\u0000\u0000", (char) android.view.KeyEvent.keyCodeFromString(str), "㟧윭셟뜒誗ꯠ庪⾬\ue197ࢩ쾌", "쬗篃ᤧ龍", 662422474 - (~(-android.view.View.resolveSizeAndState(0, 0, 0))), objArr482);
                        java.lang.Object[] objArr492 = {(java.lang.String) objArr482[0]};
                        d2 = com.facetec.sdk.al.d(1590238701);
                        if (d2 == null) {
                        }
                        invoke = ((java.lang.reflect.Method) d2).invoke(null, objArr492);
                        if (invoke != null) {
                        }
                        str2 = str;
                        f = (h + 41) % 128;
                        char lastIndexOf422 = (char) (android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1);
                        int i11622 = -android.widget.ExpandableListView.getPackedPositionChild(0L);
                        java.lang.Object[] objArr6522 = new java.lang.Object[1];
                        i("\u0000\u0000\u0000\u0000", lastIndexOf422, "韹砮౩ܢ\uf47e쓰▅쥂ࡳ骧뇰퓭๐손\ua631疝ᐷ黷䑻걯\u2e5f嚨吂", "쐓哈ᴆⱽ", (106219715 ^ i11622) + ((i11622 & 106219715) << 1), objArr6522);
                        java.lang.Object[] objArr6622 = {(java.lang.String) objArr6522[0]};
                        d3 = com.facetec.sdk.al.d(-864328554);
                        if (d3 == null) {
                        }
                        long longValue722 = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, objArr6622)).longValue();
                        long j4122 = -697251165;
                        int maxMemory222 = (int) java.lang.Runtime.getRuntime().maxMemory();
                        long j4222 = com.visa.cbp.getCertUsage.setODAData;
                        long j4322 = j4122 ^ j4;
                        long j4422 = com.visa.cbp.getCertUsage.getODAData;
                        long j4522 = maxMemory222;
                        long j4622 = j4522 ^ j4;
                        long j4722 = ((-665) * j4122) + (j4222 * longValue722) + ((-333) * j4322) + ((((j4322 | j4622) ^ j4) | ((longValue722 | j4522) ^ j4)) * j4422) + (j4422 * (((j4622 | longValue722) ^ j4) | ((j4322 | j4522) ^ j4))) + 1745449585;
                        int freeMemory322 = (int) java.lang.Runtime.getRuntime().freeMemory();
                        int i11722 = ~freeMemory322;
                        int i11822 = ((int) (j4722 >> 32)) & ((((~((-1435820667) | i11722)) | (~((-1405745) | freeMemory322)) | (~(1405744 | i11722))) * 959) + 156141465 + (((~(freeMemory322 | (-1435820667))) | (~(i11722 | (-1405745))) | (~(1405744 | freeMemory322))) * 959));
                        int i11922 = ~new java.util.Random().nextInt(1596166097);
                        int i12022 = ((int) j4722) & ((((~((-2058401411) | i11922)) | 715174530) * (-241)) + 312228214 + (((~(i11922 | (-1343226881))) | 84164945) * 241));
                        j9 = (i11822 ^ i12022) | (i11822 & i12022);
                        int i12122 = -(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i12222 = -android.view.KeyEvent.keyCodeFromString(str2);
                        int d2422 = com.facetec.sdk.gh.b.d();
                        int i12322 = ~i12222;
                        int i12422 = ~((i12322 ^ (-235)) | (i12322 & (-235)));
                        int i12522 = ~d2422;
                        int i12622 = (i12522 & i12222) | (i12522 ^ i12222);
                        int i12722 = ~((i12622 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE) | (i12622 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE));
                        int i12822 = -(-(((i12422 ^ i12722) | (i12422 & i12722)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE));
                        int i12922 = ~((i12522 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE) | (i12522 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE));
                        int i13022 = ((((i12222 * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE) - 51246) - (~i12822)) - 1) + (((i12922 & i12222) | (i12922 ^ i12222)) * (-440));
                        int i13122 = i12222 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE;
                        int i13222 = ((i13122 ^ d2422) | (i13122 & d2422)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE;
                        int i13322 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                        java.lang.Object[] objArr6822 = new java.lang.Object[1];
                        j(true, (i12122 & 17) + (i12122 | 17), "\n\u0003\u0011ￍ\u0001\r\u0010\u000eￍ\u0011\u0013\u0012\uffff\u0012\u0011ￍ\u0004", ((i13022 | i13222) << 1) - (i13222 ^ i13022), ((i13322 | 9) << 1) - (i13322 ^ 9), objArr6822);
                        java.lang.Object[] objArr6922 = {(java.lang.String) objArr6822[0]};
                        d4 = com.facetec.sdk.al.d(-864328554);
                        if (d4 == null) {
                        }
                        long longValue822 = ((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr6922)).longValue();
                        long j4822 = -224748211;
                        long j4922 = j4822 ^ j4;
                        long j5022 = longValue822 ^ j4;
                        java.lang.String str3822 = str2;
                        long myUid72 = android.os.Process.myUid();
                        long j5122 = 490;
                        long j5222 = (491 * j4822) + ((-489) * longValue822) + ((-490) * (j4922 | j5022 | (myUid72 ^ j4))) + ((((myUid72 | j5022) ^ j4) | ((j4822 | j5022) ^ j4)) * j5122) + (j5122 * j4922) + 1272946631;
                        int freeMemory422 = (int) java.lang.Runtime.getRuntime().freeMemory();
                        int i13422 = ((int) (j5222 >> 32)) & (((~((-73405570) | freeMemory422)) * (-301)) + 470469780 + (((~(82056385 | freeMemory422)) | (~((~freeMemory422) | 1519282796))) * (-301)) + (((~(freeMemory422 | (-1519282797))) | 82056385) * 301));
                        int i13522 = ~((int) android.os.SystemClock.uptimeMillis());
                        int i13622 = ((int) j5222) & ((((~((-85197074) | i13522)) | (~(2143268731 | i13522))) * (-184)) + 1019428157 + (((~(i13522 | (-395619698))) | (~(1832846107 | i13522)) | 310422624) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 555124760);
                        long j5322 = (i13422 ^ i13622) | (i13422 & i13622);
                        if (j9 > 0) {
                        }
                        java.lang.Object[] objArr7222 = new java.lang.Object[1];
                        i("\u0000\u0000\u0000\u0000", (char) ((-1) - android.text.TextUtils.lastIndexOf(str3822, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), "韹砮౩ܢ\uf47e쓰▅쥂ࡳ骧뇰퓭๐손\ua631疝ᐷ黷䑻걯\u2e5f嚨吂", "쐓哈ᴆⱽ", 106219716 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr7222);
                        java.lang.Object[] objArr7322 = {(java.lang.String) objArr7222[0]};
                        d5 = com.facetec.sdk.al.d(-864328554);
                        if (d5 == null) {
                        }
                        long longValue922 = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, objArr7322)).longValue();
                        long j5422 = -132561095;
                        long j5522 = -948;
                        long j5622 = j5422 ^ j4;
                        long j5722 = longValue922 ^ j4;
                        long elapsedCpuTime522 = (int) android.os.Process.getElapsedCpuTime();
                        long j5822 = ((-947) * j5422) + (949 * longValue922) + ((((j5722 | elapsedCpuTime522) ^ j4) | j5622) * j5522) + (j5522 * (((elapsedCpuTime522 ^ j4) | (j5622 | j5722)) ^ j4)) + (948 * (j5722 | j5422)) + 1180759515;
                        int i15722 = ((int) (j5822 >> 32)) & (((((~((-380891117) | r2)) | (-1056335295)) * (-983)) - 194158557) + (((~((~android.os.Process.myPid()) | (-1056335295))) | 675545106) * 983));
                        int maxMemory322 = (int) java.lang.Runtime.getRuntime().maxMemory();
                        int i15822 = ((int) j5822) & (((((~((-845288035) | maxMemory322)) | (~((~maxMemory322) | 2012452851))) * (-318)) - 1768149325) + (((~(862130930 | maxMemory322)) | 1150321921) * (-318)) + (((~(maxMemory322 | (-862130931))) | (-1995609956)) * 318));
                        j10 = (i15722 ^ i15822) | (i15722 & i15822);
                        java.lang.Object[] objArr7522 = new java.lang.Object[1];
                        i("\u0000\u0000\u0000\u0000", (char) (25977 - (~(-(-(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))))), "똖廽㹰쟠", "呜䗨稵㡥", android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr7522);
                        java.lang.Object[] objArr7622 = {(java.lang.String) objArr7522[0]};
                        d6 = com.facetec.sdk.al.d(-864328554);
                        if (d6 == null) {
                        }
                        long longValue1022 = ((java.lang.Long) ((java.lang.reflect.Method) d6).invoke(null, objArr7622)).longValue();
                        long j5922 = -309522901;
                        long j6022 = 130;
                        long j6122 = longValue1022 ^ j4;
                        long uptimeMillis322 = (int) android.os.SystemClock.uptimeMillis();
                        long j6222 = j6122 | j5922;
                        long j6322 = ((-129) * j5922) + (131 * longValue1022) + ((((j6122 | (uptimeMillis322 ^ j4)) | j5922) ^ j4) * j6022) + ((-260) * (j6222 ^ j4)) + (j6022 * ((((j5922 ^ j4) | longValue1022) ^ j4) | ((j6222 | uptimeMillis322) ^ j4))) + 1357721321;
                        int uptimeMillis422 = (int) android.os.SystemClock.uptimeMillis();
                        int myUid222 = android.os.Process.myUid();
                        long j6422 = (((int) (j6322 >> 32)) & ((((~((-775235488) | uptimeMillis422)) | 134218132) * (-566)) + 95277794 + ((~(uptimeMillis422 | (-641017356))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST))) | ((((((~(139570376 | myUid222)) | (-1297722602)) * 336) - 501357939) + (((~((-1297656034) | myUid222)) | 139503808) * (-168)) + (((~((~myUid222) | (-1297656034))) | 139570376) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)) & ((int) j6322));
                        if (j10 > 0) {
                        }
                        char minimumFlingVelocity222 = (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        str3 = str3822;
                        int i16622 = -android.text.TextUtils.getOffsetBefore(str3, 0);
                        java.lang.Object[] objArr7922 = new java.lang.Object[1];
                        i("\u0000\u0000\u0000\u0000", minimumFlingVelocity222, "\ue724㋨鳸ᮈ⬣컗︮", "Ἔ舲″儧", (864170527 & i16622) + (i16622 | 864170527), objArr7922);
                        java.lang.String str3922 = (java.lang.String) objArr7922[0];
                        java.lang.Object[] objArr8022 = new java.lang.Object[1];
                        i("\u0000\u0000\u0000\u0000", (char) android.view.KeyEvent.normalizeMetaState(0), "齻긟话柬\udea9蘛⌌㞃㘂\uf63e㥕", "䟆쬷\u20ff敋", (-3459258) - (~(-android.graphics.Color.blue(0))), objArr8022);
                        java.lang.String str4022 = (java.lang.String) objArr8022[0];
                        int indexOf622 = android.text.TextUtils.indexOf(str3, str3, 0);
                        int i16722 = -(-(android.os.Process.myTid() >> 22));
                        int lastIndexOf522 = android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                        int d2722 = com.facetec.sdk.gh.b.d();
                        int i16822 = (lastIndexOf522 * com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd) - 4935;
                        int i16922 = ~d2722;
                        int i17022 = i16922 | (-6);
                        int i17122 = (lastIndexOf522 ^ 5) | (lastIndexOf522 & 5);
                        int i17222 = ((~((i17022 ^ lastIndexOf522) | (i17022 & lastIndexOf522))) | (~((i17122 & d2722) | (i17122 ^ d2722)))) * 988;
                        int i17322 = ((i16822 | i17222) << 1) - (i16822 ^ i17222);
                        int i17422 = -(-(((lastIndexOf522 ^ (-6)) | (lastIndexOf522 & (-6))) * (-988)));
                        int i17522 = (i17322 & i17422) + (i17422 | i17322);
                        int i17622 = ~lastIndexOf522;
                        int i17722 = ~((i17622 ^ (-6)) | (i17622 & (-6)));
                        int i17822 = ~((d2722 ^ (-6)) | (d2722 & (-6)));
                        int i17922 = (i17822 ^ i17722) | (i17822 & i17722);
                        int i18022 = ~(lastIndexOf522 | i16922 | 5);
                        int i18122 = -(-(((i17922 ^ i18022) | (i17922 & i18022)) * 988));
                        java.lang.Object[] objArr8122 = new java.lang.Object[1];
                        j(true, 12 - indexOf622, "\u0010\u0016\u0010ￌ\u000b\u0006\uffff\u0010ￌ\n\u0002\u0011", (i16722 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE) + (i16722 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE), ((i17522 | i18122) << 1) - (i18122 ^ i17522), objArr8122);
                        java.lang.String str4122 = (java.lang.String) objArr8122[0];
                        java.lang.Object[] objArr8222 = new java.lang.Object[1];
                        i("\u0000\u0000\u0000\u0000", (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), "ꇌᯔ௬秃⼻잱贑驝뷡\uf2be⌎옶", "嶏\ue6a0㗦햓", android.view.ViewConfiguration.getLongPressTimeout() >> 16, objArr8222);
                        java.lang.String str4222 = (java.lang.String) objArr8222[0];
                        int maxKeyCode322 = android.view.KeyEvent.getMaxKeyCode();
                        int keyRepeatDelay22 = android.view.ViewConfiguration.getKeyRepeatDelay() >> 16;
                        java.lang.Object[] objArr8322 = new java.lang.Object[1];
                        j(false, (maxKeyCode322 >> 16) + 11, "ￏ\u0002\t\u000eￏ\u0016\u0005\u000e\u0004\u000f\u0012", (keyRepeatDelay22 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE) + (keyRepeatDelay22 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 4, objArr8322);
                        java.lang.String str4322 = (java.lang.String) objArr8322[0];
                        char c822 = (char) (19121 - (~(-android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0))));
                        int i18222 = -(-android.graphics.Color.green(0));
                        java.lang.Object[] objArr8422 = new java.lang.Object[1];
                        i("\u0000\u0000\u0000\u0000", c822, "꾺\udc42ᕩ竱མ", "怼ḡ뎓텊", ((-1826741920) & i18222) + (i18222 | (-1826741920)), objArr8422);
                        java.lang.String str4422 = (java.lang.String) objArr8422[0];
                        int i18322 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int scrollBarFadeDuration32 = android.view.ViewConfiguration.getScrollBarFadeDuration();
                        int i18422 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                        java.lang.Object[] objArr8522 = new java.lang.Object[1];
                        j(true, ((i18322 | 4) << 1) - (i18322 ^ 4), "\t\u001a\u000bￕ", (scrollBarFadeDuration32 >> 16) + 226, ((i18422 | 4) << 1) - (i18422 ^ 4), objArr8522);
                        strArr = new java.lang.String[]{str3922, str4022, str4122, str4222, str4322, str4422, (java.lang.String) objArr8522[0]};
                        i2 = 0;
                        while (true) {
                            if (i2 < 7) {
                            }
                            int i18622 = (i2 ^ 87) + ((i2 & 87) << 1);
                            i2 = (i18622 ^ (-86)) + ((i18622 & (-86)) << 1);
                            str3 = str4;
                            strArr = strArr2;
                        }
                        if (i3 == 0) {
                        }
                    } else {
                        int i479 = (i29 & 58) + (i29 | 58);
                        i29 = (i479 & (-57)) + (i479 | (-57));
                        j2 = j2;
                        i22 = 1590238701;
                        i23 = 3;
                    }
                }
            }
            j7 = j2;
            j8 = j;
            str = "";
            int i41102 = -(-android.text.TextUtils.indexOf(str, str, 0));
            int i42102 = -(android.view.ViewConfiguration.getScrollBarSize() >> 8);
            java.lang.Object[] objArr2022 = new java.lang.Object[1];
            j(false, ((i41102 | 8) << 1) - (i41102 ^ 8), "￼\ufffa\ufff7\u0003�\u0011\u000b\ufff9", ((i42102 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) << 1) - (i42102 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE), 7 - (~android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr2022);
            java.lang.String str1022 = (java.lang.String) objArr2022[0];
            int lastIndexOf222 = android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            char c222 = (char) (((47200 | lastIndexOf222) << 1) - (lastIndexOf222 ^ 47200));
            java.lang.Object[] objArr2122 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", c222, "棬潩Ꙧ䏷䏟ᤷ", "俐驊忭\uf7b8", android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr2122);
            java.lang.String str1122 = (java.lang.String) objArr2122[0];
            char resolveSizeAndState222 = (char) android.view.View.resolveSizeAndState(0, 0, 0);
            int i43102 = -(android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
            java.lang.Object[] objArr2222 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", resolveSizeAndState222, "鍟䒮螉\uf736蔴❼繊", "꣰圄禥싉", (((-1521023832) | i43102) << 1) - (i43102 ^ (-1521023832)), objArr2222);
            java.lang.String str1222 = (java.lang.String) objArr2222[0];
            java.lang.Object[] objArr2322 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), "\uda3b\ue6baƲ捈\u009f\ue735箁鋾ᖖ", "譐\udc03\u218c疠", android.view.View.MeasureSpec.getSize(0) - 1931738229, objArr2322);
            java.lang.String str1322 = (java.lang.String) objArr2322[0];
            int i44102 = -android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            int i45102 = -(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            java.lang.Object[] objArr2422 = new java.lang.Object[1];
            j(true, (i44102 ^ 5) + ((i44102 & 5) << 1), "\u0001\u0001\u0004\ufffb\u0004￼", (i45102 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) + (i45102 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE), 0 - (~(-(android.view.ViewConfiguration.getScrollBarSize() >> 8))), objArr2422);
            java.lang.String str1422 = (java.lang.String) objArr2422[0];
            java.lang.Object[] objArr2522 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", (char) (16855 - (~(-(-(android.os.Process.myPid() >> 22))))), "ᥝ궯ⳗ㝱ꃒ쬭䞍돵侚儈\u0e8b羹菣", "\udfb3狱\ud8c1㵁", (-1049431585) - (~android.os.Process.getGidForName(str)), objArr2522);
            java.lang.String str1522 = (java.lang.String) objArr2522[0];
            int edgeSlop82 = android.view.ViewConfiguration.getEdgeSlop() >> 16;
            char c322 = (char) ((48763 & edgeSlop82) + (edgeSlop82 | 48763));
            int gidForName52 = android.os.Process.getGidForName(str);
            java.lang.Object[] objArr2622 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", c322, "풍둴蜄蛓䳨", "ﲮ₉笶达", (908102141 ^ gidForName52) + ((gidForName52 & 908102141) << 1), objArr2622);
            java.lang.String str1622 = (java.lang.String) objArr2622[0];
            java.lang.Object[] objArr2722 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", (char) (android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 49183), "媽꼸舵篃衧築", "誈魰Ṃ\ue9c0", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2722);
            java.lang.String str1722 = (java.lang.String) objArr2722[0];
            java.lang.Object[] objArr2822 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", (char) (36852 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), "箶朰", "䧠툼\uf4d9ꪏ", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2822);
            java.lang.String str1822 = (java.lang.String) objArr2822[0];
            java.lang.Object[] objArr2922 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", (char) (android.view.View.MeasureSpec.getMode(0) + 49582), "\ue33a⚺\uee59\ue0aa뢣䳴遲읱\uf75e땲䬐擠켠㾒\uefa3쬛", "ኀ빫꺗菁", android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr2922);
            java.lang.String str1922 = (java.lang.String) objArr2922[0];
            int maxKeyCode42 = android.view.KeyEvent.getMaxKeyCode() >> 16;
            int d1422 = com.facetec.sdk.gh.b.d();
            int i46102 = maxKeyCode42 * (-963);
            int i4782 = (i46102 & (-964)) + (i46102 | (-964)) + 9650;
            int i4822 = ~maxKeyCode42;
            int i4922 = ~((d1422 ^ (-11)) | (d1422 & (-11)));
            int i5022 = ((i4822 ^ i4922) | (i4822 & i4922)) * (-964);
            int i5122 = ((i4782 | i5022) << 1) - (i5022 ^ i4782);
            int i5222 = ~((~d1422) | (-11));
            int i5322 = ~(maxKeyCode42 | (-11));
            int i5422 = ((i5322 ^ i5222) | (i5322 & i5222)) * (-964);
            int i5522 = -android.view.KeyEvent.getDeadChar(0, 0);
            int i5622 = -(-android.graphics.ImageFormat.getBitsPerPixel(0));
            java.lang.Object[] objArr3022 = new java.lang.Object[1];
            j(true, (i5122 & i5422) + (i5422 | i5122), "\u000fￋ\u0001\u0004\ufffe\u0011\u0004\f\t\u0000", (i5522 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE) + (i5522 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE), (i5622 ^ 10) + ((i5622 & 10) << 1), objArr3022);
            java.lang.String str2022 = (java.lang.String) objArr3022[0];
            java.lang.Object[] objArr3122 = new java.lang.Object[1];
            j(true, android.view.MotionEvent.axisFromString(str) + 9, "\uffff\u0002\ufff5\u0006\ufff7\u0003\u0006\u0004", 243 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.view.View.getDefaultSize(0, 0) + 8, objArr3122);
            java.lang.String str2122 = (java.lang.String) objArr3122[0];
            long elapsedCpuTime222 = android.os.Process.getElapsedCpuTime();
            int i5722 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i5822 = (i5722 * (-391)) - 47190;
            int d1522 = com.facetec.sdk.gh.b.d() | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE;
            int i5922 = ~(i5722 | (-243));
            int i6022 = ~d1522;
            int i6122 = (i5922 | i6022) * (-196);
            int i6222 = ((i5822 | i6122) << 1) - (i5822 ^ i6122);
            int i6322 = -(-((i5722 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE) * my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY));
            int i6422 = ~i5722;
            int i6522 = ~((i6422 ^ (-243)) | (i6422 & (-243)));
            java.lang.Object[] objArr3222 = new java.lang.Object[1];
            j(true, 13 - (elapsedCpuTime222 > 0L ? 1 : (elapsedCpuTime222 == 0L ? 0 : -1)), "\u0005\ufff9￼\u0005\b\u0006\ufffa\n\ufff9\ufffb\u0002\u0002", (i6222 ^ i6322) + ((i6322 & i6222) << 1) + (((i6522 & i6022) | (i6522 ^ i6022)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE), android.text.TextUtils.getCapsMode(str, 0, 0) + 6, objArr3222);
            java.lang.String str2222 = (java.lang.String) objArr3222[0];
            char minimumFlingVelocity32 = (char) (46076 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
            int lastIndexOf322 = android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
            java.lang.Object[] objArr3322 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", minimumFlingVelocity32, "聲\udbf3딒샄꩗偼\uf8ac\udf21ⷁ䊓빼₼죇꾲", "㲨峾ﱘ᮳", ((lastIndexOf322 | 1) << 1) - (lastIndexOf322 ^ 1), objArr3322);
            java.lang.String str2322 = (java.lang.String) objArr3322[0];
            java.lang.Object[] objArr3422 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", (char) android.view.KeyEvent.keyCodeFromString(str), "ᩴﴬ洜愥ꚝ\ueb93䆖", "\uefdf\uf7b4◣㏪", (-470305554) - (~(-(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))), objArr3422);
            java.lang.String str2422 = (java.lang.String) objArr3422[0];
            java.lang.Object[] objArr3522 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", (char) (0 - (~(-(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))))), "⠍u蕂䥓\udaa5\uf5f0洉", "ᮒ☶撚妈", (-1859766758) - (~(-(-android.graphics.drawable.Drawable.resolveOpacity(0, 0)))), objArr3522);
            java.lang.String str2522 = (java.lang.String) objArr3522[0];
            java.lang.Object[] objArr3622 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", (char) android.graphics.Color.green(0), "襷\uf5f2㤚正\uf812溻୕", "㥿პ힅ﾐ", android.view.Gravity.getAbsoluteGravity(0, 0) - 2062492103, objArr3622);
            java.lang.String str2622 = (java.lang.String) objArr3622[0];
            int i6622 = -android.graphics.Color.argb(0, 0, 0, 0);
            java.lang.Object[] objArr3722 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", (char) ((i6622 ^ 30780) + ((i6622 & 30780) << 1)), "渰潆", "ẟ\uf2ad㰨╸", android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr3722);
            java.lang.String str2722 = (java.lang.String) objArr3722[0];
            java.lang.Object[] objArr3822 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", (char) android.view.View.resolveSizeAndState(0, 0, 0), "\u12c7綪뒩甫녁\udd1fꅙ丰ꖐ풢鸓\ue5f3덒蛙⇰웳硻犙흁\ue6ec", "쾚戧\ued72录", android.view.ViewConfiguration.getWindowTouchSlop() >> 8, objArr3822);
            java.lang.String str2822 = (java.lang.String) objArr3822[0];
            int i6722 = (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int d1622 = com.facetec.sdk.gh.b.d();
            int i6822 = ((i6722 * 495) - 1417375) + (((i6722 ^ (-2876)) | (i6722 & (-2876))) * (-988));
            int i6922 = ~i6722;
            int i7022 = ~d1622;
            int i7122 = -(-(((i6922 & 2875) | (i6922 ^ 2875) | i7022) * 494));
            int i7222 = ~(i6922 | (-2876));
            int i7322 = ~((i7022 ^ 2875) | (i7022 & 2875));
            int i7422 = (i7322 ^ i7222) | (i7322 & i7222);
            int i7522 = ~((i6722 ^ 2875) | (i6722 & 2875));
            char c422 = (char) ((i6822 & i7122) + (i6822 | i7122) + (((i7522 ^ i7422) | (i7522 & i7422)) * 494));
            int i7622 = -android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            java.lang.Object[] objArr3922 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", c422, "㜗뎇꾹裣ᓿ\udee5", "峈훂㳞̋", (~i7622) + (i7622 << 1), objArr3922);
            java.lang.String str2922 = (java.lang.String) objArr3922[0];
            int i7722 = -android.text.TextUtils.indexOf(str, str, 0);
            int i7822 = -android.view.MotionEvent.axisFromString(str);
            int d1722 = com.facetec.sdk.gh.b.d();
            int i7922 = i7822 * (-109);
            int i8022 = ~i7822;
            int i8122 = ~((d1722 ^ 251) | (d1722 & 251));
            int i8222 = (((i7922 | 27861) << 1) - (i7922 ^ 27861)) + (((i8022 ^ i8122) | (i8022 & i8122)) * (-220));
            int i8322 = ~(i7822 | 251);
            int i8422 = ((i8122 ^ i8322) | (i8122 & i8322)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE;
            int i8522 = (i8222 & i8422) + (i8422 | i8222);
            int i8622 = ~((i8022 ^ 251) | (i8022 & 251));
            int i8722 = ~(i7822 | (-252));
            int i8822 = ((i8722 ^ i8622) | (i8722 & i8622)) * 110;
            java.lang.Object[] objArr4022 = new java.lang.Object[1];
            j(false, (i7722 & 2) + (i7722 | 2), "\uffff\u0001", (i8522 ^ i8822) + ((i8822 & i8522) << 1), 2 - (~(-(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))), objArr4022);
            java.lang.String str3022 = (java.lang.String) objArr4022[0];
            int maxKeyCode222 = android.view.KeyEvent.getMaxKeyCode() >> 16;
            int d1822 = com.facetec.sdk.gh.b.d();
            int i8922 = ~maxKeyCode222;
            int i9022 = ~(48627 | i8922);
            int i9122 = ~d1822;
            int i9222 = (i9122 ^ (-48628)) | ((-48628) & i9122);
            int i9322 = ~((i9222 ^ maxKeyCode222) | (maxKeyCode222 & i9222));
            int i9422 = ~((i8922 & (-48628)) | ((-48628) ^ i8922));
            int i9522 = ((maxKeyCode222 * (-575)) - 27960525) + (((~(d1822 | (-48628))) | i9422) * 576) + (((i9322 & i9022) | (i9022 ^ i9322)) * 576);
            int i9622 = i9422 * 576;
            java.lang.Object[] objArr4122 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", (char) ((i9522 ^ i9622) + ((i9522 & i9622) << 1)), "塾誙ꋫ\u0b81鏁ㆌ븗ﯡ\u0ee8喋筡啹ὁ❴商㹟", "ꦤ꣯\uf3af\udcbd", android.graphics.Color.red(0), objArr4122);
            java.lang.String str3122 = (java.lang.String) objArr4122[0];
            char size222 = (char) android.view.View.MeasureSpec.getSize(0);
            int jumpTapTimeout42 = android.view.ViewConfiguration.getJumpTapTimeout() >> 16;
            java.lang.Object[] objArr4222 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", size222, "ᨺ췾㽭圡蝛᧴\ua83eꦞ㺷", "ꣾﾀ楖\ud885", (1459585192 ^ jumpTapTimeout42) + ((jumpTapTimeout42 & 1459585192) << 1), objArr4222);
            java.lang.String str3222 = (java.lang.String) objArr4222[0];
            int i9722 = -(-android.graphics.Color.alpha(0));
            int edgeSlop222 = android.view.ViewConfiguration.getEdgeSlop();
            int edgeSlop322 = android.view.ViewConfiguration.getEdgeSlop() >> 16;
            java.lang.Object[] objArr4322 = new java.lang.Object[1];
            j(true, (i9722 & 10) + (i9722 | 10), "\u0000\ufffe￼\r\u000f\uffd1\u0003\u000f￼\u000b", 237 - (edgeSlop222 >> 16), ((edgeSlop322 | 5) << 1) - (edgeSlop322 ^ 5), objArr4322);
            java.lang.String str3322 = (java.lang.String) objArr4322[0];
            char axisFromString32 = (char) ((-1) - android.view.MotionEvent.axisFromString(str));
            int threadPriority62 = android.os.Process.getThreadPriority(0);
            int i9822 = -((((threadPriority62 | 20) << 1) - (threadPriority62 ^ 20)) >> 6);
            java.lang.Object[] objArr4422 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", axisFromString32, "㣥\udd7d휍욄梆哯뒑蹕섪㉅婸", "蓃餝ှ廭", (1050221956 & i9822) + (i9822 | 1050221956), objArr4422);
            java.lang.String str3422 = (java.lang.String) objArr4422[0];
            java.lang.Object[] objArr4522 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", (char) (0 - (~(-(-android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask))))), "븠㊩ꁘ佖ٳꊬ옔殎귶∸\uf446", "얩㴯ޡꅋ", android.text.TextUtils.getTrimmedLength(str) - 1589825595, objArr4522);
            java.lang.String str3522 = (java.lang.String) objArr4522[0];
            int i9922 = -android.text.TextUtils.getTrimmedLength(str);
            java.lang.Object[] objArr4622 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", (char) ((51984 ^ i9922) + ((i9922 & 51984) << 1)), "枲㙻᭱۵省糓鱐倂˥\ue96a綱ͪ巒뤺뀗", "\uddc9䆙Ⴌ峋", (android.os.Process.myPid() >> 22) - 1404986915, objArr4622);
            java.lang.String str3622 = (java.lang.String) objArr4622[0];
            int rgb42 = android.graphics.Color.rgb(0, 0, 0);
            int resolveSizeAndState322 = android.view.View.resolveSizeAndState(0, 0, 0);
            java.lang.Object[] objArr4722 = new java.lang.Object[1];
            j(false, (-16777202) - rgb42, "\f\u0000\ufff5\u0002\uffff\u0006\b\u0001\n￼\u0001\ufff7\ufff2\u0006", (resolveSizeAndState322 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE) + ((resolveSizeAndState322 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE) << 1), 5 - (~(-(-android.view.View.resolveSize(0, 0)))), objArr4722);
            java.lang.String[] strArr422 = {str1022, str1122, str1222, str1322, str1422, str1522, str1622, str1722, str1822, str1922, str2022, str2122, str2222, str2322, str2422, str2522, str2622, str2722, str2822, str2922, str3022, str3122, str3222, str3322, str3422, str3522, str3622, (java.lang.String) objArr4722[0]};
            java.lang.Object[] objArr4822 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", (char) android.view.KeyEvent.keyCodeFromString(str), "㟧윭셟뜒誗ꯠ庪⾬\ue197ࢩ쾌", "쬗篃ᤧ龍", 662422474 - (~(-android.view.View.resolveSizeAndState(0, 0, 0))), objArr4822);
            java.lang.Object[] objArr4922 = {(java.lang.String) objArr4822[0]};
            d2 = com.facetec.sdk.al.d(1590238701);
            if (d2 == null) {
            }
            invoke = ((java.lang.reflect.Method) d2).invoke(null, objArr4922);
            if (invoke != null) {
            }
            str2 = str;
            f = (h + 41) % 128;
            char lastIndexOf4222 = (char) (android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1);
            int i116222 = -android.widget.ExpandableListView.getPackedPositionChild(0L);
            java.lang.Object[] objArr65222 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", lastIndexOf4222, "韹砮౩ܢ\uf47e쓰▅쥂ࡳ骧뇰퓭๐손\ua631疝ᐷ黷䑻걯\u2e5f嚨吂", "쐓哈ᴆⱽ", (106219715 ^ i116222) + ((i116222 & 106219715) << 1), objArr65222);
            java.lang.Object[] objArr66222 = {(java.lang.String) objArr65222[0]};
            d3 = com.facetec.sdk.al.d(-864328554);
            if (d3 == null) {
            }
            long longValue7222 = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, objArr66222)).longValue();
            long j41222 = -697251165;
            int maxMemory2222 = (int) java.lang.Runtime.getRuntime().maxMemory();
            long j42222 = com.visa.cbp.getCertUsage.setODAData;
            long j43222 = j41222 ^ j4;
            long j44222 = com.visa.cbp.getCertUsage.getODAData;
            long j45222 = maxMemory2222;
            long j46222 = j45222 ^ j4;
            long j47222 = ((-665) * j41222) + (j42222 * longValue7222) + ((-333) * j43222) + ((((j43222 | j46222) ^ j4) | ((longValue7222 | j45222) ^ j4)) * j44222) + (j44222 * (((j46222 | longValue7222) ^ j4) | ((j43222 | j45222) ^ j4))) + 1745449585;
            int freeMemory3222 = (int) java.lang.Runtime.getRuntime().freeMemory();
            int i117222 = ~freeMemory3222;
            int i118222 = ((int) (j47222 >> 32)) & ((((~((-1435820667) | i117222)) | (~((-1405745) | freeMemory3222)) | (~(1405744 | i117222))) * 959) + 156141465 + (((~(freeMemory3222 | (-1435820667))) | (~(i117222 | (-1405745))) | (~(1405744 | freeMemory3222))) * 959));
            int i119222 = ~new java.util.Random().nextInt(1596166097);
            int i120222 = ((int) j47222) & ((((~((-2058401411) | i119222)) | 715174530) * (-241)) + 312228214 + (((~(i119222 | (-1343226881))) | 84164945) * 241));
            j9 = (i118222 ^ i120222) | (i118222 & i120222);
            int i121222 = -(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i122222 = -android.view.KeyEvent.keyCodeFromString(str2);
            int d24222 = com.facetec.sdk.gh.b.d();
            int i123222 = ~i122222;
            int i124222 = ~((i123222 ^ (-235)) | (i123222 & (-235)));
            int i125222 = ~d24222;
            int i126222 = (i125222 & i122222) | (i125222 ^ i122222);
            int i127222 = ~((i126222 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE) | (i126222 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE));
            int i128222 = -(-(((i124222 ^ i127222) | (i124222 & i127222)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE));
            int i129222 = ~((i125222 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE) | (i125222 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE));
            int i130222 = ((((i122222 * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE) - 51246) - (~i128222)) - 1) + (((i129222 & i122222) | (i129222 ^ i122222)) * (-440));
            int i131222 = i122222 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE;
            int i132222 = ((i131222 ^ d24222) | (i131222 & d24222)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE;
            int i133222 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
            java.lang.Object[] objArr68222 = new java.lang.Object[1];
            j(true, (i121222 & 17) + (i121222 | 17), "\n\u0003\u0011ￍ\u0001\r\u0010\u000eￍ\u0011\u0013\u0012\uffff\u0012\u0011ￍ\u0004", ((i130222 | i132222) << 1) - (i132222 ^ i130222), ((i133222 | 9) << 1) - (i133222 ^ 9), objArr68222);
            java.lang.Object[] objArr69222 = {(java.lang.String) objArr68222[0]};
            d4 = com.facetec.sdk.al.d(-864328554);
            if (d4 == null) {
            }
            long longValue8222 = ((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr69222)).longValue();
            long j48222 = -224748211;
            long j49222 = j48222 ^ j4;
            long j50222 = longValue8222 ^ j4;
            java.lang.String str38222 = str2;
            long myUid722 = android.os.Process.myUid();
            long j51222 = 490;
            long j52222 = (491 * j48222) + ((-489) * longValue8222) + ((-490) * (j49222 | j50222 | (myUid722 ^ j4))) + ((((myUid722 | j50222) ^ j4) | ((j48222 | j50222) ^ j4)) * j51222) + (j51222 * j49222) + 1272946631;
            int freeMemory4222 = (int) java.lang.Runtime.getRuntime().freeMemory();
            int i134222 = ((int) (j52222 >> 32)) & (((~((-73405570) | freeMemory4222)) * (-301)) + 470469780 + (((~(82056385 | freeMemory4222)) | (~((~freeMemory4222) | 1519282796))) * (-301)) + (((~(freeMemory4222 | (-1519282797))) | 82056385) * 301));
            int i135222 = ~((int) android.os.SystemClock.uptimeMillis());
            int i136222 = ((int) j52222) & ((((~((-85197074) | i135222)) | (~(2143268731 | i135222))) * (-184)) + 1019428157 + (((~(i135222 | (-395619698))) | (~(1832846107 | i135222)) | 310422624) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 555124760);
            long j53222 = (i134222 ^ i136222) | (i134222 & i136222);
            if (j9 > 0) {
            }
            java.lang.Object[] objArr72222 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", (char) ((-1) - android.text.TextUtils.lastIndexOf(str38222, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), "韹砮౩ܢ\uf47e쓰▅쥂ࡳ骧뇰퓭๐손\ua631疝ᐷ黷䑻걯\u2e5f嚨吂", "쐓哈ᴆⱽ", 106219716 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr72222);
            java.lang.Object[] objArr73222 = {(java.lang.String) objArr72222[0]};
            d5 = com.facetec.sdk.al.d(-864328554);
            if (d5 == null) {
            }
            long longValue9222 = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, objArr73222)).longValue();
            long j54222 = -132561095;
            long j55222 = -948;
            long j56222 = j54222 ^ j4;
            long j57222 = longValue9222 ^ j4;
            long elapsedCpuTime5222 = (int) android.os.Process.getElapsedCpuTime();
            long j58222 = ((-947) * j54222) + (949 * longValue9222) + ((((j57222 | elapsedCpuTime5222) ^ j4) | j56222) * j55222) + (j55222 * (((elapsedCpuTime5222 ^ j4) | (j56222 | j57222)) ^ j4)) + (948 * (j57222 | j54222)) + 1180759515;
            int i157222 = ((int) (j58222 >> 32)) & (((((~((-380891117) | r2)) | (-1056335295)) * (-983)) - 194158557) + (((~((~android.os.Process.myPid()) | (-1056335295))) | 675545106) * 983));
            int maxMemory3222 = (int) java.lang.Runtime.getRuntime().maxMemory();
            int i158222 = ((int) j58222) & (((((~((-845288035) | maxMemory3222)) | (~((~maxMemory3222) | 2012452851))) * (-318)) - 1768149325) + (((~(862130930 | maxMemory3222)) | 1150321921) * (-318)) + (((~(maxMemory3222 | (-862130931))) | (-1995609956)) * 318));
            j10 = (i157222 ^ i158222) | (i157222 & i158222);
            java.lang.Object[] objArr75222 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", (char) (25977 - (~(-(-(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))))), "똖廽㹰쟠", "呜䗨稵㡥", android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr75222);
            java.lang.Object[] objArr76222 = {(java.lang.String) objArr75222[0]};
            d6 = com.facetec.sdk.al.d(-864328554);
            if (d6 == null) {
            }
            long longValue10222 = ((java.lang.Long) ((java.lang.reflect.Method) d6).invoke(null, objArr76222)).longValue();
            long j59222 = -309522901;
            long j60222 = 130;
            long j61222 = longValue10222 ^ j4;
            long uptimeMillis3222 = (int) android.os.SystemClock.uptimeMillis();
            long j62222 = j61222 | j59222;
            long j63222 = ((-129) * j59222) + (131 * longValue10222) + ((((j61222 | (uptimeMillis3222 ^ j4)) | j59222) ^ j4) * j60222) + ((-260) * (j62222 ^ j4)) + (j60222 * ((((j59222 ^ j4) | longValue10222) ^ j4) | ((j62222 | uptimeMillis3222) ^ j4))) + 1357721321;
            int uptimeMillis4222 = (int) android.os.SystemClock.uptimeMillis();
            int myUid2222 = android.os.Process.myUid();
            long j64222 = (((int) (j63222 >> 32)) & ((((~((-775235488) | uptimeMillis4222)) | 134218132) * (-566)) + 95277794 + ((~(uptimeMillis4222 | (-641017356))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST))) | ((((((~(139570376 | myUid2222)) | (-1297722602)) * 336) - 501357939) + (((~((-1297656034) | myUid2222)) | 139503808) * (-168)) + (((~((~myUid2222) | (-1297656034))) | 139570376) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)) & ((int) j63222));
            if (j10 > 0) {
            }
            char minimumFlingVelocity2222 = (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
            str3 = str38222;
            int i166222 = -android.text.TextUtils.getOffsetBefore(str3, 0);
            java.lang.Object[] objArr79222 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", minimumFlingVelocity2222, "\ue724㋨鳸ᮈ⬣컗︮", "Ἔ舲″儧", (864170527 & i166222) + (i166222 | 864170527), objArr79222);
            java.lang.String str39222 = (java.lang.String) objArr79222[0];
            java.lang.Object[] objArr80222 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", (char) android.view.KeyEvent.normalizeMetaState(0), "齻긟话柬\udea9蘛⌌㞃㘂\uf63e㥕", "䟆쬷\u20ff敋", (-3459258) - (~(-android.graphics.Color.blue(0))), objArr80222);
            java.lang.String str40222 = (java.lang.String) objArr80222[0];
            int indexOf6222 = android.text.TextUtils.indexOf(str3, str3, 0);
            int i167222 = -(-(android.os.Process.myTid() >> 22));
            int lastIndexOf5222 = android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            int d27222 = com.facetec.sdk.gh.b.d();
            int i168222 = (lastIndexOf5222 * com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd) - 4935;
            int i169222 = ~d27222;
            int i170222 = i169222 | (-6);
            int i171222 = (lastIndexOf5222 ^ 5) | (lastIndexOf5222 & 5);
            int i172222 = ((~((i170222 ^ lastIndexOf5222) | (i170222 & lastIndexOf5222))) | (~((i171222 & d27222) | (i171222 ^ d27222)))) * 988;
            int i173222 = ((i168222 | i172222) << 1) - (i168222 ^ i172222);
            int i174222 = -(-(((lastIndexOf5222 ^ (-6)) | (lastIndexOf5222 & (-6))) * (-988)));
            int i175222 = (i173222 & i174222) + (i174222 | i173222);
            int i176222 = ~lastIndexOf5222;
            int i177222 = ~((i176222 ^ (-6)) | (i176222 & (-6)));
            int i178222 = ~((d27222 ^ (-6)) | (d27222 & (-6)));
            int i179222 = (i178222 ^ i177222) | (i178222 & i177222);
            int i180222 = ~(lastIndexOf5222 | i169222 | 5);
            int i181222 = -(-(((i179222 ^ i180222) | (i179222 & i180222)) * 988));
            java.lang.Object[] objArr81222 = new java.lang.Object[1];
            j(true, 12 - indexOf6222, "\u0010\u0016\u0010ￌ\u000b\u0006\uffff\u0010ￌ\n\u0002\u0011", (i167222 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE) + (i167222 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE), ((i175222 | i181222) << 1) - (i181222 ^ i175222), objArr81222);
            java.lang.String str41222 = (java.lang.String) objArr81222[0];
            java.lang.Object[] objArr82222 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), "ꇌᯔ௬秃⼻잱贑驝뷡\uf2be⌎옶", "嶏\ue6a0㗦햓", android.view.ViewConfiguration.getLongPressTimeout() >> 16, objArr82222);
            java.lang.String str42222 = (java.lang.String) objArr82222[0];
            int maxKeyCode3222 = android.view.KeyEvent.getMaxKeyCode();
            int keyRepeatDelay222 = android.view.ViewConfiguration.getKeyRepeatDelay() >> 16;
            java.lang.Object[] objArr83222 = new java.lang.Object[1];
            j(false, (maxKeyCode3222 >> 16) + 11, "ￏ\u0002\t\u000eￏ\u0016\u0005\u000e\u0004\u000f\u0012", (keyRepeatDelay222 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE) + (keyRepeatDelay222 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 4, objArr83222);
            java.lang.String str43222 = (java.lang.String) objArr83222[0];
            char c8222 = (char) (19121 - (~(-android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0))));
            int i182222 = -(-android.graphics.Color.green(0));
            java.lang.Object[] objArr84222 = new java.lang.Object[1];
            i("\u0000\u0000\u0000\u0000", c8222, "꾺\udc42ᕩ竱མ", "怼ḡ뎓텊", ((-1826741920) & i182222) + (i182222 | (-1826741920)), objArr84222);
            java.lang.String str44222 = (java.lang.String) objArr84222[0];
            int i183222 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int scrollBarFadeDuration322 = android.view.ViewConfiguration.getScrollBarFadeDuration();
            int i184222 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
            java.lang.Object[] objArr85222 = new java.lang.Object[1];
            j(true, ((i183222 | 4) << 1) - (i183222 ^ 4), "\t\u001a\u000bￕ", (scrollBarFadeDuration322 >> 16) + 226, ((i184222 | 4) << 1) - (i184222 ^ 4), objArr85222);
            strArr = new java.lang.String[]{str39222, str40222, str41222, str42222, str43222, str44222, (java.lang.String) objArr85222[0]};
            i2 = 0;
            while (true) {
                if (i2 < 7) {
                }
                int i186222 = (i2 ^ 87) + ((i2 & 87) << 1);
                i2 = (i186222 ^ (-86)) + ((i186222 & (-86)) << 1);
                str3 = str4;
                strArr = strArr2;
            }
            if (i3 == 0) {
            }
            if (i10 != 0) {
                f = (h + 89) % 128;
                java.lang.Object[] objArr155 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, new int[]{0}};
                int i480 = ~((~android.os.Process.myTid()) | 916520562);
                int i481 = ((371257858 | i480) * (-374)) + 964914995 + ((i480 | 545262704) * 374);
                int i483 = ((i481 | 16) << 1) - (i481 ^ 16);
                int d59 = com.facetec.sdk.gh.b.d();
                int i484 = i483 * (-159);
                int i485 = ((-129703568) ^ i484) + ((i484 & (-129703568)) << 1);
                int i486 = ~i483;
                int i487 = ((i486 ^ (-1673951376)) | (i486 & (-1673951376))) * 160;
                int i488 = (i485 ^ i487) + ((i487 & i485) << 1);
                int i489 = ~d59;
                int i490 = ~(i489 | i483);
                int i491 = ~((i483 ^ (-1673951376)) | (i483 & (-1673951376)));
                int i493 = ((i490 ^ i491) | (i490 & i491)) * (-160);
                int i494 = ~((i489 ^ 1673951375) | (1673951375 & i489));
                int i495 = ((((i488 | i493) << 1) - (i493 ^ i488)) - (~(-(-(((i483 ^ i494) | (i483 & i494)) * 160))))) - 1;
                int i496 = i495 << 13;
                int i497 = (~(i496 & i495)) & (i496 | i495);
                int i498 = i497 ^ (i497 >>> 17);
                int i499 = i498 << 5;
                ((int[]) objArr155[1])[0] = (~(i498 & i499)) & (i498 | i499);
                return objArr155;
            }
            d7 = com.facetec.sdk.al.d(-1699488110);
            if (d7 == null) {
            }
            long longValue152 = ((java.lang.Long) ((java.lang.reflect.Method) d7).invoke(null, null)).longValue();
            long j812 = 435930541;
            long j822 = ((j812 ^ j4) | longValue152) ^ j4;
            long elapsedCpuTime62 = (int) android.os.Process.getElapsedCpuTime();
            long j832 = elapsedCpuTime62 ^ j4;
            long j842 = 594;
            long j852 = longValue152 ^ j4;
            long j862 = (j832 | j812) ^ j4;
            long j872 = (((((595 * j812) + ((-1187) * longValue152)) + ((((j832 | longValue152) ^ j4) | j822) * (-1188))) + (((((elapsedCpuTime62 | j852) ^ j4) | j822) | j862) * j842)) + (j842 * ((((j852 | j812) ^ j4) | ((j852 | j832) ^ j4)) | j862))) - 1623695124;
            int i3132 = (int) java.lang.Runtime.getRuntime().totalMemory();
            i7 = ((int) (j872 >> 32)) & ((((~((-104884230) | (~i3132))) | (~(1332342181 | i3132))) * (-272)) + 244723626 + (((~((-1198025894) | i3132)) | 1093141664) * (-272)) + (((~(i3132 | 1198025893)) | 239200517) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE));
            int freeMemory52 = (int) java.lang.Runtime.getRuntime().freeMemory();
            i8 = ((int) j872) & (((~((~freeMemory52) | 2142601205)) * (-116)) + 2072280017 + ((2057337844 | freeMemory52) * 116) + (((~(freeMemory52 | (-800403042))) | 715139680) * 116));
            if (((i7 ^ i8) | (i7 & i8)) == 0) {
            }
            c = 3;
            if (((int[]) objArr[c])[i9] != ((int[]) objArr[2])[i9]) {
            }
        }
    }

    static com.facetec.sdk.mo.c a(com.facetec.sdk.mo moVar) {
        return moVar.new AnonymousClass5();
    }
}
