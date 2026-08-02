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
import org.betup.R;
import org.betup.model.local.entity.LotteryBall;
import org.betup.ui.base.BaseSingleItemAdapter;
import org.betup.utils.PicassoHelper;

/* loaded from: classes4.dex */
public class BallResultAdapter extends BaseSingleItemAdapter<LotteryBall, LotteryBallViewHolder> {
    @Override // org.betup.ui.base.BaseSingleItemAdapter
    public int getLayoutId() {
        return R.layout.item_lottery_result;
    }

    public class LotteryBallViewHolder_ViewBinding implements Unbinder {
        private LotteryBallViewHolder target;

        public LotteryBallViewHolder_ViewBinding(LotteryBallViewHolder target, View source) {
            this.target = target;
            target.icon = (ImageView) Utils.findRequiredViewAsType(source, R.id.icon, "field 'icon'", ImageView.class);
            target.number = (TextView) Utils.findRequiredViewAsType(source, R.id.number, "field 'number'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            LotteryBallViewHolder lotteryBallViewHolder = this.target;
            if (lotteryBallViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.target = null;
            lotteryBallViewHolder.icon = null;
            lotteryBallViewHolder.number = null;
        }
    }

    public BallResultAdapter(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.ui.base.BaseSingleItemAdapter
    public LotteryBallViewHolder getViewHolder(View view) {
        return new LotteryBallViewHolder(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.ui.base.BaseSingleItemAdapter
    public void bindData(LotteryBallViewHolder viewHolder, LotteryBall item, int position) {
        PicassoHelper.with(getContext()).setImageView(viewHolder.icon).setImageUrl(item.getPhotoUrl()).load();
        viewHolder.number.setText(String.valueOf(item.getNumber()));
    }

    public class LotteryBallViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.icon)
        ImageView icon;

        @BindView(R.id.number)
        TextView number;

        public LotteryBallViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
