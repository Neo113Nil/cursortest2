package Ve;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.ao, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4107ao implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final Jb.f f30687a;

    public C4107ao(Jb.f fVar) {
        this.f30687a = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        Context context = (Context) this.f30687a.get();
        Intrinsics.checkNotNullParameter(context, "context");
        return new Le(context);
    }
}
