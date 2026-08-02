package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.AlphaPressButton;
import org.betup.ui.views.BetUpLabelView;
import org.betup.ui.views.GameCardView;

/* loaded from: classes2.dex */
public final class FragmentWarGameBinding implements ViewBinding {
    public final ImageView arc;
    public final BetUpLabelView betupLabel;
    public final AlphaPressButton buttonDouble;
    public final AlphaPressButton buttonGiveUp;
    public final AlphaPressButton buttonHalf;
    public final AlphaPressButton buttonMax;
    public final AlphaPressButton buttonMin;
    public final AlphaPressButton buttonWar;
    public final LinearLayout containerDialogResult;
    public final LinearLayout containerDrawResult;
    public final ConstraintLayout containerMakeCustomBet;
    public final ContainerResultGamesBinding containerResultGames;
    public final View divideLine;
    public final EditText editDrawBet;
    public final EditText editWinBet;
    public final ConstraintLayout fragmentWarGame;
    public final Barrier labelsBarrier;
    public final GameCardView leftCard;
    public final View leftCardBack;
    public final View leftCardBound;
    public final AlphaPressButton makeBetButton;
    public final AlphaPressButton okButton;
    public final FrameLayout progress;
    public final ProgressBar progressBar;
    public final TextView resultScore;
    public final GameCardView rightCard;
    public final View rightCardBack;
    public final View rightCardBound;
    private final ConstraintLayout rootView;
    public final ConstraintLayout schene;
    public final View stub;
    public final TextView textDraw;
    public final TextView textWin;

    private FragmentWarGameBinding(ConstraintLayout rootView, ImageView arc, BetUpLabelView betupLabel, AlphaPressButton buttonDouble, AlphaPressButton buttonGiveUp, AlphaPressButton buttonHalf, AlphaPressButton buttonMax, AlphaPressButton buttonMin, AlphaPressButton buttonWar, LinearLayout containerDialogResult, LinearLayout containerDrawResult, ConstraintLayout containerMakeCustomBet, ContainerResultGamesBinding containerResultGames, View divideLine, EditText editDrawBet, EditText editWinBet, ConstraintLayout fragmentWarGame, Barrier labelsBarrier, GameCardView leftCard, View leftCardBack, View leftCardBound, AlphaPressButton makeBetButton, AlphaPressButton okButton, FrameLayout progress, ProgressBar progressBar, TextView resultScore, GameCardView rightCard, View rightCardBack, View rightCardBound, ConstraintLayout schene, View stub, TextView textDraw, TextView textWin) {
        this.rootView = rootView;
        this.arc = arc;
        this.betupLabel = betupLabel;
        this.buttonDouble = buttonDouble;
        this.buttonGiveUp = buttonGiveUp;
        this.buttonHalf = buttonHalf;
        this.buttonMax = buttonMax;
        this.buttonMin = buttonMin;
        this.buttonWar = buttonWar;
        this.containerDialogResult = containerDialogResult;
        this.containerDrawResult = containerDrawResult;
        this.containerMakeCustomBet = containerMakeCustomBet;
        this.containerResultGames = containerResultGames;
        this.divideLine = divideLine;
        this.editDrawBet = editDrawBet;
        this.editWinBet = editWinBet;
        this.fragmentWarGame = fragmentWarGame;
        this.labelsBarrier = labelsBarrier;
        this.leftCard = leftCard;
        this.leftCardBack = leftCardBack;
        this.leftCardBound = leftCardBound;
        this.makeBetButton = makeBetButton;
        this.okButton = okButton;
        this.progress = progress;
        this.progressBar = progressBar;
        this.resultScore = resultScore;
        this.rightCard = rightCard;
        this.rightCardBack = rightCardBack;
        this.rightCardBound = rightCardBound;
        this.schene = schene;
        this.stub = stub;
        this.textDraw = textDraw;
        this.textWin = textWin;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentWarGameBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentWarGameBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_war_game, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentWarGameBinding bind(View rootView) {
        int i = R.id.arc;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.arc);
        if (imageView != null) {
            i = R.id.betupLabel;
            BetUpLabelView betUpLabelView = (BetUpLabelView) ViewBindings.findChildViewById(rootView, R.id.betupLabel);
            if (betUpLabelView != null) {
                i = R.id.buttonDouble;
                AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.buttonDouble);
                if (alphaPressButton != null) {
                    i = R.id.buttonGiveUp;
                    AlphaPressButton alphaPressButton2 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.buttonGiveUp);
                    if (alphaPressButton2 != null) {
                        i = R.id.buttonHalf;
                        AlphaPressButton alphaPressButton3 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.buttonHalf);
                        if (alphaPressButton3 != null) {
                            i = R.id.buttonMax;
                            AlphaPressButton alphaPressButton4 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.buttonMax);
                            if (alphaPressButton4 != null) {
                                i = R.id.buttonMin;
                                AlphaPressButton alphaPressButton5 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.buttonMin);
                                if (alphaPressButton5 != null) {
                                    i = R.id.buttonWar;
                                    AlphaPressButton alphaPressButton6 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.buttonWar);
                                    if (alphaPressButton6 != null) {
                                        i = R.id.containerDialogResult;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.containerDialogResult);
                                        if (linearLayout != null) {
                                            i = R.id.containerDrawResult;
                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.containerDrawResult);
                                            if (linearLayout2 != null) {
                                                i = R.id.containerMakeCustomBet;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.containerMakeCustomBet);
                                                if (constraintLayout != null) {
                                                    i = R.id.containerResultGames;
                                                    View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.containerResultGames);
                                                    if (findChildViewById != null) {
                                                        ContainerResultGamesBinding bind = ContainerResultGamesBinding.bind(findChildViewById);
                                                        i = R.id.divide_line;
                                                        View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.divide_line);
                                                        if (findChildViewById2 != null) {
                                                            i = R.id.editDrawBet;
                                                            EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.editDrawBet);
                                                            if (editText != null) {
                                                                i = R.id.editWinBet;
                                                                EditText editText2 = (EditText) ViewBindings.findChildViewById(rootView, R.id.editWinBet);
                                                                if (editText2 != null) {
                                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) rootView;
                                                                    i = R.id.labelsBarrier;
                                                                    Barrier barrier = (Barrier) ViewBindings.findChildViewById(rootView, R.id.labelsBarrier);
                                                                    if (barrier != null) {
                                                                        i = R.id.leftCard;
                                                                        GameCardView gameCardView = (GameCardView) ViewBindings.findChildViewById(rootView, R.id.leftCard);
                                                                        if (gameCardView != null) {
                                                                            i = R.id.leftCardBack;
                                                                            View findChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.leftCardBack);
                                                                            if (findChildViewById3 != null) {
                                                                                i = R.id.leftCardBound;
                                                                                View findChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.leftCardBound);
                                                                                if (findChildViewById4 != null) {
                                                                                    i = R.id.makeBetButton;
                                                                                    AlphaPressButton alphaPressButton7 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.makeBetButton);
                                                                                    if (alphaPressButton7 != null) {
                                                                                        i = R.id.okButton;
                                                                                        AlphaPressButton alphaPressButton8 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.okButton);
                                                                                        if (alphaPressButton8 != null) {
                                                                                            i = R.id.progress;
                                                                                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.progress);
                                                                                            if (frameLayout != null) {
                                                                                                i = R.id.progressBar;
                                                                                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progressBar);
                                                                                                if (progressBar != null) {
                                                                                                    i = R.id.resultScore;
                                                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.resultScore);
                                                                                                    if (textView != null) {
                                                                                                        i = R.id.rightCard;
                                                                                                        GameCardView gameCardView2 = (GameCardView) ViewBindings.findChildViewById(rootView, R.id.rightCard);
                                                                                                        if (gameCardView2 != null) {
                                                                                                            i = R.id.rightCardBack;
                                                                                                            View findChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.rightCardBack);
                                                                                                            if (findChildViewById5 != null) {
                                                                                                                i = R.id.rightCardBound;
                                                                                                                View findChildViewById6 = ViewBindings.findChildViewById(rootView, R.id.rightCardBound);
                                                                                                                if (findChildViewById6 != null) {
                                                                                                                    i = R.id.schene;
                                                                                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.schene);
                                                                                                                    if (constraintLayout3 != null) {
                                                                                                                        i = R.id.stub;
                                                                                                                        View findChildViewById7 = ViewBindings.findChildViewById(rootView, R.id.stub);
                                                                                                                        if (findChildViewById7 != null) {
                                                                                                                            i = R.id.textDraw;
                                                                                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textDraw);
                                                                                                                            if (textView2 != null) {
                                                                                                                                i = R.id.textWin;
                                                                                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textWin);
                                                                                                                                if (textView3 != null) {
                                                                                                                                    return new FragmentWarGameBinding(constraintLayout2, imageView, betUpLabelView, alphaPressButton, alphaPressButton2, alphaPressButton3, alphaPressButton4, alphaPressButton5, alphaPressButton6, linearLayout, linearLayout2, constraintLayout, bind, findChildViewById2, editText, editText2, constraintLayout2, barrier, gameCardView, findChildViewById3, findChildViewById4, alphaPressButton7, alphaPressButton8, frameLayout, progressBar, textView, gameCardView2, findChildViewById5, findChildViewById6, constraintLayout3, findChildViewById7, textView2, textView3);
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
