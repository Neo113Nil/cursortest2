package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* compiled from: IOSerialExecutor.java */
/* loaded from: classes5.dex */
public class c implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f4665a;

    public static c a() {
        if (f4665a == null) {
            synchronized (c.class) {
                if (f4665a == null) {
                    f4665a = new c();
                }
            }
        }
        return f4665a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.t().execute(runnable);
    }
}
