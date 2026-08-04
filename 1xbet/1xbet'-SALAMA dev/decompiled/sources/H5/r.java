package H5;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f3398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f3400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f3401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f3402e;

    public static r a(ArrayList arrayList) {
        Long lValueOf;
        r rVar = new r();
        rVar.f3398a = (Boolean) arrayList.get(0);
        rVar.f3399b = (String) arrayList.get(1);
        rVar.f3400c = (Boolean) arrayList.get(2);
        Object obj = arrayList.get(3);
        if (obj == null) {
            lValueOf = null;
        } else {
            lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
        }
        rVar.f3401d = lValueOf;
        Boolean bool = (Boolean) arrayList.get(4);
        if (bool == null) {
            throw new IllegalStateException("Nonnull field \"ignoreUndefinedProperties\" is null.");
        }
        rVar.f3402e = bool;
        return rVar;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(this.f3398a);
        arrayList.add(this.f3399b);
        arrayList.add(this.f3400c);
        arrayList.add(this.f3401d);
        arrayList.add(this.f3402e);
        return arrayList;
    }
}
