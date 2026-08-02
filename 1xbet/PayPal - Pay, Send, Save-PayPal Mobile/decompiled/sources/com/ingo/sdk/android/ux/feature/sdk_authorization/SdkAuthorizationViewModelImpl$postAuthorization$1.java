package com.ingo.sdk.android.ux.feature.sdk_authorization;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl$postAuthorization$1", f = "SdkAuthorizationViewModelImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class SdkAuthorizationViewModelImpl$postAuthorization$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private static short[] getOutputMinFrameDuration;
    final /* synthetic */ com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationParameters getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    private static final byte[] $$c = {org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 102, 34, -113};
    private static final int $$d = 40;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {114, -70, 37, 86, 1, 18, -41, 36, 1, 4, -19, com.google.common.base.Ascii.SYN, 17, -1, 0, com.google.common.base.Ascii.FF, 2, -8, 9, 2, -28, 41, 2, -1, 8, 2, -30, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DC4, -18, 17, -8, -23, 6, -26, com.google.common.base.Ascii.CAN, 13, -7, 1, 18, -41, 36, 1, 4, -18, 32, -8, 3, 2, -11, com.google.common.base.Ascii.SYN, -2, 4, 13, -25, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DC4, -18, 17};
    private static final int $$b = 61;
    private static int getHighSpeedVideoSizesFor = 0;
    private static int getInputSizeshNQ4ISI = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 167408215;
    private static int Camera2StreamConfigurationMap = -477666487;
    private static int getInputFormats = 1795366986;
    private static byte[] getOutputFormats = {67, -84, 78, -71, 64, -109, -86, 5, -71, -74, 78, -71, 64, -77, -118, 117, 68, 69, 66, -79, 73, -78, -23, com.google.common.base.Ascii.CAN, -59, 59, com.google.common.base.Ascii.US, -26, com.google.common.base.Ascii.NAK, -13, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.FS, -32, com.visa.cbp.getEncExpo.kernelVersion, 45, -17, com.google.common.base.Ascii.RS, 45, -36, 1, -1, -37, 34, -47, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -38, -34, -39, -40, 36, com.google.common.base.Ascii.VT, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -27, -39, 102, -98, 34, 45, -43, 34, -37, 40, 17, -18, -33, -34, -39, 42, -46, 41, 64, 74, -71, 74, -46, 103, -22, -38, 41, 34, -39, 35, -47, 48, -34, 34, com.google.common.base.Ascii.DC4, -22, -38, -36, 35, com.google.common.base.Ascii.RS, -104, 40, -40, 38, com.google.common.base.Ascii.EM, -17, -52, 44, com.google.common.base.Ascii.NAK, 120, -117, Byte.MIN_VALUE, 123, -127, 115, -110, 124, Byte.MIN_VALUE, -73, 62, 124, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SI};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$e(byte b, short s, short s2) {
        int i;
        int i2;
        int i3 = 105 - b;
        int i4 = (s * 4) + 1;
        int i5 = 4 - (s2 * 4);
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i4;
            i2 = 0;
            i5++;
            i3 += i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
                return new java.lang.String(bArr2, 0);
            }
            i6 = bArr[i5];
            i5++;
            i3 += i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, byte b, byte b2, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = 103 - b;
        int i4 = 58 - i;
        byte[] bArr2 = new byte[35 - b2];
        int i5 = 34 - b2;
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            int i8 = i4;
            int i9 = (i6 + i4) - 3;
            i2 = i7;
            int i10 = i8;
            i3 = i9;
            i4 = i10;
            bArr2[i2] = (byte) i3;
            int i11 = i4 + 1;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i12 = i3;
            i8 = i11;
            i4 = bArr[i11];
            i7 = i2 + 1;
            i6 = i12;
            int i92 = (i6 + i4) - 3;
            i2 = i7;
            int i102 = i8;
            i3 = i92;
            i4 = i102;
            bArr2[i2] = (byte) i3;
            int i112 = i4 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            int i1122 = i4 + 1;
            if (i2 == i5) {
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i = 2 % 2;
        int i2 = getInputSizeshNQ4ISI + 1;
        getHighSpeedVideoSizesFor = i2 % 128;
        int i3 = i2 % 2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationUseCase sdkAuthorizationUseCase = this.getHighSpeedVideoFpsRangesFor.getSdkAuthorizationUseCase();
        com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationParameters sdkAuthorizationParameters = this.getHighSpeedVideoFpsRanges;
        final com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl sdkAuthorizationViewModelImpl = this.getHighSpeedVideoFpsRangesFor;
        sdkAuthorizationUseCase.invoke(sdkAuthorizationParameters, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl$postAuthorization$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl$postAuthorization$1.Camera2StreamConfigurationMap(com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl.this, (com.ingo.sdk.kotlin.common.core.functional.Either) obj2);
            }
        });
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        int i4 = getInputSizeshNQ4ISI + 65;
        getHighSpeedVideoSizesFor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return unit;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a0, code lost:
    
        if (r7 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01b6, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b4, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b2, code lost:
    
        if (r7 != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, int i3, byte b, short s, java.lang.Object[] objArr) {
        boolean z;
        int i4;
        int i5;
        boolean z2;
        int length;
        byte[] bArr;
        int i6 = 2;
        int i7 = 2 % 2;
        o.accessartificialFrame accessartificialframe = new o.accessartificialFrame();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(Camera2StreamConfigurationMap)};
            java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(2136818323);
            if (Camera2StreamConfigurationMap2 == null) {
                byte b2 = (byte) 1;
                byte b3 = (byte) (b2 - 1);
                Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (android.text.TextUtils.indexOf("", "", 0, 0) + 12848), 451 - android.graphics.Color.argb(0, 0, 0, 0), 18 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -497187949, false, $$e(b2, b3, b3), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr2)).intValue();
            if (intValue == -1) {
                int i8 = $10 + 125;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                z = true;
            } else {
                z = false;
            }
            float f = 0.0f;
            if (z) {
                byte[] bArr2 = getOutputFormats;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i10 = 0;
                    while (i10 < length2) {
                        int i11 = $10 + 71;
                        $11 = i11 % 128;
                        int i12 = i11 % i6;
                        try {
                            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr2[i10])};
                            java.lang.Object Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(1025865855);
                            if (Camera2StreamConfigurationMap3 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), (android.graphics.PointF.length(f, f) > f ? 1 : (android.graphics.PointF.length(f, f) == f ? 0 : -1)) + 305, android.widget.ExpandableListView.getPackedPositionChild(0L) + 19, -1608140417, false, $$e(b4, b5, b5), new java.lang.Class[]{java.lang.Integer.TYPE});
                            }
                            bArr3[i10] = ((java.lang.Byte) ((java.lang.reflect.Method) Camera2StreamConfigurationMap3).invoke(null, objArr3)).byteValue();
                            i10++;
                            i6 = 2;
                            f = 0.0f;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = getOutputFormats;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(getHighResolutionOutputSizeshNQ4ISI)};
                    java.lang.Object Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(2136818323);
                    if (Camera2StreamConfigurationMap4 == null) {
                        byte b6 = (byte) 1;
                        byte b7 = (byte) (b6 - 1);
                        Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (12848 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), android.view.KeyEvent.normalizeMetaState(0) + 451, 17 - android.text.TextUtils.indexOf("", "", 0), -497187949, false, $$e(b6, b7, b7), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    intValue = (byte) (((byte) (bArr4[((java.lang.Integer) ((java.lang.reflect.Method) Camera2StreamConfigurationMap4).invoke(null, objArr4)).intValue()] ^ (-7452648645728967921L))) + ((int) (Camera2StreamConfigurationMap ^ (-7452648645728967921L))));
                } else {
                    intValue = (short) (((short) (getOutputMinFrameDuration[i3 + ((int) (getHighResolutionOutputSizeshNQ4ISI ^ (-7452648645728967921L)))] ^ (-7452648645728967921L))) + ((int) (Camera2StreamConfigurationMap ^ (-7452648645728967921L))));
                }
            }
            if (intValue > 0) {
                int i13 = $11 + 29;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    i4 = ((i3 / intValue) % 5) % ((int) (getHighResolutionOutputSizeshNQ4ISI * (-7452648645728967921L)));
                } else {
                    i4 = ((i3 + intValue) - 2) + ((int) (getHighResolutionOutputSizeshNQ4ISI ^ (-7452648645728967921L)));
                }
                accessartificialframe.getHighSpeedVideoSizes = i4 + i5;
                java.lang.Object[] objArr5 = {accessartificialframe, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(getInputFormats), sb};
                java.lang.Object Camera2StreamConfigurationMap5 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-146048967);
                if (Camera2StreamConfigurationMap5 == null) {
                    Camera2StreamConfigurationMap5 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) android.text.TextUtils.indexOf("", ""), 19 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 23, 1783347513, false, "l", new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class});
                }
                ((java.lang.StringBuilder) ((java.lang.reflect.Method) Camera2StreamConfigurationMap5).invoke(null, objArr5)).append(accessartificialframe.Camera2StreamConfigurationMap);
                accessartificialframe.getHighSpeedVideoFpsRanges = accessartificialframe.Camera2StreamConfigurationMap;
                byte[] bArr5 = getOutputFormats;
                if (bArr5 != null) {
                    int i14 = $11 + 109;
                    $10 = i14 % 128;
                    if (i14 % 2 != 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                    }
                    for (int i15 = 0; i15 < length; i15++) {
                        bArr[i15] = (byte) (bArr5[i15] ^ (-7452648645728967921L));
                    }
                    bArr5 = bArr;
                }
                if (bArr5 != null) {
                    int i16 = $11 + 59;
                    $10 = i16 % 128;
                    if (i16 % 2 == 0) {
                        z2 = true;
                        accessartificialframe.getHighResolutionOutputSizeshNQ4ISI = 1;
                        while (accessartificialframe.getHighResolutionOutputSizeshNQ4ISI < intValue) {
                            if (z2) {
                                byte[] bArr6 = getOutputFormats;
                                accessartificialframe.getHighSpeedVideoSizes = accessartificialframe.getHighSpeedVideoSizes - 1;
                                accessartificialframe.Camera2StreamConfigurationMap = (char) (accessartificialframe.getHighSpeedVideoFpsRanges + (((byte) (((byte) (bArr6[r7] ^ (-7452648645728967921L))) + s)) ^ b));
                            } else {
                                short[] sArr = getOutputMinFrameDuration;
                                accessartificialframe.getHighSpeedVideoSizes = accessartificialframe.getHighSpeedVideoSizes - 1;
                                accessartificialframe.Camera2StreamConfigurationMap = (char) (accessartificialframe.getHighSpeedVideoFpsRanges + (((short) (((short) (sArr[r7] ^ (-7452648645728967921L))) + s)) ^ b));
                            }
                            sb.append(accessartificialframe.Camera2StreamConfigurationMap);
                            accessartificialframe.getHighSpeedVideoFpsRanges = accessartificialframe.Camera2StreamConfigurationMap;
                            accessartificialframe.getHighResolutionOutputSizeshNQ4ISI++;
                        }
                    }
                } else {
                    int i17 = $11 + 9;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                }
                z2 = false;
                accessartificialframe.getHighResolutionOutputSizeshNQ4ISI = 1;
                while (accessartificialframe.getHighResolutionOutputSizeshNQ4ISI < intValue) {
                }
            }
            objArr[0] = sb.toString();
        } catch (java.lang.Throwable th2) {
            java.lang.Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl sdkAuthorizationViewModelImpl, com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
        kotlin.Unit unit;
        int i = 2 % 2;
        int i2 = getInputSizeshNQ4ISI + 95;
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 != 0) {
            sdkAuthorizationViewModelImpl.getFailure().postValue(failure);
            unit = kotlin.Unit.INSTANCE;
            int i3 = 96 / 0;
        } else {
            sdkAuthorizationViewModelImpl.getFailure().postValue(failure);
            unit = kotlin.Unit.INSTANCE;
        }
        int i4 = getInputSizeshNQ4ISI + 59;
        getHighSpeedVideoSizesFor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(final com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl sdkAuthorizationViewModelImpl, com.ingo.sdk.kotlin.common.core.functional.Either either) {
        int i = 2 % 2;
        either.fold(new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl$postAuthorization$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl$postAuthorization$1.Camera2StreamConfigurationMap(com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl.this, (com.ingo.sdk.kotlin.common.core.exception.Failure) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl$postAuthorization$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl$postAuthorization$1.Camera2StreamConfigurationMap(com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl.this, obj);
            }
        });
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        int i2 = getInputSizeshNQ4ISI + 115;
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl sdkAuthorizationViewModelImpl, java.lang.Object obj) {
        int i = 2 % 2;
        int i2 = getInputSizeshNQ4ISI + 119;
        getHighSpeedVideoSizesFor = i2 % 128;
        int i3 = i2 % 2;
        sdkAuthorizationViewModelImpl.getSdkAuthorizeResponseData().postValue(obj);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        int i4 = getHighSpeedVideoSizesFor + 85;
        getInputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        int i = 2 % 2;
        int i2 = getHighSpeedVideoSizesFor + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getInputSizeshNQ4ISI = i2 % 128;
        kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
        kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2 = continuation;
        if (i2 % 2 != 0) {
            return ((com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl$postAuthorization$1) create(coroutineScope2, continuation2)).invokeSuspend(kotlin.Unit.INSTANCE);
        }
        java.lang.Object invokeSuspend = ((com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl$postAuthorization$1) create(coroutineScope2, continuation2)).invokeSuspend(kotlin.Unit.INSTANCE);
        int i3 = 24 / 0;
        return invokeSuspend;
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.Object[] getHighSpeedVideoSizes(android.content.Context r31, int r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 2758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl$postAuthorization$1.getHighSpeedVideoSizes(android.content.Context, int, int, int):java.lang.Object[]");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        int i = 2 % 2;
        com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl$postAuthorization$1 sdkAuthorizationViewModelImpl$postAuthorization$1 = new com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl$postAuthorization$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
        int i2 = getHighSpeedVideoSizesFor + 63;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return sdkAuthorizationViewModelImpl$postAuthorization$1;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SdkAuthorizationViewModelImpl$postAuthorization$1(com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl sdkAuthorizationViewModelImpl, com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationParameters sdkAuthorizationParameters, kotlin.coroutines.Continuation<? super com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl$postAuthorization$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = sdkAuthorizationViewModelImpl;
        this.getHighSpeedVideoFpsRanges = sdkAuthorizationParameters;
    }
}
