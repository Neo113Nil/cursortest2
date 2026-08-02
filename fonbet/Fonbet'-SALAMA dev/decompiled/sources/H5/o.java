package H5;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public int f3389a;

    /* renamed from: b, reason: collision with root package name */
    public q f3390b;

    /* renamed from: c, reason: collision with root package name */
    public Long f3391c;

    /* renamed from: d, reason: collision with root package name */
    public Long f3392d;

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList(4);
        int i7 = this.f3389a;
        arrayList.add(i7 == 0 ? null : Integer.valueOf(t.e.e(i7)));
        q qVar = this.f3390b;
        arrayList.add(qVar != null ? qVar.b() : null);
        arrayList.add(this.f3391c);
        arrayList.add(this.f3392d);
        return arrayList;
    }
}
