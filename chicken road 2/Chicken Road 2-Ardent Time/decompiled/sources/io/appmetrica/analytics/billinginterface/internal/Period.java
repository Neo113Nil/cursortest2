package io.appmetrica.analytics.billinginterface.internal;

/* loaded from: classes.dex */
public class Period {

    /* renamed from: a, reason: collision with root package name */
    private static final java.util.regex.Pattern f3545a = java.util.regex.Pattern.compile("P(\\d+)(\\S+)");
    public final int number;
    public final io.appmetrica.analytics.billinginterface.internal.Period.TimeUnit timeUnit;

    public enum TimeUnit {
        TIME_UNIT_UNKNOWN,
        DAY,
        WEEK,
        MONTH,
        YEAR
    }

    public Period(int i2, io.appmetrica.analytics.billinginterface.internal.Period.TimeUnit timeUnit) {
        this.number = i2;
        this.timeUnit = timeUnit;
    }

    public static io.appmetrica.analytics.billinginterface.internal.Period parse(java.lang.String str) {
        java.util.regex.Matcher matcher = f3545a.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        java.lang.String group = matcher.group(1);
        java.lang.String group2 = matcher.group(2);
        if (group == null || group2 == null) {
            return null;
        }
        try {
            int parseInt = java.lang.Integer.parseInt(group);
            char charAt = group2.charAt(0);
            return new io.appmetrica.analytics.billinginterface.internal.Period(parseInt, charAt != 'D' ? charAt != 'M' ? charAt != 'W' ? charAt != 'Y' ? io.appmetrica.analytics.billinginterface.internal.Period.TimeUnit.TIME_UNIT_UNKNOWN : io.appmetrica.analytics.billinginterface.internal.Period.TimeUnit.YEAR : io.appmetrica.analytics.billinginterface.internal.Period.TimeUnit.WEEK : io.appmetrica.analytics.billinginterface.internal.Period.TimeUnit.MONTH : io.appmetrica.analytics.billinginterface.internal.Period.TimeUnit.DAY);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        io.appmetrica.analytics.billinginterface.internal.Period period = (io.appmetrica.analytics.billinginterface.internal.Period) obj;
        return this.number == period.number && this.timeUnit == period.timeUnit;
    }

    public int hashCode() {
        return this.timeUnit.hashCode() + (this.number * 31);
    }

    public java.lang.String toString() {
        return "Period{number=" + this.number + "timeUnit=" + this.timeUnit + "}";
    }
}
