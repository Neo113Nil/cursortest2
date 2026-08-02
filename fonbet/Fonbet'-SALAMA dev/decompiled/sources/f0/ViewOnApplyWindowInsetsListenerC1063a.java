package f0;

import android.view.View;
import android.view.WindowInsets;
import androidx.drawerlayout.widget.DrawerLayout;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC1063a implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        DrawerLayout drawerLayout = (DrawerLayout) view;
        boolean z4 = false;
        boolean z7 = windowInsets.getSystemWindowInsetTop() > 0;
        drawerLayout.f9283M = windowInsets;
        drawerLayout.f9284N = z7;
        if (!z7 && drawerLayout.getBackground() == null) {
            z4 = true;
        }
        drawerLayout.setWillNotDraw(z4);
        drawerLayout.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
