package org.betup.ui.fragment.bets.betlist.adapter.views;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import io.bidmachine.media3.exoplayer.ExoPlayer;
import org.betup.ui.fragment.matches.adapter.views.EndlessListener;

/* loaded from: classes4.dex */
public class BaseEndlessListView extends ListView implements AbsListView.OnScrollListener {
    public View footer;
    public boolean isLoading;
    public EndlessListener listener;

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView view, int scrollState) {
    }

    public BaseEndlessListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setOnScrollListener(this);
    }

    public BaseEndlessListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setOnScrollListener(this);
    }

    public BaseEndlessListView(Context context) {
        super(context);
        setOnScrollListener(this);
    }

    public void setListener(EndlessListener listener) {
        this.listener = listener;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        if (getAdapter() == null || getAdapter().getCount() == 0 || visibleItemCount + firstVisibleItem < totalItemCount || this.isLoading) {
            return;
        }
        this.isLoading = true;
        this.listener.loadData();
        new Handler().postDelayed(new Runnable() { // from class: org.betup.ui.fragment.bets.betlist.adapter.views.BaseEndlessListView.1
            @Override // java.lang.Runnable
            public void run() {
                BaseEndlessListView.this.isLoading = false;
            }
        }, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
    }

    public void setLoadingView(int resId) {
        this.footer = ((LayoutInflater) super.getContext().getSystemService("layout_inflater")).inflate(resId, (ViewGroup) null);
    }
}
