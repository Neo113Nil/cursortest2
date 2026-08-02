package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.load.engine.bitmap_recycle.k;
import com.bumptech.glide.util.m;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public abstract class c<T extends k> {
    public final ArrayDeque a;

    public c() {
        char[] cArr = m.a;
        this.a = new ArrayDeque(20);
    }

    public final void a(T t) {
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(t);
        }
    }
}
