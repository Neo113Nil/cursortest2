package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class FilterWord {
    private boolean gm;
    private List<FilterWord> oo;
    private String pcc;
    private String sf;

    public FilterWord(String str, String str2) {
        this.pcc = str;
        this.sf = str2;
    }

    public FilterWord() {
    }

    public String getId() {
        return this.pcc;
    }

    public void setId(String str) {
        this.pcc = str;
    }

    public String getName() {
        return this.sf;
    }

    public void setName(String str) {
        this.sf = str;
    }

    public boolean getIsSelected() {
        return this.gm;
    }

    public void setIsSelected(boolean z) {
        this.gm = z;
    }

    public List<FilterWord> getOptions() {
        return this.oo;
    }

    public void addOption(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.oo == null) {
            this.oo = new ArrayList();
        }
        this.oo.add(filterWord);
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(this.pcc) || TextUtils.isEmpty(this.sf)) ? false : true;
    }

    public boolean hasSecondOptions() {
        List<FilterWord> list = this.oo;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FilterWord)) {
            return false;
        }
        FilterWord filterWord = (FilterWord) obj;
        return filterWord.getId().equals(getId()) && filterWord.getName().equals(getName());
    }
}
