package Ve;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.bo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4136bo implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final Jb.f f30744a;

    public C4136bo(Jb.f fVar) {
        this.f30744a = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        Context context = (Context) this.f30744a.get();
        Intrinsics.checkNotNullParameter(context, "context");
        return new C4806z5(context);
    }
}
