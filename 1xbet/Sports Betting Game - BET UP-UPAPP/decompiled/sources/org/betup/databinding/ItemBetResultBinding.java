package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ItemBetResultBinding implements ViewBinding {
    public final LinearLayout container;
    public final TextView date;
    public final TextView pick;
    public final ProgressBar progress;
    public final ImageView refresh;
    public final TextView results;
    private final LinearLayout rootView;
    public final TextView singleOdd;
    public final TextView teamNames;
    public final TextView time;

    private ItemBetResultBinding(LinearLayout rootView, LinearLayout container, TextView date, TextView pick, ProgressBar progress, ImageView refresh, TextView results, TextView singleOdd, TextView teamNames, TextView time) {
        this.rootView = rootView;
        this.container = container;
        this.date = date;
        this.pick = pick;
        this.progress = progress;
        this.refresh = refresh;
        this.results = results;
        this.singleOdd = singleOdd;
        this.teamNames = teamNames;
        this.time = time;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemBetResultBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemBetResultBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_bet_result, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemBetResultBinding bind(View rootView) {
        LinearLayout linearLayout = (LinearLayout) rootView;
        int i = R.id.date;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.date);
        if (textView != null) {
            i = R.id.pick;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.pick);
            if (textView2 != null) {
                i = R.id.progress;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                if (progressBar != null) {
                    i = R.id.refresh;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.refresh);
                    if (imageView != null) {
                        i = R.id.results;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.results);
                        if (textView3 != null) {
                            i = R.id.singleOdd;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.singleOdd);
                            if (textView4 != null) {
                                i = R.id.teamNames;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.teamNames);
                                if (textView5 != null) {
                                    i = R.id.time;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.time);
                                    if (textView6 != null) {
                                        return new ItemBetResultBinding(linearLayout, linearLayout, textView, textView2, progressBar, imageView, textView3, textView4, textView5, textView6);
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
