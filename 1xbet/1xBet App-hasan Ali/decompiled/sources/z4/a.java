package z4;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f21977a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f21978b;

    public /* synthetic */ a(String str, boolean z3) {
        this.f21977a = str;
        this.f21978b = z3;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f21977a;
        l.f("$name", str);
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f21978b);
        return thread;
    }
}
