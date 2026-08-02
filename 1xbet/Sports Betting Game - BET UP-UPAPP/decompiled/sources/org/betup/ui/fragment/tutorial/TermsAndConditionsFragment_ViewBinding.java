package org.betup.ui.fragment.tutorial;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes4.dex */
public class TermsAndConditionsFragment_ViewBinding implements Unbinder {
    private TermsAndConditionsFragment target;

    public TermsAndConditionsFragment_ViewBinding(TermsAndConditionsFragment target, View source) {
        this.target = target;
        target.title = (TextView) Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
        target.subtitle = (TextView) Utils.findRequiredViewAsType(source, R.id.subtitle, "field 'subtitle'", TextView.class);
        target.icon = (ImageView) Utils.findRequiredViewAsType(source, R.id.icon, "field 'icon'", ImageView.class);
        target.check = (CheckBox) Utils.findRequiredViewAsType(source, R.id.check, "field 'check'", CheckBox.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TermsAndConditionsFragment termsAndConditionsFragment = this.target;
        if (termsAndConditionsFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        termsAndConditionsFragment.title = null;
        termsAndConditionsFragment.subtitle = null;
        termsAndConditionsFragment.icon = null;
        termsAndConditionsFragment.check = null;
    }
}
