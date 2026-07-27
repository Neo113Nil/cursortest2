package com.inmobi.media;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.na, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ThreadFactoryC3932na implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7262a;
    public final String b;

    public ThreadFactoryC3932na(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f7262a = z;
        this.b = "TIM-" + name;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r) {
        Intrinsics.checkNotNullParameter(r, "r");
        try {
            Thread thread = new Thread(r, this.b);
            thread.setDaemon(this.f7262a);
            return thread;
        } catch (InternalError e) {
            String str = "Error occurred initialising thread for thread pool - " + e;
            return null;
        }
    }
}
