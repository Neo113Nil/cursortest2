package y;

import F.C0017s;
import W.g;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import o.ExecutorC0072d;
import x.InterfaceC0099a;

/* renamed from: y.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0103d implements InterfaceC0099a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f1316a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f1317b = new ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1318c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1319d = new LinkedHashMap();

    public C0103d(WindowLayoutComponent windowLayoutComponent) {
        this.f1316a = windowLayoutComponent;
    }

    @Override // x.InterfaceC0099a
    public final void a(Context context, ExecutorC0072d executorC0072d, C0017s c0017s) {
        g gVar;
        LinkedHashMap linkedHashMap = this.f1318c;
        ReentrantLock reentrantLock = this.f1317b;
        reentrantLock.lock();
        try {
            C0105f c0105f = (C0105f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f1319d;
            if (c0105f != null) {
                c0105f.b(c0017s);
                linkedHashMap2.put(c0017s, context);
                gVar = g.f394a;
            } else {
                gVar = null;
            }
            if (gVar == null) {
                C0105f c0105f2 = new C0105f(context);
                linkedHashMap.put(context, c0105f2);
                linkedHashMap2.put(c0017s, context);
                c0105f2.b(c0017s);
                this.f1316a.addWindowLayoutInfoListener(context, c0105f2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // x.InterfaceC0099a
    public final void b(C0017s c0017s) {
        LinkedHashMap linkedHashMap = this.f1318c;
        LinkedHashMap linkedHashMap2 = this.f1319d;
        ReentrantLock reentrantLock = this.f1317b;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(c0017s);
            if (context == null) {
                return;
            }
            C0105f c0105f = (C0105f) linkedHashMap.get(context);
            if (c0105f == null) {
                return;
            }
            LinkedHashSet linkedHashSet = c0105f.f1323d;
            ReentrantLock reentrantLock2 = c0105f.f1321b;
            reentrantLock2.lock();
            try {
                linkedHashSet.remove(c0017s);
                reentrantLock2.unlock();
                linkedHashMap2.remove(c0017s);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap.remove(context);
                    this.f1316a.removeWindowLayoutInfoListener(c0105f);
                }
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
