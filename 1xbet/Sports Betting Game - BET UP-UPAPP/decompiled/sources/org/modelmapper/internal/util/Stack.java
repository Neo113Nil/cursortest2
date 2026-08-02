package org.modelmapper.internal.util;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public class Stack<T> extends ArrayList<T> {
    private static final long serialVersionUID = 0;

    public void push(T t) {
        add(t);
    }

    public T pop() {
        return remove(size() - 1);
    }

    public T peek() {
        return get(size() - 1);
    }
}
