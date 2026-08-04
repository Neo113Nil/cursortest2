package p056h4;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements ThreadFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f13535e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f13536a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f13539d;

    public a(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        this.f13537b = str;
        this.f13538c = i7;
        this.f13539d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f13535e.newThread(new K5.a(13, this, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f13537b + " Thread #" + this.f13536a.getAndIncrement());
        return threadNewThread;
    }
}
