package M2;

import java.util.ArrayList;

/* renamed from: M2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0104h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1872b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B0.t f1873c;

    public /* synthetic */ C0104h(ArrayList arrayList, B0.t tVar, int i2) {
        this.f1871a = i2;
        this.f1872b = arrayList;
        this.f1873c = tVar;
    }

    public final void a(Object obj) {
        switch (this.f1871a) {
            case 0:
                ArrayList arrayList = this.f1872b;
                arrayList.add(0, (r) obj);
                this.f1873c.b(arrayList);
                break;
            default:
                ArrayList arrayList2 = this.f1872b;
                arrayList2.add(0, (r) obj);
                this.f1873c.b(arrayList2);
                break;
        }
    }
}
