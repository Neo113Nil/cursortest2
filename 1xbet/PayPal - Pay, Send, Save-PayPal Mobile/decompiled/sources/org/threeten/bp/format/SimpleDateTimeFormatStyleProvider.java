package org.threeten.bp.format;

/* loaded from: classes18.dex */
final class SimpleDateTimeFormatStyleProvider extends org.threeten.bp.format.DateTimeFormatStyleProvider {
    private static final java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Object> getHighSpeedVideoSizes = new java.util.concurrent.ConcurrentHashMap(16, 0.75f, 2);

    SimpleDateTimeFormatStyleProvider() {
    }

    @Override // org.threeten.bp.format.DateTimeFormatStyleProvider
    public final org.threeten.bp.format.DateTimeFormatter Camera2StreamConfigurationMap(org.threeten.bp.format.FormatStyle formatStyle, org.threeten.bp.format.FormatStyle formatStyle2, org.threeten.bp.chrono.Chronology chronology, java.util.Locale locale) {
        java.text.DateFormat timeInstance;
        if (formatStyle == null && formatStyle2 == null) {
            throw new java.lang.IllegalArgumentException("Date and Time style must not both be null");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(chronology.getId());
        sb.append('|');
        sb.append(locale.toString());
        sb.append('|');
        sb.append(formatStyle);
        sb.append(formatStyle2);
        java.lang.String obj = sb.toString();
        java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Object> concurrentMap = getHighSpeedVideoSizes;
        java.lang.Object obj2 = concurrentMap.get(obj);
        if (obj2 != null) {
            if (obj2.equals("")) {
                throw new java.lang.IllegalArgumentException("Unable to convert DateFormat to DateTimeFormatter");
            }
            return (org.threeten.bp.format.DateTimeFormatter) obj2;
        }
        if (formatStyle == null) {
            timeInstance = java.text.DateFormat.getTimeInstance(formatStyle2.ordinal(), locale);
        } else if (formatStyle2 != null) {
            timeInstance = java.text.DateFormat.getDateTimeInstance(formatStyle.ordinal(), formatStyle2.ordinal(), locale);
        } else {
            timeInstance = java.text.DateFormat.getDateInstance(formatStyle.ordinal(), locale);
        }
        if (timeInstance instanceof java.text.SimpleDateFormat) {
            org.threeten.bp.format.DateTimeFormatter formatter = new org.threeten.bp.format.DateTimeFormatterBuilder().appendPattern(((java.text.SimpleDateFormat) timeInstance).toPattern()).toFormatter(locale);
            concurrentMap.putIfAbsent(obj, formatter);
            return formatter;
        }
        concurrentMap.putIfAbsent(obj, "");
        throw new java.lang.IllegalArgumentException("Unable to convert DateFormat to DateTimeFormatter");
    }
}
