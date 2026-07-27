package p3;

import java.io.Closeable;
import java.util.Iterator;
import l3.C1255a;

/* renamed from: p3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1383b implements Iterable, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final C1255a f11642a;

    public C1383b(C1255a c1255a) {
        this.f11642a = c1255a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f11642a.close();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f11642a.iterator();
    }
}
