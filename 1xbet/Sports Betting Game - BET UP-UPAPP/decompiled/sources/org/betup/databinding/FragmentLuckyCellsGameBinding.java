package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentLuckyCellsGameBinding implements ViewBinding {
    public final PlaceBetcoinsAmountContainerBinding betContainer;
    public final ImageView bottomBtnIconIv;
    public final ConstraintLayout bottomBtnLl;
    public final TextView bottomBtnTv;
    public final ConstraintLayout coefLl;
    public final RecyclerView coefRv;
    public final ConstraintLayout coefTitleLl;
    public final TextView coefTitleTv;
    public final LinearLayout luckyCellMapLl;
    public final ConstraintLayout luckyCellsBottomLl;
    public final LinearLayout luckyCellsGameStatusLl;
    public final TextView luckyCellsGameStatusSubtitleTv;
    public final ImageView luckyCellsGameStatusTitleIv;
    public final TextView luckyCellsGameStatusTitleTv;
    public final RecyclerView mapRv;
    public final TextView prizeRemainsTv;
    public final TextView rewardAmountTv;
    private final ConstraintLayout rootView;
    public final LinearLayout statsLl;
    public final TextView trapsRemainsTv;

    private FragmentLuckyCellsGameBinding(ConstraintLayout rootView, PlaceBetcoinsAmountContainerBinding betContainer, ImageView bottomBtnIconIv, ConstraintLayout bottomBtnLl, TextView bottomBtnTv, ConstraintLayout coefLl, RecyclerView coefRv, ConstraintLayout coefTitleLl, TextView coefTitleTv, LinearLayout luckyCellMapLl, ConstraintLayout luckyCellsBottomLl, LinearLayout luckyCellsGameStatusLl, TextView luckyCellsGameStatusSubtitleTv, ImageView luckyCellsGameStatusTitleIv, TextView luckyCellsGameStatusTitleTv, RecyclerView mapRv, TextView prizeRemainsTv, TextView rewardAmountTv, LinearLayout statsLl, TextView trapsRemainsTv) {
        this.rootView = rootView;
        this.betContainer = betContainer;
        this.bottomBtnIconIv = bottomBtnIconIv;
        this.bottomBtnLl = bottomBtnLl;
        this.bottomBtnTv = bottomBtnTv;
        this.coefLl = coefLl;
        this.coefRv = coefRv;
        this.coefTitleLl = coefTitleLl;
        this.coefTitleTv = coefTitleTv;
        this.luckyCellMapLl = luckyCellMapLl;
        this.luckyCellsBottomLl = luckyCellsBottomLl;
        this.luckyCellsGameStatusLl = luckyCellsGameStatusLl;
        this.luckyCellsGameStatusSubtitleTv = luckyCellsGameStatusSubtitleTv;
        this.luckyCellsGameStatusTitleIv = luckyCellsGameStatusTitleIv;
        this.luckyCellsGameStatusTitleTv = luckyCellsGameStatusTitleTv;
        this.mapRv = mapRv;
        this.prizeRemainsTv = prizeRemainsTv;
        this.rewardAmountTv = rewardAmountTv;
        this.statsLl = statsLl;
        this.trapsRemainsTv = trapsRemainsTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentLuckyCellsGameBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentLuckyCellsGameBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_lucky_cells_game, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentLuckyCellsGameBinding bind(View rootView) {
        int i = R.id.bet_container;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.bet_container);
        if (findChildViewById != null) {
            PlaceBetcoinsAmountContainerBinding bind = PlaceBetcoinsAmountContainerBinding.bind(findChildViewById);
            i = R.id.bottom_btn_icon_iv;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.bottom_btn_icon_iv);
            if (imageView != null) {
                i = R.id.bottom_btn_ll;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.bottom_btn_ll);
                if (constraintLayout != null) {
                    i = R.id.bottom_btn_tv;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.bottom_btn_tv);
                    if (textView != null) {
                        i = R.id.coef_ll;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.coef_ll);
                        if (constraintLayout2 != null) {
                            i = R.id.coef_rv;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.coef_rv);
                            if (recyclerView != null) {
                                i = R.id.coef_title_ll;
                                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.coef_title_ll);
                                if (constraintLayout3 != null) {
                                    i = R.id.coef_title_tv;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.coef_title_tv);
                                    if (textView2 != null) {
                                        i = R.id.lucky_cell_map_ll;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.lucky_cell_map_ll);
                                        if (linearLayout != null) {
                                            i = R.id.lucky_cells_bottom_ll;
                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.lucky_cells_bottom_ll);
                                            if (constraintLayout4 != null) {
                                                i = R.id.lucky_cells_game_status_ll;
                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.lucky_cells_game_status_ll);
                                                if (linearLayout2 != null) {
                                                    i = R.id.lucky_cells_game_status_subtitle_tv;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.lucky_cells_game_status_subtitle_tv);
                                                    if (textView3 != null) {
                                                        i = R.id.lucky_cells_game_status_title_iv;
                                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.lucky_cells_game_status_title_iv);
                                                        if (imageView2 != null) {
                                                            i = R.id.lucky_cells_game_status_title_tv;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.lucky_cells_game_status_title_tv);
                                                            if (textView4 != null) {
                                                                i = R.id.map_rv;
                                                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.map_rv);
                                                                if (recyclerView2 != null) {
                                                                    i = R.id.prize_remains_tv;
                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.prize_remains_tv);
                                                                    if (textView5 != null) {
                                                                        i = R.id.reward_amount_tv;
                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.reward_amount_tv);
                                                                        if (textView6 != null) {
                                                                            i = R.id.stats_ll;
                                                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.stats_ll);
                                                                            if (linearLayout3 != null) {
                                                                                i = R.id.traps_remains_tv;
                                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.traps_remains_tv);
                                                                                if (textView7 != null) {
                                                                                    return new FragmentLuckyCellsGameBinding((ConstraintLayout) rootView, bind, imageView, constraintLayout, textView, constraintLayout2, recyclerView, constraintLayout3, textView2, linearLayout, constraintLayout4, linearLayout2, textView3, imageView2, textView4, recyclerView2, textView5, textView6, linearLayout3, textView7);
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
