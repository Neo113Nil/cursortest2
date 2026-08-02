package org.betup.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class ConfirmEmailActivity_ViewBinding implements Unbinder {
    private ConfirmEmailActivity target;
    private View view7f0a01da;
    private View view7f0a0671;
    private View view7f0a0696;

    public ConfirmEmailActivity_ViewBinding(ConfirmEmailActivity target) {
        this(target, target.getWindow().getDecorView());
    }

    public ConfirmEmailActivity_ViewBinding(final ConfirmEmailActivity target, View source) {
        this.target = target;
        target.subtitle = (TextView) Utils.findRequiredViewAsType(source, R.id.subtitle, "field 'subtitle'", TextView.class);
        target.icon = (ImageView) Utils.findRequiredViewAsType(source, R.id.icon, "field 'icon'", ImageView.class);
        View findRequiredView = Utils.findRequiredView(source, R.id.sendAgain, "method 'sendAgainClick'");
        this.view7f0a0671 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.ConfirmEmailActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.sendAgainClick();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(source, R.id.confirm, "method 'confirmClick'");
        this.view7f0a01da = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.ConfirmEmailActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.confirmClick();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(source, R.id.signOut, "method 'signOutClick'");
        this.view7f0a0696 = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.ConfirmEmailActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.signOutClick();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ConfirmEmailActivity confirmEmailActivity = this.target;
        if (confirmEmailActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        confirmEmailActivity.subtitle = null;
        confirmEmailActivity.icon = null;
        this.view7f0a0671.setOnClickListener(null);
        this.view7f0a0671 = null;
        this.view7f0a01da.setOnClickListener(null);
        this.view7f0a01da = null;
        this.view7f0a0696.setOnClickListener(null);
        this.view7f0a0696 = null;
    }
}
