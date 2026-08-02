package We;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9684j;
import sf.InterfaceC9682h;

/* loaded from: classes6.dex */
public final class I extends K {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C9684j f33631a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C f33632b;

    I(C9684j c9684j, C c11) {
        this.f33631a = c9684j;
        this.f33632b = c11;
    }

    @Override // We.K
    public final long contentLength() {
        return this.f33631a.g();
    }

    @Override // We.K
    /* renamed from: contentType */
    public final C getContentType() {
        return this.f33632b;
    }

    @Override // We.K
    public final void writeTo(@NotNull InterfaceC9682h sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        sink.Q1(this.f33631a);
    }
}
