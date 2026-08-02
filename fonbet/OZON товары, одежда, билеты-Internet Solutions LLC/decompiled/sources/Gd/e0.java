package Gd;

import Gd.W;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9834Z;

/* loaded from: classes.dex */
public abstract class e0 extends W {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(@NotNull Fd.k c11) {
        super(c11, null);
        Intrinsics.checkNotNullParameter(c11, "c");
    }

    @Override // Gd.W
    @NotNull
    protected final W.a C(@NotNull Jd.q method, @NotNull ArrayList methodTypeParameters, @NotNull je.N returnType, @NotNull List valueParameters) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(methodTypeParameters, "methodTypeParameters");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(valueParameters, "valueParameters");
        return new W.a(returnType, null, valueParameters, methodTypeParameters, false, kotlin.collections.K.f71697a);
    }

    @Override // Gd.W
    protected void t(@NotNull Sd.f name, @NotNull ArrayList result) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
    }

    @Override // Gd.W
    protected final InterfaceC9834Z y() {
        return null;
    }
}
