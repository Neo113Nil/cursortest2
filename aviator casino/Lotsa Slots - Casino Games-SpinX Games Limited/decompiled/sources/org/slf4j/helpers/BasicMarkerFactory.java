package org.slf4j.helpers;

/* loaded from: classes6.dex */
public class BasicMarkerFactory implements org.slf4j.IMarkerFactory {
    private final java.util.concurrent.ConcurrentMap<java.lang.String, org.slf4j.Marker> markerMap = new java.util.concurrent.ConcurrentHashMap();

    @Override // org.slf4j.IMarkerFactory
    public org.slf4j.Marker getMarker(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("Marker name cannot be null");
        }
        org.slf4j.Marker marker = this.markerMap.get(str);
        if (marker != null) {
            return marker;
        }
        org.slf4j.helpers.BasicMarker basicMarker = new org.slf4j.helpers.BasicMarker(str);
        org.slf4j.Marker putIfAbsent = this.markerMap.putIfAbsent(str, basicMarker);
        return putIfAbsent != null ? putIfAbsent : basicMarker;
    }

    @Override // org.slf4j.IMarkerFactory
    public boolean exists(java.lang.String str) {
        if (str == null) {
            return false;
        }
        return this.markerMap.containsKey(str);
    }

    @Override // org.slf4j.IMarkerFactory
    public boolean detachMarker(java.lang.String str) {
        return (str == null || this.markerMap.remove(str) == null) ? false : true;
    }

    @Override // org.slf4j.IMarkerFactory
    public org.slf4j.Marker getDetachedMarker(java.lang.String str) {
        return new org.slf4j.helpers.BasicMarker(str);
    }
}
