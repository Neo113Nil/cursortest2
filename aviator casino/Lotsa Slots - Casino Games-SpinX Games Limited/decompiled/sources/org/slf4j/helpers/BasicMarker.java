package org.slf4j.helpers;

/* loaded from: classes6.dex */
public class BasicMarker implements org.slf4j.Marker {
    private static final java.lang.String CLOSE = " ]";
    private static final java.lang.String OPEN = "[ ";
    private static final java.lang.String SEP = ", ";
    private static final long serialVersionUID = -2849567615646933777L;
    private final java.lang.String name;
    private final java.util.List<org.slf4j.Marker> referenceList = new java.util.concurrent.CopyOnWriteArrayList();

    BasicMarker(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("A marker name cannot be null");
        }
        this.name = str;
    }

    @Override // org.slf4j.Marker
    public java.lang.String getName() {
        return this.name;
    }

    @Override // org.slf4j.Marker
    public void add(org.slf4j.Marker marker) {
        if (marker == null) {
            throw new java.lang.IllegalArgumentException("A null value cannot be added to a Marker as reference.");
        }
        if (contains(marker) || marker.contains(this)) {
            return;
        }
        this.referenceList.add(marker);
    }

    @Override // org.slf4j.Marker
    public boolean hasReferences() {
        return this.referenceList.size() > 0;
    }

    @Override // org.slf4j.Marker
    @java.lang.Deprecated
    public boolean hasChildren() {
        return hasReferences();
    }

    @Override // org.slf4j.Marker
    public java.util.Iterator<org.slf4j.Marker> iterator() {
        return this.referenceList.iterator();
    }

    @Override // org.slf4j.Marker
    public boolean remove(org.slf4j.Marker marker) {
        return this.referenceList.remove(marker);
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
        java.util.Iterator<org.slf4j.Marker> it = this.referenceList.iterator();
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
        if (this.name.equals(str)) {
            return true;
        }
        if (!hasReferences()) {
            return false;
        }
        java.util.Iterator<org.slf4j.Marker> it = this.referenceList.iterator();
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
            return this.name.equals(((org.slf4j.Marker) obj).getName());
        }
        return false;
    }

    @Override // org.slf4j.Marker
    public int hashCode() {
        return this.name.hashCode();
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
                sb.append(SEP);
            }
        }
        sb.append(CLOSE);
        return sb.toString();
    }
}
