package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class FindSession {
    private int highlightedResultIndex;
    private int resultCount;
    private int searchResultDisplayStyle = 2;

    public FindSession(int i7, int i8) {
        this.resultCount = i7;
        this.highlightedResultIndex = i8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FindSession findSession = (FindSession) obj;
        return this.resultCount == findSession.resultCount && this.highlightedResultIndex == findSession.highlightedResultIndex && this.searchResultDisplayStyle == findSession.searchResultDisplayStyle;
    }

    public int getHighlightedResultIndex() {
        return this.highlightedResultIndex;
    }

    public int getResultCount() {
        return this.resultCount;
    }

    public int getSearchResultDisplayStyle() {
        return this.searchResultDisplayStyle;
    }

    public int hashCode() {
        return (((this.resultCount * 31) + this.highlightedResultIndex) * 31) + this.searchResultDisplayStyle;
    }

    public void setHighlightedResultIndex(int i7) {
        this.highlightedResultIndex = i7;
    }

    public void setResultCount(int i7) {
        this.resultCount = i7;
    }

    public void setSearchResultDisplayStyle(int i7) {
        this.searchResultDisplayStyle = i7;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("resultCount", Integer.valueOf(this.resultCount));
        hashMap.put("highlightedResultIndex", Integer.valueOf(this.highlightedResultIndex));
        hashMap.put("searchResultDisplayStyle", Integer.valueOf(this.searchResultDisplayStyle));
        return hashMap;
    }

    public String toString() {
        return "FindSession{resultCount=" + this.resultCount + ", highlightedResultIndex=" + this.highlightedResultIndex + ", searchResultDisplayStyle=" + this.searchResultDisplayStyle + '}';
    }
}
