package org.slf4j.helpers;

/* loaded from: classes18.dex */
public class BasicMarker implements org.slf4j.Marker {
    private static final long serialVersionUID = -2849567615646933777L;
    private final java.lang.String Camera2StreamConfigurationMap;
    private final java.util.List<org.slf4j.Marker> getHighSpeedVideoFpsRangesFor = new java.util.concurrent.CopyOnWriteArrayList();

    BasicMarker(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("A marker name cannot be null");
        }
        this.Camera2StreamConfigurationMap = str;
    }

    @Override // org.slf4j.Marker
    public java.lang.String getName() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.slf4j.Marker
    public void add(org.slf4j.Marker marker) {
        if (marker == null) {
            throw new java.lang.IllegalArgumentException("A null value cannot be added to a Marker as reference.");
        }
        if (contains(marker) || marker.contains(this)) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor.add(marker);
    }

    @Override // org.slf4j.Marker
    public boolean hasReferences() {
        return this.getHighSpeedVideoFpsRangesFor.size() > 0;
    }

    @Override // org.slf4j.Marker
    @java.lang.Deprecated
    public boolean hasChildren() {
        return hasReferences();
    }

    @Override // org.slf4j.Marker
    public java.util.Iterator<org.slf4j.Marker> iterator() {
        return this.getHighSpeedVideoFpsRangesFor.iterator();
    }

    @Override // org.slf4j.Marker
    public boolean remove(org.slf4j.Marker marker) {
        return this.getHighSpeedVideoFpsRangesFor.remove(marker);
    }

    @Override // org.slf4j.Marker
    public boolean contains(org.slf4j.Marker marker) {
        if (marker == null) {
            throw new java.lang.IllegalArgumentException("Other cannot be null");
        }
        if (equals(marker)) {
            return true;
        }
        if (!hasReferences()) {
            return false;
        }
        java.util.Iterator<org.slf4j.Marker> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (it.hasNext()) {
            if (it.next().contains(marker)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.slf4j.Marker
    public boolean contains(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("Other cannot be null");
        }
        if (this.Camera2StreamConfigurationMap.equals(str)) {
            return true;
        }
        if (!hasReferences()) {
            return false;
        }
        java.util.Iterator<org.slf4j.Marker> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (it.hasNext()) {
            if (it.next().contains(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.slf4j.Marker
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof org.slf4j.Marker)) {
            return this.Camera2StreamConfigurationMap.equals(((org.slf4j.Marker) obj).getName());
        }
        return false;
    }

    @Override // org.slf4j.Marker
    public int hashCode() {
        return this.Camera2StreamConfigurationMap.hashCode();
    }

    public java.lang.String toString() {
        if (!hasReferences()) {
            return getName();
        }
        java.util.Iterator<org.slf4j.Marker> it = iterator();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(getName());
        sb.append(" [ ");
        while (it.hasNext()) {
            sb.append(it.next().getName());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(" ]");
        return sb.toString();
    }
}
