package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
class DateUtil {
    private static java.lang.Long Camera2StreamConfigurationMap = 0L;
    private static final java.util.Map getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap();
    static java.util.Locale getHighSpeedVideoSizes;

    static {
        java.util.Locale locale;
        if (!"en".equalsIgnoreCase(java.util.Locale.getDefault().getLanguage())) {
            java.util.Locale[] availableLocales = java.util.Locale.getAvailableLocales();
            for (int i = 0; i != availableLocales.length; i++) {
                if ("en".equalsIgnoreCase(availableLocales[i].getLanguage())) {
                    locale = availableLocales[i];
                    break;
                }
            }
        }
        locale = java.util.Locale.getDefault();
        getHighSpeedVideoSizes = locale;
    }

    static java.util.Date getHighSpeedVideoFpsRangesFor(java.util.Date date) throws java.text.ParseException {
        java.util.Locale locale = java.util.Locale.getDefault();
        if (locale == null) {
            return date;
        }
        java.util.Map map = getHighResolutionOutputSizeshNQ4ISI;
        synchronized (map) {
            java.lang.Long l = (java.lang.Long) map.get(locale);
            if (l == null) {
                long time = new java.text.SimpleDateFormat("yyyyMMddHHmmssz").parse("19700101000000GMT+00:00").getTime();
                l = time == 0 ? Camera2StreamConfigurationMap : java.lang.Long.valueOf(time);
                map.put(locale, l);
            }
            if (l != Camera2StreamConfigurationMap) {
                return new java.util.Date(date.getTime() - l.longValue());
            }
            return date;
        }
    }

    DateUtil() {
    }
}
