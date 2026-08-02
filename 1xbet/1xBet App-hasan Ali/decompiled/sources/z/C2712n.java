package z;

import java.util.List;
import x0.Y;
import x0.Z;

/* renamed from: z.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2712n extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z[] f21556l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List f21557m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x0.Q f21558n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f21559o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f21560p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C2713o f21561q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2712n(Z[] zArr, List list, x0.Q q5, kotlin.jvm.internal.u uVar, kotlin.jvm.internal.u uVar2, C2713o c2713o) {
        super(1);
        this.f21556l = zArr;
        this.f21557m = list;
        this.f21558n = q5;
        this.f21559o = uVar;
        this.f21560p = uVar2;
        this.f21561q = c2713o;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        Y y5 = (Y) obj;
        Z[] zArr = this.f21556l;
        int length = zArr.length;
        int i = 0;
        int i5 = 0;
        while (i5 < length) {
            int i6 = i;
            Z z3 = zArr[i5];
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.layout.Placeable", z3);
            AbstractC2710l.b(y5, z3, (x0.N) this.f21557m.get(i6), this.f21558n.getLayoutDirection(), this.f21559o.f17622k, this.f21560p.f17622k, this.f21561q.f21562a);
            i5++;
            i = i6 + 1;
        }
        return W3.o.f6046a;
    }
}
