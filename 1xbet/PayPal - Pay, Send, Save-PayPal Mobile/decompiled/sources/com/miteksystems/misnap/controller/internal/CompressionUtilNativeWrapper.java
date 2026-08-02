package com.miteksystems.misnap.controller.internal;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J`\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\rH\u0082 ¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u0015\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/miteksystems/misnap/controller/internal/CompressionUtilNativeWrapper;", "", "<init>", "()V", "Lcom/miteksystems/misnap/core/Frame;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "", com.daon.sdk.face.license.License.FEATURE_QUALITY, "", "isAiBasedRtsEnabled", "", "Landroid/graphics/Rect;", "redactionRects", "", "Lorg/apache/commons/imaging/formats/tiff/taginfos/TagInfo;", "", "metadata", "map", "Lcom/miteksystems/misnap/controller/MiSnapController$Container;", "process", "(Lcom/miteksystems/misnap/core/Frame;IZLjava/util/List;Ljava/util/Map;Ljava/util/Map;)Lcom/miteksystems/misnap/controller/MiSnapController$Container;", "a", "()Z", "Lcom/miteksystems/misnap/core/MiSnapSettings;", "settings", "Lcom/miteksystems/misnap/controller/a/b0;", "result", "Landroid/content/Context;", "applicationContext", "(Lcom/miteksystems/misnap/core/Frame;Lcom/miteksystems/misnap/core/MiSnapSettings;Lcom/miteksystems/misnap/controller/a/b0;Landroid/content/Context;)Lcom/miteksystems/misnap/controller/MiSnapController$Container;", "Camera2StreamConfigurationMap", "Ljava/lang/Object;", "FrameWrapper"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class CompressionUtilNativeWrapper {
    private final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();
    private static final byte[] $$d = {46, 32, 85, 72, -1, -18, 41, -36, -1, -4, 19, -22, -17, 1, 0, -12, -2, 8, -9, -2, com.google.common.base.Ascii.FS, -41, -2, 1, -8, -2, com.google.common.base.Ascii.RS, -25, -20, 18, -17, 8, com.google.common.base.Ascii.ETB, -6, com.google.common.base.Ascii.SUB, -24, -13, 7};
    private static final int $$e = 7;
    private static final byte[] $$a = {com.google.common.base.Ascii.GS, -87, -11, 106, -6, -42, 5, 5, 4, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, 41, 40, -2, com.google.common.base.Ascii.VT, -6, 9, -3, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, com.google.common.base.Ascii.SUB, 46, -6, com.google.common.base.Ascii.ETB, 5, -34, 40, -9, 8, 6, 18, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, 42, 38, 3, -4, 10, -2, 3, com.google.common.base.Ascii.DC4, -29, 40, -2, com.google.common.base.Ascii.VT, -6, 9, -3, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, com.google.common.base.Ascii.SUB, 46, -6, com.google.common.base.Ascii.ETB, 5, 3, com.google.common.base.Ascii.DC4, -44, 46, -6, com.google.common.base.Ascii.ETB, 5, -34, 40, -9, 8, 6, 18, 8, -9, 8, -19, 34, -2, com.google.common.base.Ascii.NAK, -12, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, 8, -9, 8, -19, 34, -2, com.google.common.base.Ascii.NAK, -12, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT};
    private static final int $$b = 104;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, byte b2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = b + 4;
        byte[] bArr = $$a;
        int i4 = 21 - b2;
        int i5 = 110 - s;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i5;
            i5 = i4;
            i2 = 0;
            i5 = (i5 + i6) - 5;
            i = i2;
            i3++;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i3];
            i5 = (i5 + i6) - 5;
            i = i2;
            i3++;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            i3++;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, int i, short s, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = (s * 3) + 103;
        int i5 = 4 - (b * 4);
        byte[] bArr = $$d;
        int i6 = (i * 4) + 35;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i4 = (i7 + (-i4)) - 3;
            i5++;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = i4;
            i4 = bArr[i5];
            i4 = (i7 + (-i4)) - 3;
            i5++;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    private final native com.miteksystems.misnap.controller.MiSnapController.Container process(com.miteksystems.misnap.core.Frame frame, int quality, boolean isAiBasedRtsEnabled, java.util.List<android.graphics.Rect> redactionRects, java.util.Map<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo, java.lang.String> metadata, java.util.Map<java.lang.String, ? extends java.lang.Object> map);

    /* JADX WARN: Type inference failed for: r1v14, types: [boolean, int] */
    public final /* synthetic */ boolean a() {
        try {
            byte[] bArr = $$a;
            byte b = (byte) (bArr[16] + 1);
            byte b2 = (byte) (b + 1);
            java.lang.Object[] objArr = new java.lang.Object[1];
            b(b, b2, (byte) (b2 | com.google.common.base.Ascii.SI), objArr);
            java.lang.String str = (java.lang.String) objArr[0];
            java.lang.ClassLoader classLoader = com.miteksystems.misnap.controller.internal.CompressionUtilNativeWrapper.class.getClassLoader();
            try {
                java.lang.Object[] objArr2 = {-1395598504};
                java.lang.Object Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1284877627);
                if (Camera2StreamConfigurationMap == null) {
                    Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (android.graphics.Color.rgb(0, 0, 0) + 16777216), 349 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.getSize(0) + 10, 778736581, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                try {
                    java.lang.Object[] objArr3 = {str, classLoader, false, -561749975, ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap).newInstance(objArr2), -561749975};
                    java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-889779310);
                    if (Camera2StreamConfigurationMap2 == null) {
                        char resolveSizeAndState = (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 45285);
                        int i = (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                        int jumpTapTimeout = (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 3;
                        byte b3 = $$d[14];
                        byte b4 = b3;
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        c(b3, b4, b4, objArr4);
                        Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(resolveSizeAndState, i, jumpTapTimeout, 1475857042, false, (java.lang.String) objArr4[0], new java.lang.Class[]{java.lang.String.class, java.lang.ClassLoader.class, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) (android.view.View.combineMeasuredStates(0, 0) + 15771), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 104, android.graphics.Color.argb(0, 0, 0, 0) + 33), java.lang.Integer.TYPE});
                    }
                    java.lang.Object[] objArr5 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr3);
                    if (((int[]) objArr5[2])[0] != ((int[]) objArr5[1])[0]) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.String[] strArr = (java.lang.String[]) objArr5[0];
                        if (strArr != null) {
                            for (java.lang.String str2 : strArr) {
                                arrayList.add(str2);
                            }
                        }
                        throw new java.lang.NullPointerException();
                    }
                    java.lang.Object[] objArr6 = {r6, new int[]{r14}, new int[]{r13}, new int[1]};
                    int i2 = ((int[]) objArr5[3])[0];
                    int i3 = ((int[]) objArr5[2])[0];
                    int i4 = ((int[]) objArr5[1])[0];
                    java.lang.String[] strArr2 = (java.lang.String[]) objArr5[0];
                    int startElapsedRealtime = (int) android.os.Process.getStartElapsedRealtime();
                    int i5 = ~startElapsedRealtime;
                    int i6 = (~((-644976281) | i5)) | 538020496;
                    int i7 = ~(startElapsedRealtime | (-268972033));
                    int i8 = i2 + (-421069392) + ((i6 | i7) * (-713)) + (i7 * 1426) + ((~((-375927817) | i5)) * 713);
                    int i9 = (i8 << 13) ^ i8;
                    int i10 = i9 ^ (i9 >>> 17);
                    ((int[]) objArr6[3])[0] = i10 ^ (i10 << 5);
                    try {
                        byte b5 = bArr[8];
                        byte b6 = b5;
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b(b5, b6, b6, objArr7);
                        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr7[0]);
                        byte b7 = bArr[61];
                        byte b8 = bArr[8];
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        b(b7, b8, (byte) (b8 - 4), objArr8);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        b(bArr[19], bArr[8], bArr[6], objArr9);
                        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                        byte b9 = (byte) 55;
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        b(b9, (byte) (b9 & com.google.common.base.Ascii.SI), bArr[21], objArr10);
                        java.lang.Object invoke = cls.getMethod((java.lang.String) objArr10[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                        int i11 = $$b;
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        b((byte) (i11 & 464), bArr[8], bArr[43], objArr11);
                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                        byte b10 = (byte) (bArr[42] - 1);
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        b((byte) 78, b10, b10, objArr12);
                        java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr12[0], new java.lang.Class[0]).invoke(com.miteksystems.misnap.controller.internal.CompressionUtilNativeWrapper.class, new java.lang.Object[0]);
                        if (android.os.Build.VERSION.SDK_INT <= 24) {
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            b((byte) 91, (byte) (-bArr[16]), bArr[58], objArr13);
                            java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod((java.lang.String) objArr13[0], cls3, cls2);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(invoke, str, invoke2);
                        } else {
                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                            b((byte) (i11 - 3), (byte) (-bArr[16]), bArr[23], objArr14);
                            java.lang.reflect.Method declaredMethod2 = cls.getDeclaredMethod((java.lang.String) objArr14[0], cls2, cls3);
                            declaredMethod2.setAccessible(true);
                            declaredMethod2.invoke(invoke, invoke2, str);
                        }
                        int i12 = ((int[]) objArr6[3])[0];
                        int i13 = i12 * i12;
                        int i14 = -(565243753 * i12);
                        int i15 = ((((i13 | i14) << 1) - (i13 ^ i14)) - (~(-(i12 * (-1164027301))))) - 1;
                        int i16 = (i15 ^ (-552708220)) + (((-552708220) & i15) << 1);
                        int i17 = i16 >> 15;
                        int i18 = (((i17 ^ (-262143)) + ((i17 & (-262143)) << 1)) / 131072) + 1;
                        int i19 = (i16 ^ i18) + ((i16 & i18) << 1);
                        int i20 = i16 >> 17;
                        int i21 = ((i20 & (-65535)) + (i20 | (-65535))) / 32768;
                        int i22 = -(i19 ^ ((i21 ^ 1) + ((i21 & 1) << 1)));
                        int i23 = (i22 ^ 5) + ((i22 & 5) << 1);
                        int i24 = i23 >> 25;
                        int i25 = ((i24 & (-255)) + (i24 | (-255))) / 128;
                        int i26 = ((i25 | 1) << 1) - (i25 ^ 1);
                        return 1435 / (((-(((i26 | 1) << 1) - (i26 ^ 1))) & i23) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE);
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        java.lang.Throwable cause = e.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw e;
                    }
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause2 = th.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause3 = th2.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th2;
            }
        } catch (java.lang.UnsatisfiedLinkError unused) {
            return false;
        }
    }

    public final /* synthetic */ com.miteksystems.misnap.controller.MiSnapController.Container a(com.miteksystems.misnap.core.Frame frame, com.miteksystems.misnap.core.MiSnapSettings settings, com.miteksystems.misnap.controller.a.b0 result, android.content.Context applicationContext) {
        com.miteksystems.misnap.controller.MiSnapController.Container process;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frame, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext, "");
        synchronized (this.Camera2StreamConfigurationMap) {
            process = process(frame, com.miteksystems.misnap.controller.AnalysisSettings.getImageQuality(settings.analysis, settings.getUseCase()), com.miteksystems.misnap.controller.AnalysisSettings.shouldEnableAiBasedRts(settings.analysis, settings.getUseCase()), com.miteksystems.misnap.controller.a.w.a(result, settings) ? com.miteksystems.misnap.controller.a.w.a(result) : kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_USER_COMMENT, com.miteksystems.misnap.core.MibiData.toJsonString(applicationContext)), kotlin.TuplesKt.to(org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_DATE_TIME_ORIGINAL, com.miteksystems.misnap.core.DateUtil.getUtcDateFormat(com.miteksystems.misnap.core.DateUtil.ISO_DATE_FORMAT).format(new java.util.Date(com.miteksystems.misnap.core.DateUtil.getUtcCalendar().getTimeInMillis()))), kotlin.TuplesKt.to(com.miteksystems.misnap.core.ExifUtil.getEXIF_TAG_OFFSET_TIME_ORIGINAl(), "+00:00")), com.miteksystems.misnap.core.internal.ContextHelper.INSTANCE.get());
        }
        return process;
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J8\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0014"}, d2 = {"Lcom/miteksystems/misnap/controller/internal/CompressionUtilNativeWrapper$FrameWrapper;", "Lcom/miteksystems/misnap/core/Frame;", "Landroid/util/Size;", "imageSize", "", "imageFormat", "rotationDegrees", "", "imageBytes", "<init>", "(Landroid/util/Size;II[B)V", "", "close", "()V", "component1", "()Landroid/util/Size;", "component2", "()I", "component3", "component4", "()[B", "copy", "(Landroid/util/Size;II[B)Lcom/miteksystems/misnap/controller/internal/CompressionUtilNativeWrapper$FrameWrapper;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/util/Size;", "getImageSize", util.h.xy.cb.b.f1091, com.visa.cbp.getEncExpo.warmup, "getImageFormat", "c", "getRotationDegrees", "d", "[B", "getImageBytes"}, k = 1, mv = {1, 8, 0})
    static final /* data */ class FrameWrapper implements com.miteksystems.misnap.core.Frame {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final android.util.Size imageSize;

        /* renamed from: b, reason: from kotlin metadata */
        private final int imageFormat;

        /* renamed from: c, reason: from kotlin metadata */
        private final int rotationDegrees;

        /* renamed from: d, reason: from kotlin metadata */
        private final byte[] imageBytes;

        @Override // com.miteksystems.misnap.core.Frame
        public final void close() {
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FrameWrapper(imageSize=");
            sb.append(getCamera2StreamConfigurationMap());
            sb.append(", imageFormat=");
            sb.append(getGetHighResolutionOutputSizeshNQ4ISI());
            sb.append(", rotationDegrees=");
            sb.append(getGetHighSpeedVideoFpsRangesFor());
            sb.append(", imageBytes=");
            sb.append(java.util.Arrays.toString(getGetHighSpeedVideoSizes()));
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (((((getCamera2StreamConfigurationMap().hashCode() * 31) + java.lang.Integer.hashCode(getGetHighResolutionOutputSizeshNQ4ISI())) * 31) + java.lang.Integer.hashCode(getGetHighSpeedVideoFpsRangesFor())) * 31) + java.util.Arrays.hashCode(getGetHighSpeedVideoSizes());
        }

        @Override // com.miteksystems.misnap.core.Frame
        /* renamed from: getRotationDegrees, reason: from getter */
        public final int getGetHighSpeedVideoFpsRangesFor() {
            return this.rotationDegrees;
        }

        @Override // com.miteksystems.misnap.core.Frame
        /* renamed from: getImageSize, reason: from getter */
        public final android.util.Size getCamera2StreamConfigurationMap() {
            return this.imageSize;
        }

        @Override // com.miteksystems.misnap.core.Frame
        /* renamed from: getImageFormat, reason: from getter */
        public final int getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.imageFormat;
        }

        @Override // com.miteksystems.misnap.core.Frame
        /* renamed from: getImageBytes, reason: from getter */
        public final byte[] getGetHighSpeedVideoSizes() {
            return this.imageBytes;
        }

        @Override // com.miteksystems.misnap.core.Frame
        public final com.miteksystems.misnap.core.Frame.FrameInfo[] getFrameInfos() {
            return com.miteksystems.misnap.core.Frame.DefaultImpls.getFrameInfos(this);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.miteksystems.misnap.controller.internal.CompressionUtilNativeWrapper.FrameWrapper)) {
                return false;
            }
            com.miteksystems.misnap.controller.internal.CompressionUtilNativeWrapper.FrameWrapper frameWrapper = (com.miteksystems.misnap.controller.internal.CompressionUtilNativeWrapper.FrameWrapper) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(getCamera2StreamConfigurationMap(), frameWrapper.getCamera2StreamConfigurationMap()) && getGetHighResolutionOutputSizeshNQ4ISI() == frameWrapper.getGetHighResolutionOutputSizeshNQ4ISI() && getGetHighSpeedVideoFpsRangesFor() == frameWrapper.getGetHighSpeedVideoFpsRangesFor() && kotlin.jvm.internal.Intrinsics.areEqual(getGetHighSpeedVideoSizes(), frameWrapper.getGetHighSpeedVideoSizes());
        }

        public final com.miteksystems.misnap.controller.internal.CompressionUtilNativeWrapper.FrameWrapper copy(android.util.Size imageSize, int imageFormat, int rotationDegrees, byte[] imageBytes) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageSize, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageBytes, "");
            return new com.miteksystems.misnap.controller.internal.CompressionUtilNativeWrapper.FrameWrapper(imageSize, imageFormat, rotationDegrees, imageBytes);
        }

        public final byte[] component4() {
            return getGetHighSpeedVideoSizes();
        }

        public final int component3() {
            return getGetHighSpeedVideoFpsRangesFor();
        }

        public final int component2() {
            return getGetHighResolutionOutputSizeshNQ4ISI();
        }

        public final android.util.Size component1() {
            return getCamera2StreamConfigurationMap();
        }

        public static /* synthetic */ com.miteksystems.misnap.controller.internal.CompressionUtilNativeWrapper.FrameWrapper copy$default(com.miteksystems.misnap.controller.internal.CompressionUtilNativeWrapper.FrameWrapper frameWrapper, android.util.Size size, int i, int i2, byte[] bArr, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                size = frameWrapper.getCamera2StreamConfigurationMap();
            }
            if ((i3 & 2) != 0) {
                i = frameWrapper.getGetHighResolutionOutputSizeshNQ4ISI();
            }
            if ((i3 & 4) != 0) {
                i2 = frameWrapper.getGetHighSpeedVideoFpsRangesFor();
            }
            if ((i3 & 8) != 0) {
                bArr = frameWrapper.getGetHighSpeedVideoSizes();
            }
            return frameWrapper.copy(size, i, i2, bArr);
        }

        public FrameWrapper(android.util.Size size, int i, int i2, byte[] bArr) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
            this.imageSize = size;
            this.imageFormat = i;
            this.rotationDegrees = i2;
            this.imageBytes = bArr;
        }
    }
}
