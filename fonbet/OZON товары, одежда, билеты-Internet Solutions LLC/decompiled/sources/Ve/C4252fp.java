package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.fp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4252fp implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final Go f31058a;

    public C4252fp(Go go, Lp lp) {
        this.f31058a = go;
    }

    @Override // Pc.a
    public final Object get() {
        Mm0.b fingerprintSdkFactory = (Mm0.b) this.f31058a.get();
        Mb systemProperties = new Mb();
        Intrinsics.checkNotNullParameter(fingerprintSdkFactory, "fingerprintSdkFactory");
        Intrinsics.checkNotNullParameter(systemProperties, "systemProperties");
        return new Bo(fingerprintSdkFactory, systemProperties);
    }
}
