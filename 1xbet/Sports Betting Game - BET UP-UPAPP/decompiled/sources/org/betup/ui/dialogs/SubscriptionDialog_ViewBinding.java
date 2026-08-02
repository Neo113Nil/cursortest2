package org.betup.ui.dialogs;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class SubscriptionDialog_ViewBinding implements Unbinder {
    private SubscriptionDialog target;
    private View view7f0a01ac;
    private View view7f0a047b;
    private View view7f0a07db;

    public SubscriptionDialog_ViewBinding(SubscriptionDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public SubscriptionDialog_ViewBinding(final SubscriptionDialog target, View source) {
        this.target = target;
        View findRequiredView = Utils.findRequiredView(source, R.id.week, "field 'week' and method 'buyWeekly'");
        target.week = findRequiredView;
        this.view7f0a07db = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.SubscriptionDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.buyWeekly();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(source, R.id.month, "field 'month' and method 'buyMonthly'");
        target.month = findRequiredView2;
        this.view7f0a047b = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.SubscriptionDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.buyMonthly();
            }
        });
        target.priceMonth = (TextView) Utils.findRequiredViewAsType(source, R.id.priceMonth, "field 'priceMonth'", TextView.class);
        target.priceWeek = (TextView) Utils.findRequiredViewAsType(source, R.id.priceWeek, "field 'priceWeek'", TextView.class);
        View findRequiredView3 = Utils.findRequiredView(source, R.id.close, "method 'close'");
        this.view7f0a01ac = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.SubscriptionDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.close();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        SubscriptionDialog subscriptionDialog = this.target;
        if (subscriptionDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        subscriptionDialog.week = null;
        subscriptionDialog.month = null;
        subscriptionDialog.priceMonth = null;
        subscriptionDialog.priceWeek = null;
        this.view7f0a07db.setOnClickListener(null);
        this.view7f0a07db = null;
        this.view7f0a047b.setOnClickListener(null);
        this.view7f0a047b = null;
        this.view7f0a01ac.setOnClickListener(null);
        this.view7f0a01ac = null;
    }
}
