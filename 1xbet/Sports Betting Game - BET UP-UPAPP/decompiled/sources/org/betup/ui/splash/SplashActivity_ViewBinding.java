package org.betup.ui.splash;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes4.dex */
public class SplashActivity_ViewBinding implements Unbinder {
    private SplashActivity target;

    public SplashActivity_ViewBinding(SplashActivity target) {
        this(target, target.getWindow().getDecorView());
    }

    public SplashActivity_ViewBinding(SplashActivity target, View source) {
        this.target = target;
        target.progress = (ProgressBar) Utils.findRequiredViewAsType(source, R.id.progress, "field 'progress'", ProgressBar.class);
        target.info = (TextView) Utils.findRequiredViewAsType(source, R.id.info, "field 'info'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        SplashActivity splashActivity = this.target;
        if (splashActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        splashActivity.progress = null;
        splashActivity.info = null;
    }
}
