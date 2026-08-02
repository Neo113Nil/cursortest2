package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentDoubleGameBinding implements ViewBinding {
    public final EditText betAmountEt;
    public final LinearLayout betAmountLl;
    public final FlexboxLayout betContainerFl;
    public final FlexboxLayout betTypeBtnFl;
    public final LinearLayout blackBetTypeLl;
    public final TextView blackBetTypeTv;
    public final ConstraintLayout bottomCl;
    public final LinearLayout buttonDouble;
    public final LinearLayout buttonHalf;
    public final LinearLayout buttonMax;
    public final LinearLayout buttonMin;
    public final TextView doubleBetTv;
    public final TextView halfBetTv;
    public final ConstraintLayout historyCl;
    public final RecyclerView historyRv;
    public final LinearLayout makeBetLl;
    public final TextView maxBetTv;
    public final TextView minBetTv;
    public final LinearLayout redBetTypeLl;
    public final TextView redBetTypeTv;
    private final ConstraintLayout rootView;
    public final ImageView rouletteBottomBgV;
    public final View rouletteCenterBgV;
    public final ConstraintLayout rouletteCl;
    public final RecyclerView rouletteRv;
    public final ImageView rouletteTopBgV;
    public final View timerActiveV;
    public final ConstraintLayout timerCl;
    public final TextView timerTv;
    public final LinearLayout zeroBetTypeLl;
    public final TextView zeroBetTypeTv;

    private FragmentDoubleGameBinding(ConstraintLayout rootView, EditText betAmountEt, LinearLayout betAmountLl, FlexboxLayout betContainerFl, FlexboxLayout betTypeBtnFl, LinearLayout blackBetTypeLl, TextView blackBetTypeTv, ConstraintLayout bottomCl, LinearLayout buttonDouble, LinearLayout buttonHalf, LinearLayout buttonMax, LinearLayout buttonMin, TextView doubleBetTv, TextView halfBetTv, ConstraintLayout historyCl, RecyclerView historyRv, LinearLayout makeBetLl, TextView maxBetTv, TextView minBetTv, LinearLayout redBetTypeLl, TextView redBetTypeTv, ImageView rouletteBottomBgV, View rouletteCenterBgV, ConstraintLayout rouletteCl, RecyclerView rouletteRv, ImageView rouletteTopBgV, View timerActiveV, ConstraintLayout timerCl, TextView timerTv, LinearLayout zeroBetTypeLl, TextView zeroBetTypeTv) {
        this.rootView = rootView;
        this.betAmountEt = betAmountEt;
        this.betAmountLl = betAmountLl;
        this.betContainerFl = betContainerFl;
        this.betTypeBtnFl = betTypeBtnFl;
        this.blackBetTypeLl = blackBetTypeLl;
        this.blackBetTypeTv = blackBetTypeTv;
        this.bottomCl = bottomCl;
        this.buttonDouble = buttonDouble;
        this.buttonHalf = buttonHalf;
        this.buttonMax = buttonMax;
        this.buttonMin = buttonMin;
        this.doubleBetTv = doubleBetTv;
        this.halfBetTv = halfBetTv;
        this.historyCl = historyCl;
        this.historyRv = historyRv;
        this.makeBetLl = makeBetLl;
        this.maxBetTv = maxBetTv;
        this.minBetTv = minBetTv;
        this.redBetTypeLl = redBetTypeLl;
        this.redBetTypeTv = redBetTypeTv;
        this.rouletteBottomBgV = rouletteBottomBgV;
        this.rouletteCenterBgV = rouletteCenterBgV;
        this.rouletteCl = rouletteCl;
        this.rouletteRv = rouletteRv;
        this.rouletteTopBgV = rouletteTopBgV;
        this.timerActiveV = timerActiveV;
        this.timerCl = timerCl;
        this.timerTv = timerTv;
        this.zeroBetTypeLl = zeroBetTypeLl;
        this.zeroBetTypeTv = zeroBetTypeTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDoubleGameBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentDoubleGameBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_double_game, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentDoubleGameBinding bind(View rootView) {
        int i = R.id.bet_amount_et;
        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.bet_amount_et);
        if (editText != null) {
            i = R.id.bet_amount_ll;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.bet_amount_ll);
            if (linearLayout != null) {
                i = R.id.bet_container_fl;
                FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(rootView, R.id.bet_container_fl);
                if (flexboxLayout != null) {
                    i = R.id.bet_type_btn_fl;
                    FlexboxLayout flexboxLayout2 = (FlexboxLayout) ViewBindings.findChildViewById(rootView, R.id.bet_type_btn_fl);
                    if (flexboxLayout2 != null) {
                        i = R.id.black_bet_type_ll;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.black_bet_type_ll);
                        if (linearLayout2 != null) {
                            i = R.id.black_bet_type_tv;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.black_bet_type_tv);
                            if (textView != null) {
                                i = R.id.bottom_cl;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.bottom_cl);
                                if (constraintLayout != null) {
                                    i = R.id.buttonDouble;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.buttonDouble);
                                    if (linearLayout3 != null) {
                                        i = R.id.buttonHalf;
                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.buttonHalf);
                                        if (linearLayout4 != null) {
                                            i = R.id.buttonMax;
                                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.buttonMax);
                                            if (linearLayout5 != null) {
                                                i = R.id.buttonMin;
                                                LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.buttonMin);
                                                if (linearLayout6 != null) {
                                                    i = R.id.double_bet_tv;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.double_bet_tv);
                                                    if (textView2 != null) {
                                                        i = R.id.half_bet_tv;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.half_bet_tv);
                                                        if (textView3 != null) {
                                                            i = R.id.history_cl;
                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.history_cl);
                                                            if (constraintLayout2 != null) {
                                                                i = R.id.history_rv;
                                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.history_rv);
                                                                if (recyclerView != null) {
                                                                    i = R.id.make_bet_ll;
                                                                    LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.make_bet_ll);
                                                                    if (linearLayout7 != null) {
                                                                        i = R.id.max_bet_tv;
                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.max_bet_tv);
                                                                        if (textView4 != null) {
                                                                            i = R.id.min_bet_tv;
                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.min_bet_tv);
                                                                            if (textView5 != null) {
                                                                                i = R.id.red_bet_type_ll;
                                                                                LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.red_bet_type_ll);
                                                                                if (linearLayout8 != null) {
                                                                                    i = R.id.red_bet_type_tv;
                                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.red_bet_type_tv);
                                                                                    if (textView6 != null) {
                                                                                        i = R.id.roulette_bottom_bg_v;
                                                                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.roulette_bottom_bg_v);
                                                                                        if (imageView != null) {
                                                                                            i = R.id.roulette_center_bg_v;
                                                                                            View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.roulette_center_bg_v);
                                                                                            if (findChildViewById != null) {
                                                                                                i = R.id.roulette_cl;
                                                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.roulette_cl);
                                                                                                if (constraintLayout3 != null) {
                                                                                                    i = R.id.roulette_rv;
                                                                                                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.roulette_rv);
                                                                                                    if (recyclerView2 != null) {
                                                                                                        i = R.id.roulette_top_bg_v;
                                                                                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.roulette_top_bg_v);
                                                                                                        if (imageView2 != null) {
                                                                                                            i = R.id.timer_active_v;
                                                                                                            View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.timer_active_v);
                                                                                                            if (findChildViewById2 != null) {
                                                                                                                i = R.id.timer_cl;
                                                                                                                ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.timer_cl);
                                                                                                                if (constraintLayout4 != null) {
                                                                                                                    i = R.id.timer_tv;
                                                                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.timer_tv);
                                                                                                                    if (textView7 != null) {
                                                                                                                        i = R.id.zero_bet_type_ll;
                                                                                                                        LinearLayout linearLayout9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.zero_bet_type_ll);
                                                                                                                        if (linearLayout9 != null) {
                                                                                                                            i = R.id.zero_bet_type_tv;
                                                                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.zero_bet_type_tv);
                                                                                                                            if (textView8 != null) {
                                                                                                                                return new FragmentDoubleGameBinding((ConstraintLayout) rootView, editText, linearLayout, flexboxLayout, flexboxLayout2, linearLayout2, textView, constraintLayout, linearLayout3, linearLayout4, linearLayout5, linearLayout6, textView2, textView3, constraintLayout2, recyclerView, linearLayout7, textView4, textView5, linearLayout8, textView6, imageView, findChildViewById, constraintLayout3, recyclerView2, imageView2, findChildViewById2, constraintLayout4, textView7, linearLayout9, textView8);
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
