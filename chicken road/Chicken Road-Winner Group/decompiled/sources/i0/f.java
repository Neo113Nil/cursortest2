package i0;

import I1.n;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import g0.C0311j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class f implements C.a, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5006a;

    /* renamed from: c, reason: collision with root package name */
    public C0311j f5008c;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f5007b = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f5009d = new LinkedHashSet();

    public f(Context context) {
        this.f5006a = context;
    }

    @Override // C.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(WindowLayoutInfo value) {
        j.e(value, "value");
        ReentrantLock reentrantLock = this.f5007b;
        reentrantLock.lock();
        try {
            this.f5008c = e.b(this.f5006a, value);
            Iterator it = this.f5009d.iterator();
            while (it.hasNext()) {
                ((C.a) it.next()).accept(this.f5008c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(n nVar) {
        ReentrantLock reentrantLock = this.f5007b;
        reentrantLock.lock();
        try {
            C0311j c0311j = this.f5008c;
            if (c0311j != null) {
                nVar.accept(c0311j);
            }
            this.f5009d.add(nVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
