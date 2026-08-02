package E5;

import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f2270a;

    /* renamed from: b, reason: collision with root package name */
    public String f2271b;

    /* renamed from: c, reason: collision with root package name */
    public String f2272c;

    /* renamed from: d, reason: collision with root package name */
    public String f2273d;

    /* renamed from: e, reason: collision with root package name */
    public Map f2274e;

    public static F a(ArrayList arrayList) {
        F f7 = new F();
        Boolean bool = (Boolean) arrayList.get(0);
        if (bool == null) {
            throw new IllegalStateException("Nonnull field \"isNewUser\" is null.");
        }
        f7.f2270a = bool;
        f7.f2271b = (String) arrayList.get(1);
        f7.f2272c = (String) arrayList.get(2);
        f7.f2273d = (String) arrayList.get(3);
        f7.f2274e = (Map) arrayList.get(4);
        return f7;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(this.f2270a);
        arrayList.add(this.f2271b);
        arrayList.add(this.f2272c);
        arrayList.add(this.f2273d);
        arrayList.add(this.f2274e);
        return arrayList;
    }
}
