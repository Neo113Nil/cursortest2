package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.OvalFloatingButton;

/* loaded from: classes2.dex */
public final class FragmentChampionshipBinding implements ViewBinding {
    public final ImageView cancel;
    public final TextView empty;
    public final OvalFloatingButton fabNew;
    public final ImageView fav;
    public final TextView league;
    public final RecyclerView listView;
    public final ProgressBar progressBar;
    private final RelativeLayout rootView;
    public final EditText search;
    public final ImageView searchIv;
    public final ImageView specificLeagueIcon;

    private FragmentChampionshipBinding(RelativeLayout rootView, ImageView cancel, TextView empty, OvalFloatingButton fabNew, ImageView fav, TextView league, RecyclerView listView, ProgressBar progressBar, EditText search, ImageView searchIv, ImageView specificLeagueIcon) {
        this.rootView = rootView;
        this.cancel = cancel;
        this.empty = empty;
        this.fabNew = fabNew;
        this.fav = fav;
        this.league = league;
        this.listView = listView;
        this.progressBar = progressBar;
        this.search = search;
        this.searchIv = searchIv;
        this.specificLeagueIcon = specificLeagueIcon;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentChampionshipBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentChampionshipBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_championship, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentChampionshipBinding bind(View rootView) {
        int i = R.id.cancel;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.cancel);
        if (imageView != null) {
            i = android.R.id.empty;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, android.R.id.empty);
            if (textView != null) {
                i = R.id.fab_new;
                OvalFloatingButton ovalFloatingButton = (OvalFloatingButton) ViewBindings.findChildViewById(rootView, R.id.fab_new);
                if (ovalFloatingButton != null) {
                    i = R.id.fav;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.fav);
                    if (imageView2 != null) {
                        i = R.id.league;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.league);
                        if (textView2 != null) {
                            i = R.id.listView;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.listView);
                            if (recyclerView != null) {
                                i = R.id.progressBar;
                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progressBar);
                                if (progressBar != null) {
                                    i = R.id.search;
                                    EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.search);
                                    if (editText != null) {
                                        i = R.id.search_iv;
                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.search_iv);
                                        if (imageView3 != null) {
                                            i = R.id.specificLeagueIcon;
                                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.specificLeagueIcon);
                                            if (imageView4 != null) {
                                                return new FragmentChampionshipBinding((RelativeLayout) rootView, imageView, textView, ovalFloatingButton, imageView2, textView2, recyclerView, progressBar, editText, imageView3, imageView4);
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
