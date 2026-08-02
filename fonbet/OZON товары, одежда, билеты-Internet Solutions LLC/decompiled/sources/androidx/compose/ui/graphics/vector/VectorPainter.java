package androidx.compose.ui.graphics.vector;

import Kk.C3532b;
import S0.C3956f1;
import S0.C3987u0;
import S0.C3991w0;
import S0.D1;
import S0.n1;
import Z1.s;
import k1.C7464j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7795M;
import l1.C7809a0;
import n1.C8408a;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import r1.C9155c;
import r1.k;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorPainter;", "Lq1/b;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VectorPainter extends AbstractC8972b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3991w0 f40458a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3991w0 f40459b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final k f40460c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C3987u0 f40461d;

    /* renamed from: e, reason: collision with root package name */
    private float f40462e;

    /* renamed from: f, reason: collision with root package name */
    private C7809a0 f40463f;

    /* renamed from: g, reason: collision with root package name */
    private int f40464g;

    static final class a extends AbstractC7737t implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            VectorPainter vectorPainter = VectorPainter.this;
            if (vectorPainter.f40464g == VectorPainter.c(vectorPainter)) {
                VectorPainter.f(vectorPainter, VectorPainter.c(vectorPainter) + 1);
            }
            return Unit.f71690a;
        }
    }

    public VectorPainter() {
        this(new C9155c());
    }

    public static final int c(VectorPainter vectorPainter) {
        return vectorPainter.f40461d.getIntValue();
    }

    public static final void f(VectorPainter vectorPainter, int i11) {
        vectorPainter.f40461d.d(i11);
    }

    @Override // q1.AbstractC8972b
    protected final boolean applyAlpha(float f7) {
        this.f40462e = f7;
        return true;
    }

    @Override // q1.AbstractC8972b
    protected final boolean applyColorFilter(C7809a0 c7809a0) {
        this.f40463f = c7809a0;
        return true;
    }

    public final void g(boolean z11) {
        this.f40459b.setValue(Boolean.valueOf(z11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q1.AbstractC8972b
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long getF40457d() {
        return ((C7464j) this.f40458a.getValue()).i();
    }

    public final void h(C7795M c7795m) {
        this.f40460c.k(c7795m);
    }

    public final void i(@NotNull String str) {
        this.f40460c.m(str);
    }

    public final void j(long j11) {
        this.f40458a.setValue(C7464j.a(j11));
    }

    public final void k(long j11) {
        this.f40460c.n(j11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q1.AbstractC8972b
    protected final void onDraw(@NotNull InterfaceC8412e interfaceC8412e) {
        C7809a0 c7809a0 = this.f40463f;
        k kVar = this.f40460c;
        if (c7809a0 == null) {
            c7809a0 = kVar.i();
        }
        if (((Boolean) this.f40459b.getValue()).booleanValue() && interfaceC8412e.getLayoutDirection() == s.Rtl) {
            long A02 = interfaceC8412e.A0();
            C8408a.b w02 = interfaceC8412e.w0();
            long e11 = w02.e();
            w02.a().save();
            try {
                w02.f().e(-1.0f, 1.0f, A02);
                kVar.h(interfaceC8412e, this.f40462e, c7809a0);
            } finally {
                C3532b.b(w02, e11);
            }
        } else {
            kVar.h(interfaceC8412e, this.f40462e, c7809a0);
        }
        this.f40464g = this.f40461d.getIntValue();
    }

    public VectorPainter(@NotNull C9155c c9155c) {
        C3991w0 f7;
        C3991w0 f11;
        f7 = n1.f(C7464j.a(0L), D1.f25195a);
        this.f40458a = f7;
        f11 = n1.f(Boolean.FALSE, D1.f25195a);
        this.f40459b = f11;
        k kVar = new k(c9155c);
        kVar.l(new a());
        this.f40460c = kVar;
        this.f40461d = C3956f1.a(0);
        this.f40462e = 1.0f;
        this.f40464g = -1;
    }
}
