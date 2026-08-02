package Na;

import Sc.k;
import Sc.n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Na.a f18887a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f18888b;

    static final class a extends AbstractC7737t implements Function0<byte[]> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final byte[] invoke() {
            return c.this.f18887a.b();
        }
    }

    public c(@NotNull Na.a pool) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.f18887a = pool;
        this.f18888b = k.a(n.NONE, new a());
    }
}
