package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.I;
import kotlinx.coroutines.internal.q;

/* loaded from: classes5.dex */
public final class c extends f {
    public static final c b;

    static {
        int i = i.c;
        int i2 = i.d;
        long j = i.e;
        String str = i.a;
        c cVar = new c();
        cVar.a = new a(i, i2, j, str);
        b = cVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.I
    public final I limitedParallelism(int i, String str) {
        kotlinx.coroutines.internal.j.a(i);
        return i >= i.c ? str != null ? new q(this, str) : this : super.limitedParallelism(i, str);
    }

    @Override // kotlinx.coroutines.I
    public final String toString() {
        return "Dispatchers.Default";
    }
}
