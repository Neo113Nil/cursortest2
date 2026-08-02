package W50;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.appearance.SystemBarsAppearance;

/* loaded from: classes3.dex */
public final class a implements U50.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<U50.a> f33293a;

    public a(@NotNull SystemBarsAppearance systemBarsAppearance) {
        Intrinsics.checkNotNullParameter(systemBarsAppearance, "systemBarsAppearance");
        this.f33293a = C7714v.a0(systemBarsAppearance);
    }

    @Override // U50.b
    @NotNull
    public final List<U50.a> a() {
        return this.f33293a;
    }

    @Override // U50.b
    @NotNull
    public final String getName() {
        return "appearance";
    }
}
