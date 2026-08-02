package com.payair.hce;

/* loaded from: classes4.dex */
public final class setChildDivider {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static long getAid;
    public static final char[] valueOf;
    private java.lang.String getProfileVersion;
    private boolean values;
    private java.util.Map<com.payair.hce.setChildIndicator, com.payair.hce.setTextMetricsParams> AlternateContactlessPaymentDataJson = new java.util.HashMap();
    private java.util.List<com.payair.hce.setChildIndicatorBounds> DigitizedCardProfile = new java.util.ArrayList();
    private com.payair.hce.setShowSoftInputOnFocus writeReplace = new com.payair.hce.setShowSoftInputOnFocus((com.payair.hce.setShowSoftInputOnFocus) com.payair.hce.setIndicatorBounds.valueOf(new java.lang.Object[0], 929288829, -929288829, (int) java.lang.System.currentTimeMillis()));

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = i + 112;
        byte[] bArr = $$a;
        int i6 = 4 - (i2 * 4);
        int i7 = (s * 2) + 1;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            i5 = i7;
            int i8 = i6;
            int i9 = 0;
            i5 += -i6;
            i6 = i8 + 1;
            i3 = i9;
            bArr2[i3] = (byte) i5;
            i4 = i3 + 1;
            if (i4 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = i6;
            i6 = bArr[i6];
            i9 = i4;
            i5 += -i6;
            i6 = i8 + 1;
            i3 = i9;
            bArr2[i3] = (byte) i5;
            i4 = i3 + 1;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            i4 = i3 + 1;
            if (i4 == i7) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        return AlternateContactlessPaymentDataJson(objArr);
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = $11 + 77;
        int i3 = i2 % 128;
        $10 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            $11 = (i3 + 115) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
        getdsrpdata.values = i;
        int length = cArr2.length;
        long[] jArr = new long[length];
        getdsrpdata.valueOf = 0;
        $10 = ($11 + 29) % 128;
        while (getdsrpdata.valueOf < cArr2.length) {
            $11 = ($10 + 45) % 128;
            int i4 = getdsrpdata.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1890, (char) (3600 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((short) 0, 1, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                }
                jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (getAid ^ (-4761752123935132024L));
                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(63 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (android.os.Process.myTid() >> 22) + 1443, (char) (29682 - android.view.View.getDefaultSize(0, 0)));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b((short) 0, 0, 0, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                int i5 = $11 + 115;
                $10 = i5 % 128;
                int i6 = i5 % 2;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr3 = new char[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < cArr2.length) {
            cArr3[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj3 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 1443 - android.view.View.resolveSize(0, 0), (char) (android.view.KeyEvent.getDeadChar(0, 0) + 29682));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b((short) 0, 0, 0, objArr7);
                obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        IccPrivateKeyCrtComponentsJson = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        DigitizedCardProfile();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\uf392䜬髮\uedacⅪ琬쿮ʬ噢꤬ﲕ㟕謕\ude55ᆕ擕", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 46271, objArr);
        valueOf = ((java.lang.String) objArr[0]).intern().toCharArray();
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 13;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final com.payair.hce.setChildDivider values(java.lang.String str) {
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        IccPrivateKeyCrtComponentsJson = (i + 33) % 128;
        this.getProfileVersion = str;
        IccPrivateKeyCrtComponentsJson = (i + 5) % 128;
        return this;
    }

    public final java.lang.String DigitizedCardProfile(java.lang.Object obj) {
        java.lang.String valueOf2 = valueOf(obj, com.payair.hce.setChildIndicatorBoundsRelative.DigitizedCardProfile, new com.payair.hce.setIndicatorBoundsRelative(new java.lang.StringBuilder()));
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 49) % 128;
        return valueOf2;
    }

    private java.lang.String valueOf(java.lang.Object obj, com.payair.hce.setChildIndicatorBoundsRelative setchildindicatorboundsrelative, com.payair.hce.setOnChildClickListener setonchildclicklistener) {
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 121) % 128;
        com.payair.hce.setSelection aid = com.payair.hce.setSelection.getAid();
        aid.AlternateContactlessPaymentDataJson(this.getProfileVersion);
        com.payair.hce.setSelection.DigitizedCardProfile(new java.lang.Object[]{aid, java.lang.Boolean.valueOf(this.values)}, 1199520252, -1199520248, java.lang.System.identityHashCode(aid));
        com.payair.hce.setSelection.DigitizedCardProfile(new java.lang.Object[]{aid, setonchildclicklistener}, -1437330681, 1437330687, java.lang.System.identityHashCode(aid));
        aid.writeReplace(setchildindicatorboundsrelative);
        aid.DigitizedCardProfile(this.writeReplace);
        aid.AlternateContactlessPaymentDataJson(this.AlternateContactlessPaymentDataJson);
        aid.AlternateContactlessPaymentDataJson(this.DigitizedCardProfile);
        try {
            java.lang.String ciacDecline = aid.getCiacDecline();
            if (ciacDecline != null) {
                IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 87) % 128;
                if (!ciacDecline.trim().equals("")) {
                    aid.valueOf();
                    aid.values(ciacDecline);
                    aid.AlternateContactlessPaymentDataJson(obj);
                    aid.AlternateContactlessPaymentDataJson();
                    java.lang.String obj2 = aid.values().toString();
                    com.payair.hce.setSelection.DigitizedCardProfile(new java.lang.Object[0], -115944601, 115944603, (int) java.lang.System.currentTimeMillis());
                    return obj2;
                }
            }
            aid.AlternateContactlessPaymentDataJson(obj);
            java.lang.String obj22 = aid.values().toString();
            com.payair.hce.setSelection.DigitizedCardProfile(new java.lang.Object[0], -115944601, 115944603, (int) java.lang.System.currentTimeMillis());
            return obj22;
        } catch (java.lang.Throwable th) {
            com.payair.hce.setSelection.DigitizedCardProfile(new java.lang.Object[0], -115944601, 115944603, (int) java.lang.System.currentTimeMillis());
            throw th;
        }
    }

    public final com.payair.hce.setChildDivider AlternateContactlessPaymentDataJson(com.payair.hce.setTextMetricsParams settextmetricsparams, java.lang.Class... clsArr) {
        com.payair.hce.setLineBreakWordStyle setlinebreakwordstyle = new com.payair.hce.setLineBreakWordStyle(settextmetricsparams);
        int length = clsArr.length;
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 99) % 128;
        for (int i = 0; i <= 0; i++) {
            SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 29) % 128;
            java.lang.Class cls = clsArr[0];
            com.payair.hce.setShowSoftInputOnFocus setshowsoftinputonfocus = this.writeReplace;
        }
        return this;
    }

    private void valueOf(java.lang.String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf > 0) {
            com.payair.hce.setChildIndicatorBounds setchildindicatorbounds = new com.payair.hce.setChildIndicatorBounds(str.substring(0, lastIndexOf), true);
            if (!((java.lang.Boolean) com.payair.hce.setChildIndicatorBounds.valueOf(new java.lang.Object[]{setchildindicatorbounds}, 1267174990, -1267174990, java.lang.System.identityHashCode(setchildindicatorbounds))).booleanValue()) {
                int i = SdkCoreAlternateContactlessPaymentDataImpl + 45;
                IccPrivateKeyCrtComponentsJson = i % 128;
                if (i % 2 == 0) {
                    this.DigitizedCardProfile.add(setchildindicatorbounds);
                } else {
                    this.DigitizedCardProfile.add(setchildindicatorbounds);
                    throw null;
                }
            }
        }
        this.DigitizedCardProfile.add(new com.payair.hce.setChildIndicatorBounds(str, false));
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 39) % 128;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        ((com.payair.hce.setChildDivider) objArr[0]).DigitizedCardProfile.add(new com.payair.hce.setChildIndicatorBounds((java.lang.String) objArr[1], true));
        int i = IccPrivateKeyCrtComponentsJson + 65;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final com.payair.hce.setChildDivider valueOf(java.lang.String... strArr) {
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 13) % 128;
        int length = strArr.length;
        for (int i = 0; i <= 0; i++) {
            valueOf(strArr[0]);
        }
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 115) % 128;
        return this;
    }

    public final com.payair.hce.setChildDivider values(java.lang.String... strArr) {
        int length = strArr.length;
        int i = 0;
        while (i <= 0) {
            SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 95) % 128;
            values(new java.lang.Object[]{this, strArr[0]}, 1604430752, -1604430752, java.lang.System.identityHashCode(this));
            i++;
            IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 121) % 128;
        }
        return this;
    }

    static void DigitizedCardProfile() {
        getAid = -3599640354597665494L;
    }

    private void AlternateContactlessPaymentDataJson(java.lang.String str) {
        values(new java.lang.Object[]{this, str}, 1604430752, -1604430752, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{82, -10, -24, -99};
        $$b = 50;
    }
}
