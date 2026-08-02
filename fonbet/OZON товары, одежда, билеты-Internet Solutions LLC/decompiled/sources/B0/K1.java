package B0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import n0.EnumC8372M;
import org.jetbrains.annotations.NotNull;
import r0.InterfaceC9108I;

/* loaded from: classes.dex */
public final class K1 implements InterfaceC9108I {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ InterfaceC9108I f1418a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final S0.A1 f1419b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final S0.A1 f1420c;

    static final class a extends AbstractC7737t implements Function0<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M1 f1421b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(M1 m12) {
            super(0);
            this.f1421b = m12;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.f1421b.c() > 0.0f);
        }
    }

    static final class b extends AbstractC7737t implements Function0<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M1 f1422b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(M1 m12) {
            super(0);
            this.f1422b = m12;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            M1 m12 = this.f1422b;
            return Boolean.valueOf(m12.c() < m12.b());
        }
    }

    K1(InterfaceC9108I interfaceC9108I, M1 m12) {
        this.f1418a = interfaceC9108I;
        this.f1419b = S0.n1.e(new b(m12));
        this.f1420c = S0.n1.e(new a(m12));
    }

    @Override // r0.InterfaceC9108I
    public final boolean a() {
        return this.f1418a.a();
    }

    @Override // r0.InterfaceC9108I
    public final boolean b() {
        return ((Boolean) this.f1419b.getValue()).booleanValue();
    }

    @Override // r0.InterfaceC9108I
    public final float c(float f7) {
        return this.f1418a.c(f7);
    }

    @Override // r0.InterfaceC9108I
    public final Object d(@NotNull EnumC8372M enumC8372M, @NotNull Function2 function2, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return this.f1418a.d(enumC8372M, function2, cVar);
    }

    @Override // r0.InterfaceC9108I
    public final boolean e() {
        return ((Boolean) this.f1420c.getValue()).booleanValue();
    }
}
