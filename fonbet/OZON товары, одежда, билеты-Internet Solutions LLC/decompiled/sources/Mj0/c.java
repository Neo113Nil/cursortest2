package Mj0;

import We.C;
import We.K;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import sf.C9681g;
import sf.InterfaceC9682h;

/* loaded from: classes7.dex */
public final class c extends K {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f18149a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9681g f18150b;

    c(d dVar, C9681g c9681g) {
        this.f18149a = dVar;
        this.f18150b = c9681g;
    }

    @Override // We.K
    public final long contentLength() {
        return this.f18150b.size();
    }

    @Override // We.K
    /* renamed from: contentType */
    public final C getContentType() {
        return this.f18149a.getContentType();
    }

    @Override // We.K
    public final void writeTo(InterfaceC9682h sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        sink.Q1(this.f18150b.Q());
    }
}
