package org.betup.ui.fragment.matches.details.stats.h2h.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;
import org.betup.model.remote.entity.matches.stats.h2h.TeamDataModel;
import org.betup.utils.DateHelper;
import org.betup.utils.PicassoHelper;

/* loaded from: classes4.dex */
public class TeamHead2HeadAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private List<Head2HeadItem> items = new ArrayList();
    private LayoutInflater layoutInflater;
    private OnMatchClickListener listener;

    public interface OnMatchClickListener {
        void onMatchClicked(MatchDetailsDataModel match);
    }

    public class TitleHolder_ViewBinding implements Unbinder {
        private TitleHolder target;

        public TitleHolder_ViewBinding(TitleHolder target, View source) {
            this.target = target;
            target.title = (TextView) Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            TitleHolder titleHolder = this.target;
            if (titleHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.target = null;
            titleHolder.title = null;
        }
    }

    public class MatchHolder_ViewBinding implements Unbinder {
        private MatchHolder target;
        private View view7f0a01e7;

        public MatchHolder_ViewBinding(final MatchHolder target, View source) {
            this.target = target;
            target.homeIcon = (ImageView) Utils.findRequiredViewAsType(source, R.id.homeIcon, "field 'homeIcon'", ImageView.class);
            target.awayIcon = (ImageView) Utils.findRequiredViewAsType(source, R.id.awayIcon, "field 'awayIcon'", ImageView.class);
            target.homeTeam = (TextView) Utils.findRequiredViewAsType(source, R.id.homeTitle, "field 'homeTeam'", TextView.class);
            target.awayTeam = (TextView) Utils.findRequiredViewAsType(source, R.id.awayTitle, "field 'awayTeam'", TextView.class);
            target.date = (TextView) Utils.findRequiredViewAsType(source, R.id.date, "field 'date'", TextView.class);
            target.score = (TextView) Utils.findRequiredViewAsType(source, R.id.score, "field 'score'", TextView.class);
            View findRequiredView = Utils.findRequiredView(source, R.id.container, "field 'container' and method 'onMatchClick'");
            target.container = (ViewGroup) Utils.castView(findRequiredView, R.id.container, "field 'container'", ViewGroup.class);
            this.view7f0a01e7 = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.matches.details.stats.h2h.adapter.TeamHead2HeadAdapter.MatchHolder_ViewBinding.1
                @Override // butterknife.internal.DebouncingOnClickListener
                public void doClick(View p0) {
                    target.onMatchClick();
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            MatchHolder matchHolder = this.target;
            if (matchHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.target = null;
            matchHolder.homeIcon = null;
            matchHolder.awayIcon = null;
            matchHolder.homeTeam = null;
            matchHolder.awayTeam = null;
            matchHolder.date = null;
            matchHolder.score = null;
            matchHolder.container = null;
            this.view7f0a01e7.setOnClickListener(null);
            this.view7f0a01e7 = null;
        }
    }

    public TeamHead2HeadAdapter(Context context, OnMatchClickListener listener) {
        this.context = context;
        this.layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        this.listener = listener;
    }

    public void addAll(List<MatchDetailsDataModel> previous) {
        for (int i = 0; i < previous.size(); i++) {
            this.items.add(new Head2HeadItem(previous.get(i), i % 2 == 0 ? Head2HeadType.LIGHT : Head2HeadType.DARK, false));
        }
        notifyDataSetChanged();
    }

    public void addAll(String teamName, TeamDataModel model) {
        this.items.clear();
        this.items.add(new Head2HeadItem(String.format(Locale.getDefault(), "%s: %s", this.context.getString(R.string.recent_games), teamName)));
        for (int i = 0; i < model.getRecent().size(); i++) {
            this.items.add(new Head2HeadItem(model.getRecent().get(i), i % 2 == 0 ? Head2HeadType.LIGHT : Head2HeadType.DARK, false));
        }
        this.items.add(new Head2HeadItem(String.format(Locale.getDefault(), "%s: %s", this.context.getString(R.string.future_games), teamName)));
        for (int i2 = 0; i2 < model.getFuture().size(); i2++) {
            this.items.add(new Head2HeadItem(model.getFuture().get(i2), i2 % 2 == 0 ? Head2HeadType.LIGHT : Head2HeadType.DARK, true));
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.items.get(position).getType().getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == Head2HeadType.HEADER.getValue()) {
            return new TitleHolder(this.layoutInflater.inflate(R.layout.item_h2h_team_title, parent, false));
        }
        return new MatchHolder(this.layoutInflater.inflate(R.layout.item_h2h_team_game, parent, false));
    }

    /* renamed from: org.betup.ui.fragment.matches.details.stats.h2h.adapter.TeamHead2HeadAdapter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$betup$ui$fragment$matches$details$stats$h2h$adapter$TeamHead2HeadAdapter$Head2HeadType;

        static {
            int[] iArr = new int[Head2HeadType.values().length];
            $SwitchMap$org$betup$ui$fragment$matches$details$stats$h2h$adapter$TeamHead2HeadAdapter$Head2HeadType = iArr;
            try {
                iArr[Head2HeadType.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$betup$ui$fragment$matches$details$stats$h2h$adapter$TeamHead2HeadAdapter$Head2HeadType[Head2HeadType.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$betup$ui$fragment$matches$details$stats$h2h$adapter$TeamHead2HeadAdapter$Head2HeadType[Head2HeadType.HEADER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Head2HeadType fromInt = Head2HeadType.fromInt(holder.getItemViewType());
        int i = AnonymousClass1.$SwitchMap$org$betup$ui$fragment$matches$details$stats$h2h$adapter$TeamHead2HeadAdapter$Head2HeadType[fromInt.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            ((TitleHolder) holder).title.setText(this.items.get(position).getHeader());
            return;
        }
        MatchDetailsDataModel match = this.items.get(position).getMatch();
        MatchHolder matchHolder = (MatchHolder) holder;
        matchHolder.container.setBackgroundResource(fromInt == Head2HeadType.DARK ? R.color.h2h_dark : R.color.h2h_light);
        matchHolder.homeTeam.setText(match.getHomeTeam().getName());
        matchHolder.awayTeam.setText(match.getAwayTeam().getName());
        if (this.items.get(position).isFuture) {
            matchHolder.score.setText(DateHelper.getTime(match.getDate()));
        } else {
            matchHolder.score.setText(match.getResultGeneral().replace("-", " : "));
        }
        matchHolder.date.setText(DateHelper.getDate(match.getDate()));
        PicassoHelper.with(this.context).setImageUrl(match.getHomeTeam().getPhotoUrl()).setImageView(matchHolder.homeIcon).load();
        PicassoHelper.with(this.context).setImageUrl(match.getAwayTeam().getPhotoUrl()).setImageView(matchHolder.awayIcon).load();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    public static class TitleHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.title)
        TextView title;

        public TitleHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public class MatchHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.awayIcon)
        ImageView awayIcon;

        @BindView(R.id.awayTitle)
        TextView awayTeam;

        @BindView(R.id.container)
        ViewGroup container;

        @BindView(R.id.date)
        TextView date;

        @BindView(R.id.homeIcon)
        ImageView homeIcon;

        @BindView(R.id.homeTitle)
        TextView homeTeam;

        @BindView(R.id.score)
        TextView score;

        public MatchHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @OnClick({R.id.container})
        public void onMatchClick() {
            if (TeamHead2HeadAdapter.this.listener != null) {
                TeamHead2HeadAdapter.this.listener.onMatchClicked(((Head2HeadItem) TeamHead2HeadAdapter.this.items.get(getAdapterPosition())).getMatch());
            }
        }
    }

    public enum Head2HeadType {
        HEADER(0),
        DARK(1),
        LIGHT(2);

        private int value;

        Head2HeadType(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }

        public static Head2HeadType fromInt(int val) {
            if (val == 0) {
                return HEADER;
            }
            if (val == 1) {
                return DARK;
            }
            return LIGHT;
        }
    }

    public static class Head2HeadItem {
        private String header;
        private boolean isFuture;
        private MatchDetailsDataModel match;
        private Head2HeadType type;

        public Head2HeadItem(String header) {
            this.header = header;
            this.type = Head2HeadType.HEADER;
        }

        public boolean isFuture() {
            return this.isFuture;
        }

        public Head2HeadItem(MatchDetailsDataModel match, Head2HeadType type, boolean isFuture) {
            this.match = match;
            this.type = type;
            this.isFuture = isFuture;
        }

        public String getHeader() {
            return this.header;
        }

        public void setHeader(String header) {
            this.header = header;
        }

        public MatchDetailsDataModel getMatch() {
            return this.match;
        }

        public void setMatch(MatchDetailsDataModel match) {
            this.match = match;
        }

        public Head2HeadType getType() {
            return this.type;
        }
    }
}
