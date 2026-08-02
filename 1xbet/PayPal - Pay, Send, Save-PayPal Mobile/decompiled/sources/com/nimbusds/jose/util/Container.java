package com.nimbusds.jose.util;

@net.jcip.annotations.NotThreadSafe
/* loaded from: classes10.dex */
public class Container<T> {
    private T item;

    public Container() {
    }

    public Container(T t) {
        this.item = t;
    }

    public T get() {
        return this.item;
    }

    public void set(T t) {
        this.item = t;
    }
}
