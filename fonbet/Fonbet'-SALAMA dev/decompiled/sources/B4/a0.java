package B4;

import a.AbstractC0603a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a0 extends C0072p {
    @Override // B4.C0072p
    public final HashMap a(EnumC0071o enumC0071o) {
        AbstractC0603a.f(enumC0071o, "Provided serverTimestampBehavior value must not be null.");
        HashMap a2 = super.a(enumC0071o);
        p3.f.O("Data in a QueryDocumentSnapshot should be non-null", a2 != null, new Object[0]);
        return a2;
    }

    @Override // B4.C0072p
    public final Map b() {
        HashMap a2 = a(EnumC0071o.f1184d);
        p3.f.O("Data in a QueryDocumentSnapshot should be non-null", a2 != null, new Object[0]);
        return a2;
    }
}
