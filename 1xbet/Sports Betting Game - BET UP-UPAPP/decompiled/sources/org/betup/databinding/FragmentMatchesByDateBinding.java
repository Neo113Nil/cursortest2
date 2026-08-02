package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentMatchesByDateBinding implements ViewBinding {
    public final ImageView backArrowIv;
    public final ComposeView dateSelectorComposeView;
    public final TextView empty;
    public final ImageView expandButton;
    public final FrameLayout expandContainer;
    public final LinearLayout header;
    public final ImageView leagueIcon;
    public final TextView leagueName;
    public final RecyclerView listView;
    public final ImageView oneClickBetIv;
    public final ProgressBar progressBar;
    private final RelativeLayout rootView;
    public final ComposeView stateOverlayComposeView;

    private FragmentMatchesByDateBinding(RelativeLayout rootView, ImageView backArrowIv, ComposeView dateSelectorComposeView, TextView empty, ImageView expandButton, FrameLayout expandContainer, LinearLayout header, ImageView leagueIcon, TextView leagueName, RecyclerView listView, ImageView oneClickBetIv, ProgressBar progressBar, ComposeView stateOverlayComposeView) {
        this.rootView = rootView;
        this.backArrowIv = backArrowIv;
        this.dateSelectorComposeView = dateSelectorComposeView;
        this.empty = empty;
        this.expandButton = expandButton;
        this.expandContainer = expandContainer;
        this.header = header;
        this.leagueIcon = leagueIcon;
        this.leagueName = leagueName;
        this.listView = listView;
        this.oneClickBetIv = oneClickBetIv;
        this.progressBar = progressBar;
        this.stateOverlayComposeView = stateOverlayComposeView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMatchesByDateBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentMatchesByDateBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_matches_by_date, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentMatchesByDateBinding bind(View rootView) {
        int i = R.id.back_arrow_iv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.back_arrow_iv);
        if (imageView != null) {
            i = R.id.dateSelectorComposeView;
            ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(rootView, R.id.dateSelectorComposeView);
            if (composeView != null) {
                i = android.R.id.empty;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, android.R.id.empty);
                if (textView != null) {
                    i = R.id.expandButton;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.expandButton);
                    if (imageView2 != null) {
                        i = R.id.expandContainer;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.expandContainer);
                        if (frameLayout != null) {
                            i = R.id.header;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.header);
                            if (linearLayout != null) {
                                i = R.id.leagueIcon;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.leagueIcon);
                                if (imageView3 != null) {
                                    i = R.id.leagueName;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.leagueName);
                                    if (textView2 != null) {
                                        i = R.id.listView;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.listView);
                                        if (recyclerView != null) {
                                            i = R.id.one_click_bet_iv;
                                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.one_click_bet_iv);
                                            if (imageView4 != null) {
                                                i = R.id.progressBar;
                                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progressBar);
                                                if (progressBar != null) {
                                                    i = R.id.stateOverlayComposeView;
                                                    ComposeView composeView2 = (ComposeView) ViewBindings.findChildViewById(rootView, R.id.stateOverlayComposeView);
                                                    if (composeView2 != null) {
                                                        return new FragmentMatchesByDateBinding((RelativeLayout) rootView, imageView, composeView, textView, imageView2, frameLayout, linearLayout, imageView3, textView2, recyclerView, imageView4, progressBar, composeView2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
