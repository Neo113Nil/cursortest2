package org.betup.model.local.entity;

import java.util.List;

/* loaded from: classes2.dex */
public class RecentUserSearchesModel {
    private List<String> terms;
    private int userId;

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<String> getTerms() {
        return this.terms;
    }

    public void setTerms(List<String> terms) {
        this.terms = terms;
    }
}
