package androidx.compose.ui.platform;

/* compiled from: WindowRecomposer.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bç\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/WindowRecomposerFactory;", "", "createRecomposer", "Landroidx/compose/runtime/Recomposer;", "windowRootView", "Landroid/view/View;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface WindowRecomposerFactory {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.platform.WindowRecomposerFactory.Companion INSTANCE = androidx.compose.ui.platform.WindowRecomposerFactory.Companion.$$INSTANCE;

    androidx.compose.runtime.Recomposer createRecomposer(android.view.View windowRootView);

    /* compiled from: WindowRecomposer.android.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\u00020\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/WindowRecomposerFactory$Companion;", "", "()V", "LifecycleAware", "Landroidx/compose/ui/platform/WindowRecomposerFactory;", "getLifecycleAware$annotations", "getLifecycleAware", "()Landroidx/compose/ui/platform/WindowRecomposerFactory;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.ui.platform.WindowRecomposerFactory.Companion $$INSTANCE = new androidx.compose.ui.platform.WindowRecomposerFactory.Companion();
        private static final androidx.compose.ui.platform.WindowRecomposerFactory LifecycleAware = new androidx.compose.ui.platform.WindowRecomposerFactory() { // from class: androidx.compose.ui.platform.WindowRecomposerFactory$Companion$$ExternalSyntheticLambda0
            @Override // androidx.compose.ui.platform.WindowRecomposerFactory
            public final androidx.compose.runtime.Recomposer createRecomposer(android.view.View view) {
                androidx.compose.runtime.Recomposer LifecycleAware$lambda$0;
                LifecycleAware$lambda$0 = androidx.compose.ui.platform.WindowRecomposerFactory.Companion.LifecycleAware$lambda$0(view);
                return LifecycleAware$lambda$0;
            }
        };

        public static /* synthetic */ void getLifecycleAware$annotations() {
        }

        private Companion() {
        }

        public final androidx.compose.ui.platform.WindowRecomposerFactory getLifecycleAware() {
            return LifecycleAware;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.runtime.Recomposer LifecycleAware$lambda$0(android.view.View view) {
            return androidx.compose.ui.platform.WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer$default(view, null, null, 3, null);
        }
    }
}
