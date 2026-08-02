package Cd;

import java.util.EnumMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final EnumMap<EnumC2741b, u> f4681a;

    public B(@NotNull EnumMap<EnumC2741b, u> defaultQualifiers) {
        Intrinsics.checkNotNullParameter(defaultQualifiers, "defaultQualifiers");
        this.f4681a = defaultQualifiers;
    }

    public final u a(EnumC2741b enumC2741b) {
        return this.f4681a.get(enumC2741b);
    }

    @NotNull
    public final EnumMap<EnumC2741b, u> b() {
        return this.f4681a;
    }
}
