package org.betup.ui.fragment.tutorial;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes4.dex */
public class IntroFragment_ViewBinding implements Unbinder {
    private IntroFragment target;

    public IntroFragment_ViewBinding(IntroFragment target, View source) {
        this.target = target;
        target.title = (TextView) Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
        target.subtitle = (TextView) Utils.findRequiredViewAsType(source, R.id.subtitle, "field 'subtitle'", TextView.class);
        target.icon = (ImageView) Utils.findRequiredViewAsType(source, R.id.icon, "field 'icon'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        IntroFragment introFragment = this.target;
        if (introFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        introFragment.title = null;
        introFragment.subtitle = null;
        introFragment.icon = null;
    }
}
