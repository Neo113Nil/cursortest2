package Ve;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Do implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final Jb.f f28881a;

    public Do(Jb.f fVar) {
        this.f28881a = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        Context context = (Context) this.f28881a.get();
        Intrinsics.checkNotNullParameter(context, "context");
        return new C4593rk(context);
    }
}
