package org.betup.ui.fragment.matches.adapter;

import android.animation.ObjectAnimator;
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
import org.betup.model.remote.entity.matches.championship.ChampionshipLeagueModel;
import org.betup.ui.base.ItemClickListener;
import org.betup.ui.base.SingleItemAdapter;
import org.betup.utils.PicassoHelper;

/* loaded from: classes4.dex */
public class ChampionshipAdapter extends RecyclerView.Adapter<ViewHolder> implements SingleItemAdapter<ChampionshipLeagueModel> {
    private final Context context;
    private final List<Integer> favs;
    private ItemClickListener<ChampionshipLeagueModel> listener;
    private final LayoutInflater mInflater;
    private long lastPosition = 0;
    private int counterColor = R.color.item_my_bets_color_yellow;
    private List<ChampionshipLeagueModel> championshipLeagueModels = new ArrayList();

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder target;

        public ViewHolder_ViewBinding(ViewHolder target, View source) {
            this.target = target;
            target.title = (TextView) Utils.findRequiredViewAsType(source, R.id.name, "field 'title'", TextView.class);
            target.icon = (ImageView) Utils.findRequiredViewAsType(source, R.id.liveMatcehsSportIcon, "field 'icon'", ImageView.class);
            target.numberOfMatches = (TextView) Utils.findRequiredViewAsType(source, R.id.numberOfMatchesLive, "field 'numberOfMatches'", TextView.class);
            target.matchCountTv = (TextView) Utils.findRequiredViewAsType(source, R.id.match_count_tv, "field 'matchCountTv'", TextView.class);
            target.fav = (ImageView) Utils.findRequiredViewAsType(source, R.id.fav, "field 'fav'", ImageView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ViewHolder viewHolder = this.target;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.target = null;
            viewHolder.title = null;
            viewHolder.icon = null;
            viewHolder.numberOfMatches = null;
            viewHolder.matchCountTv = null;
            viewHolder.fav = null;
        }
    }

    public ChampionshipAdapter(Context context, List<Integer> favs, ItemClickListener<ChampionshipLeagueModel> listener) {
        this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        this.context = context;
        this.listener = listener;
        this.favs = favs;
    }

    public void setCounterColor(int counterColor) {
        this.counterColor = counterColor;
    }

    @Override // org.betup.ui.base.SingleItemAdapter
    public void newItems(List<ChampionshipLeagueModel> items) {
        this.championshipLeagueModels = new ArrayList(items);
        notifyDataSetChanged();
    }

    @Override // org.betup.ui.base.SingleItemAdapter
    public void addItems(List<ChampionshipLeagueModel> newItems) {
        this.championshipLeagueModels.addAll(newItems);
        notifyDataSetChanged();
    }

    @Override // org.betup.ui.base.SingleItemAdapter
    public void setListener(ItemClickListener<ChampionshipLeagueModel> listener) {
        this.listener = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(this.mInflater.inflate(R.layout.item_matches, parent, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final ViewHolder holder, int position) {
        ChampionshipLeagueModel championshipLeagueModel = this.championshipLeagueModels.get(position);
        holder.title.setText(championshipLeagueModel.getName());
        holder.numberOfMatches.setText(String.valueOf(championshipLeagueModel.getCount()));
        holder.matchCountTv.setText(String.valueOf(championshipLeagueModel.getCount()));
        PicassoHelper.with(this.context).setImageView(holder.icon).setImageUrl(championshipLeagueModel.getPhotoUrl()).load();
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: org.betup.ui.fragment.matches.adapter.ChampionshipAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                int adapterPosition = holder.getAdapterPosition();
                if (adapterPosition >= ChampionshipAdapter.this.championshipLeagueModels.size() || adapterPosition < 0) {
                    return;
                }
                ChampionshipAdapter.this.listener.itemClicked((ChampionshipLeagueModel) ChampionshipAdapter.this.championshipLeagueModels.get(adapterPosition));
            }
        });
        long j = position;
        if (j > this.lastPosition) {
            this.lastPosition = j;
            ObjectAnimator.ofFloat(holder.itemView, "alpha", 0.0f, 1.0f).setDuration(500L).start();
        }
        if (this.favs.contains(championshipLeagueModel.getId())) {
            holder.fav.setVisibility(0);
        } else {
            holder.fav.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.championshipLeagueModels.size();
    }

    @Override // org.betup.ui.base.SingleItemAdapter
    public void clearAll() {
        this.championshipLeagueModels.clear();
        notifyDataSetChanged();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.fav)
        ImageView fav;

        @BindView(R.id.liveMatcehsSportIcon)
        ImageView icon;

        @BindView(R.id.match_count_tv)
        TextView matchCountTv;

        @BindView(R.id.numberOfMatchesLive)
        TextView numberOfMatches;

        @BindView(R.id.name)
        TextView title;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
