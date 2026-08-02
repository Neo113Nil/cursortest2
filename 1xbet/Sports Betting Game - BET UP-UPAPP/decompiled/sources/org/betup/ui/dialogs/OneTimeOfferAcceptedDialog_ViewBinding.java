package org.betup.ui.dialogs;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class OneTimeOfferAcceptedDialog_ViewBinding implements Unbinder {
    private OneTimeOfferAcceptedDialog target;
    private View view7f0a0524;

    public OneTimeOfferAcceptedDialog_ViewBinding(OneTimeOfferAcceptedDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public OneTimeOfferAcceptedDialog_ViewBinding(final OneTimeOfferAcceptedDialog target, View source) {
        this.target = target;
        target.desc = (TextView) Utils.findRequiredViewAsType(source, R.id.desc, "field 'desc'", TextView.class);
        View findRequiredView = Utils.findRequiredView(source, R.id.ok, "method 'onOkClick'");
        this.view7f0a0524 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.OneTimeOfferAcceptedDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onOkClick();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        OneTimeOfferAcceptedDialog oneTimeOfferAcceptedDialog = this.target;
        if (oneTimeOfferAcceptedDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        oneTimeOfferAcceptedDialog.desc = null;
        this.view7f0a0524.setOnClickListener(null);
        this.view7f0a0524 = null;
    }
}
