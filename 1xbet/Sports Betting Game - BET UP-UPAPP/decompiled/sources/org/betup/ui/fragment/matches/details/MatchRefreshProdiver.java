package org.betup.ui.fragment.matches.details;

/* loaded from: classes4.dex */
public interface MatchRefreshProdiver {
    public static final int PAGE_IRRELEVANT = -1;

    void disableSwipeRefresh(int fromPage);

    void enableSwipeRefresh(int fromPage);

    void invokeRefresh();
}
