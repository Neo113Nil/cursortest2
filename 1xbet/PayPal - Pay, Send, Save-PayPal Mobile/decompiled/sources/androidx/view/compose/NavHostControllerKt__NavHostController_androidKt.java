package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0005\u001a\u00020\u00042\"\u0010\u0003\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010\u0000\"\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "p0", "Landroidx/navigation/NavHostController;", "rememberNavController", "([Landroidx/navigation/Navigator;Landroidx/compose/runtime/Composer;I)Landroidx/navigation/NavHostController;", "Landroid/content/Context;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/content/Context;)Landroidx/navigation/NavHostController;"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/navigation/compose/NavHostControllerKt")
/* loaded from: classes7.dex */
final /* synthetic */ class NavHostControllerKt__NavHostController_androidKt {
    public static final androidx.view.NavHostController rememberNavController(androidx.view.Navigator<? extends androidx.view.NavDestination>[] navigatorArr, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-342848815, i, -1, "androidx.navigation.compose.rememberNavController (NavHostController.android.kt:33)");
        }
        final android.content.Context context = (android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(navigatorArr, navigatorArr.length);
        androidx.compose.runtime.saveable.Saver Saver = androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2() { // from class: androidx.navigation.compose.NavHostControllerKt__NavHostController_androidKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                android.os.Bundle saveState;
                saveState = ((androidx.view.NavHostController) obj2).saveState();
                return saveState;
            }
        }, new kotlin.jvm.functions.Function1() { // from class: androidx.navigation.compose.NavHostControllerKt__NavHostController_androidKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.view.compose.NavHostControllerKt__NavHostController_androidKt.getHighSpeedVideoSizes(context, (android.os.Bundle) obj);
            }
        });
        boolean changedInstance = composer.changedInstance(context);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.navigation.compose.NavHostControllerKt__NavHostController_androidKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.view.NavHostController highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.view.compose.NavHostControllerKt__NavHostController_androidKt.getHighResolutionOutputSizeshNQ4ISI(context);
                    return highResolutionOutputSizeshNQ4ISI;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.view.NavHostController navHostController = (androidx.view.NavHostController) androidx.compose.runtime.saveable.RememberSaveableKt.m5464rememberSaveable(copyOf, Saver, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0, 4);
        for (androidx.view.Navigator<? extends androidx.view.NavDestination> navigator : navigatorArr) {
            navHostController.getNavigatorProvider().addNavigator(navigator);
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return navHostController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.view.NavHostController getHighResolutionOutputSizeshNQ4ISI(android.content.Context context) {
        androidx.view.NavHostController navHostController = new androidx.view.NavHostController(context);
        navHostController.getNavigatorProvider().addNavigator(new androidx.view.compose.ComposeNavGraphNavigator(navHostController.getNavigatorProvider()));
        navHostController.getNavigatorProvider().addNavigator(new androidx.view.compose.ComposeNavigator());
        navHostController.getNavigatorProvider().addNavigator(new androidx.view.compose.DialogNavigator());
        return navHostController;
    }

    public static /* synthetic */ androidx.view.NavHostController getHighSpeedVideoSizes(android.content.Context context, android.os.Bundle bundle) {
        androidx.view.NavHostController highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(context);
        highResolutionOutputSizeshNQ4ISI.restoreState(bundle);
        return highResolutionOutputSizeshNQ4ISI;
    }
}
