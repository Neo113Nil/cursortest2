package We;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.InterfaceC9682h;

/* loaded from: classes10.dex */
public final class H extends K {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ File f33629a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C f33630b;

    H(File file, C c11) {
        this.f33629a = file;
        this.f33630b = c11;
    }

    @Override // We.K
    public final long contentLength() {
        return this.f33629a.length();
    }

    @Override // We.K
    /* renamed from: contentType */
    public final C getContentType() {
        return this.f33630b;
    }

    @Override // We.K
    public final void writeTo(@NotNull InterfaceC9682h sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        sf.M j11 = sf.z.j(this.f33629a);
        try {
            sink.y0(j11);
            j11.close();
        } finally {
        }
    }
}
