package androidx.compose.ui.platform;

/* compiled from: ViewCompositionStrategy.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u00072\u00020\u0001:\u0005\u0007\b\t\n\u000bJ\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy;", "", "installFor", "Lkotlin/Function0;", "", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroidx/compose/ui/platform/AbstractComposeView;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "DisposeOnDetachedFromWindow", "DisposeOnDetachedFromWindowOrReleasedFromPool", "DisposeOnLifecycleDestroyed", "DisposeOnViewTreeLifecycleDestroyed", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ViewCompositionStrategy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.platform.ViewCompositionStrategy.Companion INSTANCE = androidx.compose.ui.platform.ViewCompositionStrategy.Companion.$$INSTANCE;

    kotlin.jvm.functions.Function0<kotlin.Unit> installFor(androidx.compose.ui.platform.AbstractComposeView view);

    /* compiled from: ViewCompositionStrategy.android.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$Companion;", "", "()V", androidx.webkit.Profile.DEFAULT_PROFILE_NAME, "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "getDefault", "()Landroidx/compose/ui/platform/ViewCompositionStrategy;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.ui.platform.ViewCompositionStrategy.Companion $$INSTANCE = new androidx.compose.ui.platform.ViewCompositionStrategy.Companion();

        private Companion() {
        }

        public final androidx.compose.ui.platform.ViewCompositionStrategy getDefault() {
            return androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.INSTANCE;
        }
    }

    /* compiled from: ViewCompositionStrategy.android.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "()V", "installFor", "Lkotlin/Function0;", "", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroidx/compose/ui/platform/AbstractComposeView;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DisposeOnDetachedFromWindowOrReleasedFromPool implements androidx.compose.ui.platform.ViewCompositionStrategy {
        public static final int $stable = 0;
        public static final androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool INSTANCE = new androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool();

        private DisposeOnDetachedFromWindowOrReleasedFromPool() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public kotlin.jvm.functions.Function0<kotlin.Unit> installFor(final androidx.compose.ui.platform.AbstractComposeView view) {
            final ?? r0 = new android.view.View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(android.view.View v) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(android.view.View v) {
                    if (androidx.customview.poolingcontainer.PoolingContainer.isWithinPoolingContainer(androidx.compose.ui.platform.AbstractComposeView.this)) {
                        return;
                    }
                    androidx.compose.ui.platform.AbstractComposeView.this.disposeComposition();
                }
            };
            view.addOnAttachStateChangeListener((android.view.View.OnAttachStateChangeListener) r0);
            final androidx.customview.poolingcontainer.PoolingContainerListener poolingContainerListener = new androidx.customview.poolingcontainer.PoolingContainerListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$$ExternalSyntheticLambda0
                @Override // androidx.customview.poolingcontainer.PoolingContainerListener
                public final void onRelease() {
                    androidx.compose.ui.platform.AbstractComposeView.this.disposeComposition();
                }
            };
            androidx.customview.poolingcontainer.PoolingContainer.addPoolingContainerListener(view, poolingContainerListener);
            return new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    androidx.compose.ui.platform.AbstractComposeView.this.removeOnAttachStateChangeListener(r0);
                    androidx.customview.poolingcontainer.PoolingContainer.removePoolingContainerListener(androidx.compose.ui.platform.AbstractComposeView.this, poolingContainerListener);
                }
            };
        }
    }

    /* compiled from: ViewCompositionStrategy.android.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnDetachedFromWindow;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "()V", "installFor", "Lkotlin/Function0;", "", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroidx/compose/ui/platform/AbstractComposeView;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DisposeOnDetachedFromWindow implements androidx.compose.ui.platform.ViewCompositionStrategy {
        public static final int $stable = 0;
        public static final androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnDetachedFromWindow INSTANCE = new androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnDetachedFromWindow();

        private DisposeOnDetachedFromWindow() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public kotlin.jvm.functions.Function0<kotlin.Unit> installFor(final androidx.compose.ui.platform.AbstractComposeView view) {
            final ?? r0 = new android.view.View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(android.view.View v) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(android.view.View v) {
                    androidx.compose.ui.platform.AbstractComposeView.this.disposeComposition();
                }
            };
            view.addOnAttachStateChangeListener((android.view.View.OnAttachStateChangeListener) r0);
            return new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    androidx.compose.ui.platform.AbstractComposeView.this.removeOnAttachStateChangeListener(r0);
                }
            };
        }
    }

    /* compiled from: ViewCompositionStrategy.android.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnLifecycleDestroyed;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;)V", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "(Landroidx/lifecycle/Lifecycle;)V", "installFor", "Lkotlin/Function0;", "", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroidx/compose/ui/platform/AbstractComposeView;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DisposeOnLifecycleDestroyed implements androidx.compose.ui.platform.ViewCompositionStrategy {
        public static final int $stable = 8;
        private final androidx.lifecycle.Lifecycle lifecycle;

        public DisposeOnLifecycleDestroyed(androidx.lifecycle.Lifecycle lifecycle) {
            this.lifecycle = lifecycle;
        }

        public DisposeOnLifecycleDestroyed(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
            this(lifecycleOwner.getLifecycle());
        }

        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public kotlin.jvm.functions.Function0<kotlin.Unit> installFor(androidx.compose.ui.platform.AbstractComposeView view) {
            kotlin.jvm.functions.Function0<kotlin.Unit> installForLifecycle;
            installForLifecycle = androidx.compose.ui.platform.ViewCompositionStrategy_androidKt.installForLifecycle(view, this.lifecycle);
            return installForLifecycle;
        }
    }

    /* compiled from: ViewCompositionStrategy.android.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "()V", "installFor", "Lkotlin/Function0;", "", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroidx/compose/ui/platform/AbstractComposeView;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DisposeOnViewTreeLifecycleDestroyed implements androidx.compose.ui.platform.ViewCompositionStrategy {
        public static final int $stable = 0;
        public static final androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed INSTANCE = new androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed();

        private DisposeOnViewTreeLifecycleDestroyed() {
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1] */
        /* JADX WARN: Type inference failed for: r2v2, types: [T, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public kotlin.jvm.functions.Function0<kotlin.Unit> installFor(final androidx.compose.ui.platform.AbstractComposeView view) {
            kotlin.jvm.functions.Function0<kotlin.Unit> installForLifecycle;
            if (view.isAttachedToWindow()) {
                androidx.lifecycle.LifecycleOwner lifecycleOwner = androidx.lifecycle.ViewTreeLifecycleOwner.get(view);
                if (lifecycleOwner != null) {
                    installForLifecycle = androidx.compose.ui.platform.ViewCompositionStrategy_androidKt.installForLifecycle(view, lifecycleOwner.getLifecycle());
                    return installForLifecycle;
                }
                throw new java.lang.IllegalStateException(("View tree for " + view + " has no ViewTreeLifecycleOwner").toString());
            }
            final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            final ?? r1 = new android.view.View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(android.view.View v) {
                }

                /* JADX WARN: Type inference failed for: r3v8, types: [T, kotlin.jvm.functions.Function0] */
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(android.view.View v) {
                    ?? installForLifecycle2;
                    androidx.lifecycle.LifecycleOwner lifecycleOwner2 = androidx.lifecycle.ViewTreeLifecycleOwner.get(androidx.compose.ui.platform.AbstractComposeView.this);
                    androidx.compose.ui.platform.AbstractComposeView abstractComposeView = androidx.compose.ui.platform.AbstractComposeView.this;
                    if (lifecycleOwner2 == null) {
                        throw new java.lang.IllegalStateException(("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner").toString());
                    }
                    kotlin.jvm.internal.Ref.ObjectRef<kotlin.jvm.functions.Function0<kotlin.Unit>> objectRef2 = objectRef;
                    installForLifecycle2 = androidx.compose.ui.platform.ViewCompositionStrategy_androidKt.installForLifecycle(abstractComposeView, lifecycleOwner2.getLifecycle());
                    objectRef2.element = installForLifecycle2;
                    androidx.compose.ui.platform.AbstractComposeView.this.removeOnAttachStateChangeListener(this);
                }
            };
            view.addOnAttachStateChangeListener((android.view.View.OnAttachStateChangeListener) r1);
            objectRef.element = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    androidx.compose.ui.platform.AbstractComposeView.this.removeOnAttachStateChangeListener(r1);
                }
            };
            return new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    objectRef.element.invoke();
                }
            };
        }
    }
}
