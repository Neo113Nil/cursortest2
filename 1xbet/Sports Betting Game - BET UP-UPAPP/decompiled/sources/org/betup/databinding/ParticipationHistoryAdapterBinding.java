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
import org.betup.R;

/* loaded from: classes2.dex */
public final class ParticipationHistoryAdapterBinding implements ViewBinding {
    public final ConstraintLayout adapterContainerCl;
    public final ConstraintLayout betChallengeAdapterCoefCl;
    public final TextView betChallengeAdapterCoefTitleTv;
    public final ConstraintLayout betChallengeAdapterDateTimeCl;
    public final ConstraintLayout betChallengeAdapterIconCl;
    public final ConstraintLayout betChallengeAdapterMatchInfoCl;
    public final LinearLayout betChallengeAdapterStatusCl;
    public final TextView coefficientTv;
    public final TextView divider;
    public final ImageView iconIv;
    public final TextView matchNameTv;
    public final TextView participationDateTv;
    public final ImageView participationStatusIconIv;
    public final TextView participationStatusTv;
    public final TextView participationTimeTv;
    private final ConstraintLayout rootView;

    private ParticipationHistoryAdapterBinding(ConstraintLayout rootView, ConstraintLayout adapterContainerCl, ConstraintLayout betChallengeAdapterCoefCl, TextView betChallengeAdapterCoefTitleTv, ConstraintLayout betChallengeAdapterDateTimeCl, ConstraintLayout betChallengeAdapterIconCl, ConstraintLayout betChallengeAdapterMatchInfoCl, LinearLayout betChallengeAdapterStatusCl, TextView coefficientTv, TextView divider, ImageView iconIv, TextView matchNameTv, TextView participationDateTv, ImageView participationStatusIconIv, TextView participationStatusTv, TextView participationTimeTv) {
        this.rootView = rootView;
        this.adapterContainerCl = adapterContainerCl;
        this.betChallengeAdapterCoefCl = betChallengeAdapterCoefCl;
        this.betChallengeAdapterCoefTitleTv = betChallengeAdapterCoefTitleTv;
        this.betChallengeAdapterDateTimeCl = betChallengeAdapterDateTimeCl;
        this.betChallengeAdapterIconCl = betChallengeAdapterIconCl;
        this.betChallengeAdapterMatchInfoCl = betChallengeAdapterMatchInfoCl;
        this.betChallengeAdapterStatusCl = betChallengeAdapterStatusCl;
        this.coefficientTv = coefficientTv;
        this.divider = divider;
        this.iconIv = iconIv;
        this.matchNameTv = matchNameTv;
        this.participationDateTv = participationDateTv;
        this.participationStatusIconIv = participationStatusIconIv;
        this.participationStatusTv = participationStatusTv;
        this.participationTimeTv = participationTimeTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ParticipationHistoryAdapterBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ParticipationHistoryAdapterBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.participation_history_adapter, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ParticipationHistoryAdapterBinding bind(View rootView) {
        ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
        int i = R.id.bet_challenge_adapter_coef_cl;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.bet_challenge_adapter_coef_cl);
        if (constraintLayout2 != null) {
            i = R.id.bet_challenge_adapter_coef_title_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.bet_challenge_adapter_coef_title_tv);
            if (textView != null) {
                i = R.id.bet_challenge_adapter_date_time_cl;
                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.bet_challenge_adapter_date_time_cl);
                if (constraintLayout3 != null) {
                    i = R.id.bet_challenge_adapter_icon_cl;
                    ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.bet_challenge_adapter_icon_cl);
                    if (constraintLayout4 != null) {
                        i = R.id.bet_challenge_adapter_match_info_cl;
                        ConstraintLayout constraintLayout5 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.bet_challenge_adapter_match_info_cl);
                        if (constraintLayout5 != null) {
                            i = R.id.bet_challenge_adapter_status_cl;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.bet_challenge_adapter_status_cl);
                            if (linearLayout != null) {
                                i = R.id.coefficient_tv;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.coefficient_tv);
                                if (textView2 != null) {
                                    i = R.id.divider;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.divider);
                                    if (textView3 != null) {
                                        i = R.id.icon_iv;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_iv);
                                        if (imageView != null) {
                                            i = R.id.match_name_tv;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.match_name_tv);
                                            if (textView4 != null) {
                                                i = R.id.participation_date_tv;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.participation_date_tv);
                                                if (textView5 != null) {
                                                    i = R.id.participation_status_icon_iv;
                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.participation_status_icon_iv);
                                                    if (imageView2 != null) {
                                                        i = R.id.participation_status_tv;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.participation_status_tv);
                                                        if (textView6 != null) {
                                                            i = R.id.participation_time_tv;
                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.participation_time_tv);
                                                            if (textView7 != null) {
                                                                return new ParticipationHistoryAdapterBinding(constraintLayout, constraintLayout, constraintLayout2, textView, constraintLayout3, constraintLayout4, constraintLayout5, linearLayout, textView2, textView3, imageView, textView4, textView5, imageView2, textView6, textView7);
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
