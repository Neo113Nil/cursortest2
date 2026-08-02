package Z0;

import X0.i;
import X0.l;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import t6.h;

/* loaded from: classes.dex */
public final class f implements O.a, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7830a;

    /* renamed from: c, reason: collision with root package name */
    public l f7832c;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f7831b = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f7833d = new LinkedHashSet();

    public f(Context context) {
        this.f7830a = context;
    }

    @Override // O.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(WindowLayoutInfo windowLayoutInfo) {
        h.e(windowLayoutInfo, "value");
        ReentrantLock reentrantLock = this.f7831b;
        reentrantLock.lock();
        try {
            this.f7832c = e.c(this.f7830a, windowLayoutInfo);
            Iterator it = this.f7833d.iterator();
            while (it.hasNext()) {
                ((O.a) it.next()).accept(this.f7832c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(i iVar) {
        ReentrantLock reentrantLock = this.f7831b;
        reentrantLock.lock();
        try {
            l lVar = this.f7832c;
            if (lVar != null) {
                iVar.accept(lVar);
            }
            this.f7833d.add(iVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean c() {
        return this.f7833d.isEmpty();
    }

    public final void d(i iVar) {
        ReentrantLock reentrantLock = this.f7831b;
        reentrantLock.lock();
        try {
            this.f7833d.remove(iVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
