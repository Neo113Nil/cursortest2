package G0;

import c1.u;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class e<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int f9656a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private u<T> f9657b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private u<T> f9658c;

    public e(int i11) {
        K k11 = K.f71697a;
        this.f9656a = 100;
        u<T> uVar = new u<>();
        uVar.addAll(k11);
        this.f9657b = uVar;
        u<T> uVar2 = new u<>();
        uVar2.addAll(k11);
        this.f9658c = uVar2;
        if (this.f9658c.size() + this.f9657b.size() <= 100) {
            return;
        }
        throw new IllegalArgumentException(("Initial list of undo and redo operations have a size=(" + (this.f9658c.size() + this.f9657b.size()) + ") greater than the given capacity=(100).").toString());
    }

    public final void a() {
        this.f9657b.clear();
        this.f9658c.clear();
    }

    public final boolean b() {
        return !this.f9658c.isEmpty();
    }

    public final boolean c() {
        return !this.f9657b.isEmpty();
    }

    public final void d(d dVar) {
        this.f9658c.clear();
        while (true) {
            int size = this.f9658c.size() + this.f9657b.size();
            int i11 = this.f9656a - 1;
            u<T> uVar = this.f9657b;
            if (size <= i11) {
                uVar.add(dVar);
                return;
            }
            C7714v.u0(uVar);
        }
    }

    public final T e() {
        if (!b()) {
            throw new IllegalStateException("It's an error to call redo while there is nothing to redo. Please first check `canRedo` value before calling the `redo` function.");
        }
        T t2 = (T) C7714v.w0(this.f9658c);
        this.f9657b.add(t2);
        return t2;
    }

    public final T f() {
        if (!c()) {
            throw new IllegalStateException("It's an error to call undo while there is nothing to undo. Please first check `canUndo` value before calling the `undo` function.");
        }
        T t2 = (T) C7714v.w0(this.f9657b);
        this.f9658c.add(t2);
        return t2;
    }
}
