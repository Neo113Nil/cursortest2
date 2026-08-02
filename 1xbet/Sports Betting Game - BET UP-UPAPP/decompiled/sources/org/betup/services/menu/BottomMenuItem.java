package org.betup.services.menu;

import org.betup.ui.TabMenuItem;

/* loaded from: classes2.dex */
public class BottomMenuItem {
    private BottomMenuAction action;
    private int countNumber;
    private boolean expandIconSizeToMax;
    private int icon;
    private boolean isCounterVisible;
    private boolean isNew;
    private boolean isSelected;
    private String title;
    private TabMenuItem type;

    private BottomMenuItem() {
        this.expandIconSizeToMax = false;
    }

    public boolean isNew() {
        return this.isNew;
    }

    public void setNew(boolean aNew) {
        this.isNew = aNew;
    }

    public TabMenuItem getType() {
        return this.type;
    }

    public BottomMenuAction getAction() {
        return this.action;
    }

    public void setAction(BottomMenuAction action) {
        this.action = action;
    }

    public String getTitle() {
        return this.title;
    }

    public int getIcon() {
        return this.icon;
    }

    public boolean isCounterVisible() {
        return this.isCounterVisible;
    }

    public int getCountNumber() {
        return this.countNumber;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    void setSelected(boolean selected) {
        this.isSelected = selected;
    }

    void setCounterVisible(boolean counterVisible) {
        this.isCounterVisible = counterVisible;
    }

    void setCountNumber(int number) {
        this.countNumber = number;
    }

    public boolean isExpandIconSizeToMax() {
        return this.expandIconSizeToMax;
    }

    public static class Builder {
        private BottomMenuItem item;

        public Builder(TabMenuItem type) {
            BottomMenuItem bottomMenuItem = new BottomMenuItem();
            this.item = bottomMenuItem;
            bottomMenuItem.type = type;
        }

        public Builder title(String title) {
            this.item.title = title;
            return this;
        }

        public Builder icon(int icon) {
            this.item.icon = icon;
            return this;
        }

        public Builder setCount(int number) {
            this.item.countNumber = number;
            return this;
        }

        public Builder select() {
            this.item.isSelected = true;
            return this;
        }

        public Builder newIcon() {
            this.item.isNew = true;
            return this;
        }

        public Builder onClick(BottomMenuAction action) {
            this.item.action = action;
            return this;
        }

        public Builder setExpandIconSizeToMax() {
            this.item.expandIconSizeToMax = true;
            return this;
        }

        public BottomMenuItem build() {
            return this.item;
        }
    }
}
