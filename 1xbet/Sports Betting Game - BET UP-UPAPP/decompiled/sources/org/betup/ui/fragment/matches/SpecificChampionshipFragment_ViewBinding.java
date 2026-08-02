package org.betup.ui.fragment.matches;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.omadahealth.github.swipyrefreshlayout.library.SwipyRefreshLayout;
import org.betup.R;
import org.betup.ui.views.OvalFloatingButton;

/* loaded from: classes4.dex */
public final class SpecificChampionshipFragment_ViewBinding implements Unbinder {
    private SpecificChampionshipFragment target;
    private View view7f0a00c3;
    private View view7f0a02b7;
    private View view7f0a02b8;
    private View view7f0a02c8;
    private View view7f0a06b6;

    public SpecificChampionshipFragment_ViewBinding(final SpecificChampionshipFragment target, View source) {
        this.target = target;
        target.fab = (OvalFloatingButton) Utils.findRequiredViewAsType(source, R.id.fab_new, "field 'fab'", OvalFloatingButton.class);
        target.leagueIcon = (ImageView) Utils.findRequiredViewAsType(source, R.id.specificLeagueIcon, "field 'leagueIcon'", ImageView.class);
        View findRequiredView = Utils.findRequiredView(source, R.id.specificLeagueName, "field 'leagueName' and method 'onLeagueClick'");
        target.leagueName = (TextView) Utils.castView(findRequiredView, R.id.specificLeagueName, "field 'leagueName'", TextView.class);
        this.view7f0a06b6 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.matches.SpecificChampionshipFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onLeagueClick(p0);
            }
        });
        target.swipeRefreshLayout = (SwipyRefreshLayout) Utils.findRequiredViewAsType(source, R.id.swipeRefreshLayout, "field 'swipeRefreshLayout'", SwipyRefreshLayout.class);
        target.specificChampionshipListView = (RecyclerView) Utils.findRequiredViewAsType(source, R.id.listView, "field 'specificChampionshipListView'", RecyclerView.class);
        target.empty = (TextView) Utils.findRequiredViewAsType(source, android.R.id.empty, "field 'empty'", TextView.class);
        target.progressBar = Utils.findRequiredView(source, R.id.progressBar, "field 'progressBar'");
        View findRequiredView2 = Utils.findRequiredView(source, R.id.fav, "field 'favorite' and method 'favClick'");
        target.favorite = (ImageView) Utils.castView(findRequiredView2, R.id.fav, "field 'favorite'", ImageView.class);
        this.view7f0a02c8 = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.matches.SpecificChampionshipFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.favClick();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(source, R.id.expandButton, "field 'expandButton' and method 'onExpandButtonClick'");
        target.expandButton = (ImageView) Utils.castView(findRequiredView3, R.id.expandButton, "field 'expandButton'", ImageView.class);
        this.view7f0a02b7 = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.matches.SpecificChampionshipFragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onExpandButtonClick();
            }
        });
        View findRequiredView4 = Utils.findRequiredView(source, R.id.expandContainer, "field 'expandContainer' and method 'onExpandButtonClick'");
        target.expandContainer = findRequiredView4;
        this.view7f0a02b8 = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.matches.SpecificChampionshipFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onExpandButtonClick();
            }
        });
        target.oneClickBetIv = (ImageView) Utils.findRequiredViewAsType(source, R.id.one_click_bet_iv, "field 'oneClickBetIv'", ImageView.class);
        target.matchFilterCompose = (ComposeView) Utils.findRequiredViewAsType(source, R.id.matchFilterCompose, "field 'matchFilterCompose'", ComposeView.class);
        View findRequiredView5 = Utils.findRequiredView(source, R.id.back_arrow_iv, "method 'onBackClick'");
        this.view7f0a00c3 = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.matches.SpecificChampionshipFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onBackClick();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        SpecificChampionshipFragment specificChampionshipFragment = this.target;
        if (specificChampionshipFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        specificChampionshipFragment.fab = null;
        specificChampionshipFragment.leagueIcon = null;
        specificChampionshipFragment.leagueName = null;
        specificChampionshipFragment.swipeRefreshLayout = null;
        specificChampionshipFragment.specificChampionshipListView = null;
        specificChampionshipFragment.empty = null;
        specificChampionshipFragment.progressBar = null;
        specificChampionshipFragment.favorite = null;
        specificChampionshipFragment.expandButton = null;
        specificChampionshipFragment.expandContainer = null;
        specificChampionshipFragment.oneClickBetIv = null;
        specificChampionshipFragment.matchFilterCompose = null;
        this.view7f0a06b6.setOnClickListener(null);
        this.view7f0a06b6 = null;
        this.view7f0a02c8.setOnClickListener(null);
        this.view7f0a02c8 = null;
        this.view7f0a02b7.setOnClickListener(null);
        this.view7f0a02b7 = null;
        this.view7f0a02b8.setOnClickListener(null);
        this.view7f0a02b8 = null;
        this.view7f0a00c3.setOnClickListener(null);
        this.view7f0a00c3 = null;
    }
}
