package Mj0;

import Sc.InterfaceC4008j;
import Sc.k;
import We.B;
import We.G;
import We.L;
import fi0.x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f implements B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final x f18153a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f18154b;

    static final class a extends AbstractC7737t implements Function0<String> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            pf0.h hVar;
            String A11;
            Ld0.c v11 = f.this.f18153a.v();
            return (v11 == null || (hVar = (pf0.h) v11.d(pf0.h.class)) == null || (A11 = hVar.A()) == null) ? "TrackerSDK_Android v9.1.4" : A11;
        }
    }

    public f(@NotNull x settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f18153a = settings;
        this.f18154b = k.b(new a());
    }

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a aVar) {
        G.a aVar2 = new G.a(Ek.a.a(aVar, "chain"));
        aVar2.d("user-agent", (String) this.f18154b.getValue());
        return aVar.proceed(aVar2.b());
    }
}
