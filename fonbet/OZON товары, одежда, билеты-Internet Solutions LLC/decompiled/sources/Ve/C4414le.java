package Ve;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.le, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4414le implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31525a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f31526b;

    /* renamed from: c, reason: collision with root package name */
    public final Pc.a f31527c;

    public /* synthetic */ C4414le(Pc.a aVar, Pc.a aVar2, int i11) {
        this.f31525a = i11;
        this.f31526b = aVar;
        this.f31527c = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f31525a) {
            case 0:
                return new C4154cd((C4363jl) this.f31526b.get(), (Vm) this.f31527c.get());
            case 1:
                Context context = (Context) ((Jb.f) this.f31527c).get();
                C4371k0 sessionStoreSP = (C4371k0) this.f31526b.get();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(sessionStoreSP, "sessionStoreSP");
                return new C4483np(context, sessionStoreSP);
            default:
                C4806z5 resourceManager = (C4806z5) ((C4136bo) this.f31526b).get();
                InterfaceC4793yk commonRepository = (InterfaceC4793yk) ((T4) this.f31527c).get();
                Intrinsics.checkNotNullParameter(resourceManager, "resourceManager");
                Intrinsics.checkNotNullParameter(commonRepository, "commonRepository");
                return new C4197e(resourceManager, commonRepository);
        }
    }

    public C4414le(Jb.f fVar, Pc.a aVar) {
        this.f31525a = 1;
        this.f31527c = fVar;
        this.f31526b = aVar;
    }
}
