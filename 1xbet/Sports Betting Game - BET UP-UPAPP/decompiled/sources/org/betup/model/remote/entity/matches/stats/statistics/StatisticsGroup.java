package org.betup.model.remote.entity.matches.stats.statistics;

import java.util.List;

/* loaded from: classes2.dex */
public class StatisticsGroup {
    private int id;
    private List<StatisticsItem> stats;
    private String title;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<StatisticsItem> getStats() {
        return this.stats;
    }

    public void setStats(List<StatisticsItem> stats) {
        this.stats = stats;
    }
}
