package org.betup.ui.fragment.bets;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes4.dex */
public final class BetsFragment_ViewBinding implements Unbinder {
    private BetsFragment target;

    public BetsFragment_ViewBinding(BetsFragment target, View source) {
        this.target = target;
        target.pager = (ViewPager) Utils.findOptionalViewAsType(source, R.id.pager, "field 'pager'", ViewPager.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        BetsFragment betsFragment = this.target;
        if (betsFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        betsFragment.pager = null;
    }
}
