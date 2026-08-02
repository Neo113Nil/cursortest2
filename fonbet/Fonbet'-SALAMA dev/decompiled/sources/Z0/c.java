package Z0;

import X0.i;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import f6.C1116i;
import g6.C1167p;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import n.ExecutorC1441a;
import t6.q;
import w1.C1719l1;

/* loaded from: classes.dex */
public final class c implements Y0.a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f7820a;

    /* renamed from: b, reason: collision with root package name */
    public final C1719l1 f7821b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f7822c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f7823d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f7824e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f7825f = new LinkedHashMap();

    public c(WindowLayoutComponent windowLayoutComponent, C1719l1 c1719l1) {
        this.f7820a = windowLayoutComponent;
        this.f7821b = c1719l1;
    }

    @Override // Y0.a
    public final void a(Context context, ExecutorC1441a executorC1441a, i iVar) {
        C1116i c1116i;
        ReentrantLock reentrantLock = this.f7822c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f7823d;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f7824e;
            if (fVar != null) {
                fVar.b(iVar);
                linkedHashMap2.put(iVar, context);
                c1116i = C1116i.f13008a;
            } else {
                c1116i = null;
            }
            if (c1116i == null) {
                f fVar2 = new f(context);
                linkedHashMap.put(context, fVar2);
                linkedHashMap2.put(iVar, context);
                fVar2.b(iVar);
                if (!(context instanceof Activity)) {
                    fVar2.accept(new WindowLayoutInfo(C1167p.f13302a));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f7825f.put(fVar2, this.f7821b.v(this.f7820a, q.a(WindowLayoutInfo.class), (Activity) context, new b(fVar2)));
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // Y0.a
    public final void b(i iVar) {
        ReentrantLock reentrantLock = this.f7822c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f7824e;
        try {
            Context context = (Context) linkedHashMap.get(iVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f7823d;
            f fVar = (f) linkedHashMap2.get(context);
            if (fVar == null) {
                return;
            }
            fVar.d(iVar);
            linkedHashMap.remove(iVar);
            if (fVar.f7833d.isEmpty()) {
                linkedHashMap2.remove(context);
                U0.d dVar = (U0.d) this.f7825f.remove(fVar);
                if (dVar != null) {
                    dVar.f6381a.invoke(dVar.f6382b, dVar.f6383c);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
