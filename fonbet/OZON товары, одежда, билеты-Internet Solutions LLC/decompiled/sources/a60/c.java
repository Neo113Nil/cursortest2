package a60;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c implements U50.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<U50.a> f36388a;

    public c(@NotNull j showCbottomBridgeInterface2, @NotNull g dismissCbottomBridgeInterface2, @NotNull e dismissAllCbottomBridgeInterface2, @NotNull C4956b actionCbottomBridgeInterface2, @NotNull h getOpenedIdsBridgeInterface) {
        Intrinsics.checkNotNullParameter(showCbottomBridgeInterface2, "showCbottomBridgeInterface2");
        Intrinsics.checkNotNullParameter(dismissCbottomBridgeInterface2, "dismissCbottomBridgeInterface2");
        Intrinsics.checkNotNullParameter(dismissAllCbottomBridgeInterface2, "dismissAllCbottomBridgeInterface2");
        Intrinsics.checkNotNullParameter(actionCbottomBridgeInterface2, "actionCbottomBridgeInterface2");
        Intrinsics.checkNotNullParameter(getOpenedIdsBridgeInterface, "getOpenedIdsBridgeInterface");
        this.f36388a = C7714v.b0(showCbottomBridgeInterface2, dismissCbottomBridgeInterface2, dismissAllCbottomBridgeInterface2, actionCbottomBridgeInterface2, getOpenedIdsBridgeInterface);
    }

    @Override // U50.b
    @NotNull
    public final List<U50.a> a() {
        return this.f36388a;
    }

    @Override // U50.b
    @NotNull
    public final String getName() {
        return "cbottom2";
    }
}
