package androidx.window.area;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00138'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/window/area/WindowAreaController;", "", "<init>", "()V", "Landroid/os/Binder;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/window/area/WindowAreaSessionCallback;", "windowAreaSessionCallback", "", "transferActivityToWindowArea", "(Landroid/os/Binder;Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/window/area/WindowAreaSessionCallback;)V", "Landroidx/window/area/WindowAreaPresentationSessionCallback;", "windowAreaPresentationSessionCallback", "presentContentOnWindowArea", "(Landroid/os/Binder;Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/window/area/WindowAreaPresentationSessionCallback;)V", "Lkotlinx/coroutines/flow/Flow;", "", "Landroidx/window/area/WindowAreaInfo;", "getWindowAreaInfos", "()Lkotlinx/coroutines/flow/Flow;", "windowAreaInfos", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class WindowAreaController {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.area.WindowAreaController.Companion INSTANCE = new androidx.window.area.WindowAreaController.Companion(null);
    private static final java.lang.String getHighSpeedVideoFpsRanges = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.window.area.WindowAreaController.class).getSimpleName();
    private static androidx.window.area.WindowAreaControllerDecorator Camera2StreamConfigurationMap = androidx.window.area.EmptyDecorator.INSTANCE;
    private static final kotlin.Lazy<androidx.window.area.WindowAreaController> getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.window.area.WindowAreaController$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            androidx.window.area.WindowAreaController highSpeedVideoSizes;
            highSpeedVideoSizes = androidx.window.area.WindowAreaController.getHighSpeedVideoSizes();
            return highSpeedVideoSizes;
        }
    });

    public abstract kotlinx.coroutines.flow.Flow<java.util.List<androidx.window.area.WindowAreaInfo>> getWindowAreaInfos();

    public abstract void presentContentOnWindowArea(android.os.Binder token, android.app.Activity activity, java.util.concurrent.Executor executor, androidx.window.area.WindowAreaPresentationSessionCallback windowAreaPresentationSessionCallback);

    public abstract void transferActivityToWindowArea(android.os.Binder token, android.app.Activity activity, java.util.concurrent.Executor executor, androidx.window.area.WindowAreaSessionCallback windowAreaSessionCallback);

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\u0003R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u000e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0014\u001a\u00020\u00048CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/window/area/WindowAreaController$Companion;", "", "<init>", "()V", "Landroidx/window/area/WindowAreaController;", "getOrCreate", "()Landroidx/window/area/WindowAreaController;", "Landroidx/window/area/WindowAreaControllerDecorator;", "overridingDecorator", "", "overrideDecorator", "(Landroidx/window/area/WindowAreaControllerDecorator;)V", "reset", "", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Landroidx/window/area/WindowAreaControllerDecorator;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/Lazy;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.window.area.WindowAreaController getOrCreate() {
            return androidx.window.area.WindowAreaController.Camera2StreamConfigurationMap.decorate((androidx.window.area.WindowAreaController) androidx.window.area.WindowAreaController.getHighResolutionOutputSizeshNQ4ISI.getValue());
        }

        @kotlin.jvm.JvmStatic
        public final void overrideDecorator(androidx.window.area.WindowAreaControllerDecorator overridingDecorator) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overridingDecorator, "");
            androidx.window.area.WindowAreaController.Camera2StreamConfigurationMap = overridingDecorator;
        }

        @kotlin.jvm.JvmStatic
        public final void reset() {
            androidx.window.area.WindowAreaController.Camera2StreamConfigurationMap = androidx.window.area.EmptyDecorator.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.window.area.WindowAreaController getHighSpeedVideoSizes() {
        androidx.window.extensions.area.WindowAreaComponent windowAreaComponent = null;
        try {
            java.lang.ClassLoader classLoader = INSTANCE.getClass().getClassLoader();
            if (classLoader != null) {
                windowAreaComponent = new androidx.window.area.SafeWindowAreaComponentProvider(classLoader).getWindowAreaComponent();
            }
        } catch (java.lang.Throwable unused) {
            androidx.window.core.BuildConfig.INSTANCE.getVerificationMode();
            androidx.window.core.VerificationMode verificationMode = androidx.window.core.VerificationMode.LOG;
        }
        if (android.os.Build.VERSION.SDK_INT > 29 && windowAreaComponent != null && androidx.window.core.ExtensionsUtil.INSTANCE.getSafeVendorApiLevel() >= 3) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(windowAreaComponent);
            return new androidx.window.area.WindowAreaControllerImpl(windowAreaComponent);
        }
        return new androidx.window.area.EmptyWindowAreaControllerImpl();
    }

    @kotlin.jvm.JvmStatic
    public static final void reset() {
        INSTANCE.reset();
    }

    @kotlin.jvm.JvmStatic
    public static final void overrideDecorator(androidx.window.area.WindowAreaControllerDecorator windowAreaControllerDecorator) {
        INSTANCE.overrideDecorator(windowAreaControllerDecorator);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.window.area.WindowAreaController getOrCreate() {
        return INSTANCE.getOrCreate();
    }
}
