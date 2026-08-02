package We;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.InterfaceC9682h;

/* loaded from: classes6.dex */
public final class J extends K {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f33633a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C f33634b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f33635c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f33636d;

    J(byte[] bArr, C c11, int i11, int i12) {
        this.f33633a = bArr;
        this.f33634b = c11;
        this.f33635c = i11;
        this.f33636d = i12;
    }

    @Override // We.K
    public final long contentLength() {
        return this.f33635c;
    }

    @Override // We.K
    /* renamed from: contentType */
    public final C getContentType() {
        return this.f33634b;
    }

    @Override // We.K
    public final void writeTo(@NotNull InterfaceC9682h sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        sink.Y1(this.f33636d, this.f33635c, this.f33633a);
    }
}
