package Xd;

import java.util.List;
import je.N;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9815F;

/* renamed from: Xd.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4885b extends g<List<? extends g<?>>> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<InterfaceC9815F, N> f34397b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4885b(@NotNull List<? extends g<?>> value, @NotNull Function1<? super InterfaceC9815F, ? extends N> computeType) {
        super(value);
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(computeType, "computeType");
        this.f34397b = computeType;
    }

    @Override // Xd.g
    @NotNull
    public final N a(@NotNull InterfaceC9815F module) {
        Intrinsics.checkNotNullParameter(module, "module");
        N invoke = this.f34397b.invoke(module);
        if (!qd.m.S(invoke) && !qd.m.e0(invoke)) {
            qd.m.m0(invoke);
        }
        return invoke;
    }
}
