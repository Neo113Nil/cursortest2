package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ItemMatchRacingBinding implements ViewBinding {
    public final TextView arenaName;
    public final LinearLayout container;
    public final LinearLayout header;
    public final TextView matchDate;
    public final TextView matchTime;
    private final RelativeLayout rootView;
    public final ImageView sportIcon;

    private ItemMatchRacingBinding(RelativeLayout rootView, TextView arenaName, LinearLayout container, LinearLayout header, TextView matchDate, TextView matchTime, ImageView sportIcon) {
        this.rootView = rootView;
        this.arenaName = arenaName;
        this.container = container;
        this.header = header;
        this.matchDate = matchDate;
        this.matchTime = matchTime;
        this.sportIcon = sportIcon;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ItemMatchRacingBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemMatchRacingBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_match_racing, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemMatchRacingBinding bind(View rootView) {
        int i = R.id.arenaName;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.arenaName);
        if (textView != null) {
            i = R.id.container;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.container);
            if (linearLayout != null) {
                i = R.id.header;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.header);
                if (linearLayout2 != null) {
                    i = R.id.matchDate;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.matchDate);
                    if (textView2 != null) {
                        i = R.id.matchTime;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.matchTime);
                        if (textView3 != null) {
                            i = R.id.sportIcon;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sportIcon);
                            if (imageView != null) {
                                return new ItemMatchRacingBinding((RelativeLayout) rootView, textView, linearLayout, linearLayout2, textView2, textView3, imageView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
