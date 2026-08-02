package N;

import androidx.annotation.NonNull;
import kotlin.jvm.internal.Intrinsics;
import x2.InterfaceC10646a;

/* loaded from: classes8.dex */
public final class m<T> implements InterfaceC10646a<T> {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC10646a<T> f18244a;

    public final void a(@NonNull InterfaceC10646a<T> interfaceC10646a) {
        this.f18244a = interfaceC10646a;
    }

    @Override // x2.InterfaceC10646a
    public final void accept(@NonNull T t2) {
        Intrinsics.g(this.f18244a, "Listener is not set.");
        this.f18244a.accept(t2);
    }
}
