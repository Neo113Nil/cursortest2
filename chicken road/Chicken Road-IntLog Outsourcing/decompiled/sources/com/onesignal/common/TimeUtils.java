package com.onesignal.common;

import android.os.Build;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class TimeUtils {
    public static final TimeUtils INSTANCE = new TimeUtils();

    private TimeUtils() {
    }

    public final String getTimeZoneId() {
        ZoneId systemDefault;
        String id;
        if (Build.VERSION.SDK_INT < 26) {
            String id2 = TimeZone.getDefault().getID();
            i.b(id2);
            return id2;
        }
        systemDefault = ZoneId.systemDefault();
        id = systemDefault.getId();
        i.b(id);
        return id;
    }

    public final int getTimeZoneOffset() {
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        int rawOffset = timeZone.getRawOffset();
        if (timeZone.inDaylightTime(new Date())) {
            rawOffset += timeZone.getDSTSavings();
        }
        return rawOffset / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
    }
}
