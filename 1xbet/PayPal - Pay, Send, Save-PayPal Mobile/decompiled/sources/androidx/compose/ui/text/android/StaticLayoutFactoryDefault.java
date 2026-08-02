package androidx.compose.ui.text.android;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactoryDefault;", "Landroidx/compose/ui/text/android/StaticLayoutFactoryImpl;", "<init>", "()V", "Landroidx/compose/ui/text/android/StaticLayoutParams;", "p0", "Landroid/text/StaticLayout;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/text/android/StaticLayoutParams;)Landroid/text/StaticLayout;", "", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/text/StaticLayout;Z)Z", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class StaticLayoutFactoryDefault implements androidx.compose.ui.text.android.StaticLayoutFactoryImpl {
    private static java.lang.reflect.Constructor<android.text.StaticLayout> Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.android.StaticLayoutFactoryDefault.Companion INSTANCE = new androidx.compose.ui.text.android.StaticLayoutFactoryDefault.Companion(null);
    private static boolean getHighResolutionOutputSizeshNQ4ISI;

    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    public final boolean getHighResolutionOutputSizeshNQ4ISI(android.text.StaticLayout p0, boolean p1) {
        return false;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactoryDefault$Companion;", "", "<init>", "()V", "Ljava/lang/reflect/Constructor;", "Landroid/text/StaticLayout;", "getHighSpeedVideoFpsRangesFor", "()Ljava/lang/reflect/Constructor;", "", "getHighResolutionOutputSizeshNQ4ISI", "Z", "Camera2StreamConfigurationMap", "Ljava/lang/reflect/Constructor;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ java.lang.reflect.Constructor access$getStaticLayoutConstructor(androidx.compose.ui.text.android.StaticLayoutFactoryDefault.Companion companion) {
            return getHighSpeedVideoFpsRangesFor();
        }

        private static java.lang.reflect.Constructor<android.text.StaticLayout> getHighSpeedVideoFpsRangesFor() {
            if (androidx.compose.ui.text.android.StaticLayoutFactoryDefault.getHighResolutionOutputSizeshNQ4ISI) {
                return androidx.compose.ui.text.android.StaticLayoutFactoryDefault.Camera2StreamConfigurationMap;
            }
            androidx.compose.ui.text.android.StaticLayoutFactoryDefault.getHighResolutionOutputSizeshNQ4ISI = true;
            try {
                androidx.compose.ui.text.android.StaticLayoutFactoryDefault.Camera2StreamConfigurationMap = android.text.StaticLayout.class.getConstructor(java.lang.CharSequence.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, android.text.TextPaint.class, java.lang.Integer.TYPE, android.text.Layout.Alignment.class, android.text.TextDirectionHeuristic.class, java.lang.Float.TYPE, java.lang.Float.TYPE, java.lang.Boolean.TYPE, android.text.TextUtils.TruncateAt.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            } catch (java.lang.NoSuchMethodException unused) {
                androidx.compose.ui.text.android.StaticLayoutFactoryDefault.Camera2StreamConfigurationMap = null;
            }
            return androidx.compose.ui.text.android.StaticLayoutFactoryDefault.Camera2StreamConfigurationMap;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    public final android.text.StaticLayout getHighSpeedVideoFpsRangesFor(androidx.compose.ui.text.android.StaticLayoutParams p0) {
        java.lang.reflect.Constructor access$getStaticLayoutConstructor = androidx.compose.ui.text.android.StaticLayoutFactoryDefault.Companion.access$getStaticLayoutConstructor(INSTANCE);
        android.text.StaticLayout staticLayout = null;
        if (access$getStaticLayoutConstructor != null) {
            try {
                java.lang.CharSequence getHighResolutionOutputSizeshNQ4ISI2 = p0.getGetHighResolutionOutputSizeshNQ4ISI();
                int getHighSpeedVideoFpsRangesFor = p0.getGetHighSpeedVideoFpsRangesFor();
                int getHighSpeedVideoSizes = p0.getGetHighSpeedVideoSizes();
                staticLayout = (android.text.StaticLayout) access$getStaticLayoutConstructor.newInstance(getHighResolutionOutputSizeshNQ4ISI2, java.lang.Integer.valueOf(getHighSpeedVideoFpsRangesFor), java.lang.Integer.valueOf(getHighSpeedVideoSizes), p0.getCamera2StreamConfigurationMap(), java.lang.Integer.valueOf(p0.getGetHighSpeedVideoFpsRanges()), p0.getGetOutputMinFrameDuration(), p0.getGetOutputFormats(), java.lang.Float.valueOf(p0.getGetOutputStallDurationlomOqCM()), java.lang.Float.valueOf(p0.getGetOutputStallDuration()), java.lang.Boolean.valueOf(p0.getGetOutputSizes()), p0.getGetHighSpeedVideoSizesFor(), java.lang.Integer.valueOf(p0.getGetInputSizeshNQ4ISI()), java.lang.Integer.valueOf(p0.getGetInputFormats()));
            } catch (java.lang.IllegalAccessException unused) {
                Camera2StreamConfigurationMap = null;
            } catch (java.lang.InstantiationException unused2) {
                Camera2StreamConfigurationMap = null;
            } catch (java.lang.reflect.InvocationTargetException unused3) {
                Camera2StreamConfigurationMap = null;
            }
        }
        return staticLayout != null ? staticLayout : new android.text.StaticLayout(p0.getGetHighResolutionOutputSizeshNQ4ISI(), p0.getGetHighSpeedVideoFpsRangesFor(), p0.getGetHighSpeedVideoSizes(), p0.getCamera2StreamConfigurationMap(), p0.getGetHighSpeedVideoFpsRanges(), p0.getGetOutputMinFrameDuration(), p0.getGetOutputStallDurationlomOqCM(), p0.getGetOutputStallDuration(), p0.getGetOutputSizes(), p0.getGetHighSpeedVideoSizesFor(), p0.getGetInputSizeshNQ4ISI());
    }
}
