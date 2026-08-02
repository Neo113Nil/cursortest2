package V20;

import Ld0.c;
import Od0.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r20.C9164a;
import s20.InterfaceC9586a;

/* loaded from: classes7.dex */
public final class b extends d<InterfaceC9586a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Class<? extends InterfaceC9586a> f27958a = InterfaceC9586a.class;

    @Override // Od0.d
    public final InterfaceC9586a create(c store) {
        Intrinsics.checkNotNullParameter(store, "store");
        C9164a c9164a = C9164a.f82858a;
        C9164a.e(store);
        return new a();
    }

    @Override // Od0.d
    @NotNull
    public final Class<? extends InterfaceC9586a> getKey() {
        return this.f27958a;
    }

    @Override // Od0.d
    public final boolean isLazyInitializationEnabled() {
        return false;
    }
}
