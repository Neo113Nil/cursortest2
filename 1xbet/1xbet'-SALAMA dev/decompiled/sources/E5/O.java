package E5;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public P f2307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public F f2308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public G f2309c;

    public static O a(ArrayList arrayList) {
        O o7 = new O();
        o7.f2307a = (P) arrayList.get(0);
        o7.f2308b = (F) arrayList.get(1);
        o7.f2309c = (G) arrayList.get(2);
        return o7;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(this.f2307a);
        arrayList.add(this.f2308b);
        arrayList.add(this.f2309c);
        return arrayList;
    }
}
