package org.betup.ui.common;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import org.betup.ui.common.Paginator;

/* loaded from: classes2.dex */
public class ContinuationTokenPaginator extends RecyclerView.OnScrollListener implements SwipeRefreshLayout.OnRefreshListener {
    private boolean busy;
    private String continuationToken;
    private LinearLayoutManager layoutManager;
    private Paginator.DynamicPageContentLoader loader;
    private RecyclerView recyclerView;
    private SwipeRefreshLayout swipeRefreshLayout;

    public ContinuationTokenPaginator(RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, Paginator.DynamicPageContentLoader loader) {
        this.recyclerView = recyclerView;
        this.layoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.swipeRefreshLayout = swipeRefreshLayout;
        this.loader = loader;
        swipeRefreshLayout.setOnRefreshListener(this);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        refresh();
    }

    public void refresh() {
        this.busy = true;
        this.continuationToken = null;
        this.loader.loadItems(null);
    }

    public void attach() {
        this.swipeRefreshLayout.setOnRefreshListener(this);
        this.recyclerView.addOnScrollListener(this);
        this.busy = true;
        this.loader.loadItems(null);
    }

    public String getContinuationToken() {
        return this.continuationToken;
    }

    public void requestCompleted(String newContinuationToken) {
        this.swipeRefreshLayout.setRefreshing(false);
        this.busy = false;
        this.continuationToken = newContinuationToken;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);
        if (this.continuationToken == null || this.busy || this.loader == null) {
            return;
        }
        int childCount = this.layoutManager.getChildCount();
        if (this.layoutManager.findFirstVisibleItemPosition() + childCount >= this.layoutManager.getItemCount()) {
            this.busy = true;
            this.loader.loadItems(this.continuationToken);
        }
    }
}
