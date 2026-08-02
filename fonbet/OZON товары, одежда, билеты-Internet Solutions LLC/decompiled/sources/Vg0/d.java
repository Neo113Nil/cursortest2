package Vg0;

import f3.AbstractC6409a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Function1<AbstractC6409a, c> f32798a = a.f32799b;

    static final class a extends AbstractC7737t implements Function1<AbstractC6409a, c> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f32799b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final c invoke(AbstractC6409a abstractC6409a) {
            Intrinsics.checkNotNullParameter(abstractC6409a, "<this>");
            Pg0.b bVar = Pg0.b.f22527m;
            if (bVar == null) {
                throw new IllegalStateException("Required value was null.");
            }
            String k11 = bVar.k();
            Pg0.b bVar2 = Pg0.b.f22527m;
            if (bVar2 != null) {
                return new c(bVar2.l(), k11);
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    @NotNull
    public static final Function1<AbstractC6409a, c> a() {
        return f32798a;
    }
}
