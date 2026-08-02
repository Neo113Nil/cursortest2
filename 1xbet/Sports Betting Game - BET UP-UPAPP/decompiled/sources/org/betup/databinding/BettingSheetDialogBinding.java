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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.AlphaPressButton;

/* loaded from: classes2.dex */
public final class BettingSheetDialogBinding implements ViewBinding {
    public final BettingAmountBinding amountContainer;
    public final ImageView bestCoin;
    public final AlphaPressButton challengeButton;
    public final ImageView deleteBet;
    public final TextView halfBet;
    public final TextView header;
    public final TextView highscore;
    public final TextView highscoreLabel;
    public final TextView itemBetslipOdds;
    public final TextView itemBetslipSportName;
    public final TextView itemBetslipTeamNames;
    public final TextView itemBetslipUsersPick;
    public final ImageView leftCoin;
    public final ImageView lockHalf;
    public final ImageView lockIcon;
    public final ImageView lockMax;
    public final ImageView lockThird;
    public final TextView maxAmount;
    public final TextView maxBet;
    public final TextView minAmount;
    public final LinearLayout oddHolder;
    public final TextView odds;
    public final ProgressBar progress;
    public final TextView removeAllButton;
    public final TextView returnBalance;
    public final ImageView returnCoinIcon;
    public final ImageView rightCoin;
    private final ConstraintLayout rootView;
    public final SeekBar seekBar;
    public final ImageView settingsIcon;
    public final ConstraintLayout sheetContainer;
    public final ImageView stat;
    public final TextView textView12;
    public final TextView textView6;
    public final TextView thirdBet;
    public final RelativeLayout tipButton;

    private BettingSheetDialogBinding(ConstraintLayout rootView, BettingAmountBinding amountContainer, ImageView bestCoin, AlphaPressButton challengeButton, ImageView deleteBet, TextView halfBet, TextView header, TextView highscore, TextView highscoreLabel, TextView itemBetslipOdds, TextView itemBetslipSportName, TextView itemBetslipTeamNames, TextView itemBetslipUsersPick, ImageView leftCoin, ImageView lockHalf, ImageView lockIcon, ImageView lockMax, ImageView lockThird, TextView maxAmount, TextView maxBet, TextView minAmount, LinearLayout oddHolder, TextView odds, ProgressBar progress, TextView removeAllButton, TextView returnBalance, ImageView returnCoinIcon, ImageView rightCoin, SeekBar seekBar, ImageView settingsIcon, ConstraintLayout sheetContainer, ImageView stat, TextView textView12, TextView textView6, TextView thirdBet, RelativeLayout tipButton) {
        this.rootView = rootView;
        this.amountContainer = amountContainer;
        this.bestCoin = bestCoin;
        this.challengeButton = challengeButton;
        this.deleteBet = deleteBet;
        this.halfBet = halfBet;
        this.header = header;
        this.highscore = highscore;
        this.highscoreLabel = highscoreLabel;
        this.itemBetslipOdds = itemBetslipOdds;
        this.itemBetslipSportName = itemBetslipSportName;
        this.itemBetslipTeamNames = itemBetslipTeamNames;
        this.itemBetslipUsersPick = itemBetslipUsersPick;
        this.leftCoin = leftCoin;
        this.lockHalf = lockHalf;
        this.lockIcon = lockIcon;
        this.lockMax = lockMax;
        this.lockThird = lockThird;
        this.maxAmount = maxAmount;
        this.maxBet = maxBet;
        this.minAmount = minAmount;
        this.oddHolder = oddHolder;
        this.odds = odds;
        this.progress = progress;
        this.removeAllButton = removeAllButton;
        this.returnBalance = returnBalance;
        this.returnCoinIcon = returnCoinIcon;
        this.rightCoin = rightCoin;
        this.seekBar = seekBar;
        this.settingsIcon = settingsIcon;
        this.sheetContainer = sheetContainer;
        this.stat = stat;
        this.textView12 = textView12;
        this.textView6 = textView6;
        this.thirdBet = thirdBet;
        this.tipButton = tipButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static BettingSheetDialogBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static BettingSheetDialogBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.betting_sheet_dialog, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static BettingSheetDialogBinding bind(View rootView) {
        int i = R.id.amountContainer;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.amountContainer);
        if (findChildViewById != null) {
            BettingAmountBinding bind = BettingAmountBinding.bind(findChildViewById);
            i = R.id.bestCoin;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.bestCoin);
            if (imageView != null) {
                i = R.id.challengeButton;
                AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.challengeButton);
                if (alphaPressButton != null) {
                    i = R.id.deleteBet;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.deleteBet);
                    if (imageView2 != null) {
                        i = R.id.halfBet;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.halfBet);
                        if (textView != null) {
                            i = R.id.header;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.header);
                            if (textView2 != null) {
                                i = R.id.highscore;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.highscore);
                                if (textView3 != null) {
                                    i = R.id.highscoreLabel;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.highscoreLabel);
                                    if (textView4 != null) {
                                        i = R.id.itemBetslipOdds;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.itemBetslipOdds);
                                        if (textView5 != null) {
                                            i = R.id.itemBetslipSportName;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.itemBetslipSportName);
                                            if (textView6 != null) {
                                                i = R.id.itemBetslipTeamNames;
                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.itemBetslipTeamNames);
                                                if (textView7 != null) {
                                                    i = R.id.itemBetslipUsersPick;
                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.itemBetslipUsersPick);
                                                    if (textView8 != null) {
                                                        i = R.id.leftCoin;
                                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.leftCoin);
                                                        if (imageView3 != null) {
                                                            i = R.id.lock_half;
                                                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.lock_half);
                                                            if (imageView4 != null) {
                                                                i = R.id.lockIcon;
                                                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.lockIcon);
                                                                if (imageView5 != null) {
                                                                    i = R.id.lock_max;
                                                                    ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.lock_max);
                                                                    if (imageView6 != null) {
                                                                        i = R.id.lock_third;
                                                                        ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.lock_third);
                                                                        if (imageView7 != null) {
                                                                            i = R.id.maxAmount;
                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.maxAmount);
                                                                            if (textView9 != null) {
                                                                                i = R.id.maxBet;
                                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.maxBet);
                                                                                if (textView10 != null) {
                                                                                    i = R.id.minAmount;
                                                                                    TextView textView11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.minAmount);
                                                                                    if (textView11 != null) {
                                                                                        i = R.id.oddHolder;
                                                                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.oddHolder);
                                                                                        if (linearLayout != null) {
                                                                                            i = R.id.odds;
                                                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(rootView, R.id.odds);
                                                                                            if (textView12 != null) {
                                                                                                i = R.id.progress;
                                                                                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                                                                                                if (progressBar != null) {
                                                                                                    i = R.id.removeAllButton;
                                                                                                    TextView textView13 = (TextView) ViewBindings.findChildViewById(rootView, R.id.removeAllButton);
                                                                                                    if (textView13 != null) {
                                                                                                        i = R.id.returnBalance;
                                                                                                        TextView textView14 = (TextView) ViewBindings.findChildViewById(rootView, R.id.returnBalance);
                                                                                                        if (textView14 != null) {
                                                                                                            i = R.id.returnCoinIcon;
                                                                                                            ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.returnCoinIcon);
                                                                                                            if (imageView8 != null) {
                                                                                                                i = R.id.rightCoin;
                                                                                                                ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.rightCoin);
                                                                                                                if (imageView9 != null) {
                                                                                                                    i = R.id.seekBar;
                                                                                                                    SeekBar seekBar = (SeekBar) ViewBindings.findChildViewById(rootView, R.id.seekBar);
                                                                                                                    if (seekBar != null) {
                                                                                                                        i = R.id.settingsIcon;
                                                                                                                        ImageView imageView10 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.settingsIcon);
                                                                                                                        if (imageView10 != null) {
                                                                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
                                                                                                                            i = R.id.stat;
                                                                                                                            ImageView imageView11 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.stat);
                                                                                                                            if (imageView11 != null) {
                                                                                                                                i = R.id.textView12;
                                                                                                                                TextView textView15 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView12);
                                                                                                                                if (textView15 != null) {
                                                                                                                                    i = R.id.textView6;
                                                                                                                                    TextView textView16 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView6);
                                                                                                                                    if (textView16 != null) {
                                                                                                                                        i = R.id.thirdBet;
                                                                                                                                        TextView textView17 = (TextView) ViewBindings.findChildViewById(rootView, R.id.thirdBet);
                                                                                                                                        if (textView17 != null) {
                                                                                                                                            i = R.id.tipButton;
                                                                                                                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.tipButton);
                                                                                                                                            if (relativeLayout != null) {
                                                                                                                                                return new BettingSheetDialogBinding(constraintLayout, bind, imageView, alphaPressButton, imageView2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, imageView3, imageView4, imageView5, imageView6, imageView7, textView9, textView10, textView11, linearLayout, textView12, progressBar, textView13, textView14, imageView8, imageView9, seekBar, imageView10, constraintLayout, imageView11, textView15, textView16, textView17, relativeLayout);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
