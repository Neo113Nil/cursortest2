package E60;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c implements U50.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<U50.c> f7591a;

    public c(@NotNull b pinWidgetBridgeInterface, @NotNull a isPinWidgetSupportedBridgeInterface) {
        Intrinsics.checkNotNullParameter(pinWidgetBridgeInterface, "pinWidgetBridgeInterface");
        Intrinsics.checkNotNullParameter(isPinWidgetSupportedBridgeInterface, "isPinWidgetSupportedBridgeInterface");
        this.f7591a = C7714v.b0(pinWidgetBridgeInterface, isPinWidgetSupportedBridgeInterface);
    }

    @Override // U50.b
    @NotNull
    public final List<U50.c> a() {
        return this.f7591a;
    }

    @Override // U50.b
    @NotNull
    public final String getName() {
        return "widget";
    }
}
