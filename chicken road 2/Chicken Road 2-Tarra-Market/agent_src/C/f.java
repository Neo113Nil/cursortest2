package C;

import A.i;
import A.l;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.j;
import m.InterfaceC0785a;

/* loaded from: classes.dex */
public final class f implements InterfaceC0785a, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Context f46a;

    /* renamed from: c, reason: collision with root package name */
    public l f48c;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f47b = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f49d = new LinkedHashSet();

    public f(Context context) {
        this.f46a = context;
    }

    @Override // m.InterfaceC0785a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(WindowLayoutInfo value) {
        j.e(value, "value");
        ReentrantLock reentrantLock = this.f47b;
        reentrantLock.lock();
        try {
            this.f48c = e.c(this.f46a, value);
            Iterator it = this.f49d.iterator();
            while (it.hasNext()) {
                ((InterfaceC0785a) it.next()).accept(this.f48c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(i iVar) {
        ReentrantLock reentrantLock = this.f47b;
        reentrantLock.lock();
        try {
            l lVar = this.f48c;
            if (lVar != null) {
                iVar.accept(lVar);
            }
            this.f49d.add(iVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean c() {
        return this.f49d.isEmpty();
    }

    public final void d(i iVar) {
        ReentrantLock reentrantLock = this.f47b;
        reentrantLock.lock();
        try {
            this.f49d.remove(iVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
