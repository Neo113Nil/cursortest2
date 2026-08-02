package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.t3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4634t3 implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final C4609s7 f32081a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f32082b;

    /* renamed from: c, reason: collision with root package name */
    public final Pc.a f32083c;

    public C4634t3(C4609s7 c4609s7, Pc.a aVar, Pc.a aVar2) {
        this.f32081a = c4609s7;
        this.f32082b = aVar;
        this.f32083c = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        InterfaceC4524p8 sPayRepository = (InterfaceC4524p8) this.f32081a.get();
        Y9 sPaySdkReducer = (Y9) this.f32082b.get();
        C4248fl featuresHandler = (C4248fl) this.f32083c.get();
        Intrinsics.checkNotNullParameter(sPayRepository, "sPayRepository");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        return new C4091a8(sPayRepository, sPaySdkReducer, featuresHandler);
    }
}
