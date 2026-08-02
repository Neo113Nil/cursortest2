package org.slf4j;

/* loaded from: classes18.dex */
public class MarkerFactory {
    static org.slf4j.IMarkerFactory Camera2StreamConfigurationMap;

    private MarkerFactory() {
    }

    static {
        org.slf4j.spi.SLF4JServiceProvider Camera2StreamConfigurationMap2 = org.slf4j.LoggerFactory.Camera2StreamConfigurationMap();
        if (Camera2StreamConfigurationMap2 != null) {
            Camera2StreamConfigurationMap = Camera2StreamConfigurationMap2.getMarkerFactory();
            return;
        }
        org.slf4j.helpers.Reporter.error("Failed to find provider");
        org.slf4j.helpers.Reporter.error("Defaulting to BasicMarkerFactory.");
        Camera2StreamConfigurationMap = new org.slf4j.helpers.BasicMarkerFactory();
    }

    public static org.slf4j.Marker getMarker(java.lang.String str) {
        return Camera2StreamConfigurationMap.getMarker(str);
    }

    public static org.slf4j.Marker getDetachedMarker(java.lang.String str) {
        return Camera2StreamConfigurationMap.getDetachedMarker(str);
    }

    public static org.slf4j.IMarkerFactory getIMarkerFactory() {
        return Camera2StreamConfigurationMap;
    }
}
