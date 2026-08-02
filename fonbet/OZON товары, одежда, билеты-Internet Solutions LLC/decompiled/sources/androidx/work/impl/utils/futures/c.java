package androidx.work.impl.utils.futures;

import androidx.work.impl.utils.futures.a;
import com.google.common.util.concurrent.m;

/* loaded from: classes.dex */
public final class c<V> extends a<V> {
    public static <V> c<V> k() {
        return new c<>();
    }

    @Override // androidx.work.impl.utils.futures.a
    public final boolean j(V v11) {
        return super.j(v11);
    }

    public final boolean l(Throwable th2) {
        th2.getClass();
        if (!a.f45498f.b(this, null, new a.c(th2))) {
            return false;
        }
        a.c(this);
        return true;
    }

    public final boolean m(m<? extends V> mVar) {
        a.c cVar;
        mVar.getClass();
        Object obj = this.f45500a;
        if (obj == null) {
            if (mVar.isDone()) {
                if (a.f45498f.b(this, null, a.f(mVar))) {
                    a.c(this);
                    return true;
                }
                return false;
            }
            a.f fVar = new a.f(this, mVar);
            if (a.f45498f.b(this, null, fVar)) {
                try {
                    mVar.a(fVar, b.INSTANCE);
                    return true;
                } catch (Throwable th2) {
                    try {
                        cVar = new a.c(th2);
                    } catch (Throwable unused) {
                        cVar = a.c.f45507b;
                    }
                    a.f45498f.b(this, fVar, cVar);
                    return true;
                }
            }
            obj = this.f45500a;
        }
        if (obj instanceof a.b) {
            mVar.cancel(((a.b) obj).f45505a);
        }
        return false;
    }
}
