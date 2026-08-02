package org.threeten.bp.format;

/* loaded from: classes18.dex */
public abstract class DateTimeTextProvider {
    private static final java.util.concurrent.atomic.AtomicReference<org.threeten.bp.format.DateTimeTextProvider> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>();

    public abstract java.lang.String getText(org.threeten.bp.temporal.TemporalField temporalField, long j, org.threeten.bp.format.TextStyle textStyle, java.util.Locale locale);

    public abstract java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.Long>> getTextIterator(org.threeten.bp.temporal.TemporalField temporalField, org.threeten.bp.format.TextStyle textStyle, java.util.Locale locale);

    static org.threeten.bp.format.DateTimeTextProvider getHighSpeedVideoSizes() {
        return org.threeten.bp.format.DateTimeTextProvider.ProviderSingleton.getHighSpeedVideoFpsRanges;
    }

    public static void setInitializer(org.threeten.bp.format.DateTimeTextProvider dateTimeTextProvider) {
        if (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(getHighResolutionOutputSizeshNQ4ISI, null, dateTimeTextProvider)) {
            throw new java.lang.IllegalStateException("Provider was already set, possibly with a default during initialization");
        }
    }

    static class ProviderSingleton {
        static final org.threeten.bp.format.DateTimeTextProvider getHighSpeedVideoFpsRanges;

        ProviderSingleton() {
        }

        static {
            androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(org.threeten.bp.format.DateTimeTextProvider.getHighResolutionOutputSizeshNQ4ISI, null, new org.threeten.bp.format.SimpleDateTimeTextProvider());
            getHighSpeedVideoFpsRanges = (org.threeten.bp.format.DateTimeTextProvider) org.threeten.bp.format.DateTimeTextProvider.getHighResolutionOutputSizeshNQ4ISI.get();
        }
    }
}
