package org.betup.ui.base;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* loaded from: classes2.dex */
public abstract class BaseAdapter<T extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<T> {
    private Context context;
    private LayoutInflater layoutInflater;

    public BaseAdapter(Context context) {
        this.context = context;
        this.layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public Context getContext() {
        return this.context;
    }

    public LayoutInflater getLayoutInflater() {
        return this.layoutInflater;
    }
}
