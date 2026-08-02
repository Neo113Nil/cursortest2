package Ve;

import kotlin.jvm.internal.Intrinsics;
import nf.C8588a;

/* loaded from: classes6.dex */
public final class Er implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final C4191dl f28952a;

    /* renamed from: b, reason: collision with root package name */
    public final El f28953b;

    public Er(C4191dl c4191dl, El el2) {
        this.f28952a = c4191dl;
        this.f28953b = el2;
    }

    @Override // Pc.a
    public final Object get() {
        C8588a loggingInterceptor = (C8588a) this.f28952a.get();
        Vl sPaySdkConfigRepository = (Vl) this.f28953b.get();
        Intrinsics.checkNotNullParameter(loggingInterceptor, "loggingInterceptor");
        Intrinsics.checkNotNullParameter(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        return new X(loggingInterceptor, sPaySdkConfigRepository);
    }
}
