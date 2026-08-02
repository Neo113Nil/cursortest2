package com.payair.hce;

/* loaded from: classes4.dex */
public final class getCardMetadata extends com.payair.hce.getAckAutomaticallyResetByApplication {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final java.lang.Object AlternateContactlessPaymentDataJson;
    private java.lang.String[] IccPrivateKeyCrtComponentsJson;
    private int[] getAid;
    public int values;
    public java.lang.Object[] writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, byte b2, byte b3, java.lang.Object[] objArr) {
        int i;
        byte[] bArr = $$a;
        int i2 = 4 - (b * 2);
        int i3 = b3 * 2;
        int i4 = 99 - (b2 * 3);
        byte[] bArr2 = new byte[i3 + 21];
        int i5 = i3 + 20;
        if (bArr == null) {
            int i6 = i4;
            i4 = i5;
            i = 0;
            i4 = (i4 + (-i6)) - 1;
            i2++;
            bArr2[i] = (byte) i4;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i2];
            i++;
            i4 = (i4 + (-i6)) - 1;
            i2++;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        }
    }

    /* renamed from: com.payair.hce.getCardMetadata$5, reason: invalid class name */
    public final class AnonymousClass5 extends java.io.Reader {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static char AlternateContactlessPaymentDataJson;
        private static char DigitizedCardProfile;
        private static int SdkCoreAlternateContactlessPaymentDataImpl;
        private static int getAid;
        private static char valueOf;
        private static char values;
        private static int writeReplace;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, byte b, int i2, java.lang.Object[] objArr) {
            int i3;
            int i4;
            int i5 = 718 - i;
            int i6 = (i2 * 2) + 1;
            int i7 = 37 - (b * 34);
            byte[] bArr = $$a;
            char[] cArr = new char[i6];
            if (bArr == null) {
                int i8 = i7;
                int i9 = 0;
                i5 = (i7 + i5) - 2;
                i7 = i8;
                i3 = i9;
                int i10 = i7 + 1;
                cArr[i3] = (char) i5;
                i4 = i3 + 1;
                if (i4 == i6) {
                    objArr[0] = new java.lang.String(cArr);
                    return;
                }
                byte b2 = bArr[i10];
                i7 = i5;
                i5 = b2;
                i9 = i4;
                i8 = i10;
                i5 = (i7 + i5) - 2;
                i7 = i8;
                i3 = i9;
                int i102 = i7 + 1;
                cArr[i3] = (char) i5;
                i4 = i3 + 1;
                if (i4 == i6) {
                }
            } else {
                i3 = 0;
                int i1022 = i7 + 1;
                cArr[i3] = (char) i5;
                i4 = i3 + 1;
                if (i4 == i6) {
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void d(int i, int i2, short s, java.lang.Object[] objArr) {
            int i3;
            int i4 = 115 - (i * 5);
            int i5 = 3 - (i2 * 4);
            byte[] bArr = $$d;
            int i6 = s * 4;
            byte[] bArr2 = new byte[1 - i6];
            int i7 = 0 - i6;
            if (bArr == null) {
                int i8 = i7;
                int i9 = 0;
                i4 += -i8;
                i3 = i9;
                bArr2[i3] = (byte) i4;
                i5++;
                i9 = i3 + 1;
                if (i3 == i7) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                i8 = bArr[i5];
                i4 += -i8;
                i3 = i9;
                bArr2[i3] = (byte) i4;
                i5++;
                i9 = i3 + 1;
                if (i3 == i7) {
                }
            } else {
                i3 = 0;
                bArr2[i3] = (byte) i4;
                i5++;
                i9 = i3 + 1;
                if (i3 == i7) {
                }
            }
        }

        AnonymousClass5() {
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) throws java.io.IOException {
            throw new java.lang.AssertionError();
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws java.io.IOException {
            throw new java.lang.AssertionError();
        }

        private static void c(java.lang.String str, int i, java.lang.Object[] objArr) {
            char[] cArr;
            int i2;
            if (str != null) {
                $10 = ($11 + 1) % 128;
                cArr = str.toCharArray();
            } else {
                cArr = str;
            }
            char[] cArr2 = cArr;
            com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
            char[] cArr3 = new char[cArr2.length];
            getproducttype.AlternateContactlessPaymentDataJson = 0;
            char[] cArr4 = new char[2];
            $11 = ($10 + 77) % 128;
            while (getproducttype.AlternateContactlessPaymentDataJson < cArr2.length) {
                int i3 = $10 + 37;
                $11 = i3 % 128;
                int i4 = 58224;
                if (i3 % 2 == 0) {
                    cArr4[0] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
                    cArr4[0] = cArr2[getproducttype.AlternateContactlessPaymentDataJson >> 1];
                    i2 = 1;
                } else {
                    cArr4[0] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
                    cArr4[1] = cArr2[getproducttype.AlternateContactlessPaymentDataJson + 1];
                    i2 = 0;
                }
                while (i2 < 16) {
                    char c = cArr4[1];
                    char c2 = cArr4[0];
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (valueOf ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(DigitizedCardProfile)};
                        int i5 = c2 + i4;
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - android.view.View.combineMeasuredStates(0, 0), 1334 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                            byte b = (byte) ($$e & 7);
                            byte b2 = (byte) (b - 1);
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            d(b, b2, b2, objArr3);
                            obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                        }
                        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                        cArr4[1] = charValue;
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (values ^ 2144259807102049818L))) ^ r13), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
                        int i6 = charValue + i4;
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                        if (obj2 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 62, (-16775881) - android.graphics.Color.rgb(0, 0, 0), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                            byte b3 = (byte) ($$e & 7);
                            byte b4 = (byte) (b3 - 1);
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            d(b3, b4, b4, objArr5);
                            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                        }
                        cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                        i4 -= 40503;
                        i2++;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3[getproducttype.AlternateContactlessPaymentDataJson] = cArr4[0];
                cArr3[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr4[1];
                java.lang.Object[] objArr6 = {getproducttype, getproducttype};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 3543 - android.view.View.combineMeasuredStates(0, 0), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
            }
            objArr[0] = new java.lang.String(cArr3, 0, i);
        }

        private static void b(int i, int i2, java.lang.String str, boolean z, int i3, java.lang.Object[] objArr) {
            char[] cArr;
            if (str != null) {
                $10 = ($11 + 61) % 128;
                cArr = str.toCharArray();
                $10 = ($11 + 95) % 128;
            } else {
                cArr = str;
            }
            char[] cArr2 = cArr;
            com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
            char[] cArr3 = new char[i2];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i2) {
                digitizedCardJson11.values = cArr2[digitizedCardJson11.DigitizedCardProfile];
                cArr3[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
                int i4 = digitizedCardJson11.DigitizedCardProfile;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i4]), java.lang.Integer.valueOf(writeReplace)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 43, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 2073, (char) (60037 - android.view.Gravity.getAbsoluteGravity(0, 0)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d(0, 0, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                    }
                    cArr3[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.os.Process.myPid() >> 22), 3544 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
                    }
                    ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            if (i3 > 0) {
                digitizedCardJson11.AlternateContactlessPaymentDataJson = i3;
                char[] cArr4 = new char[i2];
                java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i2);
                java.lang.System.arraycopy(cArr4, 0, cArr3, i2 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
                java.lang.System.arraycopy(cArr4, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr3, 0, i2 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
            }
            if (z) {
                $11 = ($10 + 105) % 128;
                char[] cArr5 = new char[i2];
                digitizedCardJson11.DigitizedCardProfile = 0;
                while (digitizedCardJson11.DigitizedCardProfile < i2) {
                    cArr5[digitizedCardJson11.DigitizedCardProfile] = cArr3[(i2 - digitizedCardJson11.DigitizedCardProfile) - 1];
                    java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.view.View.MeasureSpec.getMode(0) + 3543, (char) android.text.TextUtils.indexOf("", "", 0))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
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
            SdkCoreAlternateContactlessPaymentDataImpl = 0;
            getAid = 1;
            writeReplace = 1889207059;
            values = (char) 2870;
            AlternateContactlessPaymentDataJson = (char) 38873;
            valueOf = (char) 31067;
            DigitizedCardProfile = (char) 42168;
        }

        static void init$1() {
            $$d = new byte[]{76, 48, 60, 63};
            $$e = 65;
        }

        static void init$0() {
            $$a = new byte[]{40, 78, 110, 117, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, com.google.common.base.Ascii.SI, -10};
            $$b = 40;
        }

        /* JADX WARN: Code restructure failed: missing block: B:100:0x17a3, code lost:
        
            if (r2 >= 28) goto L588;
         */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x17a5, code lost:
        
            r5 = r32[r2];
            r6 = -(android.view.ViewConfiguration.getLongPressTimeout() >> 16);
            r9 = new java.lang.Object[1];
            c("엀ˁᆫำ侷亶綇쏵િ潳ᚙ됱", (r6 ^ 12) + ((r6 & 12) << 1), r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:102:0x17ca, code lost:
        
            r5 = new java.lang.Object[]{((java.lang.String) r9[0]).concat(java.lang.String.valueOf(r5))};
            r6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
         */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x17db, code lost:
        
            if (r6 != null) goto L151;
         */
        /* JADX WARN: Code restructure failed: missing block: B:104:0x17dd, code lost:
        
            r6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 3161 - (android.os.Process.myTid() >> 22), (char) (33099 - (android.view.KeyEvent.getMaxKeyCode() >> 16)));
            r8 = com.payair.hce.getCardMetadata.AnonymousClass5.$$a[14];
            r9 = (short) (r8 - 1);
            r8 = r8;
            r12 = new java.lang.Object[1];
            a(r9, r8, (byte) (r8 - 1), r12);
            r6 = r6.getMethod((java.lang.String) r12[0], java.lang.String.class);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:105:0x182c, code lost:
        
            r5 = ((java.lang.Long) ((java.lang.reflect.Method) r6).invoke(null, r5)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:106:0x1839, code lost:
        
            r8 = (int) java.lang.System.currentTimeMillis();
            r10 = ~((-65718273) | r5);
            r14 = ((((((-375) * r5) + 24644352375L) + ((((~((~r5) | 65718272)) | r8) | r10) * 376)) + ((r10 | (~((~r8) | (-65718273)))) * (-376))) + ((r5 | (~(r8 | 65718272))) * 376)) - 1271949835;
            r6 = (int) java.lang.System.currentTimeMillis();
            r5 = ((int) (r14 >> 32)) & (((((~((-1082757125) | r6)) * 623) - 1511558690) + (((~r6) | 285212944) * (-623))) + ((((~(r6 | 1030098352)) | 1082757124) | (~((-1827642533) | r6))) * 623));
            r8 = ~((int) java.lang.System.currentTimeMillis());
            r6 = ((int) r14) & (((((~((-1437881777) | r8)) * 52) - 15978303) + (((~((-2012509689) | r8)) | ((~((-575283279) | r8)) | 574627912)) * (-52))) + (((~(r8 | 2012509688)) | (-2013165055)) * 52));
         */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x18dd, code lost:
        
            if (((r5 ^ r6) | (r5 & r6)) != 0) goto L155;
         */
        /* JADX WARN: Code restructure failed: missing block: B:108:0x18df, code lost:
        
            r5 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:110:0x18e2, code lost:
        
            r3 = r3 + r5;
            r2 = r2 - 45;
            r2 = ((r2 | 46) << 1) - (r2 ^ 46);
         */
        /* JADX WARN: Code restructure failed: missing block: B:111:0x18e1, code lost:
        
            r5 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:115:0x18f7, code lost:
        
            if (r3 < 25.2d) goto L167;
         */
        /* JADX WARN: Code restructure failed: missing block: B:116:0x18f9, code lost:
        
            r1 = new java.lang.Object[]{new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, null, new int[1]};
            r2 = (int) java.lang.System.currentTimeMillis();
         */
        /* JADX WARN: Code restructure failed: missing block: B:117:0x1918, code lost:
        
            r5 = new java.lang.Object[]{86904972, 16, java.lang.Integer.valueOf((((((~((-172523521) | r2)) | (~((~r2) | 536801999))) * (-318)) + 426046761) + (((~(199787022 | r2)) | 337014977) * (-318))) + (((~(r2 | (-199787023))) | (-509538498)) * 318))};
            r2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
         */
        /* JADX WARN: Code restructure failed: missing block: B:118:0x196b, code lost:
        
            if (r2 != null) goto L163;
         */
        /* JADX WARN: Code restructure failed: missing block: B:119:0x196d, code lost:
        
            r2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf(r7, r7, 0), 2713 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
            r7 = new java.lang.Object[1];
            a(653, r3[14], (byte) (-com.payair.hce.getCardMetadata.AnonymousClass5.$$a[16]), r7);
            r2 = r2.getMethod((java.lang.String) r7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:121:0x19d1, code lost:
        
            ((int[]) r1[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r2).invoke(null, r5)).intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:122:0x19d9, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:130:0x179d, code lost:
        
            if (((((int) (r12 >> 32)) & ((((((~(2035087827 | r3)) | (~((~r3) | (-822653058)))) * (-318)) - 1696913722) + (((~((-822917252) | r3)) | 264194) * (-318))) + (((~(r3 | 822917251)) | 2034823633) * 318))) | ((((((~(1939802405 | r6)) | 502575995) * (-366)) + 1553245953) + (((~(r6 | 2147466111)) | 294912289) * 366)) & ((int) r12))) == 477111747) goto L144;
         */
        /* JADX WARN: Code restructure failed: missing block: B:403:0x43a4, code lost:
        
            if (((r2 ^ r3) | (r2 & r3)) != 0) goto L495;
         */
        /* JADX WARN: Code restructure failed: missing block: B:404:0x4575, code lost:
        
            r2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1050293330);
         */
        /* JADX WARN: Code restructure failed: missing block: B:405:0x4582, code lost:
        
            if (r2 != null) goto L505;
         */
        /* JADX WARN: Code restructure failed: missing block: B:406:0x4584, code lost:
        
            r2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 36, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 2972, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
            r3 = com.payair.hce.getCardMetadata.AnonymousClass5.$$a[14];
            r5 = (short) (r3 - 1);
            r3 = r3;
            r8 = new java.lang.Object[1];
            a(r5, r3, (byte) (r3 - 1), r8);
            r2 = r2.getMethod((java.lang.String) r8[0], null);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1050293330, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:407:0x45cd, code lost:
        
            r2 = ((java.lang.Long) ((java.lang.reflect.Method) r2).invoke(null, null)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:408:0x45da, code lost:
        
            r5 = (int) java.lang.System.currentTimeMillis();
            r6 = ~(352337113 | (~r2));
            r8 = (-352337114) | r2;
            r10 = r5;
            r2 = (((((r2 * (-755)) + 266014521070L) + (1512 * r6)) + ((r6 | (~(r8 | r10))) * (-756))) + (((~r10) | r8) * 756)) - 1500364650;
            r5 = ((int) (r2 >> 32)) & ((((~((-570444051) | r6)) * (-783)) - 48744613) + (((~((~((int) java.lang.System.currentTimeMillis())) | (-639793556))) | (-2077019967)) * 783));
            r3 = (int) java.lang.System.currentTimeMillis();
            r2 = ((int) r2) & ((((((~(1006527880 | r6)) | (~(430698529 | r6))) * (-867)) - 1972008908) + ((((~(1006527880 | r3)) | (-1006630314)) | (~(430698529 | r3))) * (-1734))) + ((((~(r3 | (-102434))) | (~((~r3) | 1006630313))) | (~((-575931785) | r3))) * 867));
         */
        /* JADX WARN: Code restructure failed: missing block: B:409:0x4670, code lost:
        
            if (((r2 ^ r5) | (r5 & r2)) == 0) goto L515;
         */
        /* JADX WARN: Code restructure failed: missing block: B:410:0x4672, code lost:
        
            r2 = com.payair.hce.getCardMetadata.AnonymousClass5.SdkCoreAlternateContactlessPaymentDataImpl;
            com.payair.hce.getCardMetadata.AnonymousClass5.getAid = (((r2 | 125) << 1) - (r2 ^ 125)) % 128;
            r2 = new java.lang.Object[]{new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, null, new int[1]};
            r3 = (int) java.lang.System.currentTimeMillis();
            r4 = ~r3;
            r5 = ~(969849962 | r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:411:0x46a3, code lost:
        
            r7 = new java.lang.Object[]{86904972, 16, java.lang.Integer.valueOf((((((~(r3 | (-260524443))) | (~((-810071137) | r4))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) + 864762023) + (((~(260524442 | r4)) | r5) * (-1040))) + ((((~(r4 | (-969849963))) | (-1070595579)) | r5) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL))};
            r3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
         */
        /* JADX WARN: Code restructure failed: missing block: B:412:0x46f3, code lost:
        
            if (r3 != null) goto L512;
         */
        /* JADX WARN: Code restructure failed: missing block: B:413:0x46f5, code lost:
        
            r3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 49, 2713 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) android.text.TextUtils.indexOf(r12, r12, 0, 0));
            r6 = new java.lang.Object[1];
            a(653, r4[14], (byte) (-com.payair.hce.getCardMetadata.AnonymousClass5.$$a[16]), r6);
            r3 = r3.getMethod((java.lang.String) r6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:415:0x475c, code lost:
        
            ((int[]) r2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r3).invoke(null, r7)).intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:416:0x4764, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:417:0x4765, code lost:
        
            r2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1827153043);
         */
        /* JADX WARN: Code restructure failed: missing block: B:418:0x4772, code lost:
        
            if (r2 != null) goto L518;
         */
        /* JADX WARN: Code restructure failed: missing block: B:419:0x4774, code lost:
        
            r2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(25 - android.text.TextUtils.indexOf(r12, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.graphics.Color.green(0) + 2159, (char) (56400 - android.text.TextUtils.indexOf(r12, r12)));
            r3 = com.payair.hce.getCardMetadata.AnonymousClass5.$$a[14];
            r5 = (short) (r3 - 1);
            r3 = r3;
            r8 = new java.lang.Object[1];
            a(r5, r3, (byte) (r3 - 1), r8);
            r2 = r2.getMethod((java.lang.String) r8[0], null);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1827153043, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:420:0x47bb, code lost:
        
            r2 = ((java.lang.Long) ((java.lang.reflect.Method) r2).invoke(null, null)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:421:0x47c8, code lost:
        
            r5 = ~((int) java.lang.System.currentTimeMillis());
            r7 = 556483988 | r5;
            r9 = ~r2;
            r5 = r5 | r9;
            r1 = ((((((-183) * r2) + 101836569987L) + (((~(r5 | (-556483989))) | (~(r7 | r2))) * (-184))) + (((~r5) | ((~r7) | (~(r9 | 556483988)))) * 184)) + ((r2 | (-556483989)) * 184)) - 9334031;
            r5 = (int) java.lang.System.currentTimeMillis();
            r6 = ~r5;
            r5 = ~(r5 | 1055544218);
            r3 = ((int) (r1 >> 32)) & ((((((~((-1055409041) | r6)) | 381682192) | r5) * (-252)) - 1163109014) + ((r5 | (~(r6 | (-673726849)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE));
            r2 = (int) java.lang.System.currentTimeMillis();
            r1 = ((int) r1) & (((((~(637863963 | r5)) | (~(799362446 | r2))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 629783717) + (((~(r2 | (-161498501))) | (~((~r2) | (-18)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
         */
        /* JADX WARN: Code restructure failed: missing block: B:422:0x485d, code lost:
        
            if (((r1 ^ r3) | (r3 & r1)) == 0) goto L528;
         */
        /* JADX WARN: Code restructure failed: missing block: B:423:0x485f, code lost:
        
            r2 = new java.lang.Object[]{new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, null, new int[1]};
            r1 = (int) java.lang.System.currentTimeMillis();
         */
        /* JADX WARN: Code restructure failed: missing block: B:424:0x4884, code lost:
        
            r5 = new java.lang.Object[]{86904972, 16, java.lang.Integer.valueOf((((((~((-335729517) | r1)) | 335582048) | r3) * (-470)) - 480901873) + (((~(r1 | (-147469))) | (~((~r1) | 373743471))) * 470))};
            r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
         */
        /* JADX WARN: Code restructure failed: missing block: B:425:0x48c6, code lost:
        
            if (r1 != null) goto L525;
         */
        /* JADX WARN: Code restructure failed: missing block: B:426:0x48c8, code lost:
        
            r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 2713, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
            r7 = new java.lang.Object[1];
            a(653, r3[14], (byte) (-com.payair.hce.getCardMetadata.AnonymousClass5.$$a[16]), r7);
            r1 = r1.getMethod((java.lang.String) r7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:428:0x492c, code lost:
        
            ((int[]) r2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r5)).intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:429:0x4934, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:430:0x4935, code lost:
        
            r2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(887063382);
         */
        /* JADX WARN: Code restructure failed: missing block: B:431:0x4942, code lost:
        
            if (r2 != null) goto L531;
         */
        /* JADX WARN: Code restructure failed: missing block: B:432:0x4944, code lost:
        
            r2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.view.KeyEvent.normalizeMetaState(0) + 838, (char) android.view.View.combineMeasuredStates(0, 0));
            r3 = com.payair.hce.getCardMetadata.AnonymousClass5.$$a[14];
            r5 = (short) (r3 - 1);
            r3 = r3;
            r8 = new java.lang.Object[1];
            a(r5, r3, (byte) (r3 - 1), r8);
            r2 = r2.getMethod((java.lang.String) r8[0], null);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(887063382, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:433:0x4988, code lost:
        
            r2 = ((java.lang.Long) ((java.lang.reflect.Method) r2).invoke(null, null)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:434:0x4995, code lost:
        
            r5 = (int) java.lang.System.currentTimeMillis();
            r6 = ~r2;
            r8 = r5;
            r2 = ((((r2 * (-489)) + 734592852399L) + ((((-1496115790) | r6) | (~r8)) * (-490))) + (((~(r6 | 1496115789)) | (~(r8 | r6))) * 490)) - 732632099987L;
            r6 = (~((int) java.lang.System.currentTimeMillis())) | (-1791182267);
            r3 = (int) java.lang.System.currentTimeMillis();
         */
        /* JADX WARN: Code restructure failed: missing block: B:435:0x4a08, code lost:
        
            if (((((int) r2) & (((((~((-514940867) | r7)) | (~(1952167276 | r3))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 1483927745) + (((~(r3 | (-336663873))) | (~((~r3) | 2130444270))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))) | (((int) (r2 >> 32)) & (((r6 * 495) + 2137787438) + (((~r6) | (-2144560571)) * 495)))) == 0) goto L535;
         */
        /* JADX WARN: Code restructure failed: missing block: B:436:0x4a0a, code lost:
        
            r2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:437:0x4a0e, code lost:
        
            if (r2 == 0) goto L548;
         */
        /* JADX WARN: Code restructure failed: missing block: B:438:0x4a10, code lost:
        
            r3 = new java.lang.Object[]{new int[]{0}, new int[]{r2}, null, new int[1]};
            r2 = (int) java.lang.System.currentTimeMillis();
            r4 = ~r2;
            r5 = ~(706930049 | r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:439:0x4a33, code lost:
        
            r7 = new java.lang.Object[]{86904972, 16, java.lang.Integer.valueOf((((((~(r2 | 2395470)) | (~((-2131201) | r4))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) - 576435401) + (((~((-2395471) | r4)) | r5) * (-1040))) + ((((~(r4 | (-706930050))) | 264270) | r5) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL))};
            r5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
         */
        /* JADX WARN: Code restructure failed: missing block: B:440:0x4a83, code lost:
        
            if (r5 != null) goto L541;
         */
        /* JADX WARN: Code restructure failed: missing block: B:441:0x4a85, code lost:
        
            r4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.resolveSizeAndState(0, 0, 0), 2713 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) android.graphics.Color.blue(0));
            r8 = new java.lang.Object[1];
            a(653, r5[14], (byte) (-com.payair.hce.getCardMetadata.AnonymousClass5.$$a[16]), r8);
            r5 = r4.getMethod((java.lang.String) r8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:443:0x4ae5, code lost:
        
            ((int[]) r3[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r5).invoke(null, r7)).intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:444:0x4aed, code lost:
        
            r1 = new java.lang.Object[]{r3};
            r4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(712501173);
         */
        /* JADX WARN: Code restructure failed: missing block: B:445:0x4afe, code lost:
        
            if (r4 != null) goto L546;
         */
        /* JADX WARN: Code restructure failed: missing block: B:446:0x4b00, code lost:
        
            r4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)), android.text.TextUtils.lastIndexOf(r12, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3238, (char) android.text.TextUtils.getCapsMode(r12, 0, 0));
            r7 = new java.lang.Object[1];
            a(653, r5[14], (byte) (-com.payair.hce.getCardMetadata.AnonymousClass5.$$a[16]), r7);
            r4 = r4.getMethod((java.lang.String) r7[0], java.lang.Object[].class);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(712501173, r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:447:0x4b4e, code lost:
        
            ((java.lang.reflect.Method) r4).invoke(r62, r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:448:0x4b55, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:449:0x4b56, code lost:
        
            r4 = new java.lang.Object[]{0, r62, 86904972, 0};
            r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(97317038);
         */
        /* JADX WARN: Code restructure failed: missing block: B:450:0x4b83, code lost:
        
            if (r1 != null) goto L551;
         */
        /* JADX WARN: Code restructure failed: missing block: B:451:0x4b85, code lost:
        
            r1 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 3289 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) android.graphics.Color.red(0))).getDeclaredConstructor(java.lang.Integer.TYPE, (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(r12, r12) + 52, 3237 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(97317038, r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:452:0x4bdd, code lost:
        
            r1 = ((java.lang.reflect.Constructor) r1).newInstance(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:455:0x4be4, code lost:
        
            r2 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            r5 = new java.lang.Object[1];
            c("\ue628≝㬡\uf01e秊ҵ媗ᾖ뜛ￍ洭䕾\u0c76\u19db鎮レ", (r2 ^ 16) + ((r2 & 16) << 1), r5);
            r2 = java.lang.Class.forName((java.lang.String) r5[0]);
            r4 = -(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
            r6 = new java.lang.Object[1];
            c("姱獶栉ໄ邴鰼", (r4 & 5) + (r4 | 5), r6);
            r2.getMethod((java.lang.String) r6[0], null).invoke(r1, null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:456:0x4c26, code lost:
        
            r1 = new java.lang.Object[]{new int[]{0}, new int[]{0}, null, new int[1]};
            r2 = (int) java.lang.System.currentTimeMillis();
            r4 = ~(1073722358 | r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:457:0x4c47, code lost:
        
            r6 = new java.lang.Object[]{86904972, 0, java.lang.Integer.valueOf(((((297205894 | r4) * (-476)) + 436144955) + (r4 * 952)) + ((~((~r2) | 1073722358)) * 476))};
            r4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
         */
        /* JADX WARN: Code restructure failed: missing block: B:458:0x4c84, code lost:
        
            if (r4 != null) goto L558;
         */
        /* JADX WARN: Code restructure failed: missing block: B:459:0x4c86, code lost:
        
            r2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 50, 2713 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) ((-1) - android.text.TextUtils.lastIndexOf(r12, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
            r7 = new java.lang.Object[1];
            a(653, r4[14], (byte) (-com.payair.hce.getCardMetadata.AnonymousClass5.$$a[16]), r7);
            r4 = r2.getMethod((java.lang.String) r7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:461:0x4ced, code lost:
        
            ((int[]) r1[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r4).invoke(null, r6)).intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:462:0x4cf5, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:464:0x4cf6, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:465:0x4cf7, code lost:
        
            r2 = r0.getCause();
         */
        /* JADX WARN: Code restructure failed: missing block: B:466:0x4cfc, code lost:
        
            if (r2 != null) goto L564;
         */
        /* JADX WARN: Code restructure failed: missing block: B:467:0x4cfe, code lost:
        
            throw r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:468:0x4cff, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:469:0x4a0d, code lost:
        
            r2 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:470:0x4496, code lost:
        
            r3 = new java.lang.Object[]{new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, null, new int[1]};
            r2 = (int) java.lang.System.currentTimeMillis();
         */
        /* JADX WARN: Code restructure failed: missing block: B:471:0x44b5, code lost:
        
            r5 = new java.lang.Object[]{86904972, 16, java.lang.Integer.valueOf(((((~((-546308100) | r2)) * 623) - 1119852906) + (((~r2) | 19427372) * (-623))) + ((((~(r2 | (-618103124))) | 546308099) | (~(91222396 | r2))) * 623))};
            r2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
         */
        /* JADX WARN: Code restructure failed: missing block: B:472:0x4503, code lost:
        
            if (r2 != null) goto L499;
         */
        /* JADX WARN: Code restructure failed: missing block: B:473:0x4505, code lost:
        
            r2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 50, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 2713, (char) android.text.TextUtils.indexOf(r12, r12, 0, 0));
            r7 = new java.lang.Object[1];
            a(653, r4[14], (byte) (-com.payair.hce.getCardMetadata.AnonymousClass5.$$a[16]), r7);
            r2 = r2.getMethod((java.lang.String) r7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:475:0x456c, code lost:
        
            ((int[]) r3[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r2).invoke(null, r5)).intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:476:0x4574, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:482:0x4494, code lost:
        
            if (((((int) (r10 >> 32)) & ((((((~((-1432482125) | r5)) | (-4744287)) * (-865)) - 520124968) + ((~(r3 | 1432482124)) * 865)) + (((~((-4744287) | r5)) | (~(r5 | 1432482124))) * 865))) | ((((((~((-873853825) | r8)) | (~((-1983887062) | r7))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 1445175909) + (((~(r7 | (-16641))) | (~((-1110049878) | (~r7)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)) & ((int) r10))) != 0) goto L495;
         */
        /* JADX WARN: Code restructure failed: missing block: B:564:0x072b, code lost:
        
            if (((r3 ^ r4) | (r3 & r4)) != 477111747) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:565:0x072e, code lost:
        
            r7 = r28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:573:0x084c, code lost:
        
            if (((r2 ^ r3) | (r2 & r3)) != (-1032769152)) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:581:0x0971, code lost:
        
            if (((r2 ^ r3) | (r2 & r3)) == 542074309) goto L78;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x1684, code lost:
        
            if (((r2 ^ r3) | (r2 & r3)) != 477111747) goto L136;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x179f, code lost:
        
            r2 = 0;
            r3 = 0;
         */
        /* JADX WARN: Removed duplicated region for block: B:136:0x1a0f A[Catch: all -> 0x4d00, TryCatch #0 {all -> 0x4d00, blocks: (B:3:0x0002, B:6:0x001a, B:7:0x0056, B:11:0x0128, B:13:0x0176, B:14:0x01be, B:19:0x0208, B:21:0x021b, B:22:0x025e, B:26:0x02cf, B:28:0x02e2, B:29:0x0330, B:33:0x03fb, B:35:0x040e, B:36:0x0459, B:38:0x0494, B:40:0x04a7, B:41:0x04f4, B:43:0x04fd, B:45:0x051b, B:46:0x056b, B:53:0x09af, B:55:0x09c2, B:56:0x0a13, B:61:0x0c30, B:63:0x0c73, B:64:0x0cc9, B:69:0x138b, B:71:0x139e, B:72:0x13e8, B:82:0x1486, B:84:0x1499, B:85:0x14e4, B:87:0x151b, B:89:0x152e, B:90:0x157a, B:92:0x1583, B:94:0x15a1, B:95:0x15f2, B:102:0x17ca, B:104:0x17dd, B:105:0x182c, B:117:0x1918, B:119:0x196d, B:120:0x19c4, B:125:0x168c, B:127:0x16a9, B:128:0x16fc, B:134:0x19fc, B:136:0x1a0f, B:137:0x1a5e, B:139:0x1b13, B:141:0x1b26, B:142:0x1b72, B:150:0x1c5a, B:152:0x1c9f, B:153:0x1cf6, B:157:0x1d2c, B:159:0x1d3f, B:160:0x1d87, B:162:0x1e59, B:164:0x1e6c, B:165:0x1eb9, B:173:0x1fc1, B:175:0x200c, B:176:0x2068, B:183:0x2232, B:185:0x2245, B:186:0x2297, B:194:0x2382, B:196:0x23d8, B:197:0x242d, B:225:0x2860, B:227:0x28b4, B:228:0x2908, B:232:0x29a6, B:234:0x29b9, B:235:0x2a03, B:238:0x2a26, B:240:0x2a39, B:241:0x2a8c, B:248:0x2e17, B:250:0x2e2a, B:251:0x2e7a, B:263:0x2f88, B:265:0x2fda, B:266:0x302f, B:270:0x3082, B:272:0x30ab, B:273:0x3103, B:280:0x31e6, B:282:0x322d, B:283:0x3286, B:287:0x32bb, B:289:0x32e4, B:290:0x333f, B:296:0x340c, B:298:0x344d, B:299:0x34a9, B:302:0x34bf, B:304:0x34ce, B:305:0x3517, B:309:0x35e5, B:311:0x3634, B:312:0x368d, B:316:0x36a4, B:318:0x36bd, B:319:0x3707, B:323:0x37d2, B:325:0x3820, B:326:0x3878, B:329:0x388e, B:331:0x389d, B:332:0x38e2, B:336:0x39b0, B:338:0x3a01, B:339:0x3a5d, B:342:0x3a73, B:344:0x3a82, B:345:0x3aca, B:349:0x3ba1, B:351:0x3be3, B:352:0x3c39, B:355:0x3c4f, B:357:0x3c5e, B:358:0x3ca2, B:362:0x3d74, B:364:0x3dc7, B:365:0x3e1c, B:369:0x3e78, B:371:0x3ea2, B:372:0x3efd, B:376:0x3fd7, B:378:0x402d, B:379:0x4088, B:383:0x40b7, B:385:0x40ca, B:386:0x4118, B:390:0x41db, B:392:0x4233, B:393:0x4285, B:398:0x42ac, B:400:0x42bb, B:401:0x4307, B:404:0x4575, B:406:0x4584, B:407:0x45cd, B:411:0x46a3, B:413:0x46f5, B:414:0x474f, B:417:0x4765, B:419:0x4774, B:420:0x47bb, B:424:0x4884, B:426:0x48c8, B:427:0x491f, B:430:0x4935, B:432:0x4944, B:433:0x4988, B:439:0x4a33, B:441:0x4a85, B:442:0x4ad8, B:444:0x4aed, B:446:0x4b00, B:447:0x4b4e, B:449:0x4b56, B:451:0x4b85, B:452:0x4bdd, B:457:0x4c47, B:459:0x4c86, B:460:0x4ce0, B:471:0x44b5, B:473:0x4505, B:474:0x455f, B:477:0x43a8, B:479:0x43b7, B:480:0x4403, B:550:0x0b7e, B:552:0x0b91, B:553:0x0bd9, B:559:0x0618, B:561:0x0635, B:562:0x0688, B:568:0x0739, B:570:0x0756, B:571:0x07aa, B:576:0x0851, B:578:0x086e, B:579:0x08c7), top: B:2:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:141:0x1b26 A[Catch: all -> 0x4d00, TryCatch #0 {all -> 0x4d00, blocks: (B:3:0x0002, B:6:0x001a, B:7:0x0056, B:11:0x0128, B:13:0x0176, B:14:0x01be, B:19:0x0208, B:21:0x021b, B:22:0x025e, B:26:0x02cf, B:28:0x02e2, B:29:0x0330, B:33:0x03fb, B:35:0x040e, B:36:0x0459, B:38:0x0494, B:40:0x04a7, B:41:0x04f4, B:43:0x04fd, B:45:0x051b, B:46:0x056b, B:53:0x09af, B:55:0x09c2, B:56:0x0a13, B:61:0x0c30, B:63:0x0c73, B:64:0x0cc9, B:69:0x138b, B:71:0x139e, B:72:0x13e8, B:82:0x1486, B:84:0x1499, B:85:0x14e4, B:87:0x151b, B:89:0x152e, B:90:0x157a, B:92:0x1583, B:94:0x15a1, B:95:0x15f2, B:102:0x17ca, B:104:0x17dd, B:105:0x182c, B:117:0x1918, B:119:0x196d, B:120:0x19c4, B:125:0x168c, B:127:0x16a9, B:128:0x16fc, B:134:0x19fc, B:136:0x1a0f, B:137:0x1a5e, B:139:0x1b13, B:141:0x1b26, B:142:0x1b72, B:150:0x1c5a, B:152:0x1c9f, B:153:0x1cf6, B:157:0x1d2c, B:159:0x1d3f, B:160:0x1d87, B:162:0x1e59, B:164:0x1e6c, B:165:0x1eb9, B:173:0x1fc1, B:175:0x200c, B:176:0x2068, B:183:0x2232, B:185:0x2245, B:186:0x2297, B:194:0x2382, B:196:0x23d8, B:197:0x242d, B:225:0x2860, B:227:0x28b4, B:228:0x2908, B:232:0x29a6, B:234:0x29b9, B:235:0x2a03, B:238:0x2a26, B:240:0x2a39, B:241:0x2a8c, B:248:0x2e17, B:250:0x2e2a, B:251:0x2e7a, B:263:0x2f88, B:265:0x2fda, B:266:0x302f, B:270:0x3082, B:272:0x30ab, B:273:0x3103, B:280:0x31e6, B:282:0x322d, B:283:0x3286, B:287:0x32bb, B:289:0x32e4, B:290:0x333f, B:296:0x340c, B:298:0x344d, B:299:0x34a9, B:302:0x34bf, B:304:0x34ce, B:305:0x3517, B:309:0x35e5, B:311:0x3634, B:312:0x368d, B:316:0x36a4, B:318:0x36bd, B:319:0x3707, B:323:0x37d2, B:325:0x3820, B:326:0x3878, B:329:0x388e, B:331:0x389d, B:332:0x38e2, B:336:0x39b0, B:338:0x3a01, B:339:0x3a5d, B:342:0x3a73, B:344:0x3a82, B:345:0x3aca, B:349:0x3ba1, B:351:0x3be3, B:352:0x3c39, B:355:0x3c4f, B:357:0x3c5e, B:358:0x3ca2, B:362:0x3d74, B:364:0x3dc7, B:365:0x3e1c, B:369:0x3e78, B:371:0x3ea2, B:372:0x3efd, B:376:0x3fd7, B:378:0x402d, B:379:0x4088, B:383:0x40b7, B:385:0x40ca, B:386:0x4118, B:390:0x41db, B:392:0x4233, B:393:0x4285, B:398:0x42ac, B:400:0x42bb, B:401:0x4307, B:404:0x4575, B:406:0x4584, B:407:0x45cd, B:411:0x46a3, B:413:0x46f5, B:414:0x474f, B:417:0x4765, B:419:0x4774, B:420:0x47bb, B:424:0x4884, B:426:0x48c8, B:427:0x491f, B:430:0x4935, B:432:0x4944, B:433:0x4988, B:439:0x4a33, B:441:0x4a85, B:442:0x4ad8, B:444:0x4aed, B:446:0x4b00, B:447:0x4b4e, B:449:0x4b56, B:451:0x4b85, B:452:0x4bdd, B:457:0x4c47, B:459:0x4c86, B:460:0x4ce0, B:471:0x44b5, B:473:0x4505, B:474:0x455f, B:477:0x43a8, B:479:0x43b7, B:480:0x4403, B:550:0x0b7e, B:552:0x0b91, B:553:0x0bd9, B:559:0x0618, B:561:0x0635, B:562:0x0688, B:568:0x0739, B:570:0x0756, B:571:0x07aa, B:576:0x0851, B:578:0x086e, B:579:0x08c7), top: B:2:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:145:0x1c2b  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x1d3f A[Catch: all -> 0x4d00, TryCatch #0 {all -> 0x4d00, blocks: (B:3:0x0002, B:6:0x001a, B:7:0x0056, B:11:0x0128, B:13:0x0176, B:14:0x01be, B:19:0x0208, B:21:0x021b, B:22:0x025e, B:26:0x02cf, B:28:0x02e2, B:29:0x0330, B:33:0x03fb, B:35:0x040e, B:36:0x0459, B:38:0x0494, B:40:0x04a7, B:41:0x04f4, B:43:0x04fd, B:45:0x051b, B:46:0x056b, B:53:0x09af, B:55:0x09c2, B:56:0x0a13, B:61:0x0c30, B:63:0x0c73, B:64:0x0cc9, B:69:0x138b, B:71:0x139e, B:72:0x13e8, B:82:0x1486, B:84:0x1499, B:85:0x14e4, B:87:0x151b, B:89:0x152e, B:90:0x157a, B:92:0x1583, B:94:0x15a1, B:95:0x15f2, B:102:0x17ca, B:104:0x17dd, B:105:0x182c, B:117:0x1918, B:119:0x196d, B:120:0x19c4, B:125:0x168c, B:127:0x16a9, B:128:0x16fc, B:134:0x19fc, B:136:0x1a0f, B:137:0x1a5e, B:139:0x1b13, B:141:0x1b26, B:142:0x1b72, B:150:0x1c5a, B:152:0x1c9f, B:153:0x1cf6, B:157:0x1d2c, B:159:0x1d3f, B:160:0x1d87, B:162:0x1e59, B:164:0x1e6c, B:165:0x1eb9, B:173:0x1fc1, B:175:0x200c, B:176:0x2068, B:183:0x2232, B:185:0x2245, B:186:0x2297, B:194:0x2382, B:196:0x23d8, B:197:0x242d, B:225:0x2860, B:227:0x28b4, B:228:0x2908, B:232:0x29a6, B:234:0x29b9, B:235:0x2a03, B:238:0x2a26, B:240:0x2a39, B:241:0x2a8c, B:248:0x2e17, B:250:0x2e2a, B:251:0x2e7a, B:263:0x2f88, B:265:0x2fda, B:266:0x302f, B:270:0x3082, B:272:0x30ab, B:273:0x3103, B:280:0x31e6, B:282:0x322d, B:283:0x3286, B:287:0x32bb, B:289:0x32e4, B:290:0x333f, B:296:0x340c, B:298:0x344d, B:299:0x34a9, B:302:0x34bf, B:304:0x34ce, B:305:0x3517, B:309:0x35e5, B:311:0x3634, B:312:0x368d, B:316:0x36a4, B:318:0x36bd, B:319:0x3707, B:323:0x37d2, B:325:0x3820, B:326:0x3878, B:329:0x388e, B:331:0x389d, B:332:0x38e2, B:336:0x39b0, B:338:0x3a01, B:339:0x3a5d, B:342:0x3a73, B:344:0x3a82, B:345:0x3aca, B:349:0x3ba1, B:351:0x3be3, B:352:0x3c39, B:355:0x3c4f, B:357:0x3c5e, B:358:0x3ca2, B:362:0x3d74, B:364:0x3dc7, B:365:0x3e1c, B:369:0x3e78, B:371:0x3ea2, B:372:0x3efd, B:376:0x3fd7, B:378:0x402d, B:379:0x4088, B:383:0x40b7, B:385:0x40ca, B:386:0x4118, B:390:0x41db, B:392:0x4233, B:393:0x4285, B:398:0x42ac, B:400:0x42bb, B:401:0x4307, B:404:0x4575, B:406:0x4584, B:407:0x45cd, B:411:0x46a3, B:413:0x46f5, B:414:0x474f, B:417:0x4765, B:419:0x4774, B:420:0x47bb, B:424:0x4884, B:426:0x48c8, B:427:0x491f, B:430:0x4935, B:432:0x4944, B:433:0x4988, B:439:0x4a33, B:441:0x4a85, B:442:0x4ad8, B:444:0x4aed, B:446:0x4b00, B:447:0x4b4e, B:449:0x4b56, B:451:0x4b85, B:452:0x4bdd, B:457:0x4c47, B:459:0x4c86, B:460:0x4ce0, B:471:0x44b5, B:473:0x4505, B:474:0x455f, B:477:0x43a8, B:479:0x43b7, B:480:0x4403, B:550:0x0b7e, B:552:0x0b91, B:553:0x0bd9, B:559:0x0618, B:561:0x0635, B:562:0x0688, B:568:0x0739, B:570:0x0756, B:571:0x07aa, B:576:0x0851, B:578:0x086e, B:579:0x08c7), top: B:2:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:164:0x1e6c A[Catch: all -> 0x4d00, TryCatch #0 {all -> 0x4d00, blocks: (B:3:0x0002, B:6:0x001a, B:7:0x0056, B:11:0x0128, B:13:0x0176, B:14:0x01be, B:19:0x0208, B:21:0x021b, B:22:0x025e, B:26:0x02cf, B:28:0x02e2, B:29:0x0330, B:33:0x03fb, B:35:0x040e, B:36:0x0459, B:38:0x0494, B:40:0x04a7, B:41:0x04f4, B:43:0x04fd, B:45:0x051b, B:46:0x056b, B:53:0x09af, B:55:0x09c2, B:56:0x0a13, B:61:0x0c30, B:63:0x0c73, B:64:0x0cc9, B:69:0x138b, B:71:0x139e, B:72:0x13e8, B:82:0x1486, B:84:0x1499, B:85:0x14e4, B:87:0x151b, B:89:0x152e, B:90:0x157a, B:92:0x1583, B:94:0x15a1, B:95:0x15f2, B:102:0x17ca, B:104:0x17dd, B:105:0x182c, B:117:0x1918, B:119:0x196d, B:120:0x19c4, B:125:0x168c, B:127:0x16a9, B:128:0x16fc, B:134:0x19fc, B:136:0x1a0f, B:137:0x1a5e, B:139:0x1b13, B:141:0x1b26, B:142:0x1b72, B:150:0x1c5a, B:152:0x1c9f, B:153:0x1cf6, B:157:0x1d2c, B:159:0x1d3f, B:160:0x1d87, B:162:0x1e59, B:164:0x1e6c, B:165:0x1eb9, B:173:0x1fc1, B:175:0x200c, B:176:0x2068, B:183:0x2232, B:185:0x2245, B:186:0x2297, B:194:0x2382, B:196:0x23d8, B:197:0x242d, B:225:0x2860, B:227:0x28b4, B:228:0x2908, B:232:0x29a6, B:234:0x29b9, B:235:0x2a03, B:238:0x2a26, B:240:0x2a39, B:241:0x2a8c, B:248:0x2e17, B:250:0x2e2a, B:251:0x2e7a, B:263:0x2f88, B:265:0x2fda, B:266:0x302f, B:270:0x3082, B:272:0x30ab, B:273:0x3103, B:280:0x31e6, B:282:0x322d, B:283:0x3286, B:287:0x32bb, B:289:0x32e4, B:290:0x333f, B:296:0x340c, B:298:0x344d, B:299:0x34a9, B:302:0x34bf, B:304:0x34ce, B:305:0x3517, B:309:0x35e5, B:311:0x3634, B:312:0x368d, B:316:0x36a4, B:318:0x36bd, B:319:0x3707, B:323:0x37d2, B:325:0x3820, B:326:0x3878, B:329:0x388e, B:331:0x389d, B:332:0x38e2, B:336:0x39b0, B:338:0x3a01, B:339:0x3a5d, B:342:0x3a73, B:344:0x3a82, B:345:0x3aca, B:349:0x3ba1, B:351:0x3be3, B:352:0x3c39, B:355:0x3c4f, B:357:0x3c5e, B:358:0x3ca2, B:362:0x3d74, B:364:0x3dc7, B:365:0x3e1c, B:369:0x3e78, B:371:0x3ea2, B:372:0x3efd, B:376:0x3fd7, B:378:0x402d, B:379:0x4088, B:383:0x40b7, B:385:0x40ca, B:386:0x4118, B:390:0x41db, B:392:0x4233, B:393:0x4285, B:398:0x42ac, B:400:0x42bb, B:401:0x4307, B:404:0x4575, B:406:0x4584, B:407:0x45cd, B:411:0x46a3, B:413:0x46f5, B:414:0x474f, B:417:0x4765, B:419:0x4774, B:420:0x47bb, B:424:0x4884, B:426:0x48c8, B:427:0x491f, B:430:0x4935, B:432:0x4944, B:433:0x4988, B:439:0x4a33, B:441:0x4a85, B:442:0x4ad8, B:444:0x4aed, B:446:0x4b00, B:447:0x4b4e, B:449:0x4b56, B:451:0x4b85, B:452:0x4bdd, B:457:0x4c47, B:459:0x4c86, B:460:0x4ce0, B:471:0x44b5, B:473:0x4505, B:474:0x455f, B:477:0x43a8, B:479:0x43b7, B:480:0x4403, B:550:0x0b7e, B:552:0x0b91, B:553:0x0bd9, B:559:0x0618, B:561:0x0635, B:562:0x0688, B:568:0x0739, B:570:0x0756, B:571:0x07aa, B:576:0x0851, B:578:0x086e, B:579:0x08c7), top: B:2:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:168:0x1f71  */
        /* JADX WARN: Removed duplicated region for block: B:182:0x2230  */
        /* JADX WARN: Removed duplicated region for block: B:193:0x2364  */
        /* JADX WARN: Removed duplicated region for block: B:203:0x24b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:224:0x2842  */
        /* JADX WARN: Removed duplicated region for block: B:231:0x291e  */
        /* JADX WARN: Removed duplicated region for block: B:262:0x2f66  */
        /* JADX WARN: Removed duplicated region for block: B:269:0x3045  */
        /* JADX WARN: Removed duplicated region for block: B:547:0x2361 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0c73 A[Catch: all -> 0x4d00, TryCatch #0 {all -> 0x4d00, blocks: (B:3:0x0002, B:6:0x001a, B:7:0x0056, B:11:0x0128, B:13:0x0176, B:14:0x01be, B:19:0x0208, B:21:0x021b, B:22:0x025e, B:26:0x02cf, B:28:0x02e2, B:29:0x0330, B:33:0x03fb, B:35:0x040e, B:36:0x0459, B:38:0x0494, B:40:0x04a7, B:41:0x04f4, B:43:0x04fd, B:45:0x051b, B:46:0x056b, B:53:0x09af, B:55:0x09c2, B:56:0x0a13, B:61:0x0c30, B:63:0x0c73, B:64:0x0cc9, B:69:0x138b, B:71:0x139e, B:72:0x13e8, B:82:0x1486, B:84:0x1499, B:85:0x14e4, B:87:0x151b, B:89:0x152e, B:90:0x157a, B:92:0x1583, B:94:0x15a1, B:95:0x15f2, B:102:0x17ca, B:104:0x17dd, B:105:0x182c, B:117:0x1918, B:119:0x196d, B:120:0x19c4, B:125:0x168c, B:127:0x16a9, B:128:0x16fc, B:134:0x19fc, B:136:0x1a0f, B:137:0x1a5e, B:139:0x1b13, B:141:0x1b26, B:142:0x1b72, B:150:0x1c5a, B:152:0x1c9f, B:153:0x1cf6, B:157:0x1d2c, B:159:0x1d3f, B:160:0x1d87, B:162:0x1e59, B:164:0x1e6c, B:165:0x1eb9, B:173:0x1fc1, B:175:0x200c, B:176:0x2068, B:183:0x2232, B:185:0x2245, B:186:0x2297, B:194:0x2382, B:196:0x23d8, B:197:0x242d, B:225:0x2860, B:227:0x28b4, B:228:0x2908, B:232:0x29a6, B:234:0x29b9, B:235:0x2a03, B:238:0x2a26, B:240:0x2a39, B:241:0x2a8c, B:248:0x2e17, B:250:0x2e2a, B:251:0x2e7a, B:263:0x2f88, B:265:0x2fda, B:266:0x302f, B:270:0x3082, B:272:0x30ab, B:273:0x3103, B:280:0x31e6, B:282:0x322d, B:283:0x3286, B:287:0x32bb, B:289:0x32e4, B:290:0x333f, B:296:0x340c, B:298:0x344d, B:299:0x34a9, B:302:0x34bf, B:304:0x34ce, B:305:0x3517, B:309:0x35e5, B:311:0x3634, B:312:0x368d, B:316:0x36a4, B:318:0x36bd, B:319:0x3707, B:323:0x37d2, B:325:0x3820, B:326:0x3878, B:329:0x388e, B:331:0x389d, B:332:0x38e2, B:336:0x39b0, B:338:0x3a01, B:339:0x3a5d, B:342:0x3a73, B:344:0x3a82, B:345:0x3aca, B:349:0x3ba1, B:351:0x3be3, B:352:0x3c39, B:355:0x3c4f, B:357:0x3c5e, B:358:0x3ca2, B:362:0x3d74, B:364:0x3dc7, B:365:0x3e1c, B:369:0x3e78, B:371:0x3ea2, B:372:0x3efd, B:376:0x3fd7, B:378:0x402d, B:379:0x4088, B:383:0x40b7, B:385:0x40ca, B:386:0x4118, B:390:0x41db, B:392:0x4233, B:393:0x4285, B:398:0x42ac, B:400:0x42bb, B:401:0x4307, B:404:0x4575, B:406:0x4584, B:407:0x45cd, B:411:0x46a3, B:413:0x46f5, B:414:0x474f, B:417:0x4765, B:419:0x4774, B:420:0x47bb, B:424:0x4884, B:426:0x48c8, B:427:0x491f, B:430:0x4935, B:432:0x4944, B:433:0x4988, B:439:0x4a33, B:441:0x4a85, B:442:0x4ad8, B:444:0x4aed, B:446:0x4b00, B:447:0x4b4e, B:449:0x4b56, B:451:0x4b85, B:452:0x4bdd, B:457:0x4c47, B:459:0x4c86, B:460:0x4ce0, B:471:0x44b5, B:473:0x4505, B:474:0x455f, B:477:0x43a8, B:479:0x43b7, B:480:0x4403, B:550:0x0b7e, B:552:0x0b91, B:553:0x0bd9, B:559:0x0618, B:561:0x0635, B:562:0x0688, B:568:0x0739, B:570:0x0756, B:571:0x07aa, B:576:0x0851, B:578:0x086e, B:579:0x08c7), top: B:2:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x139e A[Catch: all -> 0x4d00, TryCatch #0 {all -> 0x4d00, blocks: (B:3:0x0002, B:6:0x001a, B:7:0x0056, B:11:0x0128, B:13:0x0176, B:14:0x01be, B:19:0x0208, B:21:0x021b, B:22:0x025e, B:26:0x02cf, B:28:0x02e2, B:29:0x0330, B:33:0x03fb, B:35:0x040e, B:36:0x0459, B:38:0x0494, B:40:0x04a7, B:41:0x04f4, B:43:0x04fd, B:45:0x051b, B:46:0x056b, B:53:0x09af, B:55:0x09c2, B:56:0x0a13, B:61:0x0c30, B:63:0x0c73, B:64:0x0cc9, B:69:0x138b, B:71:0x139e, B:72:0x13e8, B:82:0x1486, B:84:0x1499, B:85:0x14e4, B:87:0x151b, B:89:0x152e, B:90:0x157a, B:92:0x1583, B:94:0x15a1, B:95:0x15f2, B:102:0x17ca, B:104:0x17dd, B:105:0x182c, B:117:0x1918, B:119:0x196d, B:120:0x19c4, B:125:0x168c, B:127:0x16a9, B:128:0x16fc, B:134:0x19fc, B:136:0x1a0f, B:137:0x1a5e, B:139:0x1b13, B:141:0x1b26, B:142:0x1b72, B:150:0x1c5a, B:152:0x1c9f, B:153:0x1cf6, B:157:0x1d2c, B:159:0x1d3f, B:160:0x1d87, B:162:0x1e59, B:164:0x1e6c, B:165:0x1eb9, B:173:0x1fc1, B:175:0x200c, B:176:0x2068, B:183:0x2232, B:185:0x2245, B:186:0x2297, B:194:0x2382, B:196:0x23d8, B:197:0x242d, B:225:0x2860, B:227:0x28b4, B:228:0x2908, B:232:0x29a6, B:234:0x29b9, B:235:0x2a03, B:238:0x2a26, B:240:0x2a39, B:241:0x2a8c, B:248:0x2e17, B:250:0x2e2a, B:251:0x2e7a, B:263:0x2f88, B:265:0x2fda, B:266:0x302f, B:270:0x3082, B:272:0x30ab, B:273:0x3103, B:280:0x31e6, B:282:0x322d, B:283:0x3286, B:287:0x32bb, B:289:0x32e4, B:290:0x333f, B:296:0x340c, B:298:0x344d, B:299:0x34a9, B:302:0x34bf, B:304:0x34ce, B:305:0x3517, B:309:0x35e5, B:311:0x3634, B:312:0x368d, B:316:0x36a4, B:318:0x36bd, B:319:0x3707, B:323:0x37d2, B:325:0x3820, B:326:0x3878, B:329:0x388e, B:331:0x389d, B:332:0x38e2, B:336:0x39b0, B:338:0x3a01, B:339:0x3a5d, B:342:0x3a73, B:344:0x3a82, B:345:0x3aca, B:349:0x3ba1, B:351:0x3be3, B:352:0x3c39, B:355:0x3c4f, B:357:0x3c5e, B:358:0x3ca2, B:362:0x3d74, B:364:0x3dc7, B:365:0x3e1c, B:369:0x3e78, B:371:0x3ea2, B:372:0x3efd, B:376:0x3fd7, B:378:0x402d, B:379:0x4088, B:383:0x40b7, B:385:0x40ca, B:386:0x4118, B:390:0x41db, B:392:0x4233, B:393:0x4285, B:398:0x42ac, B:400:0x42bb, B:401:0x4307, B:404:0x4575, B:406:0x4584, B:407:0x45cd, B:411:0x46a3, B:413:0x46f5, B:414:0x474f, B:417:0x4765, B:419:0x4774, B:420:0x47bb, B:424:0x4884, B:426:0x48c8, B:427:0x491f, B:430:0x4935, B:432:0x4944, B:433:0x4988, B:439:0x4a33, B:441:0x4a85, B:442:0x4ad8, B:444:0x4aed, B:446:0x4b00, B:447:0x4b4e, B:449:0x4b56, B:451:0x4b85, B:452:0x4bdd, B:457:0x4c47, B:459:0x4c86, B:460:0x4ce0, B:471:0x44b5, B:473:0x4505, B:474:0x455f, B:477:0x43a8, B:479:0x43b7, B:480:0x4403, B:550:0x0b7e, B:552:0x0b91, B:553:0x0bd9, B:559:0x0618, B:561:0x0635, B:562:0x0688, B:568:0x0739, B:570:0x0756, B:571:0x07aa, B:576:0x0851, B:578:0x086e, B:579:0x08c7), top: B:2:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x13f3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object[] values$466995e3(java.lang.Object obj) {
            java.lang.String str;
            java.lang.Object obj2;
            java.lang.String str2;
            java.lang.Object obj3;
            long j;
            java.lang.Object obj4;
            java.lang.String str3;
            java.lang.Object obj5;
            long j2;
            java.lang.Object obj6;
            java.lang.String[] strArr;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            java.lang.Object invoke;
            java.lang.Object[] objArr;
            java.lang.String[] strArr2;
            java.lang.String[] strArr3;
            java.lang.Object obj7;
            java.lang.String str4;
            int i8;
            int i9;
            java.lang.Object obj8;
            try {
                java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1566620024);
                if (obj9 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 26, 1838 - android.text.TextUtils.getCapsMode("", 0, 0), (char) android.graphics.Color.argb(0, 0, 0, 0));
                    byte b = $$a[14];
                    short s = (short) (b - 1);
                    byte b2 = b;
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a(s, b2, (byte) (b2 - 1), objArr2);
                    obj9 = cls.getMethod((java.lang.String) objArr2[0], null);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1566620024, obj9);
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj9).invoke(null, null)).longValue();
                long currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                long j3 = ((628 * longValue) - 789914123236L) + ((longValue | currentTimeMillis | 1257825036) * (-627)) + (((~((~longValue) | currentTimeMillis)) | (-1257825037)) * (-627)) + (((~((-1257825037) | currentTimeMillis)) | (~(longValue | (~currentTimeMillis)))) * 627) + 2097903982;
                int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                int i10 = ((int) (j3 >> 32)) & (((((~((-198146122) | r10)) | 1239080289) * 226) - 2055567968) + (((~((~currentTimeMillis2) | (-33890313))) | (~((-1239080290) | currentTimeMillis2)) | 1074824480) * (-113)) + ((~(currentTimeMillis2 | (-198146122))) * 113));
                int i11 = ((int) j3) & (((((~(289881891 | r10)) | (-1147344519)) * (-366)) - 1866946523) + (((~(((int) java.lang.System.currentTimeMillis()) | (-1142947973))) | 285485345) * 366));
                if (((i10 ^ i11) | (i10 & i11)) != 0) {
                    getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 59) % 128;
                    java.lang.Object[] objArr3 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE}, null, new int[1]};
                    int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
                    int i12 = ~currentTimeMillis3;
                    java.lang.Object[] objArr4 = {86904972, 16, java.lang.Integer.valueOf((((~(i12 | (-805093532))) | (-95768012)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) + 1936568614 + (((~(i12 | (-95699084))) | (~(currentTimeMillis3 | (-68929)))) * (-519)) + (((~(currentTimeMillis3 | (-95768012))) | 805093531) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE))};
                    java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj10 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.MotionEvent.axisFromString(""), android.text.TextUtils.getCapsMode("", 0, 0) + 2713, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        a(653, r3[14], (byte) (-$$a[16]), objArr5);
                        obj10 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj10);
                    }
                    ((int[]) objArr3[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(null, objArr4)).intValue();
                    return objArr3;
                }
                int keyCodeFromString = android.view.KeyEvent.keyCodeFromString("");
                int scrollBarSize = android.view.ViewConfiguration.getScrollBarSize() >> 8;
                int i13 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b((keyCodeFromString ^ 215) + ((keyCodeFromString & 215) << 1), (scrollBarSize & 11) + (scrollBarSize | 11), "\r\u0000\r\n\uffc9\u0003￼\r\uffff\u0012￼", false, ((i13 | 3) << 1) - (i13 ^ 3), objArr6);
                java.lang.Object[] objArr7 = {(java.lang.String) objArr6[0]};
                java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                if (obj11 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 40, 1921 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    byte b3 = $$a[14];
                    short s2 = (short) (b3 - 1);
                    byte b4 = b3;
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    a(s2, b4, (byte) (b4 - 1), objArr8);
                    obj11 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj11);
                }
                java.lang.Object invoke2 = ((java.lang.reflect.Method) obj11).invoke(null, objArr7);
                if (invoke2 != null) {
                    SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 19) % 128;
                    int keyRepeatTimeout = android.view.ViewConfiguration.getKeyRepeatTimeout();
                    int i14 = -(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    b(220 - (keyRepeatTimeout >> 16), (i14 & 7) + (i14 | 7), "\ufff7\b\u000b\ufffe\ufff9\u0004", true, 1 - (~(-(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))), objArr9);
                    java.lang.String str5 = (java.lang.String) objArr9[0];
                    int i15 = -(-android.text.TextUtils.getCapsMode("", 0, 0));
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    b((i15 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + ((i15 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) << 1), 8 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), "\ufffa\u0002\u0005�\ufffe\t\uffff￼", true, 4 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr10);
                    java.lang.Object[] objArr11 = {invoke2, new java.lang.String[]{str5, (java.lang.String) objArr10[0]}};
                    java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                    if (obj12 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 43, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 2881, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1));
                        byte b5 = $$a[14];
                        short s3 = (short) (b5 - 1);
                        byte b6 = b5;
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        a(s3, b6, (byte) (b6 - 1), objArr12);
                        obj12 = cls4.getMethod((java.lang.String) objArr12[0], java.lang.String.class, java.lang.String[].class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj12);
                    }
                    long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj12).invoke(null, objArr11)).longValue();
                    long currentTimeMillis4 = (int) java.lang.System.currentTimeMillis();
                    long j4 = ~currentTimeMillis4;
                    long j5 = ~((~longValue2) | (-701108939));
                    long j6 = ((((((-107) * longValue2) - 38560991645L) + (((~(longValue2 | j4)) | (~(longValue2 | 701108938))) * (-108))) + ((((~(701108938 | currentTimeMillis4)) | j5) | (~((-701108939) | j4))) * 54)) + ((j5 | currentTimeMillis4) * 54)) - 1327602840;
                    int currentTimeMillis5 = (int) java.lang.System.currentTimeMillis();
                    int i16 = ((int) (j6 >> 32)) & (((((-1244244305) | currentTimeMillis5) * 376) - 2088991750) + (((~((~currentTimeMillis5) | (-808919187))) | 806748290) * (-376)) + (((~(currentTimeMillis5 | 808919186)) | (-2048821699)) * 376));
                    int currentTimeMillis6 = (int) java.lang.System.currentTimeMillis();
                    int i17 = ((int) j6) & (((~(2042460731 | currentTimeMillis6)) * (-301)) + 855134600 + (((~((-1889286171) | currentTimeMillis6)) | (~((~currentTimeMillis6) | 968454715))) * (-301)) + (((~(currentTimeMillis6 | (-968454716))) | (-1889286171)) * 301));
                    if (((i17 ^ i16) | (i16 & i17)) != 0) {
                        int i18 = -(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        c("ꣂ拾虀语ꣂ拾⮉ಢ噝Ӥ楶Ⲹ媗ᾖॠ£ṭ䨽碬\udaf7\u0c76\u19db\uf8cb玮", (i18 ^ 24) + ((i18 & 24) << 1), objArr13);
                        java.lang.Object[] objArr14 = {(java.lang.String) objArr13[0]};
                        java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj13 == null) {
                            java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1920, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                            byte b7 = $$a[14];
                            short s4 = (short) (b7 - 1);
                            byte b8 = b7;
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            a(s4, b8, (byte) (b8 - 1), objArr15);
                            obj13 = cls5.getMethod((java.lang.String) objArr15[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj13);
                        }
                        java.lang.Object invoke3 = ((java.lang.reflect.Method) obj13).invoke(null, objArr14);
                        int i19 = -(android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
                        int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
                        int i20 = -(-android.text.TextUtils.indexOf("", "", 0));
                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                        b((i19 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) + (i19 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE), deadChar + 30, "￼\ufffa\uffff\u000e\u0007\ufffa\u0006ￇ\u0006\ufffe\r\f\u0012\fￇ\r￼\u000e�\b\u000b\tￇ\b\u000b\u000b\ufffe\u000b\u000e\r", true, (i20 ^ 25) + ((i20 & 25) << 1), objArr16);
                        java.lang.Object[] objArr17 = {(java.lang.String) objArr16[0]};
                        java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj14 == null) {
                            java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1969 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                            byte b9 = $$a[14];
                            short s5 = (short) (b9 - 1);
                            byte b10 = b9;
                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                            a(s5, b10, (byte) (b10 - 1), objArr18);
                            obj14 = cls6.getMethod((java.lang.String) objArr18[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj14);
                        }
                        java.lang.Object invoke4 = ((java.lang.reflect.Method) obj14).invoke(null, objArr17);
                        if (invoke3 != null) {
                            java.lang.Object[] objArr19 = {invoke3, 42};
                            java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj15 == null) {
                                java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter("", 0) + 28, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2546, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                                byte b11 = $$a[14];
                                short s6 = (short) (b11 - 1);
                                byte b12 = b11;
                                java.lang.Object[] objArr20 = new java.lang.Object[1];
                                a(s6, b12, (byte) (b12 - 1), objArr20);
                                obj15 = cls7.getMethod((java.lang.String) objArr20[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj15);
                            }
                            long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj15).invoke(null, objArr19)).longValue();
                            long currentTimeMillis7 = (int) java.lang.System.currentTimeMillis();
                            long j7 = (-1200169197) | (~currentTimeMillis7);
                            long j8 = (((-518) * longValue3) - 621687643528L) + (((~j7) | longValue3) * 519) + (((~(j7 | longValue3)) | (~(1200169196 | longValue3 | currentTimeMillis7))) * (-519)) + (((~(longValue3 | currentTimeMillis7)) | 1200169196) * 519) + 56931328;
                            int currentTimeMillis8 = (int) java.lang.System.currentTimeMillis();
                            int i21 = ((int) (j8 >> 32)) & ((((~((~currentTimeMillis8) | (-1101021313))) | (~((-811117674) | currentTimeMillis8))) * (-302)) + 1273650254 + ((~((-1101021313) | currentTimeMillis8)) * (-604)) + (((~(currentTimeMillis8 | (-1912138986))) | 134484226) * 302));
                            int currentTimeMillis9 = (int) java.lang.System.currentTimeMillis();
                            int i22 = ~((-1457279515) | (~currentTimeMillis9));
                            int i23 = ((int) j8) & (((18941985 | i22 | (~(1457279514 | currentTimeMillis9))) * (-338)) + 670197223 + (((~(currentTimeMillis9 | 1476221499)) | i22) * 338));
                            if (((i21 ^ i23) | (i23 & i21)) == 477111747) {
                                str = "";
                                if (android.os.Build.VERSION.SDK_INT > 33) {
                                    int i24 = -(-android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
                                    int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
                                    int i25 = -android.graphics.ImageFormat.getBitsPerPixel(0);
                                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                                    b((i24 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE) + (i24 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE), 28 - (edgeSlop >> 16), "\u000b\uffd1\u0005\u0016\u0007\uffd1\u0005\u0014\uffd0\u0007\u000e\u0004\u0003\t\t\u0017\u0004\u0007\u0006ￏ\u0006\r\u000e\u000e\uffd1\u0016\u000b\u0010", true, ((i25 | 5) << 1) - (i25 ^ 5), objArr21);
                                    java.lang.Object[] objArr22 = {(java.lang.String) objArr21[0]};
                                    java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                    if (obj16 == null) {
                                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.os.Process.myPid() >> 22), (android.os.Process.myPid() >> 22) + 3161, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 33098));
                                        byte b13 = $$a[14];
                                        short s7 = (short) (b13 - 1);
                                        byte b14 = b13;
                                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                                        a(s7, b14, (byte) (b14 - 1), objArr23);
                                        obj16 = cls8.getMethod((java.lang.String) objArr23[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj16);
                                    }
                                    long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj16).invoke(null, objArr22)).longValue();
                                    long currentTimeMillis10 = (int) java.lang.System.currentTimeMillis();
                                    long j9 = 1076782986 | longValue4;
                                    long j10 = ~currentTimeMillis10;
                                    long j11 = ((((((-279) * longValue4) - 151826401167L) + ((longValue4 | currentTimeMillis10) * 140)) + (((~j9) | (~(j10 | longValue4))) * (-280))) + ((((~((~longValue4) | (-1076782987))) | (~((-1076782987) | j10))) | (~(j9 | currentTimeMillis10))) * 140)) - 260885121;
                                    int currentTimeMillis11 = (int) java.lang.System.currentTimeMillis();
                                    int i26 = ((int) (j11 >> 32)) & ((((-2179157) | currentTimeMillis11) * (-627)) + 635053320 + (((~(817460308 | currentTimeMillis11)) | (-2040280577)) * (-627)) + (((~((~currentTimeMillis11) | (-817460309))) | (~((-2040280577) | currentTimeMillis11))) * 627));
                                    int i27 = ~((int) java.lang.System.currentTimeMillis());
                                    int i28 = ((int) j11) & ((((~((-33571206) | i27)) | (~((-537464865) | i27))) * (-184)) + 1019428157 + (((~(i27 | (-1176923614))) | (~((-1680817273) | i27)) | 1143352408) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 1914867160);
                                    if (((i26 ^ i28) | (i26 & i28)) == 1) {
                                        i9 = 1;
                                        i8 = 0;
                                        int[] iArr = new int[i9];
                                        int[] iArr2 = new int[i9];
                                        iArr[i8] = i8;
                                        iArr2[i8] = 260;
                                        java.lang.Object[] objArr24 = {iArr, iArr2, null, new int[i9]};
                                        int currentTimeMillis12 = (int) java.lang.System.currentTimeMillis();
                                        java.lang.Object[] objArr25 = {86904972, 16, java.lang.Integer.valueOf((((~((~currentTimeMillis12) | 994686966)) * 130) - 1556987663) + (((~(currentTimeMillis12 | 994686966)) | 285279526) * 130))};
                                        obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj8 == null) {
                                            java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.MotionEvent.axisFromString(str), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2713, (char) android.view.View.MeasureSpec.getSize(0));
                                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                                            a(653, r3[14], (byte) (-$$a[16]), objArr26);
                                            obj8 = cls9.getMethod((java.lang.String) objArr26[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                                        }
                                        ((int[]) objArr24[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr25)).intValue();
                                        return objArr24;
                                    }
                                    int i29 = getAid;
                                    SdkCoreAlternateContactlessPaymentDataImpl = ((i29 & 99) + (i29 | 99)) % 128;
                                    int i30 = (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                    java.lang.Object[] objArr27 = new java.lang.Object[1];
                                    c("鎮レ奒☤徨뭘ᆫำ", (i30 & 7) + (i30 | 7), objArr27);
                                    java.lang.String str6 = (java.lang.String) objArr27[0];
                                    int i31 = -(-android.view.Gravity.getAbsoluteGravity(0, 0));
                                    int i32 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                                    b(((i31 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) << 1) - (i31 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE), ((i32 | 6) << 1) - (i32 ^ 6), "�\ufff7\b\u0006\uffff\u0004", false, -android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr28);
                                    java.lang.String str7 = (java.lang.String) objArr28[0];
                                    int capsMode = android.text.TextUtils.getCapsMode(str, 0, 0);
                                    int currentTimeMillis13 = (int) java.lang.System.currentTimeMillis();
                                    int i33 = capsMode * 615;
                                    int i34 = ((-136086) ^ i33) + ((i33 & (-136086)) << 1);
                                    int i35 = ~capsMode;
                                    int i36 = ~((i35 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE) | (i35 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE));
                                    int i37 = (i36 & currentTimeMillis13) | (currentTimeMillis13 ^ i36);
                                    int i38 = ~((capsMode ^ (-223)) | (capsMode & (-223)));
                                    int i39 = ((i37 ^ i38) | (i37 & i38)) * 614;
                                    int i40 = ~currentTimeMillis13;
                                    int i41 = ~((i35 ^ i40) | (i35 & i40));
                                    int i42 = (i36 ^ i41) | (i41 & i36);
                                    int i43 = ~((i40 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE) | (i40 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE));
                                    int i44 = -(-(((i42 ^ i43) | (i43 & i42)) * (-1228)));
                                    int i45 = (i35 & (-223)) | (i35 ^ (-223));
                                    int i46 = (capsMode ^ i40) | (capsMode & i40);
                                    int gidForName = android.os.Process.getGidForName(str);
                                    int i47 = -android.text.TextUtils.getOffsetAfter(str, 0);
                                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                                    b((((((i34 ^ i39) + ((i34 & i39) << 1)) - (~i44)) - 1) - (~(((~((i40 ^ i45) | (i45 & i40))) | (~((i46 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE) | (i46 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE)))) * 614))) - 1, ((gidForName | 8) << 1) - (gidForName ^ 8), "\u0007\ufff9\u0006\ufff8\ufff8\u0001\t", false, ((i47 | 4) << 1) - (i47 ^ 4), objArr29);
                                    java.lang.String str8 = (java.lang.String) objArr29[0];
                                    int i48 = -android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                    int i49 = -(-(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                                    b(219 - (~i48), ((i49 | 8) << 1) - (i49 ^ 8), "\u000b\ufffa\u0007￼\ufff9\ufff7\b\ufffa\u0007", false, android.text.TextUtils.getOffsetAfter(str, 0) + 3, objArr30);
                                    java.lang.String str9 = (java.lang.String) objArr30[0];
                                    int i50 = -(-android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                                    c("䭤љ⺑\uee39⾌銨", ((i50 | 6) << 1) - (i50 ^ 6), objArr31);
                                    java.lang.String str10 = (java.lang.String) objArr31[0];
                                    int capsMode2 = android.text.TextUtils.getCapsMode(str, 0, 0);
                                    java.lang.Object[] objArr32 = new java.lang.Object[1];
                                    c("뮭竚揄丣ꭓ\uaada\uea49뜉㬪矇돫䶫짴謍", (capsMode2 ^ 13) + ((capsMode2 & 13) << 1), objArr32);
                                    java.lang.String str11 = (java.lang.String) objArr32[0];
                                    int i51 = -android.widget.ExpandableListView.getPackedPositionType(0L);
                                    java.lang.Object[] objArr33 = new java.lang.Object[1];
                                    c("酙澢撼ꌺ峓ꆰ", (i51 ^ 5) + ((i51 & 5) << 1), objArr33);
                                    java.lang.String str12 = (java.lang.String) objArr33[0];
                                    int i52 = -android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                    int currentTimeMillis14 = (int) java.lang.System.currentTimeMillis();
                                    int i53 = i52 * 306;
                                    int i54 = (i53 & androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS) + (i53 | androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS);
                                    int i55 = ~((i52 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) | (i52 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                                    int i56 = ~((i52 ^ currentTimeMillis14) | (i52 & currentTimeMillis14));
                                    int i57 = ~(i52 | (~currentTimeMillis14));
                                    int i58 = -android.view.Gravity.getAbsoluteGravity(0, 0);
                                    int size = android.view.View.MeasureSpec.getSize(0);
                                    java.lang.Object[] objArr34 = new java.lang.Object[1];
                                    b((((64260 | i54) << 1) - (64260 ^ i54)) + (((i55 & i56) | (i55 ^ i56)) * 305) + (((i57 ^ (-211)) | (i57 & (-211))) * 305), ((i58 | 6) << 1) - (i58 ^ 6), "\u0005ￒ\b\u000f\u0004\u0011", false, (size ^ 2) + ((size & 2) << 1), objArr34);
                                    java.lang.String str13 = (java.lang.String) objArr34[0];
                                    java.lang.Object[] objArr35 = new java.lang.Object[1];
                                    c("쓳ᨆ", android.view.View.getDefaultSize(0, 0) + 2, objArr35);
                                    java.lang.String str14 = (java.lang.String) objArr35[0];
                                    java.lang.Object[] objArr36 = new java.lang.Object[1];
                                    c("趌먼嘕㈗ﳘ\uf0ecꇚ쉹姱獶个吽傰ꘌ왷\ue9f9", 15 - (~(-(-(android.view.ViewConfiguration.getLongPressTimeout() >> 16)))), objArr36);
                                    java.lang.String str15 = (java.lang.String) objArr36[0];
                                    float length = android.graphics.PointF.length(0.0f, 0.0f);
                                    int i59 = -android.graphics.Color.argb(0, 0, 0, 0);
                                    int scrollBarSize2 = android.view.ViewConfiguration.getScrollBarSize() >> 8;
                                    java.lang.Object[] objArr37 = new java.lang.Object[1];
                                    b(213 - (length > 0.0f ? 1 : (length == 0.0f ? 0 : -1)), (i59 ^ 10) + ((i59 & 10) << 1), "\u0004\u0011\ufffe\u0004\u0001ￋ\u000f\u0000\t\f", false, (scrollBarSize2 ^ 8) + ((scrollBarSize2 & 8) << 1), objArr37);
                                    java.lang.String str16 = (java.lang.String) objArr37[0];
                                    int i60 = (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                    int i61 = -android.text.TextUtils.indexOf(str, str, 0, 0);
                                    int i62 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                    int currentTimeMillis15 = (int) java.lang.System.currentTimeMillis();
                                    int i63 = 609 - (~(-(-(i62 * 306))));
                                    int i64 = ~(i62 | 7);
                                    int i65 = ~(i62 | currentTimeMillis15);
                                    int i66 = ~currentTimeMillis15;
                                    int i67 = ~((i62 ^ i66) | (i62 & i66));
                                    java.lang.Object[] objArr38 = new java.lang.Object[1];
                                    b(((i60 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE) << 1) - (i60 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE), (i61 & 8) + (i61 | 8), "\u0003\ufff7\u0006\ufff5\u0002\uffff\u0004\u0006", false, (i63 ^ 2142) + ((i63 & 2142) << 1) + (((i64 & i65) | (i64 ^ i65)) * 305) + (((i67 ^ (-8)) | (i67 & (-8))) * 305), objArr38);
                                    java.lang.String str17 = (java.lang.String) objArr38[0];
                                    int i68 = -android.view.KeyEvent.getDeadChar(0, 0);
                                    int lastIndexOf = android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                    int i69 = -((android.os.Process.getThreadPriority(0) + 20) >> 6);
                                    java.lang.Object[] objArr39 = new java.lang.Object[1];
                                    b(((i68 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) << 1) - (i68 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE), (lastIndexOf & 13) + (lastIndexOf | 13), "\ufff9\u0005\u0002\u0002\ufffb\ufff9\n\ufffa\u0006\b\u0005￼", false, (i69 & 8) + (i69 | 8), objArr39);
                                    java.lang.String str18 = (java.lang.String) objArr39[0];
                                    int i70 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                    java.lang.Object[] objArr40 = new java.lang.Object[1];
                                    c("㲍䅪弫\ue103ӊ趖䫻ƫ\ue81b䮲\u0b79䘟놥ힶ", (i70 ^ 14) + ((i70 & 14) << 1), objArr40);
                                    java.lang.String str19 = (java.lang.String) objArr40[0];
                                    java.lang.Object[] objArr41 = new java.lang.Object[1];
                                    c("\u0c76\u19db\ue43c窶蛈샺邴鰼", 6 - (~(-(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))), objArr41);
                                    java.lang.String str20 = (java.lang.String) objArr41[0];
                                    int i71 = -(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                    java.lang.Object[] objArr42 = new java.lang.Object[1];
                                    c("던櫥긭늙覍䬆峓ꆰ", ((i71 | 6) << 1) - (i71 ^ 6), objArr42);
                                    java.lang.String str21 = (java.lang.String) objArr42[0];
                                    java.lang.Object[] objArr43 = new java.lang.Object[1];
                                    c("噵ⷿ⾌銨侷亶鸿豰", 7 - (~(-(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))), objArr43);
                                    java.lang.String str22 = (java.lang.String) objArr43[0];
                                    long zoomControlsTimeout = android.view.ViewConfiguration.getZoomControlsTimeout();
                                    int i72 = -(-android.view.View.getDefaultSize(0, 0));
                                    java.lang.Object[] objArr44 = new java.lang.Object[1];
                                    b(227 - (~(zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1))), ((i72 | 2) << 1) - (i72 ^ 2), "\u0000\u0000", false, 2 - (~android.view.MotionEvent.axisFromString(str)), objArr44);
                                    java.lang.String str23 = (java.lang.String) objArr44[0];
                                    java.lang.Object[] objArr45 = new java.lang.Object[1];
                                    c("姱獶栉ໄ홻幕䰟ᶣ㫰珓⮋칭⌫阫㛿у\ue880唻뙾㥂", 19 - (~(-android.view.View.combineMeasuredStates(0, 0))), objArr45);
                                    java.lang.String str24 = (java.lang.String) objArr45[0];
                                    java.lang.Object[] objArr46 = new java.lang.Object[1];
                                    c("姱獶涹仨ꃓꌅ", android.widget.ExpandableListView.getPackedPositionType(0L) + 6, objArr46);
                                    java.lang.String str25 = (java.lang.String) objArr46[0];
                                    int i73 = -android.view.View.combineMeasuredStates(0, 0);
                                    int currentTimeMillis16 = (int) java.lang.System.currentTimeMillis();
                                    int i74 = i73 * 371;
                                    int i75 = ~currentTimeMillis16;
                                    int i76 = ~(i75 | (-231));
                                    int i77 = ~i73;
                                    int i78 = ~(i77 | currentTimeMillis16);
                                    int i79 = (((((85330 | i74) << 1) - (i74 ^ 85330)) + (((i76 & i78) | (i76 ^ i78)) * (-370))) - (~((((~((currentTimeMillis16 ^ (-231)) | (currentTimeMillis16 & (-231)))) | (~((i75 & i77) | (i75 ^ i77)))) | (~((i73 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE) | (i73 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE)))) * (-370)))) - 1;
                                    int i80 = (~(i73 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE)) * com.knotapi.knot.utilities.Constants.ID_KROGER;
                                    java.lang.Object[] objArr47 = new java.lang.Object[1];
                                    b((i79 & i80) + (i80 | i79), android.graphics.Color.alpha(0) + 2, "\uffff\u0001", false, 2 - (~(-(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))), objArr47);
                                    java.lang.String str26 = (java.lang.String) objArr47[0];
                                    int i81 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                    int i82 = -(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                    int i83 = -(-(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                    java.lang.Object[] objArr48 = new java.lang.Object[1];
                                    b((i81 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE) + ((i81 & com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE) << 1), ((i82 | 16) << 1) - (i82 ^ 16), "\n\u000b\t\t\ufff7\u0004\uffff\n\uffff\u0010\ufffb\bￃ\t\n\ufff7", false, ((i83 | 3) << 1) - (i83 ^ 3), objArr48);
                                    java.lang.String str27 = (java.lang.String) objArr48[0];
                                    int i84 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                    int currentTimeMillis17 = (int) java.lang.System.currentTimeMillis();
                                    int i85 = i84 * (-830);
                                    int i86 = ~currentTimeMillis17;
                                    int i87 = ~((i86 ^ (-222)) | (i86 & (-222)));
                                    int i88 = (i84 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE) | (i84 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE);
                                    int i89 = ~((i88 ^ currentTimeMillis17) | (i88 & currentTimeMillis17));
                                    int i90 = (i84 ^ (-222)) | (i84 & (-222));
                                    int i91 = ~i84;
                                    int i92 = ~((i86 ^ i91) | (i86 & i91));
                                    int i93 = ~((i84 ^ currentTimeMillis17) | (i84 & currentTimeMillis17));
                                    int i94 = (i93 ^ i92) | (i93 & i92);
                                    int i95 = ~((currentTimeMillis17 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE) | (currentTimeMillis17 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE));
                                    int i96 = -(-(((i94 ^ i95) | (i94 & i95)) * 831));
                                    int i97 = -android.graphics.Color.argb(0, 0, 0, 0);
                                    int currentTimeMillis18 = (int) java.lang.System.currentTimeMillis();
                                    int i98 = i97 * 71;
                                    int i99 = (i98 ^ (-621)) + ((i98 & (-621)) << 1);
                                    int i100 = ~i97;
                                    int i101 = ~((i100 & 9) | (i100 ^ 9));
                                    int i102 = ~((currentTimeMillis18 ^ 9) | (currentTimeMillis18 & 9));
                                    int i103 = -(-(((i101 & i102) | (i101 ^ i102)) * (-140)));
                                    int i104 = (i99 & i103) + (i103 | i99);
                                    int i105 = (~(i97 | 9 | currentTimeMillis18)) * 70;
                                    int i106 = (i104 & i105) + (i105 | i104);
                                    int i107 = ~(i100 | 9);
                                    int i108 = ~((i97 ^ (-10)) | (i97 & (-10)));
                                    int i109 = (i107 ^ i108) | (i107 & i108);
                                    int i110 = ~((i97 & currentTimeMillis18) | (i97 ^ currentTimeMillis18));
                                    int i111 = ((i109 ^ i110) | (i110 & i109)) * 70;
                                    java.lang.Object[] objArr49 = new java.lang.Object[1];
                                    b(((((((183872 & i85) + (i85 | 183872)) + (((i87 & i89) | (i87 ^ i89)) * (-831))) - (~((~((currentTimeMillis17 ^ i90) | (i90 & currentTimeMillis17))) * (-1662)))) - 1) - (~i96)) - 1, (i106 ^ i111) + ((i111 & i106) << 1), "\b\ufff7\ufff9\ufffb\u0006\ufff7\n\ufffe\n", false, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 8, objArr49);
                                    java.lang.String str28 = (java.lang.String) objArr49[0];
                                    java.lang.Object[] objArr50 = new java.lang.Object[1];
                                    c("\udc11᥊ṭ䨽\uefc9\ufddb㤋\ueec4ﻵ莕", android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 10, objArr50);
                                    java.lang.String str29 = (java.lang.String) objArr50[0];
                                    int capsMode3 = android.text.TextUtils.getCapsMode(str, 0, 0);
                                    int i112 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                    java.lang.Object[] objArr51 = new java.lang.Object[1];
                                    b(217 - capsMode3, ((i112 | 59) << 1) - (i112 ^ 59), "\ufffa\u000b\rￏ\ufffe\r\u000e\b\u000b\ufffe￼", true, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 3, objArr51);
                                    java.lang.String str30 = (java.lang.String) objArr51[0];
                                    int red = android.graphics.Color.red(0);
                                    int i113 = -(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                    int i114 = -(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                    java.lang.Object[] objArr52 = new java.lang.Object[1];
                                    b((red ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE) + ((red & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE) << 1), ((i113 | 11) << 1) - (i113 ^ 11), "\ufff9\ufff4\ufffe\u0003\ufffb\u0004\n\u0003\f\ufffe\u0003", false, ((i114 | 6) << 1) - (i114 ^ 6), objArr52);
                                    java.lang.String str31 = (java.lang.String) objArr52[0];
                                    int lastIndexOf2 = android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                    java.lang.Object[] objArr53 = new java.lang.Object[1];
                                    c("蛈샺䰟ᶣ뙥涪씿弥⸏魲律꧟\uffef蚈굩\udcfd", (lastIndexOf2 ^ 16) + ((lastIndexOf2 & 16) << 1), objArr53);
                                    java.lang.String str32 = (java.lang.String) objArr53[0];
                                    int i115 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
                                    java.lang.Object[] objArr54 = new java.lang.Object[1];
                                    c("蛈샺䰟ᶣ뙥涪꯳씹\uf48f뢣鼆㸹㮅鹯", (i115 & 14) + (i115 | 14), objArr54);
                                    java.lang.String[] strArr4 = {str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, (java.lang.String) objArr54[0]};
                                    int i116 = (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                    int currentTimeMillis19 = (int) java.lang.System.currentTimeMillis();
                                    int i117 = i116 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE;
                                    int i118 = ~i116;
                                    int i119 = (i118 ^ (-216)) | (i118 & (-216));
                                    int i120 = ~currentTimeMillis19;
                                    int i121 = (i116 ^ 215) | (i116 & 215);
                                    int i122 = ((-58265) ^ i117) + ((i117 & (-58265)) << 1) + (((~((i119 & i120) | (i119 ^ i120))) | (~((i121 & currentTimeMillis19) | (i121 ^ currentTimeMillis19)))) * (-272));
                                    int i123 = ~((i118 ^ 215) | (i118 & 215));
                                    int i124 = ~(i118 | currentTimeMillis19);
                                    int i125 = ((i123 ^ i124) | (i124 & i123)) * (-272);
                                    int i126 = ~((i116 ^ currentTimeMillis19) | (i116 & currentTimeMillis19));
                                    int threadPriority = android.os.Process.getThreadPriority(0);
                                    int i127 = -(-((((threadPriority | 20) << 1) - (threadPriority ^ 20)) >> 6));
                                    int tapTimeout = android.view.ViewConfiguration.getTapTimeout() >> 16;
                                    int currentTimeMillis20 = (int) java.lang.System.currentTimeMillis();
                                    int i128 = (tapTimeout * (-445)) - 890;
                                    int i129 = ~tapTimeout;
                                    int i130 = ~(i129 | (-3));
                                    int i131 = ~((~currentTimeMillis20) | (-3));
                                    int i132 = -(-(((i130 & i131) | (i130 ^ i131)) * 446));
                                    int i133 = tapTimeout | (-3);
                                    java.lang.Object[] objArr55 = new java.lang.Object[1];
                                    b((i122 ^ i125) + ((i125 & i122) << 1) + (((i126 ^ 215) | (i126 & 215)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE), 10 - (~i127), "\r\u0000\r\n\uffc9\u0003￼\r\uffff\u0012￼", false, (i128 & i132) + (i128 | i132) + (((~((currentTimeMillis20 & i133) | (i133 ^ currentTimeMillis20))) | (~((i129 ^ 2) | (i129 & 2)))) * 446) + ((~((i129 & (-3)) | (i129 ^ (-3)))) * 446), objArr55);
                                    java.lang.Object[] objArr56 = {(java.lang.String) objArr55[0]};
                                    obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj2 == null) {
                                        java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 1921 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                        byte b15 = $$a[14];
                                        short s8 = (short) (b15 - 1);
                                        byte b16 = b15;
                                        java.lang.Object[] objArr57 = new java.lang.Object[1];
                                        a(s8, b16, (byte) (b16 - 1), objArr57);
                                        obj2 = cls10.getMethod((java.lang.String) objArr57[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj2);
                                    }
                                    str2 = (java.lang.String) ((java.lang.reflect.Method) obj2).invoke(null, objArr56);
                                    if (str2 != null) {
                                        int i134 = -(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                        int i135 = -android.text.TextUtils.indexOf(str, str);
                                        java.lang.Object[] objArr58 = new java.lang.Object[1];
                                        b(220 - (~i134), (i135 ^ 6) + ((i135 & 6) << 1), "\ufff7\b\u000b\ufffe\ufff9\u0004", true, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2, objArr58);
                                        java.lang.String str33 = (java.lang.String) objArr58[0];
                                        int lastIndexOf3 = android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                        int i136 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                        int i137 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        java.lang.Object[] objArr59 = new java.lang.Object[1];
                                        b(219 - lastIndexOf3, 8 - (~i136), "\ufffa\u0002\u0005�\ufffe\t\uffff￼", true, (i137 & 4) + (i137 | 4), objArr59);
                                        java.lang.String[] strArr5 = {str33, (java.lang.String) objArr59[0]};
                                        int i138 = 0;
                                        while (true) {
                                            if (i138 >= 2) {
                                                break;
                                            }
                                            if (str2.contains(strArr5[i138])) {
                                                int i139 = -(-(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                                                java.lang.Object[] objArr60 = new java.lang.Object[1];
                                                c("ꣂ拾虀语ꣂ拾⮉ಢ噝Ӥ楶Ⲹ媗ᾖॠ£ṭ䨽碬\udaf7\u0c76\u19db\uf8cb玮", (i139 & 23) + (i139 | 23), objArr60);
                                                java.lang.Object[] objArr61 = {(java.lang.String) objArr60[0]};
                                                java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                if (obj17 == null) {
                                                    java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '\b', 1921 - android.text.TextUtils.getCapsMode(str, 0, 0), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                                    byte b17 = $$a[14];
                                                    short s9 = (short) (b17 - 1);
                                                    byte b18 = b17;
                                                    java.lang.Object[] objArr62 = new java.lang.Object[1];
                                                    a(s9, b18, (byte) (b18 - 1), objArr62);
                                                    obj17 = cls11.getMethod((java.lang.String) objArr62[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj17);
                                                }
                                                java.lang.Object invoke5 = ((java.lang.reflect.Method) obj17).invoke(null, objArr61);
                                                int resolveSizeAndState = android.view.View.resolveSizeAndState(0, 0, 0);
                                                int i140 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                java.lang.Object[] objArr63 = new java.lang.Object[1];
                                                b(216 - (~resolveSizeAndState), ((i140 | 31) << 1) - (i140 ^ 31), "￼\ufffa\uffff\u000e\u0007\ufffa\u0006ￇ\u0006\ufffe\r\f\u0012\fￇ\r￼\u000e�\b\u000b\tￇ\b\u000b\u000b\ufffe\u000b\u000e\r", true, android.view.View.resolveSizeAndState(0, 0, 0) + 25, objArr63);
                                                java.lang.Object[] objArr64 = {(java.lang.String) objArr63[0]};
                                                java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                if (obj18 == null) {
                                                    java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 40, 1921 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                                    byte b19 = $$a[14];
                                                    short s10 = (short) (b19 - 1);
                                                    byte b20 = b19;
                                                    java.lang.Object[] objArr65 = new java.lang.Object[1];
                                                    a(s10, b20, (byte) (b20 - 1), objArr65);
                                                    obj18 = cls12.getMethod((java.lang.String) objArr65[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj18);
                                                }
                                                java.lang.Object invoke6 = ((java.lang.reflect.Method) obj18).invoke(null, objArr64);
                                                if (invoke5 != null) {
                                                    java.lang.Object[] objArr66 = {invoke5, 42};
                                                    java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                    if (obj19 == null) {
                                                        java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 28, 2593 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) android.graphics.Color.red(0));
                                                        byte b21 = $$a[14];
                                                        short s11 = (short) (b21 - 1);
                                                        byte b22 = b21;
                                                        java.lang.Object[] objArr67 = new java.lang.Object[1];
                                                        a(s11, b22, (byte) (b22 - 1), objArr67);
                                                        obj19 = cls13.getMethod((java.lang.String) objArr67[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj19);
                                                    }
                                                    long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj19).invoke(null, objArr66)).longValue();
                                                    int currentTimeMillis21 = (int) java.lang.System.currentTimeMillis();
                                                    long j12 = ~longValue5;
                                                    long j13 = currentTimeMillis21;
                                                    long j14 = longValue5 | (-1242027741);
                                                    strArr3 = strArr4;
                                                    long j15 = ((longValue5 * (-751)) - 932762832740L) + (((~(j12 | (-1242027741))) | (~(j13 | (-1242027741)))) * 1504) + ((~(j13 | j14)) * (-1504)) + (((~j14) | (~(1242027740 | j12))) * 752) + 15072784;
                                                    int i141 = ~((~((int) java.lang.System.currentTimeMillis())) | 1047417268);
                                                    int i142 = ((int) (j15 >> 32)) & ((((675434496 | i141) * (-970)) - 567344734) + ((i141 | 371982772) * 970));
                                                    int currentTimeMillis22 = (int) java.lang.System.currentTimeMillis();
                                                    int i143 = ((int) j15) & (((((~(2080319044 | currentTimeMillis22)) | (-2147481311)) * (-566)) - 1435903669) + ((~(currentTimeMillis22 | (-67162267))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST));
                                                } else {
                                                    strArr3 = strArr4;
                                                }
                                                if (invoke6 != null) {
                                                    java.lang.Object[] objArr68 = {invoke6, 42};
                                                    java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                    if (obj20 == null) {
                                                        java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 27, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 2594, (char) (android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1));
                                                        byte b23 = $$a[14];
                                                        short s12 = (short) (b23 - 1);
                                                        byte b24 = b23;
                                                        java.lang.Object[] objArr69 = new java.lang.Object[1];
                                                        a(s12, b24, (byte) (b24 - 1), objArr69);
                                                        obj20 = cls14.getMethod((java.lang.String) objArr69[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj20);
                                                    }
                                                    long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj20).invoke(null, objArr68)).longValue();
                                                    long currentTimeMillis23 = (int) java.lang.System.currentTimeMillis();
                                                    long j16 = ~currentTimeMillis23;
                                                    long j17 = ((-219) * longValue6) + 57549018579L + (((~((~longValue6) | (-260402800))) | (~(260402799 | j16 | longValue6))) * 220) + (((~(j16 | longValue6)) | 260402799) * (-440)) + ((longValue6 | 260402799 | currentTimeMillis23) * 220) + 996697725;
                                                    int currentTimeMillis24 = (int) java.lang.System.currentTimeMillis();
                                                    int currentTimeMillis25 = (int) java.lang.System.currentTimeMillis();
                                                }
                                            } else {
                                                int i144 = i138 + 98;
                                                i138 = (i144 | (-97)) + (i144 & (-97));
                                            }
                                        }
                                    }
                                    java.lang.Object[] objArr70 = new java.lang.Object[1];
                                    c("엀ˁᆫำ隉\ufbc3ꚉ\uf38a急ꘚ⾌銨\uef9a䩗\uf624ꡫ웼∕皶힢ѷ⮊벢芧", 23 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr70);
                                    java.lang.Object[] objArr71 = {(java.lang.String) objArr70[0]};
                                    obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj3 == null) {
                                        java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.view.Gravity.getAbsoluteGravity(0, 0), 2807 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))));
                                        byte b25 = $$a[14];
                                        short s13 = (short) (b25 - 1);
                                        byte b26 = b25;
                                        java.lang.Object[] objArr72 = new java.lang.Object[1];
                                        a(s13, b26, (byte) (b26 - 1), objArr72);
                                        obj3 = cls15.getMethod((java.lang.String) objArr72[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj3);
                                    }
                                    long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr71)).longValue();
                                    long j18 = ~((int) java.lang.System.currentTimeMillis());
                                    long j19 = ((-159) * longValue7) + 100347958206L + ((631119233 | longValue7) * 160) + (((~(longValue7 | (-631119234))) | (~((-631119234) | j18))) * (-160)) + (((~((~longValue7) | j18)) | (-631119234)) * 160) + 1921659301;
                                    int currentTimeMillis26 = (int) java.lang.System.currentTimeMillis();
                                    int currentTimeMillis27 = (int) java.lang.System.currentTimeMillis();
                                    int i145 = ~currentTimeMillis27;
                                    j = (((int) (j19 >> 32)) & (((((~((-1750334239) | currentTimeMillis26)) | (-1107406647)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) - 1102859183) + (((~((~currentTimeMillis26) | (-1750334239))) | 676483080) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE))) | (((((~((-914300528) | currentTimeMillis27)) | (~(2013241327 | i145))) * (-406)) + 1638797211 + ((~((-69800970) | i145)) * (-406)) + (((~(currentTimeMillis27 | (-1943440359))) | (~(i145 | 914300527))) * 406)) & ((int) j19));
                                    java.lang.Object[] objArr73 = new java.lang.Object[1];
                                    c("薬偀ꣂ拾냆瞠急ꘚ贲ὗ엀ˁ傰ꘌ碬\udaf7责夢", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 16, objArr73);
                                    java.lang.Object[] objArr74 = {(java.lang.String) objArr73[0]};
                                    obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj4 == null) {
                                        java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.RS, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 2807, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                        byte b27 = $$a[14];
                                        short s14 = (short) (b27 - 1);
                                        byte b28 = b27;
                                        java.lang.Object[] objArr75 = new java.lang.Object[1];
                                        a(s14, b28, (byte) (b28 - 1), objArr75);
                                        obj4 = cls16.getMethod((java.lang.String) objArr75[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj4);
                                    }
                                    long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr74)).longValue();
                                    long j20 = ~((int) java.lang.System.currentTimeMillis());
                                    long j21 = (-654321436) | j20;
                                    long j22 = ~longValue8;
                                    str3 = str;
                                    long j23 = (53 * longValue8) + 33370393236L + ((~(j21 | longValue8)) * 52) + (((~(j22 | j20)) | (~(j22 | (-654321436))) | (~j21)) * (-52)) + (((~(longValue8 | 654321435)) | (~(654321435 | j20))) * 52) + 1944861503;
                                    int currentTimeMillis28 = (int) java.lang.System.currentTimeMillis();
                                    int i146 = ~((-794556781) | currentTimeMillis28);
                                    int i147 = ((int) (j23 >> 32)) & ((((((~(794556780 | currentTimeMillis28)) | (-2147219949)) | (~(2063184104 | currentTimeMillis28))) * (-880)) - 818885110) + (((~((~currentTimeMillis28) | 794556780)) | (-2063184105) | i146) * (-880)) + (i146 * 880));
                                    int currentTimeMillis29 = (int) java.lang.System.currentTimeMillis();
                                    int i148 = ((int) j23) & (((((~((-1163162066) | r7)) | (~(1694578820 | currentTimeMillis29))) * com.visa.cbp.getCertUsage.getODAData) - 569105799) + (((~(currentTimeMillis29 | (-1163162066))) | (~((~currentTimeMillis29) | 1694578820))) * com.visa.cbp.getCertUsage.getODAData));
                                    long j24 = (i148 ^ i147) | (i147 & i148);
                                    if (j <= 0 && j24 > 0 && j24 - 3 < j) {
                                        java.lang.Object[] objArr76 = {new int[]{0}, new int[]{247}, null, new int[1]};
                                        int currentTimeMillis30 = (int) java.lang.System.currentTimeMillis();
                                        int i149 = ~(248407633 | currentTimeMillis30);
                                        java.lang.Object[] objArr77 = {86904972, 16, java.lang.Integer.valueOf((((~((~currentTimeMillis30) | 248407633)) | (-1071644530)) * (-245)) + 1557576128 + (i149 * (-245)) + ((i149 | 957733153) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE))};
                                        java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj21 == null) {
                                            java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf(str3, str3, 0, 0), 2713 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (android.os.Process.getGidForName(str3) + 1));
                                            java.lang.Object[] objArr78 = new java.lang.Object[1];
                                            a(653, r3[14], (byte) (-$$a[16]), objArr78);
                                            obj21 = cls17.getMethod((java.lang.String) objArr78[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj21);
                                        }
                                        ((int[]) objArr76[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj21).invoke(null, objArr77)).intValue();
                                        SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 97) % 128;
                                        return objArr76;
                                    }
                                    int i150 = -android.text.TextUtils.indexOf(str3, str3);
                                    java.lang.Object[] objArr79 = new java.lang.Object[1];
                                    c("엀ˁᆫำ隉\ufbc3ꚉ\uf38a急ꘚ⾌銨\uef9a䩗\uf624ꡫ웼∕皶힢ѷ⮊벢芧", (i150 ^ 23) + ((i150 & 23) << 1), objArr79);
                                    java.lang.Object[] objArr80 = {(java.lang.String) objArr79[0]};
                                    obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj5 == null) {
                                        java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('M' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 2807 - android.view.View.getDefaultSize(0, 0), (char) android.view.KeyEvent.normalizeMetaState(0));
                                        byte b29 = $$a[14];
                                        short s15 = (short) (b29 - 1);
                                        byte b30 = b29;
                                        java.lang.Object[] objArr81 = new java.lang.Object[1];
                                        a(s15, b30, (byte) (b30 - 1), objArr81);
                                        obj5 = cls18.getMethod((java.lang.String) objArr81[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj5);
                                    }
                                    long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr80)).longValue();
                                    int currentTimeMillis31 = (int) java.lang.System.currentTimeMillis();
                                    long j25 = ~longValue9;
                                    long j26 = ~(currentTimeMillis31 | longValue9);
                                    long j27 = ((-195) * longValue9) + 94954134168L + (((~((-242849448) | j25)) | j26) * (-196)) + ((longValue9 | (-242849448)) * 392) + (((~(242849447 | j25)) | j26) * 196) + 1533389515;
                                    int currentTimeMillis32 = (int) java.lang.System.currentTimeMillis();
                                    int i151 = ((int) (j27 >> 32)) & (((((~(1419240638 | r5)) | 16781376) * (-108)) - 545675446) + (((~((~currentTimeMillis32) | 17985772)) | (~((-17985773) | currentTimeMillis32)) | 1418036242) * 54) + ((currentTimeMillis32 | 1418036242) * 54));
                                    int i152 = ((int) j27) & (((((~((-1767379498) | r5)) | (-1090361389)) * (-983)) - 1594552786) + (((~((~((int) java.lang.System.currentTimeMillis())) | (-1090361389))) | 10848260) * 983));
                                    j2 = (i151 ^ i152) | (i151 & i152);
                                    int i153 = -android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                    int i154 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                    java.lang.Object[] objArr82 = new java.lang.Object[1];
                                    b((i153 & 204) + (i153 | 204), (i154 & 4) + (i154 | 4), "\n\tￔ\u001b", true, 2 - (~(-android.text.TextUtils.indexOf(str3, str3, 0))), objArr82);
                                    java.lang.Object[] objArr83 = {(java.lang.String) objArr82[0]};
                                    obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj6 == null) {
                                        java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 29, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2806, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                        byte b31 = $$a[14];
                                        short s16 = (short) (b31 - 1);
                                        byte b32 = b31;
                                        java.lang.Object[] objArr84 = new java.lang.Object[1];
                                        a(s16, b32, (byte) (b32 - 1), objArr84);
                                        obj6 = cls19.getMethod((java.lang.String) objArr84[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj6);
                                    }
                                    long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr83)).longValue();
                                    int currentTimeMillis33 = (int) java.lang.System.currentTimeMillis();
                                    long j28 = ~longValue10;
                                    long j29 = currentTimeMillis33;
                                    long j30 = ~j29;
                                    long j31 = ((-209) * longValue10) + 92871776503L + ((~(j28 | 444362566)) * 210) + (((~(j28 | j30)) | (~(j29 | 444362566))) * 210) + (((~(j30 | 444362566 | longValue10)) | (~(j28 | (-444362567) | j29))) * 210) + 1734902634;
                                    int i155 = ((int) (j31 >> 32)) & (((((~(1343097931 | r5)) | 1514642953) * (-983)) - 537842485) + (((~((~((int) java.lang.System.currentTimeMillis())) | 1514642953)) | 524354) * 983));
                                    int currentTimeMillis34 = (int) java.lang.System.currentTimeMillis();
                                    int i156 = ((int) j31) & (((((~(1883512581 | r5)) | (~((-446286172) | currentTimeMillis34))) * (-370)) - 635053777) + (((~(currentTimeMillis34 | 1883512581)) | (~((~currentTimeMillis34) | (-446286172))) | 1615074820) * (-370)) + 577229256);
                                    long j32 = (i156 ^ i155) | (i155 & i156);
                                    if (j2 > 0) {
                                        int i157 = getAid;
                                        int i158 = ((i157 ^ 57) + ((i157 & 57) << 1)) % 128;
                                        SdkCoreAlternateContactlessPaymentDataImpl = i158;
                                        if (j32 > 0) {
                                            int i159 = (i158 + 73) % 128;
                                            getAid = i159;
                                            if (j32 + 100 < j2) {
                                                int i160 = ((i159 & 49) + (i159 | 49)) % 128;
                                                SdkCoreAlternateContactlessPaymentDataImpl = i160;
                                                getAid = (((i160 | 105) << 1) - (i160 ^ 105)) % 128;
                                                java.lang.Object[] objArr85 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, null, new int[1]};
                                                java.lang.Object[] objArr86 = {86904972, 16, java.lang.Integer.valueOf(((((~((~r2) | 320234502)) | 743019216) * 446) - 2117243347) + (((~(((int) java.lang.System.currentTimeMillis()) | 1063253718)) | 286540806) * 446) + 674088544)};
                                                java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj22 == null) {
                                                    java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), android.text.TextUtils.indexOf(str3, str3, 0) + 2713, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1));
                                                    java.lang.Object[] objArr87 = new java.lang.Object[1];
                                                    a(653, r3[14], (byte) (-$$a[16]), objArr87);
                                                    obj22 = cls20.getMethod((java.lang.String) objArr87[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj22);
                                                }
                                                ((int[]) objArr85[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj22).invoke(null, objArr86)).intValue();
                                                return objArr85;
                                            }
                                        }
                                    }
                                    int i161 = (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                    int alpha = android.graphics.Color.alpha(0);
                                    int i162 = -android.text.TextUtils.indexOf(str3, str3, 0, 0);
                                    java.lang.Object[] objArr88 = new java.lang.Object[1];
                                    b((i161 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) + ((i161 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) << 1), alpha + 7, "\r\f\u0012\f\uffc8\u0006\ufffe", true, (i162 ^ 5) + ((i162 & 5) << 1), objArr88);
                                    java.lang.String str34 = (java.lang.String) objArr88[0];
                                    int i163 = -(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                                    int normalizeMetaState = android.view.KeyEvent.normalizeMetaState(0);
                                    java.lang.Object[] objArr89 = new java.lang.Object[1];
                                    b((i163 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE) + ((i163 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE) << 1), ((normalizeMetaState | 11) << 1) - (normalizeMetaState ^ 11), "\u0011\u0017\u0011ￍ\f\u0007\u0000ￍ\u000b\u0003\u0012", true, 16777219 - (~android.graphics.Color.rgb(0, 0, 0)), objArr89);
                                    java.lang.String str35 = (java.lang.String) objArr89[0];
                                    int i164 = -(-android.view.Gravity.getAbsoluteGravity(0, 0));
                                    java.lang.Object[] objArr90 = new java.lang.Object[1];
                                    b(((i164 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE) << 1) - (i164 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE), android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 13, "\u0010\u0016\u0010ￌ\u000b\u0006\uffff\u0010ￌ\n\u0002\u0011", true, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 4, objArr90);
                                    java.lang.String str36 = (java.lang.String) objArr90[0];
                                    int maxKeyCode = android.view.KeyEvent.getMaxKeyCode() >> 16;
                                    int currentTimeMillis35 = (int) java.lang.System.currentTimeMillis();
                                    int i165 = maxKeyCode * (-167);
                                    int i166 = ~((~maxKeyCode) | (-215));
                                    int i167 = ~((currentTimeMillis35 & (-215)) | (currentTimeMillis35 ^ (-215)));
                                    int i168 = ((((-35738) | i165) << 1) - (i165 ^ (-35738))) + (((i166 & i167) | (i166 ^ i167)) * 336);
                                    int i169 = ~(maxKeyCode | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PIN_VALUE);
                                    int i170 = ~(maxKeyCode | currentTimeMillis35);
                                    int i171 = ((i169 ^ i170) | (i169 & i170)) * (-168);
                                    int i172 = ~currentTimeMillis35;
                                    int i173 = ~((maxKeyCode ^ i172) | (maxKeyCode & i172));
                                    int i174 = -android.graphics.Color.rgb(0, 0, 0);
                                    int i175 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                    java.lang.Object[] objArr91 = new java.lang.Object[1];
                                    b((((i168 | i171) << 1) - (i171 ^ i168)) + (((i173 ^ (-215)) | (i173 & (-215))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE), ((-16777204) & i174) + (i174 | (-16777204)), "\u0001\u0010\u000f\u0015\u000fￋ\n\u0005\ufffe\u0014ￋ\t", true, (i175 & 6) + (i175 | 6), objArr91);
                                    java.lang.String str37 = (java.lang.String) objArr91[0];
                                    int i176 = (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                    int currentTimeMillis36 = (int) java.lang.System.currentTimeMillis();
                                    int i177 = (i176 * 829) + 8290;
                                    int i178 = ~i176;
                                    int i179 = ~currentTimeMillis36;
                                    int i180 = i179 | i176;
                                    int i181 = ((~((i178 ^ (-11)) | (i178 & (-11)))) | (~((i180 ^ 10) | (i180 & 10)))) * (-828);
                                    int i182 = i176 | 10;
                                    int i183 = (i177 ^ i181) + ((i177 & i181) << 1) + (((i179 ^ i182) | (i179 & i182)) * (-828));
                                    int i184 = -(-((~i182) * 828));
                                    java.lang.Object[] objArr92 = new java.lang.Object[1];
                                    c("嶌\uf246웼∕Ẋ糥⢩蹶િ潳缡좧", (i183 ^ i184) + ((i184 & i183) << 1), objArr92);
                                    java.lang.String str38 = (java.lang.String) objArr92[0];
                                    int alpha2 = android.graphics.Color.alpha(0);
                                    int i185 = -android.graphics.ImageFormat.getBitsPerPixel(0);
                                    java.lang.Object[] objArr93 = new java.lang.Object[1];
                                    b(alpha2 + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE, (i185 ^ 4) + ((i185 & 4) << 1), "\u0014\u0003\n\u000f\uffd0", false, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4, objArr93);
                                    java.lang.String str39 = (java.lang.String) objArr93[0];
                                    java.lang.Object[] objArr94 = new java.lang.Object[1];
                                    c("\ue204阽\u0b79䘟", 3 - (~(-(-android.view.View.resolveSize(0, 0)))), objArr94);
                                    strArr = new java.lang.String[]{str34, str35, str36, str37, str38, str39, (java.lang.String) objArr94[0]};
                                    i = 0;
                                    while (true) {
                                        if (i < 7) {
                                            i2 = 0;
                                            break;
                                        }
                                        java.lang.Object[] objArr95 = {strArr[i]};
                                        java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2046560211);
                                        if (obj23 == null) {
                                            java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 26, android.view.View.resolveSize(0, 0) + 1672, (char) (47941 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                                            byte b33 = $$a[14];
                                            short s17 = (short) (b33 - 1);
                                            byte b34 = b33;
                                            java.lang.Object[] objArr96 = new java.lang.Object[1];
                                            a(s17, b34, (byte) (b34 - 1), objArr96);
                                            obj23 = cls21.getMethod((java.lang.String) objArr96[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2046560211, obj23);
                                        }
                                        long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj23).invoke(null, objArr95)).longValue();
                                        int currentTimeMillis37 = (int) java.lang.System.currentTimeMillis();
                                        long j33 = ~longValue11;
                                        long j34 = currentTimeMillis37;
                                        strArr2 = strArr;
                                        long j35 = ~(j34 | (-221389464));
                                        long j36 = (((((881 * longValue11) - 195044117784L) + ((((~(j33 | 221389463)) | (~(j34 | 221389463))) | (~(j33 | j34))) * (-880))) + (((longValue11 | (~(221389463 | (~j34)))) | j35) * (-880))) + (j35 * 880)) - 1404140718;
                                        int currentTimeMillis38 = (int) java.lang.System.currentTimeMillis();
                                        int i186 = ~currentTimeMillis38;
                                        int i187 = ((int) (j36 >> 32)) & (((((~(1390208037 | i186)) | 1467532847) * (-865)) - 396289676) + ((~(currentTimeMillis38 | (-1390208038))) * 865) + (((~(1467532847 | i186)) | (~(i186 | (-1390208038)))) * 865));
                                        int currentTimeMillis39 = (int) java.lang.System.currentTimeMillis();
                                        int i188 = ~currentTimeMillis39;
                                        int i189 = ~((-1115140400) | currentTimeMillis39);
                                        int i190 = ((int) j36) & (((((~(currentTimeMillis39 | (-322086011))) | (~(1400354175 | i188))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) - 1365804547) + (((~(322086010 | i188)) | i189) * (-1040)) + (((~(i188 | 1115140399)) | 1078268165 | i189) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL));
                                        if (((i190 ^ i187) | (i190 & i187)) != 0) {
                                            i2 = i + 90;
                                            break;
                                        }
                                        i = ((i & 2) + (i | 2)) - 1;
                                        strArr = strArr2;
                                    }
                                    if (i2 == 0) {
                                        java.lang.Object[] objArr97 = {new int[]{0}, new int[]{i2}, null, new int[1]};
                                        int currentTimeMillis40 = (int) java.lang.System.currentTimeMillis();
                                        int i191 = ~currentTimeMillis40;
                                        java.lang.Object[] objArr98 = {86904972, 16, java.lang.Integer.valueOf((((~((-482435991) | i191)) | (~((-226889530) | currentTimeMillis40)) | (~(226889529 | i191))) * 959) + 1455160734 + (((~(currentTimeMillis40 | (-482435991))) | (~(i191 | (-226889530))) | (~(226889529 | currentTimeMillis40))) * 959))};
                                        java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj24 == null) {
                                            java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 50, android.view.View.resolveSizeAndState(0, 0, 0) + 2713, (char) android.graphics.Color.argb(0, 0, 0, 0));
                                            java.lang.Object[] objArr99 = new java.lang.Object[1];
                                            a(653, r3[14], (byte) (-$$a[16]), objArr99);
                                            obj24 = cls22.getMethod((java.lang.String) objArr99[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj24);
                                        }
                                        ((int[]) objArr97[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj24).invoke(null, objArr98)).intValue();
                                        int i192 = ~((int) java.lang.System.currentTimeMillis());
                                        int i193 = -(-((((-1985052802) & i192) | ((-1985052802) ^ i192)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE));
                                        int i194 = ~((i192 ^ (-2119934418)) | ((-2119934418) & i192));
                                        int i195 = (i194 ^ (-2139087828)) | ((-2139087828) & i194);
                                        int currentTimeMillis41 = (int) java.lang.System.currentTimeMillis();
                                        int i196 = ~currentTimeMillis41;
                                        int i197 = ((~((i196 ^ 1858076552) | (1858076552 & i196))) | 9044360) * (-591);
                                        if ((((1427753587 | i193) << 1) - (i193 ^ 1427753587)) + (((i195 ^ 134881616) | (134881616 & i195)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) > (((571514094 | i197) << 1) - (571514094 ^ i197)) + (((545965448 & currentTimeMillis41) | (currentTimeMillis41 ^ 545965448) | 1321155464) * 591)) {
                                            return objArr97;
                                        }
                                        throw null;
                                    }
                                    try {
                                        int i198 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                        float minVolume = android.media.AudioTrack.getMinVolume();
                                        int i199 = -(-(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                        java.lang.Object[] objArr100 = new java.lang.Object[1];
                                        b(212 - (~i198), 12 - (~(minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1))), "\u0010\f\u0005ￋ\u0001\t\u0006\u0012\uffffￋ\f\u000f\u0011", true, ((i199 | 12) << 1) - (i199 ^ 12), objArr100);
                                        try {
                                            java.lang.Object[] objArr101 = {(java.lang.String) objArr100[0]};
                                            java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                            if (obj25 == null) {
                                                java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 40, android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1922, (char) ((-1) - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                                                byte b35 = $$a[14];
                                                short s18 = (short) (b35 - 1);
                                                byte b36 = b35;
                                                java.lang.Object[] objArr102 = new java.lang.Object[1];
                                                a(s18, b36, (byte) (b36 - 1), objArr102);
                                                obj25 = cls23.getMethod((java.lang.String) objArr102[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj25);
                                            }
                                            invoke = ((java.lang.reflect.Method) obj25).invoke(null, objArr101);
                                        } catch (java.lang.Throwable th) {
                                            java.lang.Throwable cause = th.getCause();
                                            if (cause != null) {
                                                throw cause;
                                            }
                                            throw th;
                                        }
                                    } catch (java.lang.Exception unused) {
                                    }
                                    try {
                                        if (invoke != null) {
                                            int i200 = -android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                            java.lang.Object[] objArr103 = new java.lang.Object[1];
                                            c("\ue621␤媗ᾖ䃠쮊웼∕\ue43c窶老붼", (i200 ^ 10) + ((i200 & 10) << 1), objArr103);
                                            try {
                                                java.lang.Object[] objArr104 = {invoke, new java.lang.String[]{(java.lang.String) objArr103[0]}};
                                                java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                                                if (obj26 == null) {
                                                    java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2879, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1));
                                                    byte b37 = $$a[14];
                                                    short s19 = (short) (b37 - 1);
                                                    byte b38 = b37;
                                                    java.lang.Object[] objArr105 = new java.lang.Object[1];
                                                    a(s19, b38, (byte) (b38 - 1), objArr105);
                                                    obj26 = cls24.getMethod((java.lang.String) objArr105[0], java.lang.String.class, java.lang.String[].class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj26);
                                                }
                                                long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj26).invoke(null, objArr104)).longValue();
                                                int currentTimeMillis42 = (int) java.lang.System.currentTimeMillis();
                                                long j37 = ~longValue12;
                                                long j38 = currentTimeMillis42;
                                                long j39 = (~j38) | j37;
                                                long j40 = ((((((-112) * longValue12) + 113073304960L) + (((~j39) | (-1009583080)) * 226)) + ((((~(longValue12 | 1009583079)) | (~(j38 | 1009583079))) | (~((-1009583080) | j39))) * (-113))) + ((~(j37 | j38)) * 113)) - 1019128699;
                                                int currentTimeMillis43 = (int) java.lang.System.currentTimeMillis();
                                                int i201 = ((int) (j40 >> 32)) & (((((~(722274839 | r5)) | (-2135466046)) * 226) - 2055567968) + (((~((~currentTimeMillis43) | (-1413521449))) | (~(2135466045 | currentTimeMillis43)) | 330242) * (-113)) + ((~(currentTimeMillis43 | 722274839)) * 113));
                                                int i202 = (int) j40;
                                                int currentTimeMillis44 = (int) java.lang.System.currentTimeMillis();
                                                int i203 = ~currentTimeMillis44;
                                                int i204 = i202 & ((((~((-1290550386) | i203)) | (-146676025)) * (-328)) + 1474575065 + (((-146676025) | currentTimeMillis44) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((~(currentTimeMillis44 | 1290550385)) | (-1291730298) | (~(i203 | (-145496113)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE));
                                                if (((i201 ^ i204) | (i201 & i204)) == 0) {
                                                    getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 87) % 128;
                                                    i3 = 0;
                                                    if (i3 != 0) {
                                                        java.lang.Object[] objArr106 = {new int[]{0}, new int[]{i3}, null, new int[1]};
                                                        int currentTimeMillis45 = (int) java.lang.System.currentTimeMillis();
                                                        java.lang.Object[] objArr107 = {86904972, 16, java.lang.Integer.valueOf(((((~(32556201 | r3)) | 741881721) * 226) - 2135046800) + (((~((~currentTimeMillis45) | 771291129)) | (~((-741881722) | currentTimeMillis45)) | 3146793) * (-113)) + ((~(currentTimeMillis45 | 32556201)) * 113))};
                                                        java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj27 == null) {
                                                            java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 2713 - android.view.KeyEvent.normalizeMetaState(0), (char) android.graphics.Color.green(0));
                                                            java.lang.Object[] objArr108 = new java.lang.Object[1];
                                                            a(653, r3[14], (byte) (-$$a[16]), objArr108);
                                                            obj27 = cls25.getMethod((java.lang.String) objArr108[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj27);
                                                        }
                                                        ((int[]) objArr106[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj27).invoke(null, objArr107)).intValue();
                                                        return objArr106;
                                                    }
                                                    int i205 = -android.graphics.ImageFormat.getBitsPerPixel(0);
                                                    int currentTimeMillis46 = (int) java.lang.System.currentTimeMillis();
                                                    int i206 = i205 * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION;
                                                    int i207 = ((-191436) & i206) + (i206 | (-191436));
                                                    int i208 = ~i205;
                                                    int i209 = ~(i208 | currentTimeMillis46);
                                                    int i210 = ~currentTimeMillis46;
                                                    int i211 = ~((i210 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE) | (i210 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE));
                                                    int i212 = ((i209 ^ i211) | (i209 & i211)) * (-1808);
                                                    int i213 = i208 | (-213);
                                                    int i214 = ~((i213 ^ currentTimeMillis46) | (i213 & currentTimeMillis46));
                                                    int i215 = ~(i210 | i205 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE);
                                                    int i216 = (((i207 | i212) << 1) - (i207 ^ i212)) + (((i214 & i215) | (i214 ^ i215)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN);
                                                    int i217 = ~(i208 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE);
                                                    int i218 = ~((currentTimeMillis46 ^ (-213)) | (currentTimeMillis46 & (-213)));
                                                    int i219 = -(-(((~((i205 ^ i210) | (i205 & i210))) | (i218 ^ i217) | (i218 & i217)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN));
                                                    int red2 = android.graphics.Color.red(0);
                                                    int i220 = -android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                    java.lang.Object[] objArr109 = new java.lang.Object[1];
                                                    b(((i216 | i219) << 1) - (i219 ^ i216), (red2 ^ 13) + ((red2 & 13) << 1), "\u0010\f\u0005ￋ\u0001\t\u0006\u0012\uffffￋ\f\u000f\u0011", true, (i220 & 11) + (i220 | 11), objArr109);
                                                    java.lang.Object[] objArr110 = {(java.lang.String) objArr109[0]};
                                                    java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                    if (obj28 == null) {
                                                        java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 40, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 1921, (char) android.graphics.Color.green(0));
                                                        byte b39 = $$a[14];
                                                        short s20 = (short) (b39 - 1);
                                                        byte b40 = b39;
                                                        java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                        a(s20, b40, (byte) (b40 - 1), objArr111);
                                                        obj28 = cls26.getMethod((java.lang.String) objArr111[0], java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj28);
                                                    }
                                                    java.lang.Object invoke7 = ((java.lang.reflect.Method) obj28).invoke(null, objArr110);
                                                    if (invoke7 != null) {
                                                        java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                        c("\ue621␤媗ᾖ䃠쮊웼∕\ue43c窶老붼", 10 - (~(-(-android.graphics.Color.alpha(0)))), objArr112);
                                                        java.lang.Object[] objArr113 = {invoke7, new java.lang.String[]{(java.lang.String) objArr112[0]}};
                                                        java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                                                        if (obj29 == null) {
                                                            java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 2880 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) android.text.TextUtils.getOffsetAfter(str3, 0));
                                                            byte b41 = $$a[14];
                                                            short s21 = (short) (b41 - 1);
                                                            byte b42 = b41;
                                                            java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                            a(s21, b42, (byte) (b42 - 1), objArr114);
                                                            obj29 = cls27.getMethod((java.lang.String) objArr114[0], java.lang.String.class, java.lang.String[].class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj29);
                                                        }
                                                        long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj29).invoke(null, objArr113)).longValue();
                                                        int currentTimeMillis47 = (int) java.lang.System.currentTimeMillis();
                                                        long j41 = ~longValue13;
                                                        long j42 = currentTimeMillis47;
                                                        long j43 = ((((((-590) * longValue13) - 361842382080L) + ((~(611220239 | longValue13)) * (-1182))) + (((~((~j42) | (611220239 | j41))) | (~(longValue13 | (-611220240)))) * (-591))) + (((611220239 | j42) | j41) * 591)) - 1417491539;
                                                        int currentTimeMillis48 = (int) java.lang.System.currentTimeMillis();
                                                        int i221 = ~currentTimeMillis48;
                                                        int i222 = ((int) (j43 >> 32)) & (((currentTimeMillis48 | (-1522383446)) * 614) + 845675470 + (((~((-1547046185) | i221)) | 67241256 | (~((-109819774) | i221))) * (-1228)) + (((~(i221 | (-1479804929))) | (~((-42578518) | i221))) * 614));
                                                        int i223 = ~((int) java.lang.System.currentTimeMillis());
                                                        int i224 = ((int) j43) & ((((~(1062634265 | i223)) | (-1062720410)) * (-241)) + 1810005218 + (((~(i223 | (-86145))) | 688128265) * 241));
                                                        if (((i222 ^ i224) | (i222 & i224)) != 1) {
                                                            int i225 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                            getAid = (((i225 | 31) << 1) - (i225 ^ 31)) % 128;
                                                            int i226 = -android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                                            java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                            b((i226 ^ 203) + ((i226 & 203) << 1), 11 - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "ￖￖ\u000b\b\u001b\bￖ\u0013\u0016\n\b\u0013", false, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '/', objArr115);
                                                            java.lang.String str40 = (java.lang.String) objArr115[0];
                                                            int i227 = -(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                            java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                            c("耧羶㤋\ueec4믡誒趌먼ꡠ댭懏䁤િ潳ᚙ됱", (i227 ^ 17) + ((i227 & 17) << 1), objArr116);
                                                            java.lang.String str41 = (java.lang.String) objArr116[0];
                                                            int i228 = -android.view.View.getDefaultSize(0, 0);
                                                            int currentTimeMillis49 = (int) java.lang.System.currentTimeMillis();
                                                            int i229 = i228 * 165;
                                                            int i230 = ((-33415) ^ i229) + ((i229 & (-33415)) << 1);
                                                            int i231 = ~currentTimeMillis49;
                                                            int i232 = ~((i231 ^ 205) | (i231 & 205));
                                                            int i233 = -(-(((i232 ^ i228) | (i232 & i228)) * (-328)));
                                                            int i234 = ((i230 | i233) << 1) - (i230 ^ i233);
                                                            int i235 = ((i228 ^ currentTimeMillis49) | (i228 & currentTimeMillis49)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
                                                            int i236 = (i234 ^ i235) + ((i235 & i234) << 1);
                                                            int i237 = ~i228;
                                                            int i238 = ~((i237 ^ (-206)) | (i237 & (-206)));
                                                            int i239 = ~((currentTimeMillis49 ^ (-206)) | (currentTimeMillis49 & (-206)));
                                                            int i240 = (i239 ^ i238) | (i239 & i238);
                                                            int i241 = ~((i228 ^ i231) | (i228 & i231) | 205);
                                                            int i242 = -(-(((i241 ^ i240) | (i241 & i240)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE));
                                                            int i243 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                            int i244 = -android.view.View.resolveSizeAndState(0, 0, 0);
                                                            java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                            b(((i236 | i242) << 1) - (i242 ^ i236), ((i243 | 17) << 1) - (i243 ^ 17), "ￔ\u001d\u0007\u000e\u0013ￔￔ\t\u0006\u0019\u0006ￔ\u0011\u0014\b\u0006\u0011", false, (i244 & 6) + (i244 | 6), objArr117);
                                                            java.lang.String str42 = (java.lang.String) objArr117[0];
                                                            int i245 = -android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                            int i246 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                            int i247 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                            java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                            b((i245 & 200) + (i245 | 200), ((i246 | 7) << 1) - (i246 ^ 7), "\u001c\uffd8\uffd8\u0017\u0012\u000b", true, ((i247 | 2) << 1) - (i247 ^ 2), objArr118);
                                                            java.lang.String str43 = (java.lang.String) objArr118[0];
                                                            java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                            c("엀ˁᆫำ侷亶綇쏵િ潳ᚙ됱", 11 - (~(android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), objArr119);
                                                            java.lang.String str44 = (java.lang.String) objArr119[0];
                                                            int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
                                                            java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                            c("엀ˁᆫำ侷亶綇쏵િ潳ᚙ됱䏽ᅮ柣윕\uf4a1㑔", (combineMeasuredStates & 17) + (combineMeasuredStates | 17), objArr120);
                                                            java.lang.String str45 = (java.lang.String) objArr120[0];
                                                            int i248 = -android.graphics.ImageFormat.getBitsPerPixel(0);
                                                            float scrollFriction = android.view.ViewConfiguration.getScrollFriction();
                                                            int i249 = -(-(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                                            java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                            b((i248 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE) + ((i248 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE) << 1), (scrollFriction > 0.0f ? 1 : (scrollFriction == 0.0f ? 0 : -1)) + 20, "\u0006\uffd0\uffd0\u0014\u001a\u0014\u0015\u0006\u000e\uffd0\u0003\n\u000f\uffd0\u0007\u0002\n\r\u0014\u0002\u0007", false, ((i249 | 2) << 1) - (i249 ^ 2), objArr121);
                                                            java.lang.String str46 = (java.lang.String) objArr121[0];
                                                            java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                            b(208 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 15, "\uffd1\u000f\u0007\u0016\u0015\u001b\u0015\uffd1\uffd1\u0010\u000b\u0004\u001a\uffd1\u0006\u0015", true, 16777223 - (~android.graphics.Color.rgb(0, 0, 0)), objArr122);
                                                            java.lang.String str47 = (java.lang.String) objArr122[0];
                                                            int i250 = (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                            int i251 = -android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                            int i252 = (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                            java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                            b(((i250 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE) << 1) - (i250 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE), (i251 & 24) + (i251 | 24), "ￎ\u000f\u0006\u0006\u0005ￎ\u0013\u0010\u0010\u0015\uffd0\uffd0\u0014\u001a\u0014\u0015\u0006\u000e\uffd0\u0016\u0014\u0013\uffd0\u0018\u0006", false, (i252 & 11) + (i252 | 11), objArr123);
                                                            java.lang.String str48 = (java.lang.String) objArr123[0];
                                                            int keyCodeFromString2 = android.view.KeyEvent.keyCodeFromString(str3);
                                                            float minVolume2 = android.media.AudioTrack.getMinVolume();
                                                            int i253 = -android.text.TextUtils.getOffsetAfter(str3, 0);
                                                            java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                            b(209 - (~keyCodeFromString2), 12 - (~(minVolume2 > 0.0f ? 1 : (minVolume2 == 0.0f ? 0 : -1))), "\u0005\rￏ\u0018\u0002\t\u000eￏￏ\u0013\u0019\u0013\u0014", false, (i253 ^ 8) + ((i253 & 8) << 1), objArr124);
                                                            java.lang.String str49 = (java.lang.String) objArr124[0];
                                                            int i254 = -(android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
                                                            int i255 = -android.text.TextUtils.getCapsMode(str3, 0, 0);
                                                            java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                            b((i254 ^ 202) + ((i254 & 202) << 1), (i255 & 9) + (i255 | 9), "\u001dￗￗ\u0016\u0011\nￗ\u001a\u001b", true, 2 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr125);
                                                            java.lang.String str50 = (java.lang.String) objArr125[0];
                                                            int i256 = -(-android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                                            int maximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity();
                                                            int i257 = -android.graphics.Color.green(0);
                                                            java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                            b((i256 & 200) + (i256 | 200), 8 - (maximumFlingVelocity >> 16), "\rￚ \u001eￚￚ\u0019\u0014", true, (i257 & 5) + (i257 | 5), objArr126);
                                                            java.lang.String[] strArr6 = {str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, (java.lang.String) objArr126[0]};
                                                            int i258 = 0;
                                                            while (i258 < 12) {
                                                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                sb.append(strArr6[i258]);
                                                                int i259 = -(android.view.ViewConfiguration.getScrollBarSize() >> 8);
                                                                int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength();
                                                                int i260 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                                                                java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                                b((i259 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE) + ((i259 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE) << 1), (fadingEdgeLength >> 16) + 2, "\uffff\u0001", false, ((i260 | 2) << 1) - (i260 ^ 2), objArr127);
                                                                sb.append((java.lang.String) objArr127[0]);
                                                                java.lang.Object[] objArr128 = {sb.toString()};
                                                                java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                                                if (obj30 == null) {
                                                                    java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 36, 3160 - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (33100 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                                                                    byte b43 = $$a[14];
                                                                    short s22 = (short) (b43 - 1);
                                                                    byte b44 = b43;
                                                                    java.lang.Object[] objArr129 = new java.lang.Object[1];
                                                                    a(s22, b44, (byte) (b44 - 1), objArr129);
                                                                    obj30 = cls28.getMethod((java.lang.String) objArr129[0], java.lang.String.class);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj30);
                                                                }
                                                                long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) obj30).invoke(null, objArr128)).longValue();
                                                                int currentTimeMillis50 = (int) java.lang.System.currentTimeMillis();
                                                                long j44 = ~longValue14;
                                                                long j45 = currentTimeMillis50;
                                                                long j46 = ~j45;
                                                                long j47 = ~(j44 | (-1002814198));
                                                                java.lang.String[] strArr7 = strArr6;
                                                                long j48 = (((((longValue14 * (-463)) - 466308602070L) + (((~(j46 | (-1002814198))) | ((~(j44 | j46)) | j47)) * 464)) + (((1002814197 | j45) | j44) * (-464))) + (((~((-1002814198) | j45)) | j47) * 464)) - 334853910;
                                                                int i261 = (int) (j48 >> 32);
                                                                int i262 = ~((int) java.lang.System.currentTimeMillis());
                                                                int i263 = (int) j48;
                                                                int i264 = ~((int) java.lang.System.currentTimeMillis());
                                                                if (((i261 & ((((~((-1292227718) | i262)) * 52) - 1981638686) + (((~((-1561187790) | i262)) | (~(1296553095 | i262)) | 268960072) * (-52)) + (((~(i262 | 1561187789)) | 4325378) * 52))) | ((((~(1498742763 | i264)) * 52) + 1425329185 + (((~(1360048107 | i264)) | (~((-1497692779) | i264)) | 138694656) * (-52)) + (((~(i264 | (-1360048108))) | 1049985) * 52)) & i263)) != 0) {
                                                                    int i265 = getAid;
                                                                    int i266 = (i265 ^ 63) + ((i265 & 63) << 1);
                                                                    SdkCoreAlternateContactlessPaymentDataImpl = i266 % 128;
                                                                    if (i266 % 2 != 0) {
                                                                        i6 = i258 ^ (-52);
                                                                        i7 = i258 & (-52);
                                                                    } else {
                                                                        i6 = i258 ^ 110;
                                                                        i7 = i258 & 110;
                                                                    }
                                                                    i4 = i6 + (i7 << 1);
                                                                    if (i4 == 0) {
                                                                        java.lang.Object[] objArr130 = {new int[]{0}, new int[]{i4}, null, new int[1]};
                                                                        int currentTimeMillis51 = (int) java.lang.System.currentTimeMillis();
                                                                        int i267 = ~currentTimeMillis51;
                                                                        int i268 = ~(886302019 | currentTimeMillis51);
                                                                        java.lang.Object[] objArr131 = {86904972, 16, java.lang.Integer.valueOf((((~(currentTimeMillis51 | (-176976500))) | (~((-877888769) | i267))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) + 1855276823 + (((~(176976499 | i267)) | i268) * (-1040)) + (((~(i267 | (-886302020))) | (-1054865268) | i268) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL))};
                                                                        java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj31 == null) {
                                                                            java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf(str3, str3, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 2713, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                                            java.lang.Object[] objArr132 = new java.lang.Object[1];
                                                                            a(653, r3[14], (byte) (-$$a[16]), objArr132);
                                                                            obj31 = cls29.getMethod((java.lang.String) objArr132[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj31);
                                                                        }
                                                                        ((int[]) objArr130[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj31).invoke(null, objArr131)).intValue();
                                                                        return objArr130;
                                                                    }
                                                                    long[] jArr = {472001035};
                                                                    int offsetBefore = android.text.TextUtils.getOffsetBefore(str3, 0);
                                                                    int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout() >> 16;
                                                                    int i269 = -android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                                    java.lang.Object[] objArr133 = new java.lang.Object[1];
                                                                    b(offsetBefore + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (doubleTapTimeout ^ 17) + ((doubleTapTimeout & 17) << 1), "\u0004ￍ\u000b\r\u0013\f\u0012\u0011ￍ\u000e\u0010\r\u0001ￍ\u0011\u0003\n", false, ((i269 | 7) << 1) - (i269 ^ 7), objArr133);
                                                                    java.lang.Object[] objArr134 = {(java.lang.String) objArr133[0], 5, java.lang.Long.valueOf(kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK), jArr};
                                                                    java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                                                    if (obj32 == null) {
                                                                        java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 37, 3096 - android.text.TextUtils.getOffsetAfter(str3, 0), (char) android.text.TextUtils.indexOf(str3, str3, 0));
                                                                        byte b45 = $$a[14];
                                                                        short s23 = (short) (b45 - 1);
                                                                        byte b46 = b45;
                                                                        java.lang.Object[] objArr135 = new java.lang.Object[1];
                                                                        a(s23, b46, (byte) (b46 - 1), objArr135);
                                                                        obj32 = cls30.getMethod((java.lang.String) objArr135[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj32);
                                                                    }
                                                                    long longValue15 = ((java.lang.Long) ((java.lang.reflect.Method) obj32).invoke(null, objArr134)).longValue();
                                                                    int currentTimeMillis52 = (int) java.lang.System.currentTimeMillis();
                                                                    long j49 = ~longValue15;
                                                                    long j50 = currentTimeMillis52;
                                                                    long j51 = (((((503 * longValue15) + 608992893678L) + (((~(longValue15 | (-1215554678))) | (~(j49 | j50))) * (-502))) + ((~(((~j50) | j49) | (-1215554678))) * (-502))) + (((~(1215554677 | j50)) | j49) * 502)) - 695093232;
                                                                    int currentTimeMillis53 = (int) java.lang.System.currentTimeMillis();
                                                                    int i270 = ((int) (j51 >> 32)) & (((((~((-86614059) | currentTimeMillis53)) | 1350566272) * 449) - 425514752) + (((~((~currentTimeMillis53) | (-86614059))) | 1350566272) * 449));
                                                                    int currentTimeMillis54 = (int) java.lang.System.currentTimeMillis();
                                                                    int i271 = ~currentTimeMillis54;
                                                                    int i272 = ((int) j51) & ((((~((-1155254170) | i271)) | 1702486716) * (-602)) + 1096714066 + (((~(currentTimeMillis54 | (-1155254170))) | 1146733208 | (~(1711007677 | i271))) * (-301)) + ((~(1702486716 | i271)) * 301));
                                                                    if (((i270 ^ i272) | (i270 & i272)) != 0) {
                                                                        int i273 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                                        getAid = (((i273 | 35) << 1) - (i273 ^ 35)) % 128;
                                                                        i5 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
                                                                    } else {
                                                                        int i274 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                                        int i275 = (i274 & 41) + (i274 | 41);
                                                                        getAid = i275 % 128;
                                                                        i5 = i275 % 2 == 0 ? 1 : 0;
                                                                    }
                                                                    if (i5 != 0) {
                                                                        java.lang.Object[] objArr136 = {new int[]{0}, new int[]{i5}, null, new int[1]};
                                                                        int currentTimeMillis55 = (int) java.lang.System.currentTimeMillis();
                                                                        java.lang.Object[] objArr137 = {86904972, 16, java.lang.Integer.valueOf((((~(752152238 | currentTimeMillis55)) | (-42826719)) * 56) + 2024442887 + (((~((~currentTimeMillis55) | (-42826719))) | 752152238) * 56))};
                                                                        java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj33 == null) {
                                                                            java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 50, 2713 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1));
                                                                            java.lang.Object[] objArr138 = new java.lang.Object[1];
                                                                            a(653, r4[14], (byte) (-$$a[16]), objArr138);
                                                                            obj33 = cls31.getMethod((java.lang.String) objArr138[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj33);
                                                                        }
                                                                        ((int[]) objArr136[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj33).invoke(null, objArr137)).intValue();
                                                                        return objArr136;
                                                                    }
                                                                    long[] jArr2 = {472001035};
                                                                    int i276 = -android.view.View.MeasureSpec.getSize(0);
                                                                    java.lang.Object[] objArr139 = new java.lang.Object[1];
                                                                    c("엀ˁᆫำ隉\ufbc3ꚉ\uf38a急ꘚ⾌銨\uef9a䩗\uf624ꡫኃ\uf16e⾌銨\ue621␤", (i276 ^ 22) + ((i276 & 22) << 1), objArr139);
                                                                    java.lang.Object[] objArr140 = {(java.lang.String) objArr139[0], 5, java.lang.Long.valueOf(kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK), jArr2};
                                                                    java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                                                    if (obj34 == null) {
                                                                        java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 37, android.graphics.Color.alpha(0) + 3096, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1));
                                                                        byte b47 = $$a[14];
                                                                        short s24 = (short) (b47 - 1);
                                                                        byte b48 = b47;
                                                                        java.lang.Object[] objArr141 = new java.lang.Object[1];
                                                                        a(s24, b48, (byte) (b48 - 1), objArr141);
                                                                        obj34 = cls32.getMethod((java.lang.String) objArr141[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj34);
                                                                    }
                                                                    long longValue16 = ((java.lang.Long) ((java.lang.reflect.Method) obj34).invoke(null, objArr140)).longValue();
                                                                    long currentTimeMillis56 = (int) java.lang.System.currentTimeMillis();
                                                                    long j52 = ~(1333243865 | (~currentTimeMillis56));
                                                                    int i277 = i5;
                                                                    long j53 = (((((339 * longValue16) + 449303182842L) + (((~(currentTimeMillis56 | (-1333243866))) | ((~((~longValue16) | (-1333243866))) | j52)) * (-338))) + ((~(1333243865 | longValue16)) * 338)) + (((~(((-1333243866) | longValue16) | currentTimeMillis56)) | j52) * 338)) - 577404044;
                                                                    int currentTimeMillis57 = (int) java.lang.System.currentTimeMillis();
                                                                    int i278 = ((int) (j53 >> 32)) & ((((((~currentTimeMillis57) | 1714626608) * 1324) - 818884594) + (((~(currentTimeMillis57 | (-428400526))) | (~(1865626936 | currentTimeMillis57))) * (-1324))) - 166785700);
                                                                    int i279 = ~((int) java.lang.System.currentTimeMillis());
                                                                    int i280 = ((int) j53) & (((((~(979693601 | i279)) | (-996537770)) * (-241)) - 2135837126) + (((~(i279 | (-16844169))) | 539004961) * 241));
                                                                    if (((i278 ^ i280) | (i278 & i280)) != 0) {
                                                                        int i281 = getAid;
                                                                        int i282 = (i281 ^ 73) + ((i281 & 73) << 1);
                                                                        SdkCoreAlternateContactlessPaymentDataImpl = i282 % 128;
                                                                        if (i282 % 2 == 0) {
                                                                            java.lang.Object[] objArr142 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, null, new int[1]};
                                                                            java.lang.Object[] objArr143 = {86904972, 16, java.lang.Integer.valueOf(((((-145817616) | r2) * 494) - 1444478563) + (((~((~((int) java.lang.System.currentTimeMillis())) | 558782944)) | (-699875600)) * 494))};
                                                                            java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                            if (obj35 == null) {
                                                                                java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 2712 - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1));
                                                                                java.lang.Object[] objArr144 = new java.lang.Object[1];
                                                                                a(653, r3[14], (byte) (-$$a[16]), objArr144);
                                                                                obj35 = cls33.getMethod((java.lang.String) objArr144[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj35);
                                                                            }
                                                                            ((int[]) objArr142[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj35).invoke(null, objArr143)).intValue();
                                                                            return objArr142;
                                                                        }
                                                                    }
                                                                    java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(724989957);
                                                                    if (obj36 == null) {
                                                                        java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 30, 1890 - android.view.KeyEvent.getDeadChar(0, 0), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3601));
                                                                        byte b49 = $$a[14];
                                                                        short s25 = (short) (b49 - 1);
                                                                        byte b50 = b49;
                                                                        java.lang.Object[] objArr145 = new java.lang.Object[1];
                                                                        a(s25, b50, (byte) (b50 - 1), objArr145);
                                                                        obj36 = cls34.getMethod((java.lang.String) objArr145[0], null);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(724989957, obj36);
                                                                    }
                                                                    long longValue17 = ((java.lang.Long) ((java.lang.reflect.Method) obj36).invoke(null, null)).longValue();
                                                                    long j54 = ~((int) java.lang.System.currentTimeMillis());
                                                                    long j55 = 690451913 | j54;
                                                                    long j56 = ~longValue17;
                                                                    long j57 = j54 | j56;
                                                                    long j58 = ((((((-183) * longValue17) + 126352700262L) + (((~(j57 | (-690451914))) | (~(j55 | longValue17))) * (-184))) + (((~j57) | ((~j55) | (~(j56 | 690451913)))) * 184)) + ((longValue17 | (-690451914)) * 184)) - 1188796466;
                                                                    int currentTimeMillis58 = (int) java.lang.System.currentTimeMillis();
                                                                    int i283 = ~currentTimeMillis58;
                                                                    int i284 = ((int) (j58 >> 32)) & ((((~((-18883973) | i283)) | (~((-704845836) | currentTimeMillis58))) * 920) + 2038856378 + (((~((-713496604) | i283)) | 704845835) * 920) + (((~(currentTimeMillis58 | (-8650769))) | (~(i283 | (-704845836))) | (~((-18883973) | currentTimeMillis58))) * 920));
                                                                    int i285 = ((int) j58) & (((((-1090520129) | r4) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) - 1200472739) + (((~((~((int) java.lang.System.currentTimeMillis())) | 922549005)) | (-1168397382)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE));
                                                                    if (((i284 ^ i285) | (i285 & i284)) != 0) {
                                                                        java.lang.Object[] objArr146 = {new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, new int[]{i277}, null, new int[1]};
                                                                        int currentTimeMillis59 = (int) java.lang.System.currentTimeMillis();
                                                                        java.lang.Object[] objArr147 = {86904972, 16, java.lang.Integer.valueOf((((~((-27813795) | currentTimeMillis59)) | 8913696) * 345) + 805157336 + (((~((-27813795) | (~currentTimeMillis59))) | 672598029) * 345) + ((~(currentTimeMillis59 | (-8913697))) * 345))};
                                                                        java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj37 == null) {
                                                                            java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.widget.ExpandableListView.getPackedPositionChild(0L), android.view.Gravity.getAbsoluteGravity(0, 0) + 2713, (char) ((-1) - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                                                            java.lang.Object[] objArr148 = new java.lang.Object[1];
                                                                            a(653, r4[14], (byte) (-$$a[16]), objArr148);
                                                                            obj37 = cls35.getMethod((java.lang.String) objArr148[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj37);
                                                                        }
                                                                        ((int[]) objArr146[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj37).invoke(null, objArr147)).intValue();
                                                                        return objArr146;
                                                                    }
                                                                    java.lang.Object[] objArr149 = {2};
                                                                    java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                                                                    if (obj38 == null) {
                                                                        java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2364, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                                                        byte b51 = $$a[14];
                                                                        short s26 = (short) (b51 - 1);
                                                                        byte b52 = b51;
                                                                        java.lang.Object[] objArr150 = new java.lang.Object[1];
                                                                        a(s26, b52, (byte) (b52 - 1), objArr150);
                                                                        obj38 = cls36.getMethod((java.lang.String) objArr150[0], java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj38);
                                                                    }
                                                                    long longValue18 = ((java.lang.Long) ((java.lang.reflect.Method) obj38).invoke(null, objArr149)).longValue();
                                                                    long currentTimeMillis60 = (int) java.lang.System.currentTimeMillis();
                                                                    long j59 = ~((~longValue18) | 498051415);
                                                                    long j60 = ((522 * longValue18) - 258986735800L) + ((~((-498051416) | longValue18 | currentTimeMillis60)) * 521) + ((-1042) * j59) + (((~(longValue18 | (~currentTimeMillis60) | (-498051416))) | j59) * 521) + 909858784;
                                                                    int currentTimeMillis61 = (int) java.lang.System.currentTimeMillis();
                                                                    int i286 = ~currentTimeMillis61;
                                                                    int i287 = ((int) (j60 >> 32)) & (((287572256 | currentTimeMillis61) * 988) + 2052362226 + (((~(291941220 | i286)) | 1140916226) * (-1976)) + (((~(currentTimeMillis61 | (-1145285191))) | 287572256 | (~(i286 | 1145285190))) * 988));
                                                                    int currentTimeMillis62 = (int) java.lang.System.currentTimeMillis();
                                                                    int i288 = ~currentTimeMillis62;
                                                                    int i289 = ((int) j60) & ((((~(450054935 | currentTimeMillis62)) | 987171474) * (-318)) + 1862108447 + (((~(987171474 | currentTimeMillis62)) | (~((-450038291) | i288))) * 318) + (((~(currentTimeMillis62 | (-450038291))) | (~(i288 | (-16646)))) * 318));
                                                                    if (((i287 ^ i289) | (i287 & i289)) == 2) {
                                                                        java.lang.Object[] objArr151 = {new int[]{0}, new int[]{270}, null, new int[1]};
                                                                        int currentTimeMillis63 = (int) java.lang.System.currentTimeMillis();
                                                                        java.lang.Object[] objArr152 = {86904972, 16, java.lang.Integer.valueOf((((~((-110806398) | currentTimeMillis63)) | 8519757) * (-140)) + 1450498129 + ((~((-102286641) | currentTimeMillis63)) * 70) + (((~(currentTimeMillis63 | 820131917)) | (-913898801)) * 70))};
                                                                        java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj39 == null) {
                                                                            java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 50, android.view.View.resolveSizeAndState(0, 0, 0) + 2713, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                                                                            java.lang.Object[] objArr153 = new java.lang.Object[1];
                                                                            a(653, r4[14], (byte) (-$$a[16]), objArr153);
                                                                            obj39 = cls37.getMethod((java.lang.String) objArr153[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj39);
                                                                        }
                                                                        ((int[]) objArr151[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj39).invoke(null, objArr152)).intValue();
                                                                        return objArr151;
                                                                    }
                                                                    java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1411285061);
                                                                    if (obj40 == null) {
                                                                        java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777256, 3197 - android.text.TextUtils.indexOf(str3, str3), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                                                        byte b53 = $$a[14];
                                                                        java.lang.Object[] objArr154 = new java.lang.Object[1];
                                                                        a(androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, (byte) (b53 - 1), b53, objArr154);
                                                                        obj40 = cls38.getMethod((java.lang.String) objArr154[0], null);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1411285061, obj40);
                                                                    }
                                                                    long longValue19 = ((java.lang.Long) ((java.lang.reflect.Method) obj40).invoke(null, null)).longValue();
                                                                    int currentTimeMillis64 = (int) java.lang.System.currentTimeMillis();
                                                                    long j61 = ~longValue19;
                                                                    long j62 = ~currentTimeMillis64;
                                                                    long j63 = (185 * longValue19) + 305778049998L + ((1670918305 | longValue19) * (-368)) + (((-1670918306) | j61 | j62) * 184) + (((~(longValue19 | (-1670918306))) | (~(j61 | 1670918305)) | (~(j62 | (-1670918306)))) * 184) + 1767163667;
                                                                    int currentTimeMillis65 = (int) java.lang.System.currentTimeMillis();
                                                                    int i290 = ~currentTimeMillis65;
                                                                    int i291 = ((int) (j63 >> 32)) & ((((~(793956717 | i290)) | (~((-721604710) | currentTimeMillis65))) * (-831)) + 101882544 + ((~((-1342179459) | currentTimeMillis65)) * (-1662)) + (((~(currentTimeMillis65 | (-2063784168))) | (~(i290 | 2063784167)) | (~((-793956718) | currentTimeMillis65))) * 831));
                                                                    int currentTimeMillis66 = (int) java.lang.System.currentTimeMillis();
                                                                    int i292 = ((int) j63) & ((((~((-541337994) | currentTimeMillis66)) | (-2013167584)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) + 1509991064 + ((~((~currentTimeMillis66) | (-541337994))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING));
                                                                    if (((i291 ^ i292) | (i291 & i292)) != 0) {
                                                                        java.lang.Object[] objArr155 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, null, new int[1]};
                                                                        int currentTimeMillis67 = (int) java.lang.System.currentTimeMillis();
                                                                        int i293 = ~(311926556 | currentTimeMillis67);
                                                                        java.lang.Object[] objArr156 = {86904972, 16, java.lang.Integer.valueOf((((~((-311926557) | currentTimeMillis67)) | 310874896 | (~((-397398964) | currentTimeMillis67))) * (-880)) + 2145524319 + (((~((~currentTimeMillis67) | (-311926557))) | 397398963 | i293) * (-880)) + (i293 * 880))};
                                                                        java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj41 == null) {
                                                                            java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 49, 2713 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1));
                                                                            java.lang.Object[] objArr157 = new java.lang.Object[1];
                                                                            a(653, r4[14], (byte) (-$$a[16]), objArr157);
                                                                            obj41 = cls39.getMethod((java.lang.String) objArr157[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj41);
                                                                        }
                                                                        ((int[]) objArr155[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj41).invoke(null, objArr156)).intValue();
                                                                        return objArr155;
                                                                    }
                                                                    java.lang.Object obj42 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(502613909);
                                                                    if (obj42 == null) {
                                                                        java.lang.Class cls40 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 40, android.graphics.Color.alpha(0) + 3197, (char) (android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                                                                        byte b54 = $$a[14];
                                                                        short s27 = (short) (b54 - 1);
                                                                        byte b55 = b54;
                                                                        java.lang.Object[] objArr158 = new java.lang.Object[1];
                                                                        a(s27, b55, (byte) (b55 - 1), objArr158);
                                                                        obj42 = cls40.getMethod((java.lang.String) objArr158[0], null);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(502613909, obj42);
                                                                    }
                                                                    long longValue20 = ((java.lang.Long) ((java.lang.reflect.Method) obj42).invoke(null, null)).longValue();
                                                                    long currentTimeMillis68 = (int) java.lang.System.currentTimeMillis();
                                                                    long j64 = ~currentTimeMillis68;
                                                                    long j65 = ((-520) * longValue20) + 192607473870L + (((~(j64 | longValue20)) | 368979835) * (-1042)) + ((longValue20 | currentTimeMillis68) * 521) + (((~((~longValue20) | (-368979836))) | (~(currentTimeMillis68 | (-368979836))) | (~(j64 | 368979835 | longValue20))) * 521) + 583890055;
                                                                    int currentTimeMillis69 = (int) java.lang.System.currentTimeMillis();
                                                                    int i294 = ((int) (j65 >> 32)) & ((((~(1434447743 | currentTimeMillis69)) | 2778667) * (-756)) + 1427163546 + (((~currentTimeMillis69) | 1434447743) * 756));
                                                                    int currentTimeMillis70 = (int) java.lang.System.currentTimeMillis();
                                                                    int i295 = ~currentTimeMillis70;
                                                                    int i296 = ((int) j65) & (((((~((-1073332133) | currentTimeMillis70)) | (~(1784408753 | i295))) * (-1808)) - 5397395) + (((~((-710519457) | currentTimeMillis70)) | (~(2147221429 | i295))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~(currentTimeMillis70 | (-1784408754))) | 362812676 | (~(i295 | 1073332132))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN));
                                                                    if (((i294 ^ i296) | (i294 & i296)) != 0) {
                                                                        getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 111) % 128;
                                                                        java.lang.Object[] objArr159 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, null, new int[1]};
                                                                        int currentTimeMillis71 = (int) java.lang.System.currentTimeMillis();
                                                                        int i297 = (~((-760035531) | currentTimeMillis71)) | 742930432;
                                                                        java.lang.Object[] objArr160 = {86904972, 16, java.lang.Integer.valueOf((i297 * 992) + 1071186367 + ((i297 | (~((~currentTimeMillis71) | (-33604913)))) * (-496)) + ((currentTimeMillis71 | (-50710011)) * 496))};
                                                                        java.lang.Object obj43 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj43 == null) {
                                                                            java.lang.Class cls41 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 50, 2713 - android.view.View.resolveSizeAndState(0, 0, 0), (char) android.view.View.getDefaultSize(0, 0));
                                                                            java.lang.Object[] objArr161 = new java.lang.Object[1];
                                                                            a(653, r4[14], (byte) (-$$a[16]), objArr161);
                                                                            obj43 = cls41.getMethod((java.lang.String) objArr161[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj43);
                                                                        }
                                                                        ((int[]) objArr159[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj43).invoke(null, objArr160)).intValue();
                                                                        return objArr159;
                                                                    }
                                                                    java.lang.Object obj44 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1293945309);
                                                                    if (obj44 == null) {
                                                                        java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 44, android.view.KeyEvent.keyCodeFromString(str3) + 2836, (char) android.graphics.Color.argb(0, 0, 0, 0));
                                                                        byte b56 = $$a[14];
                                                                        short s28 = (short) (b56 - 1);
                                                                        byte b57 = b56;
                                                                        java.lang.Object[] objArr162 = new java.lang.Object[1];
                                                                        a(s28, b57, (byte) (b57 - 1), objArr162);
                                                                        obj44 = cls42.getMethod((java.lang.String) objArr162[0], null);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1293945309, obj44);
                                                                    }
                                                                    long longValue21 = ((java.lang.Long) ((java.lang.reflect.Method) obj44).invoke(null, null)).longValue();
                                                                    long currentTimeMillis72 = (int) java.lang.System.currentTimeMillis();
                                                                    long j66 = ((((192 * longValue21) - 166138694009L) + (((~(longValue21 | currentTimeMillis72)) | 874414180) * 191)) + (((~(longValue21 | (-874414181))) | (~((~currentTimeMillis72) | longValue21))) * 191)) - 1680708935;
                                                                    int currentTimeMillis73 = (int) java.lang.System.currentTimeMillis();
                                                                    int i298 = ~currentTimeMillis73;
                                                                    int i299 = ((int) (j66 >> 32)) & ((((~(1159535300 | i298)) | (-1698537429) | (~(1698205584 | i298))) * (-1136)) + 1738041050 + (((~(1159535300 | currentTimeMillis73)) | (~(1698205584 | currentTimeMillis73)) | (~((-1159203457) | i298))) * (-568)) + (((~(currentTimeMillis73 | 1698537428)) | (~(i298 | (-1159535301))) | (~((-1698205585) | i298))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION));
                                                                    int i300 = ((int) j66) & (((((~(557468414 | r4)) | 879757995) * (-948)) - 849381639) + ((~((~((int) java.lang.System.currentTimeMillis())) | 897207039)) * (-948)) + 50329752);
                                                                    if (((i299 ^ i300) | (i299 & i300)) != 0) {
                                                                        SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 87) % 128;
                                                                        java.lang.Object[] objArr163 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, null, new int[1]};
                                                                        int currentTimeMillis74 = (int) java.lang.System.currentTimeMillis();
                                                                        int i301 = ~currentTimeMillis74;
                                                                        java.lang.Object[] objArr164 = {86904972, 16, java.lang.Integer.valueOf((((~(i301 | 298535975)) | (-1037827832) | (~(1007861495 | i301))) * 464) + 1287363327 + (((-739291857) | currentTimeMillis74) * (-464)) + (((~(currentTimeMillis74 | 1007861495)) | (-1037827832)) * 464))};
                                                                        java.lang.Object obj45 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj45 == null) {
                                                                            java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 2713 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                                                                            java.lang.Object[] objArr165 = new java.lang.Object[1];
                                                                            a(653, r5[14], (byte) (-$$a[16]), objArr165);
                                                                            obj45 = cls43.getMethod((java.lang.String) objArr165[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj45);
                                                                        }
                                                                        ((int[]) objArr163[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj45).invoke(null, objArr164)).intValue();
                                                                        return objArr163;
                                                                    }
                                                                    long[] jArr3 = {624887784092251L};
                                                                    int i302 = -(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                                    int i303 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                    java.lang.Object[] objArr166 = new java.lang.Object[1];
                                                                    b(((i302 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE) << 1) - (i302 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE), (i303 ^ 17) + ((i303 & 17) << 1), "\u0004ￍ\u000b\r\u0013\f\u0012\u0011ￍ\u000e\u0010\r\u0001ￍ\u0011\u0003\n", false, 8 - (~(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)))), objArr166);
                                                                    java.lang.Object[] objArr167 = {(java.lang.String) objArr166[0], 3, 2251799813685247L, jArr3};
                                                                    java.lang.Object obj46 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                                                    if (obj46 == null) {
                                                                        java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 37, 3095 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) android.graphics.Color.argb(0, 0, 0, 0));
                                                                        byte b58 = $$a[14];
                                                                        short s29 = (short) (b58 - 1);
                                                                        byte b59 = b58;
                                                                        java.lang.Object[] objArr168 = new java.lang.Object[1];
                                                                        a(s29, b59, (byte) (b59 - 1), objArr168);
                                                                        obj46 = cls44.getMethod((java.lang.String) objArr168[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj46);
                                                                    }
                                                                    long longValue22 = ((java.lang.Long) ((java.lang.reflect.Method) obj46).invoke(null, objArr167)).longValue();
                                                                    long currentTimeMillis75 = (int) java.lang.System.currentTimeMillis();
                                                                    long j67 = ~currentTimeMillis75;
                                                                    long j68 = ~(325101609 | longValue22);
                                                                    long j69 = ((((((-396) * longValue22) - 129390440780L) + ((((~(j67 | 325101609)) | j68) | (~(j67 | longValue22))) * (-397))) + ((-397) * j68)) + (((~((~longValue22) | (-325101610))) | (currentTimeMillis75 | j68)) * 397)) - 1585546300;
                                                                    int currentTimeMillis76 = (int) java.lang.System.currentTimeMillis();
                                                                    int i304 = ~currentTimeMillis76;
                                                                    int i305 = ((int) (j69 >> 32)) & ((((((~((-1742674533) | currentTimeMillis76)) | 34865184) | (~((-305448122) | currentTimeMillis76))) * (-754)) - 466519034) + (((~(currentTimeMillis76 | (-34865185))) | (~((-270582938) | i304))) * (-754)) + (((-1742674533) | i304) * 754));
                                                                    int currentTimeMillis77 = (int) java.lang.System.currentTimeMillis();
                                                                    int i306 = ((int) j69) & (((((~(1273675406 | r6)) | 1376529) * 98) - 595152713) + (((~((~currentTimeMillis77) | 163551003)) | 1273675406 | (~((-163551004) | currentTimeMillis77))) * (-49)) + (((~(currentTimeMillis77 | 1273675406)) | 162174474) * 49));
                                                                    if (((i305 ^ i306) | (i305 & i306)) != 0) {
                                                                        java.lang.Object[] objArr169 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, null, new int[1]};
                                                                        int currentTimeMillis78 = (int) java.lang.System.currentTimeMillis();
                                                                        int i307 = ~currentTimeMillis78;
                                                                        java.lang.Object[] objArr170 = {86904972, 16, java.lang.Integer.valueOf(((((~((-81324024) | currentTimeMillis78)) | (-628001497)) * (-318)) - 1335419055) + (((~((-628001497) | currentTimeMillis78)) | (~(637464575 | i307))) * 318) + (((~(currentTimeMillis78 | 637464575)) | (~(i307 | (-556140553)))) * 318))};
                                                                        java.lang.Object obj47 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj47 == null) {
                                                                            java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2, (android.os.Process.myPid() >> 22) + 2713, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                                                                            java.lang.Object[] objArr171 = new java.lang.Object[1];
                                                                            a(653, r4[14], (byte) (-$$a[16]), objArr171);
                                                                            obj47 = cls45.getMethod((java.lang.String) objArr171[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj47);
                                                                        }
                                                                        ((int[]) objArr169[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj47).invoke(null, objArr170)).intValue();
                                                                        return objArr169;
                                                                    }
                                                                    int i308 = -(android.os.Process.myTid() >> 22);
                                                                    java.lang.Object[] objArr172 = new java.lang.Object[1];
                                                                    c("耧羶쩿⍨\uf40c뉈넁拢⦿쬇⻞䊔", (i308 & 11) + (i308 | 11), objArr172);
                                                                    java.lang.Object[] objArr173 = {(java.lang.String) objArr172[0]};
                                                                    java.lang.Object obj48 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                                    if (obj48 == null) {
                                                                        java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 36, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 3161, (char) (33099 - android.view.View.MeasureSpec.getMode(0)));
                                                                        byte b60 = $$a[14];
                                                                        java.lang.Object[] objArr174 = new java.lang.Object[1];
                                                                        a(androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, (byte) (b60 - 1), b60, objArr174);
                                                                        obj48 = cls46.getMethod((java.lang.String) objArr174[0], java.lang.String.class);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj48);
                                                                    }
                                                                    long longValue23 = ((java.lang.Long) ((java.lang.reflect.Method) obj48).invoke(null, objArr173)).longValue();
                                                                    long currentTimeMillis79 = (int) java.lang.System.currentTimeMillis();
                                                                    long j70 = (((-271) * longValue23) - 160893956496L) + (((~(589355151 | (~longValue23) | (~currentTimeMillis79))) | (~((-589355152) | longValue23 | currentTimeMillis79))) * (-272)) + (((~(589355151 | longValue23)) | (~(589355151 | currentTimeMillis79))) * (-272)) + ((longValue23 | (~(currentTimeMillis79 | (-589355152)))) * 272) + 1584790055;
                                                                    int i309 = ~(((int) java.lang.System.currentTimeMillis()) | (-1913784810));
                                                                    int i310 = ((int) (j70 >> 32)) & (((138518530 | i309) * (-196)) + 1341583330 + ((i309 | (-2052303340)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE));
                                                                    int currentTimeMillis80 = (int) java.lang.System.currentTimeMillis();
                                                                    int i311 = ((int) j70) & (((((~((-1971709533) | r6)) | 534483122) * (-1042)) - 1380911140) + (((-1971709533) | currentTimeMillis80) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~(currentTimeMillis80 | (-534483123))) | 173674658 | (~((~currentTimeMillis80) | (-1610901069)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL));
                                                                    if (((i310 ^ i311) | (i310 & i311)) != 0) {
                                                                        java.lang.Object[] objArr175 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                                                        int currentTimeMillis81 = (int) java.lang.System.currentTimeMillis();
                                                                        int i312 = ~currentTimeMillis81;
                                                                        java.lang.Object[] objArr176 = {86904972, 16, java.lang.Integer.valueOf((((~(88605534 | i312)) | (-802125695)) * 98) + 1246649339 + (((~(i312 | (-797931055))) | 88605534 | (~(797931054 | currentTimeMillis81))) * (-49)) + (((~(currentTimeMillis81 | 88605534)) | 4194640) * 49))};
                                                                        java.lang.Object obj49 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj49 == null) {
                                                                            java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.argb(0, 0, 0, 0), 2713 - android.view.View.resolveSize(0, 0), (char) android.view.View.getDefaultSize(0, 0));
                                                                            java.lang.Object[] objArr177 = new java.lang.Object[1];
                                                                            a(653, r4[14], (byte) (-$$a[16]), objArr177);
                                                                            obj49 = cls47.getMethod((java.lang.String) objArr177[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj49);
                                                                        }
                                                                        ((int[]) objArr175[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj49).invoke(null, objArr176)).intValue();
                                                                        return objArr175;
                                                                    }
                                                                    int i313 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                                    int i314 = ((i313 | 69) << 1) - (i313 ^ 69);
                                                                    getAid = i314 % 128;
                                                                    if (i314 % 2 == 0) {
                                                                        java.lang.Object obj50 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(236031171);
                                                                        if (obj50 == null) {
                                                                            java.lang.Class cls48 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 27, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 2185, (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 59513));
                                                                            byte b61 = $$a[14];
                                                                            short s30 = (short) (b61 - 1);
                                                                            byte b62 = b61;
                                                                            java.lang.Object[] objArr178 = new java.lang.Object[1];
                                                                            a(s30, b62, (byte) (b62 - 1), objArr178);
                                                                            obj50 = cls48.getMethod((java.lang.String) objArr178[0], null);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(236031171, obj50);
                                                                        }
                                                                        long longValue24 = ((java.lang.Long) ((java.lang.reflect.Method) obj50).invoke(null, null)).longValue();
                                                                        int currentTimeMillis82 = (int) java.lang.System.currentTimeMillis();
                                                                        long j71 = ~longValue24;
                                                                        long j72 = ~currentTimeMillis82;
                                                                        long j73 = (((((984 * longValue24) - 36570365445L) + ((18610873 | j71) * 983)) + (((~(j71 | j72)) | (-18610874)) * (-983))) + (((~(longValue24 | (-18610874))) | (~((-18610874) | j72))) * 983)) - 890701459;
                                                                        int currentTimeMillis83 = (int) java.lang.System.currentTimeMillis();
                                                                        int i315 = ((int) (j73 >> 26)) & (((((~((-1790437673) | currentTimeMillis83)) | (-2142927446)) * 398) - 1675556590) + (((~((~currentTimeMillis83) | (-1790437673))) | (-2142927446)) * 398));
                                                                        int currentTimeMillis84 = (int) java.lang.System.currentTimeMillis();
                                                                        int i316 = ((int) j73) & (((((~((~currentTimeMillis84) | (-76087570))) | (~((-1610648077) | currentTimeMillis84))) * (-302)) - 806824605) + ((~((-76087570) | currentTimeMillis84)) * (-604)) + (((~(currentTimeMillis84 | (-1686735646))) | (-1860157312)) * 302));
                                                                    } else {
                                                                        java.lang.Object obj51 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(236031171);
                                                                        if (obj51 == null) {
                                                                            java.lang.Class cls49 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 28, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 2185, (char) (59561 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                                                            byte b63 = $$a[14];
                                                                            short s31 = (short) (b63 - 1);
                                                                            byte b64 = b63;
                                                                            java.lang.Object[] objArr179 = new java.lang.Object[1];
                                                                            a(s31, b64, (byte) (b64 - 1), objArr179);
                                                                            obj51 = cls49.getMethod((java.lang.String) objArr179[0], null);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(236031171, obj51);
                                                                        }
                                                                        long longValue25 = ((java.lang.Long) ((java.lang.reflect.Method) obj51).invoke(null, null)).longValue();
                                                                        int currentTimeMillis85 = (int) java.lang.System.currentTimeMillis();
                                                                        long j74 = ~((~longValue25) | (-823740432));
                                                                        long j75 = ~((-823740432) | currentTimeMillis85);
                                                                        long j76 = ((((((-657) * longValue25) - 542844944688L) + ((((~(longValue25 | 823740431)) | j74) | j75) * (-658))) + (658 * j74)) + ((j74 | j75) * 658)) - 48350154;
                                                                        int currentTimeMillis86 = (int) java.lang.System.currentTimeMillis();
                                                                        int i317 = ~currentTimeMillis86;
                                                                        int currentTimeMillis87 = (int) java.lang.System.currentTimeMillis();
                                                                    }
                                                                } else {
                                                                    int i318 = (i258 & 20) + (i258 | 20);
                                                                    i258 = (i318 & (-19)) + (i318 | (-19));
                                                                    strArr6 = strArr7;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    i4 = 0;
                                                    if (i4 == 0) {
                                                    }
                                                }
                                            } catch (java.lang.Throwable th2) {
                                                java.lang.Throwable cause2 = th2.getCause();
                                                if (cause2 != null) {
                                                    throw cause2;
                                                }
                                                throw th2;
                                            }
                                        }
                                        java.lang.Object[] objArr180 = {(java.lang.String) objArr[0]};
                                        java.lang.Object obj52 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        if (obj52 == null) {
                                            java.lang.Class cls50 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1921 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) android.view.View.MeasureSpec.getMode(0));
                                            byte b65 = $$a[14];
                                            short s32 = (short) (b65 - 1);
                                            byte b66 = b65;
                                            java.lang.Object[] objArr181 = new java.lang.Object[1];
                                            a(s32, b66, (byte) (b66 - 1), objArr181);
                                            obj52 = cls50.getMethod((java.lang.String) objArr181[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj52);
                                        }
                                        java.lang.Object invoke8 = ((java.lang.reflect.Method) obj52).invoke(null, objArr180);
                                        if (invoke8 != null) {
                                            int i319 = -(-(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                            java.lang.Object[] objArr182 = new java.lang.Object[1];
                                            c("ﲎ嚃㾇౾뮭竚戴鵇", (i319 ^ 6) + ((i319 & 6) << 1), objArr182);
                                            if (invoke8.equals((java.lang.String) objArr182[0])) {
                                                java.lang.Object[] objArr183 = new java.lang.Object[1];
                                                c("ﻰ뒢\ue119ꌚ⦿쬇昩滨ⅾ挐\udc96떼ꣂ拾䔲焫푼콡⡇ﷅ砝\uf721责夢", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 23, objArr183);
                                                try {
                                                    java.lang.Object[] objArr184 = {(java.lang.String) objArr183[0]};
                                                    java.lang.Object obj53 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                    if (obj53 == null) {
                                                        java.lang.Class cls51 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionType(0L) + 1921, (char) android.view.KeyEvent.normalizeMetaState(0));
                                                        byte b67 = $$a[14];
                                                        short s33 = (short) (b67 - 1);
                                                        byte b68 = b67;
                                                        java.lang.Object[] objArr185 = new java.lang.Object[1];
                                                        a(s33, b68, (byte) (b68 - 1), objArr185);
                                                        obj53 = cls51.getMethod((java.lang.String) objArr185[0], java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj53);
                                                    }
                                                    java.lang.String str51 = (java.lang.String) ((java.lang.reflect.Method) obj53).invoke(null, objArr184);
                                                    if (str51 != null) {
                                                        int i320 = SdkCoreAlternateContactlessPaymentDataImpl + 125;
                                                        getAid = i320 % 128;
                                                        if (i320 % 2 == 0) {
                                                            java.lang.Integer.parseInt(str51);
                                                            throw new java.lang.NullPointerException();
                                                        }
                                                        int parseInt = java.lang.Integer.parseInt(str51);
                                                        if (parseInt != 0) {
                                                            i3 = (parseInt & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE) + (parseInt | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE);
                                                            if (i3 != 0) {
                                                            }
                                                        }
                                                    }
                                                } catch (java.lang.Throwable th3) {
                                                    java.lang.Throwable cause3 = th3.getCause();
                                                    if (cause3 != null) {
                                                        throw cause3;
                                                    }
                                                    throw th3;
                                                }
                                            }
                                        }
                                        i3 = 0;
                                        if (i3 != 0) {
                                        }
                                    } catch (java.lang.Throwable th4) {
                                        java.lang.Throwable cause4 = th4.getCause();
                                        if (cause4 != null) {
                                            throw cause4;
                                        }
                                        throw th4;
                                    }
                                    int doubleTapTimeout2 = android.view.ViewConfiguration.getDoubleTapTimeout() >> 16;
                                    int currentTimeMillis88 = (int) java.lang.System.currentTimeMillis();
                                    int i321 = ~doubleTapTimeout2;
                                    int i322 = ~currentTimeMillis88;
                                    int i323 = (i322 ^ doubleTapTimeout2) | (doubleTapTimeout2 & i322);
                                    int i324 = (~(i321 | (-19))) | (~(i321 | currentTimeMillis88));
                                    int i325 = ((((doubleTapTimeout2 * (-495)) - 8910) + (i324 * 992)) - (~((i324 | (~((i323 & 18) | (i323 ^ 18)))) * (-496)))) - 1;
                                    int i326 = -(-(((currentTimeMillis88 & 18) | (currentTimeMillis88 ^ 18)) * 496));
                                    objArr = new java.lang.Object[1];
                                    c("뮭竚揄丣个吽㋐콩个吽类纨\uf856羘䆫瓴뒯郮", (i325 & i326) + (i325 | i326), objArr);
                                } else {
                                    int i327 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                    int currentTimeMillis89 = (int) java.lang.System.currentTimeMillis();
                                    int i328 = i327 * 491;
                                    int i329 = ((-127629) ^ i328) + ((i328 & (-127629)) << 1);
                                    int i330 = ~i327;
                                    int i331 = (i330 ^ (-262)) | (i330 & (-262));
                                    int i332 = ~currentTimeMillis89;
                                    int i333 = -(-(((i331 ^ i332) | (i331 & i332)) * (-490)));
                                    int i334 = ((i329 | i333) << 1) - (i329 ^ i333);
                                    int i335 = ((~((i327 ^ (-262)) | (i327 & (-262)))) | (~((currentTimeMillis89 ^ (-262)) | (currentTimeMillis89 & (-262))))) * 490;
                                    int i336 = ((i334 | i335) << 1) - (i335 ^ i334);
                                    int i337 = i330 * 490;
                                    int indexOf = android.text.TextUtils.indexOf(str, str, 0, 0);
                                    int i338 = (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    int currentTimeMillis90 = (int) java.lang.System.currentTimeMillis();
                                    int i339 = i338 * (-244);
                                    int i340 = ~currentTimeMillis90;
                                    int i341 = ~((i340 ^ (-5)) | (i340 & (-5)));
                                    int i342 = ~(i338 | (-5));
                                    int i343 = ((((i339 | 984) << 1) - (i339 ^ 984)) - (~(-(-(((i341 & i342) | (i341 ^ i342)) * (-245)))))) - 1;
                                    int i344 = ~((currentTimeMillis90 ^ (-5)) | (currentTimeMillis90 & (-5)));
                                    int i345 = i344 * (-245);
                                    int i346 = (i343 ^ i345) + ((i345 & i343) << 1);
                                    int i347 = (i338 | i344) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE;
                                    java.lang.Object[] objArr186 = new java.lang.Object[1];
                                    b((i336 & i337) + (i336 | i337), ((indexOf | 13) << 1) - (indexOf ^ 13), "\u0001ￋ\f\u000f\u0002\t\uffff\ufffe\u0004\u0004\u0012\uffff\u0002", true, ((i346 | i347) << 1) - (i347 ^ i346), objArr186);
                                    java.lang.Object[] objArr187 = {(java.lang.String) objArr186[0]};
                                    java.lang.Object obj54 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj54 == null) {
                                        java.lang.Class cls52 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString(str) + 40, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1921, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                                        byte b69 = $$a[14];
                                        short s34 = (short) (b69 - 1);
                                        byte b70 = b69;
                                        java.lang.Object[] objArr188 = new java.lang.Object[1];
                                        a(s34, b70, (byte) (b70 - 1), objArr188);
                                        obj54 = cls52.getMethod((java.lang.String) objArr188[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj54);
                                    }
                                    java.lang.Object invoke9 = ((java.lang.reflect.Method) obj54).invoke(null, objArr187);
                                    int i348 = -(-android.os.Process.getGidForName(str));
                                    i8 = 0;
                                    java.lang.Object[] objArr189 = new java.lang.Object[1];
                                    b(((i348 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) << 1) - (i348 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE), 0 - (~(-((android.os.Process.getThreadPriority(0) + 20) >> 6))), "\u0000", false, -android.graphics.ImageFormat.getBitsPerPixel(0), objArr189);
                                    if (invoke9.equals((java.lang.String) objArr189[0])) {
                                        i9 = 1;
                                        int[] iArr3 = new int[i9];
                                        int[] iArr22 = new int[i9];
                                        iArr3[i8] = i8;
                                        iArr22[i8] = 260;
                                        java.lang.Object[] objArr242 = {iArr3, iArr22, null, new int[i9]};
                                        int currentTimeMillis122 = (int) java.lang.System.currentTimeMillis();
                                        java.lang.Object[] objArr252 = {86904972, 16, java.lang.Integer.valueOf((((~((~currentTimeMillis122) | 994686966)) * 130) - 1556987663) + (((~(currentTimeMillis122 | 994686966)) | 285279526) * 130))};
                                        obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj8 == null) {
                                        }
                                        ((int[]) objArr242[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr252)).intValue();
                                        return objArr242;
                                    }
                                    int i3010 = (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                    java.lang.Object[] objArr272 = new java.lang.Object[1];
                                    c("鎮レ奒☤徨뭘ᆫำ", (i3010 & 7) + (i3010 | 7), objArr272);
                                    java.lang.String str62 = (java.lang.String) objArr272[0];
                                    int i3110 = -(-android.view.Gravity.getAbsoluteGravity(0, 0));
                                    int i3210 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                    java.lang.Object[] objArr282 = new java.lang.Object[1];
                                    b(((i3110 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) << 1) - (i3110 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE), ((i3210 | 6) << 1) - (i3210 ^ 6), "�\ufff7\b\u0006\uffff\u0004", false, -android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr282);
                                    java.lang.String str72 = (java.lang.String) objArr282[0];
                                    int capsMode4 = android.text.TextUtils.getCapsMode(str, 0, 0);
                                    int currentTimeMillis132 = (int) java.lang.System.currentTimeMillis();
                                    int i3310 = capsMode4 * 615;
                                    int i349 = ((-136086) ^ i3310) + ((i3310 & (-136086)) << 1);
                                    int i352 = ~capsMode4;
                                    int i362 = ~((i352 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE) | (i352 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE));
                                    int i372 = (i362 & currentTimeMillis132) | (currentTimeMillis132 ^ i362);
                                    int i382 = ~((capsMode4 ^ (-223)) | (capsMode4 & (-223)));
                                    int i392 = ((i372 ^ i382) | (i372 & i382)) * 614;
                                    int i402 = ~currentTimeMillis132;
                                    int i412 = ~((i352 ^ i402) | (i352 & i402));
                                    int i422 = (i362 ^ i412) | (i412 & i362);
                                    int i432 = ~((i402 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE) | (i402 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE));
                                    int i442 = -(-(((i422 ^ i432) | (i432 & i422)) * (-1228)));
                                    int i452 = (i352 & (-223)) | (i352 ^ (-223));
                                    int i462 = (capsMode4 ^ i402) | (capsMode4 & i402);
                                    int gidForName2 = android.os.Process.getGidForName(str);
                                    int i472 = -android.text.TextUtils.getOffsetAfter(str, 0);
                                    java.lang.Object[] objArr292 = new java.lang.Object[1];
                                    b((((((i349 ^ i392) + ((i349 & i392) << 1)) - (~i442)) - 1) - (~(((~((i402 ^ i452) | (i452 & i402))) | (~((i462 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE) | (i462 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE)))) * 614))) - 1, ((gidForName2 | 8) << 1) - (gidForName2 ^ 8), "\u0007\ufff9\u0006\ufff8\ufff8\u0001\t", false, ((i472 | 4) << 1) - (i472 ^ 4), objArr292);
                                    java.lang.String str82 = (java.lang.String) objArr292[0];
                                    int i482 = -android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                    int i492 = -(-(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                    java.lang.Object[] objArr302 = new java.lang.Object[1];
                                    b(219 - (~i482), ((i492 | 8) << 1) - (i492 ^ 8), "\u000b\ufffa\u0007￼\ufff9\ufff7\b\ufffa\u0007", false, android.text.TextUtils.getOffsetAfter(str, 0) + 3, objArr302);
                                    java.lang.String str92 = (java.lang.String) objArr302[0];
                                    int i502 = -(-android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                    java.lang.Object[] objArr312 = new java.lang.Object[1];
                                    c("䭤љ⺑\uee39⾌銨", ((i502 | 6) << 1) - (i502 ^ 6), objArr312);
                                    java.lang.String str102 = (java.lang.String) objArr312[0];
                                    int capsMode22 = android.text.TextUtils.getCapsMode(str, 0, 0);
                                    java.lang.Object[] objArr322 = new java.lang.Object[1];
                                    c("뮭竚揄丣ꭓ\uaada\uea49뜉㬪矇돫䶫짴謍", (capsMode22 ^ 13) + ((capsMode22 & 13) << 1), objArr322);
                                    java.lang.String str112 = (java.lang.String) objArr322[0];
                                    int i512 = -android.widget.ExpandableListView.getPackedPositionType(0L);
                                    java.lang.Object[] objArr332 = new java.lang.Object[1];
                                    c("酙澢撼ꌺ峓ꆰ", (i512 ^ 5) + ((i512 & 5) << 1), objArr332);
                                    java.lang.String str122 = (java.lang.String) objArr332[0];
                                    int i522 = -android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                    int currentTimeMillis142 = (int) java.lang.System.currentTimeMillis();
                                    int i532 = i522 * 306;
                                    int i542 = (i532 & androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS) + (i532 | androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS);
                                    int i552 = ~((i522 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) | (i522 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                                    int i562 = ~((i522 ^ currentTimeMillis142) | (i522 & currentTimeMillis142));
                                    int i572 = ~(i522 | (~currentTimeMillis142));
                                    int i582 = -android.view.Gravity.getAbsoluteGravity(0, 0);
                                    int size2 = android.view.View.MeasureSpec.getSize(0);
                                    java.lang.Object[] objArr342 = new java.lang.Object[1];
                                    b((((64260 | i542) << 1) - (64260 ^ i542)) + (((i552 & i562) | (i552 ^ i562)) * 305) + (((i572 ^ (-211)) | (i572 & (-211))) * 305), ((i582 | 6) << 1) - (i582 ^ 6), "\u0005ￒ\b\u000f\u0004\u0011", false, (size2 ^ 2) + ((size2 & 2) << 1), objArr342);
                                    java.lang.String str132 = (java.lang.String) objArr342[0];
                                    java.lang.Object[] objArr352 = new java.lang.Object[1];
                                    c("쓳ᨆ", android.view.View.getDefaultSize(0, 0) + 2, objArr352);
                                    java.lang.String str142 = (java.lang.String) objArr352[0];
                                    java.lang.Object[] objArr362 = new java.lang.Object[1];
                                    c("趌먼嘕㈗ﳘ\uf0ecꇚ쉹姱獶个吽傰ꘌ왷\ue9f9", 15 - (~(-(-(android.view.ViewConfiguration.getLongPressTimeout() >> 16)))), objArr362);
                                    java.lang.String str152 = (java.lang.String) objArr362[0];
                                    float length2 = android.graphics.PointF.length(0.0f, 0.0f);
                                    int i592 = -android.graphics.Color.argb(0, 0, 0, 0);
                                    int scrollBarSize22 = android.view.ViewConfiguration.getScrollBarSize() >> 8;
                                    java.lang.Object[] objArr372 = new java.lang.Object[1];
                                    b(213 - (length2 > 0.0f ? 1 : (length2 == 0.0f ? 0 : -1)), (i592 ^ 10) + ((i592 & 10) << 1), "\u0004\u0011\ufffe\u0004\u0001ￋ\u000f\u0000\t\f", false, (scrollBarSize22 ^ 8) + ((scrollBarSize22 & 8) << 1), objArr372);
                                    java.lang.String str162 = (java.lang.String) objArr372[0];
                                    int i602 = (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                    int i612 = -android.text.TextUtils.indexOf(str, str, 0, 0);
                                    int i622 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                    int currentTimeMillis152 = (int) java.lang.System.currentTimeMillis();
                                    int i632 = 609 - (~(-(-(i622 * 306))));
                                    int i642 = ~(i622 | 7);
                                    int i652 = ~(i622 | currentTimeMillis152);
                                    int i662 = ~currentTimeMillis152;
                                    int i672 = ~((i622 ^ i662) | (i622 & i662));
                                    java.lang.Object[] objArr382 = new java.lang.Object[1];
                                    b(((i602 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE) << 1) - (i602 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE), (i612 & 8) + (i612 | 8), "\u0003\ufff7\u0006\ufff5\u0002\uffff\u0004\u0006", false, (i632 ^ 2142) + ((i632 & 2142) << 1) + (((i642 & i652) | (i642 ^ i652)) * 305) + (((i672 ^ (-8)) | (i672 & (-8))) * 305), objArr382);
                                    java.lang.String str172 = (java.lang.String) objArr382[0];
                                    int i682 = -android.view.KeyEvent.getDeadChar(0, 0);
                                    int lastIndexOf4 = android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                    int i692 = -((android.os.Process.getThreadPriority(0) + 20) >> 6);
                                    java.lang.Object[] objArr392 = new java.lang.Object[1];
                                    b(((i682 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) << 1) - (i682 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE), (lastIndexOf4 & 13) + (lastIndexOf4 | 13), "\ufff9\u0005\u0002\u0002\ufffb\ufff9\n\ufffa\u0006\b\u0005￼", false, (i692 & 8) + (i692 | 8), objArr392);
                                    java.lang.String str182 = (java.lang.String) objArr392[0];
                                    int i702 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                    java.lang.Object[] objArr402 = new java.lang.Object[1];
                                    c("㲍䅪弫\ue103ӊ趖䫻ƫ\ue81b䮲\u0b79䘟놥ힶ", (i702 ^ 14) + ((i702 & 14) << 1), objArr402);
                                    java.lang.String str192 = (java.lang.String) objArr402[0];
                                    java.lang.Object[] objArr412 = new java.lang.Object[1];
                                    c("\u0c76\u19db\ue43c窶蛈샺邴鰼", 6 - (~(-(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))), objArr412);
                                    java.lang.String str202 = (java.lang.String) objArr412[0];
                                    int i712 = -(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                    java.lang.Object[] objArr422 = new java.lang.Object[1];
                                    c("던櫥긭늙覍䬆峓ꆰ", ((i712 | 6) << 1) - (i712 ^ 6), objArr422);
                                    java.lang.String str212 = (java.lang.String) objArr422[0];
                                    java.lang.Object[] objArr432 = new java.lang.Object[1];
                                    c("噵ⷿ⾌銨侷亶鸿豰", 7 - (~(-(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))), objArr432);
                                    java.lang.String str222 = (java.lang.String) objArr432[0];
                                    long zoomControlsTimeout2 = android.view.ViewConfiguration.getZoomControlsTimeout();
                                    int i722 = -(-android.view.View.getDefaultSize(0, 0));
                                    java.lang.Object[] objArr442 = new java.lang.Object[1];
                                    b(227 - (~(zoomControlsTimeout2 > 0L ? 1 : (zoomControlsTimeout2 == 0L ? 0 : -1))), ((i722 | 2) << 1) - (i722 ^ 2), "\u0000\u0000", false, 2 - (~android.view.MotionEvent.axisFromString(str)), objArr442);
                                    java.lang.String str232 = (java.lang.String) objArr442[0];
                                    java.lang.Object[] objArr452 = new java.lang.Object[1];
                                    c("姱獶栉ໄ홻幕䰟ᶣ㫰珓⮋칭⌫阫㛿у\ue880唻뙾㥂", 19 - (~(-android.view.View.combineMeasuredStates(0, 0))), objArr452);
                                    java.lang.String str242 = (java.lang.String) objArr452[0];
                                    java.lang.Object[] objArr462 = new java.lang.Object[1];
                                    c("姱獶涹仨ꃓꌅ", android.widget.ExpandableListView.getPackedPositionType(0L) + 6, objArr462);
                                    java.lang.String str252 = (java.lang.String) objArr462[0];
                                    int i732 = -android.view.View.combineMeasuredStates(0, 0);
                                    int currentTimeMillis162 = (int) java.lang.System.currentTimeMillis();
                                    int i742 = i732 * 371;
                                    int i752 = ~currentTimeMillis162;
                                    int i762 = ~(i752 | (-231));
                                    int i772 = ~i732;
                                    int i782 = ~(i772 | currentTimeMillis162);
                                    int i792 = (((((85330 | i742) << 1) - (i742 ^ 85330)) + (((i762 & i782) | (i762 ^ i782)) * (-370))) - (~((((~((currentTimeMillis162 ^ (-231)) | (currentTimeMillis162 & (-231)))) | (~((i752 & i772) | (i752 ^ i772)))) | (~((i732 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE) | (i732 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE)))) * (-370)))) - 1;
                                    int i802 = (~(i732 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE)) * com.knotapi.knot.utilities.Constants.ID_KROGER;
                                    java.lang.Object[] objArr472 = new java.lang.Object[1];
                                    b((i792 & i802) + (i802 | i792), android.graphics.Color.alpha(0) + 2, "\uffff\u0001", false, 2 - (~(-(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))), objArr472);
                                    java.lang.String str262 = (java.lang.String) objArr472[0];
                                    int i812 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                    int i822 = -(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                    int i832 = -(-(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                    java.lang.Object[] objArr482 = new java.lang.Object[1];
                                    b((i812 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE) + ((i812 & com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE) << 1), ((i822 | 16) << 1) - (i822 ^ 16), "\n\u000b\t\t\ufff7\u0004\uffff\n\uffff\u0010\ufffb\bￃ\t\n\ufff7", false, ((i832 | 3) << 1) - (i832 ^ 3), objArr482);
                                    java.lang.String str272 = (java.lang.String) objArr482[0];
                                    int i842 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                    int currentTimeMillis172 = (int) java.lang.System.currentTimeMillis();
                                    int i852 = i842 * (-830);
                                    int i862 = ~currentTimeMillis172;
                                    int i872 = ~((i862 ^ (-222)) | (i862 & (-222)));
                                    int i882 = (i842 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE) | (i842 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE);
                                    int i892 = ~((i882 ^ currentTimeMillis172) | (i882 & currentTimeMillis172));
                                    int i902 = (i842 ^ (-222)) | (i842 & (-222));
                                    int i912 = ~i842;
                                    int i922 = ~((i862 ^ i912) | (i862 & i912));
                                    int i932 = ~((i842 ^ currentTimeMillis172) | (i842 & currentTimeMillis172));
                                    int i942 = (i932 ^ i922) | (i932 & i922);
                                    int i952 = ~((currentTimeMillis172 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE) | (currentTimeMillis172 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE));
                                    int i962 = -(-(((i942 ^ i952) | (i942 & i952)) * 831));
                                    int i972 = -android.graphics.Color.argb(0, 0, 0, 0);
                                    int currentTimeMillis182 = (int) java.lang.System.currentTimeMillis();
                                    int i982 = i972 * 71;
                                    int i992 = (i982 ^ (-621)) + ((i982 & (-621)) << 1);
                                    int i1002 = ~i972;
                                    int i1012 = ~((i1002 & 9) | (i1002 ^ 9));
                                    int i1022 = ~((currentTimeMillis182 ^ 9) | (currentTimeMillis182 & 9));
                                    int i1032 = -(-(((i1012 & i1022) | (i1012 ^ i1022)) * (-140)));
                                    int i1042 = (i992 & i1032) + (i1032 | i992);
                                    int i1052 = (~(i972 | 9 | currentTimeMillis182)) * 70;
                                    int i1062 = (i1042 & i1052) + (i1052 | i1042);
                                    int i1072 = ~(i1002 | 9);
                                    int i1082 = ~((i972 ^ (-10)) | (i972 & (-10)));
                                    int i1092 = (i1072 ^ i1082) | (i1072 & i1082);
                                    int i1102 = ~((i972 & currentTimeMillis182) | (i972 ^ currentTimeMillis182));
                                    int i1112 = ((i1092 ^ i1102) | (i1102 & i1092)) * 70;
                                    java.lang.Object[] objArr492 = new java.lang.Object[1];
                                    b(((((((183872 & i852) + (i852 | 183872)) + (((i872 & i892) | (i872 ^ i892)) * (-831))) - (~((~((currentTimeMillis172 ^ i902) | (i902 & currentTimeMillis172))) * (-1662)))) - 1) - (~i962)) - 1, (i1062 ^ i1112) + ((i1112 & i1062) << 1), "\b\ufff7\ufff9\ufffb\u0006\ufff7\n\ufffe\n", false, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 8, objArr492);
                                    java.lang.String str282 = (java.lang.String) objArr492[0];
                                    java.lang.Object[] objArr502 = new java.lang.Object[1];
                                    c("\udc11᥊ṭ䨽\uefc9\ufddb㤋\ueec4ﻵ莕", android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 10, objArr502);
                                    java.lang.String str292 = (java.lang.String) objArr502[0];
                                    int capsMode32 = android.text.TextUtils.getCapsMode(str, 0, 0);
                                    int i1122 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                    java.lang.Object[] objArr512 = new java.lang.Object[1];
                                    b(217 - capsMode32, ((i1122 | 59) << 1) - (i1122 ^ 59), "\ufffa\u000b\rￏ\ufffe\r\u000e\b\u000b\ufffe￼", true, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 3, objArr512);
                                    java.lang.String str302 = (java.lang.String) objArr512[0];
                                    int red3 = android.graphics.Color.red(0);
                                    int i1132 = -(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                    int i1142 = -(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                    java.lang.Object[] objArr522 = new java.lang.Object[1];
                                    b((red3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE) + ((red3 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE) << 1), ((i1132 | 11) << 1) - (i1132 ^ 11), "\ufff9\ufff4\ufffe\u0003\ufffb\u0004\n\u0003\f\ufffe\u0003", false, ((i1142 | 6) << 1) - (i1142 ^ 6), objArr522);
                                    java.lang.String str312 = (java.lang.String) objArr522[0];
                                    int lastIndexOf22 = android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                    java.lang.Object[] objArr532 = new java.lang.Object[1];
                                    c("蛈샺䰟ᶣ뙥涪씿弥⸏魲律꧟\uffef蚈굩\udcfd", (lastIndexOf22 ^ 16) + ((lastIndexOf22 & 16) << 1), objArr532);
                                    java.lang.String str322 = (java.lang.String) objArr532[0];
                                    int i1152 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
                                    java.lang.Object[] objArr542 = new java.lang.Object[1];
                                    c("蛈샺䰟ᶣ뙥涪꯳씹\uf48f뢣鼆㸹㮅鹯", (i1152 & 14) + (i1152 | 14), objArr542);
                                    java.lang.String[] strArr42 = {str62, str72, str82, str92, str102, str112, str122, str132, str142, str152, str162, str172, str182, str192, str202, str212, str222, str232, str242, str252, str262, str272, str282, str292, str302, str312, str322, (java.lang.String) objArr542[0]};
                                    int i1162 = (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                    int currentTimeMillis192 = (int) java.lang.System.currentTimeMillis();
                                    int i1172 = i1162 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE;
                                    int i1182 = ~i1162;
                                    int i1192 = (i1182 ^ (-216)) | (i1182 & (-216));
                                    int i1202 = ~currentTimeMillis192;
                                    int i1212 = (i1162 ^ 215) | (i1162 & 215);
                                    int i1222 = ((-58265) ^ i1172) + ((i1172 & (-58265)) << 1) + (((~((i1192 & i1202) | (i1192 ^ i1202))) | (~((i1212 & currentTimeMillis192) | (i1212 ^ currentTimeMillis192)))) * (-272));
                                    int i1232 = ~((i1182 ^ 215) | (i1182 & 215));
                                    int i1242 = ~(i1182 | currentTimeMillis192);
                                    int i1252 = ((i1232 ^ i1242) | (i1242 & i1232)) * (-272);
                                    int i1262 = ~((i1162 ^ currentTimeMillis192) | (i1162 & currentTimeMillis192));
                                    int threadPriority2 = android.os.Process.getThreadPriority(0);
                                    int i1272 = -(-((((threadPriority2 | 20) << 1) - (threadPriority2 ^ 20)) >> 6));
                                    int tapTimeout2 = android.view.ViewConfiguration.getTapTimeout() >> 16;
                                    int currentTimeMillis202 = (int) java.lang.System.currentTimeMillis();
                                    int i1282 = (tapTimeout2 * (-445)) - 890;
                                    int i1292 = ~tapTimeout2;
                                    int i1302 = ~(i1292 | (-3));
                                    int i1312 = ~((~currentTimeMillis202) | (-3));
                                    int i1322 = -(-(((i1302 & i1312) | (i1302 ^ i1312)) * 446));
                                    int i1332 = tapTimeout2 | (-3);
                                    java.lang.Object[] objArr552 = new java.lang.Object[1];
                                    b((i1222 ^ i1252) + ((i1252 & i1222) << 1) + (((i1262 ^ 215) | (i1262 & 215)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE), 10 - (~i1272), "\r\u0000\r\n\uffc9\u0003￼\r\uffff\u0012￼", false, (i1282 & i1322) + (i1282 | i1322) + (((~((currentTimeMillis202 & i1332) | (i1332 ^ currentTimeMillis202))) | (~((i1292 ^ 2) | (i1292 & 2)))) * 446) + ((~((i1292 & (-3)) | (i1292 ^ (-3)))) * 446), objArr552);
                                    java.lang.Object[] objArr562 = {(java.lang.String) objArr552[0]};
                                    obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj2 == null) {
                                    }
                                    str2 = (java.lang.String) ((java.lang.reflect.Method) obj2).invoke(null, objArr562);
                                    if (str2 != null) {
                                    }
                                    java.lang.Object[] objArr702 = new java.lang.Object[1];
                                    c("엀ˁᆫำ隉\ufbc3ꚉ\uf38a急ꘚ⾌銨\uef9a䩗\uf624ꡫ웼∕皶힢ѷ⮊벢芧", 23 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr702);
                                    java.lang.Object[] objArr712 = {(java.lang.String) objArr702[0]};
                                    obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj3 == null) {
                                    }
                                    long longValue72 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr712)).longValue();
                                    long j182 = ~((int) java.lang.System.currentTimeMillis());
                                    long j192 = ((-159) * longValue72) + 100347958206L + ((631119233 | longValue72) * 160) + (((~(longValue72 | (-631119234))) | (~((-631119234) | j182))) * (-160)) + (((~((~longValue72) | j182)) | (-631119234)) * 160) + 1921659301;
                                    int currentTimeMillis262 = (int) java.lang.System.currentTimeMillis();
                                    int currentTimeMillis272 = (int) java.lang.System.currentTimeMillis();
                                    int i1452 = ~currentTimeMillis272;
                                    j = (((int) (j192 >> 32)) & (((((~((-1750334239) | currentTimeMillis262)) | (-1107406647)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) - 1102859183) + (((~((~currentTimeMillis262) | (-1750334239))) | 676483080) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE))) | (((((~((-914300528) | currentTimeMillis272)) | (~(2013241327 | i1452))) * (-406)) + 1638797211 + ((~((-69800970) | i1452)) * (-406)) + (((~(currentTimeMillis272 | (-1943440359))) | (~(i1452 | 914300527))) * 406)) & ((int) j192));
                                    java.lang.Object[] objArr732 = new java.lang.Object[1];
                                    c("薬偀ꣂ拾냆瞠急ꘚ贲ὗ엀ˁ傰ꘌ碬\udaf7责夢", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 16, objArr732);
                                    java.lang.Object[] objArr742 = {(java.lang.String) objArr732[0]};
                                    obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj4 == null) {
                                    }
                                    long longValue82 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr742)).longValue();
                                    long j202 = ~((int) java.lang.System.currentTimeMillis());
                                    long j212 = (-654321436) | j202;
                                    long j222 = ~longValue82;
                                    str3 = str;
                                    long j232 = (53 * longValue82) + 33370393236L + ((~(j212 | longValue82)) * 52) + (((~(j222 | j202)) | (~(j222 | (-654321436))) | (~j212)) * (-52)) + (((~(longValue82 | 654321435)) | (~(654321435 | j202))) * 52) + 1944861503;
                                    int currentTimeMillis282 = (int) java.lang.System.currentTimeMillis();
                                    int i1462 = ~((-794556781) | currentTimeMillis282);
                                    int i1472 = ((int) (j232 >> 32)) & ((((((~(794556780 | currentTimeMillis282)) | (-2147219949)) | (~(2063184104 | currentTimeMillis282))) * (-880)) - 818885110) + (((~((~currentTimeMillis282) | 794556780)) | (-2063184105) | i1462) * (-880)) + (i1462 * 880));
                                    int currentTimeMillis292 = (int) java.lang.System.currentTimeMillis();
                                    int i1482 = ((int) j232) & (((((~((-1163162066) | r7)) | (~(1694578820 | currentTimeMillis292))) * com.visa.cbp.getCertUsage.getODAData) - 569105799) + (((~(currentTimeMillis292 | (-1163162066))) | (~((~currentTimeMillis292) | 1694578820))) * com.visa.cbp.getCertUsage.getODAData));
                                    long j242 = (i1482 ^ i1472) | (i1472 & i1482);
                                    if (j <= 0) {
                                    }
                                    int i1502 = -android.text.TextUtils.indexOf(str3, str3);
                                    java.lang.Object[] objArr792 = new java.lang.Object[1];
                                    c("엀ˁᆫำ隉\ufbc3ꚉ\uf38a急ꘚ⾌銨\uef9a䩗\uf624ꡫ웼∕皶힢ѷ⮊벢芧", (i1502 ^ 23) + ((i1502 & 23) << 1), objArr792);
                                    java.lang.Object[] objArr802 = {(java.lang.String) objArr792[0]};
                                    obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj5 == null) {
                                    }
                                    long longValue92 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr802)).longValue();
                                    int currentTimeMillis312 = (int) java.lang.System.currentTimeMillis();
                                    long j252 = ~longValue92;
                                    long j262 = ~(currentTimeMillis312 | longValue92);
                                    long j272 = ((-195) * longValue92) + 94954134168L + (((~((-242849448) | j252)) | j262) * (-196)) + ((longValue92 | (-242849448)) * 392) + (((~(242849447 | j252)) | j262) * 196) + 1533389515;
                                    int currentTimeMillis322 = (int) java.lang.System.currentTimeMillis();
                                    int i1512 = ((int) (j272 >> 32)) & (((((~(1419240638 | r5)) | 16781376) * (-108)) - 545675446) + (((~((~currentTimeMillis322) | 17985772)) | (~((-17985773) | currentTimeMillis322)) | 1418036242) * 54) + ((currentTimeMillis322 | 1418036242) * 54));
                                    int i1522 = ((int) j272) & (((((~((-1767379498) | r5)) | (-1090361389)) * (-983)) - 1594552786) + (((~((~((int) java.lang.System.currentTimeMillis())) | (-1090361389))) | 10848260) * 983));
                                    j2 = (i1512 ^ i1522) | (i1512 & i1522);
                                    int i1532 = -android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                    int i1542 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                    java.lang.Object[] objArr822 = new java.lang.Object[1];
                                    b((i1532 & 204) + (i1532 | 204), (i1542 & 4) + (i1542 | 4), "\n\tￔ\u001b", true, 2 - (~(-android.text.TextUtils.indexOf(str3, str3, 0))), objArr822);
                                    java.lang.Object[] objArr832 = {(java.lang.String) objArr822[0]};
                                    obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj6 == null) {
                                    }
                                    long longValue102 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr832)).longValue();
                                    int currentTimeMillis332 = (int) java.lang.System.currentTimeMillis();
                                    long j282 = ~longValue102;
                                    long j292 = currentTimeMillis332;
                                    long j302 = ~j292;
                                    long j312 = ((-209) * longValue102) + 92871776503L + ((~(j282 | 444362566)) * 210) + (((~(j282 | j302)) | (~(j292 | 444362566))) * 210) + (((~(j302 | 444362566 | longValue102)) | (~(j282 | (-444362567) | j292))) * 210) + 1734902634;
                                    int i1552 = ((int) (j312 >> 32)) & (((((~(1343097931 | r5)) | 1514642953) * (-983)) - 537842485) + (((~((~((int) java.lang.System.currentTimeMillis())) | 1514642953)) | 524354) * 983));
                                    int currentTimeMillis342 = (int) java.lang.System.currentTimeMillis();
                                    int i1562 = ((int) j312) & (((((~(1883512581 | r5)) | (~((-446286172) | currentTimeMillis342))) * (-370)) - 635053777) + (((~(currentTimeMillis342 | 1883512581)) | (~((~currentTimeMillis342) | (-446286172))) | 1615074820) * (-370)) + 577229256);
                                    long j322 = (i1562 ^ i1552) | (i1552 & i1562);
                                    if (j2 > 0) {
                                    }
                                    int i1612 = (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                    int alpha3 = android.graphics.Color.alpha(0);
                                    int i1622 = -android.text.TextUtils.indexOf(str3, str3, 0, 0);
                                    java.lang.Object[] objArr882 = new java.lang.Object[1];
                                    b((i1612 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) + ((i1612 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) << 1), alpha3 + 7, "\r\f\u0012\f\uffc8\u0006\ufffe", true, (i1622 ^ 5) + ((i1622 & 5) << 1), objArr882);
                                    java.lang.String str342 = (java.lang.String) objArr882[0];
                                    int i1632 = -(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                                    int normalizeMetaState2 = android.view.KeyEvent.normalizeMetaState(0);
                                    java.lang.Object[] objArr892 = new java.lang.Object[1];
                                    b((i1632 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE) + ((i1632 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE) << 1), ((normalizeMetaState2 | 11) << 1) - (normalizeMetaState2 ^ 11), "\u0011\u0017\u0011ￍ\f\u0007\u0000ￍ\u000b\u0003\u0012", true, 16777219 - (~android.graphics.Color.rgb(0, 0, 0)), objArr892);
                                    java.lang.String str352 = (java.lang.String) objArr892[0];
                                    int i1642 = -(-android.view.Gravity.getAbsoluteGravity(0, 0));
                                    java.lang.Object[] objArr902 = new java.lang.Object[1];
                                    b(((i1642 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE) << 1) - (i1642 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE), android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 13, "\u0010\u0016\u0010ￌ\u000b\u0006\uffff\u0010ￌ\n\u0002\u0011", true, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 4, objArr902);
                                    java.lang.String str362 = (java.lang.String) objArr902[0];
                                    int maxKeyCode2 = android.view.KeyEvent.getMaxKeyCode() >> 16;
                                    int currentTimeMillis352 = (int) java.lang.System.currentTimeMillis();
                                    int i1652 = maxKeyCode2 * (-167);
                                    int i1662 = ~((~maxKeyCode2) | (-215));
                                    int i1672 = ~((currentTimeMillis352 & (-215)) | (currentTimeMillis352 ^ (-215)));
                                    int i1682 = ((((-35738) | i1652) << 1) - (i1652 ^ (-35738))) + (((i1662 & i1672) | (i1662 ^ i1672)) * 336);
                                    int i1692 = ~(maxKeyCode2 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PIN_VALUE);
                                    int i1702 = ~(maxKeyCode2 | currentTimeMillis352);
                                    int i1712 = ((i1692 ^ i1702) | (i1692 & i1702)) * (-168);
                                    int i1722 = ~currentTimeMillis352;
                                    int i1732 = ~((maxKeyCode2 ^ i1722) | (maxKeyCode2 & i1722));
                                    int i1742 = -android.graphics.Color.rgb(0, 0, 0);
                                    int i1752 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                    java.lang.Object[] objArr912 = new java.lang.Object[1];
                                    b((((i1682 | i1712) << 1) - (i1712 ^ i1682)) + (((i1732 ^ (-215)) | (i1732 & (-215))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE), ((-16777204) & i1742) + (i1742 | (-16777204)), "\u0001\u0010\u000f\u0015\u000fￋ\n\u0005\ufffe\u0014ￋ\t", true, (i1752 & 6) + (i1752 | 6), objArr912);
                                    java.lang.String str372 = (java.lang.String) objArr912[0];
                                    int i1762 = (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                    int currentTimeMillis362 = (int) java.lang.System.currentTimeMillis();
                                    int i1772 = (i1762 * 829) + 8290;
                                    int i1782 = ~i1762;
                                    int i1792 = ~currentTimeMillis362;
                                    int i1802 = i1792 | i1762;
                                    int i1812 = ((~((i1782 ^ (-11)) | (i1782 & (-11)))) | (~((i1802 ^ 10) | (i1802 & 10)))) * (-828);
                                    int i1822 = i1762 | 10;
                                    int i1832 = (i1772 ^ i1812) + ((i1772 & i1812) << 1) + (((i1792 ^ i1822) | (i1792 & i1822)) * (-828));
                                    int i1842 = -(-((~i1822) * 828));
                                    java.lang.Object[] objArr922 = new java.lang.Object[1];
                                    c("嶌\uf246웼∕Ẋ糥⢩蹶િ潳缡좧", (i1832 ^ i1842) + ((i1842 & i1832) << 1), objArr922);
                                    java.lang.String str382 = (java.lang.String) objArr922[0];
                                    int alpha22 = android.graphics.Color.alpha(0);
                                    int i1852 = -android.graphics.ImageFormat.getBitsPerPixel(0);
                                    java.lang.Object[] objArr932 = new java.lang.Object[1];
                                    b(alpha22 + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE, (i1852 ^ 4) + ((i1852 & 4) << 1), "\u0014\u0003\n\u000f\uffd0", false, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4, objArr932);
                                    java.lang.String str392 = (java.lang.String) objArr932[0];
                                    java.lang.Object[] objArr942 = new java.lang.Object[1];
                                    c("\ue204阽\u0b79䘟", 3 - (~(-(-android.view.View.resolveSize(0, 0)))), objArr942);
                                    strArr = new java.lang.String[]{str342, str352, str362, str372, str382, str392, (java.lang.String) objArr942[0]};
                                    i = 0;
                                    while (true) {
                                        if (i < 7) {
                                        }
                                        i = ((i & 2) + (i | 2)) - 1;
                                        strArr = strArr2;
                                    }
                                    if (i2 == 0) {
                                    }
                                }
                            }
                        }
                        if (invoke4 != null) {
                            java.lang.Object[] objArr190 = {invoke4, 42};
                            java.lang.Object obj55 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj55 == null) {
                                java.lang.Class cls53 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 28, 2593 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))));
                                byte b71 = $$a[14];
                                short s35 = (short) (b71 - 1);
                                byte b72 = b71;
                                java.lang.Object[] objArr191 = new java.lang.Object[1];
                                a(s35, b72, (byte) (b72 - 1), objArr191);
                                obj55 = cls53.getMethod((java.lang.String) objArr191[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj55);
                            }
                            long longValue26 = ((java.lang.Long) ((java.lang.reflect.Method) obj55).invoke(null, objArr190)).longValue();
                            int currentTimeMillis91 = (int) java.lang.System.currentTimeMillis();
                            long j77 = ~longValue26;
                            long j78 = currentTimeMillis91;
                            long j79 = ~j78;
                            long j80 = ~(j77 | 1002173048);
                            obj7 = invoke4;
                            str4 = "";
                            long j81 = (longValue26 * (-463)) + 466010467320L + (((~(j77 | j79)) | j80 | (~(j79 | 1002173048))) * 464) + (((-1002173049) | j78 | j77) * (-464)) + (((~(1002173048 | j78)) | j80) * 464) + 254927476;
                            int currentTimeMillis92 = (int) java.lang.System.currentTimeMillis();
                            int i350 = ((int) (j81 >> 32)) & ((((~((-178653954) | currentTimeMillis92)) | 1615880364) * (-756)) + 895505282 + (((~currentTimeMillis92) | (-178653954)) * 756));
                            int i351 = (int) j81;
                            int currentTimeMillis93 = (int) java.lang.System.currentTimeMillis();
                            int i353 = i351 & (((1448454830 | currentTimeMillis93) * 376) + 2088992125 + (((~((~currentTimeMillis93) | 685226642)) | 1442840620) * (-376)) + (((~(currentTimeMillis93 | (-685226643))) | (-2122453053)) * 376));
                        } else {
                            obj7 = invoke4;
                            str4 = "";
                        }
                        if (invoke3 != null) {
                            java.lang.Object[] objArr192 = {invoke3, 42};
                            java.lang.Object obj56 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj56 == null) {
                                java.lang.Class cls54 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 2595 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) android.graphics.Color.blue(0));
                                byte b73 = $$a[14];
                                short s36 = (short) (b73 - 1);
                                byte b74 = b73;
                                java.lang.Object[] objArr193 = new java.lang.Object[1];
                                a(s36, b74, (byte) (b74 - 1), objArr193);
                                obj56 = cls54.getMethod((java.lang.String) objArr193[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj56);
                            }
                            long longValue27 = ((java.lang.Long) ((java.lang.reflect.Method) obj56).invoke(null, objArr192)).longValue();
                            int currentTimeMillis94 = (int) java.lang.System.currentTimeMillis();
                            long j82 = ~longValue27;
                            long j83 = currentTimeMillis94;
                            long j84 = ~j83;
                            long j85 = ((-317) * longValue27) + 214628720933L + (((~((-672817308) | j83)) | j82) * (-318)) + (((~(j84 | 672817307 | longValue27)) | (~(j82 | j83))) * 318) + (((~(longValue27 | 672817307 | j83)) | (~(j82 | j84 | 672817307))) * 318) + 584283217;
                            int i354 = ((int) (j85 >> 32)) & (((((~(1363857966 | r3)) | (-1493882919)) * (-366)) - 1398380936) + (((~(((int) java.lang.System.currentTimeMillis()) | (-134219777))) | 4194824) * 366));
                            int currentTimeMillis95 = (int) java.lang.System.currentTimeMillis();
                            int i355 = ~currentTimeMillis95;
                            int i356 = ((int) j85) & ((((((~(i355 | 1008649808)) | 25233673) | (~((-428576602) | i355))) * (-397)) - 1225889195) + ((currentTimeMillis95 | 630540553) * 397));
                        }
                        if (obj7 != null) {
                            java.lang.Object[] objArr194 = {obj7, 42};
                            java.lang.Object obj57 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj57 == null) {
                                str = str4;
                                java.lang.Class cls55 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 2594 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                                byte b75 = $$a[14];
                                short s37 = (short) (b75 - 1);
                                byte b76 = b75;
                                java.lang.Object[] objArr195 = new java.lang.Object[1];
                                a(s37, b76, (byte) (b76 - 1), objArr195);
                                obj57 = cls55.getMethod((java.lang.String) objArr195[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj57);
                            } else {
                                str = str4;
                            }
                            long longValue28 = ((java.lang.Long) ((java.lang.reflect.Method) obj57).invoke(null, objArr194)).longValue();
                            long currentTimeMillis96 = (int) java.lang.System.currentTimeMillis();
                            long j86 = ((434 * longValue28) - 135919912896L) + ((~((-314629429) | (~currentTimeMillis96) | longValue28)) * 433) + (((~((~longValue28) | currentTimeMillis96)) | (-314629429)) * (-433)) + (((~(longValue28 | 314629428)) | (~(currentTimeMillis96 | (-314629429)))) * 433) + 942471096;
                            int currentTimeMillis97 = (int) java.lang.System.currentTimeMillis();
                            int i357 = ~currentTimeMillis97;
                            int i358 = ((int) (j86 >> 32)) & (((((-337752162) | i357) * (-369)) - 802173004) + (((~(337901809 | i357)) | 1775128220) * (-369)) + (((~(currentTimeMillis97 | (-337901810))) | 149648 | (~(i357 | 2112880381))) * 369));
                            int currentTimeMillis98 = (int) java.lang.System.currentTimeMillis();
                            int i359 = ((int) j86) & ((((-1235584422) | currentTimeMillis98) * 376) + 2088992125 + (((~((~currentTimeMillis98) | (-1317431300))) | 100820994) * (-376)) + (((~(currentTimeMillis98 | 1317431299)) | (-119795111)) * 376));
                        } else {
                            str = str4;
                        }
                        int i30102 = (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        java.lang.Object[] objArr2722 = new java.lang.Object[1];
                        c("鎮レ奒☤徨뭘ᆫำ", (i30102 & 7) + (i30102 | 7), objArr2722);
                        java.lang.String str622 = (java.lang.String) objArr2722[0];
                        int i31102 = -(-android.view.Gravity.getAbsoluteGravity(0, 0));
                        int i32102 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        java.lang.Object[] objArr2822 = new java.lang.Object[1];
                        b(((i31102 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) << 1) - (i31102 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE), ((i32102 | 6) << 1) - (i32102 ^ 6), "�\ufff7\b\u0006\uffff\u0004", false, -android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr2822);
                        java.lang.String str722 = (java.lang.String) objArr2822[0];
                        int capsMode42 = android.text.TextUtils.getCapsMode(str, 0, 0);
                        int currentTimeMillis1322 = (int) java.lang.System.currentTimeMillis();
                        int i33102 = capsMode42 * 615;
                        int i3492 = ((-136086) ^ i33102) + ((i33102 & (-136086)) << 1);
                        int i3522 = ~capsMode42;
                        int i3622 = ~((i3522 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE) | (i3522 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE));
                        int i3722 = (i3622 & currentTimeMillis1322) | (currentTimeMillis1322 ^ i3622);
                        int i3822 = ~((capsMode42 ^ (-223)) | (capsMode42 & (-223)));
                        int i3922 = ((i3722 ^ i3822) | (i3722 & i3822)) * 614;
                        int i4022 = ~currentTimeMillis1322;
                        int i4122 = ~((i3522 ^ i4022) | (i3522 & i4022));
                        int i4222 = (i3622 ^ i4122) | (i4122 & i3622);
                        int i4322 = ~((i4022 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE) | (i4022 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE));
                        int i4422 = -(-(((i4222 ^ i4322) | (i4322 & i4222)) * (-1228)));
                        int i4522 = (i3522 & (-223)) | (i3522 ^ (-223));
                        int i4622 = (capsMode42 ^ i4022) | (capsMode42 & i4022);
                        int gidForName22 = android.os.Process.getGidForName(str);
                        int i4722 = -android.text.TextUtils.getOffsetAfter(str, 0);
                        java.lang.Object[] objArr2922 = new java.lang.Object[1];
                        b((((((i3492 ^ i3922) + ((i3492 & i3922) << 1)) - (~i4422)) - 1) - (~(((~((i4022 ^ i4522) | (i4522 & i4022))) | (~((i4622 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE) | (i4622 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE)))) * 614))) - 1, ((gidForName22 | 8) << 1) - (gidForName22 ^ 8), "\u0007\ufff9\u0006\ufff8\ufff8\u0001\t", false, ((i4722 | 4) << 1) - (i4722 ^ 4), objArr2922);
                        java.lang.String str822 = (java.lang.String) objArr2922[0];
                        int i4822 = -android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                        int i4922 = -(-(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        java.lang.Object[] objArr3022 = new java.lang.Object[1];
                        b(219 - (~i4822), ((i4922 | 8) << 1) - (i4922 ^ 8), "\u000b\ufffa\u0007￼\ufff9\ufff7\b\ufffa\u0007", false, android.text.TextUtils.getOffsetAfter(str, 0) + 3, objArr3022);
                        java.lang.String str922 = (java.lang.String) objArr3022[0];
                        int i5022 = -(-android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                        java.lang.Object[] objArr3122 = new java.lang.Object[1];
                        c("䭤љ⺑\uee39⾌銨", ((i5022 | 6) << 1) - (i5022 ^ 6), objArr3122);
                        java.lang.String str1022 = (java.lang.String) objArr3122[0];
                        int capsMode222 = android.text.TextUtils.getCapsMode(str, 0, 0);
                        java.lang.Object[] objArr3222 = new java.lang.Object[1];
                        c("뮭竚揄丣ꭓ\uaada\uea49뜉㬪矇돫䶫짴謍", (capsMode222 ^ 13) + ((capsMode222 & 13) << 1), objArr3222);
                        java.lang.String str1122 = (java.lang.String) objArr3222[0];
                        int i5122 = -android.widget.ExpandableListView.getPackedPositionType(0L);
                        java.lang.Object[] objArr3322 = new java.lang.Object[1];
                        c("酙澢撼ꌺ峓ꆰ", (i5122 ^ 5) + ((i5122 & 5) << 1), objArr3322);
                        java.lang.String str1222 = (java.lang.String) objArr3322[0];
                        int i5222 = -android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                        int currentTimeMillis1422 = (int) java.lang.System.currentTimeMillis();
                        int i5322 = i5222 * 306;
                        int i5422 = (i5322 & androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS) + (i5322 | androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS);
                        int i5522 = ~((i5222 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) | (i5222 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                        int i5622 = ~((i5222 ^ currentTimeMillis1422) | (i5222 & currentTimeMillis1422));
                        int i5722 = ~(i5222 | (~currentTimeMillis1422));
                        int i5822 = -android.view.Gravity.getAbsoluteGravity(0, 0);
                        int size22 = android.view.View.MeasureSpec.getSize(0);
                        java.lang.Object[] objArr3422 = new java.lang.Object[1];
                        b((((64260 | i5422) << 1) - (64260 ^ i5422)) + (((i5522 & i5622) | (i5522 ^ i5622)) * 305) + (((i5722 ^ (-211)) | (i5722 & (-211))) * 305), ((i5822 | 6) << 1) - (i5822 ^ 6), "\u0005ￒ\b\u000f\u0004\u0011", false, (size22 ^ 2) + ((size22 & 2) << 1), objArr3422);
                        java.lang.String str1322 = (java.lang.String) objArr3422[0];
                        java.lang.Object[] objArr3522 = new java.lang.Object[1];
                        c("쓳ᨆ", android.view.View.getDefaultSize(0, 0) + 2, objArr3522);
                        java.lang.String str1422 = (java.lang.String) objArr3522[0];
                        java.lang.Object[] objArr3622 = new java.lang.Object[1];
                        c("趌먼嘕㈗ﳘ\uf0ecꇚ쉹姱獶个吽傰ꘌ왷\ue9f9", 15 - (~(-(-(android.view.ViewConfiguration.getLongPressTimeout() >> 16)))), objArr3622);
                        java.lang.String str1522 = (java.lang.String) objArr3622[0];
                        float length22 = android.graphics.PointF.length(0.0f, 0.0f);
                        int i5922 = -android.graphics.Color.argb(0, 0, 0, 0);
                        int scrollBarSize222 = android.view.ViewConfiguration.getScrollBarSize() >> 8;
                        java.lang.Object[] objArr3722 = new java.lang.Object[1];
                        b(213 - (length22 > 0.0f ? 1 : (length22 == 0.0f ? 0 : -1)), (i5922 ^ 10) + ((i5922 & 10) << 1), "\u0004\u0011\ufffe\u0004\u0001ￋ\u000f\u0000\t\f", false, (scrollBarSize222 ^ 8) + ((scrollBarSize222 & 8) << 1), objArr3722);
                        java.lang.String str1622 = (java.lang.String) objArr3722[0];
                        int i6022 = (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int i6122 = -android.text.TextUtils.indexOf(str, str, 0, 0);
                        int i6222 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int currentTimeMillis1522 = (int) java.lang.System.currentTimeMillis();
                        int i6322 = 609 - (~(-(-(i6222 * 306))));
                        int i6422 = ~(i6222 | 7);
                        int i6522 = ~(i6222 | currentTimeMillis1522);
                        int i6622 = ~currentTimeMillis1522;
                        int i6722 = ~((i6222 ^ i6622) | (i6222 & i6622));
                        java.lang.Object[] objArr3822 = new java.lang.Object[1];
                        b(((i6022 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE) << 1) - (i6022 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE), (i6122 & 8) + (i6122 | 8), "\u0003\ufff7\u0006\ufff5\u0002\uffff\u0004\u0006", false, (i6322 ^ 2142) + ((i6322 & 2142) << 1) + (((i6422 & i6522) | (i6422 ^ i6522)) * 305) + (((i6722 ^ (-8)) | (i6722 & (-8))) * 305), objArr3822);
                        java.lang.String str1722 = (java.lang.String) objArr3822[0];
                        int i6822 = -android.view.KeyEvent.getDeadChar(0, 0);
                        int lastIndexOf42 = android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                        int i6922 = -((android.os.Process.getThreadPriority(0) + 20) >> 6);
                        java.lang.Object[] objArr3922 = new java.lang.Object[1];
                        b(((i6822 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) << 1) - (i6822 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE), (lastIndexOf42 & 13) + (lastIndexOf42 | 13), "\ufff9\u0005\u0002\u0002\ufffb\ufff9\n\ufffa\u0006\b\u0005￼", false, (i6922 & 8) + (i6922 | 8), objArr3922);
                        java.lang.String str1822 = (java.lang.String) objArr3922[0];
                        int i7022 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        java.lang.Object[] objArr4022 = new java.lang.Object[1];
                        c("㲍䅪弫\ue103ӊ趖䫻ƫ\ue81b䮲\u0b79䘟놥ힶ", (i7022 ^ 14) + ((i7022 & 14) << 1), objArr4022);
                        java.lang.String str1922 = (java.lang.String) objArr4022[0];
                        java.lang.Object[] objArr4122 = new java.lang.Object[1];
                        c("\u0c76\u19db\ue43c窶蛈샺邴鰼", 6 - (~(-(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))), objArr4122);
                        java.lang.String str2022 = (java.lang.String) objArr4122[0];
                        int i7122 = -(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        java.lang.Object[] objArr4222 = new java.lang.Object[1];
                        c("던櫥긭늙覍䬆峓ꆰ", ((i7122 | 6) << 1) - (i7122 ^ 6), objArr4222);
                        java.lang.String str2122 = (java.lang.String) objArr4222[0];
                        java.lang.Object[] objArr4322 = new java.lang.Object[1];
                        c("噵ⷿ⾌銨侷亶鸿豰", 7 - (~(-(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))), objArr4322);
                        java.lang.String str2222 = (java.lang.String) objArr4322[0];
                        long zoomControlsTimeout22 = android.view.ViewConfiguration.getZoomControlsTimeout();
                        int i7222 = -(-android.view.View.getDefaultSize(0, 0));
                        java.lang.Object[] objArr4422 = new java.lang.Object[1];
                        b(227 - (~(zoomControlsTimeout22 > 0L ? 1 : (zoomControlsTimeout22 == 0L ? 0 : -1))), ((i7222 | 2) << 1) - (i7222 ^ 2), "\u0000\u0000", false, 2 - (~android.view.MotionEvent.axisFromString(str)), objArr4422);
                        java.lang.String str2322 = (java.lang.String) objArr4422[0];
                        java.lang.Object[] objArr4522 = new java.lang.Object[1];
                        c("姱獶栉ໄ홻幕䰟ᶣ㫰珓⮋칭⌫阫㛿у\ue880唻뙾㥂", 19 - (~(-android.view.View.combineMeasuredStates(0, 0))), objArr4522);
                        java.lang.String str2422 = (java.lang.String) objArr4522[0];
                        java.lang.Object[] objArr4622 = new java.lang.Object[1];
                        c("姱獶涹仨ꃓꌅ", android.widget.ExpandableListView.getPackedPositionType(0L) + 6, objArr4622);
                        java.lang.String str2522 = (java.lang.String) objArr4622[0];
                        int i7322 = -android.view.View.combineMeasuredStates(0, 0);
                        int currentTimeMillis1622 = (int) java.lang.System.currentTimeMillis();
                        int i7422 = i7322 * 371;
                        int i7522 = ~currentTimeMillis1622;
                        int i7622 = ~(i7522 | (-231));
                        int i7722 = ~i7322;
                        int i7822 = ~(i7722 | currentTimeMillis1622);
                        int i7922 = (((((85330 | i7422) << 1) - (i7422 ^ 85330)) + (((i7622 & i7822) | (i7622 ^ i7822)) * (-370))) - (~((((~((currentTimeMillis1622 ^ (-231)) | (currentTimeMillis1622 & (-231)))) | (~((i7522 & i7722) | (i7522 ^ i7722)))) | (~((i7322 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE) | (i7322 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE)))) * (-370)))) - 1;
                        int i8022 = (~(i7322 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE)) * com.knotapi.knot.utilities.Constants.ID_KROGER;
                        java.lang.Object[] objArr4722 = new java.lang.Object[1];
                        b((i7922 & i8022) + (i8022 | i7922), android.graphics.Color.alpha(0) + 2, "\uffff\u0001", false, 2 - (~(-(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))), objArr4722);
                        java.lang.String str2622 = (java.lang.String) objArr4722[0];
                        int i8122 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                        int i8222 = -(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int i8322 = -(-(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                        java.lang.Object[] objArr4822 = new java.lang.Object[1];
                        b((i8122 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE) + ((i8122 & com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE) << 1), ((i8222 | 16) << 1) - (i8222 ^ 16), "\n\u000b\t\t\ufff7\u0004\uffff\n\uffff\u0010\ufffb\bￃ\t\n\ufff7", false, ((i8322 | 3) << 1) - (i8322 ^ 3), objArr4822);
                        java.lang.String str2722 = (java.lang.String) objArr4822[0];
                        int i8422 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int currentTimeMillis1722 = (int) java.lang.System.currentTimeMillis();
                        int i8522 = i8422 * (-830);
                        int i8622 = ~currentTimeMillis1722;
                        int i8722 = ~((i8622 ^ (-222)) | (i8622 & (-222)));
                        int i8822 = (i8422 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE) | (i8422 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE);
                        int i8922 = ~((i8822 ^ currentTimeMillis1722) | (i8822 & currentTimeMillis1722));
                        int i9022 = (i8422 ^ (-222)) | (i8422 & (-222));
                        int i9122 = ~i8422;
                        int i9222 = ~((i8622 ^ i9122) | (i8622 & i9122));
                        int i9322 = ~((i8422 ^ currentTimeMillis1722) | (i8422 & currentTimeMillis1722));
                        int i9422 = (i9322 ^ i9222) | (i9322 & i9222);
                        int i9522 = ~((currentTimeMillis1722 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE) | (currentTimeMillis1722 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE));
                        int i9622 = -(-(((i9422 ^ i9522) | (i9422 & i9522)) * 831));
                        int i9722 = -android.graphics.Color.argb(0, 0, 0, 0);
                        int currentTimeMillis1822 = (int) java.lang.System.currentTimeMillis();
                        int i9822 = i9722 * 71;
                        int i9922 = (i9822 ^ (-621)) + ((i9822 & (-621)) << 1);
                        int i10022 = ~i9722;
                        int i10122 = ~((i10022 & 9) | (i10022 ^ 9));
                        int i10222 = ~((currentTimeMillis1822 ^ 9) | (currentTimeMillis1822 & 9));
                        int i10322 = -(-(((i10122 & i10222) | (i10122 ^ i10222)) * (-140)));
                        int i10422 = (i9922 & i10322) + (i10322 | i9922);
                        int i10522 = (~(i9722 | 9 | currentTimeMillis1822)) * 70;
                        int i10622 = (i10422 & i10522) + (i10522 | i10422);
                        int i10722 = ~(i10022 | 9);
                        int i10822 = ~((i9722 ^ (-10)) | (i9722 & (-10)));
                        int i10922 = (i10722 ^ i10822) | (i10722 & i10822);
                        int i11022 = ~((i9722 & currentTimeMillis1822) | (i9722 ^ currentTimeMillis1822));
                        int i11122 = ((i10922 ^ i11022) | (i11022 & i10922)) * 70;
                        java.lang.Object[] objArr4922 = new java.lang.Object[1];
                        b(((((((183872 & i8522) + (i8522 | 183872)) + (((i8722 & i8922) | (i8722 ^ i8922)) * (-831))) - (~((~((currentTimeMillis1722 ^ i9022) | (i9022 & currentTimeMillis1722))) * (-1662)))) - 1) - (~i9622)) - 1, (i10622 ^ i11122) + ((i11122 & i10622) << 1), "\b\ufff7\ufff9\ufffb\u0006\ufff7\n\ufffe\n", false, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 8, objArr4922);
                        java.lang.String str2822 = (java.lang.String) objArr4922[0];
                        java.lang.Object[] objArr5022 = new java.lang.Object[1];
                        c("\udc11᥊ṭ䨽\uefc9\ufddb㤋\ueec4ﻵ莕", android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 10, objArr5022);
                        java.lang.String str2922 = (java.lang.String) objArr5022[0];
                        int capsMode322 = android.text.TextUtils.getCapsMode(str, 0, 0);
                        int i11222 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                        java.lang.Object[] objArr5122 = new java.lang.Object[1];
                        b(217 - capsMode322, ((i11222 | 59) << 1) - (i11222 ^ 59), "\ufffa\u000b\rￏ\ufffe\r\u000e\b\u000b\ufffe￼", true, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 3, objArr5122);
                        java.lang.String str3022 = (java.lang.String) objArr5122[0];
                        int red32 = android.graphics.Color.red(0);
                        int i11322 = -(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        int i11422 = -(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        java.lang.Object[] objArr5222 = new java.lang.Object[1];
                        b((red32 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE) + ((red32 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE) << 1), ((i11322 | 11) << 1) - (i11322 ^ 11), "\ufff9\ufff4\ufffe\u0003\ufffb\u0004\n\u0003\f\ufffe\u0003", false, ((i11422 | 6) << 1) - (i11422 ^ 6), objArr5222);
                        java.lang.String str3122 = (java.lang.String) objArr5222[0];
                        int lastIndexOf222 = android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                        java.lang.Object[] objArr5322 = new java.lang.Object[1];
                        c("蛈샺䰟ᶣ뙥涪씿弥⸏魲律꧟\uffef蚈굩\udcfd", (lastIndexOf222 ^ 16) + ((lastIndexOf222 & 16) << 1), objArr5322);
                        java.lang.String str3222 = (java.lang.String) objArr5322[0];
                        int i11522 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
                        java.lang.Object[] objArr5422 = new java.lang.Object[1];
                        c("蛈샺䰟ᶣ뙥涪꯳씹\uf48f뢣鼆㸹㮅鹯", (i11522 & 14) + (i11522 | 14), objArr5422);
                        java.lang.String[] strArr422 = {str622, str722, str822, str922, str1022, str1122, str1222, str1322, str1422, str1522, str1622, str1722, str1822, str1922, str2022, str2122, str2222, str2322, str2422, str2522, str2622, str2722, str2822, str2922, str3022, str3122, str3222, (java.lang.String) objArr5422[0]};
                        int i11622 = (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int currentTimeMillis1922 = (int) java.lang.System.currentTimeMillis();
                        int i11722 = i11622 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE;
                        int i11822 = ~i11622;
                        int i11922 = (i11822 ^ (-216)) | (i11822 & (-216));
                        int i12022 = ~currentTimeMillis1922;
                        int i12122 = (i11622 ^ 215) | (i11622 & 215);
                        int i12222 = ((-58265) ^ i11722) + ((i11722 & (-58265)) << 1) + (((~((i11922 & i12022) | (i11922 ^ i12022))) | (~((i12122 & currentTimeMillis1922) | (i12122 ^ currentTimeMillis1922)))) * (-272));
                        int i12322 = ~((i11822 ^ 215) | (i11822 & 215));
                        int i12422 = ~(i11822 | currentTimeMillis1922);
                        int i12522 = ((i12322 ^ i12422) | (i12422 & i12322)) * (-272);
                        int i12622 = ~((i11622 ^ currentTimeMillis1922) | (i11622 & currentTimeMillis1922));
                        int threadPriority22 = android.os.Process.getThreadPriority(0);
                        int i12722 = -(-((((threadPriority22 | 20) << 1) - (threadPriority22 ^ 20)) >> 6));
                        int tapTimeout22 = android.view.ViewConfiguration.getTapTimeout() >> 16;
                        int currentTimeMillis2022 = (int) java.lang.System.currentTimeMillis();
                        int i12822 = (tapTimeout22 * (-445)) - 890;
                        int i12922 = ~tapTimeout22;
                        int i13022 = ~(i12922 | (-3));
                        int i13122 = ~((~currentTimeMillis2022) | (-3));
                        int i13222 = -(-(((i13022 & i13122) | (i13022 ^ i13122)) * 446));
                        int i13322 = tapTimeout22 | (-3);
                        java.lang.Object[] objArr5522 = new java.lang.Object[1];
                        b((i12222 ^ i12522) + ((i12522 & i12222) << 1) + (((i12622 ^ 215) | (i12622 & 215)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE), 10 - (~i12722), "\r\u0000\r\n\uffc9\u0003￼\r\uffff\u0012￼", false, (i12822 & i13222) + (i12822 | i13222) + (((~((currentTimeMillis2022 & i13322) | (i13322 ^ currentTimeMillis2022))) | (~((i12922 ^ 2) | (i12922 & 2)))) * 446) + ((~((i12922 & (-3)) | (i12922 ^ (-3)))) * 446), objArr5522);
                        java.lang.Object[] objArr5622 = {(java.lang.String) objArr5522[0]};
                        obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj2 == null) {
                        }
                        str2 = (java.lang.String) ((java.lang.reflect.Method) obj2).invoke(null, objArr5622);
                        if (str2 != null) {
                        }
                        java.lang.Object[] objArr7022 = new java.lang.Object[1];
                        c("엀ˁᆫำ隉\ufbc3ꚉ\uf38a急ꘚ⾌銨\uef9a䩗\uf624ꡫ웼∕皶힢ѷ⮊벢芧", 23 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr7022);
                        java.lang.Object[] objArr7122 = {(java.lang.String) objArr7022[0]};
                        obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                        if (obj3 == null) {
                        }
                        long longValue722 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr7122)).longValue();
                        long j1822 = ~((int) java.lang.System.currentTimeMillis());
                        long j1922 = ((-159) * longValue722) + 100347958206L + ((631119233 | longValue722) * 160) + (((~(longValue722 | (-631119234))) | (~((-631119234) | j1822))) * (-160)) + (((~((~longValue722) | j1822)) | (-631119234)) * 160) + 1921659301;
                        int currentTimeMillis2622 = (int) java.lang.System.currentTimeMillis();
                        int currentTimeMillis2722 = (int) java.lang.System.currentTimeMillis();
                        int i14522 = ~currentTimeMillis2722;
                        j = (((int) (j1922 >> 32)) & (((((~((-1750334239) | currentTimeMillis2622)) | (-1107406647)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) - 1102859183) + (((~((~currentTimeMillis2622) | (-1750334239))) | 676483080) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE))) | (((((~((-914300528) | currentTimeMillis2722)) | (~(2013241327 | i14522))) * (-406)) + 1638797211 + ((~((-69800970) | i14522)) * (-406)) + (((~(currentTimeMillis2722 | (-1943440359))) | (~(i14522 | 914300527))) * 406)) & ((int) j1922));
                        java.lang.Object[] objArr7322 = new java.lang.Object[1];
                        c("薬偀ꣂ拾냆瞠急ꘚ贲ὗ엀ˁ傰ꘌ碬\udaf7责夢", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 16, objArr7322);
                        java.lang.Object[] objArr7422 = {(java.lang.String) objArr7322[0]};
                        obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                        if (obj4 == null) {
                        }
                        long longValue822 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr7422)).longValue();
                        long j2022 = ~((int) java.lang.System.currentTimeMillis());
                        long j2122 = (-654321436) | j2022;
                        long j2222 = ~longValue822;
                        str3 = str;
                        long j2322 = (53 * longValue822) + 33370393236L + ((~(j2122 | longValue822)) * 52) + (((~(j2222 | j2022)) | (~(j2222 | (-654321436))) | (~j2122)) * (-52)) + (((~(longValue822 | 654321435)) | (~(654321435 | j2022))) * 52) + 1944861503;
                        int currentTimeMillis2822 = (int) java.lang.System.currentTimeMillis();
                        int i14622 = ~((-794556781) | currentTimeMillis2822);
                        int i14722 = ((int) (j2322 >> 32)) & ((((((~(794556780 | currentTimeMillis2822)) | (-2147219949)) | (~(2063184104 | currentTimeMillis2822))) * (-880)) - 818885110) + (((~((~currentTimeMillis2822) | 794556780)) | (-2063184105) | i14622) * (-880)) + (i14622 * 880));
                        int currentTimeMillis2922 = (int) java.lang.System.currentTimeMillis();
                        int i14822 = ((int) j2322) & (((((~((-1163162066) | r7)) | (~(1694578820 | currentTimeMillis2922))) * com.visa.cbp.getCertUsage.getODAData) - 569105799) + (((~(currentTimeMillis2922 | (-1163162066))) | (~((~currentTimeMillis2922) | 1694578820))) * com.visa.cbp.getCertUsage.getODAData));
                        long j2422 = (i14822 ^ i14722) | (i14722 & i14822);
                        if (j <= 0) {
                        }
                        int i15022 = -android.text.TextUtils.indexOf(str3, str3);
                        java.lang.Object[] objArr7922 = new java.lang.Object[1];
                        c("엀ˁᆫำ隉\ufbc3ꚉ\uf38a急ꘚ⾌銨\uef9a䩗\uf624ꡫ웼∕皶힢ѷ⮊벢芧", (i15022 ^ 23) + ((i15022 & 23) << 1), objArr7922);
                        java.lang.Object[] objArr8022 = {(java.lang.String) objArr7922[0]};
                        obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                        if (obj5 == null) {
                        }
                        long longValue922 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8022)).longValue();
                        int currentTimeMillis3122 = (int) java.lang.System.currentTimeMillis();
                        long j2522 = ~longValue922;
                        long j2622 = ~(currentTimeMillis3122 | longValue922);
                        long j2722 = ((-195) * longValue922) + 94954134168L + (((~((-242849448) | j2522)) | j2622) * (-196)) + ((longValue922 | (-242849448)) * 392) + (((~(242849447 | j2522)) | j2622) * 196) + 1533389515;
                        int currentTimeMillis3222 = (int) java.lang.System.currentTimeMillis();
                        int i15122 = ((int) (j2722 >> 32)) & (((((~(1419240638 | r5)) | 16781376) * (-108)) - 545675446) + (((~((~currentTimeMillis3222) | 17985772)) | (~((-17985773) | currentTimeMillis3222)) | 1418036242) * 54) + ((currentTimeMillis3222 | 1418036242) * 54));
                        int i15222 = ((int) j2722) & (((((~((-1767379498) | r5)) | (-1090361389)) * (-983)) - 1594552786) + (((~((~((int) java.lang.System.currentTimeMillis())) | (-1090361389))) | 10848260) * 983));
                        j2 = (i15122 ^ i15222) | (i15122 & i15222);
                        int i15322 = -android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                        int i15422 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                        java.lang.Object[] objArr8222 = new java.lang.Object[1];
                        b((i15322 & 204) + (i15322 | 204), (i15422 & 4) + (i15422 | 4), "\n\tￔ\u001b", true, 2 - (~(-android.text.TextUtils.indexOf(str3, str3, 0))), objArr8222);
                        java.lang.Object[] objArr8322 = {(java.lang.String) objArr8222[0]};
                        obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                        if (obj6 == null) {
                        }
                        long longValue1022 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr8322)).longValue();
                        int currentTimeMillis3322 = (int) java.lang.System.currentTimeMillis();
                        long j2822 = ~longValue1022;
                        long j2922 = currentTimeMillis3322;
                        long j3022 = ~j2922;
                        long j3122 = ((-209) * longValue1022) + 92871776503L + ((~(j2822 | 444362566)) * 210) + (((~(j2822 | j3022)) | (~(j2922 | 444362566))) * 210) + (((~(j3022 | 444362566 | longValue1022)) | (~(j2822 | (-444362567) | j2922))) * 210) + 1734902634;
                        int i15522 = ((int) (j3122 >> 32)) & (((((~(1343097931 | r5)) | 1514642953) * (-983)) - 537842485) + (((~((~((int) java.lang.System.currentTimeMillis())) | 1514642953)) | 524354) * 983));
                        int currentTimeMillis3422 = (int) java.lang.System.currentTimeMillis();
                        int i15622 = ((int) j3122) & (((((~(1883512581 | r5)) | (~((-446286172) | currentTimeMillis3422))) * (-370)) - 635053777) + (((~(currentTimeMillis3422 | 1883512581)) | (~((~currentTimeMillis3422) | (-446286172))) | 1615074820) * (-370)) + 577229256);
                        long j3222 = (i15622 ^ i15522) | (i15522 & i15622);
                        if (j2 > 0) {
                        }
                        int i16122 = (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int alpha32 = android.graphics.Color.alpha(0);
                        int i16222 = -android.text.TextUtils.indexOf(str3, str3, 0, 0);
                        java.lang.Object[] objArr8822 = new java.lang.Object[1];
                        b((i16122 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) + ((i16122 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) << 1), alpha32 + 7, "\r\f\u0012\f\uffc8\u0006\ufffe", true, (i16222 ^ 5) + ((i16222 & 5) << 1), objArr8822);
                        java.lang.String str3422 = (java.lang.String) objArr8822[0];
                        int i16322 = -(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int normalizeMetaState22 = android.view.KeyEvent.normalizeMetaState(0);
                        java.lang.Object[] objArr8922 = new java.lang.Object[1];
                        b((i16322 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE) + ((i16322 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE) << 1), ((normalizeMetaState22 | 11) << 1) - (normalizeMetaState22 ^ 11), "\u0011\u0017\u0011ￍ\f\u0007\u0000ￍ\u000b\u0003\u0012", true, 16777219 - (~android.graphics.Color.rgb(0, 0, 0)), objArr8922);
                        java.lang.String str3522 = (java.lang.String) objArr8922[0];
                        int i16422 = -(-android.view.Gravity.getAbsoluteGravity(0, 0));
                        java.lang.Object[] objArr9022 = new java.lang.Object[1];
                        b(((i16422 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE) << 1) - (i16422 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE), android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 13, "\u0010\u0016\u0010ￌ\u000b\u0006\uffff\u0010ￌ\n\u0002\u0011", true, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 4, objArr9022);
                        java.lang.String str3622 = (java.lang.String) objArr9022[0];
                        int maxKeyCode22 = android.view.KeyEvent.getMaxKeyCode() >> 16;
                        int currentTimeMillis3522 = (int) java.lang.System.currentTimeMillis();
                        int i16522 = maxKeyCode22 * (-167);
                        int i16622 = ~((~maxKeyCode22) | (-215));
                        int i16722 = ~((currentTimeMillis3522 & (-215)) | (currentTimeMillis3522 ^ (-215)));
                        int i16822 = ((((-35738) | i16522) << 1) - (i16522 ^ (-35738))) + (((i16622 & i16722) | (i16622 ^ i16722)) * 336);
                        int i16922 = ~(maxKeyCode22 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PIN_VALUE);
                        int i17022 = ~(maxKeyCode22 | currentTimeMillis3522);
                        int i17122 = ((i16922 ^ i17022) | (i16922 & i17022)) * (-168);
                        int i17222 = ~currentTimeMillis3522;
                        int i17322 = ~((maxKeyCode22 ^ i17222) | (maxKeyCode22 & i17222));
                        int i17422 = -android.graphics.Color.rgb(0, 0, 0);
                        int i17522 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        java.lang.Object[] objArr9122 = new java.lang.Object[1];
                        b((((i16822 | i17122) << 1) - (i17122 ^ i16822)) + (((i17322 ^ (-215)) | (i17322 & (-215))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE), ((-16777204) & i17422) + (i17422 | (-16777204)), "\u0001\u0010\u000f\u0015\u000fￋ\n\u0005\ufffe\u0014ￋ\t", true, (i17522 & 6) + (i17522 | 6), objArr9122);
                        java.lang.String str3722 = (java.lang.String) objArr9122[0];
                        int i17622 = (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int currentTimeMillis3622 = (int) java.lang.System.currentTimeMillis();
                        int i17722 = (i17622 * 829) + 8290;
                        int i17822 = ~i17622;
                        int i17922 = ~currentTimeMillis3622;
                        int i18022 = i17922 | i17622;
                        int i18122 = ((~((i17822 ^ (-11)) | (i17822 & (-11)))) | (~((i18022 ^ 10) | (i18022 & 10)))) * (-828);
                        int i18222 = i17622 | 10;
                        int i18322 = (i17722 ^ i18122) + ((i17722 & i18122) << 1) + (((i17922 ^ i18222) | (i17922 & i18222)) * (-828));
                        int i18422 = -(-((~i18222) * 828));
                        java.lang.Object[] objArr9222 = new java.lang.Object[1];
                        c("嶌\uf246웼∕Ẋ糥⢩蹶િ潳缡좧", (i18322 ^ i18422) + ((i18422 & i18322) << 1), objArr9222);
                        java.lang.String str3822 = (java.lang.String) objArr9222[0];
                        int alpha222 = android.graphics.Color.alpha(0);
                        int i18522 = -android.graphics.ImageFormat.getBitsPerPixel(0);
                        java.lang.Object[] objArr9322 = new java.lang.Object[1];
                        b(alpha222 + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE, (i18522 ^ 4) + ((i18522 & 4) << 1), "\u0014\u0003\n\u000f\uffd0", false, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4, objArr9322);
                        java.lang.String str3922 = (java.lang.String) objArr9322[0];
                        java.lang.Object[] objArr9422 = new java.lang.Object[1];
                        c("\ue204阽\u0b79䘟", 3 - (~(-(-android.view.View.resolveSize(0, 0)))), objArr9422);
                        strArr = new java.lang.String[]{str3422, str3522, str3622, str3722, str3822, str3922, (java.lang.String) objArr9422[0]};
                        i = 0;
                        while (true) {
                            if (i < 7) {
                            }
                            i = ((i & 2) + (i | 2)) - 1;
                            strArr = strArr2;
                        }
                        if (i2 == 0) {
                        }
                    }
                }
                str = "";
                int i301022 = (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                java.lang.Object[] objArr27222 = new java.lang.Object[1];
                c("鎮レ奒☤徨뭘ᆫำ", (i301022 & 7) + (i301022 | 7), objArr27222);
                java.lang.String str6222 = (java.lang.String) objArr27222[0];
                int i311022 = -(-android.view.Gravity.getAbsoluteGravity(0, 0));
                int i321022 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                java.lang.Object[] objArr28222 = new java.lang.Object[1];
                b(((i311022 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) << 1) - (i311022 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE), ((i321022 | 6) << 1) - (i321022 ^ 6), "�\ufff7\b\u0006\uffff\u0004", false, -android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr28222);
                java.lang.String str7222 = (java.lang.String) objArr28222[0];
                int capsMode422 = android.text.TextUtils.getCapsMode(str, 0, 0);
                int currentTimeMillis13222 = (int) java.lang.System.currentTimeMillis();
                int i331022 = capsMode422 * 615;
                int i34922 = ((-136086) ^ i331022) + ((i331022 & (-136086)) << 1);
                int i35222 = ~capsMode422;
                int i36222 = ~((i35222 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE) | (i35222 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE));
                int i37222 = (i36222 & currentTimeMillis13222) | (currentTimeMillis13222 ^ i36222);
                int i38222 = ~((capsMode422 ^ (-223)) | (capsMode422 & (-223)));
                int i39222 = ((i37222 ^ i38222) | (i37222 & i38222)) * 614;
                int i40222 = ~currentTimeMillis13222;
                int i41222 = ~((i35222 ^ i40222) | (i35222 & i40222));
                int i42222 = (i36222 ^ i41222) | (i41222 & i36222);
                int i43222 = ~((i40222 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE) | (i40222 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE));
                int i44222 = -(-(((i42222 ^ i43222) | (i43222 & i42222)) * (-1228)));
                int i45222 = (i35222 & (-223)) | (i35222 ^ (-223));
                int i46222 = (capsMode422 ^ i40222) | (capsMode422 & i40222);
                int gidForName222 = android.os.Process.getGidForName(str);
                int i47222 = -android.text.TextUtils.getOffsetAfter(str, 0);
                java.lang.Object[] objArr29222 = new java.lang.Object[1];
                b((((((i34922 ^ i39222) + ((i34922 & i39222) << 1)) - (~i44222)) - 1) - (~(((~((i40222 ^ i45222) | (i45222 & i40222))) | (~((i46222 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE) | (i46222 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE)))) * 614))) - 1, ((gidForName222 | 8) << 1) - (gidForName222 ^ 8), "\u0007\ufff9\u0006\ufff8\ufff8\u0001\t", false, ((i47222 | 4) << 1) - (i47222 ^ 4), objArr29222);
                java.lang.String str8222 = (java.lang.String) objArr29222[0];
                int i48222 = -android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                int i49222 = -(-(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                java.lang.Object[] objArr30222 = new java.lang.Object[1];
                b(219 - (~i48222), ((i49222 | 8) << 1) - (i49222 ^ 8), "\u000b\ufffa\u0007￼\ufff9\ufff7\b\ufffa\u0007", false, android.text.TextUtils.getOffsetAfter(str, 0) + 3, objArr30222);
                java.lang.String str9222 = (java.lang.String) objArr30222[0];
                int i50222 = -(-android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                java.lang.Object[] objArr31222 = new java.lang.Object[1];
                c("䭤љ⺑\uee39⾌銨", ((i50222 | 6) << 1) - (i50222 ^ 6), objArr31222);
                java.lang.String str10222 = (java.lang.String) objArr31222[0];
                int capsMode2222 = android.text.TextUtils.getCapsMode(str, 0, 0);
                java.lang.Object[] objArr32222 = new java.lang.Object[1];
                c("뮭竚揄丣ꭓ\uaada\uea49뜉㬪矇돫䶫짴謍", (capsMode2222 ^ 13) + ((capsMode2222 & 13) << 1), objArr32222);
                java.lang.String str11222 = (java.lang.String) objArr32222[0];
                int i51222 = -android.widget.ExpandableListView.getPackedPositionType(0L);
                java.lang.Object[] objArr33222 = new java.lang.Object[1];
                c("酙澢撼ꌺ峓ꆰ", (i51222 ^ 5) + ((i51222 & 5) << 1), objArr33222);
                java.lang.String str12222 = (java.lang.String) objArr33222[0];
                int i52222 = -android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                int currentTimeMillis14222 = (int) java.lang.System.currentTimeMillis();
                int i53222 = i52222 * 306;
                int i54222 = (i53222 & androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS) + (i53222 | androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS);
                int i55222 = ~((i52222 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) | (i52222 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                int i56222 = ~((i52222 ^ currentTimeMillis14222) | (i52222 & currentTimeMillis14222));
                int i57222 = ~(i52222 | (~currentTimeMillis14222));
                int i58222 = -android.view.Gravity.getAbsoluteGravity(0, 0);
                int size222 = android.view.View.MeasureSpec.getSize(0);
                java.lang.Object[] objArr34222 = new java.lang.Object[1];
                b((((64260 | i54222) << 1) - (64260 ^ i54222)) + (((i55222 & i56222) | (i55222 ^ i56222)) * 305) + (((i57222 ^ (-211)) | (i57222 & (-211))) * 305), ((i58222 | 6) << 1) - (i58222 ^ 6), "\u0005ￒ\b\u000f\u0004\u0011", false, (size222 ^ 2) + ((size222 & 2) << 1), objArr34222);
                java.lang.String str13222 = (java.lang.String) objArr34222[0];
                java.lang.Object[] objArr35222 = new java.lang.Object[1];
                c("쓳ᨆ", android.view.View.getDefaultSize(0, 0) + 2, objArr35222);
                java.lang.String str14222 = (java.lang.String) objArr35222[0];
                java.lang.Object[] objArr36222 = new java.lang.Object[1];
                c("趌먼嘕㈗ﳘ\uf0ecꇚ쉹姱獶个吽傰ꘌ왷\ue9f9", 15 - (~(-(-(android.view.ViewConfiguration.getLongPressTimeout() >> 16)))), objArr36222);
                java.lang.String str15222 = (java.lang.String) objArr36222[0];
                float length222 = android.graphics.PointF.length(0.0f, 0.0f);
                int i59222 = -android.graphics.Color.argb(0, 0, 0, 0);
                int scrollBarSize2222 = android.view.ViewConfiguration.getScrollBarSize() >> 8;
                java.lang.Object[] objArr37222 = new java.lang.Object[1];
                b(213 - (length222 > 0.0f ? 1 : (length222 == 0.0f ? 0 : -1)), (i59222 ^ 10) + ((i59222 & 10) << 1), "\u0004\u0011\ufffe\u0004\u0001ￋ\u000f\u0000\t\f", false, (scrollBarSize2222 ^ 8) + ((scrollBarSize2222 & 8) << 1), objArr37222);
                java.lang.String str16222 = (java.lang.String) objArr37222[0];
                int i60222 = (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int i61222 = -android.text.TextUtils.indexOf(str, str, 0, 0);
                int i62222 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int currentTimeMillis15222 = (int) java.lang.System.currentTimeMillis();
                int i63222 = 609 - (~(-(-(i62222 * 306))));
                int i64222 = ~(i62222 | 7);
                int i65222 = ~(i62222 | currentTimeMillis15222);
                int i66222 = ~currentTimeMillis15222;
                int i67222 = ~((i62222 ^ i66222) | (i62222 & i66222));
                java.lang.Object[] objArr38222 = new java.lang.Object[1];
                b(((i60222 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE) << 1) - (i60222 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE), (i61222 & 8) + (i61222 | 8), "\u0003\ufff7\u0006\ufff5\u0002\uffff\u0004\u0006", false, (i63222 ^ 2142) + ((i63222 & 2142) << 1) + (((i64222 & i65222) | (i64222 ^ i65222)) * 305) + (((i67222 ^ (-8)) | (i67222 & (-8))) * 305), objArr38222);
                java.lang.String str17222 = (java.lang.String) objArr38222[0];
                int i68222 = -android.view.KeyEvent.getDeadChar(0, 0);
                int lastIndexOf422 = android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                int i69222 = -((android.os.Process.getThreadPriority(0) + 20) >> 6);
                java.lang.Object[] objArr39222 = new java.lang.Object[1];
                b(((i68222 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) << 1) - (i68222 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE), (lastIndexOf422 & 13) + (lastIndexOf422 | 13), "\ufff9\u0005\u0002\u0002\ufffb\ufff9\n\ufffa\u0006\b\u0005￼", false, (i69222 & 8) + (i69222 | 8), objArr39222);
                java.lang.String str18222 = (java.lang.String) objArr39222[0];
                int i70222 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                java.lang.Object[] objArr40222 = new java.lang.Object[1];
                c("㲍䅪弫\ue103ӊ趖䫻ƫ\ue81b䮲\u0b79䘟놥ힶ", (i70222 ^ 14) + ((i70222 & 14) << 1), objArr40222);
                java.lang.String str19222 = (java.lang.String) objArr40222[0];
                java.lang.Object[] objArr41222 = new java.lang.Object[1];
                c("\u0c76\u19db\ue43c窶蛈샺邴鰼", 6 - (~(-(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))), objArr41222);
                java.lang.String str20222 = (java.lang.String) objArr41222[0];
                int i71222 = -(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                java.lang.Object[] objArr42222 = new java.lang.Object[1];
                c("던櫥긭늙覍䬆峓ꆰ", ((i71222 | 6) << 1) - (i71222 ^ 6), objArr42222);
                java.lang.String str21222 = (java.lang.String) objArr42222[0];
                java.lang.Object[] objArr43222 = new java.lang.Object[1];
                c("噵ⷿ⾌銨侷亶鸿豰", 7 - (~(-(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))), objArr43222);
                java.lang.String str22222 = (java.lang.String) objArr43222[0];
                long zoomControlsTimeout222 = android.view.ViewConfiguration.getZoomControlsTimeout();
                int i72222 = -(-android.view.View.getDefaultSize(0, 0));
                java.lang.Object[] objArr44222 = new java.lang.Object[1];
                b(227 - (~(zoomControlsTimeout222 > 0L ? 1 : (zoomControlsTimeout222 == 0L ? 0 : -1))), ((i72222 | 2) << 1) - (i72222 ^ 2), "\u0000\u0000", false, 2 - (~android.view.MotionEvent.axisFromString(str)), objArr44222);
                java.lang.String str23222 = (java.lang.String) objArr44222[0];
                java.lang.Object[] objArr45222 = new java.lang.Object[1];
                c("姱獶栉ໄ홻幕䰟ᶣ㫰珓⮋칭⌫阫㛿у\ue880唻뙾㥂", 19 - (~(-android.view.View.combineMeasuredStates(0, 0))), objArr45222);
                java.lang.String str24222 = (java.lang.String) objArr45222[0];
                java.lang.Object[] objArr46222 = new java.lang.Object[1];
                c("姱獶涹仨ꃓꌅ", android.widget.ExpandableListView.getPackedPositionType(0L) + 6, objArr46222);
                java.lang.String str25222 = (java.lang.String) objArr46222[0];
                int i73222 = -android.view.View.combineMeasuredStates(0, 0);
                int currentTimeMillis16222 = (int) java.lang.System.currentTimeMillis();
                int i74222 = i73222 * 371;
                int i75222 = ~currentTimeMillis16222;
                int i76222 = ~(i75222 | (-231));
                int i77222 = ~i73222;
                int i78222 = ~(i77222 | currentTimeMillis16222);
                int i79222 = (((((85330 | i74222) << 1) - (i74222 ^ 85330)) + (((i76222 & i78222) | (i76222 ^ i78222)) * (-370))) - (~((((~((currentTimeMillis16222 ^ (-231)) | (currentTimeMillis16222 & (-231)))) | (~((i75222 & i77222) | (i75222 ^ i77222)))) | (~((i73222 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE) | (i73222 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE)))) * (-370)))) - 1;
                int i80222 = (~(i73222 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE)) * com.knotapi.knot.utilities.Constants.ID_KROGER;
                java.lang.Object[] objArr47222 = new java.lang.Object[1];
                b((i79222 & i80222) + (i80222 | i79222), android.graphics.Color.alpha(0) + 2, "\uffff\u0001", false, 2 - (~(-(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))), objArr47222);
                java.lang.String str26222 = (java.lang.String) objArr47222[0];
                int i81222 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                int i82222 = -(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int i83222 = -(-(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                java.lang.Object[] objArr48222 = new java.lang.Object[1];
                b((i81222 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE) + ((i81222 & com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE) << 1), ((i82222 | 16) << 1) - (i82222 ^ 16), "\n\u000b\t\t\ufff7\u0004\uffff\n\uffff\u0010\ufffb\bￃ\t\n\ufff7", false, ((i83222 | 3) << 1) - (i83222 ^ 3), objArr48222);
                java.lang.String str27222 = (java.lang.String) objArr48222[0];
                int i84222 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int currentTimeMillis17222 = (int) java.lang.System.currentTimeMillis();
                int i85222 = i84222 * (-830);
                int i86222 = ~currentTimeMillis17222;
                int i87222 = ~((i86222 ^ (-222)) | (i86222 & (-222)));
                int i88222 = (i84222 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE) | (i84222 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE);
                int i89222 = ~((i88222 ^ currentTimeMillis17222) | (i88222 & currentTimeMillis17222));
                int i90222 = (i84222 ^ (-222)) | (i84222 & (-222));
                int i91222 = ~i84222;
                int i92222 = ~((i86222 ^ i91222) | (i86222 & i91222));
                int i93222 = ~((i84222 ^ currentTimeMillis17222) | (i84222 & currentTimeMillis17222));
                int i94222 = (i93222 ^ i92222) | (i93222 & i92222);
                int i95222 = ~((currentTimeMillis17222 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE) | (currentTimeMillis17222 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE));
                int i96222 = -(-(((i94222 ^ i95222) | (i94222 & i95222)) * 831));
                int i97222 = -android.graphics.Color.argb(0, 0, 0, 0);
                int currentTimeMillis18222 = (int) java.lang.System.currentTimeMillis();
                int i98222 = i97222 * 71;
                int i99222 = (i98222 ^ (-621)) + ((i98222 & (-621)) << 1);
                int i100222 = ~i97222;
                int i101222 = ~((i100222 & 9) | (i100222 ^ 9));
                int i102222 = ~((currentTimeMillis18222 ^ 9) | (currentTimeMillis18222 & 9));
                int i103222 = -(-(((i101222 & i102222) | (i101222 ^ i102222)) * (-140)));
                int i104222 = (i99222 & i103222) + (i103222 | i99222);
                int i105222 = (~(i97222 | 9 | currentTimeMillis18222)) * 70;
                int i106222 = (i104222 & i105222) + (i105222 | i104222);
                int i107222 = ~(i100222 | 9);
                int i108222 = ~((i97222 ^ (-10)) | (i97222 & (-10)));
                int i109222 = (i107222 ^ i108222) | (i107222 & i108222);
                int i110222 = ~((i97222 & currentTimeMillis18222) | (i97222 ^ currentTimeMillis18222));
                int i111222 = ((i109222 ^ i110222) | (i110222 & i109222)) * 70;
                java.lang.Object[] objArr49222 = new java.lang.Object[1];
                b(((((((183872 & i85222) + (i85222 | 183872)) + (((i87222 & i89222) | (i87222 ^ i89222)) * (-831))) - (~((~((currentTimeMillis17222 ^ i90222) | (i90222 & currentTimeMillis17222))) * (-1662)))) - 1) - (~i96222)) - 1, (i106222 ^ i111222) + ((i111222 & i106222) << 1), "\b\ufff7\ufff9\ufffb\u0006\ufff7\n\ufffe\n", false, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 8, objArr49222);
                java.lang.String str28222 = (java.lang.String) objArr49222[0];
                java.lang.Object[] objArr50222 = new java.lang.Object[1];
                c("\udc11᥊ṭ䨽\uefc9\ufddb㤋\ueec4ﻵ莕", android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 10, objArr50222);
                java.lang.String str29222 = (java.lang.String) objArr50222[0];
                int capsMode3222 = android.text.TextUtils.getCapsMode(str, 0, 0);
                int i112222 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                java.lang.Object[] objArr51222 = new java.lang.Object[1];
                b(217 - capsMode3222, ((i112222 | 59) << 1) - (i112222 ^ 59), "\ufffa\u000b\rￏ\ufffe\r\u000e\b\u000b\ufffe￼", true, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 3, objArr51222);
                java.lang.String str30222 = (java.lang.String) objArr51222[0];
                int red322 = android.graphics.Color.red(0);
                int i113222 = -(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                int i114222 = -(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                java.lang.Object[] objArr52222 = new java.lang.Object[1];
                b((red322 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE) + ((red322 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE) << 1), ((i113222 | 11) << 1) - (i113222 ^ 11), "\ufff9\ufff4\ufffe\u0003\ufffb\u0004\n\u0003\f\ufffe\u0003", false, ((i114222 | 6) << 1) - (i114222 ^ 6), objArr52222);
                java.lang.String str31222 = (java.lang.String) objArr52222[0];
                int lastIndexOf2222 = android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                java.lang.Object[] objArr53222 = new java.lang.Object[1];
                c("蛈샺䰟ᶣ뙥涪씿弥⸏魲律꧟\uffef蚈굩\udcfd", (lastIndexOf2222 ^ 16) + ((lastIndexOf2222 & 16) << 1), objArr53222);
                java.lang.String str32222 = (java.lang.String) objArr53222[0];
                int i115222 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
                java.lang.Object[] objArr54222 = new java.lang.Object[1];
                c("蛈샺䰟ᶣ뙥涪꯳씹\uf48f뢣鼆㸹㮅鹯", (i115222 & 14) + (i115222 | 14), objArr54222);
                java.lang.String[] strArr4222 = {str6222, str7222, str8222, str9222, str10222, str11222, str12222, str13222, str14222, str15222, str16222, str17222, str18222, str19222, str20222, str21222, str22222, str23222, str24222, str25222, str26222, str27222, str28222, str29222, str30222, str31222, str32222, (java.lang.String) objArr54222[0]};
                int i116222 = (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int currentTimeMillis19222 = (int) java.lang.System.currentTimeMillis();
                int i117222 = i116222 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE;
                int i118222 = ~i116222;
                int i119222 = (i118222 ^ (-216)) | (i118222 & (-216));
                int i120222 = ~currentTimeMillis19222;
                int i121222 = (i116222 ^ 215) | (i116222 & 215);
                int i122222 = ((-58265) ^ i117222) + ((i117222 & (-58265)) << 1) + (((~((i119222 & i120222) | (i119222 ^ i120222))) | (~((i121222 & currentTimeMillis19222) | (i121222 ^ currentTimeMillis19222)))) * (-272));
                int i123222 = ~((i118222 ^ 215) | (i118222 & 215));
                int i124222 = ~(i118222 | currentTimeMillis19222);
                int i125222 = ((i123222 ^ i124222) | (i124222 & i123222)) * (-272);
                int i126222 = ~((i116222 ^ currentTimeMillis19222) | (i116222 & currentTimeMillis19222));
                int threadPriority222 = android.os.Process.getThreadPriority(0);
                int i127222 = -(-((((threadPriority222 | 20) << 1) - (threadPriority222 ^ 20)) >> 6));
                int tapTimeout222 = android.view.ViewConfiguration.getTapTimeout() >> 16;
                int currentTimeMillis20222 = (int) java.lang.System.currentTimeMillis();
                int i128222 = (tapTimeout222 * (-445)) - 890;
                int i129222 = ~tapTimeout222;
                int i130222 = ~(i129222 | (-3));
                int i131222 = ~((~currentTimeMillis20222) | (-3));
                int i132222 = -(-(((i130222 & i131222) | (i130222 ^ i131222)) * 446));
                int i133222 = tapTimeout222 | (-3);
                java.lang.Object[] objArr55222 = new java.lang.Object[1];
                b((i122222 ^ i125222) + ((i125222 & i122222) << 1) + (((i126222 ^ 215) | (i126222 & 215)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE), 10 - (~i127222), "\r\u0000\r\n\uffc9\u0003￼\r\uffff\u0012￼", false, (i128222 & i132222) + (i128222 | i132222) + (((~((currentTimeMillis20222 & i133222) | (i133222 ^ currentTimeMillis20222))) | (~((i129222 ^ 2) | (i129222 & 2)))) * 446) + ((~((i129222 & (-3)) | (i129222 ^ (-3)))) * 446), objArr55222);
                java.lang.Object[] objArr56222 = {(java.lang.String) objArr55222[0]};
                obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                if (obj2 == null) {
                }
                str2 = (java.lang.String) ((java.lang.reflect.Method) obj2).invoke(null, objArr56222);
                if (str2 != null) {
                }
                java.lang.Object[] objArr70222 = new java.lang.Object[1];
                c("엀ˁᆫำ隉\ufbc3ꚉ\uf38a急ꘚ⾌銨\uef9a䩗\uf624ꡫ웼∕皶힢ѷ⮊벢芧", 23 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr70222);
                java.lang.Object[] objArr71222 = {(java.lang.String) objArr70222[0]};
                obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                if (obj3 == null) {
                }
                long longValue7222 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr71222)).longValue();
                long j18222 = ~((int) java.lang.System.currentTimeMillis());
                long j19222 = ((-159) * longValue7222) + 100347958206L + ((631119233 | longValue7222) * 160) + (((~(longValue7222 | (-631119234))) | (~((-631119234) | j18222))) * (-160)) + (((~((~longValue7222) | j18222)) | (-631119234)) * 160) + 1921659301;
                int currentTimeMillis26222 = (int) java.lang.System.currentTimeMillis();
                int currentTimeMillis27222 = (int) java.lang.System.currentTimeMillis();
                int i145222 = ~currentTimeMillis27222;
                j = (((int) (j19222 >> 32)) & (((((~((-1750334239) | currentTimeMillis26222)) | (-1107406647)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) - 1102859183) + (((~((~currentTimeMillis26222) | (-1750334239))) | 676483080) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE))) | (((((~((-914300528) | currentTimeMillis27222)) | (~(2013241327 | i145222))) * (-406)) + 1638797211 + ((~((-69800970) | i145222)) * (-406)) + (((~(currentTimeMillis27222 | (-1943440359))) | (~(i145222 | 914300527))) * 406)) & ((int) j19222));
                java.lang.Object[] objArr73222 = new java.lang.Object[1];
                c("薬偀ꣂ拾냆瞠急ꘚ贲ὗ엀ˁ傰ꘌ碬\udaf7责夢", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 16, objArr73222);
                java.lang.Object[] objArr74222 = {(java.lang.String) objArr73222[0]};
                obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                if (obj4 == null) {
                }
                long longValue8222 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr74222)).longValue();
                long j20222 = ~((int) java.lang.System.currentTimeMillis());
                long j21222 = (-654321436) | j20222;
                long j22222 = ~longValue8222;
                str3 = str;
                long j23222 = (53 * longValue8222) + 33370393236L + ((~(j21222 | longValue8222)) * 52) + (((~(j22222 | j20222)) | (~(j22222 | (-654321436))) | (~j21222)) * (-52)) + (((~(longValue8222 | 654321435)) | (~(654321435 | j20222))) * 52) + 1944861503;
                int currentTimeMillis28222 = (int) java.lang.System.currentTimeMillis();
                int i146222 = ~((-794556781) | currentTimeMillis28222);
                int i147222 = ((int) (j23222 >> 32)) & ((((((~(794556780 | currentTimeMillis28222)) | (-2147219949)) | (~(2063184104 | currentTimeMillis28222))) * (-880)) - 818885110) + (((~((~currentTimeMillis28222) | 794556780)) | (-2063184105) | i146222) * (-880)) + (i146222 * 880));
                int currentTimeMillis29222 = (int) java.lang.System.currentTimeMillis();
                int i148222 = ((int) j23222) & (((((~((-1163162066) | r7)) | (~(1694578820 | currentTimeMillis29222))) * com.visa.cbp.getCertUsage.getODAData) - 569105799) + (((~(currentTimeMillis29222 | (-1163162066))) | (~((~currentTimeMillis29222) | 1694578820))) * com.visa.cbp.getCertUsage.getODAData));
                long j24222 = (i148222 ^ i147222) | (i147222 & i148222);
                if (j <= 0) {
                }
                int i150222 = -android.text.TextUtils.indexOf(str3, str3);
                java.lang.Object[] objArr79222 = new java.lang.Object[1];
                c("엀ˁᆫำ隉\ufbc3ꚉ\uf38a急ꘚ⾌銨\uef9a䩗\uf624ꡫ웼∕皶힢ѷ⮊벢芧", (i150222 ^ 23) + ((i150222 & 23) << 1), objArr79222);
                java.lang.Object[] objArr80222 = {(java.lang.String) objArr79222[0]};
                obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                if (obj5 == null) {
                }
                long longValue9222 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr80222)).longValue();
                int currentTimeMillis31222 = (int) java.lang.System.currentTimeMillis();
                long j25222 = ~longValue9222;
                long j26222 = ~(currentTimeMillis31222 | longValue9222);
                long j27222 = ((-195) * longValue9222) + 94954134168L + (((~((-242849448) | j25222)) | j26222) * (-196)) + ((longValue9222 | (-242849448)) * 392) + (((~(242849447 | j25222)) | j26222) * 196) + 1533389515;
                int currentTimeMillis32222 = (int) java.lang.System.currentTimeMillis();
                int i151222 = ((int) (j27222 >> 32)) & (((((~(1419240638 | r5)) | 16781376) * (-108)) - 545675446) + (((~((~currentTimeMillis32222) | 17985772)) | (~((-17985773) | currentTimeMillis32222)) | 1418036242) * 54) + ((currentTimeMillis32222 | 1418036242) * 54));
                int i152222 = ((int) j27222) & (((((~((-1767379498) | r5)) | (-1090361389)) * (-983)) - 1594552786) + (((~((~((int) java.lang.System.currentTimeMillis())) | (-1090361389))) | 10848260) * 983));
                j2 = (i151222 ^ i152222) | (i151222 & i152222);
                int i153222 = -android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                int i154222 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                java.lang.Object[] objArr82222 = new java.lang.Object[1];
                b((i153222 & 204) + (i153222 | 204), (i154222 & 4) + (i154222 | 4), "\n\tￔ\u001b", true, 2 - (~(-android.text.TextUtils.indexOf(str3, str3, 0))), objArr82222);
                java.lang.Object[] objArr83222 = {(java.lang.String) objArr82222[0]};
                obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                if (obj6 == null) {
                }
                long longValue10222 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr83222)).longValue();
                int currentTimeMillis33222 = (int) java.lang.System.currentTimeMillis();
                long j28222 = ~longValue10222;
                long j29222 = currentTimeMillis33222;
                long j30222 = ~j29222;
                long j31222 = ((-209) * longValue10222) + 92871776503L + ((~(j28222 | 444362566)) * 210) + (((~(j28222 | j30222)) | (~(j29222 | 444362566))) * 210) + (((~(j30222 | 444362566 | longValue10222)) | (~(j28222 | (-444362567) | j29222))) * 210) + 1734902634;
                int i155222 = ((int) (j31222 >> 32)) & (((((~(1343097931 | r5)) | 1514642953) * (-983)) - 537842485) + (((~((~((int) java.lang.System.currentTimeMillis())) | 1514642953)) | 524354) * 983));
                int currentTimeMillis34222 = (int) java.lang.System.currentTimeMillis();
                int i156222 = ((int) j31222) & (((((~(1883512581 | r5)) | (~((-446286172) | currentTimeMillis34222))) * (-370)) - 635053777) + (((~(currentTimeMillis34222 | 1883512581)) | (~((~currentTimeMillis34222) | (-446286172))) | 1615074820) * (-370)) + 577229256);
                long j32222 = (i156222 ^ i155222) | (i155222 & i156222);
                if (j2 > 0) {
                }
                int i161222 = (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int alpha322 = android.graphics.Color.alpha(0);
                int i162222 = -android.text.TextUtils.indexOf(str3, str3, 0, 0);
                java.lang.Object[] objArr88222 = new java.lang.Object[1];
                b((i161222 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) + ((i161222 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) << 1), alpha322 + 7, "\r\f\u0012\f\uffc8\u0006\ufffe", true, (i162222 ^ 5) + ((i162222 & 5) << 1), objArr88222);
                java.lang.String str34222 = (java.lang.String) objArr88222[0];
                int i163222 = -(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                int normalizeMetaState222 = android.view.KeyEvent.normalizeMetaState(0);
                java.lang.Object[] objArr89222 = new java.lang.Object[1];
                b((i163222 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE) + ((i163222 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE) << 1), ((normalizeMetaState222 | 11) << 1) - (normalizeMetaState222 ^ 11), "\u0011\u0017\u0011ￍ\f\u0007\u0000ￍ\u000b\u0003\u0012", true, 16777219 - (~android.graphics.Color.rgb(0, 0, 0)), objArr89222);
                java.lang.String str35222 = (java.lang.String) objArr89222[0];
                int i164222 = -(-android.view.Gravity.getAbsoluteGravity(0, 0));
                java.lang.Object[] objArr90222 = new java.lang.Object[1];
                b(((i164222 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE) << 1) - (i164222 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE), android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 13, "\u0010\u0016\u0010ￌ\u000b\u0006\uffff\u0010ￌ\n\u0002\u0011", true, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 4, objArr90222);
                java.lang.String str36222 = (java.lang.String) objArr90222[0];
                int maxKeyCode222 = android.view.KeyEvent.getMaxKeyCode() >> 16;
                int currentTimeMillis35222 = (int) java.lang.System.currentTimeMillis();
                int i165222 = maxKeyCode222 * (-167);
                int i166222 = ~((~maxKeyCode222) | (-215));
                int i167222 = ~((currentTimeMillis35222 & (-215)) | (currentTimeMillis35222 ^ (-215)));
                int i168222 = ((((-35738) | i165222) << 1) - (i165222 ^ (-35738))) + (((i166222 & i167222) | (i166222 ^ i167222)) * 336);
                int i169222 = ~(maxKeyCode222 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PIN_VALUE);
                int i170222 = ~(maxKeyCode222 | currentTimeMillis35222);
                int i171222 = ((i169222 ^ i170222) | (i169222 & i170222)) * (-168);
                int i172222 = ~currentTimeMillis35222;
                int i173222 = ~((maxKeyCode222 ^ i172222) | (maxKeyCode222 & i172222));
                int i174222 = -android.graphics.Color.rgb(0, 0, 0);
                int i175222 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                java.lang.Object[] objArr91222 = new java.lang.Object[1];
                b((((i168222 | i171222) << 1) - (i171222 ^ i168222)) + (((i173222 ^ (-215)) | (i173222 & (-215))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE), ((-16777204) & i174222) + (i174222 | (-16777204)), "\u0001\u0010\u000f\u0015\u000fￋ\n\u0005\ufffe\u0014ￋ\t", true, (i175222 & 6) + (i175222 | 6), objArr91222);
                java.lang.String str37222 = (java.lang.String) objArr91222[0];
                int i176222 = (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int currentTimeMillis36222 = (int) java.lang.System.currentTimeMillis();
                int i177222 = (i176222 * 829) + 8290;
                int i178222 = ~i176222;
                int i179222 = ~currentTimeMillis36222;
                int i180222 = i179222 | i176222;
                int i181222 = ((~((i178222 ^ (-11)) | (i178222 & (-11)))) | (~((i180222 ^ 10) | (i180222 & 10)))) * (-828);
                int i182222 = i176222 | 10;
                int i183222 = (i177222 ^ i181222) + ((i177222 & i181222) << 1) + (((i179222 ^ i182222) | (i179222 & i182222)) * (-828));
                int i184222 = -(-((~i182222) * 828));
                java.lang.Object[] objArr92222 = new java.lang.Object[1];
                c("嶌\uf246웼∕Ẋ糥⢩蹶િ潳缡좧", (i183222 ^ i184222) + ((i184222 & i183222) << 1), objArr92222);
                java.lang.String str38222 = (java.lang.String) objArr92222[0];
                int alpha2222 = android.graphics.Color.alpha(0);
                int i185222 = -android.graphics.ImageFormat.getBitsPerPixel(0);
                java.lang.Object[] objArr93222 = new java.lang.Object[1];
                b(alpha2222 + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE, (i185222 ^ 4) + ((i185222 & 4) << 1), "\u0014\u0003\n\u000f\uffd0", false, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4, objArr93222);
                java.lang.String str39222 = (java.lang.String) objArr93222[0];
                java.lang.Object[] objArr94222 = new java.lang.Object[1];
                c("\ue204阽\u0b79䘟", 3 - (~(-(-android.view.View.resolveSize(0, 0)))), objArr94222);
                strArr = new java.lang.String[]{str34222, str35222, str36222, str37222, str38222, str39222, (java.lang.String) objArr94222[0]};
                i = 0;
                while (true) {
                    if (i < 7) {
                    }
                    i = ((i & 2) + (i | 2)) - 1;
                    strArr = strArr2;
                }
                if (i2 == 0) {
                }
            } catch (java.lang.Throwable th5) {
                java.lang.Throwable cause5 = th5.getCause();
                if (cause5 != null) {
                    throw cause5;
                }
                throw th5;
            }
        }
    }

    static {
        init$0();
        new com.payair.hce.getCardMetadata.AnonymousClass5();
        AlternateContactlessPaymentDataJson = new java.lang.Object();
    }

    @Override // com.payair.hce.getAckAutomaticallyResetByApplication
    public final void AlternateContactlessPaymentDataJson() throws java.io.IOException {
        writeReplace(com.payair.hce.getAckPreEntryAllowed.BEGIN_ARRAY);
        AlternateContactlessPaymentDataJson(((com.payair.hce.getAid) this.writeReplace[this.values - 1]).iterator());
        this.getAid[this.values - 1] = 0;
    }

    @Override // com.payair.hce.getAckAutomaticallyResetByApplication
    public final void valueOf() throws java.io.IOException {
        writeReplace(com.payair.hce.getAckPreEntryAllowed.END_ARRAY);
        java.lang.Object[] objArr = this.writeReplace;
        int i = this.values;
        int i2 = i - 1;
        java.lang.Object obj = objArr[i2];
        objArr[i2] = null;
        int i3 = i - 2;
        this.values = i3;
        java.lang.Object obj2 = objArr[i3];
        objArr[i3] = null;
        if (i3 > 0) {
            int[] iArr = this.getAid;
            int i4 = i - 3;
            iArr[i4] = iArr[i4] + 1;
        }
    }

    @Override // com.payair.hce.getAckAutomaticallyResetByApplication
    public final void writeReplace() throws java.io.IOException {
        writeReplace(com.payair.hce.getAckPreEntryAllowed.BEGIN_OBJECT);
        AlternateContactlessPaymentDataJson(((com.payair.hce.getGpoResponse) this.writeReplace[this.values - 1]).valueOf.entrySet().iterator());
    }

    @Override // com.payair.hce.getAckAutomaticallyResetByApplication
    public final void DigitizedCardProfile() throws java.io.IOException {
        writeReplace(com.payair.hce.getAckPreEntryAllowed.END_OBJECT);
        java.lang.Object[] objArr = this.writeReplace;
        int i = this.values;
        int i2 = i - 1;
        java.lang.Object obj = objArr[i2];
        objArr[i2] = null;
        int i3 = i - 2;
        this.values = i3;
        java.lang.Object obj2 = objArr[i3];
        objArr[i3] = null;
        if (i3 > 0) {
            int[] iArr = this.getAid;
            int i4 = i - 3;
            iArr[i4] = iArr[i4] + 1;
        }
    }

    @Override // com.payair.hce.getAckAutomaticallyResetByApplication
    public final boolean values() throws java.io.IOException {
        com.payair.hce.getAckPreEntryAllowed profileVersion = getProfileVersion();
        return (profileVersion == com.payair.hce.getAckPreEntryAllowed.END_OBJECT || profileVersion == com.payair.hce.getAckPreEntryAllowed.END_ARRAY) ? false : true;
    }

    @Override // com.payair.hce.getAckAutomaticallyResetByApplication
    public final com.payair.hce.getAckPreEntryAllowed getProfileVersion() throws java.io.IOException {
        while (true) {
            int i = this.values;
            if (i == 0) {
                return com.payair.hce.getAckPreEntryAllowed.END_DOCUMENT;
            }
            java.lang.Object[] objArr = this.writeReplace;
            java.lang.Object obj = objArr[i - 1];
            if (obj instanceof java.util.Iterator) {
                boolean z = objArr[i - 2] instanceof com.payair.hce.getGpoResponse;
                java.util.Iterator it = (java.util.Iterator) obj;
                if (!it.hasNext()) {
                    return z ? com.payair.hce.getAckPreEntryAllowed.END_OBJECT : com.payair.hce.getAckPreEntryAllowed.END_ARRAY;
                }
                if (z) {
                    return com.payair.hce.getAckPreEntryAllowed.NAME;
                }
                AlternateContactlessPaymentDataJson(it.next());
            } else {
                if (obj instanceof com.payair.hce.getGpoResponse) {
                    return com.payair.hce.getAckPreEntryAllowed.BEGIN_OBJECT;
                }
                byte b = (byte) ($$a[5] - 1);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(b, b, b, objArr2);
                if (java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(obj)) {
                    return com.payair.hce.getAckPreEntryAllowed.BEGIN_ARRAY;
                }
                if (obj instanceof com.payair.hce.getCvmResetTimeout) {
                    com.payair.hce.getCvmResetTimeout getcvmresettimeout = (com.payair.hce.getCvmResetTimeout) obj;
                    if (getcvmresettimeout.DigitizedCardProfile instanceof java.lang.String) {
                        return com.payair.hce.getAckPreEntryAllowed.STRING;
                    }
                    if (getcvmresettimeout.DigitizedCardProfile instanceof java.lang.Boolean) {
                        return com.payair.hce.getAckPreEntryAllowed.BOOLEAN;
                    }
                    if (getcvmresettimeout.DigitizedCardProfile instanceof java.lang.Number) {
                        return com.payair.hce.getAckPreEntryAllowed.NUMBER;
                    }
                    throw new java.lang.AssertionError();
                }
                if (obj instanceof com.payair.hce.SdkCoreBusinessLogicModuleImpl) {
                    return com.payair.hce.getAckPreEntryAllowed.NULL;
                }
                if (obj == AlternateContactlessPaymentDataJson) {
                    throw new java.lang.IllegalStateException("JsonReader is closed");
                }
                throw new java.lang.AssertionError();
            }
        }
    }

    public final void writeReplace(com.payair.hce.getAckPreEntryAllowed getackpreentryallowed) throws java.io.IOException {
        if (getProfileVersion() == getackpreentryallowed) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        sb.append(getackpreentryallowed);
        sb.append(" but was ");
        sb.append(getProfileVersion());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(" at path ");
        sb2.append(getGpoResponse());
        sb.append(sb2.toString());
        throw new java.lang.IllegalStateException(sb.toString());
    }

    @Override // com.payair.hce.getAckAutomaticallyResetByApplication
    public final java.lang.String SdkCoreAlternateContactlessPaymentDataImpl() throws java.io.IOException {
        writeReplace(com.payair.hce.getAckPreEntryAllowed.NAME);
        java.util.Map.Entry entry = (java.util.Map.Entry) ((java.util.Iterator) this.writeReplace[this.values - 1]).next();
        java.lang.String str = (java.lang.String) entry.getKey();
        this.IccPrivateKeyCrtComponentsJson[this.values - 1] = str;
        AlternateContactlessPaymentDataJson(entry.getValue());
        return str;
    }

    @Override // com.payair.hce.getAckAutomaticallyResetByApplication
    public final java.lang.String getAid() throws java.io.IOException {
        com.payair.hce.getAckPreEntryAllowed profileVersion = getProfileVersion();
        if (profileVersion != com.payair.hce.getAckPreEntryAllowed.STRING && profileVersion != com.payair.hce.getAckPreEntryAllowed.NUMBER) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
            sb.append(com.payair.hce.getAckPreEntryAllowed.STRING);
            sb.append(" but was ");
            sb.append(profileVersion);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(" at path ");
            sb2.append(getGpoResponse());
            sb.append(sb2.toString());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        java.lang.Object[] objArr = this.writeReplace;
        int i = this.values - 1;
        this.values = i;
        java.lang.Object obj = objArr[i];
        objArr[i] = null;
        java.lang.String DigitizedCardProfile = ((com.payair.hce.getCvmResetTimeout) obj).DigitizedCardProfile();
        int i2 = this.values;
        if (i2 > 0) {
            int[] iArr = this.getAid;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return DigitizedCardProfile;
    }

    @Override // com.payair.hce.getAckAutomaticallyResetByApplication
    public final boolean IccPrivateKeyCrtComponentsJson() throws java.io.IOException {
        boolean parseBoolean;
        writeReplace(com.payair.hce.getAckPreEntryAllowed.BOOLEAN);
        java.lang.Object[] objArr = this.writeReplace;
        int i = this.values - 1;
        this.values = i;
        java.lang.Object obj = objArr[i];
        objArr[i] = null;
        com.payair.hce.getCvmResetTimeout getcvmresettimeout = (com.payair.hce.getCvmResetTimeout) obj;
        if (getcvmresettimeout.DigitizedCardProfile instanceof java.lang.Boolean) {
            parseBoolean = ((java.lang.Boolean) getcvmresettimeout.DigitizedCardProfile).booleanValue();
        } else {
            parseBoolean = java.lang.Boolean.parseBoolean(getcvmresettimeout.DigitizedCardProfile());
        }
        int i2 = this.values;
        if (i2 > 0) {
            int[] iArr = this.getAid;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return parseBoolean;
    }

    @Override // com.payair.hce.getAckAutomaticallyResetByApplication
    public final void RecordsJson() throws java.io.IOException {
        writeReplace(com.payair.hce.getAckPreEntryAllowed.NULL);
        java.lang.Object[] objArr = this.writeReplace;
        int i = this.values;
        int i2 = i - 1;
        this.values = i2;
        java.lang.Object obj = objArr[i2];
        objArr[i2] = null;
        if (i2 > 0) {
            int[] iArr = this.getAid;
            int i3 = i - 2;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.payair.hce.getAckAutomaticallyResetByApplication
    public final double SdkCoreBusinessLogicModuleImpl() throws java.io.IOException {
        com.payair.hce.getAckPreEntryAllowed profileVersion = getProfileVersion();
        if (profileVersion != com.payair.hce.getAckPreEntryAllowed.NUMBER && profileVersion != com.payair.hce.getAckPreEntryAllowed.STRING) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
            sb.append(com.payair.hce.getAckPreEntryAllowed.NUMBER);
            sb.append(" but was ");
            sb.append(profileVersion);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(" at path ");
            sb2.append(getGpoResponse());
            sb.append(sb2.toString());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        com.payair.hce.getCvmResetTimeout getcvmresettimeout = (com.payair.hce.getCvmResetTimeout) this.writeReplace[this.values - 1];
        double doubleValue = getcvmresettimeout.DigitizedCardProfile instanceof java.lang.Number ? getcvmresettimeout.AlternateContactlessPaymentDataJson().doubleValue() : java.lang.Double.parseDouble(getcvmresettimeout.DigitizedCardProfile());
        if (!this.DigitizedCardProfile && (java.lang.Double.isNaN(doubleValue) || java.lang.Double.isInfinite(doubleValue))) {
            throw new java.lang.NumberFormatException("JSON forbids NaN and infinities: ".concat(java.lang.String.valueOf(doubleValue)));
        }
        java.lang.Object[] objArr = this.writeReplace;
        int i = this.values;
        int i2 = i - 1;
        this.values = i2;
        java.lang.Object obj = objArr[i2];
        objArr[i2] = null;
        if (i2 > 0) {
            int[] iArr = this.getAid;
            int i3 = i - 2;
            iArr[i3] = iArr[i3] + 1;
        }
        return doubleValue;
    }

    @Override // com.payair.hce.getAckAutomaticallyResetByApplication
    public final long getPaymentFci() throws java.io.IOException {
        com.payair.hce.getAckPreEntryAllowed profileVersion = getProfileVersion();
        if (profileVersion != com.payair.hce.getAckPreEntryAllowed.NUMBER && profileVersion != com.payair.hce.getAckPreEntryAllowed.STRING) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
            sb.append(com.payair.hce.getAckPreEntryAllowed.NUMBER);
            sb.append(" but was ");
            sb.append(profileVersion);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(" at path ");
            sb2.append(getGpoResponse());
            sb.append(sb2.toString());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        com.payair.hce.getCvmResetTimeout getcvmresettimeout = (com.payair.hce.getCvmResetTimeout) this.writeReplace[this.values - 1];
        long longValue = getcvmresettimeout.DigitizedCardProfile instanceof java.lang.Number ? getcvmresettimeout.AlternateContactlessPaymentDataJson().longValue() : java.lang.Long.parseLong(getcvmresettimeout.DigitizedCardProfile());
        java.lang.Object[] objArr = this.writeReplace;
        int i = this.values;
        int i2 = i - 1;
        this.values = i2;
        java.lang.Object obj = objArr[i2];
        objArr[i2] = null;
        if (i2 > 0) {
            int[] iArr = this.getAid;
            int i3 = i - 2;
            iArr[i3] = iArr[i3] + 1;
        }
        return longValue;
    }

    @Override // com.payair.hce.getAckAutomaticallyResetByApplication
    public final int getCiacDecline() throws java.io.IOException {
        com.payair.hce.getAckPreEntryAllowed profileVersion = getProfileVersion();
        if (profileVersion != com.payair.hce.getAckPreEntryAllowed.NUMBER && profileVersion != com.payair.hce.getAckPreEntryAllowed.STRING) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
            sb.append(com.payair.hce.getAckPreEntryAllowed.NUMBER);
            sb.append(" but was ");
            sb.append(profileVersion);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(" at path ");
            sb2.append(getGpoResponse());
            sb.append(sb2.toString());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        com.payair.hce.getCvmResetTimeout getcvmresettimeout = (com.payair.hce.getCvmResetTimeout) this.writeReplace[this.values - 1];
        int intValue = getcvmresettimeout.DigitizedCardProfile instanceof java.lang.Number ? getcvmresettimeout.AlternateContactlessPaymentDataJson().intValue() : java.lang.Integer.parseInt(getcvmresettimeout.DigitizedCardProfile());
        java.lang.Object[] objArr = this.writeReplace;
        int i = this.values;
        int i2 = i - 1;
        this.values = i2;
        java.lang.Object obj = objArr[i2];
        objArr[i2] = null;
        if (i2 > 0) {
            int[] iArr = this.getAid;
            int i3 = i - 2;
            iArr[i3] = iArr[i3] + 1;
        }
        return intValue;
    }

    @Override // com.payair.hce.getAckAutomaticallyResetByApplication, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.writeReplace = new java.lang.Object[]{AlternateContactlessPaymentDataJson};
        this.values = 1;
    }

    @Override // com.payair.hce.getAckAutomaticallyResetByApplication
    public final void getCvrMaskAnd() throws java.io.IOException {
        if (getProfileVersion() == com.payair.hce.getAckPreEntryAllowed.NAME) {
            SdkCoreAlternateContactlessPaymentDataImpl();
            this.IccPrivateKeyCrtComponentsJson[this.values - 2] = "null";
        } else {
            java.lang.Object[] objArr = this.writeReplace;
            int i = this.values;
            int i2 = i - 1;
            this.values = i2;
            java.lang.Object obj = objArr[i2];
            objArr[i2] = null;
            if (i2 > 0) {
                this.IccPrivateKeyCrtComponentsJson[i - 2] = "null";
            }
        }
        int i3 = this.values;
        if (i3 > 0) {
            int[] iArr = this.getAid;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
    }

    @Override // com.payair.hce.getAckAutomaticallyResetByApplication
    public final java.lang.String toString() {
        return getClass().getSimpleName();
    }

    public final void AlternateContactlessPaymentDataJson(java.lang.Object obj) {
        int i = this.values;
        java.lang.Object[] objArr = this.writeReplace;
        if (i == objArr.length) {
            int i2 = i << 1;
            this.writeReplace = java.util.Arrays.copyOf(objArr, i2);
            this.getAid = java.util.Arrays.copyOf(this.getAid, i2);
            this.IccPrivateKeyCrtComponentsJson = (java.lang.String[]) java.util.Arrays.copyOf(this.IccPrivateKeyCrtComponentsJson, i2);
        }
        java.lang.Object[] objArr2 = this.writeReplace;
        int i3 = this.values;
        this.values = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // com.payair.hce.getAckAutomaticallyResetByApplication
    public final java.lang.String getGpoResponse() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD);
        int i = 0;
        while (i < this.values) {
            java.lang.Object obj = this.writeReplace[i];
            byte b = (byte) ($$a[5] - 1);
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(b, b, b, objArr);
            if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(obj)) {
                i++;
                if (this.writeReplace[i] instanceof java.util.Iterator) {
                    sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
                    sb.append(this.getAid[i]);
                    sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                }
            } else {
                java.lang.Object[] objArr2 = this.writeReplace;
                if (objArr2[i] instanceof com.payair.hce.getGpoResponse) {
                    i++;
                    if (objArr2[i] instanceof java.util.Iterator) {
                        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                        java.lang.String str = this.IccPrivateKeyCrtComponentsJson[i];
                        if (str != null) {
                            sb.append(str);
                        }
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    static void init$0() {
        $$a = new byte[]{125, com.google.common.base.Ascii.SI, -77, -54, -13, 1, 62, -67, 14, -25, com.google.common.base.Ascii.ETB, -9, -10, 67, -59, 4, -3, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -58, 1, com.visa.cbp.getEncExpo.onUnminimized, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -41, 4};
        $$b = 114;
    }
}
