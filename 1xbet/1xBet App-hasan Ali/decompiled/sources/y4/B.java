package y4;

import L4.InterfaceC0228k;
import java.io.Closeable;

/* loaded from: classes.dex */
public abstract class B implements Closeable, AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public A f21281k;

    public abstract long b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        z4.b.c(f());
    }

    public abstract q d();

    public abstract InterfaceC0228k f();
}
