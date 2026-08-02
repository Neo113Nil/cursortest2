package Wa;

import Sc.k;
import Sc.n;
import Ua.C4057a;
import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4057a f33405a;

    /* renamed from: b, reason: collision with root package name */
    private volatile int f33406b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f33407c;

    /* renamed from: Wa.a$a, reason: collision with other inner class name */
    static final class C0591a extends AbstractC7737t implements Function0<ByteBuffer> {
        C0591a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ByteBuffer invoke() {
            return a.this.f33405a.b();
        }
    }

    public a(@NotNull C4057a pool) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.f33405a = pool;
        this.f33407c = k.a(n.NONE, new C0591a());
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [Sc.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [Sc.j, java.lang.Object] */
    public final synchronized void b() {
        if (this.f33406b == 0) {
            return;
        }
        this.f33406b--;
        if (this.f33406b <= 0 && this.f33407c.isInitialized()) {
            this.f33405a.c((ByteBuffer) this.f33407c.getValue());
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [Sc.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [Sc.j, java.lang.Object] */
    @NotNull
    public final synchronized ByteBuffer c() {
        if (this.f33406b <= 0 && this.f33407c.isInitialized()) {
            throw new IllegalStateException("Array has already dealloc!");
        }
        this.f33406b++;
        return (ByteBuffer) this.f33407c.getValue();
    }
}
