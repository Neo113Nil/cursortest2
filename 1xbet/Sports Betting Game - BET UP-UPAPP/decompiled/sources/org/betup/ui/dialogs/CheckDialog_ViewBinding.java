package org.betup.ui.dialogs;

import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class CheckDialog_ViewBinding implements Unbinder {
    private CheckDialog target;

    public CheckDialog_ViewBinding(CheckDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public CheckDialog_ViewBinding(CheckDialog target, View source) {
        this.target = target;
        target.group = (RadioGroup) Utils.findRequiredViewAsType(source, R.id.group, "field 'group'", RadioGroup.class);
        target.ok = (TextView) Utils.findRequiredViewAsType(source, R.id.ok, "field 'ok'", TextView.class);
        target.secondButton = (TextView) Utils.findRequiredViewAsType(source, R.id.secondButton, "field 'secondButton'", TextView.class);
        target.title = (TextView) Utils.findRequiredViewAsType(source, R.id.subtitle, "field 'title'", TextView.class);
        target.subtitle = (TextView) Utils.findRequiredViewAsType(source, R.id.desc, "field 'subtitle'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CheckDialog checkDialog = this.target;
        if (checkDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        checkDialog.group = null;
        checkDialog.ok = null;
        checkDialog.secondButton = null;
        checkDialog.title = null;
        checkDialog.subtitle = null;
    }
}
