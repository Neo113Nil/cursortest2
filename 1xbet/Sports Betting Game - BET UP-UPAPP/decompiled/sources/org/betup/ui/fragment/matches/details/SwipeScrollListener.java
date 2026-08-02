package org.betup.ui.fragment.matches.details;

import android.widget.AbsListView;

/* loaded from: classes4.dex */
public class SwipeScrollListener implements AbsListView.OnScrollListener {
    private final int position;
    private final MatchRefreshProdiver refreshProvider;

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView view, int scrollState) {
    }

    public SwipeScrollListener(MatchRefreshProdiver refreshProdiver, int position) {
        this.refreshProvider = refreshProdiver;
        this.position = position;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        int i = 0;
        if (view != null && view.getChildCount() != 0) {
            i = view.getChildAt(0).getTop();
        }
        if (firstVisibleItem == 0 && i >= 0) {
            this.refreshProvider.enableSwipeRefresh(this.position);
        } else {
            this.refreshProvider.disableSwipeRefresh(this.position);
        }
    }
}
