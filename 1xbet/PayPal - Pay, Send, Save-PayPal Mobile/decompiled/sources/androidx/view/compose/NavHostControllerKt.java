package androidx.view.compose;

@kotlin.Metadata(d1 = {"androidx/navigation/compose/NavHostControllerKt__NavHostControllerKt", "androidx/navigation/compose/NavHostControllerKt__NavHostController_androidKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavHostControllerKt {
    public static final androidx.compose.runtime.State<androidx.view.NavBackStackEntry> currentBackStackEntryAsState(androidx.view.NavController navController, androidx.compose.runtime.Composer composer, int i) {
        return androidx.view.compose.NavHostControllerKt__NavHostControllerKt.currentBackStackEntryAsState(navController, composer, i);
    }

    public static final androidx.view.NavHostController rememberNavController(androidx.view.Navigator<? extends androidx.view.NavDestination>[] navigatorArr, androidx.compose.runtime.Composer composer, int i) {
        return androidx.view.compose.NavHostControllerKt__NavHostController_androidKt.rememberNavController(navigatorArr, composer, i);
    }
}
