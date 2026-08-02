package com.payair.hce;

/* loaded from: classes4.dex */
public final class setFallbackLineSpacing extends com.payair.hce.setTextSelectHandleLeft {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int valueOf;
    private static int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = (i * 4) + 4;
        int i5 = b2 * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            i3 = i4;
            int i6 = i5;
            i2 = 0;
            i4 += i6;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i6 = bArr[i3];
            i4 += i6;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            int i7 = (b * 4) + 115;
            i2 = 0;
            i3 = i4;
            i4 = i7;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    @Override // com.payair.hce.setTextMetricsParams
    public final void AlternateContactlessPaymentDataJson(java.lang.Object obj) {
        java.lang.String str;
        com.payair.hce.setSelection DigitizedCardProfile = DigitizedCardProfile();
        com.payair.hce.setChildIndicator gpoResponse = DigitizedCardProfile.getGpoResponse();
        java.util.Map map = (java.util.Map) obj;
        try {
            com.payair.hce.setGroupIndicator valueOf2 = DigitizedCardProfile().valueOf();
            for (java.lang.Object obj2 : map.keySet()) {
                if (obj2 != null) {
                    writeReplace = (AlternateContactlessPaymentDataJson + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                    str = obj2.toString();
                } else {
                    writeReplace = (AlternateContactlessPaymentDataJson + 7) % 128;
                    str = null;
                }
                gpoResponse.AlternateContactlessPaymentDataJson(str);
                if (DigitizedCardProfile.DigitizedCardProfile(map.get(obj2))) {
                    writeReplace = (AlternateContactlessPaymentDataJson + 121) % 128;
                    com.payair.hce.setTextMetricsParams AlternateContactlessPaymentDataJson2 = DigitizedCardProfile.AlternateContactlessPaymentDataJson(null, map.get(obj2));
                    if (AlternateContactlessPaymentDataJson2 instanceof com.payair.hce.setElegantTextHeight) {
                        int i = AlternateContactlessPaymentDataJson + 119;
                        writeReplace = i % 128;
                        if (i % 2 != 0) {
                            ((com.payair.hce.setElegantTextHeight) AlternateContactlessPaymentDataJson2).writeReplace();
                            throw null;
                        }
                        if (!((com.payair.hce.setElegantTextHeight) AlternateContactlessPaymentDataJson2).writeReplace().booleanValue()) {
                        }
                        AlternateContactlessPaymentDataJson2.AlternateContactlessPaymentDataJson(map.get(obj2));
                    }
                    if (!((java.lang.Boolean) com.payair.hce.setGroupIndicator.AlternateContactlessPaymentDataJson(new java.lang.Object[]{valueOf2}, 1811763571, -1811763570, java.lang.System.identityHashCode(valueOf2))).booleanValue()) {
                        com.payair.hce.setSelection DigitizedCardProfile2 = DigitizedCardProfile();
                        com.payair.hce.setSelection.DigitizedCardProfile(new java.lang.Object[]{DigitizedCardProfile2}, -944109026, 944109029, java.lang.System.identityHashCode(DigitizedCardProfile2));
                    }
                    com.payair.hce.setGroupIndicator.AlternateContactlessPaymentDataJson(new java.lang.Object[]{valueOf2}, 1431129342, -1431129340, java.lang.System.identityHashCode(valueOf2));
                    if (obj2 != null) {
                        DigitizedCardProfile().values(obj2.toString());
                    } else {
                        DigitizedCardProfile().values((java.lang.String) null);
                    }
                    AlternateContactlessPaymentDataJson2.AlternateContactlessPaymentDataJson(map.get(obj2));
                }
                gpoResponse.writeReplace();
            }
            DigitizedCardProfile().AlternateContactlessPaymentDataJson();
        } catch (java.lang.Exception e) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(true, "ￄ\uffde\u0017\uffc9ￒ\t\u001e\r\u0010\u0005\r\u0016\t\u0017ￄ\u0013\u0018ￄ\u000b\u0012\r\u001d\u0016\u0018ￄ\t\u0010\r\f\u001bￄ\u0016\u0013\u0016\u0016￩", (-16776959) - android.graphics.Color.rgb(0, 0, 0), 4 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 36 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr);
            throw new com.payair.hce.setOnGroupCollapseListener(java.lang.String.format(((java.lang.String) objArr[0]).intern(), gpoResponse), e);
        }
    }

    private static void a(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        if (str != null) {
            int i4 = $11 + 75;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr3 = cArr;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr4 = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            digitizedCardJson11.values = cArr3[digitizedCardJson11.DigitizedCardProfile];
            cArr4[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i5 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr4[i5]), java.lang.Integer.valueOf(valueOf)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter("", 0) + 43, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 2073, (char) (60037 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(0, (byte) 0, (byte) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr4[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 52, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 3544, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
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
            int i6 = $10 + 51;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2 = new char[i3];
                digitizedCardJson11.DigitizedCardProfile = 1;
            } else {
                cArr2 = new char[i3];
                digitizedCardJson11.DigitizedCardProfile = 0;
            }
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                $10 = ($11 + 65) % 128;
                cArr2[digitizedCardJson11.DigitizedCardProfile] = cArr4[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.graphics.Color.green(0), 3543 - android.graphics.Color.red(0), (char) android.graphics.Color.red(0))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            cArr4 = cArr2;
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        writeReplace = 0;
        AlternateContactlessPaymentDataJson = 1;
        valueOf = 1889207236;
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.FF, 9, 103, -116};
        $$b = 52;
    }
}
