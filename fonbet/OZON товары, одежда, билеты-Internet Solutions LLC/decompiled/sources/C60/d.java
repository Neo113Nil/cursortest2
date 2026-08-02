package C60;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d implements U50.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<U50.a> f4429a;

    public d(@NotNull a changeUltraStateBridgeInterface, @NotNull b isUltraStateBridgeInterface, @NotNull c isUserUltraBridgeInterface) {
        Intrinsics.checkNotNullParameter(changeUltraStateBridgeInterface, "changeUltraStateBridgeInterface");
        Intrinsics.checkNotNullParameter(isUltraStateBridgeInterface, "isUltraStateBridgeInterface");
        Intrinsics.checkNotNullParameter(isUserUltraBridgeInterface, "isUserUltraBridgeInterface");
        this.f4429a = C7714v.b0(changeUltraStateBridgeInterface, isUltraStateBridgeInterface, isUserUltraBridgeInterface);
    }

    @Override // U50.b
    @NotNull
    public final List<U50.a> a() {
        return this.f4429a;
    }

    @Override // U50.b
    @NotNull
    public final String getName() {
        return "ultra";
    }
}
