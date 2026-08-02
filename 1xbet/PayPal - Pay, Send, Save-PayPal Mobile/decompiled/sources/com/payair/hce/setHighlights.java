package com.payair.hce;

/* loaded from: classes4.dex */
public final class setHighlights {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int writeReplace;
    private final int DigitizedCardProfile;
    private final byte[][] valueOf;
    private final java.io.InputStream values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = (b * 2) + 107;
        byte[] bArr = $$a;
        int i5 = (b2 * 3) + 1;
        int i6 = i + 4;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            int i8 = i6;
            int i9 = i6 + i7;
            i2 = i3;
            int i10 = i8;
            i4 = i9;
            i6 = i10;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            int i11 = i6 + 1;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i12 = i4;
            i8 = i11;
            i6 = bArr[i11];
            i7 = i12;
            int i92 = i6 + i7;
            i2 = i3;
            int i102 = i8;
            i4 = i92;
            i6 = i102;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            int i112 = i6 + 1;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            int i1122 = i6 + 1;
            if (i3 == i5) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        return valueOf(objArr);
    }

    public setHighlights(java.io.InputStream inputStream) {
        this(inputStream, ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{inputStream}, -1279936687, 1279936689, (int) java.lang.System.currentTimeMillis())).intValue());
    }

    public setHighlights(java.io.InputStream inputStream, int i) {
        this.values = inputStream;
        this.DigitizedCardProfile = i;
        this.valueOf = new byte[11][];
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setHighlights sethighlights = (com.payair.hce.setHighlights) objArr[0];
        int intValue = ((java.lang.Number) objArr[1]).intValue();
        writeReplace = (SdkCoreAlternateContactlessPaymentDataImpl + 111) % 128;
        if (intValue == 4) {
            return new com.payair.hce.setSpannableFactory(sethighlights);
        }
        if (intValue == 8) {
            return new com.payair.hce.setImeHintLocales(sethighlights);
        }
        if (intValue == 16) {
            com.payair.hce.setText settext = new com.payair.hce.setText(sethighlights);
            int i = SdkCoreAlternateContactlessPaymentDataImpl + 113;
            writeReplace = i % 128;
            if (i % 2 == 0) {
                return settext;
            }
            throw null;
        }
        if (intValue == 17) {
            com.payair.hce.setRawInputType setrawinputtype = new com.payair.hce.setRawInputType(sethighlights);
            int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 17;
            writeReplace = i2 % 128;
            if (i2 % 2 == 0) {
                return setrawinputtype;
            }
            throw null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(new int[]{0, 34, 149, 34}, null, true, objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(java.lang.Integer.toHexString(intValue));
        throw new com.payair.hce.setAutoLinkMask(sb.toString());
    }

    final com.payair.hce.setEms DigitizedCardProfile(boolean z, int i) throws java.io.IOException {
        writeReplace = (SdkCoreAlternateContactlessPaymentDataImpl + 17) % 128;
        if (!z) {
            return new com.payair.hce.setTitleMarginStart(false, i, new com.payair.hce.setEllipsize(((com.payair.hce.setNavigationContentDescription) this.values).DigitizedCardProfile()));
        }
        com.payair.hce.setHintTextColor values = values();
        if (this.values instanceof com.payair.hce.setTitleTextColor) {
            int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 109;
            writeReplace = i2 % 128;
            if (i2 % 2 == 0 ? ((java.lang.Integer) com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{values}, -1832970438, 1832970438, java.lang.System.identityHashCode(values))).intValue() == 1 : ((java.lang.Integer) com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{values}, -1832970438, 1832970438, java.lang.System.identityHashCode(values))).intValue() == 1) {
                return new com.payair.hce.setTextKeepState(true, i, values.valueOf(0));
            }
            return new com.payair.hce.setTextKeepState(false, i, (com.payair.hce.setFreezesText) com.payair.hce.setFocusedSearchResultHighlightColor.valueOf(new java.lang.Object[]{values}, 2095243151, -2095243151, (int) java.lang.System.currentTimeMillis()));
        }
        if (((java.lang.Integer) com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{values}, -1832970438, 1832970438, java.lang.System.identityHashCode(values))).intValue() == 1) {
            return new com.payair.hce.setTitleMarginStart(true, i, values.valueOf(0));
        }
        return new com.payair.hce.setTitleMarginStart(false, i, (com.payair.hce.setMaxEms) com.payair.hce.setFilters.DigitizedCardProfile(new java.lang.Object[]{values}, 1855195378, -1855195378, (int) java.lang.System.currentTimeMillis()));
    }

    private static void a(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        int i;
        int i2;
        java.lang.String str2 = str;
        int i3 = $11;
        $10 = (i3 + 49) % 128;
        byte[] bArr = str2;
        if (str2 != null) {
            $10 = (i3 + 77) % 128;
            byte[] bytes = str2.getBytes("ISO-8859-1");
            $11 = ($10 + 81) % 128;
            bArr = bytes;
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = AlternateContactlessPaymentDataJson;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i8 = 0; i8 < length; i8++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i8])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 29, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 2808, (char) android.view.View.combineMeasuredStates(0, 0));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(-1, (byte) 1, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    }
                    cArr2[i8] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
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
        char[] cArr3 = new char[i5];
        java.lang.System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr2 != null) {
            char[] cArr4 = new char[i5];
            getaccounttype.writeReplace = 0;
            char c = 0;
            while (getaccounttype.writeReplace < i5) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i9 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.view.View.MeasureSpec.getSize(0), 2836 - android.view.KeyEvent.normalizeMetaState(0), (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(-1, (byte) 0, (byte) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                    }
                    cArr4[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    int i10 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.KeyEvent.getDeadChar(0, 0) + 2880, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b(-1, (byte) 2, (byte) 0, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj3);
                    }
                    cArr4[i10] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                }
                c = cArr4[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 212 - android.graphics.Color.alpha(0), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i11 = i5 - i7;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i11, i7);
            java.lang.System.arraycopy(cArr5, i7, cArr3, 0, i11);
        }
        if (z) {
            char[] cArr6 = new char[i5];
            getaccounttype.writeReplace = 0;
            $11 = ($10 + 79) % 128;
            while (getaccounttype.writeReplace < i5) {
                int i12 = $11 + 115;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    cArr6[getaccounttype.writeReplace] = cArr3[(i5 << getaccounttype.writeReplace) >>> 1];
                    i2 = getaccounttype.writeReplace;
                } else {
                    cArr6[getaccounttype.writeReplace] = cArr3[(i5 - getaccounttype.writeReplace) - 1];
                    i2 = getaccounttype.writeReplace + 1;
                }
                getaccounttype.writeReplace = i2;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            getaccounttype.writeReplace = 0;
            $10 = ($11 + 103) % 128;
            while (getaccounttype.writeReplace < i5) {
                int i13 = $11 + 43;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] << iArr[2]);
                    i = getaccounttype.writeReplace % 1;
                } else {
                    cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] - iArr[2]);
                    i = getaccounttype.writeReplace + 1;
                }
                getaccounttype.writeReplace = i;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    public final com.payair.hce.setShadowLayer DigitizedCardProfile() throws java.io.IOException {
        boolean z;
        int i = writeReplace + 89;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            this.values.read();
            throw new java.lang.ArithmeticException();
        }
        int read = this.values.read();
        if (read == -1) {
            return null;
        }
        valueOf();
        int intValue = ((java.lang.Integer) com.payair.hce.setMinHeight.writeReplace(new java.lang.Object[]{this.values, java.lang.Integer.valueOf(read)}, 1019289983, -1019289982, read)).intValue();
        if ((read & 32) != 0) {
            int i2 = (writeReplace + 101) % 128;
            SdkCoreAlternateContactlessPaymentDataImpl = i2;
            writeReplace = (i2 + 113) % 128;
            z = true;
        } else {
            z = false;
        }
        int valueOf = com.payair.hce.setMinHeight.valueOf(this.values, this.DigitizedCardProfile);
        if (valueOf < 0) {
            if (z) {
                com.payair.hce.setHighlights sethighlights = new com.payair.hce.setHighlights(new com.payair.hce.setTitleTextColor(this.values, this.DigitizedCardProfile), this.DigitizedCardProfile);
                return (read & 64) != 0 ? new com.payair.hce.setEditableFactory(intValue, sethighlights) : (read & 128) != 0 ? new com.payair.hce.setHint(true, intValue, sethighlights) : (com.payair.hce.setShadowLayer) values(new java.lang.Object[]{sethighlights, java.lang.Integer.valueOf(intValue)}, 2004181830, -2004181830, intValue);
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new int[]{34, 48, 76, 28}, "\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000", false, objArr);
            throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
        }
        com.payair.hce.setNavigationContentDescription setnavigationcontentdescription = new com.payair.hce.setNavigationContentDescription(this.values, valueOf);
        if ((read & 64) != 0) {
            return new com.payair.hce.setInputExtras(z, intValue, setnavigationcontentdescription.DigitizedCardProfile());
        }
        if ((read & 128) != 0) {
            return new com.payair.hce.setHint(z, intValue, new com.payair.hce.setHighlights(setnavigationcontentdescription));
        }
        if (!z) {
            if (intValue == 4) {
                return new com.payair.hce.setSingleLine(setnavigationcontentdescription);
            }
            try {
                return (com.payair.hce.setEms) com.payair.hce.setMinHeight.writeReplace(new java.lang.Object[]{java.lang.Integer.valueOf(intValue), setnavigationcontentdescription, this.valueOf}, -472172664, 472172664, intValue);
            } catch (java.lang.IllegalArgumentException e) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(new int[]{106, 25, 22, 14}, null, true, objArr2);
                throw new com.payair.hce.setAutoLinkMask(((java.lang.String) objArr2[0]).intern(), e);
            }
        }
        writeReplace = (SdkCoreAlternateContactlessPaymentDataImpl + 33) % 128;
        if (intValue == 4) {
            return new com.payair.hce.setSpannableFactory(new com.payair.hce.setHighlights(setnavigationcontentdescription));
        }
        if (intValue == 8) {
            return new com.payair.hce.setImeHintLocales(new com.payair.hce.setHighlights(setnavigationcontentdescription));
        }
        if (intValue == 16) {
            return new com.payair.hce.setSelectAllOnFocus(new com.payair.hce.setHighlights(setnavigationcontentdescription));
        }
        if (intValue == 17) {
            return new com.payair.hce.setCustomSelectionActionModeCallback(new com.payair.hce.setHighlights(setnavigationcontentdescription));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(new int[]{82, 12, 59, 0}, "\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001", true, objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        sb.append(intValue);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(new int[]{94, 12, 0, 0}, "\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001", false, objArr4);
        sb.append(((java.lang.String) objArr4[0]).intern());
        throw new java.io.IOException(sb.toString());
    }

    private void valueOf() {
        java.io.InputStream inputStream = this.values;
        if (inputStream instanceof com.payair.hce.setTitleTextColor) {
            writeReplace = (SdkCoreAlternateContactlessPaymentDataImpl + 11) % 128;
            com.payair.hce.setTitleTextColor settitletextcolor = (com.payair.hce.setTitleTextColor) inputStream;
            com.payair.hce.setTitleTextColor.DigitizedCardProfile(new java.lang.Object[]{settitletextcolor, java.lang.Boolean.FALSE}, -2016885196, 2016885197, java.lang.System.identityHashCode(settitletextcolor));
        }
        writeReplace = (SdkCoreAlternateContactlessPaymentDataImpl + 23) % 128;
    }

    final com.payair.hce.setHintTextColor values() throws java.io.IOException {
        com.payair.hce.setHintTextColor sethinttextcolor = new com.payair.hce.setHintTextColor();
        writeReplace = (SdkCoreAlternateContactlessPaymentDataImpl + 111) % 128;
        while (true) {
            com.payair.hce.setShadowLayer DigitizedCardProfile = DigitizedCardProfile();
            if (DigitizedCardProfile == null) {
                return sethinttextcolor;
            }
            int i = (SdkCoreAlternateContactlessPaymentDataImpl + 89) % 128;
            writeReplace = i;
            if (!(DigitizedCardProfile instanceof com.payair.hce.setTitleTextAppearance)) {
                com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sethinttextcolor, DigitizedCardProfile.getAid()}, 649338035, -649338033, java.lang.System.identityHashCode(sethinttextcolor));
            } else {
                SdkCoreAlternateContactlessPaymentDataImpl = (i + 83) % 128;
                com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sethinttextcolor, ((com.payair.hce.setTitleTextAppearance) DigitizedCardProfile).RecordsJson()}, 649338035, -649338033, java.lang.System.identityHashCode(sethinttextcolor));
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        writeReplace = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        AlternateContactlessPaymentDataJson = new char[]{16579, 16651, 16763, 16641, 16695, 16692, 16585, 16692, 16583, 16589, 16580, 16586, 16694, 16589, 16692, 16763, 16583, 16694, 16692, 16689, 16697, 16586, 16763, 16681, 16660, 16665, 16763, 16589, 16578, 16586, 16589, 16590, 16589, 16580, 16788, 16761, 16761, 16756, 16756, 16757, 16759, 16704, 16704, 16763, 16762, 16763, 16763, 16764, 16761, 16760, 16705, 16704, 16763, 16762, 16763, 16752, 16755, 16755, 16758, 16761, 16761, 16766, 16764, 16761, 16763, 16766, 16767, 16765, 16761, 16761, 16756, 16758, 16731, 16726, 16762, 16763, 16760, 16759, 16756, 16734, 16730, 16755, 16867, 16816, 16721, 16747, 16715, 16716, 16739, 16736, 16743, 16745, 16745, 16738, 16862, 16780, 16807, 16806, 16807, 16828, 16831, 16831, 16802, 16805, 16805, 16810, 16821, 16710, 16708, 16711, 16888, 16820, 16821, 16708, 16712, 16709, 16710, 16710, 16715, 16823, 16820, 16821, 16708, 16823, 16821, 16708, 16821, 16820, 16888, 16717, 16825};
    }

    static void init$0() {
        $$a = new byte[]{38, -91, 120, 99};
        $$b = 59;
    }

    private com.payair.hce.setShadowLayer valueOf(int i) throws java.io.IOException {
        return (com.payair.hce.setShadowLayer) values(new java.lang.Object[]{this, java.lang.Integer.valueOf(i)}, 2004181830, -2004181830, i);
    }
}
