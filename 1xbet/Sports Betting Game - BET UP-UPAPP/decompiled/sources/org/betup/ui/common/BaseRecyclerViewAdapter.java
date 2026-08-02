package org.betup.ui.common;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class BaseRecyclerViewAdapter<T, S extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<S> {
    private Context context;
    private List<T> items = new ArrayList();
    private LayoutInflater layoutInflater;

    protected abstract S createViewHolder(View view);

    protected abstract void displayItem(S holder, T item, int position);

    protected abstract int getChildLayout(int viewType);

    public BaseRecyclerViewAdapter(Context context) {
        this.context = context;
        this.layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public Context getContext() {
        return this.context;
    }

    public LayoutInflater getLayoutInflater() {
        return this.layoutInflater;
    }

    public void clear() {
        this.items.clear();
        notifyDataSetChanged();
    }

    public void setItems(List<T> newItems) {
        this.items = newItems;
        notifyDataSetChanged();
    }

    public void addItems(List<T> newItems) {
        this.items.addAll(newItems);
        notifyDataSetChanged();
    }

    public void insertNewItem(T item) {
        this.items.add(0, item);
        notifyItemInserted(0);
    }

    public List<T> getItems() {
        return this.items;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public S onCreateViewHolder(ViewGroup parent, int viewType) {
        return createViewHolder(this.layoutInflater.inflate(getChildLayout(viewType), parent, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(S holder, int position) {
        displayItem(holder, this.items.get(position), position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }
}
