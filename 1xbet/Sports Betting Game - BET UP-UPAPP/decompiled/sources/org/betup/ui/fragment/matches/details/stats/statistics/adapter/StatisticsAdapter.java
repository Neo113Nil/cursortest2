package org.betup.ui.fragment.matches.details.stats.statistics.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.util.ArrayList;
import java.util.List;
import org.betup.R;
import org.betup.model.remote.entity.matches.stats.statistics.StatisticsItem;

/* loaded from: classes4.dex */
public class StatisticsAdapter extends RecyclerView.Adapter<StatHolder> {
    public static final int TYPE_DARK = 0;
    private LayoutInflater inflater;
    private List<StatisticsItem> stats = new ArrayList();

    public class StatHolder_ViewBinding implements Unbinder {
        private StatHolder target;

        public StatHolder_ViewBinding(StatHolder target, View source) {
            this.target = target;
            target.container = (ViewGroup) Utils.findRequiredViewAsType(source, R.id.container, "field 'container'", ViewGroup.class);
            target.homeRate = (TextView) Utils.findRequiredViewAsType(source, R.id.homeRate, "field 'homeRate'", TextView.class);
            target.awayRate = (TextView) Utils.findRequiredViewAsType(source, R.id.awayRate, "field 'awayRate'", TextView.class);
            target.title = (TextView) Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            StatHolder statHolder = this.target;
            if (statHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.target = null;
            statHolder.container = null;
            statHolder.homeRate = null;
            statHolder.awayRate = null;
            statHolder.title = null;
        }
    }

    public StatisticsAdapter(Context context) {
        this.inflater = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public void addAll(List<StatisticsItem> stats) {
        if (stats != null) {
            this.stats.addAll(stats);
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return position % 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public StatHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new StatHolder(this.inflater.inflate(R.layout.stat_item, parent, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(StatHolder holder, int position) {
        StatisticsItem statisticsItem = this.stats.get(position);
        holder.title.setText(statisticsItem.getTitle());
        holder.homeRate.setText(statisticsItem.getHomeRate());
        holder.awayRate.setText(statisticsItem.getAwayRate());
        if (holder.getItemViewType() == 0) {
            holder.container.setBackgroundResource(R.color.stats_dark_blue_background);
        } else {
            holder.container.setBackgroundResource(R.color.stats_light_blue_background);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.stats.size();
    }

    public static class StatHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.awayRate)
        TextView awayRate;

        @BindView(R.id.container)
        ViewGroup container;

        @BindView(R.id.homeRate)
        TextView homeRate;

        @BindView(R.id.title)
        TextView title;

        public StatHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
