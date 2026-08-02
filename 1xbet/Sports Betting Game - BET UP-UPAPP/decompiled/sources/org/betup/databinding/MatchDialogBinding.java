package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class MatchDialogBinding implements ViewBinding {
    public final TextView awayTeam;
    public final ImageView awayicon;
    public final TextView desc;
    public final ImageView homeIcon;
    public final TextView homeTeam;
    public final TextView ok;
    private final RelativeLayout rootView;
    public final TextView score;
    public final TextView secondButton;
    public final TextView subtitle;

    private MatchDialogBinding(RelativeLayout rootView, TextView awayTeam, ImageView awayicon, TextView desc, ImageView homeIcon, TextView homeTeam, TextView ok, TextView score, TextView secondButton, TextView subtitle) {
        this.rootView = rootView;
        this.awayTeam = awayTeam;
        this.awayicon = awayicon;
        this.desc = desc;
        this.homeIcon = homeIcon;
        this.homeTeam = homeTeam;
        this.ok = ok;
        this.score = score;
        this.secondButton = secondButton;
        this.subtitle = subtitle;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static MatchDialogBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static MatchDialogBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.match_dialog, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static MatchDialogBinding bind(View rootView) {
        int i = R.id.awayTeam;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.awayTeam);
        if (textView != null) {
            i = R.id.awayicon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.awayicon);
            if (imageView != null) {
                i = R.id.desc;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.desc);
                if (textView2 != null) {
                    i = R.id.homeIcon;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.homeIcon);
                    if (imageView2 != null) {
                        i = R.id.homeTeam;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.homeTeam);
                        if (textView3 != null) {
                            i = R.id.ok;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ok);
                            if (textView4 != null) {
                                i = R.id.score;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.score);
                                if (textView5 != null) {
                                    i = R.id.secondButton;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.secondButton);
                                    if (textView6 != null) {
                                        i = R.id.subtitle;
                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.subtitle);
                                        if (textView7 != null) {
                                            return new MatchDialogBinding((RelativeLayout) rootView, textView, imageView, textView2, imageView2, textView3, textView4, textView5, textView6, textView7);
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
