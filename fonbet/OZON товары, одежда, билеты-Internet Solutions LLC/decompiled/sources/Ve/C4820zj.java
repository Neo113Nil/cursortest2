package Ve;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.zj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4820zj implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final Jb.f f32670a;

    public C4820zj(Jb.f fVar) {
        this.f32670a = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        Context context = (Context) this.f32670a.get();
        Intrinsics.checkNotNullParameter(context, "context");
        return new C4186dg(context);
    }
}
