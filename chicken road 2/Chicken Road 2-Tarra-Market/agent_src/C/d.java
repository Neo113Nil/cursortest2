package C;

import A.i;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class d implements B.a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f42a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f43b = new ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f44c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f45d = new LinkedHashMap();

    public d(WindowLayoutComponent windowLayoutComponent) {
        this.f42a = windowLayoutComponent;
    }

    @Override // B.a
    public final void a(Context context, r.c cVar, i iVar) {
        K0.i iVar2;
        ReentrantLock reentrantLock = this.f43b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f44c;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f45d;
            if (fVar != null) {
                fVar.b(iVar);
                linkedHashMap2.put(iVar, context);
                iVar2 = K0.i.f206a;
            } else {
                iVar2 = null;
            }
            if (iVar2 == null) {
                f fVar2 = new f(context);
                linkedHashMap.put(context, fVar2);
                linkedHashMap2.put(iVar, context);
                fVar2.b(iVar);
                this.f42a.addWindowLayoutInfoListener(context, fVar2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // B.a
    public final void b(i iVar) {
        ReentrantLock reentrantLock = this.f43b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f45d;
        try {
            Context context = (Context) linkedHashMap.get(iVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f44c;
            f fVar = (f) linkedHashMap2.get(context);
            if (fVar == null) {
                return;
            }
            fVar.d(iVar);
            linkedHashMap.remove(iVar);
            if (fVar.c()) {
                linkedHashMap2.remove(context);
                this.f42a.removeWindowLayoutInfoListener(fVar);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
