package org.betup.ui.fragment.search.model;

/* loaded from: classes4.dex */
public class SearchTabsModel {
    private int id;
    private String tabTitle;

    public SearchTabsModel() {
    }

    public SearchTabsModel(String tabTitle, int id) {
        this.tabTitle = tabTitle;
        this.id = id;
    }

    public String getTabTitle() {
        return this.tabTitle;
    }

    public void setTabTitle(String tabTitle) {
        this.tabTitle = tabTitle;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
