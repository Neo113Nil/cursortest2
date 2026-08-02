package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.makeramen.roundedimageview.RoundedImageView;
import org.betup.R;

/* loaded from: classes2.dex */
public final class PlacedBetInfoItemBinding implements ViewBinding {
    public final TextView amount;
    public final TextView betName;
    public final TextView date;
    public final ImageView imageView18;
    public final TextView name;
    public final TextView odd;
    public final TextView period;
    public final TextView repeat;
    private final ConstraintLayout rootView;
    public final TextView textView15;
    public final TextView textView28;
    public final TextView time;
    public final RoundedImageView userIcon;

    private PlacedBetInfoItemBinding(ConstraintLayout rootView, TextView amount, TextView betName, TextView date, ImageView imageView18, TextView name, TextView odd, TextView period, TextView repeat, TextView textView15, TextView textView28, TextView time, RoundedImageView userIcon) {
        this.rootView = rootView;
        this.amount = amount;
        this.betName = betName;
        this.date = date;
        this.imageView18 = imageView18;
        this.name = name;
        this.odd = odd;
        this.period = period;
        this.repeat = repeat;
        this.textView15 = textView15;
        this.textView28 = textView28;
        this.time = time;
        this.userIcon = userIcon;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static PlacedBetInfoItemBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static PlacedBetInfoItemBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.placed_bet_info_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static PlacedBetInfoItemBinding bind(View rootView) {
        int i = R.id.amount;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.amount);
        if (textView != null) {
            i = R.id.betName;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.betName);
            if (textView2 != null) {
                i = R.id.date;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.date);
                if (textView3 != null) {
                    i = R.id.imageView18;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView18);
                    if (imageView != null) {
                        i = R.id.name;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.name);
                        if (textView4 != null) {
                            i = R.id.odd;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.odd);
                            if (textView5 != null) {
                                i = R.id.period;
                                TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.period);
                                if (textView6 != null) {
                                    i = R.id.repeat;
                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.repeat);
                                    if (textView7 != null) {
                                        i = R.id.textView15;
                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView15);
                                        if (textView8 != null) {
                                            i = R.id.textView28;
                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView28);
                                            if (textView9 != null) {
                                                i = R.id.time;
                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.time);
                                                if (textView10 != null) {
                                                    i = R.id.userIcon;
                                                    RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(rootView, R.id.userIcon);
                                                    if (roundedImageView != null) {
                                                        return new PlacedBetInfoItemBinding((ConstraintLayout) rootView, textView, textView2, textView3, imageView, textView4, textView5, textView6, textView7, textView8, textView9, textView10, roundedImageView);
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
