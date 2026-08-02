package com.payair.hce;

/* loaded from: classes4.dex */
public abstract class setJustificationMode extends com.payair.hce.setEms {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AlternateContactlessPaymentDataJson;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static char[] valueOf;
    private static final char[] writeReplace;
    protected final byte[] DigitizedCardProfile;
    protected final int values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, short s2, java.lang.Object[] objArr) {
        int i;
        byte[] bArr = $$a;
        int i2 = s2 * 4;
        int i3 = 4 - (s * 3);
        int i4 = 73 - (b * 8);
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        if (bArr == null) {
            int i6 = i3;
            int i7 = i5;
            int i8 = 0;
            int i9 = (-i3) + i7;
            int i10 = i6 + 1;
            i = i8;
            i4 = i9;
            i3 = i10;
            bArr2[i] = (byte) i4;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i4;
            i6 = i3;
            i3 = bArr[i3];
            i8 = i + 1;
            i7 = i11;
            int i92 = (-i3) + i7;
            int i102 = i6 + 1;
            i = i8;
            i4 = i92;
            i3 = i102;
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

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        return AlternateContactlessPaymentDataJson(objArr);
    }

    @Override // com.payair.hce.setEms
    abstract void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        RecordsJson();
        writeReplace = new char[]{com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int i = IccPrivateKeyCrtComponentsJson + 115;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public setJustificationMode(byte[] bArr, int i) {
        if (bArr == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("\u000b\u0002\u001d\u0004\u001b\u0007\u0004\u000b\u0007\u0004\u001d\u001a\u001a\u000f\u001c\u0007!\r㘺", 19 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (byte) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 68), objArr);
            throw new java.lang.NullPointerException(((java.lang.String) objArr[0]).intern());
        }
        if (bArr.length == 0 && i != 0) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("\u0002\u0014\u001f\u0004\u001b\r\u0010\b\u0018\u001d\u0007\u0018\u000b\u0002\u001d\u0004\u001f\u0019\n\u001d\u0007\u0018\u0007\u0004\u0006\u0004\u0002\u0014\u001f\u0004\u001f\u0013\u0002\u000b\u001a\u001c\n\u001d㘹", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 40, (byte) (79 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        if (i > 7 || i < 0) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a("\u0011\u0001\u0007\u001a\u001d\t\u0019\n\u001b\u0007\u0004\u000b\u0007\u0004\u001d\u001a\u001a\u000f\u001a\u0018 \u0010\u0004\u001d\u0010 \u001a\u001d\u000b\u0000\u0007\u001c\u001b\u001a\u0004\u001f\u001b\r\r\b\r\u001f\u0018\n\u0004\u000b\u0018\u0013", 49 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (byte) (105 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
        this.DigitizedCardProfile = com.payair.hce.getClientVersion.values(bArr);
        this.values = i;
    }

    private java.lang.String SdkCoreAlternateContactlessPaymentDataImpl() {
        int i = 0;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("㗙", -android.os.Process.getGidForName(""), (byte) (android.graphics.Color.rgb(0, 0, 0) + 16777248), objArr);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(((java.lang.String) objArr[0]).intern());
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            new com.payair.hce.setMaxLines(byteArrayOutputStream).DigitizedCardProfile(this);
            SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 13) % 128;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            while (i != byteArray.length) {
                int i2 = IccPrivateKeyCrtComponentsJson + 67;
                SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
                if (i2 % 2 != 0) {
                    char[] cArr = writeReplace;
                    stringBuffer.append(cArr[(byteArray[i] % 2) & 46]);
                    stringBuffer.append(cArr[byteArray[i] & 16]);
                } else {
                    char[] cArr2 = writeReplace;
                    stringBuffer.append(cArr2[(byteArray[i] >>> 4) & 15]);
                    stringBuffer.append(cArr2[byteArray[i] & com.google.common.base.Ascii.SI]);
                    i++;
                }
            }
            return stringBuffer.toString();
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("\n\u0010\u001a\u0010\u0004\u0010\u0003\u0011\u001a\r㘍㘍\u0004\u001f\u001a\r\u000b\n\u0002\u0007\u0006\u000b\u0018\u001a\u0011\n\u001b\u0004\"\u0004\u0006\u000b\u001b#㗟", 35 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 38), objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            sb.append(e.getMessage());
            throw new com.payair.hce.setLines(sb.toString(), e);
        }
    }

    private static void a(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr = valueOf;
        float f = 0.0f;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i3])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 49, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2508, (char) (6802 - (android.view.ViewConfiguration.getTapTimeout() >> 16)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((short) 0, (byte) 1, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 2508 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (android.text.TextUtils.getOffsetAfter("", 0) + 6802));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b((short) 0, (byte) 1, (short) 0, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    $11 = ($10 + 21) % 128;
                    cArr3[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr3[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                } else {
                    java.lang.Object[] objArr6 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 30, 3596 - (android.media.AudioTrack.getMinVolume() > f ? 1 : (android.media.AudioTrack.getMinVolume() == f ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj3);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj4 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 2665, (char) (18889 - android.text.TextUtils.indexOf("", "", 0)));
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            b((short) 0, (byte) 0, (short) 0, objArr8);
                            obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj4);
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue();
                        int i4 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i5 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[intValue];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i4 * charValue) + i5];
                    } else if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                        digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                        digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                        int i6 = digitizedCardJson12.DigitizedCardProfile;
                        int i7 = digitizedCardJson12.RecordsJson;
                        int i8 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i9 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[(i6 * charValue) + i7];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i8 * charValue) + i9];
                    } else {
                        int i10 = digitizedCardJson12.DigitizedCardProfile;
                        int i11 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        int i12 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i13 = digitizedCardJson12.RecordsJson;
                        cArr3[digitizedCardJson12.values] = cArr[(i10 * charValue) + i11];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i12 * charValue) + i13];
                    }
                }
                digitizedCardJson12.values += 2;
                $11 = ($10 + 35) % 128;
                f = 0.0f;
            }
        }
        int i14 = 0;
        while (i14 < i) {
            cArr3[i14] = (char) (cArr3[i14] ^ 13722);
            i14++;
            $10 = ($11 + 61) % 128;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    public final byte[] valueOf() {
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 3) % 128;
        if (this.values != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("\u0004\u001d\u001a\u0010\u001f\u0011\u001d\u001a\u0019\u0004\u001a\u0018\u0010\u001a\u001c\u0007\u0004\u0007\u0001\u0002\n\u001b\u0010\u001a\u001d\u0001\u0011\t\u001c\u000b\u0014\u000e\u001a\u0007\u0004\u001d\u0001\u001d\u0010\u001e\u0005\u001f\u001c\r\u0000\"\u001b\u0001\"\u0012\u0005\u0003㗵", 53 - android.text.TextUtils.getOffsetBefore("", 0), (byte) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 24), objArr);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
        }
        byte[] values = com.payair.hce.getClientVersion.values(this.DigitizedCardProfile);
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 91) % 128;
        return values;
    }

    private byte[] SdkCoreBusinessLogicModuleImpl() {
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 31) % 128;
        byte[] writeReplace2 = writeReplace(this.DigitizedCardProfile, this.values);
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 45) % 128;
        return writeReplace2;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setJustificationMode setjustificationmode = (com.payair.hce.setJustificationMode) objArr[0];
        int i = (IccPrivateKeyCrtComponentsJson + 59) % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = i;
        int i2 = setjustificationmode.values;
        int i3 = i + 3;
        IccPrivateKeyCrtComponentsJson = i3 % 128;
        if (i3 % 2 != 0) {
            return java.lang.Integer.valueOf(i2);
        }
        throw new java.lang.ArithmeticException();
    }

    public java.lang.String toString() {
        int i = IccPrivateKeyCrtComponentsJson + 73;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 != 0) {
            SdkCoreAlternateContactlessPaymentDataImpl();
            throw null;
        }
        java.lang.String SdkCoreAlternateContactlessPaymentDataImpl2 = SdkCoreAlternateContactlessPaymentDataImpl();
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 75) % 128;
        return SdkCoreAlternateContactlessPaymentDataImpl2;
    }

    @Override // com.payair.hce.setGravity
    public int hashCode() {
        int i = IccPrivateKeyCrtComponentsJson + 117;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            return this.values ^ com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(SdkCoreBusinessLogicModuleImpl());
        }
        com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(SdkCoreBusinessLogicModuleImpl());
        throw null;
    }

    @Override // com.payair.hce.setEms
    protected final boolean AlternateContactlessPaymentDataJson(com.payair.hce.setEms setems) {
        if (setems instanceof com.payair.hce.setJustificationMode) {
            com.payair.hce.setJustificationMode setjustificationmode = (com.payair.hce.setJustificationMode) setems;
            if (this.values != setjustificationmode.values || !com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(SdkCoreBusinessLogicModuleImpl(), setjustificationmode.SdkCoreBusinessLogicModuleImpl())) {
                return false;
            }
            IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 53) % 128;
            return true;
        }
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 59) % 128;
        return false;
    }

    protected static byte[] writeReplace(byte[] bArr, int i) {
        byte[] values = com.payair.hce.getClientVersion.values(bArr);
        if (i > 0) {
            int i2 = SdkCoreAlternateContactlessPaymentDataImpl;
            IccPrivateKeyCrtComponentsJson = (i2 + 53) % 128;
            int length = bArr.length - 1;
            values[length] = (byte) ((255 << i) & values[length]);
            IccPrivateKeyCrtComponentsJson = (i2 + 29) % 128;
        }
        return values;
    }

    static com.payair.hce.setJustificationMode values(int i, java.io.InputStream inputStream) throws java.io.IOException {
        if (i <= 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("\"\u0004\"\u0007\u000b\u0003\u001a\u0010\u0007\u001a\u0016\n\u001f\u0018\u0000!\u001c\n\u0005\u000e\u001a\u0007\u0010\u001a\u000f\b\u001a\u0010㘨", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 30, (byte) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 42), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        int read = inputStream.read();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        if (i2 != 0) {
            SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 121) % 128;
            if (((java.lang.Integer) com.payair.hce.handleIntentOnMainThread.AlternateContactlessPaymentDataJson(new java.lang.Object[]{inputStream, bArr}, -2008715526, 2008715529, (int) java.lang.System.currentTimeMillis())).intValue() != i2) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a("\u0012\u001a\u0013\u001d\u0010\b\u0007\u0003\"\u0007\u001a\u0010 \u0010\u0007\u001a\u0006\u000b\u001d\u001f\u0006\t\t\u000e\r\u001a\u0000\r\u001c\r\u0000\"\u001b\u0001\"\u0012\u0005\u0003㗫", 39 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (byte) (14 - android.view.View.getDefaultSize(0, 0)), objArr2);
                throw new java.io.EOFException(((java.lang.String) objArr2[0]).intern());
            }
            if (read > 0 && read < 8) {
                byte b = bArr[i - 2];
                if (b != ((byte) ((255 << read) & b))) {
                    com.payair.hce.setTitle settitle = new com.payair.hce.setTitle(bArr, read);
                    SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 73) % 128;
                    return settitle;
                }
            }
        }
        com.payair.hce.setImeOptions setimeoptions = new com.payair.hce.setImeOptions(bArr, read);
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 119) % 128;
        return setimeoptions;
    }

    @Override // com.payair.hce.setEms
    final com.payair.hce.setEms DigitizedCardProfile() {
        com.payair.hce.setImeOptions setimeoptions = new com.payair.hce.setImeOptions(this.DigitizedCardProfile, this.values);
        int i = IccPrivateKeyCrtComponentsJson + 1;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            return setimeoptions;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.setEms
    final com.payair.hce.setEms IccPrivateKeyCrtComponentsJson() {
        com.payair.hce.setTitle settitle = new com.payair.hce.setTitle(this.DigitizedCardProfile, this.values);
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 83;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            return settitle;
        }
        throw new java.lang.ArithmeticException();
    }

    static void RecordsJson() {
        valueOf = new char[]{12391, 12325, 12292, 12313, 12291, 12331, 12322, 12345, 12334, 12329, 12324, 12323, 12332, 12346, 12335, 12326, 12296, 12301, 12410, 12349, 12303, 12393, 12312, 12300, 12293, 12394, 12413, 12328, 12350, 12333, 12318, 12351, 12336, 12400, 12344, 12327};
        AlternateContactlessPaymentDataJson = (char) 1494;
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.EM, -31, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, com.google.common.base.Ascii.DC4};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE;
    }

    public final int values() {
        return ((java.lang.Integer) writeReplace(new java.lang.Object[]{this}, 1544518005, -1544518005, java.lang.System.identityHashCode(this))).intValue();
    }
}
