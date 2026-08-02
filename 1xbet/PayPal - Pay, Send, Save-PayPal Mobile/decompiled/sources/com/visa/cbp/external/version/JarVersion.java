package com.visa.cbp.external.version;

/* loaded from: classes16.dex */
public class JarVersion {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ConfirmReplenishRequest = 1;
    private static int valueOf = 0;
    private static long values = 3992681184514196357L;
    private java.lang.String compoundVersion;
    private java.lang.String environment;
    private java.lang.String head;
    private java.lang.String target;
    private java.lang.String timestamp;
    private java.lang.String type;
    private java.lang.String version;

    public JarVersion(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        this.type = str;
        this.version = str2;
        this.environment = str3;
        this.head = str4;
        this.target = str6;
        this.timestamp = str7;
        validateData();
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("০൯Ýѧᮚỷ\u125f⦬ⵘ\u206b⟄㭏㺻㉉䥸䳕䀧䞊媺幉喢椗沙掫杖窳縇畨袜", 1182 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.util.Locale locale2 = java.util.Locale.US;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("০\uf62b\uf655\uf63b\uf6f8\uf6db\uf6e7\uf708\uf778", org.apache.commons.imaging.formats.jpeg.JpegConstants.EOI_MARKER - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
        this.compoundVersion = java.lang.String.format(locale, intern, str, str2, str3, str4, java.lang.String.format(locale2, ((java.lang.String) objArr2[0]).intern(), str5, str6), str7);
    }

    public java.lang.String getType() {
        int i = valueOf;
        ConfirmReplenishRequest = (i + 29) % 128;
        java.lang.String str = this.type;
        ConfirmReplenishRequest = (i + 69) % 128;
        return str;
    }

    public void setType(java.lang.String str) {
        int i = ConfirmReplenishRequest + 85;
        int i2 = i % 128;
        valueOf = i2;
        this.type = str;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        ConfirmReplenishRequest = (i2 + 99) % 128;
    }

    public java.lang.String getEnvironment() {
        int i = (ConfirmReplenishRequest + 33) % 128;
        valueOf = i;
        java.lang.String str = this.environment;
        int i2 = i + 97;
        ConfirmReplenishRequest = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setEnvironment(java.lang.String str) {
        int i = valueOf;
        int i2 = i + 1;
        ConfirmReplenishRequest = i2 % 128;
        this.environment = str;
        if (i2 % 2 == 0) {
            throw null;
        }
        ConfirmReplenishRequest = (i + 5) % 128;
    }

    public java.lang.String getHead() {
        int i = valueOf + 103;
        int i2 = i % 128;
        ConfirmReplenishRequest = i2;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.String str = this.head;
        valueOf = (i2 + 117) % 128;
        return str;
    }

    public void setHead(java.lang.String str) {
        int i = (valueOf + 67) % 128;
        ConfirmReplenishRequest = i;
        this.head = str;
        valueOf = (i + 97) % 128;
    }

    public java.lang.String getTimestamp() {
        int i = ConfirmReplenishRequest + 75;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return this.timestamp;
        }
        throw null;
    }

    public void setTimestamp(java.lang.String str) {
        int i = ConfirmReplenishRequest;
        valueOf = (i + 23) % 128;
        this.timestamp = str;
        valueOf = (i + 65) % 128;
    }

    public java.lang.String getVersion() {
        int i = valueOf + 99;
        ConfirmReplenishRequest = i % 128;
        if (i % 2 != 0) {
            return this.version;
        }
        throw null;
    }

    public void setVersion(java.lang.String str) {
        int i = valueOf;
        ConfirmReplenishRequest = (i + 75) % 128;
        this.version = str;
        ConfirmReplenishRequest = (i + 109) % 128;
    }

    public java.lang.String getTarget() {
        int i = (valueOf + 53) % 128;
        ConfirmReplenishRequest = i;
        java.lang.String str = this.target;
        int i2 = i + 17;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public void setTarget(java.lang.String str) {
        int i = ConfirmReplenishRequest;
        valueOf = (i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        this.target = str;
        valueOf = (i + 5) % 128;
    }

    private void validateData() {
        if (!com.visa.cbp.sdk.facade.util.UtilityFunctions.isNullOrEmpty(this.type)) {
            ConfirmReplenishRequest = (valueOf + 79) % 128;
            if (!com.visa.cbp.sdk.facade.util.UtilityFunctions.isNullOrEmpty(this.version) && !com.visa.cbp.sdk.facade.util.UtilityFunctions.isNullOrEmpty(this.environment)) {
                ConfirmReplenishRequest = (valueOf + 15) % 128;
                if (!com.visa.cbp.sdk.facade.util.UtilityFunctions.isNullOrEmpty(this.head) && !com.visa.cbp.sdk.facade.util.UtilityFunctions.isNullOrEmpty(this.timestamp)) {
                    ConfirmReplenishRequest = (valueOf + 95) % 128;
                    return;
                }
            }
        }
        throw new com.visa.cbp.sdk.facade.exception.InvalidVersionException(com.visa.cbp.setDeviceCerts.nextI);
    }

    public java.lang.String toString() {
        int i = ConfirmReplenishRequest;
        valueOf = (i + 19) % 128;
        java.lang.String str = this.compoundVersion;
        int i2 = i + 33;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static void values(com.visa.cbp.getIssuerApplicationDiscretionaryData getissuerapplicationdiscretionarydata) {
        int i = valueOf + 13;
        ConfirmReplenishRequest = i % 128;
        try {
            if (i % 2 == 0) {
                getissuerapplicationdiscretionarydata.ConfirmReplenishRequest();
                throw new java.lang.ArithmeticException();
            }
            if (getissuerapplicationdiscretionarydata.ConfirmReplenishRequest()) {
                int i2 = valueOf + 19;
                ConfirmReplenishRequest = i2 % 128;
                if (i2 % 2 == 0) {
                    ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), android.view.KeyEvent.normalizeMetaState(0) + 2090, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 30)).getField("ConfirmReplenishRequest").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
                    throw new java.lang.NullPointerException();
                }
                ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), android.os.Process.getGidForName("") + 2091, 30 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getField("ConfirmReplenishRequest").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
            }
            if (getissuerapplicationdiscretionarydata.values()) {
                ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 2090 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 31 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).getField("BuildConfig").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
            }
            if (getissuerapplicationdiscretionarydata.ReplenishAckRequest()) {
                valueOf = (ConfirmReplenishRequest + 19) % 128;
                ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.view.View.getDefaultSize(0, 0), 2090 - (android.view.ViewConfiguration.getTapTimeout() >> 16), android.view.KeyEvent.normalizeMetaState(0) + 30)).getField("values").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
            }
            if (getissuerapplicationdiscretionarydata.BuildConfig()) {
                int i3 = ConfirmReplenishRequest + 67;
                valueOf = i3 % 128;
                if (i3 % 2 == 0) {
                    ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2090, 29 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0))).getField("valueOf").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
                } else {
                    ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 2090 - android.text.TextUtils.indexOf("", "", 0, 0), 31 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).getField("valueOf").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
                    throw new java.lang.ArithmeticException();
                }
            }
        } catch (com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException unused) {
        }
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = $11 + 43;
        $10 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.visa.cbp.getMac getmac = new com.visa.cbp.getMac();
        getmac.valueOf = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        getmac.ReplenishAckRequest = 0;
        while (getmac.ReplenishAckRequest < charArray.length) {
            $11 = ($10 + 51) % 128;
            int i3 = getmac.ReplenishAckRequest;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(charArray[getmac.ReplenishAckRequest]), getmac, getmac};
                java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1810087414);
                if (obj == null) {
                    obj = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (59971 - android.view.View.getDefaultSize(0, 0)), 1741 - android.view.View.resolveSize(0, 0), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 40)).getMethod("x", java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1810087414, obj);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (values ^ 7797973607618693702L);
                try {
                    java.lang.Object[] objArr3 = {getmac, getmac};
                    java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(2107890674);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.view.KeyEvent.normalizeMetaState(0), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1836, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 25)).getMethod("w", java.lang.Object.class, java.lang.Object.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(2107890674, obj2);
                    }
                    ((java.lang.reflect.Method) obj2).invoke(null, objArr3);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        char[] cArr = new char[length];
        getmac.ReplenishAckRequest = 0;
        while (getmac.ReplenishAckRequest < charArray.length) {
            int i4 = $10 + 93;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                cArr[getmac.ReplenishAckRequest] = (char) jArr[getmac.ReplenishAckRequest];
                try {
                    java.lang.Object[] objArr4 = {getmac, getmac};
                    java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(2107890674);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.widget.ExpandableListView.getPackedPositionType(0L), (android.os.Process.myTid() >> 22) + 1837, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 25)).getMethod("w", java.lang.Object.class, java.lang.Object.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(2107890674, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
                    throw new java.lang.ArithmeticException();
                } catch (java.lang.Throwable th3) {
                    java.lang.Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            cArr[getmac.ReplenishAckRequest] = (char) jArr[getmac.ReplenishAckRequest];
            try {
                java.lang.Object[] objArr5 = {getmac, getmac};
                java.lang.Object obj4 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(2107890674);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.view.KeyEvent.normalizeMetaState(0), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 1837, 26 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)))).getMethod("w", java.lang.Object.class, java.lang.Object.class);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(2107890674, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
            } catch (java.lang.Throwable th4) {
                java.lang.Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        java.lang.String str2 = new java.lang.String(cArr);
        $11 = ($10 + 77) % 128;
        objArr[0] = str2;
    }
}
