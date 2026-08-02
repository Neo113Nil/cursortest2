package androidx.compose.ui.platform;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class h2<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final U0.b<Reference<T>> f40882a = new U0.b<>(new Reference[16]);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ReferenceQueue<T> f40883b = new ReferenceQueue<>();

    public final T a() {
        Reference<? extends T> poll;
        U0.b<Reference<T>> bVar;
        do {
            poll = this.f40883b.poll();
            bVar = this.f40882a;
            if (poll != null) {
                bVar.s(poll);
            }
        } while (poll != null);
        while (bVar.p()) {
            T t2 = (T) ((Reference) Pk0.b.b(1, bVar)).get();
            if (t2 != null) {
                return t2;
            }
        }
        return null;
    }

    public final void b(D1.w0 w0Var) {
        ReferenceQueue<T> referenceQueue;
        Reference<? extends T> poll;
        U0.b<Reference<T>> bVar;
        do {
            referenceQueue = this.f40883b;
            poll = referenceQueue.poll();
            bVar = this.f40882a;
            if (poll != null) {
                bVar.s(poll);
            }
        } while (poll != null);
        bVar.b(new WeakReference(w0Var, referenceQueue));
    }
}
