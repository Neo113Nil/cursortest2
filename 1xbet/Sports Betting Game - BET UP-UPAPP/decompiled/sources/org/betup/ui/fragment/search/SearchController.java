package org.betup.ui.fragment.search;

import org.betup.model.remote.api.FetchStat;
import org.betup.ui.fragment.search.model.AllSearchResultModel;

/* loaded from: classes4.dex */
public interface SearchController {

    public interface SearchResultsListener {
        void onSearchFinished(AllSearchResultModel resultModel, FetchStat stat);

        void onSearchStarted();
    }

    void clearAll();

    void search(String searchTerm, int sportId);

    void subscribe(int sportId, SearchResultsListener listener);

    void unsubscribe(SearchResultsListener listener);
}
