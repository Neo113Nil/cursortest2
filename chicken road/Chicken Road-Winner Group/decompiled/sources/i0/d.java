package i0;

import I1.n;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import d2.C0279i;
import h0.InterfaceC0324a;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class d implements InterfaceC0324a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f5002a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f5003b = new ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f5004c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f5005d = new LinkedHashMap();

    public d(WindowLayoutComponent windowLayoutComponent) {
        this.f5002a = windowLayoutComponent;
    }

    @Override // h0.InterfaceC0324a
    public final void a(Context context, S.c cVar, n nVar) {
        C0279i c0279i;
        ReentrantLock reentrantLock = this.f5003b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f5004c;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f5005d;
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
                this.f5002a.addWindowLayoutInfoListener(context, fVar2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // h0.InterfaceC0324a
    public final void b(n nVar) {
        ReentrantLock reentrantLock = this.f5003b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f5005d;
        try {
            Context context = (Context) linkedHashMap.get(nVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f5004c;
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
                    this.f5002a.removeWindowLayoutInfoListener(fVar);
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
