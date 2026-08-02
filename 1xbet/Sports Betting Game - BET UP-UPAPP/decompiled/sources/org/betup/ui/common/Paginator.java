package org.betup.ui.common;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.omadahealth.github.swipyrefreshlayout.library.SwipyRefreshLayout;
import com.omadahealth.github.swipyrefreshlayout.library.SwipyRefreshLayoutDirection;
import org.betup.model.remote.entity.PageOptions;

/* loaded from: classes2.dex */
public class Paginator extends RecyclerView.OnScrollListener implements SwipyRefreshLayout.OnRefreshListener {
    private static final int DEFAULT_LIMIT = 20;
    private static final int DEFAULT_OFFSET = 0;
    private boolean busy;
    private DynamicPageContentLoader dynamicLoader;
    private boolean last;
    private LinearLayoutManager layoutManager;
    private PageOptions pageOptions;
    private RecyclerView recyclerView;
    private StaticPageContentLoader staticLoader;
    private SwipyRefreshLayout swipyRefreshLayout;

    public interface DynamicPageContentLoader {
        void loadItems(String continuationToken);
    }

    public interface StaticPageContentLoader {
        void loadItems(int offset, int limit);
    }

    public Paginator(DynamicPageContentLoader dynamicLoader, RecyclerView recyclerView, SwipyRefreshLayout swipyRefreshLayout) {
        this(recyclerView, swipyRefreshLayout);
        this.dynamicLoader = dynamicLoader;
    }

    public Paginator(StaticPageContentLoader staticLoader, RecyclerView recyclerView, SwipyRefreshLayout swipyRefreshLayout) {
        this(recyclerView, swipyRefreshLayout);
        this.staticLoader = staticLoader;
    }

    private Paginator(RecyclerView recyclerView, SwipyRefreshLayout swipyRefreshLayout) {
        this.recyclerView = recyclerView;
        this.swipyRefreshLayout = swipyRefreshLayout;
        this.layoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        init();
    }

    private Paginator(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
        this.layoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        init();
    }

    public void init() {
        this.recyclerView.removeOnScrollListener(this);
        this.recyclerView.addOnScrollListener(this);
        SwipyRefreshLayout swipyRefreshLayout = this.swipyRefreshLayout;
        if (swipyRefreshLayout != null) {
            swipyRefreshLayout.setOnRefreshListener(this);
        }
    }

    @Override // com.omadahealth.github.swipyrefreshlayout.library.SwipyRefreshLayout.OnRefreshListener
    public void onRefresh(SwipyRefreshLayoutDirection direction) {
        if (this.busy) {
            return;
        }
        reset();
        this.busy = true;
        loadNextItems();
    }

    public void refresh() {
        reset();
        loadNextItems();
    }

    public PageOptions getPageOptions() {
        return this.pageOptions;
    }

    public void setPageOptions(PageOptions pageOptions) {
        this.pageOptions = pageOptions;
    }

    public String getContinuationToken() {
        PageOptions pageOptions = this.pageOptions;
        if (pageOptions != null) {
            return pageOptions.getContinuationToken();
        }
        return null;
    }

    public void reset() {
        this.pageOptions = null;
        this.busy = false;
    }

    public boolean isLast() {
        return this.last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }

    public boolean isBusy() {
        return this.busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);
        if (this.last || this.busy) {
            return;
        }
        if (this.dynamicLoader == null && this.staticLoader == null) {
            return;
        }
        int childCount = this.layoutManager.getChildCount();
        if (this.layoutManager.findFirstVisibleItemPosition() + childCount >= this.layoutManager.getItemCount()) {
            this.busy = true;
            loadNextItems();
        }
    }

    private void loadNextItems() {
        DynamicPageContentLoader dynamicPageContentLoader = this.dynamicLoader;
        if (dynamicPageContentLoader != null) {
            dynamicPageContentLoader.loadItems(getContinuationToken());
        } else if (this.staticLoader != null) {
            PageOptions pageOptions = this.pageOptions;
            int offset = pageOptions == null ? 0 : pageOptions.getOffset();
            PageOptions pageOptions2 = this.pageOptions;
            this.staticLoader.loadItems(offset, pageOptions2 == null ? 20 : pageOptions2.getPageSize());
        }
    }
}
