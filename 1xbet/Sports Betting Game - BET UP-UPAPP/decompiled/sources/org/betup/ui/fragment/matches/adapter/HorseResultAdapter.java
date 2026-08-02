package org.betup.ui.fragment.matches.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.squareup.picasso.Picasso;
import org.betup.R;
import org.betup.model.local.entity.RacingResult;
import org.betup.ui.base.BaseSingleItemAdapter;

/* loaded from: classes4.dex */
public class HorseResultAdapter extends BaseSingleItemAdapter<RacingResult, HorseViewHolder> {
    @Override // org.betup.ui.base.BaseSingleItemAdapter
    public int getLayoutId() {
        return R.layout.item_horse_result;
    }

    public class HorseViewHolder_ViewBinding implements Unbinder {
        private HorseViewHolder target;

        public HorseViewHolder_ViewBinding(HorseViewHolder target, View source) {
            this.target = target;
            target.name = (TextView) Utils.findRequiredViewAsType(source, R.id.name, "field 'name'", TextView.class);
            target.position = (TextView) Utils.findRequiredViewAsType(source, R.id.position, "field 'position'", TextView.class);
            target.icon = (ImageView) Utils.findRequiredViewAsType(source, R.id.icon, "field 'icon'", ImageView.class);
            target.number = (TextView) Utils.findRequiredViewAsType(source, R.id.number, "field 'number'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            HorseViewHolder horseViewHolder = this.target;
            if (horseViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.target = null;
            horseViewHolder.name = null;
            horseViewHolder.position = null;
            horseViewHolder.icon = null;
            horseViewHolder.number = null;
        }
    }

    public HorseResultAdapter(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.ui.base.BaseSingleItemAdapter
    public HorseViewHolder getViewHolder(View view) {
        return new HorseViewHolder(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.ui.base.BaseSingleItemAdapter
    public void bindData(HorseViewHolder viewHolder, RacingResult item, int position) {
        viewHolder.name.setText(item.getName());
        viewHolder.position.setText(String.valueOf(item.getPosition()));
        viewHolder.number.setText(String.valueOf(item.getNumber()));
        Picasso.get().load(item.getPhotoUrl()).into(viewHolder.icon);
    }

    public class HorseViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.icon)
        ImageView icon;

        @BindView(R.id.name)
        TextView name;

        @BindView(R.id.number)
        TextView number;

        @BindView(R.id.position)
        TextView position;

        public HorseViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
