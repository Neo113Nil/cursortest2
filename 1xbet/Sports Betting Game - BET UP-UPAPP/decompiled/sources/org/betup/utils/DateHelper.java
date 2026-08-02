package org.betup.utils;

import android.content.Context;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.betup.R;
import org.betup.ui.fragment.score.ScoreFilter;

/* loaded from: classes4.dex */
public final class DateHelper {
    public static long daysToMillis(int days) {
        return days * 86400000;
    }

    public static long getMillisFromSeconds(long seconds) {
        return seconds * 1000;
    }

    private DateHelper() {
    }

    private static Date parseDateSafely(String date) {
        if (date == null || date.trim().isEmpty()) {
            return new Date();
        }
        String[] strArr = {"yyyy-MM-dd'T'HH:mm:ss.SSSXXX", "yyyy-MM-dd'T'HH:mm:ss.SSSZ", "yyyy-MM-dd'T'HH:mm:ssZ", "yyyy-MM-dd'T'HH:mm:ss.SSS", "yyyy-MM-dd'T'HH:mm:ss", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", "yyyy-MM-dd'T'HH:mm:ss'Z'"};
        for (int i = 0; i < 8; i++) {
            String str = strArr[i];
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
                simpleDateFormat.setLenient(false);
                if (!str.contains("XXX") && !str.contains("Z") && !str.contains("'Z'")) {
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                }
                return simpleDateFormat.parse(date);
            } catch (ParseException unused) {
            }
        }
        return new Date();
    }

    public static String getDate(String date) {
        return new SimpleDateFormat("dd.MM", Locale.getDefault()).format(parseDateSafely(date));
    }

    public static String getDateWithYear(String date) {
        return new SimpleDateFormat("dd.MM.yy", Locale.getDefault()).format(parseDateSafely(date));
    }

    public static String getDateForTips(String date) {
        return new SimpleDateFormat("MM/dd/yyyy | HH:mm", Locale.getDefault()).format(parseDateSafely(date));
    }

    public static String formatDateToHourMins(String date) {
        long max = Math.max(0L, parseDateSafely(date).getTime() - System.currentTimeMillis()) / 1000;
        return String.format(Locale.getDefault(), "%02d:%02d", Long.valueOf(max / 3600), Long.valueOf((max % 3600) / 60));
    }

    public static String formatDateToHourMinsCustom(String date, String placeholder) {
        long max = Math.max(0L, parseDateSafely(date).getTime() - System.currentTimeMillis()) / 1000;
        return String.format(Locale.getDefault(), placeholder, Long.valueOf(max / 3600), Long.valueOf((max % 3600) / 60));
    }

    public static String formatMillisToHourMins(long millis) {
        long j = millis / 1000;
        return String.format(Locale.getDefault(), "%02d:%02d", Long.valueOf(j / 3600), Long.valueOf((j % 3600) / 60));
    }

    public static String formatMillisToHourMinSecs(long millis) {
        long j = millis / 1000;
        return String.format(Locale.getDefault(), "%02d:%02d:%02d", Long.valueOf(j / 3600), Long.valueOf((j % 3600) / 60), Long.valueOf(j % 60));
    }

    public static long millsToMins(long mills) {
        return (mills / 1000) / 60;
    }

    public static String formatDate(Date date) {
        if (date == null) {
            date = new Date();
        }
        return new SimpleDateFormat("HH:mm dd/MM", Locale.US).format(date);
    }

    public static String getDateTime(String date) {
        return new SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.getDefault()).format(parseDateSafely(date));
    }

    public static String getDateTimeFromTimestamp(long time) {
        return new SimpleDateFormat("dd.MM HH:mm", Locale.getDefault()).format((Date) new Timestamp(time));
    }

    public static String getTimeFromTimestamp(long time) {
        return new SimpleDateFormat("HH:mm", Locale.getDefault()).format((Date) new Timestamp(time));
    }

    public static long getTimestamp(String date) {
        return parseDateSafely(date).getTime();
    }

    public static long mili2Seconds(int time, boolean isHours) {
        if (isHours) {
            return TimeUnit.MILLISECONDS.toSeconds(incrementCurrentDateByHours(time));
        }
        return TimeUnit.MILLISECONDS.toSeconds(incrementCurrentDateByDays(time));
    }

    public static String getDateWithFullMonthName(String date) {
        return new SimpleDateFormat("dd/MM", Locale.getDefault()).format(parseDateSafely(date));
    }

    public static String getTime(String date) {
        Date parseDateSafely = parseDateSafely(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        return simpleDateFormat.format(parseDateSafely);
    }

    public static String getTimeForBetlist(String date) {
        return new SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.getDefault()).format(parseDateSafely(date));
    }

    public static String getDateForBetslip(String date) {
        return new SimpleDateFormat("dd MMMM", Locale.getDefault()).format(parseDateSafely(date));
    }

    public static long incrementCurrentDateByHours(int hours) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(10, hours);
        return calendar.getTime().getTime();
    }

    public static long incrementCurrentDateByDays(int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, days);
        return calendar.getTime().getTime();
    }

    public static long startOfDay(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static String formatMinHourDay(long time, Context context) {
        String string = context.getString(R.string.day_short);
        String string2 = context.getString(R.string.hour_short);
        String string3 = context.getString(R.string.minute_short);
        if (time < 0) {
            return "0" + string3;
        }
        long j = time / 60;
        if (j > 1440) {
            return (j / 1440) + string + " " + ((j % 1440) / 60) + string2 + " " + (j % 60) + string3;
        }
        if (j > 60) {
            return (j / 60) + string2 + " " + (j % 60) + string3;
        }
        return (j % 60) + string3;
    }

    /* renamed from: org.betup.utils.DateHelper$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$betup$ui$fragment$score$ScoreFilter;

        static {
            int[] iArr = new int[ScoreFilter.values().length];
            $SwitchMap$org$betup$ui$fragment$score$ScoreFilter = iArr;
            try {
                iArr[ScoreFilter.LIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$betup$ui$fragment$score$ScoreFilter[ScoreFilter.TODAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$betup$ui$fragment$score$ScoreFilter[ScoreFilter.SELECT_DATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String typeFromTimestampAndFilter(long timestamp, ScoreFilter filter) {
        int i = AnonymousClass1.$SwitchMap$org$betup$ui$fragment$score$ScoreFilter[filter.ordinal()];
        if (i == 1) {
            return "live";
        }
        if (i == 2) {
            return "now";
        }
        return String.valueOf(timestamp / 1000);
    }

    public static long dateToMillis(String date) {
        return parseDateSafely(date).getTime();
    }
}
