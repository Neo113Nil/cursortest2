package Z0;

import X0.i;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import p050g6.p;
import p155w1.C1010l1;
import t6.q;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Y0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f7820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1010l1 f7821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f7822c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f7823d = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f7824e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f7825f = new LinkedHashMap();

    public c(WindowLayoutComponent windowLayoutComponent, C1010l1 c1010l1) {
        this.f7820a = windowLayoutComponent;
        this.f7821b = c1010l1;
    }

    @Override // Y0.a
    public final void a(Context context, p094n.a aVar, i iVar) {
        p044f6.i iVar2;
        ReentrantLock reentrantLock = this.f7822c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f7823d;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f7824e;
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
                if (!(context instanceof Activity)) {
                    fVar2.accept(new WindowLayoutInfo(p.f13308a));
                } else {
                    this.f7825f.put(fVar2, this.f7821b.v(this.f7820a, q.a(WindowLayoutInfo.class), (Activity) context, new b(fVar2)));
                }
            }
        } finally {
            reentrantLock.unlock();
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
