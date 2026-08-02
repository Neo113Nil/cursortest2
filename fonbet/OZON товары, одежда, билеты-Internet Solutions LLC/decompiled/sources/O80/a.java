package O80;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a implements Y30.a<M80.a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final T80.b f20060a;

    public a(@NotNull T80.b externalFintechNavigation) {
        Intrinsics.checkNotNullParameter(externalFintechNavigation, "externalFintechNavigation");
        this.f20060a = externalFintechNavigation;
    }

    @Override // Y30.a
    public final M80.a create(Y30.b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        return N80.a.a().a((P30.b) componentStorage.a(P30.b.class), (O90.a) componentStorage.a(O90.a.class), this.f20060a);
    }
}
