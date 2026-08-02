package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.vq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4715vq implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final C4118b6 f32317a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f32318b;

    /* renamed from: c, reason: collision with root package name */
    public final Pc.a f32319c;

    /* renamed from: d, reason: collision with root package name */
    public final Pc.a f32320d;

    /* renamed from: e, reason: collision with root package name */
    public final Pc.a f32321e;

    public C4715vq(C4118b6 c4118b6, Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4) {
        this.f32317a = c4118b6;
        this.f32318b = aVar;
        this.f32319c = aVar2;
        this.f32320d = aVar3;
        this.f32321e = aVar4;
    }

    @Override // Pc.a
    public final Object get() {
        C4806z5 resourceManager = (C4806z5) this.f32317a.get();
        Y4 setCookieHandler = (Y4) this.f32318b.get();
        Vm sPayDataContract = (Vm) this.f32319c.get();
        V0 xPodStickyHandler = (V0) this.f32320d.get();
        InterfaceC4436m7 userIdManager = (InterfaceC4436m7) this.f32321e.get();
        Intrinsics.checkNotNullParameter(resourceManager, "resourceManager");
        Intrinsics.checkNotNullParameter(setCookieHandler, "setCookieHandler");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(xPodStickyHandler, "xPodStickyHandler");
        Intrinsics.checkNotNullParameter(userIdManager, "userIdManager");
        return new C4819zi(resourceManager, setCookieHandler, sPayDataContract, xPodStickyHandler, userIdManager);
    }
}
