package androidx.compose.material;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import n0.EnumC8372M;
import org.jetbrains.annotations.NotNull;
import xe.B0;

/* renamed from: androidx.compose.material.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5221t {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicReference<a> f40129a = new AtomicReference<>(null);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Je.d f40130b = Je.e.a();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.compose.material.t$a */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final EnumC8372M f40131a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final B0 f40132b;

        public a(@NotNull EnumC8372M enumC8372M, @NotNull B0 b02) {
            this.f40131a = enumC8372M;
            this.f40132b = b02;
        }

        public final boolean a(@NotNull a aVar) {
            return this.f40131a.compareTo(aVar.f40131a) >= 0;
        }

        public final void b() {
            this.f40132b.j(null);
        }
    }

    public static final void c(C5221t c5221t, a aVar) {
        while (true) {
            AtomicReference<a> atomicReference = c5221t.f40129a;
            a aVar2 = atomicReference.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(aVar2, aVar)) {
                if (atomicReference.get() != aVar2) {
                    break;
                }
            }
            if (aVar2 != null) {
                aVar2.b();
                return;
            }
            return;
        }
    }

    public final boolean d(@NotNull Function0<Unit> function0) {
        Je.d dVar = this.f40130b;
        boolean tryLock = dVar.tryLock();
        if (!tryLock) {
            return tryLock;
        }
        try {
            ((C5216n) function0).invoke();
            return tryLock;
        } finally {
            dVar.c(null);
        }
    }
}
