package E5;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public String f2297a;

    /* renamed from: b, reason: collision with root package name */
    public String f2298b;

    public static L a(ArrayList arrayList) {
        L l7 = new L();
        String str = (String) arrayList.get(0);
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"verificationId\" is null.");
        }
        l7.f2297a = str;
        String str2 = (String) arrayList.get(1);
        if (str2 == null) {
            throw new IllegalStateException("Nonnull field \"verificationCode\" is null.");
        }
        l7.f2298b = str2;
        return l7;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.f2297a);
        arrayList.add(this.f2298b);
        return arrayList;
    }
}
