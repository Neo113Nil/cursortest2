package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.AlphaPressButton;
import org.betup.ui.views.GradientTextView;

/* loaded from: classes2.dex */
public final class DialogDailyStoreBonusBinding implements ViewBinding {
    public final GradientTextView balance;
    public final LinearLayout balanceContainer;
    public final ImageView betcoin;
    public final TextView desc;
    public final LinearLayout getDouble;
    public final TextView multiplyBetcoinsBonus;
    public final AlphaPressButton multiplyBonus;
    public final AppCompatTextView multiplyBonusTitle;
    public final TextView ok;
    private final RelativeLayout rootView;
    public final TextView title;

    private DialogDailyStoreBonusBinding(RelativeLayout rootView, GradientTextView balance, LinearLayout balanceContainer, ImageView betcoin, TextView desc, LinearLayout getDouble, TextView multiplyBetcoinsBonus, AlphaPressButton multiplyBonus, AppCompatTextView multiplyBonusTitle, TextView ok, TextView title) {
        this.rootView = rootView;
        this.balance = balance;
        this.balanceContainer = balanceContainer;
        this.betcoin = betcoin;
        this.desc = desc;
        this.getDouble = getDouble;
        this.multiplyBetcoinsBonus = multiplyBetcoinsBonus;
        this.multiplyBonus = multiplyBonus;
        this.multiplyBonusTitle = multiplyBonusTitle;
        this.ok = ok;
        this.title = title;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static DialogDailyStoreBonusBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogDailyStoreBonusBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_daily_store_bonus, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogDailyStoreBonusBinding bind(View rootView) {
        int i = R.id.balance;
        GradientTextView gradientTextView = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.balance);
        if (gradientTextView != null) {
            i = R.id.balanceContainer;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.balanceContainer);
            if (linearLayout != null) {
                i = R.id.betcoin;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.betcoin);
                if (imageView != null) {
                    i = R.id.desc;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.desc);
                    if (textView != null) {
                        i = R.id.getDouble;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.getDouble);
                        if (linearLayout2 != null) {
                            i = R.id.multiplyBetcoinsBonus;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.multiplyBetcoinsBonus);
                            if (textView2 != null) {
                                i = R.id.multiplyBonus;
                                AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.multiplyBonus);
                                if (alphaPressButton != null) {
                                    i = R.id.multiplyBonusTitle;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.multiplyBonusTitle);
                                    if (appCompatTextView != null) {
                                        i = R.id.ok;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ok);
                                        if (textView3 != null) {
                                            i = R.id.title;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                                            if (textView4 != null) {
                                                return new DialogDailyStoreBonusBinding((RelativeLayout) rootView, gradientTextView, linearLayout, imageView, textView, linearLayout2, textView2, alphaPressButton, appCompatTextView, textView3, textView4);
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
