package l3;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import m3.C1291a;

/* renamed from: l3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1257c implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f11041a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f11042b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f11043c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f11044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1258d f11045e;

    public C1257c(C1258d c1258d, ArrayList arrayList, C1291a c1291a) {
        this.f11045e = c1258d;
        AtomicReference atomicReference = new AtomicReference();
        this.f11044d = atomicReference;
        this.f11041a = arrayList;
        atomicReference.set(c1291a);
    }

    public final void a() {
        if (this.f11043c.get()) {
            return;
        }
        AtomicBoolean atomicBoolean = this.f11042b;
        if (atomicBoolean.compareAndSet(false, true)) {
            try {
                C1291a c1291a = (C1291a) this.f11044d.get();
                Objects.requireNonNull(c1291a);
                c1291a.b();
            } catch (IOException e3) {
                atomicBoolean.set(false);
                throw e3;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f11043c.compareAndSet(false, true)) {
            ((AtomicBoolean) this.f11045e.f11050e).set(false);
            this.f11044d.set(null);
        }
    }
}
