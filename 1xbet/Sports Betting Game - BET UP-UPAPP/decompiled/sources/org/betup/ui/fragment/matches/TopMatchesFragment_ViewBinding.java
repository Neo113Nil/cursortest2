package org.betup.ui.fragment.matches;

import android.view.View;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes4.dex */
public final class TopMatchesFragment_ViewBinding implements Unbinder {
    private TopMatchesFragment target;
    private View view7f0a02b7;
    private View view7f0a02b8;

    public TopMatchesFragment_ViewBinding(final TopMatchesFragment target, View source) {
        this.target = target;
        View findRequiredView = Utils.findRequiredView(source, R.id.expandButton, "field 'expandButton' and method 'onExpandButtonClick'");
        target.expandButton = (ImageView) Utils.castView(findRequiredView, R.id.expandButton, "field 'expandButton'", ImageView.class);
        this.view7f0a02b7 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.matches.TopMatchesFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onExpandButtonClick();
            }
        });
        target.oneClickBetIv = (ImageView) Utils.findRequiredViewAsType(source, R.id.one_click_bet_iv, "field 'oneClickBetIv'", ImageView.class);
        View findRequiredView2 = Utils.findRequiredView(source, R.id.expandContainer, "field 'expandContainer' and method 'onExpandButtonClick'");
        target.expandContainer = findRequiredView2;
        this.view7f0a02b8 = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.matches.TopMatchesFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onExpandButtonClick();
            }
        });
        target.tabBarCompose = (ComposeView) Utils.findRequiredViewAsType(source, R.id.tabBarCompose, "field 'tabBarCompose'", ComposeView.class);
        target.pager = (ViewPager) Utils.findRequiredViewAsType(source, R.id.topMatchesPager, "field 'pager'", ViewPager.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TopMatchesFragment topMatchesFragment = this.target;
        if (topMatchesFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        topMatchesFragment.expandButton = null;
        topMatchesFragment.oneClickBetIv = null;
        topMatchesFragment.expandContainer = null;
        topMatchesFragment.tabBarCompose = null;
        topMatchesFragment.pager = null;
        this.view7f0a02b7.setOnClickListener(null);
        this.view7f0a02b7 = null;
        this.view7f0a02b8.setOnClickListener(null);
        this.view7f0a02b8 = null;
    }
}
