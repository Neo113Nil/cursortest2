package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentBetslipBinding implements ViewBinding {
    public final BettingAmountBinding amountContainer;
    public final ImageView bestCoin;
    public final RecyclerView betslipList;
    public final LinearLayout footer;
    public final TextView halfBet;
    public final TextView highscore;
    public final TextView highscoreLabel;
    public final ImageView lockHalf;
    public final ImageView lockMax;
    public final ImageView lockThird;
    public final TextView maxAmount;
    public final TextView maxBet;
    public final TextView minAmount;
    public final TextView noBets;
    public final TextView odds;
    public final ProgressBar progress;
    public final ImageView removeAllButton;
    public final TextView returnBalance;
    public final ImageView returnCoinIcon;
    private final RelativeLayout rootView;
    public final SeekBar seekBar;
    public final ImageView settings;
    public final TextView textView12;
    public final TextView textView50;
    public final TextView textView6;
    public final TextView thirdBet;
    public final RelativeLayout tipButton;

    private FragmentBetslipBinding(RelativeLayout rootView, BettingAmountBinding amountContainer, ImageView bestCoin, RecyclerView betslipList, LinearLayout footer, TextView halfBet, TextView highscore, TextView highscoreLabel, ImageView lockHalf, ImageView lockMax, ImageView lockThird, TextView maxAmount, TextView maxBet, TextView minAmount, TextView noBets, TextView odds, ProgressBar progress, ImageView removeAllButton, TextView returnBalance, ImageView returnCoinIcon, SeekBar seekBar, ImageView settings, TextView textView12, TextView textView50, TextView textView6, TextView thirdBet, RelativeLayout tipButton) {
        this.rootView = rootView;
        this.amountContainer = amountContainer;
        this.bestCoin = bestCoin;
        this.betslipList = betslipList;
        this.footer = footer;
        this.halfBet = halfBet;
        this.highscore = highscore;
        this.highscoreLabel = highscoreLabel;
        this.lockHalf = lockHalf;
        this.lockMax = lockMax;
        this.lockThird = lockThird;
        this.maxAmount = maxAmount;
        this.maxBet = maxBet;
        this.minAmount = minAmount;
        this.noBets = noBets;
        this.odds = odds;
        this.progress = progress;
        this.removeAllButton = removeAllButton;
        this.returnBalance = returnBalance;
        this.returnCoinIcon = returnCoinIcon;
        this.seekBar = seekBar;
        this.settings = settings;
        this.textView12 = textView12;
        this.textView50 = textView50;
        this.textView6 = textView6;
        this.thirdBet = thirdBet;
        this.tipButton = tipButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentBetslipBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentBetslipBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_betslip, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentBetslipBinding bind(View rootView) {
        int i = R.id.amountContainer;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.amountContainer);
        if (findChildViewById != null) {
            BettingAmountBinding bind = BettingAmountBinding.bind(findChildViewById);
            i = R.id.bestCoin;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.bestCoin);
            if (imageView != null) {
                i = R.id.betslipList;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.betslipList);
                if (recyclerView != null) {
                    i = R.id.footer;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.footer);
                    if (linearLayout != null) {
                        i = R.id.halfBet;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.halfBet);
                        if (textView != null) {
                            i = R.id.highscore;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.highscore);
                            if (textView2 != null) {
                                i = R.id.highscoreLabel;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.highscoreLabel);
                                if (textView3 != null) {
                                    i = R.id.lock_half;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.lock_half);
                                    if (imageView2 != null) {
                                        i = R.id.lock_max;
                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.lock_max);
                                        if (imageView3 != null) {
                                            i = R.id.lock_third;
                                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.lock_third);
                                            if (imageView4 != null) {
                                                i = R.id.maxAmount;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.maxAmount);
                                                if (textView4 != null) {
                                                    i = R.id.maxBet;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.maxBet);
                                                    if (textView5 != null) {
                                                        i = R.id.minAmount;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.minAmount);
                                                        if (textView6 != null) {
                                                            i = R.id.no_bets;
                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.no_bets);
                                                            if (textView7 != null) {
                                                                i = R.id.odds;
                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.odds);
                                                                if (textView8 != null) {
                                                                    i = R.id.progress;
                                                                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                                                                    if (progressBar != null) {
                                                                        i = R.id.removeAllButton;
                                                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.removeAllButton);
                                                                        if (imageView5 != null) {
                                                                            i = R.id.returnBalance;
                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.returnBalance);
                                                                            if (textView9 != null) {
                                                                                i = R.id.returnCoinIcon;
                                                                                ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.returnCoinIcon);
                                                                                if (imageView6 != null) {
                                                                                    i = R.id.seekBar;
                                                                                    SeekBar seekBar = (SeekBar) ViewBindings.findChildViewById(rootView, R.id.seekBar);
                                                                                    if (seekBar != null) {
                                                                                        i = R.id.settings;
                                                                                        ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.settings);
                                                                                        if (imageView7 != null) {
                                                                                            i = R.id.textView12;
                                                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView12);
                                                                                            if (textView10 != null) {
                                                                                                i = R.id.textView50;
                                                                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView50);
                                                                                                if (textView11 != null) {
                                                                                                    i = R.id.textView6;
                                                                                                    TextView textView12 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView6);
                                                                                                    if (textView12 != null) {
                                                                                                        i = R.id.thirdBet;
                                                                                                        TextView textView13 = (TextView) ViewBindings.findChildViewById(rootView, R.id.thirdBet);
                                                                                                        if (textView13 != null) {
                                                                                                            i = R.id.tipButton;
                                                                                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.tipButton);
                                                                                                            if (relativeLayout != null) {
                                                                                                                return new FragmentBetslipBinding((RelativeLayout) rootView, bind, imageView, recyclerView, linearLayout, textView, textView2, textView3, imageView2, imageView3, imageView4, textView4, textView5, textView6, textView7, textView8, progressBar, imageView5, textView9, imageView6, seekBar, imageView7, textView10, textView11, textView12, textView13, relativeLayout);
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
