package org.betup.ui.fragment.matches.details.stats.highlights;

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
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.betup.R;
import org.betup.model.remote.entity.matches.stats.highlights.HighlightEvent;
import org.betup.model.remote.entity.matches.stats.highlights.HighlightGroup;
import org.betup.utils.PicassoHelper;

/* loaded from: classes4.dex */
public class HighlightsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int TYPE_AWAY = 3;
    private static final int TYPE_HEADER = 1;
    private static final int TYPE_HOME = 2;
    private Context context;
    private LayoutInflater inflater;
    private List<ListItem> items = new ArrayList();

    public class HighlightHeaderHolder_ViewBinding implements Unbinder {
        private HighlightHeaderHolder target;

        public HighlightHeaderHolder_ViewBinding(HighlightHeaderHolder target, View source) {
            this.target = target;
            target.title = (TextView) Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            HighlightHeaderHolder highlightHeaderHolder = this.target;
            if (highlightHeaderHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.target = null;
            highlightHeaderHolder.title = null;
        }
    }

    public class HighlightItemHolder_ViewBinding implements Unbinder {
        private HighlightItemHolder target;

        public HighlightItemHolder_ViewBinding(HighlightItemHolder target, View source) {
            this.target = target;
            target.title = (TextView) Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
            target.subtitle = (TextView) Utils.findRequiredViewAsType(source, R.id.subtitle, "field 'subtitle'", TextView.class);
            target.icon = (ImageView) Utils.findRequiredViewAsType(source, R.id.icon, "field 'icon'", ImageView.class);
            target.minute = (TextView) Utils.findRequiredViewAsType(source, R.id.minute, "field 'minute'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            HighlightItemHolder highlightItemHolder = this.target;
            if (highlightItemHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.target = null;
            highlightItemHolder.title = null;
            highlightItemHolder.subtitle = null;
            highlightItemHolder.icon = null;
            highlightItemHolder.minute = null;
        }
    }

    public HighlightsAdapter(Context context) {
        this.context = context;
        this.inflater = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public void addAll(List<HighlightGroup> groups) {
        if (groups == null) {
            return;
        }
        for (HighlightGroup highlightGroup : groups) {
            this.items.add(new ListItem(highlightGroup));
            Iterator<HighlightEvent> it = highlightGroup.getEvents().iterator();
            while (it.hasNext()) {
                this.items.add(new ListItem(it.next()));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.items.get(position).getViewType();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == 1) {
            return new HighlightHeaderHolder(this.inflater.inflate(R.layout.highlight_header, parent, false));
        }
        return new HighlightItemHolder(this.inflater.inflate(viewType == 2 ? R.layout.highlight_item_home : R.layout.highlight_item_away, parent, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ListItem listItem = this.items.get(position);
        int itemViewType = holder.getItemViewType();
        if (itemViewType == 1) {
            ((HighlightHeaderHolder) holder).title.setText(listItem.getGroup().getTitle());
            return;
        }
        if (itemViewType == 2 || itemViewType == 3) {
            HighlightEvent event = this.items.get(position).getEvent();
            HighlightItemHolder highlightItemHolder = (HighlightItemHolder) holder;
            if (event.getSubtitle() != null) {
                highlightItemHolder.subtitle.setVisibility(0);
                highlightItemHolder.subtitle.setText(event.getSubtitle());
            } else {
                highlightItemHolder.subtitle.setVisibility(8);
            }
            highlightItemHolder.title.setText(event.getTitle());
            highlightItemHolder.minute.setText(String.format(Locale.getDefault(), "%s'", event.getMinute()));
            if (event.getIconUrl() != null) {
                highlightItemHolder.icon.setVisibility(0);
                PicassoHelper.with(this.context).setImageView(highlightItemHolder.icon).setImageUrl(event.getIconUrl()).load();
            } else {
                highlightItemHolder.icon.setVisibility(8);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    public static class ListItem {
        private HighlightEvent event;
        private HighlightGroup group;
        private int type;

        public ListItem(HighlightGroup group) {
            this.group = group;
            this.type = 1;
        }

        public ListItem(HighlightEvent event) {
            this.event = event;
            this.type = event.getWhose() == 1 ? 2 : 3;
        }

        public int getViewType() {
            return this.type;
        }

        public HighlightGroup getGroup() {
            return this.group;
        }

        public HighlightEvent getEvent() {
            return this.event;
        }
    }

    public static class HighlightItemHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.icon)
        ImageView icon;

        @BindView(R.id.minute)
        TextView minute;

        @BindView(R.id.subtitle)
        TextView subtitle;

        @BindView(R.id.title)
        TextView title;

        public HighlightItemHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public static class HighlightHeaderHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.title)
        TextView title;

        public HighlightHeaderHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
