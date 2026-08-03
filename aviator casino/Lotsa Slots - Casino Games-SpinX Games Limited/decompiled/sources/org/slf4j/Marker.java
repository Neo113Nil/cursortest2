package org.slf4j;

/* loaded from: classes6.dex */
public interface Marker extends java.io.Serializable {
    public static final java.lang.String ANY_MARKER = "*";
    public static final java.lang.String ANY_NON_NULL_MARKER = "+";

    void add(org.slf4j.Marker marker);

    boolean contains(java.lang.String str);

    boolean contains(org.slf4j.Marker marker);

    boolean equals(java.lang.Object obj);

    java.lang.String getName();

    @java.lang.Deprecated
    boolean hasChildren();

    boolean hasReferences();

    int hashCode();

    java.util.Iterator<org.slf4j.Marker> iterator();

    boolean remove(org.slf4j.Marker marker);
}
