package E5;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f2279a;

    /* renamed from: b, reason: collision with root package name */
    public String f2280b;

    /* renamed from: c, reason: collision with root package name */
    public String f2281c;

    /* renamed from: d, reason: collision with root package name */
    public String f2282d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f2283e;

    public static H a(ArrayList arrayList) {
        H h6 = new H();
        Boolean bool = (Boolean) arrayList.get(0);
        if (bool == null) {
            throw new IllegalStateException("Nonnull field \"appVerificationDisabledForTesting\" is null.");
        }
        h6.f2279a = bool;
        h6.f2280b = (String) arrayList.get(1);
        h6.f2281c = (String) arrayList.get(2);
        h6.f2282d = (String) arrayList.get(3);
        h6.f2283e = (Boolean) arrayList.get(4);
        return h6;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(this.f2279a);
        arrayList.add(this.f2280b);
        arrayList.add(this.f2281c);
        arrayList.add(this.f2282d);
        arrayList.add(this.f2283e);
        return arrayList;
    }
}
