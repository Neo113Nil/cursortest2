package Ve;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.mo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4453mo implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final Jb.f f31608a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f31609b;

    public C4453mo(Jb.f fVar, Pc.a aVar) {
        this.f31608a = fVar;
        this.f31609b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        Context context = (Context) this.f31608a.get();
        C4248fl featuresHandler = (C4248fl) this.f31609b.get();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        return new Yq(context, featuresHandler);
    }
}
