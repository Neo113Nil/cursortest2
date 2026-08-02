package org.threeten.bp;

/* loaded from: classes18.dex */
public final class DateTimeUtils {
    private DateTimeUtils() {
    }

    public static org.threeten.bp.Instant toInstant(java.util.Date date) {
        return org.threeten.bp.Instant.ofEpochMilli(date.getTime());
    }

    public static java.util.Date toDate(org.threeten.bp.Instant instant) {
        try {
            return new java.util.Date(instant.toEpochMilli());
        } catch (java.lang.ArithmeticException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public static org.threeten.bp.Instant toInstant(java.util.Calendar calendar) {
        return org.threeten.bp.Instant.ofEpochMilli(calendar.getTimeInMillis());
    }

    public static org.threeten.bp.ZonedDateTime toZonedDateTime(java.util.Calendar calendar) {
        return org.threeten.bp.ZonedDateTime.ofInstant(org.threeten.bp.Instant.ofEpochMilli(calendar.getTimeInMillis()), toZoneId(calendar.getTimeZone()));
    }

    public static java.util.GregorianCalendar toGregorianCalendar(org.threeten.bp.ZonedDateTime zonedDateTime) {
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(toTimeZone(zonedDateTime.getZone()));
        gregorianCalendar.setGregorianChange(new java.util.Date(Long.MIN_VALUE));
        gregorianCalendar.setFirstDayOfWeek(2);
        gregorianCalendar.setMinimalDaysInFirstWeek(4);
        try {
            gregorianCalendar.setTimeInMillis(zonedDateTime.toInstant().toEpochMilli());
            return gregorianCalendar;
        } catch (java.lang.ArithmeticException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public static org.threeten.bp.ZoneId toZoneId(java.util.TimeZone timeZone) {
        return org.threeten.bp.ZoneId.of(timeZone.getID(), org.threeten.bp.ZoneId.SHORT_IDS);
    }

    public static java.util.TimeZone toTimeZone(org.threeten.bp.ZoneId zoneId) {
        java.lang.String id = zoneId.getId();
        if (id.startsWith("+") || id.startsWith("-")) {
            id = "GMT".concat(java.lang.String.valueOf(id));
        } else if (id.equals("Z")) {
            id = com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC;
        }
        return java.util.TimeZone.getTimeZone(id);
    }

    public static org.threeten.bp.LocalDate toLocalDate(java.sql.Date date) {
        return org.threeten.bp.LocalDate.of(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
    }

    public static java.sql.Date toSqlDate(org.threeten.bp.LocalDate localDate) {
        return new java.sql.Date(localDate.getYear() - 1900, localDate.getMonthValue() - 1, localDate.getDayOfMonth());
    }

    public static org.threeten.bp.LocalTime toLocalTime(java.sql.Time time) {
        return org.threeten.bp.LocalTime.of(time.getHours(), time.getMinutes(), time.getSeconds());
    }

    public static java.sql.Time toSqlTime(org.threeten.bp.LocalTime localTime) {
        return new java.sql.Time(localTime.getHour(), localTime.getMinute(), localTime.getSecond());
    }

    public static java.sql.Timestamp toSqlTimestamp(org.threeten.bp.LocalDateTime localDateTime) {
        return new java.sql.Timestamp(localDateTime.getYear() - 1900, localDateTime.getMonthValue() - 1, localDateTime.getDayOfMonth(), localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond(), localDateTime.getNano());
    }

    public static org.threeten.bp.LocalDateTime toLocalDateTime(java.sql.Timestamp timestamp) {
        int year = timestamp.getYear();
        return org.threeten.bp.LocalDateTime.of(year + 1900, timestamp.getMonth() + 1, timestamp.getDate(), timestamp.getHours(), timestamp.getMinutes(), timestamp.getSeconds(), timestamp.getNanos());
    }

    public static java.sql.Timestamp toSqlTimestamp(org.threeten.bp.Instant instant) {
        try {
            java.sql.Timestamp timestamp = new java.sql.Timestamp(instant.getEpochSecond() * 1000);
            timestamp.setNanos(instant.getNano());
            return timestamp;
        } catch (java.lang.ArithmeticException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public static org.threeten.bp.Instant toInstant(java.sql.Timestamp timestamp) {
        return org.threeten.bp.Instant.ofEpochSecond(timestamp.getTime() / 1000, timestamp.getNanos());
    }
}
