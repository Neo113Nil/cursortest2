package h4;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: h4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ThreadFactoryC1198a implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f13529e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f13530a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final String f13531b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13532c;

    /* renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f13533d;

    public ThreadFactoryC1198a(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        this.f13531b = str;
        this.f13532c = i7;
        this.f13533d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f13529e.newThread(new K5.a(13, this, runnable));
        Locale locale = Locale.ROOT;
        newThread.setName(this.f13531b + " Thread #" + this.f13530a.getAndIncrement());
        return newThread;
    }
}
