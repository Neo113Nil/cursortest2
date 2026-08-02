package com.ingo.sdk.kotlin.common.extension;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000e"}, d2 = {"Landroidx/navigation/NavController;", "", "resId", "Landroid/os/Bundle;", "args", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "", "navigateSafe", "(Landroidx/navigation/NavController;ILandroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "Landroidx/navigation/NavDirections;", "directions", "(Landroidx/navigation/NavController;Landroidx/navigation/NavDirections;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NavControllerKt {
    public static /* synthetic */ void navigateSafe$default(androidx.view.NavController navController, int i, android.os.Bundle bundle, androidx.view.NavOptions navOptions, androidx.navigation.Navigator.Extras extras, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        if ((i2 & 4) != 0) {
            navOptions = null;
        }
        if ((i2 & 8) != 0) {
            extras = null;
        }
        navigateSafe(navController, i, bundle, navOptions, extras);
    }

    public static final void navigateSafe(androidx.view.NavController navController, int i, android.os.Bundle bundle, androidx.view.NavOptions navOptions, androidx.navigation.Navigator.Extras extras) {
        androidx.view.NavAction action;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navController, "");
        androidx.view.NavDestination currentDestination = navController.getCurrentDestination();
        if (currentDestination == null || (action = currentDestination.getAction(i)) == null) {
            action = navController.getGraph().getAction(i);
        }
        if (action != null) {
            androidx.view.NavDestination currentDestination2 = navController.getCurrentDestination();
            if (currentDestination2 == null || currentDestination2.getId() != action.getDestinationId()) {
                navController.navigate(i, bundle, navOptions, extras);
            }
        }
    }

    public static final void navigateSafe(androidx.view.NavController navController, androidx.view.NavDirections navDirections) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navDirections, "");
        androidx.view.NavDestination currentDestination = navController.getCurrentDestination();
        androidx.view.NavAction action = currentDestination != null ? currentDestination.getAction(navDirections.getActionId()) : null;
        if (action != null) {
            androidx.view.NavDestination currentDestination2 = navController.getCurrentDestination();
            if (currentDestination2 == null || currentDestination2.getId() != action.getDestinationId()) {
                navController.navigate(navDirections);
            }
        }
    }
}
