package com.payair.hce;

/* loaded from: classes4.dex */
public final class setHorizontallyScrolling extends com.payair.hce.setEms {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int valueOf;
    private static int values;
    private final byte[] writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, short s, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5;
        byte[] bArr = $$a;
        int i6 = 1 - (s * 2);
        int i7 = i + 4;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            i4 = i7;
            int i8 = i6;
            i5 = 0;
            i7 += i8;
            i3 = i5;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i5 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i4++;
            i8 = bArr[i4];
            i7 += i8;
            i3 = i5;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i5 == i6) {
            }
        } else {
            int i9 = (i2 * 3) + 115;
            i3 = 0;
            i4 = i7;
            i7 = i9;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i5 == i6) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = i2 | i4;
        if ((i * (-751)) + (i2 * (-751)) + (((~(i4 | i5)) | (~(i4 | i3))) * 1504) + ((~(i3 | i6)) * (-1504)) + (((~(i | i5)) | (~i6)) * 752) == 1) {
            return values(objArr);
        }
        valueOf = (AlternateContactlessPaymentDataJson + 33) % 128;
        return java.lang.Boolean.FALSE;
    }

    public static com.payair.hce.setHorizontallyScrolling valueOf(java.lang.Object obj) {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i + 121;
        int i3 = i2 % 128;
        valueOf = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (obj == null || (obj instanceof com.payair.hce.setHorizontallyScrolling)) {
            com.payair.hce.setHorizontallyScrolling sethorizontallyscrolling = (com.payair.hce.setHorizontallyScrolling) obj;
            int i4 = i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            valueOf = i4 % 128;
            if (i4 % 2 == 0) {
                return sethorizontallyscrolling;
            }
            throw null;
        }
        if (!(obj instanceof byte[])) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(true, "\u0016\u0011￬\u0017\b\nￃ\u0011\fￃ\u0017\u0006\b\r\u0005\u0012ￃ\u000f\u0004\n\b\u000f\u000f\fￃ\uffdd\b\u0006\u0011\u0004\u0017", android.text.TextUtils.getOffsetBefore("", 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 24, 31 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(obj.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        int i5 = i3 + 99;
        AlternateContactlessPaymentDataJson = i5 % 128;
        try {
            if (i5 % 2 != 0) {
                return (com.payair.hce.setHorizontallyScrolling) writeReplace((byte[]) obj);
            }
            throw new java.lang.NullPointerException();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(false, "\u0010\u0015\u0016\u0003\u0010\u0005\u0007ￜￂ\u0007\u0010\u0005\u0011\u0006\u000b\u0010\tￂ\u0007\u0014\u0014\u0011\u0014ￂ\u000b\u0010ￂ\t\u0007\u0016￫", 183 - android.widget.ExpandableListView.getPackedPositionGroup(0L), android.text.TextUtils.indexOf("", "", 0, 0) + 9, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 31, objArr2);
            sb2.append(((java.lang.String) objArr2[0]).intern());
            sb2.append(e.toString());
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
    }

    public setHorizontallyScrolling(java.math.BigInteger bigInteger) {
        this.writeReplace = bigInteger.toByteArray();
    }

    setHorizontallyScrolling(byte[] bArr) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(false, "\ufffa\u0004\t\u000f\u0000\u0002\u0000\r\n\r\u0002\uffc9\u000e\u000b\n\t\u0002\u0014\ufffe￼\u000e\u000f\u0007\u0000\uffc9￼\u000e\tￌ\uffc9￼\u0007\u0007\n\u0012\ufffa\u0010\t\u000e￼\u0001\u0000", android.widget.ExpandableListView.getPackedPositionChild(0L) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 42, objArr);
        if (!com.payair.hce.ensurePlayServicesAvailable.AlternateContactlessPaymentDataJson(((java.lang.String) objArr[0]).intern()) && DigitizedCardProfile(bArr)) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(true, "ﾻ\uffff\u0000\b\r\n\u0001\u0007￼\b\r\u0000\u0002\u0000\u000f\t\u0004", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 11, 18 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        this.writeReplace = bArr;
    }

    private static void a(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        if (str != null) {
            $10 = ($11 + 23) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr3 = cArr;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr4 = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            $11 = ($10 + 7) % 128;
            digitizedCardJson11.values = cArr3[digitizedCardJson11.DigitizedCardProfile];
            cArr4[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i4 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr4[i4]), java.lang.Integer.valueOf(values)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 43, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2073, (char) (60037 - android.graphics.Color.red(0)));
                    byte b = (byte) ($$b - 3);
                    byte b2 = (byte) (b + 1);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(b, b2, b2, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr4[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3542, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
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
        if (i2 > 0) {
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i2;
            char[] cArr5 = new char[i3];
            java.lang.System.arraycopy(cArr4, 0, cArr5, 0, i3);
            java.lang.System.arraycopy(cArr5, 0, cArr4, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr5, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr4, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            int i5 = $11 + 45;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                cArr2 = new char[i3];
                digitizedCardJson11.DigitizedCardProfile = 1;
            } else {
                cArr2 = new char[i3];
                digitizedCardJson11.DigitizedCardProfile = 0;
            }
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                cArr2[digitizedCardJson11.DigitizedCardProfile] = cArr4[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.text.TextUtils.indexOf("", "", 0), 3543 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                $10 = ($11 + 25) % 128;
            }
            cArr4 = cArr2;
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    static boolean DigitizedCardProfile(byte[] bArr) {
        int i = (AlternateContactlessPaymentDataJson + 83) % 128;
        valueOf = i;
        if (bArr.length > 1) {
            int i2 = i + 113;
            int i3 = i2 % 128;
            AlternateContactlessPaymentDataJson = i3;
            if (i2 % 2 != 0 ? bArr[0] == 0 : bArr[1] == 0) {
                int i4 = i3 + 11;
                valueOf = i4 % 128;
                if (i4 % 2 == 0 ? (bArr[1] & 128) == 0 : (bArr[1] & com.visa.cbp.getEncExpo.kernelVersion) == 0) {
                    return true;
                }
            }
            if (bArr[0] == -1 && (bArr[1] & 128) != 0) {
                AlternateContactlessPaymentDataJson = (valueOf + 51) % 128;
                return true;
            }
        }
        return false;
    }

    private java.math.BigInteger values() {
        java.math.BigInteger bigInteger = new java.math.BigInteger(this.writeReplace);
        int i = AlternateContactlessPaymentDataJson + 117;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return bigInteger;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        java.math.BigInteger bigInteger = new java.math.BigInteger(1, ((com.payair.hce.setHorizontallyScrolling) objArr[0]).writeReplace);
        int i = AlternateContactlessPaymentDataJson + 105;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return bigInteger;
        }
        throw null;
    }

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() {
        int i = valueOf + 59;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 != 0) {
            int length = this.writeReplace.length;
            return ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(length)}, -1174070258, 1174070259, length)).intValue() + 1 + this.writeReplace.length;
        }
        int length2 = this.writeReplace.length;
        int length3 = this.writeReplace.length;
        return 0;
    }

    @Override // com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        AlternateContactlessPaymentDataJson = (valueOf + 45) % 128;
        setmaxlines.AlternateContactlessPaymentDataJson(2, this.writeReplace);
        int i = AlternateContactlessPaymentDataJson + 121;
        valueOf = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.payair.hce.setGravity
    public final int hashCode() {
        valueOf = (AlternateContactlessPaymentDataJson + 109) % 128;
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.writeReplace;
            if (i == bArr.length) {
                return i2;
            }
            int i3 = (valueOf + 121) % 128;
            AlternateContactlessPaymentDataJson = i3;
            i2 ^= (bArr[i] & 255) << (i % 4);
            i++;
            int i4 = i3 + 71;
            valueOf = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 2;
            }
        }
    }

    @Override // com.payair.hce.setEms
    final boolean AlternateContactlessPaymentDataJson(com.payair.hce.setEms setems) {
        int i = valueOf;
        AlternateContactlessPaymentDataJson = (i + 1) % 128;
        if (setems instanceof com.payair.hce.setHorizontallyScrolling) {
            return com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(this.writeReplace, ((com.payair.hce.setHorizontallyScrolling) setems).writeReplace);
        }
        AlternateContactlessPaymentDataJson = (i + 11) % 128;
        int i2 = i + 17;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 != 0) {
            return false;
        }
        throw new java.lang.ArithmeticException();
    }

    public final java.lang.String toString() {
        valueOf = (AlternateContactlessPaymentDataJson + 81) % 128;
        java.lang.String obj = values().toString();
        int i = AlternateContactlessPaymentDataJson + 115;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return obj;
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        valueOf = 0;
        AlternateContactlessPaymentDataJson = 1;
        values = 1889207096;
    }

    @Override // com.payair.hce.setEms
    final boolean writeReplace() {
        return ((java.lang.Boolean) values(new java.lang.Object[]{this}, 1478813033, -1478813033, java.lang.System.identityHashCode(this))).booleanValue();
    }

    static void init$0() {
        $$a = new byte[]{71, -67, -2, -10};
        $$b = 2;
    }

    public final java.math.BigInteger valueOf() {
        return (java.math.BigInteger) values(new java.lang.Object[]{this}, -758782782, 758782783, java.lang.System.identityHashCode(this));
    }
}
