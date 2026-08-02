package P1;

import P1.Z;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: P1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3811s extends AbstractC7737t implements Function1<Function1<? super Z, ? extends Unit>, Z> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3812t f21588b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ W f21589c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3811s(C3812t c3812t, W w11) {
        super(1);
        this.f21588b = c3812t;
        this.f21589c = w11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Z invoke(Function1<? super Z, ? extends Unit> function1) {
        C3817y c3817y;
        Function1 function12;
        K k11;
        Function1 unused;
        C3812t c3812t = this.f21588b;
        c3817y = c3812t.f21593d;
        C3796c f7 = c3812t.f();
        function12 = c3812t.f21595f;
        W w11 = this.f21589c;
        Z a11 = c3817y.a(w11, f7, function1, function12);
        if (a11 != null) {
            return a11;
        }
        k11 = c3812t.f21594e;
        unused = c3812t.f21595f;
        Z.b a12 = k11.a(w11);
        if (a12 != null) {
            return a12;
        }
        throw new IllegalStateException("Could not load font");
    }
}
