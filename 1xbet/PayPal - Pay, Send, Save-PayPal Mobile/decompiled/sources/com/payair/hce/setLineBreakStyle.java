package com.payair.hce;

/* loaded from: classes4.dex */
public class setLineBreakStyle extends com.payair.hce.setTextSelectHandleLeft {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int valueOf;
    private static int values;
    private static int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(byte b, byte b2, byte b3, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3;
        int i4 = 3 - (b3 * 3);
        int i5 = (b2 * 4) + 1;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i5;
            i2 = i4;
            i3 = 0;
            i4 += i6;
            i = i3;
            i3 = i + 1;
            bArr2[i] = (byte) i4;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i6 = bArr[i2];
            i4 += i6;
            i = i3;
            i3 = i + 1;
            bArr2[i] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i = 0;
            i4 = (b * 3) + 115;
            i2 = i4;
            i3 = i + 1;
            bArr2[i] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    @Override // com.payair.hce.setTextMetricsParams
    public final void AlternateContactlessPaymentDataJson(java.lang.Object obj) {
        com.payair.hce.setSelection DigitizedCardProfile = DigitizedCardProfile();
        com.payair.hce.setChildIndicator gpoResponse = DigitizedCardProfile.getGpoResponse();
        com.payair.hce.setEdgeEffectColor SdkCoreAlternateContactlessPaymentDataImpl = DigitizedCardProfile.SdkCoreAlternateContactlessPaymentDataImpl();
        try {
            if (SdkCoreAlternateContactlessPaymentDataImpl.contains(obj)) {
                com.payair.hce.setGroupIndicator DigitizedCardProfile2 = DigitizedCardProfile().DigitizedCardProfile();
                if (DigitizedCardProfile2 != null) {
                    writeReplace = (valueOf + 105) % 128;
                    com.payair.hce.setGroupIndicator.AlternateContactlessPaymentDataJson(new java.lang.Object[]{DigitizedCardProfile2}, -1520778698, 1520778698, java.lang.System.identityHashCode(DigitizedCardProfile2));
                    return;
                }
                return;
            }
            DigitizedCardProfile.DigitizedCardProfile(new com.payair.hce.setEdgeEffectColor(SdkCoreAlternateContactlessPaymentDataImpl));
            DigitizedCardProfile.SdkCoreAlternateContactlessPaymentDataImpl().add(obj);
            com.payair.hce.setBottomEdgeEffectColor values2 = com.payair.hce.setBottomEdgeEffectColor.values(valueOf(obj));
            com.payair.hce.setGroupIndicator valueOf2 = DigitizedCardProfile.valueOf();
            for (com.payair.hce.setTopEdgeEffectColor settopedgeeffectcolor : values2.DigitizedCardProfile()) {
                writeReplace = (valueOf + 83) % 128;
                gpoResponse.AlternateContactlessPaymentDataJson((java.lang.String) com.payair.hce.setTopEdgeEffectColor.DigitizedCardProfile(new java.lang.Object[]{settopedgeeffectcolor}, 1544115242, -1544115240, java.lang.System.identityHashCode(settopedgeeffectcolor)));
                if (DigitizedCardProfile.values(settopedgeeffectcolor) && settopedgeeffectcolor.IccPrivateKeyCrtComponentsJson().booleanValue()) {
                    valueOf = (writeReplace + 15) % 128;
                    java.lang.Object valueOf3 = settopedgeeffectcolor.valueOf(obj);
                    if (DigitizedCardProfile.SdkCoreAlternateContactlessPaymentDataImpl().contains(valueOf3)) {
                        continue;
                    } else {
                        int i = writeReplace + 33;
                        valueOf = i % 128;
                        if (i % 2 != 0) {
                            DigitizedCardProfile.AlternateContactlessPaymentDataJson(settopedgeeffectcolor, valueOf3);
                            throw new java.lang.NullPointerException();
                        }
                        com.payair.hce.setTextMetricsParams AlternateContactlessPaymentDataJson = DigitizedCardProfile.AlternateContactlessPaymentDataJson(settopedgeeffectcolor, valueOf3);
                        if (!(AlternateContactlessPaymentDataJson instanceof com.payair.hce.setElegantTextHeight) || !((com.payair.hce.setElegantTextHeight) AlternateContactlessPaymentDataJson).writeReplace().booleanValue()) {
                            if (!((java.lang.Boolean) com.payair.hce.setGroupIndicator.AlternateContactlessPaymentDataJson(new java.lang.Object[]{valueOf2}, 1811763571, -1811763570, java.lang.System.identityHashCode(valueOf2))).booleanValue()) {
                                com.payair.hce.setSelection.DigitizedCardProfile(new java.lang.Object[]{DigitizedCardProfile}, -944109026, 944109029, java.lang.System.identityHashCode(DigitizedCardProfile));
                            }
                            com.payair.hce.setGroupIndicator.AlternateContactlessPaymentDataJson(new java.lang.Object[]{valueOf2}, 1431129342, -1431129340, java.lang.System.identityHashCode(valueOf2));
                            DigitizedCardProfile.values(settopedgeeffectcolor.writeReplace());
                        }
                        settopedgeeffectcolor.writeReplace();
                        AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson(valueOf3);
                    }
                }
                gpoResponse.writeReplace();
            }
            DigitizedCardProfile.AlternateContactlessPaymentDataJson();
            DigitizedCardProfile.DigitizedCardProfile((com.payair.hce.setEdgeEffectColor) DigitizedCardProfile.SdkCoreAlternateContactlessPaymentDataImpl().valueOf());
        } catch (com.payair.hce.setOnGroupCollapseListener e) {
            throw e;
        } catch (java.lang.Exception e2) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            c("ￄ\u0018\u0016\u001d\r\u0012\u000bￄ\u0018\u0013ￄ\u0017\t\u0016\r\u0005\u0010\r\u001e\tￒ\uffc9\u0017\uffdeￄ￩\u0016\u0016\u0013\u0016ￄ\u001b\f\r\u0010\t", android.text.TextUtils.indexOf("", "") + 99, 21 - android.graphics.Color.argb(0, 0, 0, 0), false, android.view.View.combineMeasuredStates(0, 0) + 36, objArr);
            throw new com.payair.hce.setOnGroupCollapseListener(java.lang.String.format(((java.lang.String) objArr[0]).intern(), gpoResponse), e2);
        }
    }

    protected java.lang.Class valueOf(java.lang.Object obj) {
        int i = writeReplace + 47;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return obj.getClass();
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(java.lang.String str, int i, int i2, boolean z, int i3, java.lang.Object[] objArr) {
        char c;
        java.lang.Throwable cause;
        $10 = ($11 + 67) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (true) {
            int i4 = digitizedCardJson11.DigitizedCardProfile;
            c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
            if (i4 >= i3) {
                break;
            }
            $11 = ($10 + 109) % 128;
            digitizedCardJson11.values = charArray[digitizedCardJson11.DigitizedCardProfile];
            cArr[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i5 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i5]), java.lang.Integer.valueOf(values)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 43, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2072, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 60038));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d((byte) 0, (byte) 0, (byte) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 53, 3543 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) android.text.TextUtils.getOffsetAfter("", 0))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
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
        if (i2 > 0) {
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i2;
            char[] cArr2 = new char[i3];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i3);
            java.lang.System.arraycopy(cArr2, 0, cArr, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr2, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            char[] cArr3 = new char[i3];
            digitizedCardJson11.DigitizedCardProfile = 0;
            $10 = ($11 + 29) % 128;
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                cArr3[digitizedCardJson11.DigitizedCardProfile] = cArr[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode("", 0, 0) + 53, android.text.TextUtils.indexOf("", c) + 3544, (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        valueOf = 0;
        writeReplace = 1;
        values = 1889207142;
    }

    static void init$0() {
        $$d = new byte[]{117, -13, -118, com.google.common.base.Ascii.RS};
        $$e = 64;
    }
}
