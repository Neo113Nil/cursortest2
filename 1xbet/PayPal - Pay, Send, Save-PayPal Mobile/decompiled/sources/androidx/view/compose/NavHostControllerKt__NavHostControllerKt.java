package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/navigation/NavController;", "Landroidx/compose/runtime/State;", "Landroidx/navigation/NavBackStackEntry;", "currentBackStackEntryAsState", "(Landroidx/navigation/NavController;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/navigation/compose/NavHostControllerKt")
/* loaded from: classes7.dex */
final /* synthetic */ class NavHostControllerKt__NavHostControllerKt {
    public static final androidx.compose.runtime.State<androidx.view.NavBackStackEntry> currentBackStackEntryAsState(androidx.view.NavController navController, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-120375203, i, -1, "androidx.navigation.compose.currentBackStackEntryAsState (NavHostController.kt:41)");
        }
        androidx.compose.runtime.State<androidx.view.NavBackStackEntry> collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(navController.getCurrentBackStackEntryFlow(), null, null, composer, 48, 2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return collectAsState;
    }
}
