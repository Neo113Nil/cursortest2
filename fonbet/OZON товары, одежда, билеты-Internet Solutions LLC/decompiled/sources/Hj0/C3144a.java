package Hj0;

import android.content.Context;
import j00.C7234a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import lj0.C7967a;
import xe.H0;
import xe.X0;

/* renamed from: Hj0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3144a implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11111a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f11112b;

    public /* synthetic */ C3144a(Pc.a aVar, int i11) {
        this.f11111a = i11;
        this.f11112b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        Pc.a aVar = this.f11112b;
        switch (this.f11111a) {
            case 0:
                xe.J exceptionHandler = (xe.J) aVar.get();
                Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
                int i11 = hi0.d.f65547f;
                Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
                return xe.N.a(CoroutineContext.Element.a.d(hi0.d.e(), (H0) X0.b()).plus(exceptionHandler));
            case 1:
                Context context = (Context) aVar.get();
                Intrinsics.checkNotNullParameter(context, "context");
                return new C7967a(context);
            case 2:
                return new u00.m((C7234a) aVar.get());
            default:
                XY.d config = (XY.d) ((Jb.f) aVar).get();
                Intrinsics.checkNotNullParameter(config, "config");
                Context b11 = config.b();
                Jb.j.d(b11);
                return b11;
        }
    }

    public C3144a(Ae0.c cVar, Jb.f fVar) {
        this.f11111a = 3;
        this.f11112b = fVar;
    }
}
