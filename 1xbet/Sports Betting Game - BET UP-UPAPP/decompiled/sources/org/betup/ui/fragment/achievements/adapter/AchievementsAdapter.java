package org.betup.ui.fragment.achievements.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.timepicker.TimeModel;
import java.util.List;
import java.util.Locale;
import org.betup.R;
import org.betup.model.remote.entity.achievements.AchievementsDataModel;
import org.betup.utils.PicassoHelper;

/* loaded from: classes4.dex */
public class AchievementsAdapter extends BaseAdapter {
    private List<AchievementsDataModel> achievementsDataModels;
    private Context context;
    private LayoutInflater mInflater;

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder target;

        public ViewHolder_ViewBinding(ViewHolder target, View source) {
            this.target = target;
            target.icon = (ImageView) Utils.findRequiredViewAsType(source, R.id.achievementItemIcon, "field 'icon'", ImageView.class);
            target.name = (TextView) Utils.findRequiredViewAsType(source, R.id.achievementItemName, "field 'name'", TextView.class);
            target.description = (TextView) Utils.findRequiredViewAsType(source, R.id.achievementItemDescription, "field 'description'", TextView.class);
            target.value = (TextView) Utils.findRequiredViewAsType(source, R.id.achievementItemValue, "field 'value'", TextView.class);
            target.header = Utils.findRequiredView(source, R.id.header, "field 'header'");
            target.progress = (ProgressBar) Utils.findRequiredViewAsType(source, R.id.progressBar, "field 'progress'", ProgressBar.class);
            target.valueContainer = Utils.findRequiredView(source, R.id.valueContainer, "field 'valueContainer'");
            target.tick = Utils.findRequiredView(source, R.id.tick, "field 'tick'");
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ViewHolder viewHolder = this.target;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.target = null;
            viewHolder.icon = null;
            viewHolder.name = null;
            viewHolder.description = null;
            viewHolder.value = null;
            viewHolder.header = null;
            viewHolder.progress = null;
            viewHolder.valueContainer = null;
            viewHolder.tick = null;
        }
    }

    public AchievementsAdapter(Context context, List<AchievementsDataModel> achievementsDataModels) {
        this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        this.achievementsDataModels = achievementsDataModels;
        this.context = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.achievementsDataModels.size();
    }

    @Override // android.widget.Adapter
    public AchievementsDataModel getItem(int position) {
        return this.achievementsDataModels.get(position);
    }

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        return this.achievementsDataModels.get(position).hashCode();
    }

    @Override // android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = this.mInflater.inflate(R.layout.item_achievements, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        AchievementsDataModel item = getItem(position);
        PicassoHelper.with(this.context).setImageUrl(item.getPhotoUrl()).setImageView(viewHolder.icon).load();
        viewHolder.name.setText(item.getName());
        viewHolder.description.setText(item.getDescr());
        viewHolder.progress.setMax(100);
        viewHolder.progress.setProgress(item.getProgress());
        viewHolder.value.setText(String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, item.getPrice()));
        if (item.getOpened().booleanValue()) {
            viewHolder.valueContainer.setVisibility(8);
            viewHolder.tick.setVisibility(0);
            viewHolder.header.setBackgroundResource(R.drawable.achievement_item_opened);
            convertView.setAlpha(1.0f);
            viewHolder.progress.setVisibility(8);
        } else {
            Log.d("ACHIEV", "CLOSED");
            convertView.setAlpha(0.75f);
            viewHolder.header.setBackgroundResource(R.drawable.achievement_item);
            viewHolder.valueContainer.setVisibility(0);
            viewHolder.tick.setVisibility(8);
            viewHolder.progress.setVisibility(0);
        }
        return convertView;
    }

    public class ViewHolder {

        @BindView(R.id.achievementItemDescription)
        TextView description;

        @BindView(R.id.header)
        View header;

        @BindView(R.id.achievementItemIcon)
        ImageView icon;

        @BindView(R.id.achievementItemName)
        TextView name;

        @BindView(R.id.progressBar)
        ProgressBar progress;

        @BindView(R.id.tick)
        View tick;

        @BindView(R.id.achievementItemValue)
        TextView value;

        @BindView(R.id.valueContainer)
        View valueContainer;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
