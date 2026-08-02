package MZ;

import EZ.e;
import EZ.f;
import androidx.fragment.app.r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements c<LZ.b> {
    @Override // MZ.c
    public final boolean a(LZ.b bVar) {
        LZ.b request = bVar;
        Intrinsics.checkNotNullParameter(request, "request");
        return true;
    }

    @Override // MZ.c
    public final e b(r context, LZ.c cVar) {
        LZ.b request = (LZ.b) cVar;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        return f.a(request.a());
    }
}
