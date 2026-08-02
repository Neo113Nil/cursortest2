package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.omadahealth.github.swipyrefreshlayout.library.SwipyRefreshLayout;
import org.betup.R;
import org.betup.ui.views.OvalFloatingButton;

/* loaded from: classes2.dex */
public final class FragmentSpecificChampionshipBinding implements ViewBinding {
    public final ImageView backArrowIv;
    public final TextView empty;
    public final ImageView expandButton;
    public final FrameLayout expandContainer;
    public final OvalFloatingButton fabNew;
    public final ImageView fav;
    public final LinearLayout header;
    public final RecyclerView listView;
    public final ComposeView matchFilterCompose;
    public final ImageView oneClickBetIv;
    public final ProgressBar progressBar;
    private final FrameLayout rootView;
    public final ImageView specificLeagueIcon;
    public final TextView specificLeagueName;
    public final SwipyRefreshLayout swipeRefreshLayout;

    private FragmentSpecificChampionshipBinding(FrameLayout rootView, ImageView backArrowIv, TextView empty, ImageView expandButton, FrameLayout expandContainer, OvalFloatingButton fabNew, ImageView fav, LinearLayout header, RecyclerView listView, ComposeView matchFilterCompose, ImageView oneClickBetIv, ProgressBar progressBar, ImageView specificLeagueIcon, TextView specificLeagueName, SwipyRefreshLayout swipeRefreshLayout) {
        this.rootView = rootView;
        this.backArrowIv = backArrowIv;
        this.empty = empty;
        this.expandButton = expandButton;
        this.expandContainer = expandContainer;
        this.fabNew = fabNew;
        this.fav = fav;
        this.header = header;
        this.listView = listView;
        this.matchFilterCompose = matchFilterCompose;
        this.oneClickBetIv = oneClickBetIv;
        this.progressBar = progressBar;
        this.specificLeagueIcon = specificLeagueIcon;
        this.specificLeagueName = specificLeagueName;
        this.swipeRefreshLayout = swipeRefreshLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSpecificChampionshipBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentSpecificChampionshipBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_specific_championship, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentSpecificChampionshipBinding bind(View rootView) {
        int i = R.id.back_arrow_iv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.back_arrow_iv);
        if (imageView != null) {
            i = android.R.id.empty;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, android.R.id.empty);
            if (textView != null) {
                i = R.id.expandButton;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.expandButton);
                if (imageView2 != null) {
                    i = R.id.expandContainer;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.expandContainer);
                    if (frameLayout != null) {
                        i = R.id.fab_new;
                        OvalFloatingButton ovalFloatingButton = (OvalFloatingButton) ViewBindings.findChildViewById(rootView, R.id.fab_new);
                        if (ovalFloatingButton != null) {
                            i = R.id.fav;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.fav);
                            if (imageView3 != null) {
                                i = R.id.header;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.header);
                                if (linearLayout != null) {
                                    i = R.id.listView;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.listView);
                                    if (recyclerView != null) {
                                        i = R.id.matchFilterCompose;
                                        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(rootView, R.id.matchFilterCompose);
                                        if (composeView != null) {
                                            i = R.id.one_click_bet_iv;
                                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.one_click_bet_iv);
                                            if (imageView4 != null) {
                                                i = R.id.progressBar;
                                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progressBar);
                                                if (progressBar != null) {
                                                    i = R.id.specificLeagueIcon;
                                                    ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.specificLeagueIcon);
                                                    if (imageView5 != null) {
                                                        i = R.id.specificLeagueName;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.specificLeagueName);
                                                        if (textView2 != null) {
                                                            i = R.id.swipeRefreshLayout;
                                                            SwipyRefreshLayout swipyRefreshLayout = (SwipyRefreshLayout) ViewBindings.findChildViewById(rootView, R.id.swipeRefreshLayout);
                                                            if (swipyRefreshLayout != null) {
                                                                return new FragmentSpecificChampionshipBinding((FrameLayout) rootView, imageView, textView, imageView2, frameLayout, ovalFloatingButton, imageView3, linearLayout, recyclerView, composeView, imageView4, progressBar, imageView5, textView2, swipyRefreshLayout);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
