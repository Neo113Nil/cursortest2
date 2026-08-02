package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.o6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4493o6 implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final C4609s7 f31708a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f31709b;

    public C4493o6(C4609s7 c4609s7, Pc.a aVar) {
        this.f31708a = c4609s7;
        this.f31709b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        InterfaceC4524p8 sPayRepository = (InterfaceC4524p8) this.f31708a.get();
        Y9 sPaySdkReducer = (Y9) this.f31709b.get();
        Intrinsics.checkNotNullParameter(sPayRepository, "sPayRepository");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        return new O8(sPayRepository, sPaySdkReducer);
    }
}
