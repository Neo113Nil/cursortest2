package Z0;

import X0.i;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import f6.C1116i;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import n.ExecutorC1441a;

/* loaded from: classes.dex */
public final class d implements Y0.a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f7826a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f7827b = new ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f7828c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f7829d = new LinkedHashMap();

    public d(WindowLayoutComponent windowLayoutComponent) {
        this.f7826a = windowLayoutComponent;
    }

    @Override // Y0.a
    public final void a(Context context, ExecutorC1441a executorC1441a, i iVar) {
        C1116i c1116i;
        ReentrantLock reentrantLock = this.f7827b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f7828c;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f7829d;
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
                this.f7826a.addWindowLayoutInfoListener(context, fVar2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // Y0.a
    public final void b(i iVar) {
        ReentrantLock reentrantLock = this.f7827b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f7829d;
        try {
            Context context = (Context) linkedHashMap.get(iVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f7828c;
            f fVar = (f) linkedHashMap2.get(context);
            if (fVar == null) {
                return;
            }
            fVar.d(iVar);
            linkedHashMap.remove(iVar);
            if (fVar.c()) {
                linkedHashMap2.remove(context);
                this.f7826a.removeWindowLayoutInfoListener(fVar);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
