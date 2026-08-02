package org.betup.ui.dialogs.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import org.betup.R;
import org.betup.model.remote.entity.shop.ShopEffectModel;
import org.betup.ui.base.BaseSingleItemAdapter;

/* loaded from: classes2.dex */
public class LevelItemAdapter extends BaseSingleItemAdapter<ShopEffectModel, LevelItemHolder> {
    @Override // org.betup.ui.base.BaseSingleItemAdapter
    public int getLayoutId() {
        return R.layout.level_item;
    }

    public class LevelItemHolder_ViewBinding implements Unbinder {
        private LevelItemHolder target;

        public LevelItemHolder_ViewBinding(LevelItemHolder target, View source) {
            this.target = target;
            target.icon = (ImageView) Utils.findRequiredViewAsType(source, R.id.icon, "field 'icon'", ImageView.class);
            target.subIcon = (ImageView) Utils.findRequiredViewAsType(source, R.id.subIcon, "field 'subIcon'", ImageView.class);
            target.label = (TextView) Utils.findRequiredViewAsType(source, R.id.label, "field 'label'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            LevelItemHolder levelItemHolder = this.target;
            if (levelItemHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.target = null;
            levelItemHolder.icon = null;
            levelItemHolder.subIcon = null;
            levelItemHolder.label = null;
        }
    }

    public LevelItemAdapter(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.ui.base.BaseSingleItemAdapter
    public LevelItemHolder getViewHolder(View view) {
        return new LevelItemHolder(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.ui.base.BaseSingleItemAdapter
    public void bindData(LevelItemHolder viewHolder, ShopEffectModel item, int position) {
        viewHolder.icon.setImageResource(item.getEffectGroup() == 1 ? R.drawable.level_up_bet : R.drawable.level_up_unlock);
        viewHolder.subIcon.setVisibility(8);
        viewHolder.label.setText(item.getName());
    }

    public class LevelItemHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.icon)
        ImageView icon;

        @BindView(R.id.label)
        TextView label;

        @BindView(R.id.subIcon)
        ImageView subIcon;

        public LevelItemHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
