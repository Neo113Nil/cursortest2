package org.bouncycastle.util;

/* loaded from: classes17.dex */
public interface StringList extends org.bouncycastle.util.Iterable<java.lang.String> {
    boolean add(java.lang.String str);

    java.lang.String get(int i);

    int size();

    java.lang.String[] toStringArray();

    java.lang.String[] toStringArray(int i, int i2);
}
