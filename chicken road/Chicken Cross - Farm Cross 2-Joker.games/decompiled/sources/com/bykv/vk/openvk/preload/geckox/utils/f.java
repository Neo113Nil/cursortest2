package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* compiled from: PiecemealSerialExecutor.java */
/* loaded from: classes5.dex */
public class f implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private static volatile f f4667a;

    public static f a() {
        if (f4667a == null) {
            synchronized (f.class) {
                if (f4667a == null) {
                    f4667a = new f();
                }
            }
        }
        return f4667a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.t().execute(runnable);
    }
}
