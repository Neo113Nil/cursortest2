package O40;

import f40.InterfaceC6422b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s40.InterfaceC9592a;

/* loaded from: classes3.dex */
public final class b implements Y30.a<X30.a> {
    @Override // Y30.a
    @NotNull
    public final X30.a create(@NotNull Y30.b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        Y20.a aVar = (Y20.a) componentStorage.a(Y20.a.class);
        M80.a aVar2 = (M80.a) componentStorage.a(M80.a.class);
        InterfaceC9592a interfaceC9592a = (InterfaceC9592a) componentStorage.a(InterfaceC9592a.class);
        return new f(aVar2, (O90.a) componentStorage.a(O90.a.class), aVar, (InterfaceC6422b) componentStorage.a(InterfaceC6422b.class), interfaceC9592a);
    }
}
