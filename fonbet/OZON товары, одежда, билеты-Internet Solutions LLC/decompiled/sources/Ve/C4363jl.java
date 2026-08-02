package Ve;

import We.E;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.jl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4363jl {

    /* renamed from: a, reason: collision with root package name */
    public final Be f31375a;

    /* renamed from: b, reason: collision with root package name */
    public final E.a f31376b;

    /* renamed from: c, reason: collision with root package name */
    public final C4248fl f31377c;

    /* renamed from: d, reason: collision with root package name */
    public npi.spay.fk f31378d;

    /* renamed from: e, reason: collision with root package name */
    public npi.spay.ij f31379e;

    /* renamed from: f, reason: collision with root package name */
    public We.E f31380f;

    public C4363jl(Be sslInteractor, E.a okHttpBuilder, C4248fl featuresHandler) {
        Intrinsics.checkNotNullParameter(sslInteractor, "sslInteractor");
        Intrinsics.checkNotNullParameter(okHttpBuilder, "okHttpBuilder");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        this.f31375a = sslInteractor;
        this.f31376b = okHttpBuilder;
        this.f31377c = featuresHandler;
    }

    public final npi.spay.fk a() {
        npi.spay.fk fkVar = this.f31378d;
        if (fkVar != null) {
            return fkVar;
        }
        Intrinsics.n("paymentFlowSPayApi");
        throw null;
    }
}
