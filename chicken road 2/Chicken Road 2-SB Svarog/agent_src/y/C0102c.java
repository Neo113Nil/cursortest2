package y;

import F.C0017s;
import W.g;
import X.m;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import g0.l;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import o.ExecutorC0072d;
import x.InterfaceC0099a;

/* renamed from: y.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0102c implements InterfaceC0099a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f1310a;

    /* renamed from: b, reason: collision with root package name */
    public final s.b f1311b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f1312c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1313d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f1314e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1315f = new LinkedHashMap();

    public C0102c(WindowLayoutComponent windowLayoutComponent, s.b bVar) {
        this.f1310a = windowLayoutComponent;
        this.f1311b = bVar;
    }

    @Override // x.InterfaceC0099a
    public final void a(Context context, ExecutorC0072d executorC0072d, C0017s c0017s) {
        g gVar;
        LinkedHashMap linkedHashMap = this.f1313d;
        ReentrantLock reentrantLock = this.f1312c;
        reentrantLock.lock();
        try {
            C0105f c0105f = (C0105f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f1314e;
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
                if (!(context instanceof Activity)) {
                    c0105f2.accept(new WindowLayoutInfo(m.f402b));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f1315f.put(c0105f2, this.f1311b.a(this.f1310a, l.a(WindowLayoutInfo.class), (Activity) context, new C0101b(1, c0105f2, C0105f.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0)));
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // x.InterfaceC0099a
    public final void b(C0017s c0017s) {
        LinkedHashMap linkedHashMap = this.f1313d;
        LinkedHashMap linkedHashMap2 = this.f1314e;
        ReentrantLock reentrantLock = this.f1312c;
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
                    t.d dVar = (t.d) this.f1315f.remove(c0105f);
                    if (dVar != null) {
                        dVar.f1257a.invoke(dVar.f1258b, dVar.f1259c);
                    }
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
