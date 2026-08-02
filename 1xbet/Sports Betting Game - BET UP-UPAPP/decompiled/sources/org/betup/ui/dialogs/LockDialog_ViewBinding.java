package org.betup.ui.dialogs;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class LockDialog_ViewBinding implements Unbinder {
    private LockDialog target;

    public LockDialog_ViewBinding(LockDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public LockDialog_ViewBinding(LockDialog target, View source) {
        this.target = target;
        target.title = (TextView) Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
        target.desc = (TextView) Utils.findRequiredViewAsType(source, R.id.desc, "field 'desc'", TextView.class);
        target.notice = (TextView) Utils.findRequiredViewAsType(source, R.id.notice, "field 'notice'", TextView.class);
        target.unlockText = (TextView) Utils.findRequiredViewAsType(source, R.id.unlock_text, "field 'unlockText'", TextView.class);
        target.unlockPrice = (TextView) Utils.findRequiredViewAsType(source, R.id.unlock_price, "field 'unlockPrice'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        LockDialog lockDialog = this.target;
        if (lockDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        lockDialog.title = null;
        lockDialog.desc = null;
        lockDialog.notice = null;
        lockDialog.unlockText = null;
        lockDialog.unlockPrice = null;
    }
}
