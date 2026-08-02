package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import nl.dionsegijn.konfetti.xml.KonfettiView;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentResultDoubleGameDialogBinding implements ViewBinding {
    public final LinearLayout amountLl;
    public final TextView amountTv;
    public final TextView amountTypeTv;
    public final LinearLayout confirmLl;
    public final TextView confirmTv;
    public final ConstraintLayout contentCl;
    public final KonfettiView konfettiView;
    public final View resultBetTypeV;
    public final FlexboxLayout resultFl;
    public final ImageView resultIv;
    public final TextView resultTv;
    private final ConstraintLayout rootView;
    public final View selectedBetTypeV;
    public final TextView subtitleTv;
    public final ImageView watchAdIconIv;
    public final ImageView watchAdIv;
    public final LinearLayout watchAdLl;
    public final TextView watchAdTv;

    private FragmentResultDoubleGameDialogBinding(ConstraintLayout rootView, LinearLayout amountLl, TextView amountTv, TextView amountTypeTv, LinearLayout confirmLl, TextView confirmTv, ConstraintLayout contentCl, KonfettiView konfettiView, View resultBetTypeV, FlexboxLayout resultFl, ImageView resultIv, TextView resultTv, View selectedBetTypeV, TextView subtitleTv, ImageView watchAdIconIv, ImageView watchAdIv, LinearLayout watchAdLl, TextView watchAdTv) {
        this.rootView = rootView;
        this.amountLl = amountLl;
        this.amountTv = amountTv;
        this.amountTypeTv = amountTypeTv;
        this.confirmLl = confirmLl;
        this.confirmTv = confirmTv;
        this.contentCl = contentCl;
        this.konfettiView = konfettiView;
        this.resultBetTypeV = resultBetTypeV;
        this.resultFl = resultFl;
        this.resultIv = resultIv;
        this.resultTv = resultTv;
        this.selectedBetTypeV = selectedBetTypeV;
        this.subtitleTv = subtitleTv;
        this.watchAdIconIv = watchAdIconIv;
        this.watchAdIv = watchAdIv;
        this.watchAdLl = watchAdLl;
        this.watchAdTv = watchAdTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentResultDoubleGameDialogBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentResultDoubleGameDialogBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_result_double_game_dialog, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentResultDoubleGameDialogBinding bind(View rootView) {
        int i = R.id.amount_ll;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.amount_ll);
        if (linearLayout != null) {
            i = R.id.amount_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.amount_tv);
            if (textView != null) {
                i = R.id.amount_type_tv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.amount_type_tv);
                if (textView2 != null) {
                    i = R.id.confirm_ll;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.confirm_ll);
                    if (linearLayout2 != null) {
                        i = R.id.confirm_tv;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.confirm_tv);
                        if (textView3 != null) {
                            i = R.id.content_cl;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.content_cl);
                            if (constraintLayout != null) {
                                i = R.id.konfettiView;
                                KonfettiView konfettiView = (KonfettiView) ViewBindings.findChildViewById(rootView, R.id.konfettiView);
                                if (konfettiView != null) {
                                    i = R.id.result_bet_type_v;
                                    View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.result_bet_type_v);
                                    if (findChildViewById != null) {
                                        i = R.id.result_fl;
                                        FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(rootView, R.id.result_fl);
                                        if (flexboxLayout != null) {
                                            i = R.id.result_iv;
                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.result_iv);
                                            if (imageView != null) {
                                                i = R.id.result_tv;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.result_tv);
                                                if (textView4 != null) {
                                                    i = R.id.selected_bet_type_v;
                                                    View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.selected_bet_type_v);
                                                    if (findChildViewById2 != null) {
                                                        i = R.id.subtitle_tv;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.subtitle_tv);
                                                        if (textView5 != null) {
                                                            i = R.id.watch_ad_icon_iv;
                                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.watch_ad_icon_iv);
                                                            if (imageView2 != null) {
                                                                i = R.id.watch_ad_iv;
                                                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.watch_ad_iv);
                                                                if (imageView3 != null) {
                                                                    i = R.id.watch_ad_ll;
                                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.watch_ad_ll);
                                                                    if (linearLayout3 != null) {
                                                                        i = R.id.watch_ad_tv;
                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.watch_ad_tv);
                                                                        if (textView6 != null) {
                                                                            return new FragmentResultDoubleGameDialogBinding((ConstraintLayout) rootView, linearLayout, textView, textView2, linearLayout2, textView3, constraintLayout, konfettiView, findChildViewById, flexboxLayout, imageView, textView4, findChildViewById2, textView5, imageView2, imageView3, linearLayout3, textView6);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
