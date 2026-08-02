package org.betup.ui.dialogs;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class TicketsInfoDialog_ViewBinding implements Unbinder {
    private TicketsInfoDialog target;
    private View view7f0a0524;

    public TicketsInfoDialog_ViewBinding(TicketsInfoDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public TicketsInfoDialog_ViewBinding(final TicketsInfoDialog target, View source) {
        this.target = target;
        target.introducing = (TextView) Utils.findRequiredViewAsType(source, R.id.introducing, "field 'introducing'", TextView.class);
        target.betCost = (TextView) Utils.findRequiredViewAsType(source, R.id.bet_cost, "field 'betCost'", TextView.class);
        target.betWin = (TextView) Utils.findRequiredViewAsType(source, R.id.bet_win, "field 'betWin'", TextView.class);
        target.betMegaWin = (TextView) Utils.findRequiredViewAsType(source, R.id.bet_mega_win, "field 'betMegaWin'", TextView.class);
        View findRequiredView = Utils.findRequiredView(source, R.id.ok, "method 'onOkClick'");
        this.view7f0a0524 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.TicketsInfoDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onOkClick();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TicketsInfoDialog ticketsInfoDialog = this.target;
        if (ticketsInfoDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        ticketsInfoDialog.introducing = null;
        ticketsInfoDialog.betCost = null;
        ticketsInfoDialog.betWin = null;
        ticketsInfoDialog.betMegaWin = null;
        this.view7f0a0524.setOnClickListener(null);
        this.view7f0a0524 = null;
    }
}
