package com.payair.hce;

/* loaded from: classes4.dex */
public class deviceAuthenticationCompleted extends com.payair.hce.getReasonCode<com.payair.hce.transactionCanBeResumed> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AlternateContactlessPaymentDataJson;
    private static char DigitizedCardProfile;
    private static int RecordsJson;
    private static int getProfileVersion;
    private static char valueOf;
    private static char values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, byte b, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = 110 - (b * 4);
        int i4 = i + 4;
        int i5 = s * 2;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i4;
            int i8 = i6;
            i2 = 0;
            int i9 = i7;
            i3 = i4 + i8;
            i4 = i9;
            bArr2[i2] = (byte) i3;
            int i10 = i4 + 1;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i10];
            i2++;
            int i11 = i3;
            i7 = i10;
            i4 = i11;
            int i92 = i7;
            i3 = i4 + i8;
            i4 = i92;
            bArr2[i2] = (byte) i3;
            int i102 = i4 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            int i1022 = i4 + 1;
            if (i2 == i6) {
            }
        }
    }

    /* synthetic */ deviceAuthenticationCompleted(byte b) {
        this();
    }

    @Override // com.payair.hce.getReasonCode
    public final com.payair.hce.transactionCanBeResumed valueOf() {
        getProfileVersion = (RecordsJson + 71) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("颏♝蚑榞", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 5, objArr);
        com.payair.hce.transactionCanBeResumed values2 = com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr[0]).intern());
        RecordsJson = (getProfileVersion + 9) % 128;
        return values2;
    }

    private deviceAuthenticationCompleted() {
        try {
            com.payair.hce.transactionCanBeResumed writeReplace = com.payair.hce.transactionCanBeResumed.writeReplace(4);
            super.valueOf(writeReplace);
            super.AlternateContactlessPaymentDataJson(writeReplace);
        } catch (com.payair.hce.postToastMessageOnUi unused) {
        }
    }

    public static com.payair.hce.setMobilePin<com.payair.hce.transactionCanBeResumed> writeReplace() {
        com.payair.hce.setMobilePin<com.payair.hce.transactionCanBeResumed> setmobilepin = new com.payair.hce.setMobilePin<com.payair.hce.transactionCanBeResumed>() { // from class: com.payair.hce.deviceAuthenticationCompleted.5
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$d = null;
            private static final int $$e = 0;
            private static int $10;
            private static int $11;
            private static char[] AlternateContactlessPaymentDataJson;
            private static long valueOf;
            private static int values;
            private static int writeReplace;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002d). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void a(byte b, byte b2, int i, java.lang.Object[] objArr) {
                int i2;
                int i3;
                int i4 = b2 + 4;
                int i5 = i + 65;
                byte[] bArr = $$a;
                char[] cArr = new char[35 - b];
                if (bArr == null) {
                    int i6 = i4;
                    int i7 = 0;
                    i4 = (i4 + (-i5)) - 2;
                    i3 = i6;
                    i2 = i7;
                    cArr[i2] = (char) i4;
                    if (i2 == 34 - b) {
                        objArr[0] = new java.lang.String(cArr);
                        return;
                    }
                    int i8 = i3 + 1;
                    int i9 = i2 + 1;
                    i6 = i8;
                    i5 = bArr[i8];
                    i7 = i9;
                    i4 = (i4 + (-i5)) - 2;
                    i3 = i6;
                    i2 = i7;
                    cArr[i2] = (char) i4;
                    if (i2 == 34 - b) {
                    }
                } else {
                    i2 = 0;
                    i3 = i4;
                    i4 = i5;
                    cArr[i2] = (char) i4;
                    if (i2 == 34 - b) {
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002d). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void c(byte b, short s, int i, java.lang.Object[] objArr) {
                int i2;
                int i3;
                byte[] bArr = $$d;
                int i4 = 99 - (i * 2);
                int i5 = s + 4;
                int i6 = 1 - (b * 2);
                byte[] bArr2 = new byte[i6];
                if (bArr == null) {
                    int i7 = i4;
                    i3 = 0;
                    int i8 = i5;
                    int i9 = i5 + i7;
                    i2 = i3;
                    int i10 = i8;
                    i4 = i9;
                    i5 = i10;
                    i3 = i2 + 1;
                    bArr2[i2] = (byte) i4;
                    int i11 = i5 + 1;
                    if (i3 == i6) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    int i12 = i4;
                    i8 = i11;
                    i5 = bArr[i11];
                    i7 = i12;
                    int i92 = i5 + i7;
                    i2 = i3;
                    int i102 = i8;
                    i4 = i92;
                    i5 = i102;
                    i3 = i2 + 1;
                    bArr2[i2] = (byte) i4;
                    int i112 = i5 + 1;
                    if (i3 == i6) {
                    }
                } else {
                    i2 = 0;
                    i3 = i2 + 1;
                    bArr2[i2] = (byte) i4;
                    int i1122 = i5 + 1;
                    if (i3 == i6) {
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x01e3  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x01e4  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void b(int i, char c, int i2, java.lang.Object[] objArr) {
                long j;
                java.lang.Throwable cause;
                com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
                long[] jArr = new long[i2];
                getcvmmodel.valueOf = 0;
                while (true) {
                    j = -1;
                    if (getcvmmodel.valueOf >= i2) {
                        break;
                    }
                    $10 = ($11 + 71) % 128;
                    int i3 = getcvmmodel.valueOf;
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson[i + getcvmmodel.valueOf])};
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 48, 382 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 62388));
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            c((byte) 0, (short) -1, 0, objArr3);
                            obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                        }
                        java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(valueOf), java.lang.Integer.valueOf(c)};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 3966, (char) (40222 - android.os.Process.getGidForName("")))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                        }
                        jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                        java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                        if (obj3 == null) {
                            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.view.MotionEvent.axisFromString(""), 212 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                        }
                        ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                    } catch (java.lang.Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                        }
                    }
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
                char[] cArr = new char[i2];
                getcvmmodel.valueOf = 0;
                $11 = ($10 + 117) % 128;
                while (getcvmmodel.valueOf < i2) {
                    $10 = ($11 + 31) % 128;
                    cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                    java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.view.KeyEvent.normalizeMetaState(0), 211 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > j ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == j ? 0 : -1))))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
                    }
                    ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                    j = -1;
                }
                objArr[0] = new java.lang.String(cArr);
            }

            @Override // com.payair.hce.setMobilePin
            public final com.payair.hce.getReasonCode<com.payair.hce.transactionCanBeResumed> valueOf() {
                com.payair.hce.deviceAuthenticationCompleted deviceauthenticationcompleted = new com.payair.hce.deviceAuthenticationCompleted((byte) 0);
                int i = writeReplace + 83;
                values = i % 128;
                if (i % 2 != 0) {
                    return deviceauthenticationcompleted;
                }
                throw null;
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                init$0();
                writeReplace = 0;
                values = 1;
                AlternateContactlessPaymentDataJson = new char[]{24270, 63823, 4567, 43127, 49400, 6912, 45983, 51811, 25276, 48446, 54605, 28097, 33890, 56567, 30495, 36819, 9740, 32430, 39229, 12625, 18898, 57457, 14575, 17911, 57979, 2808, 45947, 56280, kotlin.text.Typography.amp, 43176, 53531, 31107, 42511, 52840, 30435, 40791, 51144, 27677, 38060, 15638, 26001, 11218, 35923, 25803, 56683, 46564, 28188, 50819, 49023, 6048, 51234, 41041, 6365, 61822, 43499, 515, 64207, 21283, 2992, 60513, 17528, 15579, 38245, 19947, 9752, 40576, 30476, 12203, 32800, 30804, 53451, 35166, 25071, 55829, 45714, 15186, 40150, 29769, 52729, 42367, 30289, 53653, 14614, 32951, 59497, 13265, 39748, 58101, 19066, 38319, 64926, 17672, 44221, 62508, 24471, 42824, 3835, 22130, 45559, 6547, 24833, 51385, 4136, 31696, 49995, 10894, 29280, 56807, 24285, 63822, 4509, 43105, 49394, 6923, 45966, 51754, 25272, 48432, 54593, 28121, 33890, 24222};
                valueOf = 8029663860074150177L;
            }

            static void init$1() {
                $$d = new byte[]{35, -24, 78, -57};
                $$e = 40;
            }

            static void init$0() {
                $$a = new byte[]{69, -73, 121, 3, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, 19, -13, -11, 14, com.visa.cbp.getEncExpo.onUnminimized};
                $$b = 75;
            }

            /* JADX WARN: Code restructure failed: missing block: B:32:0x03bc, code lost:
            
                if (r0 != false) goto L39;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x058d, code lost:
            
                if (((((int) (r8 >> 32)) & (((((~((-1187907) | r5)) | (~((-1075954306) | r23))) * 988) + 1841161030) + ((((~(1780598673 | r23)) | (-1781786580)) | (~((-1075954306) | r5))) * 988))) | (((((((~(r5 | 1190554336)) | ((~((-1667186550) | r5)) | 554243349)) * 464) + 743726149) + (((-1112943201) | r23) * (-464))) + (((~(1190554336 | r23)) | 554243349) * 464)) & ((int) r8))) == 1) goto L71;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x0649, code lost:
            
                com.payair.hce.deviceAuthenticationCompleted.AnonymousClass5.writeReplace = (com.payair.hce.deviceAuthenticationCompleted.AnonymousClass5.values + 69) % 128;
                r4 = new java.lang.Object[]{new int[]{r23}, new int[]{r23 ^ 10}, null, new int[1]};
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x066b, code lost:
            
                r5 = new java.lang.Object[]{java.lang.Integer.valueOf(r24), r0, java.lang.Integer.valueOf(((((~((-37840449) | r23)) * 623) - 1907364318) + (((~r23) | 832870806) * (-623))) + (((~(r23 | 899979671)) | ((~((-104949314) | r23)) | 37840448)) * 623))};
                r0 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                r0 = r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x06a9, code lost:
            
                if (r0 != null) goto L75;
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x06ab, code lost:
            
                r0 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0) + 50, 2714 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                r1 = r10[14];
                r2 = (byte) (r1 + 1);
                r1 = r1;
                r9 = new java.lang.Object[1];
                a(r2, r1, (short) (r1 + 1), r9);
                r0 = r0.getMethod((java.lang.String) r9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, r0);
                r0 = r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x0707, code lost:
            
                ((int[]) r4[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r0).invoke(null, r5)).intValue();
             */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x070f, code lost:
            
                return r4;
             */
            /* JADX WARN: Code restructure failed: missing block: B:75:0x0647, code lost:
            
                if (r4.equals(((java.lang.String) r11[0]).intern()) != false) goto L71;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v60 */
            /* JADX WARN: Type inference failed for: r13v10 */
            /* JADX WARN: Type inference failed for: r13v11 */
            /* JADX WARN: Type inference failed for: r13v12 */
            /* JADX WARN: Type inference failed for: r13v14 */
            /* JADX WARN: Type inference failed for: r13v15 */
            /* JADX WARN: Type inference failed for: r13v19, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r13v34 */
            /* JADX WARN: Type inference failed for: r13v35 */
            /* JADX WARN: Type inference failed for: r13v36 */
            /* JADX WARN: Type inference failed for: r13v37 */
            /* JADX WARN: Type inference failed for: r13v7 */
            /* JADX WARN: Type inference failed for: r13v8 */
            /* JADX WARN: Type inference failed for: r13v9 */
            /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.reflect.Method] */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object[]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static java.lang.Object[] values(android.content.Context context, int i, int i2) {
                java.lang.Object[] objArr;
                ?? r13;
                java.lang.Integer num;
                try {
                    if (context == null) {
                        java.lang.Object[] objArr2 = {new int[]{i}, new int[]{i}, null, new int[1]};
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~((~i) | (-403021827))) * 433) - 1157523622) + (((~((-569401086) | i)) | (-435527900)) * (-433)) + (((~(i | (-435527900))) | (-972422912)) * 433))};
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        java.lang.Object obj2 = obj;
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2712, (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                            byte b = $$a[14];
                            byte b2 = (byte) (b + 1);
                            byte b3 = b;
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            a(b2, b3, (short) (b3 + 1), objArr4);
                            java.lang.reflect.Method method = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method);
                            obj2 = method;
                        }
                        ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                        return objArr2;
                    }
                    try {
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(android.view.ViewConfiguration.getTouchSlop() >> 8, (char) (android.os.Process.myPid() >> 22), 23 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr5);
                        java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr5[0]).intern());
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        b(22 - android.os.Process.getGidForName(""), (char) (6975 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 18, objArr6);
                        java.lang.Object invoke = cls2.getMethod(((java.lang.String) objArr6[0]).intern(), null).invoke(context, null);
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 41, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 29979), android.graphics.Color.alpha(0) + 34, objArr7);
                        java.lang.Class<?> cls3 = java.lang.Class.forName(((java.lang.String) objArr7[0]).intern());
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        b(75 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (26011 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 4, objArr8);
                        if ((cls3.getField(((java.lang.String) objArr8[0]).intern()).getInt(invoke) & 2) != 0) {
                            objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                            int i3 = ~i;
                            java.lang.Object[] objArr9 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((~(658045139 | i)) | (~((-346883846) | i3))) * 959) - 1239099831) + (((~(i3 | 658045139)) | (~((-346883846) | i))) * 959))};
                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            java.lang.Object obj4 = obj3;
                            if (obj3 == null) {
                                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 50, 2713 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                byte b4 = $$a[14];
                                byte b5 = (byte) (b4 + 1);
                                byte b6 = b4;
                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                a(b5, b6, (short) (b6 + 1), objArr10);
                                java.lang.reflect.Method method2 = cls4.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method2);
                                obj4 = method2;
                            }
                            ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr9)).intValue();
                        } else {
                            objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                            java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~(i | 1060870239)) | (-55941255)) * 56) + 313912472 + ((1060870239 | (~((-55941255) | (~i)))) * 56))};
                            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            java.lang.Object obj6 = obj5;
                            if (obj5 == null) {
                                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777166) - android.graphics.Color.rgb(0, 0, 0), (android.os.Process.myTid() >> 22) + 2713, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                byte b7 = $$a[14];
                                byte b8 = (byte) (b7 + 1);
                                byte b9 = b7;
                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                a(b8, b9, (short) (b9 + 1), objArr12);
                                java.lang.reflect.Method method3 = cls5.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method3);
                                obj6 = method3;
                            }
                            ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr11)).intValue();
                        }
                        if (((int[]) objArr[1])[0] != i) {
                            return objArr;
                        }
                        java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2058003131);
                        java.lang.Object obj8 = obj7;
                        if (obj7 == null) {
                            java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 33, 1738 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (5826 - android.view.View.getDefaultSize(0, 0)));
                            byte b10 = $$a[14];
                            byte b11 = (byte) (b10 + 1);
                            byte b12 = b10;
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            a(b11, b12, (short) (b12 + 1), objArr13);
                            java.lang.reflect.Method method4 = cls6.getMethod((java.lang.String) objArr13[0], null);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2058003131, method4);
                            obj8 = method4;
                        }
                        java.util.Set set = (java.util.Set) ((java.lang.reflect.Method) obj8).invoke(null, null);
                        java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 33, 1737 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (5827 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                        byte[] bArr = $$a;
                        byte b13 = bArr[14];
                        byte b14 = (byte) (b13 + 1);
                        byte b15 = b13;
                        short s = (short) (b15 + 1);
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        a(b14, b15, s, objArr14);
                        short s2 = s;
                        if (!set.contains(cls7.getField((java.lang.String) objArr14[0]).get(null))) {
                            java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), 1738 - (android.os.Process.myPid() >> 22), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 5825));
                            byte b16 = bArr[23];
                            ?? r132 = new java.lang.Object[1];
                            a(com.google.common.base.Ascii.GS, b16, (short) (b16 | com.google.common.base.Ascii.DC4), r132);
                            boolean contains = set.contains(cls8.getField((java.lang.String) r132[0]).get(null));
                            r13 = r132;
                            s2 = r132;
                        }
                        r13 = s2;
                        if (android.os.Build.VERSION.SDK_INT == 30) {
                            writeReplace = (values + 5) % 128;
                            java.lang.Object[] objArr15 = {new int[]{i}, new int[]{i}, null, new int[1]};
                            java.lang.Object[] objArr16 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((((~((-111696961) | i)) | 69730304) | r4) * (-470)) - 581566504) + (((~(i | (-41966657))) | (~((~i) | 935198680))) * 470))};
                            java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            java.lang.Object obj10 = obj9;
                            if (obj9 == null) {
                                java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.KeyEvent.normalizeMetaState(0), android.graphics.Color.rgb(0, 0, 0) + 16779929, (char) android.text.TextUtils.getTrimmedLength(""));
                                byte b17 = bArr[14];
                                byte b18 = (byte) (b17 + 1);
                                byte b19 = b17;
                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                a(b18, b19, (short) (b19 + 1), objArr17);
                                java.lang.reflect.Method method5 = cls9.getMethod((java.lang.String) objArr17[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method5);
                                obj10 = method5;
                            }
                            ((int[]) objArr15[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(null, objArr16)).intValue();
                            return objArr15;
                        }
                        try {
                            try {
                                if (android.os.Build.VERSION.SDK_INT > 33) {
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    r13 = 16;
                                    r13 = 16;
                                    b(80 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (10449 - android.graphics.Color.alpha(0)), 28 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr18);
                                    try {
                                        java.lang.Object[] objArr19 = {((java.lang.String) objArr18[0]).intern()};
                                        java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                        java.lang.Object obj12 = obj11;
                                        if (obj11 == null) {
                                            java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 36, android.view.View.MeasureSpec.getMode(0) + 3161, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 33098));
                                            byte b20 = (byte) (bArr[23] + 1);
                                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                                            a(b20, (byte) (b20 + 4), 653, objArr20);
                                            java.lang.reflect.Method method6 = cls10.getMethod((java.lang.String) objArr20[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, method6);
                                            obj12 = method6;
                                            r13 = java.lang.String.class;
                                        }
                                        long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj12).invoke(null, objArr19)).longValue();
                                        num = 16;
                                        long j = i;
                                        r13 = 0;
                                        long j2 = (~((~longValue) | (-503272556))) | (~(j | (-503272556)));
                                        long j3 = ((((((-495) * longValue) - 249119914725L) + (992 * j2)) + ((j2 | (~(((~j) | 503272555) | longValue))) * (-496))) + ((j | longValue) * 496)) - 1840940663;
                                        int i4 = ~i;
                                    } catch (java.lang.Throwable th) {
                                        java.lang.Throwable cause = th.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                } else {
                                    num = 16;
                                    r13 = 0;
                                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                                    b(107 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.text.TextUtils.getOffsetAfter("", 0), android.view.View.combineMeasuredStates(0, 0) + 13, objArr21);
                                    try {
                                        java.lang.Object[] objArr22 = {((java.lang.String) objArr21[0]).intern()};
                                        java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        java.lang.Object obj14 = obj13;
                                        if (obj13 == null) {
                                            java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 40, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1922, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                            byte b21 = (byte) (bArr[23] + 1);
                                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                                            a(b21, (byte) (b21 + 4), 653, objArr23);
                                            java.lang.reflect.Method method7 = cls11.getMethod((java.lang.String) objArr23[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, method7);
                                            obj14 = method7;
                                        }
                                        java.lang.Object invoke2 = ((java.lang.reflect.Method) obj14).invoke(null, objArr22);
                                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                                        b(121 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) android.graphics.Color.argb(0, 0, 0, 0), android.view.View.getDefaultSize(0, 0) + 1, objArr24);
                                    } catch (java.lang.Throwable th2) {
                                        java.lang.Throwable cause2 = th2.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th2;
                                    }
                                }
                            } catch (java.lang.Exception unused) {
                            }
                        } catch (java.lang.Exception unused2) {
                            r13 = 0;
                        }
                    } catch (java.lang.Throwable th3) {
                        java.lang.Throwable cause3 = th3.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th3;
                    }
                    java.lang.Object[] objArr25 = {new int[]{i}, new int[]{i}, null, new int[1]};
                    int i5 = ~i;
                    ?? r7 = {java.lang.Integer.valueOf(i2), r13, java.lang.Integer.valueOf(((((~((-270149411) | i5)) | r5) * 1150) - 1303619152) + (((~((-734779575) | i)) | (~(734779574 | i5))) * (-575)) + (((~(i | (-270149411))) | (~(i5 | 270149410))) * 575))};
                    java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    java.lang.Object obj16 = obj15;
                    if (obj15 == null) {
                        java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 51, 2713 - android.view.View.getDefaultSize(0, 0), (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)));
                        byte b22 = $$a[14];
                        byte b23 = (byte) (b22 + 1);
                        byte b24 = b22;
                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                        a(b23, b24, (short) (b24 + 1), objArr26);
                        java.lang.reflect.Method method8 = cls12.getMethod((java.lang.String) objArr26[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method8);
                        obj16 = method8;
                    }
                    ((int[]) objArr25[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj16).invoke(null, r7)).intValue();
                    return objArr25;
                } catch (java.lang.Throwable th4) {
                    java.lang.Throwable cause4 = th4.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th4;
                }
            }
        };
        int i = RecordsJson + 93;
        getProfileVersion = i % 128;
        if (i % 2 == 0) {
            return setmobilepin;
        }
        throw null;
    }

    @Override // com.payair.hce.getReasonCode
    public final void valueOf(com.payair.hce.transactionCanBeResumed transactioncanberesumed) throws com.payair.hce.postToastMessageOnUi {
        int i = getProfileVersion + 125;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            super.valueOf(transactioncanberesumed);
            super.AlternateContactlessPaymentDataJson(transactioncanberesumed);
        } else {
            super.valueOf(transactioncanberesumed);
            super.AlternateContactlessPaymentDataJson(transactioncanberesumed);
            throw new java.lang.ArithmeticException();
        }
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = $11;
        int i3 = i2 + 73;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            int i4 = i2 + 15;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            cArr = str.toCharArray();
            $11 = ($10 + 85) % 128;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr3 = new char[cArr2.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr4 = new char[2];
        $11 = ($10 + 17) % 128;
        while (getproducttype.AlternateContactlessPaymentDataJson < cArr2.length) {
            cArr4[0] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
            cArr4[1] = cArr2[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i5 = 58224;
            for (int i6 = 0; i6 < 16; i6++) {
                char c = cArr4[1];
                char c2 = cArr4[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (AlternateContactlessPaymentDataJson ^ 2144259807102049818L))) ^ r15), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(values)};
                    int i7 = c2 + i5;
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - android.graphics.Color.alpha(0), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1336, (char) android.view.View.MeasureSpec.getMode(0));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(-1, (short) 0, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr4[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (valueOf ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(DigitizedCardProfile)};
                    int i8 = charValue + i5;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 62, android.graphics.Color.red(0) + 1335, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(-1, (short) 0, (byte) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i5 -= 40503;
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
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 3543, (char) android.text.TextUtils.indexOf("", ""))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr3, 0, i);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getProfileVersion = 0;
        RecordsJson = 1;
        valueOf = (char) 22281;
        DigitizedCardProfile = (char) 848;
        AlternateContactlessPaymentDataJson = (char) 25041;
        values = (char) 6999;
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.SI, -9, -99, 67};
        $$b = 45;
    }
}
