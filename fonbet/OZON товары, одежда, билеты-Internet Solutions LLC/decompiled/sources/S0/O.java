package S0;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class O<T> extends G0<T> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final l1<T> f25292b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(@NotNull Function0 function0) {
        super(function0);
        D1 d12 = D1.f25195a;
        this.f25292b = d12;
    }

    @Override // S0.G0
    @NotNull
    public final H0<T> c(T t2) {
        return new H0<>(this, t2, t2 == null, this.f25292b, null, true);
    }
}
