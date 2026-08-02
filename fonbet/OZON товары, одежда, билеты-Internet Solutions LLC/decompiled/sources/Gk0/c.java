package Gk0;

import android.view.View;
import android.view.WindowInsets;
import ru.ozon.uni.android.notificationbar.NotificationBar;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets lambda$2$lambda$1;
        lambda$2$lambda$1 = NotificationBar.lambda$2$lambda$1(view, windowInsets);
        return lambda$2$lambda$1;
    }
}
