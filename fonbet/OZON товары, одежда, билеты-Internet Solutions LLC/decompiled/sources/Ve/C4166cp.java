package Ve;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.cp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4166cp implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final Jb.f f30833a;

    public C4166cp(Jb.f fVar) {
        this.f30833a = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        Context context = (Context) this.f30833a.get();
        Intrinsics.checkNotNullParameter(context, "context");
        return new C4371k0(context);
    }
}
