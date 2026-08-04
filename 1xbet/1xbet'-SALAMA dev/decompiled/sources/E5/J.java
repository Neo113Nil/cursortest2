package E5;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Double f2292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f2294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f2295e;

    public static J a(ArrayList arrayList) {
        J j = new J();
        j.f2291a = (String) arrayList.get(0);
        Double d7 = (Double) arrayList.get(1);
        if (d7 == null) {
            throw new IllegalStateException("Nonnull field \"enrollmentTimestamp\" is null.");
        }
        j.f2292b = d7;
        j.f2293c = (String) arrayList.get(2);
        String str = (String) arrayList.get(3);
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"uid\" is null.");
        }
        j.f2294d = str;
        j.f2295e = (String) arrayList.get(4);
        return j;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(this.f2291a);
        arrayList.add(this.f2292b);
        arrayList.add(this.f2293c);
        arrayList.add(this.f2294d);
        arrayList.add(this.f2295e);
        return arrayList;
    }
}
