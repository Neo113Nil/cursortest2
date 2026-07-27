package i0;

import I1.n;
import J1.i;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import d0.C0264d;
import d2.C0279i;
import e2.o;
import h0.InterfaceC0324a;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.r;

/* renamed from: i0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0330c implements InterfaceC0324a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f4997a;

    /* renamed from: b, reason: collision with root package name */
    public final i f4998b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f4999c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f5000d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f5001e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();

    public C0330c(WindowLayoutComponent windowLayoutComponent, i iVar) {
        this.f4997a = windowLayoutComponent;
        this.f4998b = iVar;
    }

    @Override // h0.InterfaceC0324a
    public final void a(Context context, S.c cVar, n nVar) {
        C0279i c0279i;
        ReentrantLock reentrantLock = this.f4999c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f5000d;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f5001e;
            if (fVar != null) {
                fVar.b(nVar);
                linkedHashMap2.put(nVar, context);
                c0279i = C0279i.f4852a;
            } else {
                c0279i = null;
            }
            if (c0279i == null) {
                f fVar2 = new f(context);
                linkedHashMap.put(context, fVar2);
                linkedHashMap2.put(nVar, context);
                fVar2.b(nVar);
                if (!(context instanceof Activity)) {
                    fVar2.accept(new WindowLayoutInfo(o.f4877a));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f.put(fVar2, this.f4998b.s(this.f4997a, r.a(WindowLayoutInfo.class), (Activity) context, new C0329b(1, fVar2, f.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0)));
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // h0.InterfaceC0324a
    public final void b(n nVar) {
        ReentrantLock reentrantLock = this.f4999c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f5001e;
        try {
            Context context = (Context) linkedHashMap.get(nVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f5000d;
            f fVar = (f) linkedHashMap2.get(context);
            if (fVar == null) {
                return;
            }
            ReentrantLock reentrantLock2 = fVar.f5007b;
            reentrantLock2.lock();
            LinkedHashSet linkedHashSet = fVar.f5009d;
            try {
                linkedHashSet.remove(nVar);
                reentrantLock2.unlock();
                linkedHashMap.remove(nVar);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap2.remove(context);
                    C0264d c0264d = (C0264d) this.f.remove(fVar);
                    if (c0264d != null) {
                        c0264d.f4828a.invoke(c0264d.f4829b, c0264d.f4830c);
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
