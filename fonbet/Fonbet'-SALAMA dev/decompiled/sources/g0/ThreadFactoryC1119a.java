package g0;

import java.util.concurrent.ThreadFactory;

/* renamed from: g0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC1119a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13011a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13012b;

    public /* synthetic */ ThreadFactoryC1119a(String str, int i7) {
        this.f13011a = i7;
        this.f13012b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f13011a) {
            case 0:
                Thread thread = new Thread(runnable, this.f13012b);
                thread.setPriority(10);
                return thread;
            default:
                return new Thread(runnable, this.f13012b);
        }
    }
}
