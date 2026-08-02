package Fc;

import hg.InterfaceC6949b;
import io.reactivex.j;
import tc.InterfaceC9805g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class d implements InterfaceC9805g<Object> {
    private static final /* synthetic */ d[] $VALUES;
    public static final d INSTANCE;

    static {
        d dVar = new d("INSTANCE", 0);
        INSTANCE = dVar;
        $VALUES = new d[]{dVar};
    }

    private d() {
        throw null;
    }

    public static void b(j jVar) {
        jVar.d(INSTANCE);
        jVar.onComplete();
    }

    public static void d(Throwable th2, InterfaceC6949b<?> interfaceC6949b) {
        interfaceC6949b.d(INSTANCE);
        interfaceC6949b.onError(th2);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    @Override // tc.InterfaceC9804f
    public final int a(int i11) {
        return 2;
    }

    @Override // hg.InterfaceC6950c
    public final void cancel() {
    }

    @Override // tc.InterfaceC9808j
    public final void clear() {
    }

    @Override // tc.InterfaceC9808j
    public final boolean isEmpty() {
        return true;
    }

    @Override // hg.InterfaceC6950c
    public final void n(long j11) {
        g.f(j11);
    }

    @Override // tc.InterfaceC9808j
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // tc.InterfaceC9808j
    public final Object poll() {
        return null;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "EmptySubscription";
    }
}
