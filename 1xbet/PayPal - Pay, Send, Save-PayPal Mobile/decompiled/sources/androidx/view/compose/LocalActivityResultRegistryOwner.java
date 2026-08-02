package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00048G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/activity/compose/LocalActivityResultRegistryOwner;", "", "<init>", "()V", "Landroidx/activity/result/ActivityResultRegistryOwner;", "registryOwner", "Landroidx/compose/runtime/ProvidedValue;", "provides", "(Landroidx/activity/result/ActivityResultRegistryOwner;)Landroidx/compose/runtime/ProvidedValue;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Camera2StreamConfigurationMap", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Landroidx/activity/result/ActivityResultRegistryOwner;", "current"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LocalActivityResultRegistryOwner {
    public static final int $stable = 0;
    public static final androidx.view.compose.LocalActivityResultRegistryOwner INSTANCE = new androidx.view.compose.LocalActivityResultRegistryOwner();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.view.result.ActivityResultRegistryOwner> Camera2StreamConfigurationMap = androidx.compose.runtime.CompositionLocalKt.compositionLocalOf$default(null, new kotlin.jvm.functions.Function0() { // from class: androidx.activity.compose.LocalActivityResultRegistryOwner$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return androidx.view.compose.LocalActivityResultRegistryOwner.$r8$lambda$wBFRk42QbGMzH6KGUFS_2JEBCf4();
        }
    }, 1, null);

    public static /* synthetic */ androidx.view.result.ActivityResultRegistryOwner $r8$lambda$wBFRk42QbGMzH6KGUFS_2JEBCf4() {
        return null;
    }

    private LocalActivityResultRegistryOwner() {
    }

    public final androidx.view.result.ActivityResultRegistryOwner getCurrent(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1418020823, i, -1, "androidx.activity.compose.LocalActivityResultRegistryOwner.<get-current> (ActivityResultRegistry.kt:48)");
        }
        androidx.view.result.ActivityResultRegistryOwner activityResultRegistryOwner = (androidx.view.result.ActivityResultRegistryOwner) composer.consume(Camera2StreamConfigurationMap);
        if (activityResultRegistryOwner == null) {
            composer.startReplaceGroup(1213380307);
            java.lang.Object obj = (android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            while (true) {
                if (!(obj instanceof android.content.ContextWrapper)) {
                    obj = null;
                    break;
                }
                if (obj instanceof androidx.view.result.ActivityResultRegistryOwner) {
                    break;
                }
                obj = ((android.content.ContextWrapper) obj).getBaseContext();
            }
            activityResultRegistryOwner = (androidx.view.result.ActivityResultRegistryOwner) obj;
        } else {
            composer.startReplaceGroup(1213379439);
        }
        composer.endReplaceGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return activityResultRegistryOwner;
    }

    public final androidx.compose.runtime.ProvidedValue<androidx.view.result.ActivityResultRegistryOwner> provides(androidx.view.result.ActivityResultRegistryOwner registryOwner) {
        return Camera2StreamConfigurationMap.provides(registryOwner);
    }
}
