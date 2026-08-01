package com.pgl.ssdk;

import com.pgl.ssdk.a1;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes7.dex */
public class a2<T extends a1> {

    /* renamed from: a, reason: collision with root package name */
    private int f11604a;
    private BlockingQueue<T> b = new LinkedBlockingQueue();

    private a2(int i) {
        this.f11604a = i;
    }

    public static a2 a(int i) {
        return new a2(i);
    }

    public T a() {
        return this.b.poll();
    }
}
