package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/WindowRecomposerFactory;", "", "Landroid/view/View;", "windowRootView", "Landroidx/compose/runtime/Recomposer;", "createRecomposer", "(Landroid/view/View;)Landroidx/compose/runtime/Recomposer;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface WindowRecomposerFactory {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.platform.WindowRecomposerFactory.Companion INSTANCE = androidx.compose.ui.platform.WindowRecomposerFactory.Companion.getHighResolutionOutputSizeshNQ4ISI;

    androidx.compose.runtime.Recomposer createRecomposer(android.view.View windowRootView);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/platform/WindowRecomposerFactory$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/platform/WindowRecomposerFactory;", "LifecycleAware", "Landroidx/compose/ui/platform/WindowRecomposerFactory;", "getLifecycleAware", "()Landroidx/compose/ui/platform/WindowRecomposerFactory;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.ui.platform.WindowRecomposerFactory.Companion getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.ui.platform.WindowRecomposerFactory.Companion();
        private static final androidx.compose.ui.platform.WindowRecomposerFactory LifecycleAware = new androidx.compose.ui.platform.WindowRecomposerFactory() { // from class: androidx.compose.ui.platform.WindowRecomposerFactory$Companion$$ExternalSyntheticLambda0
            @Override // androidx.compose.ui.platform.WindowRecomposerFactory
            public final androidx.compose.runtime.Recomposer createRecomposer(android.view.View view) {
                androidx.compose.runtime.Recomposer createLifecycleAwareWindowRecomposer$default;
                createLifecycleAwareWindowRecomposer$default = androidx.compose.ui.platform.WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer$default(view, null, null, 3, null);
                return createLifecycleAwareWindowRecomposer$default;
            }
        };

        private Companion() {
        }

        public final androidx.compose.ui.platform.WindowRecomposerFactory getLifecycleAware() {
            return LifecycleAware;
        }
    }
}
