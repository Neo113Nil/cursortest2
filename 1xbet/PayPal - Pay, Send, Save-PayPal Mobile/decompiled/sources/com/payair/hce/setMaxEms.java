package com.payair.hce;

/* loaded from: classes4.dex */
public abstract class setMaxEms extends com.payair.hce.setEms implements com.payair.hce.getApkVersion<com.payair.hce.setShadowLayer> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int DigitizedCardProfile;
    private static int valueOf;
    private static int writeReplace;
    protected java.util.Vector values = new java.util.Vector();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, short s, java.lang.Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = (i * 2) + 115;
        int i5 = (s * 4) + 4;
        int i6 = 1 - (b * 2);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i4 += -i7;
            i5++;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i5];
            i4 += -i7;
            i5++;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    @Override // com.payair.hce.setEms
    abstract void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException;

    private static void a(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            $11 = ($10 + 27) % 128;
            digitizedCardJson11.values = charArray[digitizedCardJson11.DigitizedCardProfile];
            cArr[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i4 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4]), java.lang.Integer.valueOf(DigitizedCardProfile)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.os.Process.myPid() >> 22), 2073 - android.text.TextUtils.indexOf("", "", 0), (char) (60037 - android.text.TextUtils.indexOf("", "")));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(0, (byte) 0, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.os.Process.myTid() >> 22), 3542 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
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
            char[] cArr2 = new char[i3];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i3);
            java.lang.System.arraycopy(cArr2, 0, cArr, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr2, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            $11 = ($10 + 47) % 128;
            char[] cArr3 = new char[i3];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                int i5 = $10 + 67;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = digitizedCardJson11.DigitizedCardProfile;
                    int i7 = digitizedCardJson11.DigitizedCardProfile;
                    cArr3[i6] = cArr[0];
                    java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter("", 0) + 53, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 3543, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                } else {
                    cArr3[digitizedCardJson11.DigitizedCardProfile] = cArr[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                    java.lang.Object[] objArr6 = {digitizedCardJson11, digitizedCardJson11};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 54, 3543 - android.graphics.Color.red(0), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj4);
                    }
                    ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                }
            }
            $10 = ($11 + 55) % 128;
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    public static com.payair.hce.setMaxEms DigitizedCardProfile(java.lang.Object obj) {
        while (obj != null) {
            int i = valueOf;
            writeReplace = (i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            if (obj instanceof com.payair.hce.setMaxEms) {
                break;
            }
            if (!(obj instanceof com.payair.hce.setMinWidth)) {
                if (obj instanceof byte[]) {
                    try {
                        com.payair.hce.setMaxEms DigitizedCardProfile2 = DigitizedCardProfile(writeReplace((byte[]) obj));
                        int i2 = valueOf + 87;
                        writeReplace = i2 % 128;
                        if (i2 % 2 != 0) {
                            return DigitizedCardProfile2;
                        }
                        throw new java.lang.ArithmeticException();
                    } catch (java.io.IOException e) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        a(false, "\u0002\n\r\u0006\u0005\uffc1\u0015\u0010\uffc1\u0004\u0010\u000f\u0014\u0015\u0013\u0016\u0004\u0015\uffc1\u0014\u0006\u0012\u0016\u0006\u000f\u0004\u0006\uffc1\u0007\u0013\u0010\u000e\uffc1\u0003\u001a\u0015\u0006￼\ufffeￛ\uffc1\u0007", 120 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 41, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 43, objArr);
                        sb.append(((java.lang.String) objArr[0]).intern());
                        sb.append(e.getMessage());
                        throw new java.lang.IllegalArgumentException(sb.toString());
                    }
                }
                if (obj instanceof com.payair.hce.setShadowLayer) {
                    com.payair.hce.setEms aid = ((com.payair.hce.setShadowLayer) obj).getAid();
                    if (aid instanceof com.payair.hce.setMaxEms) {
                        int i3 = writeReplace + 27;
                        valueOf = i3 % 128;
                        if (i3 % 2 == 0) {
                            return (com.payair.hce.setMaxEms) aid;
                        }
                        throw null;
                    }
                }
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(false, "\b\u0006\u0015￪\u000f\u0014\u0015\u0002\u000f\u0004\u0006ￛ\uffc1\u0016\u000f\f\u000f\u0010\u0018\u000f\uffc1\u0010\u0003\u000b\u0006\u0004\u0015\uffc1\n\u000f\uffc1", android.graphics.Color.green(0) + 121, android.view.View.combineMeasuredStates(0, 0) + 13, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 31, objArr2);
                sb2.append(((java.lang.String) objArr2[0]).intern());
                sb2.append(obj.getClass().getName());
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
            int i4 = i + 99;
            writeReplace = i4 % 128;
            if (i4 % 2 == 0) {
                ((com.payair.hce.setMinWidth) obj).getAid();
                throw null;
            }
            obj = ((com.payair.hce.setMinWidth) obj).getAid();
        }
        return (com.payair.hce.setMaxEms) obj;
    }

    protected setMaxEms() {
    }

    protected setMaxEms(com.payair.hce.setHintTextColor sethinttextcolor) {
        for (int i = 0; i != ((java.lang.Integer) com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sethinttextcolor}, -1832970438, 1832970438, java.lang.System.identityHashCode(sethinttextcolor))).intValue(); i++) {
            this.values.addElement((com.payair.hce.setShadowLayer) com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sethinttextcolor, java.lang.Integer.valueOf(i)}, 1016755526, -1016755525, i));
        }
    }

    private com.payair.hce.setShadowLayer[] RecordsJson() {
        com.payair.hce.setShadowLayer[] setshadowlayerArr = new com.payair.hce.setShadowLayer[valueOf()];
        int i = 0;
        while (i != valueOf()) {
            int i2 = writeReplace + 67;
            valueOf = i2 % 128;
            if (i2 % 2 != 0) {
                setshadowlayerArr[i] = values(i);
                i += 87;
            } else {
                setshadowlayerArr[i] = values(i);
                i++;
            }
            valueOf = (writeReplace + 65) % 128;
        }
        return setshadowlayerArr;
    }

    public java.util.Enumeration values() {
        writeReplace = (valueOf + 99) % 128;
        java.util.Enumeration elements = this.values.elements();
        int i = writeReplace + 57;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return elements;
        }
        throw null;
    }

    public com.payair.hce.setShadowLayer values(int i) {
        int i2 = writeReplace + 29;
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        com.payair.hce.setShadowLayer setshadowlayer = (com.payair.hce.setShadowLayer) this.values.elementAt(i);
        int i3 = valueOf + 79;
        writeReplace = i3 % 128;
        if (i3 % 2 != 0) {
            return setshadowlayer;
        }
        throw null;
    }

    public int valueOf() {
        valueOf = (writeReplace + 49) % 128;
        int size = this.values.size();
        writeReplace = (valueOf + 7) % 128;
        return size;
    }

    @Override // com.payair.hce.setGravity
    public int hashCode() {
        java.util.Enumeration values = values();
        int valueOf2 = valueOf();
        while (values.hasMoreElements()) {
            writeReplace = (valueOf + 53) % 128;
            valueOf2 = (valueOf2 * 17) ^ writeReplace(values).hashCode();
            valueOf = (writeReplace + 81) % 128;
        }
        int i = writeReplace + 59;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return valueOf2;
        }
        throw null;
    }

    private static com.payair.hce.setShadowLayer writeReplace(java.util.Enumeration enumeration) {
        int i = writeReplace + 17;
        valueOf = i % 128;
        if (i % 2 == 0) {
            com.payair.hce.setShadowLayer setshadowlayer = (com.payair.hce.setShadowLayer) enumeration.nextElement();
            writeReplace = (valueOf + 117) % 128;
            return setshadowlayer;
        }
        throw null;
    }

    @Override // com.payair.hce.setEms
    com.payair.hce.setEms DigitizedCardProfile() {
        com.payair.hce.setCustomInsertionActionModeCallback setcustominsertionactionmodecallback = new com.payair.hce.setCustomInsertionActionModeCallback();
        setcustominsertionactionmodecallback.values = this.values;
        int i = valueOf + 75;
        writeReplace = i % 128;
        if (i % 2 != 0) {
            return setcustominsertionactionmodecallback;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.setEms
    com.payair.hce.setEms IccPrivateKeyCrtComponentsJson() {
        com.payair.hce.setTitleMarginBottom settitlemarginbottom = new com.payair.hce.setTitleMarginBottom();
        settitlemarginbottom.values = this.values;
        int i = valueOf + 23;
        writeReplace = i % 128;
        if (i % 2 != 0) {
            return settitlemarginbottom;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.setEms
    final boolean writeReplace() {
        int i = (writeReplace + 41) % 128;
        valueOf = i;
        int i2 = i + 55;
        writeReplace = i2 % 128;
        if (i2 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public java.lang.String toString() {
        int i = valueOf + 95;
        writeReplace = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.String obj = this.values.toString();
        int i2 = writeReplace + 39;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<com.payair.hce.setShadowLayer> iterator() {
        com.payair.hce.getClientVersion.valueOf valueof = new com.payair.hce.getClientVersion.valueOf(RecordsJson());
        writeReplace = (valueOf + 39) % 128;
        return valueof;
    }

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.payair.hce.setMaxEms setmaxems = (com.payair.hce.setMaxEms) objArr[0];
        com.payair.hce.setEms setems = (com.payair.hce.setEms) objArr[1];
        if (!(setems instanceof com.payair.hce.setMaxEms)) {
            return bool;
        }
        com.payair.hce.setMaxEms setmaxems2 = (com.payair.hce.setMaxEms) setems;
        if (setmaxems.valueOf() != setmaxems2.valueOf()) {
            return bool;
        }
        java.util.Enumeration values = setmaxems.values();
        java.util.Enumeration values2 = setmaxems2.values();
        valueOf = (writeReplace + 91) % 128;
        while (values.hasMoreElements()) {
            com.payair.hce.setShadowLayer writeReplace2 = writeReplace(values);
            com.payair.hce.setShadowLayer writeReplace3 = writeReplace(values2);
            com.payair.hce.setEms aid = writeReplace2.getAid();
            com.payair.hce.setEms aid2 = writeReplace3.getAid();
            if (aid != aid2) {
                valueOf = (writeReplace + 23) % 128;
                if (!aid.equals(aid2)) {
                    int i4 = valueOf;
                    writeReplace = (i4 + 41) % 128;
                    writeReplace = (i4 + 75) % 128;
                    return bool;
                }
            }
        }
        return java.lang.Boolean.TRUE;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        valueOf = 0;
        writeReplace = 1;
        DigitizedCardProfile = 1889207163;
    }

    static void init$0() {
        $$a = new byte[]{92, 89, -124, 123};
        $$b = 42;
    }

    @Override // com.payair.hce.setEms
    final boolean AlternateContactlessPaymentDataJson(com.payair.hce.setEms setems) {
        return ((java.lang.Boolean) values(new java.lang.Object[]{this, setems}, -963165062, 963165062, java.lang.System.identityHashCode(this))).booleanValue();
    }
}
