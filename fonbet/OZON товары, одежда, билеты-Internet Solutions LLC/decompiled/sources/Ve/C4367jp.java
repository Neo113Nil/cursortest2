package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.jp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4367jp implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final C4609s7 f31394a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f31395b;

    public C4367jp(C4609s7 c4609s7, Pc.a aVar) {
        this.f31394a = c4609s7;
        this.f31395b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        InterfaceC4524p8 sPayRepository = (InterfaceC4524p8) this.f31394a.get();
        Y9 sPaySdkReducer = (Y9) this.f31395b.get();
        Intrinsics.checkNotNullParameter(sPayRepository, "sPayRepository");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        return new Zc(sPayRepository, sPaySdkReducer);
    }
}
