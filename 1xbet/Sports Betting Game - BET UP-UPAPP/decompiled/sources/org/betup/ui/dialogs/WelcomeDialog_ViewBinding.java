package org.betup.ui.dialogs;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class WelcomeDialog_ViewBinding implements Unbinder {
    private WelcomeDialog target;
    private View view7f0a0524;

    public WelcomeDialog_ViewBinding(WelcomeDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public WelcomeDialog_ViewBinding(final WelcomeDialog target, View source) {
        this.target = target;
        target.betcoins = (TextView) Utils.findRequiredViewAsType(source, R.id.betcoins, "field 'betcoins'", TextView.class);
        target.welcomeText = (TextView) Utils.findRequiredViewAsType(source, R.id.welcome_text, "field 'welcomeText'", TextView.class);
        View findRequiredView = Utils.findRequiredView(source, R.id.ok, "method 'onOkClick'");
        this.view7f0a0524 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.WelcomeDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onOkClick();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        WelcomeDialog welcomeDialog = this.target;
        if (welcomeDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        welcomeDialog.betcoins = null;
        welcomeDialog.welcomeText = null;
        this.view7f0a0524.setOnClickListener(null);
        this.view7f0a0524 = null;
    }
}
