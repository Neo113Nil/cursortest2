package androidx.view.compose;

@androidx.navigation.Navigator.Name(androidx.view.compose.DialogNavigator.NAME)
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002#\"B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0010\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001a\u0010\tR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u001b8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001f0\u001b8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001d"}, d2 = {"Landroidx/navigation/compose/DialogNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/compose/DialogNavigator$Destination;", "<init>", "()V", "Landroidx/navigation/NavBackStackEntry;", "backStackEntry", "", "dismiss$navigation_compose_release", "(Landroidx/navigation/NavBackStackEntry;)V", "", "entries", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "navigate", "(Ljava/util/List;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "createDestination", "()Landroidx/navigation/compose/DialogNavigator$Destination;", "popUpTo", "", "savedState", "popBackStack", "(Landroidx/navigation/NavBackStackEntry;Z)V", com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase.PATH_ENTRY, "onTransitionComplete$navigation_compose_release", "Lkotlinx/coroutines/flow/StateFlow;", "getBackStack$navigation_compose_release", "()Lkotlinx/coroutines/flow/StateFlow;", "backStack", "", "getTransitionInProgress$navigation_compose_release", "transitionInProgress", "Companion", "Destination"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DialogNavigator extends androidx.view.Navigator<androidx.navigation.compose.DialogNavigator.Destination> {
    public static final java.lang.String NAME = "dialog";
    public static final int $stable = 8;

    public DialogNavigator() {
        super(NAME);
    }

    public final kotlinx.coroutines.flow.StateFlow<java.util.List<androidx.view.NavBackStackEntry>> getBackStack$navigation_compose_release() {
        return getState().getBackStack();
    }

    public final kotlinx.coroutines.flow.StateFlow<java.util.Set<androidx.view.NavBackStackEntry>> getTransitionInProgress$navigation_compose_release() {
        return getState().getTransitionsInProgress();
    }

    public final void dismiss$navigation_compose_release(androidx.view.NavBackStackEntry backStackEntry) {
        popBackStack(backStackEntry, false);
    }

    @Override // androidx.view.Navigator
    public final void navigate(java.util.List<androidx.view.NavBackStackEntry> entries, androidx.view.NavOptions navOptions, androidx.navigation.Navigator.Extras navigatorExtras) {
        java.util.Iterator<T> it = entries.iterator();
        while (it.hasNext()) {
            getState().push((androidx.view.NavBackStackEntry) it.next());
        }
    }

    @Override // androidx.view.Navigator
    public final androidx.navigation.compose.DialogNavigator.Destination createDestination() {
        return new androidx.navigation.compose.DialogNavigator.Destination(this, null, androidx.view.compose.ComposableSingletons$DialogNavigatorKt.INSTANCE.m9195getLambda$1092249270$navigation_compose_release(), 2, null);
    }

    @Override // androidx.view.Navigator
    public final void popBackStack(androidx.view.NavBackStackEntry popUpTo, boolean savedState) {
        getState().popWithTransition(popUpTo, savedState);
        int indexOf = kotlin.collections.CollectionsKt.indexOf(getState().getTransitionsInProgress().getValue(), popUpTo);
        int i = 0;
        for (java.lang.Object obj : getState().getTransitionsInProgress().getValue()) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            androidx.view.NavBackStackEntry navBackStackEntry = (androidx.view.NavBackStackEntry) obj;
            if (i > indexOf) {
                onTransitionComplete$navigation_compose_release(navBackStackEntry);
            }
            i++;
        }
    }

    public final void onTransitionComplete$navigation_compose_release(androidx.view.NavBackStackEntry entry) {
        getState().markTransitionComplete(entry);
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B2\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R+\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/navigation/compose/DialogNavigator$Destination;", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/FloatingWindow;", "Landroidx/navigation/compose/DialogNavigator;", "navigator", "Landroidx/compose/ui/window/DialogProperties;", "dialogProperties", "Lkotlin/Function1;", "Landroidx/navigation/NavBackStackEntry;", "", "Landroidx/compose/runtime/Composable;", "content", "<init>", "(Landroidx/navigation/compose/DialogNavigator;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function3;)V", "Landroidx/compose/ui/window/DialogProperties;", "getDialogProperties$navigation_compose_release", "()Landroidx/compose/ui/window/DialogProperties;", "Lkotlin/jvm/functions/Function3;", "getContent$navigation_compose_release", "()Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Destination extends androidx.view.NavDestination implements androidx.view.FloatingWindow {
        public static final int $stable = 8;
        private final kotlin.jvm.functions.Function3<androidx.view.NavBackStackEntry, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> content;
        private final androidx.compose.ui.window.DialogProperties dialogProperties;

        public /* synthetic */ Destination(androidx.view.compose.DialogNavigator dialogNavigator, androidx.compose.ui.window.DialogProperties dialogProperties, kotlin.jvm.functions.Function3 function3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(dialogNavigator, (i & 2) != 0 ? new androidx.compose.ui.window.DialogProperties(false, false, false, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null) : dialogProperties, function3);
        }

        /* renamed from: getDialogProperties$navigation_compose_release, reason: from getter */
        public final androidx.compose.ui.window.DialogProperties getDialogProperties() {
            return this.dialogProperties;
        }

        public final kotlin.jvm.functions.Function3<androidx.view.NavBackStackEntry, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getContent$navigation_compose_release() {
            return this.content;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Destination(androidx.view.compose.DialogNavigator dialogNavigator, androidx.compose.ui.window.DialogProperties dialogProperties, kotlin.jvm.functions.Function3<? super androidx.view.NavBackStackEntry, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3) {
            super(dialogNavigator);
            this.dialogProperties = dialogProperties;
            this.content = function3;
        }
    }
}
