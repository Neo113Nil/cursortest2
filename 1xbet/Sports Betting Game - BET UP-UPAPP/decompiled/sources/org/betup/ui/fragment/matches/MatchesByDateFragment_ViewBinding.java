package org.betup.ui.fragment.matches;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes4.dex */
public final class MatchesByDateFragment_ViewBinding implements Unbinder {
    private MatchesByDateFragment target;
    private View view7f0a00c3;
    private View view7f0a02b7;
    private View view7f0a02b8;

    public MatchesByDateFragment_ViewBinding(final MatchesByDateFragment target, View source) {
        this.target = target;
        target.leagueIcon = (ImageView) Utils.findRequiredViewAsType(source, R.id.leagueIcon, "field 'leagueIcon'", ImageView.class);
        target.leagueName = (TextView) Utils.findRequiredViewAsType(source, R.id.leagueName, "field 'leagueName'", TextView.class);
        target.matchesListView = (RecyclerView) Utils.findRequiredViewAsType(source, R.id.listView, "field 'matchesListView'", RecyclerView.class);
        target.empty = (TextView) Utils.findRequiredViewAsType(source, android.R.id.empty, "field 'empty'", TextView.class);
        target.progressBar = Utils.findRequiredView(source, R.id.progressBar, "field 'progressBar'");
        View findRequiredView = Utils.findRequiredView(source, R.id.expandButton, "field 'expandButton' and method 'onExpandButtonClick'");
        target.expandButton = (ImageView) Utils.castView(findRequiredView, R.id.expandButton, "field 'expandButton'", ImageView.class);
        this.view7f0a02b7 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.matches.MatchesByDateFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onExpandButtonClick();
            }
        });
        target.oneClickBetIv = (ImageView) Utils.findRequiredViewAsType(source, R.id.one_click_bet_iv, "field 'oneClickBetIv'", ImageView.class);
        View findRequiredView2 = Utils.findRequiredView(source, R.id.expandContainer, "field 'expandContainer' and method 'onExpandButtonClick'");
        target.expandContainer = findRequiredView2;
        this.view7f0a02b8 = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.matches.MatchesByDateFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onExpandButtonClick();
            }
        });
        target.dateSelectorComposeView = (ComposeView) Utils.findRequiredViewAsType(source, R.id.dateSelectorComposeView, "field 'dateSelectorComposeView'", ComposeView.class);
        target.stateOverlayComposeView = (ComposeView) Utils.findRequiredViewAsType(source, R.id.stateOverlayComposeView, "field 'stateOverlayComposeView'", ComposeView.class);
        View findRequiredView3 = Utils.findRequiredView(source, R.id.back_arrow_iv, "method 'onBackClick'");
        this.view7f0a00c3 = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.matches.MatchesByDateFragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onBackClick();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        MatchesByDateFragment matchesByDateFragment = this.target;
        if (matchesByDateFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        matchesByDateFragment.leagueIcon = null;
        matchesByDateFragment.leagueName = null;
        matchesByDateFragment.matchesListView = null;
        matchesByDateFragment.empty = null;
        matchesByDateFragment.progressBar = null;
        matchesByDateFragment.expandButton = null;
        matchesByDateFragment.oneClickBetIv = null;
        matchesByDateFragment.expandContainer = null;
        matchesByDateFragment.dateSelectorComposeView = null;
        matchesByDateFragment.stateOverlayComposeView = null;
        this.view7f0a02b7.setOnClickListener(null);
        this.view7f0a02b7 = null;
        this.view7f0a02b8.setOnClickListener(null);
        this.view7f0a02b8 = null;
        this.view7f0a00c3.setOnClickListener(null);
        this.view7f0a00c3 = null;
    }
}
