package E5;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public String f2275a;

    /* renamed from: b, reason: collision with root package name */
    public String f2276b;

    /* renamed from: c, reason: collision with root package name */
    public Long f2277c;

    /* renamed from: d, reason: collision with root package name */
    public String f2278d;

    public static G a(ArrayList arrayList) {
        Long valueOf;
        G g3 = new G();
        String str = (String) arrayList.get(0);
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"providerId\" is null.");
        }
        g3.f2275a = str;
        String str2 = (String) arrayList.get(1);
        if (str2 == null) {
            throw new IllegalStateException("Nonnull field \"signInMethod\" is null.");
        }
        g3.f2276b = str2;
        Object obj = arrayList.get(2);
        if (obj == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
        }
        if (valueOf == null) {
            throw new IllegalStateException("Nonnull field \"nativeId\" is null.");
        }
        g3.f2277c = valueOf;
        g3.f2278d = (String) arrayList.get(3);
        return g3;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(this.f2275a);
        arrayList.add(this.f2276b);
        arrayList.add(this.f2277c);
        arrayList.add(this.f2278d);
        return arrayList;
    }
}
