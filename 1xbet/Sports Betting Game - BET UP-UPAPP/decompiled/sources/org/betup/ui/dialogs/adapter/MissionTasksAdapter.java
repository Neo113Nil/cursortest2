package org.betup.ui.dialogs.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.util.Locale;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.missions.MissionTaskModel;
import org.betup.ui.base.BaseSingleItemAdapter;
import org.betup.utils.OddHelper;
import org.betup.utils.PicassoHelper;

/* loaded from: classes2.dex */
public class MissionTasksAdapter extends BaseSingleItemAdapter<MissionTaskModel, MissionTaskViewHolder> {
    private boolean isMissionActive;
    private final OddType oddType;

    @Override // org.betup.ui.base.BaseSingleItemAdapter
    public int getLayoutId() {
        return R.layout.item_mission_task;
    }

    public class MissionTaskViewHolder_ViewBinding implements Unbinder {
        private MissionTaskViewHolder target;

        public MissionTaskViewHolder_ViewBinding(MissionTaskViewHolder target, View source) {
            this.target = target;
            target.tick = (ImageView) Utils.findRequiredViewAsType(source, R.id.tick, "field 'tick'", ImageView.class);
            target.title = (TextView) Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
            target.taskIcon = (ImageView) Utils.findRequiredViewAsType(source, R.id.taskIcon, "field 'taskIcon'", ImageView.class);
            target.progressBar = (ProgressBar) Utils.findRequiredViewAsType(source, R.id.progressBar, "field 'progressBar'", ProgressBar.class);
            target.progressDescription = (TextView) Utils.findRequiredViewAsType(source, R.id.progressDescription, "field 'progressDescription'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            MissionTaskViewHolder missionTaskViewHolder = this.target;
            if (missionTaskViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.target = null;
            missionTaskViewHolder.tick = null;
            missionTaskViewHolder.title = null;
            missionTaskViewHolder.taskIcon = null;
            missionTaskViewHolder.progressBar = null;
            missionTaskViewHolder.progressDescription = null;
        }
    }

    public MissionTasksAdapter(Context context, OddType oddType) {
        super(context);
        this.oddType = oddType;
    }

    public void setMissionActive(boolean isMissionActive) {
        this.isMissionActive = isMissionActive;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.ui.base.BaseSingleItemAdapter
    public MissionTaskViewHolder getViewHolder(View view) {
        return new MissionTaskViewHolder(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.ui.base.BaseSingleItemAdapter
    public void bindData(MissionTaskViewHolder viewHolder, MissionTaskModel item, int position) {
        PicassoHelper.with(getContext()).setImageView(viewHolder.taskIcon).setImageUrl(item.getIcon()).load();
        if (item.getOdds() == null) {
            viewHolder.title.setText(item.getTitle());
        } else {
            viewHolder.title.setText(String.format(Locale.getDefault(), item.getTitle(), OddHelper.format(this.oddType, item.getOdds().floatValue())));
        }
        viewHolder.progressDescription.setText(String.format(Locale.getDefault(), "%.0f / %.0f", Float.valueOf(item.getCurrentProgress()), Float.valueOf(item.getMaxProgress())));
        if (this.isMissionActive) {
            viewHolder.progressBar.setVisibility(0);
            viewHolder.progressDescription.setVisibility(0);
            viewHolder.progressBar.setMax(100);
            viewHolder.progressBar.setProgress((int) ((item.getCurrentProgress() / item.getMaxProgress()) * 100.0f));
        } else {
            viewHolder.progressBar.setVisibility(8);
            viewHolder.progressDescription.setVisibility(8);
        }
        if (item.isCompleted()) {
            viewHolder.tick.setVisibility(0);
        } else {
            viewHolder.tick.setVisibility(4);
        }
    }

    public class MissionTaskViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.progressBar)
        ProgressBar progressBar;

        @BindView(R.id.progressDescription)
        TextView progressDescription;

        @BindView(R.id.taskIcon)
        ImageView taskIcon;

        @BindView(R.id.tick)
        ImageView tick;

        @BindView(R.id.title)
        TextView title;

        public MissionTaskViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
