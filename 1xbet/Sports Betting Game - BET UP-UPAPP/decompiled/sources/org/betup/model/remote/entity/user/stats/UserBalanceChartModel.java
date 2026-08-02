package org.betup.model.remote.entity.user.stats;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes2.dex */
public class UserBalanceChartModel {

    @SerializedName("chart")
    private List<ChartItem> chartItems;

    public List<ChartItem> getChartItems() {
        return this.chartItems;
    }

    public void setChartItems(List<ChartItem> chartItems) {
        this.chartItems = chartItems;
    }
}
