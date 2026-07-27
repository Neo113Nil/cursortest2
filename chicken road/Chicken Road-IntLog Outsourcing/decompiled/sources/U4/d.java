package U4;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3177a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3178b;

    public /* synthetic */ d(String str, boolean z) {
        this.f3177a = str;
        this.f3178b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f3177a);
        thread.setDaemon(this.f3178b);
        return thread;
    }
}
