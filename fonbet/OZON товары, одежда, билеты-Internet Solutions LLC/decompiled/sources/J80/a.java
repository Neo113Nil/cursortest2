package J80;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a implements Y30.a<H80.a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final K80.a f14199a;

    public a(@NotNull K80.a fintechLocationConfig) {
        Intrinsics.checkNotNullParameter(fintechLocationConfig, "fintechLocationConfig");
        this.f14199a = fintechLocationConfig;
    }

    @Override // Y30.a
    public final H80.a create(Y30.b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        return I80.a.a().a((P30.b) componentStorage.a(P30.b.class), this.f14199a);
    }
}
