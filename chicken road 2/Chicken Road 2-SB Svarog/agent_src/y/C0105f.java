package y;

import F.C0017s;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import g0.h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import w.k;

/* renamed from: y.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0105f implements l.a, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1320a;

    /* renamed from: c, reason: collision with root package name */
    public k f1322c;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f1321b = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f1323d = new LinkedHashSet();

    public C0105f(Context context) {
        this.f1320a = context;
    }

    @Override // l.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(WindowLayoutInfo windowLayoutInfo) {
        h.e(windowLayoutInfo, "value");
        ReentrantLock reentrantLock = this.f1321b;
        reentrantLock.lock();
        try {
            this.f1322c = AbstractC0104e.b(this.f1320a, windowLayoutInfo);
            Iterator it = this.f1323d.iterator();
            while (it.hasNext()) {
                ((l.a) it.next()).accept(this.f1322c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(C0017s c0017s) {
        ReentrantLock reentrantLock = this.f1321b;
        reentrantLock.lock();
        try {
            k kVar = this.f1322c;
            if (kVar != null) {
                c0017s.accept(kVar);
            }
            this.f1323d.add(c0017s);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
