package com.payair.hce.communication;

/* loaded from: classes4.dex */
public class MDESInstanceIDListenerService extends com.google.firebase.messaging.FirebaseMessagingService {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static char AlternateContactlessPaymentDataJson;
    private static char[] DigitizedCardProfile;
    private static final java.lang.String TAG;
    private static int getProfileVersion;
    private static int[] valueOf;
    private static int values;
    private static int writeReplace;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0023). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, byte b2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3;
        ?? r7 = 119 - b;
        byte[] bArr = $$a;
        int i4 = 42 - b2;
        int i5 = 79 - s;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            byte b3 = r7;
            i3 = 0;
            int i6 = i5;
            i5++;
            int i7 = (i6 + (-b3)) - 2;
            i = i3;
            i2 = i7;
            i3 = i + 1;
            bArr2[i] = i2 == true ? (byte) 1 : (byte) 0;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            b3 = bArr[i5];
            i6 = i2;
            i5++;
            int i72 = (i6 + (-b3)) - 2;
            i = i3;
            i2 = i72;
            i3 = i + 1;
            bArr2[i] = i2 == true ? (byte) 1 : (byte) 0;
            if (i3 == i4) {
            }
        } else {
            i = 0;
            i2 = r7;
            i3 = i + 1;
            bArr2[i] = i2 == true ? (byte) 1 : (byte) 0;
            if (i3 == i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(short s, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        byte[] bArr = $$d;
        int i5 = i + 4;
        byte[] bArr2 = new byte[s + 6];
        int i6 = s + 5;
        if (bArr == null) {
            int i7 = i6;
            i4 = i5;
            i3 = 0;
            i5 = (i5 + i7) - 1;
            i4++;
            bArr2[i3] = (byte) i5;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i4];
            i3++;
            i5 = (i5 + i7) - 1;
            i4++;
            bArr2[i3] = (byte) i5;
            if (i3 == i6) {
            }
        } else {
            int i8 = i2 + 65;
            i3 = 0;
            i4 = i5;
            i5 = i8;
            bArr2[i3] = (byte) i5;
            if (i3 == i6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void f(short s, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3 = s * 3;
        byte[] bArr = $$g;
        int i4 = 115 - i;
        int i5 = 4 - (b * 4);
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i4 += i5;
            i5 = i6 + 1;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i8 = i2 + 1;
            i6 = i5;
            i5 = bArr[i5];
            i7 = i8;
            i4 += i5;
            i5 = i6 + 1;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
            }
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        writeReplace = 0;
        getProfileVersion = 1;
        DigitizedCardProfile();
        valueOf();
        TAG = "MDESInstanceIDListenerService";
        int i = writeReplace + 12;
        int i2 = (~i) + (i << 1);
        getProfileVersion = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(java.lang.String str) {
        int i = writeReplace;
        int i2 = (i & (-108)) | ((~i) & 107);
        int i3 = -(-((i & 107) << 1));
        getProfileVersion = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        sendUpdateRNSInformation(null, com.payair.hce.TokenType.MDES);
        int i4 = getProfileVersion + 27;
        writeReplace = i4 % 128;
        if (i4 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private com.payair.hce.communication.JsonResponse sendUpdateRNSInformation(java.lang.String str, com.payair.hce.TokenType tokenType) {
        if (str == null || str.isEmpty()) {
            final java.lang.Object obj = new java.lang.Object();
            com.google.android.gms.tasks.Task<java.lang.String> addOnCompleteListener = com.google.firebase.messaging.FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.payair.hce.communication.MDESInstanceIDListenerService$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(com.google.android.gms.tasks.Task task) {
                    com.payair.hce.communication.MDESInstanceIDListenerService.lambda$sendUpdateRNSInformation$0(obj, task);
                }
            });
            try {
                synchronized (obj) {
                    while (!addOnCompleteListener.isComplete()) {
                        obj.wait();
                    }
                }
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
            }
            return _sendUpdateRNSInformation(addOnCompleteListener.getResult(), tokenType);
        }
        return _sendUpdateRNSInformation(str, tokenType);
    }

    static /* synthetic */ void lambda$sendUpdateRNSInformation$0(java.lang.Object obj, com.google.android.gms.tasks.Task task) {
        task.isSuccessful();
        synchronized (obj) {
            obj.notify();
        }
    }

    private com.payair.hce.communication.JsonResponse _sendUpdateRNSInformation(java.lang.String str, com.payair.hce.TokenType tokenType) {
        com.payair.hce.communication.JsonResponse jsonResponse;
        int i = getProfileVersion;
        int i2 = i & 53;
        int i3 = (i | 53) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 & i4) + (i3 | i4);
        writeReplace = i5 % 128;
        if (i5 % 2 == 0) {
            if (((java.lang.Boolean) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 1486464230, -1486464227, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
                jsonResponse = (com.payair.hce.communication.JsonResponse) com.payair.hce.setScrollBarSize.DigitizedCardProfile(new java.lang.Object[]{new com.payair.hce.setBackgroundDrawable(tokenType, str)}, -1910008065, 1910008085, (int) java.lang.System.currentTimeMillis());
                int i6 = getProfileVersion;
                writeReplace = ((((i6 ^ 117) | (i6 & 117)) << 1) - ((i6 & (-118)) | ((~i6) & 117))) % 128;
            } else {
                jsonResponse = (com.payair.hce.communication.JsonResponse) com.payair.hce.setScrollBarSize.DigitizedCardProfile(new java.lang.Object[]{new com.payair.hce.setBackgroundTintList(str)}, 1365278937, -1365278924, (int) java.lang.System.currentTimeMillis());
                int i7 = writeReplace;
                int i8 = i7 & 111;
                int i9 = i7 | 111;
                getProfileVersion = ((i8 & i9) + (i9 | i8)) % 128;
            }
            if (jsonResponse != null) {
                int i10 = writeReplace ^ 71;
                getProfileVersion = (((((r8 & 71) | i10) << 1) - (~(-i10))) - 1) % 128;
                jsonResponse.isSuccessful();
                int i11 = writeReplace;
                int i12 = i11 & 1;
                int i13 = (i11 ^ 1) | i12;
                getProfileVersion = ((i12 ^ i13) + ((i13 & i12) << 1)) % 128;
            }
            int i14 = getProfileVersion;
            int i15 = (-2) - (~((i14 ^ 44) + ((i14 & 44) << 1)));
            writeReplace = i15 % 128;
            if (i15 % 2 == 0) {
                return jsonResponse;
            }
            throw null;
        }
        throw null;
    }

    public com.payair.hce.communication.JsonResponse updateRNSInformation(java.lang.String str, com.payair.hce.TokenType tokenType) {
        int i = getProfileVersion + 93;
        writeReplace = i % 128;
        com.payair.hce.communication.JsonResponse sendUpdateRNSInformation = sendUpdateRNSInformation(str, tokenType);
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i2 = getProfileVersion;
        int i3 = i2 & 107;
        int i4 = ((i2 ^ 107) | i3) << 1;
        int i5 = -((i2 | 107) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        writeReplace = i6 % 128;
        if (i6 % 2 == 0) {
            return sendUpdateRNSInformation;
        }
        throw null;
    }

    private static void b(int[] iArr, int i, java.lang.Object[] objArr) {
        int length;
        int[] iArr2;
        int i2;
        int[] iArr3;
        int i3;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = valueOf;
        char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        int i4 = 1;
        int i5 = 0;
        if (iArr4 != null) {
            int length2 = iArr4.length;
            int[] iArr5 = new int[length2];
            int i6 = 0;
            while (i6 < length2) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i4];
                    objArr2[0] = java.lang.Integer.valueOf(iArr4[i6]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('K' - android.text.AndroidCharacter.getMirror(c), 28 - android.text.TextUtils.lastIndexOf("", c, 0), (char) android.text.TextUtils.indexOf("", "", 0, 0))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                    }
                    iArr5[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    i6++;
                    c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                    i4 = 1;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i7 = $11 + 29;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 3 / 2;
            }
            iArr4 = iArr5;
        }
        int length3 = iArr4.length;
        int[] iArr6 = new int[length3];
        int[] iArr7 = valueOf;
        if (iArr7 != null) {
            int i9 = $10 + 5;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                length = iArr7.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr7.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(iArr7[i2])};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj2 == null) {
                    iArr3 = iArr7;
                    i3 = length;
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.text.TextUtils.indexOf("", "", 0, 0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 30, (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                } else {
                    iArr3 = iArr7;
                    i3 = length;
                }
                iArr2[i2] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                i2++;
                iArr7 = iArr3;
                length = i3;
                i5 = 0;
            }
            iArr7 = iArr2;
        }
        int i10 = i5;
        java.lang.System.arraycopy(iArr7, i10, iArr6, i10, length3);
        istransitsupported.valueOf = i10;
        $11 = ($10 + 63) % 128;
        while (istransitsupported.valueOf < iArr.length) {
            cArr[0] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr6);
            int i11 = 0;
            while (i11 < 16) {
                int i12 = $11 + 5;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    istransitsupported.DigitizedCardProfile ^= iArr6[i11];
                    java.lang.Object[] objArr4 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 5088, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                    istransitsupported.DigitizedCardProfile = istransitsupported.values;
                    istransitsupported.values = intValue;
                    i11 += 43;
                } else {
                    istransitsupported.DigitizedCardProfile ^= iArr6[i11];
                    java.lang.Object[] objArr5 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (-16772128) - android.graphics.Color.rgb(0, 0, 0), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj4);
                    }
                    int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue();
                    istransitsupported.DigitizedCardProfile = istransitsupported.values;
                    istransitsupported.values = intValue2;
                    i11++;
                }
            }
            int i13 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i13;
            istransitsupported.values ^= iArr6[16];
            istransitsupported.DigitizedCardProfile ^= iArr6[17];
            int i14 = istransitsupported.DigitizedCardProfile;
            int i15 = istransitsupported.values;
            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr[2] = (char) (istransitsupported.values >>> 16);
            cArr[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr6);
            cArr2[istransitsupported.valueOf * 2] = cArr[0];
            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
            java.lang.Object[] objArr6 = {istransitsupported, istransitsupported};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj5 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 48, android.text.TextUtils.getCapsMode("", 0, 0) + 2923, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 3036));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                f((short) 0, 49, (byte) 0, objArr7);
                obj5 = cls.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    private static void e(int i, int i2, java.lang.String str, boolean z, int i3, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr = new char[i2];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i2) {
            $11 = ($10 + 111) % 128;
            digitizedCardJson11.values = charArray[digitizedCardJson11.DigitizedCardProfile];
            cArr[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i4 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4]), java.lang.Integer.valueOf(values)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 43, android.view.Gravity.getAbsoluteGravity(0, 0) + 2073, (char) (android.graphics.Color.red(0) + 60037));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    f((short) 0, 0, (byte) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.graphics.Color.blue(0), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3543, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
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
            $10 = ($11 + 17) % 128;
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i3;
            char[] cArr2 = new char[i2];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i2);
            java.lang.System.arraycopy(cArr2, 0, cArr, i2 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr2, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr, 0, i2 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            char[] cArr3 = new char[i2];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i2) {
                cArr3[digitizedCardJson11.DigitizedCardProfile] = cArr[(i2 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 3544 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                $10 = ($11 + 37) % 128;
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static void c(int i, byte b, java.lang.String str, java.lang.Object[] objArr) {
        char[] cArr;
        int i2;
        char c;
        int i3 = $11;
        int i4 = i3 + 65;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            int i5 = i3 + 117;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr3 = DigitizedCardProfile;
        double d = 0.0d;
        char c2 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        int i6 = 1;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i6];
                    objArr2[0] = java.lang.Integer.valueOf(cArr3[i7]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == d ? 0 : -1)), android.graphics.Color.green(0) + 2508, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 6803));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        f((short) 0, 50, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr4[i7] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i7++;
                    d = 0.0d;
                    i6 = 1;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        long j = 0;
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.getTrimmedLength(""), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2507, (char) (6801 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            f((short) 0, 50, (byte) 0, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr5[i2] = (char) (cArr2[i2] - b);
            $10 = ($11 + 35) % 128;
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                $10 = ($11 + 79) % 128;
                digitizedCardJson12.valueOf = cArr2[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = cArr2[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    cArr5[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr5[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                    c = c2;
                } else {
                    java.lang.Object[] objArr6 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 3596 - (android.os.Process.myPid() >> 22), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > j ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) - 1))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj3);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj4 == null) {
                            int absoluteGravity = android.view.Gravity.getAbsoluteGravity(0, 0);
                            c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - absoluteGravity, 2665 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 18889));
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            f((short) 0, 42, (byte) 0, objArr8);
                            obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj4);
                        } else {
                            c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue();
                        int i8 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i9 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr5[digitizedCardJson12.values] = cArr3[intValue];
                        cArr5[digitizedCardJson12.values + 1] = cArr3[(i8 * charValue) + i9];
                    } else {
                        c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                        if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                            digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                            digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                            int i10 = digitizedCardJson12.DigitizedCardProfile;
                            int i11 = digitizedCardJson12.RecordsJson;
                            int i12 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i13 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            cArr5[digitizedCardJson12.values] = cArr3[(i10 * charValue) + i11];
                            cArr5[digitizedCardJson12.values + 1] = cArr3[(i12 * charValue) + i13];
                        } else {
                            int i14 = digitizedCardJson12.DigitizedCardProfile;
                            int i15 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            int i16 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i17 = digitizedCardJson12.RecordsJson;
                            cArr5[digitizedCardJson12.values] = cArr3[(i14 * charValue) + i15];
                            cArr5[digitizedCardJson12.values + 1] = cArr3[(i16 * charValue) + i17];
                        }
                    }
                }
                digitizedCardJson12.values += 2;
                c2 = c;
                j = 0;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            $10 = ($11 + 117) % 128;
            cArr5[i18] = (char) (cArr5[i18] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x06ad A[Catch: all -> 0x095d, TryCatch #2 {all -> 0x095d, blocks: (B:9:0x00f0, B:11:0x0107, B:12:0x013d, B:13:0x01d1, B:17:0x034c, B:19:0x0360, B:20:0x0396, B:29:0x0542, B:31:0x0561, B:32:0x059a, B:33:0x063a, B:37:0x07db, B:39:0x07f3, B:40:0x0830, B:46:0x08dc, B:48:0x08f4, B:49:0x092b, B:58:0x05dd, B:60:0x05f8, B:61:0x0634, B:63:0x068b, B:65:0x06ad, B:66:0x06ff, B:78:0x0417, B:80:0x042b, B:81:0x0465, B:83:0x017d, B:85:0x0194, B:86:0x01cb, B:88:0x0222, B:90:0x023c, B:91:0x0272), top: B:2:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03a5  */
    @Override // com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.EnhancedIntentService, android.app.Service, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void attachBaseContext(android.content.Context context) {
        java.lang.Object[] DigitizedCardProfile$4956fc2a;
        int i;
        long j;
        java.lang.Object obj;
        java.lang.Object[] objArr;
        int i2;
        java.lang.Object invoke;
        java.lang.Object invoke2;
        getProfileVersion = (writeReplace + 25) % 128;
        super.attachBaseContext(context);
        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0) + 44, 922 - android.graphics.Color.red(0), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
        byte[] bArr = $$a;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a((short) 75, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[116], objArr2);
        long j2 = cls.getField((java.lang.String) objArr2[0]).getLong(null);
        try {
            try {
                try {
                    try {
                        if (j2 != -1) {
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            b(new int[]{1259184018, 220912235, 1985433850, -1426474764, 1988202925, 120071422, -31948583, -1375404292, -344157851, 415247846, 689816940, 1580421375}, 21 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr3);
                            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr3[0]);
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            c((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14, (byte) (android.graphics.Color.red(0) + 100), "\u0001\u001f\u0016\u0017\r \u0000\u0015!\u0013\u001d\u0013\u0019\u0014㙣", objArr4);
                            if (j2 + 4611686018427387754L >= ((java.lang.Long) cls2.getDeclaredMethod((java.lang.String) objArr4[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                int i3 = writeReplace + 113;
                                getProfileVersion = i3 % 128;
                                if (i3 % 2 == 0) {
                                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 44, 922 - android.graphics.Color.red(0), (char) (android.view.MotionEvent.axisFromString("") + 1));
                                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                                    a((short) 56, bArr[18], (byte) (-bArr[17]), objArr5);
                                    java.lang.Object[] objArr6 = {cls3.getField((java.lang.String) objArr5[0]).get(null), -275039665, 0};
                                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                    if (obj2 == null) {
                                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - android.text.TextUtils.getOffsetBefore("", 0), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4860, (char) android.view.View.MeasureSpec.getMode(0))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj2);
                                    }
                                    invoke2 = ((java.lang.reflect.Method) obj2).invoke(null, objArr6);
                                } else {
                                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), android.graphics.Color.alpha(0) + 922, (char) android.view.View.resolveSize(0, 0));
                                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                                    a((short) 56, bArr[18], (byte) (-bArr[17]), objArr7);
                                    java.lang.Object[] objArr8 = {cls4.getField((java.lang.String) objArr7[0]).get(null), -275039665, 0};
                                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                    if (obj3 == null) {
                                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 45, 4860 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj3);
                                    }
                                    invoke2 = ((java.lang.reflect.Method) obj3).invoke(null, objArr8);
                                }
                                DigitizedCardProfile$4956fc2a = (java.lang.Object[]) invoke2;
                                i = ((int[]) DigitizedCardProfile$4956fc2a[1])[0];
                                if (((int[]) DigitizedCardProfile$4956fc2a[0])[0] != i) {
                                    java.lang.Object[] objArr9 = {DigitizedCardProfile$4956fc2a, java.lang.Integer.valueOf(((int[]) DigitizedCardProfile$4956fc2a[3])[0]), 0};
                                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                    if (obj4 == null) {
                                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.KeyEvent.getMaxKeyCode() >> 16) + 45, android.view.View.combineMeasuredStates(0, 0) + 4860, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj4);
                                    }
                                    ((java.lang.reflect.Method) obj4).invoke(null, objArr9);
                                    getProfileVersion = (writeReplace + 53) % 128;
                                } else {
                                    new java.util.ArrayList().add((java.lang.String) DigitizedCardProfile$4956fc2a[2]);
                                    try {
                                        java.lang.Object[] objArr10 = {java.lang.Long.valueOf((i ^ r9) ^ (-6686461148620914688L)), -1556813055L};
                                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                                        d((byte) (-$$d[496]), r8[0], r8[152], objArr11);
                                        java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                                        d(r8[28], r8[26], r8[145], objArr12);
                                        cls5.getMethod((java.lang.String) objArr12[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr10);
                                        java.lang.Object[] objArr13 = {DigitizedCardProfile$4956fc2a, java.lang.Integer.valueOf(((int[]) DigitizedCardProfile$4956fc2a[3])[0]), 0};
                                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                        if (obj5 == null) {
                                            obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 4859, (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj5);
                                        }
                                        ((java.lang.reflect.Method) obj5).invoke(null, objArr13);
                                    } catch (java.lang.Throwable th) {
                                        java.lang.Throwable cause = th.getCause();
                                        if (cause == null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                }
                                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.widget.ExpandableListView.getPackedPositionGroup(0L), android.widget.ExpandableListView.getPackedPositionChild(0L) + 708, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 34283));
                                byte b = bArr[18];
                                java.lang.Object[] objArr14 = new java.lang.Object[1];
                                a((short) 51, b, (byte) (b | 34), objArr14);
                                j = cls6.getField((java.lang.String) objArr14[0]).getLong(null);
                                if (j != -1) {
                                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                                    b(new int[]{1259184018, 220912235, 1985433850, -1426474764, 1988202925, 120071422, -31948583, -1375404292, -344157851, 415247846, 689816940, 1580421375}, 21 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr15);
                                    java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr15[0]);
                                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                                    c(15 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 101), "\u0001\u001f\u0016\u0017\r \u0000\u0015!\u0013\u001d\u0013\u0019\u0014㙣", objArr16);
                                    if (j + 1928 >= ((java.lang.Long) cls7.getDeclaredMethod((java.lang.String) objArr16[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                        int i4 = writeReplace + 23;
                                        getProfileVersion = i4 % 128;
                                        if (i4 % 2 == 0) {
                                            java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 47, android.view.KeyEvent.getDeadChar(0, 0) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 34285));
                                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                                            a((byte) (-bArr[45]), bArr[5], bArr[3], objArr17);
                                            java.lang.Object[] objArr18 = {cls8.getField((java.lang.String) objArr17[0]).get(null), 1183480915, 1};
                                            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                            if (obj6 == null) {
                                                obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 33, 4717 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) android.view.View.MeasureSpec.getMode(0))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj6);
                                            }
                                            invoke = ((java.lang.reflect.Method) obj6).invoke(null, objArr18);
                                        } else {
                                            java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 48, 706 - android.os.Process.getGidForName(""), (char) (34284 - android.graphics.Color.green(0)));
                                            java.lang.Object[] objArr19 = new java.lang.Object[1];
                                            a((byte) (-bArr[45]), bArr[5], bArr[3], objArr19);
                                            java.lang.Object[] objArr20 = {cls9.getField((java.lang.String) objArr19[0]).get(null), 1183480915, 0};
                                            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                            if (obj7 == null) {
                                                obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), android.os.Process.getGidForName("") + 4718, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj7);
                                            }
                                            invoke = ((java.lang.reflect.Method) obj7).invoke(null, objArr20);
                                        }
                                        objArr = (java.lang.Object[]) invoke;
                                        i2 = ((int[]) objArr[1])[0];
                                        if (((int[]) objArr[0])[0] == i2) {
                                            java.lang.Object[] objArr21 = {objArr, java.lang.Integer.valueOf(((int[]) objArr[9])[0]), 0};
                                            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                            if (obj8 == null) {
                                                obj8 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 33, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 4718, (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj8);
                                            }
                                            ((java.lang.reflect.Method) obj8).invoke(null, objArr21);
                                            return;
                                        }
                                        java.util.ArrayList arrayList = new java.util.ArrayList();
                                        arrayList.add((java.lang.String) objArr[2]);
                                        arrayList.add((java.lang.String) objArr[3]);
                                        arrayList.add((java.lang.String) objArr[4]);
                                        arrayList.add((java.lang.String) objArr[5]);
                                        arrayList.add((java.lang.String) objArr[6]);
                                        arrayList.add((java.lang.String) objArr[7]);
                                        arrayList.add((java.lang.String) objArr[8]);
                                        java.lang.Object[] objArr22 = {java.lang.Long.valueOf((i2 ^ r7) ^ 518223044469063680L), 120658204L};
                                        byte[] bArr2 = $$d;
                                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                                        d(bArr2[295], bArr2[307], bArr2[152], objArr23);
                                        java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                                        d(bArr2[28], bArr2[26], bArr2[145], objArr24);
                                        cls10.getMethod((java.lang.String) objArr24[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr22);
                                        java.lang.Object[] objArr25 = {objArr, java.lang.Integer.valueOf(((int[]) objArr[9])[0]), 0};
                                        java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                        if (obj9 == null) {
                                            obj9 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 33, android.graphics.Color.alpha(0) + 4717, (char) android.text.TextUtils.getTrimmedLength(""))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj9);
                                        }
                                        ((java.lang.reflect.Method) obj9).invoke(null, objArr25);
                                        return;
                                    }
                                }
                                java.lang.Object[] objArr26 = new java.lang.Object[1];
                                c(android.widget.ExpandableListView.getPackedPositionChild(0L) + 17, (byte) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 40), "\u000f\u0012\t\u0017\u0013\u001f\u0012!\u0007\u0010\u001e\u001a\u0011\u0014\u0001\u0019", objArr26);
                                java.lang.Class<?> cls11 = java.lang.Class.forName((java.lang.String) objArr26[0]);
                                java.lang.Object[] objArr27 = new java.lang.Object[1];
                                b(new int[]{-6581947, -1225270774, 2147458136, 1982756026, 1535269932, -2024913294, -27860065, -1982856012}, 16 - android.text.TextUtils.indexOf("", "", 0, 0), objArr27);
                                java.lang.Object[] objArr28 = {java.lang.Integer.valueOf(((java.lang.Integer) cls11.getMethod((java.lang.String) objArr27[0], java.lang.Object.class).invoke(null, this)).intValue()), 0, 1183480915};
                                obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
                                if (obj == null) {
                                    java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 46, 708 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (34284 - android.text.TextUtils.indexOf("", "")));
                                    byte b2 = bArr[18];
                                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                                    a((short) 51, b2, (byte) (b2 | 34), objArr29);
                                    obj = cls12.getMethod((java.lang.String) objArr29[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1346294939, obj);
                                }
                                objArr = (java.lang.Object[]) ((java.lang.reflect.Method) obj).invoke(null, objArr28);
                                java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString("") + 47, 708 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (34284 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))));
                                java.lang.Object[] objArr30 = new java.lang.Object[1];
                                a((byte) (-bArr[45]), bArr[5], bArr[3], objArr30);
                                cls13.getField((java.lang.String) objArr30[0]).set(null, objArr);
                                java.lang.Object[] objArr31 = new java.lang.Object[1];
                                b(new int[]{1259184018, 220912235, 1985433850, -1426474764, 1988202925, 120071422, -31948583, -1375404292, -344157851, 415247846, 689816940, 1580421375}, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 22, objArr31);
                                java.lang.Class<?> cls14 = java.lang.Class.forName((java.lang.String) objArr31[0]);
                                java.lang.Object[] objArr32 = new java.lang.Object[1];
                                c(15 - android.view.KeyEvent.normalizeMetaState(0), (byte) (android.widget.ExpandableListView.getPackedPositionType(0L) + 100), "\u0001\u001f\u0016\u0017\r \u0000\u0015!\u0013\u001d\u0013\u0019\u0014㙣", objArr32);
                                long longValue = ((java.lang.Long) cls14.getDeclaredMethod((java.lang.String) objArr32[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.text.TextUtils.indexOf("", "", 0) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) (34284 - android.text.TextUtils.getOffsetAfter("", 0)));
                                byte b3 = bArr[18];
                                java.lang.Object[] objArr33 = new java.lang.Object[1];
                                a((short) 51, b3, (byte) (b3 | 34), objArr33);
                                cls15.getField((java.lang.String) objArr33[0]).set(null, java.lang.Long.valueOf(longValue));
                                i2 = ((int[]) objArr[1])[0];
                                if (((int[]) objArr[0])[0] == i2) {
                                }
                            }
                        }
                        java.lang.Object[] objArr312 = new java.lang.Object[1];
                        b(new int[]{1259184018, 220912235, 1985433850, -1426474764, 1988202925, 120071422, -31948583, -1375404292, -344157851, 415247846, 689816940, 1580421375}, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 22, objArr312);
                        java.lang.Class<?> cls142 = java.lang.Class.forName((java.lang.String) objArr312[0]);
                        java.lang.Object[] objArr322 = new java.lang.Object[1];
                        c(15 - android.view.KeyEvent.normalizeMetaState(0), (byte) (android.widget.ExpandableListView.getPackedPositionType(0L) + 100), "\u0001\u001f\u0016\u0017\r \u0000\u0015!\u0013\u001d\u0013\u0019\u0014㙣", objArr322);
                        long longValue2 = ((java.lang.Long) cls142.getDeclaredMethod((java.lang.String) objArr322[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        java.lang.Class cls152 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.text.TextUtils.indexOf("", "", 0) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) (34284 - android.text.TextUtils.getOffsetAfter("", 0)));
                        byte b32 = bArr[18];
                        java.lang.Object[] objArr332 = new java.lang.Object[1];
                        a((short) 51, b32, (byte) (b32 | 34), objArr332);
                        cls152.getField((java.lang.String) objArr332[0]).set(null, java.lang.Long.valueOf(longValue2));
                        i2 = ((int[]) objArr[1])[0];
                        if (((int[]) objArr[0])[0] == i2) {
                        }
                    } catch (java.lang.Exception unused) {
                        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                    }
                    java.lang.Object[] objArr34 = new java.lang.Object[1];
                    b(new int[]{1259184018, 220912235, 1985433850, -1426474764, 1988202925, 120071422, -31948583, -1375404292, -344157851, 415247846, 689816940, 1580421375}, android.graphics.Color.red(0) + 22, objArr34);
                    java.lang.Class<?> cls16 = java.lang.Class.forName((java.lang.String) objArr34[0]);
                    java.lang.Object[] objArr35 = new java.lang.Object[1];
                    c((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 15, (byte) (99 - android.graphics.ImageFormat.getBitsPerPixel(0)), "\u0001\u001f\u0016\u0017\r \u0000\u0015!\u0013\u001d\u0013\u0019\u0014㙣", objArr35);
                    long longValue3 = ((java.lang.Long) cls16.getDeclaredMethod((java.lang.String) objArr35[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 44, 921 - android.view.MotionEvent.axisFromString(""), (char) android.graphics.Color.red(0));
                    java.lang.Object[] objArr36 = new java.lang.Object[1];
                    a((short) 75, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[116], objArr36);
                    cls17.getField((java.lang.String) objArr36[0]).set(null, java.lang.Long.valueOf(longValue3));
                    writeReplace = (getProfileVersion + 103) % 128;
                    i = ((int[]) DigitizedCardProfile$4956fc2a[1])[0];
                    if (((int[]) DigitizedCardProfile$4956fc2a[0])[0] != i) {
                    }
                    java.lang.Class cls62 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.widget.ExpandableListView.getPackedPositionGroup(0L), android.widget.ExpandableListView.getPackedPositionChild(0L) + 708, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 34283));
                    byte b4 = bArr[18];
                    java.lang.Object[] objArr142 = new java.lang.Object[1];
                    a((short) 51, b4, (byte) (b4 | 34), objArr142);
                    j = cls62.getField((java.lang.String) objArr142[0]).getLong(null);
                    if (j != -1) {
                    }
                    java.lang.Object[] objArr262 = new java.lang.Object[1];
                    c(android.widget.ExpandableListView.getPackedPositionChild(0L) + 17, (byte) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 40), "\u000f\u0012\t\u0017\u0013\u001f\u0012!\u0007\u0010\u001e\u001a\u0011\u0014\u0001\u0019", objArr262);
                    java.lang.Class<?> cls112 = java.lang.Class.forName((java.lang.String) objArr262[0]);
                    java.lang.Object[] objArr272 = new java.lang.Object[1];
                    b(new int[]{-6581947, -1225270774, 2147458136, 1982756026, 1535269932, -2024913294, -27860065, -1982856012}, 16 - android.text.TextUtils.indexOf("", "", 0, 0), objArr272);
                    java.lang.Object[] objArr282 = {java.lang.Integer.valueOf(((java.lang.Integer) cls112.getMethod((java.lang.String) objArr272[0], java.lang.Object.class).invoke(null, this)).intValue()), 0, 1183480915};
                    obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
                    if (obj == null) {
                    }
                    objArr = (java.lang.Object[]) ((java.lang.reflect.Method) obj).invoke(null, objArr282);
                    java.lang.Class cls132 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString("") + 47, 708 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (34284 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))));
                    java.lang.Object[] objArr302 = new java.lang.Object[1];
                    a((byte) (-bArr[45]), bArr[5], bArr[3], objArr302);
                    cls132.getField((java.lang.String) objArr302[0]).set(null, objArr);
                } catch (java.lang.Exception unused2) {
                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                }
                java.lang.Object[] objArr37 = new java.lang.Object[1];
                c(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 17, (byte) (40 - android.text.TextUtils.indexOf("", "", 0, 0)), "\u000f\u0012\t\u0017\u0013\u001f\u0012!\u0007\u0010\u001e\u001a\u0011\u0014\u0001\u0019", objArr37);
                java.lang.Class<?> cls18 = java.lang.Class.forName((java.lang.String) objArr37[0]);
                java.lang.Object[] objArr38 = new java.lang.Object[1];
                b(new int[]{-6581947, -1225270774, 2147458136, 1982756026, 1535269932, -2024913294, -27860065, -1982856012}, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 17, objArr38);
                int intValue = ((java.lang.Integer) cls18.getMethod((java.lang.String) objArr38[0], java.lang.Object.class).invoke(null, this)).intValue();
                java.lang.Object[] objArr39 = {222708095};
                java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                if (obj10 == null) {
                    obj10 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 873, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 15954))).getDeclaredConstructor(java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1647138923, obj10);
                }
                DigitizedCardProfile$4956fc2a = com.payair.hce.setUserValidationRequestListener.AnonymousClass2.DigitizedCardProfile$4956fc2a(intValue, ((java.lang.reflect.Constructor) obj10).newInstance(objArr39));
                java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName("") + 45, 922 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                java.lang.Object[] objArr40 = new java.lang.Object[1];
                a((short) 56, bArr[18], (byte) (-bArr[17]), objArr40);
                cls19.getField((java.lang.String) objArr40[0]).set(null, DigitizedCardProfile$4956fc2a);
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        } catch (java.lang.Throwable th3) {
            java.lang.Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x01c0, code lost:
    
        if (r1 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x01c2, code lost:
    
        r1 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 32, android.widget.ExpandableListView.getPackedPositionChild(0) + 4718, (char) android.view.KeyEvent.getDeadChar(0, 0))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x01ff, code lost:
    
        r1 = (java.lang.Object[]) ((java.lang.reflect.Method) r1).invoke(null, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0208, code lost:
    
        r30 = r12;
        r3 = 1;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0159, code lost:
    
        if ((r24 + 1953) >= ((java.lang.Long) java.lang.Class.forName(r4).getDeclaredMethod(r7, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0139, code lost:
    
        if ((r24 - 1953) >= ((java.lang.Long) java.lang.Class.forName(r4).getDeclaredMethod(r7, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x015b, code lost:
    
        r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", r15) + 47, 707 - ((android.os.Process.getThreadPriority(r15) + 20) >> 6), (char) ((android.util.TypedValue.complexToFraction(r15, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(r15, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 34284));
        r29 = r8;
        r8 = new java.lang.Object[1];
        a((byte) (-r14[45]), r14[5], r14[3], r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x01a1, code lost:
    
        r5 = new java.lang.Object[]{r1.getField((java.lang.String) r8[0]).get(null), 520571209, 0};
        r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x14a1 A[Catch: all -> 0x2615, TryCatch #9 {all -> 0x2615, blocks: (B:9:0x01a1, B:11:0x01c2, B:12:0x01ff, B:17:0x0368, B:19:0x0385, B:20:0x03c5, B:28:0x0586, B:30:0x05a7, B:31:0x05e6, B:37:0x071a, B:39:0x0737, B:40:0x0775, B:48:0x090d, B:50:0x092b, B:51:0x0968, B:52:0x0a0d, B:57:0x0b43, B:59:0x0b60, B:60:0x0b9f, B:69:0x0d39, B:71:0x0d5a, B:72:0x0d9d, B:73:0x0e4a, B:79:0x1057, B:81:0x1073, B:82:0x10b8, B:89:0x1237, B:91:0x1258, B:92:0x12b4, B:94:0x13fd, B:96:0x140c, B:97:0x1442, B:99:0x145e, B:100:0x1492, B:102:0x14a1, B:104:0x14b0, B:105:0x14e0, B:107:0x150c, B:108:0x1567, B:114:0x1746, B:116:0x1767, B:117:0x17aa, B:122:0x1935, B:124:0x1952, B:125:0x1999, B:134:0x1bc1, B:136:0x1be2, B:137:0x1c21, B:138:0x1ccd, B:148:0x1edc, B:150:0x1efd, B:151:0x1f46, B:156:0x20c4, B:158:0x20e1, B:159:0x2122, B:166:0x22a5, B:168:0x22c6, B:169:0x2309, B:174:0x247e, B:176:0x249b, B:177:0x24d7, B:183:0x254e, B:185:0x256b, B:186:0x25aa, B:219:0x219f, B:221:0x21bc, B:222:0x21fc, B:242:0x1c67, B:244:0x1c88, B:245:0x1cc6, B:263:0x19a7, B:265:0x19ba, B:266:0x19f1, B:268:0x19fb, B:270:0x1a0e, B:271:0x1a43, B:275:0x1abb, B:277:0x1ad8, B:278:0x1b12, B:296:0x15d3, B:298:0x15e2, B:299:0x1613, B:301:0x163f, B:302:0x169a, B:304:0x12df, B:306:0x1301, B:307:0x1355, B:318:0x112f, B:320:0x114b, B:321:0x118f, B:323:0x0de4, B:325:0x0e05, B:326:0x0e43, B:348:0x0c22, B:350:0x0c3f, B:351:0x0c83, B:353:0x09ac, B:355:0x09ca, B:356:0x0a06, B:370:0x07fb, B:372:0x0818, B:373:0x0857, B:375:0x0613, B:377:0x062e, B:378:0x0667, B:390:0x0485, B:392:0x04a2, B:393:0x04e2, B:397:0x022e, B:399:0x0253, B:400:0x02ab), top: B:2:0x0110 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x1925  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x1e2a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x20bd  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x2477  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x24de  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x231b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x2337  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x23c4  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x212c  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x1f5a  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x1f76  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x2002  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x20a8  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x1cd8  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x1cec  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x1d80  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x19a2  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x17c3  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x17e4  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x17e0  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x156f  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x1301 A[Catch: all -> 0x2615, TryCatch #9 {all -> 0x2615, blocks: (B:9:0x01a1, B:11:0x01c2, B:12:0x01ff, B:17:0x0368, B:19:0x0385, B:20:0x03c5, B:28:0x0586, B:30:0x05a7, B:31:0x05e6, B:37:0x071a, B:39:0x0737, B:40:0x0775, B:48:0x090d, B:50:0x092b, B:51:0x0968, B:52:0x0a0d, B:57:0x0b43, B:59:0x0b60, B:60:0x0b9f, B:69:0x0d39, B:71:0x0d5a, B:72:0x0d9d, B:73:0x0e4a, B:79:0x1057, B:81:0x1073, B:82:0x10b8, B:89:0x1237, B:91:0x1258, B:92:0x12b4, B:94:0x13fd, B:96:0x140c, B:97:0x1442, B:99:0x145e, B:100:0x1492, B:102:0x14a1, B:104:0x14b0, B:105:0x14e0, B:107:0x150c, B:108:0x1567, B:114:0x1746, B:116:0x1767, B:117:0x17aa, B:122:0x1935, B:124:0x1952, B:125:0x1999, B:134:0x1bc1, B:136:0x1be2, B:137:0x1c21, B:138:0x1ccd, B:148:0x1edc, B:150:0x1efd, B:151:0x1f46, B:156:0x20c4, B:158:0x20e1, B:159:0x2122, B:166:0x22a5, B:168:0x22c6, B:169:0x2309, B:174:0x247e, B:176:0x249b, B:177:0x24d7, B:183:0x254e, B:185:0x256b, B:186:0x25aa, B:219:0x219f, B:221:0x21bc, B:222:0x21fc, B:242:0x1c67, B:244:0x1c88, B:245:0x1cc6, B:263:0x19a7, B:265:0x19ba, B:266:0x19f1, B:268:0x19fb, B:270:0x1a0e, B:271:0x1a43, B:275:0x1abb, B:277:0x1ad8, B:278:0x1b12, B:296:0x15d3, B:298:0x15e2, B:299:0x1613, B:301:0x163f, B:302:0x169a, B:304:0x12df, B:306:0x1301, B:307:0x1355, B:318:0x112f, B:320:0x114b, B:321:0x118f, B:323:0x0de4, B:325:0x0e05, B:326:0x0e43, B:348:0x0c22, B:350:0x0c3f, B:351:0x0c83, B:353:0x09ac, B:355:0x09ca, B:356:0x0a06, B:370:0x07fb, B:372:0x0818, B:373:0x0857, B:375:0x0613, B:377:0x062e, B:378:0x0667, B:390:0x0485, B:392:0x04a2, B:393:0x04e2, B:397:0x022e, B:399:0x0253, B:400:0x02ab), top: B:2:0x0110 }] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x10c1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x104f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x140c A[Catch: all -> 0x2615, TryCatch #9 {all -> 0x2615, blocks: (B:9:0x01a1, B:11:0x01c2, B:12:0x01ff, B:17:0x0368, B:19:0x0385, B:20:0x03c5, B:28:0x0586, B:30:0x05a7, B:31:0x05e6, B:37:0x071a, B:39:0x0737, B:40:0x0775, B:48:0x090d, B:50:0x092b, B:51:0x0968, B:52:0x0a0d, B:57:0x0b43, B:59:0x0b60, B:60:0x0b9f, B:69:0x0d39, B:71:0x0d5a, B:72:0x0d9d, B:73:0x0e4a, B:79:0x1057, B:81:0x1073, B:82:0x10b8, B:89:0x1237, B:91:0x1258, B:92:0x12b4, B:94:0x13fd, B:96:0x140c, B:97:0x1442, B:99:0x145e, B:100:0x1492, B:102:0x14a1, B:104:0x14b0, B:105:0x14e0, B:107:0x150c, B:108:0x1567, B:114:0x1746, B:116:0x1767, B:117:0x17aa, B:122:0x1935, B:124:0x1952, B:125:0x1999, B:134:0x1bc1, B:136:0x1be2, B:137:0x1c21, B:138:0x1ccd, B:148:0x1edc, B:150:0x1efd, B:151:0x1f46, B:156:0x20c4, B:158:0x20e1, B:159:0x2122, B:166:0x22a5, B:168:0x22c6, B:169:0x2309, B:174:0x247e, B:176:0x249b, B:177:0x24d7, B:183:0x254e, B:185:0x256b, B:186:0x25aa, B:219:0x219f, B:221:0x21bc, B:222:0x21fc, B:242:0x1c67, B:244:0x1c88, B:245:0x1cc6, B:263:0x19a7, B:265:0x19ba, B:266:0x19f1, B:268:0x19fb, B:270:0x1a0e, B:271:0x1a43, B:275:0x1abb, B:277:0x1ad8, B:278:0x1b12, B:296:0x15d3, B:298:0x15e2, B:299:0x1613, B:301:0x163f, B:302:0x169a, B:304:0x12df, B:306:0x1301, B:307:0x1355, B:318:0x112f, B:320:0x114b, B:321:0x118f, B:323:0x0de4, B:325:0x0e05, B:326:0x0e43, B:348:0x0c22, B:350:0x0c3f, B:351:0x0c83, B:353:0x09ac, B:355:0x09ca, B:356:0x0a06, B:370:0x07fb, B:372:0x0818, B:373:0x0857, B:375:0x0613, B:377:0x062e, B:378:0x0667, B:390:0x0485, B:392:0x04a2, B:393:0x04e2, B:397:0x022e, B:399:0x0253, B:400:0x02ab), top: B:2:0x0110 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x145e A[Catch: all -> 0x2615, TryCatch #9 {all -> 0x2615, blocks: (B:9:0x01a1, B:11:0x01c2, B:12:0x01ff, B:17:0x0368, B:19:0x0385, B:20:0x03c5, B:28:0x0586, B:30:0x05a7, B:31:0x05e6, B:37:0x071a, B:39:0x0737, B:40:0x0775, B:48:0x090d, B:50:0x092b, B:51:0x0968, B:52:0x0a0d, B:57:0x0b43, B:59:0x0b60, B:60:0x0b9f, B:69:0x0d39, B:71:0x0d5a, B:72:0x0d9d, B:73:0x0e4a, B:79:0x1057, B:81:0x1073, B:82:0x10b8, B:89:0x1237, B:91:0x1258, B:92:0x12b4, B:94:0x13fd, B:96:0x140c, B:97:0x1442, B:99:0x145e, B:100:0x1492, B:102:0x14a1, B:104:0x14b0, B:105:0x14e0, B:107:0x150c, B:108:0x1567, B:114:0x1746, B:116:0x1767, B:117:0x17aa, B:122:0x1935, B:124:0x1952, B:125:0x1999, B:134:0x1bc1, B:136:0x1be2, B:137:0x1c21, B:138:0x1ccd, B:148:0x1edc, B:150:0x1efd, B:151:0x1f46, B:156:0x20c4, B:158:0x20e1, B:159:0x2122, B:166:0x22a5, B:168:0x22c6, B:169:0x2309, B:174:0x247e, B:176:0x249b, B:177:0x24d7, B:183:0x254e, B:185:0x256b, B:186:0x25aa, B:219:0x219f, B:221:0x21bc, B:222:0x21fc, B:242:0x1c67, B:244:0x1c88, B:245:0x1cc6, B:263:0x19a7, B:265:0x19ba, B:266:0x19f1, B:268:0x19fb, B:270:0x1a0e, B:271:0x1a43, B:275:0x1abb, B:277:0x1ad8, B:278:0x1b12, B:296:0x15d3, B:298:0x15e2, B:299:0x1613, B:301:0x163f, B:302:0x169a, B:304:0x12df, B:306:0x1301, B:307:0x1355, B:318:0x112f, B:320:0x114b, B:321:0x118f, B:323:0x0de4, B:325:0x0e05, B:326:0x0e43, B:348:0x0c22, B:350:0x0c3f, B:351:0x0c83, B:353:0x09ac, B:355:0x09ca, B:356:0x0a06, B:370:0x07fb, B:372:0x0818, B:373:0x0857, B:375:0x0613, B:377:0x062e, B:378:0x0667, B:390:0x0485, B:392:0x04a2, B:393:0x04e2, B:397:0x022e, B:399:0x0253, B:400:0x02ab), top: B:2:0x0110 }] */
    @Override // com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.EnhancedIntentService, android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate() {
        java.lang.String str;
        java.lang.Object[] objArr;
        int i;
        java.lang.Object[] objArr2;
        java.lang.String str2;
        char c;
        char c2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.Object[] objArr3;
        java.lang.Object[] objArr4;
        int i2;
        long j;
        java.lang.String str7;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        int intValue;
        java.lang.Object obj4;
        long j2;
        android.content.Context baseContext;
        java.lang.String str8;
        java.lang.Object[] objArr5;
        java.lang.String str9;
        char c3;
        char c4;
        int i3;
        long j3;
        android.content.Context baseContext2;
        java.lang.Object[] objArr6;
        long j4;
        java.lang.String str10;
        android.content.Context baseContext3;
        java.lang.Object[] objArr7;
        java.lang.Object[] objArr8;
        int i4;
        java.lang.String str11;
        long j5;
        android.content.Context baseContext4;
        java.lang.Object[] objArr9;
        int i5;
        java.lang.Object invoke;
        java.lang.Object invoke2;
        java.lang.Object invoke3;
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        b(new int[]{1259184018, 220912235, 1985433850, -1426474764, 1988202925, 120071422, -31948583, -1375404292, -344157851, 415247846, 689816940, 1580421375}, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 22, objArr10);
        java.lang.String str12 = (java.lang.String) objArr10[0];
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        c(android.text.TextUtils.indexOf("", "", 0) + 15, (byte) (100 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), "\u0001\u001f\u0016\u0017\r \u0000\u0015!\u0013\u001d\u0013\u0019\u0014㙣", objArr11);
        java.lang.String str13 = (java.lang.String) objArr11[0];
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        c(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 17, (byte) (android.graphics.Color.green(0) + 40), "\u000f\u0012\t\u0017\u0013\u001f\u0012!\u0007\u0010\u001e\u001a\u0011\u0014\u0001\u0019", objArr12);
        java.lang.String str14 = (java.lang.String) objArr12[0];
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        b(new int[]{-6581947, -1225270774, 2147458136, 1982756026, 1535269932, -2024913294, -27860065, -1982856012}, android.graphics.Color.rgb(0, 0, 0) + androidx.core.view.InputDeviceCompat.SOURCE_JOYSTICK, objArr13);
        java.lang.String str15 = (java.lang.String) objArr13[0];
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        c(android.text.TextUtils.getCapsMode("", 0, 0) + 26, (byte) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 66), "\u0012!\u0004\u001b\u000e\u001d\u0001\u000f\u0016\u0017\u0013\u0010\u0004\f\u0014\u001d\b\u001d\u0012\u001d!\u001c\u0019\"\u001b\t", objArr14);
        java.lang.String str16 = (java.lang.String) objArr14[0];
        java.lang.Object[] objArr15 = new java.lang.Object[1];
        c(17 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (byte) (100 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "\u000f\n㙍㙍 \u001f\u0012\u0005㙏㙏\u001a\u001b\u000f\u0016\u0014\u001d\f#", objArr15);
        java.lang.String str17 = (java.lang.String) objArr15[0];
        java.lang.Object[] objArr16 = new java.lang.Object[1];
        e((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE, 22 - android.os.Process.getGidForName(""), "\ufffe\n\t\u000f\u0000\t\u000f\uffc9\uffde\n\t\u000f\u0000\u0013\u000f￼\t\uffff\r\n\u0004\uffff\uffc9", false, android.view.View.combineMeasuredStates(0, 0) + 15, objArr16);
        java.lang.String str18 = (java.lang.String) objArr16[0];
        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 707 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (android.view.KeyEvent.getDeadChar(0, 0) + 34284));
        byte[] bArr = $$a;
        byte b = bArr[18];
        java.lang.Object[] objArr17 = new java.lang.Object[1];
        a((short) 51, b, (byte) (b | 34), objArr17);
        long j6 = cls.getField((java.lang.String) objArr17[0]).getLong(null);
        try {
            try {
                if (j6 != -1) {
                    int i6 = writeReplace + 3;
                    getProfileVersion = i6 % 128;
                    int i7 = i6 % 2 == 0 ? 0 : 0;
                }
                java.lang.String str19 = str18;
                java.lang.Object[] objArr18 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str14).getMethod(str15, java.lang.Object.class).invoke(null, this)).intValue()), 0, 520571209};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
                if (obj5 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 34284));
                    byte b2 = bArr[18];
                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                    a((short) 51, b2, (byte) (b2 | 34), objArr19);
                    obj5 = cls2.getMethod((java.lang.String) objArr19[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1346294939, obj5);
                }
                java.lang.Object[] objArr20 = (java.lang.Object[]) ((java.lang.reflect.Method) obj5).invoke(null, objArr18);
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 706 - android.os.Process.getGidForName(""), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 34283));
                java.lang.String str20 = str17;
                java.lang.Object[] objArr21 = new java.lang.Object[1];
                a((byte) (-bArr[45]), bArr[5], bArr[3], objArr21);
                cls3.getField((java.lang.String) objArr21[0]).set(null, objArr20);
                try {
                    long longValue = ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str13, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.text.TextUtils.getTrimmedLength(""), 708 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (34283 - android.widget.ExpandableListView.getPackedPositionChild(0L)));
                    byte b3 = bArr[18];
                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                    a((short) 51, b3, (byte) (b3 | 34), objArr22);
                    char c5 = 0;
                    cls4.getField((java.lang.String) objArr22[0]).set(null, java.lang.Long.valueOf(longValue));
                    java.lang.Object[] objArr23 = objArr20;
                    char c6 = 1;
                    int i8 = ((int[]) objArr23[c6])[c5];
                    if (((int[]) objArr23[c5])[c5] == i8) {
                        int i9 = ((int[]) objArr23[9])[c5];
                        java.lang.Object[] objArr24 = new java.lang.Object[3];
                        objArr24[2] = 0;
                        objArr24[1] = java.lang.Integer.valueOf(i9);
                        objArr24[c5] = objArr23;
                        java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                        if (obj6 == null) {
                            obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 33, 4717 - android.text.TextUtils.indexOf("", ""), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj6);
                        }
                        ((java.lang.reflect.Method) obj6).invoke(null, objArr24);
                        str = str16;
                    } else {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add((java.lang.String) objArr23[2]);
                        arrayList.add((java.lang.String) objArr23[3]);
                        arrayList.add((java.lang.String) objArr23[4]);
                        arrayList.add((java.lang.String) objArr23[5]);
                        arrayList.add((java.lang.String) objArr23[6]);
                        arrayList.add((java.lang.String) objArr23[7]);
                        arrayList.add((java.lang.String) objArr23[8]);
                        try {
                            java.lang.Object[] objArr25 = {java.lang.Long.valueOf((i8 ^ r8) ^ (-2217621254217662464L)), -516330183L};
                            byte[] bArr2 = $$d;
                            str = str16;
                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                            d(bArr2[295], bArr2[307], bArr2[152], objArr26);
                            java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr26[0]);
                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                            d(bArr2[28], bArr2[26], bArr2[145], objArr27);
                            cls5.getMethod((java.lang.String) objArr27[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr25);
                            java.lang.Object[] objArr28 = {objArr23, java.lang.Integer.valueOf(((int[]) objArr23[9])[0]), 0};
                            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                            if (obj7 == null) {
                                obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.view.KeyEvent.normalizeMetaState(0), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 4716, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj7);
                            }
                            ((java.lang.reflect.Method) obj7).invoke(null, objArr28);
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 921 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.view.KeyEvent.getDeadChar(0, 0));
                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                    a((short) 75, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[116], objArr29);
                    long j7 = cls6.getField((java.lang.String) objArr29[0]).getLong(null);
                    if (j7 == -1 || j7 + 4611686018427387900L < ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str13, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                        int intValue2 = ((java.lang.Integer) java.lang.Class.forName(str14).getMethod(str15, java.lang.Object.class).invoke(null, this)).intValue();
                        java.lang.Object[] objArr30 = {465495322};
                        java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                        if (obj8 == null) {
                            obj8 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 49, 873 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 15956))).getDeclaredConstructor(java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1647138923, obj8);
                        }
                        java.lang.Object[] DigitizedCardProfile$4956fc2a = com.payair.hce.readJsonFromLocalStorage.AnonymousClass2.DigitizedCardProfile$4956fc2a(intValue2, ((java.lang.reflect.Constructor) obj8).newInstance(objArr30));
                        java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 921 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                        java.lang.Object[] objArr31 = new java.lang.Object[1];
                        a((short) 56, bArr[18], (byte) (-bArr[17]), objArr31);
                        cls7.getField((java.lang.String) objArr31[0]).set(null, DigitizedCardProfile$4956fc2a);
                        try {
                            long longValue2 = ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str13, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                            java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43, 923 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) android.text.TextUtils.indexOf("", ""));
                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                            objArr = DigitizedCardProfile$4956fc2a;
                            a((short) 75, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[116], objArr32);
                            i = 0;
                            cls8.getField((java.lang.String) objArr32[0]).set(null, java.lang.Long.valueOf(longValue2));
                        } catch (java.lang.Exception unused) {
                            throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                        }
                    } else {
                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), android.graphics.Color.alpha(0) + 922, (char) android.view.View.resolveSize(0, 0));
                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                        a((short) 56, bArr[18], (byte) (-bArr[17]), objArr33);
                        java.lang.Object[] objArr34 = {cls9.getField((java.lang.String) objArr33[0]).get(null), 522072123, 0};
                        java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                        if (obj9 == null) {
                            obj9 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 4861 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj9);
                        }
                        objArr = (java.lang.Object[]) ((java.lang.reflect.Method) obj9).invoke(null, objArr34);
                        i = 0;
                    }
                    int i10 = ((int[]) objArr[1])[i];
                    if (((int[]) objArr[i])[i] == i10) {
                        int i11 = ((int[]) objArr[3])[i];
                        java.lang.Object[] objArr35 = new java.lang.Object[3];
                        objArr35[2] = 0;
                        objArr35[1] = java.lang.Integer.valueOf(i11);
                        objArr35[i] = objArr;
                        java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                        if (obj10 == null) {
                            obj10 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(i) + 45, 4860 - android.graphics.Color.red(i), (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj10);
                        }
                        ((java.lang.reflect.Method) obj10).invoke(null, objArr35);
                    } else {
                        new java.util.ArrayList().add((java.lang.String) objArr[2]);
                        java.lang.Object[] objArr36 = {java.lang.Long.valueOf((i10 ^ r5) ^ 7749780920944558080L), 1804386482L};
                        java.lang.Object[] objArr37 = new java.lang.Object[1];
                        d((byte) (-$$d[25]), r3[60], r3[152], objArr37);
                        java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr37[0]);
                        java.lang.Object[] objArr38 = new java.lang.Object[1];
                        d(r3[65], 108, r3[16], objArr38);
                        cls10.getMethod((java.lang.String) objArr38[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr36);
                        java.lang.Object[] objArr39 = {objArr, java.lang.Integer.valueOf(((int[]) objArr[3])[0]), 0};
                        java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                        if (obj11 == null) {
                            obj11 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 46, 4860 - android.view.View.MeasureSpec.getMode(0), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj11);
                        }
                        ((java.lang.reflect.Method) obj11).invoke(null, objArr39);
                    }
                    java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 51, 584 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 24291));
                    byte b4 = bArr[85];
                    java.lang.Object[] objArr40 = new java.lang.Object[1];
                    a(b4, (byte) (b4 | com.google.common.base.Ascii.DC4), bArr[19], objArr40);
                    long j8 = cls11.getField((java.lang.String) objArr40[0]).getLong(null);
                    if (j8 == -1 || j8 + 1983 < ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str13, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                        try {
                            java.lang.Object[] objArr41 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str14).getMethod(str15, java.lang.Object.class).invoke(null, this)).intValue()), -2040150217};
                            byte[] bArr3 = $$d;
                            byte b5 = (byte) (-bArr3[292]);
                            java.lang.Object[] objArr42 = new java.lang.Object[1];
                            d(b5, (short) (b5 | 81), bArr3[152], objArr42);
                            java.lang.Class<?> cls12 = java.lang.Class.forName((java.lang.String) objArr42[0]);
                            byte b6 = bArr3[0];
                            java.lang.Object[] objArr43 = new java.lang.Object[1];
                            d(b6, (short) (b6 | 178), bArr3[258], objArr43);
                            java.lang.Object[] objArr44 = (java.lang.Object[]) cls12.getMethod((java.lang.String) objArr43[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr41);
                            java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 51, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 584, (char) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 24291));
                            byte b7 = bArr[5];
                            java.lang.Object[] objArr45 = new java.lang.Object[1];
                            a(b7, (byte) (-bArr[17]), b7, objArr45);
                            cls13.getField((java.lang.String) objArr45[0]).set(null, objArr44);
                            try {
                                long longValue3 = ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str13, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 52, 584 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24291));
                                byte b8 = bArr[85];
                                objArr2 = objArr44;
                                str2 = str15;
                                c = 1;
                                java.lang.Object[] objArr46 = new java.lang.Object[1];
                                a(b8, (byte) (b8 | com.google.common.base.Ascii.DC4), bArr[19], objArr46);
                                c2 = 0;
                                cls14.getField((java.lang.String) objArr46[0]).set(null, java.lang.Long.valueOf(longValue3));
                            } catch (java.lang.Exception unused2) {
                                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                            }
                        } catch (java.lang.Throwable th2) {
                            java.lang.Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        int i12 = getProfileVersion + 43;
                        writeReplace = i12 % 128;
                        if (i12 % 2 != 0) {
                            java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 52, 583 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (24291 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))));
                            byte b9 = bArr[5];
                            java.lang.Object[] objArr47 = new java.lang.Object[1];
                            a(b9, (byte) (-bArr[17]), b9, objArr47);
                            java.lang.Object[] objArr48 = {cls15.getField((java.lang.String) objArr47[0]).get(null), -2040150217, 0};
                            java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                            if (obj12 == null) {
                                obj12 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.widget.ExpandableListView.getPackedPositionChild(0L), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 4829, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj12);
                            }
                            invoke3 = ((java.lang.reflect.Method) obj12).invoke(null, objArr48);
                        } else {
                            java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 52, android.os.Process.getGidForName("") + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_CARD_PROFILE_TYPE, (char) (24291 - android.graphics.Color.alpha(0)));
                            byte b10 = bArr[5];
                            java.lang.Object[] objArr49 = new java.lang.Object[1];
                            a(b10, (byte) (-bArr[17]), b10, objArr49);
                            java.lang.Object[] objArr50 = {cls16.getField((java.lang.String) objArr49[0]).get(null), -2040150217, 0};
                            java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                            if (obj13 == null) {
                                obj13 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), android.text.TextUtils.getTrimmedLength("") + 4830, (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj13);
                            }
                            invoke3 = ((java.lang.reflect.Method) obj13).invoke(null, objArr50);
                        }
                        objArr2 = (java.lang.Object[]) invoke3;
                        str2 = str15;
                        c = 1;
                        c2 = 0;
                    }
                    int i13 = ((int[]) objArr2[c])[c2];
                    if (((int[]) objArr2[c2])[c2] == i13) {
                        int i14 = ((int[]) objArr2[3])[c2];
                        java.lang.Object[] objArr51 = new java.lang.Object[3];
                        objArr51[2] = 0;
                        objArr51[1] = java.lang.Integer.valueOf(i14);
                        objArr51[c2] = objArr2;
                        java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                        if (obj14 == null) {
                            obj14 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 4830 - android.graphics.Color.alpha(0), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj14);
                        }
                        ((java.lang.reflect.Method) obj14).invoke(null, objArr51);
                    } else {
                        new java.util.ArrayList().add((java.lang.String) objArr2[2]);
                        java.lang.Object[] objArr52 = {java.lang.Long.valueOf((i13 ^ r3) ^ (-6191545955364372480L)), -1441581614L};
                        byte b11 = $$d[64];
                        java.lang.Object[] objArr53 = new java.lang.Object[1];
                        d(b11, (short) (b11 | 148), r3[152], objArr53);
                        java.lang.Class<?> cls17 = java.lang.Class.forName((java.lang.String) objArr53[0]);
                        java.lang.Object[] objArr54 = new java.lang.Object[1];
                        d(r3[65], 108, r3[16], objArr54);
                        cls17.getMethod((java.lang.String) objArr54[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr52);
                        java.lang.Object[] objArr55 = {objArr2, java.lang.Integer.valueOf(((int[]) objArr2[3])[0]), 0};
                        java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                        if (obj15 == null) {
                            obj15 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 31, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 4830, (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj15);
                        }
                        ((java.lang.reflect.Method) obj15).invoke(null, objArr55);
                    }
                    java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 27, 429 - android.graphics.Color.green(0), (char) (android.view.KeyEvent.normalizeMetaState(0) + 31610));
                    java.lang.Object[] objArr56 = new java.lang.Object[1];
                    a((short) 75, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[116], objArr56);
                    long j9 = cls18.getField((java.lang.String) objArr56[0]).getLong(null);
                    try {
                        try {
                            if (j9 == -1 || j9 + 4611686018427387823L < ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str13, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                android.content.Context baseContext5 = getBaseContext();
                                if (baseContext5 == null) {
                                    str3 = str20;
                                    baseContext5 = (android.content.Context) java.lang.Class.forName(str).getMethod(str3, new java.lang.Class[0]).invoke(null, null);
                                } else {
                                    str3 = str20;
                                }
                                if (baseContext5 != null) {
                                    baseContext5 = baseContext5.getApplicationContext();
                                }
                                java.lang.String str21 = str2;
                                int intValue3 = ((java.lang.Integer) java.lang.Class.forName(str14).getMethod(str21, java.lang.Object.class).invoke(null, this)).intValue();
                                java.lang.Object[] objArr57 = new java.lang.Object[1];
                                b(new int[]{837420060, 490312267, -1027022327, 223945189, 2003865580, -195627030, -515792433, 1616767633, 2076211652, 1498296477, 823313802, 152810033, -1533233636, -574815797, 1011468746, -1503825940, -2061932285, -845825870, 1462804263, -2034075333, 866877721, -1725418579, 1892681532, -34986160, -858824346, -1847201318, -553095346, -1221417555, -1118747736, -2088449430, 960565071, -1670130958}, 64 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr57);
                                java.lang.String str22 = (java.lang.String) objArr57[0];
                                java.lang.Object[] objArr58 = new java.lang.Object[1];
                                b(new int[]{-1431361709, -1725023347, -1317522396, 1231047932, 682528470, -1815921656, -1303987240, 1375395470, 525121575, -469735794, -399031728, -138704134, 972482749, 1916157733, 1692429919, 106957756, 1010095981, 44155584, -1035501421, -748986994, -166023689, 1999677136, -252234010, 766283054, 1509824001, -1436176519, 163405151, -782126456, -1002489131, 864436185, -5214594, -889133462}, 65 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr58);
                                java.lang.String str23 = (java.lang.String) objArr58[0];
                                str4 = str21;
                                str5 = str3;
                                java.lang.Object[] objArr59 = new java.lang.Object[1];
                                c(65 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (byte) (android.text.TextUtils.getCapsMode("", 0, 0) + 97), "\u0005\u001b㙠㙠\u0002\u0000\u0019\u000b\u0000\u000b\u000e\u0003\u000b\u0005\u0019\u0005\b\u000e\r\n\u0001\r!\u0017\u0019#\u0001\t\u001e\t\u0012\t\u0007\u001e\u0005\u0002\t\u0003\u000b\u0001\u0003\u0016\u0007\u0002\t\u000e\u0010\u0003\u000b\u0002 \u001e㘉㘉\u001b\t\t\u0013\n\u0000\u0007\u0002\"\u001e", objArr59);
                                java.lang.String str24 = (java.lang.String) objArr59[0];
                                str6 = str14;
                                java.lang.Object[] objArr60 = new java.lang.Object[1];
                                b(new int[]{1133320593, -691116694, 956333067, 192579980, 323911167, 835215688, -507597568, 1474145449, -1524053818, 876304727, 261921016, 589265710, 1933332182, -534227933, 212368280, 1279077981, -2117523729, 657549827, 1363884881, -1787512087, 833933424, 761953865, -761559231, 1699263006, 1036712949, 1954920176, 1105271123, -2102663589, -321041366, -19591548, -1208323494, -1319318448}, android.view.View.resolveSize(0, 0) + 64, objArr60);
                                java.lang.Object[] objArr61 = {baseContext5, new java.lang.String[]{str22, str23, str24, (java.lang.String) objArr60[0]}, java.lang.Integer.valueOf(intValue3), 0, -1733278017};
                                byte[] bArr4 = $$d;
                                java.lang.Object[] objArr62 = new java.lang.Object[1];
                                d(bArr4[107], (short) ($$e | 138), bArr4[152], objArr62);
                                java.lang.Class<?> cls19 = java.lang.Class.forName((java.lang.String) objArr62[0]);
                                byte b12 = bArr4[0];
                                java.lang.Object[] objArr63 = new java.lang.Object[1];
                                d(b12, (short) (b12 | 178), bArr4[258], objArr63);
                                objArr3 = (java.lang.Object[]) cls19.getMethod((java.lang.String) objArr63[0], java.lang.Class.forName(str19), java.lang.String[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr61);
                                int i15 = ((int[]) objArr3[1])[0];
                                int i16 = ((int[]) objArr3[0])[0];
                                if (baseContext5 != null) {
                                    java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.graphics.Color.argb(0, 0, 0, 0) + 429, (char) (31610 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)));
                                    java.lang.Object[] objArr64 = new java.lang.Object[1];
                                    a((short) 56, bArr[18], (byte) (-bArr[17]), objArr64);
                                    cls20.getField((java.lang.String) objArr64[0]).set(null, objArr3);
                                    try {
                                        long longValue4 = ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str13, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                        java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.view.MotionEvent.axisFromString(""), 429 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 31610));
                                        java.lang.Object[] objArr65 = new java.lang.Object[1];
                                        a((short) 75, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[116], objArr65);
                                        cls21.getField((java.lang.String) objArr65[0]).set(null, java.lang.Long.valueOf(longValue4));
                                        writeReplace = (getProfileVersion + 109) % 128;
                                        i2 = ((int[]) objArr3[1])[0];
                                        if (((int[]) objArr3[0])[0] != i2) {
                                            java.lang.Object[] objArr66 = {objArr3, java.lang.Integer.valueOf(((int[]) objArr3[2])[0]), 0};
                                            java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-854902220);
                                            if (obj16 == null) {
                                                obj16 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 33, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 4617, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-854902220, obj16);
                                            }
                                            ((java.lang.reflect.Method) obj16).invoke(null, objArr66);
                                        } else {
                                            java.lang.Object[] objArr67 = {java.lang.Long.valueOf((i2 ^ r10) ^ (-4752892508621504512L)), -1106619086L};
                                            byte[] bArr5 = $$d;
                                            java.lang.Object[] objArr68 = new java.lang.Object[1];
                                            d(bArr5[570], com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE, bArr5[152], objArr68);
                                            java.lang.Class<?> cls22 = java.lang.Class.forName((java.lang.String) objArr68[0]);
                                            java.lang.Object[] objArr69 = new java.lang.Object[1];
                                            d(bArr5[390], 322, bArr5[258], objArr69);
                                            cls22.getMethod((java.lang.String) objArr69[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr67);
                                            java.lang.Object[] objArr70 = {objArr3, java.lang.Integer.valueOf(((int[]) objArr3[2])[0]), 0};
                                            java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-854902220);
                                            if (obj17 == null) {
                                                obj17 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 32, android.graphics.Color.rgb(0, 0, 0) + 16781834, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-854902220, obj17);
                                            }
                                            ((java.lang.reflect.Method) obj17).invoke(null, objArr70);
                                        }
                                        java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 47, 754 - android.view.View.MeasureSpec.getMode(0), (char) (android.text.TextUtils.getOffsetAfter("", 0) + 45560));
                                        byte b13 = bArr[85];
                                        java.lang.Object[] objArr71 = new java.lang.Object[1];
                                        a(b13, (byte) (b13 | com.google.common.base.Ascii.DC4), bArr[19], objArr71);
                                        j = cls23.getField((java.lang.String) objArr71[0]).getLong(null);
                                        if (j != -1 || j + 4611686018427387912L < ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str13, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                            str7 = str4;
                                            java.lang.Object[] objArr72 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str6).getMethod(str7, java.lang.Object.class).invoke(null, this)).intValue()), 2029893501};
                                            obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(599786096);
                                            if (obj == null) {
                                                java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 47, 755 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (45560 - android.view.KeyEvent.getDeadChar(0, 0)));
                                                java.lang.Object[] objArr73 = new java.lang.Object[1];
                                                a((byte) (-bArr[45]), bArr[5], bArr[3], objArr73);
                                                obj = cls24.getMethod((java.lang.String) objArr73[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(599786096, obj);
                                            }
                                            java.lang.Object invoke4 = ((java.lang.reflect.Method) obj).invoke(null, objArr72);
                                            java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.text.TextUtils.indexOf("", ""), 754 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.view.View.getDefaultSize(0, 0) + 45560));
                                            java.lang.Object[] objArr74 = new java.lang.Object[1];
                                            a((byte) (-bArr[45]), bArr[5], bArr[3], objArr74);
                                            cls25.getField((java.lang.String) objArr74[0]).set(null, invoke4);
                                            long longValue5 = ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str13, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                            java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 754 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (45560 - (android.view.KeyEvent.getMaxKeyCode() >> 16)));
                                            byte b14 = bArr[85];
                                            java.lang.Object[] objArr75 = new java.lang.Object[1];
                                            a(b14, (byte) (b14 | com.google.common.base.Ascii.DC4), bArr[19], objArr75);
                                            cls26.getField((java.lang.String) objArr75[0]).set(null, java.lang.Long.valueOf(longValue5));
                                            obj2 = invoke4;
                                        } else {
                                            java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.view.View.resolveSizeAndState(0, 0, 0), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 754, (char) (45560 - android.text.TextUtils.getCapsMode("", 0, 0)));
                                            java.lang.Object[] objArr76 = new java.lang.Object[1];
                                            a((byte) (-bArr[45]), bArr[5], bArr[3], objArr76);
                                            java.lang.Object[] objArr77 = {cls27.getField((java.lang.String) objArr76[0]).get(null), 2029893501, 0};
                                            java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                            if (obj18 == null) {
                                                obj18 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 39, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 4789, (char) (31152 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.text.TextUtils.getOffsetAfter("", 0), 4750 - android.view.KeyEvent.keyCodeFromString(""), (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 33701)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj18);
                                            }
                                            obj2 = ((java.lang.reflect.Method) obj18).invoke(null, objArr77);
                                            str7 = str4;
                                        }
                                        obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                                        if (obj3 == null) {
                                            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 40, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 4751, (char) (33701 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)))).getMethod("values", null);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-273776192, obj3);
                                        }
                                        intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj2, null)).intValue();
                                        obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                                        if (obj4 == null) {
                                            obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 41, 4750 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (android.view.View.MeasureSpec.getSize(0) + 33701))).getMethod("DigitizedCardProfile", null);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-712736454, obj4);
                                        }
                                        if (((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(obj2, null)).intValue() != intValue) {
                                            java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                                            if (obj19 == null) {
                                                obj19 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.widget.ExpandableListView.getPackedPositionChild(0L), android.graphics.ImageFormat.getBitsPerPixel(0) + 4751, (char) (33701 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)))).getMethod("valueOf", null);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj19);
                                            }
                                            java.lang.Object[] objArr78 = {obj2, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj19).invoke(obj2, null)).intValue()), 0};
                                            java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                            if (obj20 == null) {
                                                obj20 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 39, 4790 - android.view.KeyEvent.keyCodeFromString(""), (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 31152))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.graphics.ImageFormat.getBitsPerPixel(0), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4750, (char) (33701 - android.graphics.Color.argb(0, 0, 0, 0))), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj20);
                                            }
                                            ((java.lang.reflect.Method) obj20).invoke(null, objArr78);
                                        } else {
                                            java.lang.Object[] objArr79 = {java.lang.Long.valueOf((intValue ^ r5) ^ 1127770558373560320L), 262581593L};
                                            byte[] bArr6 = $$d;
                                            java.lang.Object[] objArr80 = new java.lang.Object[1];
                                            d(bArr6[64], 328, bArr6[152], objArr80);
                                            java.lang.Class<?> cls28 = java.lang.Class.forName((java.lang.String) objArr80[0]);
                                            java.lang.Object[] objArr81 = new java.lang.Object[1];
                                            d((byte) (-bArr6[499]), 368, bArr6[0], objArr81);
                                            cls28.getMethod((java.lang.String) objArr81[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr79);
                                            java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                                            if (obj21 == null) {
                                                obj21 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.graphics.Color.argb(0, 0, 0, 0), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4750, (char) (33701 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)))).getMethod("valueOf", null);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj21);
                                            }
                                            java.lang.Object[] objArr82 = {obj2, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj21).invoke(obj2, null)).intValue()), 0};
                                            java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                            if (obj22 == null) {
                                                obj22 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777256, (android.os.Process.myPid() >> 22) + 4790, (char) (31152 - android.view.View.resolveSize(0, 0)))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.view.View.combineMeasuredStates(0, 0), 4750 - android.view.View.combineMeasuredStates(0, 0), (char) (33701 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj22);
                                            }
                                            ((java.lang.reflect.Method) obj22).invoke(null, objArr82);
                                        }
                                        java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), android.view.View.combineMeasuredStates(0, 0) + 667, (char) (40024 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)));
                                        byte b15 = bArr[85];
                                        java.lang.Object[] objArr83 = new java.lang.Object[1];
                                        a(b15, (byte) (b15 | com.google.common.base.Ascii.DC4), bArr[19], objArr83);
                                        j2 = cls29.getField((java.lang.String) objArr83[0]).getLong(null);
                                        if (j2 != -1 || j2 + 4611686018427387815L < ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str13, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                            baseContext = getBaseContext();
                                            if (baseContext != null) {
                                                getProfileVersion = (writeReplace + 103) % 128;
                                                str8 = str5;
                                                baseContext = (android.content.Context) java.lang.Class.forName(str).getMethod(str8, new java.lang.Class[0]).invoke(null, null);
                                            } else {
                                                str8 = str5;
                                            }
                                            if (baseContext != null) {
                                                getProfileVersion = (writeReplace + 53) % 128;
                                                baseContext = baseContext.getApplicationContext();
                                            }
                                            java.lang.Object[] objArr84 = {baseContext, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str6).getMethod(str7, java.lang.Object.class).invoke(null, this)).intValue()), 0, -1174970452};
                                            byte[] bArr7 = $$d;
                                            java.lang.Object[] objArr85 = new java.lang.Object[1];
                                            d(bArr7[307], androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_VISIBILITY, bArr7[152], objArr85);
                                            java.lang.Class<?> cls30 = java.lang.Class.forName((java.lang.String) objArr85[0]);
                                            byte b16 = bArr7[0];
                                            java.lang.Object[] objArr86 = new java.lang.Object[1];
                                            d(b16, (short) (b16 | 178), bArr7[258], objArr86);
                                            java.lang.Object[] objArr87 = (java.lang.Object[]) cls30.getMethod((java.lang.String) objArr86[0], java.lang.Class.forName(str19), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr84);
                                            java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 41, android.graphics.Color.alpha(0) + 667, (char) (android.text.TextUtils.getOffsetAfter("", 0) + 40024));
                                            byte b17 = bArr[18];
                                            java.lang.Object[] objArr88 = new java.lang.Object[1];
                                            a((short) 51, b17, (byte) (b17 | 34), objArr88);
                                            cls31.getField((java.lang.String) objArr88[0]).set(null, objArr87);
                                            long longValue6 = ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str13, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                            java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 40, 666 - android.view.MotionEvent.axisFromString(""), (char) (40024 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)));
                                            byte b18 = bArr[85];
                                            objArr5 = objArr87;
                                            str9 = "valueOf";
                                            c3 = 1;
                                            java.lang.Object[] objArr89 = new java.lang.Object[1];
                                            a(b18, (byte) (b18 | com.google.common.base.Ascii.DC4), bArr[19], objArr89);
                                            c4 = 0;
                                            cls32.getField((java.lang.String) objArr89[0]).set(null, java.lang.Long.valueOf(longValue6));
                                        } else {
                                            java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.graphics.ImageFormat.getBitsPerPixel(0), 668 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (40024 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))));
                                            byte b19 = bArr[18];
                                            java.lang.Object[] objArr90 = new java.lang.Object[1];
                                            a((short) 51, b19, (byte) (b19 | 34), objArr90);
                                            java.lang.Object[] objArr91 = {cls33.getField((java.lang.String) objArr90[0]).get(null), -1174970452, 0};
                                            java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                            if (obj23 == null) {
                                                obj23 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 32, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 4683, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj23);
                                            }
                                            java.lang.Object[] objArr92 = (java.lang.Object[]) ((java.lang.reflect.Method) obj23).invoke(null, objArr91);
                                            str9 = "valueOf";
                                            str8 = str5;
                                            c4 = 0;
                                            objArr5 = objArr92;
                                            c3 = 1;
                                        }
                                        i3 = ((int[]) objArr5[c3])[c4];
                                        if (((int[]) objArr5[c4])[c4] != i3) {
                                            getProfileVersion = (writeReplace + 87) % 128;
                                            int i17 = ((int[]) objArr5[4])[c4];
                                            java.lang.Object[] objArr93 = new java.lang.Object[3];
                                            objArr93[2] = 0;
                                            objArr93[1] = java.lang.Integer.valueOf(i17);
                                            objArr93[c4] = objArr5;
                                            java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                            if (obj24 == null) {
                                                obj24 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 4684 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj24);
                                            }
                                            ((java.lang.reflect.Method) obj24).invoke(null, objArr93);
                                        } else {
                                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                            java.lang.Object[] objArr94 = {objArr5};
                                            java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1859861882);
                                            if (obj25 == null) {
                                                obj25 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 4684 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) android.text.TextUtils.indexOf("", "", 0))).getMethod("values", java.lang.Object[].class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1859861882, obj25);
                                            }
                                            arrayList2.add(((java.lang.reflect.Method) obj25).invoke(null, objArr94));
                                            java.lang.Object[] objArr95 = {objArr5};
                                            java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1831744115);
                                            if (obj26 == null) {
                                                obj26 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(32 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 4684 - (android.os.Process.myTid() >> 22), (char) android.graphics.Color.green(0))).getMethod("writeReplace", java.lang.Object[].class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1831744115, obj26);
                                            }
                                            arrayList2.add(((java.lang.reflect.Method) obj26).invoke(null, objArr95));
                                            java.lang.Object[] objArr96 = {java.lang.Long.valueOf((i3 ^ r3) ^ 1662495103417057280L), 387079797L};
                                            byte[] bArr8 = $$d;
                                            java.lang.Object[] objArr97 = new java.lang.Object[1];
                                            d(bArr8[40], 449, bArr8[152], objArr97);
                                            java.lang.Class<?> cls34 = java.lang.Class.forName((java.lang.String) objArr97[0]);
                                            java.lang.Object[] objArr98 = new java.lang.Object[1];
                                            d(bArr8[65], 108, bArr8[16], objArr98);
                                            cls34.getMethod((java.lang.String) objArr98[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr96);
                                            java.lang.Object[] objArr99 = {objArr5, java.lang.Integer.valueOf(((int[]) objArr5[4])[0]), 0};
                                            java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                            if (obj27 == null) {
                                                obj27 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.graphics.Color.blue(0), 4684 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) android.text.TextUtils.getCapsMode("", 0, 0))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj27);
                                            }
                                            ((java.lang.reflect.Method) obj27).invoke(null, objArr99);
                                        }
                                        java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.graphics.Color.blue(0), android.graphics.Color.blue(0) + 1581, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1));
                                        byte b20 = bArr[18];
                                        java.lang.Object[] objArr100 = new java.lang.Object[1];
                                        a((short) 51, b20, (byte) (b20 | 34), objArr100);
                                        j3 = cls35.getField((java.lang.String) objArr100[0]).getLong(null);
                                        if (j3 != -1 || j3 + 4611686018427387925L < ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str13, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                            baseContext2 = getBaseContext();
                                            if (baseContext2 == null) {
                                                baseContext2 = (android.content.Context) java.lang.Class.forName(str).getMethod(str8, new java.lang.Class[0]).invoke(null, null);
                                            }
                                            if (baseContext2 != null) {
                                                baseContext2 = baseContext2.getApplicationContext();
                                            }
                                            java.lang.Object[] objArr101 = {baseContext2, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str6).getMethod(str7, java.lang.Object.class).invoke(null, this)).intValue()), 0, -1416820764};
                                            byte[] bArr9 = $$d;
                                            java.lang.Object[] objArr102 = new java.lang.Object[1];
                                            d(bArr9[26], 474, bArr9[152], objArr102);
                                            java.lang.Class<?> cls36 = java.lang.Class.forName((java.lang.String) objArr102[0]);
                                            java.lang.Object[] objArr103 = new java.lang.Object[1];
                                            d(bArr9[65], 108, bArr9[16], objArr103);
                                            java.lang.Object[] objArr104 = (java.lang.Object[]) cls36.getMethod((java.lang.String) objArr103[0], java.lang.Class.forName(str19), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr101);
                                            if (baseContext2 != null) {
                                                java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0) + 48, 1581 - android.graphics.Color.blue(0), (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                                                java.lang.Object[] objArr105 = new java.lang.Object[1];
                                                a((short) 75, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[116], objArr105);
                                                cls37.getField((java.lang.String) objArr105[0]).set(null, objArr104);
                                                try {
                                                    long longValue7 = ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str13, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                    java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.graphics.ImageFormat.getBitsPerPixel(0), 1581 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                                    byte b21 = bArr[18];
                                                    java.lang.Object[] objArr106 = new java.lang.Object[1];
                                                    a((short) 51, b21, (byte) (b21 | 34), objArr106);
                                                    cls38.getField((java.lang.String) objArr106[0]).set(null, java.lang.Long.valueOf(longValue7));
                                                } catch (java.lang.Exception unused3) {
                                                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                }
                                            }
                                            objArr6 = objArr104;
                                        } else {
                                            int i18 = writeReplace + 119;
                                            getProfileVersion = i18 % 128;
                                            if (i18 % 2 == 0) {
                                                java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.widget.ExpandableListView.getPackedPositionType(0L), 1581 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (android.os.Process.myPid() >> 22));
                                                java.lang.Object[] objArr107 = new java.lang.Object[1];
                                                a((short) 75, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[116], objArr107);
                                                java.lang.Object[] objArr108 = {cls39.getField((java.lang.String) objArr107[0]).get(null), -1416820764, 0};
                                                java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-595545510);
                                                if (obj28 == null) {
                                                    obj28 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 34, android.view.View.combineMeasuredStates(0, 0) + 4905, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16))).getMethod("values", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-595545510, obj28);
                                                }
                                                invoke = ((java.lang.reflect.Method) obj28).invoke(null, objArr108);
                                            } else {
                                                java.lang.Class cls40 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 48, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1580, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                                java.lang.Object[] objArr109 = new java.lang.Object[1];
                                                a((short) 75, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[116], objArr109);
                                                java.lang.Object[] objArr110 = {cls40.getField((java.lang.String) objArr109[0]).get(null), -1416820764, 0};
                                                java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-595545510);
                                                if (obj29 == null) {
                                                    obj29 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.view.MotionEvent.axisFromString(""), 4904 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (android.view.MotionEvent.axisFromString("") + 1))).getMethod("values", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-595545510, obj29);
                                                }
                                                invoke = ((java.lang.reflect.Method) obj29).invoke(null, objArr110);
                                            }
                                            objArr6 = (java.lang.Object[]) invoke;
                                        }
                                        if (((int[]) objArr6[0])[0] != ((int[]) objArr6[1])[0]) {
                                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                            arrayList3.add((java.lang.String) objArr6[2]);
                                            arrayList3.add((java.lang.String) objArr6[3]);
                                        }
                                        java.lang.Class cls41 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 583 - android.os.Process.getGidForName(""), (char) (android.text.TextUtils.indexOf("", "", 0) + 24291));
                                        java.lang.Object[] objArr111 = new java.lang.Object[1];
                                        a((short) 75, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[116], objArr111);
                                        j4 = cls41.getField((java.lang.String) objArr111[0]).getLong(null);
                                        if (j4 != -1 || j4 + 1862 < ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str13, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                            str10 = str9;
                                            baseContext3 = getBaseContext();
                                            if (baseContext3 == null) {
                                                getProfileVersion = (writeReplace + 15) % 128;
                                                baseContext3 = (android.content.Context) java.lang.Class.forName(str).getMethod(str8, new java.lang.Class[0]).invoke(null, null);
                                            }
                                            if (baseContext3 != null) {
                                                baseContext3 = baseContext3.getApplicationContext();
                                            }
                                            java.lang.Object[] objArr112 = {baseContext3, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str6).getMethod(str7, java.lang.Object.class).invoke(null, this)).intValue()), -685182158};
                                            byte[] bArr10 = $$d;
                                            java.lang.Object[] objArr113 = new java.lang.Object[1];
                                            d(bArr10[104], 510, bArr10[152], objArr113);
                                            java.lang.Class<?> cls42 = java.lang.Class.forName((java.lang.String) objArr113[0]);
                                            java.lang.Object[] objArr114 = new java.lang.Object[1];
                                            d((byte) (-bArr10[499]), 368, bArr10[0], objArr114);
                                            java.lang.Object[] objArr115 = (java.lang.Object[]) cls42.getMethod((java.lang.String) objArr114[0], java.lang.Class.forName(str19), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr112);
                                            if (baseContext3 == null) {
                                                java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 51, 584 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (24292 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                                                java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                a((short) 56, bArr[18], (byte) (-bArr[17]), objArr116);
                                                cls43.getField((java.lang.String) objArr116[0]).set(null, objArr115);
                                                try {
                                                    long longValue8 = ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str13, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                    java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 584, (char) (24291 - android.graphics.Color.green(0)));
                                                    java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                    objArr7 = objArr115;
                                                    a((short) 75, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[116], objArr117);
                                                    cls44.getField((java.lang.String) objArr117[0]).set(null, java.lang.Long.valueOf(longValue8));
                                                } catch (java.lang.Exception unused4) {
                                                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                }
                                            } else {
                                                objArr7 = objArr115;
                                            }
                                            objArr8 = objArr7;
                                        } else {
                                            java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 50, android.os.Process.getGidForName("") + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_CARD_PROFILE_TYPE, (char) (24291 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)));
                                            java.lang.Object[] objArr118 = new java.lang.Object[1];
                                            a((short) 56, bArr[18], (byte) (-bArr[17]), objArr118);
                                            java.lang.Object[] objArr119 = {cls45.getField((java.lang.String) objArr118[0]).get(null), -685182158, 0};
                                            java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                            if (obj30 == null) {
                                                str10 = str9;
                                                obj30 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 4830 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))))).getMethod(str10, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj30);
                                            } else {
                                                str10 = str9;
                                            }
                                            objArr8 = (java.lang.Object[]) ((java.lang.reflect.Method) obj30).invoke(null, objArr119);
                                        }
                                        i4 = ((int[]) objArr8[1])[0];
                                        if (((int[]) objArr8[0])[0] != i4) {
                                            java.lang.Object[] objArr120 = {objArr8, java.lang.Integer.valueOf(((int[]) objArr8[3])[0]), 0};
                                            java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                            if (obj31 == null) {
                                                obj31 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 4829, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod(str10, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj31);
                                            }
                                            ((java.lang.reflect.Method) obj31).invoke(null, objArr120);
                                            str11 = str7;
                                        } else {
                                            java.lang.Object[] objArr121 = {java.lang.Long.valueOf((i4 ^ r9) ^ 1313514579526942720L), 305825933L};
                                            byte[] bArr11 = $$d;
                                            java.lang.Object[] objArr122 = new java.lang.Object[1];
                                            d(bArr11[34], 530, bArr11[152], objArr122);
                                            java.lang.Class<?> cls46 = java.lang.Class.forName((java.lang.String) objArr122[0]);
                                            str11 = str7;
                                            java.lang.Object[] objArr123 = new java.lang.Object[1];
                                            d(bArr11[28], bArr11[26], bArr11[145], objArr123);
                                            cls46.getMethod((java.lang.String) objArr123[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr121);
                                            java.lang.Object[] objArr124 = {objArr8, java.lang.Integer.valueOf(((int[]) objArr8[3])[0]), 0};
                                            java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                            if (obj32 == null) {
                                                obj32 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 30, 4830 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1))).getMethod(str10, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj32);
                                            }
                                            ((java.lang.reflect.Method) obj32).invoke(null, objArr124);
                                        }
                                        super.onCreate();
                                        java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 584 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (24291 - android.graphics.Color.red(0)));
                                        byte b22 = bArr[18];
                                        java.lang.Object[] objArr125 = new java.lang.Object[1];
                                        a((short) 51, b22, (byte) (b22 | 34), objArr125);
                                        j5 = cls47.getField((java.lang.String) objArr125[0]).getLong(null);
                                        if (j5 != -1 || j5 + 1954 < ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str13, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                            baseContext4 = getBaseContext();
                                            if (baseContext4 == null) {
                                                writeReplace = (getProfileVersion + 109) % 128;
                                                baseContext4 = (android.content.Context) java.lang.Class.forName(str).getMethod(str8, new java.lang.Class[0]).invoke(null, null);
                                            }
                                            if (baseContext4 != null) {
                                                baseContext4 = baseContext4.getApplicationContext();
                                            }
                                            java.lang.Object[] objArr126 = {baseContext4, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str6).getMethod(str11, java.lang.Object.class).invoke(null, this)).intValue()), -2065986211};
                                            byte[] bArr12 = $$d;
                                            java.lang.Object[] objArr127 = new java.lang.Object[1];
                                            d(bArr12[107], com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_ATC_OUT_SIDE_PERMISSIBLE_RANGE, bArr12[152], objArr127);
                                            java.lang.Class<?> cls48 = java.lang.Class.forName((java.lang.String) objArr127[0]);
                                            byte b23 = bArr12[0];
                                            java.lang.Object[] objArr128 = new java.lang.Object[1];
                                            d(b23, (short) (b23 | 178), bArr12[258], objArr128);
                                            java.lang.Object[] objArr129 = (java.lang.Object[]) cls48.getMethod((java.lang.String) objArr128[0], java.lang.Class.forName(str19), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr126);
                                            if (baseContext4 != null) {
                                                java.lang.Class cls49 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 51, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 584, (char) (24291 - android.view.KeyEvent.normalizeMetaState(0)));
                                                java.lang.Object[] objArr130 = new java.lang.Object[1];
                                                a((byte) (-bArr[45]), bArr[5], bArr[3], objArr130);
                                                cls49.getField((java.lang.String) objArr130[0]).set(null, objArr129);
                                                try {
                                                    long longValue9 = ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str13, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                    java.lang.Class cls50 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.graphics.Color.blue(0), 584 - android.text.TextUtils.indexOf("", ""), (char) (24291 - android.view.View.resolveSize(0, 0)));
                                                    byte b24 = bArr[18];
                                                    java.lang.Object[] objArr131 = new java.lang.Object[1];
                                                    a((short) 51, b24, (byte) (b24 | 34), objArr131);
                                                    cls50.getField((java.lang.String) objArr131[0]).set(null, java.lang.Long.valueOf(longValue9));
                                                } catch (java.lang.Exception unused5) {
                                                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                }
                                            }
                                            objArr9 = objArr129;
                                        } else {
                                            java.lang.Class cls51 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 52, 583 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (24291 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)));
                                            java.lang.Object[] objArr132 = new java.lang.Object[1];
                                            a((byte) (-bArr[45]), bArr[5], bArr[3], objArr132);
                                            java.lang.Object[] objArr133 = {cls51.getField((java.lang.String) objArr132[0]).get(null), -2065986211, 0};
                                            java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                            if (obj33 == null) {
                                                obj33 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 29, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4830, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod(str10, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj33);
                                            }
                                            objArr9 = (java.lang.Object[]) ((java.lang.reflect.Method) obj33).invoke(null, objArr133);
                                        }
                                        i5 = ((int[]) objArr9[1])[0];
                                        if (((int[]) objArr9[0])[0] != i5) {
                                            java.lang.Object[] objArr134 = {objArr9, java.lang.Integer.valueOf(((int[]) objArr9[3])[0]), 0};
                                            java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                            if (obj34 == null) {
                                                obj34 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.graphics.Color.alpha(0), 4830 - android.text.TextUtils.getOffsetBefore("", 0), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16))).getMethod(str10, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj34);
                                            }
                                            ((java.lang.reflect.Method) obj34).invoke(null, objArr134);
                                            return;
                                        }
                                        java.lang.Object[] objArr135 = {java.lang.Long.valueOf((i5 ^ r8) ^ 4099976253208002560L), 954600106L};
                                        byte[] bArr13 = $$d;
                                        java.lang.Object[] objArr136 = new java.lang.Object[1];
                                        d(bArr13[34], 530, bArr13[152], objArr136);
                                        java.lang.Class<?> cls52 = java.lang.Class.forName((java.lang.String) objArr136[0]);
                                        java.lang.Object[] objArr137 = new java.lang.Object[1];
                                        d(bArr13[28], bArr13[26], bArr13[145], objArr137);
                                        cls52.getMethod((java.lang.String) objArr137[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr135);
                                        java.lang.Object[] objArr138 = {objArr9, java.lang.Integer.valueOf(((int[]) objArr9[3])[0]), 0};
                                        java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                        if (obj35 == null) {
                                            obj35 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777246, 4830 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1))).getMethod(str10, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj35);
                                        }
                                        ((java.lang.reflect.Method) obj35).invoke(null, objArr138);
                                        return;
                                    } catch (java.lang.Exception unused6) {
                                        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                    }
                                }
                                objArr4 = objArr3;
                            } else {
                                int i19 = writeReplace + 27;
                                getProfileVersion = i19 % 128;
                                if (i19 % 2 == 0) {
                                    java.lang.Class cls53 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.graphics.ImageFormat.getBitsPerPixel(0) + 430, (char) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 31610));
                                    java.lang.Object[] objArr139 = new java.lang.Object[1];
                                    a((short) 56, bArr[18], (byte) (-bArr[17]), objArr139);
                                    java.lang.Object[] objArr140 = {cls53.getField((java.lang.String) objArr139[0]).get(null), -1733278017, 0};
                                    java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-854902220);
                                    if (obj36 == null) {
                                        obj36 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 33, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 4617, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-854902220, obj36);
                                    }
                                    invoke2 = ((java.lang.reflect.Method) obj36).invoke(null, objArr140);
                                } else {
                                    java.lang.Class cls54 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.widget.ExpandableListView.getPackedPositionType(0L), android.graphics.Color.argb(0, 0, 0, 0) + 429, (char) (31611 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                                    java.lang.Object[] objArr141 = new java.lang.Object[1];
                                    a((short) 56, bArr[18], (byte) (-bArr[17]), objArr141);
                                    java.lang.Object[] objArr142 = {cls54.getField((java.lang.String) objArr141[0]).get(null), -1733278017, 0};
                                    java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-854902220);
                                    if (obj37 == null) {
                                        obj37 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 34, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 4618, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-854902220, obj37);
                                    }
                                    invoke2 = ((java.lang.reflect.Method) obj37).invoke(null, objArr142);
                                }
                                objArr4 = (java.lang.Object[]) invoke2;
                                str6 = str14;
                                str4 = str2;
                                str5 = str20;
                            }
                            long longValue62 = ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str13, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                            java.lang.Class cls322 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 40, 666 - android.view.MotionEvent.axisFromString(""), (char) (40024 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)));
                            byte b182 = bArr[85];
                            objArr5 = objArr87;
                            str9 = "valueOf";
                            c3 = 1;
                            java.lang.Object[] objArr892 = new java.lang.Object[1];
                            a(b182, (byte) (b182 | com.google.common.base.Ascii.DC4), bArr[19], objArr892);
                            c4 = 0;
                            cls322.getField((java.lang.String) objArr892[0]).set(null, java.lang.Long.valueOf(longValue62));
                            i3 = ((int[]) objArr5[c3])[c4];
                            if (((int[]) objArr5[c4])[c4] != i3) {
                            }
                            java.lang.Class cls352 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.graphics.Color.blue(0), android.graphics.Color.blue(0) + 1581, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1));
                            byte b202 = bArr[18];
                            java.lang.Object[] objArr1002 = new java.lang.Object[1];
                            a((short) 51, b202, (byte) (b202 | 34), objArr1002);
                            j3 = cls352.getField((java.lang.String) objArr1002[0]).getLong(null);
                            if (j3 != -1) {
                            }
                            baseContext2 = getBaseContext();
                            if (baseContext2 == null) {
                            }
                            if (baseContext2 != null) {
                            }
                            java.lang.Object[] objArr1012 = {baseContext2, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str6).getMethod(str7, java.lang.Object.class).invoke(null, this)).intValue()), 0, -1416820764};
                            byte[] bArr92 = $$d;
                            java.lang.Object[] objArr1022 = new java.lang.Object[1];
                            d(bArr92[26], 474, bArr92[152], objArr1022);
                            java.lang.Class<?> cls362 = java.lang.Class.forName((java.lang.String) objArr1022[0]);
                            java.lang.Object[] objArr1032 = new java.lang.Object[1];
                            d(bArr92[65], 108, bArr92[16], objArr1032);
                            java.lang.Object[] objArr1042 = (java.lang.Object[]) cls362.getMethod((java.lang.String) objArr1032[0], java.lang.Class.forName(str19), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr1012);
                            if (baseContext2 != null) {
                            }
                            objArr6 = objArr1042;
                            if (((int[]) objArr6[0])[0] != ((int[]) objArr6[1])[0]) {
                            }
                            java.lang.Class cls412 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 583 - android.os.Process.getGidForName(""), (char) (android.text.TextUtils.indexOf("", "", 0) + 24291));
                            java.lang.Object[] objArr1112 = new java.lang.Object[1];
                            a((short) 75, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[116], objArr1112);
                            j4 = cls412.getField((java.lang.String) objArr1112[0]).getLong(null);
                            if (j4 != -1) {
                            }
                            str10 = str9;
                            baseContext3 = getBaseContext();
                            if (baseContext3 == null) {
                            }
                            if (baseContext3 != null) {
                            }
                            java.lang.Object[] objArr1122 = {baseContext3, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str6).getMethod(str7, java.lang.Object.class).invoke(null, this)).intValue()), -685182158};
                            byte[] bArr102 = $$d;
                            java.lang.Object[] objArr1132 = new java.lang.Object[1];
                            d(bArr102[104], 510, bArr102[152], objArr1132);
                            java.lang.Class<?> cls422 = java.lang.Class.forName((java.lang.String) objArr1132[0]);
                            java.lang.Object[] objArr1142 = new java.lang.Object[1];
                            d((byte) (-bArr102[499]), 368, bArr102[0], objArr1142);
                            java.lang.Object[] objArr1152 = (java.lang.Object[]) cls422.getMethod((java.lang.String) objArr1142[0], java.lang.Class.forName(str19), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr1122);
                            if (baseContext3 == null) {
                            }
                            objArr8 = objArr7;
                            i4 = ((int[]) objArr8[1])[0];
                            if (((int[]) objArr8[0])[0] != i4) {
                            }
                            super.onCreate();
                            java.lang.Class cls472 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 584 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (24291 - android.graphics.Color.red(0)));
                            byte b222 = bArr[18];
                            java.lang.Object[] objArr1252 = new java.lang.Object[1];
                            a((short) 51, b222, (byte) (b222 | 34), objArr1252);
                            j5 = cls472.getField((java.lang.String) objArr1252[0]).getLong(null);
                            if (j5 != -1) {
                            }
                            baseContext4 = getBaseContext();
                            if (baseContext4 == null) {
                            }
                            if (baseContext4 != null) {
                            }
                            java.lang.Object[] objArr1262 = {baseContext4, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str6).getMethod(str11, java.lang.Object.class).invoke(null, this)).intValue()), -2065986211};
                            byte[] bArr122 = $$d;
                            java.lang.Object[] objArr1272 = new java.lang.Object[1];
                            d(bArr122[107], com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_ATC_OUT_SIDE_PERMISSIBLE_RANGE, bArr122[152], objArr1272);
                            java.lang.Class<?> cls482 = java.lang.Class.forName((java.lang.String) objArr1272[0]);
                            byte b232 = bArr122[0];
                            java.lang.Object[] objArr1282 = new java.lang.Object[1];
                            d(b232, (short) (b232 | 178), bArr122[258], objArr1282);
                            java.lang.Object[] objArr1292 = (java.lang.Object[]) cls482.getMethod((java.lang.String) objArr1282[0], java.lang.Class.forName(str19), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr1262);
                            if (baseContext4 != null) {
                            }
                            objArr9 = objArr1292;
                            i5 = ((int[]) objArr9[1])[0];
                            if (((int[]) objArr9[0])[0] != i5) {
                            }
                        } catch (java.lang.Exception unused7) {
                            throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                        }
                        long longValue52 = ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str13, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        java.lang.Class cls262 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 754 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (45560 - (android.view.KeyEvent.getMaxKeyCode() >> 16)));
                        byte b142 = bArr[85];
                        java.lang.Object[] objArr752 = new java.lang.Object[1];
                        a(b142, (byte) (b142 | com.google.common.base.Ascii.DC4), bArr[19], objArr752);
                        cls262.getField((java.lang.String) objArr752[0]).set(null, java.lang.Long.valueOf(longValue52));
                        obj2 = invoke4;
                        obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                        if (obj3 == null) {
                        }
                        intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj2, null)).intValue();
                        obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                        if (obj4 == null) {
                        }
                        if (((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(obj2, null)).intValue() != intValue) {
                        }
                        java.lang.Class cls292 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), android.view.View.combineMeasuredStates(0, 0) + 667, (char) (40024 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)));
                        byte b152 = bArr[85];
                        java.lang.Object[] objArr832 = new java.lang.Object[1];
                        a(b152, (byte) (b152 | com.google.common.base.Ascii.DC4), bArr[19], objArr832);
                        j2 = cls292.getField((java.lang.String) objArr832[0]).getLong(null);
                        if (j2 != -1) {
                        }
                        baseContext = getBaseContext();
                        if (baseContext != null) {
                        }
                        if (baseContext != null) {
                        }
                        java.lang.Object[] objArr842 = {baseContext, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str6).getMethod(str7, java.lang.Object.class).invoke(null, this)).intValue()), 0, -1174970452};
                        byte[] bArr72 = $$d;
                        java.lang.Object[] objArr852 = new java.lang.Object[1];
                        d(bArr72[307], androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_VISIBILITY, bArr72[152], objArr852);
                        java.lang.Class<?> cls302 = java.lang.Class.forName((java.lang.String) objArr852[0]);
                        byte b162 = bArr72[0];
                        java.lang.Object[] objArr862 = new java.lang.Object[1];
                        d(b162, (short) (b162 | 178), bArr72[258], objArr862);
                        java.lang.Object[] objArr872 = (java.lang.Object[]) cls302.getMethod((java.lang.String) objArr862[0], java.lang.Class.forName(str19), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr842);
                        java.lang.Class cls312 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 41, android.graphics.Color.alpha(0) + 667, (char) (android.text.TextUtils.getOffsetAfter("", 0) + 40024));
                        byte b172 = bArr[18];
                        java.lang.Object[] objArr882 = new java.lang.Object[1];
                        a((short) 51, b172, (byte) (b172 | 34), objArr882);
                        cls312.getField((java.lang.String) objArr882[0]).set(null, objArr872);
                    } catch (java.lang.Exception unused8) {
                        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                    }
                    objArr3 = objArr4;
                    i2 = ((int[]) objArr3[1])[0];
                    if (((int[]) objArr3[0])[0] != i2) {
                    }
                    java.lang.Class cls232 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 47, 754 - android.view.View.MeasureSpec.getMode(0), (char) (android.text.TextUtils.getOffsetAfter("", 0) + 45560));
                    byte b132 = bArr[85];
                    java.lang.Object[] objArr712 = new java.lang.Object[1];
                    a(b132, (byte) (b132 | com.google.common.base.Ascii.DC4), bArr[19], objArr712);
                    j = cls232.getField((java.lang.String) objArr712[0]).getLong(null);
                    if (j != -1) {
                    }
                    str7 = str4;
                    java.lang.Object[] objArr722 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str6).getMethod(str7, java.lang.Object.class).invoke(null, this)).intValue()), 2029893501};
                    obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(599786096);
                    if (obj == null) {
                    }
                    java.lang.Object invoke42 = ((java.lang.reflect.Method) obj).invoke(null, objArr722);
                    java.lang.Class cls252 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.text.TextUtils.indexOf("", ""), 754 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.view.View.getDefaultSize(0, 0) + 45560));
                    java.lang.Object[] objArr742 = new java.lang.Object[1];
                    a((byte) (-bArr[45]), bArr[5], bArr[3], objArr742);
                    cls252.getField((java.lang.String) objArr742[0]).set(null, invoke42);
                } catch (java.lang.Exception unused9) {
                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                }
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 == null) {
                throw th4;
            }
            throw cause4;
        }
    }

    static void init$2() {
        $$g = new byte[]{63, kotlin.io.encoding.Base64.padSymbol, -101, com.google.common.base.Ascii.SI};
        $$h = 167;
    }

    static void DigitizedCardProfile() {
        valueOf = new int[]{403520107, 1753606970, -642967844, 125779544, 6835685, 904763559, 727819288, -805425772, -1637418006, 1471224386, 1342023559, -1400787243, -707195488, 1390489846, -435394659, -59756991, 83742510, -1075690013};
        DigitizedCardProfile = new char[]{12299, 12402, 12408, 12334, 12411, 12410, 12413, 12412, 12414, 12351, 12333, 12348, 12320, 12388, 12345, 12409, 12329, 12325, 12312, 12327, 12300, 12331, 12346, 12350, 12339, 12326, 12323, 12322, 12344, 12328, 12324, 12335, 12313, 12403, 12318, 12332};
        AlternateContactlessPaymentDataJson = (char) 1494;
    }

    static void init$1() {
        byte[] bArr = new byte[com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.ENROLLMENT_OS_UPGRADE_REQUIRED];
        java.lang.System.arraycopy("\u0000Å,ø\rÿÂCò\u0019é\t\n½;ü\u0003Ê:ÿ\u0010Ð-ö\u0002ß\u001f\u0003\u0006þà&\n³\u0011üø\fòî\u0014\fýö\u0003\u0003\rÿÂCò\u0019é\t\n½;ü\u0003ÊFó\u0010Ð#\u000e\u0003öþ\u0004ûÿ\u0014ò\rÿÂCò\u0019é\t\n½;ü\u0003Ê#\u0012\u0019é\t\nä\u001fó\u000eÓ\u001e\u0014îä\u001e\u000fñë%\u0004ý¹\u0012&ÿ\u0003\fö\u0012ì\u0000à\u001f\u0012óí#þø\u0004\u0004ú\rÿÂCò\u0019é\t\n½;ü\u0003Ê6\u0010ôý\u0014òà\"\u0012ôû\u0003ì#þ\u0006òÿ\u0012ò\u0000ð\"ü\u0004ð\u0007ÿß-\u0000\u0007ò\u0014ý±\u0015ì\f\nñ\u000f\rÿÂCò\u0019é\t\n½;ü\u0003Ê6\u0010ôý\u0014òß-\u0000ù\u0004ÿ\u000fþð\u0014ö\u0007\u0000Ö-\u0000\u0007ò\u0014ý\rÿÂCò\u0019é\t\n½;ü\u0003ÊFó\u0010\u0002üç\f\f\nñ\u000fÏ&\u000fò\u000eÐ5\u0000õþ\n\u0007öûÿ\u0014ò\rÿÂCò\u0019é\t\n½;ü\u0003ÊFó\u0010Î,\fë\u0019ûÒ/ð\u0017øê\u0013\fõÜ\u001f\u0003\u0006þá*ô\u0002\u000bú\u0000ÁTüø\fòî\u0014\fýö\u0003\u0003ì\f\nñë\u0018\rÿÂCò\u0019é\t\n½;ü\u0003Ê:ÿ\u0010à#ÿþö\n÷\u0006\u0006úî\u001fð\u000e\u0006ï\u0003\u0012ö\u0007\u0000Ü\u001c,\tò\u000eýô\u0014òß-\u0000\u0007î\u0003\u0012ùú\u000f\u0001Þ\u0012\u0019õù\n\u0007Ñ\u001e\u0014îê*ý\u0000\rÿÂCò\u0019é\t\n½;ü\u0003Ê&\u0012\bÙ-\u0004ôà&ÿ\u0003\fö\u0012ì\u0000à\u001f\u0012óí#þø\u0004\u0004úå%\u0004ý¹\u0012\rÿÂCò\u0019é\t\n½;ü\u0003ÊFó\u0010à\u0011\u0010þþ\u0001ú\u000e\rÿÂCò\u0019é\t\n½;ü\u0003ÊEôý\u0004æ\u001b\u0001ã*ö\u0010\bø\u0005ö\u0007\u0000Þ\u001b\u0015¬\u0011\rÿÂCò\u0019é\t\n½;ü\u0003Ê:ÿ\u0010ÝÕ\u000e\rÿÂCò\u0019é\t\n½;ü\u0003Ê<ü\u0002\n\u0007öþ\u0014\rÿÂCò\u0019é\t\n½;ü\u0003Ê4\u0003\u0001\u0003\u000f\u0001÷\u0006\u0007ò\u000eýô\fÚ*÷ñ\u001fð\u000e\u0006ï\u0003\u0012ö\u0007\u0000".getBytes("ISO-8859-1"), 0, bArr, 0, com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.ENROLLMENT_OS_UPGRADE_REQUIRED);
        $$d = bArr;
        $$e = 85;
    }

    static void init$0() {
        $$a = new byte[]{117, -13, -118, com.google.common.base.Ascii.RS, -39, 0, -4, -13, 9, -19, 19, -1, com.google.common.base.Ascii.US, -32, -19, com.google.common.base.Ascii.FF, 18, -36, 1, 7, -5, -5, 5, 19, -13, -11, 14, com.visa.cbp.getEncExpo.onUnminimized, 19, -13, -11, 14, com.google.common.base.Ascii.DC4, -25, 3, 7, -13, 13, 17, -21, -13, 2, 9, -4, -4, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, -19, -9, 38, -46, -5, com.google.common.base.Ascii.VT, 34, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.SYN, -38, -5, 2};
        $$b = 131;
    }

    static void valueOf() {
        int i = getProfileVersion;
        writeReplace = (i + 21) % 128;
        values = 1889207207;
        int i2 = i + 79;
        writeReplace = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }
}
