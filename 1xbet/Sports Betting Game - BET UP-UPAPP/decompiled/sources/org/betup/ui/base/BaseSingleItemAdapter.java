package org.betup.ui.base;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class BaseSingleItemAdapter<T, S extends RecyclerView.ViewHolder> extends BaseAdapter<S> implements SingleItemAdapter<T> {
    private List<T> items;
    protected ItemClickListener<T> listener;

    protected abstract void bindData(S viewHolder, T item, int position);

    public abstract int getLayoutId();

    protected abstract S getViewHolder(View view);

    public BaseSingleItemAdapter(Context context) {
        super(context);
        this.items = new ArrayList();
    }

    public T getItem(int position) {
        return this.items.get(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public S onCreateViewHolder(ViewGroup parent, int viewType) {
        return getViewHolder(getLayoutInflater().inflate(getLayoutId(), parent, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(S holder, int position) {
        bindData(holder, this.items.get(position), position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    @Override // org.betup.ui.base.SingleItemAdapter
    public void newItems(List<T> newItems) {
        this.items = newItems;
        notifyDataSetChanged();
    }

    @Override // org.betup.ui.base.SingleItemAdapter
    public void addItems(List<T> newItems) {
        this.items.addAll(newItems);
        notifyDataSetChanged();
    }

    @Override // org.betup.ui.base.SingleItemAdapter
    public void setListener(ItemClickListener<T> listener) {
        this.listener = listener;
    }

    @Override // org.betup.ui.base.SingleItemAdapter
    public void clearAll() {
        this.items.clear();
        notifyDataSetChanged();
    }

    public ItemClickListener<T> getListener() {
        return this.listener;
    }
}
