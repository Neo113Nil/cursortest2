package com.payair.hce;

/* loaded from: classes4.dex */
public class querydefault implements com.payair.hce.getMDatabaseannotations {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final byte[] AlternateContactlessPaymentDataJson;
    private static final short[] DigitizedCardProfile;
    private static final int[] IccPrivateKeyCrtComponentsJson;
    private static final byte[] RecordsJson;
    private static final int[] SdkCoreAlternateContactlessPaymentDataImpl;
    private static final int[] SdkCoreBusinessLogicModuleImpl;
    private static final int[] getAid;
    private static long getApplicationLifeCycleData;
    private static final int[] getCiacDecline;
    private static int getCvmResetTimeout;
    private static final int[] getCvrMaskAnd;
    private static int getDualTapResetTimeout;
    private static final int[] getGpoResponse;
    private static char[] getPaymentFci;
    private static final int[] getProfileVersion;
    private static final int[] values;
    private static final byte[] writeReplace;
    private int[] valueOf = null;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = 99 - (s * 4);
        int i5 = 4 - (i2 * 2);
        byte[] bArr = $$a;
        int i6 = i * 2;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            int i7 = i4;
            i4 = i6;
            i3 = 0;
            i4 += i7;
            i5++;
            bArr2[i3] = (byte) i4;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i5];
            i3++;
            i4 += i7;
            i5++;
            bArr2[i3] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    @Override // com.payair.hce.getMDatabaseannotations
    public void writeReplace(boolean z, com.payair.hce.getMCallbacksannotations getmcallbacksannotations) {
        int i = getCvmResetTimeout + 119;
        getDualTapResetTimeout = i % 128;
        if (i % 2 != 0) {
            if (getmcallbacksannotations instanceof com.payair.hce.getErrorDialog) {
                com.payair.hce.getErrorDialog geterrordialog = (com.payair.hce.getErrorDialog) getmcallbacksannotations;
                if (((byte[]) com.payair.hce.getErrorDialog.DigitizedCardProfile(new java.lang.Object[]{geterrordialog}, -363040252, 363040252, java.lang.System.identityHashCode(geterrordialog))).length > 8) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    a(android.view.ViewConfiguration.getScrollBarSize() >> 8, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), 36 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
                    throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
                }
                this.valueOf = DigitizedCardProfile(z, (byte[]) com.payair.hce.getErrorDialog.DigitizedCardProfile(new java.lang.Object[]{geterrordialog}, -363040252, 363040252, java.lang.System.identityHashCode(geterrordialog)));
                getCvmResetTimeout = (getDualTapResetTimeout + 71) % 128;
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(36 - android.view.View.resolveSize(0, 0), (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 48934), 39 - android.view.View.MeasureSpec.getMode(0), objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            sb.append(getmcallbacksannotations.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        throw null;
    }

    @Override // com.payair.hce.getMDatabaseannotations
    public java.lang.String writeReplace() {
        getDualTapResetTimeout = (getCvmResetTimeout + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(74 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), 3 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        getCvmResetTimeout = (getDualTapResetTimeout + 87) % 128;
        return intern;
    }

    @Override // com.payair.hce.getMDatabaseannotations
    public int AlternateContactlessPaymentDataJson() {
        int i = getDualTapResetTimeout;
        int i2 = i + 65;
        getCvmResetTimeout = i2 % 128;
        int i3 = i2 % 2 != 0 ? 97 : 8;
        int i4 = i + 57;
        getCvmResetTimeout = i4 % 128;
        if (i4 % 2 == 0) {
            return i3;
        }
        throw null;
    }

    private static void a(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i3 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(getPaymentFci[i + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.text.TextUtils.indexOf("", "", 0, 0), android.graphics.ImageFormat.getBitsPerPixel(0) + 382, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 62389));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((short) 0, 0, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getApplicationLifeCycleData), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 35, 3966 - android.view.KeyEvent.getDeadChar(0, 0), (char) (40223 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 33, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                $11 = ($10 + 33) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            $11 = ($10 + 59) % 128;
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj4 == null) {
                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.view.View.MeasureSpec.getSize(0), 212 - android.graphics.Color.green(0), (char) android.widget.ExpandableListView.getPackedPositionType(0L))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    @Override // com.payair.hce.getMDatabaseannotations
    public int AlternateContactlessPaymentDataJson(byte[] bArr, int i, byte[] bArr2, int i2) {
        getDualTapResetTimeout = (getCvmResetTimeout + 125) % 128;
        int[] iArr = this.valueOf;
        if (iArr == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(78 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) android.view.KeyEvent.normalizeMetaState(0), 26 - android.text.TextUtils.getOffsetBefore("", 0), objArr);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
        }
        if (i + 8 > bArr.length) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(104 - android.graphics.Color.green(0), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 22 - android.graphics.Color.alpha(0), objArr2);
            throw new com.payair.hce.getInvalidationTracker(((java.lang.String) objArr2[0]).intern());
        }
        if (i2 + 8 > bArr2.length) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a((android.view.KeyEvent.getMaxKeyCode() >> 16) + 126, (char) (android.text.TextUtils.getTrimmedLength("") + 63259), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22, objArr3);
            throw new com.payair.hce.setAutoMigrationSpecs(((java.lang.String) objArr3[0]).intern());
        }
        values(iArr, bArr, i, bArr2, i2);
        int i3 = getDualTapResetTimeout + 113;
        getCvmResetTimeout = i3 % 128;
        if (i3 % 2 == 0) {
            return 8;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.getMDatabaseannotations
    public void DigitizedCardProfile() {
        getCvmResetTimeout = (getDualTapResetTimeout + 121) % 128;
    }

    private static void valueOf(java.lang.String str, byte[] bArr, short[] sArr, int[] iArr) {
        int i;
        int i2;
        int i3;
        int i4;
        getCvmResetTimeout = (getDualTapResetTimeout + 41) % 128;
        int[] iArr2 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        byte[] bytes = str.getBytes();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < bytes.length) {
            int i8 = iArr2[bytes[i5]];
            if (i8 != -1) {
                int i9 = getDualTapResetTimeout;
                int i10 = (i8 & 255) << 18;
                getCvmResetTimeout = (i9 + 85) % 128;
                int i11 = i5 + 1;
                if (i11 >= bytes.length || (i4 = iArr2[bytes[i11]]) == -1) {
                    i = 0;
                } else {
                    i10 |= (i4 & 255) << 12;
                    i = 1;
                }
                int i12 = i5 + 2;
                if (i12 < bytes.length && (i3 = iArr2[bytes[i12]]) != -1) {
                    getCvmResetTimeout = (i9 + 105) % 128;
                    i10 |= (i3 & 255) << 6;
                    i++;
                }
                int i13 = i5 + 3;
                if (i13 < bytes.length && (i2 = iArr2[bytes[i13]]) != -1) {
                    i10 |= i2 & 255;
                    i++;
                }
                while (i > 0) {
                    int i14 = (i10 >> 16) & 255;
                    if (bArr != null) {
                        bArr[i7] = (byte) i14;
                        i7++;
                    } else if (sArr != null) {
                        if (i6 == 0) {
                            sArr[i7] = 0;
                        }
                        short s = (short) (sArr[i7] << 8);
                        sArr[i7] = s;
                        sArr[i7] = (short) (s + i14);
                        i6++;
                        if (i6 != 2) {
                        }
                        i7++;
                        i6 = 0;
                    } else {
                        if (iArr == null) {
                            if (i6 != 0) {
                                throw null;
                            }
                            throw null;
                        }
                        if (i6 == 0) {
                            iArr[i7] = 0;
                            getCvmResetTimeout = (getDualTapResetTimeout + 31) % 128;
                        }
                        int i15 = iArr[i7] << 8;
                        iArr[i7] = i15;
                        iArr[i7] = i15 + i14;
                        i6++;
                        if (i6 == 4) {
                            getCvmResetTimeout = (getDualTapResetTimeout + 117) % 128;
                            i7++;
                            i6 = 0;
                        }
                    }
                    i10 <<= 8;
                    i--;
                    int i16 = getDualTapResetTimeout + 95;
                    getCvmResetTimeout = i16 % 128;
                    int i17 = i16 % 2;
                }
                i5 += 4;
                int i18 = getDualTapResetTimeout + 97;
                getCvmResetTimeout = i18 % 128;
                if (i18 % 2 != 0) {
                    int i19 = 2 / 3;
                }
            } else {
                i5++;
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getCvmResetTimeout = 0;
        getDualTapResetTimeout = 1;
        valueOf();
        short[] sArr = new short[8];
        DigitizedCardProfile = sArr;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(android.view.View.resolveSizeAndState(0, 0, 0) + 149, (char) android.text.TextUtils.getOffsetAfter("", 0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 25, objArr);
        valueOf(((java.lang.String) objArr[0]).intern(), null, sArr, null);
        int[] iArr = new int[24];
        values = iArr;
        int scrollBarSize = android.view.ViewConfiguration.getScrollBarSize();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a((scrollBarSize >> 8) + com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 52369), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 127, objArr2);
        valueOf(((java.lang.String) objArr2[0]).intern(), null, null, iArr);
        byte[] bArr = new byte[56];
        writeReplace = bArr;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 301, (char) (29238 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), 76 - android.view.KeyEvent.normalizeMetaState(0), objArr3);
        valueOf(((java.lang.String) objArr3[0]).intern(), bArr, null, null);
        byte[] bArr2 = new byte[16];
        AlternateContactlessPaymentDataJson = bArr2;
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(377 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 54817), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 24, objArr4);
        valueOf(((java.lang.String) objArr4[0]).intern(), bArr2, null, null);
        byte[] bArr3 = new byte[48];
        RecordsJson = bArr3;
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a(android.view.View.MeasureSpec.getMode(0) + 401, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), 64 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr5);
        valueOf(((java.lang.String) objArr5[0]).intern(), bArr3, null, null);
        int[] iArr2 = new int[64];
        getProfileVersion = iArr2;
        int capsMode = android.text.TextUtils.getCapsMode("", 0, 0);
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a(465 - capsMode, (char) (47297 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 345, objArr6);
        valueOf(((java.lang.String) objArr6[0]).intern(), null, null, iArr2);
        int[] iArr3 = new int[64];
        SdkCoreAlternateContactlessPaymentDataImpl = iArr3;
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getTouchSlop() >> 8) + 809, (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), android.view.KeyEvent.keyCodeFromString("") + my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_HKD, objArr7);
        valueOf(((java.lang.String) objArr7[0]).intern(), null, null, iArr3);
        int[] iArr4 = new int[64];
        getAid = iArr4;
        int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout();
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        a(1153 - (doubleTapTimeout >> 16), (char) (44831 - android.view.KeyEvent.getDeadChar(0, 0)), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 343, objArr8);
        valueOf(((java.lang.String) objArr8[0]).intern(), null, null, iArr4);
        int[] iArr5 = new int[64];
        IccPrivateKeyCrtComponentsJson = iArr5;
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        a((android.view.KeyEvent.getMaxKeyCode() >> 16) + 1497, (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), 344 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr9);
        valueOf(((java.lang.String) objArr9[0]).intern(), null, null, iArr5);
        int[] iArr6 = new int[64];
        getCvrMaskAnd = iArr6;
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        a(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1841, (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 37706), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_HKD, objArr10);
        valueOf(((java.lang.String) objArr10[0]).intern(), null, null, iArr6);
        int[] iArr7 = new int[64];
        getGpoResponse = iArr7;
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        a(2185 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.view.KeyEvent.normalizeMetaState(0) + 35938), android.view.Gravity.getAbsoluteGravity(0, 0) + my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_HKD, objArr11);
        valueOf(((java.lang.String) objArr11[0]).intern(), null, null, iArr7);
        int[] iArr8 = new int[64];
        SdkCoreBusinessLogicModuleImpl = iArr8;
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        a(2529 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 30856), 344 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr12);
        valueOf(((java.lang.String) objArr12[0]).intern(), null, null, iArr8);
        int[] iArr9 = new int[64];
        getCiacDecline = iArr9;
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        a((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2872, (char) (android.view.View.combineMeasuredStates(0, 0) + 49028), 344 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr13);
        valueOf(((java.lang.String) objArr13[0]).intern(), null, null, iArr9);
        getCvmResetTimeout = (getDualTapResetTimeout + 45) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
    
        if (r11 >= 56) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
    
        r9 = com.payair.hce.querydefault.AlternateContactlessPaymentDataJson[r15] + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
    
        if (r9 >= 56) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006e, code lost:
    
        r12 = com.payair.hce.querydefault.getDualTapResetTimeout + 43;
        com.payair.hce.querydefault.getCvmResetTimeout = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0078, code lost:
    
        if ((r12 % 2) != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007a, code lost:
    
        r4[r11] = r3[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007f, code lost:
    
        r4[r11] = r3[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0083, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0084, code lost:
    
        r4[r11] = r3[r9 - 28];
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008d, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0090, code lost:
    
        if (r9 >= 24) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0092, code lost:
    
        r10 = com.payair.hce.querydefault.getDualTapResetTimeout;
        r11 = r10 + 73;
        com.payair.hce.querydefault.getCvmResetTimeout = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009c, code lost:
    
        if ((r11 % 2) != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009e, code lost:
    
        r11 = com.payair.hce.querydefault.RecordsJson;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a4, code lost:
    
        if (r4[r11[r9]] == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a6, code lost:
    
        com.payair.hce.querydefault.getCvmResetTimeout = (r10 + 105) % 128;
        r1[r6] = r1[r6] | com.payair.hce.querydefault.values[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bb, code lost:
    
        if (r4[r11[r9 + 24]] == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bd, code lost:
    
        r1[r8] = r1[r8] | com.payair.hce.querydefault.values[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c6, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c9, code lost:
    
        r14 = r4[com.payair.hce.querydefault.RecordsJson[r9]];
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d4, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d5, code lost:
    
        r15 = r15 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static int[] DigitizedCardProfile(boolean z, byte[] bArr) {
        int[] iArr = new int[32];
        boolean[] zArr = new boolean[56];
        boolean[] zArr2 = new boolean[56];
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= 56) {
                break;
            }
            byte b = writeReplace[i];
            if ((DigitizedCardProfile[b & 7] & bArr[b >>> 3]) == 0) {
                z2 = false;
            }
            zArr[i] = z2;
            i++;
        }
        int i2 = 0;
        while (i2 < 16) {
            int i3 = z ? i2 << 1 : (15 - i2) << 1;
            int i4 = i3 + 1;
            iArr[i4] = 0;
            iArr[i3] = 0;
            int i5 = 0;
            while (true) {
                int i6 = 28;
                if (i5 >= 28) {
                    break;
                }
                int i7 = AlternateContactlessPaymentDataJson[i2] + i5;
                if (i7 >= 28) {
                    zArr2[i5] = zArr[i7 - 28];
                } else {
                    int i8 = getDualTapResetTimeout + 49;
                    getCvmResetTimeout = i8 % 128;
                    if (i8 % 2 != 0) {
                        zArr2[i5] = zArr[i7];
                        throw null;
                    }
                    zArr2[i5] = zArr[i7];
                }
                i5++;
            }
        }
        for (int i9 = 0; i9 != 32; i9 += 2) {
            int i10 = iArr[i9];
            int i11 = i9 + 1;
            int i12 = iArr[i11];
            iArr[i9] = ((16515072 & i10) << 6) | ((i10 & 4032) << 10) | ((i12 & 16515072) >>> 10) | ((i12 & 4032) >>> 6);
            iArr[i11] = ((i10 & 258048) << 12) | ((i10 & 63) << 16) | ((i12 & 258048) >>> 4) | (i12 & 63);
        }
        return iArr;
    }

    protected static void values(int[] iArr, byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = getCvmResetTimeout;
        getDualTapResetTimeout = (i3 + 7) % 128;
        int i4 = ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
        int i5 = ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8) | (bArr[i + 7] & 255);
        int i6 = ((i4 >>> 4) ^ i5) & 252645135;
        int i7 = i5 ^ i6;
        int i8 = i4 ^ (i6 << 4);
        int i9 = ((i8 >>> 16) ^ i7) & 65535;
        int i10 = i7 ^ i9;
        int i11 = i8 ^ (i9 << 16);
        int i12 = ((i10 >>> 2) ^ i11) & 858993459;
        int i13 = i11 ^ i12;
        int i14 = i10 ^ (i12 << 2);
        int i15 = ((i14 >>> 8) ^ i13) & 16711935;
        int i16 = i13 ^ i15;
        int i17 = i14 ^ (i15 << 8);
        int i18 = (i17 << 1) | ((i17 >>> 31) & 1);
        int i19 = (i16 ^ i18) & (-1431655766);
        int i20 = i16 ^ i19;
        int i21 = i18 ^ i19;
        int i22 = (i20 << 1) | ((i20 >>> 31) & 1);
        getDualTapResetTimeout = (i3 + 113) % 128;
        for (int i23 = 0; i23 < 8; i23++) {
            int i24 = i23 << 2;
            int i25 = ((i21 << 28) | (i21 >>> 4)) ^ iArr[i24];
            int[] iArr2 = SdkCoreBusinessLogicModuleImpl;
            int i26 = iArr2[i25 & 63];
            int[] iArr3 = getCvrMaskAnd;
            int i27 = iArr3[(i25 >>> 8) & 63];
            int[] iArr4 = getAid;
            int i28 = iArr4[(i25 >>> 16) & 63];
            int[] iArr5 = getProfileVersion;
            int i29 = iArr5[(i25 >>> 24) & 63];
            int i30 = iArr[i24 + 1] ^ i21;
            int[] iArr6 = getCiacDecline;
            int i31 = iArr6[i30 & 63];
            int[] iArr7 = getGpoResponse;
            int i32 = iArr7[(i30 >>> 8) & 63];
            int[] iArr8 = IccPrivateKeyCrtComponentsJson;
            int i33 = iArr8[(i30 >>> 16) & 63];
            int[] iArr9 = SdkCoreAlternateContactlessPaymentDataImpl;
            i22 ^= ((((i29 | ((i26 | i27) | i28)) | i31) | i32) | i33) | iArr9[(i30 >>> 24) & 63];
            int i34 = ((i22 << 28) | (i22 >>> 4)) ^ iArr[i24 + 2];
            int i35 = iArr2[i34 & 63];
            int i36 = iArr3[(i34 >>> 8) & 63];
            int i37 = iArr4[(i34 >>> 16) & 63];
            int i38 = iArr5[(i34 >>> 24) & 63];
            int i39 = iArr[i24 + 3] ^ i22;
            int i40 = iArr6[i39 & 63];
            i21 ^= iArr9[(i39 >>> 24) & 63] | ((((i38 | ((i35 | i36) | i37)) | i40) | iArr7[(i39 >>> 8) & 63]) | iArr8[(i39 >>> 16) & 63]);
        }
        int i41 = (i21 << 31) | (i21 >>> 1);
        int i42 = (i22 ^ i41) & (-1431655766);
        int i43 = i22 ^ i42;
        int i44 = i41 ^ i42;
        int i45 = (i43 << 31) | (i43 >>> 1);
        int i46 = ((i45 >>> 8) ^ i44) & 16711935;
        int i47 = i44 ^ i46;
        int i48 = i45 ^ (i46 << 8);
        int i49 = ((i48 >>> 2) ^ i47) & 858993459;
        int i50 = i47 ^ i49;
        int i51 = i48 ^ (i49 << 2);
        int i52 = ((i50 >>> 16) ^ i51) & 65535;
        int i53 = i51 ^ i52;
        int i54 = i50 ^ (i52 << 16);
        int i55 = ((i54 >>> 4) ^ i53) & 252645135;
        int i56 = i53 ^ i55;
        int i57 = i54 ^ (i55 << 4);
        bArr2[i2] = (byte) (i57 >>> 24);
        bArr2[i2 + 1] = (byte) (i57 >>> 16);
        bArr2[i2 + 2] = (byte) (i57 >>> 8);
        bArr2[i2 + 3] = (byte) i57;
        bArr2[i2 + 4] = (byte) (i56 >>> 24);
        bArr2[i2 + 5] = (byte) (i56 >>> 16);
        bArr2[i2 + 6] = (byte) (i56 >>> 8);
        bArr2[i2 + 7] = (byte) i56;
    }

    static void init$0() {
        $$a = new byte[]{104, -39, -34, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus};
        $$b = 201;
    }

    static void valueOf() {
        char[] cArr = new char[3217];
        java.nio.ByteBuffer.wrap("^ëÓ\u009cD\u0010öík\u001c\u009d\u0084\u000e\u0012\u0080µ5k§æØ\\J\u009dÿKp>âµ\u0017\"\u0089ï:T¬Ã!\u001eSÿÄnvþëY\u001dÛ\u008e\t\u00031µ¸&gXÉÍ[\u007f\u0087ð\u0016bí\u0097f\tþáàl\u0091û\u0013I\u008aÔ=\"®±)?\u0093\u008aI\u0018Îggõú@lÏ\u0012]\u0089¨\u00066\u009b\u0085\u007f\u0013µ\u009e*ìÂ{TÉÈTw¢¹1{¼\u001a\nÛ\u0099%ç\u0092r\u000eÀãO ÝÑ(L¶ß\u00051\u0093ª\u001e-^ëÓ\u009cD\u0010^ëÓ\u009cD\u0010öík\u0012\u009d\u008f\u000e\f\u0080ü5q§ìØ\u0013JÓÿHp%âû\u0017,\u0089¡:\u0010¬\u0097!\u0004SöÄmvâëF\u001dÚ\u008eM^ÆÓ·D3ö¸k\u0003\u009dÁ\u000e\t\u0080à5y§ïØVJÏÿ\u0007p%â´\u0017*\u0089ï:\n¬\u008b!\u0002SåÄu©Û$·³,\u0001¦\u009c\u0019j\u008eùPwìÂqPô/N½Ã\bN\u0087j\u0015´à1~»ÍB[\u008bÖ\u001e¤ã3h\u0081ä^îÓ\u0090D\u0002ö\u008ck&\u009d \u000e*\u0080ò5^§ËØrJüÿdp\u0010â\u009a\u0017\u0000\u0089\u008e:8¬ª!,SÖÄPv¶ë\b\u0092|\u001f\u0002\u0088\u0090:\u001e§¤Q2Â»LFùÌkZ\u0014à\u0086n3ü¼\u0082.\bÛ\u0096E\u001cö©`0í¾\u009fD\bÒºX'îÑlBúÏ\u0080y\u000eê\u0097\u0094\"\u0001¨³6<¼®J[ØÅ^väàrmø\u001e\u0085\u0088\f5\u009a§ P®Â4OÊùHjÖ\u0014\\\u0081ê3s¼þ)\u0084Û\u0012D\u0098ö&c¤í:\u009eÀ\bNµÔ'aÐèBvÏüx\u008aê\u0010\u0097\u0096\u0001$²²<8©Æ[OÄÚv`ãîmt\u001e\u0002\u008b\u00805\u0016¦\u009cP*Ý°O=øÄjR\u0017Ø\u0081f2ì¼r)\u0000Ú\u008eD\u0014ñ¢c+ì¶\u009e<\u000bÊµP&ÞÐl]òÏxx\u0006å\u008c\u0097\u0019\u0000 ².?´©BZÈÄ^qÜãjlð\u001e~\u008b\u00074\u0092¦\u0018S¦Ý,NºøHeÎ\u0017T\u0080â2h¿õ,Ö¡«64\u0084\u0094\u0019\bï\u0095|:òòGjÕþªD8¾\u008d\\\u00024\u0090\u0086e\u001bû¾H\u001dÞ\u0090S\u0011!à¶c\u0004Ò\u0099zoÂüvq,Ç\u008aT4* ¿\"\r\u0090\u0082\u0016\u0010Õåx{ÉÈH^íÓ) Q6¥\u008b\u0016\u0019\u009cî.|\u0097ñ@G\u0099Ôtªé?[\u008dÀ\u0002o\u0097+e¥úMH\u0095Ý\rS\u008e p¶\u0093\u000b\u007f\u0099ÄnzüøqQÆ-T¤)6¿\u0083\f\u0015\u0082®\u0017wåêzHÈÈ]6\u0088Ï\u0005©\u0092+ ©½\u0014K§Ø-Vÿãzqé\u000e&\u009cÌ)C¦\"4·Á2_¨ì z©÷.\u0085þ\u0012a \u0097=)^ëÓ\u008bD\u0002ö\u0086k1\u009d\u0096\u000e*\u0080Ð5^§áØ@Jòÿep\u0003â\u008a\u0017\u000f\u0089\u0089:\u0011¬ª!!SÖÄyvàë}\u001dû\u008e^\u0003\nµ¼&\u0002X\u0086Í\f\u007f§ð$bÝ\u0097N\tèº},â¡\u001fÒgD\u0097ù\u001ak\u0090\u009c\u0004\u000e«\u0083R5Ú¦sØÄMCÿâp@å\u0019\u0017¸\u0088\u000e:Å¯3!ºRxÄåyNëÉ\u001cL\u008eÃæ,kJüÄNJÓô%b¶è8\u0016\u008d\u009c\u001f\n`°ò>G¤ÈÂZX¯Æ1L\u0082ê\u0014d\u0099êë\u0017|\u0082Î\fSµ¥<6ª»À\r^\u009eÄàbuèÇbHìÚ\u001a/\u0080±\u000e\u0002·\u0094\"\u0019¨jÕü\\AÊÓp$þ¶d;\u0092\u008d\b\u001e\u0086`\fõªG$Èª]Ô¯B0Ì\u0082u\u0017ÿ\u0099jê\u0080|\u001eÁ\u0084S2¤¨6&»¬\fÊ\u009e@ãÊuwÆâHlÝ\u0095/\u001c°\u008a\u0002 \u0097½\u0019$jRÿØAFÒÌ$z©à;n\u008c\u0097\u001e\u0002c\u0088õ6F¿È*]@®Ý0D\u0085ò\u0017h\u0098æêl\u007f\u008aÁ\u0000R\u008a¤4)¢»(\fU\u0091ßãJtðÆ~KäÝ\u0002.\u0088°\u0006\u0005\u008c\u0097*\u0018¤j.ÿT@ÂÒL'õ©|:ê\u008c\u0010\u0011\u009dc\u0004ô²F(Ë¢],®Z3Ä\u0085N\u0016÷\u0098bíì\u007f\u0016À\u009cR\n§ )=º¤\u000fÒ\u0091XâÂtLùúKdÜî.\u0017³\u0082\u0005\b\u0096¶\u0018<mªþÐ@^ÕÄ'r¨è:b\u008fì\u0011\u001ab\u0084ô\ny·Ë\"\\¬¡Ö3\\\u0084Ê\u0016p\u009bþíd~\u0082À\u0018U\u0086§\f(ªº$\u000fª\u0090×âBwÈùvJüÜj!\u0080³\u001d\u0004\u0084\u0096\"\u001b¸m&þ¬CÊÕD&Ê¨t=â\u008fl\u0010\u0096b\u001c÷\u008ay0Ê½\\$¡R2Ø\u0084F\tÌ\u009bzìà~jÃ\u0094U\u0002¦\u008c(5½¼\u000f*\u0090@åÞwDøâJxßæ!l²\u009a\u0004\u0004\u0089\u008a\u001b4l¢þ,CVÔÜ&J«à=~\u008eä\u0010\u0012e\u0088÷\u0006x\u008cÊ:_ ¡.2W\u0087Â\tL\u009aöì\u007fqêÃ\u0000T\u009e¦\u0004+¢½(\u000e¢\u0090,åJvÄøJM÷ßb è²\u0015\u0007\u009c\u0089\n\u001a l=ñ¤BÂÔXYÆ«L<ê\u008e`\u0013êe\u0017ö\u0082x\fÍ¶_< ª5À\u0087^\bÄ\u009arïèqbÂìT\u001aÙ\u0084+\n¼·\u000e\"\u0093¬äÕv_ûÊMpÞþ dµ\u0092\u0007\b\u0088\u0082\u001a\foªñ Bª×ÔYBªÌ<v\u0081ÿ\u0013jd\u0090ö\u001e{\u0084Í2^¸ &5¬\u0086Ú\bD\u009dÎïwpâÂhW\u0095Ù\u001f*\u008a¼0\u0001¾\u0093$äRiØûFLÌÞj#äµn\u0006\u0097\u0088\u0002\u001dôoJ^ÈÓ\u009bD\u0000ö\u008ck>\u009d¨\u000e*\u0080Ô5x§ÈØrJüÿfp\u0018â\u009a\u0017\u0004\u0089\u008e:;¬ !,SÞÄ@vÊëd\u001dþ\u008eh\u0003\u0012µ\u009c&\u0006X°Í:\u007f\u0082ð\bbÛ\u0097B\tÌº~,è¡jÒ\u0014D¸ù\nk°\u009c<\u000e¦\u0083P5Ú¦bØèM{ÿàplå\u001e\u0017\u0088\u0088\n:¤¯\u0018!¨RPÄÜyFëð\u001cz\u008eä\u0003H´\u0018&\u0080[\fÍ¶~ ðªeD\u0097Þ\bHºò/|¡æÒ\u0090G\u001aù¢j(\u009c»\u0011\"\u0083¬4^¦ÀÛJMäþXpèå\u0092\u0016\u001c\u0088\u0082=0¯º \u0002R\u0088ÇXyÀêL\u001cþ\u0091`\u0003ê´\u0094)\u001e[\u0088Ì0~¼ó&eÐ\u0096Z\bÄ½N/ø `ÒìG\u0096ø\u0000j\u008a\u009f$\u0011\u0098\u0082*4Ð©\\ÛÂLpþúsdåî\u0016\u009b\u008b\u0002=\u008c®> ¨U*ÇÔx^êÊ\u001fr\u0091ü\u0002f·\u0010)\u009aZ\u0004Ì\u008eA;ó d,\u0096Ö\u000b@½Ê.t ØÕjF\u0010ø\u009cm\u0002\u009f¸\u0010:\u0082¤7\b©ÛÚBLÌÁvsàäj\u0019\u0014\u008b¸<\n®²#<U¦ÆPxÚíD\u001fÎ\u0090{\u0002à·l(\u001eZ\u0088Ï\nA¤ò>dª\u0099R\u000bÜ¼B.ð£zÕäFHû\u0018m\u0080\u009e\f\u0010¾\u0085(7ª¨DÚÞOHÁðr|äâ\u0019\u0098\u008a\u001a<\u0084±\u000e#¸T Æ¬{VíÈ\u001eJ\u0090ä\u0005~·è(\u0090]\u001cÏ\u0086@8òºg$\u0099®\nX¼Â1L£þÔhFêû\u0084l8\u009e\u008a\u00132\u0085¼6\"¨ØÝZOâÀNrøçb\u0019ì\u008a\u009e?\u0000±\u008a\"4T\u0098É({Ðì\\\u001eÆ\u0093p\u0005ú¶d(î]\u0098Î\u0000@\u008cõ>g¨\u0098*\nÄ¿x1È¢rÔüIbú\u0010l\u009aá\u0004\u0013¨\u008486¢«,ÝÞN@ÀÊudçþ\u0018j\u008d\u0010?\u009c°\u0006\"¸W:É\u0082z\bìØaB\u0093Ì\u0004~¶à+j\\\u0004Î\u009eC\nõ²f<\u0098¢\rX¿Ú0D¢Î×xIâúlo\u0016á\u0088\u0012\n\u0084´9\u0018«¨ÜRNÜÃFuøæz\u0018Â\u008dH>\u0018°\u0082%\fW¶È(zªïDaÞ\u0092J\u0004ð¹|+â\\\u0098Ñ\u001aC¢ô\u000ef»\u009b \r¬¾V0À¥6×\u0088ññ|\u0087ë\u001dY\u0091Ä+2¿¡\u0013/É\u009aA\bñwmåãPyß\u000fM\u0085¸\u001b&\u0093\u0095'\u0003µ\u008e3üËk_ÙóDk²á!Q¬\r\u001a\u0083\u0089\u0019÷¯b%Ð»_1ÍÇ8U¦Ñ\u0015k\u0083ÿ\u000eS}\u000bë\u0081V1Ä\u00ad3#¡¹,i\u009aÅ\tSwÓâgPýßsJ\u000b¸\u009f'3\u0095«\u0000!\u008e·ýkkÃÖYDÉ³e!û¬s\u001b\u0007\u0089\u0095ô\u0011b«Ñ?_µÊI8Á§W\u0015Ë\u0080k\u000eù}©è\u0005V\u009bÅ\u00113§¾=,±\u009bK\tßtsâëQaß÷J\u008d¹\u0003'\u0099\u0092/\u0000¥\u008f3ý³hGÖÕEQ³é>\u007f¬õ\u001b\u008b\u0086\u0001ô±c-Ñ£\\9Êé9M§Û\u0012S\u0080ç\u000fu}óè\u0089W\u001fÅ³0)¾¡-7\u009bë\u0006CtÙãIQíÜsJó¹\u0087$\u001d\u0092\u0091\u0001+\u008f¿ú5hÉ×AEñ°m>ã\u00ady\u0018)\u0086\u0085õ\u001bc\u0093î'\\½Ë19Ë¤_\u0012Õ\u0081k\u000fázwé+W\u008bÂ\u00190\u0089¿--³\u00981\u0006Çu]ãÑniÜÿKS¶\u000b$\u0081\u0093\u0017\u0001\u00ad\u008c+ú¹ii×ÍB[°Ó?g\u00adý\u0018s\u0087\tõ\u009f`\u0015î©]!Ë·6k¤Ã\u0013Y\u0081ï\fmzóéqT\u0007Â\u00951\u0013¿©*?\u0098\u0093\u0007IuÁàqníÝkKù¶\u008f%\r\u0093\u009b\u001e\u0011\u008c§û=i³ÔIBß±U?ëªa\u0018Ñ\u0087\u008dò\u0003`\u0099ï\t]¥È36³¥G\u0013Õ\u009eQ\fë{\u007féÓT\u008bÃ\u00011±¼-*«\u00999\u0007ÏrEàÓoQÝçH}¶ñ%\u0089\u0090\u001f\u001e\u0095\u008d+û¡f7ÔÍCK±Ù<Iªå\u0019s\u0087óò\u0087a\u001dï\u0091Z+È¿75¥É\u0010A\u009e×\rm{ëæyU\u000fÃ\u0085N\u001b¼\u0093+'\u0099µ\u00041rËá_oÕÚkHá·w\"+\u0090\u0083\u001f\u0019\u008d\u0089ø-f³Õ1CÇÎU<Ñ«i\u0019ÿ\u0084Só\u000ba\u0081ì\u0017Z\u008bÉ+7¹¢i\u0010Å\u009f[\rÓxgæýUqÀ\u000bN\u009f½\u0015+«\u0096!\u0004\u0091skáËlYÚÉIe·û\"q\u0091\u0007\u001f\u0095\u008a\u0011ø«g?Õµ@KÎÁ=W«Ë\u0016k\u0084ùó©~\u0005ì\u0093[\u0011É§45¢±\u0011I\u009fß\n)x\u0097^îÓ\u0090D\u0002öªk6\u009d°\u000e*\u0080Ô5V§ÀØvJüÿfp\u0012â\u0098\u0017\u0007\u0089\u008e:8¬¢!,SðÄ@vÈët\u001dö\u008e`\u0003\u0012µ\u009c& X°Í8\u007f§ð.bÐ\u0097B\tÌºv,ð¡jÒ\u0014D\u0096ù\bk¶\u009c<\u000e¦\u0083P5Ú¦DØÎMpÿâpJå\u0016\u0017\u0080\u0088\b:´¯6!¨RRÄÜy`ëò\u001cx\u008eç\u0003n´\u0018&\u0082[\fÍ\u0090~0ðªeT\u0097Þ\bHºò/|¡ÀÒ\u0090G\u0018ù\u0084j\u000e\u009c°\u0011\"\u0083¬4V¦ÐÛJMôþ~pèå\u0096\u0016\u001c\u0088\u0086=2¯º $R®ÇPyÂêL\u001cö\u0091`\u0003è´\u0094)\u0016[\u0088Ì6~¼ó&eÐ\u0096X\bÄ½N/ð bÒìG\u0096ø\u0000j\u008a\u009f4\u0011¶\u0082(4Ö©\\ÛÆLrþøsdåî\u0016\u0090\u008b\u0002=\u008c®\u0010 °U*ÇÔx^êÈ\u001fv\u0091ü\u0002f·\u0012)\u0098Z\u0004Ì\u008eA0ó¢d,\u0096ð\u000b@½Ê.t öÕhF\u0012ø\u009cm \u009f²\u00108\u0082¤7.©ÐÚBLêÁPsðäj\u0019\u0014\u008b\u009e<\u0000®¶#<U\u0080ÆPxØíD\u001fÎ\u0090p\u0002â·l(\u0016Z\u0090Ï\bA´ò6d¨\u0099R\u000bÜ¼`.ò£xÕçFnû\u0018m\u0082\u009e\f\u0010\u0090\u008507ª¨TÚÞOHÁòr|äæ\u0019\u0090\u008a\u001a<\u0084±\u000e#°T\"Æ\u008a{VíÀ\u001eJ\u0090ô\u0005v·à(\u0092]\u001cÏ @0ò¸g$\u0099®\nP¼Â1L£ÐÔpFêû\u0094l\u001e\u009e\u0088\u00136\u0085¼6\u0000¨ÒÝZOÇÀNrøçb\u0019Ê\u008a°?\u0010±\u008a\"4T¶É {Öì\\\u001eÆ\u0093p\u0005ø¶d(î]\u0090Î\u0002@ªõ\u0010g°\u0098*\nÔ¿^1À¢vÔüIfú\u0010l\u009aá\u0007\u0013\u008e\u008486¢«\nÝÖN@ÀÈutçþ\u0018h\u008d\u0016?\u009c°\u0006\"²W:É§z.ìÐaB\u0093ê\u0004P¶à+h\\\u0014Î\u009eC\u0000õ¶f<\u0098¦\rR¿Ú0G¢Î×xIâúJo0á\u0080\u0012\b\u0084´9>«¨ÜRNÜÃ`uòæz\u0018ç\u008dn>\u0018°\u0082%\fW\u0090È z¨ïTaÞ\u0092H\u0004ò¹|+æ\\\u0092Ñ\u001aC\u0084ô\u000ef°\u009b\"\r\u008a¾p0À¥6×\u0088Í¤@Ò×HeÅø|\u000eê\u009dh\u0013\u0096¦\u00144\u0092K8Ù´l.ãZqÐ\u0084N\u001aÔ©T?è²eÀ\u009cW\nå\u0080x6\u008e´\u001d\"\u0090X&ÖµLËú^tìîctñ\u0092\u0004\b\u009a\u0086)<¿ª2(AV×ÔjBøû\u000fv\u009dî\u0010\u001a¦\u00945\u000eK\u0084Þ2l\u008eã&v\\\u0084Ê\u001bH©þ<t²òÁ\u001bW\u0096ê\u000exº\u008f4\u001d®\u00904'tµÈÈE^üíncèö\u0016\u0004\u0094\u009b\u0002)¸¼62®AÚÔTjÎùT\u000fò\u0082h\u0010æ§\u001c5\u008aH\bÞ¾m4ã¢vÛ\u0085V\u001bÎ®z<ð³nÁôT\u0012ê®y\u0006\u008f¼\u0002*\u0090 'ÞºTÈÂ_{íö`lö\u009a\u0005\u0014\u009b\u008e.\u0014¼\u00943\u000eA¥ÔÜkNùÈ\fv\u0082ô\u0011r§\u0098:\u0014H\u008cß:m´à.v´\u0085ô\u0018n®Æ=|³îÆ`T\u009eë\u0014y\u0092\u008c8\u0002¶\u0091,$ZºÐÉN_ÔÒT`è÷f\u0005\u009c\u0098\n.\u0088½63´F2ÕXkÔþL\fú\u0083p\u0011î¤t:´I\bß\u0086R<àªw \u008aV\u0018Ô¯R=ø°vÆîU\u001aë\u0090~\u000e\u008c\u0094\u0003\u0014\u0091¨$%»\\ÉÊ\\@Òþat÷ò\n\u0018\u0098\u0094/\f½º00F®Õ4hRþÈ\rF\u0083ü\u0016j¤è;\u0016I\u0094Ü\u0002R»á4w¬\u008aÚ\u0019T¯Î\"T°òÇNUåè\u001c~\u008a\u008d\b\u0003¾\u00964$²»ÛÎV\\ÌÓzaðôn\nô\u00994/®¢\u00060¼G*Õ¨hÖÿT\rÒ\u0080{\u0016ö¥n;\u009aN\u0014Ü\u008eS\u0004á²t(\u008a¥\u0019Ü¬J\"È±~ÇôZbè\u009b\u007f\u0014\u008d\u008e\u0000:\u0096°%.»´Îô]nÓÅf|ôê\u000b`\u0099\u0096,\u0014¢\u00921;G´Ú,iZÿÐrN\u0080Ô\u0017T¥Î8eN\u009cÝ\nS\u0088æ6t´\u008b\"\u001eX¬Ö#L±úÄpZîét\u007f\u0092ò.\u0000\u0086\u0097<%®¸(Ï^]ÔÐBføõv\u000bî\u009e\u001a,\u0094£\u000e1\u0084D\u0014Ú¨i%ü\\rÎ\u0081@\u0017þªt8òO\u0018Ý\u0096P\u000eæºu0\u008b®\u001e$\u00adR#È¶FÄü[néà|\u0016ò\u0094\u0001\u0002\u0097¸*4¸®ÏÚBTÐÎgTõò\bh\u009eå-\u001c£\u008a6|DÂÒ\u0084_úÈ`zîçP\u0011À\u0082K\f¶¹<+ªT\u0010Æ\u009es\u0004üvnø\u009bf\u0005ä¶^ Ã\u00adNß°H ú«g\u0016\u0091\u009c\u0002\n\u008fp9þªdÔÒAXóÖ|Dî¾\u001b#\u0085®6\u0010 \u0082-\u000b^vÈüujçÐ\u0010x\u0082Ä\u000f6¹¸*&T¬Á\u001es\u0083ü\u000eip\u009bâ\u0004k¶Ö#\\\u00adÊÞ0H\u0098õ$g\u0092\u0090\u0018\u0002\u0096\u008f\f8~ªà×nAÐò@|Èé6\u001b¬\u0084*6\u0090£8-\u0084^òËxuææl\u0010Ú\u009dC\u000fÎ¸0*¢W(Á\u0096r\u001cü\u008aið\u009a~\u0004ô±R#Ø¬VÞÄK:õ£f.\u0090\u0090\u001d\u0002\u008f\u00888ö¥l×ê@PòÞ\u007fTé¶\u001a8\u0084¦1$£\u009a,\u0003^\u008eËðtbæè\u0013V\u009dÜ\u000eI¸°%\u0018W´À\u0012r\u0098ÿ\u0016i\u0084\u009aþ\u0007`±î\"P¬ÂÙHK¶ô<fª\u0093\u0010\u001d\u009e\u008e\u0014;v¥øÖv@äÍ^\u007fÃèN\u001a´\u0087\"1¨¢\u0016,\u008cY\tÊptþát\u0013Ö\u009cX\u000eÆ»D%¾V#À®M\u0014ÿ\u0080h\b\u0095v\u0007ü°j\"Ð¯xÙÄJ6ô¸a&\u0093¬\u001c\u001a\u008e\u0080;\u000e¤pÖàCkÍÖ~\\èÉ\u00150\u0087¾04¢\u0096/\u0018Y\u0086Ê\u0004w~áã\u0012n\u009cÐ\tB»Ë$6V¼Ã*M\u0090þ\u001eh\u0084\u0095ö\u0006x°ö=d¯ÚØ@JÎ÷0a¢\u0092+\u001c\u0096\u0089\u001c;\u008a¤ðÑXCäÌV~ØëF\u0015Ä\u0086:0 ½./\u0094X\u0002Ê\u0088wöàl\u0012é\u009fP\tøºD$²Q8Ã¶L$þ\u009ek\u0003\u0095\u008e\u0006ð³b=ë®VØÌEJ÷°`\u0018\u0092´\u001f\u0012\u0089\u0098:\u0006¤\u008cÑþBcÌîyPëÀ\u0014K\u0086¶3,½ª.\u0010X\u009eÅ\u0004vràømf\u009fä\b^ºÀ'NQ°Â\"L¨ù\u0016k\u009c\u0094\t\u0001p³þ<d®ÖÛXEÆöD`¾í \u001f®\u0088\u0014:\u0082§\u000bÐvBìÏiyÐê^\u0014Ä\u008163¸¼&.¬[\u001eÅ\u0080v\u000eãpmà\u009eh\bÖµL'ÉP0Â¾O$ù\u0092j\u0018\u0094\u0086\u0001\u0004²~<ã©nÛÔD@öÈc6í¼\u001e*\u0088\u00905\u001e§\u0094Ðò]xÏöxdêÚ\u0017C\u0081Î20¼¢)T[ê&f«\u0012<\u008a\u008e\u0004\u0013¾å(v²øzMÖß@ ò2p\u0087î\b\u0098\u009a4o\u008eñ\u0006B°Ô*Y¤+^¼È\u000eB\u0093üetöà{\u009aÍ\u0010^\u008e 8µ\u0094\u0007.\u0088¦\u001aRïÊqLÂþTNÙòªº<\u0014\u0081\u0080\u0013:ä°v&ûØMtÞÎ F5ò\u0087j\bä\u009d\u009eo\bð\u0082B<×¶Y *Ú¼P\u0001Î\u0093xdòön{æÌ\u0090^\n#\u0084µ>\u0006\u008e\u00882\u001dÜïVpÀÂzWðÙfª\u0018?\u0092\u0081\u000e\u0012\u0086ä0iªû,LÞÞn£Ò5|\u0086ô\b`\u009d\u001an\u0094ð\u0006E¸×\u0014X®*&¿Ò\u0001J\u0092Äd~éÎ{rÌ\u001cQ\u0094#\u0000´º\u00060\u008b®\u001dXîÒpNÅÅWrØêªd?\u001e\u0080\u0088\u0012\u0012ç\u009ai4ú LZÑÔ£F4ø\u0086r\u000bî\u009den\u0012ó\u008aE\u0004Ö¾X(-¢¿\\\u0000Ô\u0092@gúétzîÏ\u0098Q4\"\u008e´\u00059²\u008b*\u001c¬î^sîÅBVÚØt\u00adà>\u009a\u0080\u0014\u0015\u008eç8h²ú.O¥ÑP¢Ê4D¹þ\u000bh\u009câaºó\u0014D\u0080Ö:[°-.¾Ø\u0000R\u0095ÌgFèòzjÏìP\u009e\"\b·\u00829\u001a\u008a¶\u001c áÚsPÄÎVxÛÔ\u00adn>å\u0083\u0090\u0015\næ\u008ch>ý\u008eO2Ðú¢V7À¹r\nð\u009cfa\u0018ò\u0092D\u000eÉ\u0086[0,ª¾$\u0003Þ\u0095nfÂèZ}öÏ`P\u0012%\u0090·\u000e8¸\u008a2\u001f¬á%rÐÄJIÌÛ~¬è>b\u0083:\u0014\u0096æ\u0000kºý0N¦ÐX¥ô7L¸Æ\np\u009fêalò\u001eG®É\u0002Z\u009a,4± \u0003R\u0094ÐfFëø}TÎìPf%\u0010¶\u008a8\f\u008d¾\u001f\u000eà²r\\ÇÖI@Úò¬p1æ\u0082\u0098\u00144\u0099\u008ek\u0005ü²N*Ó¤¥^6È¸B\rÚ\u009ft`àõ\u009aG\u0014È\u008eZ8/²±,\u0002¦\u0094P\u0019ÊëD|þÎNSò$º¶\u0014;\u0080\u008d2\u001e´à.uØÇRHÌÚF¯ò1j\u0082ì\u0017\u009e\u0099.j\u0092ü\u001aA¶Ó ¤Ú6T»Î\rx\u009eÔ`lõåF\u0090È\n]\u0084/>°\u008e\u00022\u0097Ü\u0019TêÀ|zÁôSn$\u0018©´;\f\u008c\u0086\u001e2ãªu$ÆÞHnÝ¾¯\u0000ánl\u001cû\u0086I\u0018Ô¢\"$±®?P\u008aÞ\u0018Lgöõx@áÏ\u0094]\u001e¨\u00806\u000e\u0085¼\u00136\u009e¸ìB{ÇÉNTð¢z1ì¼\u0096\n\b\u0099\u0082ç7r½À OªÝ\\(Æ¶H\u0005â\u0093g\u001eîm\u0090û\u001aF\u008cÔ6#¸±!<Ô\u008a]\u0019ÀgNòü@vÏèZ\u0092¨\u00077\u008e\u00854\u0010¾\u009e(íÖ{XÆÁTw£þ1`¼î\u000b\u009c\u0099\u0016ä\u0098r2Á¤O.ÚÔ(^·È\u0005v\u0090ø\u001ebm\u0017ø\u009eF\u0000Õ\u008a#<®¦<(\u008bÂ\u0019GdÎòtAúÏlZ\u0016©\u00887\u0002\u0082´\u0010=\u009f í.xÜÆFUØ£r.ä¼n\u000b\u0010\u0096\u009eä\bs¶Á8L¡ÚW)Þ·@\u0002Ê\u0090|\u001fömhø\u0002G\u0087Õ\u000e ´®:=¨\u008bV\u0016ÈdAó÷A~ÌàZj©\u001c4\u0086\u0082\u0018\u0011¢\u009f$ê®xPÇÚUL ö.x½â\b\u0094\u0096\u001eå\u0080s\u000eþ¼L6Û¨)B´Ç\u0002N\u0091ð\u001fzjèù\u0096G\bÒ\u0082 7¯¾= \u0088ª\u0016\\eÖóX~âÌd[î¦\u00944\u001a\u0083\u008c\u00116\u009c¸ê!y×Ç]RÀ J/ü½v\bè\u0097\u0092å\u0007p\u008eþ4M¾Û,&Ö´X\u0003Â\u0091w\u001cþj`ùêD\u009cÒ\u0006!\u0088¯\":§\u0088.\u0017ÔeZðÈ~vÍø[b¦\u00175\u009e\u0083\u0000\u000e\u008a\u009c<ë¶y8ÄÂRG¡Î/pºþ\bl\u0097\u0016â\u0098p\u0002ÿ´M=Ø &.µÜ\u0003F\u008eÈ\u001cbkçùnD\u0014Ó\u009a!\f¬¶:(\u0089¡\u0017TbÝð@\u007fÎÍ|Xæ¦h5\u0012\u0080\u0084\u000e\u000e\u009d´ë:v¬ÄVSÈ¡B,÷º}\tà\u0097jâ\u001cq\u0086ÿ\bJ²Ø''®µT\u0000Þ\u008eH\u001dökxöáE\u0094Ó\u001d^\u0080¬\u000e;¼\u0089&\u0014¨bBñÇ\u007fNÊôXz§ì2\u0096\u0080\b\u000f\u0082\u009d7è¾v Å®S\\ÞÆ,X»â\td\u0094îã\u0090q\u001aü\u008cJ6Ù¨'!²×\u0000]\u008fÀ\u001dJhüövEøÐ\u0092^\u0004\u00ad\u008e;4\u0086¾\u0014,cÖñX|ÂÊwYý§`2ê\u0081\u009c\u000f\u0006\u009a\u0098è\"w¤Å.PÔÞZ-È»v\u0006è\u0094bã\u0014n\u009eü\u0000K\u008eÙ<$¶²8\u0001Ò\u008fD\u001a²h\f".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 3217);
        getPaymentFci = cArr;
        getApplicationLifeCycleData = -4387136591890230311L;
    }
}
