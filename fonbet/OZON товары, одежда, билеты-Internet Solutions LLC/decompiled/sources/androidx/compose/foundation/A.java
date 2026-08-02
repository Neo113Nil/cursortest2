package androidx.compose.foundation;

import D1.E0;
import I1.D;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import n0.d0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class A extends e.c implements E0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private d0 f38837a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f38838b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f38839c;

    static final class a extends AbstractC7737t implements Function0<Float> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return Float.valueOf(A.this.I1().m());
        }
    }

    static final class b extends AbstractC7737t implements Function0<Float> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return Float.valueOf(A.this.I1().l());
        }
    }

    public A(@NotNull d0 d0Var, boolean z11, boolean z12) {
        this.f38837a = d0Var;
        this.f38838b = z11;
        this.f38839c = z12;
    }

    @NotNull
    public final d0 I1() {
        return this.f38837a;
    }

    public final void J1(boolean z11) {
        this.f38838b = z11;
    }

    public final void K1(@NotNull d0 d0Var) {
        this.f38837a = d0Var;
    }

    public final void L1(boolean z11) {
        this.f38839c = z11;
    }

    @Override // D1.E0
    public final void applySemantics(@NotNull D d11) {
        I1.z.x(d11);
        I1.j jVar = new I1.j(new a(), new b(), this.f38838b);
        if (this.f38839c) {
            I1.z.z(d11, jVar);
        } else {
            I1.z.m(d11, jVar);
        }
    }
}
