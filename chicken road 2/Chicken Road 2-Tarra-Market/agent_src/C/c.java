package C;

import A.i;
import L0.l;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.n;
import x.C0859d;

/* loaded from: classes.dex */
public final class c implements B.a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f36a;

    /* renamed from: b, reason: collision with root package name */
    public final w.b f37b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f38c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f39d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f40e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f41f = new LinkedHashMap();

    public c(WindowLayoutComponent windowLayoutComponent, w.b bVar) {
        this.f36a = windowLayoutComponent;
        this.f37b = bVar;
    }

    @Override // B.a
    public final void a(Context context, r.c cVar, i iVar) {
        K0.i iVar2;
        ReentrantLock reentrantLock = this.f38c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f39d;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f40e;
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
                if (!(context instanceof Activity)) {
                    fVar2.accept(new WindowLayoutInfo(l.f214a));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f41f.put(fVar2, this.f37b.a(this.f36a, n.a(WindowLayoutInfo.class), (Activity) context, new b(fVar2)));
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // B.a
    public final void b(i iVar) {
        ReentrantLock reentrantLock = this.f38c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f40e;
        try {
            Context context = (Context) linkedHashMap.get(iVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f39d;
            f fVar = (f) linkedHashMap2.get(context);
            if (fVar == null) {
                return;
            }
            fVar.d(iVar);
            linkedHashMap.remove(iVar);
            if (fVar.f49d.isEmpty()) {
                linkedHashMap2.remove(context);
                C0859d c0859d = (C0859d) this.f41f.remove(fVar);
                if (c0859d != null) {
                    c0859d.f6762a.invoke(c0859d.f6763b, c0859d.f6764c);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
