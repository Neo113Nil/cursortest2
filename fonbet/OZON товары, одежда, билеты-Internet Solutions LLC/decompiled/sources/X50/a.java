package X50;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a implements U50.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f34109a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final c f34110b;

    public a(@NotNull b logoutOzonIdBridgeInterface, @NotNull c notifyLoggedInBankBridgeInterface) {
        Intrinsics.checkNotNullParameter(logoutOzonIdBridgeInterface, "logoutOzonIdBridgeInterface");
        Intrinsics.checkNotNullParameter(notifyLoggedInBankBridgeInterface, "notifyLoggedInBankBridgeInterface");
        this.f34109a = logoutOzonIdBridgeInterface;
        this.f34110b = notifyLoggedInBankBridgeInterface;
    }

    @Override // U50.b
    @NotNull
    public final List<U50.a> a() {
        return C7714v.b0(this.f34109a, this.f34110b);
    }

    @Override // U50.b
    @NotNull
    public final String getName() {
        return "auth";
    }
}
