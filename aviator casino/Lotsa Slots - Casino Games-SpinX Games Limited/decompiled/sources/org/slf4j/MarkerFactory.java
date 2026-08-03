package org.slf4j;

/* loaded from: classes6.dex */
public class MarkerFactory {
    static org.slf4j.IMarkerFactory MARKER_FACTORY;

    private MarkerFactory() {
    }

    static {
        org.slf4j.spi.SLF4JServiceProvider provider = org.slf4j.LoggerFactory.getProvider();
        if (provider != null) {
            MARKER_FACTORY = provider.getMarkerFactory();
            return;
        }
        org.slf4j.helpers.Util.report("Failed to find provider");
        org.slf4j.helpers.Util.report("Defaulting to BasicMarkerFactory.");
        MARKER_FACTORY = new org.slf4j.helpers.BasicMarkerFactory();
    }

    public static org.slf4j.Marker getMarker(java.lang.String str) {
        return MARKER_FACTORY.getMarker(str);
    }

    public static org.slf4j.Marker getDetachedMarker(java.lang.String str) {
        return MARKER_FACTORY.getDetachedMarker(str);
    }

    public static org.slf4j.IMarkerFactory getIMarkerFactory() {
        return MARKER_FACTORY;
    }
}
