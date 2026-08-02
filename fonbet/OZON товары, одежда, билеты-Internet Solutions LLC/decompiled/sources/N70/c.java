package N70;

import f40.InterfaceC6422b;
import kotlin.jvm.internal.Intrinsics;
import y30.InterfaceC10835a;

/* loaded from: classes3.dex */
public final class c implements Y30.a<b> {
    @Override // Y30.a
    public final b create(Y30.b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        P30.b bVar = (P30.b) componentStorage.a(P30.b.class);
        O90.a aVar = (O90.a) componentStorage.a(O90.a.class);
        Y20.a aVar2 = (Y20.a) componentStorage.a(Y20.a.class);
        M80.a aVar3 = (M80.a) componentStorage.a(M80.a.class);
        InterfaceC10835a interfaceC10835a = (InterfaceC10835a) componentStorage.a(InterfaceC10835a.class);
        InterfaceC6422b interfaceC6422b = (InterfaceC6422b) componentStorage.a(InterfaceC6422b.class);
        I40.a aVar4 = (I40.a) componentStorage.a(I40.a.class);
        return new a(aVar2, bVar, aVar, aVar3, interfaceC10835a, interfaceC6422b, aVar4, (Q60.a) componentStorage.a(Q60.a.class));
    }
}
