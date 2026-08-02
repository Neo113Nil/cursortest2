package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.tk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4651tk implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final Pc.a f32118a;

    public C4651tk(Pc.a aVar) {
        this.f32118a = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        Vl sPaySdkConfigRepository = (Vl) this.f32118a.get();
        Intrinsics.checkNotNullParameter(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        return new Ti(sPaySdkConfigRepository);
    }
}
