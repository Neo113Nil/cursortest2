package org.betup.ui.fragment.matches.adapter;

import android.content.Context;
import android.util.Log;
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
import org.betup.model.remote.entity.matches.MatchesSportModel;
import org.betup.ui.base.ItemClickListener;
import org.betup.ui.base.SingleItemAdapter;
import org.betup.utils.PicassoHelper;

/* loaded from: classes4.dex */
public class SportMatchesAdapter extends RecyclerView.Adapter<ViewHolder> implements SingleItemAdapter<MatchesSportModel> {
    private final Context context;
    private final List<Integer> favs;
    private ItemClickListener<MatchesSportModel> listener;
    private final LayoutInflater mInflater;
    private int colorRes = R.color.item_my_bets_color_yellow;
    private List<MatchesSportModel> matchesModels = new ArrayList();

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

    public SportMatchesAdapter(Context context, List<Integer> favs) {
        this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        this.context = context;
        this.favs = favs;
    }

    public void setCountColor(int colorRes) {
        this.colorRes = colorRes;
    }

    @Override // org.betup.ui.base.SingleItemAdapter
    public void clearAll() {
        this.matchesModels.clear();
        notifyDataSetChanged();
    }

    @Override // org.betup.ui.base.SingleItemAdapter
    public void addItems(List<MatchesSportModel> newItems) {
        this.matchesModels.addAll(newItems);
        notifyDataSetChanged();
    }

    @Override // org.betup.ui.base.SingleItemAdapter
    public void setListener(ItemClickListener<MatchesSportModel> listener) {
        this.listener = listener;
    }

    @Override // org.betup.ui.base.SingleItemAdapter
    public void newItems(List<MatchesSportModel> matchesSportModels) {
        Log.d("SLOWTEST", "NEW LIST!");
        this.matchesModels = new ArrayList(matchesSportModels);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(this.mInflater.inflate(R.layout.item_matches, parent, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder holder, int position) {
        MatchesSportModel matchesSportModel = this.matchesModels.get(position);
        holder.title.setText(matchesSportModel.getName().toUpperCase());
        holder.numberOfMatches.setText(String.valueOf(matchesSportModel.getCount()));
        holder.matchCountTv.setText(String.valueOf(matchesSportModel.getCount()));
        PicassoHelper.with(this.context).setImageView(holder.icon).setImageUrl(matchesSportModel.getPhotoUrl()).load();
        List<Integer> list = this.favs;
        if (list != null) {
            if (list.contains(matchesSportModel.getId())) {
                holder.fav.setVisibility(0);
            } else {
                holder.fav.setVisibility(8);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.matchesModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

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
            view.setOnClickListener(new View.OnClickListener() { // from class: org.betup.ui.fragment.matches.adapter.SportMatchesAdapter.ViewHolder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View v) {
                    if (SportMatchesAdapter.this.listener != null) {
                        SportMatchesAdapter.this.listener.itemClicked((MatchesSportModel) SportMatchesAdapter.this.matchesModels.get(ViewHolder.this.getAdapterPosition()));
                    }
                }
            });
        }
    }
}
