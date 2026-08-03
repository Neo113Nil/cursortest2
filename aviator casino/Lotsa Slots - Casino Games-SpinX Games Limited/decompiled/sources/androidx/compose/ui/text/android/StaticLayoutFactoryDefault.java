package androidx.compose.ui.text.android;

/* compiled from: StaticLayoutFactory.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactoryDefault;", "Landroidx/compose/ui/text/android/StaticLayoutFactoryImpl;", "()V", "create", "Landroid/text/StaticLayout;", "params", "Landroidx/compose/ui/text/android/StaticLayoutParams;", "isFallbackLineSpacingEnabled", "", "layout", "useFallbackLineSpacing", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class StaticLayoutFactoryDefault implements androidx.compose.ui.text.android.StaticLayoutFactoryImpl {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.android.StaticLayoutFactoryDefault.Companion INSTANCE = new androidx.compose.ui.text.android.StaticLayoutFactoryDefault.Companion(null);
    private static boolean isInitialized;
    private static java.lang.reflect.Constructor<android.text.StaticLayout> staticLayoutConstructor;

    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    public boolean isFallbackLineSpacingEnabled(android.text.StaticLayout layout, boolean useFallbackLineSpacing) {
        return false;
    }

    /* compiled from: StaticLayoutFactory.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactoryDefault$Companion;", "", "()V", "isInitialized", "", "staticLayoutConstructor", "Ljava/lang/reflect/Constructor;", "Landroid/text/StaticLayout;", "getStaticLayoutConstructor", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.lang.reflect.Constructor<android.text.StaticLayout> getStaticLayoutConstructor() {
            if (androidx.compose.ui.text.android.StaticLayoutFactoryDefault.isInitialized) {
                return androidx.compose.ui.text.android.StaticLayoutFactoryDefault.staticLayoutConstructor;
            }
            androidx.compose.ui.text.android.StaticLayoutFactoryDefault.isInitialized = true;
            try {
                androidx.compose.ui.text.android.StaticLayoutFactoryDefault.staticLayoutConstructor = android.text.StaticLayout.class.getConstructor(java.lang.CharSequence.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, android.text.TextPaint.class, java.lang.Integer.TYPE, android.text.Layout.Alignment.class, android.text.TextDirectionHeuristic.class, java.lang.Float.TYPE, java.lang.Float.TYPE, java.lang.Boolean.TYPE, android.text.TextUtils.TruncateAt.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            } catch (java.lang.NoSuchMethodException unused) {
                androidx.compose.ui.text.android.StaticLayoutFactoryDefault.staticLayoutConstructor = null;
                android.util.Log.e("StaticLayoutFactory", "unable to collect necessary constructor.");
            }
            return androidx.compose.ui.text.android.StaticLayoutFactoryDefault.staticLayoutConstructor;
        }
    }

    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    public android.text.StaticLayout create(androidx.compose.ui.text.android.StaticLayoutParams params) {
        java.lang.reflect.Constructor staticLayoutConstructor2 = INSTANCE.getStaticLayoutConstructor();
        android.text.StaticLayout staticLayout = null;
        if (staticLayoutConstructor2 != null) {
            try {
                staticLayout = (android.text.StaticLayout) staticLayoutConstructor2.newInstance(params.getText(), java.lang.Integer.valueOf(params.getStart()), java.lang.Integer.valueOf(params.getEnd()), params.getPaint(), java.lang.Integer.valueOf(params.getWidth()), params.getAlignment(), params.getTextDir(), java.lang.Float.valueOf(params.getLineSpacingMultiplier()), java.lang.Float.valueOf(params.getLineSpacingExtra()), java.lang.Boolean.valueOf(params.getIncludePadding()), params.getEllipsize(), java.lang.Integer.valueOf(params.getEllipsizedWidth()), java.lang.Integer.valueOf(params.getMaxLines()));
            } catch (java.lang.IllegalAccessException unused) {
                staticLayoutConstructor = null;
                android.util.Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (java.lang.InstantiationException unused2) {
                staticLayoutConstructor = null;
                android.util.Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (java.lang.reflect.InvocationTargetException unused3) {
                staticLayoutConstructor = null;
                android.util.Log.e("StaticLayoutFactory", "unable to call constructor");
            }
        }
        return staticLayout != null ? staticLayout : new android.text.StaticLayout(params.getText(), params.getStart(), params.getEnd(), params.getPaint(), params.getWidth(), params.getAlignment(), params.getLineSpacingMultiplier(), params.getLineSpacingExtra(), params.getIncludePadding(), params.getEllipsize(), params.getEllipsizedWidth());
    }
}
