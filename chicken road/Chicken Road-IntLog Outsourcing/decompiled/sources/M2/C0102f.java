package M2;

import java.util.ArrayList;

/* renamed from: M2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0102f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1866b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B0.t f1867c;

    public /* synthetic */ C0102f(ArrayList arrayList, B0.t tVar, int i2) {
        this.f1865a = i2;
        this.f1866b = arrayList;
        this.f1867c = tVar;
    }

    public final void a(Object obj) {
        switch (this.f1865a) {
            case 0:
                ArrayList arrayList = this.f1866b;
                arrayList.add(0, (r) obj);
                this.f1867c.b(arrayList);
                break;
            default:
                ArrayList arrayList2 = this.f1866b;
                arrayList2.add(0, (C) obj);
                this.f1867c.b(arrayList2);
                break;
        }
    }
}
