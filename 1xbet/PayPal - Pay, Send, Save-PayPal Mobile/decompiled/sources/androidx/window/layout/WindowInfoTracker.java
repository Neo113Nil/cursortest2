package androidx.window.layout;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8WX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/window/layout/WindowInfoTracker;", "", "Landroid/content/Context;", "context", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/window/layout/WindowLayoutInfo;", "windowLayoutInfo", "(Landroid/content/Context;)Lkotlinx/coroutines/flow/Flow;", "Landroid/app/Activity;", "activity", "(Landroid/app/Activity;)Lkotlinx/coroutines/flow/Flow;", "getCurrentWindowLayoutInfo", "(Landroid/content/Context;)Landroidx/window/layout/WindowLayoutInfo;", "", "Landroidx/window/layout/SupportedPosture;", "getSupportedPostures", "()Ljava/util/List;", "getSupportedPostures$annotations", "()V", "supportedPostures", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface WindowInfoTracker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.layout.WindowInfoTracker.Companion INSTANCE = androidx.window.layout.WindowInfoTracker.Companion.getHighSpeedVideoSizes;

    static /* synthetic */ void getSupportedPostures$annotations() {
    }

    kotlinx.coroutines.flow.Flow<androidx.window.layout.WindowLayoutInfo> windowLayoutInfo(android.app.Activity activity);

    default kotlinx.coroutines.flow.Flow<androidx.window.layout.WindowLayoutInfo> windowLayoutInfo(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        kotlinx.coroutines.flow.Flow<androidx.window.layout.WindowLayoutInfo> windowLayoutInfo = activity != null ? windowLayoutInfo(activity) : null;
        if (windowLayoutInfo != null) {
            return windowLayoutInfo;
        }
        throw new kotlin.NotImplementedError("Must override windowLayoutInfo(context) and provide an implementation.");
    }

    default java.util.List<androidx.window.layout.SupportedPosture> getSupportedPostures() {
        throw new kotlin.NotImplementedError("Method was not implemented.");
    }

    default androidx.window.layout.WindowLayoutInfo getCurrentWindowLayoutInfo(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        throw new kotlin.NotImplementedError("Method was not implemented.");
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u0003R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R#\u0010\u0019\u001a\u0004\u0018\u00010\u00138AX\u0080\u0084\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001a"}, d2 = {"Landroidx/window/layout/WindowInfoTracker$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/window/layout/WindowInfoTracker;", "getOrCreate", "(Landroid/content/Context;)Landroidx/window/layout/WindowInfoTracker;", "Landroidx/window/layout/WindowInfoTrackerDecorator;", "overridingDecorator", "", "overrideDecorator", "(Landroidx/window/layout/WindowInfoTrackerDecorator;)V", "reset", "", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Landroidx/window/layout/adapter/WindowBackend;", "extensionBackend$delegate", "Lkotlin/Lazy;", "getExtensionBackend$window_release", "()Landroidx/window/layout/adapter/WindowBackend;", "getExtensionBackend$window_release$annotations", "extensionBackend", "Landroidx/window/layout/WindowInfoTrackerDecorator;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.window.layout.WindowInfoTracker.Companion getHighSpeedVideoSizes = new androidx.window.layout.WindowInfoTracker.Companion();

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private static final java.lang.String getHighSpeedVideoFpsRanges = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.window.layout.WindowInfoTracker.class).getSimpleName();

        /* renamed from: extensionBackend$delegate, reason: from kotlin metadata */
        private static final kotlin.Lazy<androidx.window.layout.adapter.WindowBackend> extensionBackend = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.window.layout.WindowInfoTracker$Companion$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.window.layout.adapter.WindowBackend highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.window.layout.WindowInfoTracker.Companion.getHighResolutionOutputSizeshNQ4ISI();
                return highResolutionOutputSizeshNQ4ISI;
            }
        });

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private static androidx.window.layout.WindowInfoTrackerDecorator getHighResolutionOutputSizeshNQ4ISI = androidx.window.layout.EmptyDecorator.INSTANCE;

        public static /* synthetic */ void getExtensionBackend$window_release$annotations() {
        }

        private Companion() {
        }

        public final androidx.window.layout.adapter.WindowBackend getExtensionBackend$window_release() {
            return extensionBackend.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.window.layout.adapter.WindowBackend getHighResolutionOutputSizeshNQ4ISI() {
            androidx.window.extensions.layout.WindowLayoutComponent windowLayoutComponent;
            try {
                java.lang.ClassLoader classLoader = androidx.window.layout.WindowInfoTracker.class.getClassLoader();
                androidx.window.layout.SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = classLoader != null ? new androidx.window.layout.SafeWindowLayoutComponentProvider(classLoader, new androidx.window.core.ConsumerAdapter(classLoader)) : null;
                if (safeWindowLayoutComponentProvider == null || (windowLayoutComponent = safeWindowLayoutComponentProvider.getWindowLayoutComponent()) == null) {
                    return null;
                }
                return androidx.window.layout.adapter.extensions.ExtensionWindowBackend.INSTANCE.newInstance(windowLayoutComponent, new androidx.window.core.ConsumerAdapter(classLoader));
            } catch (java.lang.Throwable unused) {
                return null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @kotlin.jvm.JvmStatic
        public final androidx.window.layout.WindowInfoTracker getOrCreate(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            androidx.window.layout.adapter.sidecar.SidecarWindowBackend extensionBackend$window_release = getExtensionBackend$window_release();
            if (extensionBackend$window_release == null) {
                extensionBackend$window_release = androidx.window.layout.adapter.sidecar.SidecarWindowBackend.INSTANCE.getInstance(context);
            }
            return getHighResolutionOutputSizeshNQ4ISI.decorate(new androidx.window.layout.WindowInfoTrackerImpl(new androidx.window.layout.WindowMetricsCalculatorCompat(null, 1, 0 == true ? 1 : 0), extensionBackend$window_release, androidx.window.WindowSdkExtensions.INSTANCE.getInstance()));
        }

        @kotlin.jvm.JvmStatic
        public final void overrideDecorator(androidx.window.layout.WindowInfoTrackerDecorator overridingDecorator) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overridingDecorator, "");
            getHighResolutionOutputSizeshNQ4ISI = overridingDecorator;
        }

        @kotlin.jvm.JvmStatic
        public final void reset() {
            getHighResolutionOutputSizeshNQ4ISI = androidx.window.layout.EmptyDecorator.INSTANCE;
        }
    }

    @kotlin.jvm.JvmStatic
    static void reset() {
        INSTANCE.reset();
    }

    @kotlin.jvm.JvmStatic
    static void overrideDecorator(androidx.window.layout.WindowInfoTrackerDecorator windowInfoTrackerDecorator) {
        INSTANCE.overrideDecorator(windowInfoTrackerDecorator);
    }

    @kotlin.jvm.JvmStatic
    static androidx.window.layout.WindowInfoTracker getOrCreate(android.content.Context context) {
        return INSTANCE.getOrCreate(context);
    }
}
