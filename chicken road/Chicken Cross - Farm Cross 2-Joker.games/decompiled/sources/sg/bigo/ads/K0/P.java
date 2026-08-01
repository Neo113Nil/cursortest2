package sg.bigo.ads.K0;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Window;
import android.widget.ProgressBar;

/* loaded from: classes3.dex */
public abstract class P {
    public static void a(Window window) {
        window.getDecorView().setSystemUiVisibility(5894);
    }

    public static void a(Activity activity, ProgressBar progressBar, int i, int i2) {
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        if (indeterminateDrawable == null) {
            progressBar.setIndeterminateDrawable(AbstractC4944a.c(activity, i));
        } else {
            indeterminateDrawable.setTint(i2);
            progressBar.setIndeterminateDrawable(indeterminateDrawable);
        }
    }

    public static void a(Context context, ProgressBar progressBar, int i) {
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        if (indeterminateDrawable == null) {
            progressBar.setIndeterminateDrawable(AbstractC4944a.c(context, i));
        } else {
            indeterminateDrawable.setTint(AbstractC4944a.a(context, R.color.white));
            progressBar.setIndeterminateDrawable(indeterminateDrawable);
        }
    }
}
