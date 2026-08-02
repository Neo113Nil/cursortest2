package org.betup.ui.fragment.home.adapter;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.util.ArrayList;
import java.util.List;
import org.betup.R;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.model.remote.entity.matches.championship.specific.ListedMatchModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;
import org.betup.ui.fragment.home.AdapterAppliedListener;
import org.betup.utils.DateHelper;
import org.betup.utils.FormatHelper;
import org.betup.utils.NameFormatter;
import org.betup.utils.PicassoHelper;
import org.betup.utils.UiExtensionsKt;

/* loaded from: classes4.dex */
public class FavoriteTeamsNextMatchesAdapter extends BaseAdapter implements LinearLayoutAdapter {
    private Context context;
    private List<ListedMatchModel> homeScreenHotMatchModels;
    private LayoutInflater mInflater;
    private OnFavoriteTeamsMatchesClickListener onFavoriteTeamsMatchesClickListener;

    public interface OnFavoriteTeamsMatchesClickListener {
        void onFavoriteTeamMatchClick(int matchId, boolean isLive);
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder target;
        private View view7f0a0341;

        public ViewHolder_ViewBinding(final ViewHolder target, View source) {
            this.target = target;
            target.firstTeamIcon = (ImageView) Utils.findRequiredViewAsType(source, R.id.likeIcon, "field 'firstTeamIcon'", ImageView.class);
            target.firstTeamName = (TextView) Utils.findRequiredViewAsType(source, R.id.firstTeamName, "field 'firstTeamName'", TextView.class);
            target.matchDate = (TextView) Utils.findRequiredViewAsType(source, R.id.matchDate, "field 'matchDate'", TextView.class);
            target.matchTime = (TextView) Utils.findRequiredViewAsType(source, R.id.matchTime, "field 'matchTime'", TextView.class);
            target.secondTeamName = (TextView) Utils.findRequiredViewAsType(source, R.id.secondTeamName, "field 'secondTeamName'", TextView.class);
            target.secondTeamIcon = (ImageView) Utils.findRequiredViewAsType(source, R.id.secondTeamIcon, "field 'secondTeamIcon'", ImageView.class);
            View findRequiredView = Utils.findRequiredView(source, R.id.header, "method 'onClick'");
            this.view7f0a0341 = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.home.adapter.FavoriteTeamsNextMatchesAdapter.ViewHolder_ViewBinding.1
                @Override // butterknife.internal.DebouncingOnClickListener
                public void doClick(View p0) {
                    target.onClick();
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ViewHolder viewHolder = this.target;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.target = null;
            viewHolder.firstTeamIcon = null;
            viewHolder.firstTeamName = null;
            viewHolder.matchDate = null;
            viewHolder.matchTime = null;
            viewHolder.secondTeamName = null;
            viewHolder.secondTeamIcon = null;
            this.view7f0a0341.setOnClickListener(null);
            this.view7f0a0341 = null;
        }
    }

    public FavoriteTeamsNextMatchesAdapter(Context context, List<ListedMatchModel> homeScreenHotMatchModels) {
        this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        this.homeScreenHotMatchModels = homeScreenHotMatchModels;
        this.context = context;
    }

    @Override // org.betup.ui.fragment.home.adapter.LinearLayoutAdapter
    public void apply(final LinearLayout layout, final AdapterAppliedListener listener) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.homeScreenHotMatchModels.size(); i++) {
            arrayList.add(this.mInflater.inflate(R.layout.item_fav_teams_matches, (ViewGroup) null, false));
        }
        layout.removeAllViews();
        for (int i2 = 0; i2 < this.homeScreenHotMatchModels.size(); i2++) {
            layout.addView(getView(i2, (View) arrayList.get(i2), layout));
        }
        listener.applied();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.homeScreenHotMatchModels.size();
    }

    @Override // android.widget.Adapter
    public ListedMatchModel getItem(int position) {
        return this.homeScreenHotMatchModels.get(position);
    }

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        return this.homeScreenHotMatchModels.get(position).hashCode();
    }

    @Override // android.widget.Adapter
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = this.mInflater.inflate(R.layout.item_fav_teams_matches, parent, false);
        }
        ListedMatchModel item = getItem(position);
        ViewHolder viewHolder = new ViewHolder(convertView);
        viewHolder.index = position;
        PicassoHelper.with(this.context).setImageView(viewHolder.firstTeamIcon).setImageUrl(item.getMatch().getHomeTeam().getPhotoUrl()).load();
        NameFormatter.setTeamNameForList(viewHolder.firstTeamName, item.getMatch().getHomeTeam().getName());
        NameFormatter.setTeamNameForList(viewHolder.secondTeamName, item.getMatch().getAwayTeam().getName());
        MatchDetailsDataModel match = item.getMatch();
        if (match.getState() == MatchState.LIVE) {
            viewHolder.matchDate.setText(Html.fromHtml(FormatHelper.getCommonScore(match.getScoreHome().floatValue(), match.getScoreAway().floatValue(), false, ":")));
            String normalizeMatchTime = UiExtensionsKt.normalizeMatchTime(match.getCurrentPeriod());
            if (!normalizeMatchTime.isEmpty()) {
                viewHolder.matchTime.setText(normalizeMatchTime);
            } else {
                viewHolder.matchTime.setText(DateHelper.getTime(match.getDate()));
            }
        } else {
            viewHolder.matchDate.setText(DateHelper.getDate(match.getDate()));
            viewHolder.matchTime.setText(DateHelper.getTime(match.getDate()));
        }
        PicassoHelper.with(this.context).setImageView(viewHolder.secondTeamIcon).setImageUrl(item.getMatch().getAwayTeam().getPhotoUrl()).load();
        return convertView;
    }

    public class ViewHolder {

        @BindView(R.id.likeIcon)
        ImageView firstTeamIcon;

        @BindView(R.id.firstTeamName)
        TextView firstTeamName;
        private int index;

        @BindView(R.id.matchDate)
        TextView matchDate;

        @BindView(R.id.matchTime)
        TextView matchTime;

        @BindView(R.id.secondTeamIcon)
        ImageView secondTeamIcon;

        @BindView(R.id.secondTeamName)
        TextView secondTeamName;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }

        @OnClick({R.id.header})
        public void onClick() {
            FavoriteTeamsNextMatchesAdapter.this.onFavoriteTeamsMatchesClickListener.onFavoriteTeamMatchClick(FavoriteTeamsNextMatchesAdapter.this.getItem(this.index).getMatch().getId().intValue(), FavoriteTeamsNextMatchesAdapter.this.getItem(this.index).getMatch().getState() == MatchState.LIVE);
        }
    }

    public void setOnFavoriteTeamsMatchesClickListener(OnFavoriteTeamsMatchesClickListener onHotMatchesClickListener) {
        this.onFavoriteTeamsMatchesClickListener = onHotMatchesClickListener;
    }
}
