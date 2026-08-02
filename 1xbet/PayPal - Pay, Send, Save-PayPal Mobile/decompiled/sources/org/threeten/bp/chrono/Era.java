package org.threeten.bp.chrono;

/* loaded from: classes18.dex */
public interface Era extends org.threeten.bp.temporal.TemporalAccessor, org.threeten.bp.temporal.TemporalAdjuster {
    java.lang.String getDisplayName(org.threeten.bp.format.TextStyle textStyle, java.util.Locale locale);

    int getValue();
}
