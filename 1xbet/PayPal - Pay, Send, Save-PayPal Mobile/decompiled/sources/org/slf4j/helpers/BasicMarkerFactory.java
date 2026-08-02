package org.slf4j.helpers;

/* loaded from: classes18.dex */
public class BasicMarkerFactory implements org.slf4j.IMarkerFactory {
    private final java.util.concurrent.ConcurrentMap<java.lang.String, org.slf4j.Marker> getHighSpeedVideoFpsRanges = new java.util.concurrent.ConcurrentHashMap();

    @Override // org.slf4j.IMarkerFactory
    public org.slf4j.Marker getMarker(java.lang.String str) {
        org.slf4j.Marker putIfAbsent;
        if (str == null) {
            throw new java.lang.IllegalArgumentException("Marker name cannot be null");
        }
        org.slf4j.Marker marker = this.getHighSpeedVideoFpsRanges.get(str);
        return (marker != null || (putIfAbsent = this.getHighSpeedVideoFpsRanges.putIfAbsent(str, (marker = new org.slf4j.helpers.BasicMarker(str)))) == null) ? marker : putIfAbsent;
    }

    @Override // org.slf4j.IMarkerFactory
    public boolean exists(java.lang.String str) {
        if (str == null) {
            return false;
        }
        return this.getHighSpeedVideoFpsRanges.containsKey(str);
    }

    @Override // org.slf4j.IMarkerFactory
    public boolean detachMarker(java.lang.String str) {
        return (str == null || this.getHighSpeedVideoFpsRanges.remove(str) == null) ? false : true;
    }

    @Override // org.slf4j.IMarkerFactory
    public org.slf4j.Marker getDetachedMarker(java.lang.String str) {
        return new org.slf4j.helpers.BasicMarker(str);
    }
}
