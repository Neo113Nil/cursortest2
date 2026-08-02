package B70;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c implements Y30.a<X30.a> {
    @Override // Y30.a
    @NotNull
    public final X30.a create(@NotNull Y30.b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        Y20.a aVar = (Y20.a) componentStorage.a(Y20.a.class);
        O90.a aVar2 = (O90.a) componentStorage.a(O90.a.class);
        Z80.a aVar3 = (Z80.a) componentStorage.a(Z80.a.class);
        return new a((P30.b) componentStorage.a(P30.b.class), aVar, (M80.a) componentStorage.a(M80.a.class), aVar3, aVar2);
    }
}
