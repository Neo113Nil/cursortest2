package p046g0;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13018b;

    public /* synthetic */ a(String str, int i7) {
        this.f13017a = i7;
        this.f13018b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f13017a) {
            case 0:
                Thread thread = new Thread(runnable, this.f13018b);
                thread.setPriority(10);
                return thread;
            default:
                return new Thread(runnable, this.f13018b);
        }
    }
}
