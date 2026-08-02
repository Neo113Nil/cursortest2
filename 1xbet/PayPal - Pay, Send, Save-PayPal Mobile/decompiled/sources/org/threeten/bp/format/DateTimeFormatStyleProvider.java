package org.threeten.bp.format;

/* loaded from: classes18.dex */
abstract class DateTimeFormatStyleProvider {
    public abstract org.threeten.bp.format.DateTimeFormatter Camera2StreamConfigurationMap(org.threeten.bp.format.FormatStyle formatStyle, org.threeten.bp.format.FormatStyle formatStyle2, org.threeten.bp.chrono.Chronology chronology, java.util.Locale locale);

    DateTimeFormatStyleProvider() {
    }

    static org.threeten.bp.format.DateTimeFormatStyleProvider Camera2StreamConfigurationMap() {
        return new org.threeten.bp.format.SimpleDateTimeFormatStyleProvider();
    }
}
