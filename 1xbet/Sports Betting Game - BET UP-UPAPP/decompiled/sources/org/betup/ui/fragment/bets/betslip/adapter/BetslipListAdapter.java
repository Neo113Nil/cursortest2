package org.betup.ui.fragment.bets.betslip.adapter;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.betup.R;
import org.betup.bus.NavigateMessage;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.ui.fragment.bets.betslip.adapter.model.BetModel;
import org.betup.utils.DateHelper;
import org.betup.utils.OddHelper;
import org.betup.utils.SnackbarHelper;
import org.betup.utils.UiExtensionsKt;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes4.dex */
public class BetslipListAdapter extends RecyclerView.Adapter<BetslipViewHolder> {
    private Context context;
    private LayoutInflater inflater;
    private List<BetModel> items;
    private OddType oddType;
    private OnBetslipItemClickListener onBetslipItemClickListener;

    public interface OnBetslipItemClickListener {
        void singleBetRemoved(long graddebBetId);
    }

    public class BetslipViewHolder_ViewBinding implements Unbinder {
        private BetslipViewHolder target;
        private View view7f0a01e7;
        private View view7f0a03ae;
        private View view7f0a05df;

        public BetslipViewHolder_ViewBinding(final BetslipViewHolder target, View source) {
            this.target = target;
            target.time = (TextView) Utils.findRequiredViewAsType(source, R.id.itemBetslipTime, "field 'time'", TextView.class);
            target.isLiveContainer = Utils.findRequiredView(source, R.id.itemBetslipIsLiveText, "field 'isLiveContainer'");
            target.teamNames = (TextView) Utils.findRequiredViewAsType(source, R.id.itemBetslipTeamNames, "field 'teamNames'", TextView.class);
            target.userPick = (TextView) Utils.findRequiredViewAsType(source, R.id.itemBetslipUsersPick, "field 'userPick'", TextView.class);
            target.sportName = (TextView) Utils.findRequiredViewAsType(source, R.id.itemBetslipSportName, "field 'sportName'", TextView.class);
            target.odds = (TextView) Utils.findRequiredViewAsType(source, R.id.itemBetslipOdds, "field 'odds'", TextView.class);
            View findRequiredView = Utils.findRequiredView(source, R.id.itemBetslipIsSelected, "field 'isSelected' and method 'onRemoveOtherClick'");
            target.isSelected = (ImageView) Utils.castView(findRequiredView, R.id.itemBetslipIsSelected, "field 'isSelected'", ImageView.class);
            this.view7f0a03ae = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.bets.betslip.adapter.BetslipListAdapter.BetslipViewHolder_ViewBinding.1
                @Override // butterknife.internal.DebouncingOnClickListener
                public void doClick(View p0) {
                    target.onRemoveOtherClick();
                }
            });
            View findRequiredView2 = Utils.findRequiredView(source, R.id.remove, "field 'remove' and method 'onRemoveClick'");
            target.remove = (ImageView) Utils.castView(findRequiredView2, R.id.remove, "field 'remove'", ImageView.class);
            this.view7f0a05df = findRequiredView2;
            findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.bets.betslip.adapter.BetslipListAdapter.BetslipViewHolder_ViewBinding.2
                @Override // butterknife.internal.DebouncingOnClickListener
                public void doClick(View p0) {
                    target.onRemoveClick();
                }
            });
            target.lock = Utils.findRequiredView(source, R.id.lock, "field 'lock'");
            target.stat = (ImageView) Utils.findRequiredViewAsType(source, R.id.stat, "field 'stat'", ImageView.class);
            target.oddHolder = Utils.findRequiredView(source, R.id.oddHolder, "field 'oddHolder'");
            target.lockIcon = Utils.findRequiredView(source, R.id.lockIcon, "field 'lockIcon'");
            View findRequiredView3 = Utils.findRequiredView(source, R.id.container, "field 'container' and method 'goToClick'");
            target.container = (LinearLayout) Utils.castView(findRequiredView3, R.id.container, "field 'container'", LinearLayout.class);
            this.view7f0a01e7 = findRequiredView3;
            findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.bets.betslip.adapter.BetslipListAdapter.BetslipViewHolder_ViewBinding.3
                @Override // butterknife.internal.DebouncingOnClickListener
                public void doClick(View p0) {
                    target.goToClick();
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            BetslipViewHolder betslipViewHolder = this.target;
            if (betslipViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.target = null;
            betslipViewHolder.time = null;
            betslipViewHolder.isLiveContainer = null;
            betslipViewHolder.teamNames = null;
            betslipViewHolder.userPick = null;
            betslipViewHolder.sportName = null;
            betslipViewHolder.odds = null;
            betslipViewHolder.isSelected = null;
            betslipViewHolder.remove = null;
            betslipViewHolder.lock = null;
            betslipViewHolder.stat = null;
            betslipViewHolder.oddHolder = null;
            betslipViewHolder.lockIcon = null;
            betslipViewHolder.container = null;
            this.view7f0a03ae.setOnClickListener(null);
            this.view7f0a03ae = null;
            this.view7f0a05df.setOnClickListener(null);
            this.view7f0a05df = null;
            this.view7f0a01e7.setOnClickListener(null);
            this.view7f0a01e7 = null;
        }
    }

    public BetslipListAdapter(Context context, ArrayList<BetModel> items, OddType oddType) {
        this.context = context;
        this.items = items;
        this.oddType = oddType;
        this.inflater = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public void setOddType(OddType oddType) {
        this.oddType = oddType;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public BetslipViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new BetslipViewHolder(this.inflater.inflate(R.layout.item_betslip, parent, false));
    }

    public void displayBets(List<BetModel> bets) {
        this.items = bets;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(BetslipViewHolder holder, int position) {
        BetModel betModel = this.items.get(position);
        holder.isSelected.setTag(Integer.valueOf(position));
        if (betModel.getMatch().getShortName() != null) {
            holder.teamNames.setText(betModel.getMatch().getShortName());
        } else {
            holder.teamNames.setText(String.format(Locale.getDefault(), "%s - %s", betModel.getMatch().getHomeTeam().getName(), betModel.getMatch().getAwayTeam().getName()));
        }
        if (betModel.getBet().getSubMatch() != null) {
            holder.userPick.setText(String.format("%s: %s", betModel.getBet().getSubMatch().getName(), UiExtensionsKt.formatBetNumbersForJava(betModel.getBet().getBetName())));
        } else {
            holder.userPick.setText(UiExtensionsKt.formatBetNumbersForJava(betModel.getBet().getBetName()));
        }
        holder.sportName.setText(betModel.getMatch().getSport().getName());
        holder.odds.setText(OddHelper.format(this.oddType, betModel.getBet().getGrabbedCoeficient()));
        holder.time.setText(String.format(Locale.getDefault(), "%s | %s | %s", DateHelper.getDate(betModel.getMatch().getDate()), DateHelper.getTime(betModel.getMatch().getDate()), betModel.getMatch().getSport().getName()));
        if (betModel.getMatch().getState() == MatchState.LIVE) {
            holder.isLiveContainer.setVisibility(0);
        } else {
            holder.isLiveContainer.setVisibility(8);
        }
        betModel.setSelected(false);
        if ((holder.teamNames.getPaintFlags() & 16) > 0) {
            Log.d("BETSLIPS", "NO STRIKE!");
            holder.odds.setPaintFlags(holder.odds.getPaintFlags() & (-17));
        }
        if (betModel.isAvailable()) {
            holder.container.setAlpha(1.0f);
            holder.lockIcon.setVisibility(8);
            holder.lock.setVisibility(8);
            int i = AnonymousClass3.$SwitchMap$org$betup$ui$fragment$bets$betslip$adapter$model$BetModel$stat[betModel.getStatus().ordinal()];
            if (i == 1) {
                holder.stat.setVisibility(0);
                holder.stat.setRotation(180.0f);
                ((GradientDrawable) holder.oddHolder.getBackground()).setColor(this.context.getResources().getColor(R.color.betslip_color_green));
                return;
            } else if (i != 2) {
                holder.stat.setVisibility(8);
                ((GradientDrawable) holder.oddHolder.getBackground()).setColor(this.context.getResources().getColor(R.color.colorAccent));
                return;
            } else {
                holder.stat.setVisibility(0);
                holder.stat.setRotation(0.0f);
                ((GradientDrawable) holder.oddHolder.getBackground()).setColor(this.context.getResources().getColor(R.color.betslip_color_red));
                return;
            }
        }
        if (!betModel.isDeleted()) {
            holder.container.setAlpha(1.0f);
            holder.lockIcon.setVisibility(0);
            holder.lock.setVisibility(0);
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.betup.ui.fragment.bets.betslip.adapter.BetslipListAdapter.1
                @Override // android.view.View.OnClickListener
                public void onClick(View v) {
                    SnackbarHelper.showShortIfForeground(BetslipListAdapter.this.context, R.string.bet_removed);
                }
            };
            holder.lock.setOnClickListener(onClickListener);
            holder.lockIcon.setOnClickListener(onClickListener);
            return;
        }
        Log.d("BETSLIP", "STRIKING!");
        holder.teamNames.setPaintFlags(17);
        holder.lockIcon.setVisibility(8);
        holder.container.setAlpha(0.5f);
        holder.lock.setVisibility(0);
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.betup.ui.fragment.bets.betslip.adapter.BetslipListAdapter.2
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                SnackbarHelper.showShortIfForeground(BetslipListAdapter.this.context, R.string.bet_not_available);
            }
        };
        holder.lock.setOnClickListener(onClickListener2);
        holder.lockIcon.setOnClickListener(onClickListener2);
    }

    /* renamed from: org.betup.ui.fragment.bets.betslip.adapter.BetslipListAdapter$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$org$betup$ui$fragment$bets$betslip$adapter$model$BetModel$stat;

        static {
            int[] iArr = new int[BetModel.stat.values().length];
            $SwitchMap$org$betup$ui$fragment$bets$betslip$adapter$model$BetModel$stat = iArr;
            try {
                iArr[BetModel.stat.INCREASED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$betup$ui$fragment$bets$betslip$adapter$model$BetModel$stat[BetModel.stat.DECREASED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    public class BetslipViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.container)
        LinearLayout container;

        @BindView(R.id.itemBetslipIsLiveText)
        View isLiveContainer;

        @BindView(R.id.itemBetslipIsSelected)
        ImageView isSelected;

        @BindView(R.id.lock)
        View lock;

        @BindView(R.id.lockIcon)
        View lockIcon;

        @BindView(R.id.oddHolder)
        View oddHolder;

        @BindView(R.id.itemBetslipOdds)
        TextView odds;

        @BindView(R.id.remove)
        ImageView remove;

        @BindView(R.id.itemBetslipSportName)
        TextView sportName;

        @BindView(R.id.stat)
        ImageView stat;

        @BindView(R.id.itemBetslipTeamNames)
        TextView teamNames;

        @BindView(R.id.itemBetslipTime)
        TextView time;

        @BindView(R.id.itemBetslipUsersPick)
        TextView userPick;

        private void goToMatch() {
            Bundle bundle = new Bundle();
            bundle.putInt("matchId", ((BetModel) BetslipListAdapter.this.items.get(getAdapterPosition())).getMatch().getId().intValue());
            bundle.putBoolean("isLive", ((BetModel) BetslipListAdapter.this.items.get(getAdapterPosition())).getMatch().getState() == MatchState.LIVE);
            EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.MATCH_DETAILS, bundle));
        }

        @OnClick({R.id.container})
        public void goToClick() {
            goToMatch();
        }

        private void remove() {
            Log.d("SLOWTEST", "ITEMS BF = " + BetslipListAdapter.this.items.size());
            Log.d("SLOWTEST", "ITEMS AF = " + BetslipListAdapter.this.items.size());
            int adapterPosition = getAdapterPosition();
            if (adapterPosition == -1) {
                return;
            }
            long grabbedBetId = ((BetModel) BetslipListAdapter.this.items.get(adapterPosition)).getGrabbedBetId();
            BetslipListAdapter.this.items.remove(adapterPosition);
            BetslipListAdapter.this.notifyItemRemoved(adapterPosition);
            BetslipListAdapter.this.onBetslipItemClickListener.singleBetRemoved(grabbedBetId);
        }

        @OnClick({R.id.itemBetslipIsSelected})
        public void onRemoveOtherClick() {
            remove();
        }

        @OnClick({R.id.remove})
        public void onRemoveClick() {
            remove();
        }

        BetslipViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    public BetslipListAdapter setOnBetslipItemClickListener(OnBetslipItemClickListener onBetslipItemClickListener) {
        this.onBetslipItemClickListener = onBetslipItemClickListener;
        return this;
    }
}
