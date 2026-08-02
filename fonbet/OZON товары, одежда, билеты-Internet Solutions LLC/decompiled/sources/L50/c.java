package L50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements Y30.a<b> {
    @Override // Y30.a
    public final b create(Y30.b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        P30.b bVar = (P30.b) componentStorage.a(P30.b.class);
        Y20.a aVar = (Y20.a) componentStorage.a(Y20.a.class);
        M80.a aVar2 = (M80.a) componentStorage.a(M80.a.class);
        return new a(aVar, bVar, aVar2, (I40.a) componentStorage.a(I40.a.class));
    }
}
