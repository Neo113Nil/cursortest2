package org.betup.ui.base;

import java.util.List;

/* loaded from: classes2.dex */
public interface SingleItemAdapter<T> {
    void addItems(List<T> newItems);

    void clearAll();

    int getItemCount();

    void newItems(List<T> newItems);

    void setListener(ItemClickListener<T> listener);
}
