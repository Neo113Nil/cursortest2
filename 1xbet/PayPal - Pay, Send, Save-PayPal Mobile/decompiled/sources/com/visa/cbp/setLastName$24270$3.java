package com.visa.cbp;

/* loaded from: classes16.dex */
public class setLastName$24270$3 implements java.lang.Runnable {
    public static final byte[] $$a = {com.google.common.base.Ascii.DC4, 47, 87, -60, -41, 4, com.google.common.base.Ascii.VT, 0, -6, 8, com.google.common.base.Ascii.RS, com.visa.cbp.getEncExpo.onUnminimized, -8, 7, 10, -6, 8, -7, 14, com.google.common.base.Ascii.EM, com.visa.cbp.getEncExpo.onUnminimized, -9, -1, 19, -11, 2, com.google.common.base.Ascii.CAN, -8, -6, 19, com.google.common.base.Ascii.EM, -20, com.google.common.base.Ascii.CAN, -8, -6, 19, -11, 17, -12, 35, -24, 7, 9, -6, 40, -34, com.google.common.base.Ascii.VT, -6};
    public static final int $$b = 113;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighSpeedVideoFpsRanges(short s, byte b, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = (b * 3) + 67;
        int i5 = 23 - i;
        int i6 = 37 - s;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            int i8 = i6;
            int i9 = i8 + 1;
            int i10 = i7 + (-i6) + 3;
            i2 = i3;
            i4 = i10;
            i6 = i9;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i4;
            i8 = i6;
            i6 = bArr[i6];
            i7 = i11;
            int i92 = i8 + 1;
            int i102 = i7 + (-i6) + 3;
            i2 = i3;
            i4 = i102;
            i6 = i92;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    public setLastName$24270$3(java.lang.Object obj, android.content.Context context) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object obj = this.getHighSpeedVideoSizes;
        try {
            java.lang.Object[] objArr = {this.getHighSpeedVideoFpsRangesFor};
            java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1885188986);
            if (obj2 == null) {
                java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 2090 - android.graphics.Color.blue(0), 30 - android.text.TextUtils.indexOf("", "", 0, 0));
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(r12[7], (byte) (-$$a[11]), r12[6], objArr2);
                obj2 = cls.getDeclaredMethod((java.lang.String) objArr2[0], android.content.Context.class);
                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1885188986, obj2);
            }
            if (((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, objArr)).intValue() == 16476) {
                try {
                    java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-701117313);
                    if (obj3 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), android.view.KeyEvent.normalizeMetaState(0) + 2090, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 30);
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(r9[6], r9[37], (byte) (-$$a[11]), objArr3);
                        obj3 = cls2.getDeclaredMethod((java.lang.String) objArr3[0], null);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-701117313, obj3);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, null)).intValue() == 16476) {
                        java.lang.Object obj4 = this.getHighSpeedVideoSizes;
                        try {
                            java.lang.Object[] objArr4 = {this.getHighSpeedVideoFpsRangesFor};
                            java.lang.Object obj5 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1724979668);
                            if (obj5 == null) {
                                java.lang.Class cls3 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 2138 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 29 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()));
                                byte b = (byte) ($$b & 175);
                                byte b2 = $$a[7];
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges(b, b2, b2, objArr5);
                                obj5 = cls3.getDeclaredMethod((java.lang.String) objArr5[0], android.content.Context.class);
                                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1724979668, obj5);
                            }
                            if (((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(obj4, objArr4)).intValue() == 16476) {
                                try {
                                    java.lang.Object obj6 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(531606895);
                                    if (obj6 == null) {
                                        java.lang.Class cls4 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2090, 29 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                        byte[] bArr = $$a;
                                        byte b3 = (byte) (bArr[5] + 1);
                                        byte b4 = bArr[37];
                                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRanges(b3, b4, b4, objArr6);
                                        obj6 = cls4.getMethod((java.lang.String) objArr6[0], null);
                                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(531606895, obj6);
                                    }
                                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, null)).intValue() == 16476) {
                                        java.lang.Object obj7 = this.getHighSpeedVideoSizes;
                                        try {
                                            java.lang.Object[] objArr7 = {this.getHighSpeedVideoFpsRangesFor};
                                            java.lang.Object obj8 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1292249837);
                                            if (obj8 == null) {
                                                java.lang.Class cls5 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 2091 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 31 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRanges(r13[6], r13[37], (byte) (-$$a[11]), objArr8);
                                                obj8 = cls5.getDeclaredMethod((java.lang.String) objArr8[0], android.content.Context.class);
                                                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1292249837, obj8);
                                            }
                                            if (((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(obj7, objArr7)).intValue() == 16476) {
                                                try {
                                                    java.lang.Object obj9 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-2043772832);
                                                    if (obj9 == null) {
                                                        java.lang.Class cls6 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.widget.ExpandableListView.getPackedPositionType(0L) + 2090, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 30);
                                                        byte b5 = (byte) ($$b & 175);
                                                        byte b6 = $$a[7];
                                                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                                                        getHighSpeedVideoFpsRanges(b5, b6, b6, objArr9);
                                                        obj9 = cls6.getDeclaredMethod((java.lang.String) objArr9[0], null);
                                                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-2043772832, obj9);
                                                    }
                                                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj9).invoke(null, null)).intValue() == 16476) {
                                                        return;
                                                    }
                                                } catch (java.lang.Throwable th) {
                                                    java.lang.Throwable cause = th.getCause();
                                                    if (cause == null) {
                                                        throw th;
                                                    }
                                                    throw cause;
                                                }
                                            }
                                            com.visa.cbp.CardMetadataUpdateResponse.BuildConfig(this.getHighSpeedVideoFpsRangesFor, com.visa.cbp.setDeviceCerts.getTvls);
                                            throw new com.visa.cbp.sdk.facade.exception.HookDetectException(com.visa.cbp.setDeviceCerts.getTvls);
                                        } catch (java.lang.Throwable th2) {
                                            java.lang.Throwable cause2 = th2.getCause();
                                            if (cause2 == null) {
                                                throw th2;
                                            }
                                            throw cause2;
                                        }
                                    }
                                } catch (java.lang.Throwable th3) {
                                    java.lang.Throwable cause3 = th3.getCause();
                                    if (cause3 == null) {
                                        throw th3;
                                    }
                                    throw cause3;
                                }
                            }
                            com.visa.cbp.CardMetadataUpdateResponse.BuildConfig(this.getHighSpeedVideoFpsRangesFor, com.visa.cbp.setDeviceCerts.ReplenishRequest);
                            throw new com.visa.cbp.sdk.facade.exception.RootDetectException(com.visa.cbp.setDeviceCerts.ReplenishRequest);
                        } catch (java.lang.Throwable th4) {
                            java.lang.Throwable cause4 = th4.getCause();
                            if (cause4 == null) {
                                throw th4;
                            }
                            throw cause4;
                        }
                    }
                } catch (java.lang.Throwable th5) {
                    java.lang.Throwable cause5 = th5.getCause();
                    if (cause5 == null) {
                        throw th5;
                    }
                    throw cause5;
                }
            }
            com.visa.cbp.CardMetadataUpdateResponse.BuildConfig(this.getHighSpeedVideoFpsRangesFor, com.visa.cbp.setDeviceCerts.setEncryptionMetaData);
            throw new com.visa.cbp.sdk.facade.exception.EmulatorDetectException(com.visa.cbp.setDeviceCerts.setEncryptionMetaData);
        } catch (java.lang.Throwable th6) {
            java.lang.Throwable cause6 = th6.getCause();
            if (cause6 == null) {
                throw th6;
            }
            throw cause6;
        }
    }
}
