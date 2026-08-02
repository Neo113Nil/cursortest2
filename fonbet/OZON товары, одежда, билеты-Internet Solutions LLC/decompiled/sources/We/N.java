package We;

import org.jetbrains.annotations.NotNull;
import sf.InterfaceC9683i;

/* loaded from: classes6.dex */
public final class N extends M {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC9683i f33668a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C f33669b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f33670c;

    N(InterfaceC9683i interfaceC9683i, C c11, long j11) {
        this.f33668a = interfaceC9683i;
        this.f33669b = c11;
        this.f33670c = j11;
    }

    @Override // We.M
    public final long contentLength() {
        return this.f33670c;
    }

    @Override // We.M
    public final C contentType() {
        return this.f33669b;
    }

    @Override // We.M
    @NotNull
    public final InterfaceC9683i source() {
        return this.f33668a;
    }
}
