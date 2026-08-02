package androidx.view.ui;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/android/material/navigation/NavigationView;", "Landroidx/navigation/NavController;", "navController", "", "setupWithNavController", "(Lcom/google/android/material/navigation/NavigationView;Landroidx/navigation/NavController;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavigationViewKt {
    public static final void setupWithNavController(com.google.android.material.navigation.NavigationView navigationView, androidx.view.NavController navController) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navController, "");
        androidx.view.ui.NavigationUI.setupWithNavController(navigationView, navController);
    }
}
