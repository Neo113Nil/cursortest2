package E5;

import java.util.ArrayList;

/* JADX INFO: renamed from: E5.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0197o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2393c;

    public static C0197o a(ArrayList arrayList) {
        C0197o c0197o = new C0197o();
        String str = (String) arrayList.get(0);
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"appName\" is null.");
        }
        c0197o.f2391a = str;
        c0197o.f2392b = (String) arrayList.get(1);
        c0197o.f2393c = (String) arrayList.get(2);
        return c0197o;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(this.f2391a);
        arrayList.add(this.f2392b);
        arrayList.add(this.f2393c);
        return arrayList;
    }
}
