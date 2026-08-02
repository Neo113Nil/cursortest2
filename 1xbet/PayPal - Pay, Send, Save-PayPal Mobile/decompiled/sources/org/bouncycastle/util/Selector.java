package org.bouncycastle.util;

/* loaded from: classes17.dex */
public interface Selector<T> extends java.lang.Cloneable {
    java.lang.Object clone();

    boolean match(T t);
}
