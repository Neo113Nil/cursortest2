package M;

import androidx.annotation.NonNull;
import androidx.camera.core.p;
import java.util.ArrayDeque;

/* loaded from: classes8.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int f17195a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<T> f17196b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f17197c = new Object();

    /* renamed from: d, reason: collision with root package name */
    final Ej.b f17198d;

    public a(int i11, Ej.b bVar) {
        this.f17195a = i11;
        this.f17196b = new ArrayDeque<>(i11);
        this.f17198d = bVar;
    }

    @NonNull
    public final T a() {
        T removeLast;
        synchronized (this.f17197c) {
            removeLast = this.f17196b.removeLast();
        }
        return removeLast;
    }

    public void b(@NonNull T t2) {
        T a11;
        synchronized (this.f17197c) {
            try {
                a11 = this.f17196b.size() >= this.f17195a ? a() : null;
                this.f17196b.addFirst(t2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f17198d == null || a11 == null) {
            return;
        }
        ((p) a11).close();
    }

    public final boolean c() {
        boolean isEmpty;
        synchronized (this.f17197c) {
            isEmpty = this.f17196b.isEmpty();
        }
        return isEmpty;
    }
}
