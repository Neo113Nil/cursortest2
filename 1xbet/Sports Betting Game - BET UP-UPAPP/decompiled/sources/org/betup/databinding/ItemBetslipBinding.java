package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ItemBetslipBinding implements ViewBinding {
    public final LinearLayout container;
    public final TextView itemBetslipIsLiveText;
    public final ImageView itemBetslipIsSelected;
    public final TextView itemBetslipOdds;
    public final TextView itemBetslipSportName;
    public final TextView itemBetslipTeamNames;
    public final TextView itemBetslipTime;
    public final TextView itemBetslipUsersPick;
    public final Group lock;
    public final ImageView lockIcon;
    public final View lockView;
    public final LinearLayout oddHolder;
    public final ImageView remove;
    private final ConstraintLayout rootView;
    public final ImageView stat;

    private ItemBetslipBinding(ConstraintLayout rootView, LinearLayout container, TextView itemBetslipIsLiveText, ImageView itemBetslipIsSelected, TextView itemBetslipOdds, TextView itemBetslipSportName, TextView itemBetslipTeamNames, TextView itemBetslipTime, TextView itemBetslipUsersPick, Group lock, ImageView lockIcon, View lockView, LinearLayout oddHolder, ImageView remove, ImageView stat) {
        this.rootView = rootView;
        this.container = container;
        this.itemBetslipIsLiveText = itemBetslipIsLiveText;
        this.itemBetslipIsSelected = itemBetslipIsSelected;
        this.itemBetslipOdds = itemBetslipOdds;
        this.itemBetslipSportName = itemBetslipSportName;
        this.itemBetslipTeamNames = itemBetslipTeamNames;
        this.itemBetslipTime = itemBetslipTime;
        this.itemBetslipUsersPick = itemBetslipUsersPick;
        this.lock = lock;
        this.lockIcon = lockIcon;
        this.lockView = lockView;
        this.oddHolder = oddHolder;
        this.remove = remove;
        this.stat = stat;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemBetslipBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemBetslipBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_betslip, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemBetslipBinding bind(View rootView) {
        int i = R.id.container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.container);
        if (linearLayout != null) {
            i = R.id.itemBetslipIsLiveText;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.itemBetslipIsLiveText);
            if (textView != null) {
                i = R.id.itemBetslipIsSelected;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.itemBetslipIsSelected);
                if (imageView != null) {
                    i = R.id.itemBetslipOdds;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.itemBetslipOdds);
                    if (textView2 != null) {
                        i = R.id.itemBetslipSportName;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.itemBetslipSportName);
                        if (textView3 != null) {
                            i = R.id.itemBetslipTeamNames;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.itemBetslipTeamNames);
                            if (textView4 != null) {
                                i = R.id.itemBetslipTime;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.itemBetslipTime);
                                if (textView5 != null) {
                                    i = R.id.itemBetslipUsersPick;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.itemBetslipUsersPick);
                                    if (textView6 != null) {
                                        i = R.id.lock;
                                        Group group = (Group) ViewBindings.findChildViewById(rootView, R.id.lock);
                                        if (group != null) {
                                            i = R.id.lockIcon;
                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.lockIcon);
                                            if (imageView2 != null) {
                                                i = R.id.lockView;
                                                View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.lockView);
                                                if (findChildViewById != null) {
                                                    i = R.id.oddHolder;
                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.oddHolder);
                                                    if (linearLayout2 != null) {
                                                        i = R.id.remove;
                                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.remove);
                                                        if (imageView3 != null) {
                                                            i = R.id.stat;
                                                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.stat);
                                                            if (imageView4 != null) {
                                                                return new ItemBetslipBinding((ConstraintLayout) rootView, linearLayout, textView, imageView, textView2, textView3, textView4, textView5, textView6, group, imageView2, findChildViewById, linearLayout2, imageView3, imageView4);
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
