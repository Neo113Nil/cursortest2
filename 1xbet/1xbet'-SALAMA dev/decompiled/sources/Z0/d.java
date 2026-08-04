package Z0;

import X0.i;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Y0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f7826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f7827b = new ReentrantLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f7828c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f7829d = new LinkedHashMap();

    public d(WindowLayoutComponent windowLayoutComponent) {
        this.f7826a = windowLayoutComponent;
    }

    @Override // Y0.a
    public final void a(Context context, p094n.a aVar, i iVar) {
        p044f6.i iVar2;
        ReentrantLock reentrantLock = this.f7827b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f7828c;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f7829d;
            if (fVar != null) {
                fVar.b(iVar);
                linkedHashMap2.put(iVar, context);
                iVar2 = p044f6.i.f13014a;
            } else {
                iVar2 = null;
            }
            if (iVar2 == null) {
                f fVar2 = new f(context);
                linkedHashMap.put(context, fVar2);
                linkedHashMap2.put(iVar, context);
                fVar2.b(iVar);
                this.f7826a.addWindowLayoutInfoListener(context, fVar2);
            }
        } finally {
            reentrantLock.unlock();
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
