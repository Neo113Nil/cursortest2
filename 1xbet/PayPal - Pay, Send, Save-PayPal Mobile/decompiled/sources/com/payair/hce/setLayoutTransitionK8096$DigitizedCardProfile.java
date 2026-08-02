package com.payair.hce;

/* loaded from: classes10.dex */
public final class setLayoutTransitionK8096$DigitizedCardProfile extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char[] IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static long SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getProfileVersion;
    private static long values;
    private /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson;
    private int DigitizedCardProfile;
    private /* synthetic */ java.lang.Object valueOf;
    private /* synthetic */ android.content.Context writeReplace;

    private static void a(byte b, int i, int i2, java.lang.Object[] objArr) {
        int i3 = i2 * 4;
        int i4 = (b * 4) + 65;
        byte[] bArr = $$a;
        int i5 = 3 - (i * 3);
        byte[] bArr2 = new byte[i3 + 35];
        int i6 = i3 + 34;
        int i7 = -1;
        if (bArr == null) {
            int i8 = (i5 + i6) - 2;
            i5 = i5;
            i4 = i8;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i4;
            if (i7 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i9 = i5 + 1;
            i5 = i9;
            i4 = (i4 + bArr[i9]) - 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(byte b, short s, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = (b * 3) + 1;
        int i5 = (s * 4) + 4;
        int i6 = 119 - (i * 2);
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            int i8 = i5;
            int i9 = i5 + i7;
            int i10 = i8 + 1;
            i2 = i3;
            i6 = i9;
            i5 = i10;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i6;
            i8 = i5;
            i5 = bArr[i5];
            i7 = i11;
            int i92 = i5 + i7;
            int i102 = i8 + 1;
            i2 = i3;
            i6 = i92;
            i5 = i102;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = (i * 677) + (i2 * (-675)) + ((i | i3 | i4) * (-676)) + (((~(i4 | i)) | (~(i5 | i))) * 676) + (((~((~i) | i4)) | (~(i4 | i5)) | (~(i2 | i | i3))) * 676);
        if (i6 != 1) {
            return i6 != 2 ? i6 != 3 ? writeReplace(objArr) : AlternateContactlessPaymentDataJson(objArr) : values(objArr);
        }
        com.payair.hce.setLayoutTransitionK8096$DigitizedCardProfile setlayouttransitionk8096_digitizedcardprofile = (com.payair.hce.setLayoutTransitionK8096$DigitizedCardProfile) objArr[0];
        java.lang.Object obj = objArr[1];
        java.lang.Object obj2 = objArr[2];
        int i7 = getProfileVersion;
        RecordsJson = ((i7 ^ 55) + ((i7 & 55) << 1)) % 128;
        java.lang.Object values2 = values(new java.lang.Object[]{setlayouttransitionk8096_digitizedcardprofile, (kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2}, -110286211, 110286214, java.lang.System.identityHashCode(setlayouttransitionk8096_digitizedcardprofile));
        int i8 = getProfileVersion + 120;
        RecordsJson = ((~i8) + (i8 << 1)) % 128;
        return values2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b2 A[Catch: all -> 0x01a0, TryCatch #0 {all -> 0x01a0, blocks: (B:9:0x009f, B:11:0x00b2, B:12:0x010a), top: B:8:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0118  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007b -> B:7:0x009b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        kotlinx.coroutines.CoroutineScope coroutineScope;
        int i;
        com.payair.hce.setLayoutTransitionK8096$DigitizedCardProfile setlayouttransitionk8096_digitizedcardprofile = (com.payair.hce.setLayoutTransitionK8096$DigitizedCardProfile) objArr[0];
        java.lang.Object obj = objArr[1];
        int i2 = getProfileVersion;
        int i3 = i2 & 53;
        int i4 = (i2 ^ 53) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        RecordsJson = i5 % 128;
        if (i5 % 2 != 0) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = setlayouttransitionk8096_digitizedcardprofile.DigitizedCardProfile;
            throw new java.lang.ArithmeticException();
        }
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = setlayouttransitionk8096_digitizedcardprofile.DigitizedCardProfile;
        if (i7 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope2 = (kotlinx.coroutines.CoroutineScope) setlayouttransitionk8096_digitizedcardprofile.valueOf;
            int i8 = getProfileVersion;
            int i9 = i8 & 81;
            int i10 = (i8 ^ 81) | i9;
            RecordsJson = ((i9 & i10) + (i10 | i9)) % 128;
            coroutineScope = coroutineScope2;
            if (kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
            }
        } else {
            if (i7 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (kotlinx.coroutines.CoroutineScope) setlayouttransitionk8096_digitizedcardprofile.valueOf;
            kotlin.ResultKt.throwOnFailure(obj);
            RecordsJson = (getProfileVersion + 43) % 128;
            try {
                java.lang.Object[] objArr2 = {setlayouttransitionk8096_digitizedcardprofile.AlternateContactlessPaymentDataJson, setlayouttransitionk8096_digitizedcardprofile.writeReplace};
                java.lang.Object obj2 = com.payair.hce.setWillNotDraw.getMchipCvmIssuerOptions.get(-2105514878);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.setWillNotDraw.valueOf((char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 13213), 39 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 45)).getMethod("DigitizedCardProfile", (java.lang.Class) com.payair.hce.setWillNotDraw.valueOf((char) (13214 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 40, 45 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), android.content.Context.class);
                    com.payair.hce.setWillNotDraw.getMchipCvmIssuerOptions.put(-2105514878, obj2);
                }
                if (!((java.lang.Boolean) ((java.lang.reflect.Method) obj2).invoke(null, objArr2)).booleanValue()) {
                    int i11 = RecordsJson;
                    int i12 = ((i11 ^ 100) + ((i11 & 100) << 1)) - 1;
                    getProfileVersion = i12 % 128;
                    if (i12 % 2 == 0) {
                        throw null;
                    }
                    com.payair.hce.HCEEventListener hCEEventListener = (com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis());
                    if (hCEEventListener != null) {
                        hCEEventListener.onSdkUnregistered();
                        int i13 = getProfileVersion;
                        i = ((i13 & 18) + (i13 | 18)) - 1;
                    } else {
                        int i14 = getProfileVersion;
                        i = ((i14 | 15) << 1) - (i14 ^ 15);
                    }
                    RecordsJson = i % 128;
                    new com.payair.hce.setIsCredential().DigitizedCardProfile();
                    com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -1891116219, 1891116251, (int) java.lang.System.currentTimeMillis());
                    com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], 2112431470, -2112431463, (int) java.lang.System.currentTimeMillis());
                    int i15 = getProfileVersion;
                    int i16 = i15 ^ 93;
                    int i17 = (i15 & 93) << 1;
                    RecordsJson = (((i16 | i17) << 1) - (i17 ^ i16)) % 128;
                }
                if (kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
                    setlayouttransitionk8096_digitizedcardprofile.valueOf = coroutineScope;
                    setlayouttransitionk8096_digitizedcardprofile.DigitizedCardProfile = 1;
                    if (kotlinx.coroutines.DelayKt.delay(kotlin.random.RandomKt.nextLong(kotlin.random.Random.INSTANCE, new kotlin.ranges.LongRange(1000L, 5000L)), setlayouttransitionk8096_digitizedcardprofile) == coroutine_suspended) {
                        int i18 = getProfileVersion;
                        int i19 = (i18 & 73) + (i18 | 73);
                        RecordsJson = i19 % 128;
                        if (i19 % 2 != 0) {
                            throw null;
                        }
                        int i20 = (i18 ^ 79) + ((i18 & 79) << 1);
                        RecordsJson = i20 % 128;
                        if (i20 % 2 == 0) {
                            return coroutine_suspended;
                        }
                        throw null;
                    }
                    java.lang.Object[] objArr22 = {setlayouttransitionk8096_digitizedcardprofile.AlternateContactlessPaymentDataJson, setlayouttransitionk8096_digitizedcardprofile.writeReplace};
                    java.lang.Object obj22 = com.payair.hce.setWillNotDraw.getMchipCvmIssuerOptions.get(-2105514878);
                    if (obj22 == null) {
                    }
                    if (!((java.lang.Boolean) ((java.lang.reflect.Method) obj22).invoke(null, objArr22)).booleanValue()) {
                    }
                    if (kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        int identityHashCode = java.lang.System.identityHashCode(setlayouttransitionk8096_digitizedcardprofile);
                        int i21 = ~identityHashCode;
                        int i22 = (identityHashCode | i21) & i21;
                        int i23 = i22 & 1029161767;
                        int i24 = (i22 | 1029161767) & (~i23);
                        int i25 = ~((i24 ^ i23) | (i24 & i23));
                        int i26 = i25 & (-2136462184);
                        int i27 = (i25 | (-2136462184)) & (~i26);
                        int i28 = -(-(((i27 ^ i26) | (i27 & i26)) * (-160)));
                        int i29 = i28 & (-1364231159);
                        int i30 = ((i28 ^ (-1364231159)) | i29) << 1;
                        int i31 = -((i28 | (-1364231159)) & (~i29));
                        int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                        int i33 = i21 ^ (-1595265603);
                        int i34 = (-1595265603) & i21;
                        int i35 = ~((i34 ^ i33) | (i34 & i33));
                        int i36 = ((~i35) & 1029161767) | ((-1029161768) & i35);
                        int i37 = i35 & 1029161767;
                        int i38 = ((i37 ^ i36) | (i37 & i36)) * 160;
                        int i39 = i32 & i38;
                        int identityHashCode2 = java.lang.System.identityHashCode(setlayouttransitionk8096_digitizedcardprofile);
                        int i40 = ~identityHashCode2;
                        int i41 = i40 & (-1098955580);
                        int i42 = (~i41) & (i40 | (-1098955580));
                        int i43 = (~((i42 ^ i41) | (i41 & i42))) * 979;
                        int i44 = i43 & 2065929918;
                        int i45 = -(-((i43 ^ 2065929918) | i44));
                        int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
                        int i47 = i40 & (-1793708091);
                        int i48 = (1793708090 & identityHashCode2) | i47;
                        int i49 = identityHashCode2 & (-1793708091);
                        int i50 = -(~(((i48 & i49) | (i48 ^ i49)) * (-979)));
                        int i51 = i41 | (1098955579 & identityHashCode2);
                        int i52 = identityHashCode2 & (-1098955580);
                        int i53 = ~((i52 ^ i51) | (i52 & i51));
                        int i54 = (i40 | (-1793708091)) & (~i47);
                        int i55 = (i54 ^ i47) | (i54 & i47);
                        int i56 = ~i55;
                        int i57 = (i55 | i56) & i56;
                        if ((i39 - (~((i38 ^ i32) | i39))) - 1 <= (((((i46 | i50) << 1) - (i46 ^ i50)) - 1) - (~(-(~(((i53 ^ i57) | (i53 & i57)) * 979))))) - 2) {
                            return unit;
                        }
                        throw null;
                    }
                }
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = $10 + 5;
        int i3 = i2 % 128;
        $11 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (str != null) {
            int i4 = i3 + 29;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace = com.payair.hce.getCardholderValidator.writeReplace(values ^ (-3824242241614154557L), cArr, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace.length) {
            $11 = ($10 + 83) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i5 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace[getcardholdervalidator.valueOf] ^ writeReplace[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(values)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 39, 1921 - android.view.View.MeasureSpec.getMode(0), (char) android.graphics.Color.alpha(0));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d((byte) 0, (short) 0, 1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 428 - android.os.Process.getGidForName(""), (char) (31610 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    d((byte) 0, (short) 0, 0, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1228006564, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                $10 = ($11 + 59) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(writeReplace, 4, writeReplace.length - 4);
    }

    private static void c(char c, int i, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i) {
            $10 = ($11 + 29) % 128;
            int i3 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson[i2 + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 48, android.view.Gravity.getAbsoluteGravity(0, 0) + 381, (char) (android.view.View.resolveSize(0, 0) + 62388));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d((byte) 0, (short) 0, 10, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(SdkCoreAlternateContactlessPaymentDataImpl), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.view.KeyEvent.getDeadChar(0, 0), 3966 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (40271 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 34, 212 - (android.os.Process.myPid() >> 22), (char) android.view.KeyEvent.normalizeMetaState(0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i) {
            int i4 = $11 + 57;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 34, 213 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (android.os.Process.getGidForName("") + 1))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                throw null;
            }
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr7 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj5 == null) {
                obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.widget.ExpandableListView.getPackedPositionGroup(0L), android.graphics.ImageFormat.getBitsPerPixel(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr7);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setLayoutTransitionK8096$DigitizedCardProfile setlayouttransitionk8096_digitizedcardprofile = (com.payair.hce.setLayoutTransitionK8096$DigitizedCardProfile) objArr[0];
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) objArr[1];
        kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) objArr[2];
        int i = getProfileVersion;
        int i2 = ((i ^ 21) | (i & 21)) << 1;
        int i3 = -((i & (-22)) | ((~i) & 21));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        RecordsJson = i4 % 128;
        int i5 = i4 % 2;
        com.payair.hce.setLayoutTransitionK8096$DigitizedCardProfile setlayouttransitionk8096_digitizedcardprofile2 = (com.payair.hce.setLayoutTransitionK8096$DigitizedCardProfile) ((kotlin.coroutines.Continuation) values(new java.lang.Object[]{setlayouttransitionk8096_digitizedcardprofile, coroutineScope, continuation}, -1690142198, 1690142198, java.lang.System.identityHashCode(setlayouttransitionk8096_digitizedcardprofile)));
        java.lang.Object[] objArr2 = {setlayouttransitionk8096_digitizedcardprofile2, kotlin.Unit.INSTANCE};
        int identityHashCode = java.lang.System.identityHashCode(setlayouttransitionk8096_digitizedcardprofile2);
        if (i5 != 0) {
            values(objArr2, 1806223652, -1806223650, identityHashCode);
            throw null;
        }
        java.lang.Object values2 = values(objArr2, 1806223652, -1806223650, identityHashCode);
        getProfileVersion = (RecordsJson + 111) % 128;
        return values2;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setLayoutTransitionK8096$DigitizedCardProfile setlayouttransitionk8096_digitizedcardprofile = (com.payair.hce.setLayoutTransitionK8096$DigitizedCardProfile) objArr[0];
        java.lang.Object obj = objArr[1];
        com.payair.hce.setLayoutTransitionK8096$DigitizedCardProfile setlayouttransitionk8096_digitizedcardprofile2 = new com.payair.hce.setLayoutTransitionK8096$DigitizedCardProfile(setlayouttransitionk8096_digitizedcardprofile.AlternateContactlessPaymentDataJson, setlayouttransitionk8096_digitizedcardprofile.writeReplace, (kotlin.coroutines.Continuation) objArr[2]);
        setlayouttransitionk8096_digitizedcardprofile2.valueOf = obj;
        com.payair.hce.setLayoutTransitionK8096$DigitizedCardProfile setlayouttransitionk8096_digitizedcardprofile3 = setlayouttransitionk8096_digitizedcardprofile2;
        int i = getProfileVersion;
        int i2 = i | 115;
        int i3 = ((i2 << 1) - (~(-((~(i & 115)) & i2)))) - 1;
        RecordsJson = i3 % 128;
        if (i3 % 2 == 0) {
            return setlayouttransitionk8096_digitizedcardprofile3;
        }
        throw null;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        RecordsJson = 0;
        getProfileVersion = 1;
        values = -5071272712768568170L;
        IccPrivateKeyCrtComponentsJson = new char[]{44053, 37976, 56421, 1180, 19638, 46310, 64857, 9586, 28064, 22009, 40410, 50696, 3675, 30373, 48816, 59112, 12072, 5896, 24449, 34801, 53198, 12299, 30811, 41130, 59642, 53389, 6460, 16722, 35232, 61924, 14795, 1953, 16272, 30676, 44815, 59243, 8026, 22175, 36546, 50745, 65128, 13942, 28054, 42447, 56628, 41312, 39260, 53507, 2538, 16802, 47511, 61527, 10314, 24826, 22693, 37009, 52036, 768, 31736, 46015, 60370, 8769, 6671, 21177, 35480, 49820, 15693, 29960, 44533, 58798, 56735, 5218, 19457, 34043, 64679, 13468, 28489, 42771, 24264, 26361, 11965, 63078, 48642, 17971, 4086, 55211, 40784, 42753, 28440, 13552, 64685, 33879, 24261, 26365, 11967, 63063, 48717, 17955, 4088, 55209, 40770, 42774, 28472, 13546, 64690, 33814, 19462, 5175, 56813, 58808, 44311, 29989, 15670, 49906, 35513, 21075, 6657, 8765, 60386, 45999, 31567, 781, 51987, 37091, 22700, 24648, 10246, 61476, 47610, 24270, 26354, 11949, 63044, 48652, 17977, 4089, 55268, 40788, 42763, 28479, 13546, 64686, 33878, 19473, 5244, 56815, 58785, 44311, 30005, 15674, 49895, 35491, 21083, 6675, 8737, 60403, 45995, 24264, 26361, 11943, 63059, 48657, 17969, 4073, 55215, 40820, 42753, 28451, 13546, 64674, 33886, 19468, 5169, 56830, 58808, 44380};
        SdkCoreAlternateContactlessPaymentDataImpl = -796967777807341924L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0a02 A[Catch: all -> 0x0a89, TryCatch #4 {all -> 0x0a89, blocks: (B:80:0x09b1, B:85:0x09be, B:87:0x09c4, B:88:0x09c5, B:67:0x09c6, B:95:0x09cd, B:97:0x09d5, B:98:0x09d6, B:100:0x09d7, B:113:0x09fa, B:115:0x0a02, B:116:0x0a03, B:129:0x0a14, B:131:0x0a1a, B:132:0x0a1b, B:138:0x0a1d, B:140:0x0a28, B:141:0x0a29, B:148:0x0a3f, B:150:0x0a45, B:151:0x0a46, B:157:0x0a48, B:159:0x0a54, B:160:0x0a55, B:163:0x0a57, B:165:0x0a63, B:166:0x0a64, B:169:0x0a66, B:171:0x0a72, B:172:0x0a73, B:176:0x0a75, B:178:0x0a81, B:179:0x0a82, B:19:0x0183, B:25:0x0217, B:64:0x0855, B:16:0x00e4, B:23:0x01ac, B:38:0x050d), top: B:15:0x00e4, inners: #2, #3, #7, #14, #16, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0a03 A[Catch: all -> 0x0a89, TryCatch #4 {all -> 0x0a89, blocks: (B:80:0x09b1, B:85:0x09be, B:87:0x09c4, B:88:0x09c5, B:67:0x09c6, B:95:0x09cd, B:97:0x09d5, B:98:0x09d6, B:100:0x09d7, B:113:0x09fa, B:115:0x0a02, B:116:0x0a03, B:129:0x0a14, B:131:0x0a1a, B:132:0x0a1b, B:138:0x0a1d, B:140:0x0a28, B:141:0x0a29, B:148:0x0a3f, B:150:0x0a45, B:151:0x0a46, B:157:0x0a48, B:159:0x0a54, B:160:0x0a55, B:163:0x0a57, B:165:0x0a63, B:166:0x0a64, B:169:0x0a66, B:171:0x0a72, B:172:0x0a73, B:176:0x0a75, B:178:0x0a81, B:179:0x0a82, B:19:0x0183, B:25:0x0217, B:64:0x0855, B:16:0x00e4, B:23:0x01ac, B:38:0x050d), top: B:15:0x00e4, inners: #2, #3, #7, #14, #16, #20 }] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r11v129, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v13, types: [int] */
    /* JADX WARN: Type inference failed for: r17v28, types: [int] */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v38 */
    /* JADX WARN: Type inference failed for: r17v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v119, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v105 */
    /* JADX WARN: Type inference failed for: r4v127 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v67, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] AlternateContactlessPaymentDataJson(android.content.Context context, int i, int i2) {
        ?? r17;
        java.lang.String str;
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        int i3;
        java.lang.Throwable cause;
        int i4 = i;
        int i5 = 0;
        int i6 = 0;
        java.lang.String str2 = "";
        try {
            if (context == null) {
                java.lang.Object[] objArr3 = {new int[]{i4}, new int[]{i4}, null, new int[1]};
                int i7 = ~i4;
                ?? r11 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((-806423425) | i7) * 494) + 1209084820 + (((~(i7 | 191820852)) | (-991559569)) * 494))};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf("", "", 0), android.view.MotionEvent.axisFromString("") + 2714, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                    byte b = $$a[3];
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    a(b, b, b, objArr4);
                    obj = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                }
                ((int[]) objArr3[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, r11)).intValue();
                return objArr3;
            }
            try {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                b("\uf09c\uf0f6弸漌\uecc5谙齙࿇ㆰ꺿쵈쵯牗\uedb0\u0fe5貗댔⬐䡍䯃\uf5b9櫩襗स㙀꧴쮻죊睊\ue72dђ螞맠⛉䕁䕻禍斮蟦Ҷ㬉ꌝ", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr5);
                objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr5[0]), 2);
                objArr2 = new java.lang.Object[1];
                b("ꇳꆰ\ud92e\ue935꤭즺⬀뮾惉⣣袡礼⌲殷䩟㣣\ue26a괝\u0dfeﾜ\ua48f\uecc4쳪봎朹⾳踑糌♢愇䆣㎴\ue882ꃚ\u0088", 1 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
            } catch (java.lang.Throwable unused) {
                i5 = i4;
                r17 = 0;
                str = "";
                i6 = -1347122530;
            }
            try {
                try {
                    java.lang.Object[] objArr6 = {(java.lang.String) objArr2[0]};
                    int i8 = -(-(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    r17 = i8 & 1;
                    b("\uf09c\uf0f6弸漌\uecc5谙齙࿇ㆰ꺿쵈쵯牗\uedb0\u0fe5貗댔⬐䡍䯃\uf5b9櫩襗स㙀꧴쮻죊睊\ue72dђ螞맠⛉䕁䕻禍斮蟦Ҷ㬉ꌝ", r17 + (i8 | 1), objArr7);
                    objArr[0] = java.lang.Class.forName((java.lang.String) objArr7[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr6);
                    int i9 = -android.view.View.resolveSizeAndState(0, 0, 0);
                    int i10 = (i9 * (-574)) - 35703374;
                    int i11 = ~i9;
                    i3 = ~i4;
                    int i12 = ~((i11 ^ i3) | (i11 & i3));
                    int i13 = ~((i4 ^ (-62202)) | (i4 & (-62202)));
                    int i14 = (i12 | i13) * 1150;
                    int i15 = ~((i3 ^ 62201) | (i3 & 62201));
                    r17 = (((i10 | i14) << 1) - (i14 ^ i10)) + (((i13 ^ i15) | (i13 & i15)) * (-575));
                    int i16 = -(-(((~((i9 & i3) | (i9 ^ i3))) | (~((i11 ^ i4) | (i11 & i4)))) * 575));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    c((char) ((r17 ^ i16) + ((i16 & r17) << 1)), 29 - (~(-android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0))), android.view.KeyEvent.getMaxKeyCode() >> 16, objArr8);
                    try {
                        java.lang.Object[] objArr9 = {(java.lang.String) objArr8[0]};
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        b("\uf09c\uf0f6弸漌\uecc5谙齙࿇ㆰ꺿쵈쵯牗\uedb0\u0fe5貗댔⬐䡍䯃\uf5b9櫩襗स㙀꧴쮻죊睊\ue72dђ螞맠⛉䕁䕻禍斮蟦Ҷ㬉ꌝ", -android.os.Process.getGidForName(""), objArr10);
                        objArr[1] = java.lang.Class.forName((java.lang.String) objArr10[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr9);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause2 = th.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable unused2) {
                }
                try {
                    int i17 = (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int i18 = ~i17;
                    int i19 = ~((i18 ^ (-2)) | (i18 & (-2)));
                    int i20 = ~(i4 | (-2));
                    int i21 = ((i17 * (-167)) - 167) + (((i19 ^ i20) | (i19 & i20)) * 336);
                    int i22 = ((~((i17 ^ 1) | (i17 & 1))) | (~(i17 | i4))) * (-168);
                    int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                    int i24 = ~((i17 ^ i3) | (i17 & i3));
                    int i25 = ((i24 ^ (-2)) | (i24 & (-2))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE;
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    b("㉦㈇ឫ➐湮ຠ꿘㽕\uf35d\ue66b俴ﶥ낭ꔹ赒밋燿掔쪼笍㝵≡௺㧣\uf4a7\ue12a䥔", ((i23 | i25) << 1) - (i25 ^ i23), objArr11);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    b("겍곪鷌근應ė杩\uf7c6涸氆䁜㕛⹂⽔苖璯\uef1f\ue9fc씈돷ꦯ", 1 - (android.os.Process.myTid() >> 22), objArr12);
                    java.lang.Object invoke = cls2.getMethod((java.lang.String) objArr12[0], null).invoke(context, null);
                    try {
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        b("㉦㈇ឫ➐湮ຠ꿘㽕\uf35d\ue66b俴ﶥ낭ꔹ赒밋燿掔쪼笍㝵≡௺㧣\uf4a7\ue12a䥔", -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr13);
                        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr13[0]);
                        int i26 = -android.text.TextUtils.indexOf("", "", 0);
                        int i27 = (i26 * 829) + 18974981;
                        int i28 = ~i26;
                        int i29 = ~((i28 ^ (-22890)) | (i28 & (-22890)));
                        int i30 = ~((i3 ^ i26) | (i3 & i26) | 22889);
                        int i31 = ((i29 ^ i30) | (i29 & i30)) * (-828);
                        int i32 = (i27 ^ i31) + ((i27 & i31) << 1);
                        int i33 = (i26 ^ 22889) | (i26 & 22889);
                        int i34 = ((i33 ^ i3) | (i33 & i3)) * (-828);
                        char c = (char) (((((i32 | i34) << 1) - (i34 ^ i32)) - (~((~i33) * 828))) - 1);
                        int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout() >> 16;
                        int i35 = doubleTapTimeout * 69;
                        int i36 = ((i35 | (-938)) << 1) - (i35 ^ (-938));
                        int i37 = ~doubleTapTimeout;
                        int i38 = (i37 ^ (-15)) | (i37 & (-15));
                        int i39 = -(-(((~((i38 ^ i3) | (i38 & i3))) | (~(doubleTapTimeout | 14)) | (~((i4 ^ 14) | (i4 & 14)))) * (-68)));
                        int i40 = (i37 ^ i3) | (i37 & i3);
                        int i41 = (((i36 | i39) << 1) - (i39 ^ i36)) + ((~((i40 & 14) | (i40 ^ 14))) * (-68));
                        int i42 = ~((i3 ^ (-15)) | (i3 & (-15)));
                        int i43 = -(-(((i37 ^ i42) | (i37 & i42)) * 68));
                        int i44 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        int i45 = ((i41 | i43) << 1) - (i43 ^ i41);
                        r17 = i44 & 31;
                        c(c, i45, r17 + (i44 | 31), objArr14);
                        try {
                            java.lang.Object[] objArr15 = {cls3.getMethod((java.lang.String) objArr14[0], null).invoke(context, null), 64};
                            int tapTimeout = android.view.ViewConfiguration.getTapTimeout() >> 16;
                            int i46 = (tapTimeout * 860) - 56159532;
                            int i47 = -(-(((tapTimeout ^ i4) | (tapTimeout & i4)) * (-859)));
                            int i48 = ((i46 | i47) << 1) - (i46 ^ i47);
                            int i49 = ~((i3 ^ tapTimeout) | (i3 & tapTimeout));
                            int i50 = ~tapTimeout;
                            int i51 = (i50 & (-65455)) | (i50 ^ (-65455));
                            int i52 = ~((i51 & i4) | (i51 ^ i4));
                            int i53 = -(-(((i49 & i52) | (i49 ^ i52)) * 859));
                            int i54 = (i48 & i53) + (i53 | i48);
                            int i55 = ~((i3 ^ (-65455)) | (i3 & (-65455)));
                            int i56 = ~((tapTimeout ^ (-65455)) | (tapTimeout & (-65455)));
                            int i57 = ((i56 ^ i55) | (i56 & i55)) * 859;
                            char c2 = (char) (((i54 | i57) << 1) - (i57 ^ i54));
                            int i58 = -android.text.TextUtils.indexOf("", "", 0, 0);
                            int i59 = i58 * (-183);
                            int i60 = (i59 ^ (-6039)) + ((i59 & (-6039)) << 1);
                            int i61 = ~i58;
                            int i62 = i61 | i3;
                            int i63 = ~((i62 & 33) | (i62 ^ 33));
                            int i64 = ~((i3 ^ (-34)) | (i3 & (-34)) | i58);
                            int i65 = -(-(((i63 ^ i64) | (i64 & i63)) * (-184)));
                            int i66 = (i60 & i65) + (i65 | i60);
                            int i67 = (~i62) | (~((i61 & (-34)) | (i61 ^ (-34))));
                            int i68 = ~(i3 | (-34));
                            int i69 = ((i67 ^ i68) | (i67 & i68)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
                            int i70 = (i66 & i69) + (i69 | i66);
                            int i71 = -(-(((i58 & 33) | (i58 ^ 33)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE));
                            int rgb = android.graphics.Color.rgb(0, 0, 0);
                            int i72 = (rgb * (-559)) + 822108829;
                            int i73 = -(-((~((i3 ^ rgb) | (i3 & rgb))) * (-560)));
                            int i74 = (i72 ^ i73) + ((i72 & i73) << 1);
                            int i75 = -(-((~((-16777262) | rgb | i4)) * (-560)));
                            int i76 = ~rgb;
                            int i77 = ~((i76 ^ 16777261) | (16777261 & i76));
                            int i78 = ~(16777261 | i3);
                            r17 = 0;
                            try {
                                java.lang.Object[] objArr16 = new java.lang.Object[1];
                                c(c2, ((i70 | i71) << 1) - (i71 ^ i70), (((i74 | i75) << 1) - (i75 ^ i74)) + (((i77 & i78) | (i77 ^ i78)) * 560), objArr16);
                                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr16[0]);
                                char defaultSize = (char) android.view.View.getDefaultSize(0, 0);
                                int i79 = -(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                int i80 = i79 * (-589);
                                int i81 = (i80 ^ 8274) + ((i80 & 8274) << 1);
                                int i82 = ~(i79 | (-15));
                                int i83 = (i82 & i42) | (i42 ^ i82);
                                int i84 = ~((i3 ^ i79) | (i3 & i79));
                                int i85 = (i83 & i84) | (i83 ^ i84);
                                int i86 = ~i79;
                                int i87 = i86 | 14;
                                int i88 = ~((i87 & i4) | (i87 ^ i4));
                                int i89 = ((i85 & i88) | (i85 ^ i88)) * 590;
                                int i90 = ~((i79 & (-15)) | (i79 ^ (-15)));
                                int i91 = (i90 & i42) | (i42 ^ i90);
                                int i92 = (((i81 & i89) + (i89 | i81)) - (~(((i91 ^ i84) | (i91 & i84)) * (-1180)))) - 1;
                                int i93 = ~((i86 ^ i3) | (i86 & i3));
                                int i94 = ~((i3 ^ 14) | (i3 & 14));
                                int i95 = ((i93 ^ i94) | (i93 & i94)) * 590;
                                int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                int i96 = (-965) - (~(-(-(indexOf * (-963)))));
                                int i97 = ((76235 | i96) << 1) - (i96 ^ 76235);
                                int i98 = ~indexOf;
                                int i99 = ~((i4 ^ (-80)) | (i4 & (-80)));
                                int i100 = -(-(((i98 & i99) | (i98 ^ i99)) * (-964)));
                                int i101 = ((i97 | i100) << 1) - (i100 ^ i97);
                                int i102 = ~((i3 ^ (-80)) | (i3 & (-80)));
                                int i103 = ~((indexOf & (-80)) | (indexOf ^ (-80)));
                                int i104 = -(-(((i102 ^ i103) | (i102 & i103)) * (-964)));
                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                c(defaultSize, (i92 & i95) + (i95 | i92), ((i101 | i104) << 1) - (i104 ^ i101), objArr17);
                                java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr17[0], java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr15);
                                try {
                                    int i105 = -android.graphics.Color.argb(0, 0, 0, 0);
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    b("졩절ꍄ鍿긽컳\uec31粼॒劄辧빌䪢ᇖ䴁￢诰흻૯㣤쵉隌쯩種ຬ嗞褘믳俶᭬䛖\uf4a8腃\uda8a", (i105 ^ 1) + ((i105 & 1) << 1), objArr18);
                                    java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr18[0]);
                                    int i106 = -(-android.view.View.resolveSizeAndState(0, 0, 0));
                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                    b("㲙㳪\ue9fd\ud9c1萰\ue4fd汃ﳒﶬᠠꖻ㹢빔孳", (i106 ^ 1) + ((i106 & 1) << 1), objArr19);
                                    java.lang.Object[] objArr20 = (java.lang.Object[]) cls5.getField((java.lang.String) objArr19[0]).get(invoke2);
                                    int length = objArr20.length;
                                    i5 = 0;
                                    ?? r0 = objArr20;
                                    while (i5 < length) {
                                        i6 = r0[i5];
                                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                                        b("㯾㮦腾넅胕\ue04a\ueadb稔望", -android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr21);
                                        try {
                                            java.lang.Object[] objArr22 = {(java.lang.String) objArr21[0]};
                                            char offsetAfter = (char) android.text.TextUtils.getOffsetAfter(str2, 0);
                                            int i107 = -(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                            int i108 = (i107 * (-661)) - 25118;
                                            int i109 = ~i107;
                                            int i110 = ~((i109 ^ (-39)) | (i109 & (-39)));
                                            int i111 = -(-(((i110 & i3) | (i3 ^ i110)) * 1324));
                                            int i112 = ~((i107 ^ i4) | (i107 & i4));
                                            int i113 = ~(i4 | 38);
                                            int i114 = (i108 & i111) + (i108 | i111) + (((i112 ^ i113) | (i112 & i113)) * (-1324));
                                            int i115 = ~(i109 | 38);
                                            int i116 = ~((i107 ^ (-39)) | (i107 & (-39)));
                                            int i117 = -(-(((i116 ^ i115) | (i115 & i116)) * 662));
                                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                                            c(offsetAfter, (i114 ^ i117) + ((i114 & i117) << 1), 92 - (android.os.Process.myTid() >> 22), objArr23);
                                            java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                                            int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
                                            int i118 = combineMeasuredStates * (-496);
                                            int i119 = ~combineMeasuredStates;
                                            int i120 = (i119 ^ (-2)) | (i119 & (-2));
                                            int i121 = ~((i120 & i4) | (i120 ^ i4));
                                            int i122 = (i3 ^ (-2)) | (i3 & (-2));
                                            int i123 = ~((i122 ^ combineMeasuredStates) | (i122 & combineMeasuredStates));
                                            java.lang.Object obj2 = r0;
                                            int i124 = (((i118 | (-496)) << 1) - (i118 ^ (-496))) + ((~i120) * 497) + (((i121 ^ i123) | (i121 & i123)) * 497);
                                            int i125 = ~((i119 ^ i3) | (i119 & i3));
                                            int i126 = ~(i119 | 1);
                                            int i127 = combineMeasuredStates | (-2);
                                            int i128 = ((i125 & i126) | (i125 ^ i126) | (~((i127 ^ i4) | (i127 & i4)))) * 497;
                                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                                            b("זֱ\ue48e풾횩뙷ྎ鼸쓬ᕔ\uf723嶼蜐嘐㖞", (i124 & i128) + (i124 | i128), objArr24);
                                            java.lang.Object invoke3 = cls6.getMethod((java.lang.String) objArr24[0], java.lang.String.class).invoke(null, objArr22);
                                            try {
                                                char c3 = (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                                int i129 = -(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                int i130 = (i129 * (-1529)) - 21392;
                                                int i131 = ~i129;
                                                int i132 = i131 | (-29);
                                                int i133 = ~((i132 & i3) | (i132 ^ i3));
                                                int i134 = (i131 ^ 28) | (i131 & 28);
                                                int i135 = ~((i134 & i4) | (i134 ^ i4));
                                                int i136 = (i133 & i135) | (i133 ^ i135);
                                                int i137 = (i129 ^ (-29)) | (i129 & (-29));
                                                int i138 = ~((i137 & i4) | (i137 ^ i4));
                                                int i139 = -(-(((i136 & i138) | (i136 ^ i138)) * 765));
                                                int i140 = ((i130 | i139) << 1) - (i130 ^ i139);
                                                int i141 = -(-(((~((i131 ^ (-29)) | (i131 & (-29)))) | (~((i131 ^ i3) | (i131 & i3)))) * 1530));
                                                int i142 = ~((i131 & i4) | (i131 ^ i4));
                                                int i143 = (i3 ^ (-29)) | (i3 & (-29));
                                                int i144 = ~((i129 ^ i143) | (i129 & i143));
                                                int lastIndexOf = android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                int i145 = lastIndexOf * 399;
                                                int i146 = length;
                                                int i147 = ~lastIndexOf;
                                                int i148 = i5;
                                                int i149 = ~(lastIndexOf | (-131));
                                                java.lang.Object[] objArr25 = objArr;
                                                int i150 = -(-(((~(i4 | (-131))) | (~(i147 | 130)) | i149) * 398));
                                                int i151 = ~((i3 & (-131)) | (i3 ^ (-131)));
                                                int i152 = ~((i147 ^ 130) | (i147 & 130));
                                                int i153 = (i151 ^ i152) | (i152 & i151);
                                                int i154 = -(-(((i153 ^ i149) | (i149 & i153)) * 398));
                                                try {
                                                    java.lang.Object[] objArr26 = new java.lang.Object[1];
                                                    c(c3, (i140 ^ i141) + ((i141 & i140) << 1) + (((i142 & i144) | (i144 ^ i142)) * 765), ((((((51870 ^ i145) + ((51870 & i145) << 1)) - (~i150)) - 1) + ((lastIndexOf | 130) * (-1194))) - (~i154)) - 1, objArr26);
                                                    java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr26[0]);
                                                    java.lang.Object[] objArr27 = new java.lang.Object[1];
                                                    b("祳礇럸蟂㞴坜\udc2f䲩롓䘴ᘋ踎ﮩդ풟", 1 - android.graphics.Color.alpha(0), objArr27);
                                                    try {
                                                        try {
                                                            java.lang.Object[] objArr28 = {new java.io.ByteArrayInputStream((byte[]) cls7.getMethod((java.lang.String) objArr27[0], null).invoke(i6, null))};
                                                            int i155 = -android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                            int i156 = i155 * (-432);
                                                            int i157 = (i156 ^ (-434)) + ((i156 & (-434)) << 1);
                                                            int i158 = ~i155;
                                                            int i159 = (i158 ^ i3) | (i158 & i3);
                                                            int i160 = (~(i159 | (~i159))) * 433;
                                                            int i161 = (i157 & i160) + (i157 | i160);
                                                            int i162 = (i158 | i3) * (-433);
                                                            int i163 = (i161 ^ i162) + ((i162 & i161) << 1);
                                                            i5 = i;
                                                            int i164 = ~((i158 ^ i5) | (i158 & i5));
                                                            int i165 = ~(i155 | i158);
                                                            int i166 = -(-(((i165 ^ i164) | (i165 & i164)) * 433));
                                                            char c4 = (char) ((i163 ^ i166) + ((i166 & i163) << 1));
                                                            try {
                                                                int offsetAfter2 = android.text.TextUtils.getOffsetAfter(str2, 0);
                                                                int i167 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                                int i168 = i167 * 371;
                                                                int i169 = (34132 & i168) + (i168 | 34132);
                                                                int i170 = ~i167;
                                                                int i171 = ((~((i3 ^ (-93)) | (i3 & (-93)))) | (~((i170 & i5) | (i170 ^ i5)))) * (-370);
                                                                int i172 = (i169 & i171) + (i169 | i171);
                                                                int i173 = ~((i170 ^ i3) | (i170 & i3));
                                                                int i174 = ~(i5 | (-93));
                                                                int i175 = (i173 ^ i174) | (i174 & i173);
                                                                int i176 = ~((i167 ^ 92) | (i167 & 92));
                                                                int i177 = -(-(((i175 ^ i176) | (i175 & i176)) * (-370)));
                                                                int i178 = ((i172 | i177) << 1) - (i177 ^ i172);
                                                                int i179 = -(-(i176 * com.knotapi.knot.utilities.Constants.ID_KROGER));
                                                                java.lang.Object[] objArr29 = new java.lang.Object[1];
                                                                c(c4, (offsetAfter2 & 37) + (offsetAfter2 | 37), (i178 & i179) + (i179 | i178), objArr29);
                                                                java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr29[0]);
                                                                char c5 = (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                int i180 = -((byte) android.view.KeyEvent.getModifierMetaStateMask());
                                                                int i181 = i180 * (-209);
                                                                int i182 = ~i180;
                                                                int i183 = ~((i3 ^ (-19)) | (i3 & (-19)));
                                                                int i184 = ~((i182 ^ i5) | (i182 & i5));
                                                                int i185 = -(-(((~((i180 ^ (-19)) | (i180 & (-19)) | i5)) | (~((i182 & i3) | (i182 ^ i3) | 18))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                                                                int i186 = -android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                                int i187 = i186 * (-716);
                                                                int i188 = (223860 & i187) + (i187 | 223860);
                                                                int i189 = ~i186;
                                                                int i190 = ((i189 & 156) | (i189 ^ 156)) * (-1434);
                                                                str = str2;
                                                                int i191 = ~((i3 & 156) | (i3 ^ 156));
                                                                int i192 = ~((i186 & 156) | (i186 ^ 156));
                                                                int i193 = (~(i189 | (-157) | i3)) | i192;
                                                                int i194 = i3;
                                                                int i195 = ~((i5 & 156) | (i5 ^ 156));
                                                                try {
                                                                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                                    c(c5, (((((((i181 | (-3762)) << 1) - (i181 ^ (-3762))) + ((~((i182 ^ (-19)) | (i182 & (-19)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)) - (~(((i183 ^ i184) | (i183 & i184)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))) - 1) - (~i185)) - 1, (((((i188 & i190) + (i190 | i188)) - (~(((~(((i189 & (-157)) | (i189 ^ (-157))) | i5)) | ((i191 ^ i192) | (i191 & i192))) * 717))) - 1) - (~(-(-(((i195 ^ i193) | (i193 & i195)) * 717))))) - 1, objArr30);
                                                                    java.lang.Object invoke4 = cls8.getMethod((java.lang.String) objArr30[0], java.io.InputStream.class).invoke(invoke3, objArr28);
                                                                    objArr = objArr25;
                                                                    try {
                                                                        int length2 = objArr.length;
                                                                        for (int i196 = 0; i196 < 2; i196++) {
                                                                            java.lang.Object obj3 = objArr[i196];
                                                                            i6 = 0;
                                                                            try {
                                                                                int i197 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                                                                int i198 = (i197 * (-464)) - 929;
                                                                                int i199 = ~i197;
                                                                                int i200 = i5 ^ 1;
                                                                                int i201 = (i5 & 1) | i200;
                                                                                int i202 = ~i201;
                                                                                int i203 = ((i202 ^ i199) | (i202 & i199)) * (-465);
                                                                                int i204 = (i198 ^ i203) + ((i198 & i203) << 1);
                                                                                int i205 = ~((i199 & i5) | (i199 ^ i5));
                                                                                int i206 = ((i205 ^ 1) | (i205 & 1)) * 930;
                                                                                java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                                                b("ⷷ\u2d9d画쪗酳\uf1af낪‴\uec8d\u0b79냨\ue29a꼪䠬版ꍹ湲軜㖶搴⣕콲\uf4a7⚽\ueb66౪똄\ue74aꩪ䊜禥꠴擝荫㣦檀✣쀳", (i204 ^ i206) + ((i206 & i204) << 1) + (((i199 & i201) | (i201 ^ i199)) * 465), objArr31);
                                                                                java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr31[0]);
                                                                                int i207 = -android.view.View.resolveSize(0, 0);
                                                                                int i208 = (i207 * 567) - 565;
                                                                                int i209 = ~i207;
                                                                                int i210 = ~((i209 ^ 1) | (i209 & 1));
                                                                                int i211 = ~((i209 & i5) | (i209 ^ i5));
                                                                                int i212 = -(-(((i210 ^ i211) | (i211 & i210)) * (-566)));
                                                                                int i213 = (i209 ^ (-2)) | (i209 & (-2));
                                                                                java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                                                b("אָרּ圗朧쒳ꑭ췼嵐㨎ꛜ\ue527鿊秤\ue59e➹\ude6e룣⍶恅\u1975︖拜ꄪ寚㷻ꆏ\ue391", (((((i208 | i212) << 1) - (i208 ^ i212)) - (~(-(-((~((i207 & (-2)) | (i207 ^ (-2)))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST))))) - 1) + ((~((i213 & i5) | (i213 ^ i5))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST), objArr32);
                                                                                i6 = 0;
                                                                                if (obj3.equals(cls9.getMethod((java.lang.String) objArr32[0], null).invoke(invoke4, null))) {
                                                                                    java.lang.Object[] objArr33 = {new int[]{i5}, new int[]{i200}, null, new int[1]};
                                                                                    try {
                                                                                        java.lang.Object[] objArr34 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((315343544 | i5) * (-859)) + 1653687520 + (((~(i194 | 315343544)) | (~((-655393) | i5))) * 859) + (((~(i194 | (-689585441))) | 688930048) * 859))};
                                                                                        try {
                                                                                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                                            if (obj4 == null) {
                                                                                                java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.KeyEvent.keyCodeFromString(str), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 2713, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                                                                byte b2 = $$a[3];
                                                                                                java.lang.Object[] objArr35 = new java.lang.Object[1];
                                                                                                a(b2, b2, b2, objArr35);
                                                                                                obj4 = cls10.getMethod((java.lang.String) objArr35[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                                                                                            }
                                                                                            ((int[]) objArr33[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr34)).intValue();
                                                                                            return objArr33;
                                                                                        } catch (java.lang.Throwable th2) {
                                                                                            th = th2;
                                                                                            java.lang.Throwable cause3 = th.getCause();
                                                                                            if (cause3 != null) {
                                                                                                throw cause3;
                                                                                            }
                                                                                            throw th;
                                                                                        }
                                                                                    } catch (java.lang.Throwable th3) {
                                                                                        th = th3;
                                                                                    }
                                                                                }
                                                                            } catch (java.lang.Throwable th4) {
                                                                                java.lang.Throwable cause4 = th4.getCause();
                                                                                if (cause4 != null) {
                                                                                    throw cause4;
                                                                                }
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                        int i214 = (i148 ^ 25) + ((i148 & 25) << 1);
                                                                        i4 = i5;
                                                                        length = i146;
                                                                        str2 = str;
                                                                        i3 = i194;
                                                                        i5 = (i214 | (-24)) + (i214 & (-24));
                                                                        r0 = obj2;
                                                                    } catch (java.lang.Throwable unused3) {
                                                                    }
                                                                } catch (java.lang.Throwable th5) {
                                                                    th = th5;
                                                                    cause = th.getCause();
                                                                    if (cause == null) {
                                                                        throw cause;
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (java.lang.Throwable th6) {
                                                                th = th6;
                                                                cause = th.getCause();
                                                                if (cause == null) {
                                                                }
                                                            }
                                                        } catch (java.lang.Throwable th7) {
                                                            th = th7;
                                                        }
                                                    } catch (java.lang.Throwable unused4) {
                                                        i5 = i;
                                                        str = str2;
                                                    }
                                                } catch (java.lang.Throwable th8) {
                                                    th = th8;
                                                    java.lang.Throwable cause5 = th.getCause();
                                                    if (cause5 != null) {
                                                        throw cause5;
                                                    }
                                                    throw th;
                                                }
                                            } catch (java.lang.Throwable th9) {
                                                th = th9;
                                            }
                                        } catch (java.lang.Throwable th10) {
                                            java.lang.Throwable cause6 = th10.getCause();
                                            if (cause6 != null) {
                                                throw cause6;
                                            }
                                            throw th10;
                                        }
                                    }
                                } catch (java.lang.Throwable unused5) {
                                }
                                i5 = i4;
                                str = str2;
                                i6 = -1347122530;
                                java.lang.Object[] objArr36 = {new int[]{i5}, new int[]{i5}, null, new int[1]};
                                ?? r2 = {java.lang.Integer.valueOf(i2), r17, java.lang.Integer.valueOf((((~((-115789433) | i5)) | 33607192) * (-283)) + 1925829728 + ((~(i5 | (-82182241))) * 283))};
                                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(i6);
                                if (obj5 == null) {
                                    java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2714 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                                    byte b3 = $$a[3];
                                    java.lang.Object[] objArr37 = new java.lang.Object[1];
                                    a(b3, b3, b3, objArr37);
                                    obj5 = cls11.getMethod((java.lang.String) objArr37[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(i6, obj5);
                                }
                                ((int[]) objArr36[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, r2)).intValue();
                                return objArr36;
                            } catch (java.lang.Throwable th11) {
                                th = th11;
                                java.lang.Throwable cause7 = th.getCause();
                                if (cause7 != null) {
                                    throw cause7;
                                }
                                throw th;
                            }
                        } catch (java.lang.Throwable th12) {
                            th = th12;
                        }
                    } catch (java.lang.Throwable th13) {
                        java.lang.Throwable cause8 = th13.getCause();
                        if (cause8 != null) {
                            throw cause8;
                        }
                        throw th13;
                    }
                } catch (java.lang.Throwable th14) {
                    java.lang.Throwable cause9 = th14.getCause();
                    if (cause9 != null) {
                        throw cause9;
                    }
                    throw th14;
                }
            } catch (java.lang.Throwable th15) {
                java.lang.Throwable cause10 = th15.getCause();
                if (cause10 != null) {
                    throw cause10;
                }
                throw th15;
            }
        } catch (java.lang.Throwable th16) {
            java.lang.Throwable cause11 = th16.getCause();
            if (cause11 != null) {
                throw cause11;
            }
            throw th16;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return values(new java.lang.Object[]{this, coroutineScope, continuation}, -1903504091, 1903504092, java.lang.System.identityHashCode(this));
    }

    private java.lang.Object writeReplace(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return values(new java.lang.Object[]{this, coroutineScope, continuation}, -110286211, 110286214, java.lang.System.identityHashCode(this));
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return (kotlin.coroutines.Continuation) values(new java.lang.Object[]{this, obj, continuation}, -1690142198, 1690142198, java.lang.System.identityHashCode(this));
    }

    static void init$1() {
        $$d = new byte[]{46, -52, 83, 98};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        return values(new java.lang.Object[]{this, obj}, 1806223652, -1806223650, java.lang.System.identityHashCode(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setLayoutTransitionK8096$DigitizedCardProfile(java.lang.Object obj, android.content.Context context, kotlin.coroutines.Continuation<? super com.payair.hce.setLayoutTransitionK8096$DigitizedCardProfile> continuation) {
        super(2, continuation);
        this.AlternateContactlessPaymentDataJson = obj;
        this.writeReplace = context;
    }

    static void init$0() {
        $$a = new byte[]{125, 17, -56, 0, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE;
    }
}
