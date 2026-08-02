package androidx.view.compose;

@androidx.navigation.Navigator.Name(androidx.view.compose.ComposeNavigator.NAME)
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002'&B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J1\u0010\r\u001a\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u0018R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001b0\u001a8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u001a8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00120!8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%"}, d2 = {"Landroidx/navigation/compose/ComposeNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/compose/ComposeNavigator$Destination;", "<init>", "()V", "", "Landroidx/navigation/NavBackStackEntry;", "entries", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "", "navigate", "(Ljava/util/List;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "createDestination", "()Landroidx/navigation/compose/ComposeNavigator$Destination;", "popUpTo", "", "savedState", "popBackStack", "(Landroidx/navigation/NavBackStackEntry;Z)V", com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase.PATH_ENTRY, "prepareForTransition", "(Landroidx/navigation/NavBackStackEntry;)V", "onTransitionComplete", "Lkotlinx/coroutines/flow/StateFlow;", "", "getTransitionsInProgress$navigation_compose_release", "()Lkotlinx/coroutines/flow/StateFlow;", "transitionsInProgress", "getBackStack", "backStack", "Landroidx/compose/runtime/MutableState;", "isPop", "Landroidx/compose/runtime/MutableState;", "isPop$navigation_compose_release", "()Landroidx/compose/runtime/MutableState;", "Companion", "Destination"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposeNavigator extends androidx.view.Navigator<androidx.navigation.compose.ComposeNavigator.Destination> {
    public static final java.lang.String NAME = "composable";
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> isPop;
    public static final int $stable = 8;

    public ComposeNavigator() {
        super(NAME);
        this.isPop = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<java.util.Set<androidx.view.NavBackStackEntry>> getTransitionsInProgress$navigation_compose_release() {
        return getState().getTransitionsInProgress();
    }

    public final kotlinx.coroutines.flow.StateFlow<java.util.List<androidx.view.NavBackStackEntry>> getBackStack() {
        return getState().getBackStack();
    }

    public final androidx.compose.runtime.MutableState<java.lang.Boolean> isPop$navigation_compose_release() {
        return this.isPop;
    }

    @Override // androidx.view.Navigator
    public final void navigate(java.util.List<androidx.view.NavBackStackEntry> entries, androidx.view.NavOptions navOptions, androidx.navigation.Navigator.Extras navigatorExtras) {
        java.util.Iterator<T> it = entries.iterator();
        while (it.hasNext()) {
            getState().pushWithTransition((androidx.view.NavBackStackEntry) it.next());
        }
        this.isPop.setValue(java.lang.Boolean.FALSE);
    }

    @Override // androidx.view.Navigator
    public final androidx.navigation.compose.ComposeNavigator.Destination createDestination() {
        return new androidx.navigation.compose.ComposeNavigator.Destination(this, androidx.view.compose.ComposableSingletons$ComposeNavigatorKt.INSTANCE.getLambda$127448943$navigation_compose_release());
    }

    @Override // androidx.view.Navigator
    public final void popBackStack(androidx.view.NavBackStackEntry popUpTo, boolean savedState) {
        getState().popWithTransition(popUpTo, savedState);
        this.isPop.setValue(java.lang.Boolean.TRUE);
    }

    public final void prepareForTransition(androidx.view.NavBackStackEntry entry) {
        getState().prepareForTransition(entry);
    }

    public final void onTransitionComplete(androidx.view.NavBackStackEntry entry) {
        getState().markTransitionComplete(entry);
    }

    @kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B8\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012'\u0010\u000b\u001a#\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0002\b\t¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\rB/\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u00070\u000e¢\u0006\u0002\b\t¢\u0006\u0004\b\f\u0010\u000fR;\u0010\u000b\u001a#\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0002\b\t¢\u0006\u0002\b\n8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012RB\u0010\u0015\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u000e¢\u0006\u0002\b\u0007¢\u0006\u0002\b\n8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aRB\u0010\u001c\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u000e¢\u0006\u0002\b\u0007¢\u0006\u0002\b\n8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aRB\u0010\u001f\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u000e¢\u0006\u0002\b\u0007¢\u0006\u0002\b\n8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018\"\u0004\b!\u0010\u001aRB\u0010\"\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u000e¢\u0006\u0002\b\u0007¢\u0006\u0002\b\n8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aRB\u0010&\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0013\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010\u000e¢\u0006\u0002\b\u0007¢\u0006\u0002\b\n8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0016\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010\u001a"}, d2 = {"Landroidx/navigation/compose/ComposeNavigator$Destination;", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/compose/ComposeNavigator;", "navigator", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/navigation/NavBackStackEntry;", "Lkotlin/jvm/JvmSuppressWildcards;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "<init>", "(Landroidx/navigation/compose/ComposeNavigator;Lkotlin/jvm/functions/Function4;)V", "Lkotlin/Function1;", "(Landroidx/navigation/compose/ComposeNavigator;Lkotlin/jvm/functions/Function3;)V", "Lkotlin/jvm/functions/Function4;", "getContent$navigation_compose_release", "()Lkotlin/jvm/functions/Function4;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/EnterTransition;", "enterTransition", "Lkotlin/jvm/functions/Function1;", "getEnterTransition$navigation_compose_release", "()Lkotlin/jvm/functions/Function1;", "setEnterTransition$navigation_compose_release", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/animation/ExitTransition;", "exitTransition", "getExitTransition$navigation_compose_release", "setExitTransition$navigation_compose_release", "popEnterTransition", "getPopEnterTransition$navigation_compose_release", "setPopEnterTransition$navigation_compose_release", "popExitTransition", "getPopExitTransition$navigation_compose_release", "setPopExitTransition$navigation_compose_release", "Landroidx/compose/animation/SizeTransform;", "sizeTransform", "getSizeTransform$navigation_compose_release", "setSizeTransform$navigation_compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Destination extends androidx.view.NavDestination {
        public static final int $stable = 8;
        private final kotlin.jvm.functions.Function4<androidx.compose.animation.AnimatedContentScope, androidx.view.NavBackStackEntry, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> content;
        private kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.view.NavBackStackEntry>, androidx.compose.animation.EnterTransition> enterTransition;
        private kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.view.NavBackStackEntry>, androidx.compose.animation.ExitTransition> exitTransition;
        private kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.view.NavBackStackEntry>, androidx.compose.animation.EnterTransition> popEnterTransition;
        private kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.view.NavBackStackEntry>, androidx.compose.animation.ExitTransition> popExitTransition;
        private kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.view.NavBackStackEntry>, androidx.compose.animation.SizeTransform> sizeTransform;

        public final kotlin.jvm.functions.Function4<androidx.compose.animation.AnimatedContentScope, androidx.view.NavBackStackEntry, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getContent$navigation_compose_release() {
            return this.content;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Destination(androidx.view.compose.ComposeNavigator composeNavigator, kotlin.jvm.functions.Function4<? super androidx.compose.animation.AnimatedContentScope, androidx.view.NavBackStackEntry, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4) {
            super(composeNavigator);
            this.content = function4;
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in favor of Destination that supports AnimatedContent")
        public /* synthetic */ Destination(androidx.view.compose.ComposeNavigator composeNavigator, final kotlin.jvm.functions.Function3 function3) {
            this(composeNavigator, (kotlin.jvm.functions.Function4<? super androidx.compose.animation.AnimatedContentScope, androidx.view.NavBackStackEntry, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1587956030, true, new kotlin.jvm.functions.Function4<androidx.compose.animation.AnimatedContentScope, androidx.view.NavBackStackEntry, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.navigation.compose.ComposeNavigator.Destination.1
                @Override // kotlin.jvm.functions.Function4
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.AnimatedContentScope animatedContentScope, androidx.view.NavBackStackEntry navBackStackEntry, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                    androidx.view.NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
                    androidx.compose.runtime.Composer composer2 = composer;
                    int intValue = num.intValue();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1587956030, intValue, -1, "androidx.navigation.compose.ComposeNavigator.Destination.<init>.<anonymous> (ComposeNavigator.kt:109)");
                    }
                    function3.invoke(navBackStackEntry2, composer2, java.lang.Integer.valueOf((intValue >> 3) & 14));
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }));
        }

        public final kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.view.NavBackStackEntry>, androidx.compose.animation.EnterTransition> getEnterTransition$navigation_compose_release() {
            return this.enterTransition;
        }

        public final void setEnterTransition$navigation_compose_release(kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.view.NavBackStackEntry>, androidx.compose.animation.EnterTransition> function1) {
            this.enterTransition = function1;
        }

        public final kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.view.NavBackStackEntry>, androidx.compose.animation.ExitTransition> getExitTransition$navigation_compose_release() {
            return this.exitTransition;
        }

        public final void setExitTransition$navigation_compose_release(kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.view.NavBackStackEntry>, androidx.compose.animation.ExitTransition> function1) {
            this.exitTransition = function1;
        }

        public final kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.view.NavBackStackEntry>, androidx.compose.animation.EnterTransition> getPopEnterTransition$navigation_compose_release() {
            return this.popEnterTransition;
        }

        public final void setPopEnterTransition$navigation_compose_release(kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.view.NavBackStackEntry>, androidx.compose.animation.EnterTransition> function1) {
            this.popEnterTransition = function1;
        }

        public final kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.view.NavBackStackEntry>, androidx.compose.animation.ExitTransition> getPopExitTransition$navigation_compose_release() {
            return this.popExitTransition;
        }

        public final void setPopExitTransition$navigation_compose_release(kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.view.NavBackStackEntry>, androidx.compose.animation.ExitTransition> function1) {
            this.popExitTransition = function1;
        }

        public final kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.view.NavBackStackEntry>, androidx.compose.animation.SizeTransform> getSizeTransform$navigation_compose_release() {
            return this.sizeTransform;
        }

        public final void setSizeTransform$navigation_compose_release(kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.view.NavBackStackEntry>, androidx.compose.animation.SizeTransform> function1) {
            this.sizeTransform = function1;
        }
    }
}
