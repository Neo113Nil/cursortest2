package org.betup.model.remote.entity.user.stats;

import com.google.gson.annotations.SerializedName;
import java.text.DateFormatSymbols;

/* loaded from: classes2.dex */
public class ChartItem {

    @SerializedName("day")
    private String day;

    @SerializedName("month")
    private int month;

    @SerializedName("value")
    private long value;

    public String getLabel() {
        String str = this.day;
        if (str != null) {
            return str;
        }
        if (this.month != 0) {
            return new DateFormatSymbols().getShortMonths()[this.month - 1];
        }
        return "";
    }

    public String getDay() {
        return this.day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public long getValue() {
        return this.value;
    }

    public void setValue(long value) {
        this.value = value;
    }
}
