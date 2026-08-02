package Ve;

import We.E;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.oo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4511oo implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final Lh0.a f31748a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f31749b;

    public C4511oo(Lh0.a aVar, Pc.a aVar2) {
        this.f31748a = aVar;
        this.f31749b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        E.a okHttpBuilder = (E.a) this.f31749b.get();
        this.f31748a.getClass();
        Intrinsics.checkNotNullParameter(okHttpBuilder, "okHttpBuilder");
        okHttpBuilder.getClass();
        return new We.E(okHttpBuilder);
    }
}
