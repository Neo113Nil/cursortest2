package Ej;

import We.C;
import We.J;
import We.K;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import sf.F;
import sf.InterfaceC9682h;
import sf.z;

/* loaded from: classes6.dex */
public final class g extends K {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ J f8008a;

    g(J j11) {
        this.f8008a = j11;
    }

    @Override // We.K
    public final long contentLength() {
        return -1L;
    }

    @Override // We.K
    /* renamed from: contentType */
    public final C getContentType() {
        return this.f8008a.getContentType();
    }

    @Override // We.K
    public final boolean isOneShot() {
        return this.f8008a.isOneShot();
    }

    @Override // We.K
    public final void writeTo(InterfaceC9682h sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        F c11 = z.c(new sf.s(sink));
        try {
            this.f8008a.writeTo(c11);
            Unit unit = Unit.f71690a;
            c11.close();
        } finally {
        }
    }
}
