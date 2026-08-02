package Mj0;

import We.C;
import We.K;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import sf.F;
import sf.InterfaceC9682h;
import sf.s;
import sf.z;

/* loaded from: classes7.dex */
public final class d extends K {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ K f18151a;

    d(K k11) {
        this.f18151a = k11;
    }

    @Override // We.K
    public final long contentLength() {
        return -1L;
    }

    @Override // We.K
    /* renamed from: contentType */
    public final C getContentType() {
        K k11 = this.f18151a;
        Intrinsics.f(k11);
        return k11.getContentType();
    }

    @Override // We.K
    public final void writeTo(InterfaceC9682h sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        F c11 = z.c(new s(sink));
        K k11 = this.f18151a;
        Intrinsics.f(k11);
        k11.writeTo(c11);
        c11.close();
    }
}
