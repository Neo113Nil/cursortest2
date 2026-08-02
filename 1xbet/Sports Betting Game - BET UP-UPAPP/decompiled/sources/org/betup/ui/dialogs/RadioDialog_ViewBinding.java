package org.betup.ui.dialogs;

import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class RadioDialog_ViewBinding implements Unbinder {
    private RadioDialog target;

    public RadioDialog_ViewBinding(RadioDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public RadioDialog_ViewBinding(RadioDialog target, View source) {
        this.target = target;
        target.group = (RadioGroup) Utils.findRequiredViewAsType(source, R.id.group, "field 'group'", RadioGroup.class);
        target.ok = (TextView) Utils.findRequiredViewAsType(source, R.id.ok, "field 'ok'", TextView.class);
        target.secondButton = (TextView) Utils.findRequiredViewAsType(source, R.id.secondButton, "field 'secondButton'", TextView.class);
        target.title = (TextView) Utils.findRequiredViewAsType(source, R.id.subtitle, "field 'title'", TextView.class);
        target.subtitle = (TextView) Utils.findRequiredViewAsType(source, R.id.desc, "field 'subtitle'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        RadioDialog radioDialog = this.target;
        if (radioDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        radioDialog.group = null;
        radioDialog.ok = null;
        radioDialog.secondButton = null;
        radioDialog.title = null;
        radioDialog.subtitle = null;
    }
}
