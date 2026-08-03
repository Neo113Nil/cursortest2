package androidx.core.view;

/* loaded from: classes.dex */
public interface MenuProvider {

    /* renamed from: androidx.core.view.MenuProvider$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onMenuClosed(androidx.core.view.MenuProvider _this, android.view.Menu menu) {
        }

        public static void $default$onPrepareMenu(androidx.core.view.MenuProvider _this, android.view.Menu menu) {
        }
    }

    void onCreateMenu(android.view.Menu menu, android.view.MenuInflater menuInflater);

    void onMenuClosed(android.view.Menu menu);

    boolean onMenuItemSelected(android.view.MenuItem menuItem);

    void onPrepareMenu(android.view.Menu menu);
}
