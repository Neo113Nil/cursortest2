package com.dogearn.dogemoney;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class TImeUtility {
    public static SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss yyyy-MM-dd");
    String TAG = TImeUtility.class.getName();
    Date lastTime;
    long time;

    public TImeUtility(long j) {
        this.time = j;
        timeFormat.setTimeZone(TimeZone.getTimeZone("GMT+6"));
        try {
            this.lastTime = timeFormat.parse("23:59:59" + timeFormat.format(new Date(j)).substring(8));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static Date getLastTimeToday(String str) throws ParseException {
        timeFormat.setTimeZone(TimeZone.getTimeZone("GMT+6"));
        return timeFormat.parse("23:59:59" + timeFormat.format(new Date(str)).substring(8));
    }
}
