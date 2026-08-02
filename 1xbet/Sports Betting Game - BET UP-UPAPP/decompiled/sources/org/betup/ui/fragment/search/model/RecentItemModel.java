package org.betup.ui.fragment.search.model;

/* loaded from: classes4.dex */
public class RecentItemModel {
    private String text;
    private RecentItemType type;

    public enum RecentItemType {
        ITEM,
        TITLE
    }

    public RecentItemModel(String text, RecentItemType type) {
        this.text = text;
        this.type = type;
    }

    public RecentItemModel() {
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public RecentItemType getType() {
        return this.type;
    }

    public void setType(RecentItemType type) {
        this.type = type;
    }
}
