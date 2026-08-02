package T40;

import T40.g;
import kotlin.jvm.internal.Intrinsics;
import x40.C10656a;

/* loaded from: classes3.dex */
public final class e implements Jb.e<U40.a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<C10656a> f26637a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<S80.b> f26638b;

    public e(Pc.a<C10656a> aVar, Pc.a<S80.b> aVar2) {
        this.f26637a = aVar;
        this.f26638b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        C10656a cbottomMapper2 = (C10656a) ((g.f) this.f26637a).get();
        S80.b fintechNavigation = (S80.b) ((g.C0531g) this.f26638b).get();
        Intrinsics.checkNotNullParameter(cbottomMapper2, "cbottomMapper2");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        return new U40.b(cbottomMapper2, fintechNavigation);
    }
}
