package org.betup.ui.fragment.matches.details.stats.standings;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.util.ArrayList;
import java.util.List;
import org.betup.R;
import org.betup.model.remote.entity.matches.stats.standings.TeamStanding;
import org.betup.utils.PicassoHelper;

/* loaded from: classes4.dex */
public class StandingsAdapter extends RecyclerView.Adapter<StandingHolder> {
    private Context context;
    private LayoutInflater inflater;
    private List<TeamStanding> items = new ArrayList();

    public class StandingHolder_ViewBinding implements Unbinder {
        private StandingHolder target;

        public StandingHolder_ViewBinding(StandingHolder target, View source) {
            this.target = target;
            target.team = (TextView) Utils.findRequiredViewAsType(source, R.id.team, "field 'team'", TextView.class);
            target.icon = (ImageView) Utils.findRequiredViewAsType(source, R.id.icon, "field 'icon'", ImageView.class);
            target.position = (TextView) Utils.findRequiredViewAsType(source, R.id.position, "field 'position'", TextView.class);
            target.lost = (TextView) Utils.findRequiredViewAsType(source, R.id.lost, "field 'lost'", TextView.class);
            target.won = (TextView) Utils.findRequiredViewAsType(source, R.id.won, "field 'won'", TextView.class);
            target.played = (TextView) Utils.findRequiredViewAsType(source, R.id.played, "field 'played'", TextView.class);
            target.draw = (TextView) Utils.findRequiredViewAsType(source, R.id.draw, "field 'draw'", TextView.class);
            target.f_a = (TextView) Utils.findRequiredViewAsType(source, R.id.f_a, "field 'f_a'", TextView.class);
            target.pts = (TextView) Utils.findRequiredViewAsType(source, R.id.pts, "field 'pts'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            StandingHolder standingHolder = this.target;
            if (standingHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.target = null;
            standingHolder.team = null;
            standingHolder.icon = null;
            standingHolder.position = null;
            standingHolder.lost = null;
            standingHolder.won = null;
            standingHolder.played = null;
            standingHolder.draw = null;
            standingHolder.f_a = null;
            standingHolder.pts = null;
        }
    }

    public StandingsAdapter(Context context) {
        this.context = context;
        this.inflater = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public void setItems(List<TeamStanding> items) {
        if (items != null) {
            this.items.clear();
            this.items.addAll(items);
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public StandingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new StandingHolder(this.inflater.inflate(R.layout.item_standings_team, parent, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(StandingHolder holder, int position) {
        TeamStanding teamStanding = this.items.get(position);
        holder.team.setText(teamStanding.getTeamName());
        holder.draw.setText(String.valueOf(teamStanding.getDraw()));
        holder.won.setText(String.valueOf(teamStanding.getWon()));
        holder.lost.setText(String.valueOf(teamStanding.getLost()));
        holder.played.setText(String.valueOf(teamStanding.getPlayed()));
        holder.f_a.setText(teamStanding.getF_a());
        holder.pts.setText(String.valueOf(teamStanding.getPoints()));
        holder.position.setText(String.valueOf(teamStanding.getPosition()));
        PicassoHelper.with(this.context).setImageView(holder.icon).setImageUrl(teamStanding.getPhotoUrl()).load();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    public class StandingHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.draw)
        TextView draw;

        @BindView(R.id.f_a)
        TextView f_a;

        @BindView(R.id.icon)
        ImageView icon;

        @BindView(R.id.lost)
        TextView lost;

        @BindView(R.id.played)
        TextView played;

        @BindView(R.id.position)
        TextView position;

        @BindView(R.id.pts)
        TextView pts;

        @BindView(R.id.team)
        TextView team;

        @BindView(R.id.won)
        TextView won;

        public StandingHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
