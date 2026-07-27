package o0;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import f4.v;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import m0.i;
import n0.InterfaceC1296a;

/* loaded from: classes.dex */
public final class d implements InterfaceC1296a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f11490a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f11491b = new ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f11492c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f11493d = new LinkedHashMap();

    public d(WindowLayoutComponent windowLayoutComponent) {
        this.f11490a = windowLayoutComponent;
    }

    @Override // n0.InterfaceC1296a
    public final void a(i iVar) {
        ReentrantLock reentrantLock = this.f11491b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f11493d;
        try {
            Context context = (Context) linkedHashMap.get(iVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f11492c;
            f fVar = (f) linkedHashMap2.get(context);
            if (fVar == null) {
                return;
            }
            fVar.d(iVar);
            linkedHashMap.remove(iVar);
            if (fVar.c()) {
                linkedHashMap2.remove(context);
                this.f11490a.removeWindowLayoutInfoListener(fVar);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // n0.InterfaceC1296a
    public final void b(Context context, U.d dVar, i iVar) {
        v vVar;
        ReentrantLock reentrantLock = this.f11491b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f11492c;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f11493d;
            if (fVar != null) {
                fVar.b(iVar);
                linkedHashMap2.put(iVar, context);
                vVar = v.f5689a;
            } else {
                vVar = null;
            }
            if (vVar == null) {
                f fVar2 = new f(context);
                linkedHashMap.put(context, fVar2);
                linkedHashMap2.put(iVar, context);
                fVar2.b(iVar);
                this.f11490a.addWindowLayoutInfoListener(context, fVar2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
