package org.betup.ui.dialogs.adapter;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.util.Locale;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.api.rest.user.bets.models.BetsPlaceModel;
import org.betup.model.remote.entity.bets.BetState;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;
import org.betup.ui.base.BaseSingleItemAdapter;
import org.betup.utils.DateHelper;
import org.betup.utils.FormatHelper;
import org.betup.utils.OddHelper;
import org.betup.utils.UiExtensionsKt;

/* loaded from: classes2.dex */
public class BetItemDialogAdapter extends BaseSingleItemAdapter<BetsPlaceModel, BetViewHolder> {
    private static final String SCORE_STRING_FORMAT_PATTERN = "%s : %s";
    private final OddType oddType;

    @Override // org.betup.ui.base.BaseSingleItemAdapter
    public int getLayoutId() {
        return R.layout.competition_bet_result_item;
    }

    public class BetViewHolder_ViewBinding implements Unbinder {
        private BetViewHolder target;
        private View view7f0a01e7;

        public BetViewHolder_ViewBinding(final BetViewHolder target, View source) {
            this.target = target;
            target.odd = (TextView) Utils.findRequiredViewAsType(source, R.id.odd, "field 'odd'", TextView.class);
            target.teamNames = (TextView) Utils.findRequiredViewAsType(source, R.id.teamNames, "field 'teamNames'", TextView.class);
            target.score = (TextView) Utils.findRequiredViewAsType(source, R.id.score, "field 'score'", TextView.class);
            target.datetime = (TextView) Utils.findRequiredViewAsType(source, R.id.datetime, "field 'datetime'", TextView.class);
            target.bet = (TextView) Utils.findRequiredViewAsType(source, R.id.bet, "field 'bet'", TextView.class);
            View findRequiredView = Utils.findRequiredView(source, R.id.container, "method 'onClick'");
            this.view7f0a01e7 = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.adapter.BetItemDialogAdapter.BetViewHolder_ViewBinding.1
                @Override // butterknife.internal.DebouncingOnClickListener
                public void doClick(View p0) {
                    target.onClick();
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            BetViewHolder betViewHolder = this.target;
            if (betViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.target = null;
            betViewHolder.odd = null;
            betViewHolder.teamNames = null;
            betViewHolder.score = null;
            betViewHolder.datetime = null;
            betViewHolder.bet = null;
            this.view7f0a01e7.setOnClickListener(null);
            this.view7f0a01e7 = null;
        }
    }

    public BetItemDialogAdapter(Context context, OddType oddType) {
        super(context);
        this.oddType = oddType;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.ui.base.BaseSingleItemAdapter
    public BetViewHolder getViewHolder(View view) {
        return new BetViewHolder(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.ui.base.BaseSingleItemAdapter
    public void bindData(BetViewHolder viewHolder, BetsPlaceModel item, int position) {
        BetState state = item.getState();
        MatchDetailsDataModel sportMatch = item.getSportMatch();
        viewHolder.odd.setText(OddHelper.format(this.oddType, item.getPlacedCoeficient().doubleValue()));
        viewHolder.odd.setTextColor(getTextColorForBetState(state));
        ((GradientDrawable) viewHolder.odd.getBackground()).setColor(getColorForBetState(state));
        if (sportMatch.getState() != MatchState.SCHEDULED) {
            viewHolder.score.setVisibility(0);
            viewHolder.score.setText(String.format(Locale.getDefault(), SCORE_STRING_FORMAT_PATTERN, FormatHelper.getScoreFormatted(sportMatch.getScoreHome().floatValue()), FormatHelper.getScoreFormatted(sportMatch.getScoreAway().floatValue())));
        } else {
            viewHolder.score.setVisibility(8);
        }
        SpannableString spannableString = new SpannableString(String.format(SCORE_STRING_FORMAT_PATTERN, item.getBetsGameType(), item.getBetName()));
        spannableString.setSpan(new ForegroundColorSpan(InputDeviceCompat.SOURCE_ANY), item.getBetsGameType().length(), spannableString.length(), 33);
        String date = DateHelper.getDate(item.getSportMatch().getDate());
        String time = DateHelper.getTime(item.getSportMatch().getDate());
        viewHolder.teamNames.setText(String.format("%s - %s", item.getSportMatch().getHomeTeam().getName(), item.getSportMatch().getAwayTeam().getName()));
        viewHolder.bet.setText(String.format(Locale.getDefault(), "%s: %s", item.getBetsGameType(), UiExtensionsKt.formatBetNumbersForJava(item.getBetName())));
        viewHolder.datetime.setText(String.format(Locale.getDefault(), "%s | %s | %s | %s", getMatchState(item.getSportMatch().getState()), date, time, item.getSportMatch().getSport().getName()));
        viewHolder.datetime.setHint(getMatchStateHint(item.getSportMatch().getState()));
    }

    private String getMatchState(MatchState state) {
        int i = AnonymousClass1.$SwitchMap$org$betup$model$remote$entity$matches$MatchState[state.ordinal()];
        return getContext().getString(i != 1 ? i != 2 ? i != 3 ? R.string.live : R.string.finished_short : R.string.not_started_short : R.string.canceled_short);
    }

    private String getMatchStateHint(MatchState state) {
        int i = AnonymousClass1.$SwitchMap$org$betup$model$remote$entity$matches$MatchState[state.ordinal()];
        return getContext().getString(i != 1 ? i != 2 ? i != 3 ? R.string.live : R.string.finished_full : R.string.not_started_full : R.string.canceled_full);
    }

    /* renamed from: org.betup.ui.dialogs.adapter.BetItemDialogAdapter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$betup$model$remote$entity$bets$BetState;
        static final /* synthetic */ int[] $SwitchMap$org$betup$model$remote$entity$matches$MatchState;

        static {
            int[] iArr = new int[BetState.values().length];
            $SwitchMap$org$betup$model$remote$entity$bets$BetState = iArr;
            try {
                iArr[BetState.LOST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$betup$model$remote$entity$bets$BetState[BetState.WON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$betup$model$remote$entity$bets$BetState[BetState.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[MatchState.values().length];
            $SwitchMap$org$betup$model$remote$entity$matches$MatchState = iArr2;
            try {
                iArr2[MatchState.CANCELED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$betup$model$remote$entity$matches$MatchState[MatchState.SCHEDULED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$betup$model$remote$entity$matches$MatchState[MatchState.FINISHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private int getTextColorForBetState(BetState betState) {
        int i = AnonymousClass1.$SwitchMap$org$betup$model$remote$entity$bets$BetState[betState.ordinal()];
        if (i == 1 || i == 2) {
            return ContextCompat.getColor(getContext(), R.color.white);
        }
        return ContextCompat.getColor(getContext(), R.color.black);
    }

    private int getColorForBetState(BetState betState) {
        int i = AnonymousClass1.$SwitchMap$org$betup$model$remote$entity$bets$BetState[betState.ordinal()];
        if (i == 1) {
            return ContextCompat.getColor(getContext(), R.color.item_my_bets_color_red);
        }
        if (i == 2) {
            return ContextCompat.getColor(getContext(), R.color.odd_shape_color);
        }
        if (i == 3) {
            return ContextCompat.getColor(getContext(), R.color.colorAccent);
        }
        return ContextCompat.getColor(getContext(), R.color.bet_shape_amount_returned);
    }

    public class BetViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.bet)
        TextView bet;

        @BindView(R.id.datetime)
        TextView datetime;

        @BindView(R.id.odd)
        TextView odd;

        @BindView(R.id.score)
        TextView score;

        @BindView(R.id.teamNames)
        TextView teamNames;

        @OnClick({R.id.container})
        public void onClick() {
            if (BetItemDialogAdapter.this.listener != null) {
                BetItemDialogAdapter.this.listener.itemClicked(BetItemDialogAdapter.this.getItem(getBindingAdapterPosition()));
            }
        }

        public BetViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
