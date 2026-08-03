package org.slf4j;

/* loaded from: classes6.dex */
public interface IMarkerFactory {
    boolean detachMarker(java.lang.String str);

    boolean exists(java.lang.String str);

    org.slf4j.Marker getDetachedMarker(java.lang.String str);

    org.slf4j.Marker getMarker(java.lang.String str);
}
