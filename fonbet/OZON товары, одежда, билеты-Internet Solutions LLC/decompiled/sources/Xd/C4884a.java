package Xd;

import je.N;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9815F;
import ud.InterfaceC10025c;

/* renamed from: Xd.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4884a extends g<InterfaceC10025c> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4884a(@NotNull InterfaceC10025c value) {
        super(value);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // Xd.g
    @NotNull
    public final N a(@NotNull InterfaceC9815F module) {
        Intrinsics.checkNotNullParameter(module, "module");
        return b().getType();
    }
}
