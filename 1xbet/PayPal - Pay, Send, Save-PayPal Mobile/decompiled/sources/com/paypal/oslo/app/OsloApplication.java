package com.paypal.oslo.app;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R-\u0010\u001d\u001a\r\u0012\t\u0012\u00070\u001b¢\u0006\u0002\b\u001c0\u001a8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%"}, d2 = {"Lcom/paypal/oslo/app/OsloApplication;", "Landroid/app/Application;", "Lcoil3/SingletonImageLoader$Factory;", "Landroidx/work/Configuration$Provider;", "<init>", "()V", "Landroid/content/Context;", "Lcoil3/getHighResolutionOutputSizeshNQ4ISI;", "context", "Lcoil3/ImageLoader;", "newImageLoader", "(Landroid/content/Context;)Lcoil3/ImageLoader;", "Lcom/paypal/oslo/core/imaging/ImageLoaderFactory;", "imageLoaderFactory", "Lcom/paypal/oslo/core/imaging/ImageLoaderFactory;", "getImageLoaderFactory", "()Lcom/paypal/oslo/core/imaging/ImageLoaderFactory;", "setImageLoaderFactory", "(Lcom/paypal/oslo/core/imaging/ImageLoaderFactory;)V", "Lcom/paypal/oslo/app/WorkManagerConfigurationProvider;", "workManagerConfigurationProvider", "Lcom/paypal/oslo/app/WorkManagerConfigurationProvider;", "getWorkManagerConfigurationProvider", "()Lcom/paypal/oslo/app/WorkManagerConfigurationProvider;", "setWorkManagerConfigurationProvider", "(Lcom/paypal/oslo/app/WorkManagerConfigurationProvider;)V", "", "Lcom/paypal/oslo/core/session/LogoutObserver;", "Lkotlin/jvm/JvmSuppressWildcards;", "logoutObservers", "Ljava/util/Set;", "getLogoutObservers", "()Ljava/util/Set;", "setLogoutObservers", "(Ljava/util/Set;)V", "Landroidx/work/Configuration;", "getWorkManagerConfiguration", "()Landroidx/work/Configuration;", "workManagerConfiguration"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.hilt.android.HiltAndroidApp
/* loaded from: classes.dex */
public final class OsloApplication extends com.paypal.oslo.app.Hilt_OsloApplication implements coil3.SingletonImageLoader.Factory, androidx.work.Configuration.Provider {
    public static final int $stable = 8;

    @javax.inject.Inject
    public com.paypal.oslo.core.imaging.ImageLoaderFactory imageLoaderFactory;

    @javax.inject.Inject
    public java.util.Set<com.paypal.oslo.core.session.LogoutObserver> logoutObservers;

    @javax.inject.Inject
    public com.paypal.oslo.app.WorkManagerConfigurationProvider workManagerConfigurationProvider;
    private static final byte[] $$c = {com.google.common.base.Ascii.NAK, -17, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 99};
    private static final int $$d = 193;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {13, -50, -112, -45, 1, com.visa.cbp.getEncExpo.onUnminimized, 43, -34, 1, -2, com.google.common.base.Ascii.DC4, -30, 10, -1, 0, 13, -20, 4, -2, -11, com.google.common.base.Ascii.ESC, -23, -18, com.google.common.base.Ascii.DC4, -15, -31, -13, 7, -14, 16, 46, -34, -34, 1, com.google.common.base.Ascii.FF, 3, -13, 41, -45, 0, 7, -4, 1, -15, 2, 16, -20, 10, -7, 0, 32, -21, com.visa.cbp.getEncExpo.onUnminimized, 1, com.visa.cbp.getEncExpo.onUnminimized, 43, -34, 1, -2, com.google.common.base.Ascii.DC4, -30, 10, -1, 0, 13, -20, 4, -2, -11, 40, -43, -4, 32, com.visa.cbp.getEncExpo.onUnminimized, -14, 6, 1, -15};
    private static final int $$b = 7;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getInputFormats = 1;
    private static char getHighResolutionOutputSizeshNQ4ISI = 34670;
    private static char getHighSpeedVideoSizes = 60744;
    private static char getHighSpeedVideoFpsRangesFor = 54566;
    private static char Camera2StreamConfigurationMap = 40075;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$e(byte b, short s, int i) {
        int i2;
        byte[] bArr = $$c;
        int i3 = s * 2;
        int i4 = (b * 4) + 109;
        int i5 = (i * 2) + 4;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i4 += -i5;
            i5 = i6 + 1;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i3) {
                return new java.lang.String(bArr2, 0);
            }
            i6 = i5;
            i5 = bArr[i5];
            i4 += -i5;
            i5 = i6 + 1;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = (i * 36) + 67;
        byte[] bArr = $$a;
        int i5 = 52 - (s * 7);
        int i6 = 29 - b;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i5;
            int i8 = i6;
            i3 = 0;
            int i9 = (i8 + (-i5)) - 1;
            i2 = i3;
            int i10 = i7;
            i4 = i9;
            i5 = i10;
            int i11 = i5 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i12 = i4;
            i7 = i11;
            i5 = bArr[i11];
            i8 = i12;
            int i92 = (i8 + (-i5)) - 1;
            i2 = i3;
            int i102 = i7;
            i4 = i92;
            i5 = i102;
            int i112 = i5 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            int i1122 = i5 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    public final com.paypal.oslo.core.imaging.ImageLoaderFactory getImageLoaderFactory() {
        int i = 2 % 2;
        int i2 = getHighSpeedVideoFpsRanges + 51;
        int i3 = i2 % 128;
        getInputFormats = i3;
        java.lang.Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        com.paypal.oslo.core.imaging.ImageLoaderFactory imageLoaderFactory = this.imageLoaderFactory;
        if (imageLoaderFactory == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i3 + 113;
        getHighSpeedVideoFpsRanges = i4 % 128;
        if (i4 % 2 == 0) {
            return imageLoaderFactory;
        }
        obj.hashCode();
        throw null;
    }

    public final void setImageLoaderFactory(com.paypal.oslo.core.imaging.ImageLoaderFactory imageLoaderFactory) {
        int i = 2 % 2;
        int i2 = getHighSpeedVideoFpsRanges + 17;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageLoaderFactory, "");
            this.imageLoaderFactory = imageLoaderFactory;
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageLoaderFactory, "");
            this.imageLoaderFactory = imageLoaderFactory;
            int i3 = 66 / 0;
        }
    }

    public final com.paypal.oslo.app.WorkManagerConfigurationProvider getWorkManagerConfigurationProvider() {
        int i = 2 % 2;
        int i2 = getHighSpeedVideoFpsRanges;
        int i3 = i2 + 15;
        getInputFormats = i3 % 128;
        int i4 = i3 % 2;
        com.paypal.oslo.app.WorkManagerConfigurationProvider workManagerConfigurationProvider = this.workManagerConfigurationProvider;
        if (workManagerConfigurationProvider == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 55;
        getInputFormats = i5 % 128;
        int i6 = i5 % 2;
        return workManagerConfigurationProvider;
    }

    public final void setWorkManagerConfigurationProvider(com.paypal.oslo.app.WorkManagerConfigurationProvider workManagerConfigurationProvider) {
        int i = 2 % 2;
        int i2 = getInputFormats + 7;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workManagerConfigurationProvider, "");
            this.workManagerConfigurationProvider = workManagerConfigurationProvider;
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workManagerConfigurationProvider, "");
            this.workManagerConfigurationProvider = workManagerConfigurationProvider;
            int i3 = 51 / 0;
        }
    }

    public final java.util.Set<com.paypal.oslo.core.session.LogoutObserver> getLogoutObservers() {
        int i = 2 % 2;
        int i2 = getHighSpeedVideoFpsRanges;
        int i3 = i2 + 57;
        getInputFormats = i3 % 128;
        java.lang.Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        java.util.Set<com.paypal.oslo.core.session.LogoutObserver> set = this.logoutObservers;
        if (set == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 49;
        getInputFormats = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return set;
    }

    public final void setLogoutObservers(java.util.Set<com.paypal.oslo.core.session.LogoutObserver> set) {
        int i = 2 % 2;
        int i2 = getHighSpeedVideoFpsRanges + 67;
        getInputFormats = i2 % 128;
        int i3 = i2 % 2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.logoutObservers = set;
        int i4 = getHighSpeedVideoFpsRanges + 77;
        getInputFormats = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // coil3.SingletonImageLoader.Factory
    public final coil3.ImageLoader newImageLoader(android.content.Context context) {
        int i = 2 % 2;
        int i2 = getInputFormats + 121;
        getHighSpeedVideoFpsRanges = i2 % 128;
        int i3 = i2 % 2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        coil3.ImageLoader create = getImageLoaderFactory().create(context);
        int i4 = getHighSpeedVideoFpsRanges + 5;
        getInputFormats = i4 % 128;
        if (i4 % 2 != 0) {
            return create;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.work.Configuration.Provider
    public final androidx.work.Configuration getWorkManagerConfiguration() {
        int i = 2 % 2;
        int i2 = getHighSpeedVideoFpsRanges + 119;
        getInputFormats = i2 % 128;
        int i3 = i2 % 2;
        com.paypal.oslo.app.WorkManagerConfigurationProvider workManagerConfigurationProvider = getWorkManagerConfigurationProvider();
        if (i3 != 0) {
            return workManagerConfigurationProvider.createConfiguration();
        }
        workManagerConfigurationProvider.createConfiguration();
        throw null;
    }

    private static void a(int i, char[] cArr, java.lang.Object[] objArr) {
        int i2 = 2 % 2;
        o.isOutputSupportedForhNQ4ISI isoutputsupportedforhnq4isi = new o.isOutputSupportedForhNQ4ISI();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        isoutputsupportedforhnq4isi.getHighSpeedVideoFpsRangesFor = 0;
        char[] cArr3 = new char[2];
        while (isoutputsupportedforhnq4isi.getHighSpeedVideoFpsRangesFor < cArr.length) {
            int i4 = $10 + 117;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[isoutputsupportedforhnq4isi.getHighSpeedVideoFpsRangesFor];
            char c = 1;
            cArr3[1] = cArr[isoutputsupportedforhnq4isi.getHighSpeedVideoFpsRangesFor + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                char[] cArr4 = cArr3;
                int i8 = (c3 + i6) ^ ((c3 << 4) + ((char) (getHighSpeedVideoFpsRangesFor ^ 367215476717441626L)));
                int i9 = c3 >>> 5;
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[4];
                    objArr2[3] = java.lang.Integer.valueOf(Camera2StreamConfigurationMap);
                    objArr2[2] = java.lang.Integer.valueOf(i9);
                    objArr2[c] = java.lang.Integer.valueOf(i8);
                    objArr2[0] = java.lang.Integer.valueOf(c2);
                    java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1280850362);
                    if (Camera2StreamConfigurationMap2 == null) {
                        char makeMeasureSpec = (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 31174);
                        int i10 = (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 75;
                        int i11 = (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2;
                        java.lang.Class[] clsArr = new java.lang.Class[4];
                        clsArr[0] = java.lang.Integer.TYPE;
                        clsArr[c] = java.lang.Integer.TYPE;
                        clsArr[2] = java.lang.Integer.TYPE;
                        clsArr[3] = java.lang.Integer.TYPE;
                        Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(makeMeasureSpec, i10, i11, 782698310, false, "k", clsArr);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr2)).charValue();
                    cArr4[c] = charValue;
                    int i12 = i7;
                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf((charValue + i6) ^ ((charValue << 4) + ((char) (getHighResolutionOutputSizeshNQ4ISI ^ 367215476717441626L)))), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(getHighSpeedVideoSizes)};
                    java.lang.Object Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1280850362);
                    if (Camera2StreamConfigurationMap3 == null) {
                        Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (android.text.TextUtils.getOffsetBefore("", 0) + 31174), 76 - android.widget.ExpandableListView.getPackedPositionGroup(0L), android.text.TextUtils.getCapsMode("", 0, 0) + 3, 782698310, false, "k", new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) Camera2StreamConfigurationMap3).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i12 + 1;
                    int i13 = $10 + 65;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    cArr3 = cArr4;
                    i3 = 0;
                    c = 1;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[isoutputsupportedforhnq4isi.getHighSpeedVideoFpsRangesFor] = cArr5[0];
            cArr2[isoutputsupportedforhnq4isi.getHighSpeedVideoFpsRangesFor + 1] = cArr5[1];
            java.lang.Object[] objArr4 = {isoutputsupportedforhnq4isi, isoutputsupportedforhnq4isi};
            java.lang.Object Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(1050217642);
            if (Camera2StreamConfigurationMap4 == null) {
                byte b = (byte) 0;
                byte b2 = b;
                Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (22570 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.VT, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12, -1550201430, false, $$e(b, b2, b2), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) Camera2StreamConfigurationMap4).invoke(null, objArr4);
            int i15 = $11 + 81;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    @Override // com.paypal.oslo.app.Hilt_OsloApplication, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        java.lang.StackTraceElement stackTraceElement;
        int length;
        int i;
        int i2 = 2 % 2;
        super.attachBaseContext(context);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16, new char[]{39862, 51114, 39660, 23648, 58367, 65351, 16612, 12157, 31359, 28993, 35570, 48201, 34243, 19158, 50037, 3532}, objArr);
        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 14, new char[]{44459, 24629, 6171, 28986, 11598, 35798, 28194, 35913, 34313, 35224, 45569, 3047, 8462, 19406}, objArr2);
        java.lang.Thread thread = (java.lang.Thread) cls.getMethod((java.lang.String) objArr2[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(16 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), new char[]{39862, 51114, 39660, 23648, 58367, 65351, 16612, 12157, 31359, 28993, 35570, 48201, 34243, 19158, 50037, 3532}, objArr3);
        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr3[0]);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 14, new char[]{63283, 3539, 50957, 18200, 5018, 14152, 12755, 45853, 57209, 38680, 17753, 18383, 18824, 4142}, objArr4);
        java.lang.StackTraceElement[] stackTraceElementArr = (java.lang.StackTraceElement[]) cls2.getMethod((java.lang.String) objArr4[0], new java.lang.Class[0]).invoke(thread, new java.lang.Object[0]);
        try {
            java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(655407937);
            if (Camera2StreamConfigurationMap2 == null) {
                char c = (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 45285);
                int indexOf = 157 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                int mode = android.view.View.MeasureSpec.getMode(0) + 3;
                byte b = (byte) $$b;
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                b(b, b, $$a[4], objArr5);
                Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(c, indexOf, mode, -1173325247, false, (java.lang.String) objArr5[0], new java.lang.Class[0]);
            }
            java.lang.Object[] objArr6 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, null);
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            a(27 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), new char[]{39862, 51114, 39660, 23648, 58367, 65351, 16612, 12157, 31359, 28993, 31578, 60717, 17753, 18383, 18034, 42429, 43010, 35405, 10230, 28988, 56783, 36826, 35705, 59468, 11598, 35798, 59919, 46249}, objArr7);
            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr7[0]);
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            a(11 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), new char[]{63283, 3539, 25617, 19757, 18943, 55036, 30715, 19112, 54740, 23790, 1167, 15670}, objArr8);
            java.lang.reflect.Method method = cls3.getMethod((java.lang.String) objArr8[0], new java.lang.Class[0]);
            java.lang.Object Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(1165138677);
            if (Camera2StreamConfigurationMap3 == null) {
                char c2 = (char) (29458 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                int blue = android.graphics.Color.blue(0) + 137;
                int offsetBefore = 6 - android.text.TextUtils.getOffsetBefore("", 0);
                byte[] bArr = $$a;
                byte b2 = bArr[17];
                byte b3 = bArr[14];
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                b(b2, b3, b3, objArr9);
                Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(c2, blue, offsetBefore, -663593995, false, (java.lang.String) objArr9[0], null);
            }
            ((java.lang.reflect.Field) Camera2StreamConfigurationMap3).setInt(null, 0);
            int length2 = stackTraceElementArr.length;
            int i3 = getHighSpeedVideoFpsRanges + 117;
            getInputFormats = i3 % 128;
            int i4 = 2;
            int i5 = i3 % 2;
            int i6 = 0;
            while (true) {
                if (i6 >= length2) {
                    break;
                }
                int i7 = getHighSpeedVideoFpsRanges + 27;
                getInputFormats = i7 % 128;
                if (i7 % i4 == 0) {
                    stackTraceElement = stackTraceElementArr[i6];
                    length = objArr6.length;
                    i = 1;
                } else {
                    stackTraceElement = stackTraceElementArr[i6];
                    length = objArr6.length;
                    i = 0;
                }
                while (i < length) {
                    int i8 = getHighSpeedVideoFpsRanges + 23;
                    getInputFormats = i8 % 128;
                    int i9 = i8 % 2;
                    if (objArr6[i].equals((java.lang.String) method.invoke(stackTraceElement, new java.lang.Object[0]))) {
                        int i10 = getHighSpeedVideoFpsRanges + 41;
                        getInputFormats = i10 % 128;
                        int i11 = i10 % 2;
                        java.lang.Object Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(1165138677);
                        if (Camera2StreamConfigurationMap4 == null) {
                            char indexOf2 = (char) (android.text.TextUtils.indexOf("", "", 0) + 29457);
                            int offsetBefore2 = 137 - android.text.TextUtils.getOffsetBefore("", 0);
                            int indexOf3 = 6 - android.text.TextUtils.indexOf("", "");
                            byte[] bArr2 = $$a;
                            byte b4 = bArr2[17];
                            byte b5 = bArr2[14];
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            b(b4, b5, b5, objArr10);
                            Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(indexOf2, offsetBefore2, indexOf3, -663593995, false, (java.lang.String) objArr10[0], null);
                        }
                        ((java.lang.reflect.Field) Camera2StreamConfigurationMap4).setInt(null, 1);
                    } else {
                        i++;
                        int i12 = getInputFormats + 65;
                        getHighSpeedVideoFpsRanges = i12 % 128;
                        int i13 = i12 % 2;
                    }
                }
                i6++;
                i4 = 2;
            }
            java.lang.Object Camera2StreamConfigurationMap5 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(689180979);
            if (Camera2StreamConfigurationMap5 == null) {
                char resolveOpacity = (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 45285);
                int indexOf4 = android.text.TextUtils.indexOf("", "", 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                int indexOf5 = 2 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                byte[] bArr3 = $$a;
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                b(bArr3[14], bArr3[35], bArr3[4], objArr11);
                Camera2StreamConfigurationMap5 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(resolveOpacity, indexOf4, indexOf5, -1273704397, false, (java.lang.String) objArr11[0], null);
            }
            ((java.lang.reflect.Field) Camera2StreamConfigurationMap5).set(null, -1L);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // com.paypal.oslo.app.Hilt_OsloApplication, android.app.Application
    public final void onCreate() {
        int i = 2 % 2;
        int i2 = getInputFormats + 97;
        getHighSpeedVideoFpsRanges = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(18) - 30, new char[]{39862, 51114, 39660, 23648, 58367, 65351, 16612, 12157, 31359, 28993, 35570, 48201, 34243, 19158, 50037, 3532}, objArr);
        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.paypal.android.p2pmobile.R.string._2132089262_res_0x7f1519ae).substring(0, 20).length() - 7, new char[]{44459, 24629, 6171, 28986, 11598, 35798, 28194, 35913, 34313, 35224, 45569, 3047, 8462, 19406}, objArr2);
        java.lang.Thread thread = (java.lang.Thread) cls.getMethod((java.lang.String) objArr2[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, new char[]{39862, 51114, 39660, 23648, 58367, 65351, 16612, 12157, 31359, 28993, 35570, 48201, 34243, 19158, 50037, 3532}, objArr3);
        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr3[0]);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.paypal.android.p2pmobile.R.string._2132084220_res_0x7f1505fc).substring(0, 15).length() - 2, new char[]{63283, 3539, 50957, 18200, 5018, 14152, 12755, 45853, 57209, 38680, 17753, 18383, 18824, 4142}, objArr4);
        java.lang.StackTraceElement[] stackTraceElementArr = (java.lang.StackTraceElement[]) cls2.getMethod((java.lang.String) objArr4[0], new java.lang.Class[0]).invoke(thread, new java.lang.Object[0]);
        try {
            java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(655407937);
            if (Camera2StreamConfigurationMap2 == null) {
                char offsetBefore = (char) (45285 - android.text.TextUtils.getOffsetBefore("", 0));
                int argb = 158 - android.graphics.Color.argb(0, 0, 0, 0);
                int doubleTapTimeout = (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 3;
                byte b = (byte) $$b;
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                b(b, b, $$a[4], objArr5);
                Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(offsetBefore, argb, doubleTapTimeout, -1173325247, false, (java.lang.String) objArr5[0], new java.lang.Class[0]);
            }
            java.lang.Object[] objArr6 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, null);
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            a(((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1, new char[]{39862, 51114, 39660, 23648, 58367, 65351, 16612, 12157, 31359, 28993, 31578, 60717, 17753, 18383, 18034, 42429, 43010, 35405, 10230, 28988, 56783, 36826, 35705, 59468, 11598, 35798, 59919, 46249}, objArr7);
            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr7[0]);
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            a(((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 16, new char[]{63283, 3539, 25617, 19757, 18943, 55036, 30715, 19112, 54740, 23790, 1167, 15670}, objArr8);
            java.lang.reflect.Method method = cls3.getMethod((java.lang.String) objArr8[0], new java.lang.Class[0]);
            java.lang.Object Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(1165138677);
            if (Camera2StreamConfigurationMap3 == null) {
                char maximumFlingVelocity = (char) (29457 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                int argb2 = 137 - android.graphics.Color.argb(0, 0, 0, 0);
                int combineMeasuredStates = 6 - android.view.View.combineMeasuredStates(0, 0);
                byte[] bArr = $$a;
                byte b2 = bArr[17];
                byte b3 = bArr[14];
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                b(b2, b3, b3, objArr9);
                Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(maximumFlingVelocity, argb2, combineMeasuredStates, -663593995, false, (java.lang.String) objArr9[0], null);
            }
            ((java.lang.reflect.Field) Camera2StreamConfigurationMap3).setInt(null, 0);
            int length = stackTraceElementArr.length;
            int i4 = getHighSpeedVideoFpsRanges + 125;
            getInputFormats = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 2;
            }
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                java.lang.StackTraceElement stackTraceElement = stackTraceElementArr[i6];
                int length2 = objArr6.length;
                int i7 = 0;
                while (i7 < length2) {
                    if (!(!objArr6[i7].equals((java.lang.String) method.invoke(stackTraceElement, new java.lang.Object[0])))) {
                        java.lang.Object Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(1165138677);
                        if (Camera2StreamConfigurationMap4 == null) {
                            char c = (char) (29457 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                            int lastIndexOf = 136 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                            int i8 = 6 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            byte[] bArr2 = $$a;
                            byte b4 = bArr2[17];
                            byte b5 = bArr2[14];
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            b(b4, b5, b5, objArr10);
                            Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(c, lastIndexOf, i8, -663593995, false, (java.lang.String) objArr10[0], null);
                        }
                        ((java.lang.reflect.Field) Camera2StreamConfigurationMap4).setInt(null, 1);
                    } else {
                        i7++;
                        int i9 = getInputFormats + 15;
                        getHighSpeedVideoFpsRanges = i9 % 128;
                        if (i9 % 2 != 0) {
                            int i10 = 5 % 4;
                        }
                    }
                }
                i6++;
            }
            java.lang.Object Camera2StreamConfigurationMap5 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(689180979);
            if (Camera2StreamConfigurationMap5 == null) {
                char indexOf = (char) (45285 - android.text.TextUtils.indexOf("", "", 0));
                int combineMeasuredStates2 = android.view.View.combineMeasuredStates(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                int blue = 3 - android.graphics.Color.blue(0);
                byte[] bArr3 = $$a;
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                b(bArr3[14], bArr3[35], bArr3[4], objArr11);
                Camera2StreamConfigurationMap5 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(indexOf, combineMeasuredStates2, blue, -1273704397, false, (java.lang.String) objArr11[0], null);
            }
            ((java.lang.reflect.Field) Camera2StreamConfigurationMap5).set(null, -1L);
            int i11 = getInputFormats + 83;
            getHighSpeedVideoFpsRanges = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
