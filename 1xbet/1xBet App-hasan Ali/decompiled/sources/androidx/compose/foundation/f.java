package androidx.compose.foundation;

import P.C0315s;
import b0.p;
import kotlin.jvm.internal.m;
import v.v0;
import v.w0;
import x.P;

/* loaded from: classes.dex */
public final class f extends m implements i4.f {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v0 f6833l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(v0 v0Var) {
        super(3);
        this.f6833l = v0Var;
    }

    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        C0315s c0315s = (C0315s) obj2;
        ((Number) obj3).intValue();
        c0315s.X(1478351300);
        v0 v0Var = this.f6833l;
        p c5 = w0.e(new ScrollSemanticsElement(v0Var), v0Var, P.f20695k, true, null, v0Var.f20324c, c0315s).c(new ScrollingLayoutElement(v0Var));
        c0315s.q(false);
        return c5;
    }
}
