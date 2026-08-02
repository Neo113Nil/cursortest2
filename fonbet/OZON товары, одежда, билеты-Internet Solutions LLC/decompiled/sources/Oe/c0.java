package Oe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class c0 extends S<Sc.A, Sc.B, Object> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final c0 f20284c;

    static {
        Intrinsics.checkNotNullParameter(Sc.A.INSTANCE, "<this>");
        f20284c = new c0(d0.f20286a);
    }

    @Override // Oe.AbstractC3682a
    public final int e(Object obj) {
        ((Sc.B) obj).getClass();
        Intrinsics.checkNotNullParameter(null, "$this$collectionSize");
        throw null;
    }

    @Override // Oe.S
    public final void f(Ne.b encoder, Sc.B b11, int i11) {
        b11.getClass();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(null, "content");
        if (i11 <= 0) {
            return;
        }
        encoder.w(b(), 0);
        throw null;
    }
}
