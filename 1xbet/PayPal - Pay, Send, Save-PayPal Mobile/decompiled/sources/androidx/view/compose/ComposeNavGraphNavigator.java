package androidx.view.compose;

@androidx.navigation.Navigator.Name("navigation")
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/navigation/compose/ComposeNavGraphNavigator;", "Landroidx/navigation/NavGraphNavigator;", "Landroidx/navigation/NavigatorProvider;", "navigatorProvider", "<init>", "(Landroidx/navigation/NavigatorProvider;)V", "Landroidx/navigation/NavGraph;", "createDestination", "()Landroidx/navigation/NavGraph;", "ComposeNavGraph"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposeNavGraphNavigator extends androidx.view.NavGraphNavigator {
    public static final int $stable = 8;

    @Override // androidx.view.NavGraphNavigator, androidx.view.Navigator
    public final /* bridge */ /* synthetic */ androidx.view.NavGraph createDestination() {
        return createDestination();
    }

    public ComposeNavGraphNavigator(androidx.view.NavigatorProvider navigatorProvider) {
        super(navigatorProvider);
    }

    @Override // androidx.view.NavGraphNavigator, androidx.view.Navigator
    public final androidx.view.NavGraph createDestination() {
        return new androidx.navigation.compose.ComposeNavGraphNavigator.ComposeNavGraph(this);
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005RB\u0010\f\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011RB\u0010\u0013\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0006¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011RB\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011RB\u0010\u0019\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0006¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011RB\u0010\u001d\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010\u0006¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011"}, d2 = {"Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;", "Landroidx/navigation/NavGraph;", "Landroidx/navigation/Navigator;", "navGraphNavigator", "<init>", "(Landroidx/navigation/Navigator;)V", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation/NavBackStackEntry;", "Landroidx/compose/animation/EnterTransition;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ExtensionFunctionType;", "enterTransition", "Lkotlin/jvm/functions/Function1;", "getEnterTransition$navigation_compose_release", "()Lkotlin/jvm/functions/Function1;", "setEnterTransition$navigation_compose_release", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/animation/ExitTransition;", "exitTransition", "getExitTransition$navigation_compose_release", "setExitTransition$navigation_compose_release", "popEnterTransition", "getPopEnterTransition$navigation_compose_release", "setPopEnterTransition$navigation_compose_release", "popExitTransition", "getPopExitTransition$navigation_compose_release", "setPopExitTransition$navigation_compose_release", "Landroidx/compose/animation/SizeTransform;", "sizeTransform", "getSizeTransform$navigation_compose_release", "setSizeTransform$navigation_compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class ComposeNavGraph extends androidx.view.NavGraph {
        public static final int $stable = 8;
        private kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.view.NavBackStackEntry>, androidx.compose.animation.EnterTransition> enterTransition;
        private kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.view.NavBackStackEntry>, androidx.compose.animation.ExitTransition> exitTransition;
        private kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.view.NavBackStackEntry>, androidx.compose.animation.EnterTransition> popEnterTransition;
        private kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.view.NavBackStackEntry>, androidx.compose.animation.ExitTransition> popExitTransition;
        private kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.view.NavBackStackEntry>, androidx.compose.animation.SizeTransform> sizeTransform;

        public ComposeNavGraph(androidx.view.Navigator<? extends androidx.view.NavGraph> navigator) {
            super(navigator);
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
