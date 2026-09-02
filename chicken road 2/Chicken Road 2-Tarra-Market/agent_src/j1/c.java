package j1;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class c implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6051a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6052b;

    public c(String str, boolean z2) {
        this.f6051a = str;
        this.f6052b = z2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f6051a);
        thread.setDaemon(this.f6052b);
        return thread;
    }
}
