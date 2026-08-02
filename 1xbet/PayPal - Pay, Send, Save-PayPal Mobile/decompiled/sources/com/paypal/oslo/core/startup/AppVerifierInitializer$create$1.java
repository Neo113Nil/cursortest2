package com.paypal.oslo.core.startup;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.startup.AppVerifierInitializer$create$1", f = "AppVerifierInitializer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class AppVerifierInitializer$create$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private static int Camera2StreamConfigurationMap;
    private static byte[] getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private static int getHighSpeedVideoSizesFor;
    private static int getInputFormats;
    private static short[] getOutputFormats;
    int getHighResolutionOutputSizeshNQ4ISI;
    private static final byte[] $$c = {48, 87, 118, 14};
    private static final int $$f = 67;
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$g(short s, short s2, short s3) {
        int i;
        int i2;
        int i3 = 4 - (s * 2);
        int i4 = s2 * 3;
        byte[] bArr = $$c;
        int i5 = s3 + 104;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i3;
            i5 = i6;
            i = 0;
            int i8 = i3;
            i5 += -i7;
            i2 = i8 + 1;
            bArr2[i] = (byte) i5;
            if (i == i6) {
                return new java.lang.String(bArr2, 0);
            }
            i++;
            i7 = bArr[i2];
            i8 = i2;
            i5 += -i7;
            i2 = i8 + 1;
            bArr2[i] = (byte) i5;
            if (i == i6) {
            }
        } else {
            i = 0;
            i2 = i3;
            bArr2[i] = (byte) i5;
            if (i == i6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, short s2, java.lang.Object[] objArr) {
        int i;
        int i2 = (b * 36) + 67;
        byte[] bArr = $$a;
        int i3 = s2 + 4;
        byte[] bArr2 = new byte[35 - s];
        int i4 = 34 - s;
        if (bArr == null) {
            int i5 = i4;
            int i6 = i3;
            int i7 = 0;
            int i8 = i3 + i5 + 1;
            i = i7;
            i3 = i6 + 1;
            i2 = i8;
            bArr2[i] = (byte) i2;
            i7 = i + 1;
            if (i == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i5 = bArr[i3];
            int i9 = i3;
            i3 = i2;
            i6 = i9;
            int i82 = i3 + i5 + 1;
            i = i7;
            i3 = i6 + 1;
            i2 = i82;
            bArr2[i] = (byte) i2;
            i7 = i + 1;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            i7 = i + 1;
            if (i == i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$d;
        int i3 = 435 - s2;
        int i4 = (s * 4) + 67;
        byte[] bArr2 = new byte[112 - i];
        int i5 = 111 - i;
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i4 = i4 + i6 + 1;
            i3++;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i3];
            i4 = i4 + i6 + 1;
            i3++;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, int i3, byte b, short s, java.lang.Object[] objArr) {
        long j;
        int length;
        byte[] bArr;
        int i4 = 2 % 2;
        o.accessartificialFrame accessartificialframe = new o.accessartificialFrame();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(Camera2StreamConfigurationMap)};
            java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(2136818323);
            if (Camera2StreamConfigurationMap2 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12847), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 451, android.text.TextUtils.indexOf("", "") + 17, -497187949, false, $$g(b2, b3, b3), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr2)).intValue();
            int i5 = intValue == -1 ? 1 : 0;
            if (i5 != 0) {
                byte[] bArr2 = getHighSpeedVideoFpsRanges;
                if (bArr2 != null) {
                    int i6 = $10 + 79;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    for (int i7 = 0; i7 < length; i7++) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr2[i7])};
                        java.lang.Object Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(1025865855);
                        if (Camera2StreamConfigurationMap3 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), 305 - android.text.TextUtils.indexOf("", "", 0), (android.os.Process.myPid() >> 22) + 18, -1608140417, false, $$g(b4, b5, (byte) (b5 + 1)), new java.lang.Class[]{java.lang.Integer.TYPE});
                        }
                        bArr[i7] = ((java.lang.Byte) ((java.lang.reflect.Method) Camera2StreamConfigurationMap3).invoke(null, objArr3)).byteValue();
                    }
                    bArr2 = bArr;
                }
                if (bArr2 == null) {
                    j = -7452648645728967921L;
                    intValue = (short) (((short) (getOutputFormats[i3 + ((int) (getHighSpeedVideoFpsRangesFor ^ (-7452648645728967921L)))] ^ (-7452648645728967921L))) + ((int) (Camera2StreamConfigurationMap ^ (-7452648645728967921L))));
                    if (intValue > 0) {
                        accessartificialframe.getHighSpeedVideoSizes = ((i3 + intValue) - 2) + ((int) (getHighSpeedVideoFpsRangesFor ^ j)) + i5;
                        java.lang.Object[] objArr4 = {accessartificialframe, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(getHighSpeedVideoSizes), sb};
                        java.lang.Object Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-146048967);
                        if (Camera2StreamConfigurationMap4 == null) {
                            Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 19 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.view.View.MeasureSpec.getSize(0) + 23, 1783347513, false, "l", new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class});
                        }
                        ((java.lang.StringBuilder) ((java.lang.reflect.Method) Camera2StreamConfigurationMap4).invoke(null, objArr4)).append(accessartificialframe.Camera2StreamConfigurationMap);
                        accessartificialframe.getHighSpeedVideoFpsRanges = accessartificialframe.Camera2StreamConfigurationMap;
                        byte[] bArr3 = getHighSpeedVideoFpsRanges;
                        if (bArr3 != null) {
                            int length2 = bArr3.length;
                            byte[] bArr4 = new byte[length2];
                            for (int i8 = 0; i8 < length2; i8++) {
                                int i9 = $10 + 37;
                                $11 = i9 % 128;
                                int i10 = i9 % 2;
                                bArr4[i8] = (byte) (bArr3[i8] ^ (-7452648645728967921L));
                            }
                            bArr3 = bArr4;
                        }
                        boolean z = bArr3 != null;
                        accessartificialframe.getHighResolutionOutputSizeshNQ4ISI = 1;
                        while (accessartificialframe.getHighResolutionOutputSizeshNQ4ISI < intValue) {
                            if (z) {
                                byte[] bArr5 = getHighSpeedVideoFpsRanges;
                                accessartificialframe.getHighSpeedVideoSizes = accessartificialframe.getHighSpeedVideoSizes - 1;
                                accessartificialframe.Camera2StreamConfigurationMap = (char) (accessartificialframe.getHighSpeedVideoFpsRanges + (((byte) (((byte) (bArr5[r7] ^ (-7452648645728967921L))) + s)) ^ b));
                            } else {
                                short[] sArr = getOutputFormats;
                                accessartificialframe.getHighSpeedVideoSizes = accessartificialframe.getHighSpeedVideoSizes - 1;
                                accessartificialframe.Camera2StreamConfigurationMap = (char) (accessartificialframe.getHighSpeedVideoFpsRanges + (((short) (((short) (sArr[r7] ^ (-7452648645728967921L))) + s)) ^ b));
                            }
                            sb.append(accessartificialframe.Camera2StreamConfigurationMap);
                            accessartificialframe.getHighSpeedVideoFpsRanges = accessartificialframe.Camera2StreamConfigurationMap;
                            accessartificialframe.getHighResolutionOutputSizeshNQ4ISI++;
                            int i11 = $11 + 35;
                            $10 = i11 % 128;
                            int i12 = i11 % 2;
                        }
                    }
                    objArr[0] = sb.toString();
                }
                byte[] bArr6 = getHighSpeedVideoFpsRanges;
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(getHighSpeedVideoFpsRangesFor)};
                java.lang.Object Camera2StreamConfigurationMap5 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(2136818323);
                if (Camera2StreamConfigurationMap5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    Camera2StreamConfigurationMap5 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (12847 - android.widget.ExpandableListView.getPackedPositionChild(0L)), 451 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), android.graphics.Color.argb(0, 0, 0, 0) + 17, -497187949, false, $$g(b6, b7, b7), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                intValue = (byte) (((byte) (bArr6[((java.lang.Integer) ((java.lang.reflect.Method) Camera2StreamConfigurationMap5).invoke(null, objArr5)).intValue()] ^ (-7452648645728967921L))) + ((int) (Camera2StreamConfigurationMap ^ (-7452648645728967921L))));
            }
            j = -7452648645728967921L;
            if (intValue > 0) {
            }
            objArr[0] = sb.toString();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object[] objArr;
        int i = 2 % 2;
        int i2 = getInputFormats + 43;
        getHighSpeedVideoSizesFor = i2 % 128;
        int i3 = i2 % 2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(731836519);
        if (Camera2StreamConfigurationMap2 == null) {
            char lastIndexOf = (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1);
            int red = 278 - android.graphics.Color.red(0);
            int green = 9 - android.graphics.Color.green(0);
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[17]);
            byte b2 = bArr[207];
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            b(b, b2, (short) (b2 | 86), objArr2);
            Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(lastIndexOf, red, green, -1231146649, false, (java.lang.String) objArr2[0], null);
        }
        long j = ((java.lang.reflect.Field) Camera2StreamConfigurationMap2).getLong(null);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 1108960154, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 13, (-198087169) - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (byte) android.widget.ExpandableListView.getPackedPositionGroup(0L), (short) (android.os.Process.getGidForName("") + 1), objArr3);
        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(1108960158 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (-14) - android.text.TextUtils.getCapsMode("", 0, 0), android.graphics.Color.alpha(0) - 198087147, (byte) android.graphics.Color.blue(0), (short) android.graphics.Color.red(0), objArr4);
        long longValue = ((java.lang.Long) cls.getDeclaredMethod((java.lang.String) objArr4[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(502617754);
        if (Camera2StreamConfigurationMap3 == null) {
            char modifierMetaStateMask = (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()));
            int resolveOpacity = 278 - android.graphics.drawable.Drawable.resolveOpacity(0, 0);
            int mirror = '9' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            byte[] bArr2 = $$a;
            byte b3 = bArr2[9];
            byte b4 = bArr2[207];
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b(b3, b4, (short) (b4 | org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE), objArr5);
            Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(modifierMetaStateMask, resolveOpacity, mirror, -2131388518, false, (java.lang.String) objArr5[0], null);
        }
        if (j == ((longValue - ((((java.lang.reflect.Field) Camera2StreamConfigurationMap3).getLong(null) << 52) >>> 52)) >> 12)) {
            java.lang.Object Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(1238876676);
            if (Camera2StreamConfigurationMap4 == null) {
                char indexOf = (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1);
                int tapTimeout = (android.view.ViewConfiguration.getTapTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE;
                int scrollBarSize = (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 9;
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b((byte) (-$$a[17]), r1[9], r1[3], objArr6);
                Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(indexOf, tapTimeout, scrollBarSize, -724106492, false, (java.lang.String) objArr6[0], null);
            }
            java.lang.Object[] objArr7 = (java.lang.Object[]) ((java.lang.reflect.Field) Camera2StreamConfigurationMap4).get(null);
            objArr = new java.lang.Object[]{new int[]{r6}, new int[1], r0, new int[]{r7}};
            int i4 = ((int[]) objArr7[0])[0];
            int i5 = ((int[]) objArr7[3])[0];
            java.lang.String[] strArr = (java.lang.String[]) objArr7[2];
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i6 = ~identityHashCode;
            int i7 = 985139316 + ((1571273718 | i6) * (-369)) + (((~((-346274295) | i6)) | 1502063380) * (-369)) + (((~(identityHashCode | 346274294)) | 1224999424 | (~(i6 | (-69210339)))) * 369) + 83454731;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
        } else {
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            a(1108960153 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 14, (-198087101) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (byte) android.graphics.Color.blue(0), (short) android.text.TextUtils.getTrimmedLength(""), objArr8);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            a(1108960155 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 15, (-198087074) - android.graphics.Color.green(0), (byte) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (short) android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr9);
            android.content.Context context = (android.content.Context) cls2.getMethod((java.lang.String) objArr9[0], new java.lang.Class[0]).invoke(null, null);
            if (context != null) {
                if ((!(context instanceof android.content.ContextWrapper)) || ((android.content.ContextWrapper) context).getBaseContext() != null) {
                    context = context.getApplicationContext();
                    int i10 = getInputFormats + 45;
                    getHighSpeedVideoSizesFor = i10 % 128;
                    int i11 = i10 % 2;
                } else {
                    context = null;
                }
            }
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            a((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1108960163, (android.view.KeyEvent.getMaxKeyCode() >> 16) - 14, (-198087131) - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) android.view.View.resolveSizeAndState(0, 0, 0), (short) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr10);
            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr10[0]);
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            a(1108960162 - android.view.View.MeasureSpec.getSize(0), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 14, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) - 198087116, (byte) (android.view.ViewConfiguration.getEdgeSlop() >> 16), (short) android.view.KeyEvent.getDeadChar(0, 0), objArr11);
            try {
                java.lang.Object[] objArr12 = {context, java.lang.Integer.valueOf(((java.lang.Integer) cls3.getMethod((java.lang.String) objArr11[0], java.lang.Object.class).invoke(null, this)).intValue()), 0, 83454731};
                byte[] bArr3 = $$d;
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                c(bArr3[377], bArr3[23], bArr3[22], objArr13);
                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr13[0]);
                byte b5 = bArr3[23];
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                c(b5, (short) (b5 | 139), (byte) ($$e - 4), objArr14);
                objArr = (java.lang.Object[]) cls4.getMethod((java.lang.String) objArr14[0], android.content.Context.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr12);
                java.lang.Object Camera2StreamConfigurationMap5 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(1238876676);
                if (Camera2StreamConfigurationMap5 == null) {
                    int modifierMetaStateMask2 = 277 - ((byte) android.view.KeyEvent.getModifierMetaStateMask());
                    int normalizeMetaState = android.view.KeyEvent.normalizeMetaState(0) + 9;
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    b((byte) (-$$a[17]), r11[9], r11[3], objArr15);
                    Camera2StreamConfigurationMap5 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), modifierMetaStateMask2, normalizeMetaState, -724106492, false, (java.lang.String) objArr15[0], null);
                }
                ((java.lang.reflect.Field) Camera2StreamConfigurationMap5).set(null, objArr);
                try {
                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                    a(1108960153 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 14, (-198087169) - android.text.TextUtils.indexOf("", ""), (byte) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (short) android.view.View.getDefaultSize(0, 0), objArr16);
                    java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr16[0]);
                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                    a((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 1108960158, (-13) - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), android.graphics.Color.alpha(0) - 198087147, (byte) android.graphics.Color.blue(0), (short) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr17);
                    long longValue2 = ((java.lang.Long) cls5.getDeclaredMethod((java.lang.String) objArr17[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Long valueOf = java.lang.Long.valueOf(longValue2);
                    java.lang.Object Camera2StreamConfigurationMap6 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(502617754);
                    if (Camera2StreamConfigurationMap6 == null) {
                        char lastIndexOf2 = (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
                        int defaultSize = 278 - android.view.View.getDefaultSize(0, 0);
                        int i12 = 10 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        byte[] bArr4 = $$a;
                        byte b6 = bArr4[9];
                        byte b7 = bArr4[207];
                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                        b(b6, b7, (short) (b7 | org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE), objArr18);
                        Camera2StreamConfigurationMap6 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(lastIndexOf2, defaultSize, i12, -2131388518, false, (java.lang.String) objArr18[0], null);
                    }
                    ((java.lang.reflect.Field) Camera2StreamConfigurationMap6).set(null, valueOf);
                    java.lang.Long valueOf2 = java.lang.Long.valueOf(longValue2 >> 12);
                    java.lang.Object Camera2StreamConfigurationMap7 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(731836519);
                    if (Camera2StreamConfigurationMap7 == null) {
                        char mode = (char) android.view.View.MeasureSpec.getMode(0);
                        int normalizeMetaState2 = android.view.KeyEvent.normalizeMetaState(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE;
                        int makeMeasureSpec = 9 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                        byte[] bArr5 = $$a;
                        byte b8 = (byte) (-bArr5[17]);
                        byte b9 = bArr5[207];
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        b(b8, b9, (short) (b9 | 86), objArr19);
                        Camera2StreamConfigurationMap7 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(mode, normalizeMetaState2, makeMeasureSpec, -1231146649, false, (java.lang.String) objArr19[0], null);
                    }
                    ((java.lang.reflect.Field) Camera2StreamConfigurationMap7).set(null, valueOf2);
                } catch (java.lang.Exception unused) {
                    throw new java.lang.RuntimeException();
                }
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i13 = ((int[]) objArr[3])[0];
        int i14 = ((int[]) objArr[0])[0];
        if (i14 != i13) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String[] strArr2 = (java.lang.String[]) objArr[2];
            if (strArr2 != null) {
                for (java.lang.String str : strArr2) {
                    arrayList.add(str);
                }
            }
            throw new java.lang.RuntimeException(java.lang.String.valueOf(i14));
        }
        java.lang.Object[] objArr20 = {new int[]{r6}, new int[1], r1, new int[]{r3}};
        int i15 = ((int[]) objArr[1])[0];
        int i16 = ((int[]) objArr[0])[0];
        int i17 = ((int[]) objArr[3])[0];
        java.lang.String[] strArr3 = (java.lang.String[]) objArr[2];
        int identityHashCode2 = java.lang.System.identityHashCode(this);
        int i18 = ~identityHashCode2;
        int i19 = i15 + 246885514 + ((629695584 | i18) * (-192)) + (((~((-1214349470) | i18)) | 4292621) * (-384)) + (((~(identityHashCode2 | 1844045053)) | (~(i18 | (-1210056849))) | (~((-4292622) | identityHashCode2))) * 192);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr20[1])[0] = i21 ^ (i21 << 5);
        int i22 = getHighSpeedVideoSizesFor + 77;
        getInputFormats = i22 % 128;
        int i23 = i22 % 2;
        if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            new com.paypal.oslo.core.startup.AppVerifier().run();
            return kotlin.Unit.INSTANCE;
        }
        int i24 = ((int[]) objArr20[1])[0];
        int i25 = i24 * i24;
        int i26 = -(729463610 * i24);
        int i27 = ((((i25 | i26) << 1) - (i25 ^ i26)) - (~(-(i24 * (-1659959392))))) - 1335310232;
        int i28 = i27 >> 19;
        int i29 = (((i28 ^ (-16383)) + ((i28 & (-16383)) << 1)) / 8192) + 1;
        int i30 = (i27 ^ i29) + ((i29 & i27) << 1);
        int i31 = i27 >> 17;
        int i32 = (((-65535) ^ i31) + ((i31 & (-65535)) << 1)) / 32768;
        int i33 = -(i30 ^ ((i32 & 1) + (i32 | 1)));
        int i34 = (i33 ^ 7) + ((i33 & 7) << 1);
        int i35 = i34 >> 28;
        int i36 = ((i35 & (-31)) + (i35 | (-31))) / 16;
        int i37 = (i36 & 1) + (i36 | 1);
        throw new java.lang.IllegalStateException("0/6/call to 'resume' before 'invoke' with coroutine".substring(46956 / (((-((i37 ^ 1) + ((i37 & 1) << 1))) & i34) * 1677)));
    }

    private java.lang.Object Camera2StreamConfigurationMap(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        java.lang.Object[] objArr3;
        java.lang.Object[] objArr4;
        java.lang.Object[] objArr5;
        int i = 2 % 2;
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a(android.text.TextUtils.getTrimmedLength("") + 1108960154, (-14) - android.text.TextUtils.indexOf("", "", 0, 0), (-198087170) + (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (byte) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr6);
        java.lang.String str = (java.lang.String) objArr6[0];
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        a(1108960158 - android.text.TextUtils.getTrimmedLength(""), (-14) - android.text.TextUtils.indexOf("", ""), (-198087147) - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) android.view.KeyEvent.getDeadChar(0, 0), (short) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr7);
        java.lang.String str2 = (java.lang.String) objArr7[0];
        java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(689180979);
        if (Camera2StreamConfigurationMap2 == null) {
            char packedPositionGroup = (char) (45285 - android.widget.ExpandableListView.getPackedPositionGroup(0L));
            int indexOf = android.text.TextUtils.indexOf("", "", 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
            int argb = 3 - android.graphics.Color.argb(0, 0, 0, 0);
            byte[] bArr = $$a;
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            b(bArr[19], bArr[207], bArr[9], objArr8);
            Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(packedPositionGroup, indexOf, argb, -1273704397, false, (java.lang.String) objArr8[0], null);
        }
        long j = ((java.lang.reflect.Field) Camera2StreamConfigurationMap2).getLong(null);
        long longValue = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(647443489);
        if (Camera2StreamConfigurationMap3 == null) {
            char packedPositionGroup2 = (char) (45285 - android.widget.ExpandableListView.getPackedPositionGroup(0L));
            int resolveOpacity = 158 - android.graphics.drawable.Drawable.resolveOpacity(0, 0);
            int gidForName = android.os.Process.getGidForName("") + 4;
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            b((byte) (-$$a[17]), r11[9], r11[3], objArr9);
            Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(packedPositionGroup2, resolveOpacity, gidForName, -1147669215, false, (java.lang.String) objArr9[0], null);
        }
        if (j == ((longValue - ((((java.lang.reflect.Field) Camera2StreamConfigurationMap3).getLong(null) << 52) >>> 52)) >> 12)) {
            java.lang.Object Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1276379401);
            if (Camera2StreamConfigurationMap4 == null) {
                char c = (char) (45286 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                int edgeSlop = (android.view.ViewConfiguration.getEdgeSlop() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                int offsetBefore = android.text.TextUtils.getOffsetBefore("", 0) + 3;
                byte[] bArr2 = $$a;
                byte b = bArr2[9];
                byte b2 = bArr2[207];
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                b(b, b2, (short) (b2 | org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE), objArr10);
                Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(c, edgeSlop, offsetBefore, 787169271, false, (java.lang.String) objArr10[0], null);
            }
            java.lang.Object[] objArr11 = (java.lang.Object[]) ((java.lang.reflect.Field) Camera2StreamConfigurationMap4).get(null);
            objArr = new java.lang.Object[]{r7, new int[]{r15}, new int[]{r14}, new int[1]};
            int i2 = ((int[]) objArr11[2])[0];
            int i3 = ((int[]) objArr11[1])[0];
            java.lang.String[] strArr = (java.lang.String[]) objArr11[0];
            int i4 = (((((~((-981877479) | r10)) | 948174916) * (-283)) - 1228534324) + ((~(android.os.Process.myTid() | (-33702563))) * 283)) - 2054666115;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[3])[0] = i6 ^ (i6 << 5);
        } else {
            java.lang.Object[] objArr12 = new java.lang.Object[1];
            a(android.text.TextUtils.getCapsMode("", 0, 0) + 1108960163, (-14) - android.view.View.combineMeasuredStates(0, 0), (-198087132) - android.graphics.Color.green(0), (byte) android.text.TextUtils.indexOf("", ""), (short) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr12);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr12[0]);
            java.lang.Object[] objArr13 = new java.lang.Object[1];
            a(1108960162 - android.graphics.Color.blue(0), (-14) - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (-198087117) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) android.view.Gravity.getAbsoluteGravity(0, 0), (short) android.text.TextUtils.indexOf("", "", 0, 0), objArr13);
            try {
                java.lang.Object[] objArr14 = {java.lang.Integer.valueOf(((java.lang.Integer) cls.getMethod((java.lang.String) objArr13[0], java.lang.Object.class).invoke(null, this)).intValue()), 0, -2054666115};
                byte[] bArr3 = $$d;
                byte b3 = bArr3[377];
                java.lang.Object[] objArr15 = new java.lang.Object[1];
                c(b3, (short) (b3 | 423), bArr3[4], objArr15);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr15[0]);
                byte b4 = bArr3[119];
                java.lang.Object[] objArr16 = new java.lang.Object[1];
                c(b4, (short) (b4 | 322), (byte) ($$e - 4), objArr16);
                objArr = (java.lang.Object[]) cls2.getMethod((java.lang.String) objArr16[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr14);
                java.lang.Object Camera2StreamConfigurationMap5 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1276379401);
                if (Camera2StreamConfigurationMap5 == null) {
                    char myPid = (char) ((android.os.Process.myPid() >> 22) + 45285);
                    int i7 = (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 157;
                    int green = 3 - android.graphics.Color.green(0);
                    byte[] bArr4 = $$a;
                    byte b5 = bArr4[9];
                    byte b6 = bArr4[207];
                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                    b(b5, b6, (short) (b6 | org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE), objArr17);
                    Camera2StreamConfigurationMap5 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(myPid, i7, green, 787169271, false, (java.lang.String) objArr17[0], null);
                }
                ((java.lang.reflect.Field) Camera2StreamConfigurationMap5).set(null, objArr);
                try {
                    long longValue2 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Long valueOf = java.lang.Long.valueOf(longValue2);
                    java.lang.Object Camera2StreamConfigurationMap6 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(647443489);
                    if (Camera2StreamConfigurationMap6 == null) {
                        char lastIndexOf = (char) (45284 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
                        int i8 = 158 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int indexOf2 = 3 - android.text.TextUtils.indexOf("", "");
                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                        b((byte) (-$$a[17]), r15[9], r15[3], objArr18);
                        Camera2StreamConfigurationMap6 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(lastIndexOf, i8, indexOf2, -1147669215, false, (java.lang.String) objArr18[0], null);
                    }
                    ((java.lang.reflect.Field) Camera2StreamConfigurationMap6).set(null, valueOf);
                    java.lang.Long valueOf2 = java.lang.Long.valueOf(longValue2 >> 12);
                    java.lang.Object Camera2StreamConfigurationMap7 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(689180979);
                    if (Camera2StreamConfigurationMap7 == null) {
                        char rgb = (char) (android.graphics.Color.rgb(0, 0, 0) + 16822501);
                        int windowTouchSlop = 158 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                        int capsMode = 3 - android.text.TextUtils.getCapsMode("", 0, 0);
                        byte[] bArr5 = $$a;
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        b(bArr5[19], bArr5[207], bArr5[9], objArr19);
                        Camera2StreamConfigurationMap7 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(rgb, windowTouchSlop, capsMode, -1273704397, false, (java.lang.String) objArr19[0], null);
                    }
                    ((java.lang.reflect.Field) Camera2StreamConfigurationMap7).set(null, valueOf2);
                } catch (java.lang.Exception unused) {
                    throw new java.lang.RuntimeException();
                }
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i9 = ((int[]) objArr[1])[0];
        int i10 = ((int[]) objArr[2])[0];
        if (i10 == i9) {
            java.lang.Object[] objArr20 = {r11, new int[]{r10}, new int[]{r6}, new int[1]};
            int i11 = ((int[]) objArr[3])[0];
            int i12 = ((int[]) objArr[2])[0];
            int i13 = ((int[]) objArr[1])[0];
            java.lang.String[] strArr2 = (java.lang.String[]) objArr[0];
            int i14 = ~(((int) java.lang.Runtime.getRuntime().freeMemory()) | 821652586);
            int i15 = i11 + 765545720 + (((-199251511) | i14) * (-220)) + ((i14 | (-1006206591)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 1691816840;
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr20[3])[0] = i17 ^ (i17 << 5);
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String[] strArr3 = (java.lang.String[]) objArr[0];
            if (strArr3 != null) {
                for (java.lang.String str3 : strArr3) {
                    arrayList.add(str3);
                }
            }
            int[] iArr = new int[i10];
            int i18 = i10 - 1;
            iArr[i18] = 1;
            android.widget.Toast.makeText((android.content.Context) null, iArr[((i10 * i18) % 2) - 1], 1).show();
            java.lang.Object[] objArr21 = {r11, new int[]{r10}, new int[]{r6}, new int[1]};
            int i19 = ((int[]) objArr[3])[0];
            int i20 = ((int[]) objArr[2])[0];
            int i21 = ((int[]) objArr[1])[0];
            java.lang.String[] strArr4 = (java.lang.String[]) objArr[0];
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i22 = ~identityHashCode;
            int i23 = i19 + 2018745272 + ((identityHashCode | 757196170) * 140) + (((~(757196170 | i22)) | 43390996) * (-280)) + (((~(identityHashCode | (-43390997))) | (~(263707926 | i22)) | 536879240) * 140);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr21[3])[0] = i25 ^ (i25 << 5);
        }
        java.lang.Object Camera2StreamConfigurationMap8 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-222608060);
        if (Camera2StreamConfigurationMap8 == null) {
            char green2 = (char) (android.graphics.Color.green(0) + 22522);
            int pressedStateDuration = 266 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16);
            int windowTouchSlop2 = (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 12;
            byte[] bArr6 = $$a;
            byte b7 = (byte) (-bArr6[17]);
            byte b8 = bArr6[207];
            java.lang.Object[] objArr22 = new java.lang.Object[1];
            b(b7, b8, (short) (b8 | 86), objArr22);
            Camera2StreamConfigurationMap8 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(green2, pressedStateDuration, windowTouchSlop2, 1874560068, false, (java.lang.String) objArr22[0], null);
        }
        long j2 = ((java.lang.reflect.Field) Camera2StreamConfigurationMap8).getLong(null);
        long longValue3 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object Camera2StreamConfigurationMap9 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(284432097);
        if (Camera2StreamConfigurationMap9 == null) {
            char tapTimeout = (char) (22522 - (android.view.ViewConfiguration.getTapTimeout() >> 16));
            int i26 = 266 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int resolveOpacity2 = android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 12;
            java.lang.Object[] objArr23 = new java.lang.Object[1];
            b((byte) (-$$a[17]), r11[9], r11[3], objArr23);
            Camera2StreamConfigurationMap9 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(tapTimeout, i26, resolveOpacity2, -1913333791, false, (java.lang.String) objArr23[0], null);
        }
        if (j2 == ((longValue3 - ((((java.lang.reflect.Field) Camera2StreamConfigurationMap9).getLong(null) << 52) >>> 52)) >> 12)) {
            int i27 = getInputFormats + 67;
            getHighSpeedVideoSizesFor = i27 % 128;
            int i28 = i27 % 2;
            java.lang.Object Camera2StreamConfigurationMap10 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(1447285175);
            if (Camera2StreamConfigurationMap10 == null) {
                char minimumFlingVelocity = (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22522);
                int i29 = (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE;
                int size = 12 - android.view.View.MeasureSpec.getSize(0);
                byte[] bArr7 = $$a;
                byte b9 = bArr7[9];
                byte b10 = bArr7[207];
                java.lang.Object[] objArr24 = new java.lang.Object[1];
                b(b9, b10, (short) (b10 | org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE), objArr24);
                Camera2StreamConfigurationMap10 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(minimumFlingVelocity, i29, size, -884797257, false, (java.lang.String) objArr24[0], null);
            }
            java.lang.Object[] objArr25 = (java.lang.Object[]) ((java.lang.reflect.Field) Camera2StreamConfigurationMap10).get(null);
            objArr2 = new java.lang.Object[]{new int[1], new int[]{((int[]) objArr25[1])[0]}, new int[]{((int[]) objArr25[2])[0]}, (java.lang.String[]) objArr25[3]};
            int identityHashCode2 = java.lang.System.identityHashCode(this);
            int i30 = ~identityHashCode2;
            int i31 = (-1065473428) + (((~(i30 | 145891195)) | (~((-445667026) | i30)) | 302006400) * 464) + (((-143660626) | identityHashCode2) * (-464)) + (((~(identityHashCode2 | 145891195)) | 302006400) * 464) + 2026937542;
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr2[0])[0] = i33 ^ (i33 << 5);
        } else {
            java.lang.Object[] objArr26 = new java.lang.Object[1];
            a(1108960154 - android.text.TextUtils.getCapsMode("", 0, 0), (-14) - android.view.KeyEvent.keyCodeFromString(""), android.view.View.resolveSizeAndState(0, 0, 0) - 198087100, (byte) android.view.Gravity.getAbsoluteGravity(0, 0), (short) android.graphics.Color.argb(0, 0, 0, 0), objArr26);
            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr26[0]);
            java.lang.Object[] objArr27 = new java.lang.Object[1];
            a((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 1108960156, (-14) - android.text.TextUtils.getTrimmedLength(""), (-198087073) - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (byte) android.view.KeyEvent.keyCodeFromString(""), (short) (android.os.Process.myTid() >> 22), objArr27);
            android.content.Context context = (android.content.Context) cls3.getMethod((java.lang.String) objArr27[0], new java.lang.Class[0]).invoke(null, null);
            if (context != null) {
                int i34 = getHighSpeedVideoSizesFor + 109;
                getInputFormats = i34 % 128;
                int i35 = i34 % 2;
                context = ((context instanceof android.content.ContextWrapper) && ((android.content.ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext();
            }
            java.lang.Object[] objArr28 = new java.lang.Object[1];
            a((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1108960163, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) - 14, (android.os.Process.myPid() >> 22) - 198087132, (byte) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (short) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr28);
            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr28[0]);
            java.lang.Object[] objArr29 = new java.lang.Object[1];
            a(1108960162 - android.view.View.resolveSizeAndState(0, 0, 0), ((android.os.Process.getThreadPriority(0) + 20) >> 6) - 14, (-198087116) - android.view.View.combineMeasuredStates(0, 0), (byte) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (short) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), objArr29);
            java.lang.Object[] objArr30 = {context, java.lang.Integer.valueOf(((java.lang.Integer) cls4.getMethod((java.lang.String) objArr29[0], java.lang.Object.class).invoke(null, this)).intValue()), 32, 2026937542};
            byte[] bArr8 = $$d;
            byte b11 = bArr8[377];
            java.lang.Object[] objArr31 = new java.lang.Object[1];
            c(b11, (short) (b11 | 295), bArr8[128], objArr31);
            java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr31[0]);
            byte b12 = bArr8[119];
            java.lang.Object[] objArr32 = new java.lang.Object[1];
            c(b12, (short) (b12 | 196), (byte) ($$e + 3), objArr32);
            objArr2 = (java.lang.Object[]) cls5.getMethod((java.lang.String) objArr32[0], android.content.Context.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr30);
            if (context != null) {
                java.lang.Object Camera2StreamConfigurationMap11 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(1447285175);
                if (Camera2StreamConfigurationMap11 == null) {
                    char c2 = (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22521);
                    int normalizeMetaState = android.view.KeyEvent.normalizeMetaState(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE;
                    int modifierMetaStateMask = 11 - ((byte) android.view.KeyEvent.getModifierMetaStateMask());
                    byte[] bArr9 = $$a;
                    byte b13 = bArr9[9];
                    byte b14 = bArr9[207];
                    java.lang.Object[] objArr33 = new java.lang.Object[1];
                    b(b13, b14, (short) (b14 | org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE), objArr33);
                    Camera2StreamConfigurationMap11 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(c2, normalizeMetaState, modifierMetaStateMask, -884797257, false, (java.lang.String) objArr33[0], null);
                }
                ((java.lang.reflect.Field) Camera2StreamConfigurationMap11).set(null, objArr2);
                try {
                    long longValue4 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Long valueOf3 = java.lang.Long.valueOf(longValue4);
                    java.lang.Object Camera2StreamConfigurationMap12 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(284432097);
                    if (Camera2StreamConfigurationMap12 == null) {
                        char resolveOpacity3 = (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 22522);
                        int argb2 = android.graphics.Color.argb(0, 0, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE;
                        int indexOf3 = android.text.TextUtils.indexOf("", "", 0) + 12;
                        java.lang.Object[] objArr34 = new java.lang.Object[1];
                        b((byte) (-$$a[17]), r11[9], r11[3], objArr34);
                        Camera2StreamConfigurationMap12 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(resolveOpacity3, argb2, indexOf3, -1913333791, false, (java.lang.String) objArr34[0], null);
                    }
                    ((java.lang.reflect.Field) Camera2StreamConfigurationMap12).set(null, valueOf3);
                    java.lang.Long valueOf4 = java.lang.Long.valueOf(longValue4 >> 12);
                    java.lang.Object Camera2StreamConfigurationMap13 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-222608060);
                    if (Camera2StreamConfigurationMap13 == null) {
                        char alpha = (char) (22522 - android.graphics.Color.alpha(0));
                        int packedPositionGroup3 = android.widget.ExpandableListView.getPackedPositionGroup(0L) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE;
                        int resolveOpacity4 = 12 - android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                        byte[] bArr10 = $$a;
                        byte b15 = (byte) (-bArr10[17]);
                        byte b16 = bArr10[207];
                        java.lang.Object[] objArr35 = new java.lang.Object[1];
                        b(b15, b16, (short) (b16 | 86), objArr35);
                        Camera2StreamConfigurationMap13 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(alpha, packedPositionGroup3, resolveOpacity4, 1874560068, false, (java.lang.String) objArr35[0], null);
                    }
                    ((java.lang.reflect.Field) Camera2StreamConfigurationMap13).set(null, valueOf4);
                } catch (java.lang.Exception unused2) {
                    throw new java.lang.RuntimeException();
                }
            }
        }
        int i36 = ((int[]) objArr2[1])[0];
        int i37 = ((int[]) objArr2[2])[0];
        if (i37 == i36) {
            int i38 = ((int[]) objArr2[0])[0];
            java.lang.Object[] objArr36 = {new int[1], new int[]{((int[]) objArr2[1])[0]}, new int[]{((int[]) objArr2[2])[0]}, (java.lang.String[]) objArr2[3]};
            int identityHashCode3 = java.lang.System.identityHashCode(this);
            int i39 = ~identityHashCode3;
            int i40 = i38 + (-5974932) + (((~((-343264105) | i39)) | 71600736) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + ((~((-71600737) | identityHashCode3)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(identityHashCode3 | (-271663369))) | (~(i39 | (-248294117))) | 176693380) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
            int i41 = (i40 << 13) ^ i40;
            int i42 = i41 ^ (i41 >>> 17);
            ((int[]) objArr36[0])[0] = i42 ^ (i42 << 5);
        } else {
            int[] iArr2 = new int[i37];
            int i43 = i37 - 1;
            iArr2[i43] = 1;
            android.widget.Toast.makeText((android.content.Context) null, iArr2[((i37 * i43) % 2) - 1], 1).show();
            int i44 = ((int[]) objArr2[0])[0];
            java.lang.Object[] objArr37 = {new int[1], new int[]{((int[]) objArr2[1])[0]}, new int[]{((int[]) objArr2[2])[0]}, (java.lang.String[]) objArr2[3]};
            int identityHashCode4 = java.lang.System.identityHashCode(this);
            int i45 = i44 + 1503966892 + (((-456812865) | identityHashCode4) * 376) + (((~((~identityHashCode4) | 203689926)) | (-524185543)) * (-376)) + (((~(identityHashCode4 | (-203689927))) | 387868294) * 376);
            int i46 = (i45 << 13) ^ i45;
            int i47 = i46 ^ (i46 >>> 17);
            ((int[]) objArr37[0])[0] = i47 ^ (i47 << 5);
        }
        java.lang.Object Camera2StreamConfigurationMap14 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(618669683);
        if (Camera2StreamConfigurationMap14 == null) {
            char size2 = (char) (android.view.View.MeasureSpec.getSize(0) + 22522);
            int i48 = (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE;
            int i49 = 12 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            byte[] bArr11 = $$a;
            java.lang.Object[] objArr38 = new java.lang.Object[1];
            b(bArr11[19], bArr11[207], bArr11[9], objArr38);
            Camera2StreamConfigurationMap14 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(size2, i48, i49, -1176443021, false, (java.lang.String) objArr38[0], null);
        }
        long j3 = ((java.lang.reflect.Field) Camera2StreamConfigurationMap14).getLong(null);
        long longValue5 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object Camera2StreamConfigurationMap15 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1149194522);
        if (Camera2StreamConfigurationMap15 == null) {
            char c3 = (char) (22523 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
            int keyRepeatTimeout = (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE;
            int axisFromString = 11 - android.view.MotionEvent.axisFromString("");
            byte[] bArr12 = $$a;
            byte b17 = bArr12[28];
            byte b18 = bArr12[207];
            java.lang.Object[] objArr39 = new java.lang.Object[1];
            b(b17, b18, (short) (b18 | 114), objArr39);
            Camera2StreamConfigurationMap15 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(c3, keyRepeatTimeout, axisFromString, 645951462, false, (java.lang.String) objArr39[0], null);
        }
        if (j3 == ((longValue5 - ((((java.lang.reflect.Field) Camera2StreamConfigurationMap15).getLong(null) << 52) >>> 52)) >> 12)) {
            java.lang.Object Camera2StreamConfigurationMap16 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(796802629);
            if (Camera2StreamConfigurationMap16 == null) {
                char fadingEdgeLength = (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 22522);
                int jumpTapTimeout = 266 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                int bitsPerPixel = 11 - android.graphics.ImageFormat.getBitsPerPixel(0);
                byte[] bArr13 = $$a;
                java.lang.Object[] objArr40 = new java.lang.Object[1];
                b(bArr13[55], bArr13[207], (short) ($$b & 970), objArr40);
                Camera2StreamConfigurationMap16 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(fadingEdgeLength, jumpTapTimeout, bitsPerPixel, -1300299963, false, (java.lang.String) objArr40[0], null);
            }
            java.lang.Object[] objArr41 = (java.lang.Object[]) ((java.lang.reflect.Field) Camera2StreamConfigurationMap16).get(null);
            objArr3 = new java.lang.Object[]{new int[1], new int[]{((int[]) objArr41[1])[0]}, new int[]{((int[]) objArr41[2])[0]}, (java.lang.String[]) objArr41[3]};
            int identityHashCode5 = java.lang.System.identityHashCode(this);
            int i50 = ~identityHashCode5;
            int i51 = 1589178092 + (((~((-359861628) | i50)) | 88279121 | (~((-231696594) | i50))) * (-1136)) + (((~((-359861628) | identityHashCode5)) | (~((-231696594) | identityHashCode5)) | (~(503279099 | i50))) * (-568)) + (((~(identityHashCode5 | (-88279122))) | (~(i50 | 231696593)) | (~(359861627 | i50))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION) + 473798945;
            int i52 = (i51 << 13) ^ i51;
            int i53 = i52 ^ (i52 >>> 17);
            ((int[]) objArr3[0])[0] = i53 ^ (i53 << 5);
        } else {
            java.lang.Object[] objArr42 = new java.lang.Object[1];
            a(android.view.View.resolveSize(0, 0) + 1108960154, (-14) - (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.view.View.resolveSize(0, 0) - 198087100, (byte) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (short) (android.os.Process.myTid() >> 22), objArr42);
            java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr42[0]);
            java.lang.Object[] objArr43 = new java.lang.Object[1];
            a(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1108960157, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 14, (android.view.ViewConfiguration.getEdgeSlop() >> 16) - 198087074, (byte) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (short) android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr43);
            android.content.Context context2 = (android.content.Context) cls6.getMethod((java.lang.String) objArr43[0], new java.lang.Class[0]).invoke(null, null);
            if (context2 != null) {
                context2 = ((context2 instanceof android.content.ContextWrapper) && ((android.content.ContextWrapper) context2).getBaseContext() == null) ? null : context2.getApplicationContext();
            }
            java.lang.Object[] objArr44 = new java.lang.Object[1];
            a(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1108960164, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 13, (-198087132) - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (short) android.view.KeyEvent.normalizeMetaState(0), objArr44);
            java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr44[0]);
            java.lang.Object[] objArr45 = new java.lang.Object[1];
            a((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1108960162, (-15) - android.os.Process.getGidForName(""), (-198087117) - android.widget.ExpandableListView.getPackedPositionChild(0L), (byte) android.text.TextUtils.getTrimmedLength(""), (short) android.view.View.resolveSize(0, 0), objArr45);
            java.lang.Object[] objArr46 = {context2, java.lang.Integer.valueOf(((java.lang.Integer) cls7.getMethod((java.lang.String) objArr45[0], java.lang.Object.class).invoke(null, this)).intValue()), 473798945};
            byte[] bArr14 = $$d;
            byte b19 = bArr14[377];
            java.lang.Object[] objArr47 = new java.lang.Object[1];
            c(b19, (short) (b19 | 176), bArr14[499], objArr47);
            java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr47[0]);
            byte b20 = bArr14[23];
            java.lang.Object[] objArr48 = new java.lang.Object[1];
            c(b20, (short) (b20 | 139), (byte) ($$e - 4), objArr48);
            objArr3 = (java.lang.Object[]) cls8.getMethod((java.lang.String) objArr48[0], android.content.Context.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr46);
            if (context2 != null) {
                java.lang.Object Camera2StreamConfigurationMap17 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(796802629);
                if (Camera2StreamConfigurationMap17 == null) {
                    char minimumFlingVelocity2 = (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22522);
                    int indexOf4 = android.text.TextUtils.indexOf("", "") + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE;
                    int maximumDrawingCacheSize = (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12;
                    byte[] bArr15 = $$a;
                    java.lang.Object[] objArr49 = new java.lang.Object[1];
                    b(bArr15[55], bArr15[207], (short) ($$b & 970), objArr49);
                    Camera2StreamConfigurationMap17 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(minimumFlingVelocity2, indexOf4, maximumDrawingCacheSize, -1300299963, false, (java.lang.String) objArr49[0], null);
                }
                ((java.lang.reflect.Field) Camera2StreamConfigurationMap17).set(null, objArr3);
                try {
                    long longValue6 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Long valueOf5 = java.lang.Long.valueOf(longValue6);
                    java.lang.Object Camera2StreamConfigurationMap18 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1149194522);
                    if (Camera2StreamConfigurationMap18 == null) {
                        char c4 = (char) (22523 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        int i54 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE;
                        int threadPriority = 12 - ((android.os.Process.getThreadPriority(0) + 20) >> 6);
                        byte[] bArr16 = $$a;
                        byte b21 = bArr16[28];
                        byte b22 = bArr16[207];
                        java.lang.Object[] objArr50 = new java.lang.Object[1];
                        b(b21, b22, (short) (b22 | 114), objArr50);
                        Camera2StreamConfigurationMap18 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(c4, i54, threadPriority, 645951462, false, (java.lang.String) objArr50[0], null);
                    }
                    ((java.lang.reflect.Field) Camera2StreamConfigurationMap18).set(null, valueOf5);
                    java.lang.Long valueOf6 = java.lang.Long.valueOf(longValue6 >> 12);
                    java.lang.Object Camera2StreamConfigurationMap19 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(618669683);
                    if (Camera2StreamConfigurationMap19 == null) {
                        char resolveSize = (char) (android.view.View.resolveSize(0, 0) + 22522);
                        int keyRepeatTimeout2 = 266 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int myPid2 = (android.os.Process.myPid() >> 22) + 12;
                        byte[] bArr17 = $$a;
                        java.lang.Object[] objArr51 = new java.lang.Object[1];
                        b(bArr17[19], bArr17[207], bArr17[9], objArr51);
                        Camera2StreamConfigurationMap19 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(resolveSize, keyRepeatTimeout2, myPid2, -1176443021, false, (java.lang.String) objArr51[0], null);
                    }
                    ((java.lang.reflect.Field) Camera2StreamConfigurationMap19).set(null, valueOf6);
                } catch (java.lang.Exception unused3) {
                    throw new java.lang.RuntimeException();
                }
            }
        }
        if (((int[]) objArr3[2])[0] != ((int[]) objArr3[1])[0]) {
            throw null;
        }
        int i55 = getInputFormats + 33;
        getHighSpeedVideoSizesFor = i55 % 128;
        int i56 = i55 % 2;
        int i57 = ((int[]) objArr3[0])[0];
        java.lang.Object[] objArr52 = {new int[1], new int[]{((int[]) objArr3[1])[0]}, new int[]{((int[]) objArr3[2])[0]}, (java.lang.String[]) objArr3[3]};
        int startElapsedRealtime = (int) android.os.Process.getStartElapsedRealtime();
        int i58 = ~startElapsedRealtime;
        int i59 = (~((-103772928) | i58)) | 36466866;
        int i60 = ~(startElapsedRealtime | (-420479233));
        int i61 = i57 + 1668648206 + ((i59 | i60) * (-713)) + (i60 * 1426) + ((~((-487785294) | i58)) * 713);
        int i62 = (i61 << 13) ^ i61;
        int i63 = i62 ^ (i62 >>> 17);
        ((int[]) objArr52[0])[0] = i63 ^ (i63 << 5);
        int i64 = getInputFormats + 25;
        getHighSpeedVideoSizesFor = i64 % 128;
        int i65 = i64 % 2;
        com.paypal.oslo.core.startup.AppVerifierInitializer$create$1 appVerifierInitializer$create$1 = (com.paypal.oslo.core.startup.AppVerifierInitializer$create$1) create(coroutineScope, continuation);
        java.lang.Object Camera2StreamConfigurationMap20 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1776155663);
        if (Camera2StreamConfigurationMap20 == null) {
            char c5 = (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22521);
            int edgeSlop2 = (android.view.ViewConfiguration.getEdgeSlop() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE;
            int capsMode2 = 12 - android.text.TextUtils.getCapsMode("", 0, 0);
            byte[] bArr18 = $$a;
            byte b23 = (byte) (bArr18[30] - 1);
            byte b24 = bArr18[207];
            java.lang.Object[] objArr53 = new java.lang.Object[1];
            b(b23, b24, (short) (b24 | 150), objArr53);
            Camera2StreamConfigurationMap20 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(c5, edgeSlop2, capsMode2, 186827505, false, (java.lang.String) objArr53[0], null);
        }
        long j4 = ((java.lang.reflect.Field) Camera2StreamConfigurationMap20).getLong(null);
        long longValue7 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object Camera2StreamConfigurationMap21 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-81468972);
        if (Camera2StreamConfigurationMap21 == null) {
            char c6 = (char) (22522 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
            int i66 = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE;
            int resolveSizeAndState = android.view.View.resolveSizeAndState(0, 0, 0) + 12;
            byte[] bArr19 = $$a;
            byte b25 = (byte) (bArr19[30] - 1);
            byte b26 = bArr19[207];
            java.lang.Object[] objArr54 = new java.lang.Object[1];
            b(b25, b26, (short) (b26 | 174), objArr54);
            Camera2StreamConfigurationMap21 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(c6, i66, resolveSizeAndState, 1713643732, false, (java.lang.String) objArr54[0], null);
        }
        if (j4 == ((longValue7 - ((((java.lang.reflect.Field) Camera2StreamConfigurationMap21).getLong(null) << 52) >>> 52)) >> 12)) {
            int i67 = getInputFormats + 41;
            getHighSpeedVideoSizesFor = i67 % 128;
            int i68 = i67 % 2;
            java.lang.Object Camera2StreamConfigurationMap22 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1459255656);
            if (Camera2StreamConfigurationMap22 == null) {
                char packedPositionGroup4 = (char) (22522 - android.widget.ExpandableListView.getPackedPositionGroup(0L));
                int resolveSize2 = android.view.View.resolveSize(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE;
                int i69 = (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 11;
                byte[] bArr20 = $$a;
                byte b27 = (byte) (-bArr20[15]);
                byte b28 = bArr20[207];
                java.lang.Object[] objArr55 = new java.lang.Object[1];
                b(b27, b28, (short) (b28 | 198), objArr55);
                Camera2StreamConfigurationMap22 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(packedPositionGroup4, resolveSize2, i69, 872761240, false, (java.lang.String) objArr55[0], null);
            }
            java.lang.Object[] objArr56 = (java.lang.Object[]) ((java.lang.reflect.Field) Camera2StreamConfigurationMap22).get(null);
            objArr4 = new java.lang.Object[]{new int[1], new int[]{((int[]) objArr56[1])[0]}, new int[]{((int[]) objArr56[2])[0]}, (java.lang.String[]) objArr56[3]};
            int identityHashCode6 = java.lang.System.identityHashCode(this);
            int i70 = ((((-628302388) + (((~((-609261219) | (~identityHashCode6))) | (~((-17702998) | identityHashCode6))) * (-272))) + (((~((-1011996323) | identityHashCode6)) | 402735104) * (-272))) + (((~(identityHashCode6 | 1011996322)) | (-420438102)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE)) - 1645298918;
            int i71 = (i70 << 13) ^ i70;
            int i72 = i71 ^ (i71 >>> 17);
            ((int[]) objArr4[0])[0] = i72 ^ (i72 << 5);
        } else {
            java.lang.Object[] objArr57 = new java.lang.Object[1];
            a(1108960163 - android.view.Gravity.getAbsoluteGravity(0, 0), (-14) - android.view.KeyEvent.keyCodeFromString(""), (-198087133) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (byte) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (short) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), objArr57);
            java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr57[0]);
            java.lang.Object[] objArr58 = new java.lang.Object[1];
            a(1108960162 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (-14) - (android.view.ViewConfiguration.getTouchSlop() >> 8), (-198087116) - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) android.graphics.Color.blue(0), (short) (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr58);
            java.lang.Object[] objArr59 = {java.lang.Integer.valueOf(((java.lang.Integer) cls9.getMethod((java.lang.String) objArr58[0], java.lang.Object.class).invoke(null, this)).intValue()), -1645298918};
            byte[] bArr21 = $$d;
            byte b29 = bArr21[377];
            java.lang.Object[] objArr60 = new java.lang.Object[1];
            c(b29, (short) (b29 | 103), bArr21[23], objArr60);
            java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr60[0]);
            byte b30 = bArr21[119];
            java.lang.Object[] objArr61 = new java.lang.Object[1];
            c(b30, (short) (b30 | 196), (byte) ($$e + 3), objArr61);
            objArr4 = (java.lang.Object[]) cls10.getMethod((java.lang.String) objArr61[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr59);
            java.lang.Object Camera2StreamConfigurationMap23 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1459255656);
            if (Camera2StreamConfigurationMap23 == null) {
                char pressedStateDuration2 = (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 22522);
                int offsetBefore2 = android.text.TextUtils.getOffsetBefore("", 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE;
                int minimumFlingVelocity3 = 12 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
                byte[] bArr22 = $$a;
                byte b31 = (byte) (-bArr22[15]);
                byte b32 = bArr22[207];
                java.lang.Object[] objArr62 = new java.lang.Object[1];
                b(b31, b32, (short) (b32 | 198), objArr62);
                Camera2StreamConfigurationMap23 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(pressedStateDuration2, offsetBefore2, minimumFlingVelocity3, 872761240, false, (java.lang.String) objArr62[0], null);
            }
            ((java.lang.reflect.Field) Camera2StreamConfigurationMap23).set(null, objArr4);
            try {
                long longValue8 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                java.lang.Long valueOf7 = java.lang.Long.valueOf(longValue8);
                java.lang.Object Camera2StreamConfigurationMap24 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-81468972);
                if (Camera2StreamConfigurationMap24 == null) {
                    char threadPriority2 = (char) (22522 - ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                    int i73 = (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE;
                    int indexOf5 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 13;
                    byte[] bArr23 = $$a;
                    byte b33 = (byte) (bArr23[30] - 1);
                    byte b34 = bArr23[207];
                    java.lang.Object[] objArr63 = new java.lang.Object[1];
                    b(b33, b34, (short) (b34 | 174), objArr63);
                    Camera2StreamConfigurationMap24 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(threadPriority2, i73, indexOf5, 1713643732, false, (java.lang.String) objArr63[0], null);
                }
                ((java.lang.reflect.Field) Camera2StreamConfigurationMap24).set(null, valueOf7);
                java.lang.Long valueOf8 = java.lang.Long.valueOf(longValue8 >> 12);
                java.lang.Object Camera2StreamConfigurationMap25 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1776155663);
                if (Camera2StreamConfigurationMap25 == null) {
                    char myPid3 = (char) (22522 - (android.os.Process.myPid() >> 22));
                    int i74 = 267 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int green3 = android.graphics.Color.green(0) + 12;
                    byte[] bArr24 = $$a;
                    byte b35 = (byte) (bArr24[30] - 1);
                    byte b36 = bArr24[207];
                    java.lang.Object[] objArr64 = new java.lang.Object[1];
                    b(b35, b36, (short) (b36 | 150), objArr64);
                    Camera2StreamConfigurationMap25 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(myPid3, i74, green3, 186827505, false, (java.lang.String) objArr64[0], null);
                }
                ((java.lang.reflect.Field) Camera2StreamConfigurationMap25).set(null, valueOf8);
            } catch (java.lang.Exception unused4) {
                throw new java.lang.RuntimeException();
            }
        }
        int i75 = ((int[]) objArr4[1])[0];
        int i76 = ((int[]) objArr4[2])[0];
        if (i76 == i75) {
            int i77 = ((int[]) objArr4[0])[0];
            java.lang.Object[] objArr65 = {new int[1], new int[]{((int[]) objArr4[1])[0]}, new int[]{((int[]) objArr4[2])[0]}, (java.lang.String[]) objArr4[3]};
            int i78 = ~java.lang.System.identityHashCode(this);
            int i79 = i77 + (-1678019188) + (((~((-817048135) | i78)) | 225489913) * (-933)) + (((~(i78 | 225489913)) | (-1039383552)) * 933) + 1280513853;
            int i80 = (i79 << 13) ^ i79;
            int i81 = i80 ^ (i80 >>> 17);
            ((int[]) objArr65[0])[0] = i81 ^ (i81 << 5);
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.String[] strArr5 = (java.lang.String[]) objArr4[3];
            if (strArr5 != null) {
                for (java.lang.String str4 : strArr5) {
                    arrayList2.add(str4);
                }
            }
            android.widget.Toast.makeText((android.content.Context) null, i76 / (((i76 - 1) * i76) % 2), 0).show();
            int i82 = ((int[]) objArr4[0])[0];
            java.lang.Object[] objArr66 = {new int[1], new int[]{((int[]) objArr4[1])[0]}, new int[]{((int[]) objArr4[2])[0]}, (java.lang.String[]) objArr4[3]};
            int identityHashCode7 = java.lang.System.identityHashCode(this);
            int i83 = ~identityHashCode7;
            int i84 = i82 + 1251964996 + (((~((-133075961) | i83)) | (~((-458482261) | identityHashCode7))) * 1900) + (((~(i83 | 458482260)) | (~(identityHashCode7 | 133075960))) * (-950)) + (((~(identityHashCode7 | 458482260)) | (~(i83 | 133075960))) * 950);
            int i85 = (i84 << 13) ^ i84;
            int i86 = i85 ^ (i85 >>> 17);
            ((int[]) objArr66[0])[0] = i86 ^ (i86 << 5);
        }
        java.lang.Object invokeSuspend = appVerifierInitializer$create$1.invokeSuspend(kotlin.Unit.INSTANCE);
        java.lang.Object Camera2StreamConfigurationMap26 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1078037408);
        if (Camera2StreamConfigurationMap26 == null) {
            char scrollDefaultDelay = (char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 35581);
            int packedPositionType = 191 - android.widget.ExpandableListView.getPackedPositionType(0L);
            int myTid = (android.os.Process.myTid() >> 22) + 3;
            java.lang.Object[] objArr67 = new java.lang.Object[1];
            b((byte) (-$$a[17]), r7[9], r7[3], objArr67);
            Camera2StreamConfigurationMap26 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(scrollDefaultDelay, packedPositionType, myTid, 582923616, false, (java.lang.String) objArr67[0], null);
        }
        long j5 = ((java.lang.reflect.Field) Camera2StreamConfigurationMap26).getLong(null);
        long longValue9 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object Camera2StreamConfigurationMap27 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1257835961);
        if (Camera2StreamConfigurationMap27 == null) {
            char argb3 = (char) (35581 - android.graphics.Color.argb(0, 0, 0, 0));
            int minimumFlingVelocity4 = 191 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int i87 = (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2;
            byte[] bArr25 = $$a;
            byte b37 = bArr25[28];
            byte b38 = bArr25[207];
            java.lang.Object[] objArr68 = new java.lang.Object[1];
            b(b37, b38, (short) (b38 | 114), objArr68);
            Camera2StreamConfigurationMap27 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(argb3, minimumFlingVelocity4, i87, 671494983, false, (java.lang.String) objArr68[0], null);
        }
        if (j5 == ((longValue9 - ((((java.lang.reflect.Field) Camera2StreamConfigurationMap27).getLong(null) << 52) >>> 52)) >> 12)) {
            java.lang.Object Camera2StreamConfigurationMap28 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(659280886);
            if (Camera2StreamConfigurationMap28 == null) {
                char c7 = (char) (35581 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                int lastIndexOf2 = 190 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                int deadChar = android.view.KeyEvent.getDeadChar(0, 0) + 3;
                byte[] bArr26 = $$a;
                byte b39 = bArr26[9];
                byte b40 = bArr26[207];
                java.lang.Object[] objArr69 = new java.lang.Object[1];
                b(b39, b40, (short) (b40 | org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE), objArr69);
                Camera2StreamConfigurationMap28 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(c7, lastIndexOf2, deadChar, -1169485066, false, (java.lang.String) objArr69[0], null);
            }
            java.lang.Object[] objArr70 = (java.lang.Object[]) ((java.lang.reflect.Field) Camera2StreamConfigurationMap28).get(null);
            objArr5 = new java.lang.Object[]{new int[]{r7}, new java.lang.String[0], new int[]{r3}, new int[1]};
            int i88 = ((int[]) objArr70[0])[0];
            int i89 = ((int[]) objArr70[2])[0];
            int nextInt = new java.util.Random().nextInt();
            int i90 = ~nextInt;
            int i91 = (((502006737 + ((51950857 | i90) * (-192))) + (((~((-683999749) | i90)) | 134545412) * (-384))) + (((~(nextInt | 735950605)) | ((~(i90 | (-549454337))) | (~((-134545413) | nextInt)))) * 192)) - 776959979;
            int i92 = (i91 << 13) ^ i91;
            int i93 = i92 ^ (i92 >>> 17);
            ((int[]) objArr5[3])[0] = i93 ^ (i93 << 5);
        } else {
            try {
                java.lang.Object Camera2StreamConfigurationMap29 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(79423557);
                if (Camera2StreamConfigurationMap29 == null) {
                    Camera2StreamConfigurationMap29 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (56531 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), 395 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16, -1715787451, false, null, new java.lang.Class[0]);
                }
                java.lang.Object[] objArr71 = {null, ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap29).newInstance(null), -776959979, 32};
                java.lang.Object Camera2StreamConfigurationMap30 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1316530122);
                if (Camera2StreamConfigurationMap30 == null) {
                    char packedPositionChild = (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 35582);
                    int myPid4 = (android.os.Process.myPid() >> 22) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE;
                    int bitsPerPixel2 = 2 - android.graphics.ImageFormat.getBitsPerPixel(0);
                    byte[] bArr27 = $$a;
                    java.lang.Object[] objArr72 = new java.lang.Object[1];
                    b(bArr27[19], bArr27[207], bArr27[9], objArr72);
                    Camera2StreamConfigurationMap30 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(packedPositionChild, myPid4, bitsPerPixel2, 747084086, false, (java.lang.String) objArr72[0], new java.lang.Class[]{(java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)), 242 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 33 - (android.os.Process.myPid() >> 22)), (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) (21299 - android.text.TextUtils.getCapsMode("", 0, 0)), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 227, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 39), java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                java.lang.Object[] objArr73 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap30).invoke(null, objArr71);
                java.lang.Object Camera2StreamConfigurationMap31 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(659280886);
                if (Camera2StreamConfigurationMap31 == null) {
                    char indexOf6 = (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 35582);
                    int tapTimeout2 = 191 - (android.view.ViewConfiguration.getTapTimeout() >> 16);
                    int absoluteGravity = 3 - android.view.Gravity.getAbsoluteGravity(0, 0);
                    byte[] bArr28 = $$a;
                    byte b41 = bArr28[9];
                    byte b42 = bArr28[207];
                    java.lang.Object[] objArr74 = new java.lang.Object[1];
                    b(b41, b42, (short) (b42 | org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE), objArr74);
                    Camera2StreamConfigurationMap31 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(indexOf6, tapTimeout2, absoluteGravity, -1169485066, false, (java.lang.String) objArr74[0], null);
                }
                ((java.lang.reflect.Field) Camera2StreamConfigurationMap31).set(null, objArr73);
                try {
                    long longValue10 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Long valueOf9 = java.lang.Long.valueOf(longValue10);
                    java.lang.Object Camera2StreamConfigurationMap32 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1257835961);
                    if (Camera2StreamConfigurationMap32 == null) {
                        char myPid5 = (char) ((android.os.Process.myPid() >> 22) + 35581);
                        int indexOf7 = 191 - android.text.TextUtils.indexOf("", "", 0);
                        int indexOf8 = 2 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                        byte[] bArr29 = $$a;
                        byte b43 = bArr29[28];
                        byte b44 = bArr29[207];
                        java.lang.Object[] objArr75 = new java.lang.Object[1];
                        b(b43, b44, (short) (b44 | 114), objArr75);
                        Camera2StreamConfigurationMap32 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(myPid5, indexOf7, indexOf8, 671494983, false, (java.lang.String) objArr75[0], null);
                    }
                    ((java.lang.reflect.Field) Camera2StreamConfigurationMap32).set(null, valueOf9);
                    java.lang.Long valueOf10 = java.lang.Long.valueOf(longValue10 >> 12);
                    java.lang.Object Camera2StreamConfigurationMap33 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1078037408);
                    if (Camera2StreamConfigurationMap33 == null) {
                        char c8 = (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 35580);
                        int i94 = (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE;
                        int fadingEdgeLength2 = 3 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
                        byte[] bArr30 = $$a;
                        byte b45 = (byte) (-bArr30[17]);
                        byte b46 = bArr30[9];
                        short s = bArr30[3];
                        java.lang.Object[] objArr76 = new java.lang.Object[1];
                        b(b45, b46, s, objArr76);
                        Camera2StreamConfigurationMap33 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(c8, i94, fadingEdgeLength2, 582923616, false, (java.lang.String) objArr76[0], null);
                    }
                    ((java.lang.reflect.Field) Camera2StreamConfigurationMap33).set(null, valueOf10);
                    objArr5 = objArr73;
                } catch (java.lang.Exception unused5) {
                    throw new java.lang.RuntimeException();
                }
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        if (((int[]) objArr5[0])[0] != ((int[]) objArr5[2])[0]) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.String[] strArr6 = (java.lang.String[]) objArr5[1];
            if (strArr6 != null) {
                int i95 = getInputFormats + 107;
                getHighSpeedVideoSizesFor = i95 % 128;
                int i96 = i95 % 2;
                for (java.lang.String str5 : strArr6) {
                    int i97 = getHighSpeedVideoSizesFor + 111;
                    getInputFormats = i97 % 128;
                    int i98 = i97 % 2;
                    arrayList3.add(str5);
                }
            }
            throw null;
        }
        int i99 = getHighSpeedVideoSizesFor + 63;
        getInputFormats = i99 % 128;
        int i100 = i99 % 2;
        java.lang.Object[] objArr77 = {new int[]{r8}, new java.lang.String[0], new int[]{r3}, new int[1]};
        int i101 = ((int[]) objArr5[3])[0];
        int i102 = ((int[]) objArr5[0])[0];
        int i103 = ((int[]) objArr5[2])[0];
        int elapsedRealtime = (int) android.os.SystemClock.elapsedRealtime();
        int i104 = ~elapsedRealtime;
        int i105 = i101 + 1995117408 + (((~((-336136213) | i104)) | (~((-173024417) | elapsedRealtime)) | (~((-25199178) | elapsedRealtime))) * 765) + (((~((-509160629) | i104)) | 336136212) * 1530) + (((~(elapsedRealtime | (-509160629))) | (~(i104 | (-25199178)))) * 765);
        int i106 = (i105 << 13) ^ i105;
        int i107 = i106 ^ (i106 >>> 17);
        ((int[]) objArr77[3])[0] = i107 ^ (i107 << 5);
        return invokeSuspend;
    }

    static {
        byte[] bArr = new byte[528];
        java.lang.System.arraycopy("_\u0099ÁÈ\u000býÀAð\u0017öð\nÁ@\u0003ø\u0002¾7þû\u0012\u0000üòÈ3þ\nô\fô\u0001ÈFóÄ@þù\u0006ü÷ÿ\u0000\u000eì\u0007\u0002\u0006º\u001e'ö\u0007ô\u0006ûøâ&ü÷\u000eÎ,\u0004ÿúýå\u0014üÿ\u000eÖ(¯ÿ 2ûð\fûò\næ%ô\u0005óü\u000eôùè\u0014\u000bô\u0001üÕý\u000eÓ ý\u0000ê\u001côÿþñ\u0012ú\u0000\tÖ)\u0002Þ\u000e\føý\rÒ(\u0002\u000býÀ:\u0004ø\u0007¾Dð\u0006Â2\fõ\rüùúÉF\u0002µ7þû\u0012\u0000üòÈDð\u0006ó\u0001\u0013þó\u0006\u0002ö\u0010æ\u0012ô\u0005þ¿$\u0010\u0006Õ3þó\u0006\u0002ö\u0010æ\u0012ô\u0005þç\u0012û\u0011Õ!ô\u0000\u0006Ü#\u0002û·Kþ\u0003\u0000Ì3þó\u0006\u0002ö\u0010æ\u0012ô\u0005þµ\fý\u000eÓ ý\u0000ê\u001côÿþñ\u0012ú\u0000\tã\u0015\u0010ê\r\u000býÀKê\u000eÿ÷øÈDð\u0006Â4\u000b\u0002òÈFýñ\f»\u0014+\u0005ø\u0005ý\u0006É+ô\u0000¾\u001e+ý\u0002ð\fú\u0005þ\u001d\u000b÷\fîÐ  ýòû\u000bÕ+þ÷\u0002ý\rüî\u0012ô\u0005þÞ\u0013\u000e\u000býÀKê\u000eÿ÷øÈDð\u0006Â7þû\u0012\u0000üòÈEì\u000e\u0003ú\u0000ð\u0017´FóÄEô\u0006ÿø\u0004øÆ\u00141ý\u0000úýâ\u0014\fð\u0001\b\u0005ì\u0005ýî\u0014\u0006ÿø\u0004øÞ+î\u0005\u0005÷\b\u0005¯Nüôý\u0005÷\n·ÿD\u0004ýü\u0004öþ¿Qòû\u0011Õ!ô\u0000\u0006\u0006°?\u0000\u0000ú\u0013ö\u0007¯\f\u000býÀAð\u0017öð\nÁ@\u0003ø\u0002¾7þû\u0012\u0000üòÈ:ú\u0000\b\u0005ô\n\u0004´=\u0002÷\u0001\u0004¿\u001a\u001a\u0000\b\u0005ô\n\u0004Ú\u001aûù\bá!ü\u0006òú\u0000\fÖ#\u0002û·Bý\u000eà\u001dñ\fÎ!ÿ\u0001\rÿà\u001aûù\bè\u0011\nóè#ï\u000fï¾\u000f".getBytes("ISO-8859-1"), 0, bArr, 0, 528);
        $$d = bArr;
        $$e = 87;
        $$a = new byte[]{com.google.common.base.Ascii.GS, 122, 56, com.google.common.base.Ascii.EM, -3, 14, -45, 32, -3, 0, -22, com.google.common.base.Ascii.FS, -12, -1, -2, -15, 18, -6, 0, 9, -42, 41, 2, -34, 14, com.google.common.base.Ascii.FF, -8, -3, 13, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.VT, -9, com.google.common.base.Ascii.FF, -18, -48, 32, 32, -3, -14, -5, com.google.common.base.Ascii.VT, -43, 43, -2, -9, 2, -3, 13, -4, -18, 18, -12, 5, -2, -34, 19, 14, -3, 14, -45, 32, -3, 0, -23, 18, 13, -5, -4, 8, -2, -12, 5, -2, -32, 37, -2, -5, 4, -2, -34, com.google.common.base.Ascii.NAK, 16, -22, 13, -12, -27, 2, -30, com.google.common.base.Ascii.DC4, 9, -11, -3, 14, -45, 32, -3, 0, -22, com.google.common.base.Ascii.FS, -12, -1, -2, -15, 18, -6, 0, 9, -42, 41, 2, -34, 14, com.google.common.base.Ascii.FF, -8, -3, 13, -46, 40, 2, -3, 14, -45, 32, -3, 0, -22, com.google.common.base.Ascii.FS, -12, -1, -2, -15, 18, -6, 0, 9, -29, com.google.common.base.Ascii.NAK, 16, -22, 13, -3, 14, -38, 37, -2, -5, 4, -2, -47, 40, 2, -6, -13, 18, -2, -3, 14, -45, 32, -3, 0, -22, com.google.common.base.Ascii.FS, -12, -1, -2, -15, 18, -6, 0, 9, -29, com.google.common.base.Ascii.NAK, 16, -22, 13, -46, 40, 2, -3, 14, -38, 37, -2, -5, 4, -2, -40, com.google.common.base.Ascii.ESC, 4, -41, 43, -18, com.google.common.base.Ascii.VT, -9, -34, 48, -4, -18, 18, -12, 5, -2, -3, 14, -44, 36, 1, 4, -2, -34, com.google.common.base.Ascii.NAK, 16, -22, 13, -12, -27, 2, -30, com.google.common.base.Ascii.DC4, 9, -11};
        $$b = 188;
        getHighSpeedVideoSizesFor = 0;
        getInputFormats = 1;
        getHighSpeedVideoFpsRangesFor = -397807346;
        Camera2StreamConfigurationMap = -477666558;
        getHighSpeedVideoSizes = 1583480776;
        getHighSpeedVideoFpsRanges = new byte[]{6, 7, -5, com.google.common.base.Ascii.FF, 38, -39, 7, -2, 14, -11, 41, 42, -76, com.google.common.base.Ascii.VT, 78, -59, -12, -11, -14, 1, -7, 2, 13, -9, com.google.common.base.Ascii.VT, -6, 7, 4, -13, com.google.common.base.Ascii.FS, -31, com.visa.cbp.getEncExpo.onUnminimized, -3, com.google.common.base.Ascii.FF, 0, -6, 8, com.google.common.base.Ascii.FF, 7, -2, 14, -11, 41, 42, -56, -10, 2, -6, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -62, -28, com.google.common.base.Ascii.SUB, -8, com.google.common.base.Ascii.FF, 14, -6, 35, -44, -6, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SYN, com.visa.cbp.getEncExpo.startTransaction, 10, 4, -6, 9, 6, 14, -12, 2, com.google.common.base.Ascii.FF, -13, -4, 5, com.google.common.base.Ascii.ESC, -44, 10, 4, -4, 2, -6, com.google.common.base.Ascii.RS, 45, com.google.common.base.Ascii.FS, -79, com.google.common.base.Ascii.SI, 0, 60, -59, -12, -11, -14, 1, -7, 2, 10, com.visa.cbp.getEncExpo.onUnminimized, 9, -6, com.google.common.base.Ascii.FS, -15, -11, -14, -13, com.google.common.base.Ascii.SI, 32, -62, 9, 6, -4, com.google.common.base.Ascii.SI, -14, com.google.common.base.Ascii.GS};
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        int i = 2 % 2;
        int i2 = getHighSpeedVideoSizesFor + 51;
        getInputFormats = i2 % 128;
        kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
        kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2 = continuation;
        if (i2 % 2 != 0) {
            return Camera2StreamConfigurationMap(coroutineScope2, continuation2);
        }
        Camera2StreamConfigurationMap(coroutineScope2, continuation2);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        int i = 2 % 2;
        com.paypal.oslo.core.startup.AppVerifierInitializer$create$1 appVerifierInitializer$create$1 = new com.paypal.oslo.core.startup.AppVerifierInitializer$create$1(continuation);
        int i2 = getInputFormats + 63;
        getHighSpeedVideoSizesFor = i2 % 128;
        int i3 = i2 % 2;
        return appVerifierInitializer$create$1;
    }

    AppVerifierInitializer$create$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.core.startup.AppVerifierInitializer$create$1> continuation) {
        super(2, continuation);
    }
}
