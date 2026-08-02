package R20;

import S20.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class j extends AbstractC7737t implements Function1<S20.a, Object> {

    /* renamed from: b, reason: collision with root package name */
    public static final j f24518b = new j(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(S20.a aVar) {
        S20.a it = aVar;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof a.C0509a) {
            return c.Badge;
        }
        if (it instanceof a.b) {
            return c.Button;
        }
        if (it instanceof a.c) {
            return c.Chevron;
        }
        if (it instanceof a.d) {
            return c.ComposableFunction;
        }
        if (it instanceof a.e) {
            return c.Copy;
        }
        if (it instanceof a.f) {
            return c.CustomView;
        }
        if (it instanceof a.g) {
            return c.Header;
        }
        if (it instanceof a.h) {
            return c.Input;
        }
        if (it instanceof a.i) {
            return c.RadioGroup;
        }
        if (it instanceof a.j) {
            return c.Toggle;
        }
        throw new Sc.o();
    }
}
