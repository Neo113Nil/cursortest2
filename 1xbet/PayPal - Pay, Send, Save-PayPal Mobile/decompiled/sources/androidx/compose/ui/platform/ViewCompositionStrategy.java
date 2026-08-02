package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u0000 \b2\u00020\u0001:\u0005\b\t\n\u000b\fJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy;", "", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "", "installFor", "(Landroidx/compose/ui/platform/AbstractComposeView;)Lkotlin/jvm/functions/Function0;", "Companion", "DisposeOnDetachedFromWindowOrReleasedFromPool", "DisposeOnDetachedFromWindow", "DisposeOnLifecycleDestroyed", "DisposeOnViewTreeLifecycleDestroyed"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ViewCompositionStrategy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.platform.ViewCompositionStrategy.Companion INSTANCE = androidx.compose.ui.platform.ViewCompositionStrategy.Companion.getHighSpeedVideoSizes;

    kotlin.jvm.functions.Function0<kotlin.Unit> installFor(androidx.compose.ui.platform.AbstractComposeView view);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "getDefault", "()Landroidx/compose/ui/platform/ViewCompositionStrategy;", "Default"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.ui.platform.ViewCompositionStrategy.Companion getHighSpeedVideoSizes = new androidx.compose.ui.platform.ViewCompositionStrategy.Companion();

        private Companion() {
        }

        public final androidx.compose.ui.platform.ViewCompositionStrategy getDefault() {
            return androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.INSTANCE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "<init>", "()V", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "", "installFor", "(Landroidx/compose/ui/platform/AbstractComposeView;)Lkotlin/jvm/functions/Function0;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DisposeOnDetachedFromWindowOrReleasedFromPool implements androidx.compose.ui.platform.ViewCompositionStrategy {
        public static final int $stable = 0;
        public static final androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool INSTANCE = new androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool();

        private DisposeOnDetachedFromWindowOrReleasedFromPool() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public final kotlin.jvm.functions.Function0<kotlin.Unit> installFor(final androidx.compose.ui.platform.AbstractComposeView view) {
            final ?? r0 = new android.view.View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(android.view.View v) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(android.view.View v) {
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
                    androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.getHighSpeedVideoFpsRanges(androidx.compose.ui.platform.AbstractComposeView.this);
                }
            };
            androidx.customview.poolingcontainer.PoolingContainer.addPoolingContainerListener(view, poolingContainerListener);
            return new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlin.Unit invoke() {
                    getHighResolutionOutputSizeshNQ4ISI();
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighResolutionOutputSizeshNQ4ISI() {
                    androidx.compose.ui.platform.AbstractComposeView.this.removeOnAttachStateChangeListener(r0);
                    androidx.customview.poolingcontainer.PoolingContainer.removePoolingContainerListener(androidx.compose.ui.platform.AbstractComposeView.this, poolingContainerListener);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void getHighSpeedVideoFpsRanges(androidx.compose.ui.platform.AbstractComposeView abstractComposeView) {
            abstractComposeView.disposeComposition();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnDetachedFromWindow;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "<init>", "()V", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "", "installFor", "(Landroidx/compose/ui/platform/AbstractComposeView;)Lkotlin/jvm/functions/Function0;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DisposeOnDetachedFromWindow implements androidx.compose.ui.platform.ViewCompositionStrategy {
        public static final int $stable = 0;
        public static final androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnDetachedFromWindow INSTANCE = new androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnDetachedFromWindow();

        private DisposeOnDetachedFromWindow() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public final kotlin.jvm.functions.Function0<kotlin.Unit> installFor(final androidx.compose.ui.platform.AbstractComposeView view) {
            final ?? r0 = new android.view.View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(android.view.View v) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(android.view.View v) {
                    androidx.compose.ui.platform.AbstractComposeView.this.disposeComposition();
                }
            };
            view.addOnAttachStateChangeListener((android.view.View.OnAttachStateChangeListener) r0);
            return new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1
                public final void getHighResolutionOutputSizeshNQ4ISI() {
                    androidx.compose.ui.platform.AbstractComposeView.this.removeOnAttachStateChangeListener(r0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlin.Unit invoke() {
                    getHighResolutionOutputSizeshNQ4ISI();
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            };
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnLifecycleDestroyed;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "Landroidx/lifecycle/Lifecycle;", com.paypal.oslo.core.telemetry.AppLifecycleConstants.FEATURE, "<init>", "(Landroidx/lifecycle/Lifecycle;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "", "installFor", "(Landroidx/compose/ui/platform/AbstractComposeView;)Lkotlin/jvm/functions/Function0;", "Camera2StreamConfigurationMap", "Landroidx/lifecycle/Lifecycle;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DisposeOnLifecycleDestroyed implements androidx.compose.ui.platform.ViewCompositionStrategy {
        public static final int $stable = 8;

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final androidx.view.Lifecycle getHighResolutionOutputSizeshNQ4ISI;

        public DisposeOnLifecycleDestroyed(androidx.view.Lifecycle lifecycle) {
            this.getHighResolutionOutputSizeshNQ4ISI = lifecycle;
        }

        public DisposeOnLifecycleDestroyed(androidx.view.LifecycleOwner lifecycleOwner) {
            this(lifecycleOwner.getLifecycleRegistry());
        }

        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public final kotlin.jvm.functions.Function0<kotlin.Unit> installFor(androidx.compose.ui.platform.AbstractComposeView view) {
            kotlin.jvm.functions.Function0<kotlin.Unit> highResolutionOutputSizeshNQ4ISI;
            highResolutionOutputSizeshNQ4ISI = androidx.compose.ui.platform.ViewCompositionStrategy_androidKt.getHighResolutionOutputSizeshNQ4ISI(view, this.getHighResolutionOutputSizeshNQ4ISI);
            return highResolutionOutputSizeshNQ4ISI;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "<init>", "()V", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "", "installFor", "(Landroidx/compose/ui/platform/AbstractComposeView;)Lkotlin/jvm/functions/Function0;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DisposeOnViewTreeLifecycleDestroyed implements androidx.compose.ui.platform.ViewCompositionStrategy {
        public static final int $stable = 0;
        public static final androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed INSTANCE = new androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed();

        private DisposeOnViewTreeLifecycleDestroyed() {
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1] */
        /* JADX WARN: Type inference failed for: r2v2, types: [T, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public final kotlin.jvm.functions.Function0<kotlin.Unit> installFor(final androidx.compose.ui.platform.AbstractComposeView view) {
            kotlin.jvm.functions.Function0<kotlin.Unit> highResolutionOutputSizeshNQ4ISI;
            if (view.isAttachedToWindow()) {
                androidx.view.LifecycleOwner lifecycleOwner = androidx.view.C0276ViewTreeLifecycleOwner.get(view);
                if (lifecycleOwner != null) {
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.ui.platform.ViewCompositionStrategy_androidKt.getHighResolutionOutputSizeshNQ4ISI(view, lifecycleOwner.getLifecycleRegistry());
                    return highResolutionOutputSizeshNQ4ISI;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("View tree for ");
                sb.append(view);
                sb.append(" has no ViewTreeLifecycleOwner");
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(sb.toString());
                throw new kotlin.KotlinNothingValueException();
            }
            final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            final ?? r1 = new android.view.View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(android.view.View v) {
                }

                /* JADX WARN: Type inference failed for: r3v8, types: [T, kotlin.jvm.functions.Function0] */
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(android.view.View v) {
                    ?? highResolutionOutputSizeshNQ4ISI2;
                    androidx.view.LifecycleOwner lifecycleOwner2 = androidx.view.C0276ViewTreeLifecycleOwner.get(androidx.compose.ui.platform.AbstractComposeView.this);
                    androidx.compose.ui.platform.AbstractComposeView abstractComposeView = androidx.compose.ui.platform.AbstractComposeView.this;
                    if (lifecycleOwner2 == null) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("View tree for ");
                        sb2.append(abstractComposeView);
                        sb2.append(" has no ViewTreeLifecycleOwner");
                        androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(sb2.toString());
                        throw new kotlin.KotlinNothingValueException();
                    }
                    kotlin.jvm.internal.Ref.ObjectRef<kotlin.jvm.functions.Function0<kotlin.Unit>> objectRef2 = objectRef;
                    highResolutionOutputSizeshNQ4ISI2 = androidx.compose.ui.platform.ViewCompositionStrategy_androidKt.getHighResolutionOutputSizeshNQ4ISI(abstractComposeView, lifecycleOwner2.getLifecycleRegistry());
                    objectRef2.element = highResolutionOutputSizeshNQ4ISI2;
                    androidx.compose.ui.platform.AbstractComposeView.this.removeOnAttachStateChangeListener(this);
                }
            };
            view.addOnAttachStateChangeListener((android.view.View.OnAttachStateChangeListener) r1);
            objectRef.element = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1
                public final void getHighResolutionOutputSizeshNQ4ISI() {
                    androidx.compose.ui.platform.AbstractComposeView.this.removeOnAttachStateChangeListener(r1);
                }

                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlin.Unit invoke() {
                    getHighResolutionOutputSizeshNQ4ISI();
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            };
            return new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2
                public final void getHighResolutionOutputSizeshNQ4ISI() {
                    objectRef.element.invoke();
                }

                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlin.Unit invoke() {
                    getHighResolutionOutputSizeshNQ4ISI();
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            };
        }
    }
}
