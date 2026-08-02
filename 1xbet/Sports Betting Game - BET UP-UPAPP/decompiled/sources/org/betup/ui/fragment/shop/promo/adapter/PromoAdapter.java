package org.betup.ui.fragment.shop.promo.adapter;

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
import java.util.List;
import org.betup.R;
import org.betup.model.remote.entity.promo.PromoDataModel;
import org.betup.model.remote.entity.promo.PromoType;

/* loaded from: classes4.dex */
public class PromoAdapter extends RecyclerView.Adapter<PromoHolder> {
    private LayoutInflater inflater;
    private List<PromoDataModel> items;
    private PromoListener listener;

    public interface PromoListener {
        void onPromoClick(PromoType promoType);
    }

    public class PromoHolder_ViewBinding implements Unbinder {
        private PromoHolder target;

        public PromoHolder_ViewBinding(PromoHolder target, View source) {
            this.target = target;
            target.icon = (ImageView) Utils.findRequiredViewAsType(source, R.id.icon, "field 'icon'", ImageView.class);
            target.title = (TextView) Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
            target.desc = (TextView) Utils.findRequiredViewAsType(source, R.id.desc, "field 'desc'", TextView.class);
            target.price = (TextView) Utils.findRequiredViewAsType(source, R.id.price, "field 'price'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            PromoHolder promoHolder = this.target;
            if (promoHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.target = null;
            promoHolder.icon = null;
            promoHolder.title = null;
            promoHolder.desc = null;
            promoHolder.price = null;
        }
    }

    public PromoAdapter(Context context, List<PromoDataModel> items, PromoListener listener) {
        this.items = items;
        this.inflater = (LayoutInflater) context.getSystemService("layout_inflater");
        this.listener = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public PromoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new PromoHolder(this.inflater.inflate(R.layout.item_promo, parent, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(PromoHolder holder, int position) {
        PromoDataModel promoDataModel = this.items.get(position);
        holder.icon.setImageResource(promoDataModel.getIcon());
        holder.price.setText(promoDataModel.getPrice());
        holder.title.setText(promoDataModel.getName());
        holder.desc.setText(promoDataModel.getDesc());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    public class PromoHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        @BindView(R.id.desc)
        TextView desc;

        @BindView(R.id.icon)
        ImageView icon;

        @BindView(R.id.price)
        TextView price;

        @BindView(R.id.title)
        TextView title;

        public PromoHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            PromoAdapter.this.listener.onPromoClick(((PromoDataModel) PromoAdapter.this.items.get(getAdapterPosition())).getType());
        }
    }
}
