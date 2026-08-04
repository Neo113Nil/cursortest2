package B4;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends C0072p {
    @Override // B4.C0072p
    public final HashMap a(EnumC0071o enumC0071o) {
        p003a.a.f(enumC0071o, "Provided serverTimestampBehavior value must not be null.");
        HashMap mapA = super.a(enumC0071o);
        p113p3.f.O("Data in a QueryDocumentSnapshot should be non-null", mapA != null, new Object[0]);
        return mapA;
    }

    @Override // B4.C0072p
    public final Map b() {
        HashMap mapA = a(EnumC0071o.f1184d);
        p113p3.f.O("Data in a QueryDocumentSnapshot should be non-null", mapA != null, new Object[0]);
        return mapA;
    }
}
