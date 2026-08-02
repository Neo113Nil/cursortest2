package androidx.view.viewmodel.compose;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00048G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;", "", "<init>", "()V", "Landroidx/lifecycle/ViewModelStoreOwner;", "viewModelStoreOwner", "Landroidx/compose/runtime/ProvidedValue;", "provides", "(Landroidx/lifecycle/ViewModelStoreOwner;)Landroidx/compose/runtime/ProvidedValue;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getHighSpeedVideoFpsRangesFor", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;", "current"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LocalViewModelStoreOwner {
    public static final int $stable = 0;
    public static final androidx.view.viewmodel.compose.LocalViewModelStoreOwner INSTANCE = new androidx.view.viewmodel.compose.LocalViewModelStoreOwner();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.view.ViewModelStoreOwner> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.CompositionLocalKt.compositionLocalOf$default(null, new kotlin.jvm.functions.Function0() { // from class: androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$r8$lambda$For33KFhRo2iOdv6DNLDS74_FTI();
        }
    }, 1, null);

    public static /* synthetic */ androidx.view.ViewModelStoreOwner $r8$lambda$For33KFhRo2iOdv6DNLDS74_FTI() {
        return null;
    }

    private LocalViewModelStoreOwner() {
    }

    public final androidx.view.ViewModelStoreOwner getCurrent(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-584162872, i, -1, "androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.<get-current> (LocalViewModelStoreOwner.kt:35)");
        }
        androidx.view.ViewModelStoreOwner viewModelStoreOwner = (androidx.view.ViewModelStoreOwner) composer.consume(getHighSpeedVideoFpsRangesFor);
        if (viewModelStoreOwner == null) {
            composer.startReplaceGroup(1260197608);
            viewModelStoreOwner = androidx.view.viewmodel.compose.LocalViewModelStoreOwner_androidKt.findDefaultViewModelStoreOwner(composer, 0);
        } else {
            composer.startReplaceGroup(1260196492);
        }
        composer.endReplaceGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return viewModelStoreOwner;
    }

    public final androidx.compose.runtime.ProvidedValue<androidx.view.ViewModelStoreOwner> provides(androidx.view.ViewModelStoreOwner viewModelStoreOwner) {
        return getHighSpeedVideoFpsRangesFor.provides(viewModelStoreOwner);
    }
}
