package com.google.common.collect;

/* loaded from: classes9.dex */
final class UsingToStringOrdering extends com.google.common.collect.Ordering<java.lang.Object> implements java.io.Serializable {
    static final com.google.common.collect.UsingToStringOrdering INSTANCE = new com.google.common.collect.UsingToStringOrdering();
    private static final long serialVersionUID = 0;

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return obj.toString().compareTo(obj2.toString());
    }

    private java.lang.Object readResolve() {
        return INSTANCE;
    }

    public final java.lang.String toString() {
        return "Ordering.usingToString()";
    }

    private UsingToStringOrdering() {
    }
}
